import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private boolean field999 = false;

    @OriginalMember(owner = "gc", name = "i", descriptor = "J")
    public long field1006 = -1L;

    @OriginalMember(owner = "gc", name = "l", descriptor = "B")
    public byte field1009 = 1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1013 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1014 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1015 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1022 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "Z")
    public boolean field1023 = true;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1025 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1026 = 128;

    @OriginalMember(owner = "gc", name = "D", descriptor = "Z")
    public boolean field1027 = false;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1030 = -1;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1031 = 32;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "gc", name = "L", descriptor = "Ls;")
    public static LruCache field1035 = new LruCache((byte) 8, 30);

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "gc", name = "h", descriptor = "I")
    private static int field1005;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private static int field998;

    @OriginalMember(owner = "gc", name = "f", descriptor = "Llb;")
    private static Packet field1003;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Lclient;")
    public static client field1000;

    @OriginalMember(owner = "gc", name = "j", descriptor = "Ljava/lang/String;")
    public String field1007;

    @OriginalMember(owner = "gc", name = "k", descriptor = "[B")
    public byte[] field1008;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    private static int[] field1002;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1010;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field1011;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1017;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[I")
    private int[] field1018;

    @OriginalMember(owner = "gc", name = "I", descriptor = "[I")
    public int[] field1032;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[Lgc;")
    private static NpcType[] field1004;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field1019;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1003 = new Packet(arg0.method299("npc.dat", null), 58);
        Packet var1 = new Packet(arg0.method299("npc.idx", null), 58);
        field1001 = var1.method231();
        field1002 = new int[field1001];
        int var2 = 2;
        for (int var3 = 0; var3 < field1001; var3++) {
            field1002[var3] = var2;
            var2 += var1.method231();
        }
        field1004 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1004[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)V")
    public static final void method340(int arg0) {
        field1035 = null;
        field1002 = null;
        field1004 = null;
        if (arg0 < 0 || arg0 > 0) {
            field998 = 377;
        }
        field1003 = null;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lgc;")
    public static final NpcType method341(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1004[var1].field1006) {
                return field1004[var1];
            }
        }
        field1005 = (field1005 + 1) % 20;
        NpcType var2 = field1004[field1005] = new NpcType();
        field1003.field711 = field1002[arg0];
        var2.field1006 = arg0;
        var2.method342(field1003, 913);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Llb;I)V")
    private final void method342(Packet arg0, int arg1) {
        int var3 = 38 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method229();
                    this.field1010 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1010[var6] = arg0.method231();
                    }
                } else if (var4 == 2) {
                    this.field1007 = arg0.method236();
                } else if (var4 == 3) {
                    this.field1008 = arg0.method237(0);
                } else if (var4 == 12) {
                    this.field1009 = arg0.method230();
                } else if (var4 == 13) {
                    this.field1012 = arg0.method231();
                } else if (var4 == 14) {
                    this.field1013 = arg0.method231();
                } else if (var4 == 17) {
                    this.field1013 = arg0.method231();
                    this.field1014 = arg0.method231();
                    this.field1015 = arg0.method231();
                    this.field1016 = arg0.method231();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1019 == null) {
                        this.field1019 = new String[5];
                    }
                    this.field1019[var4 - 30] = arg0.method236();
                    if (this.field1019[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1019[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method229();
                    this.field1017 = new int[var7];
                    this.field1018 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1017[var8] = arg0.method231();
                        this.field1018[var8] = arg0.method231();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method229();
                    this.field1011 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1011[var10] = arg0.method231();
                    }
                } else if (var4 == 90) {
                    this.field1020 = arg0.method231();
                } else if (var4 == 91) {
                    this.field1021 = arg0.method231();
                } else if (var4 == 92) {
                    this.field1022 = arg0.method231();
                } else if (var4 == 93) {
                    this.field1023 = false;
                } else if (var4 == 95) {
                    this.field1024 = arg0.method231();
                } else if (var4 == 97) {
                    this.field1025 = arg0.method231();
                } else if (var4 == 98) {
                    this.field1026 = arg0.method231();
                } else if (var4 == 99) {
                    this.field1027 = true;
                } else if (var4 == 100) {
                    this.field1028 = arg0.method230();
                } else if (var4 == 101) {
                    this.field1029 = arg0.method230() * 5;
                } else if (var4 == 102) {
                    this.field1030 = arg0.method231();
                } else if (var4 == 103) {
                    this.field1031 = arg0.method231();
                } else if (var4 == 106) {
                    this.field1033 = arg0.method231();
                    if (this.field1033 == 65535) {
                        this.field1033 = -1;
                    }
                    this.field1034 = arg0.method231();
                    if (this.field1034 == 65535) {
                        this.field1034 = -1;
                    }
                    int var11 = arg0.method229();
                    this.field1032 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1032[var12] = arg0.method231();
                        if (this.field1032[var12] == 65535) {
                            this.field1032[var12] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I[IZI)Leb;")
    public final Model method343(int arg0, int[] arg1, boolean arg2, int arg3) {
        if (this.field1032 != null) {
            NpcType var5 = this.method345((byte) 8);
            return var5 == null ? null : var5.method343(arg0, arg1, true, arg3);
        }
        Model var6 = (Model) field1035.method101(this.field1006);
        if (!arg2) {
            this.field999 = !this.field999;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1010.length; var8++) {
                if (!Model.method127(this.field1010[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1010.length];
            for (int var10 = 0; var10 < this.field1010.length; var10++) {
                var9[var10] = Model.method126(this.field1010[var10], 1);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model((byte) 2, var9, var9.length);
            }
            if (this.field1017 != null) {
                for (int var11 = 0; var11 < this.field1017.length; var11++) {
                    var6.method140(this.field1017[var11], this.field1018[var11]);
                }
            }
            var6.method133(false);
            var6.method143(this.field1028 + 64, this.field1029 + 850, -30, -50, -30, true);
            field1035.method102(this.field1006, 0, var6);
        }
        Model var12 = Model.field536;
        var12.method128(9, AnimFrame.method48(4, arg0) & AnimFrame.method48(4, arg3), var6);
        if (arg0 != -1 && arg3 != -1) {
            var12.method135((byte) -104, arg1, arg3, arg0);
        } else if (arg0 != -1) {
            var12.method134(2, arg0);
        }
        if (this.field1025 != 128 || this.field1026 != 128) {
            var12.method142(this.field1025, this.field1025, this.field1026, 0);
        }
        var12.method130(793);
        var12.field573 = null;
        var12.field572 = null;
        if (this.field1009 == 1) {
            var12.field574 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Leb;")
    public final Model method344(int arg0) {
        if (arg0 != -23484) {
            field998 = -57;
        }
        if (this.field1032 != null) {
            NpcType var2 = this.method345((byte) 8);
            return var2 == null ? null : var2.method344(-23484);
        } else if (this.field1011 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1011.length; var4++) {
                if (!Model.method127(this.field1011[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var5 = new Model[this.field1011.length];
            for (int var6 = 0; var6 < this.field1011.length; var6++) {
                var5[var6] = Model.method126(this.field1011[var6], 1);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model((byte) 2, var5, var5.length);
            }
            if (this.field1017 != null) {
                for (int var8 = 0; var8 < this.field1017.length; var8++) {
                    var7.method140(this.field1017[var8], this.field1018[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)Lgc;")
    public final NpcType method345(byte arg0) {
        int var2 = -1;
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            field998 = 301;
        }
        if (this.field1033 != -1) {
            VarbitType var4 = VarbitType.field1172[this.field1033];
            int var5 = var4.field1174;
            int var6 = var4.field1175;
            int var7 = var4.field1176;
            int var8 = client.field1520[var7 - var6];
            var2 = field1000.field1227[var5] >> var6 & var8;
        } else if (this.field1034 != -1) {
            var2 = field1000.field1227[this.field1034];
        }
        return var2 < 0 || var2 >= this.field1032.length || this.field1032[var2] == -1 ? null : method341(this.field1032[var2]);
    }
}
