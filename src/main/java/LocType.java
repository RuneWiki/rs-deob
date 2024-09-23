import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class LocType {

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    private int field806 = -1;

    @OriginalMember(owner = "ac", name = "N", descriptor = "Ls;")
    public static LruCache field839 = new LruCache(500, (byte) 4);

    @OriginalMember(owner = "ac", name = "O", descriptor = "Ls;")
    public static LruCache field840 = new LruCache(30, (byte) 4);

    @OriginalMember(owner = "ac", name = "x", descriptor = "B")
    private byte field823;

    @OriginalMember(owner = "ac", name = "y", descriptor = "B")
    private byte field824;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private static int field801;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    private static int field805;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "ac", name = "o", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "ac", name = "v", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "ac", name = "w", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "ac", name = "B", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "ac", name = "C", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "ac", name = "F", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "ac", name = "G", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ac", name = "H", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "ac", name = "I", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "ac", name = "J", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "ac", name = "K", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "ac", name = "L", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "ac", name = "d", descriptor = "Lkb;")
    private static Packet field803;

    @OriginalMember(owner = "ac", name = "j", descriptor = "Ljava/lang/String;")
    public String field809;

    @OriginalMember(owner = "ac", name = "a", descriptor = "Z")
    public static boolean field800;

    @OriginalMember(owner = "ac", name = "p", descriptor = "Z")
    public boolean field815;

    @OriginalMember(owner = "ac", name = "q", descriptor = "Z")
    public boolean field816;

    @OriginalMember(owner = "ac", name = "r", descriptor = "Z")
    public boolean field817;

    @OriginalMember(owner = "ac", name = "s", descriptor = "Z")
    private boolean field818;

    @OriginalMember(owner = "ac", name = "t", descriptor = "Z")
    private boolean field819;

    @OriginalMember(owner = "ac", name = "u", descriptor = "Z")
    public boolean field820;

    @OriginalMember(owner = "ac", name = "A", descriptor = "Z")
    private boolean field826;

    @OriginalMember(owner = "ac", name = "D", descriptor = "Z")
    private boolean field829;

    @OriginalMember(owner = "ac", name = "E", descriptor = "Z")
    public boolean field830;

    @OriginalMember(owner = "ac", name = "M", descriptor = "Z")
    public boolean field838;

    @OriginalMember(owner = "ac", name = "k", descriptor = "[B")
    public byte[] field810;

    @OriginalMember(owner = "ac", name = "c", descriptor = "[I")
    private static int[] field802;

    @OriginalMember(owner = "ac", name = "h", descriptor = "[I")
    private int[] field807;

    @OriginalMember(owner = "ac", name = "i", descriptor = "[I")
    private int[] field808;

    @OriginalMember(owner = "ac", name = "l", descriptor = "[I")
    private int[] field811;

    @OriginalMember(owner = "ac", name = "m", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[Lac;")
    private static LocType[] field804;

    @OriginalMember(owner = "ac", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field825;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lub;)V")
    public static final void method273(Jagfile arg0) {
        field803 = new Packet(0, arg0.method250("loc.dat", null, 8));
        Packet var1 = new Packet(0, arg0.method250("loc.idx", null, 8));
        field801 = var1.method211();
        field802 = new int[field801];
        int var2 = 2;
        for (int var3 = 0; var3 < field801; var3++) {
            field802[var3] = var2;
            var2 += var1.method211();
        }
        field804 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field804[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(B)V")
    public static final void method274(byte arg0) {
        field839 = null;
        if (arg0 == -123) {
            field840 = null;
            field802 = null;
            field804 = null;
            field803 = null;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)Lac;")
    public static final LocType method275(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field804[var1].field806 == arg0) {
                return field804[var1];
            }
        }
        field805 = (field805 + 1) % 10;
        LocType var2 = field804[field805];
        field803.field621 = field802[arg0];
        var2.field806 = arg0;
        var2.method276();
        var2.method277(field803, 0);
        return var2;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "()V")
    private final void method276() {
        this.field807 = null;
        this.field808 = null;
        this.field809 = null;
        this.field810 = null;
        this.field811 = null;
        this.field812 = null;
        this.field813 = 1;
        this.field814 = 1;
        this.field815 = true;
        this.field816 = true;
        this.field817 = false;
        this.field818 = false;
        this.field819 = false;
        this.field820 = false;
        this.field821 = -1;
        this.field822 = 16;
        this.field823 = 0;
        this.field824 = 0;
        this.field825 = null;
        this.field826 = false;
        this.field827 = -1;
        this.field828 = -1;
        this.field829 = false;
        this.field830 = true;
        this.field831 = 128;
        this.field832 = 128;
        this.field833 = 128;
        this.field837 = 0;
        this.field834 = 0;
        this.field835 = 0;
        this.field836 = 0;
        this.field838 = false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lkb;I)V")
    private final void method277(Packet arg0, int arg1) {
        int var3 = -1;
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg0.method209();
                if (var5 == 0) {
                    if (this.field808 == null) {
                        this.field808 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field817 = false;
                        if (this.field808.length > 0 && this.field808[0] == 10) {
                            this.field817 = true;
                        }
                        if (this.field825 != null) {
                            this.field817 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg0.method209();
                    this.field808 = new int[var6];
                    this.field807 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field807[var7] = arg0.method211();
                        this.field808[var7] = arg0.method209();
                    }
                } else if (var5 == 2) {
                    this.field809 = arg0.method216();
                } else if (var5 == 3) {
                    this.field810 = arg0.method217(497);
                } else if (var5 == 14) {
                    this.field813 = arg0.method209();
                } else if (var5 == 15) {
                    this.field814 = arg0.method209();
                } else if (var5 == 17) {
                    this.field815 = false;
                } else if (var5 == 18) {
                    this.field816 = false;
                } else if (var5 == 19) {
                    var3 = arg0.method209();
                    if (var3 == 1) {
                        this.field817 = true;
                    }
                } else if (var5 == 21) {
                    this.field818 = true;
                } else if (var5 == 22) {
                    this.field819 = true;
                } else if (var5 == 23) {
                    this.field820 = true;
                } else if (var5 == 24) {
                    this.field821 = arg0.method211();
                    if (this.field821 == 65535) {
                        this.field821 = -1;
                    }
                } else if (var5 == 25) {
                    this.field826 = true;
                } else if (var5 == 28) {
                    this.field822 = arg0.method209();
                } else if (var5 == 29) {
                    this.field823 = arg0.method210();
                } else if (var5 == 39) {
                    this.field824 = arg0.method210();
                } else if (var5 >= 30 && var5 < 39) {
                    if (this.field825 == null) {
                        this.field825 = new String[5];
                    }
                    this.field825[var5 - 30] = arg0.method216();
                    if (this.field825[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field825[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg0.method209();
                    this.field811 = new int[var8];
                    this.field812 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field811[var9] = arg0.method211();
                        this.field812[var9] = arg0.method211();
                    }
                } else if (var5 == 60) {
                    this.field827 = arg0.method211();
                } else if (var5 == 62) {
                    this.field829 = true;
                } else if (var5 == 64) {
                    this.field830 = false;
                } else if (var5 == 65) {
                    this.field831 = arg0.method211();
                } else if (var5 == 66) {
                    this.field832 = arg0.method211();
                } else if (var5 == 67) {
                    this.field833 = arg0.method211();
                } else if (var5 == 68) {
                    this.field828 = arg0.method211();
                } else if (var5 == 69) {
                    this.field837 = arg0.method209();
                } else if (var5 == 70) {
                    this.field834 = arg0.method212();
                } else if (var5 == 71) {
                    this.field835 = arg0.method212();
                } else if (var5 == 72) {
                    this.field836 = arg0.method212();
                } else if (var5 == 73) {
                    this.field838 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field808.length; var9++) {
            if (this.field808[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field806 << 6) + (var8 << 3) + arg1);
        if (field800) {
            var10 = 0L;
        }
        Model var12 = (Model) field840.method102(var10);
        if (var12 == null) {
            if (var8 >= this.field807.length) {
                return null;
            }
            int var20 = this.field807[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field829 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field839.method102((long) var20);
            if (var22 == null) {
                var22 = new Model(0, var20 & 0xFFFF);
                if (var21) {
                    var22.method134(false);
                }
                field839.method103((long) var20, 1567, var22);
            }
            boolean var23;
            if (this.field831 == 128 && this.field832 == 128 && this.field833 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field834 == 0 && this.field835 == 0 && this.field836 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(!this.field826, false, arg1 == 0 && arg6 == -1 && !var23 && !var24, var22, this.field811 == null);
            if (arg6 != -1) {
                var25.method126(-36895);
                var25.method127(1, arg6);
                var25.field479 = null;
                var25.field478 = null;
            }
            while (arg1-- > 0) {
                var25.method130(855);
            }
            if (this.field811 != null) {
                for (int var26 = 0; var26 < this.field811.length; var26++) {
                    var25.method133(this.field811[var26], this.field812[var26]);
                }
            }
            if (var23) {
                var25.method135(this.field833, this.field831, true, this.field832);
            }
            if (var24) {
                var25.method132(3, this.field834, this.field835, this.field836);
            }
            var25.method136(this.field823 + 64, this.field824 * 5 + 768, -50, -10, -50, !this.field819);
            if (this.field815) {
                var25.field475 = var25.field471;
            }
            field840.method103(var10, 1567, var25);
            if (this.field818 || this.field819) {
                var25 = new Model(982, this.field818, this.field819, var25);
            }
            if (this.field818) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field446; var28++) {
                    int var29 = var25.field447[var28];
                    int var30 = var25.field449[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field448[var28] += var33 - var27;
                }
                var25.method124((byte) 8);
            }
            return var25;
        } else if (field800) {
            return var12;
        } else {
            if (this.field818 || this.field819) {
                var12 = new Model(982, this.field818, this.field819, var12);
            }
            if (this.field818) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field446; var14++) {
                    int var15 = var12.field447[var14];
                    int var16 = var12.field449[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field448[var14] += var19 - var13;
                }
                var12.method124((byte) 8);
            }
            return var12;
        }
    }
}
