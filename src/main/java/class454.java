import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class454 extends class568 {

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
    public int[] field7013 = new int[1];

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[I")
    public int[] field7018 = new int[] { -1 };

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7019 = new String[] { method3531(method3530("(d2I\n")), method3531(method3530("*xpg")), method3531(method3530("(d2L\n")), method3531(method3530("?#2%_")), method3531(method3530("(d2M\n")), method3531(method3530("(d2J\n")), method3531(method3530("(d2H\n")), method3531(method3530("(d2N\n")), method3531(method3530("(d2O\n")) };

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lhda;")
    public static class784 field7016 = new class784();

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([IZZ[II)J", line = 5)
    private final long method3523(int[] arg0, boolean arg1, boolean arg2, int[] arg3, int arg4) {
        try {
            field7012++;
            if (!arg1) {
                field7016 = null;
            }
            long[] var6 = class53.field658;
            long var7 = -1L;
            long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
            long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
            for (int var13 = 0; var13 < arg0.length; var13++) {
                long var14 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)];
                long var16 = var14 >>> 8 ^ var6[(int) ((var14 ^ (long) (arg0[var13] >> 16)) & 0xFFL)];
                long var18 = var6[(int) ((var16 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var16 >>> 8;
                var11 = var6[(int) (((long) arg0[var13] ^ var18) & 0xFFL)] ^ var18 >>> 8;
            }
            if (arg3 != null) {
                for (int var20 = 0; var20 < 5; var20++) {
                    var11 = var6[(int) (((long) arg3[var20] ^ var11) & 0xFFL)] ^ var11 >>> 8;
                }
            }
            return var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field7019[2] + (arg0 == null ? field7019[1] : field7019[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7019[1] : field7019[3]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILoe;IIZLha;IILuaa;)Lka;", line = 49)
    public final class499 method3524(int arg0, int arg1, class210 arg2, int arg3, int arg4, boolean arg5, class63 arg6, int arg7, int arg8, class124 arg9) {
        try {
            field7015++;
            if (arg8 != 5) {
                this.field7013 = null;
            }
            class499 var11 = null;
            int var12 = arg0;
            class707 var13 = null;
            if (arg4 != -1) {
                var13 = class78.field1216.method3182(arg4, 99);
            }
            int[] var14 = this.field7018;
            if (var13 != null && var13.field10162 != null) {
                var14 = new int[var13.field10162.length];
                for (int var15 = 0; var15 < var13.field10162.length; var15++) {
                    int var16 = var13.field10162[var15];
                    if (var16 >= 0 && this.field7018.length > var16) {
                        var14[var15] = this.field7018[var16];
                    } else {
                        var14[var15] = -1;
                    }
                }
            }
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = false;
            boolean var20 = false;
            int var21 = -1;
            int var22 = -1;
            int var23 = 0;
            class356 var24 = null;
            class356 var25 = null;
            if (arg2 != null) {
                int var26 = arg2.field3327[arg1];
                var12 = arg0 | 0x20;
                int var27 = var26 >>> 16;
                var24 = class397.field6293.method2052(96, var27);
                var21 = var26 & 0xFFFF;
                if (var24 != null) {
                    var18 |= var24.method2947(var21, -1);
                    var17 |= var24.method2954(var21, -19459);
                    var20 |= var24.method2951(var21, (byte) 93);
                    var19 |= arg2.field3320;
                }
                if ((arg2.field3312 || class321.field5219) && arg3 != -1 && arg2.field3327.length > arg3) {
                    int var28 = arg2.field3327[arg3];
                    var23 = arg2.field3334[arg1];
                    int var29 = var28 >>> 16;
                    var22 = var28 & 0xFFFF;
                    if (var27 == var29) {
                        var25 = var24;
                    } else {
                        var25 = class397.field6293.method2052(104, var22 >>> 16);
                    }
                    if (var25 != null) {
                        var18 |= var25.method2947(var22, -1);
                        var17 |= var25.method2954(var22, -19459);
                        var20 |= var25.method2951(var22, (byte) 93);
                    }
                }
                if (var18) {
                    var12 |= 0x80;
                }
                if (var17) {
                    var12 |= 0x100;
                }
                if (var19) {
                    var12 |= 0x200;
                }
                if (var20) {
                    var12 |= 0x400;
                }
            }
            long var30 = this.method3523(var14, true, arg5, arg9 == null ? null : arg9.field1801, arg4);
            if (class289.field4640 != null) {
                var11 = (class499) class289.field4640.method302(-94, var30);
            }
            if (var11 == null || arg6.method151(var11.method433(), var12) != 0) {
                if (var11 != null) {
                    var12 = arg6.method169(var12, var11.method433());
                }
                int var32 = var12;
                boolean var33 = false;
                for (int var34 = 0; var34 < var14.length; var34++) {
                    if (var14[var34] != -1 && !class229.field3563.method531(var14[var34], (byte) 45).method4289(arg5, 0, null)) {
                        var33 = true;
                    }
                }
                if (var33) {
                    return null;
                }
                class141[] var35 = new class141[var14.length];
                for (int var36 = 0; var36 < var14.length; var36++) {
                    if (var14[var36] != -1) {
                        var35[var36] = class229.field3563.method531(var14[var36], (byte) 75).method4288(arg5, null, (byte) 96);
                    }
                }
                if (var13 != null && var13.field10147 != null) {
                    for (int var37 = 0; var37 < var13.field10147.length; var37++) {
                        if (var13.field10147[var37] != null && var35[var37] != null) {
                            int var38 = var13.field10147[var37][0];
                            int var39 = var13.field10147[var37][1];
                            int var40 = var13.field10147[var37][2];
                            int var41 = var13.field10147[var37][3];
                            int var42 = var13.field10147[var37][4];
                            int var43 = var13.field10147[var37][5];
                            if (var41 != 0 || var42 != 0 || var43 != 0) {
                                var35[var37].method1302(-14911, var42, var43, var41);
                            }
                            if (var38 != 0 || var39 != 0 || var40 != 0) {
                                var35[var37].method1308(arg8 ^ 0xFFFFFA52, var39, var38, var40);
                            }
                        }
                    }
                }
                class141 var44 = new class141(var35, var35.length);
                if (arg9 != null) {
                    var32 = var12 | 0x4000;
                }
                var11 = arg6.method192(var44, var32, class494.field7429, 64, 850);
                if (arg9 != null) {
                    for (int var45 = 0; var45 < 5; var45++) {
                        for (int var46 = 0; var46 < class101.field1485.length; var46++) {
                            if (arg9.field1801[var45] < class101.field1485[var46][var45].length) {
                                var11.method420(class350.field5667[var46][var45], class101.field1485[var46][var45][arg9.field1801[var45]]);
                            }
                        }
                    }
                }
                if (class289.field4640 != null) {
                    var11.method411(var12);
                    class289.field4640.method295(false, var30, var11);
                }
            }
            if (arg2 == null || var24 == null) {
                return var11;
            } else {
                class499 var47 = var11.method394((byte) 1, var12, true);
                var47.method3767(var25, var23, var24, arg2.field3320, true, var21, 0, arg7 - 1, var22);
                return var47;
            }
        } catch (RuntimeException var49) {
            throw class590.method4333(var49, field7019[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7019[1] : field7019[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field7019[1] : field7019[3]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field7019[1] : field7019[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLmj;)V", line = 296)
    public static final void method3525(byte arg0, class683 arg1) {
        try {
            field7017++;
            if (class74.field1064 == arg1.field9867) {
                class178.field2871[arg1.field9749] = true;
            }
            if (arg0 != 27) {
                method3526(-25, null);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7019[4] + arg0 + ',' + (arg1 == null ? field7019[1] : field7019[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILwq;)Lpq;", line = 319)
    public static final class203 method3526(int arg0, class176 arg1) {
        try {
            if (arg0 == -27362) {
                field7014++;
                int var2 = arg1.method1687((byte) -118);
                return new class203(var2);
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7019[6] + arg0 + ',' + (arg1 == null ? field7019[1] : field7019[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 332)
    public static void method3527(byte arg0) {
        try {
            if (arg0 >= -50) {
                method3526(-40, null);
            }
            field7016 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7019[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lmj;", line = 343)
    public static final class683 method3528(int arg0, int arg1, int arg2) {
        try {
            field7011++;
            class683 var3 = class200.method1826(true, arg2);
            if (~arg1 == arg0) {
                return var3;
            } else if (var3 == null || var3.field9743 == null || arg1 >= var3.field9743.length) {
                return null;
            } else {
                return var3.field9743[arg1];
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7019[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lpe;", line = 364)
    public static final class636 method3529(int arg0, byte arg1) {
        try {
            if (arg1 != -78) {
                method3526(-13, null);
            }
            field7010++;
            class636[] var2 = class49.method506(256);
            for (int var3 = 0; var3 < var2.length; var3++) {
                if (var2[var3].field9124 == arg0) {
                    return var2[var3];
                }
            }
            return null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7019[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3530(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!li", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3531(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
