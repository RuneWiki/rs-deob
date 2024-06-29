import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class144 extends class2 {

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field2399;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Lve;")
    public static class255 field2402 = class87.method607(101, "null");

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lkh;")
    public static class13 field2400 = new class13(64);

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field2409 = -1;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field2408 = 0;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Lfj;")
    public static class228 field2397;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lrg;")
    public static class88 field2401;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "Lsl;")
    public static class91 field2407;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method9(int arg0) {
        if (arg0 != 0) {
            this.method9(47);
        }
        field2405++;
        return this.field2399;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Z", line = 32)
    public final boolean method5(int arg0) {
        if (arg0 != 30757) {
            field2400 = (class13) null;
        }
        field2403++;
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V", line = 44)
    public static void method1069(int arg0) {
        field2397 = null;
        field2401 = null;
        field2402 = null;
        field2407 = null;
        if (arg0 <= 120) {
            method1069(31);
        }
        field2400 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 57)
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class29.field449 * 128) {
            arg0 = class29.field449 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class315.field5347 * 128) {
            arg2 = class315.field5347 * 128 - 1;
        }
        class288.field4960 = class283.field4877[arg3];
        class183.field2952 = class283.field4870[arg3];
        class213.field3632 = class283.field4877[arg4];
        class274.field4699 = class283.field4870[arg4];
        class210.field3580 = arg0;
        class274.field4718 = arg1;
        class59.field912 = arg2;
        class77.field1264 = arg0 / 128;
        class81.field1305 = arg2 / 128;
        class70.field1078 = class77.field1264 - class76.field1249;
        if (class70.field1078 < 0) {
            class70.field1078 = 0;
        }
        class69.field1037 = class81.field1305 - class76.field1249;
        if (class69.field1037 < 0) {
            class69.field1037 = 0;
        }
        class238.field3954 = class77.field1264 + class76.field1249;
        if (class238.field3954 > class29.field449) {
            class238.field3954 = class29.field449;
        }
        class4.field64 = class81.field1305 + class76.field1249;
        if (class4.field64 > class315.field5347) {
            class4.field64 = class315.field5347;
        }
        short var15;
        if (class281.field4827) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class76.field1249 + class76.field1249 + 2; var16++) {
            for (int var17 = 0; var17 < class76.field1249 + class76.field1249 + 2; var17++) {
                int var18 = (var16 - class76.field1249 << 7) - (class210.field3580 & 0x7F);
                int var19 = (var17 - class76.field1249 << 7) - (class59.field912 & 0x7F);
                int var20 = class77.field1264 + var16 - class76.field1249;
                int var21 = class81.field1305 + var17 - class76.field1249;
                if (var20 >= 0 && var21 >= 0 && var20 < class29.field449 && var21 < class315.field5347) {
                    int var22;
                    if (class279.field4783 == null) {
                        var22 = class43.field677[0][var20][var21] + 128 - class274.field4718;
                    } else {
                        var22 = class279.field4783[0][var20][var21] + 128 - class274.field4718;
                    }
                    int var23 = class43.field677[3][var20][var21] - class274.field4718 - 1000;
                    class208.field3565[var16][var17] = class259.method1802(var18, var23, var22, var19, var15);
                } else {
                    class208.field3565[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class76.field1249 + class76.field1249 + 1; var24++) {
            for (int var25 = 0; var25 < class76.field1249 + class76.field1249 + 1; var25++) {
                class218.field3698[var24][var25] = class208.field3565[var24][var25] || class208.field3565[var24 + 1][var25] || class208.field3565[var24][var25 + 1] || class208.field3565[var24 + 1][var25 + 1];
            }
        }
        class230.field3804 = arg6;
        class96.field1641 = arg7;
        class192.field3084 = arg8;
        class238.field3952 = arg9;
        class220.field3716 = arg10;
        class222.method1558();
        if (class159.field2687 != null) {
            class197.method1415(true);
            class248.method1710(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class281.field4827) {
                class249.field4174 = false;
                class256.method1795(0, 0, -536);
                class272.method1905((float[]) null);
                class164.method1198();
            }
            class197.method1415(false);
        }
        class248.method1710(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V", line = 187)
    public static final void method1071(byte arg0) {
        field2404++;
        class310.field5288.method554(0);
        if (arg0 != 75) {
            method1069(-71);
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V", line = 206)
    public static final void method1072(int arg0) {
        class80.field1292.method553(arg0 ^ 0x77);
        if (arg0 == 0) {
            class225.field3766.method553(arg0 ^ 0xFFFFFFD9);
            field2398++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 216)
    public class144(Object arg0) {
        this.field2399 = arg0;
    }
}
