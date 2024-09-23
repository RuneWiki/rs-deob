import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class ObjType {

    @OriginalMember(owner = "hc", name = "i", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "hc", name = "b", descriptor = "Z")
    private static boolean field1010 = true;

    @OriginalMember(owner = "hc", name = "h", descriptor = "Z")
    public static boolean field1016 = true;

    @OriginalMember(owner = "hc", name = "V", descriptor = "Lt;")
    public static LruCache field1056 = new LruCache(0, 50);

    @OriginalMember(owner = "hc", name = "W", descriptor = "Lt;")
    public static LruCache field1057 = new LruCache(0, 100);

    @OriginalMember(owner = "hc", name = "C", descriptor = "B")
    private byte field1037;

    @OriginalMember(owner = "hc", name = "F", descriptor = "B")
    private byte field1040;

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "hc", name = "g", descriptor = "I")
    private static int field1015;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "hc", name = "o", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "hc", name = "s", descriptor = "I")
    private int field1027;

    @OriginalMember(owner = "hc", name = "t", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "hc", name = "u", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "hc", name = "A", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "hc", name = "H", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "hc", name = "I", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "hc", name = "J", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "hc", name = "K", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "hc", name = "L", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "hc", name = "O", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "hc", name = "P", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "hc", name = "Q", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "hc", name = "R", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "hc", name = "S", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "hc", name = "T", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "hc", name = "U", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "hc", name = "e", descriptor = "Lmb;")
    private static Packet field1013;

    @OriginalMember(owner = "hc", name = "k", descriptor = "Ljava/lang/String;")
    public String field1019;

    @OriginalMember(owner = "hc", name = "v", descriptor = "Z")
    public boolean field1030;

    @OriginalMember(owner = "hc", name = "x", descriptor = "Z")
    public boolean field1032;

    @OriginalMember(owner = "hc", name = "l", descriptor = "[B")
    public byte[] field1020;

    @OriginalMember(owner = "hc", name = "d", descriptor = "[I")
    private static int[] field1012;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[I")
    private int[] field1021;

    @OriginalMember(owner = "hc", name = "n", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "hc", name = "M", descriptor = "[I")
    public int[] field1047;

    @OriginalMember(owner = "hc", name = "N", descriptor = "[I")
    public int[] field1048;

    @OriginalMember(owner = "hc", name = "f", descriptor = "[Lhc;")
    private static ObjType[] field1014;

    @OriginalMember(owner = "hc", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field1033;

    @OriginalMember(owner = "hc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1034;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lyb;)V")
    public static final void method348(Jagfile arg0) {
        field1013 = new Packet(arg0.method309("obj.dat", null), 337);
        Packet var1 = new Packet(arg0.method309("obj.idx", null), 337);
        field1011 = var1.method241();
        field1012 = new int[field1011];
        int var2 = 2;
        for (int var3 = 0; var3 < field1011; var3++) {
            field1012[var3] = var2;
            var2 += var1.method241();
        }
        field1014 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field1014[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Z)V")
    public static final void method349(boolean arg0) {
        field1056 = null;
        field1057 = null;
        field1012 = null;
        if (!arg0) {
            field1014 = null;
            field1013 = null;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)Lhc;")
    public static final ObjType method350(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field1014[var1].field1017 == arg0) {
                return field1014[var1];
            }
        }
        field1015 = (field1015 + 1) % 10;
        ObjType var2 = field1014[field1015];
        field1013.field710 = field1012[arg0];
        var2.field1017 = arg0;
        var2.method351();
        var2.method352(0, field1013);
        if (var2.field1050 != -1) {
            var2.method353(true);
        }
        if (!field1016 && var2.field1032) {
            var2.field1019 = "Members Object";
            var2.field1020 = "Login to a members' server to use this object.".getBytes();
            var2.field1033 = null;
            var2.field1034 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()V")
    public final void method351() {
        this.field1018 = 0;
        this.field1019 = null;
        this.field1020 = null;
        this.field1021 = null;
        this.field1022 = null;
        this.field1023 = 2000;
        this.field1024 = 0;
        this.field1025 = 0;
        this.field1026 = 0;
        this.field1027 = 0;
        this.field1028 = 0;
        this.field1029 = -1;
        this.field1030 = false;
        this.field1031 = 1;
        this.field1032 = false;
        this.field1033 = null;
        this.field1034 = null;
        this.field1035 = -1;
        this.field1036 = -1;
        this.field1037 = 0;
        this.field1038 = -1;
        this.field1039 = -1;
        this.field1040 = 0;
        this.field1041 = -1;
        this.field1042 = -1;
        this.field1043 = -1;
        this.field1044 = -1;
        this.field1045 = -1;
        this.field1046 = -1;
        this.field1047 = null;
        this.field1048 = null;
        this.field1049 = -1;
        this.field1050 = -1;
        this.field1051 = 128;
        this.field1052 = 128;
        this.field1053 = 128;
        this.field1054 = 0;
        this.field1055 = 0;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ILmb;)V")
    public final void method352(int arg0, Packet arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1018 = arg1.method241();
                } else if (var3 == 2) {
                    this.field1019 = arg1.method246();
                } else if (var3 == 3) {
                    this.field1020 = arg1.method247(3);
                } else if (var3 == 4) {
                    this.field1023 = arg1.method241();
                } else if (var3 == 5) {
                    this.field1024 = arg1.method241();
                } else if (var3 == 6) {
                    this.field1025 = arg1.method241();
                } else if (var3 == 7) {
                    this.field1027 = arg1.method241();
                    if (this.field1027 > 32767) {
                        this.field1027 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field1028 = arg1.method241();
                    if (this.field1028 > 32767) {
                        this.field1028 -= 65536;
                    }
                } else if (var3 == 10) {
                    this.field1029 = arg1.method241();
                } else if (var3 == 11) {
                    this.field1030 = true;
                } else if (var3 == 12) {
                    this.field1031 = arg1.method244();
                } else if (var3 == 16) {
                    this.field1032 = true;
                } else if (var3 == 23) {
                    this.field1035 = arg1.method241();
                    this.field1037 = arg1.method240();
                } else if (var3 == 24) {
                    this.field1036 = arg1.method241();
                } else if (var3 == 25) {
                    this.field1038 = arg1.method241();
                    this.field1040 = arg1.method240();
                } else if (var3 == 26) {
                    this.field1039 = arg1.method241();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field1033 == null) {
                        this.field1033 = new String[5];
                    }
                    this.field1033[var3 - 30] = arg1.method246();
                    if (this.field1033[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1033[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field1034 == null) {
                        this.field1034 = new String[5];
                    }
                    this.field1034[var3 - 35] = arg1.method246();
                } else if (var3 == 40) {
                    int var4 = arg1.method239();
                    this.field1021 = new int[var4];
                    this.field1022 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1021[var5] = arg1.method241();
                        this.field1022[var5] = arg1.method241();
                    }
                } else if (var3 == 78) {
                    this.field1041 = arg1.method241();
                } else if (var3 == 79) {
                    this.field1042 = arg1.method241();
                } else if (var3 == 90) {
                    this.field1043 = arg1.method241();
                } else if (var3 == 91) {
                    this.field1045 = arg1.method241();
                } else if (var3 == 92) {
                    this.field1044 = arg1.method241();
                } else if (var3 == 93) {
                    this.field1046 = arg1.method241();
                } else if (var3 == 95) {
                    this.field1026 = arg1.method241();
                } else if (var3 == 97) {
                    this.field1049 = arg1.method241();
                } else if (var3 == 98) {
                    this.field1050 = arg1.method241();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field1047 == null) {
                        this.field1047 = new int[10];
                        this.field1048 = new int[10];
                    }
                    this.field1047[var3 - 100] = arg1.method241();
                    this.field1048[var3 - 100] = arg1.method241();
                } else if (var3 == 110) {
                    this.field1051 = arg1.method241();
                } else if (var3 == 111) {
                    this.field1052 = arg1.method241();
                } else if (var3 == 112) {
                    this.field1053 = arg1.method241();
                } else if (var3 == 113) {
                    this.field1054 = arg1.method240();
                } else if (var3 == 114) {
                    this.field1055 = arg1.method240() * 5;
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(Z)V")
    public void method353(boolean arg0) {
        ObjType var2 = method350(this.field1050);
        this.field1018 = var2.field1018;
        this.field1023 = var2.field1023;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1024 = var2.field1024;
        this.field1025 = var2.field1025;
        this.field1026 = var2.field1026;
        this.field1027 = var2.field1027;
        this.field1028 = var2.field1028;
        this.field1021 = var2.field1021;
        this.field1022 = var2.field1022;
        ObjType var4 = method350(this.field1049);
        this.field1019 = var4.field1019;
        this.field1032 = var4.field1032;
        this.field1031 = var4.field1031;
        String var5 = "a";
        char var6 = var4.field1019.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var5 = "an";
        }
        this.field1020 = ("Swap this note at any bank for " + var5 + " " + var4.field1019 + ".").getBytes();
        this.field1030 = true;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lfb;")
    public final Model method354(int arg0) {
        if (this.field1047 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1048[var3] && this.field1048[var3] != 0) {
                    var2 = this.field1047[var3];
                }
            }
            if (var2 != -1) {
                return method350(var2).method354(1);
            }
        }
        Model var4 = (Model) field1056.method115((long) this.field1017);
        if (var4 != null) {
            return var4;
        }
        Model var5 = Model.method139(this.field1018, (byte) -18);
        if (var5 == null) {
            return null;
        }
        if (this.field1051 != 128 || this.field1052 != 128 || this.field1053 != 128) {
            var5.method155(this.field1053, (byte) 2, this.field1052, this.field1051);
        }
        if (this.field1021 != null) {
            for (int var6 = 0; var6 < this.field1021.length; var6++) {
                var5.method153(this.field1021[var6], this.field1022[var6]);
            }
        }
        var5.method156(this.field1054 + 64, this.field1055 + 768, -50, -10, -50, true);
        var5.field577 = true;
        field1056.method116(-630, (long) this.field1017, var5);
        return var5;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Lfb;")
    public final Model method355(int arg0, int arg1) {
        if (this.field1047 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field1048[var4] && this.field1048[var4] != 0) {
                    var3 = this.field1047[var4];
                }
            }
            if (var3 != -1) {
                return method350(var3).method355(1, 414);
            }
        }
        Model var5 = Model.method139(this.field1018, (byte) -18);
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else if (var5 == null) {
            return null;
        } else {
            if (this.field1021 != null) {
                for (int var6 = 0; var6 < this.field1021.length; var6++) {
                    var5.method153(this.field1021[var6], this.field1022[var6]);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IIII)Ljb;")
    public static final Pix32 method356(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            Pix32 var4 = (Pix32) field1057.method115((long) arg2);
            if (var4 != null && var4.field678 != arg1 && var4.field678 != -1) {
                var4.method120();
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        ObjType var5 = method350(arg2);
        if (var5.field1047 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field1048[var7] && var5.field1048[var7] != 0) {
                    var6 = var5.field1047[var7];
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
        if (var5.field1050 != -1) {
            var9 = method356(-1, 10, var5.field1049, 0);
            if (var9 == null) {
                return null;
            }
        }
        Pix32 var10 = new Pix32(32, 32);
        int var11 = Pix3D.field648;
        int var12 = Pix3D.field649;
        int[] var13 = Pix3D.field654;
        int[] var14 = Pix2D.field629;
        int var15 = Pix2D.field630;
        int var16 = Pix2D.field631;
        int var17 = Pix2D.field634;
        int var18 = Pix2D.field635;
        int var19 = Pix2D.field632;
        int var20 = Pix2D.field633;
        Pix3D.field646 = false;
        Pix2D.method165(var10.field672, 32, 32, (byte) -59);
        Pix2D.method170(32, 5, 0, 0, 32, 0);
        Pix3D.method178(2);
        int var21 = var5.field1023;
        if (arg0 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg0 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = Pix3D.field652[var5.field1024] * var21 >> 16;
        int var23 = Pix3D.field653[var5.field1024] * var21 >> 16;
        var8.method159(0, var5.field1025, var5.field1026, var5.field1024, var5.field1027, var8.field404 / 2 + var22 + var5.field1028, var5.field1028 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var10.field672[var32 * 32 + var24] == 0) {
                    if (var24 > 0 && var10.field672[var32 * 32 + var24 - 1] > 1) {
                        var10.field672[var32 * 32 + var24] = 1;
                    } else if (var32 > 0 && var10.field672[(var32 - 1) * 32 + var24] > 1) {
                        var10.field672[var32 * 32 + var24] = 1;
                    } else if (var24 < 31 && var10.field672[var32 * 32 + var24 + 1] > 1) {
                        var10.field672[var32 * 32 + var24] = 1;
                    } else if (var32 < 31 && var10.field672[(var32 + 1) * 32 + var24] > 1) {
                        var10.field672[var32 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg0 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var10.field672[var26 * 32 + var25] == 0) {
                        if (var25 > 0 && var10.field672[var26 * 32 + var25 - 1] == 1) {
                            var10.field672[var26 * 32 + var25] = arg0;
                        } else if (var26 > 0 && var10.field672[(var26 - 1) * 32 + var25] == 1) {
                            var10.field672[var26 * 32 + var25] = arg0;
                        } else if (var25 < 31 && var10.field672[var26 * 32 + var25 + 1] == 1) {
                            var10.field672[var26 * 32 + var25] = arg0;
                        } else if (var26 < 31 && var10.field672[(var26 + 1) * 32 + var25] == 1) {
                            var10.field672[var26 * 32 + var25] = arg0;
                        }
                    }
                }
            }
        } else if (arg0 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var10.field672[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.field672[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var10.field672[var28 * 32 + var27] = 3153952;
                    }
                }
            }
        }
        if (var5.field1050 != -1) {
            int var29 = var9.field677;
            int var30 = var9.field678;
            var9.field677 = 32;
            var9.field678 = 32;
            var9.method199(0, 0, 0);
            var9.field677 = var29;
            var9.field678 = var30;
        }
        if (arg0 == 0) {
            field1057.method116(-630, (long) arg2, var10);
        }
        Pix2D.method165(var14, var15, var16, (byte) -59);
        if (arg3 != 0) {
            for (int var31 = 1; var31 > 0; var31++) {
            }
        }
        Pix2D.method167(var17, var18, var20, var19, field1010);
        Pix3D.field648 = var11;
        Pix3D.field649 = var12;
        Pix3D.field654 = var13;
        Pix3D.field646 = true;
        if (var5.field1030) {
            var10.field677 = 33;
        } else {
            var10.field677 = 32;
        }
        var10.field678 = arg1;
        return var10;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(II)Z")
    public final boolean method357(int arg0, int arg1) {
        int var3 = this.field1035;
        int var4 = this.field1036;
        int var5 = this.field1041;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        if (arg1 == 1) {
            var3 = this.field1038;
            var4 = this.field1039;
            var5 = this.field1042;
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

    @OriginalMember(owner = "hc", name = "c", descriptor = "(II)Lfb;")
    public final Model method358(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        int var3 = this.field1035;
        int var4 = this.field1036;
        int var5 = this.field1041;
        if (arg0 == 1) {
            var3 = this.field1038;
            var4 = this.field1039;
            var5 = this.field1042;
        }
        if (var3 == -1) {
            return null;
        }
        Model var6 = Model.method139(var3, (byte) -18);
        if (var4 != -1) {
            if (var5 == -1) {
                Model var10 = Model.method139(var4, (byte) -18);
                Model[] var11 = new Model[] { var6, var10 };
                var6 = new Model((byte) 1, 2, var11);
            } else {
                Model var7 = Model.method139(var4, (byte) -18);
                Model var8 = Model.method139(var5, (byte) -18);
                Model[] var9 = new Model[] { var6, var7, var8 };
                var6 = new Model((byte) 1, 3, var9);
            }
        }
        if (arg0 == 0 && this.field1037 != 0) {
            var6.method152(0, (byte) 119, this.field1037, 0);
        }
        if (arg0 == 1 && this.field1040 != 0) {
            var6.method152(0, (byte) 119, this.field1040, 0);
        }
        if (this.field1021 != null) {
            for (int var12 = 0; var12 < this.field1021.length; var12++) {
                var6.method153(this.field1021[var12], this.field1022[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(IB)Z")
    public final boolean method359(int arg0, byte arg1) {
        int var3 = this.field1043;
        int var4 = this.field1044;
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        if (arg0 == 1) {
            var3 = this.field1045;
            var4 = this.field1046;
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
        return var6;
    }

    @OriginalMember(owner = "hc", name = "d", descriptor = "(II)Lfb;")
    public final Model method360(int arg0, int arg1) {
        int var3 = this.field1043;
        int var4 = this.field1044;
        if (arg0 != -40349) {
            this.field1009 = 283;
        }
        if (arg1 == 1) {
            var3 = this.field1045;
            var4 = this.field1046;
        }
        if (var3 == -1) {
            return null;
        }
        Model var5 = Model.method139(var3, (byte) -18);
        if (var4 != -1) {
            Model var6 = Model.method139(var4, (byte) -18);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model((byte) 1, 2, var7);
        }
        if (this.field1021 != null) {
            for (int var8 = 0; var8 < this.field1021.length; var8++) {
                var5.method153(this.field1021[var8], this.field1022[var8]);
            }
        }
        return var5;
    }
}
