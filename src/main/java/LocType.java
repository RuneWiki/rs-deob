import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class LocType {

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field787 = -1;

    @OriginalMember(owner = "ac", name = "P", descriptor = "Ls;")
    public static LruCache field820 = new LruCache(500, 4);

    @OriginalMember(owner = "ac", name = "Q", descriptor = "Ls;")
    public static LruCache field821 = new LruCache(30, 4);

    @OriginalMember(owner = "ac", name = "z", descriptor = "B")
    private byte field804;

    @OriginalMember(owner = "ac", name = "A", descriptor = "B")
    private byte field805;

    @OriginalMember(owner = "ac", name = "d", descriptor = "I")
    private static int field782;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    private static int field786;

    @OriginalMember(owner = "ac", name = "p", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "ac", name = "q", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "ac", name = "x", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "ac", name = "y", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "ac", name = "D", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "ac", name = "E", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "ac", name = "H", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "ac", name = "I", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "ac", name = "J", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "ac", name = "K", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "ac", name = "L", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "ac", name = "M", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "ac", name = "N", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "ac", name = "f", descriptor = "Lkb;")
    private static Packet field784;

    @OriginalMember(owner = "ac", name = "l", descriptor = "Ljava/lang/String;")
    public String field790;

    @OriginalMember(owner = "ac", name = "a", descriptor = "Z")
    private static boolean field779;

    @OriginalMember(owner = "ac", name = "b", descriptor = "Z")
    private static boolean field780;

    @OriginalMember(owner = "ac", name = "c", descriptor = "Z")
    public static boolean field781;

    @OriginalMember(owner = "ac", name = "r", descriptor = "Z")
    public boolean field796;

    @OriginalMember(owner = "ac", name = "s", descriptor = "Z")
    public boolean field797;

    @OriginalMember(owner = "ac", name = "t", descriptor = "Z")
    public boolean field798;

    @OriginalMember(owner = "ac", name = "u", descriptor = "Z")
    private boolean field799;

    @OriginalMember(owner = "ac", name = "v", descriptor = "Z")
    private boolean field800;

    @OriginalMember(owner = "ac", name = "w", descriptor = "Z")
    public boolean field801;

    @OriginalMember(owner = "ac", name = "C", descriptor = "Z")
    private boolean field807;

    @OriginalMember(owner = "ac", name = "F", descriptor = "Z")
    private boolean field810;

    @OriginalMember(owner = "ac", name = "G", descriptor = "Z")
    public boolean field811;

    @OriginalMember(owner = "ac", name = "O", descriptor = "Z")
    public boolean field819;

    @OriginalMember(owner = "ac", name = "m", descriptor = "[B")
    public byte[] field791;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private static int[] field783;

    @OriginalMember(owner = "ac", name = "j", descriptor = "[I")
    private int[] field788;

    @OriginalMember(owner = "ac", name = "k", descriptor = "[I")
    private int[] field789;

    @OriginalMember(owner = "ac", name = "n", descriptor = "[I")
    private int[] field792;

    @OriginalMember(owner = "ac", name = "o", descriptor = "[I")
    private int[] field793;

    @OriginalMember(owner = "ac", name = "g", descriptor = "[Lac;")
    private static LocType[] field785;

    @OriginalMember(owner = "ac", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field806;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lub;)V")
    public static final void method273(Jagfile arg0) {
        field784 = new Packet(575, arg0.method250(null, 3, "loc.dat"));
        Packet var1 = new Packet(575, arg0.method250(null, 3, "loc.idx"));
        field782 = var1.method211();
        field783 = new int[field782];
        int var2 = 2;
        for (int var3 = 0; var3 < field782; var3++) {
            field783[var3] = var2;
            var2 += var1.method211();
        }
        field785 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field785[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Z)V")
    public static final void method274(boolean arg0) {
        if (!arg0) {
            field780 = !field780;
        }
        field820 = null;
        field821 = null;
        field783 = null;
        field785 = null;
        field784 = null;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)Lac;")
    public static final LocType method275(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field785[var1].field787 == arg0) {
                return field785[var1];
            }
        }
        field786 = (field786 + 1) % 10;
        LocType var2 = field785[field786];
        field784.field612 = field783[arg0];
        var2.field787 = arg0;
        var2.method276();
        var2.method277(field784, (byte) 6);
        return var2;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "()V")
    private final void method276() {
        this.field788 = null;
        this.field789 = null;
        this.field790 = null;
        this.field791 = null;
        this.field792 = null;
        this.field793 = null;
        this.field794 = 1;
        this.field795 = 1;
        this.field796 = true;
        this.field797 = true;
        this.field798 = false;
        this.field799 = false;
        this.field800 = false;
        this.field801 = false;
        this.field802 = -1;
        this.field803 = 16;
        this.field804 = 0;
        this.field805 = 0;
        this.field806 = null;
        this.field807 = false;
        this.field808 = -1;
        this.field809 = -1;
        this.field810 = false;
        this.field811 = true;
        this.field812 = 128;
        this.field813 = 128;
        this.field814 = 128;
        this.field818 = 0;
        this.field815 = 0;
        this.field816 = 0;
        this.field817 = 0;
        this.field819 = false;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lkb;B)V")
    private final void method277(Packet arg0, byte arg1) {
        int var3 = -1;
        if (arg1 == 6) {
            boolean var4 = false;
        } else {
            field779 = !field779;
        }
        while (true) {
            while (true) {
                int var5 = arg0.method209();
                if (var5 == 0) {
                    if (this.field789 == null) {
                        this.field789 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field798 = false;
                        if (this.field789.length > 0 && this.field789[0] == 10) {
                            this.field798 = true;
                        }
                        if (this.field806 != null) {
                            this.field798 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg0.method209();
                    this.field789 = new int[var6];
                    this.field788 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field788[var7] = arg0.method211();
                        this.field789[var7] = arg0.method209();
                    }
                } else if (var5 == 2) {
                    this.field790 = arg0.method216();
                } else if (var5 == 3) {
                    this.field791 = arg0.method217(true);
                } else if (var5 == 14) {
                    this.field794 = arg0.method209();
                } else if (var5 == 15) {
                    this.field795 = arg0.method209();
                } else if (var5 == 17) {
                    this.field796 = false;
                } else if (var5 == 18) {
                    this.field797 = false;
                } else if (var5 == 19) {
                    var3 = arg0.method209();
                    if (var3 == 1) {
                        this.field798 = true;
                    }
                } else if (var5 == 21) {
                    this.field799 = true;
                } else if (var5 == 22) {
                    this.field800 = true;
                } else if (var5 == 23) {
                    this.field801 = true;
                } else if (var5 == 24) {
                    this.field802 = arg0.method211();
                    if (this.field802 == 65535) {
                        this.field802 = -1;
                    }
                } else if (var5 == 25) {
                    this.field807 = true;
                } else if (var5 == 28) {
                    this.field803 = arg0.method209();
                } else if (var5 == 29) {
                    this.field804 = arg0.method210();
                } else if (var5 == 39) {
                    this.field805 = arg0.method210();
                } else if (var5 >= 30 && var5 < 39) {
                    if (this.field806 == null) {
                        this.field806 = new String[5];
                    }
                    this.field806[var5 - 30] = arg0.method216();
                    if (this.field806[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field806[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg0.method209();
                    this.field792 = new int[var8];
                    this.field793 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field792[var9] = arg0.method211();
                        this.field793[var9] = arg0.method211();
                    }
                } else if (var5 == 60) {
                    this.field808 = arg0.method211();
                } else if (var5 == 62) {
                    this.field810 = true;
                } else if (var5 == 64) {
                    this.field811 = false;
                } else if (var5 == 65) {
                    this.field812 = arg0.method211();
                } else if (var5 == 66) {
                    this.field813 = arg0.method211();
                } else if (var5 == 67) {
                    this.field814 = arg0.method211();
                } else if (var5 == 68) {
                    this.field809 = arg0.method211();
                } else if (var5 == 69) {
                    this.field818 = arg0.method209();
                } else if (var5 == 70) {
                    this.field815 = arg0.method212();
                } else if (var5 == 71) {
                    this.field816 = arg0.method212();
                } else if (var5 == 72) {
                    this.field817 = arg0.method212();
                } else if (var5 == 73) {
                    this.field819 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field789.length; var9++) {
            if (this.field789[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field787 << 6) + (var8 << 3) + arg1);
        if (field781) {
            var10 = 0L;
        }
        Model var12 = (Model) field821.method102(var10);
        if (var12 == null) {
            if (var8 >= this.field788.length) {
                return null;
            }
            int var20 = this.field788[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field810 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field820.method102((long) var20);
            if (var22 == null) {
                var22 = new Model(-26552, var20 & 0xFFFF);
                if (var21) {
                    var22.method134(978);
                }
                field820.method103(3, var22, (long) var20);
            }
            boolean var23;
            if (this.field812 == 128 && this.field813 == 128 && this.field814 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field815 == 0 && this.field816 == 0 && this.field817 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(var22, !this.field807, 868, arg1 == 0 && arg6 == -1 && !var23 && !var24, this.field792 == null);
            if (arg6 != -1) {
                var25.method126(true);
                var25.method127(arg6, -227);
                var25.field480 = null;
                var25.field479 = null;
            }
            while (arg1-- > 0) {
                var25.method130(7);
            }
            if (this.field792 != null) {
                for (int var26 = 0; var26 < this.field792.length; var26++) {
                    var25.method133(this.field792[var26], this.field793[var26]);
                }
            }
            if (var23) {
                var25.method135(this.field812, this.field814, this.field813, -27239);
            }
            if (var24) {
                var25.method132(this.field817, this.field815, this.field816, false);
            }
            var25.method136(this.field804 + 64, this.field805 * 5 + 768, -50, -10, -50, !this.field800);
            if (this.field796) {
                var25.field476 = var25.field472;
            }
            field821.method103(3, var25, var10);
            if (this.field799 || this.field800) {
                var25 = new Model(var25, false, this.field799, this.field800);
            }
            if (this.field799) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field447; var28++) {
                    int var29 = var25.field448[var28];
                    int var30 = var25.field450[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field449[var28] += var33 - var27;
                }
                var25.method124(2);
            }
            return var25;
        } else if (field781) {
            return var12;
        } else {
            if (this.field799 || this.field800) {
                var12 = new Model(var12, false, this.field799, this.field800);
            }
            if (this.field799) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field447; var14++) {
                    int var15 = var12.field448[var14];
                    int var16 = var12.field450[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field449[var14] += var19 - var13;
                }
                var12.method124(2);
            }
            return var12;
        }
    }
}
