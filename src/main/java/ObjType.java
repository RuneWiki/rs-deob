import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    public int field1057 = -1;

    @OriginalMember(owner = "hc", name = "a", descriptor = "B")
    private static byte field1047 = 59;

    @OriginalMember(owner = "hc", name = "c", descriptor = "Z")
    private static boolean field1049 = true;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    private static int field1050 = 4;

    @OriginalMember(owner = "hc", name = "j", descriptor = "Z")
    public static boolean field1056 = true;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1097 = new LruCache(50, false);

    @OriginalMember(owner = "hc", name = "Z", descriptor = "Ls;")
    public static LruCache field1098 = new LruCache(100, false);

    @OriginalMember(owner = "hc", name = "E", descriptor = "B")
    private byte field1077;

    @OriginalMember(owner = "hc", name = "H", descriptor = "B")
    private byte field1080;

    @OriginalMember(owner = "hc", name = "e", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "hc", name = "i", descriptor = "I")
    private static int field1055;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "hc", name = "y", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "hc", name = "g", descriptor = "Llb;")
    private static Packet field1053;

    @OriginalMember(owner = "hc", name = "m", descriptor = "Ljava/lang/String;")
    public String field1059;

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private static boolean field1048;

    @OriginalMember(owner = "hc", name = "x", descriptor = "Z")
    public boolean field1070;

    @OriginalMember(owner = "hc", name = "z", descriptor = "Z")
    public boolean field1072;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[B")
    public byte[] field1060;

    @OriginalMember(owner = "hc", name = "f", descriptor = "[I")
    private static int[] field1052;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1061;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1062;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1088;

    @OriginalMember(owner = "hc", name = "h", descriptor = "[Lhc;")
    private static ObjType[] field1054;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1073;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1074;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1053 = new Packet(false, arg0.method299("obj.dat", null));
        Packet var1 = new Packet(false, arg0.method299("obj.idx", null));
        field1051 = var1.method231();
        field1052 = new int[field1051];
        int var2 = 2;
        for (int var3 = 0; var3 < field1051; var3++) {
            field1052[var3] = var2;
            var2 += var1.method231();
        }
        field1054 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1054[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(B)V")
    public static final void method347(byte arg0) {
        field1097 = null;
        field1098 = null;
        field1052 = null;
        field1054 = null;
        if (field1047 != arg0) {
            field1048 = !field1048;
        }
        field1053 = null;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1054[var1].field1057 == arg0) {
                return field1054[var1];
            }
        }
        field1055 = (field1055 + 1) % 10;
        ObjType var2 = field1054[field1055];
        field1053.field716 = field1052[arg0];
        var2.field1057 = arg0;
        var2.method349();
        var2.method350(field1053, false);
        if (var2.field1090 != -1) {
            var2.method351(0);
        }
        if (!field1056 && var2.field1072) {
            var2.field1059 = "Members Object";
            var2.field1060 = "Login to a members' server to use this object.".getBytes();
            var2.field1073 = null;
            var2.field1074 = null;
            var2.field1096 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1058 = 0;
        this.field1059 = null;
        this.field1060 = null;
        this.field1061 = null;
        this.field1062 = null;
        this.field1063 = 2000;
        this.field1064 = 0;
        this.field1065 = 0;
        this.field1066 = 0;
        this.field1067 = 0;
        this.field1068 = 0;
        this.field1069 = -1;
        this.field1070 = false;
        this.field1071 = 1;
        this.field1072 = false;
        this.field1073 = null;
        this.field1074 = null;
        this.field1075 = -1;
        this.field1076 = -1;
        this.field1077 = 0;
        this.field1078 = -1;
        this.field1079 = -1;
        this.field1080 = 0;
        this.field1081 = -1;
        this.field1082 = -1;
        this.field1083 = -1;
        this.field1084 = -1;
        this.field1085 = -1;
        this.field1086 = -1;
        this.field1087 = null;
        this.field1088 = null;
        this.field1089 = -1;
        this.field1090 = -1;
        this.field1091 = 128;
        this.field1092 = 128;
        this.field1093 = 128;
        this.field1094 = 0;
        this.field1095 = 0;
        this.field1096 = 0;
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
                    this.field1058 = arg0.method231();
                } else if (var4 == 2) {
                    this.field1059 = arg0.method236();
                } else if (var4 == 3) {
                    this.field1060 = arg0.method237(false);
                } else if (var4 == 4) {
                    this.field1063 = arg0.method231();
                } else if (var4 == 5) {
                    this.field1064 = arg0.method231();
                } else if (var4 == 6) {
                    this.field1065 = arg0.method231();
                } else if (var4 == 7) {
                    this.field1067 = arg0.method231();
                    if (this.field1067 > 32767) {
                        this.field1067 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1068 = arg0.method231();
                    if (this.field1068 > 32767) {
                        this.field1068 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1069 = arg0.method231();
                } else if (var4 == 11) {
                    this.field1070 = true;
                } else if (var4 == 12) {
                    this.field1071 = arg0.method234();
                } else if (var4 == 16) {
                    this.field1072 = true;
                } else if (var4 == 23) {
                    this.field1075 = arg0.method231();
                    this.field1077 = arg0.method230();
                } else if (var4 == 24) {
                    this.field1076 = arg0.method231();
                } else if (var4 == 25) {
                    this.field1078 = arg0.method231();
                    this.field1080 = arg0.method230();
                } else if (var4 == 26) {
                    this.field1079 = arg0.method231();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1073 == null) {
                        this.field1073 = new String[5];
                    }
                    this.field1073[var4 - 30] = arg0.method236();
                    if (this.field1073[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1073[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1074 == null) {
                        this.field1074 = new String[5];
                    }
                    this.field1074[var4 - 35] = arg0.method236();
                } else if (var4 == 40) {
                    int var5 = arg0.method229();
                    this.field1061 = new int[var5];
                    this.field1062 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1061[var6] = arg0.method231();
                        this.field1062[var6] = arg0.method231();
                    }
                } else if (var4 == 78) {
                    this.field1081 = arg0.method231();
                } else if (var4 == 79) {
                    this.field1082 = arg0.method231();
                } else if (var4 == 90) {
                    this.field1083 = arg0.method231();
                } else if (var4 == 91) {
                    this.field1085 = arg0.method231();
                } else if (var4 == 92) {
                    this.field1084 = arg0.method231();
                } else if (var4 == 93) {
                    this.field1086 = arg0.method231();
                } else if (var4 == 95) {
                    this.field1066 = arg0.method231();
                } else if (var4 == 97) {
                    this.field1089 = arg0.method231();
                } else if (var4 == 98) {
                    this.field1090 = arg0.method231();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1087 == null) {
                        this.field1087 = new int[10];
                        this.field1088 = new int[10];
                    }
                    this.field1087[var4 - 100] = arg0.method231();
                    this.field1088[var4 - 100] = arg0.method231();
                } else if (var4 == 110) {
                    this.field1091 = arg0.method231();
                } else if (var4 == 111) {
                    this.field1092 = arg0.method231();
                } else if (var4 == 112) {
                    this.field1093 = arg0.method231();
                } else if (var4 == 113) {
                    this.field1094 = arg0.method230();
                } else if (var4 == 114) {
                    this.field1095 = arg0.method230() * 5;
                } else if (var4 == 115) {
                    this.field1096 = arg0.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)V")
    public void method351(int arg0) {
        ObjType var2 = method348(this.field1090);
        this.field1058 = var2.field1058;
        this.field1063 = var2.field1063;
        this.field1064 = var2.field1064;
        this.field1065 = var2.field1065;
        this.field1066 = var2.field1066;
        this.field1067 = var2.field1067;
        this.field1068 = var2.field1068;
        this.field1061 = var2.field1061;
        this.field1062 = var2.field1062;
        ObjType var3 = method348(this.field1089);
        this.field1059 = var3.field1059;
        this.field1072 = var3.field1072;
        this.field1071 = var3.field1071;
        String var4 = "a";
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        char var6 = var3.field1059.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var4 = "an";
        }
        this.field1060 = ("Swap this note at any bank for " + var4 + " " + var3.field1059 + ".").getBytes();
        this.field1070 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1087 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1088[var3] && this.field1088[var3] != 0) {
                    var2 = this.field1087[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1097.method101((long) this.field1057);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126(this.field1058, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1091 != 128 || this.field1092 != 128 || this.field1093 != 128) {
            var5.method142(this.field1092, this.field1093, false, this.field1091);
        }
        if (this.field1061 != null) {
            for (int var6 = 0; var6 < this.field1061.length; var6++) {
                var5.method140(this.field1061[var6], this.field1062[var6]);
            }
        }
        var5.method143(this.field1094 + 64, this.field1095 + 768, -50, -10, -50, true);
        var5.field580 = true;
        field1097.method102(var5, (long) this.field1057, field1049);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Leb;")
    public final Model method353(int arg0, int arg1) {
        if (this.field1087 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1088[var4] && this.field1088[var4] != 0) {
                    var3 = this.field1087[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(1, -43025);
            }
        }
        Model var5 = Model.method126(this.field1058, 0);
        if (arg1 != -43025) {
            field1050 = 306;
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1061 != null) {
            for (int var6 = 0; var6 < this.field1061.length; var6++) {
                var5.method140(this.field1061[var6], this.field1062[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Lib;")
    public static final Pix32 method354(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            Pix32 var4 = (Pix32) field1098.method101((long) arg0);
            if (var4 != null && var4.field680 != arg1 && var4.field680 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg0);
        if (var5.field1087 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field1088[var7] && var5.field1088[var7] != 0) {
                    var6 = var5.field1087[var7];
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
        if (var5.field1090 != -1) {
            var9 = method354(var5.field1089, 10, -1, -325);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field651;
        int var12 = Pix3D.field652;
        int[] var13 = Pix3D.field657;
        int[] var14 = Pix2D.field632;
        int var15 = Pix2D.field633;
        int var16 = Pix2D.field634;
        int var17 = Pix2D.field637;
        int var18 = Pix2D.field638;
        int var19 = Pix2D.field635;
        int var20 = Pix2D.field636;
        Pix3D.field649 = false;
        Pix2D.method152(32, var10.field674, 32, (byte) 5);
        Pix2D.method157(false, 0, 32, 0, 0, 32);
        Pix3D.method165(-34926);
        int var21 = var5.field1063;
        while (arg3 >= 0) {
            field1050 = 187;
        }
        if (arg2 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg2 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field655[var5.field1064] * var21 >> 16;
        int var23 = Pix3D.field656[var5.field1064] * var21 >> 16;
        var8.method146(0, var5.field1065, var5.field1066, var5.field1064, var5.field1067, var8.field398 / 2 + var22 + var5.field1068, var5.field1068 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field674[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field674[var31 * 32 + var24 - 1] > 1) {
                        var10.field674[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field674[(var31 - 1) * 32 + var24] > 1) {
                        var10.field674[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field674[var31 * 32 + var24 + 1] > 1) {
                        var10.field674[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field674[(var31 + 1) * 32 + var24] > 1) {
                        var10.field674[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field674[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field674[var26 * 32 + var25 - 1] == 1) {
                            var10.field674[var26 * 32 + var25] = arg2;
                        } else if (var26 > 0 && var10.field674[(var26 - 1) * 32 + var25] == 1) {
                            var10.field674[var26 * 32 + var25] = arg2;
                        } else if (var25 < 31 && var10.field674[var26 * 32 + var25 + 1] == 1) {
                            var10.field674[var26 * 32 + var25] = arg2;
                        } else if (var26 < 31 && var10.field674[(var26 + 1) * 32 + var25] == 1) {
                            var10.field674[var26 * 32 + var25] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field674[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field674[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field674[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1090 != -1) {
            int var29 = var9.field679;
            int var30 = var9.field680;
            var9.field679 = 32;
            var9.field680 = 32;
            var9.method186(0, 0, -47687);
            var9.field679 = var29;
            var9.field680 = var30;
        }
        if (arg2 == 0) {
            field1098.method102(var10, (long) arg0, field1049);
        }
        Pix2D.method152(var15, var14, var16, (byte) 5);
        Pix2D.method154(var17, var20, var18, var19, -227);
        Pix3D.field651 = var11;
        Pix3D.field652 = var12;
        Pix3D.field657 = var13;
        Pix3D.field649 = true;
        if (var5.field1070) {
            var10.field679 = 33;
        } else {
            var10.field679 = 32;
        }
        var10.field680 = arg1;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BI)Z")
    public final boolean method355(byte arg0, int arg1) {
        int var3 = this.field1075;
        int var4 = this.field1076;
        int var5 = this.field1081;
        if (arg1 == 1) {
            var3 = this.field1078;
            var4 = this.field1079;
            var5 = this.field1082;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (arg0 != 6) {
            field1050 = 434;
        }
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Leb;")
    public final Model method356(boolean arg0, int arg1) {
        if (arg0) {
            field1050 = -252;
        }
        int var3 = this.field1075;
        int var4 = this.field1076;
        int var5 = this.field1081;
        if (arg1 == 1) {
            var3 = this.field1078;
            var4 = this.field1079;
            var5 = this.field1082;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(var3, 0);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method126(var4, 0);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, var11, (byte) 1);
            } else {
                Model var7 = Model.method126(var4, 0);
                Model var8 = Model.method126(var5, 0);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, var9, (byte) 1);
            }
        }
        if (arg1 == 0 && this.field1077 != 0) {
            var6.method139(0, this.field1077, 0, (byte) -5);
        }
        if (arg1 == 1 && this.field1080 != 0) {
            var6.method139(0, this.field1080, 0, (byte) -5);
        }
        if (this.field1061 != null) {
            for (int var12 = 0; var12 < this.field1061.length; var12++) {
                var6.method140(this.field1061[var12], this.field1062[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IZ)Z")
    public final boolean method357(int arg0, boolean arg1) {
        int var3 = this.field1083;
        int var4 = this.field1084;
        if (arg0 == 1) {
            var3 = this.field1085;
            var4 = this.field1086;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (arg1) {
            field1049 = !field1049;
        }
        if (!Model.method127(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method127(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(BI)Leb;")
    public final Model method358(byte arg0, int arg1) {
        int var3 = this.field1083;
        int var4 = this.field1084;
        if (arg0 != 94) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == 1) {
            var3 = this.field1085;
            var4 = this.field1086;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(var3, 0);
        if (var4 != -1) {
            Model var7 = Model.method126(var4, 0);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(2, var8, (byte) 1);
        }
        if (this.field1061 != null) {
            for (int var9 = 0; var9 < this.field1061.length; var9++) {
                var6.method140(this.field1061[var9], this.field1062[var9]);
            }
        }
        return var6;
    }
}
