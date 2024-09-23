import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private boolean field1048 = true;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    public int field1056 = -1;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    private static int field1049 = 18835;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Z")
    public static boolean field1055 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1096 = new LruCache(-739, 50);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1097 = new LruCache(-739, 100);

    @OriginalMember(owner = "hc", name = "D", descriptor = "B")
    private byte field1076;

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1079;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "hc", name = "h", descriptor = "I")
    private static int field1054;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "hc", name = "f", descriptor = "Llb;")
    private static Packet field1052;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1058;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1047;

    @OriginalMember(owner = "hc", name = "w", descriptor = "Z")
    public boolean field1069;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1071;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[B")
    public byte[] field1059;

    @OriginalMember(owner = "hc", name = "e", descriptor = "[I")
    private static int[] field1051;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[I")
    private int[] field1060;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1061;

    @OriginalMember(owner = "hc", name = "N", descriptor = "[I")
    public int[] field1086;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[Lhc;")
    private static ObjType[] field1053;

    @OriginalMember(owner = "hc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1072;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1073;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1052 = new Packet(arg0.method299("obj.dat", null), -26728);
        Packet var1 = new Packet(arg0.method299("obj.idx", null), -26728);
        field1050 = var1.method231();
        field1051 = new int[field1050];
        int var2 = 2;
        for (int var3 = 0; var3 < field1050; var3++) {
            field1051[var3] = var2;
            var2 += var1.method231();
        }
        field1053 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1053[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)V")
    public static final void method347(int arg0) {
        if (arg0 != 0) {
            field1047 = !field1047;
        }
        field1096 = null;
        field1097 = null;
        field1051 = null;
        field1053 = null;
        field1052 = null;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1053[var1].field1056 == arg0) {
                return field1053[var1];
            }
        }
        field1054 = (field1054 + 1) % 10;
        ObjType var2 = field1053[field1054];
        field1052.field717 = field1051[arg0];
        var2.field1056 = arg0;
        var2.method349();
        var2.method350(field1052, 8);
        if (var2.field1089 != -1) {
            var2.method351(-653);
        }
        if (!field1055 && var2.field1071) {
            var2.field1058 = "Members Object";
            var2.field1059 = "Login to a members' server to use this object.".getBytes();
            var2.field1072 = null;
            var2.field1073 = null;
            var2.field1095 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1057 = 0;
        this.field1058 = null;
        this.field1059 = null;
        this.field1060 = null;
        this.field1061 = null;
        this.field1062 = 2000;
        this.field1063 = 0;
        this.field1064 = 0;
        this.field1065 = 0;
        this.field1066 = 0;
        this.field1067 = 0;
        this.field1068 = -1;
        this.field1069 = false;
        this.field1070 = 1;
        this.field1071 = false;
        this.field1072 = null;
        this.field1073 = null;
        this.field1074 = -1;
        this.field1075 = -1;
        this.field1076 = 0;
        this.field1077 = -1;
        this.field1078 = -1;
        this.field1079 = 0;
        this.field1080 = -1;
        this.field1081 = -1;
        this.field1082 = -1;
        this.field1083 = -1;
        this.field1084 = -1;
        this.field1085 = -1;
        this.field1086 = null;
        this.field1087 = null;
        this.field1088 = -1;
        this.field1089 = -1;
        this.field1090 = 128;
        this.field1091 = 128;
        this.field1092 = 128;
        this.field1093 = 0;
        this.field1094 = 0;
        this.field1095 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Llb;I)V")
    public final void method350(Packet arg0, int arg1) {
        if (arg1 != 8) {
            this.field1048 = !this.field1048;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1057 = arg0.method231();
                } else if (var3 == 2) {
                    this.field1058 = arg0.method236();
                } else if (var3 == 3) {
                    this.field1059 = arg0.method237((byte) 6);
                } else if (var3 == 4) {
                    this.field1062 = arg0.method231();
                } else if (var3 == 5) {
                    this.field1063 = arg0.method231();
                } else if (var3 == 6) {
                    this.field1064 = arg0.method231();
                } else if (var3 == 7) {
                    this.field1066 = arg0.method231();
                    if (this.field1066 > 32767) {
                        this.field1066 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1067 = arg0.method231();
                    if (this.field1067 > 32767) {
                        this.field1067 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1068 = arg0.method231();
                } else if (var3 == 11) {
                    this.field1069 = true;
                } else if (var3 == 12) {
                    this.field1070 = arg0.method234();
                } else if (var3 == 16) {
                    this.field1071 = true;
                } else if (var3 == 23) {
                    this.field1074 = arg0.method231();
                    this.field1076 = arg0.method230();
                } else if (var3 == 24) {
                    this.field1075 = arg0.method231();
                } else if (var3 == 25) {
                    this.field1077 = arg0.method231();
                    this.field1079 = arg0.method230();
                } else if (var3 == 26) {
                    this.field1078 = arg0.method231();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1072 == null) {
                        this.field1072 = new String[5];
                    }
                    this.field1072[var3 - 30] = arg0.method236();
                    if (this.field1072[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1072[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1073 == null) {
                        this.field1073 = new String[5];
                    }
                    this.field1073[var3 - 35] = arg0.method236();
                } else if (var3 == 40) {
                    int var4 = arg0.method229();
                    this.field1060 = new int[var4];
                    this.field1061 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1060[var5] = arg0.method231();
                        this.field1061[var5] = arg0.method231();
                    }
                } else if (var3 == 78) {
                    this.field1080 = arg0.method231();
                } else if (var3 == 79) {
                    this.field1081 = arg0.method231();
                } else if (var3 == 90) {
                    this.field1082 = arg0.method231();
                } else if (var3 == 91) {
                    this.field1084 = arg0.method231();
                } else if (var3 == 92) {
                    this.field1083 = arg0.method231();
                } else if (var3 == 93) {
                    this.field1085 = arg0.method231();
                } else if (var3 == 95) {
                    this.field1065 = arg0.method231();
                } else if (var3 == 97) {
                    this.field1088 = arg0.method231();
                } else if (var3 == 98) {
                    this.field1089 = arg0.method231();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1086 == null) {
                        this.field1086 = new int[10];
                        this.field1087 = new int[10];
                    }
                    this.field1086[var3 - 100] = arg0.method231();
                    this.field1087[var3 - 100] = arg0.method231();
                } else if (var3 == 110) {
                    this.field1090 = arg0.method231();
                } else if (var3 == 111) {
                    this.field1091 = arg0.method231();
                } else if (var3 == 112) {
                    this.field1092 = arg0.method231();
                } else if (var3 == 113) {
                    this.field1093 = arg0.method230();
                } else if (var3 == 114) {
                    this.field1094 = arg0.method230() * 5;
                } else if (var3 == 115) {
                    this.field1095 = arg0.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)V")
    public void method351(int arg0) {
        label30: while (true) {
            if (arg0 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label30;
                    }
                    var6++;
                }
            }
            ObjType var2 = method348(this.field1089);
            this.field1057 = var2.field1057;
            this.field1062 = var2.field1062;
            this.field1063 = var2.field1063;
            this.field1064 = var2.field1064;
            this.field1065 = var2.field1065;
            this.field1066 = var2.field1066;
            this.field1067 = var2.field1067;
            this.field1060 = var2.field1060;
            this.field1061 = var2.field1061;
            ObjType var3 = method348(this.field1088);
            this.field1058 = var3.field1058;
            this.field1071 = var3.field1071;
            this.field1070 = var3.field1070;
            String var4 = "a";
            char var5 = var3.field1058.charAt(0);
            if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
                var4 = "an";
            }
            this.field1059 = ("Swap this note at any bank for " + var4 + " " + var3.field1058 + ".").getBytes();
            this.field1069 = true;
            return;
        }
    }

    @OriginalMember(owner = "hc", name = "d", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1086 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1087[var3] && this.field1087[var3] != 0) {
                    var2 = this.field1086[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1096.method101((long) this.field1056);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126(true, this.field1057);
        if (var5 == null) {
            return null;
        }
        if (this.field1090 != 128 || this.field1091 != 128 || this.field1092 != 128) {
            var5.method142(this.field1090, this.field1092, -34245, this.field1091);
        }
        if (this.field1060 != null) {
            for (int var6 = 0; var6 < this.field1060.length; var6++) {
                var5.method140(this.field1060[var6], this.field1061[var6]);
            }
        }
        var5.method143(this.field1093 + 64, this.field1094 + 768, -50, -10, -50, true);
        var5.field573 = true;
        field1096.method102((long) this.field1056, var5, 10514);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Leb;")
    public final Model method353(int arg0, byte arg1) {
        if (arg1 == 2) {
            boolean var3 = false;
        } else {
            field1047 = !field1047;
        }
        if (this.field1086 != null && arg0 > 1) {
            int var4 = -1;
            for (int var5 = 0; var5 < 10; var5++) {
                if (arg0 >= this.field1087[var5] && this.field1087[var5] != 0) {
                    var4 = this.field1086[var5];
                }
            }
            if (var4 != -1) {
                return method348(var4).method353(1, (byte) 2);
            }
        }
        Model var6 = Model.method126(true, this.field1057);
        if (var6 == null) {
            return null;
        }
        if (this.field1060 != null) {
            for (int var7 = 0; var7 < this.field1060.length; var7++) {
                var6.method140(this.field1060[var7], this.field1061[var7]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Lib;")
    public static final Pix32 method354(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            Pix32 var4 = (Pix32) field1097.method101((long) arg3);
            if (var4 != null && var4.field673 != arg0 && var4.field673 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg3);
        if (arg1 != 18835) {
            throw new NullPointerException();
        }
        if (var5.field1086 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg0 >= var5.field1087[var7] && var5.field1087[var7] != 0) {
                    var6 = var5.field1086[var7];
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
        if (var5.field1089 != -1) {
            var9 = method354(10, field1049, -1, var5.field1088);
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
        Pix2D.method152(var10.field667, 32, 32, 234);
        Pix2D.method157(0, 32, 0, false, 32, 0);
        Pix3D.method165(3);
        int var21 = var5.field1062;
        if (arg2 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg2 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field643[var5.field1063] * var21 >> 16;
        int var23 = Pix3D.field644[var5.field1063] * var21 >> 16;
        var8.method146(0, var5.field1064, var5.field1065, var5.field1063, var5.field1066, var8.field394 / 2 + var22 + var5.field1067, var5.field1067 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field667[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field667[var31 * 32 + var24 - 1] > 1) {
                        var10.field667[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field667[(var31 - 1) * 32 + var24] > 1) {
                        var10.field667[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field667[var31 * 32 + var24 + 1] > 1) {
                        var10.field667[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field667[(var31 + 1) * 32 + var24] > 1) {
                        var10.field667[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field667[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field667[var26 * 32 + var25 - 1] == 1) {
                            var10.field667[var26 * 32 + var25] = arg2;
                        } else if (var26 > 0 && var10.field667[(var26 - 1) * 32 + var25] == 1) {
                            var10.field667[var26 * 32 + var25] = arg2;
                        } else if (var25 < 31 && var10.field667[var26 * 32 + var25 + 1] == 1) {
                            var10.field667[var26 * 32 + var25] = arg2;
                        } else if (var26 < 31 && var10.field667[(var26 + 1) * 32 + var25] == 1) {
                            var10.field667[var26 * 32 + var25] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field667[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field667[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field667[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1089 != -1) {
            int var29 = var9.field672;
            int var30 = var9.field673;
            var9.field672 = 32;
            var9.field673 = 32;
            var9.method186(0, 0, 37651);
            var9.field672 = var29;
            var9.field673 = var30;
        }
        if (arg2 == 0) {
            field1097.method102((long) arg3, var10, 10514);
        }
        Pix2D.method152(var14, var16, var15, 234);
        Pix2D.method154(var17, var18, var19, (byte) 2, var20);
        Pix3D.field639 = var11;
        Pix3D.field640 = var12;
        Pix3D.field645 = var13;
        Pix3D.field637 = true;
        if (var5.field1069) {
            var10.field672 = 33;
        } else {
            var10.field672 = 32;
        }
        var10.field673 = arg0;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(IB)Z")
    public final boolean method355(int arg0, byte arg1) {
        if (arg1 != -59) {
            throw new NullPointerException();
        }
        int var3 = this.field1074;
        int var4 = this.field1075;
        int var5 = this.field1080;
        if (arg0 == 1) {
            var3 = this.field1077;
            var4 = this.field1078;
            var5 = this.field1081;
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Leb;")
    public final Model method356(boolean arg0, int arg1) {
        if (arg0) {
            field1047 = !field1047;
        }
        int var3 = this.field1074;
        int var4 = this.field1075;
        int var5 = this.field1080;
        if (arg1 == 1) {
            var3 = this.field1077;
            var4 = this.field1078;
            var5 = this.field1081;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(true, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method126(true, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, -314, var11);
            } else {
                Model var7 = Model.method126(true, var4);
                Model var8 = Model.method126(true, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, -314, var9);
            }
        }
        if (arg1 == 0 && this.field1076 != 0) {
            var6.method139(this.field1076, false, 0, 0);
        }
        if (arg1 == 1 && this.field1079 != 0) {
            var6.method139(this.field1079, false, 0, 0);
        }
        if (this.field1060 != null) {
            for (int var12 = 0; var12 < this.field1060.length; var12++) {
                var6.method140(this.field1060[var12], this.field1061[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BI)Z")
    public final boolean method357(byte arg0, int arg1) {
        int var3 = this.field1082;
        int var4 = this.field1083;
        if (arg1 == 1) {
            var3 = this.field1084;
            var4 = this.field1085;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (arg0 != -50) {
            this.field1048 = !this.field1048;
        }
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
        int var3 = this.field1082;
        int var4 = this.field1083;
        if (arg0 == 1) {
            var3 = this.field1084;
            var4 = this.field1085;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method126(true, var3);
        if (arg1) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            Model var6 = Model.method126(true, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, -314, var7);
        }
        if (this.field1060 != null) {
            for (int var8 = 0; var8 < this.field1060.length; var8++) {
                var5.method140(this.field1060[var8], this.field1061[var8]);
            }
        }
        return var5;
    }
}
