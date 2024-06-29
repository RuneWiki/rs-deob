import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class37 {

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Z")
    public boolean field813 = false;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "[F")
    public float[] field835 = new float[4];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Z")
    public boolean field819;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Z")
    public boolean field810;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "[S")
    public short[] field829;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lud;")
    public static class279 field806 = class130.method1024(")3", 255);

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[Ljl;")
    public static class262[] field820 = new class262[28];

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lud;")
    public static class279 field828 = class130.method1024("Gegenstand f-Ur Mitglieder", 255);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "F")
    public float field812;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "F")
    public float field830;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Laa;")
    public class9 field824;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "[Lfa;")
    public static class195[] field840;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 10)
    public static final void method327(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class71.field1398[var1] = true;
        }
        field822++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 29)
    public static final void method328(Component arg0, boolean arg1) {
        field841++;
        arg0.removeMouseListener(class166.field2993);
        arg0.removeMouseMotionListener(class166.field2993);
        arg0.removeFocusListener(class166.field2993);
        if (arg1) {
            class262.field4689 = 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIZ)V", line = 47)
    public final void method329(int arg0, int arg1, boolean arg2) {
        field838++;
        int var4 = this.field834 * arg0 / 50 + this.field825 & 0x7FF;
        if (arg1 != 5) {
            this.field814 = -48;
        }
        int var5 = this.field823;
        int var6;
        if (var5 == 1) {
            var6 = (class27.field654[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class98.field1836[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2) {
            var6 = 2048;
        }
        this.field830 = (float) ((this.field821 * var6 >> 11) + this.field808) / 2048.0F;
        float var7 = this.field830 / 255.0F;
        this.field835[0] = var7 * (float) class52.method442(this.field818 >> 16, 255);
        this.field835[2] = (float) class52.method442(this.field818, 255) * var7;
        this.field835[1] = var7 * (float) class52.method442(this.field818 >> 8, 255);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V", line = 126)
    public static final void method330(int arg0, int arg1, int arg2, int arg3) {
        class191 var4 = class24.field619[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class235 var5 = var4.field3454;
        if (var5 != null) {
            var5.field4106 = var5.field4106 * arg3 / 16;
            var5.field4101 = var5.field4101 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 141)
    public static final int method331(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lgf;III)V", line = 160)
    public static final void method332(class8 arg0, int arg1, int arg2, int arg3) {
        field811++;
        if (arg0.field315 == 1) {
            client.field4475++;
            class245.method1750(-1, (short) 46, 0L, (byte) 110, 0, class60.field1265, arg0.field195, arg0.field299);
        }
        if (arg0.field315 == 2 && !class38.field848) {
            class279 var4 = class94.method791(arg0, 11);
            if (var4 != null) {
                class245.method1750(-1, (short) 24, 0L, (byte) 103, -1, class115.method929(new class279[] { class20.field569, arg0.field232 }, (byte) 60), var4, arg0.field299);
                class306.field5432++;
            }
        }
        if (arg0.field315 == 3) {
            class245.method1750(-1, (short) 5, 0L, (byte) 125, 0, class60.field1265, class144.field2610, arg0.field299);
            class274.field4878++;
        }
        if (arg0.field315 == 4) {
            class32.field726++;
            class245.method1750(-1, (short) 17, 0L, (byte) -126, 0, class60.field1265, arg0.field195, arg0.field299);
        }
        if (arg0.field315 == 5) {
            class245.method1750(-1, (short) 35, 0L, (byte) 107, 0, class60.field1265, arg0.field195, arg0.field299);
            class144.field2604++;
        }
        if (arg0.field315 == 6 && class320.field5597 == null) {
            class179.field3247++;
            class245.method1750(-1, (short) 14, 0L, (byte) 104, -1, class60.field1265, arg0.field195, arg0.field299);
        }
        if (arg0.field201 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field204; var6++) {
                for (int var7 = 0; var7 < arg0.field218; var7++) {
                    int var8 = (arg0.field295 + 32) * var7;
                    int var9 = (arg0.field176 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field214[var5];
                        var8 += arg0.field209[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg1 && arg2 < var8 + 32 && (var9 + 32) > arg1) {
                        class121.field2182 = arg0;
                        class304.field5385 = var5;
                        if (arg0.field319[var5] > 0) {
                            class246 var10 = client.method1798(arg0);
                            class157 var11 = class220.method1612(-2254, arg0.field319[var5] - 1);
                            if (class98.field1839 == 1 && var10.method1764(-1)) {
                                if (class290.field5161 != arg0.field299 || class178.field3209 != var5) {
                                    class318.field5587++;
                                    class245.method1750(-1, (short) 3, (long) var11.field2825, (byte) -120, var5, class115.method929(new class279[] { class141.field2564, class274.field4872, var11.field2861 }, (byte) 60), class8.field334, arg0.field299);
                                }
                            } else if (class38.field848 && var10.method1764(-1)) {
                                class205 var12 = class248.field4409 == -1 ? null : class247.method1768(class248.field4409, (byte) 99);
                                if ((class271.field4839 & 0x10) != 0 && (var12 == null || var11.method1238((byte) -8, class248.field4409, var12.field3651) != var12.field3651)) {
                                    class245.method1750(class230.field4016, (short) 39, (long) var11.field2825, (byte) 99, var5, class115.method929(new class279[] { class73.field1429, class274.field4872, var11.field2861 }, (byte) 60), class244.field4332, arg0.field299);
                                    class139.field2507++;
                                }
                            } else {
                                class55.field1202++;
                                class279[] var13 = var11.field2886;
                                if (class324.field5666) {
                                    var13 = class123.method985(var13, arg3 ^ 0x5);
                                }
                                if (var10.method1764(-1)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 13;
                                            } else {
                                                var15 = 10;
                                            }
                                            class245.method1750(-1, var15, (long) var11.field2825, (byte) -127, var5, class115.method929(new class279[] { class269.field4816, var11.field2861 }, (byte) 60), var13[var14], arg0.field299);
                                            class41.field876++;
                                        }
                                    }
                                }
                                if (var10.method1753(5753)) {
                                    class157.field2862++;
                                    class245.method1750(class94.field1770, (short) 7, (long) var11.field2825, (byte) -120, var5, class115.method929(new class279[] { class269.field4816, var11.field2861 }, (byte) 60), class8.field334, arg0.field299);
                                }
                                if (var10.method1764(-1) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            class250.field4453++;
                                            if (var16 == 0) {
                                                var17 = 45;
                                            }
                                            if (var16 == 1) {
                                                var17 = 37;
                                            }
                                            if (var16 == 2) {
                                                var17 = 22;
                                            }
                                            class245.method1750(-1, var17, (long) var11.field2825, (byte) 126, var5, class115.method929(new class279[] { class269.field4816, var11.field2861 }, (byte) 60), var13[var16], arg0.field299);
                                        }
                                    }
                                }
                                class279[] var18 = arg0.field207;
                                if (class324.field5666) {
                                    var18 = class123.method985(var18, -5);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class86.field1634++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 38;
                                            }
                                            if (var19 == 1) {
                                                var20 = 41;
                                            }
                                            if (var19 == 2) {
                                                var20 = 29;
                                            }
                                            if (var19 == 3) {
                                                var20 = 2;
                                            }
                                            if (var19 == 4) {
                                                var20 = 42;
                                            }
                                            class245.method1750(-1, var20, (long) var11.field2825, (byte) -115, var5, class115.method929(new class279[] { class269.field4816, var11.field2861 }, (byte) 60), var18[var19], arg0.field299);
                                        }
                                    }
                                }
                                class245.method1750(class233.field4089, (short) 1001, (long) var11.field2825, (byte) 103, var5, class115.method929(new class279[] { class269.field4816, var11.field2861 }, (byte) 60), class143.field2600, arg0.field299);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg0.field223) {
            if (!class38.field848) {
                for (int var21 = 9; var21 >= 5; var21--) {
                    class279 var22 = class137.method1063(false, arg0, var21);
                    if (var22 != null) {
                        class254.field4533++;
                        class245.method1750(class133.method1048(var21, false, arg0), (short) 1005, (long) (var21 + 1), (byte) -99, arg0.field261, arg0.field272, var22, arg0.field299);
                    }
                }
                class279 var23 = class94.method791(arg0, arg3 ^ 0xFFFFFF94);
                if (var23 != null) {
                    class306.field5432++;
                    class245.method1750(-1, (short) 24, 0L, (byte) -93, arg0.field261, arg0.field272, var23, arg0.field299);
                }
                for (int var24 = 4; var24 >= 0; var24--) {
                    class279 var25 = class137.method1063(false, arg0, var24);
                    if (var25 != null) {
                        class254.field4533++;
                        class245.method1750(class133.method1048(var24, false, arg0), (short) 44, (long) (var24 + 1), (byte) -59, arg0.field261, arg0.field272, var25, arg0.field299);
                    }
                }
                if (client.method1798(arg0).method1761(250)) {
                    class245.method1750(-1, (short) 14, 0L, (byte) -95, arg0.field261, class60.field1265, class199.field3564, arg0.field299);
                    class179.field3247++;
                }
            } else if (client.method1798(arg0).method1762((byte) -113) && (class271.field4839 & 0x20) != 0) {
                class181.field3304++;
                class245.method1750(class230.field4016, (short) 6, 0L, (byte) -125, arg0.field261, class115.method929(new class279[] { class73.field1429, class50.field1032, arg0.field272 }, (byte) 60), class244.field4332, arg0.field299);
            }
        }
        if (arg3 != -2) {
            field820 = (class262[]) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILvh;IIIBIZ)V", line = 475)
    public static final void method333(int arg0, int arg1, class53 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, boolean arg8) {
        if (arg3 >= 0 && arg3 < 104 && arg5 >= 0 && arg5 < 104) {
            if (!arg8) {
                class257.field4573[arg7][arg3][arg5] = 0;
            }
            while (true) {
                int var9 = arg2.method483(-111);
                if (var9 == 0) {
                    if (arg8) {
                        class165.field2970[0][arg3][arg5] = class255.field4550[0][arg3][arg5];
                    } else if (arg7 == 0) {
                        class165.field2970[0][arg3][arg5] = -class205.method1520((byte) 91, arg1 + arg5 + 556238, arg0 + 932731 - -arg3) * 8;
                    } else {
                        class165.field2970[arg7][arg3][arg5] = class165.field2970[arg7 - 1][arg3][arg5] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method483(-114);
                    if (arg8) {
                        class165.field2970[0][arg3][arg5] = var10 * 8 + class255.field4550[0][arg3][arg5];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg7 == 0) {
                            class165.field2970[0][arg3][arg5] = -var10 * 8;
                        } else {
                            class165.field2970[arg7][arg3][arg5] = class165.field2970[arg7 - 1][arg3][arg5] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class214.field3774[arg7][arg3][arg5] = arg2.method494(false);
                    class194.field3491[arg7][arg3][arg5] = (byte) ((var9 - 2) / 4);
                    class194.field3486[arg7][arg3][arg5] = (byte) class52.method442(3, var9 + arg4 - 2);
                } else if (var9 > 81) {
                    class182.field3323[arg7][arg3][arg5] = (byte) (var9 - 81);
                } else if (!arg8) {
                    class257.field4573[arg7][arg3][arg5] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method483(-114);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method483(-108);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method483(-119);
                }
            }
        }
        if (arg6 >= -42) {
            method337((byte) -111, 0);
        }
        field833++;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 582)
    private final void method334(int arg0) {
        field816++;
        int var2 = (this.field836 << 7) + 64;
        this.field812 = 1.0F / (float) (var2 * var2);
        if (arg0 != -8) {
            this.field821 = -101;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 1016)
    protected class37() {
        if (class98.field1836 == null) {
            class221.method1618(116);
        }
        this.method336((byte) -75);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lvh;)V", line = 1026)
    public class37(class53 arg0) {
        if (class98.field1836 == null) {
            class221.method1618(116);
        }
        this.field817 = arg0.method483(-126);
        this.field819 = (this.field817 & 0x8) != 0;
        this.field810 = (this.field817 & 0x10) != 0;
        this.field817 &= 0x7;
        this.field843 = arg0.method468(28214);
        this.field814 = arg0.method468(28214);
        this.field837 = arg0.method468(28214);
        this.field836 = arg0.method483(-119);
        this.method334(-8);
        this.field829 = new short[this.field836 * 2 + 1];
        for (int var2 = 0; var2 < this.field829.length; var2++) {
            this.field829[var2] = (short) arg0.method468(28214);
        }
        this.field818 = class27.field645[arg0.method468(28214)];
        int var3 = arg0.method483(-112);
        this.field825 = var3 & 0xE0 << 3;
        this.field807 = var3 & 0x1F;
        if (this.field807 != 31) {
            this.method336((byte) -100);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 605)
    public static void method335(boolean arg0) {
        field806 = null;
        field840 = null;
        field820 = null;
        if (!arg0) {
            field828 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 654)
    private final void method336(byte arg0) {
        int var2 = this.field807;
        if (var2 == 2) {
            this.field821 = 2048;
            this.field834 = 2048;
            this.field808 = 0;
            this.field823 = 1;
        } else if (var2 == 3) {
            this.field821 = 2048;
            this.field808 = 0;
            this.field823 = 1;
            this.field834 = 4096;
        } else if (var2 == 4) {
            this.field834 = 2048;
            this.field808 = 0;
            this.field823 = 4;
            this.field821 = 2048;
        } else if (var2 == 5) {
            this.field808 = 0;
            this.field821 = 2048;
            this.field823 = 4;
            this.field834 = 8192;
        } else if (var2 == 12) {
            this.field808 = 0;
            this.field821 = 2048;
            this.field834 = 2048;
            this.field823 = 2;
        } else if (var2 == 13) {
            this.field834 = 8192;
            this.field823 = 2;
            this.field808 = 0;
            this.field821 = 2048;
        } else if (var2 == 10) {
            this.field808 = 1536;
            this.field821 = 512;
            this.field834 = 2048;
            this.field823 = 3;
        } else if (var2 == 11) {
            this.field808 = 1536;
            this.field823 = 3;
            this.field834 = 4096;
            this.field821 = 512;
        } else if (var2 == 6) {
            this.field821 = 768;
            this.field823 = 3;
            this.field834 = 2048;
            this.field808 = 1280;
        } else if (var2 == 7) {
            this.field823 = 3;
            this.field821 = 768;
            this.field808 = 1280;
            this.field834 = 4096;
        } else if (var2 == 8) {
            this.field834 = 2048;
            this.field808 = 1024;
            this.field823 = 3;
            this.field821 = 1024;
        } else if (var2 == 9) {
            this.field834 = 4096;
            this.field821 = 1024;
            this.field808 = 1024;
            this.field823 = 3;
        } else if (var2 == 14) {
            this.field834 = 2048;
            this.field808 = 1280;
            this.field823 = 1;
            this.field821 = 768;
        } else if (var2 == 15) {
            this.field834 = 4096;
            this.field821 = 512;
            this.field823 = 1;
            this.field808 = 1536;
        } else if (var2 == 16) {
            this.field834 = 8192;
            this.field808 = 1792;
            this.field823 = 1;
            this.field821 = 256;
        } else {
            this.field821 = 2048;
            this.field834 = 2048;
            this.field808 = 0;
            this.field823 = 0;
        }
        field839++;
        if (arg0 >= -72) {
            method335(true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)I", line = 818)
    public static final int method337(byte arg0, int arg1) {
        field827++;
        return arg0 >= -115 ? 46 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lok;B)V", line = 840)
    public static final void method338(class149 arg0, byte arg1) {
        if (arg1 != -18) {
            field828 = (class279) null;
        }
        field842++;
        class177.field3171 = arg0;
        class138.field2494 = class177.field3171.method1174(16, -17680);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIILqg;)V", line = 864)
    public static final void method339(int arg0, int arg1, int arg2, int arg3, class239 arg4) {
        field832++;
        if (class72.field1420 == arg4 || class194.field3488 >= 400) {
            return;
        }
        class279 var11;
        if (arg4.field4202 == 0) {
            boolean var5 = true;
            if (class72.field1420.field4201 != -1 && arg4.field4201 != -1) {
                int var6 = class72.field1420.field4196 <= arg4.field4196 ? arg4.field4196 : class72.field1420.field4196;
                int var7 = class72.field1420.field4196 - arg4.field4196;
                int var8 = class72.field1420.field4201 < arg4.field4201 ? class72.field1420.field4201 : arg4.field4201;
                int var9 = var6 * 10 / 100 + var8 + 5;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var9 < var7) {
                    var5 = false;
                }
            }
            class279 var10 = class214.field3764 == 1 ? class223.field3949 : class318.field5579;
            if (arg4.field4213 <= arg4.field4196) {
                var11 = class115.method929(new class279[] { arg4.method1718(4), var5 ? class205.method1521(class72.field1420.field4196, (byte) 104, arg4.field4196) : client.field4467, class169.field3063, var10, class191.method1447(5, arg4.field4196), class251.field4488 }, (byte) 60);
            } else {
                var11 = class115.method929(new class279[] { arg4.method1718(4), var5 ? class205.method1521(class72.field1420.field4196, (byte) -90, arg4.field4196) : client.field4467, class169.field3063, var10, class191.method1447(5, arg4.field4196), class88.field1681, class191.method1447(5, arg4.field4213 - arg4.field4196), class251.field4488 }, (byte) 60);
            }
        } else {
            var11 = class115.method929(new class279[] { arg4.method1718(4), class169.field3063, class24.field612, class191.method1447(5, arg4.field4202), class251.field4488 }, (byte) 60);
        }
        int var12 = -111 / ((arg2 + 83) / 43);
        if (class98.field1839 == 1) {
            class245.method1750(class94.field1770, (short) 49, (long) arg3, (byte) 91, arg1, class115.method929(new class279[] { class141.field2564, class133.field2425, var11 }, (byte) 60), class8.field334, arg0);
            class238.field4167++;
        } else if (!class38.field848) {
            for (int var13 = 7; var13 >= 0; var13--) {
                if (class41.field866[var13] != null) {
                    short var14 = 0;
                    class207.field3673++;
                    if (class214.field3764 == 0 && class41.field866[var13].method2010(class54.field1192, (byte) 118)) {
                        if (arg4.field4196 > class72.field1420.field4196) {
                            var14 = 2000;
                        }
                        if (class72.field1420.field4185 != 0 && arg4.field4185 != 0) {
                            if (class72.field1420.field4185 == arg4.field4185) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class23.field598[var13]) {
                        var14 = 2000;
                    }
                    boolean var15 = false;
                    short var16 = class200.field3577[var13];
                    short var17 = (short) (var14 + var16);
                    class245.method1750(class162.field2925[var13], var17, (long) arg3, (byte) -53, arg1, class115.method929(new class279[] { client.field4467, var11 }, (byte) 60), class41.field866[var13], arg0);
                }
            }
        } else if ((class271.field4839 & 0x8) != 0) {
            class111.field2041++;
            class245.method1750(class230.field4016, (short) 16, (long) arg3, (byte) 92, arg1, class115.method929(new class279[] { class73.field1429, class133.field2425, var11 }, (byte) 60), class244.field4332, arg0);
        }
        for (int var18 = 0; var18 < class194.field3488; var18++) {
            if (class271.field4828[var18] == 11) {
                class184.field3373[var18] = class115.method929(new class279[] { client.field4467, var11 }, (byte) 60);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V", line = 998)
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field823 = arg3;
        if (arg1 != 255) {
            this.field843 = 47;
        }
        this.field834 = arg0;
        this.field821 = arg2;
        this.field808 = arg4;
        field815++;
    }
}
