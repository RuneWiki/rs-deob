import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class LocType {

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field804 = -1;

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private static int field796 = 19303;

    @OriginalMember(owner = "ac", name = "b", descriptor = "Z")
    private static boolean field797 = true;

    @OriginalMember(owner = "ac", name = "P", descriptor = "Ls;")
    public static LruCache field837 = new LruCache(-24, 500);

    @OriginalMember(owner = "ac", name = "Q", descriptor = "Ls;")
    public static LruCache field838 = new LruCache(-24, 30);

    @OriginalMember(owner = "ac", name = "z", descriptor = "B")
    private byte field821;

    @OriginalMember(owner = "ac", name = "A", descriptor = "B")
    private byte field822;

    @OriginalMember(owner = "ac", name = "d", descriptor = "I")
    private static int field799;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    private static int field803;

    @OriginalMember(owner = "ac", name = "p", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "ac", name = "q", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "ac", name = "x", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "ac", name = "y", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "ac", name = "D", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "ac", name = "E", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "ac", name = "H", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "ac", name = "I", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "ac", name = "J", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "ac", name = "K", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ac", name = "L", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "ac", name = "M", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "ac", name = "N", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "ac", name = "f", descriptor = "Lkb;")
    private static Packet field801;

    @OriginalMember(owner = "ac", name = "l", descriptor = "Ljava/lang/String;")
    public String field807;

    @OriginalMember(owner = "ac", name = "c", descriptor = "Z")
    public static boolean field798;

    @OriginalMember(owner = "ac", name = "r", descriptor = "Z")
    public boolean field813;

    @OriginalMember(owner = "ac", name = "s", descriptor = "Z")
    public boolean field814;

    @OriginalMember(owner = "ac", name = "t", descriptor = "Z")
    public boolean field815;

    @OriginalMember(owner = "ac", name = "u", descriptor = "Z")
    private boolean field816;

    @OriginalMember(owner = "ac", name = "v", descriptor = "Z")
    private boolean field817;

    @OriginalMember(owner = "ac", name = "w", descriptor = "Z")
    public boolean field818;

    @OriginalMember(owner = "ac", name = "C", descriptor = "Z")
    private boolean field824;

    @OriginalMember(owner = "ac", name = "F", descriptor = "Z")
    private boolean field827;

    @OriginalMember(owner = "ac", name = "G", descriptor = "Z")
    public boolean field828;

    @OriginalMember(owner = "ac", name = "O", descriptor = "Z")
    public boolean field836;

    @OriginalMember(owner = "ac", name = "m", descriptor = "[B")
    public byte[] field808;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private static int[] field800;

    @OriginalMember(owner = "ac", name = "j", descriptor = "[I")
    private int[] field805;

    @OriginalMember(owner = "ac", name = "k", descriptor = "[I")
    private int[] field806;

    @OriginalMember(owner = "ac", name = "n", descriptor = "[I")
    private int[] field809;

    @OriginalMember(owner = "ac", name = "o", descriptor = "[I")
    private int[] field810;

    @OriginalMember(owner = "ac", name = "g", descriptor = "[Lac;")
    private static LocType[] field802;

    @OriginalMember(owner = "ac", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field823;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lub;)V")
    public static final void method280(Jagfile arg0) {
        field801 = new Packet((byte) 64, arg0.method257(null, "loc.dat", -31149));
        Packet var1 = new Packet((byte) 64, arg0.method257(null, "loc.idx", -31149));
        field799 = var1.method218();
        field800 = new int[field799];
        int var2 = 2;
        for (int var3 = 0; var3 < field799; var3++) {
            field800[var3] = var2;
            var2 += var1.method218();
        }
        field802 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field802[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)V")
    public static final void method281(int arg0) {
        field837 = null;
        field838 = null;
        field800 = null;
        if (arg0 >= 0) {
            field797 = !field797;
        }
        field802 = null;
        field801 = null;
    }

    @OriginalMember(owner = "ac", name = "b", descriptor = "(I)Lac;")
    public static final LocType method282(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field802[var1].field804 == arg0) {
                return field802[var1];
            }
        }
        field803 = (field803 + 1) % 10;
        LocType var2 = field802[field803];
        field801.field624 = field800[arg0];
        var2.field804 = arg0;
        var2.method283();
        var2.method284(field801, true);
        return var2;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "()V")
    private final void method283() {
        this.field805 = null;
        this.field806 = null;
        this.field807 = null;
        this.field808 = null;
        this.field809 = null;
        this.field810 = null;
        this.field811 = 1;
        this.field812 = 1;
        this.field813 = true;
        this.field814 = true;
        this.field815 = false;
        this.field816 = false;
        this.field817 = false;
        this.field818 = false;
        this.field819 = -1;
        this.field820 = 16;
        this.field821 = 0;
        this.field822 = 0;
        this.field823 = null;
        this.field824 = false;
        this.field825 = -1;
        this.field826 = -1;
        this.field827 = false;
        this.field828 = true;
        this.field829 = 128;
        this.field830 = 128;
        this.field831 = 128;
        this.field835 = 0;
        this.field832 = 0;
        this.field833 = 0;
        this.field834 = 0;
        this.field836 = false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lkb;Z)V")
    private final void method284(Packet arg0, boolean arg1) {
        int var3 = -1;
        if (!arg1) {
            field797 = !field797;
        }
        while (true) {
            while (true) {
                int var4 = arg0.method216();
                if (var4 == 0) {
                    if (this.field806 == null) {
                        this.field806 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field815 = false;
                        if (this.field806.length > 0 && this.field806[0] == 10) {
                            this.field815 = true;
                        }
                        if (this.field823 != null) {
                            this.field815 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method216();
                    this.field806 = new int[var5];
                    this.field805 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field805[var6] = arg0.method218();
                        this.field806[var6] = arg0.method216();
                    }
                } else if (var4 == 2) {
                    this.field807 = arg0.method223();
                } else if (var4 == 3) {
                    this.field808 = arg0.method224((byte) -66);
                } else if (var4 == 14) {
                    this.field811 = arg0.method216();
                } else if (var4 == 15) {
                    this.field812 = arg0.method216();
                } else if (var4 == 17) {
                    this.field813 = false;
                } else if (var4 == 18) {
                    this.field814 = false;
                } else if (var4 == 19) {
                    var3 = arg0.method216();
                    if (var3 == 1) {
                        this.field815 = true;
                    }
                } else if (var4 == 21) {
                    this.field816 = true;
                } else if (var4 == 22) {
                    this.field817 = true;
                } else if (var4 == 23) {
                    this.field818 = true;
                } else if (var4 == 24) {
                    this.field819 = arg0.method218();
                    if (this.field819 == 65535) {
                        this.field819 = -1;
                    }
                } else if (var4 == 25) {
                    this.field824 = true;
                } else if (var4 == 28) {
                    this.field820 = arg0.method216();
                } else if (var4 == 29) {
                    this.field821 = arg0.method217();
                } else if (var4 == 39) {
                    this.field822 = arg0.method217();
                } else if (var4 >= 30 && var4 < 39) {
                    if (this.field823 == null) {
                        this.field823 = new String[5];
                    }
                    this.field823[var4 - 30] = arg0.method223();
                    if (this.field823[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field823[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method216();
                    this.field809 = new int[var7];
                    this.field810 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field809[var8] = arg0.method218();
                        this.field810[var8] = arg0.method218();
                    }
                } else if (var4 == 60) {
                    this.field825 = arg0.method218();
                } else if (var4 == 62) {
                    this.field827 = true;
                } else if (var4 == 64) {
                    this.field828 = false;
                } else if (var4 == 65) {
                    this.field829 = arg0.method218();
                } else if (var4 == 66) {
                    this.field830 = arg0.method218();
                } else if (var4 == 67) {
                    this.field831 = arg0.method218();
                } else if (var4 == 68) {
                    this.field826 = arg0.method218();
                } else if (var4 == 69) {
                    this.field835 = arg0.method216();
                } else if (var4 == 70) {
                    this.field832 = arg0.method219();
                } else if (var4 == 71) {
                    this.field833 = arg0.method219();
                } else if (var4 == 72) {
                    this.field834 = arg0.method219();
                } else if (var4 == 73) {
                    this.field836 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field806.length; var9++) {
            if (this.field806[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field804 << 6) + (var8 << 3) + arg1);
        if (field798) {
            var10 = 0L;
        }
        Model var12 = (Model) field838.method103(var10);
        if (var12 == null) {
            if (var8 >= this.field805.length) {
                return null;
            }
            int var20 = this.field805[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field827 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field837.method103((long) var20);
            if (var22 == null) {
                var22 = new Model(var20 & 0xFFFF, (byte) 1);
                if (var21) {
                    var22.method135(0);
                }
                field837.method104(var22, (long) var20, false);
            }
            boolean var23;
            if (this.field829 == 128 && this.field830 == 128 && this.field831 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field832 == 0 && this.field833 == 0 && this.field834 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(!this.field824, (byte) 70, this.field809 == null, var22, arg1 == 0 && arg6 == -1 && !var23 && !var24);
            if (arg6 != -1) {
                var25.method127(false);
                var25.method128(arg6, 5565);
                var25.field489 = null;
                var25.field488 = null;
            }
            while (arg1-- > 0) {
                var25.method131(field796);
            }
            if (this.field809 != null) {
                for (int var26 = 0; var26 < this.field809.length; var26++) {
                    var25.method134(this.field809[var26], this.field810[var26]);
                }
            }
            if (var23) {
                var25.method136(this.field830, this.field829, false, this.field831);
            }
            if (var24) {
                var25.method133(this.field834, this.field833, (byte) 1, this.field832);
            }
            var25.method137(this.field821 + 64, this.field822 * 5 + 768, -50, -10, -50, !this.field817);
            if (this.field813) {
                var25.field485 = var25.field481;
            }
            field838.method104(var25, var10, false);
            if (this.field816 || this.field817) {
                var25 = new Model((byte) -80, this.field817, var25, this.field816);
            }
            if (this.field816) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field456; var28++) {
                    int var29 = var25.field457[var28];
                    int var30 = var25.field459[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field458[var28] += var33 - var27;
                }
                var25.method125(-629);
            }
            return var25;
        } else if (field798) {
            return var12;
        } else {
            if (this.field816 || this.field817) {
                var12 = new Model((byte) -80, this.field817, var12, this.field816);
            }
            if (this.field816) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field456; var14++) {
                    int var15 = var12.field457[var14];
                    int var16 = var12.field459[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field458[var14] += var19 - var13;
                }
                var12.method125(-629);
            }
            return var12;
        }
    }
}
