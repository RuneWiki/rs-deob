import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field1004 = true;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    private int field1006 = -843;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Z")
    private boolean field1008 = true;

    @OriginalMember(owner = "gc", name = "f", descriptor = "Z")
    private boolean field1009 = true;

    @OriginalMember(owner = "gc", name = "g", descriptor = "B")
    private byte field1010 = 7;

    @OriginalMember(owner = "gc", name = "n", descriptor = "J")
    public long field1017 = -1L;

    @OriginalMember(owner = "gc", name = "q", descriptor = "B")
    public byte field1020 = 1;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1023 = -1;

    @OriginalMember(owner = "gc", name = "u", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "gc", name = "E", descriptor = "Z")
    public boolean field1034 = true;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    private int field1036 = 128;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    private int field1037 = 128;

    @OriginalMember(owner = "gc", name = "I", descriptor = "Z")
    public boolean field1038 = false;

    @OriginalMember(owner = "gc", name = "L", descriptor = "I")
    public int field1041 = -1;

    @OriginalMember(owner = "gc", name = "M", descriptor = "I")
    public int field1042 = 32;

    @OriginalMember(owner = "gc", name = "O", descriptor = "I")
    public int field1044 = -1;

    @OriginalMember(owner = "gc", name = "P", descriptor = "I")
    public int field1045 = -1;

    @OriginalMember(owner = "gc", name = "b", descriptor = "B")
    private static byte field1005 = 59;

    @OriginalMember(owner = "gc", name = "Q", descriptor = "Ls;")
    public static LruCache field1046 = new LruCache(30, false);

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "gc", name = "i", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "gc", name = "m", descriptor = "I")
    private static int field1016;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "gc", name = "k", descriptor = "Llb;")
    private static Packet field1014;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Lclient;")
    public static client field1011;

    @OriginalMember(owner = "gc", name = "o", descriptor = "Ljava/lang/String;")
    public String field1018;

    @OriginalMember(owner = "gc", name = "p", descriptor = "[B")
    public byte[] field1019;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[I")
    private static int[] field1013;

    @OriginalMember(owner = "gc", name = "r", descriptor = "[I")
    private int[] field1021;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "gc", name = "y", descriptor = "[I")
    private int[] field1028;

    @OriginalMember(owner = "gc", name = "z", descriptor = "[I")
    private int[] field1029;

    @OriginalMember(owner = "gc", name = "N", descriptor = "[I")
    public int[] field1043;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[Lgc;")
    private static NpcType[] field1015;

    @OriginalMember(owner = "gc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1030;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1014 = new Packet(false, arg0.method299("npc.dat", null));
        Packet var1 = new Packet(false, arg0.method299("npc.idx", null));
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

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method340(byte arg0) {
        field1046 = null;
        if (field1005 == arg0) {
            field1013 = null;
            field1015 = null;
            field1014 = null;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method341(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1015[var1].field1017) {
                return field1015[var1];
            }
        }
        field1016 = (field1016 + 1) % 20;
        NpcType var2 = field1015[field1016] = new NpcType();
        field1014.field716 = field1013[arg0];
        var2.field1017 = arg0;
        var2.method342(field1014, false);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Llb;Z)V")
    private final void method342(Packet arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method229();
                    this.field1021 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1021[var5] = arg0.method231();
                    }
                } else if (var3 == 2) {
                    this.field1018 = arg0.method236();
                } else if (var3 == 3) {
                    this.field1019 = arg0.method237(false);
                } else if (var3 == 12) {
                    this.field1020 = arg0.method230();
                } else if (var3 == 13) {
                    this.field1023 = arg0.method231();
                } else if (var3 == 14) {
                    this.field1024 = arg0.method231();
                } else if (var3 == 17) {
                    this.field1024 = arg0.method231();
                    this.field1025 = arg0.method231();
                    this.field1026 = arg0.method231();
                    this.field1027 = arg0.method231();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1030 == null) {
                        this.field1030 = new String[5];
                    }
                    this.field1030[var3 - 30] = arg0.method236();
                    if (this.field1030[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1030[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method229();
                    this.field1028 = new int[var6];
                    this.field1029 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1028[var7] = arg0.method231();
                        this.field1029[var7] = arg0.method231();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method229();
                    this.field1022 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1022[var9] = arg0.method231();
                    }
                } else if (var3 == 90) {
                    this.field1031 = arg0.method231();
                } else if (var3 == 91) {
                    this.field1032 = arg0.method231();
                } else if (var3 == 92) {
                    this.field1033 = arg0.method231();
                } else if (var3 == 93) {
                    this.field1034 = false;
                } else if (var3 == 95) {
                    this.field1035 = arg0.method231();
                } else if (var3 == 97) {
                    this.field1036 = arg0.method231();
                } else if (var3 == 98) {
                    this.field1037 = arg0.method231();
                } else if (var3 == 99) {
                    this.field1038 = true;
                } else if (var3 == 100) {
                    this.field1039 = arg0.method230();
                } else if (var3 == 101) {
                    this.field1040 = arg0.method230() * 5;
                } else if (var3 == 102) {
                    this.field1041 = arg0.method231();
                } else if (var3 == 103) {
                    this.field1042 = arg0.method231();
                } else if (var3 == 106) {
                    this.field1044 = arg0.method231();
                    if (this.field1044 == 65535) {
                        this.field1044 = -1;
                    }
                    this.field1045 = arg0.method231();
                    if (this.field1045 == 65535) {
                        this.field1045 = -1;
                    }
                    int var10 = arg0.method229();
                    this.field1043 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1043[var11] = arg0.method231();
                        if (this.field1043[var11] == 65535) {
                            this.field1043[var11] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(IZ[II)Leb;")
    public final Model method343(int arg0, boolean arg1, int[] arg2, int arg3) {
        if (!arg1) {
            this.field1004 = !this.field1004;
        }
        if (this.field1043 != null) {
            NpcType var5 = this.method345(this.field1010);
            return var5 == null ? null : var5.method343(arg0, true, arg2, arg3);
        }
        Model var6 = (Model) field1046.method101(this.field1017);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1021.length; var8++) {
                if (!Model.method127(this.field1021[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1021.length];
            for (int var10 = 0; var10 < this.field1021.length; var10++) {
                var9[var10] = Model.method126(this.field1021[var10], 0);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model(var9.length, var9, (byte) 1);
            }
            if (this.field1028 != null) {
                for (int var11 = 0; var11 < this.field1028.length; var11++) {
                    var6.method140(this.field1028[var11], this.field1029[var11]);
                }
            }
            var6.method133(this.field1007);
            var6.method143(this.field1039 + 64, this.field1040 + 850, -30, -50, -30, true);
            field1046.method102(var6, this.field1017, this.field1008);
        }
        Model var12 = Model.field542;
        var12.method128(this.field1006, AnimFrame.method48(arg3, 0) & AnimFrame.method48(arg0, 0), var6);
        if (arg3 != -1 && arg0 != -1) {
            var12.method135(arg0, true, arg2, arg3);
        } else if (arg3 != -1) {
            var12.method134(-37879, arg3);
        }
        if (this.field1036 != 128 || this.field1037 != 128) {
            var12.method142(this.field1037, this.field1036, false, this.field1036);
        }
        var12.method130(0);
        var12.field579 = null;
        var12.field578 = null;
        if (this.field1020 == 1) {
            var12.field580 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(B)Leb;")
    public final Model method344(byte arg0) {
        if (arg0 != -72) {
            this.field1004 = !this.field1004;
        }
        if (this.field1043 != null) {
            NpcType var2 = this.method345(this.field1010);
            return var2 == null ? null : var2.method344((byte) -72);
        } else if (this.field1022 == null) {
            return null;
        } else {
            boolean var3 = false;
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
                var5[var6] = Model.method126(this.field1022[var6], 0);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model(var5.length, var5, (byte) 1);
            }
            if (this.field1028 != null) {
                for (int var8 = 0; var8 < this.field1028.length; var8++) {
                    var7.method140(this.field1028[var8], this.field1029[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(B)Lgc;")
    public final NpcType method345(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1009 = !this.field1009;
        }
        int var3 = -1;
        if (this.field1044 != -1) {
            VarbitType var4 = VarbitType.field1192[this.field1044];
            int var5 = var4.field1194;
            int var6 = var4.field1195;
            int var7 = var4.field1196;
            int var8 = client.field1379[var7 - var6];
            var3 = field1011.field1249[var5] >> var6 & var8;
        } else if (this.field1045 != -1) {
            var3 = field1011.field1249[this.field1045];
        }
        return var3 < 0 || var3 >= this.field1043.length || this.field1043[var3] == -1 ? null : method341(this.field1043[var3]);
    }
}
