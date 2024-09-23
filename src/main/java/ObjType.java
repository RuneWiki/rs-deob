import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class ObjType {

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    private int field888 = 33182;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    public int field895 = -1;

    @OriginalMember(owner = "cc", name = "a", descriptor = "B")
    private static byte field885 = 8;

    @OriginalMember(owner = "cc", name = "b", descriptor = "B")
    private static byte field886 = 4;

    @OriginalMember(owner = "cc", name = "j", descriptor = "Z")
    public static boolean field894 = true;

    @OriginalMember(owner = "cc", name = "R", descriptor = "Ls;")
    public static LruCache field928 = new LruCache(2, 50);

    @OriginalMember(owner = "cc", name = "S", descriptor = "Ls;")
    public static LruCache field929 = new LruCache(2, 200);

    @OriginalMember(owner = "cc", name = "F", descriptor = "B")
    private byte field916;

    @OriginalMember(owner = "cc", name = "I", descriptor = "B")
    private byte field919;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "cc", name = "e", descriptor = "I")
    private static int field889;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private static int field893;

    @OriginalMember(owner = "cc", name = "l", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "cc", name = "q", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "cc", name = "r", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "cc", name = "s", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "cc", name = "t", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "cc", name = "u", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "cc", name = "v", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "cc", name = "x", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "cc", name = "z", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "cc", name = "D", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "cc", name = "E", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "cc", name = "G", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "cc", name = "H", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "cc", name = "J", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "cc", name = "K", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "cc", name = "L", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "cc", name = "M", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "cc", name = "P", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "cc", name = "Q", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Lkb;")
    private static Packet field891;

    @OriginalMember(owner = "cc", name = "m", descriptor = "Ljava/lang/String;")
    public String field897;

    @OriginalMember(owner = "cc", name = "w", descriptor = "Z")
    private boolean field907;

    @OriginalMember(owner = "cc", name = "y", descriptor = "Z")
    public boolean field909;

    @OriginalMember(owner = "cc", name = "A", descriptor = "Z")
    public boolean field911;

    @OriginalMember(owner = "cc", name = "n", descriptor = "[B")
    public byte[] field898;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    private static int[] field890;

    @OriginalMember(owner = "cc", name = "o", descriptor = "[I")
    private int[] field899;

    @OriginalMember(owner = "cc", name = "p", descriptor = "[I")
    private int[] field900;

    @OriginalMember(owner = "cc", name = "N", descriptor = "[I")
    public int[] field924;

    @OriginalMember(owner = "cc", name = "O", descriptor = "[I")
    public int[] field925;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Lcc;")
    private static ObjType[] field892;

    @OriginalMember(owner = "cc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field912;

    @OriginalMember(owner = "cc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field913;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lub;)V")
    public static final void method285(Jagfile arg0) {
        field891 = new Packet(arg0.method250(field886, "obj.dat", null), 0);
        Packet var1 = new Packet(arg0.method250(field886, "obj.idx", null), 0);
        field889 = var1.method211();
        field890 = new int[field889];
        int var2 = 2;
        for (int var3 = 0; var3 < field889; var3++) {
            field890[var3] = var2;
            var2 += var1.method211();
        }
        field892 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field892[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)V")
    public static final void method286(boolean arg0) {
        if (arg0) {
            return;
        }
        field928 = null;
        field929 = null;
        field890 = null;
        field892 = null;
        field891 = null;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)Lcc;")
    public static final ObjType method287(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field892[var1].field895 == arg0) {
                return field892[var1];
            }
        }
        field893 = (field893 + 1) % 10;
        ObjType var2 = field892[field893];
        field891.field623 = field890[arg0];
        var2.field895 = arg0;
        var2.method288();
        var2.method289(field885, field891);
        if (var2.field927 != -1) {
            var2.method290(0);
        }
        if (!field894 && var2.field911) {
            var2.field897 = "Members Object";
            var2.field898 = "Login to a members' server to use this object.".getBytes();
            var2.field912 = null;
            var2.field913 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()V")
    public final void method288() {
        this.field896 = 0;
        this.field897 = null;
        this.field898 = null;
        this.field899 = null;
        this.field900 = null;
        this.field901 = 2000;
        this.field902 = 0;
        this.field903 = 0;
        this.field904 = 0;
        this.field905 = 0;
        this.field906 = 0;
        this.field907 = false;
        this.field908 = -1;
        this.field909 = false;
        this.field910 = 1;
        this.field911 = false;
        this.field912 = null;
        this.field913 = null;
        this.field914 = -1;
        this.field915 = -1;
        this.field916 = 0;
        this.field917 = -1;
        this.field918 = -1;
        this.field919 = 0;
        this.field920 = -1;
        this.field921 = -1;
        this.field922 = -1;
        this.field923 = -1;
        this.field924 = null;
        this.field925 = null;
        this.field926 = -1;
        this.field927 = -1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BLkb;)V")
    public final void method289(byte arg0, Packet arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method209();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field896 = arg1.method211();
                } else if (var3 == 2) {
                    this.field897 = arg1.method216();
                } else if (var3 == 3) {
                    this.field898 = arg1.method217(0);
                } else if (var3 == 4) {
                    this.field901 = arg1.method211();
                } else if (var3 == 5) {
                    this.field902 = arg1.method211();
                } else if (var3 == 6) {
                    this.field903 = arg1.method211();
                } else if (var3 == 7) {
                    this.field905 = arg1.method211();
                    if (this.field905 > 32767) {
                        this.field905 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field906 = arg1.method211();
                    if (this.field906 > 32767) {
                        this.field906 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field907 = true;
                } else if (var3 == 10) {
                    this.field908 = arg1.method211();
                } else if (var3 == 11) {
                    this.field909 = true;
                } else if (var3 == 12) {
                    this.field910 = arg1.method214();
                } else if (var3 == 16) {
                    this.field911 = true;
                } else if (var3 == 23) {
                    this.field914 = arg1.method211();
                    this.field916 = arg1.method210();
                } else if (var3 == 24) {
                    this.field915 = arg1.method211();
                } else if (var3 == 25) {
                    this.field917 = arg1.method211();
                    this.field919 = arg1.method210();
                } else if (var3 == 26) {
                    this.field918 = arg1.method211();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field912 == null) {
                        this.field912 = new String[5];
                    }
                    this.field912[var3 - 30] = arg1.method216();
                    if (this.field912[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field912[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field913 == null) {
                        this.field913 = new String[5];
                    }
                    this.field913[var3 - 35] = arg1.method216();
                } else if (var3 == 40) {
                    int var4 = arg1.method209();
                    this.field899 = new int[var4];
                    this.field900 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field899[var5] = arg1.method211();
                        this.field900[var5] = arg1.method211();
                    }
                } else if (var3 == 90) {
                    this.field920 = arg1.method211();
                } else if (var3 == 91) {
                    this.field922 = arg1.method211();
                } else if (var3 == 92) {
                    this.field921 = arg1.method211();
                } else if (var3 == 93) {
                    this.field923 = arg1.method211();
                } else if (var3 == 95) {
                    this.field904 = arg1.method211();
                } else if (var3 == 97) {
                    this.field926 = arg1.method211();
                } else if (var3 == 98) {
                    this.field927 = arg1.method211();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field924 == null) {
                        this.field924 = new int[10];
                        this.field925 = new int[10];
                    }
                    this.field924[var3 - 100] = arg1.method211();
                    this.field925[var3 - 100] = arg1.method211();
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)V")
    public void method290(int arg0) {
        ObjType var2 = method287(this.field927);
        this.field896 = var2.field896;
        this.field901 = var2.field901;
        this.field902 = var2.field902;
        this.field903 = var2.field903;
        this.field904 = var2.field904;
        this.field905 = var2.field905;
        this.field906 = var2.field906;
        this.field899 = var2.field899;
        this.field900 = var2.field900;
        ObjType var3 = method287(this.field926);
        this.field897 = var3.field897;
        this.field911 = var3.field911;
        this.field910 = var3.field910;
        String var4 = "a";
        if (arg0 != 0) {
            return;
        }
        char var5 = var3.field897.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field898 = ("Swap this note at any bank for " + var4 + " " + var3.field897 + ".").getBytes();
        this.field909 = true;
    }

    @OriginalMember(owner = "cc", name = "c", descriptor = "(I)Leb;")
    public final Model method291(int arg0) {
        if (this.field924 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field925[var3] && this.field925[var3] != 0) {
                    var2 = this.field924[var3];
                }
            }
            if (var2 != -1) {
                return method287(var2).method291(1);
            }
        }
        Model var4 = (Model) field928.method102((long) this.field895);
        if (var4 != null) {
            return var4;
        }
        Model var5 = new Model(this.field896, 6);
        if (this.field899 != null) {
            for (int var6 = 0; var6 < this.field899.length; var6++) {
                var5.method133(this.field899[var6], this.field900[var6]);
            }
        }
        var5.method136(64, 768, -50, -10, -50, true);
        var5.field487 = true;
        field928.method103(var5, (long) this.field895, -21658);
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lhb;")
    public static final Pix32 method292(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field929.method102((long) arg1);
        if (var3 != null && var3.field586 != arg0 && var3.field586 != -1) {
            var3.method107();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method287(arg1);
        if (var4.field924 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg0 >= var4.field925[var6] && var4.field925[var6] != 0) {
                    var5 = var4.field924[var6];
                }
            }
            if (var5 != -1) {
                var4 = method287(var5);
            }
        }
        Pix32 var7 = new Pix32(32, 32);
        int var8 = Pix3D.field557;
        int var9 = Pix3D.field558;
        int[] var10 = Pix3D.field563;
        int[] var11 = Pix2D.field539;
        int var12 = Pix2D.field540;
        int var13 = Pix2D.field541;
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        int var14 = Pix2D.field544;
        int var15 = Pix2D.field545;
        int var16 = Pix2D.field542;
        int var17 = Pix2D.field543;
        Pix3D.field555 = false;
        Pix2D.method145(var7.field580, 32, 32, (byte) 6);
        Pix2D.method149(0, 32, 0, 5, 0, 32);
        Pix3D.method154((byte) 0);
        Model var18 = var4.method291(1);
        int var19 = Pix3D.field561[var4.field902] * var4.field901 >> 16;
        int var20 = Pix3D.field562[var4.field902] * var4.field901 >> 16;
        var18.method139(0, var4.field903, var4.field904, var4.field902, var4.field905, var18.field478 / 2 + var19 + var4.field906, var4.field906 + var20);
        for (int var21 = 31; var21 >= 0; var21--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var7.field580[var27 * 32 + var21] == 0) {
                    if (var21 > 0 && var7.field580[var27 * 32 + var21 - 1] > 1) {
                        var7.field580[var27 * 32 + var21] = 1;
                    } else if (var27 > 0 && var7.field580[(var27 - 1) * 32 + var21] > 1) {
                        var7.field580[var27 * 32 + var21] = 1;
                    } else if (var21 < 31 && var7.field580[var27 * 32 + var21 + 1] > 1) {
                        var7.field580[var27 * 32 + var21] = 1;
                    } else if (var27 < 31 && var7.field580[(var27 + 1) * 32 + var21] > 1) {
                        var7.field580[var27 * 32 + var21] = 1;
                    }
                }
            }
        }
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var26 = 31; var26 >= 0; var26--) {
                if (var7.field580[var26 * 32 + var22] == 0 && var22 > 0 && var26 > 0 && var7.field580[(var26 - 1) * 32 + var22 - 1] > 0) {
                    var7.field580[var26 * 32 + var22] = 3153952;
                }
            }
        }
        if (var4.field927 != -1) {
            Pix32 var23 = method292(10, var4.field926, 0);
            int var24 = var23.field585;
            int var25 = var23.field586;
            var23.field585 = 32;
            var23.field586 = 32;
            var23.method175(22, 5, 5, true, 22);
            var23.field585 = var24;
            var23.field586 = var25;
        }
        field929.method103(var7, (long) arg1, -21658);
        Pix2D.method145(var11, var12, var13, (byte) 6);
        Pix2D.method147(var14, var16, var15, var17, 0);
        Pix3D.field557 = var8;
        Pix3D.field558 = var9;
        Pix3D.field563 = var10;
        Pix3D.field555 = true;
        if (var4.field909) {
            var7.field585 = 33;
        } else {
            var7.field585 = 32;
        }
        var7.field586 = arg0;
        return var7;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Leb;")
    public final Model method293(int arg0, int arg1) {
        int var3 = this.field914;
        if (arg1 == 1) {
            var3 = this.field917;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field915;
        int var5 = 5 / arg0;
        if (arg1 == 1) {
            var4 = this.field918;
        }
        Model var6 = new Model(var3, 6);
        if (var4 != -1) {
            Model var7 = new Model(var4, 6);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(20363, var8, 2);
        }
        if (arg1 == 0 && this.field916 != 0) {
            var6.method132(0, this.field887, 0, this.field916);
        }
        if (arg1 == 1 && this.field919 != 0) {
            var6.method132(0, this.field887, 0, this.field919);
        }
        if (this.field899 != null) {
            for (int var9 = 0; var9 < this.field899.length; var9++) {
                var6.method133(this.field899[var9], this.field900[var9]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(II)Leb;")
    public final Model method294(int arg0, int arg1) {
        int var3 = this.field920;
        if (arg1 == 1) {
            var3 = this.field922;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field921;
        if (arg1 == 1) {
            var4 = this.field923;
        }
        Model var5 = new Model(var3, 6);
        if (this.field888 != arg0) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            Model var6 = new Model(var4, 6);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(20363, var7, 2);
        }
        if (this.field899 != null) {
            for (int var8 = 0; var8 < this.field899.length; var8++) {
                var5.method133(this.field899[var8], this.field900[var8]);
            }
        }
        return var5;
    }
}
