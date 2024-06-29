import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class108 {

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    private int field1873;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    private int field1859;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[[I")
    public int[][] field1856;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lid;")
    public static class149 field1855 = class60.method382("http:)4)4", (byte) 111);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lvj;")
    public static class115 field1868 = new class115(64);

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "[Lqk;")
    public static class208[] field1877 = new class208[0];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lal;")
    public static class230 field1871;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[I")
    public static int[] field1865;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[[I")
    public static int[][] field1867;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[[[B")
    public static byte[][][] field1883;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1880++;
        if ((arg5 + arg6) > arg7 && arg5 < (arg7 + arg3)) {
            if (arg2 != 0) {
                this.field1856 = null;
            }
            return (arg1 + arg4) > arg0 && (arg0 + arg8) > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBI)V")
    private final void method748(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -40) {
            this.method757(110, 34, 51, -104, 23, 126, -49, -67);
        }
        field1884++;
        this.field1856[arg1][arg3] = class40.method238(this.field1856[arg1][arg3], arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIZ)V")
    public final void method749(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field1859;
        field1875++;
        int var8 = arg2 - this.field1876;
        if (arg1 != -1) {
            this.field1856 = null;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method767(128, var8, (byte) 49, var7);
                this.method767(8, var8 - 1, (byte) 87, var7);
            }
            if (arg4 == 1) {
                this.method767(2, var8, (byte) 92, var7);
                this.method767(32, var8, (byte) 64, var7 + 1);
            }
            if (arg4 == 2) {
                this.method767(8, var8, (byte) -73, var7);
                this.method767(128, var8 + 1, (byte) -80, var7);
            }
            if (arg4 == 3) {
                this.method767(32, var8, (byte) 103, var7);
                this.method767(2, var8, (byte) 115, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method767(1, var8, (byte) -89, var7);
                this.method767(16, var8 - 1, (byte) -76, var7 + 1);
            }
            if (arg4 == 1) {
                this.method767(4, var8, (byte) 95, var7);
                this.method767(64, var8 + 1, (byte) 123, var7 + 1);
            }
            if (arg4 == 2) {
                this.method767(16, var8, (byte) 72, var7);
                this.method767(1, var8 + 1, (byte) -127, var7 - 1);
            }
            if (arg4 == 3) {
                this.method767(64, var8, (byte) -127, var7);
                this.method767(4, var8 - 1, (byte) -74, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method767(130, var8, (byte) -74, var7);
                this.method767(8, var8 - 1, (byte) 69, var7);
                this.method767(32, var8, (byte) -86, var7 + 1);
            }
            if (arg4 == 1) {
                this.method767(10, var8, (byte) 76, var7);
                this.method767(32, var8, (byte) 122, var7 + 1);
                this.method767(128, var8 + 1, (byte) 109, var7);
            }
            if (arg4 == 2) {
                this.method767(40, var8, (byte) 93, var7);
                this.method767(128, var8 + 1, (byte) 113, var7);
                this.method767(2, var8, (byte) -118, var7 - 1);
            }
            if (arg4 == 3) {
                this.method767(160, var8, (byte) 124, var7);
                this.method767(2, var8, (byte) -113, var7 - 1);
                this.method767(8, var8 - 1, (byte) -89, var7);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method767(65536, var8, (byte) 87, var7);
                this.method767(4096, var8 - 1, (byte) 61, var7);
            }
            if (arg4 == 1) {
                this.method767(1024, var8, (byte) -122, var7);
                this.method767(16384, var8, (byte) 83, var7 + 1);
            }
            if (arg4 == 2) {
                this.method767(4096, var8, (byte) 65, var7);
                this.method767(65536, var8 + 1, (byte) -78, var7);
            }
            if (arg4 == 3) {
                this.method767(16384, var8, (byte) -126, var7);
                this.method767(1024, var8, (byte) 81, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method767(512, var8, (byte) -109, var7);
                this.method767(8192, var8 - 1, (byte) -81, var7 + 1);
            }
            if (arg4 == 1) {
                this.method767(2048, var8, (byte) -105, var7);
                this.method767(32768, var8 + 1, (byte) 55, var7 + 1);
            }
            if (arg4 == 2) {
                this.method767(8192, var8, (byte) -97, var7);
                this.method767(512, var8 + 1, (byte) -76, var7 - 1);
            }
            if (arg4 == 3) {
                this.method767(32768, var8, (byte) -91, var7);
                this.method767(2048, var8 - 1, (byte) 119, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method767(66560, var8, (byte) 108, var7);
            this.method767(4096, var8 - 1, (byte) -106, var7);
            this.method767(16384, var8, (byte) -81, var7 + 1);
        }
        if (arg4 == 1) {
            this.method767(5120, var8, (byte) 96, var7);
            this.method767(16384, var8, (byte) 55, var7 + 1);
            this.method767(65536, var8 + 1, (byte) -123, var7);
        }
        if (arg4 == 2) {
            this.method767(20480, var8, (byte) -125, var7);
            this.method767(65536, var8 + 1, (byte) -114, var7);
            this.method767(1024, var8, (byte) 68, var7 - 1);
        }
        if (arg4 == 3) {
            this.method767(81920, var8, (byte) 115, var7);
            this.method767(1024, var8, (byte) 80, var7 - 1);
            this.method767(4096, var8 - 1, (byte) 106, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIBIIII)Z")
    private final boolean method750(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field1878++;
        int var11 = arg2 + arg6;
        int var12 = arg1 + arg9;
        int var13 = arg0 + arg8;
        if (arg5 > -22) {
            method755(127, 50);
        }
        int var14 = arg4 + arg3;
        if (arg4 <= arg2 && var14 > arg2) {
            if (arg8 == var12 && (arg7 & 0x4) == 0) {
                int var15 = arg2;
                int var16 = var14 < var11 ? var14 : var11;
                while (var15 < var16) {
                    if ((this.field1856[var15 - this.field1876][var12 - this.field1859 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg1 == var13 && (arg7 & 0x1) == 0) {
                int var17 = arg2;
                int var18 = var14 >= var11 ? var11 : var14;
                while (var18 > var17) {
                    if ((this.field1856[var17 - this.field1876][arg1 - this.field1859] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg4 && var14 >= var11) {
            if (arg8 == var12 && (arg7 & 0x4) == 0) {
                for (int var19 = arg4; var19 < var11; var19++) {
                    if ((this.field1856[var19 - this.field1876][var12 - this.field1859 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg7 & 0x1) == 0) {
                for (int var20 = arg4; var20 < var11; var20++) {
                    if ((this.field1856[var20 - this.field1876][arg1 - this.field1859] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg1 >= arg8 && var13 > arg1) {
            if (arg4 == var11 && (arg7 & 0x8) == 0) {
                int var21 = var12 <= var13 ? var12 : var13;
                for (int var22 = arg1; var22 < var21; var22++) {
                    if ((this.field1856[var11 - this.field1876 - 1][var22 - this.field1859] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var14 && (arg7 & 0x2) == 0) {
                int var23 = var12 <= var13 ? var12 : var13;
                for (int var24 = arg1; var24 < var23; var24++) {
                    if ((this.field1856[arg2 - this.field1876][var24 - this.field1859] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var12 > arg8 && var12 <= var13) {
            if (arg4 == var11 && (arg7 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field1856[var11 - this.field1876 - 1][var25 - this.field1859] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var14 && (arg7 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field1856[arg2 - this.field1876][var26 - this.field1859] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method751(Component arg0, int arg1) {
        arg0.removeMouseListener(class86.field1570);
        field1860++;
        arg0.removeMouseMotionListener(class86.field1570);
        arg0.removeFocusListener(class86.field1570);
        class264.field4734 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method752(int arg0) {
        class19.field289.method1291(0);
        class25.field373.method1291(0);
        field1853++;
        class102.field1796.method1291(0);
        int var1 = -22 / ((3 - arg0) / 48);
        class279.field4981.method1291(0);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public final void method753(int arg0) {
        for (int var2 = 0; var2 < this.field1881; var2++) {
            for (int var3 = 0; var3 < this.field1873; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field1881 - 5) || this.field1873 - 5 <= var3) {
                    this.field1856[var2][var3] = 16777215;
                } else {
                    this.field1856[var2][var3] = 16777216;
                }
            }
        }
        field1858++;
        if (arg0 <= 7) {
            field1883 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public final void method754(int arg0, int arg1, int arg2) {
        if (arg2 == -26742) {
            field1869++;
            int var4 = arg0 - this.field1859;
            int var5 = arg1 - this.field1876;
            this.field1856[var5][var4] = class40.method238(this.field1856[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Ljb;")
    public static final class268 method755(int arg0, int arg1) {
        class268 var2 = (class268) class19.field289.method1293((long) arg1, false);
        field1863++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field1310.method1562(arg0 - 809624190, class126.method881(arg1, true), class210.method1430(arg1, -26));
        class268 var4 = new class268();
        var4.field4773 = arg1;
        if (var3 != null) {
            var4.method1867(new class74(var3), arg0 - 4102);
        }
        var4.method1866(114);
        if (!class40.field629 && var4.field4832) {
            var4.field4825 = null;
        }
        if (var4.field4768) {
            var4.field4801 = false;
            var4.field4831 = 0;
        }
        if (arg0 == 11525) {
            class19.field289.method1295((long) arg1, var4, (byte) -71);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)J")
    public static final long method756(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        return var3 == null || var3.field4053 == null ? 0L : var3.field4053.field2200;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1872++;
        if (arg2 == 1) {
            if (arg1 == arg3 && arg5 == arg6) {
                return true;
            }
        } else if (arg1 <= arg3 && arg3 <= arg1 + arg2 - 1 && arg6 >= arg6 && arg2 + arg6 - 1 >= arg6) {
            return true;
        }
        int var9 = arg5 - this.field1859;
        int var10 = arg1 - this.field1876;
        int var11 = arg3 - this.field1876;
        if (arg4 > -4) {
            this.field1873 = -109;
        }
        int var12 = arg6 - this.field1859;
        if (arg2 == 1) {
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1856[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field1856[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1856[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1856[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1856[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field1856[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1856[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1856[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field1856[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field1856[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field1856[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg2 - 1;
            int var14 = var9 - (1 - arg2);
            if (arg0 == 0) {
                if (arg7 == 0) {
                    if ((var11 - arg2) == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field1856[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg2) == var9 && (this.field1856[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - arg2) == var10 && var9 <= var12 && var12 <= var14 && (this.field1856[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field1856[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field1856[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg2) == var9 && (this.field1856[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg2) == var9) {
                        return true;
                    }
                    if (var11 - arg2 == var10 && var9 <= var12 && var14 >= var12 && (this.field1856[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field1856[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 0) {
                    if (var11 - arg2 == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field1856[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg2 == var9 && (this.field1856[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - arg2 == var10 && var12 >= var9 && var12 <= var14 && (this.field1856[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 - arg2) == var9 && (this.field1856[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - arg2 == var10 && var12 >= var9 && var14 >= var12 && (this.field1856[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9 && (this.field1856[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg2) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - arg2 == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field1856[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field1856[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg2 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field1856[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var10 && var13 >= var11 && var12 - arg2 == var9 && (this.field1856[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg2 == var10 && var12 >= var9 && var12 <= var14 && (this.field1856[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field1856[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBZIII)V")
    public final void method758(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1876;
        int var8 = arg5 - this.field1859;
        if (arg1 != 70) {
            field1871 = null;
        }
        field1874++;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg3 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field1881) {
                for (int var11 = var8; var11 < arg0 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field1873) {
                        this.method748(var9, var10, (byte) -84, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)V")
    public final void method759(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1859;
        int var5 = arg2 - this.field1876;
        this.field1856[var5][var4] = class40.method238(this.field1856[var5][var4], 262144);
        field1854++;
        if (arg0) {
            this.field1876 = -46;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILaj;III)V")
    public static final void method760(int arg0, class47 arg1, int arg2, int arg3, int arg4) {
        field1882++;
        if (arg2 > class62.field1109) {
            ((class46) class18.field261).method279(arg3, arg4, arg1.field722, arg1.field727, class18.field261.field3399 / 2, class18.field261.field3398 / 2, class55.field985, 256, arg1.field712, arg1.field870);
        } else {
            class72.method447(arg3, arg4, 0, arg1.field712, arg1.field870);
        }
        class216.field3819[arg0] = true;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V")
    public final void method761(int arg0, int arg1, int arg2) {
        field1864++;
        int var4 = arg2 - this.field1876;
        if (arg1 >= -67) {
            this.field1859 = 54;
        }
        int var5 = arg0 - this.field1859;
        this.field1856[var4][var5] = class136.method953(this.field1856[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZBIIIII)V")
    public final void method762(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field1876;
        if (arg1 >= -26) {
            this.method761(127, 13, 52);
        }
        field1866++;
        if (arg6 == 1 || arg6 == 3) {
            int var9 = arg3;
            arg3 = arg5;
            arg5 = var9;
        }
        int var10 = 256;
        int var11 = arg2 - this.field1859;
        if (arg0) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < (var8 + arg3); var12++) {
            if (var12 >= 0 && this.field1881 > var12) {
                for (int var13 = var11; var13 < arg5 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field1873) {
                        this.method767(var10, var12, (byte) -73, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method763(byte arg0) {
        field1855 = null;
        field1871 = null;
        field1867 = null;
        field1883 = null;
        field1868 = null;
        int var1 = 82 % ((16 - arg0) / 55);
        field1865 = null;
        field1877 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method764(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1861++;
        if (arg1 == 1) {
            if (arg0 == arg6 && arg4 == arg7) {
                return true;
            }
        } else if (arg6 <= arg0 && arg1 + arg6 - 1 >= arg0 && arg4 <= arg4 && arg4 <= (arg4 + arg1 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field1859;
        int var10 = arg0 - this.field1876;
        int var11 = arg4 - this.field1859;
        int var12 = -6 / ((14 - arg3) / 62);
        int var13 = arg6 - this.field1876;
        if (arg1 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var13 && var9 == var11 && (this.field1856[var13][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var13 && var11 - 1 == var9 && (this.field1856[var13][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - 1) == var13 && var9 == var11 && (this.field1856[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var13 && (var11 - 1) == var9 && (this.field1856[var13][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - 1 == var13 && var9 == var11 && (this.field1856[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var13 && (var11 + 1) == var9 && (this.field1856[var13][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 + 1) == var13 && var9 == var11 && (this.field1856[var13][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var13 && var11 + 1 == var9 && (this.field1856[var13][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var13 && (var11 + 1) == var9 && (this.field1856[var13][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var13 && var11 - 1 == var9 && (this.field1856[var13][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var13 && var9 == var11 && (this.field1856[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var13 && var9 == var11 && (this.field1856[var13][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg1 + var13 - 1;
            int var15 = var9 + arg1 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var10 + 1) == var13 && var9 <= var11 && var11 <= var15 && (this.field1856[var13][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && var11 - arg1 == var9 && (this.field1856[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg1 == var13 && var9 <= var11 && var11 <= var15 && (this.field1856[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && (var11 - arg1) == var9 && (this.field1856[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg1 == var13 && var11 >= var9 && var11 <= var15 && (this.field1856[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var13 <= var10 && var14 >= var10 && var11 + 1 == var9 && (this.field1856[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 + 1) == var13 && var11 >= var9 && var11 <= var15 && (this.field1856[var13][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var13 <= var10 && var14 >= var10 && var11 + 1 == var9 && (this.field1856[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 >= var13 && var10 <= var14 && var11 + 1 == var9 && (this.field1856[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var13 <= var10 && var14 >= var10 && (var11 - arg1) == var9 && (this.field1856[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var13 && var11 >= var9 && var15 >= var11 && (this.field1856[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var13 && var9 <= var11 && var15 >= var11 && (this.field1856[var13][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
    public static final void method765() {
        class8.field106 = 0;
        label191: for (int var0 = 0; var0 < class196.field3533; var0++) {
            class168 var1 = class206.field3693[var0];
            if (class109.field1889 != null) {
                for (int var2 = 0; var2 < class109.field1889.length; var2++) {
                    if (class109.field1889[var2] != -1000000 && (var1.field3101 <= class109.field1889[var2] || var1.field3121 <= class109.field1889[var2]) && (var1.field3103 <= class164.field3037[var2] || var1.field3107 <= class164.field3037[var2]) && (var1.field3103 >= class137.field2510[var2] || var1.field3107 >= class137.field2510[var2]) && (var1.field3109 <= class47.field792[var2] || var1.field3115 <= class47.field792[var2]) && (var1.field3109 >= class8.field103[var2] || var1.field3115 >= class8.field103[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3104 == 1) {
                int var3 = var1.field3113 + class200.field3624 - class118.field2011;
                if (var3 >= 0 && var3 <= class200.field3624 + class200.field3624) {
                    int var4 = var1.field3127 + class200.field3624 - class124.field2186;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3114 + class200.field3624 - class124.field2186;
                    if (var5 > class200.field3624 + class200.field3624) {
                        var5 = class200.field3624 + class200.field3624;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class272.field4897[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class82.field1495 - var1.field3103;
                        if (var7 > 32) {
                            var1.field3118 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3118 = 2;
                            var7 = -var7;
                        }
                        var1.field3105 = (var1.field3109 - class226.field3971 << 8) / var7;
                        var1.field3119 = (var1.field3115 - class226.field3971 << 8) / var7;
                        var1.field3106 = (var1.field3101 - class37.field554 << 8) / var7;
                        var1.field3102 = (var1.field3121 - class37.field554 << 8) / var7;
                        class173.field3200[class8.field106++] = var1;
                    }
                }
            } else if (var1.field3104 == 2) {
                int var8 = var1.field3127 + class200.field3624 - class124.field2186;
                if (var8 >= 0 && var8 <= class200.field3624 + class200.field3624) {
                    int var9 = var1.field3113 + class200.field3624 - class118.field2011;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3108 + class200.field3624 - class118.field2011;
                    if (var10 > class200.field3624 + class200.field3624) {
                        var10 = class200.field3624 + class200.field3624;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class272.field4897[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class226.field3971 - var1.field3109;
                        if (var12 > 32) {
                            var1.field3118 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3118 = 4;
                            var12 = -var12;
                        }
                        var1.field3110 = (var1.field3103 - class82.field1495 << 8) / var12;
                        var1.field3125 = (var1.field3107 - class82.field1495 << 8) / var12;
                        var1.field3106 = (var1.field3101 - class37.field554 << 8) / var12;
                        var1.field3102 = (var1.field3121 - class37.field554 << 8) / var12;
                        class173.field3200[class8.field106++] = var1;
                    }
                }
            } else if (var1.field3104 == 4) {
                int var13 = var1.field3101 - class37.field554;
                if (var13 > 128) {
                    int var14 = var1.field3127 + class200.field3624 - class124.field2186;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3114 + class200.field3624 - class124.field2186;
                    if (var15 > class200.field3624 + class200.field3624) {
                        var15 = class200.field3624 + class200.field3624;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3113 + class200.field3624 - class118.field2011;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3108 + class200.field3624 - class118.field2011;
                        if (var17 > class200.field3624 + class200.field3624) {
                            var17 = class200.field3624 + class200.field3624;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class272.field4897[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3118 = 5;
                            var1.field3110 = (var1.field3103 - class82.field1495 << 8) / var13;
                            var1.field3125 = (var1.field3107 - class82.field1495 << 8) / var13;
                            var1.field3105 = (var1.field3109 - class226.field3971 << 8) / var13;
                            var1.field3119 = (var1.field3115 - class226.field3971 << 8) / var13;
                            class173.field3200[class8.field106++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1879++;
        if (arg7 > 1) {
            return this.method747(arg8, arg2, 0, arg7, arg3, arg1, arg5, arg0, arg7) ? true : this.method750(arg3, arg8, arg0, arg5, arg1, (byte) -108, arg7, arg4, arg2, arg7);
        }
        int var10 = arg5 + arg1 - 1;
        int var11 = arg2 + arg3 - 1;
        if (arg1 <= arg0 && var10 >= arg0 && arg8 >= arg2 && var11 >= arg8) {
            return true;
        } else if ((arg1 - 1) == arg0 && arg2 <= arg8 && var11 >= arg8 && (this.field1856[arg0 - this.field1876][arg8 - this.field1859] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg8 >= arg2 && arg8 <= var11 && (this.field1856[arg0 - this.field1876][arg8 - this.field1859] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg8 && arg0 >= arg1 && var10 >= arg0 && (this.field1856[arg0 - this.field1876][arg8 - this.field1859] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            if (arg6 != 25417) {
                this.method753(112);
            }
            return (var11 + 1) == arg8 && arg1 <= arg0 && arg0 <= var10 && (this.field1856[arg0 - this.field1876][arg8 - this.field1859] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIBI)V")
    private final void method767(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = -37 % ((-arg2 - 12) / 61);
        field1862++;
        this.field1856[arg1][arg3] = class136.method953(this.field1856[arg1][arg3], ~arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZIIZI)V")
    public final void method768(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1870++;
        int var7 = arg0 - this.field1859;
        int var8 = arg2 - this.field1876;
        if (!arg1) {
            field1855 = null;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method748(128, var8, (byte) -50, var7);
                this.method748(8, var8 - 1, (byte) -120, var7);
            }
            if (arg5 == 1) {
                this.method748(2, var8, (byte) -93, var7);
                this.method748(32, var8, (byte) -112, var7 + 1);
            }
            if (arg5 == 2) {
                this.method748(8, var8, (byte) -80, var7);
                this.method748(128, var8 + 1, (byte) -80, var7);
            }
            if (arg5 == 3) {
                this.method748(32, var8, (byte) -70, var7);
                this.method748(2, var8, (byte) -91, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method748(1, var8, (byte) -68, var7);
                this.method748(16, var8 - 1, (byte) -69, var7 + 1);
            }
            if (arg5 == 1) {
                this.method748(4, var8, (byte) -72, var7);
                this.method748(64, var8 + 1, (byte) -126, var7 + 1);
            }
            if (arg5 == 2) {
                this.method748(16, var8, (byte) -77, var7);
                this.method748(1, var8 + 1, (byte) -124, var7 - 1);
            }
            if (arg5 == 3) {
                this.method748(64, var8, (byte) -114, var7);
                this.method748(4, var8 - 1, (byte) -128, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method748(130, var8, (byte) -78, var7);
                this.method748(8, var8 - 1, (byte) -123, var7);
                this.method748(32, var8, (byte) -109, var7 + 1);
            }
            if (arg5 == 1) {
                this.method748(10, var8, (byte) -118, var7);
                this.method748(32, var8, (byte) -84, var7 + 1);
                this.method748(128, var8 + 1, (byte) -91, var7);
            }
            if (arg5 == 2) {
                this.method748(40, var8, (byte) -89, var7);
                this.method748(128, var8 + 1, (byte) -128, var7);
                this.method748(2, var8, (byte) -79, var7 - 1);
            }
            if (arg5 == 3) {
                this.method748(160, var8, (byte) -63, var7);
                this.method748(2, var8, (byte) -98, var7 - 1);
                this.method748(8, var8 - 1, (byte) -123, var7);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method748(65536, var8, (byte) -116, var7);
                this.method748(4096, var8 - 1, (byte) -109, var7);
            }
            if (arg5 == 1) {
                this.method748(1024, var8, (byte) -114, var7);
                this.method748(16384, var8, (byte) -80, var7 + 1);
            }
            if (arg5 == 2) {
                this.method748(4096, var8, (byte) -120, var7);
                this.method748(65536, var8 + 1, (byte) -106, var7);
            }
            if (arg5 == 3) {
                this.method748(16384, var8, (byte) -105, var7);
                this.method748(1024, var8, (byte) -75, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method748(512, var8, (byte) -72, var7);
                this.method748(8192, var8 - 1, (byte) -43, var7 + 1);
            }
            if (arg5 == 1) {
                this.method748(2048, var8, (byte) -67, var7);
                this.method748(32768, var8 + 1, (byte) -70, var7 + 1);
            }
            if (arg5 == 2) {
                this.method748(8192, var8, (byte) -87, var7);
                this.method748(512, var8 + 1, (byte) -105, var7 - 1);
            }
            if (arg5 == 3) {
                this.method748(32768, var8, (byte) -106, var7);
                this.method748(2048, var8 - 1, (byte) -111, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method748(66560, var8, (byte) -104, var7);
            this.method748(4096, var8 - 1, (byte) -117, var7);
            this.method748(16384, var8, (byte) -84, var7 + 1);
        }
        if (arg5 == 1) {
            this.method748(5120, var8, (byte) -49, var7);
            this.method748(16384, var8, (byte) -85, var7 + 1);
            this.method748(65536, var8 + 1, (byte) -85, var7);
        }
        if (arg5 == 2) {
            this.method748(20480, var8, (byte) -62, var7);
            this.method748(65536, var8 + 1, (byte) -47, var7);
            this.method748(1024, var8, (byte) -103, var7 - 1);
        }
        if (arg5 == 3) {
            this.method748(81920, var8, (byte) -118, var7);
            this.method748(1024, var8, (byte) -82, var7 - 1);
            this.method748(4096, var8 - 1, (byte) -79, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
    public class108(int arg0, int arg1) {
        this.field1881 = arg0;
        this.field1873 = arg1;
        this.field1859 = 0;
        this.field1856 = new int[this.field1881][this.field1873];
        this.field1876 = 0;
        this.method753(57);
    }
}
