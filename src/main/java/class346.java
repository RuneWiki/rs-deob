import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class346 {

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Z")
    public boolean field5022 = false;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    private int field5021 = 0;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    private int field5028 = 128;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public int field5023 = -1;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "B")
    public byte field5031 = 0;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    private int field5029 = 0;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    private int field5039 = 0;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    private int field5037 = 128;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    private int field5027 = -1;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field5034 = 0;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "[Loj;")
    public static class659[] field5040 = new class659[75];

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public int field5041;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Lqa;")
    public class747 field5019;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lr", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5043;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "[Lho;")
    public static class318[] field5032;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "[S")
    private short[] field5030;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "[S")
    private short[] field5035;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "[S")
    private short[] field5038;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "[S")
    private short[] field5042;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lpd;IBIIILha;I)Lka;")
    public final class231 method2180(class645 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class473 arg6, int arg7) {
        field5016++;
        if (arg1 <= 125) {
            this.field5042 = null;
        }
        return this.method2183(arg5, arg3, 0, arg6, 0, arg2, arg4, 0, arg0, null, null, arg7, false, (byte) 127);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIILha;)V")
    public static final void method2181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class473 arg8) {
        field5020++;
        if (arg6 != 2) {
            return;
        }
        class466 var9 = (class466) class174.method1110(arg5, arg7, arg1);
        if (var9 != null) {
            class286 var10 = class390.field5558.method3065(64, var9.method760(-27640));
            int var11 = var9.method762(true) & 0x3;
            int var12 = var9.method756((byte) 103);
            if (var10.field4199 == -1) {
                int var13 = arg2;
                if (var10.field4137 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method2811(arg0, arg3, (byte) 125, 4, var13);
                    } else if (var11 == 1) {
                        arg8.method2816(4, (byte) -83, arg0, arg3, var13);
                    } else if (var11 == 2) {
                        arg8.method2811(arg0 + 3, arg3, (byte) -106, 4, var13);
                    } else if (var11 == 3) {
                        arg8.method2816(4, (byte) -83, arg0, arg3 + 3, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method2822(1, 1, arg0, 1, arg3, var13);
                    } else if (var11 == 1) {
                        arg8.method2822(1, 1, arg0 + 3, arg6 ^ 0x3, arg3, var13);
                    } else if (var11 == 2) {
                        arg8.method2822(1, 1, arg0 + 3, 1, arg3 + 3, var13);
                    } else if (var11 == 3) {
                        arg8.method2822(1, 1, arg0, 1, arg3 + 3, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method2816(4, (byte) -83, arg0, arg3, var13);
                    } else if (var11 == 1) {
                        arg8.method2811(arg0 + 3, arg3, (byte) -47, 4, var13);
                    } else if (var11 == 2) {
                        arg8.method2816(4, (byte) -83, arg0, arg3 + 3, var13);
                    } else if (var11 == 3) {
                        arg8.method2811(arg0, arg3, (byte) 123, 4, var13);
                    }
                }
            } else {
                class235.method1608(arg0, arg8, var10, (byte) -86, var11, arg3);
            }
        }
        class466 var14 = (class466) class485.method2882(arg5, arg7, arg1, field5043 == null ? (field5043 = method2190("oc")) : field5043);
        if (var14 != null) {
            class286 var15 = class390.field5558.method3065(-126, var14.method760(-27640));
            int var16 = var14.method762(true) & 0x3;
            int var17 = var14.method756((byte) -49);
            if (var15.field4199 != -1) {
                class235.method1608(arg0, arg8, var15, (byte) -53, var16, arg3);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4137 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method2813(arg0 + 3, arg0, false, var18, arg3, arg3 + 3);
                } else {
                    arg8.method2813(arg0 + 3, arg0, false, var18, arg3 + 3, arg3);
                }
            }
        }
        class466 var19 = (class466) class349.method2197(arg5, arg7, arg1);
        if (var19 == null) {
            return;
        }
        class286 var20 = class390.field5558.method3065(117, var19.method760(arg6 - 27642));
        int var21 = var19.method762(true) & 0x3;
        if (var20.field4199 != -1) {
            class235.method1608(arg0, arg8, var20, (byte) -106, var21, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILs;IZILpd;IILs;IILha;)Lka;")
    public final class231 method2182(int arg0, int arg1, class418 arg2, int arg3, boolean arg4, int arg5, class645 arg6, int arg7, int arg8, class418 arg9, int arg10, int arg11, class473 arg12) {
        field5018++;
        return arg8 == 1 ? this.method2183(arg10, arg7, arg1, arg12, arg0, (byte) 2, arg11, arg3, arg6, arg9, arg2, arg5, arg4, (byte) 127) : null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILha;IBIILpd;Ls;Ls;IZB)Lka;")
    private final class231 method2183(int arg0, int arg1, int arg2, class473 arg3, int arg4, byte arg5, int arg6, int arg7, class645 arg8, class418 arg9, class418 arg10, int arg11, boolean arg12, byte arg13) {
        field5015++;
        int var15 = arg1;
        class73 var16 = this.field5023 == -1 || arg6 == -1 ? null : arg8.method3695(this.field5023, (byte) -123);
        boolean var17 = arg12 & this.field5031 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method541(arg11, false, arg6, (byte) -47);
        }
        if (var17) {
            var15 |= this.field5031 == 3 ? 7 : 2;
        }
        if (this.field5037 != 128) {
            var15 |= 0x2;
        }
        if (this.field5028 != 128 || this.field5021 != 0) {
            var15 |= 0x5;
        }
        class39 var18 = this.field5019.field10321;
        class231 var19;
        synchronized (this.field5019.field10321) {
            if (arg13 <= 126) {
                method2188(62);
            }
            var19 = (class231) this.field5019.field10321.method312(0, (long) (this.field5041 |= arg3.field6555 << 29));
        }
        if (var19 == null || arg3.method188(var19.method1587(), var15) != 0) {
            if (var19 != null) {
                var15 = arg3.method198(var15, var19.method1587());
            }
            int var20 = var15;
            if (this.field5042 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5035 != null) {
                var20 |= 0x8000;
            }
            class534 var21 = class93.method674(this.field5017, 4, 0, this.field5019.field10311);
            if (var21 == null) {
                return null;
            }
            if (var21.field7366 < 13) {
                var21.method3166(2, (byte) -16);
            }
            var19 = arg3.method231(var21, var20, this.field5019.field10322, this.field5029 + 64, this.field5039 + 850);
            if (this.field5042 != null) {
                for (int var22 = 0; var22 < this.field5042.length; var22++) {
                    var19.method1552(this.field5042[var22], this.field5030[var22]);
                }
            }
            if (this.field5035 != null) {
                for (int var23 = 0; var23 < this.field5035.length; var23++) {
                    var19.method1557(this.field5035[var23], this.field5038[var23]);
                }
            }
            var19.method1548(var15);
            class39 var24 = this.field5019.field10321;
            synchronized (this.field5019.field10321) {
                this.field5019.field10321.method305(var19, (long) (this.field5041 |= arg3.field6555 << 29), 18320);
            }
        }
        class231 var25 = var16 == null ? var19.method1584(arg5, var15, true) : var16.method540(0, arg5, arg6, arg11, 6372, var19, var15, arg0);
        if (this.field5028 != 128 || this.field5037 != 128) {
            var25.method1550(this.field5028, this.field5037, this.field5028);
        }
        if (this.field5021 != 0) {
            if (this.field5021 == 90) {
                var25.method1542(4096);
            }
            if (this.field5021 == 180) {
                var25.method1542(8192);
            }
            if (this.field5021 == 270) {
                var25.method1542(12288);
            }
        }
        if (var17) {
            var25.method1561(this.field5031, this.field5027, arg9, arg10, arg4, arg7, arg2);
        }
        var25.method1548(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
    public static final void method2184(int arg0, int arg1) {
        field5036++;
        class17 var2 = class245.method1634(arg1 - 16, (long) arg0, arg1);
        var2.method69(arg1 - 4);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lha;ZIIIILpd;)Lka;")
    public final class231 method2185(class473 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class645 arg6) {
        if (arg1) {
            return null;
        } else {
            field5024++;
            return this.method2183(arg3, arg4, 0, arg0, 0, (byte) 2, arg5, 0, arg6, null, null, arg2, false, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILgga;I)V")
    private final void method2186(int arg0, class511 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5017 = arg1.method3002(-1);
        } else if (arg0 == 2) {
            this.field5023 = arg1.method3002(-1);
        } else if (arg0 == 4) {
            this.field5028 = arg1.method3002(-1);
        } else if (arg0 == 5) {
            this.field5037 = arg1.method3002(-1);
        } else if (arg0 == 6) {
            this.field5021 = arg1.method3002(-1);
        } else if (arg0 == 7) {
            this.field5029 = arg1.method3013(-120);
        } else if (arg0 == 8) {
            this.field5039 = arg1.method3013(51);
        } else if (arg0 == 9) {
            this.field5027 = 8224;
            this.field5031 = 3;
        } else if (arg0 == 10) {
            this.field5022 = true;
        } else if (arg0 == 11) {
            this.field5031 = 1;
        } else if (arg0 == 12) {
            this.field5031 = 4;
        } else if (arg0 == 13) {
            this.field5031 = 5;
        } else if (arg0 == 14) {
            this.field5031 = 2;
            this.field5027 = arg1.method3013(-125) * 256;
        } else if (arg0 == 15) {
            this.field5031 = 3;
            this.field5027 = arg1.method3002(-1);
        } else if (arg0 == 16) {
            this.field5031 = 3;
            this.field5027 = arg1.method3008(64);
        } else if (arg0 == 40) {
            int var4 = arg1.method3013(-96);
            this.field5030 = new short[var4];
            this.field5042 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5042[var5] = (short) arg1.method3002(-1);
                this.field5030[var5] = (short) arg1.method3002(-1);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method3013(93);
            this.field5038 = new short[var6];
            this.field5035 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5035[var7] = (short) arg1.method3002(-1);
                this.field5038[var7] = (short) arg1.method3002(-1);
            }
        }
        if (arg2 < -66) {
            field5025++;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILgga;)V")
    public final void method2187(int arg0, class511 arg1) {
        while (true) {
            int var3 = arg1.method3013(-125);
            if (var3 == 0) {
                field5033++;
                if (arg0 != 1) {
                    this.method2180(null, -108, (byte) -45, -74, 40, 89, null, 31);
                    return;
                }
                return;
            }
            this.method2186(var3, arg1, -119);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method2188(int arg0) {
        field5040 = null;
        int var1 = -8 / ((arg0 + 29) / 52);
        field5032 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z")
    public static final boolean method2189(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field5032 = null;
        }
        field5026++;
        return (arg1 & 0x22) != 0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2190(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
