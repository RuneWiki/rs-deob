import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field982 = true;

    @OriginalMember(owner = "gc", name = "b", descriptor = "B")
    private byte field983 = 67;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    private int field984 = -475;

    @OriginalMember(owner = "gc", name = "j", descriptor = "J")
    private long field991 = -1L;

    @OriginalMember(owner = "gc", name = "m", descriptor = "B")
    public byte field994 = 1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field997 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field998 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field999 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1000 = -1;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1005 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1006 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1007 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "Z")
    public boolean field1008 = true;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    public int field1009 = -1;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1010 = 128;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1011 = 128;

    @OriginalMember(owner = "gc", name = "E", descriptor = "Z")
    public boolean field1012 = false;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1015 = -1;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1016 = 32;

    @OriginalMember(owner = "gc", name = "d", descriptor = "Z")
    private static boolean field985 = true;

    @OriginalMember(owner = "gc", name = "J", descriptor = "Lt;")
    public static LruCache field1017 = new LruCache(30, 0);

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "gc", name = "i", descriptor = "I")
    private static int field990;

    @OriginalMember(owner = "gc", name = "g", descriptor = "Lmb;")
    private static Packet field988;

    @OriginalMember(owner = "gc", name = "k", descriptor = "Ljava/lang/String;")
    public String field992;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[B")
    public byte[] field993;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[I")
    private int[] field1002;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[I")
    private int[] field1003;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    private static int[] field987;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "gc", name = "o", descriptor = "[I")
    private int[] field996;

    @OriginalMember(owner = "gc", name = "h", descriptor = "[Lgc;")
    private static NpcType[] field989;

    @OriginalMember(owner = "gc", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field1004;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method342(Jagfile arg0) {
        field988 = new Packet(16, arg0.method309("npc.dat", null));
        Packet var1 = new Packet(16, arg0.method309("npc.idx", null));
        field986 = var1.method241();
        field987 = new int[field986];
        int var2 = 2;
        for (int var3 = 0; var3 < field986; var3++) {
            field987[var3] = var2;
            var2 += var1.method241();
        }
        field989 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field989[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)V")
    public static final void method343(boolean arg0) {
        if (arg0) {
            field985 = !field985;
        }
        field1017 = null;
        field987 = null;
        field989 = null;
        field988 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method344(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field989[var1].field991) {
                return field989[var1];
            }
        }
        field990 = (field990 + 1) % 20;
        NpcType var2 = field989[field990] = new NpcType();
        field988.field717 = field987[arg0];
        var2.field991 = arg0;
        var2.method345(891, field988);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILmb;)V")
    private final void method345(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            this.field984 = -309;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method239();
                    this.field995 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field995[var5] = arg1.method241();
                    }
                } else if (var3 == 2) {
                    this.field992 = arg1.method246();
                } else if (var3 == 3) {
                    this.field993 = arg1.method247(-34736);
                } else if (var3 == 12) {
                    this.field994 = arg1.method240();
                } else if (var3 == 13) {
                    this.field997 = arg1.method241();
                } else if (var3 == 14) {
                    this.field998 = arg1.method241();
                } else if (var3 == 17) {
                    this.field998 = arg1.method241();
                    this.field999 = arg1.method241();
                    this.field1000 = arg1.method241();
                    this.field1001 = arg1.method241();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1004 == null) {
                        this.field1004 = new String[5];
                    }
                    this.field1004[var3 - 30] = arg1.method246();
                    if (this.field1004[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1004[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method239();
                    this.field1002 = new int[var6];
                    this.field1003 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1002[var7] = arg1.method241();
                        this.field1003[var7] = arg1.method241();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method239();
                    this.field996 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field996[var9] = arg1.method241();
                    }
                } else if (var3 == 90) {
                    this.field1005 = arg1.method241();
                } else if (var3 == 91) {
                    this.field1006 = arg1.method241();
                } else if (var3 == 92) {
                    this.field1007 = arg1.method241();
                } else if (var3 == 93) {
                    this.field1008 = false;
                } else if (var3 == 95) {
                    this.field1009 = arg1.method241();
                } else if (var3 == 97) {
                    this.field1010 = arg1.method241();
                } else if (var3 == 98) {
                    this.field1011 = arg1.method241();
                } else if (var3 == 99) {
                    this.field1012 = true;
                } else if (var3 == 100) {
                    this.field1013 = arg1.method240();
                } else if (var3 == 101) {
                    this.field1014 = arg1.method240() * 5;
                } else if (var3 == 102) {
                    this.field1015 = arg1.method241();
                } else if (var3 == 103) {
                    this.field1016 = arg1.method241();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I[III)Lfb;")
    public final Model method346(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Model var6 = (Model) field1017.method115(this.field991);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field995.length; var8++) {
                if (!Model.method140(this.field995[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field995.length];
            for (int var10 = 0; var10 < this.field995.length; var10++) {
                var9[var10] = Model.method139(this.field982, this.field995[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model(var9, var9.length, (byte) 2);
            }
            if (this.field1002 != null) {
                for (int var11 = 0; var11 < this.field1002.length; var11++) {
                    var6.method153(this.field1002[var11], this.field1003[var11]);
                }
            }
            var6.method146(0);
            var6.method156(this.field1013 + 64, this.field1014 + 850, -30, -50, -30, true);
            field1017.method116(var6, this.field991, this.field983);
        }
        Model var12 = Model.field540;
        var12.method141((byte) 85, AnimFrame.method62((byte) 17, arg0) & AnimFrame.method62((byte) 17, arg2), var6);
        if (arg0 != -1 && arg2 != -1) {
            var12.method148((byte) 5, arg2, arg0, arg1);
        } else if (arg0 != -1) {
            var12.method147((byte) 2, arg0);
        }
        if (this.field1010 != 128 || this.field1011 != 128) {
            var12.method155(this.field1010, (byte) 9, this.field1010, this.field1011);
        }
        var12.method143(2);
        var12.field577 = null;
        var12.field576 = null;
        if (this.field994 == 1) {
            var12.field578 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(Z)Lfb;")
    public final Model method347(boolean arg0) {
        if (this.field996 == null) {
            return null;
        }
        boolean var2 = false;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field996.length; var4++) {
            if (!Model.method140(this.field996[var4])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var5 = new Model[this.field996.length];
        for (int var6 = 0; var6 < this.field996.length; var6++) {
            var5[var6] = Model.method139(this.field982, this.field996[var6]);
        }
        Model var7;
        if (var5.length == 1) {
            var7 = var5[0];
        } else {
            var7 = new Model(var5, var5.length, (byte) 2);
        }
        if (this.field1002 != null) {
            for (int var8 = 0; var8 < this.field1002.length; var8++) {
                var7.method153(this.field1002[var8], this.field1003[var8]);
            }
        }
        return var7;
    }
}
