import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class527 extends class560 implements class558 {

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    private int field7489;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Liba;")
    public static class211 field7483 = new class211(58, 3);

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V")
    public static void method2983(byte arg0) {
        if (arg0 > -126) {
            field7485 = 106;
        }
        field7483 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)J")
    public final long method2984(byte arg0) {
        if (arg0 != 12) {
            return -70L;
        } else {
            ++field7488;
            return super.field8213.getAddress();
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
    public final int method2985(int arg0) {
        if (arg0 != 17831) {
            this.field7489 = 122;
        }
        ++field7487;
        return 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILr;ILhq;IILda;IIIBII)Lda;")
    public static final class395 method2986(int arg0, int arg1, class98 arg2, int arg3, class47 arg4, int arg5, int arg6, class395 arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, int arg13) {
        ++field7486;
        if (arg7 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg4 != null) {
                int var15 = var14 | arg4.method284(false, arg0, (byte) -53, -1);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg12 << 32) + (long) ((arg3 << 24) + (arg5 << 16) + arg6) - -((long) arg8 << 48);
            if (arg11 != 91) {
                return null;
            } else {
                class692 var18 = class423.field6210;
                class395 var19;
                synchronized (class423.field6210) {
                    var19 = (class395) class423.field6210.method3901(var16, arg11 + -181);
                }
                if (var19 == null || arg2.method706(var19.method1027(), var14) != 0) {
                    if (var19 != null) {
                        var14 = arg2.method661(var14, var19.method1027());
                    }
                    byte var20;
                    if (arg6 != 1) {
                        if (arg6 != 2) {
                            if (~arg6 != -4) {
                                if (arg6 != 4) {
                                    var20 = 21;
                                } else {
                                    var20 = 18;
                                }
                            } else {
                                var20 = 15;
                            }
                        } else {
                            var20 = 12;
                        }
                    } else {
                        var20 = 9;
                    }
                    byte var21 = 3;
                    int[] var22 = new int[] { 64, 96, 128 };
                    class677 var23 = new class677(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
                    int var24 = var23.method3793(0, 0, 0, 103);
                    int[][] var25 = new int[var21][var20];
                    for (int var26 = 0; ~var21 < ~var26; ++var26) {
                        int var27 = var22[var26];
                        int var28 = var22[var26];
                        for (int var29 = 0; var29 < var20; ++var29) {
                            int var30 = (var29 << 14) / var20;
                            int var31 = class271.field3549[var30] * var27 >> 14;
                            int var32 = class271.field3544[var30] * var28 >> 14;
                            var25[var26][var29] = var23.method3793(0, var32, var31, 107);
                        }
                    }
                    for (int var33 = 0; var33 < var21; ++var33) {
                        int var34 = (var33 * 256 - -128) / var21;
                        int var35 = -var34 + 256;
                        byte var36 = (byte) (arg3 * var34 + arg5 * var35 >> 8);
                        short var37 = (short) (((896 & arg8) * var34 + (arg12 & 896) * var35 & 229376) + ((arg8 & 127) * var34 + (127 & arg12) * var35 & 32512) + ((64512 & arg8) * var34 + (64512 & arg12) * var35 & 16515072) >> 8);
                        for (int var38 = 0; ~var38 > ~var20; ++var38) {
                            if (var33 == 0) {
                                var23.method3806(20237, (byte) 1, var37, var25[0][(var38 + 1) % var20], var24, var36, (byte) -1, (short) -1, var25[0][var38]);
                            } else {
                                var23.method3806(20237, (byte) 1, var37, var25[var33 + -1][(var38 - -1) % var20], var25[var33 + -1][var38], var36, (byte) -1, (short) -1, var25[var33][(var38 + 1) % var20]);
                                var23.method3806(20237, (byte) 1, var37, var25[var33][(var38 - -1) % var20], var25[var33 + -1][var38], var36, (byte) -1, (short) -1, var25[var33][var38]);
                            }
                        }
                    }
                    var19 = arg2.method651(var23, var14, class525.field7471, 64, 768);
                    class692 var39 = class423.field6210;
                    synchronized (class423.field6210) {
                        class423.field6210.method3894(var19, (byte) 60, var16);
                    }
                }
                int var40 = arg7.method1012();
                int var41 = arg7.method1009();
                int var42 = arg7.method1053();
                int var43 = arg7.method1039();
                class128 var44 = null;
                if (arg4 != null) {
                    int var45 = arg4.field732[arg0];
                    var44 = class203.field2769.method2967(-1, var45 >> 16);
                    arg0 = var45 & 65535;
                }
                class395 var46;
                if (var44 != null) {
                    var46 = var19.method1038((byte) 3, var14, true);
                    var46.method1033(var41 - var40 >> 1, 128, -var42 + var43 >> 1);
                    var46.method1019(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                    var46.method2457(arg0, 16383, var44);
                } else {
                    var46 = var19.method1038((byte) 3, var14, true);
                    var46.method1033(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                    var46.method1019(var40 + var41 >> 1, 0, var42 - -var43 >> 1);
                }
                if (arg1 != 0) {
                    var46.method1048(arg1);
                }
                if (arg9 != 0) {
                    var46.method1044(arg9);
                }
                if (arg13 != 0) {
                    var46.method1019(0, arg13, 0);
                }
                return var46;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)I")
    public final int method2987(int arg0) {
        if (arg0 <= 113) {
            return 16;
        } else {
            ++field7484;
            return this.field7489;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Luca;I[BI)V")
    public class527(class287 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7489 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[BI)V")
    public final void method2988(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method3247(arg2, arg3);
        ++field7482;
        this.field7489 = arg0;
        if (arg1 != -10884) {
            this.field7489 = 83;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Luca;ILjaclib/memory/Buffer;)V")
    public class527(class287 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field7489 = arg1;
    }
}
