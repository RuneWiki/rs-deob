import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class287 {

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "Z")
    public boolean field3522 = true;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public int field3520 = 127;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public int field3519 = 64;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "Z")
    public boolean field3526 = true;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    public int field3533 = 8;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public int field3529 = 0;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public int field3536 = 512;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public int field3537 = -1;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public int field3530 = -1;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public int field3535 = 1190717;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "Z")
    public boolean field3538 = false;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "Z")
    public static boolean field3528 = false;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "F")
    public static float field3521;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lwea;")
    public class156 field3531;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 4)
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class396.field5425 = true;
        class748.field10424 = class563.field8026.method350() > 0;
        class292.field3592 = arg15;
        class440.field6387 = arg1 >> class748.field10430;
        class444.field6433 = arg3 >> class748.field10430;
        class259.field3164 = arg1;
        class681.field9642 = arg3;
        class28.field312 = arg2;
        class224.field2576 = class440.field6387 - class626.field8992;
        if (class224.field2576 < 0) {
            class706.field9949 = -class224.field2576;
            class224.field2576 = 0;
        } else {
            class706.field9949 = 0;
        }
        class304.field3795 = class444.field6433 - class626.field8992;
        if (class304.field3795 < 0) {
            class661.field9432 = -class304.field3795;
            class304.field3795 = 0;
        } else {
            class661.field9432 = 0;
        }
        class97.field1021 = class626.field8992 + class440.field6387;
        if (class97.field1021 > class284.field3473) {
            class97.field1021 = class284.field3473;
        }
        class277.field3394 = class626.field8992 + class444.field6433;
        if (class277.field3394 > class151.field1664) {
            class277.field3394 = class151.field1664;
        }
        boolean[][] var19 = class233.field2770;
        boolean[][] var20 = class511.field7298;
        if (class292.field3592) {
            for (int var21 = 0; var21 < class626.field8992 + class626.field8992 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class626.field8992 + class626.field8992 + 2; var24++) {
                    if (var24 > 1) {
                        class255.field3122[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class440.field6387 + var21 - class626.field8992;
                    int var26 = class444.field6433 + var24 - class626.field8992;
                    if (var25 >= 0 && var26 >= 0 && var25 < class284.field3473 && var26 < class151.field1664) {
                        int var27 = var25 << class748.field10430;
                        int var28 = var26 << class748.field10430;
                        int var29 = class11.field88[class11.field88.length - 1].method1671(var26, var25, (byte) 127) - (0x3E8 << class748.field10430 - 7);
                        int var30 = class159.field1758 == null ? class11.field88[0].method1671(var26, var25, (byte) -84) + class559.field7987 : class159.field1758[0].method1671(var26, var25, (byte) -72) + class559.field7987;
                        var23 = arg16 >= 0 ? class563.field8026.method361(var27, var29, var28, var27, var30, var28, arg16) : class563.field8026.method367(var27, var29, var28, var27, var30, var28);
                        class511.field7298[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class511.field7298[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class255.field3122[var24 - 1] & class255.field3122[var24] & var22 & var23;
                        class233.field2770[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class255.field3122[class626.field8992 + class626.field8992] = var22;
                class255.field3122[class626.field8992 + class626.field8992 + 1] = var23;
            }
            if (arg16 >= 0) {
                class396.field5425 = false;
            } else {
                class614.field8797 = arg5;
                class502.field7051 = arg6;
                class208.field2450 = arg7;
                class104.field1086 = arg8;
                class334.field4312 = arg9;
                class699.method3932(arg10, class563.field8026, (byte) 112);
            }
        } else {
            if (class726.field10147 == null) {
                class726.field10147 = new boolean[class284.field3473 + class284.field3473 + 1][class284.field3473 + class151.field1664 + 1];
            }
            for (int var32 = 0; var32 < class726.field10147.length; var32++) {
                for (int var42 = 0; var42 < class726.field10147[0].length; var42++) {
                    class726.field10147[var32][var42] = true;
                }
            }
            class511.field7298 = class726.field10147;
            class233.field2770 = class726.field10147;
            class224.field2576 = 0;
            class304.field3795 = 0;
            class97.field1021 = class284.field3473;
            class277.field3394 = class151.field1664;
            class396.field5425 = false;
        }
        class512.method3027(-118, class563.field8026);
        if (!class36.field387.field10003) {
            class454 var33 = class36.field387.field9997;
            for (class547 var34 = (class547) var33.method2790(106); var34 != null; var34 = (class547) var33.method2794(74)) {
                var34.method2401((byte) -57);
                class397.method2436(false, var34);
            }
        }
        if (class748.field10424) {
            for (int var35 = 0; var35 < class275.field3367; var35++) {
                class745.field10409[var35].method3474(arg0, arg14, true);
            }
        }
        if (class625.field8980) {
            class78.field819 = class563.field8026.method327();
            class563.field8026.method354(class179.field2102);
            int var36 = (class179.field2102[2] - class179.field2102[0]) / class577.field8147;
            for (int var37 = 0; var37 < class577.field8147 - 1; var37++) {
                class394.field5413[var37] = (var37 + 1) * var36 + class439.field6376[var37];
            }
            for (int var38 = 0; var38 < class472.field6766.length; var38++) {
                class472.field6766[var38].method567();
            }
        }
        if (class316.field3973 != null) {
            if (class625.field8980) {
                class555.method3260(0);
            }
            class78.method552(true);
            class563.field8026.method323(-1, 1583160, 40, 127);
            class723.method4027(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class625.field8980) {
                class542.method3186();
            }
            class563.field8026.method419();
            class78.method552(false);
        }
        class723.method4027(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class625.field8980) {
            for (int var39 = 0; var39 < class723.field10134; var39++) {
                class486.field6968[var39] = class391.field5395[var39];
            }
            class555.method3260(0);
            for (int var40 = 0; var40 < class472.field6766.length; var40++) {
                class472.field6766[var40].method567();
            }
        }
        if (class625.field8980) {
            class542.method3186();
            for (int var41 = 0; var41 < class723.field10134; var41++) {
                class391.field5395[var41] = class486.field6968[var41];
            }
            if (class128.field1340 == 2) {
                int var10002;
                if (class626.field8988[0] < class626.field8988[1]) {
                    if (class439.field6376[0] + class394.field5413[0] > class179.field2102[0]) {
                        var10002 = class439.field6376[0]++;
                    }
                } else if (class626.field8988[0] > class626.field8988[1] && class439.field6376[0] + class394.field5413[0] < class179.field2102[2]) {
                    var10002 = class439.field6376[0]--;
                }
            }
        }
        if (!class292.field3592) {
            class233.field2770 = var19;
            class511.field7298 = var20;
        }
        class163.method1009();
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z", line = 287)
    public static final boolean method1708(int arg0) {
        field3527++;
        if (class392.field5397 < 1) {
            return false;
        } else {
            if (arg0 != 2) {
                method1707(38, 30, -38, 127, null, null, null, null, null, null, 56, (byte) -88, 30, -122, false, false, -8, 37, true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V", line = 301)
    public final void method1709(int arg0) {
        field3525++;
        if (arg0 != -16121) {
            method1711((byte) -87);
        }
        this.field3533 = this.field3524 | this.field3533 << 8;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILig;)V", line = 314)
    private final void method1710(int arg0, int arg1, class244 arg2) {
        field3534++;
        if (arg0 == 1) {
            this.field3529 = class329.method1969(arg1 + 131, arg2.method1458((byte) -127));
        } else if (arg0 == 2) {
            this.field3530 = arg2.method1423(-24);
        } else if (arg0 == 3) {
            this.field3530 = arg2.method1476(0);
            if (this.field3530 == 65535) {
                this.field3530 = -1;
            }
        } else if (arg0 == 5) {
            this.field3522 = false;
        } else if (arg0 == 7) {
            this.field3537 = class329.method1969(99, arg2.method1458((byte) 43));
        } else if (arg0 == 8) {
            this.field3531.field1722 = this.field3524;
        } else if (arg0 == 9) {
            this.field3536 = arg2.method1476(-107) << 2;
        } else if (arg0 == 10) {
            this.field3526 = false;
        } else if (arg0 == 11) {
            this.field3533 = arg2.method1423(-42);
        } else if (arg0 == 12) {
            this.field3538 = true;
        } else if (arg0 == 13) {
            this.field3535 = arg2.method1458((byte) 107);
        } else if (arg0 == 14) {
            this.field3519 = arg2.method1423(-63) << 2;
        } else if (arg0 == 16) {
            this.field3520 = arg2.method1423(-68);
        }
        if (arg1 != -14) {
            this.field3520 = 43;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V", line = 402)
    public static final void method1711(byte arg0) {
        field3532++;
        if (class92.field959 == null) {
            return;
        }
        class188.field2237 = new class727();
        class188.field2237.method4051(class92.field959, class92.field959.field8349, class98.field1024, (byte) -41, class92.field959.field8356.method2936(class489.field6978, -80));
        class736.field10294 = new Thread(class188.field2237, "");
        class736.field10294.start();
        int var1 = 114 / ((20 - arg0) / 38);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILig;)V", line = 438)
    public final void method1712(int arg0, class244 arg1) {
        while (true) {
            int var3 = arg1.method1423(-25);
            if (var3 == 0) {
                field3523++;
                if (arg0 != -1) {
                    method1708(19);
                    return;
                }
                return;
            }
            this.method1710(var3, arg0 - 13, arg1);
        }
    }
}
