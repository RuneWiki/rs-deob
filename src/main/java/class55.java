import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class55 extends class604 implements class675 {

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "Z")
    private boolean field773 = true;

    @OriginalMember(owner = "client!lu", name = "tb", descriptor = "Lmu;")
    public class365 field754;

    @OriginalMember(owner = "client!lu", name = "kb", descriptor = "Z")
    private boolean field769;

    @OriginalMember(owner = "client!lu", name = "T", descriptor = "[Ljava/lang/String;")
    private static final String[] field778 = new String[] { method592(method591("(X\u000e(&")), method592(method591("*XL\n")), method592(method591("?\u0003\u000eHs")), method592(method591("(X\u000e\"&")), method592(method591("(X\u000e &")), method592(method591("(X\u000e)&")), method592(method591("(X\u000e6&")), method592(method591("(X\u000e,&")), method592(method591("(X\u000e#&")), method592(method591("(X\u000eZg*DTX&")), method592(method591("(X\u000e!&")), method592(method591("(X\u000e/&")), method592(method591("(X\u000e\"Ol")), method592(method591("(X\u000e.&")), method592(method591("(X\u000e2&")), method592(method591("(X\u000e'&")), method592(method591("(X\u000e$&")), method592(method591("(X\u000e%&")), method592(method591("\u000bNC\n{ H\u0000%o(N\u00002a+F\u001aF")), method592(method591("\u0010BT\u0007bdbP\u0007\u007f1H\u0000)`7NR\u0003k*\u0017\u0000")), method592(method591("dnp\u00154d")), method592(method591("1^")), method592(method591("\u000bNC\n{ HR\u00154d")), method592(method591("\u0000TN\u0007c-N\u001aF")), method592(method591("\u0010BT\u0007bdyR\u0007`7\ro\b}'_E\u0003`~\r")), method592(method591("\u000bNC\n{ HD\\.\u0003_O\u0013` \u0017")), method592(method591("dlC\u0012g2H\u001aF")), method592(method591("d}I\u001ek(^\u001aF")), method592(method591("dzA\nb7\u0017\u0000")), method592(method591("(X\u000e+&")), method592(method591("(X\u000e-&")), method592(method591("(X\u000e$Ol")), method592(method591("(X\u000e0&")), method592(method591("(X\u000e*&")), method592(method591("(X\u000e%Ol")) };

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "[I")
    public static int[] field753 = new int[1];

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "[I")
    public static int[] field774 = new int[1000];

    @OriginalMember(owner = "client!lu", name = "ob", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!lu", name = "fb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!lu", name = "hb", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!lu", name = "pb", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!lu", name = "qb", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!lu", name = "nb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!lu", name = "eb", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!lu", name = "sb", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!lu", name = "rb", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!lu", name = "ib", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!lu", name = "mb", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!lu", name = "lb", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "Lsba;")
    private class311 field757;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)I")
    public final int method572(int arg0) {
        try {
            if (arg0 < 70) {
                this.method581(109, (class18) null);
            }
            ++field763;
            return this.field754.field5318;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field752;
            class761 var3 = this.field754.method2903(2048, arg1, arg0, true, (byte) -125);
            if (var3 == null) {
                return null;
            } else {
                class104 var4 = arg1.method136();
                var4.method739(super.field2969, super.field2975, super.field2984);
                class297 var5 = class674.method4839(this.field769, 1, 12853);
                this.field754.method2909(super.field8666, var3, 0, super.field8663, super.field8661, arg1, true, super.field8669, var4);
                if (!class149.field1902) {
                    var3.method415(var4, var5.field4153[0], 0);
                } else {
                    var3.method427(var4, var5.field4153[0], class194.field2686, 0);
                }
                if (this.field754.field5312 != null) {
                    class788 var6 = this.field754.field5312.method3565();
                    if (class149.field1902) {
                        arg1.method193(var6, class194.field2686);
                    } else {
                        arg1.method126(var6);
                    }
                }
                this.field773 = var3.method422() || this.field754.field5312 != null;
                if (this.field757 == null) {
                    this.field757 = class640.method4679(super.field2969, super.field2984, super.field2975, var3, 10327);
                } else {
                    class345.method2767(this.field757, super.field2984, super.field2969, -127, var3, super.field2975);
                }
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field778[17] + arg0 + ',' + (arg1 != null ? field778[2] : field778[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
    public final void method44(byte arg0) {
        try {
            ++field772;
            if (arg0 < 111) {
                this.field757 = null;
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lao;Z)V")
    public final void method574(class626 arg0, boolean arg1) {
        try {
            ++field770;
            if (arg1) {
                this.method573(false, (class18) null);
            }
            this.field754.method2900(-112, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field778[13] + (arg0 != null ? field778[2] : field778[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            if (arg0) {
                this.field757 = null;
            }
            ++field761;
            return this.field754.method2911(113);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[32] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V")
    public final void method576(boolean arg0) {
        try {
            if (arg0) {
                ++field758;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V")
    public static void method577(int arg0) {
        try {
            field753 = null;
            field774 = null;
            if (arg0 >= -26) {
                method577(-102);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field778[33] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            ++field764;
            if (arg0 != 114) {
                this.method581(-59, (class18) null);
            }
            return this.field754.method2905(112);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            if (arg0) {
                return false;
            } else {
                ++field755;
                return this.field773;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field756;
            if (arg2 != -1) {
                this.field754 = null;
            }
            class761 var5 = this.field754.method2903(131072, arg0, false, false, (byte) -90);
            if (var5 == null) {
                return false;
            } else {
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                return !class149.field1902 ? var5.method382(arg3, arg1, var6, false, 0) : var5.method440(arg3, arg1, var6, false, 0, class194.field2686);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field778[15] + (arg0 != null ? field778[2] : field778[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILha;)V")
    public final void method581(int arg0, class18 arg1) {
        try {
            ++field767;
            if (arg0 != -18864) {
                this.field754 = null;
            }
            this.field754.method2908(arg0 ^ -18860, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field778[8] + arg0 + ',' + (arg1 != null ? field778[2] : field778[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZIIIIIII)V")
    public class55(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field11451 == 1, class16.method110(1, arg12, arg13));
        try {
            this.field754 = new class365(arg0, arg1, arg12, arg13, super.field2981, arg3, this, arg7, arg14);
            this.field769 = ~arg1.field11409 != -1 && !arg7;
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field778[9] + (arg0 != null ? field778[2] : field778[1]) + ',' + (arg1 != null ? field778[2] : field778[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)Z")
    public final boolean method46(int arg0) {
        try {
            if (arg0 > -97) {
                this.field754 = null;
            }
            ++field759;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            ++field765;
            if (arg0) {
                this.field757 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[31] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()V")
    public static final void method583() {
        byte var0 = 10;
        byte var1 = 30;
        if (class440.field6487 != 0 && class287.field4066 != null) {
            class531.field7699.method229(class487.field7144);
            for (int var2 = 0; var2 < class144.field1862.length; ++var2) {
                class531.field7699.method200(class487.field7144[1], class487.field7144[3] - class487.field7144[1], class538.field7912[var2] + class144.field1862[var2], 1, -256);
            }
            for (int var3 = 0; var3 < class694.field9701; ++var3) {
                class182 var11 = class654.field9283[var3];
                class531.field7699.method223(var11.field2353[0], var11.field2351[0], var11.field2352[0], class203.field2986);
                class531.field7699.method223(var11.field2353[1], var11.field2351[1], var11.field2352[1], class2.field35);
                class531.field7699.method223(var11.field2353[2], var11.field2351[2], var11.field2352[2], class323.field4405);
                class531.field7699.method223(var11.field2353[3], var11.field2351[3], var11.field2352[3], class495.field7268);
                if (class203.field2986[2] != -1 && class2.field35[2] != -1 && class323.field4405[2] != -1 && class495.field7268[2] != -1) {
                    int var12 = -65536;
                    if (var11.field2347 == 4) {
                        var12 = -16776961;
                    }
                    class531.field7699.method242((byte) 109, class203.field2986[1], class2.field35[0], var12, class203.field2986[0], class2.field35[1]);
                    class531.field7699.method242((byte) 106, class2.field35[1], class323.field4405[0], var12, class2.field35[0], class323.field4405[1]);
                    class531.field7699.method242((byte) 126, class323.field4405[1], class495.field7268[0], var12, class323.field4405[0], class495.field7268[1]);
                    class531.field7699.method242((byte) 110, class495.field7268[1], class203.field2986[0], var12, class495.field7268[0], class203.field2986[1]);
                    class531.field7699.method242((byte) 27, class203.field2986[1], class323.field4405[0], var12, class203.field2986[0], class323.field4405[1]);
                }
            }
            class287.field4066.method1828(var1 + 45, field778[23] + class433.field6273 + "/" + 5000, true, -16777216, var0, -256);
            class287.field4066.method1828(var1 + 60, field778[19] + class643.field9160 + "/" + 10000, true, -16777216, var0, -256);
            class287.field4066.method1828(var1 + 75, field778[24] + class98.field1329 + "/" + 5000, true, -16777216, var0, -256);
            class287.field4066.method1828(var1 + 90, field778[22] + (class740.field10526 + class119.field1510) + field778[26] + class694.field9701, true, -16777216, var0, -256);
            class287.field4066.method1828(var1 + 105, field778[25] + class322.field4389 + field778[28] + class53.field740 + field778[20] + class15.field200 + field778[27] + class459.field6696, true, -16777216, var0, -256);
            class287.field4066.method1828(var1 + 120, field778[18] + class434.field6286 / 1000L + field778[21], true, -16777216, var0, -256);
            if (class440.field6487 == 2 && class715.field10184 != null) {
                for (int var4 = 0; var4 < class715.field10184.length; ++var4) {
                    float var6 = (float) class715.field10184[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class715.field10184[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class392 var5 = class531.field7699.method201(class518.field7582, class29.field372, class715.field10184, class29.field372, (byte) -60, 0);
                var5.method874(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)I")
    public final int method584(boolean arg0) {
        try {
            if (arg0) {
                return 60;
            } else {
                ++field751;
                return this.field754.field5310;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBILrfa;ZILha;)V")
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            ++field776;
            int var8 = -57 / ((9 - arg1) / 35);
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field778[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field778[2] : field778[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field778[2] : field778[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)I")
    public final int method585(int arg0) {
        try {
            if (arg0 != -20175) {
                this.method576(false);
            }
            ++field750;
            return this.field754.field5290;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[30] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            ++field762;
            class761 var3 = this.field754.method2903(262144, arg0, true, true, (byte) -67);
            if (var3 != null) {
                class104 var4 = arg0.method136();
                var4.method739(super.field2969, super.field2975, super.field2984);
                this.field754.method2909(super.field8666, var3, 0, super.field8663, super.field8661, arg0, false, super.field8669, var4);
            }
            if (arg1 != 0) {
                field775 = 93;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field778[14] + (arg0 != null ? field778[2] : field778[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            ++field766;
            if (arg1 < 94) {
                this.method581(-8, (class18) null);
            }
            return this.field757;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field778[6] + (arg0 != null ? field778[2] : field778[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lha;I)V")
    public static final void method588(class18 arg0, int arg1) {
        try {
            class626.field8945 = class72.method753(arg0, class121.field1536, true, -1);
            if (arg1 == 5000) {
                ++field768;
                class17.field218 = class768.method5545((byte) -126, arg0, class121.field1536);
                class23.field279 = class72.method753(arg0, class717.field10218, true, -1);
                class84.field1185 = class768.method5545((byte) -126, arg0, class717.field10218);
                class200.field2954 = class72.method753(arg0, field775, true, -1);
                class520.field7584 = class768.method5545((byte) -126, arg0, field775);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[7] + (arg0 != null ? field778[2] : field778[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLha;)V")
    public final void method589(boolean arg0, class18 arg1) {
        try {
            this.field754.method2907(262144, arg1);
            ++field777;
            if (arg0) {
                field775 = 124;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field778[0] + arg0 + ',' + (arg1 != null ? field778[2] : field778[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        try {
            if (arg0 < 96) {
                return true;
            } else {
                ++field771;
                return this.field754.method2902((byte) 86);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field778[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method591(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method592(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
