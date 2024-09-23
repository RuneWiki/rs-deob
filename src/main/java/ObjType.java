import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private int field1018 = -24461;

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private boolean field1019 = true;

    @OriginalMember(owner = "hc", name = "d", descriptor = "Z")
    private boolean field1021 = true;

    @OriginalMember(owner = "hc", name = "f", descriptor = "I")
    private int field1023 = 8;

    @OriginalMember(owner = "hc", name = "m", descriptor = "I")
    public int field1030 = -1;

    @OriginalMember(owner = "hc", name = "c", descriptor = "Z")
    private static boolean field1020 = true;

    @OriginalMember(owner = "hc", name = "e", descriptor = "B")
    private static byte field1022 = 67;

    @OriginalMember(owner = "hc", name = "l", descriptor = "Z")
    public static boolean field1029 = true;

    @OriginalMember(owner = "hc", name = "Z", descriptor = "Lt;")
    public static LruCache field1069 = new LruCache(50, 0);

    @OriginalMember(owner = "hc", name = "ab", descriptor = "Lt;")
    public static LruCache field1070 = new LruCache(100, 0);

    @OriginalMember(owner = "hc", name = "G", descriptor = "B")
    private byte field1050;

    @OriginalMember(owner = "hc", name = "J", descriptor = "B")
    private byte field1053;

    @OriginalMember(owner = "hc", name = "g", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "hc", name = "k", descriptor = "I")
    private static int field1028;

    @OriginalMember(owner = "hc", name = "n", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "hc", name = "y", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "hc", name = "A", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Lmb;")
    private static Packet field1026;

    @OriginalMember(owner = "hc", name = "o", descriptor = "Ljava/lang/String;")
    public String field1032;

    @OriginalMember(owner = "hc", name = "z", descriptor = "Z")
    public boolean field1043;

    @OriginalMember(owner = "hc", name = "B", descriptor = "Z")
    public boolean field1045;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[B")
    public byte[] field1033;

    @OriginalMember(owner = "hc", name = "h", descriptor = "[I")
    private static int[] field1025;

    @OriginalMember(owner = "hc", name = "q", descriptor = "[I")
    private int[] field1034;

    @OriginalMember(owner = "hc", name = "r", descriptor = "[I")
    private int[] field1035;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "[I")
    public int[] field1060;

    @OriginalMember(owner = "hc", name = "R", descriptor = "[I")
    public int[] field1061;

    @OriginalMember(owner = "hc", name = "j", descriptor = "[Lhc;")
    private static ObjType[] field1027;

    @OriginalMember(owner = "hc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1046;

    @OriginalMember(owner = "hc", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field1047;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lyb;)V")
    public static final void method348(Jagfile arg0) {
        field1026 = new Packet(16, arg0.method309("obj.dat", null));
        Packet var1 = new Packet(16, arg0.method309("obj.idx", null));
        field1024 = var1.method241();
        field1025 = new int[field1024];
        int var2 = 2;
        for (int var3 = 0; var3 < field1024; var3++) {
            field1025[var3] = var2;
            var2 += var1.method241();
        }
        field1027 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1027[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public static final void method349(boolean arg0) {
        field1069 = null;
        field1070 = null;
        field1025 = null;
        field1027 = null;
        if (!arg0) {
            field1026 = null;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method350(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1027[var1].field1030 == arg0) {
                return field1027[var1];
            }
        }
        field1028 = (field1028 + 1) % 10;
        ObjType var2 = field1027[field1028];
        field1026.field717 = field1025[arg0];
        var2.field1030 = arg0;
        var2.method351();
        var2.method352(891, field1026);
        if (var2.field1063 != -1) {
            var2.method353(-336);
        }
        if (!field1029 && var2.field1045) {
            var2.field1032 = "Members Object";
            var2.field1033 = "Login to a members' server to use this object.".getBytes();
            var2.field1046 = null;
            var2.field1047 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method351() {
        this.field1031 = 0;
        this.field1032 = null;
        this.field1033 = null;
        this.field1034 = null;
        this.field1035 = null;
        this.field1036 = 2000;
        this.field1037 = 0;
        this.field1038 = 0;
        this.field1039 = 0;
        this.field1040 = 0;
        this.field1041 = 0;
        this.field1042 = -1;
        this.field1043 = false;
        this.field1044 = 1;
        this.field1045 = false;
        this.field1046 = null;
        this.field1047 = null;
        this.field1048 = -1;
        this.field1049 = -1;
        this.field1050 = 0;
        this.field1051 = -1;
        this.field1052 = -1;
        this.field1053 = 0;
        this.field1054 = -1;
        this.field1055 = -1;
        this.field1056 = -1;
        this.field1057 = -1;
        this.field1058 = -1;
        this.field1059 = -1;
        this.field1060 = null;
        this.field1061 = null;
        this.field1062 = -1;
        this.field1063 = -1;
        this.field1064 = 128;
        this.field1065 = 128;
        this.field1066 = 128;
        this.field1067 = 0;
        this.field1068 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ILmb;)V")
    public final void method352(int arg0, Packet arg1) {
        int var3 = 32 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1031 = arg1.method241();
                } else if (var4 == 2) {
                    this.field1032 = arg1.method246();
                } else if (var4 == 3) {
                    this.field1033 = arg1.method247(-34736);
                } else if (var4 == 4) {
                    this.field1036 = arg1.method241();
                } else if (var4 == 5) {
                    this.field1037 = arg1.method241();
                } else if (var4 == 6) {
                    this.field1038 = arg1.method241();
                } else if (var4 == 7) {
                    this.field1040 = arg1.method241();
                    if (this.field1040 > 32767) {
                        this.field1040 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1041 = arg1.method241();
                    if (this.field1041 > 32767) {
                        this.field1041 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1042 = arg1.method241();
                } else if (var4 == 11) {
                    this.field1043 = true;
                } else if (var4 == 12) {
                    this.field1044 = arg1.method244();
                } else if (var4 == 16) {
                    this.field1045 = true;
                } else if (var4 == 23) {
                    this.field1048 = arg1.method241();
                    this.field1050 = arg1.method240();
                } else if (var4 == 24) {
                    this.field1049 = arg1.method241();
                } else if (var4 == 25) {
                    this.field1051 = arg1.method241();
                    this.field1053 = arg1.method240();
                } else if (var4 == 26) {
                    this.field1052 = arg1.method241();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1046 == null) {
                        this.field1046 = new String[5];
                    }
                    this.field1046[var4 - 30] = arg1.method246();
                    if (this.field1046[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1046[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1047 == null) {
                        this.field1047 = new String[5];
                    }
                    this.field1047[var4 - 35] = arg1.method246();
                } else if (var4 == 40) {
                    int var5 = arg1.method239();
                    this.field1034 = new int[var5];
                    this.field1035 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1034[var6] = arg1.method241();
                        this.field1035[var6] = arg1.method241();
                    }
                } else if (var4 == 78) {
                    this.field1054 = arg1.method241();
                } else if (var4 == 79) {
                    this.field1055 = arg1.method241();
                } else if (var4 == 90) {
                    this.field1056 = arg1.method241();
                } else if (var4 == 91) {
                    this.field1058 = arg1.method241();
                } else if (var4 == 92) {
                    this.field1057 = arg1.method241();
                } else if (var4 == 93) {
                    this.field1059 = arg1.method241();
                } else if (var4 == 95) {
                    this.field1039 = arg1.method241();
                } else if (var4 == 97) {
                    this.field1062 = arg1.method241();
                } else if (var4 == 98) {
                    this.field1063 = arg1.method241();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1060 == null) {
                        this.field1060 = new int[10];
                        this.field1061 = new int[10];
                    }
                    this.field1060[var4 - 100] = arg1.method241();
                    this.field1061[var4 - 100] = arg1.method241();
                } else if (var4 == 110) {
                    this.field1064 = arg1.method241();
                } else if (var4 == 111) {
                    this.field1065 = arg1.method241();
                } else if (var4 == 112) {
                    this.field1066 = arg1.method241();
                } else if (var4 == 113) {
                    this.field1067 = arg1.method240();
                } else if (var4 == 114) {
                    this.field1068 = arg1.method240() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)V")
    public void method353(int arg0) {
        ObjType var2 = method350(this.field1063);
        this.field1031 = var2.field1031;
        this.field1036 = var2.field1036;
        this.field1037 = var2.field1037;
        this.field1038 = var2.field1038;
        this.field1039 = var2.field1039;
        while (arg0 >= 0) {
            this.field1021 = !this.field1021;
        }
        this.field1040 = var2.field1040;
        this.field1041 = var2.field1041;
        this.field1034 = var2.field1034;
        this.field1035 = var2.field1035;
        ObjType var3 = method350(this.field1062);
        this.field1032 = var3.field1032;
        this.field1045 = var3.field1045;
        this.field1044 = var3.field1044;
        String var4 = "a";
        char var5 = var3.field1032.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1033 = ("Swap this note at any bank for " + var4 + " " + var3.field1032 + ".").getBytes();
        this.field1043 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Lfb;")
    public final Model method354(int arg0) {
        if (this.field1060 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1061[var3] && this.field1061[var3] != 0) {
                    var2 = this.field1060[var3];
                }
            }
            if (var2 != -1) {
                return method350(var2).method354(1);
            }
        }
        Model var4 = (Model) field1069.method115((long) this.field1030);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method139(this.field1019, this.field1031);
        if (var5 == null) {
            return null;
        }
        if (this.field1064 != 128 || this.field1065 != 128 || this.field1066 != 128) {
            var5.method155(this.field1064, (byte) 9, this.field1066, this.field1065);
        }
        if (this.field1034 != null) {
            for (int var6 = 0; var6 < this.field1034.length; var6++) {
                var5.method153(this.field1034[var6], this.field1035[var6]);
            }
        }
        var5.method156(this.field1067 + 64, this.field1068 + 768, -50, -10, -50, true);
        var5.field578 = true;
        field1069.method116(var5, (long) this.field1030, field1022);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Lfb;")
    public final Model method355(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1018 = -112;
        }
        if (this.field1060 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1061[var4] && this.field1061[var4] != 0) {
                    var3 = this.field1060[var4];
                }
            }
            if (var3 != -1) {
                return method350(var3).method355(0, 1);
            }
        }
        Model var5 = Model.method139(this.field1019, this.field1031);
        if (var5 == null) {
            return null;
        }
        if (this.field1034 != null) {
            for (int var6 = 0; var6 < this.field1034.length; var6++) {
                var5.method153(this.field1034[var6], this.field1035[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Ljb;")
    public static final Pix32 method356(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            Pix32 var4 = (Pix32) field1070.method115((long) arg1);
            if (var4 != null && var4.field675 != arg0 && var4.field675 != -1) {
                var4.method120();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method350(arg1);
        if (var5.field1060 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg0 >= var5.field1061[var7] && var5.field1061[var7] != 0) {
                    var6 = var5.field1060[var7];
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
        if (var5.field1063 != -1) {
            var9 = method356(10, var5.field1062, -1, 0);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field646;
        int var12 = Pix3D.field647;
        int[] var13 = Pix3D.field652;
        int[] var14 = Pix2D.field627;
        int var15 = Pix2D.field628;
        int var16 = Pix2D.field629;
        int var17 = Pix2D.field632;
        int var18 = Pix2D.field633;
        int var19 = Pix2D.field630;
        int var20 = Pix2D.field631;
        Pix3D.field644 = false;
        Pix2D.method165(32, var10.field669, 32, field1020);
        Pix2D.method170(33027, 0, 32, 0, 32, 0);
        Pix3D.method178(24380);
        int var21 = var5.field1036;
        if (arg2 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg2 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field650[var5.field1037] * var21 >> 16;
        int var23 = Pix3D.field651[var5.field1037] * var21 >> 16;
        var8.method159(0, var5.field1038, var5.field1039, var5.field1037, var5.field1040, var8.field406 / 2 + var22 + var5.field1041, var5.field1041 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var10.field669[var32 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field669[var32 * 32 + var24 - 1] > 1) {
                        var10.field669[var32 * 32 + var24] = 1;
                    } else if (var32 > 0 && var10.field669[(var32 - 1) * 32 + var24] > 1) {
                        var10.field669[var32 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field669[var32 * 32 + var24 + 1] > 1) {
                        var10.field669[var32 * 32 + var24] = 1;
                    } else if (var32 < 31 && var10.field669[(var32 + 1) * 32 + var24] > 1) {
                        var10.field669[var32 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field669[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field669[var26 * 32 + var25 - 1] == 1) {
                            var10.field669[var26 * 32 + var25] = arg2;
                        } else if (var26 > 0 && var10.field669[(var26 - 1) * 32 + var25] == 1) {
                            var10.field669[var26 * 32 + var25] = arg2;
                        } else if (var25 < 31 && var10.field669[var26 * 32 + var25 + 1] == 1) {
                            var10.field669[var26 * 32 + var25] = arg2;
                        } else if (var26 < 31 && var10.field669[(var26 + 1) * 32 + var25] == 1) {
                            var10.field669[var26 * 32 + var25] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field669[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field669[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field669[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1063 != -1) {
            int var29 = var9.field674;
            int var30 = var9.field675;
            var9.field674 = 32;
            var9.field675 = 32;
            var9.method199(0, -48420, 0);
            var9.field674 = var29;
            var9.field675 = var30;
        }
        if (arg2 == 0) {
            field1070.method116(var10, (long) arg1, field1022);
        }
        Pix2D.method165(var16, var14, var15, field1020);
        Pix2D.method167(var19, var17, var20, 0, var18);
        Pix3D.field646 = var11;
        Pix3D.field647 = var12;
        if (arg3 != 0) {
            for (int var31 = 1; var31 > 0; var31++) {
            }
        }
        Pix3D.field652 = var13;
        Pix3D.field644 = true;
        if (var5.field1043) {
            var10.field674 = 33;
        } else {
            var10.field674 = 32;
        }
        var10.field675 = arg0;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IZ)Z")
    public final boolean method357(int arg0, boolean arg1) {
        if (arg1) {
            this.field1021 = !this.field1021;
        }
        int var3 = this.field1048;
        int var4 = this.field1049;
        int var5 = this.field1054;
        if (arg0 == 1) {
            var3 = this.field1051;
            var4 = this.field1052;
            var5 = this.field1055;
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
        int var3 = this.field1048;
        int var4 = this.field1049;
        int var5 = this.field1054;
        while (arg1 >= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (arg0 == 1) {
            var3 = this.field1051;
            var4 = this.field1052;
            var5 = this.field1055;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method139(this.field1019, var3);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method139(this.field1019, var4);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model(var11, 2, (byte) 2);
            } else {
                Model var7 = Model.method139(this.field1019, var4);
                Model var8 = Model.method139(this.field1019, var5);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model(var9, 3, (byte) 2);
            }
        }
        if (arg0 == 0 && this.field1050 != 0) {
            var6.method152(false, 0, 0, this.field1050);
        }
        if (arg0 == 1 && this.field1053 != 0) {
            var6.method152(false, 0, 0, this.field1053);
        }
        if (this.field1034 != null) {
            for (int var12 = 0; var12 < this.field1034.length; var12++) {
                var6.method153(this.field1034[var12], this.field1035[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Z")
    public final boolean method359(int arg0, int arg1) {
        int var3 = this.field1056;
        int var4 = this.field1057;
        if (arg0 < this.field1023 || arg0 > this.field1023) {
            this.field1023 = 438;
        }
        if (arg1 == 1) {
            var3 = this.field1058;
            var4 = this.field1059;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
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
        int var3 = this.field1056;
        int var4 = this.field1057;
        if (arg1 == 1) {
            var3 = this.field1058;
            var4 = this.field1059;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method139(this.field1019, var3);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        if (var4 != -1) {
            Model var6 = Model.method139(this.field1019, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(var7, 2, (byte) 2);
        }
        if (this.field1034 != null) {
            for (int var8 = 0; var8 < this.field1034.length; var8++) {
                var5.method153(this.field1034[var8], this.field1035[var8]);
            }
        }
        return var5;
    }
}
