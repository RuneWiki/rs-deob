import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class180 extends class241 {

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "J")
    public long field3283;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lue;")
    public static class86 field3281;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
    public static void method1204(boolean arg0) {
        field3281 = null;
        if (!arg0) {
            field3280 = -56;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILue;)Z")
    public static final boolean method1205(int arg0, int arg1, class86 arg2) {
        field3279++;
        byte[] var3 = arg2.method576(arg0, arg1);
        if (var3 == null) {
            return false;
        } else {
            class186.method1229(var3, 555);
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class180() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(J)V")
    public class180(long arg0) {
        this.field3283 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1206(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class254.field4425 * 128) {
            arg0 = class254.field4425 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class85.field1678 * 128) {
            arg2 = class85.field1678 * 128 - 1;
        }
        class36.field850 = class270.field4769[arg3];
        class259.field4494 = class270.field4762[arg3];
        class275.field4820 = class270.field4769[arg4];
        class91.field1810 = class270.field4762[arg4];
        class43.field940 = arg0;
        class220.field3907 = arg1;
        class1.field5 = arg2;
        class121.field2239 = arg0 / 128;
        class186.field3359 = arg2 / 128;
        class87.field1754 = class121.field2239 - class263.field4590;
        if (class87.field1754 < 0) {
            class87.field1754 = 0;
        }
        class83.field1649 = class186.field3359 - class263.field4590;
        if (class83.field1649 < 0) {
            class83.field1649 = 0;
        }
        class30.field753 = class263.field4590 + class121.field2239;
        if (class30.field753 > class254.field4425) {
            class30.field753 = class254.field4425;
        }
        class121.field2244 = class263.field4590 + class186.field3359;
        if (class121.field2244 > class85.field1678) {
            class121.field2244 = class85.field1678;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class263.field4590 + class263.field4590 + 2; var16++) {
            for (int var19 = 0; var19 < class263.field4590 + class263.field4590 + 2; var19++) {
                int var20 = (var16 - class263.field4590 << 7) - (class43.field940 & 0x7F);
                int var21 = (var19 - class263.field4590 << 7) - (class1.field5 & 0x7F);
                int var22 = class121.field2239 + var16 - class263.field4590;
                int var23 = class186.field3359 + var19 - class263.field4590;
                if (var22 >= 0 && var23 >= 0 && var22 < class254.field4425 && var23 < class85.field1678) {
                    int var24;
                    if (class157.field2825 == null) {
                        var24 = class163.field2968[0][var22][var23] + 128 - class220.field3907;
                    } else {
                        var24 = class157.field2825[0][var22][var23] + 128 - class220.field3907;
                    }
                    int var25 = class163.field2968[3][var22][var23] - class220.field3907 - 1000;
                    class134.field2466[var16][var19] = class139.method911(var20, var25, var24, var21, var15);
                } else {
                    class134.field2466[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class263.field4590 + class263.field4590 + 1; var17++) {
            for (int var18 = 0; var18 < class263.field4590 + class263.field4590 + 1; var18++) {
                class22.field647[var17][var18] = class134.field2466[var17][var18] || class134.field2466[var17 + 1][var18] || class134.field2466[var17][var18 + 1] || class134.field2466[var17 + 1][var18 + 1];
            }
        }
        class201.field3630 = arg6;
        class66.field1361 = arg7;
        class86.field1703 = arg8;
        class226.field3981 = arg9;
        class105.field1977 = arg10;
        class19.method130();
        if (class137.field2518 != null) {
            class165.method1087(true);
            class47.method298(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class165.method1087(false);
        }
        class47.method298(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public static final void method1207(int arg0) {
        field3278++;
        class81.field1605.method830(50);
        if (arg0 != -21024) {
            method1205(-25, 55, (class86) null);
        }
    }
}
