import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "a", descriptor = "B")
    private byte field1045 = -41;

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private int field1046 = 445;

    @OriginalMember(owner = "hc", name = "c", descriptor = "Z")
    private boolean field1047 = true;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    public int field1054 = -1;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Z")
    public static boolean field1053 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1094 = new LruCache(false, 50);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1095 = new LruCache(false, 100);

    @OriginalMember(owner = "hc", name = "D", descriptor = "B")
    private byte field1074;

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1077;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "hc", name = "h", descriptor = "I")
    private static int field1052;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "hc", name = "f", descriptor = "Llb;")
    private static Packet field1050;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1056;

    @OriginalMember(owner = "hc", name = "w", descriptor = "Z")
    public boolean field1067;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1069;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[B")
    public byte[] field1057;

    @OriginalMember(owner = "hc", name = "e", descriptor = "[I")
    private static int[] field1049;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1059;

    @OriginalMember(owner = "hc", name = "N", descriptor = "[I")
    public int[] field1084;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1085;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[Lhc;")
    private static ObjType[] field1051;

    @OriginalMember(owner = "hc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1070;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1071;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1050 = new Packet(-49365, arg0.method299("obj.dat", null));
        Packet var1 = new Packet(-49365, arg0.method299("obj.idx", null));
        field1048 = var1.method231();
        field1049 = new int[field1048];
        int var2 = 2;
        for (int var3 = 0; var3 < field1048; var3++) {
            field1049[var3] = var2;
            var2 += var1.method231();
        }
        field1051 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1051[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public static final void method347(boolean arg0) {
        field1094 = null;
        field1095 = null;
        field1049 = null;
        field1051 = null;
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1050 = null;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1051[var1].field1054 == arg0) {
                return field1051[var1];
            }
        }
        field1052 = (field1052 + 1) % 10;
        ObjType var2 = field1051[field1052];
        field1050.field722 = field1049[arg0];
        var2.field1054 = arg0;
        var2.method349();
        var2.method350(field1050, false);
        if (var2.field1087 != -1) {
            var2.method351(false);
        }
        if (!field1053 && var2.field1069) {
            var2.field1056 = "Members Object";
            var2.field1057 = "Login to a members' server to use this object.".getBytes();
            var2.field1070 = null;
            var2.field1071 = null;
            var2.field1093 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1055 = 0;
        this.field1056 = null;
        this.field1057 = null;
        this.field1058 = null;
        this.field1059 = null;
        this.field1060 = 2000;
        this.field1061 = 0;
        this.field1062 = 0;
        this.field1063 = 0;
        this.field1064 = 0;
        this.field1065 = 0;
        this.field1066 = -1;
        this.field1067 = false;
        this.field1068 = 1;
        this.field1069 = false;
        this.field1070 = null;
        this.field1071 = null;
        this.field1072 = -1;
        this.field1073 = -1;
        this.field1074 = 0;
        this.field1075 = -1;
        this.field1076 = -1;
        this.field1077 = 0;
        this.field1078 = -1;
        this.field1079 = -1;
        this.field1080 = -1;
        this.field1081 = -1;
        this.field1082 = -1;
        this.field1083 = -1;
        this.field1084 = null;
        this.field1085 = null;
        this.field1086 = -1;
        this.field1087 = -1;
        this.field1088 = 128;
        this.field1089 = 128;
        this.field1090 = 128;
        this.field1091 = 0;
        this.field1092 = 0;
        this.field1093 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Llb;Z)V")
    public final void method350(Packet arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1055 = arg0.method231();
                } else if (var4 == 2) {
                    this.field1056 = arg0.method236();
                } else if (var4 == 3) {
                    this.field1057 = arg0.method237(true);
                } else if (var4 == 4) {
                    this.field1060 = arg0.method231();
                } else if (var4 == 5) {
                    this.field1061 = arg0.method231();
                } else if (var4 == 6) {
                    this.field1062 = arg0.method231();
                } else if (var4 == 7) {
                    this.field1064 = arg0.method231();
                    if (this.field1064 > 32767) {
                        this.field1064 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1065 = arg0.method231();
                    if (this.field1065 > 32767) {
                        this.field1065 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1066 = arg0.method231();
                } else if (var4 == 11) {
                    this.field1067 = true;
                } else if (var4 == 12) {
                    this.field1068 = arg0.method234();
                } else if (var4 == 16) {
                    this.field1069 = true;
                } else if (var4 == 23) {
                    this.field1072 = arg0.method231();
                    this.field1074 = arg0.method230();
                } else if (var4 == 24) {
                    this.field1073 = arg0.method231();
                } else if (var4 == 25) {
                    this.field1075 = arg0.method231();
                    this.field1077 = arg0.method230();
                } else if (var4 == 26) {
                    this.field1076 = arg0.method231();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1070 == null) {
                        this.field1070 = new String[5];
                    }
                    this.field1070[var4 - 30] = arg0.method236();
                    if (this.field1070[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1070[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1071 == null) {
                        this.field1071 = new String[5];
                    }
                    this.field1071[var4 - 35] = arg0.method236();
                } else if (var4 == 40) {
                    int var5 = arg0.method229();
                    this.field1058 = new int[var5];
                    this.field1059 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1058[var6] = arg0.method231();
                        this.field1059[var6] = arg0.method231();
                    }
                } else if (var4 == 78) {
                    this.field1078 = arg0.method231();
                } else if (var4 == 79) {
                    this.field1079 = arg0.method231();
                } else if (var4 == 90) {
                    this.field1080 = arg0.method231();
                } else if (var4 == 91) {
                    this.field1082 = arg0.method231();
                } else if (var4 == 92) {
                    this.field1081 = arg0.method231();
                } else if (var4 == 93) {
                    this.field1083 = arg0.method231();
                } else if (var4 == 95) {
                    this.field1063 = arg0.method231();
                } else if (var4 == 97) {
                    this.field1086 = arg0.method231();
                } else if (var4 == 98) {
                    this.field1087 = arg0.method231();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1084 == null) {
                        this.field1084 = new int[10];
                        this.field1085 = new int[10];
                    }
                    this.field1084[var4 - 100] = arg0.method231();
                    this.field1085[var4 - 100] = arg0.method231();
                } else if (var4 == 110) {
                    this.field1088 = arg0.method231();
                } else if (var4 == 111) {
                    this.field1089 = arg0.method231();
                } else if (var4 == 112) {
                    this.field1090 = arg0.method231();
                } else if (var4 == 113) {
                    this.field1091 = arg0.method230();
                } else if (var4 == 114) {
                    this.field1092 = arg0.method230() * 5;
                } else if (var4 == 115) {
                    this.field1093 = arg0.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(Z)V")
    public void method351(boolean arg0) {
        ObjType var2 = method348(this.field1087);
        this.field1055 = var2.field1055;
        this.field1060 = var2.field1060;
        this.field1061 = var2.field1061;
        this.field1062 = var2.field1062;
        this.field1063 = var2.field1063;
        this.field1064 = var2.field1064;
        if (arg0) {
            return;
        }
        this.field1065 = var2.field1065;
        this.field1058 = var2.field1058;
        this.field1059 = var2.field1059;
        ObjType var3 = method348(this.field1086);
        this.field1056 = var3.field1056;
        this.field1069 = var3.field1069;
        this.field1068 = var3.field1068;
        String var4 = "a";
        char var5 = var3.field1056.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1057 = ("Swap this note at any bank for " + var4 + " " + var3.field1056 + ".").getBytes();
        this.field1067 = true;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1094.method101((long) this.field1054);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126(0, this.field1055);
        if (var5 == null) {
            return null;
        }
        if (this.field1088 != 128 || this.field1089 != 128 || this.field1090 != 128) {
            var5.method142(19411, this.field1088, this.field1090, this.field1089);
        }
        if (this.field1058 != null) {
            for (int var6 = 0; var6 < this.field1058.length; var6++) {
                var5.method140(this.field1058[var6], this.field1059[var6]);
            }
        }
        var5.method143(this.field1091 + 64, this.field1092 + 768, -50, -10, -50, true);
        var5.field586 = true;
        field1094.method102(true, (long) this.field1054, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Leb;")
    public final Model method353(boolean arg0, int arg1) {
        if (this.field1084 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1085[var4] && this.field1085[var4] != 0) {
                    var3 = this.field1084[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(this.field1047, 1);
            }
        }
        Model var5 = Model.method126(0, this.field1055);
        if (!arg0) {
            throw new NullPointerException();
        } else if (var5 == null) {
            return null;
        } else {
            if (this.field1058 != null) {
                for (int var6 = 0; var6 < this.field1058.length; var6++) {
                    var5.method140(this.field1058[var6], this.field1059[var6]);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIBI)Lib;")
    public static final Pix32 method354(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            Pix32 var4 = (Pix32) field1095.method101((long) arg1);
            if (var4 != null && var4.field687 != arg0 && var4.field687 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg1);
        if (var5.field1084 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg0 >= var5.field1085[var7] && var5.field1085[var7] != 0) {
                    var6 = var5.field1084[var7];
                }
            }
            if (var6 != -1) {
                var5 = method348(var6);
            }
        }
        Model var8 = var5.method352(1);
        if (var8 == null) {
            return null;
        }
        Pix32 var9 = null;
        if (arg2 != 117) {
            throw new NullPointerException();
        }
        if (var5.field1087 != -1) {
            var9 = method354(10, var5.field1086, (byte) 117, -1);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field659;
        int var12 = Pix3D.field660;
        int[] var13 = Pix3D.field665;
        int[] var14 = Pix2D.field639;
        int var15 = Pix2D.field640;
        int var16 = Pix2D.field641;
        int var17 = Pix2D.field644;
        int var18 = Pix2D.field645;
        int var19 = Pix2D.field642;
        int var20 = Pix2D.field643;
        Pix3D.field657 = false;
        Pix2D.method152(-682, 32, var10.field681, 32);
        Pix2D.method157(0, 0, 32, -917, 0, 32);
        Pix3D.method165(false);
        int var21 = var5.field1060;
        if (arg3 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg3 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field663[var5.field1061] * var21 >> 16;
        int var23 = Pix3D.field664[var5.field1061] * var21 >> 16;
        var8.method146(0, var5.field1062, var5.field1063, var5.field1061, var5.field1064, var8.field399 / 2 + var22 + var5.field1065, var5.field1065 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field681[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field681[var31 * 32 + var24 - 1] > 1) {
                        var10.field681[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field681[(var31 - 1) * 32 + var24] > 1) {
                        var10.field681[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field681[var31 * 32 + var24 + 1] > 1) {
                        var10.field681[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field681[(var31 + 1) * 32 + var24] > 1) {
                        var10.field681[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg3 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field681[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field681[var26 * 32 + var25 - 1] == 1) {
                            var10.field681[var26 * 32 + var25] = arg3;
                        } else if (var26 > 0 && var10.field681[(var26 - 1) * 32 + var25] == 1) {
                            var10.field681[var26 * 32 + var25] = arg3;
                        } else if (var25 < 31 && var10.field681[var26 * 32 + var25 + 1] == 1) {
                            var10.field681[var26 * 32 + var25] = arg3;
                        } else if (var26 < 31 && var10.field681[(var26 + 1) * 32 + var25] == 1) {
                            var10.field681[var26 * 32 + var25] = arg3;
                        }
                    }
                }
            }
        } else if (arg3 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field681[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field681[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field681[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1087 != -1) {
            int var29 = var9.field686;
            int var30 = var9.field687;
            var9.field686 = 32;
            var9.field687 = 32;
            var9.method186(0, true, 0);
            var9.field686 = var29;
            var9.field687 = var30;
        }
        if (arg3 == 0) {
            field1095.method102(true, (long) arg1, var10);
        }
        Pix2D.method152(-682, var15, var14, var16);
        Pix2D.method154(var20, var19, -134, var18, var17);
        Pix3D.field659 = var11;
        Pix3D.field660 = var12;
        Pix3D.field665 = var13;
        Pix3D.field657 = true;
        if (var5.field1067) {
            var10.field686 = 33;
        } else {
            var10.field686 = 32;
        }
        var10.field687 = arg0;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Z")
    public final boolean method355(int arg0, int arg1) {
        int var3 = this.field1072;
        int var4 = this.field1073;
        int var5 = this.field1078;
        if (arg1 != 4) {
            this.field1046 = 316;
        }
        if (arg0 == 1) {
            var3 = this.field1075;
            var4 = this.field1076;
            var5 = this.field1079;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!Model.method127(var3)) {
            var6 = false;
        }
        if (var4 != -1 && !Model.method127(var4)) {
            var6 = false;
        }
        if (var5 != -1 && !Model.method127(var5)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Leb;")
    public final Model method356(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        int var3 = this.field1072;
        int var4 = this.field1073;
        int var5 = this.field1078;
        if (arg1 == 1) {
            var3 = this.field1075;
            var4 = this.field1076;
            var5 = this.field1079;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(0, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method126(0, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(var11, this.field1045, 2);
            } else {
                Model var7 = Model.method126(0, var4);
                Model var8 = Model.method126(0, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(var9, this.field1045, 3);
            }
        }
        if (arg1 == 0 && this.field1074 != 0) {
            var6.method139(this.field1074, 0, 0, 0);
        }
        if (arg1 == 1 && this.field1077 != 0) {
            var6.method139(this.field1077, 0, 0, 0);
        }
        if (this.field1058 != null) {
            for (int var12 = 0; var12 < this.field1058.length; var12++) {
                var6.method140(this.field1058[var12], this.field1059[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method357(int arg0, int arg1) {
        int var3 = this.field1080;
        int var4 = this.field1081;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1082;
            var4 = this.field1083;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Model.method127(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method127(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Leb;")
    public final Model method358(int arg0, byte arg1) {
        int var3 = this.field1080;
        int var4 = this.field1081;
        if (arg1 != 42) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 == 1) {
            var3 = this.field1082;
            var4 = this.field1083;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(0, var3);
        if (var4 != -1) {
            Model var7 = Model.method126(0, var4);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(var8, this.field1045, 2);
        }
        if (this.field1058 != null) {
            for (int var9 = 0; var9 < this.field1058.length; var9++) {
                var6.method140(this.field1058[var9], this.field1059[var9]);
            }
        }
        return var6;
    }
}
