import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class ObjType {

    @OriginalMember(owner = "cc", name = "c", descriptor = "Z")
    private boolean field872 = true;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    public int field879 = -1;

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private static int field870 = -280;

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private static int field871 = -189;

    @OriginalMember(owner = "cc", name = "i", descriptor = "Z")
    public static boolean field878 = true;

    @OriginalMember(owner = "cc", name = "S", descriptor = "Ls;")
    public static LruCache field914 = new LruCache(50, (byte) 4);

    @OriginalMember(owner = "cc", name = "T", descriptor = "Ls;")
    public static LruCache field915 = new LruCache(200, (byte) 4);

    @OriginalMember(owner = "cc", name = "E", descriptor = "B")
    private byte field900;

    @OriginalMember(owner = "cc", name = "H", descriptor = "B")
    private byte field903;

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    private static int field873;

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private static int field877;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "cc", name = "p", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "cc", name = "q", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "cc", name = "r", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "cc", name = "s", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "cc", name = "t", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "cc", name = "u", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "cc", name = "w", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "cc", name = "y", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "cc", name = "C", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "cc", name = "D", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "cc", name = "F", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "cc", name = "G", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "cc", name = "I", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "cc", name = "J", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "cc", name = "K", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "cc", name = "L", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "cc", name = "M", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "cc", name = "N", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "cc", name = "Q", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "cc", name = "R", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Lkb;")
    private static Packet field875;

    @OriginalMember(owner = "cc", name = "l", descriptor = "Ljava/lang/String;")
    public String field881;

    @OriginalMember(owner = "cc", name = "v", descriptor = "Z")
    private boolean field891;

    @OriginalMember(owner = "cc", name = "x", descriptor = "Z")
    public boolean field893;

    @OriginalMember(owner = "cc", name = "z", descriptor = "Z")
    public boolean field895;

    @OriginalMember(owner = "cc", name = "m", descriptor = "[B")
    public byte[] field882;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[I")
    private static int[] field874;

    @OriginalMember(owner = "cc", name = "n", descriptor = "[I")
    private int[] field883;

    @OriginalMember(owner = "cc", name = "o", descriptor = "[I")
    private int[] field884;

    @OriginalMember(owner = "cc", name = "O", descriptor = "[I")
    public int[] field910;

    @OriginalMember(owner = "cc", name = "P", descriptor = "[I")
    public int[] field911;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[Lcc;")
    private static ObjType[] field876;

    @OriginalMember(owner = "cc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field896;

    @OriginalMember(owner = "cc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field897;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lub;)V")
    public static final void method285(Jagfile arg0) {
        field875 = new Packet(0, arg0.method250("obj.dat", null, 8));
        Packet var1 = new Packet(0, arg0.method250("obj.idx", null, 8));
        field873 = var1.method211();
        field874 = new int[field873];
        int var2 = 2;
        for (int var3 = 0; var3 < field873; var3++) {
            field874[var3] = var2;
            var2 += var1.method211();
        }
        field876 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field876[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(B)V")
    public static final void method286(byte arg0) {
        if (arg0 != -123) {
            field871 = -475;
        }
        field914 = null;
        field915 = null;
        field874 = null;
        field876 = null;
        field875 = null;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)Lcc;")
    public static final ObjType method287(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field876[var1].field879 == arg0) {
                return field876[var1];
            }
        }
        field877 = (field877 + 1) % 10;
        ObjType var2 = field876[field877];
        field875.field621 = field874[arg0];
        var2.field879 = arg0;
        var2.method288();
        var2.method289(field875, 0);
        if (var2.field913 != -1) {
            var2.method290((byte) 4);
        }
        if (!field878 && var2.field895) {
            var2.field881 = "Members Object";
            var2.field882 = "Login to a members' server to use this object.".getBytes();
            var2.field896 = null;
            var2.field897 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()V")
    public final void method288() {
        this.field880 = 0;
        this.field881 = null;
        this.field882 = null;
        this.field883 = null;
        this.field884 = null;
        this.field885 = 2000;
        this.field886 = 0;
        this.field887 = 0;
        this.field888 = 0;
        this.field889 = 0;
        this.field890 = 0;
        this.field891 = false;
        this.field892 = -1;
        this.field893 = false;
        this.field894 = 1;
        this.field895 = false;
        this.field896 = null;
        this.field897 = null;
        this.field898 = -1;
        this.field899 = -1;
        this.field900 = 0;
        this.field901 = -1;
        this.field902 = -1;
        this.field903 = 0;
        this.field904 = -1;
        this.field905 = -1;
        this.field906 = -1;
        this.field907 = -1;
        this.field908 = -1;
        this.field909 = -1;
        this.field910 = null;
        this.field911 = null;
        this.field912 = -1;
        this.field913 = -1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lkb;I)V")
    public final void method289(Packet arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method209();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field880 = arg0.method211();
                } else if (var4 == 2) {
                    this.field881 = arg0.method216();
                } else if (var4 == 3) {
                    this.field882 = arg0.method217(497);
                } else if (var4 == 4) {
                    this.field885 = arg0.method211();
                } else if (var4 == 5) {
                    this.field886 = arg0.method211();
                } else if (var4 == 6) {
                    this.field887 = arg0.method211();
                } else if (var4 == 7) {
                    this.field889 = arg0.method211();
                    if (this.field889 > 32767) {
                        this.field889 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field890 = arg0.method211();
                    if (this.field890 > 32767) {
                        this.field890 -= 65536;
                    }
                } else if (var4 == 9) {
                    this.field891 = true;
                } else if (var4 == 10) {
                    this.field892 = arg0.method211();
                } else if (var4 == 11) {
                    this.field893 = true;
                } else if (var4 == 12) {
                    this.field894 = arg0.method214();
                } else if (var4 == 16) {
                    this.field895 = true;
                } else if (var4 == 23) {
                    this.field898 = arg0.method211();
                    this.field900 = arg0.method210();
                } else if (var4 == 24) {
                    this.field899 = arg0.method211();
                } else if (var4 == 25) {
                    this.field901 = arg0.method211();
                    this.field903 = arg0.method210();
                } else if (var4 == 26) {
                    this.field902 = arg0.method211();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field896 == null) {
                        this.field896 = new String[5];
                    }
                    this.field896[var4 - 30] = arg0.method216();
                    if (this.field896[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field896[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field897 == null) {
                        this.field897 = new String[5];
                    }
                    this.field897[var4 - 35] = arg0.method216();
                } else if (var4 == 40) {
                    int var5 = arg0.method209();
                    this.field883 = new int[var5];
                    this.field884 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field883[var6] = arg0.method211();
                        this.field884[var6] = arg0.method211();
                    }
                } else if (var4 == 78) {
                    this.field904 = arg0.method211();
                } else if (var4 == 79) {
                    this.field905 = arg0.method211();
                } else if (var4 == 90) {
                    this.field906 = arg0.method211();
                } else if (var4 == 91) {
                    this.field908 = arg0.method211();
                } else if (var4 == 92) {
                    this.field907 = arg0.method211();
                } else if (var4 == 93) {
                    this.field909 = arg0.method211();
                } else if (var4 == 95) {
                    this.field888 = arg0.method211();
                } else if (var4 == 97) {
                    this.field912 = arg0.method211();
                } else if (var4 == 98) {
                    this.field913 = arg0.method211();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field910 == null) {
                        this.field910 = new int[10];
                        this.field911 = new int[10];
                    }
                    this.field910[var4 - 100] = arg0.method211();
                    this.field911[var4 - 100] = arg0.method211();
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(B)V")
    public void method290(byte arg0) {
        ObjType var2 = method287(this.field913);
        this.field880 = var2.field880;
        this.field885 = var2.field885;
        this.field886 = var2.field886;
        this.field887 = var2.field887;
        this.field888 = var2.field888;
        this.field889 = var2.field889;
        this.field890 = var2.field890;
        if (arg0 != 4) {
            return;
        }
        this.field883 = var2.field883;
        this.field884 = var2.field884;
        ObjType var3 = method287(this.field912);
        this.field881 = var3.field881;
        this.field895 = var3.field895;
        this.field894 = var3.field894;
        String var4 = "a";
        char var5 = var3.field881.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field882 = ("Swap this note at any bank for " + var4 + " " + var3.field881 + ".").getBytes();
        this.field893 = true;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)Leb;")
    public final Model method291(int arg0) {
        if (this.field910 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field911[var3] && this.field911[var3] != 0) {
                    var2 = this.field910[var3];
                }
            }
            if (var2 != -1) {
                return method287(var2).method291(1);
            }
        }
        Model var4 = (Model) field914.method102((long) this.field879);
        if (var4 != null) {
            return var4;
        }
        Model var5 = new Model(0, this.field880);
        if (this.field883 != null) {
            for (int var6 = 0; var6 < this.field883.length; var6++) {
                var5.method133(this.field883[var6], this.field884[var6]);
            }
        }
        var5.method136(64, 768, -50, -10, -50, true);
        var5.field480 = true;
        field914.method103((long) this.field879, 1567, var5);
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lhb;")
    public static final Pix32 method292(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field915.method102((long) arg0);
        int var4 = 74 / arg2;
        if (var3 != null && var3.field584 != arg1 && var3.field584 != -1) {
            var3.method107();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var5 = method287(arg0);
        if (var5.field910 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field911[var7] && var5.field911[var7] != 0) {
                    var6 = var5.field910[var7];
                }
            }
            if (var6 != -1) {
                var5 = method287(var6);
            }
        }
        Pix32 var8 = new Pix32(32, 32);
        int var9 = Pix3D.field555;
        int var10 = Pix3D.field556;
        int[] var11 = Pix3D.field561;
        int[] var12 = Pix2D.field534;
        int var13 = Pix2D.field535;
        int var14 = Pix2D.field536;
        int var15 = Pix2D.field539;
        int var16 = Pix2D.field540;
        int var17 = Pix2D.field537;
        int var18 = Pix2D.field538;
        Pix3D.field553 = false;
        Pix2D.method145((byte) 2, 32, var8.field578, 32);
        Pix2D.method149(0, -288, 0, 0, 32, 32);
        Pix3D.method154((byte) 5);
        Model var19 = var5.method291(1);
        int var20 = Pix3D.field559[var5.field886] * var5.field885 >> 16;
        int var21 = Pix3D.field560[var5.field886] * var5.field885 >> 16;
        var19.method139(0, var5.field887, var5.field888, var5.field886, var5.field889, var19.field471 / 2 + var20 + var5.field890, var5.field890 + var21);
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var28 = 31; var28 >= 0; var28--) {
                if (var8.field578[var28 * 32 + var22] == 0) {
                    if (var22 > 0 && var8.field578[var28 * 32 + var22 - 1] > 1) {
                        var8.field578[var28 * 32 + var22] = 1;
                    } else if (var28 > 0 && var8.field578[(var28 - 1) * 32 + var22] > 1) {
                        var8.field578[var28 * 32 + var22] = 1;
                    } else if (var22 < 31 && var8.field578[var28 * 32 + var22 + 1] > 1) {
                        var8.field578[var28 * 32 + var22] = 1;
                    } else if (var28 < 31 && var8.field578[(var28 + 1) * 32 + var22] > 1) {
                        var8.field578[var28 * 32 + var22] = 1;
                    }
                }
            }
        }
        for (int var23 = 31; var23 >= 0; var23--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var8.field578[var27 * 32 + var23] == 0 && var23 > 0 && var27 > 0 && var8.field578[(var27 - 1) * 32 + var23 - 1] > 0) {
                    var8.field578[var27 * 32 + var23] = 3153952;
                }
            }
        }
        if (var5.field913 != -1) {
            Pix32 var24 = method292(var5.field912, 10, 763);
            int var25 = var24.field583;
            int var26 = var24.field584;
            var24.field583 = 32;
            var24.field584 = 32;
            var24.method175(5, 5, (byte) 4, 22, 22);
            var24.field583 = var25;
            var24.field584 = var26;
        }
        field915.method103((long) arg0, 1567, var8);
        Pix2D.method145((byte) 2, var14, var12, var13);
        Pix2D.method147(var18, field870, var15, var17, var16);
        Pix3D.field555 = var9;
        Pix3D.field556 = var10;
        Pix3D.field561 = var11;
        Pix3D.field553 = true;
        if (var5.field893) {
            var8.field583 = 33;
        } else {
            var8.field583 = 32;
        }
        var8.field584 = arg1;
        return var8;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IB)Leb;")
    public final Model method293(int arg0, byte arg1) {
        int var3 = this.field898;
        if (arg0 == 1) {
            var3 = this.field901;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field899;
        int var5 = this.field904;
        if (arg1 != 3) {
            this.field872 = !this.field872;
        }
        if (arg0 == 1) {
            var4 = this.field902;
            var5 = this.field905;
        }
        Model var6 = new Model(0, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = new Model(0, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(6, 2, var11);
            } else {
                Model var7 = new Model(0, var4);
                Model var8 = new Model(0, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(6, 3, var9);
            }
        }
        if (arg0 == 0 && this.field900 != 0) {
            var6.method132(3, 0, this.field900, 0);
        }
        if (arg0 == 1 && this.field903 != 0) {
            var6.method132(3, 0, this.field903, 0);
        }
        if (this.field883 != null) {
            for (int var12 = 0; var12 < this.field883.length; var12++) {
                var6.method133(this.field883[var12], this.field884[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Leb;")
    public final Model method294(int arg0, int arg1) {
        int var3 = this.field906;
        int var4 = 14 / arg1;
        if (arg0 == 1) {
            var3 = this.field908;
        }
        if (var3 == -1) {
            return null;
        }
        int var5 = this.field907;
        if (arg0 == 1) {
            var5 = this.field909;
        }
        Model var6 = new Model(0, var3);
        if (var5 != -1) {
            Model var7 = new Model(0, var5);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(6, 2, var8);
        }
        if (this.field883 != null) {
            for (int var9 = 0; var9 < this.field883.length; var9++) {
                var6.method133(this.field883[var9], this.field884[var9]);
            }
        }
        return var6;
    }
}
