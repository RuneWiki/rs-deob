import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private int field1029 = -22323;

    @OriginalMember(owner = "hc", name = "c", descriptor = "B")
    private byte field1030 = 0;

    @OriginalMember(owner = "hc", name = "e", descriptor = "I")
    private int field1032 = 2913;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    public int field1039 = -1;

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private static int field1028 = 1000;

    @OriginalMember(owner = "hc", name = "k", descriptor = "Z")
    public static boolean field1038 = true;

    @OriginalMember(owner = "hc", name = "Z", descriptor = "Ls;")
    public static LruCache field1079 = new LruCache((byte) 113, 50);

    @OriginalMember(owner = "hc", name = "ab", descriptor = "Ls;")
    public static LruCache field1080 = new LruCache((byte) 113, 100);

    @OriginalMember(owner = "hc", name = "F", descriptor = "B")
    private byte field1059;

    @OriginalMember(owner = "hc", name = "I", descriptor = "B")
    private byte field1062;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    private static int field1031;

    @OriginalMember(owner = "hc", name = "f", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    private static int field1037;

    @OriginalMember(owner = "hc", name = "m", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "hc", name = "z", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "hc", name = "h", descriptor = "Llb;")
    private static Packet field1035;

    @OriginalMember(owner = "hc", name = "n", descriptor = "Ljava/lang/String;")
    public String field1041;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1052;

    @OriginalMember(owner = "hc", name = "A", descriptor = "Z")
    public boolean field1054;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[B")
    public byte[] field1042;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[I")
    private static int[] field1034;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1043;

    @OriginalMember(owner = "hc", name = "q", descriptor = "[I")
    private int[] field1044;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1069;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "[I")
    public int[] field1070;

    @OriginalMember(owner = "hc", name = "i", descriptor = "[Lhc;")
    private static ObjType[] field1036;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1055;

    @OriginalMember(owner = "hc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1056;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method346(Jagfile arg0) {
        field1035 = new Packet(field1028, arg0.method299("obj.dat", null));
        Packet var1 = new Packet(field1028, arg0.method299("obj.idx", null));
        field1033 = var1.method231();
        field1034 = new int[field1033];
        int var2 = 2;
        for (int var3 = 0; var3 < field1033; var3++) {
            field1034[var3] = var2;
            var2 += var1.method231();
        }
        field1036 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1036[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)V")
    public static final void method347(int arg0) {
        field1079 = null;
        field1080 = null;
        field1034 = null;
        if (arg0 < 3 || arg0 > 3) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1036 = null;
        field1035 = null;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1036[var1].field1039 == arg0) {
                return field1036[var1];
            }
        }
        field1037 = (field1037 + 1) % 10;
        ObjType var2 = field1036[field1037];
        field1035.field703 = field1034[arg0];
        var2.field1039 = arg0;
        var2.method349();
        var2.method350(8, field1035);
        if (var2.field1072 != -1) {
            var2.method351(794);
        }
        if (!field1038 && var2.field1054) {
            var2.field1041 = "Members Object";
            var2.field1042 = "Login to a members' server to use this object.".getBytes();
            var2.field1055 = null;
            var2.field1056 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1040 = 0;
        this.field1041 = null;
        this.field1042 = null;
        this.field1043 = null;
        this.field1044 = null;
        this.field1045 = 2000;
        this.field1046 = 0;
        this.field1047 = 0;
        this.field1048 = 0;
        this.field1049 = 0;
        this.field1050 = 0;
        this.field1051 = -1;
        this.field1052 = false;
        this.field1053 = 1;
        this.field1054 = false;
        this.field1055 = null;
        this.field1056 = null;
        this.field1057 = -1;
        this.field1058 = -1;
        this.field1059 = 0;
        this.field1060 = -1;
        this.field1061 = -1;
        this.field1062 = 0;
        this.field1063 = -1;
        this.field1064 = -1;
        this.field1065 = -1;
        this.field1066 = -1;
        this.field1067 = -1;
        this.field1068 = -1;
        this.field1069 = null;
        this.field1070 = null;
        this.field1071 = -1;
        this.field1072 = -1;
        this.field1073 = 128;
        this.field1074 = 128;
        this.field1075 = 128;
        this.field1076 = 0;
        this.field1077 = 0;
        this.field1078 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ILlb;)V")
    public final void method350(int arg0, Packet arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1040 = arg1.method231();
                } else if (var3 == 2) {
                    this.field1041 = arg1.method236();
                } else if (var3 == 3) {
                    this.field1042 = arg1.method237((byte) 31);
                } else if (var3 == 4) {
                    this.field1045 = arg1.method231();
                } else if (var3 == 5) {
                    this.field1046 = arg1.method231();
                } else if (var3 == 6) {
                    this.field1047 = arg1.method231();
                } else if (var3 == 7) {
                    this.field1049 = arg1.method231();
                    if (this.field1049 > 32767) {
                        this.field1049 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1050 = arg1.method231();
                    if (this.field1050 > 32767) {
                        this.field1050 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1051 = arg1.method231();
                } else if (var3 == 11) {
                    this.field1052 = true;
                } else if (var3 == 12) {
                    this.field1053 = arg1.method234();
                } else if (var3 == 16) {
                    this.field1054 = true;
                } else if (var3 == 23) {
                    this.field1057 = arg1.method231();
                    this.field1059 = arg1.method230();
                } else if (var3 == 24) {
                    this.field1058 = arg1.method231();
                } else if (var3 == 25) {
                    this.field1060 = arg1.method231();
                    this.field1062 = arg1.method230();
                } else if (var3 == 26) {
                    this.field1061 = arg1.method231();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1055 == null) {
                        this.field1055 = new String[5];
                    }
                    this.field1055[var3 - 30] = arg1.method236();
                    if (this.field1055[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1055[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1056 == null) {
                        this.field1056 = new String[5];
                    }
                    this.field1056[var3 - 35] = arg1.method236();
                } else if (var3 == 40) {
                    int var4 = arg1.method229();
                    this.field1043 = new int[var4];
                    this.field1044 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1043[var5] = arg1.method231();
                        this.field1044[var5] = arg1.method231();
                    }
                } else if (var3 == 78) {
                    this.field1063 = arg1.method231();
                } else if (var3 == 79) {
                    this.field1064 = arg1.method231();
                } else if (var3 == 90) {
                    this.field1065 = arg1.method231();
                } else if (var3 == 91) {
                    this.field1067 = arg1.method231();
                } else if (var3 == 92) {
                    this.field1066 = arg1.method231();
                } else if (var3 == 93) {
                    this.field1068 = arg1.method231();
                } else if (var3 == 95) {
                    this.field1048 = arg1.method231();
                } else if (var3 == 97) {
                    this.field1071 = arg1.method231();
                } else if (var3 == 98) {
                    this.field1072 = arg1.method231();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1069 == null) {
                        this.field1069 = new int[10];
                        this.field1070 = new int[10];
                    }
                    this.field1069[var3 - 100] = arg1.method231();
                    this.field1070[var3 - 100] = arg1.method231();
                } else if (var3 == 110) {
                    this.field1073 = arg1.method231();
                } else if (var3 == 111) {
                    this.field1074 = arg1.method231();
                } else if (var3 == 112) {
                    this.field1075 = arg1.method231();
                } else if (var3 == 113) {
                    this.field1076 = arg1.method230();
                } else if (var3 == 114) {
                    this.field1077 = arg1.method230() * 5;
                } else if (var3 == 115) {
                    this.field1078 = arg1.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)V")
    public void method351(int arg0) {
        ObjType var2 = method348(this.field1072);
        this.field1040 = var2.field1040;
        int var3 = 92 / arg0;
        this.field1045 = var2.field1045;
        this.field1046 = var2.field1046;
        this.field1047 = var2.field1047;
        this.field1048 = var2.field1048;
        this.field1049 = var2.field1049;
        this.field1050 = var2.field1050;
        this.field1043 = var2.field1043;
        this.field1044 = var2.field1044;
        ObjType var4 = method348(this.field1071);
        this.field1041 = var4.field1041;
        this.field1054 = var4.field1054;
        this.field1053 = var4.field1053;
        String var5 = "a";
        char var6 = var4.field1041.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var5 = "an";
        }
        this.field1042 = ("Swap this note at any bank for " + var5 + " " + var4.field1041 + ".").getBytes();
        this.field1052 = true;
    }

    @OriginalMember(owner = "hc", name = "d", descriptor = "(I)Leb;")
    public final Model method352(int arg0) {
        if (this.field1069 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1070[var3] && this.field1070[var3] != 0) {
                    var2 = this.field1069[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1079.method101((long) this.field1039);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method126(this.field1040, this.field1029);
        if (var5 == null) {
            return null;
        }
        if (this.field1073 != 128 || this.field1074 != 128 || this.field1075 != 128) {
            var5.method142((byte) 4, this.field1074, this.field1075, this.field1073);
        }
        if (this.field1043 != null) {
            for (int var6 = 0; var6 < this.field1043.length; var6++) {
                var5.method140(this.field1043[var6], this.field1044[var6]);
            }
        }
        var5.method143(this.field1076 + 64, this.field1077 + 768, -50, -10, -50, true);
        var5.field571 = true;
        field1079.method102((long) this.field1039, true, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Leb;")
    public final Model method353(int arg0, byte arg1) {
        if (this.field1069 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1070[var4] && this.field1070[var4] != 0) {
                    var3 = this.field1069[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(1, this.field1030);
            }
        }
        Model var5 = Model.method126(this.field1040, this.field1029);
        if (arg1 != 0) {
            this.field1029 = -283;
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1043 != null) {
            for (int var6 = 0; var6 < this.field1043.length; var6++) {
                var5.method140(this.field1043[var6], this.field1044[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Lib;")
    public static final Pix32 method354(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            Pix32 var4 = (Pix32) field1080.method101((long) arg1);
            if (var4 != null && var4.field668 != arg3 && var4.field668 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg1);
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5.field1069 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var7 = -1;
            for (int var8 = 0; var8 < 10; var8++) {
                if (arg3 >= var5.field1070[var8] && var5.field1070[var8] != 0) {
                    var7 = var5.field1069[var8];
                }
            }
            if (var7 != -1) {
                var5 = method348(var7);
            }
        }
        Model var9 = var5.method352(1);
        if (var9 == null) {
            return null;
        }
        Pix32 var10 = null;
        if (var5.field1072 != -1) {
            var10 = method354(field1031, var5.field1071, -1, 10);
            if (var10 == null) {
                return null;
            }
        }
        Pix32 var11 = new Pix32(32, 32);
        int var12 = Pix3D.field638;
        int var13 = Pix3D.field639;
        int[] var14 = Pix3D.field644;
        int[] var15 = Pix2D.field620;
        int var16 = Pix2D.field621;
        int var17 = Pix2D.field622;
        int var18 = Pix2D.field625;
        int var19 = Pix2D.field626;
        int var20 = Pix2D.field623;
        int var21 = Pix2D.field624;
        Pix3D.field636 = false;
        Pix2D.method152(32, 637, 32, var11.field662);
        Pix2D.method157(0, 32, 4, 0, 32, 0);
        Pix3D.method165(true);
        int var22 = var5.field1045;
        if (arg2 == -1) {
            var22 = (int) ((double) var22 * 1.5D);
        }
        if (arg2 > 0) {
            var22 = (int) ((double) var22 * 1.04D);
        }
        int var23 = Pix3D.field642[var5.field1046] * var22 >> 16;
        int var24 = Pix3D.field643[var5.field1046] * var22 >> 16;
        var9.method146(0, var5.field1047, var5.field1048, var5.field1046, var5.field1049, var9.field393 / 2 + var23 + var5.field1050, var5.field1050 + var24);
        for (int var25 = 31; var25 >= 0; var25--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var11.field662[var32 * 32 + var25] == 0) {
                    if (var25 > 0 && var11.field662[var32 * 32 + var25 - 1] > 1) {
                        var11.field662[var32 * 32 + var25] = 1;
                    } else if (var32 > 0 && var11.field662[(var32 - 1) * 32 + var25] > 1) {
                        var11.field662[var32 * 32 + var25] = 1;
                    } else if (var25 < 31 && var11.field662[var32 * 32 + var25 + 1] > 1) {
                        var11.field662[var32 * 32 + var25] = 1;
                    } else if (var32 < 31 && var11.field662[(var32 + 1) * 32 + var25] > 1) {
                        var11.field662[var32 * 32 + var25] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var26 = 31; var26 >= 0; var26--) {
                for (int var27 = 31; var27 >= 0; var27--) {
                    if (var11.field662[var27 * 32 + var26] == 0) {
                        if (var26 > 0 && var11.field662[var27 * 32 + var26 - 1] == 1) {
                            var11.field662[var27 * 32 + var26] = arg2;
                        } else if (var27 > 0 && var11.field662[(var27 - 1) * 32 + var26] == 1) {
                            var11.field662[var27 * 32 + var26] = arg2;
                        } else if (var26 < 31 && var11.field662[var27 * 32 + var26 + 1] == 1) {
                            var11.field662[var27 * 32 + var26] = arg2;
                        } else if (var27 < 31 && var11.field662[(var27 + 1) * 32 + var26] == 1) {
                            var11.field662[var27 * 32 + var26] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var28 = 31; var28 >= 0; var28--) {
                for (int var29 = 31; var29 >= 0; var29--) {
                    if (var11.field662[var29 * 32 + var28] == 0 && var28 > 0 && var29 > 0 && var11.field662[(var29 - 1) * 32 + var28 - 1] > 0) {
                        var11.field662[var29 * 32 + var28] = 3153952;
                    }
                }
            }
        }
        if (var5.field1072 != -1) {
            int var30 = var10.field667;
            int var31 = var10.field668;
            var10.field667 = 32;
            var10.field668 = 32;
            var10.method186(0, 0, false);
            var10.field667 = var30;
            var10.field668 = var31;
        }
        if (arg2 == 0) {
            field1080.method102((long) arg1, true, var11);
        }
        Pix2D.method152(var17, 637, var16, var15);
        Pix2D.method154(var20, var18, var19, 0, var21);
        Pix3D.field638 = var12;
        Pix3D.field639 = var13;
        Pix3D.field644 = var14;
        Pix3D.field636 = true;
        if (var5.field1052) {
            var11.field667 = 33;
        } else {
            var11.field667 = 32;
        }
        var11.field668 = arg3;
        return var11;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Z")
    public final boolean method355(int arg0, int arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var3 = this.field1057;
        int var4 = this.field1058;
        int var5 = this.field1063;
        if (arg1 == 1) {
            var3 = this.field1060;
            var4 = this.field1061;
            var5 = this.field1064;
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
        int var3 = this.field1057;
        int var4 = this.field1058;
        int var5 = this.field1063;
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1060;
            var4 = this.field1061;
            var5 = this.field1064;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method126(var3, this.field1029);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method126(var4, this.field1029);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, -550, var11);
            } else {
                Model var7 = Model.method126(var4, this.field1029);
                Model var8 = Model.method126(var5, this.field1029);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, -550, var9);
            }
        }
        if (arg0 == 0 && this.field1059 != 0) {
            var6.method139(this.field1059, 0, 0, 216);
        }
        if (arg0 == 1 && this.field1062 != 0) {
            var6.method139(this.field1062, 0, 0, 216);
        }
        if (this.field1043 != null) {
            for (int var12 = 0; var12 < this.field1043.length; var12++) {
                var6.method140(this.field1043[var12], this.field1044[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method357(int arg0, int arg1) {
        int var3 = this.field1065;
        int var4 = this.field1066;
        if (arg1 == 1) {
            var3 = this.field1067;
            var4 = this.field1068;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (arg0 != 16981) {
            throw new NullPointerException();
        }
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
        if (this.field1032 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1065;
        int var5 = this.field1066;
        if (arg1 == 1) {
            var4 = this.field1067;
            var5 = this.field1068;
        }
        if (var4 == -1) {
            return null;
        }
        Model var6 = Model.method126(var4, this.field1029);
        if (var5 != -1) {
            Model var7 = Model.method126(var5, this.field1029);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(2, -550, var8);
        }
        if (this.field1043 != null) {
            for (int var9 = 0; var9 < this.field1043.length; var9++) {
                var6.method140(this.field1043[var9], this.field1044[var9]);
            }
        }
        return var6;
    }
}
