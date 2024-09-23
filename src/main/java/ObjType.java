import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class ObjType {

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field872 = false;

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    private int field874 = -22246;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    public int field881 = -1;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private static int field873 = -192;

    @OriginalMember(owner = "cc", name = "j", descriptor = "Z")
    public static boolean field880 = true;

    @OriginalMember(owner = "cc", name = "T", descriptor = "Ls;")
    public static LruCache field916 = new LruCache((byte) 0, 50);

    @OriginalMember(owner = "cc", name = "U", descriptor = "Ls;")
    public static LruCache field917 = new LruCache((byte) 0, 200);

    @OriginalMember(owner = "cc", name = "F", descriptor = "B")
    private byte field902;

    @OriginalMember(owner = "cc", name = "I", descriptor = "B")
    private byte field905;

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private static int field871;

    @OriginalMember(owner = "cc", name = "e", descriptor = "I")
    private static int field875;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private static int field879;

    @OriginalMember(owner = "cc", name = "l", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "cc", name = "q", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "cc", name = "r", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "cc", name = "s", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "cc", name = "t", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "cc", name = "u", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "cc", name = "v", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "cc", name = "x", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "cc", name = "z", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "cc", name = "D", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "cc", name = "E", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "cc", name = "G", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "cc", name = "H", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "cc", name = "J", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "cc", name = "K", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "cc", name = "L", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "cc", name = "M", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "cc", name = "N", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "cc", name = "O", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "cc", name = "R", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "cc", name = "S", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Lkb;")
    private static Packet field877;

    @OriginalMember(owner = "cc", name = "m", descriptor = "Ljava/lang/String;")
    public String field883;

    @OriginalMember(owner = "cc", name = "w", descriptor = "Z")
    private boolean field893;

    @OriginalMember(owner = "cc", name = "y", descriptor = "Z")
    public boolean field895;

    @OriginalMember(owner = "cc", name = "A", descriptor = "Z")
    public boolean field897;

    @OriginalMember(owner = "cc", name = "n", descriptor = "[B")
    public byte[] field884;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    private static int[] field876;

    @OriginalMember(owner = "cc", name = "o", descriptor = "[I")
    private int[] field885;

    @OriginalMember(owner = "cc", name = "p", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "cc", name = "P", descriptor = "[I")
    public int[] field912;

    @OriginalMember(owner = "cc", name = "Q", descriptor = "[I")
    public int[] field913;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Lcc;")
    private static ObjType[] field878;

    @OriginalMember(owner = "cc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field898;

    @OriginalMember(owner = "cc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field899;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lub;)V")
    public static final void method292(Jagfile arg0) {
        field877 = new Packet(363, arg0.read("obj.dat", null, (byte) 2));
        Packet var1 = new Packet(363, arg0.read("obj.idx", null, (byte) 2));
        field875 = var1.method218();
        field876 = new int[field875];
        int var2 = 2;
        for (int var3 = 0; var3 < field875; var3++) {
            field876[var3] = var2;
            var2 += var1.method218();
        }
        field878 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field878[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)V")
    public static final void method293(boolean arg0) {
        field916 = null;
        field917 = null;
        field876 = null;
        field878 = null;
        field877 = null;
        if (!arg0) {
            field871 = -296;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)Lcc;")
    public static final ObjType method294(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field878[var1].field881 == arg0) {
                return field878[var1];
            }
        }
        field879 = (field879 + 1) % 10;
        ObjType var2 = field878[field879];
        field877.field622 = field876[arg0];
        var2.field881 = arg0;
        var2.method295();
        var2.method296(false, field877);
        if (var2.field915 != -1) {
            var2.method297(-856);
        }
        if (!field880 && var2.field897) {
            var2.field883 = "Members Object";
            var2.field884 = "Login to a members' server to use this object.".getBytes();
            var2.field898 = null;
            var2.field899 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()V")
    public final void method295() {
        this.field882 = 0;
        this.field883 = null;
        this.field884 = null;
        this.field885 = null;
        this.field886 = null;
        this.field887 = 2000;
        this.field888 = 0;
        this.field889 = 0;
        this.field890 = 0;
        this.field891 = 0;
        this.field892 = 0;
        this.field893 = false;
        this.field894 = -1;
        this.field895 = false;
        this.field896 = 1;
        this.field897 = false;
        this.field898 = null;
        this.field899 = null;
        this.field900 = -1;
        this.field901 = -1;
        this.field902 = 0;
        this.field903 = -1;
        this.field904 = -1;
        this.field905 = 0;
        this.field906 = -1;
        this.field907 = -1;
        this.field908 = -1;
        this.field909 = -1;
        this.field910 = -1;
        this.field911 = -1;
        this.field912 = null;
        this.field913 = null;
        this.field914 = -1;
        this.field915 = -1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLkb;)V")
    public final void method296(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field882 = arg1.method218();
                } else if (var3 == 2) {
                    this.field883 = arg1.method223();
                } else if (var3 == 3) {
                    this.field884 = arg1.method224((byte) 31);
                } else if (var3 == 4) {
                    this.field887 = arg1.method218();
                } else if (var3 == 5) {
                    this.field888 = arg1.method218();
                } else if (var3 == 6) {
                    this.field889 = arg1.method218();
                } else if (var3 == 7) {
                    this.field891 = arg1.method218();
                    if (this.field891 > 32767) {
                        this.field891 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field892 = arg1.method218();
                    if (this.field892 > 32767) {
                        this.field892 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field893 = true;
                } else if (var3 == 10) {
                    this.field894 = arg1.method218();
                } else if (var3 == 11) {
                    this.field895 = true;
                } else if (var3 == 12) {
                    this.field896 = arg1.method221();
                } else if (var3 == 16) {
                    this.field897 = true;
                } else if (var3 == 23) {
                    this.field900 = arg1.method218();
                    this.field902 = arg1.method217();
                } else if (var3 == 24) {
                    this.field901 = arg1.method218();
                } else if (var3 == 25) {
                    this.field903 = arg1.method218();
                    this.field905 = arg1.method217();
                } else if (var3 == 26) {
                    this.field904 = arg1.method218();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field898 == null) {
                        this.field898 = new String[5];
                    }
                    this.field898[var3 - 30] = arg1.method223();
                    if (this.field898[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field898[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field899 == null) {
                        this.field899 = new String[5];
                    }
                    this.field899[var3 - 35] = arg1.method223();
                } else if (var3 == 40) {
                    int var4 = arg1.method216();
                    this.field885 = new int[var4];
                    this.field886 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field885[var5] = arg1.method218();
                        this.field886[var5] = arg1.method218();
                    }
                } else if (var3 == 78) {
                    this.field906 = arg1.method218();
                } else if (var3 == 79) {
                    this.field907 = arg1.method218();
                } else if (var3 == 90) {
                    this.field908 = arg1.method218();
                } else if (var3 == 91) {
                    this.field910 = arg1.method218();
                } else if (var3 == 92) {
                    this.field909 = arg1.method218();
                } else if (var3 == 93) {
                    this.field911 = arg1.method218();
                } else if (var3 == 95) {
                    this.field890 = arg1.method218();
                } else if (var3 == 97) {
                    this.field914 = arg1.method218();
                } else if (var3 == 98) {
                    this.field915 = arg1.method218();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field912 == null) {
                        this.field912 = new int[10];
                        this.field913 = new int[10];
                    }
                    this.field912[var3 - 100] = arg1.method218();
                    this.field913[var3 - 100] = arg1.method218();
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)V")
    public void method297(int arg0) {
        ObjType var2 = method294(this.field915);
        this.field882 = var2.field882;
        this.field887 = var2.field887;
        this.field888 = var2.field888;
        while (arg0 >= 0) {
            this.field872 = !this.field872;
        }
        this.field889 = var2.field889;
        this.field890 = var2.field890;
        this.field891 = var2.field891;
        this.field892 = var2.field892;
        this.field885 = var2.field885;
        this.field886 = var2.field886;
        ObjType var3 = method294(this.field914);
        this.field883 = var3.field883;
        this.field897 = var3.field897;
        this.field896 = var3.field896;
        String var4 = "a";
        char var5 = var3.field883.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field884 = ("Swap this note at any bank for " + var4 + " " + var3.field883 + ".").getBytes();
        this.field895 = true;
    }

    @OriginalMember(owner = "cc", name = "c", descriptor = "(I)Leb;")
    public final Model method298(int arg0) {
        if (this.field912 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field913[var3] && this.field913[var3] != 0) {
                    var2 = this.field912[var3];
                }
            }
            if (var2 != -1) {
                return method294(var2).method298(1);
            }
        }
        Model var4 = (Model) field916.method103((long) this.field881);
        if (var4 != null) {
            return var4;
        }
        Model var5 = new Model(false, this.field882);
        if (this.field885 != null) {
            for (int var6 = 0; var6 < this.field885.length; var6++) {
                var5.method134(this.field885[var6], this.field886[var6]);
            }
        }
        var5.method137(64, 768, -50, -10, -50, true);
        var5.field481 = true;
        field916.method104(6, (long) this.field881, var5);
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lhb;")
    public static final Pix32 method299(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field917.method103((long) arg0);
        if (var3 != null && var3.field583 != arg2 && var3.field583 != -1) {
            var3.unlink();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method294(arg0);
        if (var4.field912 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg2 >= var4.field913[var6] && var4.field913[var6] != 0) {
                    var5 = var4.field912[var6];
                }
            }
            if (var5 != -1) {
                var4 = method294(var5);
            }
        }
        Pix32 var7 = new Pix32(32, 32);
        int var8 = Pix3D.field554;
        int var9 = Pix3D.field555;
        int[] var10 = Pix3D.field560;
        int[] var11 = Pix2D.field533;
        int var12 = Pix2D.field534;
        int var13 = Pix2D.field535;
        int var14 = Pix2D.field538;
        int var15 = Pix2D.field539;
        int var16 = Pix2D.field536;
        int var17 = Pix2D.field537;
        Pix3D.field552 = false;
        Pix2D.method146(32, var7.field577, -657, 32);
        Pix2D.method150(0, 0, 0, (byte) 93, 32, 32);
        Pix3D.method155(field873);
        Model var18 = var4.method298(1);
        int var19 = Pix3D.field558[var4.field888] * var4.field887 >> 16;
        int var20 = Pix3D.field559[var4.field888] * var4.field887 >> 16;
        var18.method140(0, var4.field889, var4.field890, var4.field888, var4.field891, var18.field472 / 2 + var19 + var4.field892, var4.field892 + var20);
        if (arg1 != 24638) {
            throw new NullPointerException();
        }
        for (int var21 = 31; var21 >= 0; var21--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var7.field577[var27 * 32 + var21] == 0) {
                    if (var21 > 0 && var7.field577[var27 * 32 + var21 - 1] > 1) {
                        var7.field577[var27 * 32 + var21] = 1;
                    } else if (var27 > 0 && var7.field577[(var27 - 1) * 32 + var21] > 1) {
                        var7.field577[var27 * 32 + var21] = 1;
                    } else if (var21 < 31 && var7.field577[var27 * 32 + var21 + 1] > 1) {
                        var7.field577[var27 * 32 + var21] = 1;
                    } else if (var27 < 31 && var7.field577[(var27 + 1) * 32 + var21] > 1) {
                        var7.field577[var27 * 32 + var21] = 1;
                    }
                }
            }
        }
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var26 = 31; var26 >= 0; var26--) {
                if (var7.field577[var26 * 32 + var22] == 0 && var22 > 0 && var26 > 0 && var7.field577[(var26 - 1) * 32 + var22 - 1] > 0) {
                    var7.field577[var26 * 32 + var22] = 3153952;
                }
            }
        }
        if (var4.field915 != -1) {
            Pix32 var23 = method299(var4.field914, 24638, 10);
            int var24 = var23.field582;
            int var25 = var23.field583;
            var23.field582 = 32;
            var23.field583 = 32;
            var23.method177(22, 5, 22, 17713, 5);
            var23.field582 = var24;
            var23.field583 = var25;
        }
        field917.method104(6, (long) arg0, var7);
        Pix2D.method146(var12, var11, -657, var13);
        Pix2D.method148(var17, var16, var15, 789, var14);
        Pix3D.field554 = var8;
        Pix3D.field555 = var9;
        Pix3D.field560 = var10;
        Pix3D.field552 = true;
        if (var4.field895) {
            var7.field582 = 33;
        } else {
            var7.field582 = 32;
        }
        var7.field583 = arg2;
        return var7;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BI)Leb;")
    public final Model method300(byte arg0, int arg1) {
        int var3 = this.field900;
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        if (arg1 == 1) {
            var3 = this.field903;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field901;
        int var5 = this.field906;
        if (arg1 == 1) {
            var4 = this.field904;
            var5 = this.field907;
        }
        Model var6 = new Model(false, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = new Model(false, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(0, var11, 2);
            } else {
                Model var7 = new Model(false, var4);
                Model var8 = new Model(false, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(0, var9, 3);
            }
        }
        if (arg1 == 0 && this.field902 != 0) {
            var6.method133(this.field902, 0, -122, 0);
        }
        if (arg1 == 1 && this.field905 != 0) {
            var6.method133(this.field905, 0, -122, 0);
        }
        if (this.field885 != null) {
            for (int var12 = 0; var12 < this.field885.length; var12++) {
                var6.method134(this.field885[var12], this.field886[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Leb;")
    public final Model method301(int arg0, int arg1) {
        int var3 = this.field908;
        if (this.field874 != arg0) {
            field873 = 205;
        }
        if (arg1 == 1) {
            var3 = this.field910;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field909;
        if (arg1 == 1) {
            var4 = this.field911;
        }
        Model var5 = new Model(false, var3);
        if (var4 != -1) {
            Model var6 = new Model(false, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(0, var7, 2);
        }
        if (this.field885 != null) {
            for (int var8 = 0; var8 < this.field885.length; var8++) {
                var5.method134(this.field885[var8], this.field886[var8]);
            }
        }
        return var5;
    }
}
