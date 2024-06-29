import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class286 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4893 = 0;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[S")
    public static short[] field4892 = new short[500];

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lmh;")
    public static class62 field4894 = class201.method1405(true, " ");

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lmh;")
    public static class62 field4898 = class201.method1405(true, "::fpsoff");

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4891;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[Lwj;")
    public static class135[] field4890;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1958(int arg0) {
        field4896++;
        int var1 = (class258.field4351 >> 10) + (class120.field2006 >> 3);
        byte var2 = 0;
        byte var3 = 8;
        int var4 = (class215.field3647 >> 10) + (class290.field4936 >> 3);
        byte var5 = 8;
        byte var6 = 18;
        class39.field608 = new int[var6];
        class196.field3328 = new byte[var6][];
        class150.field2370 = new int[var6];
        class284.field4863 = new int[var6][4];
        class85.field1382 = new byte[var6][];
        class256.field4327 = new byte[var6][];
        class244.field4140 = new byte[var6][];
        class1.field10 = new int[var6];
        class235.field4043 = new int[var6];
        class248.field4223 = new byte[var6][];
        class212.field3566 = new int[var6];
        class43.field657 = new int[var6];
        int var7 = arg0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var4 - 6) / 8; var9 <= (var4 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class39.field608[var7] = var10;
                class43.field657[var7] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class94.field1542, class42.method284(var8, -127), class155.field2498, class42.method284(var9, -126) }, 0));
                class212.field3566[var7] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class99.field1642, class42.method284(var8, -116), class155.field2498, class42.method284(var9, class290.method1975(arg0, -124)) }, 0));
                class150.field2370[var7] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class121.field2016, class42.method284(var8, -118), class155.field2498, class42.method284(var9, class290.method1975(arg0, -124)) }, 0));
                class1.field10[var7] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class62.field903, class42.method284(var8, arg0 - 123), class155.field2498, class42.method284(var9, -118) }, 0));
                class235.field4043[var7] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class287.field4908, class42.method284(var8, class290.method1975(arg0, -124)), class155.field2498, class42.method284(var9, -124) }, 0));
                if (class150.field2370[var7] == -1) {
                    class43.field657[var7] = -1;
                    class212.field3566[var7] = -1;
                    class1.field10[var7] = -1;
                    class235.field4043[var7] = -1;
                }
                var7++;
            }
        }
        class189.method1322(var5, 94, true, var4, var2, var1, var3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 110)
    public static void method1959(boolean arg0) {
        if (!arg0) {
            method1960(48, (byte) 123);
        }
        field4890 = null;
        field4891 = null;
        field4892 = null;
        field4898 = null;
        field4894 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)Z", line = 159)
    public static final boolean method1960(int arg0, byte arg1) {
        if (arg1 <= 99) {
            method1960(-95, (byte) -60);
        }
        field4895++;
        return ((arg0 & 0x6F578827) >> 30) != 0;
    }
}
