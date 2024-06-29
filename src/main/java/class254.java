import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class254 implements class640 {

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    private int field3440 = 0;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    private int field3438 = -1;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "[Leda;")
    private class87[] field3454 = new class87[9];

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "Llj;")
    private class565 field3448;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "Leg;")
    public static class93 field3441 = new class93();

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
    public static int field3462 = 0;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "[I")
    public static int[] field3463 = new int[2048];

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
    private int field3466;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V", line = 5)
    public final void method1549(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field3458++;
        if (arg0 != -8442) {
            this.method1558(-82);
        }
        this.field3440 &= 0xFFFFFFFB;
        this.field3438 = this.method1551(-17541);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIILcw;)V", line = 18)
    private final void method1550(int arg0, int arg1, int arg2, class164 arg3) {
        field3449++;
        if (this.field3438 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg2 << arg0;
        if ((~var5 & this.field3445) == 0) {
            this.field3466 = arg3.field2350;
            this.field3439 = arg3.field2346;
        } else if (this.field3439 != arg3.field2346 || this.field3466 != arg3.field2350) {
            throw new RuntimeException();
        }
        arg3.method1149(this.field3438, class390.field5519[arg0], 3317, arg1);
        this.field3454[arg0] = arg3;
        this.field3445 |= var5;
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)I", line = 46)
    private final int method1551(int arg0) {
        field3452++;
        if ((this.field3440 & 0x4) != 0) {
            return 36160;
        }
        if (arg0 != -17541) {
            field3462 = 63;
        }
        if ((this.field3440 & 0x2) == 0) {
            return (this.field3440 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V", line = 75)
    public final void method1552(int arg0) {
        field3442++;
        if (arg0 != -2028) {
            this.method1552(104);
        }
        OpenGL.glBindFramebufferEXT(36008, this.field3455);
        this.field3440 |= 0x1;
        this.field3438 = this.method1551(-17541);
    }

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "(I)V", line = 88)
    public static void method1553(int arg0) {
        field3441 = null;
        field3463 = null;
        if (arg0 != 2051) {
            field3462 = -42;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V", line = 103)
    public final void method1554(boolean arg0) {
        if (arg0) {
            method1555(-12, null, 38, 35, 75, 57, 64);
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        field3456++;
        this.field3440 &= 0xFFFFFFFE;
        this.field3438 = this.method1551(-17541);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[BIIIII)V", line = 116)
    public static final void method1555(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3437++;
        if (arg5 > 0 && !class588.method3342(-105, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class588.method3342(arg3 + 28362, arg0)) {
            int var7 = class363.method2070(79, arg6);
            int var8 = 0;
            if (arg3 == -28473) {
                int var9 = arg5 >= arg0 ? arg0 : arg5;
                int var10 = arg5 >> 1;
                int var11 = arg0 >> 1;
                byte[] var12 = arg1;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg4, var8, arg2, arg5, arg0, 0, arg6, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg5 * var7;
                    for (int var15 = 0; var15 < var7; var15++) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = (byte) (var27 >> 2);
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    byte[] var16 = var13;
                    var13 = var12;
                    var12 = var16;
                    arg0 = var11;
                    arg5 = var10;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                    var8++;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V", line = 216)
    public final void method1556(byte arg0) {
        field3461++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field3440 &= 0xFFFFFFFD;
        if (arg0 >= -103) {
            this.field3466 = -21;
        }
        this.field3438 = this.method1551(-17541);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Llj;)V", line = 967)
    public class254(class565 arg0) {
        if (!arg0.field7949) {
            throw new IllegalStateException("");
        }
        this.field3448 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class458.field6351, 0);
        this.field3455 = class458.field6351[0];
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V", line = 235)
    public final void method1557(boolean arg0, int arg1) {
        field3460++;
        if (arg0) {
            this.method1559(-68, -74);
        }
        if (this.field3438 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class390.field5519[arg1]);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 250)
    public final void method1558(int arg0) {
        field3453++;
        OpenGL.glBindFramebufferEXT(36160, this.field3455);
        if (arg0 == -4243) {
            this.field3440 |= 0x4;
            this.field3438 = this.method1551(-17541);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V", line = 265)
    public final void method1559(int arg0, int arg1) {
        field3435++;
        if (this.field3438 == -1) {
            throw new RuntimeException();
        }
        int var3 = -80 / ((arg1 - 59) / 56);
        OpenGL.glReadBuffer(class390.field5519[arg0]);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lac;BI)Ljava/lang/String;", line = 285)
    public static final String method1560(class501 arg0, byte arg1, int arg2) {
        field3451++;
        try {
            int var3 = arg0.method2871((byte) -87);
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field6892 += class84.field1246.method3400(var3, var4, arg0.field6892, arg0.field6855, -1, 0);
            String var5 = class148.method1088(var3, (byte) 124, var4, 0);
            int var6 = 122 / ((2 - arg1) / 43);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILhda;I)V", line = 315)
    public final void method1561(int arg0, int arg1, class696 arg2, int arg3) {
        this.method1568((byte) 42, 0, arg0, arg2, arg3);
        field3446++;
        if (arg1 != 6682) {
            field3465 = 75;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZILvfa;)V", line = 326)
    public final void method1562(boolean arg0, int arg1, class624 arg2) {
        field3443++;
        if (this.field3438 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if (!arg0) {
            return;
        }
        if ((this.field3445 & ~var4) == 0) {
            this.field3439 = arg2.field8656;
            this.field3466 = arg2.field8666;
        } else if (this.field3439 != arg2.field8656 || this.field3466 != arg2.field8666) {
            throw new RuntimeException();
        }
        arg2.method3468(class390.field5519[arg1], this.field3438, 0);
        this.field3454[arg1] = arg2;
        this.field3445 |= var4;
    }

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)Z", line = 356)
    public final boolean method1563(int arg0) {
        field3468++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3438);
        if (var2 == 36053) {
            if (arg0 != -6236) {
                this.method1558(33);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(Z)V", line = 376)
    public final void method1564(boolean arg0) {
        field3444++;
        OpenGL.glBindFramebufferEXT(36009, this.field3455);
        this.field3440 |= 0x2;
        if (arg0) {
            this.field3438 = this.method1551(-17541);
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(II)V", line = 389)
    public final void method1565(int arg0, int arg1) {
        field3457++;
        int var3 = -112 / ((46 - arg0) / 44);
        if (this.field3454[arg1] != null) {
            this.field3454[arg1].method240((byte) -8);
        }
        this.field3445 &= ~(0x1 << arg1);
        this.field3454[arg1] = null;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(Z)Z", line = 405)
    public static final boolean method1566(boolean arg0) {
        field3467++;
        try {
            class598 var1 = new class598();
            byte[] var2 = var1.method3377(45, class300.field4086);
            class63.method518(arg0, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lcw;BI)V", line = 426)
    public final void method1567(class164 arg0, byte arg1, int arg2) {
        if (arg1 != 40) {
            this.method1565(-23, -105);
        }
        this.method1550(arg2, 0, 1, arg0);
        field3436++;
    }

    @OriginalMember(owner = "client!vca", name = "finalize", descriptor = "()V", line = 442)
    protected final void finalize() throws Throwable {
        this.field3448.method3226(false, this.field3455);
        field3450++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BIILhda;I)V", line = 454)
    private final void method1568(byte arg0, int arg1, int arg2, class696 arg3, int arg4) {
        field3464++;
        if (arg0 != 42) {
            return;
        }
        if (this.field3438 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg4;
        if ((~var6 & this.field3445) == 0) {
            this.field3466 = arg3.field9889;
            this.field3439 = arg3.field9889;
        } else if (this.field3439 != arg3.field9889 || this.field3466 != arg3.field9889) {
            throw new RuntimeException();
        }
        arg3.method3908(arg2, -7, arg1, this.field3438, class390.field5519[arg4]);
        this.field3454[arg4] = arg3;
        this.field3445 |= var6;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lls;Z)V", line = 500)
    public static final void method1569(class124 arg0, boolean arg1) {
        field3447++;
        if (arg0.field1761 != -1) {
            class403 var2 = class192.field2727.method3090(-77, arg0.field1761);
            if (var2 == null || var2.field5667 == null) {
                arg0.field1703 = false;
                arg0.field1761 = -1;
            } else {
                label365: {
                    arg0.field1704++;
                    if (var2.field5667.length > arg0.field1781 && var2.field5646[arg0.field1781] < arg0.field1704) {
                        arg0.field1698++;
                        arg0.field1704 = 1;
                        arg0.field1781++;
                        if (!arg0.field1764) {
                            class234.method1476(arg0, var2, arg0.field1781, (byte) 121);
                        }
                    }
                    if (arg0.field1781 >= var2.field5667.length) {
                        arg0.field1704 = 0;
                        arg0.field1781 = 0;
                        if (arg0.field1703) {
                            arg0.field1761 = arg0.method895(-25227).method565(0);
                            if (arg0.field1761 == -1) {
                                arg0.field1703 = false;
                                break label365;
                            }
                            var2 = class192.field2727.method3090(63, arg0.field1761);
                        }
                        if (!arg0.field1764) {
                            class234.method1476(arg0, var2, arg0.field1781, (byte) 13);
                        }
                    }
                    arg0.field1698 = arg0.field1781 + 1;
                    if (var2.field5667 == null) {
                        arg0.field1703 = false;
                        arg0.field1761 = -1;
                    } else if (arg0.field1698 >= var2.field5667.length) {
                        arg0.field1698 = 0;
                    }
                }
            }
        }
        if (arg0.field1724 != -1 && arg0.field1749 <= class186.field2697) {
            class157 var3 = class430.field5994.method1993(arg0.field1724, 64);
            int var4 = var3.field2290;
            if (var4 == -1) {
                arg0.field1724 = -1;
            } else {
                label366: {
                    class403 var5 = class192.field2727.method3090(79, var4);
                    if (var3.field2280) {
                        if (var5.field5661 == 3) {
                            if (arg0.field1802 > 0 && class186.field2697 >= arg0.field1770 && arg0.field1751 < class186.field2697) {
                                arg0.field1724 = -1;
                                break label366;
                            }
                        } else if (var5.field5661 == 1 && arg0.field1802 > 0 && class186.field2697 >= arg0.field1770 && arg0.field1751 < class186.field2697) {
                            arg0.field1749 = class186.field2697 + 1;
                            break label366;
                        }
                    }
                    if (var5 == null || var5.field5667 == null) {
                        arg0.field1724 = -1;
                    } else {
                        if (arg0.field1759 < 0) {
                            arg0.field1759 = 0;
                            if (!arg0.field1764) {
                                class234.method1476(arg0, var5, 0, (byte) -26);
                            }
                        }
                        arg0.field1758++;
                        if (var5.field5667.length > arg0.field1759 && arg0.field1758 > var5.field5646[arg0.field1759]) {
                            arg0.field1758 = 1;
                            arg0.field1759++;
                            if (!arg0.field1764) {
                                class234.method1476(arg0, var5, arg0.field1759, (byte) -82);
                            }
                        }
                        if (arg0.field1759 >= var5.field5667.length) {
                            if (var3.field2280) {
                                arg0.field1744++;
                                arg0.field1759 -= var5.field5643;
                                if (var5.field5657 <= arg0.field1744) {
                                    arg0.field1724 = -1;
                                } else if (arg0.field1759 < 0 || var5.field5667.length <= arg0.field1759) {
                                    arg0.field1724 = -1;
                                } else if (!arg0.field1764) {
                                    class234.method1476(arg0, var5, arg0.field1759, (byte) 121);
                                }
                            } else {
                                arg0.field1724 = -1;
                            }
                        }
                        arg0.field1721 = arg0.field1759 + 1;
                        if (var5.field5667.length <= arg0.field1721) {
                            if (var3.field2280) {
                                arg0.field1721 -= var5.field5643;
                                if (var5.field5657 <= (arg0.field1744 + 1)) {
                                    arg0.field1721 = -1;
                                } else if (arg0.field1721 < 0 || var5.field5667.length <= arg0.field1721) {
                                    arg0.field1721 = -1;
                                }
                            } else {
                                arg0.field1721 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1753 != -1 && class186.field2697 >= arg0.field1772) {
            class157 var6 = class430.field5994.method1993(arg0.field1753, 64);
            int var7 = var6.field2290;
            if (var7 == -1) {
                arg0.field1753 = -1;
            } else {
                label369: {
                    class403 var8 = class192.field2727.method3090(-124, var7);
                    if (var6.field2280) {
                        if (var8.field5661 == 3) {
                            if (arg0.field1802 > 0 && class186.field2697 >= arg0.field1770 && arg0.field1751 < class186.field2697) {
                                arg0.field1753 = -1;
                                break label369;
                            }
                        } else if (var8.field5661 == 1 && arg0.field1802 > 0 && class186.field2697 >= arg0.field1770 && class186.field2697 > arg0.field1751) {
                            arg0.field1772 = class186.field2697 + 1;
                            break label369;
                        }
                    }
                    if (var8 == null || var8.field5667 == null) {
                        arg0.field1753 = -1;
                    } else {
                        if (arg0.field1790 < 0) {
                            arg0.field1790 = 0;
                            if (!arg0.field1764) {
                                class234.method1476(arg0, var8, 0, (byte) 124);
                            }
                        }
                        arg0.field1780++;
                        if (arg0.field1790 < var8.field5667.length && var8.field5646[arg0.field1790] < arg0.field1780) {
                            arg0.field1790++;
                            arg0.field1780 = 1;
                            if (!arg0.field1764) {
                                class234.method1476(arg0, var8, arg0.field1790, (byte) -12);
                            }
                        }
                        if (arg0.field1790 >= var8.field5667.length) {
                            if (var6.field2280) {
                                arg0.field1726++;
                                arg0.field1790 -= var8.field5643;
                                if (arg0.field1726 >= var8.field5657) {
                                    arg0.field1753 = -1;
                                } else if (arg0.field1790 < 0 || arg0.field1790 >= var8.field5667.length) {
                                    arg0.field1753 = -1;
                                } else if (!arg0.field1764) {
                                    class234.method1476(arg0, var8, arg0.field1790, (byte) -116);
                                }
                            } else {
                                arg0.field1753 = -1;
                            }
                        }
                        arg0.field1707 = arg0.field1790 + 1;
                        if (arg0.field1707 >= var8.field5667.length) {
                            if (var6.field2280) {
                                arg0.field1707 -= var8.field5643;
                                if (arg0.field1726 + 1 >= var8.field5657) {
                                    arg0.field1707 = -1;
                                } else if (arg0.field1707 < 0 || var8.field5667.length <= arg0.field1707) {
                                    arg0.field1707 = -1;
                                }
                            } else {
                                arg0.field1707 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method1553(-94);
        }
        if (arg0.field1779 != -1 && arg0.field1706 <= 1) {
            class403 var9 = class192.field2727.method3090(107, arg0.field1779);
            if (var9.field5661 == 3) {
                if (arg0.field1802 > 0 && arg0.field1770 <= class186.field2697 && class186.field2697 > arg0.field1751) {
                    arg0.field1735 = null;
                    arg0.field1779 = -1;
                }
            } else if (var9.field5661 == 1 && arg0.field1802 > 0 && class186.field2697 >= arg0.field1770 && class186.field2697 > arg0.field1751) {
                arg0.field1706 = 2;
            }
        }
        if (arg0.field1779 != -1 && arg0.field1706 == 0) {
            class403 var10 = class192.field2727.method3090(-86, arg0.field1779);
            if (var10 == null || var10.field5667 == null) {
                arg0.field1735 = null;
                arg0.field1779 = -1;
            } else {
                arg0.field1766++;
                if (var10.field5667.length > arg0.field1739 && arg0.field1766 > var10.field5646[arg0.field1739]) {
                    arg0.field1739++;
                    arg0.field1766 = 1;
                    if (!arg0.field1764) {
                        class234.method1476(arg0, var10, arg0.field1739, (byte) -108);
                    }
                }
                if (var10.field5667.length <= arg0.field1739) {
                    arg0.field1739 -= var10.field5643;
                    arg0.field1722++;
                    if (var10.field5657 <= arg0.field1722) {
                        arg0.field1735 = null;
                        arg0.field1779 = -1;
                    } else if (arg0.field1739 < 0 || arg0.field1739 >= var10.field5667.length) {
                        arg0.field1779 = -1;
                        arg0.field1735 = null;
                    } else if (!arg0.field1764) {
                        class234.method1476(arg0, var10, arg0.field1739, (byte) 126);
                    }
                }
                arg0.field1784 = arg0.field1739 + 1;
                if (var10.field5667.length <= arg0.field1784) {
                    arg0.field1784 -= var10.field5643;
                    if ((arg0.field1722 + 1) >= var10.field5657) {
                        arg0.field1784 = -1;
                    } else if (arg0.field1784 < 0 || var10.field5667.length <= arg0.field1784) {
                        arg0.field1784 = -1;
                    }
                }
            }
        }
        if (arg0.field1706 > 0) {
            arg0.field1706--;
        }
        for (int var11 = 0; var11 < arg0.field1794.length; var11++) {
            class133 var12 = arg0.field1794[var11];
            if (var12 != null) {
                if (var12.field1895 > 0) {
                    var12.field1895--;
                } else {
                    class403 var13 = class192.field2727.method3090(-121, var12.field1897);
                    if (var13 == null || var13.field5667 == null) {
                        arg0.field1794[var11] = null;
                    } else {
                        var12.field1893++;
                        if (var13.field5667.length > var12.field1899 && var12.field1893 > var13.field5646[var12.field1899]) {
                            var12.field1899++;
                            var12.field1893 = 1;
                            if (!arg0.field1764) {
                                class234.method1476(arg0, var13, var12.field1899, (byte) -23);
                            }
                        }
                        if (var13.field5667.length <= var12.field1899) {
                            var12.field1898++;
                            var12.field1899 -= var13.field5643;
                            if (var12.field1898 >= var13.field5657) {
                                arg0.field1794[var11] = null;
                            } else if (var12.field1899 < 0 || var12.field1899 >= var13.field5667.length) {
                                arg0.field1794[var11] = null;
                            } else if (!arg0.field1764) {
                                class234.method1476(arg0, var13, var12.field1899, (byte) 127);
                            }
                        }
                        var12.field1896 = var12.field1899 + 1;
                        if (var12.field1896 >= var13.field5667.length) {
                            var12.field1896 -= var13.field5643;
                            if (var12.field1898 + 1 >= var13.field5657) {
                                var12.field1896 = -1;
                            } else if (var12.field1896 < 0 || var12.field1896 >= var13.field5667.length) {
                                var12.field1896 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
