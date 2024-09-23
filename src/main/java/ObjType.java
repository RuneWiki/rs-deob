import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    private int field1047 = -34;

    @OriginalMember(owner = "hc", name = "e", descriptor = "Z")
    private boolean field1048 = true;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    public int field1055 = -1;

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private static int field1045 = -696;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    private static int field1046 = -43533;

    @OriginalMember(owner = "hc", name = "k", descriptor = "Z")
    public static boolean field1054 = true;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Lt;")
    public static LruCache field1094 = new LruCache(0, 50);

    @OriginalMember(owner = "hc", name = "Z", descriptor = "Lt;")
    public static LruCache field1095 = new LruCache(0, 100);

    @OriginalMember(owner = "hc", name = "F", descriptor = "B")
    private byte field1075;

    @OriginalMember(owner = "hc", name = "I", descriptor = "B")
    private byte field1078;

    @OriginalMember(owner = "hc", name = "f", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    private static int field1053;

    @OriginalMember(owner = "hc", name = "m", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "hc", name = "z", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "hc", name = "h", descriptor = "Lmb;")
    private static Packet field1051;

    @OriginalMember(owner = "hc", name = "n", descriptor = "Ljava/lang/String;")
    public String field1057;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1044;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1068;

    @OriginalMember(owner = "hc", name = "A", descriptor = "Z")
    public boolean field1070;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[B")
    public byte[] field1058;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[I")
    private static int[] field1050;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1059;

    @OriginalMember(owner = "hc", name = "q", descriptor = "[I")
    private int[] field1060;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1085;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "[I")
    public int[] field1086;

    @OriginalMember(owner = "hc", name = "i", descriptor = "[Lhc;")
    private static ObjType[] field1052;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1071;

    @OriginalMember(owner = "hc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1072;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lyb;)V")
    public static final void method348(Jagfile arg0) {
        field1051 = new Packet(45427, arg0.method309("obj.dat", null));
        Packet var1 = new Packet(45427, arg0.method309("obj.idx", null));
        field1049 = var1.method241();
        field1050 = new int[field1049];
        int var2 = 2;
        for (int var3 = 0; var3 < field1049; var3++) {
            field1050[var3] = var2;
            var2 += var1.method241();
        }
        field1052 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1052[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public static final void method349(boolean arg0) {
        field1094 = null;
        field1095 = null;
        if (!arg0) {
            field1044 = !field1044;
        }
        field1050 = null;
        field1052 = null;
        field1051 = null;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method350(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1052[var1].field1055 == arg0) {
                return field1052[var1];
            }
        }
        field1053 = (field1053 + 1) % 10;
        ObjType var2 = field1052[field1053];
        field1051.field736 = field1050[arg0];
        var2.field1055 = arg0;
        var2.method351();
        var2.method352(field1051, (byte) 66);
        if (var2.field1088 != -1) {
            var2.method353(true);
        }
        if (!field1054 && var2.field1070) {
            var2.field1057 = "Members Object";
            var2.field1058 = "Login to a members' server to use this object.".getBytes();
            var2.field1071 = null;
            var2.field1072 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method351() {
        this.field1056 = 0;
        this.field1057 = null;
        this.field1058 = null;
        this.field1059 = null;
        this.field1060 = null;
        this.field1061 = 2000;
        this.field1062 = 0;
        this.field1063 = 0;
        this.field1064 = 0;
        this.field1065 = 0;
        this.field1066 = 0;
        this.field1067 = -1;
        this.field1068 = false;
        this.field1069 = 1;
        this.field1070 = false;
        this.field1071 = null;
        this.field1072 = null;
        this.field1073 = -1;
        this.field1074 = -1;
        this.field1075 = 0;
        this.field1076 = -1;
        this.field1077 = -1;
        this.field1078 = 0;
        this.field1079 = -1;
        this.field1080 = -1;
        this.field1081 = -1;
        this.field1082 = -1;
        this.field1083 = -1;
        this.field1084 = -1;
        this.field1085 = null;
        this.field1086 = null;
        this.field1087 = -1;
        this.field1088 = -1;
        this.field1089 = 128;
        this.field1090 = 128;
        this.field1091 = 128;
        this.field1092 = 0;
        this.field1093 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lmb;B)V")
    public final void method352(Packet arg0, byte arg1) {
        if (arg1 != 66) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1056 = arg0.method241();
                } else if (var4 == 2) {
                    this.field1057 = arg0.method246();
                } else if (var4 == 3) {
                    this.field1058 = arg0.method247(true);
                } else if (var4 == 4) {
                    this.field1061 = arg0.method241();
                } else if (var4 == 5) {
                    this.field1062 = arg0.method241();
                } else if (var4 == 6) {
                    this.field1063 = arg0.method241();
                } else if (var4 == 7) {
                    this.field1065 = arg0.method241();
                    if (this.field1065 > 32767) {
                        this.field1065 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1066 = arg0.method241();
                    if (this.field1066 > 32767) {
                        this.field1066 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1067 = arg0.method241();
                } else if (var4 == 11) {
                    this.field1068 = true;
                } else if (var4 == 12) {
                    this.field1069 = arg0.method244();
                } else if (var4 == 16) {
                    this.field1070 = true;
                } else if (var4 == 23) {
                    this.field1073 = arg0.method241();
                    this.field1075 = arg0.method240();
                } else if (var4 == 24) {
                    this.field1074 = arg0.method241();
                } else if (var4 == 25) {
                    this.field1076 = arg0.method241();
                    this.field1078 = arg0.method240();
                } else if (var4 == 26) {
                    this.field1077 = arg0.method241();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1071 == null) {
                        this.field1071 = new String[5];
                    }
                    this.field1071[var4 - 30] = arg0.method246();
                    if (this.field1071[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1071[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1072 == null) {
                        this.field1072 = new String[5];
                    }
                    this.field1072[var4 - 35] = arg0.method246();
                } else if (var4 == 40) {
                    int var5 = arg0.method239();
                    this.field1059 = new int[var5];
                    this.field1060 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1059[var6] = arg0.method241();
                        this.field1060[var6] = arg0.method241();
                    }
                } else if (var4 == 78) {
                    this.field1079 = arg0.method241();
                } else if (var4 == 79) {
                    this.field1080 = arg0.method241();
                } else if (var4 == 90) {
                    this.field1081 = arg0.method241();
                } else if (var4 == 91) {
                    this.field1083 = arg0.method241();
                } else if (var4 == 92) {
                    this.field1082 = arg0.method241();
                } else if (var4 == 93) {
                    this.field1084 = arg0.method241();
                } else if (var4 == 95) {
                    this.field1064 = arg0.method241();
                } else if (var4 == 97) {
                    this.field1087 = arg0.method241();
                } else if (var4 == 98) {
                    this.field1088 = arg0.method241();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1085 == null) {
                        this.field1085 = new int[10];
                        this.field1086 = new int[10];
                    }
                    this.field1085[var4 - 100] = arg0.method241();
                    this.field1086[var4 - 100] = arg0.method241();
                } else if (var4 == 110) {
                    this.field1089 = arg0.method241();
                } else if (var4 == 111) {
                    this.field1090 = arg0.method241();
                } else if (var4 == 112) {
                    this.field1091 = arg0.method241();
                } else if (var4 == 113) {
                    this.field1092 = arg0.method240();
                } else if (var4 == 114) {
                    this.field1093 = arg0.method240() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(Z)V")
    public void method353(boolean arg0) {
        ObjType var2 = method350(this.field1088);
        this.field1056 = var2.field1056;
        this.field1061 = var2.field1061;
        this.field1062 = var2.field1062;
        this.field1063 = var2.field1063;
        this.field1064 = var2.field1064;
        this.field1065 = var2.field1065;
        this.field1066 = var2.field1066;
        this.field1059 = var2.field1059;
        if (!arg0) {
            this.field1047 = -131;
        }
        this.field1060 = var2.field1060;
        ObjType var3 = method350(this.field1087);
        this.field1057 = var3.field1057;
        this.field1070 = var3.field1070;
        this.field1069 = var3.field1069;
        String var4 = "a";
        char var5 = var3.field1057.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1058 = ("Swap this note at any bank for " + var4 + " " + var3.field1057 + ".").getBytes();
        this.field1068 = true;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lfb;")
    public final Model method354(int arg0) {
        if (this.field1085 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1086[var3] && this.field1086[var3] != 0) {
                    var2 = this.field1085[var3];
                }
            }
            if (var2 != -1) {
                return method350(var2).method354(1);
            }
        }
        Model var4 = (Model) field1094.method115((long) this.field1055);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method139(0, this.field1056);
        if (var5 == null) {
            return null;
        }
        if (this.field1089 != 128 || this.field1090 != 128 || this.field1091 != 128) {
            var5.method155(this.field1091, this.field1090, (byte) -121, this.field1089);
        }
        if (this.field1059 != null) {
            for (int var6 = 0; var6 < this.field1059.length; var6++) {
                var5.method153(this.field1059[var6], this.field1060[var6]);
            }
        }
        var5.method156(this.field1092 + 64, this.field1093 + 768, -50, -10, -50, true);
        var5.field596 = true;
        field1094.method116(true, (long) this.field1055, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Lfb;")
    public final Model method355(int arg0, int arg1) {
        if (this.field1085 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1086[var4] && this.field1086[var4] != 0) {
                    var3 = this.field1085[var4];
                }
            }
            if (var3 != -1) {
                return method350(var3).method355(-14119, 1);
            }
        }
        Model var5 = Model.method139(0, this.field1056);
        if (arg0 != -14119) {
            throw new NullPointerException();
        } else if (var5 == null) {
            return null;
        } else {
            if (this.field1059 != null) {
                for (int var6 = 0; var6 < this.field1059.length; var6++) {
                    var5.method153(this.field1059[var6], this.field1060[var6]);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZIII)Ljb;")
    public static final Pix32 method356(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            Pix32 var4 = (Pix32) field1095.method115((long) arg3);
            if (var4 != null && var4.field694 != arg2 && var4.field694 != -1) {
                var4.method120();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method350(arg3);
        if (var5.field1085 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg2 >= var5.field1086[var7] && var5.field1086[var7] != 0) {
                    var6 = var5.field1085[var7];
                }
            }
            if (var6 != -1) {
                var5 = method350(var6);
            }
        }
        Model var8 = var5.method354(1);
        if (var8 == null) {
            return null;
        }
        Pix32 var9 = null;
        if (var5.field1088 != -1) {
            var9 = method356(false, -1, 10, var5.field1087);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field662;
        int var12 = Pix3D.field663;
        int[] var13 = Pix3D.field668;
        int[] var14 = Pix2D.field644;
        int var15 = Pix2D.field645;
        int var16 = Pix2D.field646;
        int var17 = Pix2D.field649;
        int var18 = Pix2D.field650;
        int var19 = Pix2D.field647;
        int var20 = Pix2D.field648;
        Pix3D.field660 = false;
        Pix2D.method165(var10.field688, 741, 32, 32);
        Pix2D.method170(0, 0, 0, 32, (byte) 51, 32);
        Pix3D.method178(field1045);
        int var21 = var5.field1061;
        if (arg1 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg1 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field666[var5.field1062] * var21 >> 16;
        int var23 = Pix3D.field667[var5.field1062] * var21 >> 16;
        var8.method159(0, var5.field1063, var5.field1064, var5.field1062, var5.field1065, var8.field422 / 2 + var22 + var5.field1066, var5.field1066 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field688[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field688[var31 * 32 + var24 - 1] > 1) {
                        var10.field688[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field688[(var31 - 1) * 32 + var24] > 1) {
                        var10.field688[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field688[var31 * 32 + var24 + 1] > 1) {
                        var10.field688[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field688[(var31 + 1) * 32 + var24] > 1) {
                        var10.field688[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field688[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field688[var26 * 32 + var25 - 1] == 1) {
                            var10.field688[var26 * 32 + var25] = arg1;
                        } else if (var26 > 0 && var10.field688[(var26 - 1) * 32 + var25] == 1) {
                            var10.field688[var26 * 32 + var25] = arg1;
                        } else if (var25 < 31 && var10.field688[var26 * 32 + var25 + 1] == 1) {
                            var10.field688[var26 * 32 + var25] = arg1;
                        } else if (var26 < 31 && var10.field688[(var26 + 1) * 32 + var25] == 1) {
                            var10.field688[var26 * 32 + var25] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field688[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field688[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field688[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1088 != -1) {
            int var29 = var9.field693;
            int var30 = var9.field694;
            var9.field693 = 32;
            var9.field694 = 32;
            var9.method199(0, field1046, 0);
            var9.field693 = var29;
            var9.field694 = var30;
        }
        if (arg1 == 0) {
            field1095.method116(true, (long) arg3, var10);
        }
        Pix2D.method165(var14, 741, var15, var16);
        Pix2D.method167(true, var18, var17, var19, var20);
        Pix3D.field662 = var11;
        Pix3D.field663 = var12;
        Pix3D.field668 = var13;
        Pix3D.field660 = true;
        if (arg0) {
            throw new NullPointerException();
        }
        if (var5.field1068) {
            var10.field693 = 33;
        } else {
            var10.field693 = 32;
        }
        var10.field694 = arg2;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Z")
    public final boolean method357(boolean arg0, int arg1) {
        int var3 = this.field1073;
        int var4 = this.field1074;
        int var5 = this.field1079;
        if (arg0) {
            throw new NullPointerException();
        }
        if (arg1 == 1) {
            var3 = this.field1076;
            var4 = this.field1077;
            var5 = this.field1080;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!Model.method140(var3)) {
            var6 = false;
        }
        if (var4 != -1 && !Model.method140(var4)) {
            var6 = false;
        }
        if (var5 != -1 && !Model.method140(var5)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Lfb;")
    public final Model method358(int arg0, int arg1) {
        if (arg0 != 6) {
            this.field1048 = !this.field1048;
        }
        int var3 = this.field1073;
        int var4 = this.field1074;
        int var5 = this.field1079;
        if (arg1 == 1) {
            var3 = this.field1076;
            var4 = this.field1077;
            var5 = this.field1080;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method139(0, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method139(0, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, var11, -38792);
            } else {
                Model var7 = Model.method139(0, var4);
                Model var8 = Model.method139(0, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, var9, -38792);
            }
        }
        if (arg1 == 0 && this.field1075 != 0) {
            var6.method152(0, 0, this.field1075, (byte) -20);
        }
        if (arg1 == 1 && this.field1078 != 0) {
            var6.method152(0, 0, this.field1078, (byte) -20);
        }
        if (this.field1059 != null) {
            for (int var12 = 0; var12 < this.field1059.length; var12++) {
                var6.method153(this.field1059[var12], this.field1060[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method359(int arg0, int arg1) {
        int var3 = this.field1081;
        int var4 = this.field1082;
        if (arg0 == 1) {
            var3 = this.field1083;
            var4 = this.field1084;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (arg1 != 0) {
            field1046 = -177;
        }
        if (!Model.method140(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method140(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "d", descriptor = "(II)Lfb;")
    public final Model method360(int arg0, int arg1) {
        int var3 = this.field1081;
        int var4 = this.field1082;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1083;
            var4 = this.field1084;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method139(0, var3);
        if (var4 != -1) {
            Model var6 = Model.method139(0, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, var7, -38792);
        }
        if (this.field1059 != null) {
            for (int var8 = 0; var8 < this.field1059.length; var8++) {
                var5.method153(this.field1059[var8], this.field1060[var8]);
            }
        }
        return var5;
    }
}
