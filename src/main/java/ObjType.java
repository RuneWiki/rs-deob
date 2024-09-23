import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private int field1042 = 20416;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    public int field1050 = -1;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1041 = true;

    @OriginalMember(owner = "hc", name = "c", descriptor = "B")
    private static byte field1043 = 9;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Z")
    public static boolean field1049 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1090 = new LruCache(50, (byte) 1);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1091 = new LruCache(100, (byte) 1);

    @OriginalMember(owner = "hc", name = "D", descriptor = "B")
    private byte field1070;

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1073;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "hc", name = "h", descriptor = "I")
    private static int field1048;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "hc", name = "f", descriptor = "Llb;")
    private static Packet field1046;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1052;

    @OriginalMember(owner = "hc", name = "w", descriptor = "Z")
    public boolean field1063;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1065;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[B")
    public byte[] field1053;

    @OriginalMember(owner = "hc", name = "e", descriptor = "[I")
    private static int[] field1045;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[I")
    private int[] field1054;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1055;

    @OriginalMember(owner = "hc", name = "N", descriptor = "[I")
    public int[] field1080;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1081;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[Lhc;")
    private static ObjType[] field1047;

    @OriginalMember(owner = "hc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1066;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1067;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1046 = new Packet(arg0.method299("obj.dat", null), (byte) -93);
        Packet var1 = new Packet(arg0.method299("obj.idx", null), (byte) -93);
        field1044 = var1.method231();
        field1045 = new int[field1044];
        int var2 = 2;
        for (int var3 = 0; var3 < field1044; var3++) {
            field1045[var3] = var2;
            var2 += var1.method231();
        }
        field1047 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1047[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public static final void method347(boolean arg0) {
        field1090 = null;
        if (!arg0) {
            field1091 = null;
            field1045 = null;
            field1047 = null;
            field1046 = null;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1047[var1].field1050 == arg0) {
                return field1047[var1];
            }
        }
        field1048 = (field1048 + 1) % 10;
        ObjType var2 = field1047[field1048];
        field1046.field713 = field1045[arg0];
        var2.field1050 = arg0;
        var2.method349();
        var2.method350(210, field1046);
        if (var2.field1083 != -1) {
            var2.method351(231);
        }
        if (!field1049 && var2.field1065) {
            var2.field1052 = "Members Object";
            var2.field1053 = "Login to a members' server to use this object.".getBytes();
            var2.field1066 = null;
            var2.field1067 = null;
            var2.field1089 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1051 = 0;
        this.field1052 = null;
        this.field1053 = null;
        this.field1054 = null;
        this.field1055 = null;
        this.field1056 = 2000;
        this.field1057 = 0;
        this.field1058 = 0;
        this.field1059 = 0;
        this.field1060 = 0;
        this.field1061 = 0;
        this.field1062 = -1;
        this.field1063 = false;
        this.field1064 = 1;
        this.field1065 = false;
        this.field1066 = null;
        this.field1067 = null;
        this.field1068 = -1;
        this.field1069 = -1;
        this.field1070 = 0;
        this.field1071 = -1;
        this.field1072 = -1;
        this.field1073 = 0;
        this.field1074 = -1;
        this.field1075 = -1;
        this.field1076 = -1;
        this.field1077 = -1;
        this.field1078 = -1;
        this.field1079 = -1;
        this.field1080 = null;
        this.field1081 = null;
        this.field1082 = -1;
        this.field1083 = -1;
        this.field1084 = 128;
        this.field1085 = 128;
        this.field1086 = 128;
        this.field1087 = 0;
        this.field1088 = 0;
        this.field1089 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ILlb;)V")
    public final void method350(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1051 = arg1.method231();
                } else if (var3 == 2) {
                    this.field1052 = arg1.method236();
                } else if (var3 == 3) {
                    this.field1053 = arg1.method237((byte) -14);
                } else if (var3 == 4) {
                    this.field1056 = arg1.method231();
                } else if (var3 == 5) {
                    this.field1057 = arg1.method231();
                } else if (var3 == 6) {
                    this.field1058 = arg1.method231();
                } else if (var3 == 7) {
                    this.field1060 = arg1.method231();
                    if (this.field1060 > 32767) {
                        this.field1060 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1061 = arg1.method231();
                    if (this.field1061 > 32767) {
                        this.field1061 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1062 = arg1.method231();
                } else if (var3 == 11) {
                    this.field1063 = true;
                } else if (var3 == 12) {
                    this.field1064 = arg1.method234();
                } else if (var3 == 16) {
                    this.field1065 = true;
                } else if (var3 == 23) {
                    this.field1068 = arg1.method231();
                    this.field1070 = arg1.method230();
                } else if (var3 == 24) {
                    this.field1069 = arg1.method231();
                } else if (var3 == 25) {
                    this.field1071 = arg1.method231();
                    this.field1073 = arg1.method230();
                } else if (var3 == 26) {
                    this.field1072 = arg1.method231();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1066 == null) {
                        this.field1066 = new String[5];
                    }
                    this.field1066[var3 - 30] = arg1.method236();
                    if (this.field1066[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1066[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1067 == null) {
                        this.field1067 = new String[5];
                    }
                    this.field1067[var3 - 35] = arg1.method236();
                } else if (var3 == 40) {
                    int var4 = arg1.method229();
                    this.field1054 = new int[var4];
                    this.field1055 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1054[var5] = arg1.method231();
                        this.field1055[var5] = arg1.method231();
                    }
                } else if (var3 == 78) {
                    this.field1074 = arg1.method231();
                } else if (var3 == 79) {
                    this.field1075 = arg1.method231();
                } else if (var3 == 90) {
                    this.field1076 = arg1.method231();
                } else if (var3 == 91) {
                    this.field1078 = arg1.method231();
                } else if (var3 == 92) {
                    this.field1077 = arg1.method231();
                } else if (var3 == 93) {
                    this.field1079 = arg1.method231();
                } else if (var3 == 95) {
                    this.field1059 = arg1.method231();
                } else if (var3 == 97) {
                    this.field1082 = arg1.method231();
                } else if (var3 == 98) {
                    this.field1083 = arg1.method231();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1080 == null) {
                        this.field1080 = new int[10];
                        this.field1081 = new int[10];
                    }
                    this.field1080[var3 - 100] = arg1.method231();
                    this.field1081[var3 - 100] = arg1.method231();
                } else if (var3 == 110) {
                    this.field1084 = arg1.method231();
                } else if (var3 == 111) {
                    this.field1085 = arg1.method231();
                } else if (var3 == 112) {
                    this.field1086 = arg1.method231();
                } else if (var3 == 113) {
                    this.field1087 = arg1.method230();
                } else if (var3 == 114) {
                    this.field1088 = arg1.method230() * 5;
                } else if (var3 == 115) {
                    this.field1089 = arg1.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)V")
    public void method351(int arg0) {
        ObjType var2 = method348(this.field1083);
        this.field1051 = var2.field1051;
        this.field1056 = var2.field1056;
        this.field1057 = var2.field1057;
        if (arg0 <= 0) {
            return;
        }
        this.field1058 = var2.field1058;
        this.field1059 = var2.field1059;
        this.field1060 = var2.field1060;
        this.field1061 = var2.field1061;
        this.field1054 = var2.field1054;
        this.field1055 = var2.field1055;
        ObjType var3 = method348(this.field1082);
        this.field1052 = var3.field1052;
        this.field1065 = var3.field1065;
        this.field1064 = var3.field1064;
        String var4 = "a";
        char var5 = var3.field1052.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1053 = ("Swap this note at any bank for " + var4 + " " + var3.field1052 + ".").getBytes();
        this.field1063 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1080 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1081[var3] && this.field1081[var3] != 0) {
                    var2 = this.field1080[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1090.method101((long) this.field1050);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126((byte) -14, this.field1051);
        if (var5 == null) {
            return null;
        }
        if (this.field1084 != 128 || this.field1085 != 128 || this.field1086 != 128) {
            var5.method142(this.field1086, this.field1085, this.field1084, (byte) -119);
        }
        if (this.field1054 != null) {
            for (int var6 = 0; var6 < this.field1054.length; var6++) {
                var5.method140(this.field1054[var6], this.field1055[var6]);
            }
        }
        var5.method143(this.field1087 + 64, this.field1088 + 768, -50, -10, -50, true);
        var5.field570 = true;
        field1090.method102(var5, 0, (long) this.field1050);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Leb;")
    public final Model method353(int arg0, int arg1) {
        if (arg0 != 3) {
            this.field1042 = -483;
        }
        if (this.field1080 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1081[var4] && this.field1081[var4] != 0) {
                    var3 = this.field1080[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(3, 1);
            }
        }
        Model var5 = Model.method126((byte) -14, this.field1051);
        if (var5 == null) {
            return null;
        }
        if (this.field1054 != null) {
            for (int var6 = 0; var6 < this.field1054.length; var6++) {
                var5.method140(this.field1054[var6], this.field1055[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BIII)Lib;")
    public static final Pix32 method354(byte arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            Pix32 var4 = (Pix32) field1091.method101((long) arg2);
            if (var4 != null && var4.field674 != arg3 && var4.field674 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg2);
        if (var5.field1080 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field1081[var7] && var5.field1081[var7] != 0) {
                    var6 = var5.field1080[var7];
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
        if (var5.field1083 != -1) {
            var9 = method354((byte) 9, -1, var5.field1082, 10);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field639;
        int var12 = Pix3D.field640;
        int[] var13 = Pix3D.field645;
        int[] var14 = Pix2D.field621;
        int var15 = Pix2D.field622;
        int var16 = Pix2D.field623;
        int var17 = Pix2D.field626;
        int var18 = Pix2D.field627;
        int var19 = Pix2D.field624;
        int var20 = Pix2D.field625;
        Pix3D.field637 = false;
        Pix2D.method152(32, 32, (byte) 7, var10.field668);
        Pix2D.method157(0, 32, 0, 32, (byte) 5, 0);
        Pix3D.method165((byte) 9);
        int var21 = var5.field1056;
        if (arg1 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg1 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field643[var5.field1057] * var21 >> 16;
        int var23 = Pix3D.field644[var5.field1057] * var21 >> 16;
        if (field1043 == arg0) {
            boolean var24 = false;
        } else {
            field1041 = !field1041;
        }
        var8.method146(0, var5.field1058, var5.field1059, var5.field1057, var5.field1060, var8.field390 / 2 + var22 + var5.field1061, var5.field1061 + var23);
        for (int var25 = 31; var25 >= 0; var25--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var10.field668[var32 * 32 + var25] == 0) {
                    if (var25 > 0 && var10.field668[var32 * 32 + var25 - 1] > 1) {
                        var10.field668[var32 * 32 + var25] = 1;
                    } else if (var32 > 0 && var10.field668[(var32 - 1) * 32 + var25] > 1) {
                        var10.field668[var32 * 32 + var25] = 1;
                    } else if (var25 < 31 && var10.field668[var32 * 32 + var25 + 1] > 1) {
                        var10.field668[var32 * 32 + var25] = 1;
                    } else if (var32 < 31 && var10.field668[(var32 + 1) * 32 + var25] > 1) {
                        var10.field668[var32 * 32 + var25] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var26 = 31; var26 >= 0; var26--) {
                for (int var27 = 31; var27 >= 0; var27--) {
                    if (var10.field668[var27 * 32 + var26] == 0) {
                        if (var26 > 0 && var10.field668[var27 * 32 + var26 - 1] == 1) {
                            var10.field668[var27 * 32 + var26] = arg1;
                        } else if (var27 > 0 && var10.field668[(var27 - 1) * 32 + var26] == 1) {
                            var10.field668[var27 * 32 + var26] = arg1;
                        } else if (var26 < 31 && var10.field668[var27 * 32 + var26 + 1] == 1) {
                            var10.field668[var27 * 32 + var26] = arg1;
                        } else if (var27 < 31 && var10.field668[(var27 + 1) * 32 + var26] == 1) {
                            var10.field668[var27 * 32 + var26] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var28 = 31; var28 >= 0; var28--) {
                for (int var29 = 31; var29 >= 0; var29--) {
                    if (var10.field668[var29 * 32 + var28] == 0 && var28 > 0 && var29 > 0 && var10.field668[(var29 - 1) * 32 + var28 - 1] > 0) {
                        var10.field668[var29 * 32 + var28] = 3153952;
                    }
                }
            }
        }
        if (var5.field1083 != -1) {
            int var30 = var9.field673;
            int var31 = var9.field674;
            var9.field673 = 32;
            var9.field674 = 32;
            var9.method186(0, 0, 0);
            var9.field673 = var30;
            var9.field674 = var31;
        }
        if (arg1 == 0) {
            field1091.method102(var10, 0, (long) arg2);
        }
        Pix2D.method152(var15, var16, (byte) 7, var14);
        Pix2D.method154(var17, var19, var18, false, var20);
        Pix3D.field639 = var11;
        Pix3D.field640 = var12;
        Pix3D.field645 = var13;
        Pix3D.field637 = true;
        if (var5.field1063) {
            var10.field673 = 33;
        } else {
            var10.field673 = 32;
        }
        var10.field674 = arg3;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IZ)Z")
    public final boolean method355(int arg0, boolean arg1) {
        int var3 = this.field1068;
        int var4 = this.field1069;
        int var5 = this.field1074;
        if (arg0 == 1) {
            var3 = this.field1071;
            var4 = this.field1072;
            var5 = this.field1075;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (arg1) {
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Leb;")
    public final Model method356(int arg0, byte arg1) {
        int var3 = this.field1068;
        int var4 = this.field1069;
        int var5 = this.field1074;
        if (arg1 != 7) {
            this.field1042 = 392;
        }
        if (arg0 == 1) {
            var3 = this.field1071;
            var4 = this.field1072;
            var5 = this.field1075;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126((byte) -14, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method126((byte) -14, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(var11, 2, false);
            } else {
                Model var7 = Model.method126((byte) -14, var4);
                Model var8 = Model.method126((byte) -14, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(var9, 3, false);
            }
        }
        if (arg0 == 0 && this.field1070 != 0) {
            var6.method139(-9236, 0, this.field1070, 0);
        }
        if (arg0 == 1 && this.field1073 != 0) {
            var6.method139(-9236, 0, this.field1073, 0);
        }
        if (this.field1054 != null) {
            for (int var12 = 0; var12 < this.field1054.length; var12++) {
                var6.method140(this.field1054[var12], this.field1055[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(IZ)Z")
    public final boolean method357(int arg0, boolean arg1) {
        int var3 = this.field1076;
        int var4 = this.field1077;
        if (arg1) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1078;
            var4 = this.field1079;
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BI)Leb;")
    public final Model method358(byte arg0, int arg1) {
        int var3 = this.field1076;
        int var4 = this.field1077;
        if (arg1 == 1) {
            var3 = this.field1078;
            var4 = this.field1079;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method126((byte) -14, var3);
        if (arg0 != 121) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            Model var6 = Model.method126((byte) -14, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(var7, 2, false);
        }
        if (this.field1054 != null) {
            for (int var8 = 0; var8 < this.field1054.length; var8++) {
                var5.method140(this.field1054[var8], this.field1055[var8]);
            }
        }
        return var5;
    }
}
