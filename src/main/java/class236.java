import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class236 extends class310 {

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    private int field3915 = 4096;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    private int field3917 = 0;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3916 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "Lwc;")
    public static class185 field3918;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqm;II)V", line = 15)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3917 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field3915 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field4940 = arg0.method1720((byte) -66) == 1;
        }
        if (arg1 != -2470) {
            method1812((byte) 124);
        }
        field3909++;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 48)
    public static final void method1810(int arg0) {
        field3914++;
        if (~class20.field231 == arg0) {
            return;
        }
        try {
            if (++class247.field4040 > 2000) {
                if (class342.field5449 != null) {
                    class342.field5449.method916((byte) 79);
                    class342.field5449 = null;
                }
                if (class201.field3207 >= 1) {
                    class20.field231 = 0;
                    class138.field2278 = -5;
                    return;
                }
                class20.field231 = 1;
                class201.field3207++;
                class247.field4040 = 0;
                if (class254.field4280 == class223.field3697) {
                    class223.field3697 = class76.field1324;
                } else {
                    class223.field3697 = class254.field4280;
                }
            }
            if (class20.field231 == 1) {
                class206.field3258 = class128.field2163.method1124(class194.field3096, -114, class223.field3697);
                class20.field231 = 2;
            }
            if (class20.field231 == 2) {
                if (class206.field3258.field3064 == 2) {
                    throw new IOException();
                }
                if (class206.field3258.field3064 != 1) {
                    return;
                }
                class342.field5449 = new class117((Socket) class206.field3258.field3066, class128.field2163);
                class206.field3258 = null;
                class342.field5449.method924(0, class36.field520.field3793, class36.field520.field3760, 73);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 125);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 126);
                }
                int var1 = class342.field5449.method918(0);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 124);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 126);
                }
                if (var1 != 21) {
                    class20.field231 = 0;
                    class138.field2278 = var1;
                    class342.field5449.method916((byte) 80);
                    class342.field5449 = null;
                    return;
                }
                class20.field231 = 3;
            }
            if (class20.field231 == 3) {
                if (class342.field5449.method926(0) < 1) {
                    return;
                }
                class35.field507 = new String[class342.field5449.method918(~arg0)];
                class20.field231 = 4;
            }
            if (class20.field231 == 4) {
                if (class342.field5449.method926(0) < (class35.field507.length * 8)) {
                    return;
                }
                class29.field383.field3760 = 0;
                class342.field5449.method919(class29.field383.field3793, 0, class35.field507.length * 8, true);
                for (int var2 = 0; var2 < class35.field507.length; var2++) {
                    class35.field507[var2] = class25.method164((byte) -47, class29.field383.method1734((byte) 96));
                }
                class138.field2278 = 21;
                class20.field231 = 0;
                class342.field5449.method916((byte) 71);
                class342.field5449 = null;
                return;
            }
        } catch (IOException var4) {
            if (class342.field5449 != null) {
                class342.field5449.method916((byte) 77);
                class342.field5449 = null;
            }
            if (class201.field3207 < 1) {
                if (class254.field4280 == class223.field3697) {
                    class223.field3697 = class76.field1324;
                } else {
                    class223.field3697 = class254.field4280;
                }
                class201.field3207++;
                class247.field4040 = 0;
                class20.field231 = 1;
            } else {
                class138.field2278 = -4;
                class20.field231 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)[[I", line = 201)
    public final int[][] method391(int arg0, boolean arg1) {
        field3911++;
        if (!arg1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4942.method10((byte) -116, arg0);
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class261.field4405; var11++) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var13 < this.field3917) {
                    var8[var11] = this.field3917;
                } else if (var13 > this.field3915) {
                    var8[var11] = this.field3915;
                } else {
                    var8[var11] = var13;
                }
                if (this.field3917 > var14) {
                    var10[var11] = this.field3917;
                } else if (this.field3915 < var14) {
                    var10[var11] = this.field3915;
                } else {
                    var10[var11] = var14;
                }
                if (this.field3917 > var12) {
                    var9[var11] = this.field3917;
                } else if (this.field3915 < var12) {
                    var9[var11] = this.field3915;
                } else {
                    var9[var11] = var12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V", line = 276)
    public static final void method1811(int arg0, int arg1, int arg2, int arg3) {
        class36 var4 = class129.field2184[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class339 var5 = var4.field526;
        if (var5 != null) {
            var5.field5398 = var5.field5398 * arg3 / 16;
            var5.field5405 = var5.field5405 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I", line = 298)
    public final int[] method77(int arg0, int arg1) {
        field3913++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (arg1 != -13093) {
            return (int[]) null;
        }
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                int var6 = var4[var5];
                if (this.field3917 > var6) {
                    var3[var5] = this.field3917;
                } else if (this.field3915 < var6) {
                    var3[var5] = this.field3915;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V", line = 344)
    public static void method1812(byte arg0) {
        field3916 = null;
        field3918 = null;
        if (arg0 >= -7) {
            method1812((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 617)
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 366)
    public static final void method1813(int arg0) {
        field3912++;
        if (class174.field2777 == null) {
            return;
        }
        if (class35.field509 < 10) {
            if (!class174.field2770.method475(120, class174.field2777.field1691)) {
                class35.field509 = class241.field3992.method480(-3800, class174.field2777.field1691) / 10;
                return;
            }
            class275.method2053(true);
            class35.field509 = 10;
        }
        if (class35.field509 == 10) {
            class174.field2772 = class174.field2777.field1699 >> 6 << 6;
            class174.field2773 = class174.field2777.field1685 >> 6 << 6;
            class174.field2776 = (class174.field2777.field1676 >> 6 << 6) + 64 - class174.field2772;
            class174.field2780 = (class174.field2777.field1696 >> 6 << 6) + 64 - class174.field2773;
            int[] var1 = new int[3];
            int var2 = -1;
            int var3 = -1;
            if (class174.field2777.method801(class275.field4546 + (class6.field55.field3511 >> 7), 0, var1, class93.field1562 + (class6.field55.field3577 >> 7), class186.field2991)) {
                var2 = var1[1] - class174.field2772;
                var3 = class174.field2773 + class174.field2780 - var1[2] - 1;
            }
            if (!class59.field1018 && var2 >= 0 && class174.field2776 > var2 && var3 >= 0 && var3 < class174.field2780) {
                int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
                class208.field3268 = var4;
                int var5 = var2 + ((int) (Math.random() * 10.0D) - 5);
                class350.field5551 = var5;
            } else if (class14.field151 == -1 || class314.field4996 == -1) {
                class174.field2777.method803(var1, arg0 + 17756, class174.field2777.field1679 >> 14 & 0x3FFF, class174.field2777.field1679 & 0x3FFF);
                class350.field5551 = var1[1] - class174.field2772;
                class208.field3268 = class174.field2773 + class174.field2780 - var1[2] - 1;
            } else {
                class174.field2777.method803(var1, 256, class14.field151, class314.field4996);
                class59.field1018 = false;
                if (var1 != null) {
                    class350.field5551 = var1[1] - class174.field2772;
                    class208.field3268 = class174.field2773 + class174.field2780 - var1[2] - 1;
                }
                class314.field4996 = -1;
                class14.field151 = -1;
            }
            if (class174.field2777.field1700 == 37) {
                class174.field2774 = 3.0F;
                class174.field2779 = 3.0F;
            } else if (class174.field2777.field1700 == 50) {
                class174.field2774 = 4.0F;
                class174.field2779 = 4.0F;
            } else if (class174.field2777.field1700 == 75) {
                class174.field2774 = 6.0F;
                class174.field2779 = 6.0F;
            } else if (class174.field2777.field1700 == 100) {
                class174.field2774 = 8.0F;
                class174.field2779 = 8.0F;
            } else if (class174.field2777.field1700 == 200) {
                class174.field2774 = 16.0F;
                class174.field2779 = 16.0F;
            } else {
                class174.field2774 = 8.0F;
                class174.field2779 = 8.0F;
            }
            class41.method268((byte) 115);
            int var6 = class174.field2780 >> 6;
            int var7 = class174.field2776 >> 6;
            class174.field2792 = new byte[var7][var6][];
            class174.field2789 = new int[var7][var6][];
            class174.field2798 = new byte[var7][var6][];
            class174.field2786 = new int[var7][var6][];
            class174.field2795 = new byte[var7][var6][];
            class174.field2784 = new byte[var7][var6][];
            class174.field2791 = new byte[var7][var6][];
            class174.field2787 = new int[class127.field2153 + 1];
            class206.field3260 = new class327();
            class353.field5601 = new class151();
            int var8 = class186.field2998 >> 1;
            int var9 = class311.field4964 >> 2 << 10;
            class174.method1362(var9, var8);
            class160.method1248(arg0 ^ 0x4402, 256, 1024);
            class93.method729(256, -62, 256);
            class342.method2416((byte) 91, 256);
            class35.field509 = 20;
        } else if (arg0 == -17500) {
            if (class35.field509 == 20) {
                class195.method1511(new class227(class174.field2770.method467((byte) -83, class174.field2777.field1691, "underlay")), false);
                class35.field509 = 30;
                class291.method2107(false, true);
                class348.method2440(arg0 + 17557);
            } else if (class35.field509 == 30) {
                class174.method1358(new class227(class174.field2770.method467((byte) -118, class174.field2777.field1691, "overlay")));
                class35.field509 = 40;
                class348.method2440(arg0 ^ 0xFFFFBB88);
            } else if (class35.field509 == 40) {
                class174.method1360(new class227(class174.field2770.method467((byte) -103, class174.field2777.field1691, "overlay2")));
                class35.field509 = 50;
                class348.method2440(92);
            } else if (class35.field509 == 50) {
                class174.method1375(new class227(class174.field2770.method467((byte) -78, class174.field2777.field1691, "loc")), class286.field4661);
                class35.field509 = 60;
                class291.method2107(false, true);
                class348.method2440(95);
            } else if (class35.field509 == 60) {
                if (class174.field2770.method459(class174.field2777.field1691 + "_labels", 0)) {
                    if (!class174.field2770.method475(arg0 + 17614, class174.field2777.field1691 + "_labels")) {
                        return;
                    }
                    class174.field2775 = class115.method896(class174.field2777.field1691 + "_labels", class174.field2770, false, class286.field4661);
                } else {
                    class174.field2775 = new class241(0);
                }
                class174.method1370();
                class35.field509 = 70;
                class348.method2440(118);
            } else if (class35.field509 == 70) {
                class353.field5608 = new class147(11, true, class151.field2402);
                class35.field509 = 73;
                class291.method2107(false, true);
                class348.method2440(arg0 + 17613);
            } else if (class35.field509 == 73) {
                class222.field3651 = new class147(12, true, class151.field2402);
                class35.field509 = 76;
                class291.method2107(false, true);
                class348.method2440(50);
            } else if (class35.field509 == 76) {
                class109.field1796 = new class147(14, true, class151.field2402);
                class35.field509 = 79;
                class291.method2107(false, true);
                class348.method2440(arg0 ^ 0xFFFFBBF7);
            } else if (class35.field509 == 79) {
                class213.field3409 = new class147(17, true, class151.field2402);
                class35.field509 = 82;
                class291.method2107(false, true);
                class348.method2440(107);
            } else if (class35.field509 == 82) {
                class172.field2744 = new class147(19, true, class151.field2402);
                class35.field509 = 85;
                class291.method2107(false, true);
                class348.method2440(75);
            } else if (class35.field509 == 85) {
                class311.field4963 = new class147(22, true, class151.field2402);
                class35.field509 = 88;
                class291.method2107(false, true);
                class348.method2440(26);
            } else if (class35.field509 == 88) {
                class109.field1801 = new class147(26, true, class151.field2402);
                class35.field509 = 91;
                class291.method2107(false, true);
                class348.method2440(50);
            } else {
                class138.field2280 = new class147(30, true, class151.field2402);
                class35.field509 = 100;
                class291.method2107(false, true);
                class348.method2440(47);
                System.gc();
            }
        }
    }
}
