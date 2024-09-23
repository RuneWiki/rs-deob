import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class ObjType {

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    public int field882 = -1;

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field872 = true;

    @OriginalMember(owner = "cc", name = "b", descriptor = "B")
    private static byte field873 = 6;

    @OriginalMember(owner = "cc", name = "c", descriptor = "Z")
    private static boolean field874 = true;

    @OriginalMember(owner = "cc", name = "d", descriptor = "Z")
    private static boolean field875 = true;

    @OriginalMember(owner = "cc", name = "j", descriptor = "Z")
    public static boolean field881 = true;

    @OriginalMember(owner = "cc", name = "R", descriptor = "Ls;")
    public static LruCache field915 = new LruCache(17295, 50);

    @OriginalMember(owner = "cc", name = "S", descriptor = "Ls;")
    public static LruCache field916 = new LruCache(17295, 200);

    @OriginalMember(owner = "cc", name = "F", descriptor = "B")
    private byte field903;

    @OriginalMember(owner = "cc", name = "I", descriptor = "B")
    private byte field906;

    @OriginalMember(owner = "cc", name = "e", descriptor = "I")
    private static int field876;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private static int field880;

    @OriginalMember(owner = "cc", name = "l", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "cc", name = "q", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "cc", name = "r", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "cc", name = "s", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "cc", name = "t", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "cc", name = "u", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "cc", name = "v", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "cc", name = "x", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "cc", name = "z", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "cc", name = "D", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "cc", name = "E", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "cc", name = "G", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "cc", name = "H", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "cc", name = "J", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "cc", name = "K", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "cc", name = "L", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "cc", name = "M", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "cc", name = "P", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "cc", name = "Q", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Lkb;")
    private static Packet field878;

    @OriginalMember(owner = "cc", name = "m", descriptor = "Ljava/lang/String;")
    public String field884;

    @OriginalMember(owner = "cc", name = "w", descriptor = "Z")
    private boolean field894;

    @OriginalMember(owner = "cc", name = "y", descriptor = "Z")
    public boolean field896;

    @OriginalMember(owner = "cc", name = "A", descriptor = "Z")
    public boolean field898;

    @OriginalMember(owner = "cc", name = "n", descriptor = "[B")
    public byte[] field885;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    private static int[] field877;

    @OriginalMember(owner = "cc", name = "o", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "cc", name = "p", descriptor = "[I")
    private int[] field887;

    @OriginalMember(owner = "cc", name = "N", descriptor = "[I")
    public int[] field911;

    @OriginalMember(owner = "cc", name = "O", descriptor = "[I")
    public int[] field912;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Lcc;")
    private static ObjType[] field879;

    @OriginalMember(owner = "cc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field899;

    @OriginalMember(owner = "cc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field900;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lub;)V")
    public static final void method284(Jagfile arg0) {
        field878 = new Packet(arg0.method249("obj.dat", true, null), field874);
        Packet var1 = new Packet(arg0.method249("obj.idx", true, null), field874);
        field876 = var1.method210();
        field877 = new int[field876];
        int var2 = 2;
        for (int var3 = 0; var3 < field876; var3++) {
            field877[var3] = var2;
            var2 += var1.method210();
        }
        field879 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field879[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)V")
    public static final void method285(boolean arg0) {
        field915 = null;
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field916 = null;
        field877 = null;
        field879 = null;
        field878 = null;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)Lcc;")
    public static final ObjType method286(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field879[var1].field882 == arg0) {
                return field879[var1];
            }
        }
        field880 = (field880 + 1) % 10;
        ObjType var2 = field879[field880];
        field878.field622 = field877[arg0];
        var2.field882 = arg0;
        var2.method287();
        var2.method288(field873, field878);
        if (var2.field914 != -1) {
            var2.method289(-35356);
        }
        if (!field881 && var2.field898) {
            var2.field884 = "Members Object";
            var2.field885 = "Login to a members' server to use this object.".getBytes();
            var2.field899 = null;
            var2.field900 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()V")
    public final void method287() {
        this.field883 = 0;
        this.field884 = null;
        this.field885 = null;
        this.field886 = null;
        this.field887 = null;
        this.field888 = 2000;
        this.field889 = 0;
        this.field890 = 0;
        this.field891 = 0;
        this.field892 = 0;
        this.field893 = 0;
        this.field894 = false;
        this.field895 = -1;
        this.field896 = false;
        this.field897 = 1;
        this.field898 = false;
        this.field899 = null;
        this.field900 = null;
        this.field901 = -1;
        this.field902 = -1;
        this.field903 = 0;
        this.field904 = -1;
        this.field905 = -1;
        this.field906 = 0;
        this.field907 = -1;
        this.field908 = -1;
        this.field909 = -1;
        this.field910 = -1;
        this.field911 = null;
        this.field912 = null;
        this.field913 = -1;
        this.field914 = -1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BLkb;)V")
    public final void method288(byte arg0, Packet arg1) {
        if (arg0 != 6) {
            field872 = !field872;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method208();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field883 = arg1.method210();
                } else if (var3 == 2) {
                    this.field884 = arg1.method215();
                } else if (var3 == 3) {
                    this.field885 = arg1.method216(525);
                } else if (var3 == 4) {
                    this.field888 = arg1.method210();
                } else if (var3 == 5) {
                    this.field889 = arg1.method210();
                } else if (var3 == 6) {
                    this.field890 = arg1.method210();
                } else if (var3 == 7) {
                    this.field892 = arg1.method210();
                    if (this.field892 > 32767) {
                        this.field892 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field893 = arg1.method210();
                    if (this.field893 > 32767) {
                        this.field893 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field894 = true;
                } else if (var3 == 10) {
                    this.field895 = arg1.method210();
                } else if (var3 == 11) {
                    this.field896 = true;
                } else if (var3 == 12) {
                    this.field897 = arg1.method213();
                } else if (var3 == 16) {
                    this.field898 = true;
                } else if (var3 == 23) {
                    this.field901 = arg1.method210();
                    this.field903 = arg1.method209();
                } else if (var3 == 24) {
                    this.field902 = arg1.method210();
                } else if (var3 == 25) {
                    this.field904 = arg1.method210();
                    this.field906 = arg1.method209();
                } else if (var3 == 26) {
                    this.field905 = arg1.method210();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field899 == null) {
                        this.field899 = new String[5];
                    }
                    this.field899[var3 - 30] = arg1.method215();
                    if (this.field899[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field899[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field900 == null) {
                        this.field900 = new String[5];
                    }
                    this.field900[var3 - 35] = arg1.method215();
                } else if (var3 == 40) {
                    int var4 = arg1.method208();
                    this.field886 = new int[var4];
                    this.field887 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field886[var5] = arg1.method210();
                        this.field887[var5] = arg1.method210();
                    }
                } else if (var3 == 90) {
                    this.field907 = arg1.method210();
                } else if (var3 == 91) {
                    this.field909 = arg1.method210();
                } else if (var3 == 92) {
                    this.field908 = arg1.method210();
                } else if (var3 == 93) {
                    this.field910 = arg1.method210();
                } else if (var3 == 95) {
                    this.field891 = arg1.method210();
                } else if (var3 == 97) {
                    this.field913 = arg1.method210();
                } else if (var3 == 98) {
                    this.field914 = arg1.method210();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field911 == null) {
                        this.field911 = new int[10];
                        this.field912 = new int[10];
                    }
                    this.field911[var3 - 100] = arg1.method210();
                    this.field912[var3 - 100] = arg1.method210();
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)V")
    public void method289(int arg0) {
        ObjType var2 = method286(this.field914);
        this.field883 = var2.field883;
        this.field888 = var2.field888;
        this.field889 = var2.field889;
        this.field890 = var2.field890;
        if (arg0 != -35356) {
            return;
        }
        this.field891 = var2.field891;
        this.field892 = var2.field892;
        this.field893 = var2.field893;
        this.field886 = var2.field886;
        this.field887 = var2.field887;
        ObjType var3 = method286(this.field913);
        this.field884 = var3.field884;
        this.field898 = var3.field898;
        this.field897 = var3.field897;
        String var4 = "a";
        char var5 = var3.field884.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field885 = ("Swap this note at any bank for " + var4 + " " + var3.field884 + ".").getBytes();
        this.field896 = true;
    }

    @OriginalMember(owner = "cc", name = "c", descriptor = "(I)Leb;")
    public final Model method290(int arg0) {
        if (this.field911 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field912[var3] && this.field912[var3] != 0) {
                    var2 = this.field911[var3];
                }
            }
            if (var2 != -1) {
                return method286(var2).method290(1);
            }
        }
        Model var4 = (Model) field915.method101((long) this.field882);
        if (var4 != null) {
            return var4;
        }
        Model var5 = new Model(this.field883, true);
        if (this.field886 != null) {
            for (int var6 = 0; var6 < this.field886.length; var6++) {
                var5.method132(this.field886[var6], this.field887[var6]);
            }
        }
        var5.method135(64, 768, -50, -10, -50, true);
        var5.field481 = true;
        field915.method102((long) this.field882, var5, (byte) 3);
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lhb;")
    public static final Pix32 method291(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field916.method101((long) arg0);
        if (var3 != null && var3.field585 != arg1 && var3.field585 != -1) {
            var3.method106();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method286(arg0);
        if (var4.field911 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg1 >= var4.field912[var6] && var4.field912[var6] != 0) {
                    var5 = var4.field911[var6];
                }
            }
            if (var5 != -1) {
                var4 = method286(var5);
            }
        }
        Pix32 var7 = new Pix32(32, 32);
        int var8 = Pix3D.field554;
        int var9 = Pix3D.field555;
        int[] var10 = Pix3D.field560;
        int[] var11 = Pix2D.field534;
        int var12 = Pix2D.field535;
        int var13 = Pix2D.field536;
        int var14 = Pix2D.field539;
        int var15 = Pix2D.field540;
        int var16 = Pix2D.field537;
        int var17 = Pix2D.field538;
        Pix3D.field552 = false;
        Pix2D.method144(32, true, 32, var7.field579);
        Pix2D.method148(0, 0, 0, (byte) 107, 32, 32);
        int var18 = 90 / arg2;
        Pix3D.method153(796);
        Model var19 = var4.method290(1);
        int var20 = Pix3D.field558[var4.field889] * var4.field888 >> 16;
        int var21 = Pix3D.field559[var4.field889] * var4.field888 >> 16;
        var19.method138(0, var4.field890, var4.field891, var4.field889, var4.field892, var19.field472 / 2 + var20 + var4.field893, var4.field893 + var21);
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var28 = 31; var28 >= 0; var28--) {
                if (var7.field579[var28 * 32 + var22] == 0) {
                    if (var22 > 0 && var7.field579[var28 * 32 + var22 - 1] > 1) {
                        var7.field579[var28 * 32 + var22] = 1;
                    } else if (var28 > 0 && var7.field579[(var28 - 1) * 32 + var22] > 1) {
                        var7.field579[var28 * 32 + var22] = 1;
                    } else if (var22 < 31 && var7.field579[var28 * 32 + var22 + 1] > 1) {
                        var7.field579[var28 * 32 + var22] = 1;
                    } else if (var28 < 31 && var7.field579[(var28 + 1) * 32 + var22] > 1) {
                        var7.field579[var28 * 32 + var22] = 1;
                    }
                }
            }
        }
        for (int var23 = 31; var23 >= 0; var23--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var7.field579[var27 * 32 + var23] == 0 && var23 > 0 && var27 > 0 && var7.field579[(var27 - 1) * 32 + var23 - 1] > 0) {
                    var7.field579[var27 * 32 + var23] = 3153952;
                }
            }
        }
        if (var4.field914 != -1) {
            Pix32 var24 = method291(var4.field913, 10, 44);
            int var25 = var24.field584;
            int var26 = var24.field585;
            var24.field584 = 32;
            var24.field585 = 32;
            var24.method174(22, 22, 5, 5, (byte) 7);
            var24.field584 = var25;
            var24.field585 = var26;
        }
        field916.method102((long) arg0, var7, (byte) 3);
        Pix2D.method144(var12, true, var13, var11);
        Pix2D.method146(field875, var14, var16, var15, var17);
        Pix3D.field554 = var8;
        Pix3D.field555 = var9;
        Pix3D.field560 = var10;
        Pix3D.field552 = true;
        if (var4.field896) {
            var7.field584 = 33;
        } else {
            var7.field584 = 32;
        }
        var7.field585 = arg1;
        return var7;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IB)Leb;")
    public final Model method292(int arg0, byte arg1) {
        int var3 = this.field901;
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 == 1) {
            var3 = this.field904;
        }
        if (var3 == -1) {
            return null;
        }
        int var6 = this.field902;
        if (arg0 == 1) {
            var6 = this.field905;
        }
        Model var7 = new Model(var3, true);
        if (var6 != -1) {
            Model var8 = new Model(var6, true);
            Model[] var9 = new Model[] { var7, var8 };
            var7 = new Model(16925, 2, var9);
        }
        if (arg0 == 0 && this.field903 != 0) {
            var7.method131((byte) -81, this.field903, 0, 0);
        }
        if (arg0 == 1 && this.field906 != 0) {
            var7.method131((byte) -81, this.field906, 0, 0);
        }
        if (this.field886 != null) {
            for (int var10 = 0; var10 < this.field886.length; var10++) {
                var7.method132(this.field886[var10], this.field887[var10]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IZ)Leb;")
    public final Model method293(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        int var3 = this.field907;
        if (arg0 == 1) {
            var3 = this.field909;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field908;
        if (arg0 == 1) {
            var4 = this.field910;
        }
        Model var5 = new Model(var3, true);
        if (var4 != -1) {
            Model var6 = new Model(var4, true);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(16925, 2, var7);
        }
        if (this.field886 != null) {
            for (int var8 = 0; var8 < this.field886.length; var8++) {
                var5.method132(this.field886[var8], this.field887[var8]);
            }
        }
        return var5;
    }
}
