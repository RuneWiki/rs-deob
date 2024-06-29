import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class62 extends class185 implements class3 {

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "Z")
    private boolean field830 = false;

    @OriginalMember(owner = "client!nr", name = "kb", descriptor = "Lmca;")
    public class30 field840;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "Z")
    private boolean field843;

    @OriginalMember(owner = "client!nr", name = "sb", descriptor = "[Ljava/lang/String;")
    private static final String[] field852 = new String[] { method654(method653("U\u001b]W\u000b")), method654(method653("U\u001b]]\u000b")), method654(method653("U\u001b]U\u000b")), method654(method653("U\u001b]Zb\u0013")), method654(method653("U\u001c\u001fr")), method654(method653("@G]0^")), method654(method653("U\u001b]H\u000b")), method654(method653("U\u001b]J\u000b")), method654(method653("U\u001b]Y\u000b")), method654(method653("U\u001b]\\b\u0013")), method654(method653("U\u001b][b\u0013")), method654(method653("U\u001b]_\u000b")), method654(method653("U\u001b]N\u000b")), method654(method653("U\u001b]\"JU\u0000\u0007 \u000b")), method654(method653("U\u001b]]b\u0013")), method654(method653("U\u001b]V\u000b")), method654(method653("U\u001b]O\u000b")), method654(method653("U\u001b]R\u000b")), method654(method653("U\u001b]S\u000b")), method654(method653("U\u001b]P\u000b")), method654(method653("U\u001b]X\u000b")), method654(method653("U\u001b]_b\u0013")), method654(method653("U\u001b]T\u000b")), method654(method653("U\u001b]M\u000b")) };

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
    public static int field822 = -1;

    @OriginalMember(owner = "client!nr", name = "hb", descriptor = "Lfg;")
    public static class136 field835 = new class136();

    @OriginalMember(owner = "client!nr", name = "db", descriptor = "[I")
    public static int[] field847 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "[I")
    public static int[] field845 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!nr", name = "qb", descriptor = "[I")
    public static int[] field849 = new int[4096];

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!nr", name = "rb", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!nr", name = "fb", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!nr", name = "gb", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!nr", name = "ab", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!nr", name = "eb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!nr", name = "jb", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!nr", name = "ob", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!nr", name = "nb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!nr", name = "mb", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!nr", name = "cb", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!nr", name = "lb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!nr", name = "bb", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!nr", name = "ib", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!nr", name = "pb", descriptor = "Lrga;")
    private class250 field846;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLha;)V")
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field823;
            if (arg0 == -108) {
                class499 var3 = this.field840.method326(262144, true, 26624, arg1, true);
                if (var3 != null) {
                    class486 var4 = arg1.method251();
                    var4.method2465(super.field9985, super.field9972, super.field9983);
                    this.field840.method323((byte) 20, super.field2940, super.field2939, super.field2946, super.field2945, arg1, var4, var3, false);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field852[9] + arg0 + ',' + (arg1 != null ? field852[5] : field852[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)I")
    public final int method34(int arg0) {
        try {
            ++field841;
            if (arg0 != 16388) {
                field822 = 111;
            }
            return this.field840.field338;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)I")
    public final int method54(byte arg0) {
        try {
            if (arg0 >= -112) {
                this.method29((class63) null, -110);
            }
            ++field824;
            return this.field840.method314(124);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILha;)V")
    public final void method31(int arg0, class63 arg1) {
        try {
            this.field840.method325(false, arg1);
            if (arg0 == -27998) {
                ++field838;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field852[8] + arg0 + ',' + (arg1 != null ? field852[5] : field852[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        try {
            if (arg0 != 47) {
                return true;
            } else {
                ++field837;
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
    public final int method35(byte arg0) {
        try {
            ++field842;
            if (arg0 != -55) {
                this.method53(78);
            }
            return this.field840.field354;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lha;Ltk;IIIIIZIIIIIII)V")
    public class62(class63 arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5834 == 1, class178.method1699(18123, arg12, arg13));
        try {
            this.field840 = new class30(arg0, arg1, arg12, arg13, super.field9975, arg3, this, arg7, arg14);
            this.field843 = ~arg1.field5843 != -1 && !arg7;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field852[13] + (arg0 != null ? field852[5] : field852[4]) + ',' + (arg1 != null ? field852[5] : field852[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            if (arg5 <= -10) {
                ++field832;
                throw new IllegalStateException();
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field852[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field852[5] : field852[4]) + ',' + arg3 + ',' + (arg4 != null ? field852[5] : field852[4]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lha;I)V")
    public final void method29(class63 arg0, int arg1) {
        try {
            this.field840.method322(-1, arg0);
            int var3 = 85 % ((arg1 - 22) / 60);
            ++field828;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field852[15] + (arg0 != null ? field852[5] : field852[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        try {
            ++field848;
            if (arg0 < -41) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        try {
            ++field850;
            if (arg0 < 54) {
                this.field830 = true;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ldq;I)V")
    public final void method650(class729 arg0, int arg1) {
        try {
            if (arg1 > -52) {
                this.method650((class729) null, 26);
            }
            ++field839;
            this.field840.method320(2, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field852[11] + (arg0 != null ? field852[5] : field852[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        try {
            ++field831;
            return arg0 != -12 ? false : this.field840.method308((byte) -111);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(B)V")
    public static void method651(byte arg0) {
        try {
            field847 = null;
            field835 = null;
            field845 = null;
            if (arg0 < 32) {
                field851 = 14;
            }
            field849 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field852[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        try {
            if (arg0 != -32768) {
                this.method33((byte) -99);
            }
            ++field844;
            return this.field830;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field825;
            class499 var5 = this.field840.method326(arg0, false, arg0 ^ 157696, arg3, false);
            if (var5 == null) {
                return false;
            } else {
                class486 var6 = arg3.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                return !class200.field3163 ? var5.method425(arg2, arg1, var6, false, 0) : var5.method429(arg2, arg1, var6, false, 0, class547.field8042);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field852[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field852[5] : field852[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIII)V")
    public static final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field826;
            int var5 = class203.field3192;
            int var6 = class735.field10782;
            if (arg4 == -8) {
                if (class316.field5141) {
                    var5 += class50.method516(false);
                    var6 += class568.method4171(arg4 + 8);
                }
                if (~class359.field5799 == -2) {
                    class107 var7 = class429.field6757[class438.field6845 / 100];
                    var7.method1001(var5 + -8, var6 + -8);
                    class458.method3552(var6 - 8, var5 - 8 + var7.method26(), var7.method12() + var6 + -8, var5 + -8, -73);
                }
                if (~class359.field5799 == -3) {
                    class107 var8 = class429.field6757[class438.field6845 / 100 + 4];
                    var8.method1001(var5 + -8, var6 + -8);
                    class458.method3552(var6 + -8, var8.method26() + var5 - 8, var6 + -8 + var8.method12(), var5 + -8, -117);
                }
                class126.method1214(-9726);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field852[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lha;B)Lkv;")
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field827;
            class499 var3 = this.field840.method326(2048, false, 26624, arg0, true);
            if (var3 == null) {
                return null;
            } else {
                class486 var4 = arg0.method251();
                var4.method2465(super.field9985, super.field9972, super.field9983);
                if (arg1 != 122) {
                    this.method43(14);
                }
                class281 var5 = class349.method2910(this.field843, 1, (byte) -118);
                this.field840.method323((byte) 20, super.field2940, super.field2939, super.field2946, super.field2945, arg0, var4, var3, true);
                if (!class200.field3163) {
                    var3.method426(var4, var5.field4578[0], 0);
                } else {
                    var3.method423(var4, var5.field4578[0], class547.field8042, 0);
                }
                if (this.field840.field358 != null) {
                    class659 var6 = this.field840.field358.method893();
                    if (!class200.field3163) {
                        arg0.method191(var6);
                    } else {
                        arg0.method172(var6, class547.field8042);
                    }
                }
                this.field830 = var3.method407() || this.field840.field358 != null;
                if (this.field846 == null) {
                    this.field846 = class198.method1814(var3, 34069, super.field9985, super.field9983, super.field9972);
                } else {
                    class133.method1255(super.field9983, var3, true, this.field846, super.field9985, super.field9972);
                }
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field852[10] + (arg0 != null ? field852[5] : field852[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final void method30(int arg0) {
        try {
            ++field834;
            if (arg0 != 20235) {
                field851 = 51;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)I")
    public final int method32(byte arg0) {
        try {
            if (arg0 != -95) {
                field849 = null;
            }
            ++field836;
            return this.field840.field360;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)I")
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                this.field846 = null;
            }
            ++field829;
            return this.field840.method321((byte) 51);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field852[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Lha;B)Lrga;")
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            ++field833;
            return arg1 != -118 ? null : this.field846;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field852[3] + (arg0 != null ? field852[5] : field852[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method653(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method654(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
