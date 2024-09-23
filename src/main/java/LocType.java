import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class LocType {

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field817 = -1;

    @OriginalMember(owner = "ac", name = "a", descriptor = "B")
    private static byte field808 = 8;

    @OriginalMember(owner = "ac", name = "b", descriptor = "B")
    private static byte field809 = 4;

    @OriginalMember(owner = "ac", name = "Q", descriptor = "Ls;")
    public static LruCache field850 = new LruCache(2, 500);

    @OriginalMember(owner = "ac", name = "R", descriptor = "Ls;")
    public static LruCache field851 = new LruCache(2, 30);

    @OriginalMember(owner = "ac", name = "A", descriptor = "B")
    private byte field834;

    @OriginalMember(owner = "ac", name = "B", descriptor = "B")
    private byte field835;

    @OriginalMember(owner = "ac", name = "c", descriptor = "I")
    private static int field810;

    @OriginalMember(owner = "ac", name = "e", descriptor = "I")
    private static int field812;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private static int field816;

    @OriginalMember(owner = "ac", name = "q", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "ac", name = "r", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "ac", name = "y", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "ac", name = "z", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "ac", name = "E", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "ac", name = "F", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "ac", name = "I", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "ac", name = "J", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "ac", name = "K", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "ac", name = "L", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "ac", name = "M", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "ac", name = "N", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "ac", name = "O", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "ac", name = "g", descriptor = "Lkb;")
    private static Packet field814;

    @OriginalMember(owner = "ac", name = "m", descriptor = "Ljava/lang/String;")
    public String field820;

    @OriginalMember(owner = "ac", name = "d", descriptor = "Z")
    public static boolean field811;

    @OriginalMember(owner = "ac", name = "s", descriptor = "Z")
    public boolean field826;

    @OriginalMember(owner = "ac", name = "t", descriptor = "Z")
    public boolean field827;

    @OriginalMember(owner = "ac", name = "u", descriptor = "Z")
    public boolean field828;

    @OriginalMember(owner = "ac", name = "v", descriptor = "Z")
    private boolean field829;

    @OriginalMember(owner = "ac", name = "w", descriptor = "Z")
    private boolean field830;

    @OriginalMember(owner = "ac", name = "x", descriptor = "Z")
    public boolean field831;

    @OriginalMember(owner = "ac", name = "D", descriptor = "Z")
    private boolean field837;

    @OriginalMember(owner = "ac", name = "G", descriptor = "Z")
    private boolean field840;

    @OriginalMember(owner = "ac", name = "H", descriptor = "Z")
    public boolean field841;

    @OriginalMember(owner = "ac", name = "P", descriptor = "Z")
    public boolean field849;

    @OriginalMember(owner = "ac", name = "n", descriptor = "[B")
    public byte[] field821;

    @OriginalMember(owner = "ac", name = "f", descriptor = "[I")
    private static int[] field813;

    @OriginalMember(owner = "ac", name = "k", descriptor = "[I")
    private int[] field818;

    @OriginalMember(owner = "ac", name = "l", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "ac", name = "o", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "ac", name = "p", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "ac", name = "h", descriptor = "[Lac;")
    private static LocType[] field815;

    @OriginalMember(owner = "ac", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field836;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lub;)V")
    public static final void method273(Jagfile arg0) {
        field814 = new Packet(arg0.method250(field809, "loc.dat", null), 0);
        Packet var1 = new Packet(arg0.method250(field809, "loc.idx", null), 0);
        field812 = var1.method211();
        field813 = new int[field812];
        int var2 = 2;
        for (int var3 = 0; var3 < field812; var3++) {
            field813[var3] = var2;
            var2 += var1.method211();
        }
        field815 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field815[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Z)V")
    public static final void method274(boolean arg0) {
        if (arg0) {
            return;
        }
        field850 = null;
        field851 = null;
        field813 = null;
        field815 = null;
        field814 = null;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)Lac;")
    public static final LocType method275(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field815[var1].field817 == arg0) {
                return field815[var1];
            }
        }
        field816 = (field816 + 1) % 10;
        LocType var2 = field815[field816];
        field814.field623 = field813[arg0];
        var2.field817 = arg0;
        var2.method276();
        var2.method277(field808, field814);
        return var2;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "()V")
    private final void method276() {
        this.field818 = null;
        this.field819 = null;
        this.field820 = null;
        this.field821 = null;
        this.field822 = null;
        this.field823 = null;
        this.field824 = 1;
        this.field825 = 1;
        this.field826 = true;
        this.field827 = true;
        this.field828 = false;
        this.field829 = false;
        this.field830 = false;
        this.field831 = false;
        this.field832 = -1;
        this.field833 = 16;
        this.field834 = 0;
        this.field835 = 0;
        this.field836 = null;
        this.field837 = false;
        this.field838 = -1;
        this.field839 = -1;
        this.field840 = false;
        this.field841 = true;
        this.field842 = 128;
        this.field843 = 128;
        this.field844 = 128;
        this.field848 = 0;
        this.field845 = 0;
        this.field846 = 0;
        this.field847 = 0;
        this.field849 = false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BLkb;)V")
    private final void method277(byte arg0, Packet arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        int var4 = -1;
        while (true) {
            while (true) {
                int var5 = arg1.method209();
                if (var5 == 0) {
                    if (this.field819 == null) {
                        this.field819 = new int[0];
                    }
                    if (var4 == -1) {
                        this.field828 = false;
                        if (this.field819.length > 0 && this.field819[0] == 10) {
                            this.field828 = true;
                        }
                        if (this.field836 != null) {
                            this.field828 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method209();
                    this.field819 = new int[var6];
                    this.field818 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field818[var7] = arg1.method211();
                        this.field819[var7] = arg1.method209();
                    }
                } else if (var5 == 2) {
                    this.field820 = arg1.method216();
                } else if (var5 == 3) {
                    this.field821 = arg1.method217(0);
                } else if (var5 == 14) {
                    this.field824 = arg1.method209();
                } else if (var5 == 15) {
                    this.field825 = arg1.method209();
                } else if (var5 == 17) {
                    this.field826 = false;
                } else if (var5 == 18) {
                    this.field827 = false;
                } else if (var5 == 19) {
                    var4 = arg1.method209();
                    if (var4 == 1) {
                        this.field828 = true;
                    }
                } else if (var5 == 21) {
                    this.field829 = true;
                } else if (var5 == 22) {
                    this.field830 = true;
                } else if (var5 == 23) {
                    this.field831 = true;
                } else if (var5 == 24) {
                    this.field832 = arg1.method211();
                    if (this.field832 == 65535) {
                        this.field832 = -1;
                    }
                } else if (var5 == 25) {
                    this.field837 = true;
                } else if (var5 == 28) {
                    this.field833 = arg1.method209();
                } else if (var5 == 29) {
                    this.field834 = arg1.method210();
                } else if (var5 == 39) {
                    this.field835 = arg1.method210();
                } else if (var5 >= 30 && var5 < 39) {
                    if (this.field836 == null) {
                        this.field836 = new String[5];
                    }
                    this.field836[var5 - 30] = arg1.method216();
                    if (this.field836[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field836[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method209();
                    this.field822 = new int[var8];
                    this.field823 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field822[var9] = arg1.method211();
                        this.field823[var9] = arg1.method211();
                    }
                } else if (var5 == 60) {
                    this.field838 = arg1.method211();
                } else if (var5 == 62) {
                    this.field840 = true;
                } else if (var5 == 64) {
                    this.field841 = false;
                } else if (var5 == 65) {
                    this.field842 = arg1.method211();
                } else if (var5 == 66) {
                    this.field843 = arg1.method211();
                } else if (var5 == 67) {
                    this.field844 = arg1.method211();
                } else if (var5 == 68) {
                    this.field839 = arg1.method211();
                } else if (var5 == 69) {
                    this.field848 = arg1.method209();
                } else if (var5 == 70) {
                    this.field845 = arg1.method212();
                } else if (var5 == 71) {
                    this.field846 = arg1.method212();
                } else if (var5 == 72) {
                    this.field847 = arg1.method212();
                } else if (var5 == 73) {
                    this.field849 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field819.length; var9++) {
            if (this.field819[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field817 << 6) + (var8 << 3) + arg1);
        if (field811) {
            var10 = 0L;
        }
        Model var12 = (Model) field851.method102(var10);
        if (var12 == null) {
            if (var8 >= this.field818.length) {
                return null;
            }
            int var20 = this.field818[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field840 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field850.method102((long) var20);
            if (var22 == null) {
                var22 = new Model(var20 & 0xFFFF, 6);
                if (var21) {
                    var22.method134(true);
                }
                field850.method103(var22, (long) var20, -21658);
            }
            boolean var23;
            if (this.field842 == 128 && this.field843 == 128 && this.field844 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field845 == 0 && this.field846 == 0 && this.field847 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(364, var22, !this.field837, arg1 == 0 && arg6 == -1 && !var23 && !var24, this.field822 == null);
            if (arg6 != -1) {
                var25.method126(797);
                var25.method127(arg6, (byte) -89);
                var25.field486 = null;
                var25.field485 = null;
            }
            while (arg1-- > 0) {
                var25.method130(-5944);
            }
            if (this.field822 != null) {
                for (int var26 = 0; var26 < this.field822.length; var26++) {
                    var25.method133(this.field822[var26], this.field823[var26]);
                }
            }
            if (var23) {
                var25.method135(this.field843, -221, this.field842, this.field844);
            }
            if (var24) {
                var25.method132(this.field847, field810, this.field845, this.field846);
            }
            var25.method136(this.field834 + 64, this.field835 * 5 + 768, -50, -10, -50, !this.field830);
            if (this.field826) {
                var25.field482 = var25.field478;
            }
            field851.method103(var25, var10, -21658);
            if (this.field829 || this.field830) {
                var25 = new Model(this.field829, var25, false, this.field830);
            }
            if (this.field829) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field453; var28++) {
                    int var29 = var25.field454[var28];
                    int var30 = var25.field456[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field455[var28] += var33 - var27;
                }
                var25.method124(-26706);
            }
            return var25;
        } else if (field811) {
            return var12;
        } else {
            if (this.field829 || this.field830) {
                var12 = new Model(this.field829, var12, false, this.field830);
            }
            if (this.field829) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field453; var14++) {
                    int var15 = var12.field454[var14];
                    int var16 = var12.field456[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field455[var14] += var19 - var13;
                }
                var12.method124(-26706);
            }
            return var12;
        }
    }
}
