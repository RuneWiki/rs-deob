import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private int field996 = -32952;

    @OriginalMember(owner = "gc", name = "h", descriptor = "J")
    private long field1003 = -1L;

    @OriginalMember(owner = "gc", name = "k", descriptor = "B")
    public byte field1006 = 1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field1009 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1010 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1011 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1013 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1018 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1019 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1020 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1022 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1023 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1024 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1028 = 32;

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private static boolean field997 = true;

    @OriginalMember(owner = "gc", name = "H", descriptor = "Ls;")
    public static LruCache field1029 = new LruCache(30, 0);

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field1002;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Llb;")
    private static Packet field1000;

    @OriginalMember(owner = "gc", name = "i", descriptor = "Ljava/lang/String;")
    public String field1004;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[B")
    public byte[] field1005;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field1007;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1008;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field1014;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1015;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static NpcType[] field1001;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1016;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method333(Jagfile arg0) {
        field1000 = new Packet(arg0.method294("npc.dat", null), (byte) 1);
        Packet var1 = new Packet(arg0.method294("npc.idx", null), (byte) 1);
        field998 = var1.method226();
        field999 = new int[field998];
        int var2 = 2;
        for (int var3 = 0; var3 < field998; var3++) {
            field999[var3] = var2;
            var2 += var1.method226();
        }
        field1001 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1001[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method334(byte arg0) {
        field1029 = null;
        field999 = null;
        field1001 = null;
        field1000 = null;
        if (arg0 == 1) {
            boolean var1 = false;
        } else {
            field997 = !field997;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method335(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1001[var1].field1003) {
                return field1001[var1];
            }
        }
        field1002 = (field1002 + 1) % 20;
        NpcType var2 = field1001[field1002] = new NpcType();
        field1000.field709 = field999[arg0];
        var2.field1003 = arg0;
        var2.method336((byte) 2, field1000);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BLlb;)V")
    private final void method336(byte arg0, Packet arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg1.method224();
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method224();
                    this.field1007 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1007[var7] = arg1.method226();
                    }
                } else if (var5 == 2) {
                    this.field1004 = arg1.method231();
                } else if (var5 == 3) {
                    this.field1005 = arg1.method232(this.field996);
                } else if (var5 == 12) {
                    this.field1006 = arg1.method225();
                } else if (var5 == 13) {
                    this.field1009 = arg1.method226();
                } else if (var5 == 14) {
                    this.field1010 = arg1.method226();
                } else if (var5 == 17) {
                    this.field1010 = arg1.method226();
                    this.field1011 = arg1.method226();
                    this.field1012 = arg1.method226();
                    this.field1013 = arg1.method226();
                } else if (var5 >= 30 && var5 < 40) {
                    if (this.field1016 == null) {
                        this.field1016 = new String[5];
                    }
                    this.field1016[var5 - 30] = arg1.method231();
                    if (this.field1016[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field1016[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method224();
                    this.field1014 = new int[var8];
                    this.field1015 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1014[var9] = arg1.method226();
                        this.field1015[var9] = arg1.method226();
                    }
                } else if (var5 == 60) {
                    int var10 = arg1.method224();
                    this.field1008 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field1008[var11] = arg1.method226();
                    }
                } else if (var5 == 90) {
                    this.field1017 = arg1.method226();
                } else if (var5 == 91) {
                    this.field1018 = arg1.method226();
                } else if (var5 == 92) {
                    this.field1019 = arg1.method226();
                } else if (var5 == 93) {
                    this.field1020 = false;
                } else if (var5 == 95) {
                    this.field1021 = arg1.method226();
                } else if (var5 == 97) {
                    this.field1022 = arg1.method226();
                } else if (var5 == 98) {
                    this.field1023 = arg1.method226();
                } else if (var5 == 99) {
                    this.field1024 = true;
                } else if (var5 == 100) {
                    this.field1025 = arg1.method225();
                } else if (var5 == 101) {
                    this.field1026 = arg1.method225() * 5;
                } else if (var5 == 102) {
                    this.field1027 = arg1.method226();
                } else if (var5 == 103) {
                    this.field1028 = arg1.method226();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III[I)Leb;")
    public final Model method337(int arg0, int arg1, int arg2, int[] arg3) {
        Model var5 = (Model) field1029.method101(this.field1003);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field1007.length; var7++) {
                if (!Model.method126(this.field1007[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field1007.length];
            for (int var9 = 0; var9 < this.field1007.length; var9++) {
                var8[var9] = Model.method125(this.field1007[var9], 6);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model(var8.length, -643, var8);
            }
            if (this.field1014 != null) {
                for (int var10 = 0; var10 < this.field1014.length; var10++) {
                    var5.method139(this.field1014[var10], this.field1015[var10]);
                }
            }
            var5.method132(9);
            var5.method142(this.field1025 + 64, this.field1026 + 850, -30, -50, -30, true);
            field1029.method102(201, this.field1003, var5);
        }
        Model var11 = Model.field531;
        int var12 = 62 / arg2;
        var11.method127(0, var5, AnimFrame.method48(arg0, 0) & AnimFrame.method48(arg1, 0));
        if (arg0 != -1 && arg1 != -1) {
            var11.method134(-32031, arg3, arg0, arg1);
        } else if (arg0 != -1) {
            var11.method133(arg0, -284);
        }
        if (this.field1022 != 128 || this.field1023 != 128) {
            var11.method141(9, this.field1022, this.field1022, this.field1023);
        }
        var11.method129(486);
        var11.field568 = null;
        var11.field567 = null;
        if (this.field1006 == 1) {
            var11.field569 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(B)Leb;")
    public final Model method338(byte arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1008 == null) {
            return null;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < this.field1008.length; var4++) {
            if (!Model.method126(this.field1008[var4])) {
                var3 = true;
            }
        }
        if (var3) {
            return null;
        }
        Model[] var5 = new Model[this.field1008.length];
        for (int var6 = 0; var6 < this.field1008.length; var6++) {
            var5[var6] = Model.method125(this.field1008[var6], 6);
        }
        Model var7;
        if (var5.length == 1) {
            var7 = var5[0];
        } else {
            var7 = new Model(var5.length, -643, var5);
        }
        if (this.field1014 != null) {
            for (int var8 = 0; var8 < this.field1014.length; var8++) {
                var7.method139(this.field1014[var8], this.field1015[var8]);
            }
        }
        return var7;
    }
}
