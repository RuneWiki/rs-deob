import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class169 extends class69 {

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2742 = " from your ignore list first.";

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Ljj;")
    public static class134 field2739;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Z")
    public static boolean field2743;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILil;)V")
    public static final void method1185(int arg0, class49 arg1) {
        if (arg0 >= -24) {
            return;
        }
        field2740++;
        class177 var2 = arg1.method375(0);
        arg1.field659 = var2.field2862;
        if (arg1.field644 == 0) {
            arg1.field683 = 0;
            return;
        }
        if (arg1.field672 != -1 && arg1.field642 == 0) {
            class21 var3 = class267.method1812((byte) 89, arg1.field672);
            if (arg1.field637 > 0 && var3.field267 == 0) {
                arg1.field683++;
                return;
            }
            if (arg1.field637 <= 0 && var3.field266 == 0) {
                arg1.field683++;
                return;
            }
        }
        if (arg1.field634 != -1 && arg1.field640 <= class9.field141) {
            class66 var4 = class271.method1826(arg1.field634, (byte) 120);
            if (var4.field925 && var4.field929 != -1) {
                class21 var5 = class267.method1812((byte) 89, var4.field929);
                if (arg1.field637 > 0 && var5.field267 == 0) {
                    arg1.field683++;
                    return;
                }
                if (arg1.field637 <= 0 && var5.field266 == 0) {
                    arg1.field683++;
                    return;
                }
            }
        }
        int var6 = arg1.field614;
        int var7 = arg1.field613;
        int var8 = arg1.field610[arg1.field644 - 1] * 128 + (arg1.method385((byte) 120) * 64);
        int var9 = arg1.field692[arg1.field644 - 1] * 128 + arg1.method385((byte) -66) * 64;
        if ((var8 - var6) > 256 || var8 - var6 < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg1.field613 = var9;
            arg1.field614 = var8;
            return;
        }
        if (var8 > var6) {
            if (var9 > var7) {
                arg1.field691 = 1280;
            } else if (var7 > var9) {
                arg1.field691 = 1792;
            } else {
                arg1.field691 = 1536;
            }
        } else if (var6 > var8) {
            if (var9 > var7) {
                arg1.field691 = 768;
            } else if (var9 < var7) {
                arg1.field691 = 256;
            } else {
                arg1.field691 = 512;
            }
        } else if (var9 > var7) {
            arg1.field691 = 1024;
        } else if (var7 > var9) {
            arg1.field691 = 0;
        }
        int var10 = arg1.field691 - arg1.field657 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var11 = 4;
        boolean var12 = true;
        int var13 = var2.field2835;
        if (var10 >= -256 && var10 <= 256) {
            var13 = var2.field2874;
        } else if (var10 >= 256 && var10 < 768) {
            var13 = var2.field2863;
        } else if (var10 >= -768 && var10 <= -256) {
            var13 = var2.field2842;
        }
        if (var13 == -1) {
            var13 = var2.field2874;
        }
        byte var14 = 1;
        arg1.field659 = var13;
        if (arg1 instanceof class275) {
            var12 = ((class275) arg1).field4439.field4306;
        }
        if (var12) {
            if (arg1.field691 != arg1.field657 && arg1.field603 == -1 && arg1.field611 != 0) {
                var11 = 2;
            }
            if (arg1.field644 > 2) {
                var11 = 6;
            }
            if (arg1.field644 > 3) {
                var11 = 8;
            }
            if (arg1.field683 > 0 && arg1.field644 > 1) {
                arg1.field683--;
                var11 = 8;
            }
        } else {
            if (arg1.field644 > 1) {
                var11 = 6;
            }
            if (arg1.field644 > 2) {
                var11 = 8;
            }
            if (arg1.field683 > 0 && arg1.field644 > 1) {
                arg1.field683--;
                var11 = 8;
            }
        }
        if (arg1.field689[arg1.field644 - 1] == 2) {
            var14 = 2;
            var11 <<= 0x1;
        } else if (arg1.field689[arg1.field644 - 1] == 0) {
            var11 >>= 0x1;
            var14 = 0;
        }
        if (var11 < 8 || var2.field2831 == -1) {
            if (var2.field2858 != -1 && var14 == 0) {
                if (arg1.field659 == var2.field2835 && var2.field2852 != -1) {
                    arg1.field659 = var2.field2852;
                } else if (arg1.field659 == var2.field2842 && var2.field2834 != -1) {
                    arg1.field659 = var2.field2834;
                } else if (arg1.field659 == var2.field2863 && var2.field2847 != -1) {
                    arg1.field659 = var2.field2847;
                } else {
                    arg1.field659 = var2.field2858;
                }
            }
        } else if (arg1.field659 == var2.field2835 && var2.field2865 != -1) {
            arg1.field659 = var2.field2865;
        } else if (arg1.field659 == var2.field2842 && var2.field2856 != -1) {
            arg1.field659 = var2.field2856;
        } else if (arg1.field659 == var2.field2863 && var2.field2838 != -1) {
            arg1.field659 = var2.field2838;
        } else {
            arg1.field659 = var2.field2831;
        }
        if (var2.field2841 != -1) {
            int var15 = var11 << 7;
            if (arg1.field644 == 1) {
                int var16 = arg1.field670 * arg1.field670;
                int var17 = (var9 < arg1.field613 ? arg1.field613 - var9 : -arg1.field613 + var9) << 7;
                int var18 = (var8 < arg1.field614 ? arg1.field614 - var8 : -arg1.field614 + var8) << 7;
                int var19 = var17 >= var18 ? var17 : var18;
                int var20 = var2.field2841 * 2 * var19;
                if (var20 < var16) {
                    arg1.field670 /= 2;
                } else if ((var16 / 2) > var19) {
                    arg1.field670 -= var2.field2841;
                    if (arg1.field670 < 0) {
                        arg1.field670 = 0;
                    }
                } else if (var15 > arg1.field670) {
                    arg1.field670 += var2.field2841;
                    if (arg1.field670 > var15) {
                        arg1.field670 = var15;
                    }
                }
            } else if (arg1.field670 < var15) {
                arg1.field670 += var2.field2841;
                if (var15 < arg1.field670) {
                    arg1.field670 = var15;
                }
            } else if (arg1.field670 > 0) {
                arg1.field670 -= var2.field2841;
                if (arg1.field670 < 0) {
                    arg1.field670 = 0;
                }
            }
            var11 = arg1.field670 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var9 > var7) {
            arg1.field613 += var11;
            if (var9 < arg1.field613) {
                arg1.field613 = var9;
            }
        } else if (var7 > var9) {
            arg1.field613 -= var11;
            if (arg1.field613 < var9) {
                arg1.field613 = var9;
            }
        }
        if (var6 < var8) {
            arg1.field614 += var11;
            if (var8 < arg1.field614) {
                arg1.field614 = var8;
            }
        } else if (var8 < var6) {
            arg1.field614 -= var11;
            if (var8 > arg1.field614) {
                arg1.field614 = var8;
            }
        }
        if (arg1.field614 != var8 || arg1.field613 != var9) {
            return;
        }
        arg1.field644--;
        if (arg1.field637 > 0) {
            arg1.field637--;
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
    public static final int method1186(int arg0, int arg1, int arg2) {
        if (arg0 != 251194207) {
            field2742 = null;
        }
        field2744++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static void method1187(int arg0) {
        if (arg0 >= 83) {
            field2739 = null;
            field2742 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(II)V")
    public class169(int arg0, int arg1) {
        this.field2746 = arg0;
        this.field2738 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhi;BLjava/lang/String;)I")
    public static final int method1188(class264 arg0, byte arg1, String arg2) {
        if (arg1 != -80) {
            method1185(-9, (class49) null);
        }
        field2745++;
        int var3 = arg0.field4195;
        byte[] var4 = class175.method1216(arg2, 126);
        arg0.method1782(var4.length, 32768);
        arg0.field4195 += class46.field562.method1562(arg0.field4198, var4.length, arg1 ^ 0xFFFFFFD5, 0, arg0.field4195, var4);
        return arg0.field4195 - var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method1189(byte arg0) {
        field2737++;
        class197.field3176.method1831(-105);
        if (arg0 < 55) {
            field2743 = false;
        }
    }
}
