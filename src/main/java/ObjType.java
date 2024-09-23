import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class ObjType {

    @OriginalMember(owner = "zb", name = "g", descriptor = "I")
    public int field807 = -1;

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field801 = -878;

    @OriginalMember(owner = "zb", name = "J", descriptor = "Ls;")
    public static LruCache field836 = new LruCache(-24094, 50);

    @OriginalMember(owner = "zb", name = "K", descriptor = "Ls;")
    public static LruCache field837 = new LruCache(-24094, 200);

    @OriginalMember(owner = "zb", name = "B", descriptor = "B")
    private byte field828;

    @OriginalMember(owner = "zb", name = "E", descriptor = "B")
    private byte field831;

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field802;

    @OriginalMember(owner = "zb", name = "f", descriptor = "I")
    private static int field806;

    @OriginalMember(owner = "zb", name = "h", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "zb", name = "m", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "zb", name = "n", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "zb", name = "o", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "zb", name = "p", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "zb", name = "q", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "zb", name = "r", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "zb", name = "t", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "zb", name = "v", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "zb", name = "z", descriptor = "I")
    private int field826;

    @OriginalMember(owner = "zb", name = "A", descriptor = "I")
    private int field827;

    @OriginalMember(owner = "zb", name = "C", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "zb", name = "D", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "zb", name = "F", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "zb", name = "G", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "zb", name = "H", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "zb", name = "I", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Lkb;")
    private static Packet field804;

    @OriginalMember(owner = "zb", name = "i", descriptor = "Ljava/lang/String;")
    public String field809;

    @OriginalMember(owner = "zb", name = "s", descriptor = "Z")
    private boolean field819;

    @OriginalMember(owner = "zb", name = "u", descriptor = "Z")
    public boolean field821;

    @OriginalMember(owner = "zb", name = "w", descriptor = "Z")
    public boolean field823;

    @OriginalMember(owner = "zb", name = "j", descriptor = "[B")
    public byte[] field810;

    @OriginalMember(owner = "zb", name = "c", descriptor = "[I")
    private static int[] field803;

    @OriginalMember(owner = "zb", name = "k", descriptor = "[I")
    private int[] field811;

    @OriginalMember(owner = "zb", name = "l", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "zb", name = "e", descriptor = "[Lzb;")
    private static ObjType[] field805;

    @OriginalMember(owner = "zb", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field824;

    @OriginalMember(owner = "zb", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field825;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Lub;)V")
    public static final void method263(Jagfile arg0) {
        field804 = new Packet(arg0.method242((byte) 6, null, "obj.dat"), 4);
        Packet var1 = new Packet(arg0.method242((byte) 6, null, "obj.idx"), 4);
        field802 = var1.method203();
        field803 = new int[field802];
        int var2 = 2;
        for (int var3 = 0; var3 < field802; var3++) {
            field803[var3] = var2;
            var2 += var1.method203();
        }
        field805 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field805[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(I)V")
    public static final void method264(int arg0) {
        field836 = null;
        if (arg0 <= 0) {
            field801 = 224;
        }
        field837 = null;
        field803 = null;
        field805 = null;
        field804 = null;
    }

    @OriginalMember(owner = "zb", name = "b", descriptor = "(I)Lzb;")
    public static final ObjType method265(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field805[var1].field807 == arg0) {
                return field805[var1];
            }
        }
        field806 = (field806 + 1) % 10;
        ObjType var2 = field805[field806];
        field804.field606 = field803[arg0];
        var2.field807 = arg0;
        var2.method266();
        var2.method267(213, field804);
        return var2;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "()V")
    public final void method266() {
        this.field808 = 0;
        this.field809 = null;
        this.field810 = null;
        this.field811 = null;
        this.field812 = null;
        this.field813 = 2000;
        this.field814 = 0;
        this.field815 = 0;
        this.field816 = 0;
        this.field817 = 0;
        this.field818 = 0;
        this.field819 = false;
        this.field820 = -1;
        this.field821 = false;
        this.field822 = 1;
        this.field823 = false;
        this.field824 = null;
        this.field825 = null;
        this.field826 = -1;
        this.field827 = -1;
        this.field828 = 0;
        this.field829 = -1;
        this.field830 = -1;
        this.field831 = 0;
        this.field832 = -1;
        this.field833 = -1;
        this.field834 = -1;
        this.field835 = -1;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILkb;)V")
    public final void method267(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method201();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field808 = arg1.method203();
                } else if (var3 == 2) {
                    this.field809 = arg1.method208();
                } else if (var3 == 3) {
                    this.field810 = arg1.method209(true);
                } else if (var3 == 4) {
                    this.field813 = arg1.method203();
                } else if (var3 == 5) {
                    this.field814 = arg1.method203();
                } else if (var3 == 6) {
                    this.field815 = arg1.method203();
                } else if (var3 == 7) {
                    this.field817 = arg1.method203();
                    if (this.field817 > 32767) {
                        this.field817 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field818 = arg1.method203();
                    if (this.field818 > 32767) {
                        this.field818 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field819 = true;
                } else if (var3 == 10) {
                    this.field820 = arg1.method203();
                } else if (var3 == 11) {
                    this.field821 = true;
                } else if (var3 == 12) {
                    this.field822 = arg1.method206();
                } else if (var3 == 16) {
                    this.field823 = true;
                } else if (var3 == 23) {
                    this.field826 = arg1.method203();
                    this.field828 = arg1.method202();
                } else if (var3 == 24) {
                    this.field827 = arg1.method203();
                } else if (var3 == 25) {
                    this.field829 = arg1.method203();
                    this.field831 = arg1.method202();
                } else if (var3 == 26) {
                    this.field830 = arg1.method203();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field824 == null) {
                        this.field824 = new String[5];
                    }
                    this.field824[var3 - 30] = arg1.method208();
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field825 == null) {
                        this.field825 = new String[5];
                    }
                    this.field825[var3 - 35] = arg1.method208();
                } else if (var3 == 40) {
                    int var4 = arg1.method201();
                    this.field811 = new int[var4];
                    this.field812 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field811[var5] = arg1.method203();
                        this.field812[var5] = arg1.method203();
                    }
                } else if (var3 == 90) {
                    this.field832 = arg1.method203();
                } else if (var3 == 91) {
                    this.field834 = arg1.method203();
                } else if (var3 == 92) {
                    this.field833 = arg1.method203();
                } else if (var3 == 93) {
                    this.field835 = arg1.method203();
                } else if (var3 == 95) {
                    this.field816 = arg1.method203();
                }
            }
        }
    }

    @OriginalMember(owner = "zb", name = "b", descriptor = "()Leb;")
    public final Model method268() {
        Model var1 = (Model) field836.method99((long) this.field807);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field808, 298);
        if (this.field811 != null) {
            for (int var3 = 0; var3 < this.field811.length; var3++) {
                var2.method129(this.field811[var3], this.field812[var3]);
            }
        }
        var2.method132(64, 768, -50, -10, -50, true);
        var2.field470 = true;
        field836.method100((long) this.field807, 7, var2);
        return var2;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IB)Lhb;")
    public static final Pix32 method269(int arg0, byte arg1) {
        Pix32 var2 = (Pix32) field837.method99((long) arg0);
        if (var2 != null) {
            return var2;
        }
        ObjType var3 = method265(arg0);
        Pix32 var4 = new Pix32(32, 32);
        int var5 = Pix3D.field540;
        int var6 = Pix3D.field541;
        int[] var7 = Pix3D.field546;
        int[] var8 = Pix2D.field522;
        int var9 = Pix2D.field523;
        int var10 = Pix2D.field524;
        Pix3D.field538 = false;
        Pix2D.method141(32, var4.field565, 32, -810);
        Pix2D.method145(0, field801, 32, 0, 32, 0);
        Pix3D.method150((byte) 16);
        Model var11 = var3.method268();
        int var12 = Pix3D.field544[var3.field814] * var3.field813 >> 16;
        int var13 = Pix3D.field545[var3.field814] * var3.field813 >> 16;
        var11.method135(0, var3.field815, var3.field816, var3.field814, var3.field817, var11.field461 / 2 + var12 + var3.field818, var3.field818 + var13);
        for (int var14 = 31; var14 >= 0; var14--) {
            for (int var17 = 31; var17 >= 0; var17--) {
                if (var4.field565[var17 * 32 + var14] == 0) {
                    if (var14 > 0 && var4.field565[var17 * 32 + var14 - 1] > 1) {
                        var4.field565[var17 * 32 + var14] = 1;
                    } else if (var17 > 0 && var4.field565[(var17 - 1) * 32 + var14] > 1) {
                        var4.field565[var17 * 32 + var14] = 1;
                    } else if (var14 < 31 && var4.field565[var17 * 32 + var14 + 1] > 1) {
                        var4.field565[var17 * 32 + var14] = 1;
                    } else if (var17 < 31 && var4.field565[(var17 + 1) * 32 + var14] > 1) {
                        var4.field565[var17 * 32 + var14] = 1;
                    }
                }
            }
        }
        for (int var15 = 31; var15 >= 0; var15--) {
            for (int var16 = 31; var16 >= 0; var16--) {
                if (var4.field565[var16 * 32 + var15] == 0 && var15 > 0 && var16 > 0 && var4.field565[(var16 - 1) * 32 + var15 - 1] > 0) {
                    var4.field565[var16 * 32 + var15] = 3153952;
                }
            }
        }
        field837.method100((long) arg0, 7, var4);
        Pix2D.method141(var9, var8, var10, -810);
        Pix3D.field540 = var5;
        Pix3D.field541 = var6;
        Pix3D.field546 = var7;
        if (arg1 != -11) {
            throw new NullPointerException();
        }
        Pix3D.field538 = true;
        if (var3.field821) {
            var4.field570 = 33;
        } else {
            var4.field570 = 32;
        }
        return var4;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)Leb;")
    public final Model method270(int arg0, int arg1) {
        int var3 = this.field826;
        if (arg1 == 1) {
            var3 = this.field829;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field827;
        int var5 = 8 / arg0;
        if (arg1 == 1) {
            var4 = this.field830;
        }
        Model var6 = new Model(var3, 298);
        if (var4 != -1) {
            Model var7 = new Model(var4, 298);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(false, 2, var8);
        }
        if (arg1 == 0 && this.field828 != 0) {
            var6.method128(0, 0, 0, this.field828);
        }
        if (arg1 == 1 && this.field831 != 0) {
            var6.method128(0, 0, 0, this.field831);
        }
        if (this.field811 != null) {
            for (int var9 = 0; var9 < this.field811.length; var9++) {
                var6.method129(this.field811[var9], this.field812[var9]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BI)Leb;")
    public final Model method271(byte arg0, int arg1) {
        if (arg0 != 107) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field832;
        if (arg1 == 1) {
            var4 = this.field834;
        }
        if (var4 == -1) {
            return null;
        }
        int var5 = this.field833;
        if (arg1 == 1) {
            var5 = this.field835;
        }
        Model var6 = new Model(var4, 298);
        if (var5 != -1) {
            Model var7 = new Model(var5, 298);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(false, 2, var8);
        }
        if (this.field811 != null) {
            for (int var9 = 0; var9 < this.field811.length; var9++) {
                var6.method129(this.field811[var9], this.field812[var9]);
            }
        }
        return var6;
    }
}
