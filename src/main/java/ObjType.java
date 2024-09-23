import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class ObjType {

    @OriginalMember(owner = "ic", name = "c", descriptor = "I")
    private int field1036 = 5;

    @OriginalMember(owner = "ic", name = "j", descriptor = "I")
    public int field1043 = -1;

    @OriginalMember(owner = "ic", name = "a", descriptor = "I")
    private static int field1034 = -24;

    @OriginalMember(owner = "ic", name = "b", descriptor = "Z")
    private static boolean field1035 = true;

    @OriginalMember(owner = "ic", name = "i", descriptor = "Z")
    public static boolean field1042 = true;

    @OriginalMember(owner = "ic", name = "W", descriptor = "Ls;")
    public static LruCache field1082 = new LruCache(50, false);

    @OriginalMember(owner = "ic", name = "X", descriptor = "Ls;")
    public static LruCache field1083 = new LruCache(100, false);

    @OriginalMember(owner = "ic", name = "D", descriptor = "B")
    private byte field1063;

    @OriginalMember(owner = "ic", name = "G", descriptor = "B")
    private byte field1066;

    @OriginalMember(owner = "ic", name = "d", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "ic", name = "h", descriptor = "I")
    private static int field1041;

    @OriginalMember(owner = "ic", name = "k", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "ic", name = "p", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "ic", name = "q", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "ic", name = "r", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "ic", name = "s", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "ic", name = "t", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "ic", name = "u", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "ic", name = "v", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "ic", name = "x", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "ic", name = "B", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "ic", name = "C", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "ic", name = "E", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "ic", name = "F", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "ic", name = "H", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "ic", name = "I", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "ic", name = "J", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "ic", name = "K", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "ic", name = "L", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "ic", name = "M", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "ic", name = "P", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "ic", name = "Q", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "ic", name = "R", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "ic", name = "S", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "ic", name = "T", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "ic", name = "U", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "ic", name = "V", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "ic", name = "f", descriptor = "Lmb;")
    private static Packet field1039;

    @OriginalMember(owner = "ic", name = "l", descriptor = "Ljava/lang/String;")
    public String field1045;

    @OriginalMember(owner = "ic", name = "w", descriptor = "Z")
    public boolean field1056;

    @OriginalMember(owner = "ic", name = "y", descriptor = "Z")
    public boolean field1058;

    @OriginalMember(owner = "ic", name = "m", descriptor = "[B")
    public byte[] field1046;

    @OriginalMember(owner = "ic", name = "e", descriptor = "[I")
    private static int[] field1038;

    @OriginalMember(owner = "ic", name = "n", descriptor = "[I")
    private int[] field1047;

    @OriginalMember(owner = "ic", name = "o", descriptor = "[I")
    private int[] field1048;

    @OriginalMember(owner = "ic", name = "N", descriptor = "[I")
    public int[] field1073;

    @OriginalMember(owner = "ic", name = "O", descriptor = "[I")
    public int[] field1074;

    @OriginalMember(owner = "ic", name = "g", descriptor = "[Lic;")
    private static ObjType[] field1040;

    @OriginalMember(owner = "ic", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1059;

    @OriginalMember(owner = "ic", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1060;

    @OriginalMember(owner = "ic", name = "a", descriptor = "(Lyb;)V")
    public static final void method343(Jagfile arg0) {
        field1039 = new Packet(arg0.method298("obj.dat", null), true);
        Packet var1 = new Packet(arg0.method298("obj.idx", null), true);
        field1037 = var1.method230();
        field1038 = new int[field1037];
        int var2 = 2;
        for (int var3 = 0; var3 < field1037; var3++) {
            field1038[var3] = var2;
            var2 += var1.method230();
        }
        field1040 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1040[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(I)V")
    public static final void method344(int arg0) {
        field1082 = null;
        field1083 = null;
        if (arg0 != 0) {
            field1035 = !field1035;
        }
        field1038 = null;
        field1040 = null;
        field1039 = null;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(I)Lic;")
    public static final ObjType method345(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1040[var1].field1043 == arg0) {
                return field1040[var1];
            }
        }
        field1041 = (field1041 + 1) % 10;
        ObjType var2 = field1040[field1041];
        field1039.field714 = field1038[arg0];
        var2.field1043 = arg0;
        var2.method346();
        var2.method347((byte) 44, field1039);
        if (var2.field1076 != -1) {
            var2.method348(6);
        }
        if (!field1042 && var2.field1058) {
            var2.field1045 = "Members Object";
            var2.field1046 = "Login to a members' server to use this object.".getBytes();
            var2.field1059 = null;
            var2.field1060 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "()V")
    public final void method346() {
        this.field1044 = 0;
        this.field1045 = null;
        this.field1046 = null;
        this.field1047 = null;
        this.field1048 = null;
        this.field1049 = 2000;
        this.field1050 = 0;
        this.field1051 = 0;
        this.field1052 = 0;
        this.field1053 = 0;
        this.field1054 = 0;
        this.field1055 = -1;
        this.field1056 = false;
        this.field1057 = 1;
        this.field1058 = false;
        this.field1059 = null;
        this.field1060 = null;
        this.field1061 = -1;
        this.field1062 = -1;
        this.field1063 = 0;
        this.field1064 = -1;
        this.field1065 = -1;
        this.field1066 = 0;
        this.field1067 = -1;
        this.field1068 = -1;
        this.field1069 = -1;
        this.field1070 = -1;
        this.field1071 = -1;
        this.field1072 = -1;
        this.field1073 = null;
        this.field1074 = null;
        this.field1075 = -1;
        this.field1076 = -1;
        this.field1077 = 128;
        this.field1078 = 128;
        this.field1079 = 128;
        this.field1080 = 0;
        this.field1081 = 0;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(BLmb;)V")
    public final void method347(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method228();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1044 = arg1.method230();
                } else if (var4 == 2) {
                    this.field1045 = arg1.method235();
                } else if (var4 == 3) {
                    this.field1046 = arg1.method236(4);
                } else if (var4 == 4) {
                    this.field1049 = arg1.method230();
                } else if (var4 == 5) {
                    this.field1050 = arg1.method230();
                } else if (var4 == 6) {
                    this.field1051 = arg1.method230();
                } else if (var4 == 7) {
                    this.field1053 = arg1.method230();
                    if (this.field1053 > 32767) {
                        this.field1053 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1054 = arg1.method230();
                    if (this.field1054 > 32767) {
                        this.field1054 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1055 = arg1.method230();
                } else if (var4 == 11) {
                    this.field1056 = true;
                } else if (var4 == 12) {
                    this.field1057 = arg1.method233();
                } else if (var4 == 16) {
                    this.field1058 = true;
                } else if (var4 == 23) {
                    this.field1061 = arg1.method230();
                    this.field1063 = arg1.method229();
                } else if (var4 == 24) {
                    this.field1062 = arg1.method230();
                } else if (var4 == 25) {
                    this.field1064 = arg1.method230();
                    this.field1066 = arg1.method229();
                } else if (var4 == 26) {
                    this.field1065 = arg1.method230();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1059 == null) {
                        this.field1059 = new String[5];
                    }
                    this.field1059[var4 - 30] = arg1.method235();
                    if (this.field1059[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1059[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1060 == null) {
                        this.field1060 = new String[5];
                    }
                    this.field1060[var4 - 35] = arg1.method235();
                } else if (var4 == 40) {
                    int var5 = arg1.method228();
                    this.field1047 = new int[var5];
                    this.field1048 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1047[var6] = arg1.method230();
                        this.field1048[var6] = arg1.method230();
                    }
                } else if (var4 == 78) {
                    this.field1067 = arg1.method230();
                } else if (var4 == 79) {
                    this.field1068 = arg1.method230();
                } else if (var4 == 90) {
                    this.field1069 = arg1.method230();
                } else if (var4 == 91) {
                    this.field1071 = arg1.method230();
                } else if (var4 == 92) {
                    this.field1070 = arg1.method230();
                } else if (var4 == 93) {
                    this.field1072 = arg1.method230();
                } else if (var4 == 95) {
                    this.field1052 = arg1.method230();
                } else if (var4 == 97) {
                    this.field1075 = arg1.method230();
                } else if (var4 == 98) {
                    this.field1076 = arg1.method230();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1073 == null) {
                        this.field1073 = new int[10];
                        this.field1074 = new int[10];
                    }
                    this.field1073[var4 - 100] = arg1.method230();
                    this.field1074[var4 - 100] = arg1.method230();
                } else if (var4 == 110) {
                    this.field1077 = arg1.method230();
                } else if (var4 == 111) {
                    this.field1078 = arg1.method230();
                } else if (var4 == 112) {
                    this.field1079 = arg1.method230();
                } else if (var4 == 113) {
                    this.field1080 = arg1.method229();
                } else if (var4 == 114) {
                    this.field1081 = arg1.method229() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "ic", name = "c", descriptor = "(I)V")
    public void method348(int arg0) {
        ObjType var2 = method345(this.field1076);
        this.field1044 = var2.field1044;
        this.field1049 = var2.field1049;
        this.field1050 = var2.field1050;
        this.field1051 = var2.field1051;
        this.field1052 = var2.field1052;
        this.field1053 = var2.field1053;
        this.field1054 = var2.field1054;
        this.field1047 = var2.field1047;
        this.field1048 = var2.field1048;
        ObjType var3 = method345(this.field1075);
        this.field1045 = var3.field1045;
        this.field1058 = var3.field1058;
        this.field1057 = var3.field1057;
        String var4 = "a";
        if (arg0 != 6) {
            this.field1036 = 343;
        }
        char var5 = var3.field1045.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1046 = ("Swap this note at any bank for " + var4 + " " + var3.field1045 + ".").getBytes();
        this.field1056 = true;
    }

    @OriginalMember(owner = "ic", name = "d", descriptor = "(I)Leb;")
    public final Model method349(int arg0) {
        if (this.field1073 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1074[var3] && this.field1074[var3] != 0) {
                    var2 = this.field1073[var3];
                }
            }
            if (var2 != -1) {
                return method345(var2).method349(1);
            }
        }
        Model var4 = (Model) field1082.method101((long) this.field1043);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method125(this.field1044, 196);
        if (var5 == null) {
            return null;
        }
        if (this.field1077 != 128 || this.field1078 != 128 || this.field1079 != 128) {
            var5.method141(this.field1077, false, this.field1079, this.field1078);
        }
        if (this.field1047 != null) {
            for (int var6 = 0; var6 < this.field1047.length; var6++) {
                var5.method139(this.field1047[var6], this.field1048[var6]);
            }
        }
        var5.method142(this.field1080 + 64, this.field1081 + 768, -50, -10, -50, true);
        var5.field573 = true;
        field1082.method102(var5, (long) this.field1043, true);
        return var5;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(II)Leb;")
    public final Model method350(int arg0, int arg1) {
        if (this.field1073 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1074[var4] && this.field1074[var4] != 0) {
                    var3 = this.field1073[var4];
                }
            }
            if (var3 != -1) {
                return method345(var3).method350(-280, 1);
            }
        }
        Model var5 = Model.method125(this.field1044, 196);
        if (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1047 != null) {
            for (int var7 = 0; var7 < this.field1047.length; var7++) {
                var5.method139(this.field1047[var7], this.field1048[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(BIII)Lib;")
    public static final Pix32 method351(byte arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            Pix32 var4 = (Pix32) field1083.method101((long) arg2);
            if (var4 != null && var4.field670 != arg3 && var4.field670 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method345(arg2);
        if (var5.field1073 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field1074[var7] && var5.field1074[var7] != 0) {
                    var6 = var5.field1073[var7];
                }
            }
            if (var6 != -1) {
                var5 = method345(var6);
            }
        }
        Model var8 = var5.method349(1);
        if (var8 == null) {
            return null;
        }
        Pix32 var9 = null;
        if (arg0 != -7) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (var5.field1076 != -1) {
            var9 = method351((byte) -7, -1, var5.field1075, 10);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var11 = new Pix32(32, 32);
        int var12 = Pix3D.field642;
        int var13 = Pix3D.field643;
        int[] var14 = Pix3D.field648;
        int[] var15 = Pix2D.field621;
        int var16 = Pix2D.field622;
        int var17 = Pix2D.field623;
        int var18 = Pix2D.field626;
        int var19 = Pix2D.field627;
        int var20 = Pix2D.field624;
        int var21 = Pix2D.field625;
        Pix3D.field640 = false;
        Pix2D.method151(field1034, var11.field664, 32, 32);
        Pix2D.method156(32, 0, 47458, 0, 32, 0);
        Pix3D.method164(-34321);
        int var22 = var5.field1049;
        if (arg1 == -1) {
            var22 = (int) ((double) var22 * 1.5D);
        }
        if (arg1 > 0) {
            var22 = (int) ((double) var22 * 1.04D);
        }
        int var23 = Pix3D.field646[var5.field1050] * var22 >> 16;
        int var24 = Pix3D.field647[var5.field1050] * var22 >> 16;
        var8.method145(0, var5.field1051, var5.field1052, var5.field1050, var5.field1053, var8.field397 / 2 + var23 + var5.field1054, var5.field1054 + var24);
        for (int var25 = 31; var25 >= 0; var25--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var11.field664[var32 * 32 + var25] == 0) {
                    if (var25 > 0 && var11.field664[var32 * 32 + var25 - 1] > 1) {
                        var11.field664[var32 * 32 + var25] = 1;
                    } else if (var32 > 0 && var11.field664[(var32 - 1) * 32 + var25] > 1) {
                        var11.field664[var32 * 32 + var25] = 1;
                    } else if (var25 < 31 && var11.field664[var32 * 32 + var25 + 1] > 1) {
                        var11.field664[var32 * 32 + var25] = 1;
                    } else if (var32 < 31 && var11.field664[(var32 + 1) * 32 + var25] > 1) {
                        var11.field664[var32 * 32 + var25] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var26 = 31; var26 >= 0; var26--) {
                for (int var27 = 31; var27 >= 0; var27--) {
                    if (var11.field664[var27 * 32 + var26] == 0) {
                        if (var26 > 0 && var11.field664[var27 * 32 + var26 - 1] == 1) {
                            var11.field664[var27 * 32 + var26] = arg1;
                        } else if (var27 > 0 && var11.field664[(var27 - 1) * 32 + var26] == 1) {
                            var11.field664[var27 * 32 + var26] = arg1;
                        } else if (var26 < 31 && var11.field664[var27 * 32 + var26 + 1] == 1) {
                            var11.field664[var27 * 32 + var26] = arg1;
                        } else if (var27 < 31 && var11.field664[(var27 + 1) * 32 + var26] == 1) {
                            var11.field664[var27 * 32 + var26] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var28 = 31; var28 >= 0; var28--) {
                for (int var29 = 31; var29 >= 0; var29--) {
                    if (var11.field664[var29 * 32 + var28] == 0 && var28 > 0 && var29 > 0 && var11.field664[(var29 - 1) * 32 + var28 - 1] > 0) {
                        var11.field664[var29 * 32 + var28] = 3153952;
                    }
                }
            }
        }
        if (var5.field1076 != -1) {
            int var30 = var9.field669;
            int var31 = var9.field670;
            var9.field669 = 32;
            var9.field670 = 32;
            var9.method185((byte) 0, 0, 0);
            var9.field669 = var30;
            var9.field670 = var31;
        }
        if (arg1 == 0) {
            field1083.method102(var11, (long) arg2, true);
        }
        Pix2D.method151(field1034, var15, var16, var17);
        Pix2D.method153(var21, var20, 0, var18, var19);
        Pix3D.field642 = var12;
        Pix3D.field643 = var13;
        Pix3D.field648 = var14;
        Pix3D.field640 = true;
        if (var5.field1056) {
            var11.field669 = 33;
        } else {
            var11.field669 = 32;
        }
        var11.field670 = arg3;
        return var11;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(II)Z")
    public final boolean method352(int arg0, int arg1) {
        int var3 = this.field1061;
        int var4 = this.field1062;
        int var5 = this.field1067;
        if (arg0 < 2 || arg0 > 2) {
            field1035 = !field1035;
        }
        if (arg1 == 1) {
            var3 = this.field1064;
            var4 = this.field1065;
            var5 = this.field1068;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!Model.method126(var3)) {
            var6 = false;
        }
        if (var4 != -1 && !Model.method126(var4)) {
            var6 = false;
        }
        if (var5 != -1 && !Model.method126(var5)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "ic", name = "c", descriptor = "(II)Leb;")
    public final Model method353(int arg0, int arg1) {
        int var3 = this.field1061;
        int var4 = this.field1062;
        int var5 = this.field1067;
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 == 1) {
            var3 = this.field1064;
            var4 = this.field1065;
            var5 = this.field1068;
        }
        if (var3 == -1) {
            return null;
        }
        Model var7 = Model.method125(var3, 196);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var11 = Model.method125(var4, 196);
                Model[] var12 = new Model[] { var7, var11 };
                var7 = new Model(172, var12, 2);
            } else {
                Model var8 = Model.method125(var4, 196);
                Model var9 = Model.method125(var5, 196);
                Model[] var10 = new Model[] { var7, var8, var9 };
                var7 = new Model(172, var10, 3);
            }
        }
        if (arg0 == 0 && this.field1063 != 0) {
            var7.method138(this.field1063, -34664, 0, 0);
        }
        if (arg0 == 1 && this.field1066 != 0) {
            var7.method138(this.field1066, -34664, 0, 0);
        }
        if (this.field1047 != null) {
            for (int var13 = 0; var13 < this.field1047.length; var13++) {
                var7.method139(this.field1047[var13], this.field1048[var13]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "ic", name = "d", descriptor = "(II)Z")
    public final boolean method354(int arg0, int arg1) {
        int var3 = this.field1069;
        int var4 = this.field1070;
        if (arg1 < 1 || arg1 > 1) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1071;
            var4 = this.field1072;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Model.method126(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method126(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "ic", name = "e", descriptor = "(II)Leb;")
    public final Model method355(int arg0, int arg1) {
        int var3 = this.field1069;
        int var4 = this.field1070;
        if (arg0 < 0 || arg0 > 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == 1) {
            var3 = this.field1071;
            var4 = this.field1072;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method125(var3, 196);
        if (var4 != -1) {
            Model var7 = Model.method125(var4, 196);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(172, var8, 2);
        }
        if (this.field1047 != null) {
            for (int var9 = 0; var9 < this.field1047.length; var9++) {
                var6.method139(this.field1047[var9], this.field1048[var9]);
            }
        }
        return var6;
    }
}
