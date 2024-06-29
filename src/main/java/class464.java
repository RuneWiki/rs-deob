import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class464 extends class343 {

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    private int field6753 = 0;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    private int field6762 = 0;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    private int field6774 = 0;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    private int field6765 = -1;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    private int field6769 = 0;

    @OriginalMember(owner = "client!ti", name = "rb", descriptor = "Z")
    private boolean field6773 = true;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "Z")
    public boolean field6775 = false;

    @OriginalMember(owner = "client!ti", name = "mb", descriptor = "I")
    private int field6776 = 0;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public int field6764;

    @OriginalMember(owner = "client!ti", name = "pb", descriptor = "I")
    private int field6761;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "Lhs;")
    private class344 field6757;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "[Ljava/lang/String;")
    private static final String[] field6777 = new String[] { method3531(method3530("\u001eDZ-s")), method3531(method3530("\u001eDZ,s")), method3531(method3530("\u001eDZ=s")), method3531(method3530("\u0011\u0003ZG&")), method3531(method3530("\u001eDZ/s")), method3531(method3530("\u0004X\u0018\u0005")), method3531(method3530("\u001eDZ%s")), method3531(method3530("\u001eDZ+\u001aB")), method3531(method3530("\u001eDZ(\u001aB")), method3531(method3530("\u001eDZ s")), method3531(method3530("\u001eDZU2\u0004D\u0000Ws")), method3531(method3530("\u001eDZ$s")), method3531(method3530("\u001eDZ8s")), method3531(method3530("\u001eDZ.s")), method3531(method3530("\u001eDZ>s")), method3531(method3530("\u001eDZ#s")), method3531(method3530("\u001eDZ!s")), method3531(method3530("\u001eDZ9s")), method3531(method3530("\u001eDZ\u000f2\u0004L\u0018\u0000!\u000f\u0005")) };

    @OriginalMember(owner = "client!ti", name = "lb", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!ti", name = "ib", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!ti", name = "qb", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!ti", name = "fb", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!ti", name = "ob", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!ti", name = "nb", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!ti", name = "kb", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!ti", name = "jb", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "Lkq;")
    private class619 field6759;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ldf;IZIIILha;)V", line = 4)
    public final void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            if (arg5 != 0) {
                this.field6769 = -60;
            }
            ++field6752;
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6777[13] + (arg0 != null ? field6777[3] : field6777[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6777[3] : field6777[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 16)
    public class464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        try {
            this.field6774 = arg12;
            this.field6764 = arg1 + arg2;
            this.field6761 = arg0;
            class217 var14 = class771.field11208.method2509(-104, this.field6761);
            int var15 = var14.field3313;
            if (var15 == -1) {
                this.field6775 = true;
            } else {
                this.field6757 = class272.field4122.method2242(var15, 100);
                this.field6775 = false;
            }
            if (~this.field6764 == ~arg2) {
                class418.method3242(-256, this.field6757, this, this.field6776);
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field6777[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;III)Lka;", line = 43)
    private final class497 method3525(class66 arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 <= 69) {
                this.field6757 = null;
            }
            ++field6768;
            class217 var5 = class771.field11208.method2509(-128, arg1);
            class294 var6 = class184.field2541[super.field6200];
            class294 var7 = ~super.field6205 > -4 ? class184.field2541[super.field6205 + 1] : null;
            return this.field6775 ? var5.method1893(super.field6199, var7, -1, var6, arg0, 0, false, -1, true, class272.field4122, arg3, super.field6211, super.field6197) : var5.method1893(super.field6199, var7, this.field6776, var6, arg0, this.field6762, false, this.field6765, true, class272.field4122, arg3, super.field6211, super.field6197);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6777[4] + (arg0 != null ? field6777[3] : field6777[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() {
        try {
            if (this.field6759 != null) {
                this.field6759.method4622();
            }
            ++field6749;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6777[18] + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;I)Lcca;", line = 77)
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            ++field6756;
            if (arg1 <= 65) {
                this.method625((byte) -14);
            }
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6777[9] + (arg0 != null ? field6777[3] : field6777[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)Z", line = 97)
    public final boolean method1098(boolean arg0) {
        try {
            ++field6766;
            return arg0 ? true : this.field6773;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)V", line = 109)
    public final void method628(int arg0) {
        try {
            if (arg0 == -38) {
                ++field6750;
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)Z", line = 120)
    public final boolean method1082(byte arg0) {
        try {
            if (arg0 != 27) {
                this.field6759 = null;
            }
            ++field6751;
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 134)
    public final void method3526(int arg0) {
        try {
            ++field6754;
            if (this.field6759 != null) {
                this.field6759.method4622();
            }
            if (arg0 >= -46) {
                this.method3529((byte) -128, -66);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)Z", line = 147)
    public final boolean method625(byte arg0) {
        try {
            ++field6758;
            if (arg0 != 94) {
                this.method3526(97);
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLha;)Ltf;", line = 159)
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            ++field6763;
            class497 var3 = this.method3525(arg1, this.field6761, 88, 2048 | (~this.field6774 != -1 ? 5 : 0));
            if (arg0 != -104) {
                this.field6762 = 122;
            }
            if (var3 == null) {
                return null;
            } else {
                if (~this.field6774 != -1) {
                    var3.method312(this.field6774 * 2048);
                }
                class501 var4 = arg1.method511();
                var4.method2389(super.field6197, super.field6199, super.field6211);
                this.method3527(arg1, true, var4, var3);
                class310 var5 = class772.method5591(false, 0, 1);
                if (!class640.field9291) {
                    var3.method333(var4, var5.field4918[0], 0);
                } else {
                    var3.method323(var4, var5.field4918[0], class726.field10487, 0);
                }
                if (this.field6759 != null) {
                    class580 var6 = this.field6759.method4621();
                    if (!class640.field9291) {
                        arg1.method590(var6);
                    } else {
                        arg1.method500(var6, class726.field10487);
                    }
                }
                this.field6773 = var3.method307();
                this.field6769 = var3.method305();
                this.field6753 = var3.method327();
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6777[8] + arg0 + ',' + (arg1 != null ? field6777[3] : field6777[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;ZLqq;Lka;)V", line = 205)
    private final void method3527(class66 arg0, boolean arg1, class501 arg2, class497 arg3) {
        try {
            ++field6771;
            if (!arg1) {
                this.field6761 = 18;
            }
            arg3.method349(arg2);
            class659[] var5 = arg3.method324();
            class426[] var6 = arg3.method345();
            if ((this.field6759 == null || this.field6759.field9095) && (var5 != null || var6 != null)) {
                this.field6759 = class619.method4620(class375.field5711, true);
            }
            if (this.field6759 != null) {
                this.field6759.method4612(arg0, (long) class375.field5711, var5, var6, false);
                this.field6759.method4626(super.field6200, super.field5330, super.field5335, super.field5329, super.field5325);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6777[15] + (arg0 != null ? field6777[3] : field6777[5]) + ',' + arg1 + ',' + (arg2 != null ? field6777[3] : field6777[5]) + ',' + (arg3 != null ? field6777[3] : field6777[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I", line = 231)
    public final int method1093(int arg0) {
        try {
            if (arg0 != -3) {
                this.method1082((byte) 99);
            }
            ++field6760;
            return this.field6753;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIILqj;Lqj;)V", line = 246)
    public static final void method3528(int arg0, int arg1, int arg2, class535 arg3, class535 arg4) {
        class96 var5 = class483.method3683(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1080 = arg3;
            var5.field1090 = arg4;
            int var6 = class555.field8261 == class195.field2617 ? 1 : 0;
            if (arg3.method1082((byte) 27)) {
                if (arg3.method1098(false)) {
                    arg3.field6207 = class273.field4136[var6];
                    class273.field4136[var6] = arg3;
                } else {
                    arg3.field6207 = class106.field1228[var6];
                    class106.field1228[var6] = arg3;
                    class222.field3412 = true;
                }
            } else {
                arg3.field6207 = class74.field862[var6];
                class74.field862[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method1082((byte) 27)) {
                    if (arg4.method1098(false)) {
                        arg4.field6207 = class273.field4136[var6];
                        class273.field4136[var6] = arg4;
                        return;
                    }
                    arg4.field6207 = class106.field1228[var6];
                    class106.field1228[var6] = arg4;
                    class222.field3412 = true;
                    return;
                }
                arg4.field6207 = class74.field862[var6];
                class74.field862[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILha;B)Z", line = 305)
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            ++field6770;
            if (arg3 > -43) {
                this.field6762 = -54;
            }
            return false;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6777[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6777[3] : field6777[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(ILha;)V", line = 317)
    public final void method1081(int arg0, class66 arg1) {
        try {
            ++field6748;
            class497 var3 = this.method3525(arg1, this.field6761, arg0 + 111, arg0);
            if (var3 != null) {
                class501 var4 = arg1.method511();
                var4.method2389(super.field6197, super.field6199, super.field6211);
                this.method3527(arg1, true, var4, var3);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6777[14] + arg0 + ',' + (arg1 != null ? field6777[3] : field6777[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "(I)I", line = 336)
    public final int method1088(int arg0) {
        try {
            ++field6767;
            if (arg0 != -2226) {
                this.method3529((byte) -101, -3);
            }
            return this.field6769;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6777[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V", line = 368)
    public final void method3529(byte arg0, int arg1) {
        try {
            ++field6755;
            if (!this.field6775) {
                if (arg0 <= 109) {
                    this.method1086((class66) null, 79);
                }
                this.field6762 += arg1;
                while (~this.field6762 < ~this.field6757.field5361[this.field6776]) {
                    this.field6762 -= this.field6757.field5361[this.field6776];
                    ++this.field6776;
                    if (~this.field6776 <= ~this.field6757.field5366.length) {
                        this.field6775 = true;
                        break;
                    }
                }
                if (!this.field6775) {
                    class418.method3242(-256, this.field6757, this, this.field6776);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6777[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3530(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 91);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3531(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
