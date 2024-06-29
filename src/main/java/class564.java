import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class564 extends class197 implements class394 {

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "B")
    private byte field8237;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Z")
    private boolean field8223;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "B")
    private byte field8232;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "Z")
    private boolean field8252;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Z")
    private boolean field8227;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "S")
    private short field8233;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Z")
    private boolean field8228;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "Lda;")
    public class397 field8235;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Lha;")
    private class427 field8251;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Leda;")
    public static class116 field8230 = new class116(64, 16);

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Ljda;")
    public static class77 field8234 = new class77("", 15);

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "Ldc;")
    public static class303 field8253 = new class303(4, 1, 1, 1);

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "[I")
    public static int[] field8255 = new int[1000];

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    public static int field8258 = 0;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public static int field8256 = 0;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Leh;")
    private class203 field8245;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lf;")
    public static class257 field8257;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "Lme;")
    public static class664 field8259;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I", line = 3)
    public final int method907(boolean arg0) {
        ++field8247;
        if (arg0) {
            this.method912(32, (class98) null);
        }
        return this.field8237;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILr;B)Z", line = 14)
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field8226;
        class397 var5 = this.method3301(arg2, 131072, false);
        if (var5 != null) {
            class152 var6 = arg2.method777();
            var6.method166(super.field3155, super.field3160, super.field3154);
            return !class372.field5162 ? var5.method469(arg0, arg1, var6, false) : var5.method482(arg0, arg1, var6, false, class450.field6494);
        } else {
            int var7 = 65 / ((arg3 - -75) / 40);
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lvj;IZLr;IIB)V", line = 38)
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 < 22) {
            this.field8228 = false;
        }
        ++field8222;
        if (!(arg0 instanceof class564)) {
            if (arg0 instanceof class332) {
                class332 var8 = (class332) arg0;
                if (this.field8235 != null && var8.field4588 != null) {
                    this.field8235.method466(var8.field4588, arg1, arg4, arg5, arg2);
                    return;
                }
            }
        } else {
            class564 var9 = (class564) arg0;
            if (this.field8235 == null || var9.field8235 == null) {
                return;
            }
            this.field8235.method466(var9.field8235, arg1, arg4, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I", line = 71)
    public final int method904(int arg0) {
        ++field8225;
        return arg0 != -15140 ? 32 : this.field8232;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I", line = 84)
    public final int method634(byte arg0) {
        ++field8236;
        if (arg0 > -102) {
            return -9;
        } else {
            return this.field8235 == null ? 0 : this.field8235.method434();
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)Z", line = 96)
    public final boolean method592(int arg0) {
        if (arg0 != -15258) {
            field8258 = -123;
        }
        ++field8224;
        return this.field8223;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 107)
    public final void method902(int arg0) {
        if (this.field8235 != null) {
            this.field8235.method444();
        }
        ++field8238;
        if (arg0 != 27906) {
            field8257 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Z", line = 123)
    public final boolean method908(boolean arg0) {
        ++field8250;
        if (arg0) {
            this.method632(-61, -85, (class98) null, (byte) -36);
        }
        return this.field8228;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)Z", line = 135)
    public final boolean method633(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field8260;
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)Z", line = 151)
    public final boolean method630(int arg0) {
        int var2 = -5 / ((arg0 - -59) / 44);
        ++field8261;
        return this.field8235 == null ? false : this.field8235.method449();
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILr;)Leh;", line = 166)
    public final class203 method631(int arg0, class98 arg1) {
        if (arg0 != 1) {
            this.method907(false);
        }
        if (this.field8245 == null) {
            this.field8245 = class420.method2486(super.field3155, super.field3160, super.field3154, this.method3301(arg1, 0, false), arg0 ^ 22673);
        }
        ++field8242;
        return this.field8245;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(ILr;)V", line = 186)
    public final void method625(int arg0, class98 arg1) {
        ++field8243;
        if (arg0 < 67) {
            this.method907(true);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lr;B)V", line = 198)
    public final void method911(class98 arg0, byte arg1) {
        ++field8248;
        Object var3 = null;
        if (arg1 != 31) {
            field8256 = -51;
        }
        class427 var5;
        if (this.field8251 == null && this.field8228) {
            class75 var4 = this.method3299(arg0, -2206, 262144, true);
            var5 = var4 == null ? null : var4.field1178;
        } else {
            var5 = this.field8251;
            this.field8251 = null;
        }
        if (var5 != null) {
            class123.method986(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lr;IIZ)Lfj;", line = 228)
    private final class75 method3299(class98 arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != -2206) {
            return null;
        } else {
            ++field8249;
            class119 var5 = class14.field224.method2834(0, 65535 & this.field8233);
            class682 var6;
            class682 var7;
            if (this.field8227) {
                var6 = class340.field4723[super.field3163];
                var7 = class621.field8841[0];
            } else {
                if (super.field3163 >= 3) {
                    var7 = null;
                } else {
                    var7 = class621.field8841[super.field3163 + 1];
                }
                var6 = class621.field8841[super.field3163];
            }
            return var5.method960(arg1 + 2327, var7, super.field3160, this.field8232, arg0, this.field8237, super.field3155, var6, arg2, arg3, super.field3154);
        }
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)I", line = 261)
    public final int method626(int arg0) {
        ++field8231;
        if (arg0 != -32768) {
            this.method625(58, (class98) null);
        }
        return this.field8235 == null ? 0 : this.field8235.method478();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJ)V", line = 278)
    public static final void method3300(byte arg0, long arg1) {
        ++field8244;
        int var3 = 93 / ((44 - arg0) / 49);
        if (~arg1 < -1L) {
            if (~(arg1 % 10L) == -1L) {
                class269.method1693(arg1 + -1L, (byte) -35);
                class269.method1693(1L, (byte) -35);
            } else {
                class269.method1693(arg1, (byte) -35);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lr;IZ)Lda;", line = 298)
    private final class397 method3301(class98 arg0, int arg1, boolean arg2) {
        ++field8254;
        if (this.field8235 != null && ~arg0.method754(this.field8235.method468(), arg1) == -1) {
            return this.field8235;
        } else {
            class75 var4 = this.method3299(arg0, -2206, arg1, arg2);
            return var4 == null ? null : var4.field1179;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z", line = 316)
    public static final boolean method3302(int arg0, int arg1, int arg2) {
        int var3 = -63 % ((21 - arg2) / 42);
        ++field8239;
        return (arg0 & 65536) != 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lr;I)Lej;", line = 329)
    public final class690 method627(class98 arg0, int arg1) {
        ++field8229;
        if (this.field8235 == null) {
            return null;
        } else {
            class152 var3 = arg0.method777();
            var3.method166(super.field3155, super.field3160, super.field3154);
            if (arg1 != -7927) {
                this.field8232 = -6;
            }
            class690 var4 = null;
            if (this.field8252) {
                var4 = class101.method849(-14, 1);
            }
            if (class372.field5162) {
                this.field8235.method448(var3, var4 != null ? var4.field9788[0] : null, class450.field6494, 0);
            } else {
                this.field8235.method460(var3, var4 != null ? var4.field9788[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILr;)V", line = 359)
    public final void method912(int arg0, class98 arg1) {
        ++field8246;
        if (arg0 == 20280) {
            Object var3 = null;
            class427 var5;
            if (this.field8251 == null && this.field8228) {
                class75 var4 = this.method3299(arg1, -2206, 262144, true);
                var5 = var4 == null ? null : var4.field1178;
            } else {
                var5 = this.field8251;
                this.field8251 = null;
            }
            if (var5 != null) {
                class68.method564(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I", line = 387)
    public final int method903(int arg0) {
        if (arg0 < 76) {
            this.field8235 = null;
        }
        ++field8241;
        return 65535 & this.field8233;
    }

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "(I)V", line = 398)
    public static void method3303(int arg0) {
        field8255 = null;
        field8234 = null;
        field8253 = null;
        field8257 = null;
        field8230 = null;
        field8259 = null;
        if (arg0 != 262144) {
            method3304((class204) null, (class289[]) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lvj;[Lam;)V", line = 414)
    public static final void method3304(class204 arg0, class289[] arg1) {
        if (class112.field1802) {
            int var2 = arg0.method591(-1, arg1);
            class490.field7029.method823(var2, arg1);
        }
        if (class687.field9745 == class340.field4723) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class144) {
                var5 = ((class144) arg0).field2481;
                var6 = ((class144) arg0).field2484;
            } else {
                var5 = arg0.field3155 >> class49.field637;
                var6 = arg0.field3154 >> class49.field637;
            }
            class490.field7029.method809(class621.field8841[0].method3861((byte) -5, arg0.field3155, arg0.field3154), class152.method1154(var5, var6), class62.method517(var5, var6), class626.method3531(var5, var6));
        }
        class690 var7 = arg0.method627(class490.field7029, -7927);
        if (var7 != null) {
            var7.field9786 = arg0;
            if (class215.field3244) {
                class565 var8 = class221.field3305;
                synchronized (class221.field3305) {
                    boolean var9 = false;
                    for (class690 var10 = (class690) class221.field3305.method3313((byte) 64); var10 != null; var10 = (class690) class221.field3305.method3308(-100)) {
                        if (arg0.field3164 >= var10.field9786.field3164) {
                            class695.method3917(var7, var10, true);
                            var9 = true;
                            break;
                        }
                    }
                    if (!var9) {
                        class221.field3305.method3307(0, var7);
                    }
                    return;
                }
            }
            boolean var11 = false;
            for (class690 var12 = (class690) class221.field3305.method3313((byte) 92); var12 != null; var12 = (class690) class221.field3305.method3308(-95)) {
                if (arg0.field3164 >= var12.field9786.field3164) {
                    class695.method3917(var7, var12, true);
                    var11 = true;
                    break;
                }
            }
            if (!var11) {
                class221.field3305.method3307(0, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V", line = 502)
    public final void method585(int arg0) {
        if (arg0 == 96) {
            this.field8223 = false;
            ++field8240;
            if (this.field8235 != null) {
                this.field8235.method438(-65537 & this.field8235.method468());
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIIZ)V", line = 517)
    public class564(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class229.method1497(arg8, arg9, (byte) 42));
        super.field3155 = arg4;
        this.field8237 = (byte) arg8;
        this.field8223 = arg10;
        this.field8232 = (byte) arg9;
        this.field8252 = arg1.field1903 != 0 && !arg7;
        super.field3154 = arg6;
        this.field8227 = arg7;
        this.field8233 = (short) arg1.field1953;
        this.field8228 = arg0.method742() && arg1.field1964 && !this.field8227 && ~class525.field7713.method2484(class76.field1182, false) != -1;
        int var12 = 2048;
        if (this.field8223) {
            var12 |= 65536;
        }
        class75 var13 = this.method3299(arg0, -2206, var12, this.field8228);
        if (var13 != null) {
            this.field8235 = var13.field1179;
            this.field8251 = var13.field1178;
            if (this.field8223) {
                this.field8235 = this.field8235.method475((byte) 0, var12, false);
                return;
            }
        }
    }
}
