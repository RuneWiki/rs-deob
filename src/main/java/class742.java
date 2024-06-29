import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class742 extends class343 implements class583 {

    @OriginalMember(owner = "client!nea", name = "S", descriptor = "B")
    private byte field10799;

    @OriginalMember(owner = "client!nea", name = "hb", descriptor = "Z")
    private boolean field10797;

    @OriginalMember(owner = "client!nea", name = "P", descriptor = "Z")
    private boolean field10795;

    @OriginalMember(owner = "client!nea", name = "Q", descriptor = "S")
    private short field10773;

    @OriginalMember(owner = "client!nea", name = "nb", descriptor = "Z")
    private boolean field10779;

    @OriginalMember(owner = "client!nea", name = "tb", descriptor = "B")
    private byte field10782;

    @OriginalMember(owner = "client!nea", name = "ub", descriptor = "Z")
    private boolean field10805;

    @OriginalMember(owner = "client!nea", name = "R", descriptor = "Lka;")
    public class497 field10803;

    @OriginalMember(owner = "client!nea", name = "cb", descriptor = "Lr;")
    private class194 field10798;

    @OriginalMember(owner = "client!nea", name = "vb", descriptor = "[Ljava/lang/String;")
    private static final String[] field10806 = new String[] { method5413(method5412("\u0014@?4\u0015R")), method5413(method5412("\u0014P2v")), method5413(method5412("\u0001\u000bp4<")), method5413(method5412("\u0014@?4\u0006R")), method5413(method5412("\u0014@?4\u0005R")), method5413(method5412("\u0014@?4\u0016R")), method5413(method5412("\u0014@?4\u0003;\r")), method5413(method5412("\u0014@?4\u0002;\r")), method5413(method5412("\u0014@?4\u0004R")), method5413(method5412("\u0014@?4\u000eR")), method5413(method5412("\u0014@?4\nR")), method5413(method5412("\u0014@?4\tR")), method5413(method5412("\u0014@?4\u0017R")), method5413(method5412("\u0014@?4\bR")), method5413(method5412("\u0014@?4\u0010R")), method5413(method5412("\u0014@?4\u0000;\r")), method5413(method5412("\u0014@?4\rR")), method5413(method5412("\u0014@?4\u000bR")), method5413(method5412("\u0014@?4\u0012R")), method5413(method5412("\u0014@?4}\u0013K7n\u007fR")), method5413(method5412("\u0014@?4\u0011R")), method5413(method5412("\u0014@?4\u0014R")), method5413(method5412("\u0014@?4\fR")), method5413(method5412("\u0014@?4\u0007R")), method5413(method5412("\u0014@?4\u000fR")) };

    @OriginalMember(owner = "client!nea", name = "T", descriptor = "I")
    public static volatile int field10801 = -1;

    @OriginalMember(owner = "client!nea", name = "ab", descriptor = "Lum;")
    public static class550 field10794 = new class550("", 17);

    @OriginalMember(owner = "client!nea", name = "O", descriptor = "I")
    public static int field10774;

    @OriginalMember(owner = "client!nea", name = "bb", descriptor = "I")
    public static int field10775;

    @OriginalMember(owner = "client!nea", name = "U", descriptor = "I")
    public static int field10776;

    @OriginalMember(owner = "client!nea", name = "mb", descriptor = "I")
    public static int field10777;

    @OriginalMember(owner = "client!nea", name = "lb", descriptor = "I")
    public static int field10778;

    @OriginalMember(owner = "client!nea", name = "pb", descriptor = "I")
    public static int field10781;

    @OriginalMember(owner = "client!nea", name = "jb", descriptor = "I")
    public static int field10783;

    @OriginalMember(owner = "client!nea", name = "ib", descriptor = "I")
    public static int field10784;

    @OriginalMember(owner = "client!nea", name = "fb", descriptor = "I")
    public static int field10785;

    @OriginalMember(owner = "client!nea", name = "gb", descriptor = "I")
    public static int field10786;

    @OriginalMember(owner = "client!nea", name = "qb", descriptor = "I")
    public static int field10787;

    @OriginalMember(owner = "client!nea", name = "ob", descriptor = "I")
    public static int field10788;

    @OriginalMember(owner = "client!nea", name = "eb", descriptor = "I")
    public static int field10789;

    @OriginalMember(owner = "client!nea", name = "X", descriptor = "I")
    public static int field10790;

    @OriginalMember(owner = "client!nea", name = "Y", descriptor = "I")
    public static int field10791;

    @OriginalMember(owner = "client!nea", name = "kb", descriptor = "I")
    public static int field10792;

    @OriginalMember(owner = "client!nea", name = "sb", descriptor = "I")
    public static int field10793;

    @OriginalMember(owner = "client!nea", name = "V", descriptor = "I")
    public static int field10796;

    @OriginalMember(owner = "client!nea", name = "rb", descriptor = "I")
    public static int field10800;

    @OriginalMember(owner = "client!nea", name = "Z", descriptor = "I")
    public static int field10802;

    @OriginalMember(owner = "client!nea", name = "db", descriptor = "I")
    public static int field10804;

    @OriginalMember(owner = "client!nea", name = "W", descriptor = "Lcca;")
    private class260 field10780;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lha;I)Lcca;")
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            if (arg1 < 65) {
                return null;
            } else {
                ++field10791;
                if (this.field10780 == null) {
                    this.field10780 = class505.method3806(-26, this.method5408(-125, 0, arg0), super.field6199, super.field6197, super.field6211);
                }
                return this.field10780;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10806[13] + (arg0 != null ? field10806[2] : field10806[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(ILha;)V")
    public final void method1090(int arg0, class66 arg1) {
        try {
            ++field10800;
            Object var3 = null;
            int var4 = 125 % ((arg0 - -53) / 61);
            class194 var5;
            if (this.field10798 == null && this.field10805) {
                class433 var6 = this.method5409(262144, true, (byte) 109, arg1);
                var5 = var6 != null ? var6.field6364 : null;
            } else {
                var5 = this.field10798;
                this.field10798 = null;
            }
            if (var5 != null) {
                class670.method4926(var5, super.field6205, super.field6197, super.field6211, (boolean[]) null);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10806[22] + arg0 + ',' + (arg1 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ldf;IZIIILha;)V")
    public final void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            if (!(arg0 instanceof class779)) {
                if (arg0 instanceof class742) {
                    class742 var8 = (class742) arg0;
                    if (this.field10803 != null && var8.field10803 != null) {
                        this.field10803.method300(var8.field10803, arg3, arg4, arg1, arg2);
                    }
                }
            } else {
                class779 var9 = (class779) arg0;
                if (this.field10803 != null && var9.field11323 != null) {
                    this.field10803.method300(var9.field11323, arg3, arg4, arg1, arg2);
                }
            }
            if (arg5 != 0) {
                this.method5408(-109, 101, (class66) null);
            }
            ++field10776;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10806[3] + (arg0 != null ? field10806[2] : field10806[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILha;B)Z")
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            ++field10777;
            class497 var5 = this.method5408(-127, 131072, arg2);
            if (arg3 > -43) {
                return true;
            } else if (var5 != null) {
                class501 var6 = arg2.method511();
                var6.method2389(super.field6197, super.field6199, super.field6211);
                return !class640.field9291 ? var5.method297(arg1, arg0, var6, false, 0) : var5.method314(arg1, arg0, var6, false, 0, class726.field10487);
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10806[20] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10806[2] : field10806[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILha;)Lka;")
    private final class497 method5408(int arg0, int arg1, class66 arg2) {
        try {
            if (arg0 > -121) {
                this.field10797 = false;
            }
            ++field10792;
            if (this.field10803 != null && ~arg2.method509(this.field10803.method330(), arg1) == -1) {
                return this.field10803;
            } else {
                class433 var4 = this.method5409(arg1, false, (byte) 109, arg2);
                return var4 != null ? var4.field6363 : null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10806[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I")
    public final int method1083(byte arg0) {
        try {
            int var2 = 25 / ((53 - arg0) / 51);
            ++field10789;
            return this.field10773 & 65535;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10806[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)I")
    public final int method1087(int arg0) {
        try {
            if (arg0 != 18636) {
                this.method628(113);
            }
            ++field10781;
            return this.field10782;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "(I)I")
    public final int method1093(int arg0) {
        try {
            ++field10784;
            if (arg0 != -3) {
                this.method1097(true);
            }
            return this.field10803 != null ? this.field10803.method327() : 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)I")
    public final int method1097(boolean arg0) {
        try {
            ++field10796;
            if (arg0) {
                this.field10803 = null;
            }
            return this.field10799;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "(I)V")
    public final void method628(int arg0) {
        try {
            this.field10779 = false;
            if (arg0 != -38) {
                field10801 = -12;
            }
            ++field10775;
            if (this.field10803 != null) {
                this.field10803.method347(-65537 & this.field10803.method330());
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
    public final boolean method1095(int arg0) {
        try {
            if (arg0 != -9842) {
                this.method5411(-11);
            }
            ++field10786;
            return this.field10805;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)Z")
    public final boolean method1082(byte arg0) {
        try {
            ++field10778;
            if (arg0 != 27) {
                this.method5409(-123, false, (byte) 48, (class66) null);
            }
            if (this.field10803 != null) {
                return !this.field10803.method321();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)V")
    public final void method1085(int arg0) {
        try {
            if (arg0 != -2939) {
                this.method1091(54, 112, (class66) null, (byte) -28);
            }
            ++field10802;
            if (this.field10803 != null) {
                this.field10803.method322();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILha;)V")
    public final void method1096(int arg0, class66 arg1) {
        try {
            ++field10790;
            Object var3 = null;
            class194 var5;
            if (this.field10798 == null && this.field10805) {
                class433 var4 = this.method5409(262144, true, (byte) 109, arg1);
                var5 = var4 == null ? null : var4.field6364;
            } else {
                var5 = this.field10798;
                this.field10798 = null;
            }
            if (var5 != null) {
                class188.method1632(var5, super.field6205, super.field6197, super.field6211, (boolean[]) null);
            }
            if (arg0 >= -77) {
                this.method1081(58, (class66) null);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10806[7] + arg0 + ',' + (arg1 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(ILha;)V")
    public final void method1081(int arg0, class66 arg1) {
        try {
            if (arg0 != 0) {
                this.method1091(-14, -47, (class66) null, (byte) -63);
            }
            ++field10788;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10806[5] + arg0 + ',' + (arg1 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "(I)I")
    public final int method1088(int arg0) {
        try {
            if (arg0 != -2226) {
                return 46;
            } else {
                ++field10774;
                return this.field10803 != null ? this.field10803.method305() : 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(Z)Z")
    public final boolean method1098(boolean arg0) {
        try {
            if (arg0) {
                this.method1083((byte) -41);
            }
            ++field10787;
            return this.field10803 != null ? this.field10803.method307() : false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "(B)Z")
    public final boolean method625(byte arg0) {
        try {
            ++field10804;
            if (arg0 != 94) {
                method5410((byte) -116);
            }
            return this.field10779;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lha;Lc;IIIIIZIIIIIIZ)V")
    public class742(class66 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3006 == 1, class283.method2318(arg12, arg13, 16383));
        try {
            this.field10799 = (byte) arg13;
            this.field10797 = arg7;
            this.field10795 = arg1.field3082 != 0 && !arg7;
            super.field6205 = (byte) arg3;
            this.field10773 = (short) arg1.field3014;
            this.field10779 = arg14;
            this.field10782 = (byte) arg12;
            this.field10805 = arg0.method559() && arg1.field3036 && !this.field10797 && class289.field4305.field810.method112(false) != 0;
            int var16 = 2048;
            if (this.field10779) {
                var16 |= 65536;
            }
            class433 var17 = this.method5409(var16, this.field10805, (byte) 109, arg0);
            if (var17 != null) {
                this.field10803 = var17.field6363;
                this.field10798 = var17.field6364;
                if (this.field10779) {
                    this.field10803 = this.field10803.method332((byte) 0, var16, false);
                    return;
                }
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field10806[19] + (arg0 != null ? field10806[2] : field10806[1]) + ',' + (arg1 != null ? field10806[2] : field10806[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZBLha;)Llg;")
    private final class433 method5409(int arg0, boolean arg1, byte arg2, class66 arg3) {
        try {
            ++field10785;
            if (arg2 != 109) {
                this.method1088(65);
            }
            class198 var5 = class417.field6144.method3030(0, 65535 & this.field10773);
            class294 var6;
            class294 var7;
            if (!this.field10797) {
                var6 = class184.field2541[super.field6205];
                if (super.field6205 < 3) {
                    var7 = class184.field2541[super.field6205 - -1];
                } else {
                    var7 = null;
                }
            } else {
                var6 = class195.field2617[super.field6205];
                var7 = class184.field2541[0];
            }
            return var5.method1779(arg0, super.field6211, super.field6199, super.field6197, 46, arg3, var7, this.field10782 != 11 ? this.field10799 : this.field10799 + 4, ~this.field10782 != -12 ? this.field10782 : 10, var6, arg1, (class282) null);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field10806[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "(B)V")
    public static void method5410(byte arg0) {
        try {
            if (arg0 != 70) {
                field10794 = null;
            }
            field10794 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10806[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "(I)I")
    public final int method5411(int arg0) {
        try {
            ++field10783;
            if (arg0 != 15144) {
                method5410((byte) -104);
            }
            return this.field10803 == null ? 15 : this.field10803.method313() / 4;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10806[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLha;)Ltf;")
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            ++field10793;
            if (this.field10803 == null) {
                return null;
            } else {
                if (arg0 != -104) {
                    this.method1093(-67);
                }
                class501 var3 = arg1.method511();
                var3.method2389(super.field6197, super.field6199, super.field6211);
                class310 var4 = class772.method5591(this.field10795, 0, 1);
                if (class640.field9291) {
                    this.field10803.method323(var3, var4.field4918[0], class726.field10487, 0);
                } else {
                    this.field10803.method333(var3, var4.field4918[0], 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10806[15] + arg0 + ',' + (arg1 != null ? field10806[2] : field10806[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5412(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5413(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
