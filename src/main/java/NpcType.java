import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "h", descriptor = "J")
    public long field1017 = -1L;

    @OriginalMember(owner = "gc", name = "k", descriptor = "B")
    public byte field1020 = 1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field1023 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1034 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1036 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1037 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1038 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1041 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1042 = 32;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1044 = -1;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    public int field1045 = -1;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field1010 = true;

    @OriginalMember(owner = "gc", name = "K", descriptor = "Ls;")
    public static LruCache field1046 = new LruCache(-739, 30);

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field1016;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Llb;")
    private static Packet field1014;

    @OriginalMember(owner = "gc", name = "b", descriptor = "Lclient;")
    public static client field1011;

    @OriginalMember(owner = "gc", name = "i", descriptor = "Ljava/lang/String;")
    public String field1018;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[B")
    public byte[] field1019;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field1013;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field1021;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field1028;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1029;

    @OriginalMember(owner = "gc", name = "H", descriptor = "[I")
    public int[] field1043;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static NpcType[] field1015;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1030;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1014 = new Packet(arg0.method299("npc.dat", null), -26728);
        Packet var1 = new Packet(arg0.method299("npc.idx", null), -26728);
        field1012 = var1.method231();
        field1013 = new int[field1012];
        int var2 = 2;
        for (int var3 = 0; var3 < field1012; var3++) {
            field1013[var3] = var2;
            var2 += var1.method231();
        }
        field1015 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1015[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)V")
    public static final void method340(int arg0) {
        field1046 = null;
        if (arg0 != 0) {
            field1010 = !field1010;
        }
        field1013 = null;
        field1015 = null;
        field1014 = null;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lgc;")
    public static final NpcType method341(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1015[var1].field1017) {
                return field1015[var1];
            }
        }
        field1016 = (field1016 + 1) % 20;
        NpcType var2 = field1015[field1016] = new NpcType();
        field1014.field717 = field1013[arg0];
        var2.field1017 = arg0;
        var2.method342(field1014, 8);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Llb;I)V")
    private final void method342(Packet arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method229();
                    this.field1021 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1021[var6] = arg0.method231();
                    }
                } else if (var4 == 2) {
                    this.field1018 = arg0.method236();
                } else if (var4 == 3) {
                    this.field1019 = arg0.method237((byte) 6);
                } else if (var4 == 12) {
                    this.field1020 = arg0.method230();
                } else if (var4 == 13) {
                    this.field1023 = arg0.method231();
                } else if (var4 == 14) {
                    this.field1024 = arg0.method231();
                } else if (var4 == 17) {
                    this.field1024 = arg0.method231();
                    this.field1025 = arg0.method231();
                    this.field1026 = arg0.method231();
                    this.field1027 = arg0.method231();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1030 == null) {
                        this.field1030 = new String[5];
                    }
                    this.field1030[var4 - 30] = arg0.method236();
                    if (this.field1030[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1030[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method229();
                    this.field1028 = new int[var7];
                    this.field1029 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1028[var8] = arg0.method231();
                        this.field1029[var8] = arg0.method231();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method229();
                    this.field1022 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1022[var10] = arg0.method231();
                    }
                } else if (var4 == 90) {
                    this.field1031 = arg0.method231();
                } else if (var4 == 91) {
                    this.field1032 = arg0.method231();
                } else if (var4 == 92) {
                    this.field1033 = arg0.method231();
                } else if (var4 == 93) {
                    this.field1034 = false;
                } else if (var4 == 95) {
                    this.field1035 = arg0.method231();
                } else if (var4 == 97) {
                    this.field1036 = arg0.method231();
                } else if (var4 == 98) {
                    this.field1037 = arg0.method231();
                } else if (var4 == 99) {
                    this.field1038 = true;
                } else if (var4 == 100) {
                    this.field1039 = arg0.method230();
                } else if (var4 == 101) {
                    this.field1040 = arg0.method230() * 5;
                } else if (var4 == 102) {
                    this.field1041 = arg0.method231();
                } else if (var4 == 103) {
                    this.field1042 = arg0.method231();
                } else if (var4 == 106) {
                    this.field1044 = arg0.method231();
                    if (this.field1044 == 65535) {
                        this.field1044 = -1;
                    }
                    this.field1045 = arg0.method231();
                    if (this.field1045 == 65535) {
                        this.field1045 = -1;
                    }
                    int var11 = arg0.method229();
                    this.field1043 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1043[var12] = arg0.method231();
                        if (this.field1043[var12] == 65535) {
                            this.field1043[var12] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I[IIZ)Leb;")
    public final Model method343(int arg0, int[] arg1, int arg2, boolean arg3) {
        if (this.field1043 != null) {
            NpcType var5 = this.method345(559);
            return var5 == null ? null : var5.method343(arg0, arg1, arg2, false);
        }
        Model var6 = (Model) field1046.method101(this.field1017);
        if (arg3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1021.length; var9++) {
                if (!Model.method127(this.field1021[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            Model[] var10 = new Model[this.field1021.length];
            for (int var11 = 0; var11 < this.field1021.length; var11++) {
                var10[var11] = Model.method126(true, this.field1021[var11]);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new Model(var10.length, -314, var10);
            }
            if (this.field1028 != null) {
                for (int var12 = 0; var12 < this.field1028.length; var12++) {
                    var6.method140(this.field1028[var12], this.field1029[var12]);
                }
            }
            var6.method133(true);
            var6.method143(this.field1039 + 64, this.field1040 + 850, -30, -50, -30, true);
            field1046.method102(this.field1017, var6, 10514);
        }
        Model var13 = Model.field535;
        var13.method128(var6, false, AnimFrame.method48(arg2, 45733) & AnimFrame.method48(arg0, 45733));
        if (arg2 != -1 && arg0 != -1) {
            var13.method135(-13288, arg0, arg2, arg1);
        } else if (arg2 != -1) {
            var13.method134(true, arg2);
        }
        if (this.field1036 != 128 || this.field1037 != 128) {
            var13.method142(this.field1036, this.field1036, -34245, this.field1037);
        }
        var13.method130(-246);
        var13.field572 = null;
        var13.field571 = null;
        if (this.field1020 == 1) {
            var13.field573 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Leb;")
    public final Model method344(int arg0) {
        if (this.field1043 != null) {
            NpcType var2 = this.method345(559);
            return var2 == null ? null : var2.method344(-205);
        } else if (this.field1022 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 >= 0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field1022.length; var4++) {
                if (!Model.method127(this.field1022[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var5 = new Model[this.field1022.length];
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var5[var6] = Model.method126(true, this.field1022[var6]);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model(var5.length, -314, var5);
            }
            if (this.field1028 != null) {
                for (int var8 = 0; var8 < this.field1028.length; var8++) {
                    var7.method140(this.field1028[var8], this.field1029[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "gc", name = "d", descriptor = "(I)Lgc;")
    public final NpcType method345(int arg0) {
        int var2 = 33 / arg0;
        int var3 = -1;
        if (this.field1044 != -1) {
            VarbitType var4 = VarbitType.field1186[this.field1044];
            int var5 = var4.field1188;
            int var6 = var4.field1189;
            int var7 = var4.field1190;
            int var8 = client.field1344[var7 - var6];
            var3 = field1011.field1384[var5] >> var6 & var8;
        } else if (this.field1045 != -1) {
            var3 = field1011.field1384[this.field1045];
        }
        return var3 < 0 || var3 >= this.field1043.length || this.field1043[var3] == -1 ? null : method341(this.field1043[var3]);
    }
}
