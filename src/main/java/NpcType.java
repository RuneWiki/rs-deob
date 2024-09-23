import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field1005 = true;

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private boolean field1006 = true;

    @OriginalMember(owner = "gc", name = "c", descriptor = "B")
    private byte field1007 = -41;

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    private int field1008 = 26254;

    @OriginalMember(owner = "gc", name = "k", descriptor = "J")
    public long field1015 = -1L;

    @OriginalMember(owner = "gc", name = "n", descriptor = "B")
    public byte field1018 = 1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1022 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1023 = -1;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "gc", name = "u", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1029 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1030 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "Z")
    public boolean field1032 = true;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1034 = 128;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1035 = 128;

    @OriginalMember(owner = "gc", name = "F", descriptor = "Z")
    public boolean field1036 = false;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1039 = -1;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    public int field1040 = 32;

    @OriginalMember(owner = "gc", name = "L", descriptor = "I")
    public int field1042 = -1;

    @OriginalMember(owner = "gc", name = "M", descriptor = "I")
    public int field1043 = -1;

    @OriginalMember(owner = "gc", name = "N", descriptor = "Ls;")
    public static LruCache field1044 = new LruCache(false, 30);

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "gc", name = "j", descriptor = "I")
    private static int field1014;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Llb;")
    private static Packet field1012;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Lclient;")
    public static client field1009;

    @OriginalMember(owner = "gc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1016;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[B")
    public byte[] field1017;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    private static int[] field1011;

    @OriginalMember(owner = "gc", name = "o", descriptor = "[I")
    private int[] field1019;

    @OriginalMember(owner = "gc", name = "p", descriptor = "[I")
    private int[] field1020;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[I")
    private int[] field1026;

    @OriginalMember(owner = "gc", name = "w", descriptor = "[I")
    private int[] field1027;

    @OriginalMember(owner = "gc", name = "K", descriptor = "[I")
    public int[] field1041;

    @OriginalMember(owner = "gc", name = "i", descriptor = "[Lgc;")
    private static NpcType[] field1013;

    @OriginalMember(owner = "gc", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field1028;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1012 = new Packet(-49365, arg0.method299("npc.dat", null));
        Packet var1 = new Packet(-49365, arg0.method299("npc.idx", null));
        field1010 = var1.method231();
        field1011 = new int[field1010];
        int var2 = 2;
        for (int var3 = 0; var3 < field1010; var3++) {
            field1011[var3] = var2;
            var2 += var1.method231();
        }
        field1013 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1013[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)V")
    public static final void method340(boolean arg0) {
        field1044 = null;
        field1011 = null;
        field1013 = null;
        field1012 = null;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method341(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1013[var1].field1015) {
                return field1013[var1];
            }
        }
        field1014 = (field1014 + 1) % 20;
        NpcType var2 = field1013[field1014] = new NpcType();
        field1012.field722 = field1011[arg0];
        var2.field1015 = arg0;
        var2.method342(field1012, false);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Llb;Z)V")
    private final void method342(Packet arg0, boolean arg1) {
        if (arg1) {
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
                    this.field1019 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1019[var6] = arg0.method231();
                    }
                } else if (var4 == 2) {
                    this.field1016 = arg0.method236();
                } else if (var4 == 3) {
                    this.field1017 = arg0.method237(true);
                } else if (var4 == 12) {
                    this.field1018 = arg0.method230();
                } else if (var4 == 13) {
                    this.field1021 = arg0.method231();
                } else if (var4 == 14) {
                    this.field1022 = arg0.method231();
                } else if (var4 == 17) {
                    this.field1022 = arg0.method231();
                    this.field1023 = arg0.method231();
                    this.field1024 = arg0.method231();
                    this.field1025 = arg0.method231();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1028 == null) {
                        this.field1028 = new String[5];
                    }
                    this.field1028[var4 - 30] = arg0.method236();
                    if (this.field1028[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1028[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method229();
                    this.field1026 = new int[var7];
                    this.field1027 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1026[var8] = arg0.method231();
                        this.field1027[var8] = arg0.method231();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method229();
                    this.field1020 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1020[var10] = arg0.method231();
                    }
                } else if (var4 == 90) {
                    this.field1029 = arg0.method231();
                } else if (var4 == 91) {
                    this.field1030 = arg0.method231();
                } else if (var4 == 92) {
                    this.field1031 = arg0.method231();
                } else if (var4 == 93) {
                    this.field1032 = false;
                } else if (var4 == 95) {
                    this.field1033 = arg0.method231();
                } else if (var4 == 97) {
                    this.field1034 = arg0.method231();
                } else if (var4 == 98) {
                    this.field1035 = arg0.method231();
                } else if (var4 == 99) {
                    this.field1036 = true;
                } else if (var4 == 100) {
                    this.field1037 = arg0.method230();
                } else if (var4 == 101) {
                    this.field1038 = arg0.method230() * 5;
                } else if (var4 == 102) {
                    this.field1039 = arg0.method231();
                } else if (var4 == 103) {
                    this.field1040 = arg0.method231();
                } else if (var4 == 106) {
                    this.field1042 = arg0.method231();
                    if (this.field1042 == 65535) {
                        this.field1042 = -1;
                    }
                    this.field1043 = arg0.method231();
                    if (this.field1043 == 65535) {
                        this.field1043 = -1;
                    }
                    int var11 = arg0.method229();
                    this.field1041 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1041[var12] = arg0.method231();
                        if (this.field1041[var12] == 65535) {
                            this.field1041[var12] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(IIZ[I)Leb;")
    public final Model method343(int arg0, int arg1, boolean arg2, int[] arg3) {
        if (arg2) {
            this.field1005 = !this.field1005;
        }
        if (this.field1041 != null) {
            NpcType var5 = this.method345(930);
            return var5 == null ? null : var5.method343(arg0, arg1, false, arg3);
        }
        Model var6 = (Model) field1044.method101(this.field1015);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1019.length; var8++) {
                if (!Model.method127(this.field1019[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1019.length];
            for (int var10 = 0; var10 < this.field1019.length; var10++) {
                var9[var10] = Model.method126(0, this.field1019[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model(var9, this.field1007, var9.length);
            }
            if (this.field1026 != null) {
                for (int var11 = 0; var11 < this.field1026.length; var11++) {
                    var6.method140(this.field1026[var11], this.field1027[var11]);
                }
            }
            var6.method133(true);
            var6.method143(this.field1037 + 64, this.field1038 + 850, -30, -50, -30, true);
            field1044.method102(true, this.field1015, var6);
        }
        Model var12 = Model.field548;
        var12.method128(true, var6, AnimFrame.method48(arg0, this.field1006) & AnimFrame.method48(arg1, this.field1006));
        if (arg0 != -1 && arg1 != -1) {
            var12.method135(0, arg0, arg3, arg1);
        } else if (arg0 != -1) {
            var12.method134(true, arg0);
        }
        if (this.field1034 != 128 || this.field1035 != 128) {
            var12.method142(19411, this.field1034, this.field1034, this.field1035);
        }
        var12.method130(4);
        var12.field585 = null;
        var12.field584 = null;
        if (this.field1018 == 1) {
            var12.field586 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Leb;")
    public final Model method344(int arg0) {
        if (arg0 >= 0) {
            this.field1008 = -200;
        }
        if (this.field1041 != null) {
            NpcType var2 = this.method345(930);
            return var2 == null ? null : var2.method344(-869);
        } else if (this.field1020 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1020.length; var4++) {
                if (!Model.method127(this.field1020[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var5 = new Model[this.field1020.length];
            for (int var6 = 0; var6 < this.field1020.length; var6++) {
                var5[var6] = Model.method126(0, this.field1020[var6]);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model(var5, this.field1007, var5.length);
            }
            if (this.field1026 != null) {
                for (int var8 = 0; var8 < this.field1026.length; var8++) {
                    var7.method140(this.field1026[var8], this.field1027[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Lgc;")
    public final NpcType method345(int arg0) {
        if (arg0 != 930) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1042 != -1) {
            VarbitType var3 = VarbitType.field1182[this.field1042];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field1671[var6 - var5];
            var2 = field1009.field1593[var4] >> var5 & var7;
        } else if (this.field1043 != -1) {
            var2 = field1009.field1593[this.field1043];
        }
        return var2 < 0 || var2 >= this.field1041.length || this.field1041[var2] == -1 ? null : method341(this.field1041[var2]);
    }
}
