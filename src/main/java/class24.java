import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JKAPIYZO")
public class class24 {

    @OriginalMember(owner = "JKAPIYZO", name = "a", descriptor = "Z")
    public boolean field829 = true;

    @OriginalMember(owner = "JKAPIYZO", name = "c", descriptor = "J")
    public long field831 = -1L;

    @OriginalMember(owner = "JKAPIYZO", name = "i", descriptor = "Z")
    private boolean field837 = true;

    @OriginalMember(owner = "JKAPIYZO", name = "j", descriptor = "I")
    public int field838 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "k", descriptor = "I")
    public int field839 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "l", descriptor = "I")
    public int field840 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "m", descriptor = "I")
    public int field841 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "n", descriptor = "I")
    public int field842 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "o", descriptor = "Z")
    public boolean field843 = true;

    @OriginalMember(owner = "JKAPIYZO", name = "p", descriptor = "I")
    private int field844 = 128;

    @OriginalMember(owner = "JKAPIYZO", name = "q", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "r", descriptor = "Z")
    private boolean field846 = false;

    @OriginalMember(owner = "JKAPIYZO", name = "s", descriptor = "I")
    public int field847 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "t", descriptor = "I")
    public int field848 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "v", descriptor = "I")
    private int field850 = 128;

    @OriginalMember(owner = "JKAPIYZO", name = "x", descriptor = "I")
    public int field852 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "z", descriptor = "B")
    public byte field854 = 1;

    @OriginalMember(owner = "JKAPIYZO", name = "C", descriptor = "I")
    public int field857 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "E", descriptor = "Z")
    public boolean field859 = false;

    @OriginalMember(owner = "JKAPIYZO", name = "H", descriptor = "I")
    public int field862 = 32;

    @OriginalMember(owner = "JKAPIYZO", name = "J", descriptor = "I")
    public int field864 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "K", descriptor = "I")
    public int field865 = -1;

    @OriginalMember(owner = "JKAPIYZO", name = "L", descriptor = "LEOJHVRZF;")
    public static class12 field866 = new class12(10369, 30);

    @OriginalMember(owner = "JKAPIYZO", name = "u", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "JKAPIYZO", name = "y", descriptor = "I")
    private static int field853;

    @OriginalMember(owner = "JKAPIYZO", name = "D", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "JKAPIYZO", name = "F", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "JKAPIYZO", name = "M", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "JKAPIYZO", name = "e", descriptor = "LUAWAYCTK;")
    private static class55 field833;

    @OriginalMember(owner = "JKAPIYZO", name = "I", descriptor = "Lclient;")
    public static client field863;

    @OriginalMember(owner = "JKAPIYZO", name = "d", descriptor = "Ljava/lang/String;")
    public String field832;

    @OriginalMember(owner = "JKAPIYZO", name = "b", descriptor = "[B")
    public byte[] field830;

    @OriginalMember(owner = "JKAPIYZO", name = "f", descriptor = "[I")
    private static int[] field834;

    @OriginalMember(owner = "JKAPIYZO", name = "g", descriptor = "[I")
    private int[] field835;

    @OriginalMember(owner = "JKAPIYZO", name = "h", descriptor = "[I")
    public int[] field836;

    @OriginalMember(owner = "JKAPIYZO", name = "w", descriptor = "[I")
    private int[] field851;

    @OriginalMember(owner = "JKAPIYZO", name = "A", descriptor = "[I")
    private int[] field855;

    @OriginalMember(owner = "JKAPIYZO", name = "B", descriptor = "[I")
    private int[] field856;

    @OriginalMember(owner = "JKAPIYZO", name = "G", descriptor = "[LJKAPIYZO;")
    private static class24[] field861;

    @OriginalMember(owner = "JKAPIYZO", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field868;

    @OriginalMember(owner = "JKAPIYZO", name = "a", descriptor = "(ZI[II)LWEVRTBOZ;")
    public final class66 method278(boolean arg0, int arg1, int[] arg2, int arg3) {
        if (this.field836 != null) {
            class24 var5 = this.method282(0);
            return var5 == null ? null : var5.method278(false, arg1, arg2, arg3);
        }
        class66 var6 = (class66) field866.method206(this.field831);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field851.length; var8++) {
                if (!class66.method526(this.field851[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class66[] var9 = new class66[this.field851.length];
            for (int var10 = 0; var10 < this.field851.length; var10++) {
                var9[var10] = class66.method525(892, this.field851[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class66(true, var9.length, var9);
            }
            if (this.field855 != null) {
                for (int var11 = 0; var11 < this.field855.length; var11++) {
                    var6.method539(this.field855[var11], this.field835[var11]);
                }
            }
            var6.method532((byte) 2);
            var6.method542(this.field867 + 64, this.field858 + 850, -30, -50, -30, true);
            field866.method207(this.field831, 77, var6);
        }
        class66 var12 = class66.field1581;
        if (arg0) {
            throw new NullPointerException();
        }
        var12.method527(var6, 496, class15.method218(arg1, true) & class15.method218(arg3, true));
        if (arg1 != -1 && arg3 != -1) {
            var12.method534(arg3, arg1, arg2, 9);
        } else if (arg1 != -1) {
            var12.method533(arg1, 803);
        }
        if (this.field844 != 128 || this.field850 != 128) {
            var12.method541(this.field844, this.field844, this.field850, 49106);
        }
        var12.method529(0);
        var12.field1618 = null;
        var12.field1617 = null;
        if (this.field854 == 1) {
            var12.field1619 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "JKAPIYZO", name = "a", descriptor = "(Z)V")
    public static final void method279(boolean arg0) {
        field866 = null;
        field834 = null;
        field861 = null;
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field833 = null;
    }

    @OriginalMember(owner = "JKAPIYZO", name = "b", descriptor = "(Z)Z")
    public boolean method280(boolean arg0) {
        if (this.field836 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0) {
            this.field860 = 163;
        }
        if (this.field847 != -1) {
            class57 var3 = class57.field1497[this.field847];
            int var4 = var3.field1499;
            int var5 = var3.field1500;
            int var6 = var3.field1501;
            int var7 = client.field184[var6 - var5];
            var2 = field863.field286[var4] >> var5 & var7;
        } else if (this.field852 != -1) {
            var2 = field863.field286[this.field852];
        }
        return var2 >= 0 && var2 < this.field836.length && this.field836[var2] != -1;
    }

    @OriginalMember(owner = "JKAPIYZO", name = "a", descriptor = "(I)LWEVRTBOZ;")
    public final class66 method281(int arg0) {
        if (arg0 != 7) {
            this.field837 = !this.field837;
        }
        if (this.field836 != null) {
            class24 var2 = this.method282(0);
            return var2 == null ? null : var2.method281(7);
        } else if (this.field856 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field856.length; var4++) {
                if (!class66.method526(this.field856[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class66[] var5 = new class66[this.field856.length];
            for (int var6 = 0; var6 < this.field856.length; var6++) {
                var5[var6] = class66.method525(892, this.field856[var6]);
            }
            class66 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class66(true, var5.length, var5);
            }
            if (this.field855 != null) {
                for (int var8 = 0; var8 < this.field855.length; var8++) {
                    var7.method539(this.field855[var8], this.field835[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "JKAPIYZO", name = "b", descriptor = "(I)LJKAPIYZO;")
    public final class24 method282(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field847 != -1) {
            class57 var3 = class57.field1497[this.field847];
            int var4 = var3.field1499;
            int var5 = var3.field1500;
            int var6 = var3.field1501;
            int var7 = client.field184[var6 - var5];
            var2 = field863.field286[var4] >> var5 & var7;
        } else if (this.field852 != -1) {
            var2 = field863.field286[this.field852];
        }
        return var2 < 0 || var2 >= this.field836.length || this.field836[var2] == -1 ? null : method284(this.field836[var2]);
    }

    @OriginalMember(owner = "JKAPIYZO", name = "a", descriptor = "(ILUAWAYCTK;)V")
    private final void method283(int arg0, class55 arg1) {
        if (arg0 != -7321) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method455();
                    this.field851 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field851[var5] = arg1.method457();
                    }
                } else if (var3 == 2) {
                    this.field832 = arg1.method462();
                } else if (var3 == 3) {
                    this.field830 = arg1.method463(0);
                } else if (var3 == 12) {
                    this.field854 = arg1.method456();
                } else if (var3 == 13) {
                    this.field839 = arg1.method457();
                } else if (var3 == 14) {
                    this.field845 = arg1.method457();
                } else if (var3 == 17) {
                    this.field845 = arg1.method457();
                    this.field864 = arg1.method457();
                    this.field841 = arg1.method457();
                    this.field857 = arg1.method457();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field868 == null) {
                        this.field868 = new String[5];
                    }
                    this.field868[var3 - 30] = arg1.method462();
                    if (this.field868[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field868[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method455();
                    this.field855 = new int[var6];
                    this.field835 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field855[var7] = arg1.method457();
                        this.field835[var7] = arg1.method457();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method455();
                    this.field856 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field856[var9] = arg1.method457();
                    }
                } else if (var3 == 90) {
                    this.field848 = arg1.method457();
                } else if (var3 == 91) {
                    this.field838 = arg1.method457();
                } else if (var3 == 92) {
                    this.field842 = arg1.method457();
                } else if (var3 == 93) {
                    this.field843 = false;
                } else if (var3 == 95) {
                    this.field840 = arg1.method457();
                } else if (var3 == 97) {
                    this.field844 = arg1.method457();
                } else if (var3 == 98) {
                    this.field850 = arg1.method457();
                } else if (var3 == 99) {
                    this.field859 = true;
                } else if (var3 == 100) {
                    this.field867 = arg1.method456();
                } else if (var3 == 101) {
                    this.field858 = arg1.method456() * 5;
                } else if (var3 == 102) {
                    this.field865 = arg1.method457();
                } else if (var3 == 103) {
                    this.field862 = arg1.method457();
                } else if (var3 == 106) {
                    this.field847 = arg1.method457();
                    if (this.field847 == 65535) {
                        this.field847 = -1;
                    }
                    this.field852 = arg1.method457();
                    if (this.field852 == 65535) {
                        this.field852 = -1;
                    }
                    int var10 = arg1.method455();
                    this.field836 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field836[var11] = arg1.method457();
                        if (this.field836[var11] == 65535) {
                            this.field836[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field829 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "JKAPIYZO", name = "c", descriptor = "(I)LJKAPIYZO;")
    public static final class24 method284(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field861[var1].field831) {
                return field861[var1];
            }
        }
        field853 = (field853 + 1) % 20;
        class24 var2 = field861[field853] = new class24();
        field833.field1456 = field834[arg0];
        var2.field831 = arg0;
        var2.method283(-7321, field833);
        return var2;
    }

    @OriginalMember(owner = "JKAPIYZO", name = "a", descriptor = "(LRVLWVPJQ;)V")
    public static final void method285(class50 arg0) {
        field833 = new class55(741, arg0.method424("npc.dat", null));
        class55 var1 = new class55(741, arg0.method424("npc.idx", null));
        field849 = var1.method457();
        field834 = new int[field849];
        int var2 = 2;
        for (int var3 = 0; var3 < field849; var3++) {
            field834[var3] = var2;
            var2 += var1.method457();
        }
        field861 = new class24[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field861[var4] = new class24();
        }
    }
}
