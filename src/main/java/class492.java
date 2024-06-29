import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class492 {

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    private int field7057 = -1;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Z")
    public boolean field7066 = true;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    private int field7054;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Lpc;")
    private class698 field7047;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    private int field7049;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "Lffa;")
    private class197 field7053;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    private int field7055;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Lbca;")
    private class689 field7051;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Lraa;")
    private class633 field7052;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "Lkfa;")
    private class628 field7060;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7068 = new String[] { method3724(method3723("+\u0012to\u001c")), method3724(method3723(">I6-")), method3724(method3723("3Mt\u0005I")), method3724(method3723("3Mt\u0003I")), method3724(method3723("3Mt\u0004I")), method3724(method3723("3Mt\u0007I")), method3724(method3723("3Mt\u0002I")), method3724(method3723("3Mt}\b>U.\u007fI")), method3724(method3723("3Mt\u0006I")), method3724(method3723("3Mt\u0000I")) };

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7063 = null;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "Lgq;")
    public static class540 field7058 = new class540();

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field7065 = -1;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "Lrp;")
    public static class460 field7061;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;B)Lhv;", line = 6)
    public static final class544 method3716(Component arg0, byte arg1) {
        try {
            field7064++;
            return arg1 == 116 ? new class13(arg0) : null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7068[2] + (arg0 == null ? field7068[1] : field7068[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 24)
    public static void method3717(int arg0) {
        try {
            field7061 = null;
            field7063 = null;
            field7058 = null;
            if (arg0 <= 74) {
                method3716(null, (byte) -53);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7068[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BILraa;)V", line = 37)
    private final void method3718(byte arg0, int arg1, class633 arg2) {
        try {
            field7050++;
            if (arg1 != 0) {
                this.method3721((byte) 91);
                this.field7053.method1733(this.field7051, 17237);
                if (arg0 == 108) {
                    this.field7053.method1694(arg2, 4, arg1, 6056, 0);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7068[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7068[1] : field7068[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 57)
    public static final void method3719(int arg0, String arg1, int arg2) {
        try {
            field7048++;
            class313 var3 = class196.method1670((long) arg0, arg2, 127);
            var3.method2636((byte) 98);
            var3.field4956 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7068[6] + arg0 + ',' + (arg1 == null ? field7068[1] : field7068[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "([BIII)V", line = 71)
    public final void method3720(byte[] arg0, int arg1, int arg2, int arg3) {
        try {
            this.field7060.method452(arg2, (byte) 86, arg0, this.field7053.method1714(7, arg2) * arg1);
            field7056++;
            if (arg3 > -7) {
                field7065 = 122;
            }
            this.method3718((byte) 108, arg1, this.field7060);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7068[3] + (arg0 == null ? field7068[1] : field7068[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lffa;Lpc;Laq;IIIII)V", line = 221)
    public class492(class197 arg0, class698 arg1, class170 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field7054 = arg6;
            this.field7047 = arg1;
            this.field7049 = arg7;
            this.field7053 = arg0;
            int var9 = 0x1 << arg5;
            int var10 = 0;
            int var11 = arg3 << arg5;
            int var12 = arg4 << arg5;
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = (var12 + var13) * arg2.field4337 + var11;
                for (int var15 = 0; var15 < var9; var15++) {
                    short[] var16 = arg2.field2328[var14++];
                    if (var16 != null) {
                        var10 += var16.length;
                    }
                }
            }
            this.field7055 = var10;
            if (var10 <= 0) {
                this.field7051 = null;
            } else {
                class163 var17 = new class163(var10 * 2);
                if (this.field7053.field2922) {
                    for (int var18 = 0; var18 < var9; var18++) {
                        int var19 = (var12 + var18) * arg2.field4337 + var11;
                        for (int var20 = 0; var20 < var9; var20++) {
                            short[] var21 = arg2.field2328[var19++];
                            if (var21 != null) {
                                for (int var22 = 0; var22 < var21.length; var22++) {
                                    var17.method1406(var21[var22] & 0xFFFF, 380332136);
                                }
                            }
                        }
                    }
                } else {
                    for (int var23 = 0; var23 < var9; var23++) {
                        int var24 = (var12 + var23) * arg2.field4337 + var11;
                        for (int var25 = 0; var25 < var9; var25++) {
                            short[] var26 = arg2.field2328[var24++];
                            if (var26 != null) {
                                for (int var27 = 0; var27 < var26.length; var27++) {
                                    var17.method1465(var26[var27] & 0xFFFF, (byte) -93);
                                }
                            }
                        }
                    }
                }
                this.field7052 = this.field7053.method1727(var17.field2201, (byte) -99, var17.field2209, 5123, false);
                this.field7060 = new class628(this.field7053, 5123, null, 1);
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field7068[7] + (arg0 == null ? field7068[1] : field7068[0]) + ',' + (arg1 == null ? field7068[1] : field7068[0]) + ',' + (arg2 == null ? field7068[1] : field7068[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 90)
    private final void method3721(byte arg0) {
        try {
            field7062++;
            if (this.field7066) {
                this.field7066 = false;
                byte[] var2 = this.field7047.field10161;
                byte[] var3 = this.field7053.field2999;
                int var4 = 0;
                int var5 = this.field7047.field10155;
                int var6 = this.field7047.field10155 * this.field7049 + this.field7054;
                for (int var7 = -128; var7 < 0; var7++) {
                    var4 = (var4 << 8) - var4;
                    for (int var8 = -128; var8 < 0; var8++) {
                        if (var2[var6++] != 0) {
                            var4++;
                        }
                    }
                    var6 += var5 - 128;
                }
                if (this.field7051 != null && this.field7057 == var4) {
                    this.field7066 = false;
                } else {
                    this.field7057 = var4;
                    int var9 = 0;
                    int var10 = this.field7049 * var5 + this.field7054;
                    if (arg0 <= 87) {
                        method3717(112);
                    }
                    for (int var11 = -128; var11 < 0; var11++) {
                        for (int var12 = -128; var12 < 0; var12++) {
                            if (var2[var10] == 0) {
                                int var13 = 0;
                                if (var2[var10 - 1] != 0) {
                                    var13++;
                                }
                                if (var2[var10 + 1] != 0) {
                                    var13++;
                                }
                                if (var2[var10 - var5] != 0) {
                                    var13++;
                                }
                                if (var2[var5 + var10] != 0) {
                                    var13++;
                                }
                                var3[var9++] = (byte) (var13 * 17);
                            } else {
                                var3[var9++] = 68;
                            }
                            var10++;
                        }
                        var10 += this.field7047.field10155 - 128;
                    }
                    if (this.field7051 == null) {
                        this.field7051 = new class689(this.field7053, 3553, 6406, 128, 128, false, this.field7053.field2999, 6406, false);
                        this.field7051.method5046(false, (byte) -104, false);
                        this.field7051.method3923(25768, true);
                    } else {
                        this.field7051.method5049(this.field7053.field2999, 6406, false, 0, 128, -79, 0, 0, 128, 0);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field7068[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 197)
    public final void method3722(byte arg0) {
        try {
            this.method3718((byte) 108, this.field7055, this.field7052);
            field7067++;
            if (arg0 <= 94) {
                this.field7052 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7068[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3723(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3724(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
