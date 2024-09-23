import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field1002 = false;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field1003 = 44692;

    @OriginalMember(owner = "gc", name = "c", descriptor = "B")
    private byte field1004 = 4;

    @OriginalMember(owner = "gc", name = "i", descriptor = "J")
    public long field1010 = -1L;

    @OriginalMember(owner = "gc", name = "l", descriptor = "B")
    public byte field1013 = 1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1018 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1019 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "Z")
    public boolean field1027 = true;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1028 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1029 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1030 = 128;

    @OriginalMember(owner = "gc", name = "D", descriptor = "Z")
    public boolean field1031 = false;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1035 = 32;

    @OriginalMember(owner = "gc", name = "I", descriptor = "Ls;")
    public static LruCache field1036 = new LruCache((byte) 7, 30);

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "gc", name = "h", descriptor = "I")
    private static int field1009;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "gc", name = "f", descriptor = "Llb;")
    private static Packet field1007;

    @OriginalMember(owner = "gc", name = "j", descriptor = "Ljava/lang/String;")
    public String field1011;

    @OriginalMember(owner = "gc", name = "k", descriptor = "[B")
    public byte[] field1012;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    private static int[] field1006;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1014;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field1015;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1021;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[Lgc;")
    private static NpcType[] field1008;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field1023;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method336(Jagfile arg0) {
        field1007 = new Packet(arg0.method297("npc.dat", null), 15787);
        Packet var1 = new Packet(arg0.method297("npc.idx", null), 15787);
        field1005 = var1.method229();
        field1006 = new int[field1005];
        int var2 = 2;
        for (int var3 = 0; var3 < field1005; var3++) {
            field1006[var3] = var2;
            var2 += var1.method229();
        }
        field1008 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1008[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method337(byte arg0) {
        field1036 = null;
        field1006 = null;
        if (arg0 == 42) {
            field1008 = null;
            field1007 = null;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method338(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1008[var1].field1010) {
                return field1008[var1];
            }
        }
        field1009 = (field1009 + 1) % 20;
        NpcType var2 = field1008[field1009] = new NpcType();
        field1007.field710 = field1006[arg0];
        var2.field1010 = arg0;
        var2.method339(false, field1007);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZLlb;)V")
    private final void method339(boolean arg0, Packet arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method227();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method227();
                    this.field1014 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1014[var6] = arg1.method229();
                    }
                } else if (var4 == 2) {
                    this.field1011 = arg1.method234();
                } else if (var4 == 3) {
                    this.field1012 = arg1.method235(this.field1003);
                } else if (var4 == 12) {
                    this.field1013 = arg1.method228();
                } else if (var4 == 13) {
                    this.field1016 = arg1.method229();
                } else if (var4 == 14) {
                    this.field1017 = arg1.method229();
                } else if (var4 == 17) {
                    this.field1017 = arg1.method229();
                    this.field1018 = arg1.method229();
                    this.field1019 = arg1.method229();
                    this.field1020 = arg1.method229();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1023 == null) {
                        this.field1023 = new String[5];
                    }
                    this.field1023[var4 - 30] = arg1.method234();
                    if (this.field1023[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1023[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method227();
                    this.field1021 = new int[var7];
                    this.field1022 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1021[var8] = arg1.method229();
                        this.field1022[var8] = arg1.method229();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method227();
                    this.field1015 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1015[var10] = arg1.method229();
                    }
                } else if (var4 == 90) {
                    this.field1024 = arg1.method229();
                } else if (var4 == 91) {
                    this.field1025 = arg1.method229();
                } else if (var4 == 92) {
                    this.field1026 = arg1.method229();
                } else if (var4 == 93) {
                    this.field1027 = false;
                } else if (var4 == 95) {
                    this.field1028 = arg1.method229();
                } else if (var4 == 97) {
                    this.field1029 = arg1.method229();
                } else if (var4 == 98) {
                    this.field1030 = arg1.method229();
                } else if (var4 == 99) {
                    this.field1031 = true;
                } else if (var4 == 100) {
                    this.field1032 = arg1.method228();
                } else if (var4 == 101) {
                    this.field1033 = arg1.method228() * 5;
                } else if (var4 == 102) {
                    this.field1034 = arg1.method229();
                } else if (var4 == 103) {
                    this.field1035 = arg1.method229();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III[I)Leb;")
    public final Model method340(int arg0, int arg1, int arg2, int[] arg3) {
        Model var5 = (Model) field1036.method101(this.field1010);
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1014.length; var8++) {
                if (!Model.method126(this.field1014[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1014.length];
            for (int var10 = 0; var10 < this.field1014.length; var10++) {
                var9[var10] = Model.method125(this.field1014[var10], this.field1004);
            }
            if (var9.length == 1) {
                var5 = var9[0];
            } else {
                var5 = new Model(var9, var9.length, -33019);
            }
            if (this.field1021 != null) {
                for (int var11 = 0; var11 < this.field1021.length; var11++) {
                    var5.method139(this.field1021[var11], this.field1022[var11]);
                }
            }
            var5.method132((byte) 3);
            var5.method142(this.field1032 + 64, this.field1033 + 850, -30, -50, -30, true);
            field1036.method102(this.field1010, (byte) 76, var5);
        }
        Model var12 = Model.field531;
        var12.method127(AnimFrame.method48(arg2, 0) & AnimFrame.method48(arg1, 0), var5, 0);
        if (arg2 != -1 && arg1 != -1) {
            var12.method134(arg2, true, arg1, arg3);
        } else if (arg2 != -1) {
            var12.method133(arg2, 188);
        }
        if (this.field1029 != 128 || this.field1030 != 128) {
            var12.method141(this.field1029, this.field1029, this.field1030, (byte) 31);
        }
        var12.method129(-18258);
        var12.field568 = null;
        var12.field567 = null;
        if (this.field1013 == 1) {
            var12.field569 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(B)Leb;")
    public final Model method341(byte arg0) {
        if (arg0 != 105) {
            throw new NullPointerException();
        } else if (this.field1015 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1015.length; var3++) {
                if (!Model.method126(this.field1015[var3])) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            Model[] var4 = new Model[this.field1015.length];
            for (int var5 = 0; var5 < this.field1015.length; var5++) {
                var4[var5] = Model.method125(this.field1015[var5], this.field1004);
            }
            Model var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new Model(var4, var4.length, -33019);
            }
            if (this.field1021 != null) {
                for (int var7 = 0; var7 < this.field1021.length; var7++) {
                    var6.method139(this.field1021[var7], this.field1022[var7]);
                }
            }
            return var6;
        }
    }
}
