import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class ObjType {

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private boolean field977 = true;

    @OriginalMember(owner = "gc", name = "i", descriptor = "I")
    public int field984 = -1;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private static int field976 = 122;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Z")
    public static boolean field983 = true;

    @OriginalMember(owner = "gc", name = "R", descriptor = "Lt;")
    public static LruCache field1019 = new LruCache(false, 50);

    @OriginalMember(owner = "gc", name = "S", descriptor = "Lt;")
    public static LruCache field1020 = new LruCache(false, 100);

    @OriginalMember(owner = "gc", name = "D", descriptor = "B")
    private byte field1005;

    @OriginalMember(owner = "gc", name = "G", descriptor = "B")
    private byte field1008;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "gc", name = "L", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "gc", name = "M", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "gc", name = "P", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "gc", name = "Q", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    private static int field978;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field982;

    @OriginalMember(owner = "gc", name = "j", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Lmb;")
    private static Packet field980;

    @OriginalMember(owner = "gc", name = "k", descriptor = "Ljava/lang/String;")
    public String field986;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1000;

    @OriginalMember(owner = "gc", name = "u", descriptor = "Z")
    private boolean field996;

    @OriginalMember(owner = "gc", name = "w", descriptor = "Z")
    public boolean field998;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[B")
    public byte[] field987;

    @OriginalMember(owner = "gc", name = "N", descriptor = "[I")
    public int[] field1015;

    @OriginalMember(owner = "gc", name = "O", descriptor = "[I")
    public int[] field1016;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field979;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field988;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field989;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static ObjType[] field981;

    @OriginalMember(owner = "gc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1001;

    @OriginalMember(owner = "gc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1002;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method333(Jagfile arg0) {
        field980 = new Packet(699, arg0.method295("obj.dat", null));
        Packet var1 = new Packet(699, arg0.method295("obj.idx", null));
        field978 = var1.method233();
        field979 = new int[field978];
        int var2 = 2;
        for (int var3 = 0; var3 < field978; var3++) {
            field979[var3] = var2;
            var2 += var1.method233();
        }
        field981 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field981[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)V")
    public static final void method334(boolean arg0) {
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1019 = null;
        field1020 = null;
        field979 = null;
        field981 = null;
        field980 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final ObjType method335(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field981[var1].field984 == arg0) {
                return field981[var1];
            }
        }
        field982 = (field982 + 1) % 10;
        ObjType var2 = field981[field982];
        field980.field694 = field979[arg0];
        var2.field984 = arg0;
        var2.method336();
        var2.method337(false, field980);
        if (var2.field1018 != -1) {
            var2.method338(field976);
        }
        if (!field983 && var2.field1000) {
            var2.field986 = "Members Object";
            var2.field987 = "Login to a members' server to use this object.".getBytes();
            var2.field1001 = null;
            var2.field1002 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()V")
    public final void method336() {
        this.field985 = 0;
        this.field986 = null;
        this.field987 = null;
        this.field988 = null;
        this.field989 = null;
        this.field990 = 2000;
        this.field991 = 0;
        this.field992 = 0;
        this.field993 = 0;
        this.field994 = 0;
        this.field995 = 0;
        this.field996 = false;
        this.field997 = -1;
        this.field998 = false;
        this.field999 = 1;
        this.field1000 = false;
        this.field1001 = null;
        this.field1002 = null;
        this.field1003 = -1;
        this.field1004 = -1;
        this.field1005 = 0;
        this.field1006 = -1;
        this.field1007 = -1;
        this.field1008 = 0;
        this.field1009 = -1;
        this.field1010 = -1;
        this.field1011 = -1;
        this.field1012 = -1;
        this.field1013 = -1;
        this.field1014 = -1;
        this.field1015 = null;
        this.field1016 = null;
        this.field1017 = -1;
        this.field1018 = -1;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZLmb;)V")
    public final void method337(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field985 = arg1.method233();
                } else if (var3 == 2) {
                    this.field986 = arg1.method238();
                } else if (var3 == 3) {
                    this.field987 = arg1.method239(-139);
                } else if (var3 == 4) {
                    this.field990 = arg1.method233();
                } else if (var3 == 5) {
                    this.field991 = arg1.method233();
                } else if (var3 == 6) {
                    this.field992 = arg1.method233();
                } else if (var3 == 7) {
                    this.field994 = arg1.method233();
                    if (this.field994 > 32767) {
                        this.field994 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field995 = arg1.method233();
                    if (this.field995 > 32767) {
                        this.field995 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field996 = true;
                } else if (var3 == 10) {
                    this.field997 = arg1.method233();
                } else if (var3 == 11) {
                    this.field998 = true;
                } else if (var3 == 12) {
                    this.field999 = arg1.method236();
                } else if (var3 == 16) {
                    this.field1000 = true;
                } else if (var3 == 23) {
                    this.field1003 = arg1.method233();
                    this.field1005 = arg1.method232();
                } else if (var3 == 24) {
                    this.field1004 = arg1.method233();
                } else if (var3 == 25) {
                    this.field1006 = arg1.method233();
                    this.field1008 = arg1.method232();
                } else if (var3 == 26) {
                    this.field1007 = arg1.method233();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1001 == null) {
                        this.field1001 = new String[5];
                    }
                    this.field1001[var3 - 30] = arg1.method238();
                    if (this.field1001[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1001[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1002 == null) {
                        this.field1002 = new String[5];
                    }
                    this.field1002[var3 - 35] = arg1.method238();
                } else if (var3 == 40) {
                    int var4 = arg1.method231();
                    this.field988 = new int[var4];
                    this.field989 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field988[var5] = arg1.method233();
                        this.field989[var5] = arg1.method233();
                    }
                } else if (var3 == 78) {
                    this.field1009 = arg1.method233();
                } else if (var3 == 79) {
                    this.field1010 = arg1.method233();
                } else if (var3 == 90) {
                    this.field1011 = arg1.method233();
                } else if (var3 == 91) {
                    this.field1013 = arg1.method233();
                } else if (var3 == 92) {
                    this.field1012 = arg1.method233();
                } else if (var3 == 93) {
                    this.field1014 = arg1.method233();
                } else if (var3 == 95) {
                    this.field993 = arg1.method233();
                } else if (var3 == 97) {
                    this.field1017 = arg1.method233();
                } else if (var3 == 98) {
                    this.field1018 = arg1.method233();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1015 == null) {
                        this.field1015 = new int[10];
                        this.field1016 = new int[10];
                    }
                    this.field1015[var3 - 100] = arg1.method233();
                    this.field1016[var3 - 100] = arg1.method233();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)V")
    public void method338(int arg0) {
        ObjType var2 = method335(this.field1018);
        this.field985 = var2.field985;
        this.field990 = var2.field990;
        this.field991 = var2.field991;
        this.field992 = var2.field992;
        this.field993 = var2.field993;
        this.field994 = var2.field994;
        this.field995 = var2.field995;
        this.field988 = var2.field988;
        this.field989 = var2.field989;
        ObjType var3 = method335(this.field1017);
        this.field986 = var3.field986;
        this.field1000 = var3.field1000;
        this.field999 = var3.field999;
        String var4 = "a";
        if (arg0 <= 0) {
            return;
        }
        char var5 = var3.field986.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field987 = ("Swap this note at any bank for " + var4 + " " + var3.field986 + ".").getBytes();
        this.field998 = true;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Lfb;")
    public final Model method339(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1016[var3] && this.field1016[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method335(var2).method339(1);
            }
        }
        Model var4 = (Model) field1019.method113((long) this.field984);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method135(this.field985, -30419);
        if (var5 == null) {
            return null;
        }
        if (this.field988 != null) {
            for (int var6 = 0; var6 < this.field988.length; var6++) {
                var5.method149(this.field988[var6], this.field989[var6]);
            }
        }
        var5.method152(64, 768, -50, -10, -50, true);
        var5.field558 = true;
        field1019.method114((long) this.field984, true, var5);
        return var5;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(II)Lfb;")
    public final Model method340(int arg0, int arg1) {
        if (this.field1015 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1016[var4] && this.field1016[var4] != 0) {
                    var3 = this.field1015[var4];
                }
            }
            if (var3 != -1) {
                return method335(var3).method340(1, -192);
            }
        }
        Model var5 = Model.method135(this.field985, -30419);
        while (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 == null) {
            return null;
        }
        if (this.field988 != null) {
            for (int var6 = 0; var6 < this.field988.length; var6++) {
                var5.method149(this.field988[var6], this.field989[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III)Ljb;")
    public static final Pix32 method341(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field1020.method113((long) arg2);
        if (var3 != null && var3.field657 != arg0 && var3.field657 != -1) {
            var3.method118();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method335(arg2);
        if (var4.field1015 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg0 >= var4.field1016[var6] && var4.field1016[var6] != 0) {
                    var5 = var4.field1015[var6];
                }
            }
            if (var5 != -1) {
                var4 = method335(var5);
            }
        }
        Model var7 = var4.method339(1);
        while (arg1 >= 0) {
            field976 = 140;
        }
        if (var7 == null) {
            return null;
        }
        Pix32 var8 = null;
        if (var4.field1018 != -1) {
            var8 = method341(10, -539, var4.field1017);
            if (var8 == null) {
                return null;
            }
        }
        Pix32 var9 = new Pix32(32, 32);
        int var10 = Pix3D.field628;
        int var11 = Pix3D.field629;
        int[] var12 = Pix3D.field634;
        int[] var13 = Pix2D.field608;
        int var14 = Pix2D.field609;
        int var15 = Pix2D.field610;
        int var16 = Pix2D.field613;
        int var17 = Pix2D.field614;
        int var18 = Pix2D.field611;
        int var19 = Pix2D.field612;
        Pix3D.field626 = false;
        Pix2D.method161(32, (byte) 102, 32, var9.field651);
        Pix2D.method165(0, 32, 0, 32, (byte) 5, 0);
        Pix3D.method170((byte) 2);
        int var20 = Pix3D.field632[var4.field991] * var4.field990 >> 16;
        int var21 = Pix3D.field633[var4.field991] * var4.field990 >> 16;
        var7.method155(0, var4.field992, var4.field993, var4.field991, var4.field994, var7.field394 / 2 + var20 + var4.field995, var4.field995 + var21);
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var9.field651[var27 * 32 + var22] == 0) {
                    if (var22 > 0 && var9.field651[var27 * 32 + var22 - 1] > 1) {
                        var9.field651[var27 * 32 + var22] = 1;
                    } else if (var27 > 0 && var9.field651[(var27 - 1) * 32 + var22] > 1) {
                        var9.field651[var27 * 32 + var22] = 1;
                    } else if (var22 < 31 && var9.field651[var27 * 32 + var22 + 1] > 1) {
                        var9.field651[var27 * 32 + var22] = 1;
                    } else if (var27 < 31 && var9.field651[(var27 + 1) * 32 + var22] > 1) {
                        var9.field651[var27 * 32 + var22] = 1;
                    }
                }
            }
        }
        for (int var23 = 31; var23 >= 0; var23--) {
            for (int var26 = 31; var26 >= 0; var26--) {
                if (var9.field651[var26 * 32 + var23] == 0 && var23 > 0 && var26 > 0 && var9.field651[(var26 - 1) * 32 + var23 - 1] > 0) {
                    var9.field651[var26 * 32 + var23] = 3153952;
                }
            }
        }
        if (var4.field1018 != -1) {
            int var24 = var8.field656;
            int var25 = var8.field657;
            var8.field656 = 32;
            var8.field657 = 32;
            var8.method192(22, 5, 302, 22, 5);
            var8.field656 = var24;
            var8.field657 = var25;
        }
        field1020.method114((long) arg2, true, var9);
        Pix2D.method161(var15, (byte) 102, var14, var13);
        Pix2D.method163(false, var16, var18, var19, var17);
        Pix3D.field628 = var10;
        Pix3D.field629 = var11;
        Pix3D.field634 = var12;
        Pix3D.field626 = true;
        if (var4.field998) {
            var9.field656 = 33;
        } else {
            var9.field656 = 32;
        }
        var9.field657 = arg0;
        return var9;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(II)Z")
    public final boolean method342(int arg0, int arg1) {
        int var3 = this.field1003;
        int var4 = this.field1004;
        int var5 = this.field1009;
        int var6 = 0 / arg1;
        if (arg0 == 1) {
            var3 = this.field1006;
            var4 = this.field1007;
            var5 = this.field1010;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var7 = true;
        if (!Model.method136(var3)) {
            var7 = false;
        }
        if (var4 != -1 && !Model.method136(var4)) {
            var7 = false;
        }
        if (var5 != -1 && !Model.method136(var5)) {
            var7 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(II)Lfb;")
    public final Model method343(int arg0, int arg1) {
        int var3 = this.field1003;
        int var4 = this.field1004;
        int var5 = this.field1009;
        if (arg1 < 3 || arg1 > 3) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1006;
            var4 = this.field1007;
            var5 = this.field1010;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method135(var3, -30419);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method135(var4, -30419);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, false, var11);
            } else {
                Model var7 = Model.method135(var4, -30419);
                Model var8 = Model.method135(var5, -30419);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, false, var9);
            }
        }
        if (arg0 == 0 && this.field1005 != 0) {
            var6.method148(false, this.field1005, 0, 0);
        }
        if (arg0 == 1 && this.field1008 != 0) {
            var6.method148(false, this.field1008, 0, 0);
        }
        if (this.field988 != null) {
            for (int var12 = 0; var12 < this.field988.length; var12++) {
                var6.method149(this.field988[var12], this.field989[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "gc", name = "d", descriptor = "(II)Z")
    public final boolean method344(int arg0, int arg1) {
        int var3 = this.field1011;
        int var4 = this.field1012;
        if (arg0 != -39442) {
            field976 = 308;
        }
        if (arg1 == 1) {
            var3 = this.field1013;
            var4 = this.field1014;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Model.method136(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method136(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "gc", name = "e", descriptor = "(II)Lfb;")
    public final Model method345(int arg0, int arg1) {
        if (arg1 != -14561) {
            this.field977 = !this.field977;
        }
        int var3 = this.field1011;
        int var4 = this.field1012;
        if (arg0 == 1) {
            var3 = this.field1013;
            var4 = this.field1014;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method135(var3, -30419);
        if (var4 != -1) {
            Model var6 = Model.method135(var4, -30419);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, false, var7);
        }
        if (this.field988 != null) {
            for (int var8 = 0; var8 < this.field988.length; var8++) {
                var5.method149(this.field988[var8], this.field989[var8]);
            }
        }
        return var5;
    }
}
