import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class ObjType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field985 = false;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field986 = -797;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    private int field987 = -45277;

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    private int field988 = 57;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Z")
    private boolean field989 = true;

    @OriginalMember(owner = "gc", name = "l", descriptor = "I")
    public int field996 = -1;

    @OriginalMember(owner = "gc", name = "k", descriptor = "Z")
    public static boolean field995 = true;

    @OriginalMember(owner = "gc", name = "U", descriptor = "Lt;")
    public static LruCache field1031 = new LruCache(5, 50);

    @OriginalMember(owner = "gc", name = "V", descriptor = "Lt;")
    public static LruCache field1032 = new LruCache(5, 100);

    @OriginalMember(owner = "gc", name = "G", descriptor = "B")
    private byte field1017;

    @OriginalMember(owner = "gc", name = "J", descriptor = "B")
    private byte field1020;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "gc", name = "u", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "gc", name = "L", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "gc", name = "M", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "gc", name = "N", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "gc", name = "O", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "gc", name = "P", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "gc", name = "S", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "gc", name = "T", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    private static int field990;

    @OriginalMember(owner = "gc", name = "j", descriptor = "I")
    private static int field994;

    @OriginalMember(owner = "gc", name = "m", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Lmb;")
    private static Packet field992;

    @OriginalMember(owner = "gc", name = "n", descriptor = "Ljava/lang/String;")
    public String field998;

    @OriginalMember(owner = "gc", name = "x", descriptor = "Z")
    private boolean field1008;

    @OriginalMember(owner = "gc", name = "z", descriptor = "Z")
    public boolean field1010;

    @OriginalMember(owner = "gc", name = "B", descriptor = "Z")
    public boolean field1012;

    @OriginalMember(owner = "gc", name = "o", descriptor = "[B")
    public byte[] field999;

    @OriginalMember(owner = "gc", name = "p", descriptor = "[I")
    private int[] field1000;

    @OriginalMember(owner = "gc", name = "q", descriptor = "[I")
    private int[] field1001;

    @OriginalMember(owner = "gc", name = "Q", descriptor = "[I")
    public int[] field1027;

    @OriginalMember(owner = "gc", name = "R", descriptor = "[I")
    public int[] field1028;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    private static int[] field991;

    @OriginalMember(owner = "gc", name = "i", descriptor = "[Lgc;")
    private static ObjType[] field993;

    @OriginalMember(owner = "gc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1013;

    @OriginalMember(owner = "gc", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field1014;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method337(Jagfile arg0) {
        field992 = new Packet(arg0.method299("obj.dat", null), true);
        Packet var1 = new Packet(arg0.method299("obj.idx", null), true);
        field990 = var1.method233();
        field991 = new int[field990];
        int var2 = 2;
        for (int var3 = 0; var3 < field990; var3++) {
            field991[var3] = var2;
            var2 += var1.method233();
        }
        field993 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field993[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method338(byte arg0) {
        field1031 = null;
        if (arg0 == 7) {
            boolean var1 = false;
        } else {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1032 = null;
        field991 = null;
        field993 = null;
        field992 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final ObjType method339(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field993[var1].field996 == arg0) {
                return field993[var1];
            }
        }
        field994 = (field994 + 1) % 10;
        ObjType var2 = field993[field994];
        field992.field698 = field991[arg0];
        var2.field996 = arg0;
        var2.method340();
        var2.method341(3251, field992);
        if (var2.field1030 != -1) {
            var2.method342(-145);
        }
        if (!field995 && var2.field1012) {
            var2.field998 = "Members Object";
            var2.field999 = "Login to a members' server to use this object.".getBytes();
            var2.field1013 = null;
            var2.field1014 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()V")
    public final void method340() {
        this.field997 = 0;
        this.field998 = null;
        this.field999 = null;
        this.field1000 = null;
        this.field1001 = null;
        this.field1002 = 2000;
        this.field1003 = 0;
        this.field1004 = 0;
        this.field1005 = 0;
        this.field1006 = 0;
        this.field1007 = 0;
        this.field1008 = false;
        this.field1009 = -1;
        this.field1010 = false;
        this.field1011 = 1;
        this.field1012 = false;
        this.field1013 = null;
        this.field1014 = null;
        this.field1015 = -1;
        this.field1016 = -1;
        this.field1017 = 0;
        this.field1018 = -1;
        this.field1019 = -1;
        this.field1020 = 0;
        this.field1021 = -1;
        this.field1022 = -1;
        this.field1023 = -1;
        this.field1024 = -1;
        this.field1025 = -1;
        this.field1026 = -1;
        this.field1027 = null;
        this.field1028 = null;
        this.field1029 = -1;
        this.field1030 = -1;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILmb;)V")
    public final void method341(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            this.field988 = 242;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field997 = arg1.method233();
                } else if (var3 == 2) {
                    this.field998 = arg1.method238();
                } else if (var3 == 3) {
                    this.field999 = arg1.method239(true);
                } else if (var3 == 4) {
                    this.field1002 = arg1.method233();
                } else if (var3 == 5) {
                    this.field1003 = arg1.method233();
                } else if (var3 == 6) {
                    this.field1004 = arg1.method233();
                } else if (var3 == 7) {
                    this.field1006 = arg1.method233();
                    if (this.field1006 > 32767) {
                        this.field1006 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1007 = arg1.method233();
                    if (this.field1007 > 32767) {
                        this.field1007 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field1008 = true;
                } else if (var3 == 10) {
                    this.field1009 = arg1.method233();
                } else if (var3 == 11) {
                    this.field1010 = true;
                } else if (var3 == 12) {
                    this.field1011 = arg1.method236();
                } else if (var3 == 16) {
                    this.field1012 = true;
                } else if (var3 == 23) {
                    this.field1015 = arg1.method233();
                    this.field1017 = arg1.method232();
                } else if (var3 == 24) {
                    this.field1016 = arg1.method233();
                } else if (var3 == 25) {
                    this.field1018 = arg1.method233();
                    this.field1020 = arg1.method232();
                } else if (var3 == 26) {
                    this.field1019 = arg1.method233();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1013 == null) {
                        this.field1013 = new String[5];
                    }
                    this.field1013[var3 - 30] = arg1.method238();
                    if (this.field1013[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1013[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1014 == null) {
                        this.field1014 = new String[5];
                    }
                    this.field1014[var3 - 35] = arg1.method238();
                } else if (var3 == 40) {
                    int var4 = arg1.method231();
                    this.field1000 = new int[var4];
                    this.field1001 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1000[var5] = arg1.method233();
                        this.field1001[var5] = arg1.method233();
                    }
                } else if (var3 == 78) {
                    this.field1021 = arg1.method233();
                } else if (var3 == 79) {
                    this.field1022 = arg1.method233();
                } else if (var3 == 90) {
                    this.field1023 = arg1.method233();
                } else if (var3 == 91) {
                    this.field1025 = arg1.method233();
                } else if (var3 == 92) {
                    this.field1024 = arg1.method233();
                } else if (var3 == 93) {
                    this.field1026 = arg1.method233();
                } else if (var3 == 95) {
                    this.field1005 = arg1.method233();
                } else if (var3 == 97) {
                    this.field1029 = arg1.method233();
                } else if (var3 == 98) {
                    this.field1030 = arg1.method233();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1027 == null) {
                        this.field1027 = new int[10];
                        this.field1028 = new int[10];
                    }
                    this.field1027[var3 - 100] = arg1.method233();
                    this.field1028[var3 - 100] = arg1.method233();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)V")
    public void method342(int arg0) {
        ObjType var2 = method339(this.field1030);
        this.field997 = var2.field997;
        this.field1002 = var2.field1002;
        this.field1003 = var2.field1003;
        while (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1004 = var2.field1004;
        this.field1005 = var2.field1005;
        this.field1006 = var2.field1006;
        this.field1007 = var2.field1007;
        this.field1000 = var2.field1000;
        this.field1001 = var2.field1001;
        ObjType var3 = method339(this.field1029);
        this.field998 = var3.field998;
        this.field1012 = var3.field1012;
        this.field1011 = var3.field1011;
        String var4 = "a";
        char var5 = var3.field998.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field999 = ("Swap this note at any bank for " + var4 + " " + var3.field998 + ".").getBytes();
        this.field1010 = true;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Lfb;")
    public final Model method343(int arg0) {
        if (this.field1027 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1027[var3];
                }
            }
            if (var2 != -1) {
                return method339(var2).method343(1);
            }
        }
        Model var4 = (Model) field1031.method113((long) this.field996);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method135(this.field997, this.field986);
        if (var5 == null) {
            return null;
        }
        if (this.field1000 != null) {
            for (int var6 = 0; var6 < this.field1000.length; var6++) {
                var5.method149(this.field1000[var6], this.field1001[var6]);
            }
        }
        var5.method152(64, 768, -50, -10, -50, true);
        var5.field567 = true;
        field1031.method114(var5, (long) this.field996, 7);
        return var5;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(IZ)Lfb;")
    public final Model method344(int arg0, boolean arg1) {
        if (this.field1027 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1028[var4] && this.field1028[var4] != 0) {
                    var3 = this.field1027[var4];
                }
            }
            if (var3 != -1) {
                return method339(var3).method344(1, true);
            }
        }
        Model var5 = Model.method135(this.field997, this.field986);
        if (!arg1) {
            this.field986 = 0;
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1000 != null) {
            for (int var6 = 0; var6 < this.field1000.length; var6++) {
                var5.method149(this.field1000[var6], this.field1001[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III)Ljb;")
    public static final Pix32 method345(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field1032.method113((long) arg2);
        if (var3 != null && var3.field663 != arg0 && var3.field663 != -1) {
            var3.method118();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method339(arg2);
        if (var4.field1027 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg0 >= var4.field1028[var6] && var4.field1028[var6] != 0) {
                    var5 = var4.field1027[var6];
                }
            }
            if (var5 != -1) {
                var4 = method339(var5);
            }
        }
        Model var7 = var4.method343(1);
        if (var7 == null) {
            return null;
        }
        Pix32 var8 = null;
        if (arg1 != 9) {
            throw new NullPointerException();
        }
        if (var4.field1030 != -1) {
            var8 = method345(10, 9, var4.field1029);
            if (var8 == null) {
                return null;
            }
        }
        Pix32 var9 = new Pix32(32, 32);
        int var10 = Pix3D.field634;
        int var11 = Pix3D.field635;
        int[] var12 = Pix3D.field640;
        int[] var13 = Pix2D.field616;
        int var14 = Pix2D.field617;
        int var15 = Pix2D.field618;
        int var16 = Pix2D.field621;
        int var17 = Pix2D.field622;
        int var18 = Pix2D.field619;
        int var19 = Pix2D.field620;
        Pix3D.field632 = false;
        Pix2D.method161(var9.field657, 32, 32, 7);
        Pix2D.method165(32, 660, 0, 32, 0, 0);
        Pix3D.method170(0);
        int var20 = Pix3D.field638[var4.field1003] * var4.field1002 >> 16;
        int var21 = Pix3D.field639[var4.field1003] * var4.field1002 >> 16;
        var7.method155(0, var4.field1004, var4.field1005, var4.field1003, var4.field1006, var7.field398 / 2 + var20 + var4.field1007, var4.field1007 + var21);
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var9.field657[var27 * 32 + var22] == 0) {
                    if (var22 > 0 && var9.field657[var27 * 32 + var22 - 1] > 1) {
                        var9.field657[var27 * 32 + var22] = 1;
                    } else if (var27 > 0 && var9.field657[(var27 - 1) * 32 + var22] > 1) {
                        var9.field657[var27 * 32 + var22] = 1;
                    } else if (var22 < 31 && var9.field657[var27 * 32 + var22 + 1] > 1) {
                        var9.field657[var27 * 32 + var22] = 1;
                    } else if (var27 < 31 && var9.field657[(var27 + 1) * 32 + var22] > 1) {
                        var9.field657[var27 * 32 + var22] = 1;
                    }
                }
            }
        }
        for (int var23 = 31; var23 >= 0; var23--) {
            for (int var26 = 31; var26 >= 0; var26--) {
                if (var9.field657[var26 * 32 + var23] == 0 && var23 > 0 && var26 > 0 && var9.field657[(var26 - 1) * 32 + var23 - 1] > 0) {
                    var9.field657[var26 * 32 + var23] = 3153952;
                }
            }
        }
        if (var4.field1030 != -1) {
            int var24 = var8.field662;
            int var25 = var8.field663;
            var8.field662 = 32;
            var8.field663 = 32;
            var8.method192(5, 5, 22, 22, true);
            var8.field662 = var24;
            var8.field663 = var25;
        }
        field1032.method114(var9, (long) arg2, 7);
        Pix2D.method161(var13, var15, var14, 7);
        Pix2D.method163(var19, var18, var16, var17, 5);
        Pix3D.field634 = var10;
        Pix3D.field635 = var11;
        Pix3D.field640 = var12;
        Pix3D.field632 = true;
        if (var4.field1010) {
            var9.field662 = 33;
        } else {
            var9.field662 = 32;
        }
        var9.field663 = arg0;
        return var9;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BI)Z")
    public final boolean method346(byte arg0, int arg1) {
        int var3 = this.field1015;
        int var4 = this.field1016;
        int var5 = this.field1021;
        if (arg0 != -73) {
            this.field985 = !this.field985;
        }
        if (arg1 == 1) {
            var3 = this.field1018;
            var4 = this.field1019;
            var5 = this.field1022;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!Model.method136(var3)) {
            var6 = false;
        }
        if (var4 != -1 && !Model.method136(var4)) {
            var6 = false;
        }
        if (var5 != -1 && !Model.method136(var5)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZI)Lfb;")
    public final Model method347(boolean arg0, int arg1) {
        int var3 = this.field1015;
        int var4 = this.field1016;
        int var5 = this.field1021;
        if (arg1 == 1) {
            var3 = this.field1018;
            var4 = this.field1019;
            var5 = this.field1022;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method135(var3, this.field986);
        if (arg0) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method135(var4, this.field986);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, var11, (byte) 4);
            } else {
                Model var7 = Model.method135(var4, this.field986);
                Model var8 = Model.method135(var5, this.field986);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, var9, (byte) 4);
            }
        }
        if (arg1 == 0 && this.field1017 != 0) {
            var6.method148(this.field1017, this.field987, 0, 0);
        }
        if (arg1 == 1 && this.field1020 != 0) {
            var6.method148(this.field1020, this.field987, 0, 0);
        }
        if (this.field1000 != null) {
            for (int var12 = 0; var12 < this.field1000.length; var12++) {
                var6.method149(this.field1000[var12], this.field1001[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(II)Z")
    public final boolean method348(int arg0, int arg1) {
        int var3 = this.field1023;
        int var4 = this.field1024;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == 1) {
            var3 = this.field1025;
            var4 = this.field1026;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!Model.method136(var3)) {
            var6 = false;
        }
        if (var4 != -1 && !Model.method136(var4)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(IB)Lfb;")
    public final Model method349(int arg0, byte arg1) {
        if (arg1 != -96) {
            this.field989 = !this.field989;
        }
        int var3 = this.field1023;
        int var4 = this.field1024;
        if (arg0 == 1) {
            var3 = this.field1025;
            var4 = this.field1026;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method135(var3, this.field986);
        if (var4 != -1) {
            Model var6 = Model.method135(var4, this.field986);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, var7, (byte) 4);
        }
        if (this.field1000 != null) {
            for (int var8 = 0; var8 < this.field1000.length; var8++) {
                var5.method149(this.field1000[var8], this.field1001[var8]);
            }
        }
        return var5;
    }
}
