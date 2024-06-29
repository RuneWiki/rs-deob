import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class193 extends class33 {

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    private int field3743 = 4;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    private int field3751 = 4;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Lrd;")
    private static class173 field3744 = class133.method843("go back to the main RuneScape webpage", -68);

    @OriginalMember(owner = "client!td", name = "W", descriptor = "[I")
    public static int[] field3752 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Lrd;")
    private static class173 field3753 = class133.method843("red:", 46);

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Lrd;")
    public static class173 field3745 = field3753;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "Lrd;")
    public static class173 field3756 = field3753;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "Lrd;")
    public static class173 field3758 = field3744;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "Laf;")
    public static class7 field3757 = new class7(64);

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    public static int field3759 = 0;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "Lle;")
    public static class114 field3760 = new class114();

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Z")
    public static boolean field3749;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILra;Z)V")
    public static final void method1283(int arg0, class170 arg1, boolean arg2) {
        if (class99.field1809 != null) {
            try {
                class99.field1809.method1095((byte) 124);
            } catch (Exception var8) {
            }
            class99.field1809 = null;
        }
        ++field3750;
        if (arg0 >= -1) {
            method1283(-48, (class170) null, false);
        }
        class99.field1809 = arg1;
        class108.method664(arg2, 0);
        class174.field3427.field2222 = 0;
        class75.field1484 = 0;
        class149.field2846 = null;
        class112.field2080 = null;
        while (true) {
            class220 var3 = (class220) class121.field2275.method684((byte) -76);
            if (var3 == null) {
                while (true) {
                    class220 var4 = (class220) class196.field3811.method684((byte) -76);
                    if (var4 == null) {
                        if (class25.field529 != 0) {
                            try {
                                class121 var5 = new class121(4);
                                var5.method752(4, (byte) -128);
                                var5.method752(class25.field529, (byte) -128);
                                var5.method736(0, 115);
                                class99.field1809.method1097(0, var5.field2218, 4, (byte) -84);
                            } catch (IOException var7) {
                                try {
                                    class99.field1809.method1095((byte) 123);
                                } catch (Exception var6) {
                                }
                                class99.field1809 = null;
                                ++class125.field2361;
                            }
                        }
                        class184.field3605 = 0;
                        class189.field3686 = class97.method599(5);
                        return;
                    }
                    class161.field2991.method726(-73, var4);
                    class69.field1329.method675(var4.field2437, var4, false);
                    ++class105.field1968;
                    --class211.field4092;
                }
            }
            class106.field1976.method675(var3.field2437, var3, false);
            ++class48.field1028;
            --class52.field1063;
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public static void method1284(int arg0) {
        int var1 = -21 % ((-71 - arg0) / 55);
        field3757 = null;
        field3758 = null;
        field3744 = null;
        field3753 = null;
        field3745 = null;
        field3752 = null;
        field3760 = null;
        field3756 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbc;BLrd;Lrd;)[Ldh;")
    public static final class39[] method1285(class14 arg0, byte arg1, class173 arg2, class173 arg3) {
        int var4 = arg0.method135(arg2, 123);
        ++field3755;
        int var5 = -90 % ((-17 - arg1) / 39);
        int var6 = arg0.method117(arg3, (byte) -102, var4);
        return class60.method381(-82, var4, var6, arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field3754;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field3751 = arg2.method751((byte) -79);
            }
        } else {
            this.field3743 = arg2.method751((byte) -43);
        }
        if (arg1 > -99) {
            field3744 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field3747;
        if (arg0 <= 112) {
            this.method178(-21, -20);
        }
        int[][] var3 = super.field731.method1340(22, arg1);
        if (super.field731.field3925) {
            int var4 = class117.field2173 / this.field3743;
            int var5 = class99.field1802 / this.field3751;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method259(0, -9, class99.field1802 * var6 / var5);
            } else {
                var7 = this.method259(0, -9, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var3[0];
            int[] var11 = var7[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class117.field2173 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class117.field2173 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var10[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 104 % ((-65 - arg1) / 60);
        ++field3748;
        int[] var4 = super.field718.method514(arg0, 123);
        if (super.field718.field1615) {
            int var5 = class117.field2173 / this.field3743;
            int var6 = class99.field1802 / this.field3751;
            int[] var8;
            if (~var6 < -1) {
                int var7 = arg0 % var6;
                var8 = this.method262(class99.field1802 * var7 / var6, 89, 0);
            } else {
                var8 = this.method262(0, -111, 0);
            }
            for (int var9 = 0; var9 < class117.field2173; ++var9) {
                if (~var5 < -1) {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class117.field2173 * var10 / var5];
                } else {
                    var4[var9] = var8[0];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class194.field3778 >= ~(-arg3 + arg1) && ~(arg1 + arg3) >= ~class96.field1766 && class37.field790 <= -arg3 + arg6 && ~class20.field445 <= ~(arg6 - -arg3)) {
            class13.method106(arg3, arg6, arg0, arg1, arg2 ^ 2, arg5, arg4);
        } else {
            class40.method300(31, arg3, arg1, arg4, arg6, arg5, arg0);
        }
        ++field3746;
        if (arg2 != 0) {
            field3756 = null;
        }
    }
}
