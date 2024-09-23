import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private int field986 = 8;

    @OriginalMember(owner = "gc", name = "b", descriptor = "B")
    private byte field987 = 86;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    private int field988 = -856;

    @OriginalMember(owner = "gc", name = "j", descriptor = "J")
    private long field995 = -1L;

    @OriginalMember(owner = "gc", name = "m", descriptor = "B")
    public byte field998 = 1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1002 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1003 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1005 = -1;

    @OriginalMember(owner = "gc", name = "u", descriptor = "Z")
    private boolean field1006 = false;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1010 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1011 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "Z")
    public boolean field1013 = true;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    public int field1014 = -1;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1015 = 128;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1016 = 128;

    @OriginalMember(owner = "gc", name = "F", descriptor = "Z")
    public boolean field1017 = false;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "gc", name = "d", descriptor = "Z")
    private static boolean field989 = true;

    @OriginalMember(owner = "gc", name = "J", descriptor = "Lt;")
    public static LruCache field1021 = new LruCache(30, (byte) 3);

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "gc", name = "i", descriptor = "I")
    private static int field994;

    @OriginalMember(owner = "gc", name = "g", descriptor = "Lmb;")
    private static Packet field992;

    @OriginalMember(owner = "gc", name = "k", descriptor = "Ljava/lang/String;")
    public String field996;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[B")
    public byte[] field997;

    @OriginalMember(owner = "gc", name = "o", descriptor = "[I")
    private int[] field1000;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[I")
    private int[] field1007;

    @OriginalMember(owner = "gc", name = "w", descriptor = "[I")
    private int[] field1008;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    private static int[] field991;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field999;

    @OriginalMember(owner = "gc", name = "h", descriptor = "[Lgc;")
    private static NpcType[] field993;

    @OriginalMember(owner = "gc", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field1009;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method340(Jagfile arg0) {
        field992 = new Packet(arg0.method308("npc.dat", null), false);
        Packet var1 = new Packet(arg0.method308("npc.idx", null), false);
        field990 = var1.method240();
        field991 = new int[field990];
        int var2 = 2;
        for (int var3 = 0; var3 < field990; var3++) {
            field991[var3] = var2;
            var2 += var1.method240();
        }
        field993 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field993[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method341(byte arg0) {
        field1021 = null;
        if (arg0 == 6) {
            boolean var1 = false;
        }
        field991 = null;
        field993 = null;
        field992 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method342(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field993[var1].field995) {
                return field993[var1];
            }
        }
        field994 = (field994 + 1) % 20;
        NpcType var2 = field993[field994] = new NpcType();
        field992.field713 = field991[arg0];
        var2.field995 = arg0;
        var2.method343(true, field992);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZLmb;)V")
    private final void method343(boolean arg0, Packet arg1) {
        if (!arg0) {
            this.field988 = -19;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method238();
                    this.field999 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field999[var5] = arg1.method240();
                    }
                } else if (var3 == 2) {
                    this.field996 = arg1.method245();
                } else if (var3 == 3) {
                    this.field997 = arg1.method246(this.field986);
                } else if (var3 == 12) {
                    this.field998 = arg1.method239();
                } else if (var3 == 13) {
                    this.field1001 = arg1.method240();
                } else if (var3 == 14) {
                    this.field1002 = arg1.method240();
                } else if (var3 == 16) {
                    this.field1006 = true;
                } else if (var3 == 17) {
                    this.field1002 = arg1.method240();
                    this.field1003 = arg1.method240();
                    this.field1004 = arg1.method240();
                    this.field1005 = arg1.method240();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1009 == null) {
                        this.field1009 = new String[5];
                    }
                    this.field1009[var3 - 30] = arg1.method245();
                    if (this.field1009[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1009[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method238();
                    this.field1007 = new int[var6];
                    this.field1008 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1007[var7] = arg1.method240();
                        this.field1008[var7] = arg1.method240();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method238();
                    this.field1000 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1000[var9] = arg1.method240();
                    }
                } else if (var3 == 90) {
                    this.field1010 = arg1.method240();
                } else if (var3 == 91) {
                    this.field1011 = arg1.method240();
                } else if (var3 == 92) {
                    this.field1012 = arg1.method240();
                } else if (var3 == 93) {
                    this.field1013 = false;
                } else if (var3 == 95) {
                    this.field1014 = arg1.method240();
                } else if (var3 == 97) {
                    this.field1015 = arg1.method240();
                } else if (var3 == 98) {
                    this.field1016 = arg1.method240();
                } else if (var3 == 99) {
                    this.field1017 = true;
                } else if (var3 == 100) {
                    this.field1018 = arg1.method239();
                } else if (var3 == 101) {
                    this.field1019 = arg1.method239() * 5;
                } else if (var3 == 102) {
                    this.field1020 = arg1.method240();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(IB[II)Lfb;")
    public final Model method344(int arg0, byte arg1, int[] arg2, int arg3) {
        Model var5 = (Model) field1021.method114(this.field995);
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        if (var5 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field999.length; var8++) {
                if (!Model.method139(this.field999[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field999.length];
            for (int var10 = 0; var10 < this.field999.length; var10++) {
                var9[var10] = Model.method138(this.field999[var10], -58);
            }
            if (var9.length == 1) {
                var5 = var9[0];
            } else {
                var5 = new Model(false, var9, var9.length);
            }
            if (this.field1007 != null) {
                for (int var11 = 0; var11 < this.field1007.length; var11++) {
                    var5.method152(this.field1007[var11], this.field1008[var11]);
                }
            }
            var5.method145(this.field987);
            var5.method155(this.field1018 + 64, this.field1019 + 850, -30, -50, -30, true);
            field1021.method115(false, var5, this.field995);
        }
        Model var12 = Model.field545;
        var12.method140(var5, 0, !this.field1006);
        if (arg0 != -1 && arg3 != -1) {
            var12.method147(arg2, arg3, arg0, (byte) 9);
        } else if (arg0 != -1) {
            var12.method146(true, arg0);
        }
        if (this.field1015 != 128 || this.field1016 != 128) {
            var12.method154(this.field1015, this.field1015, this.field1016, 7);
        }
        var12.method142(true);
        var12.field582 = null;
        var12.field581 = null;
        if (this.field998 == 1) {
            var12.field583 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)Lfb;")
    public final Model method345(boolean arg0) {
        if (this.field1000 == null) {
            return null;
        }
        boolean var2 = false;
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1000.length; var3++) {
            if (!Model.method139(this.field1000[var3])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var4 = new Model[this.field1000.length];
        for (int var5 = 0; var5 < this.field1000.length; var5++) {
            var4[var5] = Model.method138(this.field1000[var5], -58);
        }
        Model var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new Model(false, var4, var4.length);
        }
        if (this.field1007 != null) {
            for (int var7 = 0; var7 < this.field1007.length; var7++) {
                var6.method152(this.field1007[var7], this.field1008[var7]);
            }
        }
        return var6;
    }
}
