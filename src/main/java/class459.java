import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class459 extends class749 implements class583 {

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Z")
    private boolean field6704;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "S")
    private short field6691;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "B")
    private byte field6682;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "Z")
    private boolean field6678;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Z")
    private boolean field6707;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "Z")
    private boolean field6690;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "Lr;")
    private class194 field6683;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lka;")
    private class497 field6698;

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "[Ljava/lang/String;")
    private static final String[] field6708 = new String[] { method3502(method3501("LODUx\u0005")), method3502(method3501("LODR\u0011")), method3502(method3501("C\\\u0006{")), method3502(method3501("LODZ\u0011")), method3502(method3501("V\u0007D9D")), method3502(method3501("LODF\u0011")), method3502(method3501("LODB\u0011")), method3502(method3501("LOD^\u0011")), method3502(method3501("LODG\u0011")), method3502(method3501("LOD+PC@\u001e)\u0011")), method3502(method3501("LOD[\u0011")), method3502(method3501("LODP\u0011")), method3502(method3501("LODQ\u0011")), method3502(method3501("LODA\u0011")), method3502(method3501("LODY\u0011")), method3502(method3501("LODVx\u0005")), method3502(method3501("LODTx\u0005")), method3502(method3501("LOD]\u0011")), method3502(method3501("LOD_\u0011")), method3502(method3501("LOD@\u0011")), method3502(method3501("LODC\u0011")), method3502(method3501("LODS\u0011")), method3502(method3501("LOD\\\u0011")), method3502(method3501("LODD\u0011")) };

    @OriginalMember(owner = "client!af", name = "M", descriptor = "F")
    public static float field6688 = 0.0F;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "[B")
    public static byte[] field6686 = new byte[2048];

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "Lcca;")
    private class260 field6681;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Z")
    public static boolean field6679;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLha;)Ltf;", line = 6)
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            ++field6694;
            if (this.field6698 == null) {
                return null;
            } else if (arg0 != -104) {
                return null;
            } else {
                class501 var3 = arg1.method511();
                var3.method2389(super.field6197, super.field6199, super.field6211);
                class310 var4 = class772.method5591(this.field6704, 0, 1);
                if (class640.field9291) {
                    this.field6698.method323(var3, var4.field4918[0], class726.field10487, 0);
                } else {
                    this.field6698.method333(var3, var4.field4918[0], 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6708[15] + arg0 + ',' + (arg1 != null ? field6708[4] : field6708[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)I", line = 33)
    public final int method1083(byte arg0) {
        try {
            int var2 = 84 / ((arg0 - 53) / 51);
            ++field6689;
            return 65535 & this.field6691;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6708[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(ILha;)V", line = 43)
    public final void method1090(int arg0, class66 arg1) {
        try {
            ++field6692;
            int var3 = 29 / ((-53 - arg0) / 61);
            Object var4 = null;
            class194 var6;
            if (this.field6683 == null && this.field6690) {
                class433 var5 = this.method3500(arg1, 262144, false, true);
                var6 = var5 != null ? var5.field6364 : null;
            } else {
                var6 = this.field6683;
                this.field6683 = null;
            }
            if (var6 != null) {
                class670.method4926(var6, super.field6205, super.field6197, super.field6211, (boolean[]) null);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6708[3] + arg0 + ',' + (arg1 != null ? field6708[4] : field6708[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILha;B)Z", line = 69)
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            if (arg3 >= -43) {
                return false;
            } else {
                ++field6687;
                class497 var5 = this.method3499(131072, arg2, -1);
                if (var5 != null) {
                    class501 var6 = arg2.method511();
                    var6.method2389(super.field6197, super.field6199, super.field6211);
                    return class640.field9291 ? var5.method314(arg1, arg0, var6, false, 0, class726.field10487) : var5.method297(arg1, arg0, var6, false, 0);
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6708[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6708[4] : field6708[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "l", descriptor = "(I)V", line = 90)
    public static void method3498(int arg0) {
        try {
            field6686 = null;
            if (arg0 > -32) {
                field6688 = 0.46045488F;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6708[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)Z", line = 104)
    public final boolean method625(byte arg0) {
        try {
            ++field6706;
            return arg0 != 94 ? true : this.field6707;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I", line = 118)
    public final int method1097(boolean arg0) {
        try {
            if (arg0) {
                this.method1088(46);
            }
            ++field6699;
            return this.field6682;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILha;)V", line = 131)
    public final void method1096(int arg0, class66 arg1) {
        try {
            ++field6696;
            Object var3 = null;
            class194 var5;
            if (this.field6683 == null && this.field6690) {
                class433 var4 = this.method3500(arg1, 262144, false, true);
                var5 = var4 == null ? null : var4.field6364;
            } else {
                var5 = this.field6683;
                this.field6683 = null;
            }
            if (arg0 <= -77) {
                if (var5 != null) {
                    class188.method1632(var5, super.field6205, super.field6197, super.field6211, (boolean[]) null);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6708[16] + arg0 + ',' + (arg1 != null ? field6708[4] : field6708[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lha;I)Lcca;", line = 159)
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            if (this.field6681 == null) {
                this.field6681 = class505.method3806(126, this.method3499(0, arg0, -1), super.field6199, super.field6197, super.field6211);
            }
            ++field6700;
            if (arg1 <= 65) {
                this.field6682 = -31;
            }
            return this.field6681;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6708[7] + (arg0 != null ? field6708[4] : field6708[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z", line = 174)
    public final boolean method1095(int arg0) {
        try {
            if (arg0 != -9842) {
                method3498(-108);
            }
            ++field6685;
            return this.field6690;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 185)
    public final void method1085(int arg0) {
        try {
            ++field6701;
            if (this.field6698 != null) {
                this.field6698.method322();
            }
            if (arg0 != -2939) {
                this.method3499(9, (class66) null, -52);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "(I)I", line = 198)
    public final int method1088(int arg0) {
        try {
            ++field6684;
            if (arg0 != -2226) {
                this.method1082((byte) 53);
            }
            return this.field6698 != null ? this.field6698.method305() : 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILha;I)Lka;", line = 212)
    private final class497 method3499(int arg0, class66 arg1, int arg2) {
        try {
            ++field6693;
            if (this.field6698 != null && ~arg1.method509(this.field6698.method330(), arg0) == -1) {
                return this.field6698;
            } else {
                class433 var4 = this.method3500(arg1, arg0, false, false);
                if (arg2 != -1) {
                    return null;
                } else {
                    return var4 != null ? var4.field6363 : null;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6708[12] + arg0 + ',' + (arg1 != null ? field6708[4] : field6708[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z", line = 232)
    public final boolean method1082(byte arg0) {
        try {
            ++field6680;
            if (arg0 != 27) {
                this.method1096(64, (class66) null);
            }
            if (this.field6698 == null) {
                return true;
            } else {
                return !this.field6698.method321();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I", line = 249)
    public final int method1087(int arg0) {
        try {
            if (arg0 != 18636) {
                return -2;
            } else {
                ++field6677;
                return 22;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(ILha;)V", line = 263)
    public final void method1081(int arg0, class66 arg1) {
        try {
            ++field6695;
            if (arg0 != 0) {
                this.field6683 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6708[19] + arg0 + ',' + (arg1 != null ? field6708[4] : field6708[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lha;Lc;IIIIIZIZ)V", line = 278)
    public class459(class66 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3038);
        try {
            this.field6704 = ~arg1.field3082 != -1 && !arg7;
            super.field6197 = arg4;
            super.field6211 = arg6;
            this.field6691 = (short) arg1.field3014;
            this.field6682 = (byte) arg8;
            this.field6678 = arg7;
            this.field6707 = arg9;
            this.field6690 = arg0.method559() && arg1.field3036 && !this.field6678 && class289.field4305.field810.method112(false) != 0;
            int var11 = 2048;
            if (this.field6707) {
                var11 |= 65536;
            }
            class433 var12 = this.method3500(arg0, var11, false, this.field6690);
            if (var12 != null) {
                this.field6683 = var12.field6364;
                this.field6698 = var12.field6363;
                if (this.field6707) {
                    this.field6698 = this.field6698.method332((byte) 0, var11, false);
                    return;
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field6708[9] + (arg0 != null ? field6708[4] : field6708[2]) + ',' + (arg1 != null ? field6708[4] : field6708[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)I", line = 322)
    public final int method1093(int arg0) {
        try {
            if (arg0 != -3) {
                this.method1093(106);
            }
            ++field6676;
            return this.field6698 == null ? 0 : this.field6698.method327();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lha;IZZ)Llg;", line = 334)
    private final class433 method3500(class66 arg0, int arg1, boolean arg2, boolean arg3) {
        try {
            ++field6705;
            class198 var5 = class417.field6144.method3030(0, this.field6691 & 65535);
            if (arg2) {
                this.field6678 = false;
            }
            class294 var6;
            class294 var7;
            if (this.field6678) {
                var6 = class195.field2617[super.field6205];
                var7 = class184.field2541[0];
            } else {
                if (~super.field6205 <= -4) {
                    var7 = null;
                } else {
                    var7 = class184.field2541[super.field6205 + 1];
                }
                var6 = class184.field2541[super.field6205];
            }
            return var5.method1779(arg1, super.field6211, super.field6199, super.field6197, 79, arg0, var7, this.field6682, 22, var6, arg3, (class282) null);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6708[22] + (arg0 != null ? field6708[4] : field6708[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Z", line = 364)
    public final boolean method1098(boolean arg0) {
        try {
            ++field6697;
            if (arg0) {
                return false;
            } else {
                return this.field6698 == null ? false : this.field6698.method307();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V", line = 380)
    public final void method628(int arg0) {
        try {
            ++field6703;
            if (arg0 != -38) {
                this.method1081(-81, (class66) null);
            }
            this.field6707 = false;
            if (this.field6698 != null) {
                this.field6698.method347(-65537 & this.field6698.method330());
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6708[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ldf;IZIIILha;)V", line = 395)
    public final void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            if (arg0 instanceof class459) {
                class459 var8 = (class459) arg0;
                if (this.field6698 != null && var8.field6698 != null) {
                    this.field6698.method300(var8.field6698, arg3, arg4, arg1, arg2);
                }
            }
            if (arg5 != 0) {
                this.method1095(2);
            }
            ++field6702;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field6708[11] + (arg0 != null ? field6708[4] : field6708[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6708[4] : field6708[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3501(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3502(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
