import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private int field1042 = 16935;

    @OriginalMember(owner = "hc", name = "d", descriptor = "Z")
    private boolean field1044 = true;

    @OriginalMember(owner = "hc", name = "f", descriptor = "Z")
    private boolean field1046 = false;

    @OriginalMember(owner = "hc", name = "m", descriptor = "I")
    public int field1053 = -1;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    private static int field1043 = 3927;

    @OriginalMember(owner = "hc", name = "e", descriptor = "B")
    private static byte field1045 = 66;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Z")
    public static boolean field1052 = true;

    @OriginalMember(owner = "hc", name = "ab", descriptor = "Ls;")
    public static LruCache field1093 = new LruCache(50, true);

    @OriginalMember(owner = "hc", name = "bb", descriptor = "Ls;")
    public static LruCache field1094 = new LruCache(100, true);

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1073;

    @OriginalMember(owner = "hc", name = "J", descriptor = "B")
    private byte field1076;

    @OriginalMember(owner = "hc", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private static int field1051;

    @OriginalMember(owner = "hc", name = "n", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "hc", name = "y", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "hc", name = "A", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "hc", name = "Z", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Llb;")
    private static Packet field1049;

    @OriginalMember(owner = "hc", name = "o", descriptor = "Ljava/lang/String;")
    public String field1055;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1041;

    @OriginalMember(owner = "hc", name = "z", descriptor = "Z")
    public boolean field1066;

    @OriginalMember(owner = "hc", name = "B", descriptor = "Z")
    public boolean field1068;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[B")
    public byte[] field1056;

    @OriginalMember(owner = "hc", name = "h", descriptor = "[I")
    private static int[] field1048;

    @OriginalMember(owner = "hc", name = "q", descriptor = "[I")
    private int[] field1057;

    @OriginalMember(owner = "hc", name = "r", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "hc", name = "R", descriptor = "[I")
    public int[] field1084;

    @OriginalMember(owner = "hc", name = "j", descriptor = "[Lhc;")
    private static ObjType[] field1050;

    @OriginalMember(owner = "hc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1069;

    @OriginalMember(owner = "hc", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field1070;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1049 = new Packet(arg0.method299("obj.dat", null), field1041);
        Packet var1 = new Packet(arg0.method299("obj.idx", null), field1041);
        field1047 = var1.method231();
        field1048 = new int[field1047];
        int var2 = 2;
        for (int var3 = 0; var3 < field1047; var3++) {
            field1048[var3] = var2;
            var2 += var1.method231();
        }
        field1050 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1050[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(B)V")
    public static final void method347(byte arg0) {
        field1093 = null;
        if (arg0 != 4) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1094 = null;
        field1048 = null;
        field1050 = null;
        field1049 = null;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1050[var1].field1053 == arg0) {
                return field1050[var1];
            }
        }
        field1051 = (field1051 + 1) % 10;
        ObjType var2 = field1050[field1051];
        field1049.field712 = field1048[arg0];
        var2.field1053 = arg0;
        var2.method349();
        var2.method350(false, field1049);
        if (var2.field1086 != -1) {
            var2.method351(215);
        }
        if (!field1052 && var2.field1068) {
            var2.field1055 = "Members Object";
            var2.field1056 = "Login to a members' server to use this object.".getBytes();
            var2.field1069 = null;
            var2.field1070 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1054 = 0;
        this.field1055 = null;
        this.field1056 = null;
        this.field1057 = null;
        this.field1058 = null;
        this.field1059 = 2000;
        this.field1060 = 0;
        this.field1061 = 0;
        this.field1062 = 0;
        this.field1063 = 0;
        this.field1064 = 0;
        this.field1065 = -1;
        this.field1066 = false;
        this.field1067 = 1;
        this.field1068 = false;
        this.field1069 = null;
        this.field1070 = null;
        this.field1071 = -1;
        this.field1072 = -1;
        this.field1073 = 0;
        this.field1074 = -1;
        this.field1075 = -1;
        this.field1076 = 0;
        this.field1077 = -1;
        this.field1078 = -1;
        this.field1079 = -1;
        this.field1080 = -1;
        this.field1081 = -1;
        this.field1082 = -1;
        this.field1083 = null;
        this.field1084 = null;
        this.field1085 = -1;
        this.field1086 = -1;
        this.field1087 = 128;
        this.field1088 = 128;
        this.field1089 = 128;
        this.field1090 = 0;
        this.field1091 = 0;
        this.field1092 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZLlb;)V")
    public final void method350(boolean arg0, Packet arg1) {
        if (arg0) {
            this.field1044 = !this.field1044;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1054 = arg1.method231();
                } else if (var3 == 2) {
                    this.field1055 = arg1.method236();
                } else if (var3 == 3) {
                    this.field1056 = arg1.method237(940);
                } else if (var3 == 4) {
                    this.field1059 = arg1.method231();
                } else if (var3 == 5) {
                    this.field1060 = arg1.method231();
                } else if (var3 == 6) {
                    this.field1061 = arg1.method231();
                } else if (var3 == 7) {
                    this.field1063 = arg1.method231();
                    if (this.field1063 > 32767) {
                        this.field1063 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1064 = arg1.method231();
                    if (this.field1064 > 32767) {
                        this.field1064 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1065 = arg1.method231();
                } else if (var3 == 11) {
                    this.field1066 = true;
                } else if (var3 == 12) {
                    this.field1067 = arg1.method234();
                } else if (var3 == 16) {
                    this.field1068 = true;
                } else if (var3 == 23) {
                    this.field1071 = arg1.method231();
                    this.field1073 = arg1.method230();
                } else if (var3 == 24) {
                    this.field1072 = arg1.method231();
                } else if (var3 == 25) {
                    this.field1074 = arg1.method231();
                    this.field1076 = arg1.method230();
                } else if (var3 == 26) {
                    this.field1075 = arg1.method231();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1069 == null) {
                        this.field1069 = new String[5];
                    }
                    this.field1069[var3 - 30] = arg1.method236();
                    if (this.field1069[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1069[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1070 == null) {
                        this.field1070 = new String[5];
                    }
                    this.field1070[var3 - 35] = arg1.method236();
                } else if (var3 == 40) {
                    int var4 = arg1.method229();
                    this.field1057 = new int[var4];
                    this.field1058 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1057[var5] = arg1.method231();
                        this.field1058[var5] = arg1.method231();
                    }
                } else if (var3 == 78) {
                    this.field1077 = arg1.method231();
                } else if (var3 == 79) {
                    this.field1078 = arg1.method231();
                } else if (var3 == 90) {
                    this.field1079 = arg1.method231();
                } else if (var3 == 91) {
                    this.field1081 = arg1.method231();
                } else if (var3 == 92) {
                    this.field1080 = arg1.method231();
                } else if (var3 == 93) {
                    this.field1082 = arg1.method231();
                } else if (var3 == 95) {
                    this.field1062 = arg1.method231();
                } else if (var3 == 97) {
                    this.field1085 = arg1.method231();
                } else if (var3 == 98) {
                    this.field1086 = arg1.method231();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1083 == null) {
                        this.field1083 = new int[10];
                        this.field1084 = new int[10];
                    }
                    this.field1083[var3 - 100] = arg1.method231();
                    this.field1084[var3 - 100] = arg1.method231();
                } else if (var3 == 110) {
                    this.field1087 = arg1.method231();
                } else if (var3 == 111) {
                    this.field1088 = arg1.method231();
                } else if (var3 == 112) {
                    this.field1089 = arg1.method231();
                } else if (var3 == 113) {
                    this.field1090 = arg1.method230();
                } else if (var3 == 114) {
                    this.field1091 = arg1.method230() * 5;
                } else if (var3 == 115) {
                    this.field1092 = arg1.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)V")
    public void method351(int arg0) {
        ObjType var2 = method348(this.field1086);
        this.field1054 = var2.field1054;
        this.field1059 = var2.field1059;
        this.field1060 = var2.field1060;
        this.field1061 = var2.field1061;
        this.field1062 = var2.field1062;
        this.field1063 = var2.field1063;
        this.field1064 = var2.field1064;
        this.field1057 = var2.field1057;
        this.field1058 = var2.field1058;
        ObjType var3 = method348(this.field1085);
        this.field1055 = var3.field1055;
        this.field1068 = var3.field1068;
        this.field1067 = var3.field1067;
        if (arg0 <= 0) {
            return;
        }
        String var4 = "a";
        char var5 = var3.field1055.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1056 = ("Swap this note at any bank for " + var4 + " " + var3.field1055 + ".").getBytes();
        this.field1066 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1083 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1084[var3] && this.field1084[var3] != 0) {
                    var2 = this.field1083[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1093.method101((long) this.field1053);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126((byte) 4, this.field1054);
        if (var5 == null) {
            return null;
        }
        if (this.field1087 != 128 || this.field1088 != 128 || this.field1089 != 128) {
            var5.method142(this.field1089, true, this.field1087, this.field1088);
        }
        if (this.field1057 != null) {
            for (int var6 = 0; var6 < this.field1057.length; var6++) {
                var5.method140(this.field1057[var6], this.field1058[var6]);
            }
        }
        var5.method143(this.field1090 + 64, this.field1091 + 768, -50, -10, -50, true);
        var5.field579 = true;
        field1093.method102((long) this.field1053, -533, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Leb;")
    public final Model method353(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        if (this.field1083 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1084[var4] && this.field1084[var4] != 0) {
                    var3 = this.field1083[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(1, 0);
            }
        }
        Model var5 = Model.method126((byte) 4, this.field1054);
        if (var5 == null) {
            return null;
        }
        if (this.field1057 != null) {
            for (int var6 = 0; var6 < this.field1057.length; var6++) {
                var5.method140(this.field1057[var6], this.field1058[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZIII)Lib;")
    public static final Pix32 method354(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            Pix32 var4 = (Pix32) field1094.method101((long) arg1);
            if (var4 != null && var4.field676 != arg2 && var4.field676 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg1);
        if (var5.field1083 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg2 >= var5.field1084[var7] && var5.field1084[var7] != 0) {
                    var6 = var5.field1083[var7];
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
        if (var5.field1086 != -1) {
            var9 = method354(true, var5.field1085, 10, -1);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field644;
        int var12 = Pix3D.field645;
        int[] var13 = Pix3D.field650;
        int[] var14 = Pix2D.field627;
        int var15 = Pix2D.field628;
        int var16 = Pix2D.field629;
        int var17 = Pix2D.field632;
        int var18 = Pix2D.field633;
        if (!arg0) {
            field1043 = -174;
        }
        int var19 = Pix2D.field630;
        int var20 = Pix2D.field631;
        Pix3D.field642 = false;
        Pix2D.method152(32, 32, var10.field670, 97);
        Pix2D.method157(0, 32, 32, 0, 0, field1045);
        Pix3D.method165(29845);
        int var21 = var5.field1059;
        if (arg3 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg3 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field648[var5.field1060] * var21 >> 16;
        int var23 = Pix3D.field649[var5.field1060] * var21 >> 16;
        var8.method146(0, var5.field1061, var5.field1062, var5.field1060, var5.field1063, var8.field398 / 2 + var22 + var5.field1064, var5.field1064 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field670[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field670[var31 * 32 + var24 - 1] > 1) {
                        var10.field670[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field670[(var31 - 1) * 32 + var24] > 1) {
                        var10.field670[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field670[var31 * 32 + var24 + 1] > 1) {
                        var10.field670[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field670[(var31 + 1) * 32 + var24] > 1) {
                        var10.field670[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg3 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field670[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field670[var26 * 32 + var25 - 1] == 1) {
                            var10.field670[var26 * 32 + var25] = arg3;
                        } else if (var26 > 0 && var10.field670[(var26 - 1) * 32 + var25] == 1) {
                            var10.field670[var26 * 32 + var25] = arg3;
                        } else if (var25 < 31 && var10.field670[var26 * 32 + var25 + 1] == 1) {
                            var10.field670[var26 * 32 + var25] = arg3;
                        } else if (var26 < 31 && var10.field670[(var26 + 1) * 32 + var25] == 1) {
                            var10.field670[var26 * 32 + var25] = arg3;
                        }
                    }
                }
            }
        } else if (arg3 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field670[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field670[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field670[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1086 != -1) {
            int var29 = var9.field675;
            int var30 = var9.field676;
            var9.field675 = 32;
            var9.field676 = 32;
            var9.method186(0, 0, false);
            var9.field675 = var29;
            var9.field676 = var30;
        }
        if (arg3 == 0) {
            field1094.method102((long) arg1, -533, var10);
        }
        Pix2D.method152(var16, var15, var14, 97);
        Pix2D.method154(var20, var18, var17, -226, var19);
        Pix3D.field644 = var11;
        Pix3D.field645 = var12;
        Pix3D.field650 = var13;
        Pix3D.field642 = true;
        if (var5.field1066) {
            var10.field675 = 33;
        } else {
            var10.field675 = 32;
        }
        var10.field676 = arg2;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Z")
    public final boolean method355(int arg0, int arg1) {
        int var3 = this.field1071;
        int var4 = this.field1072;
        int var5 = this.field1077;
        if (arg1 == 1) {
            var3 = this.field1074;
            var4 = this.field1075;
            var5 = this.field1078;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (arg0 >= 0) {
            throw new NullPointerException();
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

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Leb;")
    public final Model method356(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1071;
        int var5 = this.field1072;
        int var6 = this.field1077;
        if (arg1 == 1) {
            var4 = this.field1074;
            var5 = this.field1075;
            var6 = this.field1078;
        }
        if (var4 == -1) {
            return null;
        }
        Model var7 = Model.method126((byte) 4, var4);
        if (var5 != -1) {
            if (var6 == -1) {
                Model var11 = Model.method126((byte) 4, var5);
                Model[] var12 = new Model[] { var7, var11 };
                var7 = new Model(var12, this.field1042, 2);
            } else {
                Model var8 = Model.method126((byte) 4, var5);
                Model var9 = Model.method126((byte) 4, var6);
                Model[] var10 = new Model[] { var7, var8, var9 };
                var7 = new Model(var10, this.field1042, 3);
            }
        }
        if (arg1 == 0 && this.field1073 != 0) {
            var7.method139(0, 0, false, this.field1073);
        }
        if (arg1 == 1 && this.field1076 != 0) {
            var7.method139(0, 0, false, this.field1076);
        }
        if (this.field1057 != null) {
            for (int var13 = 0; var13 < this.field1057.length; var13++) {
                var7.method140(this.field1057[var13], this.field1058[var13]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Z")
    public final boolean method357(boolean arg0, int arg1) {
        int var3 = this.field1079;
        int var4 = this.field1080;
        if (arg0) {
            this.field1044 = !this.field1044;
        }
        if (arg1 == 1) {
            var3 = this.field1081;
            var4 = this.field1082;
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IZ)Leb;")
    public final Model method358(int arg0, boolean arg1) {
        int var3 = this.field1079;
        int var4 = this.field1080;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 == 1) {
            var3 = this.field1081;
            var4 = this.field1082;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126((byte) 4, var3);
        if (var4 != -1) {
            Model var7 = Model.method126((byte) 4, var4);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(var8, this.field1042, 2);
        }
        if (this.field1057 != null) {
            for (int var9 = 0; var9 < this.field1057.length; var9++) {
                var6.method140(this.field1057[var9], this.field1058[var9]);
            }
        }
        return var6;
    }
}
