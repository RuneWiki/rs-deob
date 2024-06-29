import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class710 extends class656 implements class675 {

    @OriginalMember(owner = "client!oia", name = "hb", descriptor = "Z")
    private boolean field9911 = true;

    @OriginalMember(owner = "client!oia", name = "O", descriptor = "Lmu;")
    public class365 field9922;

    @OriginalMember(owner = "client!oia", name = "T", descriptor = "Z")
    private boolean field9910;

    @OriginalMember(owner = "client!oia", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field9929 = new String[] { method5081(method5080("s\u0015\u0019{")), method5081(method5080("fN[9m")), method5081(method5080("r\t\u00149Q5")), method5081(method5080("r\t\u00149X5")), method5081(method5080("r\t\u00149]5")), method5081(method5080("r\t\u00149\\5")), method5081(method5080("r\t\u00149[5")), method5081(method5080("r\t\u00149@5")), method5081(method5080("r\t\u00149^5")), method5081(method5080("r\t\u00149Y5")), method5081(method5080("r\t\u00149_5")), method5081(method5080("r\t\u00149F5")), method5081(method5080("r\t\u00149S5")), method5081(method5080("r\t\u00149,t\u000e\u001cc.5")), method5081(method5080("r\t\u00149U5")), method5081(method5080("r\t\u00149V5")), method5081(method5080("r\t\u00149S\\H")), method5081(method5080("r\t\u00149T\\H")), method5081(method5080("r\t\u00149R\\H")), method5081(method5080("r\t\u00149Z5")), method5081(method5080("r\t\u00149D5")) };

    @OriginalMember(owner = "client!oia", name = "cb", descriptor = "Z")
    public static boolean field9925 = true;

    @OriginalMember(owner = "client!oia", name = "R", descriptor = "Lop;")
    public static class574 field9921 = new class574("", 18);

    @OriginalMember(owner = "client!oia", name = "X", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!oia", name = "U", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!oia", name = "fb", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!oia", name = "W", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!oia", name = "eb", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!oia", name = "ib", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!oia", name = "Q", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!oia", name = "Z", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!oia", name = "Y", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!oia", name = "db", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!oia", name = "S", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!oia", name = "N", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!oia", name = "bb", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!oia", name = "ab", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!oia", name = "M", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!oia", name = "gb", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!oia", name = "P", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!oia", name = "V", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!oia", name = "jb", descriptor = "Lsba;")
    private class311 field9919;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field9906;
            class761 var5 = this.field9922.method2903(131072, arg0, false, false, (byte) -69);
            if (var5 == null) {
                return false;
            } else {
                class104 var6 = arg0.method136();
                if (arg2 != -1) {
                    return true;
                } else {
                    var6.method739(super.field2969 - -super.field9299, super.field2975, super.field9298 + super.field2984);
                    return !class149.field1902 ? var5.method382(arg3, arg1, var6, false, 0) : var5.method440(arg3, arg1, var6, false, 0, class194.field2686);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9929[2] + (arg0 != null ? field9929[1] : field9929[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(I)I")
    public final int method572(int arg0) {
        try {
            ++field9907;
            if (arg0 < 70) {
                this.field9911 = false;
            }
            return this.field9922.field5318;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            if (arg1 < 94) {
                return null;
            } else {
                ++field9915;
                return this.field9919;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9929[7] + (arg0 != null ? field9929[1] : field9929[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILao;)V")
    public final void method5077(int arg0, class626 arg1) {
        try {
            this.field9922.method2900(arg0 ^ -107, arg1);
            if (arg0 == 0) {
                ++field9926;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9929[5] + arg0 + ',' + (arg1 != null ? field9929[1] : field9929[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IZ)I")
    public static final int method5078(int arg0, boolean arg1) {
        try {
            ++field9914;
            return arg1 ? -61 : arg0 >>> 7;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZIIIII)V")
    public class710(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        try {
            this.field9922 = new class365(arg0, arg1, arg10, arg11, super.field2981, arg3, this, arg7, arg12);
            this.field9910 = arg1.field11409 != 0 && !arg7;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field9929[13] + (arg0 != null ? field9929[1] : field9929[0]) + ',' + (arg1 != null ? field9929[1] : field9929[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)I")
    public final int method584(boolean arg0) {
        try {
            if (arg0) {
                this.method575(false);
            }
            ++field9912;
            return this.field9922.field5310;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "(I)V")
    public static void method5079(int arg0) {
        try {
            field9921 = null;
            if (arg0 != 0) {
                field9925 = false;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9929[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(Z)V")
    public final void method576(boolean arg0) {
        try {
            if (!arg0) {
                this.method586((class18) null, 67);
            }
            ++field9917;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            ++field9908;
            if (arg0) {
                this.field9922 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            if (arg1 != 0) {
                field9925 = true;
            }
            ++field9927;
            class761 var3 = this.field9922.method2903(262144, arg0, false, true, (byte) -119);
            if (var3 != null) {
                int var4 = super.field2969 >> 9;
                int var5 = super.field2984 >> 9;
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                this.field9922.method2909(var4, var3, 0, var4, var5, arg0, false, var5, var6);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9929[20] + (arg0 != null ? field9929[1] : field9929[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        try {
            ++field9913;
            if (arg0 < 96) {
                this.method576(false);
            }
            return this.field9922.method2902((byte) 86);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            if (arg0) {
                return 28;
            } else {
                ++field9916;
                return this.field9922.method2911(-116);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field9920;
            class761 var3 = this.field9922.method2903(2048, arg1, arg0, true, (byte) -103);
            if (var3 == null) {
                return null;
            } else {
                class104 var4 = arg1.method136();
                var4.method739(super.field2969 - -super.field9299, super.field2975, super.field9298 + super.field2984);
                class297 var5 = class674.method4839(this.field9910, 1, 12853);
                int var6 = super.field2969 >> 9;
                int var7 = super.field2984 >> 9;
                this.field9922.method2909(var6, var3, 0, var6, var7, arg1, true, var7, var4);
                if (class149.field1902) {
                    var3.method427(var4, var5.field4153[0], class194.field2686, 0);
                } else {
                    var3.method415(var4, var5.field4153[0], 0);
                }
                if (this.field9922.field5312 != null) {
                    class788 var8 = this.field9922.field5312.method3565();
                    if (class149.field1902) {
                        arg1.method193(var8, class194.field2686);
                    } else {
                        arg1.method126(var8);
                    }
                }
                this.field9911 = var3.method422() || this.field9922.field5312 != null;
                if (this.field9919 == null) {
                    this.field9919 = class640.method4679(super.field2969, super.field2984, super.field2975, var3, 10327);
                } else {
                    class345.method2767(this.field9919, super.field2984, super.field2969, -128, var3, super.field2975);
                }
                return var5;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9929[12] + arg0 + ',' + (arg1 != null ? field9929[1] : field9929[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZLha;)V")
    public final void method589(boolean arg0, class18 arg1) {
        try {
            this.field9922.method2907(262144, arg1);
            ++field9924;
            if (arg0) {
                this.field9910 = false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9929[8] + arg0 + ',' + (arg1 != null ? field9929[1] : field9929[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            if (arg0 != 114) {
                this.field9919 = null;
            }
            ++field9923;
            return this.field9922.method2905(98);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)I")
    public final int method585(int arg0) {
        try {
            if (arg0 != -20175) {
                this.field9911 = false;
            }
            ++field9918;
            return this.field9922.field5290;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            ++field9909;
            if (arg0) {
                this.field9922 = null;
            }
            return this.field9911;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9929[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILha;)V")
    public final void method581(int arg0, class18 arg1) {
        try {
            this.field9922.method2908(4, arg1);
            if (arg0 != -18864) {
                this.method572(11);
            }
            ++field9905;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9929[14] + arg0 + ',' + (arg1 != null ? field9929[1] : field9929[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5080(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5081(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
