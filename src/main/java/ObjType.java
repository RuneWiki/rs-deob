import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private int field1023 = 896;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    private int field1025 = 13419;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private static boolean field1024 = true;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Z")
    public static boolean field1031 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1072 = new LruCache(false, 50);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1073 = new LruCache(false, 100);

    @OriginalMember(owner = "hc", name = "D", descriptor = "B")
    private byte field1052;

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1055;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "hc", name = "h", descriptor = "I")
    private static int field1030;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "hc", name = "f", descriptor = "Llb;")
    private static Packet field1028;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1034;

    @OriginalMember(owner = "hc", name = "w", descriptor = "Z")
    public boolean field1045;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1047;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[B")
    public byte[] field1035;

    @OriginalMember(owner = "hc", name = "e", descriptor = "[I")
    private static int[] field1027;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[I")
    private int[] field1036;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1037;

    @OriginalMember(owner = "hc", name = "N", descriptor = "[I")
    public int[] field1062;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1063;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[Lhc;")
    private static ObjType[] field1029;

    @OriginalMember(owner = "hc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1048;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1049;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method340(Jagfile arg0) {
        field1028 = new Packet(arg0.method295("obj.dat", null), 185);
        Packet var1 = new Packet(arg0.method295("obj.idx", null), 185);
        field1026 = var1.method227();
        field1027 = new int[field1026];
        int var2 = 2;
        for (int var3 = 0; var3 < field1026; var3++) {
            field1027[var3] = var2;
            var2 += var1.method227();
        }
        field1029 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1029[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)V")
    public static final void method341(int arg0) {
        field1072 = null;
        field1073 = null;
        if (arg0 != 0) {
            field1024 = !field1024;
        }
        field1027 = null;
        field1029 = null;
        field1028 = null;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lhc;")
    public static final ObjType method342(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1029[var1].field1032 == arg0) {
                return field1029[var1];
            }
        }
        field1030 = (field1030 + 1) % 10;
        ObjType var2 = field1029[field1030];
        field1028.field708 = field1027[arg0];
        var2.field1032 = arg0;
        var2.method343();
        var2.method344(field1028, (byte) 81);
        if (var2.field1065 != -1) {
            var2.method345(false);
        }
        if (!field1031 && var2.field1047) {
            var2.field1034 = "Members Object";
            var2.field1035 = "Login to a members' server to use this object.".getBytes();
            var2.field1048 = null;
            var2.field1049 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method343() {
        this.field1033 = 0;
        this.field1034 = null;
        this.field1035 = null;
        this.field1036 = null;
        this.field1037 = null;
        this.field1038 = 2000;
        this.field1039 = 0;
        this.field1040 = 0;
        this.field1041 = 0;
        this.field1042 = 0;
        this.field1043 = 0;
        this.field1044 = -1;
        this.field1045 = false;
        this.field1046 = 1;
        this.field1047 = false;
        this.field1048 = null;
        this.field1049 = null;
        this.field1050 = -1;
        this.field1051 = -1;
        this.field1052 = 0;
        this.field1053 = -1;
        this.field1054 = -1;
        this.field1055 = 0;
        this.field1056 = -1;
        this.field1057 = -1;
        this.field1058 = -1;
        this.field1059 = -1;
        this.field1060 = -1;
        this.field1061 = -1;
        this.field1062 = null;
        this.field1063 = null;
        this.field1064 = -1;
        this.field1065 = -1;
        this.field1066 = 128;
        this.field1067 = 128;
        this.field1068 = 128;
        this.field1069 = 0;
        this.field1070 = 0;
        this.field1071 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Llb;B)V")
    public final void method344(Packet arg0, byte arg1) {
        if (arg1 != 81) {
            this.field1023 = -124;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method225();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1033 = arg0.method227();
                } else if (var3 == 2) {
                    this.field1034 = arg0.method232();
                } else if (var3 == 3) {
                    this.field1035 = arg0.method233(986);
                } else if (var3 == 4) {
                    this.field1038 = arg0.method227();
                } else if (var3 == 5) {
                    this.field1039 = arg0.method227();
                } else if (var3 == 6) {
                    this.field1040 = arg0.method227();
                } else if (var3 == 7) {
                    this.field1042 = arg0.method227();
                    if (this.field1042 > 32767) {
                        this.field1042 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1043 = arg0.method227();
                    if (this.field1043 > 32767) {
                        this.field1043 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1044 = arg0.method227();
                } else if (var3 == 11) {
                    this.field1045 = true;
                } else if (var3 == 12) {
                    this.field1046 = arg0.method230();
                } else if (var3 == 16) {
                    this.field1047 = true;
                } else if (var3 == 23) {
                    this.field1050 = arg0.method227();
                    this.field1052 = arg0.method226();
                } else if (var3 == 24) {
                    this.field1051 = arg0.method227();
                } else if (var3 == 25) {
                    this.field1053 = arg0.method227();
                    this.field1055 = arg0.method226();
                } else if (var3 == 26) {
                    this.field1054 = arg0.method227();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1048 == null) {
                        this.field1048 = new String[5];
                    }
                    this.field1048[var3 - 30] = arg0.method232();
                    if (this.field1048[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1048[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1049 == null) {
                        this.field1049 = new String[5];
                    }
                    this.field1049[var3 - 35] = arg0.method232();
                } else if (var3 == 40) {
                    int var4 = arg0.method225();
                    this.field1036 = new int[var4];
                    this.field1037 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1036[var5] = arg0.method227();
                        this.field1037[var5] = arg0.method227();
                    }
                } else if (var3 == 78) {
                    this.field1056 = arg0.method227();
                } else if (var3 == 79) {
                    this.field1057 = arg0.method227();
                } else if (var3 == 90) {
                    this.field1058 = arg0.method227();
                } else if (var3 == 91) {
                    this.field1060 = arg0.method227();
                } else if (var3 == 92) {
                    this.field1059 = arg0.method227();
                } else if (var3 == 93) {
                    this.field1061 = arg0.method227();
                } else if (var3 == 95) {
                    this.field1041 = arg0.method227();
                } else if (var3 == 97) {
                    this.field1064 = arg0.method227();
                } else if (var3 == 98) {
                    this.field1065 = arg0.method227();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1062 == null) {
                        this.field1062 = new int[10];
                        this.field1063 = new int[10];
                    }
                    this.field1062[var3 - 100] = arg0.method227();
                    this.field1063[var3 - 100] = arg0.method227();
                } else if (var3 == 110) {
                    this.field1066 = arg0.method227();
                } else if (var3 == 111) {
                    this.field1067 = arg0.method227();
                } else if (var3 == 112) {
                    this.field1068 = arg0.method227();
                } else if (var3 == 113) {
                    this.field1069 = arg0.method226();
                } else if (var3 == 114) {
                    this.field1070 = arg0.method226() * 5;
                } else if (var3 == 115) {
                    this.field1071 = arg0.method225();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public void method345(boolean arg0) {
        ObjType var2 = method342(this.field1065);
        this.field1033 = var2.field1033;
        this.field1038 = var2.field1038;
        this.field1039 = var2.field1039;
        this.field1040 = var2.field1040;
        this.field1041 = var2.field1041;
        this.field1042 = var2.field1042;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1043 = var2.field1043;
        this.field1036 = var2.field1036;
        this.field1037 = var2.field1037;
        ObjType var4 = method342(this.field1064);
        this.field1034 = var4.field1034;
        this.field1047 = var4.field1047;
        this.field1046 = var4.field1046;
        String var5 = "a";
        char var6 = var4.field1034.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var5 = "an";
        }
        this.field1035 = ("Swap this note at any bank for " + var5 + " " + var4.field1034 + ".").getBytes();
        this.field1045 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Leb;")
    public final Model method346(int arg0) {
        if (this.field1062 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1063[var3] && this.field1063[var3] != 0) {
                    var2 = this.field1062[var3];
                }
            }
            if (var2 != -1) {
                return method342(var2).method346(1);
            }
        }
        Model var4 = (Model) field1072.method101((long) this.field1032);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method125(this.field1033, (byte) -104);
        if (var5 == null) {
            return null;
        }
        if (this.field1066 != 128 || this.field1067 != 128 || this.field1068 != 128) {
            var5.method141(this.field1068, this.field1066, (byte) 62, this.field1067);
        }
        if (this.field1036 != null) {
            for (int var6 = 0; var6 < this.field1036.length; var6++) {
                var5.method139(this.field1036[var6], this.field1037[var6]);
            }
        }
        var5.method142(this.field1069 + 64, this.field1070 + 768, -50, -10, -50, true);
        var5.field571 = true;
        field1072.method102(400, var5, (long) this.field1032);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Leb;")
    public final Model method347(int arg0, int arg1) {
        if (this.field1025 != arg0) {
            field1024 = !field1024;
        }
        if (this.field1062 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1063[var4] && this.field1063[var4] != 0) {
                    var3 = this.field1062[var4];
                }
            }
            if (var3 != -1) {
                return method342(var3).method347(13419, 1);
            }
        }
        Model var5 = Model.method125(this.field1033, (byte) -104);
        if (var5 == null) {
            return null;
        }
        if (this.field1036 != null) {
            for (int var6 = 0; var6 < this.field1036.length; var6++) {
                var5.method139(this.field1036[var6], this.field1037[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIIB)Lib;")
    public static final Pix32 method348(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 0) {
            Pix32 var4 = (Pix32) field1073.method101((long) arg1);
            if (var4 != null && var4.field669 != arg0 && var4.field669 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method342(arg1);
        if (arg3 != 3) {
            field1024 = !field1024;
        }
        if (var5.field1062 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg0 >= var5.field1063[var7] && var5.field1063[var7] != 0) {
                    var6 = var5.field1062[var7];
                }
            }
            if (var6 != -1) {
                var5 = method342(var6);
            }
        }
        Model var8 = var5.method346(1);
        if (var8 == null) {
            return null;
        }
        Pix32 var9 = null;
        if (var5.field1065 != -1) {
            var9 = method348(10, var5.field1064, -1, (byte) 3);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field639;
        int var12 = Pix3D.field640;
        int[] var13 = Pix3D.field645;
        int[] var14 = Pix2D.field620;
        int var15 = Pix2D.field621;
        int var16 = Pix2D.field622;
        int var17 = Pix2D.field625;
        int var18 = Pix2D.field626;
        int var19 = Pix2D.field623;
        int var20 = Pix2D.field624;
        Pix3D.field637 = false;
        Pix2D.method151(32, 32, var10.field663, false);
        Pix2D.method156(0, 0, 32, 32, -37952, 0);
        Pix3D.method164(false);
        int var21 = var5.field1038;
        if (arg2 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg2 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field643[var5.field1039] * var21 >> 16;
        int var23 = Pix3D.field644[var5.field1039] * var21 >> 16;
        var8.method145(0, var5.field1040, var5.field1041, var5.field1039, var5.field1042, var8.field393 / 2 + var22 + var5.field1043, var5.field1043 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field663[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field663[var31 * 32 + var24 - 1] > 1) {
                        var10.field663[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field663[(var31 - 1) * 32 + var24] > 1) {
                        var10.field663[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field663[var31 * 32 + var24 + 1] > 1) {
                        var10.field663[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field663[(var31 + 1) * 32 + var24] > 1) {
                        var10.field663[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field663[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field663[var26 * 32 + var25 - 1] == 1) {
                            var10.field663[var26 * 32 + var25] = arg2;
                        } else if (var26 > 0 && var10.field663[(var26 - 1) * 32 + var25] == 1) {
                            var10.field663[var26 * 32 + var25] = arg2;
                        } else if (var25 < 31 && var10.field663[var26 * 32 + var25 + 1] == 1) {
                            var10.field663[var26 * 32 + var25] = arg2;
                        } else if (var26 < 31 && var10.field663[(var26 + 1) * 32 + var25] == 1) {
                            var10.field663[var26 * 32 + var25] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field663[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field663[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field663[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1065 != -1) {
            int var29 = var9.field668;
            int var30 = var9.field669;
            var9.field668 = 32;
            var9.field669 = 32;
            var9.method185(0, (byte) 1, 0);
            var9.field668 = var29;
            var9.field669 = var30;
        }
        if (arg2 == 0) {
            field1073.method102(400, var10, (long) arg1);
        }
        Pix2D.method151(var15, var16, var14, false);
        Pix2D.method153(var19, var17, var18, var20, 297);
        Pix3D.field639 = var11;
        Pix3D.field640 = var12;
        Pix3D.field645 = var13;
        Pix3D.field637 = true;
        if (var5.field1045) {
            var10.field668 = 33;
        } else {
            var10.field668 = 32;
        }
        var10.field669 = arg0;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Z")
    public final boolean method349(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var3 = this.field1050;
        int var4 = this.field1051;
        int var5 = this.field1056;
        if (arg1 == 1) {
            var3 = this.field1053;
            var4 = this.field1054;
            var5 = this.field1057;
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Leb;")
    public final Model method350(boolean arg0, int arg1) {
        int var3 = this.field1050;
        int var4 = this.field1051;
        int var5 = this.field1056;
        if (arg1 == 1) {
            var3 = this.field1053;
            var4 = this.field1054;
            var5 = this.field1057;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method125(var3, (byte) -104);
        if (arg0) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method125(var4, (byte) -104);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model((byte) 3, 2, var11);
            } else {
                Model var7 = Model.method125(var4, (byte) -104);
                Model var8 = Model.method125(var5, (byte) -104);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model((byte) 3, 3, var9);
            }
        }
        if (arg1 == 0 && this.field1052 != 0) {
            var6.method138(0, this.field1052, (byte) 25, 0);
        }
        if (arg1 == 1 && this.field1055 != 0) {
            var6.method138(0, this.field1055, (byte) 25, 0);
        }
        if (this.field1036 != null) {
            for (int var12 = 0; var12 < this.field1036.length; var12++) {
                var6.method139(this.field1036[var12], this.field1037[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(ZI)Z")
    public final boolean method351(boolean arg0, int arg1) {
        int var3 = this.field1058;
        int var4 = this.field1059;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (arg1 == 1) {
            var3 = this.field1060;
            var4 = this.field1061;
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IZ)Leb;")
    public final Model method352(int arg0, boolean arg1) {
        int var3 = this.field1058;
        int var4 = this.field1059;
        if (!arg1) {
            this.field1025 = -196;
        }
        if (arg0 == 1) {
            var3 = this.field1060;
            var4 = this.field1061;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method125(var3, (byte) -104);
        if (var4 != -1) {
            Model var6 = Model.method125(var4, (byte) -104);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model((byte) 3, 2, var7);
        }
        if (this.field1036 != null) {
            for (int var8 = 0; var8 < this.field1036.length; var8++) {
                var5.method139(this.field1036[var8], this.field1037[var8]);
            }
        }
        return var5;
    }
}
