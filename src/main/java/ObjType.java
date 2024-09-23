import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private boolean field1012 = false;

    @OriginalMember(owner = "hc", name = "c", descriptor = "Z")
    private boolean field1013 = false;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    private int field1014 = 614;

    @OriginalMember(owner = "hc", name = "l", descriptor = "I")
    public int field1022 = -1;

    @OriginalMember(owner = "hc", name = "e", descriptor = "I")
    private static int field1015 = 977;

    @OriginalMember(owner = "hc", name = "k", descriptor = "Z")
    public static boolean field1021 = true;

    @OriginalMember(owner = "hc", name = "Y", descriptor = "Lt;")
    public static LruCache field1061 = new LruCache((byte) 3, 50);

    @OriginalMember(owner = "hc", name = "Z", descriptor = "Lt;")
    public static LruCache field1062 = new LruCache((byte) 3, 100);

    @OriginalMember(owner = "hc", name = "F", descriptor = "B")
    private byte field1042;

    @OriginalMember(owner = "hc", name = "I", descriptor = "B")
    private byte field1045;

    @OriginalMember(owner = "hc", name = "f", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    private static int field1020;

    @OriginalMember(owner = "hc", name = "m", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "hc", name = "z", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "hc", name = "M", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "hc", name = "N", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "hc", name = "V", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "hc", name = "W", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "hc", name = "X", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "hc", name = "h", descriptor = "Lmb;")
    private static Packet field1018;

    @OriginalMember(owner = "hc", name = "n", descriptor = "Ljava/lang/String;")
    public String field1024;

    @OriginalMember(owner = "hc", name = "a", descriptor = "Z")
    private static boolean field1011;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1035;

    @OriginalMember(owner = "hc", name = "A", descriptor = "Z")
    public boolean field1037;

    @OriginalMember(owner = "hc", name = "o", descriptor = "[B")
    public byte[] field1025;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[I")
    private static int[] field1017;

    @OriginalMember(owner = "hc", name = "p", descriptor = "[I")
    private int[] field1026;

    @OriginalMember(owner = "hc", name = "q", descriptor = "[I")
    private int[] field1027;

    @OriginalMember(owner = "hc", name = "P", descriptor = "[I")
    public int[] field1052;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "[I")
    public int[] field1053;

    @OriginalMember(owner = "hc", name = "i", descriptor = "[Lhc;")
    private static ObjType[] field1019;

    @OriginalMember(owner = "hc", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1038;

    @OriginalMember(owner = "hc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1039;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lyb;)V")
    public static final void method348(Jagfile arg0) {
        field1018 = new Packet(arg0.method309("obj.dat", null), (byte) 3);
        Packet var1 = new Packet(arg0.method309("obj.idx", null), (byte) 3);
        field1016 = var1.method241();
        field1017 = new int[field1016];
        int var2 = 2;
        for (int var3 = 0; var3 < field1016; var3++) {
            field1017[var3] = var2;
            var2 += var1.method241();
        }
        field1019 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1019[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)V")
    public static final void method349(int arg0) {
        field1061 = null;
        field1062 = null;
        field1017 = null;
        field1019 = null;
        field1018 = null;
        int var1 = 50 / arg0;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lhc;")
    public static final ObjType method350(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1019[var1].field1022 == arg0) {
                return field1019[var1];
            }
        }
        field1020 = (field1020 + 1) % 10;
        ObjType var2 = field1019[field1020];
        field1018.field711 = field1017[arg0];
        var2.field1022 = arg0;
        var2.method351();
        var2.method352(9, field1018);
        if (var2.field1055 != -1) {
            var2.method353(false);
        }
        if (!field1021 && var2.field1037) {
            var2.field1024 = "Members Object";
            var2.field1025 = "Login to a members' server to use this object.".getBytes();
            var2.field1038 = null;
            var2.field1039 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method351() {
        this.field1023 = 0;
        this.field1024 = null;
        this.field1025 = null;
        this.field1026 = null;
        this.field1027 = null;
        this.field1028 = 2000;
        this.field1029 = 0;
        this.field1030 = 0;
        this.field1031 = 0;
        this.field1032 = 0;
        this.field1033 = 0;
        this.field1034 = -1;
        this.field1035 = false;
        this.field1036 = 1;
        this.field1037 = false;
        this.field1038 = null;
        this.field1039 = null;
        this.field1040 = -1;
        this.field1041 = -1;
        this.field1042 = 0;
        this.field1043 = -1;
        this.field1044 = -1;
        this.field1045 = 0;
        this.field1046 = -1;
        this.field1047 = -1;
        this.field1048 = -1;
        this.field1049 = -1;
        this.field1050 = -1;
        this.field1051 = -1;
        this.field1052 = null;
        this.field1053 = null;
        this.field1054 = -1;
        this.field1055 = -1;
        this.field1056 = 128;
        this.field1057 = 128;
        this.field1058 = 128;
        this.field1059 = 0;
        this.field1060 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ILmb;)V")
    public final void method352(int arg0, Packet arg1) {
        if (arg0 < 9 || arg0 > 9) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1023 = arg1.method241();
                } else if (var4 == 2) {
                    this.field1024 = arg1.method246();
                } else if (var4 == 3) {
                    this.field1025 = arg1.method247((byte) 3);
                } else if (var4 == 4) {
                    this.field1028 = arg1.method241();
                } else if (var4 == 5) {
                    this.field1029 = arg1.method241();
                } else if (var4 == 6) {
                    this.field1030 = arg1.method241();
                } else if (var4 == 7) {
                    this.field1032 = arg1.method241();
                    if (this.field1032 > 32767) {
                        this.field1032 -= 65536;
                    }
                } else if (var4 == 8) {
                    this.field1033 = arg1.method241();
                    if (this.field1033 > 32767) {
                        this.field1033 -= 65536;
                    }
                } else if (var4 == 10) {
                    this.field1034 = arg1.method241();
                } else if (var4 == 11) {
                    this.field1035 = true;
                } else if (var4 == 12) {
                    this.field1036 = arg1.method244();
                } else if (var4 == 16) {
                    this.field1037 = true;
                } else if (var4 == 23) {
                    this.field1040 = arg1.method241();
                    this.field1042 = arg1.method240();
                } else if (var4 == 24) {
                    this.field1041 = arg1.method241();
                } else if (var4 == 25) {
                    this.field1043 = arg1.method241();
                    this.field1045 = arg1.method240();
                } else if (var4 == 26) {
                    this.field1044 = arg1.method241();
                } else if (var4 >= 30 && var4 < 35) {
                    if (this.field1038 == null) {
                        this.field1038 = new String[5];
                    }
                    this.field1038[var4 - 30] = arg1.method246();
                    if (this.field1038[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1038[var4 - 30] = null;
                    }
                } else if (var4 >= 35 && var4 < 40) {
                    if (this.field1039 == null) {
                        this.field1039 = new String[5];
                    }
                    this.field1039[var4 - 35] = arg1.method246();
                } else if (var4 == 40) {
                    int var5 = arg1.method239();
                    this.field1026 = new int[var5];
                    this.field1027 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1026[var6] = arg1.method241();
                        this.field1027[var6] = arg1.method241();
                    }
                } else if (var4 == 78) {
                    this.field1046 = arg1.method241();
                } else if (var4 == 79) {
                    this.field1047 = arg1.method241();
                } else if (var4 == 90) {
                    this.field1048 = arg1.method241();
                } else if (var4 == 91) {
                    this.field1050 = arg1.method241();
                } else if (var4 == 92) {
                    this.field1049 = arg1.method241();
                } else if (var4 == 93) {
                    this.field1051 = arg1.method241();
                } else if (var4 == 95) {
                    this.field1031 = arg1.method241();
                } else if (var4 == 97) {
                    this.field1054 = arg1.method241();
                } else if (var4 == 98) {
                    this.field1055 = arg1.method241();
                } else if (var4 >= 100 && var4 < 110) {
                    if (this.field1052 == null) {
                        this.field1052 = new int[10];
                        this.field1053 = new int[10];
                    }
                    this.field1052[var4 - 100] = arg1.method241();
                    this.field1053[var4 - 100] = arg1.method241();
                } else if (var4 == 110) {
                    this.field1056 = arg1.method241();
                } else if (var4 == 111) {
                    this.field1057 = arg1.method241();
                } else if (var4 == 112) {
                    this.field1058 = arg1.method241();
                } else if (var4 == 113) {
                    this.field1059 = arg1.method240();
                } else if (var4 == 114) {
                    this.field1060 = arg1.method240() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public void method353(boolean arg0) {
        ObjType var2 = method350(this.field1055);
        this.field1023 = var2.field1023;
        this.field1028 = var2.field1028;
        this.field1029 = var2.field1029;
        this.field1030 = var2.field1030;
        this.field1031 = var2.field1031;
        this.field1032 = var2.field1032;
        this.field1033 = var2.field1033;
        this.field1026 = var2.field1026;
        this.field1027 = var2.field1027;
        ObjType var3 = method350(this.field1054);
        this.field1024 = var3.field1024;
        this.field1037 = var3.field1037;
        this.field1036 = var3.field1036;
        if (arg0) {
            this.field1013 = !this.field1013;
        }
        String var4 = "a";
        char var5 = var3.field1024.charAt(0);
        if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
            var4 = "an";
        }
        this.field1025 = ("Swap this note at any bank for " + var4 + " " + var3.field1024 + ".").getBytes();
        this.field1035 = true;
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)Lfb;")
    public final Model method354(int arg0) {
        if (this.field1052 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1053[var3] && this.field1053[var3] != 0) {
                    var2 = this.field1052[var3];
                }
            }
            if (var2 != -1) {
                return method350(var2).method354(1);
            }
        }
        Model var4 = (Model) field1061.method115((long) this.field1022);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method139(0, this.field1023);
        if (var5 == null) {
            return null;
        }
        if (this.field1056 != 128 || this.field1057 != 128 || this.field1058 != 128) {
            var5.method155(792, this.field1058, this.field1056, this.field1057);
        }
        if (this.field1026 != null) {
            for (int var6 = 0; var6 < this.field1026.length; var6++) {
                var5.method153(this.field1026[var6], this.field1027[var6]);
            }
        }
        var5.method156(this.field1059 + 64, this.field1060 + 768, -50, -10, -50, true);
        var5.field572 = true;
        field1061.method116(var5, false, (long) this.field1022);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Lfb;")
    public final Model method355(int arg0, int arg1) {
        if (this.field1052 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field1053[var4] && this.field1053[var4] != 0) {
                    var3 = this.field1052[var4];
                }
            }
            if (var3 != -1) {
                return method350(var3).method355(614, 1);
            }
        }
        Model var5 = Model.method139(0, this.field1023);
        int var6 = 37 / arg0;
        if (var5 == null) {
            return null;
        }
        if (this.field1026 != null) {
            for (int var7 = 0; var7 < this.field1026.length; var7++) {
                var5.method153(this.field1026[var7], this.field1027[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Ljb;")
    public static final Pix32 method356(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            Pix32 var4 = (Pix32) field1062.method115((long) arg2);
            if (var4 != null && var4.field672 != arg1 && var4.field672 != -1) {
                var4.method120();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method350(arg2);
        if (var5.field1052 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field1053[var7] && var5.field1053[var7] != 0) {
                    var6 = var5.field1052[var7];
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
        if (var5.field1055 != -1) {
            var9 = method356(-1, 10, var5.field1054, 977);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field641;
        int var12 = Pix3D.field642;
        int[] var13 = Pix3D.field647;
        int[] var14 = Pix2D.field623;
        int var15 = Pix2D.field624;
        int var16 = Pix2D.field625;
        if (arg3 <= 0) {
            field1011 = !field1011;
        }
        int var17 = Pix2D.field628;
        int var18 = Pix2D.field629;
        int var19 = Pix2D.field626;
        int var20 = Pix2D.field627;
        Pix3D.field639 = false;
        Pix2D.method165(-216, 32, var10.field666, 32);
        Pix2D.method170(32, 32, 0, 0, (byte) 3, 0);
        Pix3D.method178(338);
        int var21 = var5.field1028;
        if (arg0 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg0 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field645[var5.field1029] * var21 >> 16;
        int var23 = Pix3D.field646[var5.field1029] * var21 >> 16;
        var8.method159(0, var5.field1030, var5.field1031, var5.field1029, var5.field1032, var8.field406 / 2 + var22 + var5.field1033, var5.field1033 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var10.field666[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field666[var31 * 32 + var24 - 1] > 1) {
                        var10.field666[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var10.field666[(var31 - 1) * 32 + var24] > 1) {
                        var10.field666[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field666[var31 * 32 + var24 + 1] > 1) {
                        var10.field666[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var10.field666[(var31 + 1) * 32 + var24] > 1) {
                        var10.field666[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg0 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field666[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field666[var26 * 32 + var25 - 1] == 1) {
                            var10.field666[var26 * 32 + var25] = arg0;
                        } else if (var26 > 0 && var10.field666[(var26 - 1) * 32 + var25] == 1) {
                            var10.field666[var26 * 32 + var25] = arg0;
                        } else if (var25 < 31 && var10.field666[var26 * 32 + var25 + 1] == 1) {
                            var10.field666[var26 * 32 + var25] = arg0;
                        } else if (var26 < 31 && var10.field666[(var26 + 1) * 32 + var25] == 1) {
                            var10.field666[var26 * 32 + var25] = arg0;
                        }
                    }
                }
            }
        } else if (arg0 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field666[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field666[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field666[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1055 != -1) {
            int var29 = var9.field671;
            int var30 = var9.field672;
            var9.field671 = 32;
            var9.field672 = 32;
            var9.method199(1, 0, 0);
            var9.field671 = var29;
            var9.field672 = var30;
        }
        if (arg0 == 0) {
            field1062.method116(var10, false, (long) arg2);
        }
        Pix2D.method165(-216, var16, var14, var15);
        Pix2D.method167(var18, true, var17, var20, var19);
        Pix3D.field641 = var11;
        Pix3D.field642 = var12;
        Pix3D.field647 = var13;
        Pix3D.field639 = true;
        if (var5.field1035) {
            var10.field671 = 33;
        } else {
            var10.field671 = 32;
        }
        var10.field672 = arg1;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BI)Z")
    public final boolean method357(byte arg0, int arg1) {
        int var3 = this.field1040;
        int var4 = this.field1041;
        int var5 = this.field1046;
        if (arg1 == 1) {
            var3 = this.field1043;
            var4 = this.field1044;
            var5 = this.field1047;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (arg0 != 3) {
            this.field1014 = -359;
        }
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
        int var3 = 57 / arg0;
        int var4 = this.field1040;
        int var5 = this.field1041;
        int var6 = this.field1046;
        if (arg1 == 1) {
            var4 = this.field1043;
            var5 = this.field1044;
            var6 = this.field1047;
        }
        if (var4 == -1) {
            return null;
        }
        Model var7 = Model.method139(0, var4);
        if (var5 != -1) {
            if (var6 == -1) {
                Model var11 = Model.method139(0, var5);
                Model[] var12 = new Model[] { var7, var11 };
                var7 = new Model(var12, 2, -928);
            } else {
                Model var8 = Model.method139(0, var5);
                Model var9 = Model.method139(0, var6);
                Model[] var10 = new Model[] { var7, var8, var9 };
                var7 = new Model(var10, 3, -928);
            }
        }
        if (arg1 == 0 && this.field1042 != 0) {
            var7.method152((byte) -32, 0, 0, this.field1042);
        }
        if (arg1 == 1 && this.field1045 != 0) {
            var7.method152((byte) -32, 0, 0, this.field1045);
        }
        if (this.field1026 != null) {
            for (int var13 = 0; var13 < this.field1026.length; var13++) {
                var7.method153(this.field1026[var13], this.field1027[var13]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZI)Z")
    public final boolean method359(boolean arg0, int arg1) {
        int var3 = this.field1048;
        int var4 = this.field1049;
        if (arg1 == 1) {
            var3 = this.field1050;
            var4 = this.field1051;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (arg0) {
            this.field1012 = !this.field1012;
        }
        if (!Model.method140(var3)) {
            var5 = false;
        }
        if (var4 != -1 && !Model.method140(var4)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(ZI)Lfb;")
    public final Model method360(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1014 = -367;
        }
        int var3 = this.field1048;
        int var4 = this.field1049;
        if (arg1 == 1) {
            var3 = this.field1050;
            var4 = this.field1051;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method139(0, var3);
        if (var4 != -1) {
            Model var6 = Model.method139(0, var4);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(var7, 2, -928);
        }
        if (this.field1026 != null) {
            for (int var8 = 0; var8 < this.field1026.length; var8++) {
                var5.method153(this.field1026[var8], this.field1027[var8]);
            }
        }
        return var5;
    }
}
