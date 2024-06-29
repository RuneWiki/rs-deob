import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class144 {

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Lev;")
    public static class144 field1882 = new class144();

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "Lev;")
    public static class144 field1885 = new class144();

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Lev;")
    public static class144 field1887 = new class144();

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lev;")
    public static class144 field1888 = new class144();

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Z")
    public static boolean field1889 = false;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        field1886++;
        class105.field1383 = 0;
        int var1 = class230.field3069.method2399(true);
        int var2 = class230.field3069.method2396(17);
        int var3 = class230.field3069.method2393(arg0 ^ 0x17D3);
        boolean var4 = class230.field3069.method2396(105) == 1;
        class445.method2520((byte) 77);
        class487.method2674((byte) 124, var2);
        int var5 = (class88.field1169 - class230.field3069.field5367) / 16;
        class206.field2667 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class206.field2667[var6][var10] = class230.field3069.method2355(25);
            }
        }
        class214.field2754 = null;
        class124.field1607 = new byte[var5][];
        class545.field7072 = null;
        class547.field7096 = new int[var5];
        class441.field5704 = new int[var5];
        class229.field3047 = new byte[var5][];
        class266.field3568 = new int[var5];
        class117.field1507 = new byte[var5][];
        class602.field8103 = new int[var5];
        if (arg0 != -28630) {
            return;
        }
        class594.field8029 = new byte[var5][];
        class515.field6753 = new int[var5];
        int var7 = 0;
        for (int var8 = (var3 - (class611.field8258 >> 4)) / 8; var8 <= (var3 + (class611.field8258 >> 4)) / 8; var8++) {
            for (int var9 = (var1 - (class656.field9155 >> 4)) / 8; var9 <= ((class656.field9155 >> 4) + var1) / 8; var9++) {
                class547.field7096[var7] = (var8 << 8) + var9;
                class266.field3568[var7] = class277.field3630.method3359("m" + var8 + "_" + var9, (byte) -120);
                class515.field6753[var7] = class277.field3630.method3359("l" + var8 + "_" + var9, (byte) -127);
                class602.field8103[var7] = class277.field3630.method3359("um" + var8 + "_" + var9, (byte) -110);
                class441.field5704[var7] = class277.field3630.method3359("ul" + var8 + "_" + var9, (byte) -121);
                var7++;
            }
        }
        class512.method2759(11, var3, var1, (byte) 94, var4);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
    public static void method1078(boolean arg0) {
        if (arg0) {
            method1077(112);
        }
        field1888 = null;
        field1882 = null;
        field1887 = null;
        field1885 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1884++;
        if ((arg6 & arg3) == 1) {
            int var7 = arg2;
            arg2 = arg4;
            arg4 = var7;
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return 1 + 7 - arg4 - arg1;
        }
    }

    @OriginalMember(owner = "client!ev", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1881++;
        throw new IllegalStateException();
    }
}
