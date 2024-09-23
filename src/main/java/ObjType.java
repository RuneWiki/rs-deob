import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private int field1030 = -32952;

    @OriginalMember(owner = "hc", name = "d", descriptor = "Z")
    private boolean field1033 = true;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    public int field1040 = -1;

    @OriginalMember(owner = "hc", name = "b", descriptor = "B")
    private static byte field1031 = 7;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    private static int field1032 = 5;

    @OriginalMember(owner = "hc", name = "j", descriptor = "Z")
    public static boolean field1039 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1079 = new LruCache(50, 0);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1080 = new LruCache(100, 0);

    @OriginalMember(owner = "hc", name = "E", descriptor = "B")
    private byte field1060;

    @OriginalMember(owner = "hc", name = "H", descriptor = "B")
    private byte field1063;

    @OriginalMember(owner = "hc", name = "e", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "hc", name = "i", descriptor = "I")
    private static int field1038;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "hc", name = "y", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "hc", name = "g", descriptor = "Llb;")
    private static Packet field1036;

    @OriginalMember(owner = "hc", name = "m", descriptor = "Ljava/lang/String;")
    public String field1042;

    @OriginalMember(owner = "hc", name = "x", descriptor = "Z")
    public boolean field1053;

    @OriginalMember(owner = "hc", name = "z", descriptor = "Z")
    public boolean field1055;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[B")
    public byte[] field1043;

    @OriginalMember(owner = "hc", name = "f", descriptor = "[I")
    private static int[] field1035;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1044;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1045;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1070;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1071;

    @OriginalMember(owner = "hc", name = "h", descriptor = "[Lhc;")
    private static ObjType[] field1037;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1056;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1057;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1036 = new Packet(arg0.method294("obj.dat", null), (byte) 1);
        Packet var1 = new Packet(arg0.method294("obj.idx", null), (byte) 1);
        field1034 = var1.method226();
        field1035 = new int[field1034];
        int var2 = 2;
        for (int var3 = 0; var3 < field1034; var3++) {
            field1035[var3] = var2;
            var2 += var1.method226();
        }
        field1037 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1037[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(B)V")
    public static final void method340(byte arg0) {
        field1079 = null;
        field1080 = null;
        field1035 = null;
        if (arg0 != 1) {
            field1032 = -53;
        }
        field1037 = null;
        field1036 = null;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method341(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1037[var1].field1040 == arg0) {
                return field1037[var1];
            }
        }
        field1038 = (field1038 + 1) % 10;
        ObjType var2 = field1037[field1038];
        field1036.field709 = field1035[arg0];
        var2.field1040 = arg0;
        var2.method342();
        var2.method343((byte) 2, field1036);
        if (var2.field1073 != -1) {
            var2.method344(false);
        }
        if (!field1039 && var2.field1055) {
            var2.field1042 = "Members Object";
            var2.field1043 = "Login to a members' server to use this object.".getBytes();
            var2.field1056 = null;
            var2.field1057 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method342() {
        this.field1041 = 0;
        this.field1042 = null;
        this.field1043 = null;
        this.field1044 = null;
        this.field1045 = null;
        this.field1046 = 2000;
        this.field1047 = 0;
        this.field1048 = 0;
        this.field1049 = 0;
        this.field1050 = 0;
        this.field1051 = 0;
        this.field1052 = -1;
        this.field1053 = false;
        this.field1054 = 1;
        this.field1055 = false;
        this.field1056 = null;
        this.field1057 = null;
        this.field1058 = -1;
        this.field1059 = -1;
        this.field1060 = 0;
        this.field1061 = -1;
        this.field1062 = -1;
        this.field1063 = 0;
        this.field1064 = -1;
        this.field1065 = -1;
        this.field1066 = -1;
        this.field1067 = -1;
        this.field1068 = -1;
        this.field1069 = -1;
        this.field1070 = null;
        this.field1071 = null;
        this.field1072 = -1;
        this.field1073 = -1;
        this.field1074 = 128;
        this.field1075 = 128;
        this.field1076 = 128;
        this.field1077 = 0;
        this.field1078 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BLlb;)V")
    public final void method343(byte arg0, Packet arg1) {
        if (arg0 != 2) {
            this.field1033 = !this.field1033;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1041 = arg1.method226();
                } else if (var3 == 2) {
                    this.field1042 = arg1.method231();
                } else if (var3 == 3) {
                    this.field1043 = arg1.method232(this.field1030);
                } else if (var3 == 4) {
                    this.field1046 = arg1.method226();
                } else if (var3 == 5) {
                    this.field1047 = arg1.method226();
                } else if (var3 == 6) {
                    this.field1048 = arg1.method226();
                } else if (var3 == 7) {
                    this.field1050 = arg1.method226();
                    if (this.field1050 > 32767) {
                        this.field1050 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1051 = arg1.method226();
                    if (this.field1051 > 32767) {
                        this.field1051 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1052 = arg1.method226();
                } else if (var3 == 11) {
                    this.field1053 = true;
                } else if (var3 == 12) {
                    this.field1054 = arg1.method229();
                } else if (var3 == 16) {
                    this.field1055 = true;
                } else if (var3 == 23) {
                    this.field1058 = arg1.method226();
                    this.field1060 = arg1.method225();
                } else if (var3 == 24) {
                    this.field1059 = arg1.method226();
                } else if (var3 == 25) {
                    this.field1061 = arg1.method226();
                    this.field1063 = arg1.method225();
                } else if (var3 == 26) {
                    this.field1062 = arg1.method226();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1056 == null) {
                        this.field1056 = new String[5];
                    }
                    this.field1056[var3 - 30] = arg1.method231();
                    if (this.field1056[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1056[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1057 == null) {
                        this.field1057 = new String[5];
                    }
                    this.field1057[var3 - 35] = arg1.method231();
                } else if (var3 == 40) {
                    int var4 = arg1.method224();
                    this.field1044 = new int[var4];
                    this.field1045 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1044[var5] = arg1.method226();
                        this.field1045[var5] = arg1.method226();
                    }
                } else if (var3 == 78) {
                    this.field1064 = arg1.method226();
                } else if (var3 == 79) {
                    this.field1065 = arg1.method226();
                } else if (var3 == 90) {
                    this.field1066 = arg1.method226();
                } else if (var3 == 91) {
                    this.field1068 = arg1.method226();
                } else if (var3 == 92) {
                    this.field1067 = arg1.method226();
                } else if (var3 == 93) {
                    this.field1069 = arg1.method226();
                } else if (var3 == 95) {
                    this.field1049 = arg1.method226();
                } else if (var3 == 97) {
                    this.field1072 = arg1.method226();
                } else if (var3 == 98) {
                    this.field1073 = arg1.method226();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1070 == null) {
                        this.field1070 = new int[10];
                        this.field1071 = new int[10];
                    }
                    this.field1070[var3 - 100] = arg1.method226();
                    this.field1071[var3 - 100] = arg1.method226();
                } else if (var3 == 110) {
                    this.field1074 = arg1.method226();
                } else if (var3 == 111) {
                    this.field1075 = arg1.method226();
                } else if (var3 == 112) {
                    this.field1076 = arg1.method226();
                } else if (var3 == 113) {
                    this.field1077 = arg1.method225();
                } else if (var3 == 114) {
                    this.field1078 = arg1.method225() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public void method344(boolean arg0) {
        ObjType var2 = method341(this.field1073);
        this.field1041 = var2.field1041;
        this.field1046 = var2.field1046;
        this.field1047 = var2.field1047;
        this.field1048 = var2.field1048;
        this.field1049 = var2.field1049;
        this.field1050 = var2.field1050;
        this.field1051 = var2.field1051;
        if (arg0) {
            this.field1033 = !this.field1033;
        }
        this.field1044 = var2.field1044;
        this.field1045 = var2.field1045;
        ObjType var3 = method341(this.field1072);
        this.field1042 = var3.field1042;
        this.field1055 = var3.field1055;
        this.field1054 = var3.field1054;
        String var4 = "a";
        char var5 = var3.field1042.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1043 = ("Swap this note at any bank for " + var4 + " " + var3.field1042 + ".").getBytes();
        this.field1053 = true;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Leb;")
    public final Model method345(int arg0) {
        if (this.field1070 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1071[var3] && this.field1071[var3] != 0) {
                    var2 = this.field1070[var3];
                }
            }
            if (var2 != -1) {
                return method341(var2).method345(1);
            }
        }
        Model var4 = (Model) field1079.method101((long) this.field1040);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method125(this.field1041, 6);
        if (var5 == null) {
            return null;
        }
        if (this.field1074 != 128 || this.field1075 != 128 || this.field1076 != 128) {
            var5.method141(9, this.field1076, this.field1074, this.field1075);
        }
        if (this.field1044 != null) {
            for (int var6 = 0; var6 < this.field1044.length; var6++) {
                var5.method139(this.field1044[var6], this.field1045[var6]);
            }
        }
        var5.method142(this.field1077 + 64, this.field1078 + 768, -50, -10, -50, true);
        var5.field569 = true;
        field1079.method102(201, (long) this.field1040, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BI)Leb;")
    public final Model method346(byte arg0, int arg1) {
        if (this.field1070 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1071[var4] && this.field1071[var4] != 0) {
                    var3 = this.field1070[var4];
                }
            }
            if (var3 != -1) {
                return method341(var3).method346((byte) 7, 1);
            }
        }
        Model var5 = Model.method125(this.field1041, 6);
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        if (var5 == null) {
            return null;
        }
        if (this.field1044 != null) {
            for (int var7 = 0; var7 < this.field1044.length; var7++) {
                var5.method139(this.field1044[var7], this.field1045[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Lib;")
    public static final Pix32 method347(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            Pix32 var4 = (Pix32) field1080.method101((long) arg0);
            if (var4 != null && var4.field667 != arg3 && var4.field667 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method341(arg0);
        if (var5.field1070 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field1071[var7] && var5.field1071[var7] != 0) {
                    var6 = var5.field1070[var7];
                }
            }
            if (var6 != -1) {
                var5 = method341(var6);
            }
        }
        Model var8 = var5.method345(1);
        if (var8 == null) {
            return null;
        }
        Pix32 var9 = null;
        if (var5.field1073 != -1) {
            var9 = method347(var5.field1072, -1, 45926, 10);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field633;
        int var12 = Pix3D.field634;
        int[] var13 = Pix3D.field639;
        int[] var14 = Pix2D.field615;
        int var15 = Pix2D.field616;
        int var16 = Pix2D.field617;
        int var17 = Pix2D.field620;
        int var18 = Pix2D.field621;
        int var19 = Pix2D.field618;
        int var20 = Pix2D.field619;
        if (arg2 != 45926) {
            throw new NullPointerException();
        }
        Pix3D.field631 = false;
        Pix2D.method151(32, 32, var10.field661, 9);
        Pix2D.method156(32, 0, 32, 0, 0, 0);
        Pix3D.method164(false);
        int var21 = var5.field1046;
        if (arg1 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg1 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field637[var5.field1047] * var21 >> 16;
        int var23 = Pix3D.field638[var5.field1047] * var21 >> 16;
        var8.method145(0, var5.field1048, var5.field1049, var5.field1047, var5.field1050, var8.field394 / 2 + var22 + var5.field1051, var5.field1051 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field661[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field661[var31 * 32 + var24 - 1] > 1) {
                        var10.field661[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field661[(var31 - 1) * 32 + var24] > 1) {
                        var10.field661[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field661[var31 * 32 + var24 + 1] > 1) {
                        var10.field661[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field661[(var31 + 1) * 32 + var24] > 1) {
                        var10.field661[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field661[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field661[var26 * 32 + var25 - 1] == 1) {
                            var10.field661[var26 * 32 + var25] = arg1;
                        } else if (var26 > 0 && var10.field661[(var26 - 1) * 32 + var25] == 1) {
                            var10.field661[var26 * 32 + var25] = arg1;
                        } else if (var25 < 31 && var10.field661[var26 * 32 + var25 + 1] == 1) {
                            var10.field661[var26 * 32 + var25] = arg1;
                        } else if (var26 < 31 && var10.field661[(var26 + 1) * 32 + var25] == 1) {
                            var10.field661[var26 * 32 + var25] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field661[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field661[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field661[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1073 != -1) {
            int var29 = var9.field666;
            int var30 = var9.field667;
            var9.field666 = 32;
            var9.field667 = 32;
            var9.method185(field1031, 0, 0);
            var9.field666 = var29;
            var9.field667 = var30;
        }
        if (arg1 == 0) {
            field1080.method102(201, (long) arg0, var10);
        }
        Pix2D.method151(var15, var16, var14, 9);
        Pix2D.method153(5, var20, var18, var17, var19);
        Pix3D.field633 = var11;
        Pix3D.field634 = var12;
        Pix3D.field639 = var13;
        Pix3D.field631 = true;
        if (var5.field1053) {
            var10.field666 = 33;
        } else {
            var10.field666 = 32;
        }
        var10.field667 = arg3;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Z")
    public final boolean method348(int arg0, int arg1) {
        int var3 = this.field1058;
        int var4 = this.field1059;
        int var5 = this.field1064;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1061;
            var4 = this.field1062;
            var5 = this.field1065;
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

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Leb;")
    public final Model method349(int arg0, int arg1) {
        int var3 = this.field1058;
        int var4 = this.field1059;
        int var5 = this.field1064;
        if (arg0 >= 0) {
            this.field1033 = !this.field1033;
        }
        if (arg1 == 1) {
            var3 = this.field1061;
            var4 = this.field1062;
            var5 = this.field1065;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method125(var3, 6);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method125(var4, 6);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, -643, var11);
            } else {
                Model var7 = Model.method125(var4, 6);
                Model var8 = Model.method125(var5, 6);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, -643, var9);
            }
        }
        if (arg1 == 0 && this.field1060 != 0) {
            var6.method138(0, this.field1060, (byte) 10, 0);
        }
        if (arg1 == 1 && this.field1063 != 0) {
            var6.method138(0, this.field1063, (byte) 10, 0);
        }
        if (this.field1044 != null) {
            for (int var12 = 0; var12 < this.field1044.length; var12++) {
                var6.method139(this.field1044[var12], this.field1045[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Z")
    public final boolean method350(int arg0, byte arg1) {
        int var3 = this.field1066;
        int var4 = this.field1067;
        if (arg0 == 1) {
            var3 = this.field1068;
            var4 = this.field1069;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        if (!Model.method126(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method126(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Leb;")
    public final Model method351(boolean arg0, int arg1) {
        int var3 = this.field1066;
        int var4 = this.field1067;
        if (arg0) {
            throw new NullPointerException();
        }
        if (arg1 == 1) {
            var3 = this.field1068;
            var4 = this.field1069;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method125(var3, 6);
        if (var4 != -1) {
            Model var6 = Model.method125(var4, 6);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, -643, var7);
        }
        if (this.field1044 != null) {
            for (int var8 = 0; var8 < this.field1044.length; var8++) {
                var5.method139(this.field1044[var8], this.field1045[var8]);
            }
        }
        return var5;
    }
}
