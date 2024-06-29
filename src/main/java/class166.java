import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class166 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field2676 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field2678 = 2048;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field2683 = 0;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public int field2685 = 2048;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[Lwf;")
    public static class64[] field2677 = new class64[14];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
    public static boolean field2684 = false;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[Lmf;")
    public static class53[] field2686 = new class53[4];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILaj;I)V", line = 4)
    private final void method1240(int arg0, int arg1, class1 arg2, int arg3) {
        if (arg3 > -91) {
            return;
        }
        if (arg0 == 1) {
            this.field2683 = arg2.method15((byte) -79);
        } else if (arg0 == 2) {
            this.field2678 = arg2.method56(19612);
        } else if (arg0 == 3) {
            this.field2685 = arg2.method56(19612);
        } else if (arg0 == 4) {
            this.field2676 = arg2.method41((byte) -66);
        }
        field2680++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1241(int arg0) {
        field2675++;
        class19.field357.method181((byte) -46);
        for (int var1 = 0; var1 < 32; var1++) {
            class326.field5093[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class150.field2460[var2] = 0L;
        }
        class112.field1818 = 0;
        if (arg0 != 2) {
            method1243(-63, -86, -83, -111, 110, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -36, (byte) 86, -71, -46);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILaj;I)V", line = 73)
    public final void method1242(int arg0, class1 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method15((byte) -57);
            if (var4 == 0) {
                if (arg0 <= 7) {
                    method1244((byte) -57);
                }
                field2682++;
                return;
            }
            this.method1240(var4, arg2, arg1, -98);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 89)
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class91.field1449 * 128) {
            arg0 = class91.field1449 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class327.field5110 * 128) {
            arg2 = class327.field5110 * 128 - 1;
        }
        class289.field4557 = class40.field612[arg3];
        class74.field1137 = class40.field619[arg3];
        class255.field3758 = class40.field612[arg4];
        class291.field4569 = class40.field619[arg4];
        class104.field1720 = arg0;
        class237.field3561 = arg1;
        class339.field5231 = arg2;
        class50.field762 = arg0 / 128;
        class122.field1992 = arg2 / 128;
        class345.field5356 = class50.field762 - class77.field1214;
        if (class345.field5356 < 0) {
            class345.field5356 = 0;
        }
        class151.field2492 = class122.field1992 - class77.field1214;
        if (class151.field2492 < 0) {
            class151.field2492 = 0;
        }
        class191.field2986 = class77.field1214 + class50.field762;
        if (class191.field2986 > class91.field1449) {
            class191.field2986 = class91.field1449;
        }
        class6.field130 = class77.field1214 + class122.field1992;
        if (class6.field130 > class327.field5110) {
            class6.field130 = class327.field5110;
        }
        short var15;
        if (class162.field2623) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class77.field1214 + class77.field1214 + 2; var16++) {
            for (int var17 = 0; var17 < class77.field1214 + class77.field1214 + 2; var17++) {
                int var18 = (var16 - class77.field1214 << 7) - (class104.field1720 & 0x7F);
                int var19 = (var17 - class77.field1214 << 7) - (class339.field5231 & 0x7F);
                int var20 = class50.field762 + var16 - class77.field1214;
                int var21 = class122.field1992 + var17 - class77.field1214;
                if (var20 >= 0 && var21 >= 0 && var20 < class91.field1449 && var21 < class327.field5110) {
                    int var22;
                    if (class337.field5214 == null) {
                        var22 = class9.field220[0][var20][var21] + 128 - class237.field3561;
                    } else {
                        var22 = class337.field5214[0][var20][var21] + 128 - class237.field3561;
                    }
                    int var23 = class9.field220[3][var20][var21] - class237.field3561 - 1000;
                    class175.field2804[var16][var17] = class64.method508(var18, var23, var22, var19, var15);
                } else {
                    class175.field2804[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class77.field1214 + class77.field1214 + 1; var24++) {
            for (int var25 = 0; var25 < class77.field1214 + class77.field1214 + 1; var25++) {
                class142.field2296[var24][var25] = class175.field2804[var24][var25] || class175.field2804[var24 + 1][var25] || class175.field2804[var24][var25 + 1] || class175.field2804[var24 + 1][var25 + 1];
            }
        }
        class120.field1928 = arg6;
        class326.field5105 = arg7;
        class82.field1268 = arg8;
        class319.field5001 = arg9;
        class131.field2091 = arg10;
        class85.method676();
        if (class104.field1716 != null) {
            class124.method982(true);
            class11.method157(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class162.field2623) {
                class168.field2716 = false;
                class102.method830(0, 14804, 0);
                class261.method1817((float[]) null);
                class219.method1597();
            }
            class124.method982(false);
        }
        class11.method157(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 222)
    public static void method1244(byte arg0) {
        field2677 = null;
        field2686 = null;
        if (arg0 != 0) {
            field2677 = (class64[]) null;
        }
    }
}
