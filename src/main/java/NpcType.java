import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field977 = 1;

    @OriginalMember(owner = "gc", name = "h", descriptor = "J")
    private long field983 = -1L;

    @OriginalMember(owner = "gc", name = "k", descriptor = "B")
    public byte field986 = 1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field989 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field990 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field991 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field992 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field993 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field997 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field998 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field999 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1000 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1002 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1003 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1004 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1007 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "Lt;")
    public static LruCache field1008 = new LruCache(0, 30);

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field982;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Lmb;")
    private static Packet field980;

    @OriginalMember(owner = "gc", name = "i", descriptor = "Ljava/lang/String;")
    public String field984;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[B")
    public byte[] field985;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field979;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field987;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field988;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field994;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static NpcType[] field981;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field996;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method342(Jagfile arg0) {
        field980 = new Packet(arg0.method309("npc.dat", null), 337);
        Packet var1 = new Packet(arg0.method309("npc.idx", null), 337);
        field978 = var1.method241();
        field979 = new int[field978];
        int var2 = 2;
        for (int var3 = 0; var3 < field978; var3++) {
            field979[var3] = var2;
            var2 += var1.method241();
        }
        field981 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field981[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)V")
    public static final void method343(boolean arg0) {
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1008 = null;
        field979 = null;
        field981 = null;
        field980 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method344(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field981[var1].field983) {
                return field981[var1];
            }
        }
        field982 = (field982 + 1) % 20;
        NpcType var2 = field981[field982] = new NpcType();
        field980.field710 = field979[arg0];
        var2.field983 = arg0;
        var2.method345(0, field980);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILmb;)V")
    private final void method345(int arg0, Packet arg1) {
        if (arg0 != 0) {
            this.field976 = 178;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method239();
                    this.field987 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field987[var5] = arg1.method241();
                    }
                } else if (var3 == 2) {
                    this.field984 = arg1.method246();
                } else if (var3 == 3) {
                    this.field985 = arg1.method247(3);
                } else if (var3 == 12) {
                    this.field986 = arg1.method240();
                } else if (var3 == 13) {
                    this.field989 = arg1.method241();
                } else if (var3 == 14) {
                    this.field990 = arg1.method241();
                } else if (var3 == 17) {
                    this.field990 = arg1.method241();
                    this.field991 = arg1.method241();
                    this.field992 = arg1.method241();
                    this.field993 = arg1.method241();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field996 == null) {
                        this.field996 = new String[5];
                    }
                    this.field996[var3 - 30] = arg1.method246();
                    if (this.field996[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field996[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method239();
                    this.field994 = new int[var6];
                    this.field995 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field994[var7] = arg1.method241();
                        this.field995[var7] = arg1.method241();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method239();
                    this.field988 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field988[var9] = arg1.method241();
                    }
                } else if (var3 == 90) {
                    this.field997 = arg1.method241();
                } else if (var3 == 91) {
                    this.field998 = arg1.method241();
                } else if (var3 == 92) {
                    this.field999 = arg1.method241();
                } else if (var3 == 93) {
                    this.field1000 = false;
                } else if (var3 == 95) {
                    this.field1001 = arg1.method241();
                } else if (var3 == 97) {
                    this.field1002 = arg1.method241();
                } else if (var3 == 98) {
                    this.field1003 = arg1.method241();
                } else if (var3 == 99) {
                    this.field1004 = true;
                } else if (var3 == 100) {
                    this.field1005 = arg1.method240();
                } else if (var3 == 101) {
                    this.field1006 = arg1.method240() * 5;
                } else if (var3 == 102) {
                    this.field1007 = arg1.method241();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III[I)Lfb;")
    public final Model method346(int arg0, int arg1, int arg2, int[] arg3) {
        Model var5 = (Model) field1008.method115(this.field983);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field987.length; var7++) {
                if (!Model.method140(this.field987[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field987.length];
            for (int var9 = 0; var9 < this.field987.length; var9++) {
                var8[var9] = Model.method139(this.field987[var9], (byte) -18);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model((byte) 1, var8.length, var8);
            }
            if (this.field994 != null) {
                for (int var10 = 0; var10 < this.field994.length; var10++) {
                    var5.method153(this.field994[var10], this.field995[var10]);
                }
            }
            var5.method146(true);
            var5.method156(this.field1005 + 64, this.field1006 + 850, -30, -50, -30, true);
            field1008.method116(-630, this.field983, var5);
        }
        Model var11 = Model.field539;
        if (arg2 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        var11.method141(var5, AnimFrame.method62(0, arg1) & AnimFrame.method62(0, arg0), 0);
        if (arg1 != -1 && arg0 != -1) {
            var11.method148(arg3, arg0, (byte) 2, arg1);
        } else if (arg1 != -1) {
            var11.method147(arg1, false);
        }
        if (this.field1002 != 128 || this.field1003 != 128) {
            var11.method155(this.field1002, (byte) 2, this.field1003, this.field1002);
        }
        var11.method143((byte) 63);
        var11.field576 = null;
        var11.field575 = null;
        if (this.field986 == 1) {
            var11.field577 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lfb;")
    public final Model method347(int arg0) {
        if (arg0 < this.field977 || arg0 > this.field977) {
            throw new NullPointerException();
        } else if (this.field988 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field988.length; var3++) {
                if (!Model.method140(this.field988[var3])) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            Model[] var4 = new Model[this.field988.length];
            for (int var5 = 0; var5 < this.field988.length; var5++) {
                var4[var5] = Model.method139(this.field988[var5], (byte) -18);
            }
            Model var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new Model((byte) 1, var4.length, var4);
            }
            if (this.field994 != null) {
                for (int var7 = 0; var7 < this.field994.length; var7++) {
                    var6.method153(this.field994[var7], this.field995[var7]);
                }
            }
            return var6;
        }
    }
}
