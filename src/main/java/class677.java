import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class677 extends class343 implements class583 {

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "Z")
    private boolean field9831 = false;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "Lnc;")
    public class26 field9835;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "Z")
    private boolean field9827;

    @OriginalMember(owner = "client!fh", name = "pb", descriptor = "[Ljava/lang/String;")
    private static final String[] field9836 = new String[] { method4970(method4969("\u0013R5oT]")), method4970(method4969("\u000e\u00145\u0002h")), method4970(method4969("\u001bOw@")), method4970(method4969("\u0013R5mT]")), method4970(method4969("\u0013R5`=")), method4970(method4969("\u0013R5nT]")), method4970(method4969("\u0013R5e=")), method4970(method4969("\u0013R5g=")), method4970(method4969("\u0013R5i=")), method4970(method4969("\u0013R5a=")), method4970(method4969("\u0013R5x=")), method4970(method4969("\u0013R5f=")), method4970(method4969("\u0013R5z=")), method4970(method4969("\u0013R5}=")), method4970(method4969("\u0013R5b=")), method4970(method4969("\u0013R5|=")), method4970(method4969("\u0013R5\u007f=")), method4970(method4969("\u0013R5k=")), method4970(method4969("\u0013R5{=")), method4970(method4969("\u0013R5y=")), method4970(method4969("\u0013R5d=")), method4970(method4969("\u0013R5h=")), method4970(method4969("\u0013R5j=")), method4970(method4969("\u0013R5\u0010|\u001bSo\u0012=")) };

    @OriginalMember(owner = "client!fh", name = "ob", descriptor = "Lcn;")
    public static class541 field9834 = null;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "Z")
    public static boolean field9819 = true;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!fh", name = "nb", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!fh", name = "mb", descriptor = "I")
    public static int field9824;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lcca;")
    private class260 field9820;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "[I")
    public static int[] field9809;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLrn;)V")
    public final void method4966(byte arg0, class282 arg1) {
        try {
            ++field9830;
            if (arg0 > 7) {
                this.field9835.method179(0, arg1);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9836[7] + arg0 + ',' + (arg1 != null ? field9836[1] : field9836[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)I")
    public final int method1093(int arg0) {
        try {
            ++field9832;
            if (arg0 != -3) {
                field9834 = null;
            }
            return this.field9835.method172((byte) -122);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lha;Lc;IIIIIZIIIIIII)V")
    public class677(class66 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field3006 == -2, class163.method1439(2, arg13, arg12));
        try {
            this.field9835 = new class26(arg0, arg1, arg12, arg13, super.field6200, arg3, this, arg7, arg14);
            this.field9827 = ~arg1.field3082 != -1 && !arg7;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field9836[23] + (arg0 != null ? field9836[1] : field9836[2]) + ',' + (arg1 != null ? field9836[1] : field9836[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILha;)V")
    public final void method1096(int arg0, class66 arg1) {
        try {
            if (arg0 <= -77) {
                this.field9835.method174(102, arg1);
                ++field9812;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9836[0] + arg0 + ',' + (arg1 != null ? field9836[1] : field9836[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ldf;IZIIILha;)V")
    public final void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            if (arg5 != 0) {
                this.method627((class420) null, -78, true, -94, -84, -50, (class66) null);
            }
            ++field9818;
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9836[17] + (arg0 != null ? field9836[1] : field9836[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9836[1] : field9836[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "(I)V")
    public static final void method4967(int arg0) {
        try {
            ++field9833;
            class281.method2302(126);
            class324.field5123 = null;
            class198.field3097 = null;
            class72.field795 = null;
            class342.field5315 = null;
            if (arg0 != 0) {
                method4967(68);
            }
            class248.field3869 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9836[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
    public final int method1087(int arg0) {
        try {
            ++field9822;
            if (arg0 != 18636) {
                this.method1095(95);
            }
            return this.field9835.field291;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(ILha;)V")
    public final void method1090(int arg0, class66 arg1) {
        try {
            ++field9828;
            int var3 = 8 % ((arg0 - -53) / 61);
            this.field9835.method175(11, arg1);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9836[9] + arg0 + ',' + (arg1 != null ? field9836[1] : field9836[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public final void method1085(int arg0) {
        try {
            ++field9829;
            if (arg0 != -2939) {
                this.field9835 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(ILha;)V")
    public final void method1081(int arg0, class66 arg1) {
        try {
            ++field9823;
            class497 var3 = this.field9835.method183(262144, arg1, -107, true, true);
            if (arg0 != 0) {
                this.method1082((byte) 21);
            }
            if (var3 != null) {
                class501 var4 = arg1.method511();
                var4.method2389(super.field6197, super.field6199, super.field6211);
                this.field9835.method176(var3, super.field5335, super.field5325, var4, super.field5329, arg1, super.field5330, (byte) -118, false);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9836[18] + arg0 + ',' + (arg1 != null ? field9836[1] : field9836[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lha;I)Lcca;")
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            ++field9817;
            if (arg1 < 65) {
                method4968((byte) 95);
            }
            return this.field9820;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9836[6] + (arg0 != null ? field9836[1] : field9836[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z")
    public final boolean method1095(int arg0) {
        try {
            if (arg0 != -9842) {
                this.field9827 = false;
            }
            ++field9813;
            return this.field9835.method181((byte) -65);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILha;B)Z")
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            ++field9811;
            class497 var5 = this.field9835.method183(131072, arg2, -101, false, false);
            if (var5 == null) {
                return false;
            } else {
                class501 var6 = arg2.method511();
                var6.method2389(super.field6197, super.field6199, super.field6211);
                if (arg3 > -43) {
                    this.field9827 = false;
                }
                return !class640.field9291 ? var5.method297(arg1, arg0, var6, false, 0) : var5.method314(arg1, arg0, var6, false, 0, class726.field10487);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9836[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9836[1] : field9836[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Z")
    public final boolean method1098(boolean arg0) {
        try {
            if (arg0) {
                this.method1081(-44, (class66) null);
            }
            ++field9824;
            return this.field9831;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLha;)Ltf;")
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            ++field9816;
            class497 var3 = this.field9835.method183(2048, arg1, -89, true, false);
            if (var3 == null) {
                return null;
            } else {
                class501 var4 = arg1.method511();
                var4.method2389(super.field6197, super.field6199, super.field6211);
                class310 var5 = class772.method5591(this.field9827, 0, 1);
                this.field9835.method176(var3, super.field5335, super.field5325, var4, super.field5329, arg1, super.field5330, (byte) -119, true);
                if (arg0 != -104) {
                    field9819 = false;
                }
                if (!class640.field9291) {
                    var3.method333(var4, var5.field4918[0], 0);
                } else {
                    var3.method323(var4, var5.field4918[0], class726.field10487, 0);
                }
                if (this.field9835.field312 != null) {
                    class580 var6 = this.field9835.field312.method4621();
                    if (!class640.field9291) {
                        arg1.method590(var6);
                    } else {
                        arg1.method500(var6, class726.field10487);
                    }
                }
                this.field9831 = var3.method307() || this.field9835.field312 != null;
                if (this.field9820 == null) {
                    this.field9820 = class505.method3806(arg0 ^ 56, var3, super.field6199, super.field6197, super.field6211);
                } else {
                    class587.method4377(super.field6197, this.field9820, super.field6199, arg0 + 228, var3, super.field6211);
                }
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9836[3] + arg0 + ',' + (arg1 != null ? field9836[1] : field9836[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
    public final int method1083(byte arg0) {
        try {
            int var2 = 100 / ((53 - arg0) / 51);
            ++field9825;
            return this.field9835.field299;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9836[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)V")
    public static void method4968(byte arg0) {
        try {
            field9834 = null;
            field9809 = null;
            if (arg0 != 70) {
                method4967(-50);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9836[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
    public final int method1097(boolean arg0) {
        try {
            ++field9814;
            return arg0 ? 24 : this.field9835.field305;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Z")
    public final boolean method1082(byte arg0) {
        try {
            if (arg0 != 27) {
                this.method628(56);
            }
            ++field9810;
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Z")
    public final boolean method625(byte arg0) {
        try {
            if (arg0 != 94) {
                return true;
            } else {
                ++field9821;
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)V")
    public final void method628(int arg0) {
        try {
            ++field9815;
            if (arg0 == -38) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)I")
    public final int method1088(int arg0) {
        try {
            if (arg0 != -2226) {
                field9834 = null;
            }
            ++field9826;
            return this.field9835.method171(38);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9836[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4969(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4970(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
