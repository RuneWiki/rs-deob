import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class513 implements class3 {

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Z")
    private boolean field57;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Z")
    private boolean field46;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "S")
    private short field56;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
    private boolean field52;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "B")
    private byte field66;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "Z")
    private boolean field58;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lka;")
    private class499 field53;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lr;")
    private class192 field71;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "[Ljava/lang/String;")
    private static final String[] field73 = new String[] { method57(method56("A\rK+r")), method57(method56("TV\ti")), method57(method56("SFKB'")), method57(method56("SFKR'")), method57(method56("SFKNN\u0012")), method57(method56("SFKAN\u0012")), method57(method56("SFKC'")), method57(method56("SFKQ'")), method57(method56("SFKJ'")), method57(method56("SFKDN\u0012")), method57(method56("SFKK'")), method57(method56("SFKP'")), method57(method56("\u0000\u0003")), method57(method56("SFKFN\u0012")), method57(method56("SFKU'")), method57(method56("SFKV'")), method57(method56("SFK@N\u0012")), method57(method56("SFKI'")), method57(method56("SFKL'")), method57(method56("SFK9fTJ\u0011;'")), method57(method56("SFKS'")), method57(method56("SFKT'")), method57(method56("SFKM'")), method57(method56("SFKW'")), method57(method56("SFKN'")), method57(method56("SFKO'")), method57(method56("SFKGN\u0012")) };

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lps;")
    public static class101 field55;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lrga;")
    private class250 field70;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLha;)V", line = 12)
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field59;
            if (arg0 != -108) {
                field47 = -116;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field73[26] + arg0 + ',' + (arg1 != null ? field73[0] : field73[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)I", line = 22)
    public final int method32(byte arg0) {
        try {
            if (arg0 != -95) {
                this.field53 = null;
            }
            ++field62;
            return 65535 & this.field56;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)Z", line = 34)
    public final boolean method41(byte arg0) {
        try {
            if (arg0 < 54) {
                this.field53 = null;
            }
            ++field49;
            if (this.field53 != null) {
                return !this.field53.method409();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lha;I)V", line = 49)
    public final void method29(class63 arg0, int arg1) {
        try {
            ++field43;
            int var3 = 85 / ((arg1 - 22) / 60);
            Object var4 = null;
            class192 var6;
            if (this.field71 == null && this.field58) {
                class379 var5 = this.method51(0, true, arg0, 262144);
                var6 = var5 == null ? null : var5.field6115;
            } else {
                var6 = this.field71;
                this.field71 = null;
            }
            if (var6 != null) {
                class28.method283(var6, super.field9974, super.field9985, super.field9983, (boolean[]) null);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field73[22] + (arg0 != null ? field73[0] : field73[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 82)
    public static final void method42(boolean arg0, String arg1) {
        try {
            if (class585.field8479 == null) {
                class486.method3693(true);
            }
            if (!arg0) {
                field47 = 28;
            }
            ++field69;
            class640.field9166.setTime(new Date(class712.method5167(-2334)));
            int var2 = class640.field9166.get(11);
            int var3 = class640.field9166.get(12);
            int var4 = class640.field9166.get(13);
            String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
            String[] var6 = class444.method3476('\n', 11206, arg1);
            for (int var7 = 0; var6.length > var7; ++var7) {
                for (int var8 = class455.field7020; ~var8 < -1; --var8) {
                    class585.field8479[var8] = class585.field8479[var8 + -1];
                }
                class585.field8479[0] = var5 + field73[12] + var6[var7];
                if (class536.field7868 != null) {
                    try {
                        class536.field7868.write(client.method2707(0, class585.field8479[0] + "\n"));
                    } catch (IOException var10) {
                    }
                }
                if (class585.field8479.length - 1 > class455.field7020) {
                    if (~class582.field8381 < -1) {
                        ++class582.field8381;
                    }
                    ++class455.field7020;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field73[11] + arg0 + ',' + (arg1 != null ? field73[0] : field73[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z", line = 144)
    public final boolean method33(byte arg0) {
        try {
            if (arg0 != -12) {
                method49(71, 119, 2, 14, -97);
            }
            ++field51;
            return this.field58;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I", line = 155)
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                this.method34(-51);
            }
            ++field65;
            return this.field53 != null ? this.field53.method438() : 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V", line = 173)
    public static void method44(int arg0) {
        try {
            if (arg0 < -112) {
                field55 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field73[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Z", line = 183)
    public final boolean method45(int arg0) {
        try {
            if (arg0 != -32768) {
                this.field70 = null;
            }
            ++field61;
            return this.field53 != null ? this.field53.method407() : false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILha;)Z", line = 204)
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field40;
            class499 var5 = this.method55(arg0 ^ 150536, arg3, arg0);
            if (var5 != null) {
                class486 var6 = arg3.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                return class200.field3163 ? var5.method429(arg2, arg1, var6, false, 0, class547.field8042) : var5.method425(arg2, arg1, var6, false, 0);
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field73[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field73[0] : field73[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILha;)V", line = 222)
    public final void method31(int arg0, class63 arg1) {
        try {
            ++field64;
            if (arg0 != -27998) {
                this.field58 = true;
            }
            Object var3 = null;
            class192 var4;
            if (this.field71 == null && this.field58) {
                class379 var5 = this.method51(0, true, arg1, 262144);
                var4 = var5 == null ? null : var5.field6115;
            } else {
                var4 = this.field71;
                this.field71 = null;
            }
            if (var4 != null) {
                class681.method4962(var4, super.field9974, super.field9985, super.field9983, (boolean[]) null);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field73[2] + arg0 + ',' + (arg1 != null ? field73[0] : field73[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lha;B)Lrga;", line = 252)
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            if (this.field70 == null) {
                this.field70 = class198.method1814(this.method55(arg1 ^ -19582, arg0, 0), 34069, super.field9985, super.field9983, super.field9972);
            }
            ++field48;
            return arg1 != -118 ? null : this.field70;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field73[5] + (arg0 != null ? field73[0] : field73[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZILha;ILrda;II)V", line = 267)
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            ++field42;
            if (arg5 <= -10) {
                if (arg4 instanceof class6) {
                    class6 var8 = (class6) arg4;
                    if (this.field53 != null && var8.field53 != null) {
                        this.field53.method412(var8.field53, arg6, arg1, arg3, arg0);
                        return;
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field73[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field73[0] : field73[1]) + ',' + arg3 + ',' + (arg4 != null ? field73[0] : field73[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V", line = 287)
    public static final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg0 != 3) {
                field47 = 22;
            }
            class546.field8030 = arg1;
            class310.field5088 = arg2;
            class779.field11374 = arg4;
            ++field50;
            class478.field7264 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field73[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 302)
    public final void method50(byte arg0) {
        try {
            ++field54;
            this.field57 = false;
            if (arg0 < -41) {
                if (this.field53 != null) {
                    this.field53.method411(this.field53.method433() & -65537);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZLha;I)Lvh;", line = 318)
    private final class379 method51(int arg0, boolean arg1, class63 arg2, int arg3) {
        try {
            ++field45;
            if (arg0 != 0) {
                return null;
            } else {
                class362 var5 = class370.field5999.method4002(115, 65535 & this.field56);
                class293 var6;
                class293 var7;
                if (!this.field52) {
                    if (super.field9974 < 3) {
                        var6 = class493.field7420[super.field9974 + 1];
                    } else {
                        var6 = null;
                    }
                    var7 = class493.field7420[super.field9974];
                } else {
                    var7 = class757.field11125[super.field9974];
                    var6 = class493.field7420[0];
                }
                return var5.method3003((byte) 88, (class729) null, 22, super.field9983, arg2, this.field66, var6, var7, super.field9985, arg1, arg3, super.field9972);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field73[23] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field73[0] : field73[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)I", line = 349)
    public final int method35(byte arg0) {
        try {
            ++field72;
            if (arg0 != -55) {
                this.field53 = null;
            }
            return this.field66;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lha;Ltk;IIIIIZIZ)V", line = 360)
    public class6(class63 arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5924);
        try {
            this.field57 = arg9;
            this.field46 = ~arg1.field5843 != -1 && !arg7;
            this.field56 = (short) arg1.field5855;
            super.field9983 = arg6;
            super.field9985 = arg4;
            this.field52 = arg7;
            this.field66 = (byte) arg8;
            this.field58 = arg0.method158() && arg1.field5875 && !this.field52 && class623.field8996.field6381.method2920(true) != 0;
            int var11 = 2048;
            if (this.field57) {
                var11 |= 65536;
            }
            class379 var12 = this.method51(0, this.field58, arg0, var11);
            if (var12 != null) {
                this.field53 = var12.field6116;
                this.field71 = var12.field6115;
                if (this.field57) {
                    this.field53 = this.field53.method394((byte) 0, var11, false);
                    return;
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field73[19] + (arg0 != null ? field73[0] : field73[1]) + ',' + (arg1 != null ? field73[0] : field73[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lha;B)Lkv;", line = 393)
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field41;
            if (this.field53 == null) {
                return null;
            } else if (arg1 != 122) {
                return null;
            } else {
                class486 var3 = arg0.method251();
                var3.method2465(super.field9985, super.field9972, super.field9983);
                class281 var4 = class349.method2910(this.field46, 1, (byte) -118);
                if (!class200.field3163) {
                    this.field53.method426(var3, var4.field4578[0], 0);
                } else {
                    this.field53.method423(var3, var4.field4578[0], class547.field8042, 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field73[16] + (arg0 != null ? field73[0] : field73[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I", line = 421)
    public final int method34(int arg0) {
        try {
            ++field63;
            if (arg0 != 16388) {
                this.field56 = 57;
            }
            return 22;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z", line = 433)
    public final boolean method53(int arg0) {
        try {
            if (arg0 != 47) {
                this.field66 = -35;
            }
            ++field60;
            return this.field57;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)I", line = 444)
    public final int method54(byte arg0) {
        try {
            ++field44;
            if (arg0 >= -112) {
                this.field53 = null;
            }
            return this.field53 == null ? 0 : this.field53.method390();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 456)
    public final void method30(int arg0) {
        try {
            if (arg0 != 20235) {
                this.method32((byte) -13);
            }
            if (this.field53 != null) {
                this.field53.method428();
            }
            ++field67;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field73[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILha;I)Lka;", line = 471)
    private final class499 method55(int arg0, class63 arg1, int arg2) {
        try {
            ++field68;
            if (this.field53 != null && ~arg1.method151(this.field53.method433(), arg2) == -1) {
                return this.field53;
            } else {
                if (arg0 != 19464) {
                    this.method43(-127);
                }
                class379 var4 = this.method51(0, false, arg1, arg2);
                return var4 != null ? var4.field6116 : null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field73[4] + arg0 + ',' + (arg1 != null ? field73[0] : field73[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method56(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method57(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
