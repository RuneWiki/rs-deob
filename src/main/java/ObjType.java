import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private int field1022 = 8;

    @OriginalMember(owner = "hc", name = "c", descriptor = "Z")
    private boolean field1024 = false;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    private int field1025 = -123;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "hc", name = "j", descriptor = "Z")
    public static boolean field1031 = true;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Lt;")
    public static LruCache field1072 = new LruCache(50, (byte) 3);

    @OriginalMember(owner = "hc", name = "Z", descriptor = "Lt;")
    public static LruCache field1073 = new LruCache(100, (byte) 3);

    @OriginalMember(owner = "hc", name = "F", descriptor = "B")
    private byte field1053;

    @OriginalMember(owner = "hc", name = "I", descriptor = "B")
    private byte field1056;

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private static int field1023;

    @OriginalMember(owner = "hc", name = "e", descriptor = "I")
    private static int field1026;

    @OriginalMember(owner = "hc", name = "i", descriptor = "I")
    private static int field1030;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "hc", name = "z", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "hc", name = "g", descriptor = "Lmb;")
    private static Packet field1028;

    @OriginalMember(owner = "hc", name = "m", descriptor = "Ljava/lang/String;")
    public String field1034;

    @OriginalMember(owner = "hc", name = "w", descriptor = "Z")
    private boolean field1044;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1046;

    @OriginalMember(owner = "hc", name = "A", descriptor = "Z")
    public boolean field1048;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[B")
    public byte[] field1035;

    @OriginalMember(owner = "hc", name = "f", descriptor = "[I")
    private static int[] field1027;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[I")
    private int[] field1036;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1037;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1063;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "[I")
    public int[] field1064;

    @OriginalMember(owner = "hc", name = "h", descriptor = "[Lhc;")
    private static ObjType[] field1029;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1049;

    @OriginalMember(owner = "hc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1050;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lyb;)V")
    public static final void method346(Jagfile arg0) {
        field1028 = new Packet(arg0.method308("obj.dat", null), false);
        Packet var1 = new Packet(arg0.method308("obj.idx", null), false);
        field1026 = var1.method240();
        field1027 = new int[field1026];
        int var2 = 2;
        for (int var3 = 0; var3 < field1026; var3++) {
            field1027[var3] = var2;
            var2 += var1.method240();
        }
        field1029 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1029[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(B)V")
    public static final void method347(byte arg0) {
        if (arg0 == 6) {
            boolean var1 = false;
        } else {
            field1023 = -279;
        }
        field1072 = null;
        field1073 = null;
        field1027 = null;
        field1029 = null;
        field1028 = null;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method348(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1029[var1].field1032 == arg0) {
                return field1029[var1];
            }
        }
        field1030 = (field1030 + 1) % 10;
        ObjType var2 = field1029[field1030];
        field1028.field713 = field1027[arg0];
        var2.field1032 = arg0;
        var2.method349();
        var2.method350(true, field1028);
        if (var2.field1066 != -1) {
            var2.method351(false);
        }
        if (!field1031 && var2.field1048) {
            var2.field1034 = "Members Object";
            var2.field1035 = "Login to a members' server to use this object.".getBytes();
            var2.field1049 = null;
            var2.field1050 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method349() {
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
        this.field1044 = false;
        this.field1045 = -1;
        this.field1046 = false;
        this.field1047 = 1;
        this.field1048 = false;
        this.field1049 = null;
        this.field1050 = null;
        this.field1051 = -1;
        this.field1052 = -1;
        this.field1053 = 0;
        this.field1054 = -1;
        this.field1055 = -1;
        this.field1056 = 0;
        this.field1057 = -1;
        this.field1058 = -1;
        this.field1059 = -1;
        this.field1060 = -1;
        this.field1061 = -1;
        this.field1062 = -1;
        this.field1063 = null;
        this.field1064 = null;
        this.field1065 = -1;
        this.field1066 = -1;
        this.field1067 = 128;
        this.field1068 = 128;
        this.field1069 = 128;
        this.field1070 = 0;
        this.field1071 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZLmb;)V")
    public final void method350(boolean arg0, Packet arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1033 = arg1.method240();
                } else if (var4 == 2) {
                    this.field1034 = arg1.method245();
                } else if (var4 == 3) {
                    this.field1035 = arg1.method246(this.field1022);
                } else if (var4 == 4) {
                    this.field1038 = arg1.method240();
                } else if (var4 == 5) {
                    this.field1039 = arg1.method240();
                } else if (var4 == 6) {
                    this.field1040 = arg1.method240();
                } else if (var4 == 7) {
                    this.field1042 = arg1.method240();
                    if (this.field1042 > 32767) {
                        this.field1042 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1043 = arg1.method240();
                    if (this.field1043 > 32767) {
                        this.field1043 -= 65536;
                    }
                } else if (var4 == 9) {
                    this.field1044 = true;
                } else if (var4 == 10) {
                    this.field1045 = arg1.method240();
                } else if (var4 == 11) {
                    this.field1046 = true;
                } else if (var4 == 12) {
                    this.field1047 = arg1.method243();
                } else if (var4 == 16) {
                    this.field1048 = true;
                } else if (var4 == 23) {
                    this.field1051 = arg1.method240();
                    this.field1053 = arg1.method239();
                } else if (var4 == 24) {
                    this.field1052 = arg1.method240();
                } else if (var4 == 25) {
                    this.field1054 = arg1.method240();
                    this.field1056 = arg1.method239();
                } else if (var4 == 26) {
                    this.field1055 = arg1.method240();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1049 == null) {
                        this.field1049 = new String[5];
                    }
                    this.field1049[var4 - 30] = arg1.method245();
                    if (this.field1049[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1049[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1050 == null) {
                        this.field1050 = new String[5];
                    }
                    this.field1050[var4 - 35] = arg1.method245();
                } else if (var4 == 40) {
                    int var5 = arg1.method238();
                    this.field1036 = new int[var5];
                    this.field1037 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1036[var6] = arg1.method240();
                        this.field1037[var6] = arg1.method240();
                    }
                } else if (var4 == 78) {
                    this.field1057 = arg1.method240();
                } else if (var4 == 79) {
                    this.field1058 = arg1.method240();
                } else if (var4 == 90) {
                    this.field1059 = arg1.method240();
                } else if (var4 == 91) {
                    this.field1061 = arg1.method240();
                } else if (var4 == 92) {
                    this.field1060 = arg1.method240();
                } else if (var4 == 93) {
                    this.field1062 = arg1.method240();
                } else if (var4 == 95) {
                    this.field1041 = arg1.method240();
                } else if (var4 == 97) {
                    this.field1065 = arg1.method240();
                } else if (var4 == 98) {
                    this.field1066 = arg1.method240();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1063 == null) {
                        this.field1063 = new int[10];
                        this.field1064 = new int[10];
                    }
                    this.field1063[var4 - 100] = arg1.method240();
                    this.field1064[var4 - 100] = arg1.method240();
                } else if (var4 == 110) {
                    this.field1067 = arg1.method240();
                } else if (var4 == 111) {
                    this.field1068 = arg1.method240();
                } else if (var4 == 112) {
                    this.field1069 = arg1.method240();
                } else if (var4 == 113) {
                    this.field1070 = arg1.method239();
                } else if (var4 == 114) {
                    this.field1071 = arg1.method239() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public void method351(boolean arg0) {
        if (arg0) {
            return;
        }
        ObjType var2 = method348(this.field1066);
        this.field1033 = var2.field1033;
        this.field1038 = var2.field1038;
        this.field1039 = var2.field1039;
        this.field1040 = var2.field1040;
        this.field1041 = var2.field1041;
        this.field1042 = var2.field1042;
        this.field1043 = var2.field1043;
        this.field1036 = var2.field1036;
        this.field1037 = var2.field1037;
        ObjType var3 = method348(this.field1065);
        this.field1034 = var3.field1034;
        this.field1048 = var3.field1048;
        this.field1047 = var3.field1047;
        String var4 = "a";
        char var5 = var3.field1034.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1035 = ("Swap this note at any bank for " + var4 + " " + var3.field1034 + ".").getBytes();
        this.field1046 = true;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lfb;")
    public final Model method352(int arg0) {
        if (this.field1063 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1064[var3] && this.field1064[var3] != 0) {
                    var2 = this.field1063[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method352(1);
            }
        }
        Model var4 = (Model) field1072.method114((long) this.field1032);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method138(this.field1033, -58);
        if (var5 == null) {
            return null;
        }
        if (this.field1067 != 128 || this.field1068 != 128 || this.field1069 != 128) {
            var5.method154(this.field1067, this.field1069, this.field1068, 7);
        }
        if (this.field1036 != null) {
            for (int var6 = 0; var6 < this.field1036.length; var6++) {
                var5.method152(this.field1036[var6], this.field1037[var6]);
            }
        }
        var5.method155(this.field1070 + 64, this.field1071 + 768, -50, -10, -50, true);
        var5.field583 = true;
        field1072.method115(false, var5, (long) this.field1032);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Lfb;")
    public final Model method353(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field1024 = !this.field1024;
        }
        if (this.field1063 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1064[var4] && this.field1064[var4] != 0) {
                    var3 = this.field1063[var4];
                }
            }
            if (var3 != -1) {
                return method348(var3).method353(-123, 1);
            }
        }
        Model var5 = Model.method138(this.field1033, -58);
        if (var5 == null) {
            return null;
        }
        if (this.field1036 != null) {
            for (int var6 = 0; var6 < this.field1036.length; var6++) {
                var5.method152(this.field1036[var6], this.field1037[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Ljb;")
    public static final Pix32 method354(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            Pix32 var4 = (Pix32) field1073.method114((long) arg3);
            if (var4 != null && var4.field676 != arg2 && var4.field676 != -1) {
                var4.method119();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method348(arg3);
        if (var5.field1063 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg2 >= var5.field1064[var7] && var5.field1064[var7] != 0) {
                    var6 = var5.field1063[var7];
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
        if (var5.field1066 != -1) {
            var9 = method354(-1, 517, 10, var5.field1065);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field649;
        int var12 = Pix3D.field650;
        int[] var13 = Pix3D.field655;
        int[] var14 = Pix2D.field630;
        int var15 = Pix2D.field631;
        int var16 = Pix2D.field632;
        int var17 = Pix2D.field635;
        int var18 = Pix2D.field636;
        int var19 = Pix2D.field633;
        int var20 = Pix2D.field634;
        Pix3D.field647 = false;
        Pix2D.method164(var10.field670, -258, 32, 32);
        Pix2D.method169(-556, 0, 32, 0, 32, 0);
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        Pix3D.method177(false);
        int var21 = var5.field1038;
        if (arg0 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg0 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field653[var5.field1039] * var21 >> 16;
        int var23 = Pix3D.field654[var5.field1039] * var21 >> 16;
        var8.method158(0, var5.field1040, var5.field1041, var5.field1039, var5.field1042, var8.field410 / 2 + var22 + var5.field1043, var5.field1043 + var23);
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
        if (arg0 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field670[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field670[var26 * 32 + var25 - 1] == 1) {
                            var10.field670[var26 * 32 + var25] = arg0;
                        } else if (var26 > 0 && var10.field670[(var26 - 1) * 32 + var25] == 1) {
                            var10.field670[var26 * 32 + var25] = arg0;
                        } else if (var25 < 31 && var10.field670[var26 * 32 + var25 + 1] == 1) {
                            var10.field670[var26 * 32 + var25] = arg0;
                        } else if (var26 < 31 && var10.field670[(var26 + 1) * 32 + var25] == 1) {
                            var10.field670[var26 * 32 + var25] = arg0;
                        }
                    }
                }
            }
        } else if (arg0 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field670[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field670[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field670[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1066 != -1) {
            int var29 = var9.field675;
            int var30 = var9.field676;
            var9.field675 = 32;
            var9.field676 = 32;
            var9.method198(0, 200, 0);
            var9.field675 = var29;
            var9.field676 = var30;
        }
        if (arg0 == 0) {
            field1073.method115(false, var10, (long) arg3);
        }
        Pix2D.method164(var14, -258, var15, var16);
        Pix2D.method166(5, var19, var18, var20, var17);
        Pix3D.field649 = var11;
        Pix3D.field650 = var12;
        Pix3D.field655 = var13;
        Pix3D.field647 = true;
        if (var5.field1046) {
            var10.field675 = 33;
        } else {
            var10.field675 = 32;
        }
        var10.field676 = arg2;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Z")
    public final boolean method355(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1051;
        int var5 = this.field1052;
        int var6 = this.field1057;
        if (arg1 == 1) {
            var4 = this.field1054;
            var5 = this.field1055;
            var6 = this.field1058;
        }
        if (var4 == -1) {
            return true;
        }
        boolean var7 = true;
        if (!Model.method139(var4)) {
            var7 = false;
        }
        if (var5 != -1 && !Model.method139(var5)) {
            var7 = false;
        }
        if (var6 != -1 && !Model.method139(var6)) {
            var7 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Lfb;")
    public final Model method356(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        int var3 = this.field1051;
        int var4 = this.field1052;
        int var5 = this.field1057;
        if (arg0 == 1) {
            var3 = this.field1054;
            var4 = this.field1055;
            var5 = this.field1058;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method138(var3, -58);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method138(var4, -58);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(false, var11, 2);
            } else {
                Model var7 = Model.method138(var4, -58);
                Model var8 = Model.method138(var5, -58);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(false, var9, 3);
            }
        }
        if (arg0 == 0 && this.field1053 != 0) {
            var6.method151(0, (byte) 3, 0, this.field1053);
        }
        if (arg0 == 1 && this.field1056 != 0) {
            var6.method151(0, (byte) 3, 0, this.field1056);
        }
        if (this.field1036 != null) {
            for (int var12 = 0; var12 < this.field1036.length; var12++) {
                var6.method152(this.field1036[var12], this.field1037[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method357(int arg0, int arg1) {
        int var3 = this.field1059;
        int var4 = this.field1060;
        if (arg0 == 1) {
            var3 = this.field1061;
            var4 = this.field1062;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        int var6 = 83 / arg1;
        if (!Model.method139(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method139(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "d", descriptor = "(II)Lfb;")
    public final Model method358(int arg0, int arg1) {
        int var3 = this.field1059;
        int var4 = this.field1060;
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 == 1) {
            var3 = this.field1061;
            var4 = this.field1062;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method138(var3, -58);
        if (var4 != -1) {
            Model var7 = Model.method138(var4, -58);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(false, var8, 2);
        }
        if (this.field1036 != null) {
            for (int var9 = 0; var9 < this.field1036.length; var9++) {
                var6.method152(this.field1036[var9], this.field1037[var9]);
            }
        }
        return var6;
    }
}
