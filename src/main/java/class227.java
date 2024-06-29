import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class227 extends class167 {

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Lkh;")
    public static class117 field4086 = class224.method1450((byte) -108, ")1");

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "Lkh;")
    private static class117 field4093 = class224.method1450((byte) -112, "Ok");

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "Lkh;")
    public static class117 field4095 = field4093;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "[I")
    public static int[] field4094 = new int[500];

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lcd;")
    public static class27 field4091 = new class27(0, 0);

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
    public static int field4096 = 0;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V")
    public static void method1470(byte arg0) {
        field4093 = null;
        field4091 = null;
        field4094 = null;
        field4086 = null;
        int var1 = -97 % ((-35 - arg0) / 39);
        field4095 = null;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)V")
    public static final void method1471(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3073 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            field4095 = null;
        }
        ++field4092;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, 0, 0);
            for (int var5 = 0; class115.field2146 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            super.field3009 = ~arg0.method998(74) == -2;
        }
        if (arg1) {
            method1472(-82, 10, -78, -65);
        }
        ++field4088;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field4089;
        if (arg1 != -9179) {
            return null;
        } else {
            int[][] var3 = super.field3022.method1148(arg0, arg1 ^ -479);
            if (super.field3022.field2957) {
                int[][] var4 = this.method1180(arg0, 26851, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class115.field2146; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = 4096 - var7[var11];
                    var10[var11] = 4096 - var6[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
    public static final void method1472(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class109.field2063[arg0][arg1][arg2];
        if (var4 != null) {
            class109.field2063[arg0][arg1][arg2].field3076 = arg3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lkh;I)V")
    public static final void method1473(class117 arg0, int arg1) {
        ++field4090;
        if (class130.field2397.field2423 != null) {
            try {
                class117 var2 = class123.field2298.method788(-95, class130.field2397.field2423);
                class117 var3 = class122.field2292.method788(-119, class130.field2397.field2423);
                class117 var4 = class36.method316((byte) -34, new class117[] { var2, class66.field1272, arg0, class159.field2915, var3 });
                if (arg1 <= -108) {
                    class117 var5;
                    if (arg0.method819((byte) -84) == 0) {
                        var5 = class36.method316((byte) -34, new class117[] { var4, class24.field607 });
                    } else {
                        var5 = class36.method316((byte) -34, new class117[] { var4, class223.field4031, class167.method1182((byte) 56, 94608000000L + class4.method31((byte) 47)), class24.field597, class151.method1077((byte) -128, 94608000L) });
                    }
                    class36.method316((byte) -34, new class117[] { class206.field3705, var5, class108.field2007 }).method803(class130.field2397.field2423, (byte) -124);
                }
            } catch (Throwable var6) {
            }
        }
    }
}
