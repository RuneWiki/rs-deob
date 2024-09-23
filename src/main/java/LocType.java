import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class LocType {

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field807 = -1;

    @OriginalMember(owner = "ac", name = "P", descriptor = "Ls;")
    public static LruCache field840 = new LruCache((byte) 0, 500);

    @OriginalMember(owner = "ac", name = "Q", descriptor = "Ls;")
    public static LruCache field841 = new LruCache((byte) 0, 30);

    @OriginalMember(owner = "ac", name = "z", descriptor = "B")
    private byte field824;

    @OriginalMember(owner = "ac", name = "A", descriptor = "B")
    private byte field825;

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private static int field799;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private static int field800;

    @OriginalMember(owner = "ac", name = "d", descriptor = "I")
    private static int field802;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    private static int field806;

    @OriginalMember(owner = "ac", name = "p", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "ac", name = "q", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "ac", name = "x", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "ac", name = "y", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "ac", name = "D", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "ac", name = "E", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "ac", name = "H", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ac", name = "I", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "ac", name = "J", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "ac", name = "K", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "ac", name = "L", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "ac", name = "M", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "ac", name = "N", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "ac", name = "f", descriptor = "Lkb;")
    private static Packet field804;

    @OriginalMember(owner = "ac", name = "l", descriptor = "Ljava/lang/String;")
    public String field810;

    @OriginalMember(owner = "ac", name = "c", descriptor = "Z")
    public static boolean field801;

    @OriginalMember(owner = "ac", name = "r", descriptor = "Z")
    public boolean field816;

    @OriginalMember(owner = "ac", name = "s", descriptor = "Z")
    public boolean field817;

    @OriginalMember(owner = "ac", name = "t", descriptor = "Z")
    public boolean field818;

    @OriginalMember(owner = "ac", name = "u", descriptor = "Z")
    private boolean field819;

    @OriginalMember(owner = "ac", name = "v", descriptor = "Z")
    private boolean field820;

    @OriginalMember(owner = "ac", name = "w", descriptor = "Z")
    public boolean field821;

    @OriginalMember(owner = "ac", name = "C", descriptor = "Z")
    private boolean field827;

    @OriginalMember(owner = "ac", name = "F", descriptor = "Z")
    private boolean field830;

    @OriginalMember(owner = "ac", name = "G", descriptor = "Z")
    public boolean field831;

    @OriginalMember(owner = "ac", name = "O", descriptor = "Z")
    public boolean field839;

    @OriginalMember(owner = "ac", name = "m", descriptor = "[B")
    public byte[] field811;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private static int[] field803;

    @OriginalMember(owner = "ac", name = "j", descriptor = "[I")
    private int[] field808;

    @OriginalMember(owner = "ac", name = "k", descriptor = "[I")
    private int[] field809;

    @OriginalMember(owner = "ac", name = "n", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "ac", name = "o", descriptor = "[I")
    private int[] field813;

    @OriginalMember(owner = "ac", name = "g", descriptor = "[Lac;")
    private static LocType[] field805;

    @OriginalMember(owner = "ac", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field826;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lub;)V")
    public static final void method280(Jagfile arg0) {
        field804 = new Packet(363, arg0.read("loc.dat", null, (byte) 2));
        Packet var1 = new Packet(363, arg0.read("loc.idx", null, (byte) 2));
        field802 = var1.method218();
        field803 = new int[field802];
        int var2 = 2;
        for (int var3 = 0; var3 < field802; var3++) {
            field803[var3] = var2;
            var2 += var1.method218();
        }
        field805 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field805[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Z)V")
    public static final void method281(boolean arg0) {
        field840 = null;
        field841 = null;
        if (arg0) {
            field803 = null;
            field805 = null;
            field804 = null;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)Lac;")
    public static final LocType method282(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field805[var1].field807 == arg0) {
                return field805[var1];
            }
        }
        field806 = (field806 + 1) % 10;
        LocType var2 = field805[field806];
        field804.field622 = field803[arg0];
        var2.field807 = arg0;
        var2.method283();
        var2.method284(false, field804);
        return var2;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "()V")
    private final void method283() {
        this.field808 = null;
        this.field809 = null;
        this.field810 = null;
        this.field811 = null;
        this.field812 = null;
        this.field813 = null;
        this.field814 = 1;
        this.field815 = 1;
        this.field816 = true;
        this.field817 = true;
        this.field818 = false;
        this.field819 = false;
        this.field820 = false;
        this.field821 = false;
        this.field822 = -1;
        this.field823 = 16;
        this.field824 = 0;
        this.field825 = 0;
        this.field826 = null;
        this.field827 = false;
        this.field828 = -1;
        this.field829 = -1;
        this.field830 = false;
        this.field831 = true;
        this.field832 = 128;
        this.field833 = 128;
        this.field834 = 128;
        this.field838 = 0;
        this.field835 = 0;
        this.field836 = 0;
        this.field837 = 0;
        this.field839 = false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZLkb;)V")
    private final void method284(boolean arg0, Packet arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            while (true) {
                int var5 = arg1.method216();
                if (var5 == 0) {
                    if (this.field809 == null) {
                        this.field809 = new int[0];
                    }
                    if (var4 == -1) {
                        this.field818 = false;
                        if (this.field809.length > 0 && this.field809[0] == 10) {
                            this.field818 = true;
                        }
                        if (this.field826 != null) {
                            this.field818 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method216();
                    this.field809 = new int[var6];
                    this.field808 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field808[var7] = arg1.method218();
                        this.field809[var7] = arg1.method216();
                    }
                } else if (var5 == 2) {
                    this.field810 = arg1.method223();
                } else if (var5 == 3) {
                    this.field811 = arg1.method224((byte) 31);
                } else if (var5 == 14) {
                    this.field814 = arg1.method216();
                } else if (var5 == 15) {
                    this.field815 = arg1.method216();
                } else if (var5 == 17) {
                    this.field816 = false;
                } else if (var5 == 18) {
                    this.field817 = false;
                } else if (var5 == 19) {
                    var4 = arg1.method216();
                    if (var4 == 1) {
                        this.field818 = true;
                    }
                } else if (var5 == 21) {
                    this.field819 = true;
                } else if (var5 == 22) {
                    this.field820 = true;
                } else if (var5 == 23) {
                    this.field821 = true;
                } else if (var5 == 24) {
                    this.field822 = arg1.method218();
                    if (this.field822 == 65535) {
                        this.field822 = -1;
                    }
                } else if (var5 == 25) {
                    this.field827 = true;
                } else if (var5 == 28) {
                    this.field823 = arg1.method216();
                } else if (var5 == 29) {
                    this.field824 = arg1.method217();
                } else if (var5 == 39) {
                    this.field825 = arg1.method217();
                } else if (var5 >= 30 && var5 < 39) {
                    if (this.field826 == null) {
                        this.field826 = new String[5];
                    }
                    this.field826[var5 - 30] = arg1.method223();
                    if (this.field826[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field826[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method216();
                    this.field812 = new int[var8];
                    this.field813 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field812[var9] = arg1.method218();
                        this.field813[var9] = arg1.method218();
                    }
                } else if (var5 == 60) {
                    this.field828 = arg1.method218();
                } else if (var5 == 62) {
                    this.field830 = true;
                } else if (var5 == 64) {
                    this.field831 = false;
                } else if (var5 == 65) {
                    this.field832 = arg1.method218();
                } else if (var5 == 66) {
                    this.field833 = arg1.method218();
                } else if (var5 == 67) {
                    this.field834 = arg1.method218();
                } else if (var5 == 68) {
                    this.field829 = arg1.method218();
                } else if (var5 == 69) {
                    this.field838 = arg1.method216();
                } else if (var5 == 70) {
                    this.field835 = arg1.method219();
                } else if (var5 == 71) {
                    this.field836 = arg1.method219();
                } else if (var5 == 72) {
                    this.field837 = arg1.method219();
                } else if (var5 == 73) {
                    this.field839 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field809.length; var9++) {
            if (this.field809[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field807 << 6) + (var8 << 3) + arg1);
        if (field801) {
            var10 = 0L;
        }
        Model var12 = (Model) field841.method103(var10);
        if (var12 == null) {
            if (var8 >= this.field808.length) {
                return null;
            }
            int var20 = this.field808[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field830 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field840.method103((long) var20);
            if (var22 == null) {
                var22 = new Model(false, var20 & 0xFFFF);
                if (var21) {
                    var22.method135(-725);
                }
                field840.method104(6, (long) var20, var22);
            }
            boolean var23;
            if (this.field832 == 128 && this.field833 == 128 && this.field834 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field835 == 0 && this.field836 == 0 && this.field837 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(var22, this.field812 == null, !this.field827, field799, arg1 == 0 && arg6 == -1 && !var23 && !var24);
            if (arg6 != -1) {
                var25.method127(4);
                var25.method128(-16599, arg6);
                var25.field480 = null;
                var25.field479 = null;
            }
            while (arg1-- > 0) {
                var25.method131(0);
            }
            if (this.field812 != null) {
                for (int var26 = 0; var26 < this.field812.length; var26++) {
                    var25.method134(this.field812[var26], this.field813[var26]);
                }
            }
            if (var23) {
                var25.method136(this.field834, 2, this.field833, this.field832);
            }
            if (var24) {
                var25.method133(this.field836, this.field835, -122, this.field837);
            }
            var25.method137(this.field824 + 64, this.field825 * 5 + 768, -50, -10, -50, !this.field820);
            if (this.field816) {
                var25.field476 = var25.field472;
            }
            field841.method104(6, var10, var25);
            if (this.field819 || this.field820) {
                var25 = new Model(var25, (byte) -31, this.field819, this.field820);
            }
            if (this.field819) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field447; var28++) {
                    int var29 = var25.field448[var28];
                    int var30 = var25.field450[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field449[var28] += var33 - var27;
                }
                var25.method125(field800);
            }
            return var25;
        } else if (field801) {
            return var12;
        } else {
            if (this.field819 || this.field820) {
                var12 = new Model(var12, (byte) -31, this.field819, this.field820);
            }
            if (this.field819) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field447; var14++) {
                    int var15 = var12.field448[var14];
                    int var16 = var12.field450[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field449[var14] += var19 - var13;
                }
                var12.method125(field800);
            }
            return var12;
        }
    }
}
