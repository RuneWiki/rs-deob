import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private int field1037 = 6;

    @OriginalMember(owner = "hc", name = "c", descriptor = "Z")
    private boolean field1038 = false;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    public int field1045 = -1;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Z")
    public static boolean field1044 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1085 = new LruCache((byte) 8, 50);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1086 = new LruCache((byte) 8, 100);

    @OriginalMember(owner = "hc", name = "D", descriptor = "B")
    private byte field1065;

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1068;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "hc", name = "h", descriptor = "I")
    private static int field1043;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private int field1046;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "hc", name = "f", descriptor = "Llb;")
    private static Packet field1041;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1047;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1036;

    @OriginalMember(owner = "hc", name = "w", descriptor = "Z")
    public boolean field1058;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1060;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[B")
    public byte[] field1048;

    @OriginalMember(owner = "hc", name = "e", descriptor = "[I")
    private static int[] field1040;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[I")
    private int[] field1049;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1050;

    @OriginalMember(owner = "hc", name = "N", descriptor = "[I")
    public int[] field1075;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1076;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[Lhc;")
    private static ObjType[] field1042;

    @OriginalMember(owner = "hc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1061;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1062;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1041 = new Packet(arg0.method299("obj.dat", null), 58);
        Packet var1 = new Packet(arg0.method299("obj.idx", null), 58);
        field1039 = var1.method231();
        field1040 = new int[field1039];
        int var2 = 2;
        for (int var3 = 0; var3 < field1039; var3++) {
            field1040[var3] = var2;
            var2 += var1.method231();
        }
        field1042 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1042[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)V")
    public static final void method347(int arg0) {
        field1085 = null;
        field1086 = null;
        field1040 = null;
        field1042 = null;
        if (arg0 < 0 || arg0 > 0) {
            field1036 = !field1036;
        }
        field1041 = null;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1042[var1].field1045 == arg0) {
                return field1042[var1];
            }
        }
        field1043 = (field1043 + 1) % 10;
        ObjType var2 = field1042[field1043];
        field1041.field711 = field1040[arg0];
        var2.field1045 = arg0;
        var2.method349();
        var2.method350(field1041, 913);
        if (var2.field1078 != -1) {
            var2.method351(false);
        }
        if (!field1044 && var2.field1060) {
            var2.field1047 = "Members Object";
            var2.field1048 = "Login to a members' server to use this object.".getBytes();
            var2.field1061 = null;
            var2.field1062 = null;
            var2.field1084 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1046 = 0;
        this.field1047 = null;
        this.field1048 = null;
        this.field1049 = null;
        this.field1050 = null;
        this.field1051 = 2000;
        this.field1052 = 0;
        this.field1053 = 0;
        this.field1054 = 0;
        this.field1055 = 0;
        this.field1056 = 0;
        this.field1057 = -1;
        this.field1058 = false;
        this.field1059 = 1;
        this.field1060 = false;
        this.field1061 = null;
        this.field1062 = null;
        this.field1063 = -1;
        this.field1064 = -1;
        this.field1065 = 0;
        this.field1066 = -1;
        this.field1067 = -1;
        this.field1068 = 0;
        this.field1069 = -1;
        this.field1070 = -1;
        this.field1071 = -1;
        this.field1072 = -1;
        this.field1073 = -1;
        this.field1074 = -1;
        this.field1075 = null;
        this.field1076 = null;
        this.field1077 = -1;
        this.field1078 = -1;
        this.field1079 = 128;
        this.field1080 = 128;
        this.field1081 = 128;
        this.field1082 = 0;
        this.field1083 = 0;
        this.field1084 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Llb;I)V")
    public final void method350(Packet arg0, int arg1) {
        int var3 = 95 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1046 = arg0.method231();
                } else if (var4 == 2) {
                    this.field1047 = arg0.method236();
                } else if (var4 == 3) {
                    this.field1048 = arg0.method237(0);
                } else if (var4 == 4) {
                    this.field1051 = arg0.method231();
                } else if (var4 == 5) {
                    this.field1052 = arg0.method231();
                } else if (var4 == 6) {
                    this.field1053 = arg0.method231();
                } else if (var4 == 7) {
                    this.field1055 = arg0.method231();
                    if (this.field1055 > 32767) {
                        this.field1055 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1056 = arg0.method231();
                    if (this.field1056 > 32767) {
                        this.field1056 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1057 = arg0.method231();
                } else if (var4 == 11) {
                    this.field1058 = true;
                } else if (var4 == 12) {
                    this.field1059 = arg0.method234();
                } else if (var4 == 16) {
                    this.field1060 = true;
                } else if (var4 == 23) {
                    this.field1063 = arg0.method231();
                    this.field1065 = arg0.method230();
                } else if (var4 == 24) {
                    this.field1064 = arg0.method231();
                } else if (var4 == 25) {
                    this.field1066 = arg0.method231();
                    this.field1068 = arg0.method230();
                } else if (var4 == 26) {
                    this.field1067 = arg0.method231();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1061 == null) {
                        this.field1061 = new String[5];
                    }
                    this.field1061[var4 - 30] = arg0.method236();
                    if (this.field1061[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1061[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1062 == null) {
                        this.field1062 = new String[5];
                    }
                    this.field1062[var4 - 35] = arg0.method236();
                } else if (var4 == 40) {
                    int var5 = arg0.method229();
                    this.field1049 = new int[var5];
                    this.field1050 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1049[var6] = arg0.method231();
                        this.field1050[var6] = arg0.method231();
                    }
                } else if (var4 == 78) {
                    this.field1069 = arg0.method231();
                } else if (var4 == 79) {
                    this.field1070 = arg0.method231();
                } else if (var4 == 90) {
                    this.field1071 = arg0.method231();
                } else if (var4 == 91) {
                    this.field1073 = arg0.method231();
                } else if (var4 == 92) {
                    this.field1072 = arg0.method231();
                } else if (var4 == 93) {
                    this.field1074 = arg0.method231();
                } else if (var4 == 95) {
                    this.field1054 = arg0.method231();
                } else if (var4 == 97) {
                    this.field1077 = arg0.method231();
                } else if (var4 == 98) {
                    this.field1078 = arg0.method231();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1075 == null) {
                        this.field1075 = new int[10];
                        this.field1076 = new int[10];
                    }
                    this.field1075[var4 - 100] = arg0.method231();
                    this.field1076[var4 - 100] = arg0.method231();
                } else if (var4 == 110) {
                    this.field1079 = arg0.method231();
                } else if (var4 == 111) {
                    this.field1080 = arg0.method231();
                } else if (var4 == 112) {
                    this.field1081 = arg0.method231();
                } else if (var4 == 113) {
                    this.field1082 = arg0.method230();
                } else if (var4 == 114) {
                    this.field1083 = arg0.method230() * 5;
                } else if (var4 == 115) {
                    this.field1084 = arg0.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public void method351(boolean arg0) {
        ObjType var2 = method348(this.field1078);
        this.field1046 = var2.field1046;
        this.field1051 = var2.field1051;
        this.field1052 = var2.field1052;
        this.field1053 = var2.field1053;
        this.field1054 = var2.field1054;
        this.field1055 = var2.field1055;
        this.field1056 = var2.field1056;
        this.field1049 = var2.field1049;
        this.field1050 = var2.field1050;
        ObjType var3 = method348(this.field1077);
        if (arg0) {
            field1036 = !field1036;
        }
        this.field1047 = var3.field1047;
        this.field1060 = var3.field1060;
        this.field1059 = var3.field1059;
        String var4 = "a";
        char var5 = var3.field1047.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1048 = ("Swap this note at any bank for " + var4 + " " + var3.field1047 + ".").getBytes();
        this.field1058 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1075 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1076[var3] && this.field1076[var3] != 0) {
                    var2 = this.field1075[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1085.method101((long) this.field1045);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126(this.field1046, 1);
        if (var5 == null) {
            return null;
        }
        if (this.field1079 != 128 || this.field1080 != 128 || this.field1081 != 128) {
            var5.method142(this.field1081, this.field1079, this.field1080, 0);
        }
        if (this.field1049 != null) {
            for (int var6 = 0; var6 < this.field1049.length; var6++) {
                var5.method140(this.field1049[var6], this.field1050[var6]);
            }
        }
        var5.method143(this.field1082 + 64, this.field1083 + 768, -50, -10, -50, true);
        var5.field574 = true;
        field1085.method102((long) this.field1045, 0, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Leb;")
    public final Model method353(int arg0, byte arg1) {
        if (this.field1075 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1076[var4] && this.field1076[var4] != 0) {
                    var3 = this.field1075[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(1, (byte) 26);
            }
        }
        Model var5 = Model.method126(this.field1046, 1);
        if (arg1 != 26) {
            throw new NullPointerException();
        } else if (var5 == null) {
            return null;
        } else {
            if (this.field1049 != null) {
                for (int var6 = 0; var6 < this.field1049.length; var6++) {
                    var5.method140(this.field1049[var6], this.field1050[var6]);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIIZ)Lib;")
    public static final Pix32 method354(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 == 0) {
            Pix32 var4 = (Pix32) field1086.method101((long) arg0);
            if (var4 != null && var4.field668 != arg1 && var4.field668 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg0);
        if (var5.field1075 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field1076[var7] && var5.field1076[var7] != 0) {
                    var6 = var5.field1075[var7];
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
        if (var5.field1078 != -1) {
            var9 = method354(var5.field1077, 10, -1, true);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field639;
        int var12 = Pix3D.field640;
        int[] var13 = Pix3D.field645;
        int[] var14 = Pix2D.field619;
        int var15 = Pix2D.field620;
        int var16 = Pix2D.field621;
        int var17 = Pix2D.field624;
        int var18 = Pix2D.field625;
        int var19 = Pix2D.field622;
        int var20 = Pix2D.field623;
        Pix3D.field637 = false;
        Pix2D.method152(32, 501, 32, var10.field662);
        Pix2D.method157(0, 32, 0, false, 0, 32);
        Pix3D.method165((byte) -88);
        int var21 = var5.field1051;
        if (arg2 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg2 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field643[var5.field1052] * var21 >> 16;
        int var23 = Pix3D.field644[var5.field1052] * var21 >> 16;
        var8.method146(0, var5.field1053, var5.field1054, var5.field1052, var5.field1055, var8.field394 / 2 + var22 + var5.field1056, var5.field1056 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var10.field662[var32 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field662[var32 * 32 + var24 - 1] > 1) {
                        var10.field662[var32 * 32 + var24] = 1;
                    } else if (var32 > 0 && var10.field662[(var32 - 1) * 32 + var24] > 1) {
                        var10.field662[var32 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field662[var32 * 32 + var24 + 1] > 1) {
                        var10.field662[var32 * 32 + var24] = 1;
                    } else if (var32 < 31 && var10.field662[(var32 + 1) * 32 + var24] > 1) {
                        var10.field662[var32 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field662[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field662[var26 * 32 + var25 - 1] == 1) {
                            var10.field662[var26 * 32 + var25] = arg2;
                        } else if (var26 > 0 && var10.field662[(var26 - 1) * 32 + var25] == 1) {
                            var10.field662[var26 * 32 + var25] = arg2;
                        } else if (var25 < 31 && var10.field662[var26 * 32 + var25 + 1] == 1) {
                            var10.field662[var26 * 32 + var25] = arg2;
                        } else if (var26 < 31 && var10.field662[(var26 + 1) * 32 + var25] == 1) {
                            var10.field662[var26 * 32 + var25] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field662[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field662[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field662[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1078 != -1) {
            int var29 = var9.field667;
            int var30 = var9.field668;
            var9.field667 = 32;
            var9.field668 = 32;
            var9.method186(true, 0, 0);
            var9.field667 = var29;
            var9.field668 = var30;
        }
        if (arg2 == 0) {
            field1086.method102((long) arg0, 0, var10);
        }
        Pix2D.method152(var15, 501, var16, var14);
        Pix2D.method154(false, var19, var17, var20, var18);
        Pix3D.field639 = var11;
        Pix3D.field640 = var12;
        Pix3D.field645 = var13;
        Pix3D.field637 = true;
        if (!arg3) {
            for (int var31 = 1; var31 > 0; var31++) {
            }
        }
        if (var5.field1058) {
            var10.field667 = 33;
        } else {
            var10.field667 = 32;
        }
        var10.field668 = arg1;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Z")
    public final boolean method355(int arg0, int arg1) {
        int var3 = this.field1063;
        int var4 = this.field1064;
        int var5 = this.field1069;
        if (arg1 == 1) {
            var3 = this.field1066;
            var4 = this.field1067;
            var5 = this.field1070;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (arg0 != 3099) {
            field1036 = !field1036;
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

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Leb;")
    public final Model method356(int arg0, int arg1) {
        if (arg1 != -7087) {
            field1036 = !field1036;
        }
        int var3 = this.field1063;
        int var4 = this.field1064;
        int var5 = this.field1069;
        if (arg0 == 1) {
            var3 = this.field1066;
            var4 = this.field1067;
            var5 = this.field1070;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(var3, 1);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method126(var4, 1);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model((byte) 2, var11, 2);
            } else {
                Model var7 = Model.method126(var4, 1);
                Model var8 = Model.method126(var5, 1);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model((byte) 2, var9, 3);
            }
        }
        if (arg0 == 0 && this.field1065 != 0) {
            var6.method139(this.field1037, 0, this.field1065, 0);
        }
        if (arg0 == 1 && this.field1068 != 0) {
            var6.method139(this.field1037, 0, this.field1068, 0);
        }
        if (this.field1049 != null) {
            for (int var12 = 0; var12 < this.field1049.length; var12++) {
                var6.method140(this.field1049[var12], this.field1050[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method357(int arg0, int arg1) {
        if (arg0 < 6 || arg0 > 6) {
            this.field1038 = !this.field1038;
        }
        int var3 = this.field1071;
        int var4 = this.field1072;
        if (arg1 == 1) {
            var3 = this.field1073;
            var4 = this.field1074;
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

    @OriginalMember(owner = "hc", name = "d", descriptor = "(II)Leb;")
    public final Model method358(int arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1071;
        int var5 = this.field1072;
        if (arg0 == 1) {
            var4 = this.field1073;
            var5 = this.field1074;
        }
        if (var4 == -1) {
            return null;
        }
        Model var6 = Model.method126(var4, 1);
        if (var5 != -1) {
            Model var7 = Model.method126(var5, 1);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model((byte) 2, var8, 2);
        }
        if (this.field1049 != null) {
            for (int var9 = 0; var9 < this.field1049.length; var9++) {
                var6.method140(this.field1049[var9], this.field1050[var9]);
            }
        }
        return var6;
    }
}
