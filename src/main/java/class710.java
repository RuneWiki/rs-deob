import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class710 {

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "Z")
    public boolean field9937;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
    public static int[] field9938 = new int[8];

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Leu;")
    public class448 field9941;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "Leu;")
    public class448 field9942;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Z")
    public boolean field9943;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "[Lgba;")
    public static class625[] field9935;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public final void method3907(boolean arg0) {
        field9940++;
        if (this.field9942 != null) {
            this.field9942.method24((byte) -93);
        }
        this.field9943 = arg0;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)Z")
    public final boolean method3908(boolean arg0) {
        if (arg0) {
            this.method3907(true);
        }
        field9936++;
        return this.field9943 && !this.field9937;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method3909(byte arg0) {
        if (arg0 != 26) {
            field9935 = null;
        }
        field9938 = null;
        field9935 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Loa;ILee;BILub;)Z")
    public static final boolean method3910(class651 arg0, int arg1, class634 arg2, byte arg3, int arg4, class20 arg5) {
        field9939++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field8532 != null) {
            var6 = (arg2.field8544 + arg5.field319 - class567.field7517) * (class567.field7521 - class567.field7527) / (class567.field7511 - class567.field7517) + class567.field7527;
            var8 = class567.field7514 - ((arg5.field324 + arg2.field8512 - class567.field7525) * (class567.field7514 - class567.field7510) / (class567.field7518 - class567.field7525));
            var7 = (arg2.field8525 + arg5.field319 - class567.field7517) * (class567.field7521 - class567.field7527) / (class567.field7511 - class567.field7517) + class567.field7527;
            var9 = class567.field7514 - (arg2.field8531 + arg5.field324 - class567.field7525) * (class567.field7514 - class567.field7510) / (class567.field7518 - class567.field7525);
        }
        class468 var10 = null;
        int var11 = 0;
        if (arg3 != 65) {
            field9935 = null;
        }
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field8554 != -1) {
            if (arg5.field318 && arg2.field8526 != -1) {
                var10 = arg2.method3505(true, arg0, (byte) -105);
            } else {
                var10 = arg2.method3505(false, arg0, (byte) -126);
            }
            if (var10 != null) {
                var11 = arg5.field322 - (var10.method1025() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg5.field322 + (var10.method1025() + 1 >> 1);
                var13 = arg5.field323 - (var10.method1030() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg5.field323 + (var10.method1030() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class76 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field8541 != null) {
            var15 = class530.method2957(arg2.field8547, (byte) -72);
            if (var15 != null) {
                var16 = class664.field9424.method2846(false, null, class161.field2546, null, arg2.field8541);
                int var23 = arg5.field323;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method595() / 2;
                } else {
                    var17 = var23 - ((var10.method1030() >> 1) + var15.method596() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class161.field2546[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method599(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4 + arg5.field322 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg5.field322 + arg4;
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg1 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = arg1 + (var17 + (var16 * var15.method596()));
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class567.field7527 > var7 || class567.field7521 < var6 || var9 < class567.field7510 || class567.field7514 < var8) {
            return true;
        }
        if (arg2.field8532 != null) {
            int[] var27 = new int[arg2.field8532.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg2.field8532[var28 * 2] + arg5.field319;
                int var31 = arg2.field8532[var28 * 2 + 1] + arg5.field324;
                var27[var28 * 2] = (class567.field7521 - class567.field7527) * (var30 - class567.field7517) / (class567.field7511 - class567.field7517) + class567.field7527;
                var27[var28 * 2 + 1] = class567.field7514 - ((var31 - class567.field7525) * (class567.field7514 - class567.field7510) / (class567.field7518 - class567.field7525));
            }
            class614.method3360(arg0, var27, arg2.field8552);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg0.method3565(false, var27[var29 * 2 + 3], var27[var29 * 2 + 1], var27[(var29 + 1) * 2], var27[var29 * 2], arg2.field8549);
            }
            arg0.method3565(false, var27[1], var27[var27.length - 1], var27[0], var27[var27.length - 2], arg2.field8549);
        }
        if (var10 != null) {
            if (class665.field9428 > 0 && (class96.field1461 != -1 && class96.field1461 == arg5.field317 || class345.field4753 != -1 && class345.field4753 == arg2.field8516)) {
                int var32;
                if (class412.field5653 <= 50) {
                    var32 = class412.field5653 * 2;
                } else {
                    var32 = 200 - class412.field5653 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method3564(var33, var10.method1035() / 2 + 7, (byte) -113, arg5.field322, arg5.field323);
                arg0.method3564(var33, var10.method1035() / 2 + 5, (byte) -119, arg5.field322, arg5.field323);
                arg0.method3564(var33, var10.method1035() / 2 + 3, (byte) -107, arg5.field322, arg5.field323);
                arg0.method3564(var33, var10.method1035() / 2 + 1, (byte) -125, arg5.field322, arg5.field323);
                arg0.method3564(var33, var10.method1035() / 2, (byte) -106, arg5.field322, arg5.field323);
            }
            var10.method2637(arg5.field322 - (var10.method1025() >> 1), arg5.field323 + -(var10.method1030() >> 1));
        }
        if (arg2.field8541 != null && var15 != null) {
            class1.method3(var15, var16, var18, var17, arg0, arg5, arg2, (byte) 72);
        }
        if (arg2.field8554 != -1 || arg2.field8541 != null) {
            class459 var34 = new class459(arg5);
            var34.field6223 = var21;
            var34.field6228 = var22;
            var34.field6225 = var13;
            var34.field6227 = var20;
            var34.field6230 = var19;
            var34.field6221 = var14;
            var34.field6222 = var12;
            var34.field6231 = var11;
            class187.field2784.method3265(var34, (byte) -112);
        }
        return false;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Z)V")
    public class710(boolean arg0) {
        this.field9937 = arg0;
    }
}
