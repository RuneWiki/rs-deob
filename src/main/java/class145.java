import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class145 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field2107 = -1;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
    private boolean field2117 = true;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[Lbf;")
    private class314[] field2113;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    private int field2101;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[Lbf;")
    private class314[] field2114;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lbf;")
    private class314 field2097;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field2115 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lre;")
    public static class357 field2112 = new class357();

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Llf;")
    private class130 field2111;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lrg;")
    public static class383 field2106;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field2118;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILqj;I)Lkf;")
    public static final class137 method995(int arg0, class296 arg1, int arg2) {
        if (arg0 != 3) {
            field2112 = null;
        }
        field2098++;
        byte[] var3 = arg1.method1904(arg2, arg0 ^ 0xFC);
        return var3 == null ? null : new class137(var3);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public final void method996(byte arg0) {
        field2099++;
        if (this.field2113 != null) {
            for (int var2 = 0; var2 < this.field2113.length; var2++) {
                this.field2113[var2].method1997();
            }
        }
        this.field2111 = null;
        if (arg0 <= 76) {
            this.field2107 = -44;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lqj;ILaa;)V")
    public static final void method997(class296 arg0, int arg1, class281 arg2) {
        field2102++;
        if (class164.field2310) {
            return;
        }
        if (arg1 != 1) {
            method995(-7, (class296) null, 5);
        }
        arg2.method1794(0);
        class91.field1379 = arg2.method1807(class18.method118(arg0, class23.field302), true);
        class91.field1379.method867((class194.field2696 - class91.field1379.method874()) / 2, (class243.field3359 - class91.field1379.method877()) / 2);
        class264.field3600 = arg2.method1807(class18.method118(arg0, class123.field1723), true);
        class264.field3600.method867((class194.field2696 - class264.field3600.method874()) / 2, 18);
        class164.field2310 = true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Laa;IIIIIIIII)V")
    public final void method998(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg9 + arg5 & 0x3FFF;
        field2116++;
        if (~this.field2109 == arg2) {
            arg0.method1785(arg1, arg7, arg3, arg6, arg8, 0);
        } else {
            class164 var12 = class262.field3587.method607(false, this.field2109);
            if (this.field2111 == null && class262.field3587.method610((byte) 0, this.field2109)) {
                int[] var13 = var12.field2300 ? class262.field3587.method613(0.7F, this.field2109, this.field2103, (byte) 126, false, this.field2103) : class262.field3587.method608(this.field2109, 0.7F, this.field2103, false, -105, this.field2103);
                this.field2111 = arg0.method1773(var13, 0, this.field2103, this.field2103, this.field2103);
            }
            if (!var12.field2300) {
                arg0.method1785(arg1, arg7, arg3, arg6, arg8, 0);
            }
            if (this.field2111 != null) {
                int var14 = var12.field2300 ? 0 : 1;
                int var15 = arg4 * arg6 / -4096;
                int var16;
                for (var16 = arg6 * var11 / 4096 + (arg3 - arg6) / 2; var16 > arg6; var16 -= arg6) {
                }
                while (var16 < 0) {
                    var16 += arg6;
                }
                while (arg6 < var15) {
                    var15 -= arg6;
                }
                while (var15 < 0) {
                    var15 += arg6;
                }
                for (int var17 = var16 - arg6; var17 < arg3; var17 += arg6) {
                    for (int var18 = var15 - arg6; var18 < arg6; var18 += arg6) {
                        this.field2111.method807(var17 + arg1, var18 - -arg7, arg6, arg6, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field2104 - 1; var19 >= 0; var19--) {
            this.field2114[var19].method2000(arg0, arg1, arg7, arg3, arg6, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILaa;B)Z")
    public final boolean method999(int arg0, class281 arg1, byte arg2) {
        field2105++;
        if (this.field2107 != arg0) {
            this.field2107 = arg0;
            int var4 = class164.method1089(arg0, (byte) -91);
            if (var4 > arg0) {
                var4 = class105.method718(256, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field2103 != var4) {
                this.field2111 = null;
                this.field2103 = var4;
            }
            if (this.field2113 != null) {
                this.field2104 = 0;
                int[] var5 = new int[this.field2113.length];
                for (int var6 = 0; var6 < this.field2113.length; var6++) {
                    class314 var7 = this.field2113[var6];
                    if (var7.method1994(this.field2110, this.field2101, this.field2108, this.field2107)) {
                        var5[this.field2104] = var7.field4329;
                        this.field2114[this.field2104++] = var7;
                    }
                }
                class209.method1361(0, this.field2104 - 1, var5, 89, this.field2114);
            }
            this.field2117 = true;
        }
        boolean var8 = false;
        if (arg2 < 98) {
            this.field2110 = -33;
        }
        if (this.field2117) {
            this.field2117 = false;
            for (int var9 = this.field2104 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field2114[var9].method1995(arg1, this.field2097);
                this.field2117 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method1000(byte arg0) {
        field2112 = null;
        field2106 = null;
        if (arg0 < 46) {
            field2106 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIBLaa;I)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class281 arg7, int arg8) {
        field2100++;
        if (arg6 > -36) {
            field2112 = null;
        }
        class161 var9 = (class161) class57.method381(arg1, arg8, arg5);
        if (var9 != null) {
            class369 var10 = class310.method1961(var9.method126(-13482), (byte) 35);
            int var11 = var9.method124(-11197) & 0x3;
            int var12 = var9.method123((byte) 111);
            if (var10.field5206 == -1) {
                int var13 = arg0;
                if (var10.field5221 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method1820(1, arg4, 4, arg3, var13);
                    } else if (var11 == 1) {
                        arg7.method1739(var13, 1, arg3, arg4, 4);
                    } else if (var11 == 2) {
                        arg7.method1820(1, arg4 + 3, 4, arg3, var13);
                    } else if (var11 == 3) {
                        arg7.method1739(var13, 1, arg3 + 3, arg4, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method1762(arg3, 1, arg4, var13, 1, -1);
                    } else if (var11 == 1) {
                        arg7.method1762(arg3, 1, arg4 + 3, var13, 1, -1);
                    } else if (var11 == 2) {
                        arg7.method1762(arg3 + 3, 1, arg4 + 3, var13, 1, -1);
                    } else if (var11 == 3) {
                        arg7.method1762(arg3 + 3, 1, arg4, var13, 1, -1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method1739(var13, 1, arg3, arg4, 4);
                    } else if (var11 == 1) {
                        arg7.method1820(1, arg4 + 3, 4, arg3, var13);
                    } else if (var11 == 2) {
                        arg7.method1739(var13, 1, arg3 + 3, arg4, 4);
                    } else if (var11 == 3) {
                        arg7.method1820(1, arg4, 4, arg3, var13);
                    }
                }
            } else {
                class232.method1459(3, arg3, var11, var10, arg7, arg4);
            }
        }
        class161 var14 = (class161) class32.method245(arg1, arg8, arg5, field2118 == null ? (field2118 = method1002("tr")) : field2118);
        if (var14 != null) {
            class369 var15 = class310.method1961(var14.method126(-13482), (byte) 35);
            int var16 = var14.method124(-11197) & 0x3;
            int var17 = var14.method123((byte) 124);
            if (var15.field5206 != -1) {
                class232.method1459(3, arg3, var16, var15, arg7, arg4);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5221 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method1795(1, arg3, arg3 + 3, arg4, var18, arg4 + 3);
                } else {
                    arg7.method1795(1, arg3 + 3, arg3, arg4, var18, arg4 + 3);
                }
            }
        }
        class161 var19 = (class161) class207.method1350(arg1, arg8, arg5);
        if (var19 == null) {
            return;
        }
        class369 var20 = class310.method1961(var19.method126(-13482), (byte) 35);
        int var21 = var19.method124(-11197) & 0x3;
        if (var20.field5206 != -1) {
            class232.method1459(3, arg3, var21, var20, arg7, arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I[Lbf;IIII)V")
    public class145(int arg0, class314[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2109 = arg0;
        this.field2110 = arg3;
        this.field2113 = arg1;
        this.field2108 = arg5;
        this.field2101 = arg4;
        if (arg1 == null) {
            this.field2114 = null;
            this.field2097 = null;
        } else {
            this.field2114 = new class314[arg1.length];
            this.field2097 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1002(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
