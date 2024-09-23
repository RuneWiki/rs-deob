import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class ObjType {

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field869 = -638;

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    public int field876 = -1;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Z")
    public static boolean field875 = true;

    @OriginalMember(owner = "cc", name = "Q", descriptor = "Ls;")
    public static LruCache field911 = new LruCache(-24, 50);

    @OriginalMember(owner = "cc", name = "R", descriptor = "Ls;")
    public static LruCache field912 = new LruCache(-24, 200);

    @OriginalMember(owner = "cc", name = "C", descriptor = "B")
    private byte field897;

    @OriginalMember(owner = "cc", name = "F", descriptor = "B")
    private byte field900;

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private static int field870;

    @OriginalMember(owner = "cc", name = "f", descriptor = "I")
    private static int field874;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "cc", name = "n", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "cc", name = "o", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "cc", name = "p", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "cc", name = "q", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "cc", name = "r", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "cc", name = "s", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "cc", name = "u", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "cc", name = "w", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "cc", name = "A", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "cc", name = "B", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "cc", name = "D", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "cc", name = "E", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "cc", name = "G", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "cc", name = "H", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "cc", name = "I", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "cc", name = "J", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "cc", name = "K", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "cc", name = "L", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "cc", name = "O", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "cc", name = "P", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "cc", name = "d", descriptor = "Lkb;")
    private static Packet field872;

    @OriginalMember(owner = "cc", name = "j", descriptor = "Ljava/lang/String;")
    public String field878;

    @OriginalMember(owner = "cc", name = "t", descriptor = "Z")
    private boolean field888;

    @OriginalMember(owner = "cc", name = "v", descriptor = "Z")
    public boolean field890;

    @OriginalMember(owner = "cc", name = "x", descriptor = "Z")
    public boolean field892;

    @OriginalMember(owner = "cc", name = "k", descriptor = "[B")
    public byte[] field879;

    @OriginalMember(owner = "cc", name = "c", descriptor = "[I")
    private static int[] field871;

    @OriginalMember(owner = "cc", name = "l", descriptor = "[I")
    private int[] field880;

    @OriginalMember(owner = "cc", name = "m", descriptor = "[I")
    private int[] field881;

    @OriginalMember(owner = "cc", name = "M", descriptor = "[I")
    public int[] field907;

    @OriginalMember(owner = "cc", name = "N", descriptor = "[I")
    public int[] field908;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[Lcc;")
    private static ObjType[] field873;

    @OriginalMember(owner = "cc", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field893;

    @OriginalMember(owner = "cc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field894;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lub;)V")
    public static final void method292(Jagfile arg0) {
        field872 = new Packet((byte) 64, arg0.method257(null, "obj.dat", -31149));
        Packet var1 = new Packet((byte) 64, arg0.method257(null, "obj.idx", -31149));
        field870 = var1.method218();
        field871 = new int[field870];
        int var2 = 2;
        for (int var3 = 0; var3 < field870; var3++) {
            field871[var3] = var2;
            var2 += var1.method218();
        }
        field873 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field873[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)V")
    public static final void method293(int arg0) {
        field911 = null;
        field912 = null;
        if (arg0 < 0) {
            field871 = null;
            field873 = null;
            field872 = null;
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)Lcc;")
    public static final ObjType method294(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field873[var1].field876 == arg0) {
                return field873[var1];
            }
        }
        field874 = (field874 + 1) % 10;
        ObjType var2 = field873[field874];
        field872.field624 = field871[arg0];
        var2.field876 = arg0;
        var2.method295();
        var2.method296(field872, true);
        if (var2.field910 != -1) {
            var2.method297(-97);
        }
        if (!field875 && var2.field892) {
            var2.field878 = "Members Object";
            var2.field879 = "Login to a members' server to use this object.".getBytes();
            var2.field893 = null;
            var2.field894 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()V")
    public final void method295() {
        this.field877 = 0;
        this.field878 = null;
        this.field879 = null;
        this.field880 = null;
        this.field881 = null;
        this.field882 = 2000;
        this.field883 = 0;
        this.field884 = 0;
        this.field885 = 0;
        this.field886 = 0;
        this.field887 = 0;
        this.field888 = false;
        this.field889 = -1;
        this.field890 = false;
        this.field891 = 1;
        this.field892 = false;
        this.field893 = null;
        this.field894 = null;
        this.field895 = -1;
        this.field896 = -1;
        this.field897 = 0;
        this.field898 = -1;
        this.field899 = -1;
        this.field900 = 0;
        this.field901 = -1;
        this.field902 = -1;
        this.field903 = -1;
        this.field904 = -1;
        this.field905 = -1;
        this.field906 = -1;
        this.field907 = null;
        this.field908 = null;
        this.field909 = -1;
        this.field910 = -1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lkb;Z)V")
    public final void method296(Packet arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field877 = arg0.method218();
                } else if (var3 == 2) {
                    this.field878 = arg0.method223();
                } else if (var3 == 3) {
                    this.field879 = arg0.method224((byte) -66);
                } else if (var3 == 4) {
                    this.field882 = arg0.method218();
                } else if (var3 == 5) {
                    this.field883 = arg0.method218();
                } else if (var3 == 6) {
                    this.field884 = arg0.method218();
                } else if (var3 == 7) {
                    this.field886 = arg0.method218();
                    if (this.field886 > 32767) {
                        this.field886 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field887 = arg0.method218();
                    if (this.field887 > 32767) {
                        this.field887 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field888 = true;
                } else if (var3 == 10) {
                    this.field889 = arg0.method218();
                } else if (var3 == 11) {
                    this.field890 = true;
                } else if (var3 == 12) {
                    this.field891 = arg0.method221();
                } else if (var3 == 16) {
                    this.field892 = true;
                } else if (var3 == 23) {
                    this.field895 = arg0.method218();
                    this.field897 = arg0.method217();
                } else if (var3 == 24) {
                    this.field896 = arg0.method218();
                } else if (var3 == 25) {
                    this.field898 = arg0.method218();
                    this.field900 = arg0.method217();
                } else if (var3 == 26) {
                    this.field899 = arg0.method218();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field893 == null) {
                        this.field893 = new String[5];
                    }
                    this.field893[var3 - 30] = arg0.method223();
                    if (this.field893[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field893[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field894 == null) {
                        this.field894 = new String[5];
                    }
                    this.field894[var3 - 35] = arg0.method223();
                } else if (var3 == 40) {
                    int var4 = arg0.method216();
                    this.field880 = new int[var4];
                    this.field881 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field880[var5] = arg0.method218();
                        this.field881[var5] = arg0.method218();
                    }
                } else if (var3 == 78) {
                    this.field901 = arg0.method218();
                } else if (var3 == 79) {
                    this.field902 = arg0.method218();
                } else if (var3 == 90) {
                    this.field903 = arg0.method218();
                } else if (var3 == 91) {
                    this.field905 = arg0.method218();
                } else if (var3 == 92) {
                    this.field904 = arg0.method218();
                } else if (var3 == 93) {
                    this.field906 = arg0.method218();
                } else if (var3 == 95) {
                    this.field885 = arg0.method218();
                } else if (var3 == 97) {
                    this.field909 = arg0.method218();
                } else if (var3 == 98) {
                    this.field910 = arg0.method218();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field907 == null) {
                        this.field907 = new int[10];
                        this.field908 = new int[10];
                    }
                    this.field907[var3 - 100] = arg0.method218();
                    this.field908[var3 - 100] = arg0.method218();
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "c", descriptor = "(I)V")
    public void method297(int arg0) {
        ObjType var2 = method294(this.field910);
        this.field877 = var2.field877;
        this.field882 = var2.field882;
        this.field883 = var2.field883;
        this.field884 = var2.field884;
        this.field885 = var2.field885;
        this.field886 = var2.field886;
        this.field887 = var2.field887;
        this.field880 = var2.field880;
        this.field881 = var2.field881;
        ObjType var3 = method294(this.field909);
        this.field878 = var3.field878;
        this.field892 = var3.field892;
        this.field891 = var3.field891;
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        String var5 = "a";
        char var6 = var3.field878.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var5 = "an";
        }
        this.field879 = ("Swap this note at any bank for " + var5 + " " + var3.field878 + ".").getBytes();
        this.field890 = true;
    }

    @OriginalMember(owner = "cc", name = "d", descriptor = "(I)Leb;")
    public final Model method298(int arg0) {
        if (this.field907 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field908[var3] && this.field908[var3] != 0) {
                    var2 = this.field907[var3];
                }
            }
            if (var2 != -1) {
                return method294(var2).method298(1);
            }
        }
        Model var4 = (Model) field911.method103((long) this.field876);
        if (var4 != null) {
            return var4;
        }
        Model var5 = new Model(this.field877, (byte) 1);
        if (this.field880 != null) {
            for (int var6 = 0; var6 < this.field880.length; var6++) {
                var5.method134(this.field880[var6], this.field881[var6]);
            }
        }
        var5.method137(64, 768, -50, -10, -50, true);
        var5.field490 = true;
        field911.method104(var5, (long) this.field876, false);
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IZI)Lhb;")
    public static final Pix32 method299(int arg0, boolean arg1, int arg2) {
        Pix32 var3 = (Pix32) field912.method103((long) arg0);
        if (var3 != null && var3.field593 != arg2 && var3.field593 != -1) {
            var3.method108();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method294(arg0);
        if (var4.field907 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg2 >= var4.field908[var6] && var4.field908[var6] != 0) {
                    var5 = var4.field907[var6];
                }
            }
            if (var5 != -1) {
                var4 = method294(var5);
            }
        }
        Pix32 var7 = new Pix32(32, 32);
        int var8 = Pix3D.field565;
        int var9 = Pix3D.field566;
        int[] var10 = Pix3D.field571;
        int[] var11 = Pix2D.field544;
        int var12 = Pix2D.field545;
        int var13 = Pix2D.field546;
        int var14 = Pix2D.field549;
        int var15 = Pix2D.field550;
        int var16 = Pix2D.field547;
        int var17 = Pix2D.field548;
        Pix3D.field563 = false;
        Pix2D.method146(32, 0, var7.field587, 32);
        Pix2D.method150(0, 32, 8, 0, 32, 0);
        Pix3D.method155(0);
        Model var18 = var4.method298(1);
        int var19 = Pix3D.field569[var4.field883] * var4.field882 >> 16;
        if (arg1) {
            throw new NullPointerException();
        }
        int var20 = Pix3D.field570[var4.field883] * var4.field882 >> 16;
        var18.method140(0, var4.field884, var4.field885, var4.field883, var4.field886, var18.field481 / 2 + var19 + var4.field887, var4.field887 + var20);
        for (int var21 = 31; var21 >= 0; var21--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var7.field587[var27 * 32 + var21] == 0) {
                    if (var21 > 0 && var7.field587[var27 * 32 + var21 - 1] > 1) {
                        var7.field587[var27 * 32 + var21] = 1;
                    } else if (var27 > 0 && var7.field587[(var27 - 1) * 32 + var21] > 1) {
                        var7.field587[var27 * 32 + var21] = 1;
                    } else if (var21 < 31 && var7.field587[var27 * 32 + var21 + 1] > 1) {
                        var7.field587[var27 * 32 + var21] = 1;
                    } else if (var27 < 31 && var7.field587[(var27 + 1) * 32 + var21] > 1) {
                        var7.field587[var27 * 32 + var21] = 1;
                    }
                }
            }
        }
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var26 = 31; var26 >= 0; var26--) {
                if (var7.field587[var26 * 32 + var22] == 0 && var22 > 0 && var26 > 0 && var7.field587[(var26 - 1) * 32 + var22 - 1] > 0) {
                    var7.field587[var26 * 32 + var22] = 3153952;
                }
            }
        }
        if (var4.field910 != -1) {
            Pix32 var23 = method299(var4.field909, false, 10);
            int var24 = var23.field592;
            int var25 = var23.field593;
            var23.field592 = 32;
            var23.field593 = 32;
            var23.method177(5, 0, 5, 22, 22);
            var23.field592 = var24;
            var23.field593 = var25;
        }
        field912.method104(var7, (long) arg0, false);
        Pix2D.method146(var13, 0, var11, var12);
        Pix2D.method148(var14, var15, var17, 770, var16);
        Pix3D.field565 = var8;
        Pix3D.field566 = var9;
        Pix3D.field571 = var10;
        Pix3D.field563 = true;
        if (var4.field890) {
            var7.field592 = 33;
        } else {
            var7.field592 = 32;
        }
        var7.field593 = arg2;
        return var7;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Leb;")
    public final Model method300(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field869 = 452;
        }
        int var3 = this.field895;
        if (arg0 == 1) {
            var3 = this.field898;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field896;
        int var5 = this.field901;
        if (arg0 == 1) {
            var4 = this.field899;
            var5 = this.field902;
        }
        Model var6 = new Model(var3, (byte) 1);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = new Model(var4, (byte) 1);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(-406, var11, 2);
            } else {
                Model var7 = new Model(var4, (byte) 1);
                Model var8 = new Model(var5, (byte) 1);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(-406, var9, 3);
            }
        }
        if (arg0 == 0 && this.field897 != 0) {
            var6.method133(0, this.field897, (byte) 1, 0);
        }
        if (arg0 == 1 && this.field900 != 0) {
            var6.method133(0, this.field900, (byte) 1, 0);
        }
        if (this.field880 != null) {
            for (int var12 = 0; var12 < this.field880.length; var12++) {
                var6.method134(this.field880[var12], this.field881[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(II)Leb;")
    public final Model method301(int arg0, int arg1) {
        int var3 = 14 / arg0;
        int var4 = this.field903;
        if (arg1 == 1) {
            var4 = this.field905;
        }
        if (var4 == -1) {
            return null;
        }
        int var5 = this.field904;
        if (arg1 == 1) {
            var5 = this.field906;
        }
        Model var6 = new Model(var4, (byte) 1);
        if (var5 != -1) {
            Model var7 = new Model(var5, (byte) 1);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(-406, var8, 2);
        }
        if (this.field880 != null) {
            for (int var9 = 0; var9 < this.field880.length; var9++) {
                var6.method134(this.field880[var9], this.field881[var9]);
            }
        }
        return var6;
    }
}
