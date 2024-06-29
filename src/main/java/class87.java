import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class87 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[S")
    public static short[] field1183 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lkl;")
    public static class269 field1182 = new class269();

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)Lhl;")
    public static final class40 method547(boolean arg0, int arg1) {
        class40 var2 = (class40) class177.field2479.method540((byte) -116, (long) arg1);
        if (arg0) {
            field1183 = null;
        }
        field1188++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2127.method1576(-110, 34, arg1);
        class40 var4 = new class40();
        if (var3 != null) {
            var4.method268(new class224(var3), arg1, (byte) 120);
        }
        class177.field2479.method543(var4, (long) arg1, 858993459);
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public abstract void method548(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method549(int arg0) {
        field1183 = null;
        if (arg0 < -27) {
            field1182 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static final void method550(boolean arg0) {
        field1184++;
        class200.method1273(class219.field3294, 104);
        int var1 = (class89.field1252 >> 10) + (class216.field3255 >> 3);
        int var2 = (class41.field618 >> 10) + (class37.field565 >> 3);
        byte var3 = 8;
        byte var4 = 0;
        byte var5 = 18;
        class19.field268 = new int[var5];
        class82.field1114 = new byte[var5][];
        class251.field3839 = new int[var5];
        class135.field1897 = new int[var5];
        class146.field2029 = new byte[var5][];
        class202.field2808 = new int[var5];
        class274.field4242 = new int[var5];
        class180.field2519 = new int[var5];
        byte var6 = 8;
        class83.field1132 = new int[var5][4];
        class287.field4548 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
            for (int var10 = (var1 - 6) / 8; var10 <= (var1 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class274.field4242[var7] = var11;
                class202.field2808[var7] = class197.field2726.method1568("m" + var8 + "_" + var10, -7551);
                class180.field2519[var7] = class197.field2726.method1568("l" + var8 + "_" + var10, -7551);
                class135.field1897[var7] = class197.field2726.method1568("n" + var8 + "_" + var10, -7551);
                class251.field3839[var7] = class197.field2726.method1568("um" + var8 + "_" + var10, -7551);
                class19.field268[var7] = class197.field2726.method1568("ul" + var8 + "_" + var10, -7551);
                if (class135.field1897[var7] == -1) {
                    class202.field2808[var7] = -1;
                    class180.field2519[var7] = -1;
                    class251.field3839[var7] = -1;
                    class19.field268[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class135.field1897.length; var9++) {
            class135.field1897[var9] = -1;
            class202.field2808[var9] = -1;
            class180.field2519[var9] = -1;
            class251.field3839[var9] = -1;
            class19.field268[var9] = -1;
        }
        class142.method954(var2, var6, 1464, var3, var4, var1, false, arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method551(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1187++;
        class280 var5 = class181.method1180(arg2, 0, 8);
        var5.method1876(1840457248);
        if (arg4) {
            var5.field4329 = arg3;
            var5.field4330 = arg1;
            var5.field4338 = arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
    public abstract void method552(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)V")
    public abstract void method553(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
    public class87(int arg0, int arg1, int arg2) {
        this.field1180 = arg0;
        this.field1181 = arg2;
        this.field1186 = arg1;
    }
}
