import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "B")
    private byte field1011 = 0;

    @OriginalMember(owner = "gc", name = "h", descriptor = "J")
    private long field1018 = -1L;

    @OriginalMember(owner = "gc", name = "k", descriptor = "B")
    public byte field1021 = 1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1028 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1035 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1036 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1037 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1038 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1039 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1042 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "Lt;")
    public static LruCache field1043 = new LruCache(0, 30);

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field1017;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Lmb;")
    private static Packet field1015;

    @OriginalMember(owner = "gc", name = "i", descriptor = "Ljava/lang/String;")
    public String field1019;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[B")
    public byte[] field1020;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field1014;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1023;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field1029;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1030;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static NpcType[] field1016;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1031;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method342(Jagfile arg0) {
        field1015 = new Packet(45427, arg0.method309("npc.dat", null));
        Packet var1 = new Packet(45427, arg0.method309("npc.idx", null));
        field1013 = var1.method241();
        field1014 = new int[field1013];
        int var2 = 2;
        for (int var3 = 0; var3 < field1013; var3++) {
            field1014[var3] = var2;
            var2 += var1.method241();
        }
        field1016 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1016[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)V")
    public static final void method343(boolean arg0) {
        field1043 = null;
        field1014 = null;
        field1016 = null;
        if (arg0) {
            field1015 = null;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method344(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1016[var1].field1018) {
                return field1016[var1];
            }
        }
        field1017 = (field1017 + 1) % 20;
        NpcType var2 = field1016[field1017] = new NpcType();
        field1015.field736 = field1014[arg0];
        var2.field1018 = arg0;
        var2.method345(field1015, (byte) 66);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lmb;B)V")
    private final void method345(Packet arg0, byte arg1) {
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method239();
                    this.field1022 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1022[var5] = arg0.method241();
                    }
                } else if (var3 == 2) {
                    this.field1019 = arg0.method246();
                } else if (var3 == 3) {
                    this.field1020 = arg0.method247(true);
                } else if (var3 == 12) {
                    this.field1021 = arg0.method240();
                } else if (var3 == 13) {
                    this.field1024 = arg0.method241();
                } else if (var3 == 14) {
                    this.field1025 = arg0.method241();
                } else if (var3 == 17) {
                    this.field1025 = arg0.method241();
                    this.field1026 = arg0.method241();
                    this.field1027 = arg0.method241();
                    this.field1028 = arg0.method241();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1031 == null) {
                        this.field1031 = new String[5];
                    }
                    this.field1031[var3 - 30] = arg0.method246();
                    if (this.field1031[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1031[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method239();
                    this.field1029 = new int[var6];
                    this.field1030 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1029[var7] = arg0.method241();
                        this.field1030[var7] = arg0.method241();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method239();
                    this.field1023 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1023[var9] = arg0.method241();
                    }
                } else if (var3 == 90) {
                    this.field1032 = arg0.method241();
                } else if (var3 == 91) {
                    this.field1033 = arg0.method241();
                } else if (var3 == 92) {
                    this.field1034 = arg0.method241();
                } else if (var3 == 93) {
                    this.field1035 = false;
                } else if (var3 == 95) {
                    this.field1036 = arg0.method241();
                } else if (var3 == 97) {
                    this.field1037 = arg0.method241();
                } else if (var3 == 98) {
                    this.field1038 = arg0.method241();
                } else if (var3 == 99) {
                    this.field1039 = true;
                } else if (var3 == 100) {
                    this.field1040 = arg0.method240();
                } else if (var3 == 101) {
                    this.field1041 = arg0.method240() * 5;
                } else if (var3 == 102) {
                    this.field1042 = arg0.method241();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(II[II)Lfb;")
    public final Model method346(int arg0, int arg1, int[] arg2, int arg3) {
        Model var5 = (Model) field1043.method115(this.field1018);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                if (!Model.method140(this.field1022[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field1022.length];
            for (int var9 = 0; var9 < this.field1022.length; var9++) {
                var8[var9] = Model.method139(0, this.field1022[var9]);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model(var8.length, var8, -38792);
            }
            if (this.field1029 != null) {
                for (int var10 = 0; var10 < this.field1029.length; var10++) {
                    var5.method153(this.field1029[var10], this.field1030[var10]);
                }
            }
            var5.method146((byte) 107);
            var5.method156(this.field1040 + 64, this.field1041 + 850, -30, -50, -30, true);
            field1043.method116(true, this.field1018, var5);
        }
        Model var11 = Model.field558;
        if (arg3 >= 0) {
            this.field1012 = -319;
        }
        var11.method141(0, AnimFrame.method62((byte) 7, arg0) & AnimFrame.method62((byte) 7, arg1), var5);
        if (arg0 != -1 && arg1 != -1) {
            var11.method148(0, arg1, arg2, arg0);
        } else if (arg0 != -1) {
            var11.method147(this.field1011, arg0);
        }
        if (this.field1037 != 128 || this.field1038 != 128) {
            var11.method155(this.field1037, this.field1038, (byte) -121, this.field1037);
        }
        var11.method143(0);
        var11.field595 = null;
        var11.field594 = null;
        if (this.field1021 == 1) {
            var11.field596 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(Z)Lfb;")
    public final Model method347(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1023 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1023.length; var3++) {
                if (!Model.method140(this.field1023[var3])) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            Model[] var4 = new Model[this.field1023.length];
            for (int var5 = 0; var5 < this.field1023.length; var5++) {
                var4[var5] = Model.method139(0, this.field1023[var5]);
            }
            Model var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new Model(var4.length, var4, -38792);
            }
            if (this.field1029 != null) {
                for (int var7 = 0; var7 < this.field1029.length; var7++) {
                    var6.method153(this.field1029[var7], this.field1030[var7]);
                }
            }
            return var6;
        }
    }
}
