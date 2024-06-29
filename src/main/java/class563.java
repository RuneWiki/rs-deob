import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class563 extends class571 implements class675 {

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "B")
    private byte field8223;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "Z")
    private boolean field8232;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "B")
    private byte field8215;

    @OriginalMember(owner = "client!nl", name = "db", descriptor = "Z")
    private boolean field8220;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "Z")
    private boolean field8214;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "S")
    private short field8213;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "Z")
    private boolean field8224;

    @OriginalMember(owner = "client!nl", name = "kb", descriptor = "Lka;")
    public class761 field8235;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "Lr;")
    private class412 field8240;

    @OriginalMember(owner = "client!nl", name = "mb", descriptor = "[Ljava/lang/String;")
    private static final String[] field8243 = new String[] { method4216(method4215("w^y\u0019e")), method4216(method4215("w^y\u000b\f1")), method4216(method4215("wG;#")), method4216(method4215("w^y\u001fe")), method4216(method4215("b\u001cya0")), method4216(method4215("w^y\u000ee")), method4216(method4215("w^y\te")), method4216(method4215("w^y\u0000e")), method4216(method4215("w^y\ne")), method4216(method4215("w^y\fe")), method4216(method4215("w^y\u000be")), method4216(method4215("w^y\be")), method4216(method4215("w^y\u001ee")), method4216(method4215("w^ys$w[#qe")), method4216(method4215("w^y\u0004e")), method4216(method4215("w^y\u001be")), method4216(method4215("w^y\u0007e")), method4216(method4215("w^y\f\f1")), method4216(method4215("w^y\u0002e")), method4216(method4215("w^y\u0005e")), method4216(method4215("w^y\u0001e")), method4216(method4215("w^y\u0006e")), method4216(method4215("w^y\r\f1")), method4216(method4215("w^y\re")) };

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!nl", name = "bb", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!nl", name = "eb", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!nl", name = "jb", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!nl", name = "ib", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!nl", name = "hb", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!nl", name = "cb", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!nl", name = "lb", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!nl", name = "gb", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "Lsba;")
    private class311 field8221;

    @OriginalMember(owner = "client!nl", name = "fb", descriptor = "[Lrfa;")
    public static class202[] field8239;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field8230;
            if (this.field8235 == null) {
                return null;
            } else if (arg0) {
                return null;
            } else {
                class104 var3 = arg1.method136();
                var3.method739(super.field2969, super.field2975, super.field2984);
                class297 var4 = class674.method4839(this.field8214, 1, 12853);
                if (!class149.field1902) {
                    this.field8235.method415(var3, var4.field4153[0], 0);
                } else {
                    this.field8235.method427(var3, var4.field4153[0], class194.field2686, 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8243[9] + arg0 + ',' + (arg1 != null ? field8243[4] : field8243[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(B)V")
    public static void method4211(byte arg0) {
        try {
            field8239 = null;
            if (arg0 <= 114) {
                field8239 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8243[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLha;I)Lka;")
    private final class761 method4212(byte arg0, class18 arg1, int arg2) {
        try {
            int var4 = -57 % ((arg0 - 23) / 43);
            ++field8217;
            if (this.field8235 != null && ~arg1.method226(this.field8235.method395(), arg2) == -1) {
                return this.field8235;
            } else {
                class795 var5 = this.method4213(arg1, -122, false, arg2);
                return var5 != null ? var5.field11559 : null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8243[16] + arg0 + ',' + (arg1 != null ? field8243[4] : field8243[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            if (arg0) {
                return false;
            } else {
                ++field8236;
                if (this.field8235 == null) {
                    return true;
                } else {
                    return !this.field8235.method396();
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLha;)V")
    public final void method589(boolean arg0, class18 arg1) {
        try {
            ++field8241;
            if (arg0) {
                this.field8221 = null;
            }
            Object var3 = null;
            class412 var4;
            if (this.field8240 == null && this.field8224) {
                class795 var5 = this.method4213(arg1, -119, true, 262144);
                var4 = var5 != null ? var5.field11564 : null;
            } else {
                var4 = this.field8240;
                this.field8240 = null;
            }
            if (var4 != null) {
                class164.method1396(var4, super.field2971, super.field2969, super.field2984, (boolean[]) null);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8243[20] + arg0 + ',' + (arg1 != null ? field8243[4] : field8243[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            ++field8228;
            if (arg0 != 114) {
                this.field8223 = 31;
            }
            return this.field8235 == null ? 0 : this.field8235.method423();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.field8220 = true;
            }
            ++field8231;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8243[15] + (arg0 != null ? field8243[4] : field8243[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V")
    public final void method44(byte arg0) {
        try {
            this.field8220 = false;
            ++field8216;
            if (this.field8235 != null) {
                this.field8235.method411(this.field8235.method395() & -65537);
            }
            if (arg0 <= 111) {
                this.field8235 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            ++field8237;
            if (arg0) {
                this.method578((byte) -102);
            }
            return this.field8235 != null ? this.field8235.method422() : false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)I")
    public final int method584(boolean arg0) {
        try {
            ++field8212;
            return arg0 ? -31 : this.field8213 & 65535;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;IZI)Lni;")
    private final class795 method4213(class18 arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field8227;
            class789 var5 = class101.field1359.method2832(125, 65535 & this.field8213);
            class751 var6;
            class751 var7;
            if (!this.field8232) {
                var6 = class213.field3124[super.field2971];
                if (~super.field2971 > -4) {
                    var7 = class213.field3124[super.field2971 + 1];
                } else {
                    var7 = null;
                }
            } else {
                var6 = class677.field9474[super.field2971];
                var7 = class213.field3124[0];
            }
            if (arg1 >= -114) {
                this.field8213 = 70;
            }
            return var5.method5692(this.field8215, arg0, arg2, var6, this.field8223, -27447, super.field2969, (class626) null, super.field2975, var7, super.field2984, arg3);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8243[12] + (arg0 != null ? field8243[4] : field8243[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBILrfa;ZILha;)V")
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            int var8 = 55 / ((arg1 - 9) / 35);
            ++field8234;
            if (arg3 instanceof class563) {
                class563 var9 = (class563) arg3;
                if (this.field8235 != null && var9.field8235 != null) {
                    this.field8235.method391(var9.field8235, arg5, arg2, arg0, arg4);
                    return;
                }
            } else {
                if (!(arg3 instanceof class468)) {
                    return;
                }
                class468 var10 = (class468) arg3;
                if (this.field8235 == null || var10.field6830 == null) {
                    return;
                }
                this.field8235.method391(var10.field6830, arg5, arg2, arg0, arg4);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field8243[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8243[4] : field8243[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8243[4] : field8243[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
    public final int method572(int arg0) {
        try {
            if (arg0 < 70) {
                this.method572(-128);
            }
            ++field8225;
            return this.field8215;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != -1) {
                return true;
            } else {
                ++field8222;
                class761 var5 = this.method4212((byte) 122, arg0, 131072);
                if (var5 != null) {
                    class104 var6 = arg0.method136();
                    var6.method739(super.field2969, super.field2975, super.field2984);
                    return class149.field1902 ? var5.method440(arg3, arg1, var6, false, 0, class194.field2686) : var5.method382(arg3, arg1, var6, false, 0);
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8243[5] + (arg0 != null ? field8243[4] : field8243[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Ljea;")
    public static final class6 method4214(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class6 var4 = var3.field8848;
            var3.field8848 = null;
            class478.method3703(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I")
    public final int method585(int arg0) {
        try {
            if (arg0 != -20175) {
                return 39;
            } else {
                ++field8238;
                return this.field8223;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZIIZ)V")
    public class563(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class513.method3916((byte) 127, arg9, arg8));
        try {
            this.field8223 = (byte) arg9;
            this.field8232 = arg7;
            super.field2969 = arg4;
            this.field8215 = (byte) arg8;
            super.field2984 = arg6;
            this.field8220 = arg10;
            this.field8214 = ~arg1.field11409 != -1 && !arg7;
            this.field8213 = (short) arg1.field11478;
            this.field8224 = arg0.method158() && arg1.field11415 && !this.field8232 && ~class451.field6612.field9113.method1072(3) != -1;
            int var12 = 2048;
            if (this.field8220) {
                var12 |= 65536;
            }
            class795 var13 = this.method4213(arg0, -125, this.field8224, var12);
            if (var13 != null) {
                this.field8235 = var13.field11559;
                this.field8240 = var13.field11564;
                if (this.field8220) {
                    this.field8235 = this.field8235.method418((byte) 0, var12, false);
                    return;
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field8243[13] + (arg0 != null ? field8243[4] : field8243[2]) + ',' + (arg1 != null ? field8243[4] : field8243[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            if (arg0) {
                return -49;
            } else {
                ++field8226;
                return this.field8235 != null ? this.field8235.method432() : 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)Z")
    public final boolean method46(int arg0) {
        try {
            if (arg0 >= -97) {
                return false;
            } else {
                ++field8219;
                return this.field8220;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V")
    public final void method576(boolean arg0) {
        try {
            if (this.field8235 != null) {
                this.field8235.method403();
            }
            ++field8229;
            if (!arg0) {
                this.method579(false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            if (this.field8221 == null) {
                this.field8221 = class640.method4679(super.field2969, super.field2984, super.field2975, this.method4212((byte) -111, arg0, 0), 10327);
            }
            ++field8211;
            if (arg1 <= 94) {
                this.method585(126);
            }
            return this.field8221;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8243[3] + (arg0 != null ? field8243[4] : field8243[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        try {
            ++field8218;
            if (arg0 <= 96) {
                this.field8215 = -36;
            }
            return this.field8224;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8243[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILha;)V")
    public final void method581(int arg0, class18 arg1) {
        try {
            ++field8233;
            Object var3 = null;
            class412 var5;
            if (this.field8240 == null && this.field8224) {
                class795 var4 = this.method4213(arg1, arg0 ^ 18909, true, 262144);
                var5 = var4 != null ? var4.field11564 : null;
            } else {
                var5 = this.field8240;
                this.field8240 = null;
            }
            if (var5 != null) {
                class779.method5602(var5, super.field2971, super.field2969, super.field2984, (boolean[]) null);
            }
            if (arg0 != -18864) {
                this.field8232 = false;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8243[8] + arg0 + ',' + (arg1 != null ? field8243[4] : field8243[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4215(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4216(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
