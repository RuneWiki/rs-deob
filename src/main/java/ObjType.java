import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private boolean field1029 = true;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    private int field1030 = 4697;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    private static int field1031 = 848;

    @OriginalMember(owner = "hc", name = "j", descriptor = "Z")
    public static boolean field1037 = true;

    @OriginalMember(owner = "hc", name = "X", descriptor = "Ls;")
    public static LruCache field1077 = new LruCache(50, 0);

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Ls;")
    public static LruCache field1078 = new LruCache(100, 0);

    @OriginalMember(owner = "hc", name = "E", descriptor = "B")
    private byte field1058;

    @OriginalMember(owner = "hc", name = "H", descriptor = "B")
    private byte field1061;

    @OriginalMember(owner = "hc", name = "e", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "hc", name = "i", descriptor = "I")
    private static int field1036;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "hc", name = "y", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "hc", name = "C", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "hc", name = "g", descriptor = "Llb;")
    private static Packet field1034;

    @OriginalMember(owner = "hc", name = "m", descriptor = "Ljava/lang/String;")
    public String field1040;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1028;

    @OriginalMember(owner = "hc", name = "x", descriptor = "Z")
    public boolean field1051;

    @OriginalMember(owner = "hc", name = "z", descriptor = "Z")
    public boolean field1053;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[B")
    public byte[] field1041;

    @OriginalMember(owner = "hc", name = "f", descriptor = "[I")
    private static int[] field1033;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1042;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1043;

    @OriginalMember(owner = "hc", name = "O", descriptor = "[I")
    public int[] field1068;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1069;

    @OriginalMember(owner = "hc", name = "h", descriptor = "[Lhc;")
    private static ObjType[] field1035;

    @OriginalMember(owner = "hc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1054;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1055;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1034 = new Packet((byte) 3, arg0.method294("obj.dat", null));
        Packet var1 = new Packet((byte) 3, arg0.method294("obj.idx", null));
        field1032 = var1.method226();
        field1033 = new int[field1032];
        int var2 = 2;
        for (int var3 = 0; var3 < field1032; var3++) {
            field1033[var3] = var2;
            var2 += var1.method226();
        }
        field1035 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1035[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(B)V")
    public static final void method340(byte arg0) {
        field1077 = null;
        field1078 = null;
        field1033 = null;
        if (arg0 == 5) {
            boolean var1 = false;
            field1035 = null;
            field1034 = null;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method341(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1035[var1].field1038 == arg0) {
                return field1035[var1];
            }
        }
        field1036 = (field1036 + 1) % 10;
        ObjType var2 = field1035[field1036];
        field1034.field702 = field1033[arg0];
        var2.field1038 = arg0;
        var2.method342();
        var2.method343(field1034, -32477);
        if (var2.field1071 != -1) {
            var2.method344(0);
        }
        if (!field1037 && var2.field1053) {
            var2.field1040 = "Members Object";
            var2.field1041 = "Login to a members' server to use this object.".getBytes();
            var2.field1054 = null;
            var2.field1055 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method342() {
        this.field1039 = 0;
        this.field1040 = null;
        this.field1041 = null;
        this.field1042 = null;
        this.field1043 = null;
        this.field1044 = 2000;
        this.field1045 = 0;
        this.field1046 = 0;
        this.field1047 = 0;
        this.field1048 = 0;
        this.field1049 = 0;
        this.field1050 = -1;
        this.field1051 = false;
        this.field1052 = 1;
        this.field1053 = false;
        this.field1054 = null;
        this.field1055 = null;
        this.field1056 = -1;
        this.field1057 = -1;
        this.field1058 = 0;
        this.field1059 = -1;
        this.field1060 = -1;
        this.field1061 = 0;
        this.field1062 = -1;
        this.field1063 = -1;
        this.field1064 = -1;
        this.field1065 = -1;
        this.field1066 = -1;
        this.field1067 = -1;
        this.field1068 = null;
        this.field1069 = null;
        this.field1070 = -1;
        this.field1071 = -1;
        this.field1072 = 128;
        this.field1073 = 128;
        this.field1074 = 128;
        this.field1075 = 0;
        this.field1076 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Llb;I)V")
    public final void method343(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method224();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1039 = arg0.method226();
                } else if (var4 == 2) {
                    this.field1040 = arg0.method231();
                } else if (var4 == 3) {
                    this.field1041 = arg0.method232(-399);
                } else if (var4 == 4) {
                    this.field1044 = arg0.method226();
                } else if (var4 == 5) {
                    this.field1045 = arg0.method226();
                } else if (var4 == 6) {
                    this.field1046 = arg0.method226();
                } else if (var4 == 7) {
                    this.field1048 = arg0.method226();
                    if (this.field1048 > 32767) {
                        this.field1048 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1049 = arg0.method226();
                    if (this.field1049 > 32767) {
                        this.field1049 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1050 = arg0.method226();
                } else if (var4 == 11) {
                    this.field1051 = true;
                } else if (var4 == 12) {
                    this.field1052 = arg0.method229();
                } else if (var4 == 16) {
                    this.field1053 = true;
                } else if (var4 == 23) {
                    this.field1056 = arg0.method226();
                    this.field1058 = arg0.method225();
                } else if (var4 == 24) {
                    this.field1057 = arg0.method226();
                } else if (var4 == 25) {
                    this.field1059 = arg0.method226();
                    this.field1061 = arg0.method225();
                } else if (var4 == 26) {
                    this.field1060 = arg0.method226();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1054 == null) {
                        this.field1054 = new String[5];
                    }
                    this.field1054[var4 - 30] = arg0.method231();
                    if (this.field1054[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1054[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1055 == null) {
                        this.field1055 = new String[5];
                    }
                    this.field1055[var4 - 35] = arg0.method231();
                } else if (var4 == 40) {
                    int var5 = arg0.method224();
                    this.field1042 = new int[var5];
                    this.field1043 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1042[var6] = arg0.method226();
                        this.field1043[var6] = arg0.method226();
                    }
                } else if (var4 == 78) {
                    this.field1062 = arg0.method226();
                } else if (var4 == 79) {
                    this.field1063 = arg0.method226();
                } else if (var4 == 90) {
                    this.field1064 = arg0.method226();
                } else if (var4 == 91) {
                    this.field1066 = arg0.method226();
                } else if (var4 == 92) {
                    this.field1065 = arg0.method226();
                } else if (var4 == 93) {
                    this.field1067 = arg0.method226();
                } else if (var4 == 95) {
                    this.field1047 = arg0.method226();
                } else if (var4 == 97) {
                    this.field1070 = arg0.method226();
                } else if (var4 == 98) {
                    this.field1071 = arg0.method226();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1068 == null) {
                        this.field1068 = new int[10];
                        this.field1069 = new int[10];
                    }
                    this.field1068[var4 - 100] = arg0.method226();
                    this.field1069[var4 - 100] = arg0.method226();
                } else if (var4 == 110) {
                    this.field1072 = arg0.method226();
                } else if (var4 == 111) {
                    this.field1073 = arg0.method226();
                } else if (var4 == 112) {
                    this.field1074 = arg0.method226();
                } else if (var4 == 113) {
                    this.field1075 = arg0.method225();
                } else if (var4 == 114) {
                    this.field1076 = arg0.method225() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)V")
    public void method344(int arg0) {
        ObjType var2 = method341(this.field1071);
        if (arg0 < 0 || arg0 > 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1039 = var2.field1039;
        this.field1044 = var2.field1044;
        this.field1045 = var2.field1045;
        this.field1046 = var2.field1046;
        this.field1047 = var2.field1047;
        this.field1048 = var2.field1048;
        this.field1049 = var2.field1049;
        this.field1042 = var2.field1042;
        this.field1043 = var2.field1043;
        ObjType var4 = method341(this.field1070);
        this.field1040 = var4.field1040;
        this.field1053 = var4.field1053;
        this.field1052 = var4.field1052;
        String var5 = "a";
        char var6 = var4.field1040.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var5 = "an";
        }
        this.field1041 = ("Swap this note at any bank for " + var5 + " " + var4.field1040 + ".").getBytes();
        this.field1051 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Leb;")
    public final Model method345(int arg0) {
        if (this.field1068 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1069[var3] && this.field1069[var3] != 0) {
                    var2 = this.field1068[var3];
                }
            }
            if (var2 != -1) {
                return method341(var2).method345(1);
            }
        }
        Model var4 = (Model) field1077.method101((long) this.field1038);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method125(this.field1029, this.field1039);
        if (var5 == null) {
            return null;
        }
        if (this.field1072 != 128 || this.field1073 != 128 || this.field1074 != 128) {
            var5.method141(this.field1074, this.field1073, 9, this.field1072);
        }
        if (this.field1042 != null) {
            for (int var6 = 0; var6 < this.field1042.length; var6++) {
                var5.method139(this.field1042[var6], this.field1043[var6]);
            }
        }
        var5.method142(this.field1075 + 64, this.field1076 + 768, -50, -10, -50, true);
        var5.field565 = true;
        field1077.method102((long) this.field1038, var5, field1031);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Leb;")
    public final Model method346(int arg0, int arg1) {
        if (this.field1068 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1069[var4] && this.field1069[var4] != 0) {
                    var3 = this.field1068[var4];
                }
            }
            if (var3 != -1) {
                return method341(var3).method346(577, 1);
            }
        }
        Model var5 = Model.method125(this.field1029, this.field1039);
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (var5 == null) {
            return null;
        } else {
            if (this.field1042 != null) {
                for (int var6 = 0; var6 < this.field1042.length; var6++) {
                    var5.method139(this.field1042[var6], this.field1043[var6]);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Lib;")
    public static final Pix32 method347(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 4302) {
            field1028 = !field1028;
        }
        if (arg1 == 0) {
            Pix32 var4 = (Pix32) field1078.method101((long) arg0);
            if (var4 != null && var4.field664 != arg3 && var4.field664 != -1) {
                var4.method106();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method341(arg0);
        if (var5.field1068 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field1069[var7] && var5.field1069[var7] != 0) {
                    var6 = var5.field1068[var7];
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
        if (var5.field1071 != -1) {
            var9 = method347(var5.field1070, -1, 4302, 10);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field634;
        int var12 = Pix3D.field635;
        int[] var13 = Pix3D.field640;
        int[] var14 = Pix2D.field614;
        int var15 = Pix2D.field615;
        int var16 = Pix2D.field616;
        int var17 = Pix2D.field619;
        int var18 = Pix2D.field620;
        int var19 = Pix2D.field617;
        int var20 = Pix2D.field618;
        Pix3D.field632 = false;
        Pix2D.method151(var10.field658, 32, 32, -578);
        Pix2D.method156(0, 32, 0, 0, 32, 0);
        Pix3D.method164(0);
        int var21 = var5.field1044;
        if (arg1 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg1 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field638[var5.field1045] * var21 >> 16;
        int var23 = Pix3D.field639[var5.field1045] * var21 >> 16;
        var8.method145(0, var5.field1046, var5.field1047, var5.field1045, var5.field1048, var8.field389 / 2 + var22 + var5.field1049, var5.field1049 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field658[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field658[var31 * 32 + var24 - 1] > 1) {
                        var10.field658[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field658[(var31 - 1) * 32 + var24] > 1) {
                        var10.field658[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field658[var31 * 32 + var24 + 1] > 1) {
                        var10.field658[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field658[(var31 + 1) * 32 + var24] > 1) {
                        var10.field658[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field658[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field658[var26 * 32 + var25 - 1] == 1) {
                            var10.field658[var26 * 32 + var25] = arg1;
                        } else if (var26 > 0 && var10.field658[(var26 - 1) * 32 + var25] == 1) {
                            var10.field658[var26 * 32 + var25] = arg1;
                        } else if (var25 < 31 && var10.field658[var26 * 32 + var25 + 1] == 1) {
                            var10.field658[var26 * 32 + var25] = arg1;
                        } else if (var26 < 31 && var10.field658[(var26 + 1) * 32 + var25] == 1) {
                            var10.field658[var26 * 32 + var25] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field658[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field658[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field658[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1071 != -1) {
            int var29 = var9.field663;
            int var30 = var9.field664;
            var9.field663 = 32;
            var9.field664 = 32;
            var9.method185(0, 0, 0);
            var9.field663 = var29;
            var9.field664 = var30;
        }
        if (arg1 == 0) {
            field1078.method102((long) arg0, var10, field1031);
        }
        Pix2D.method151(var14, var16, var15, -578);
        Pix2D.method153(0, var17, var18, var19, var20);
        Pix3D.field634 = var11;
        Pix3D.field635 = var12;
        Pix3D.field640 = var13;
        Pix3D.field632 = true;
        if (var5.field1051) {
            var10.field663 = 33;
        } else {
            var10.field663 = 32;
        }
        var10.field664 = arg3;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Z")
    public final boolean method348(int arg0, int arg1) {
        int var3 = this.field1056;
        int var4 = this.field1057;
        int var5 = this.field1062;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1059;
            var4 = this.field1060;
            var5 = this.field1063;
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

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Leb;")
    public final Model method349(int arg0, byte arg1) {
        int var3 = this.field1056;
        int var4 = this.field1057;
        int var5 = this.field1062;
        if (arg0 == 1) {
            var3 = this.field1059;
            var4 = this.field1060;
            var5 = this.field1063;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method125(this.field1029, var3);
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method125(this.field1029, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(2, var11, this.field1030);
            } else {
                Model var7 = Model.method125(this.field1029, var4);
                Model var8 = Model.method125(this.field1029, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(3, var9, this.field1030);
            }
        }
        if (arg0 == 0 && this.field1058 != 0) {
            var6.method138(0, this.field1058, 0, -97);
        }
        if (arg0 == 1 && this.field1061 != 0) {
            var6.method138(0, this.field1061, 0, -97);
        }
        if (this.field1042 != null) {
            for (int var12 = 0; var12 < this.field1042.length; var12++) {
                var6.method139(this.field1042[var12], this.field1043[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method350(int arg0, int arg1) {
        int var3 = this.field1064;
        int var4 = this.field1065;
        if (arg1 >= 0) {
            field1031 = 41;
        }
        if (arg0 == 1) {
            var3 = this.field1066;
            var4 = this.field1067;
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

    @OriginalMember(owner = "hc", name = "d", descriptor = "(II)Leb;")
    public final Model method351(int arg0, int arg1) {
        int var3 = this.field1064;
        int var4 = this.field1065;
        if (arg1 != 3216) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field1066;
            var4 = this.field1067;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method125(this.field1029, var3);
        if (var4 != -1) {
            Model var6 = Model.method125(this.field1029, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, var7, this.field1030);
        }
        if (this.field1042 != null) {
            for (int var8 = 0; var8 < this.field1042.length; var8++) {
                var5.method139(this.field1042[var8], this.field1043[var8]);
            }
        }
        return var5;
    }
}
