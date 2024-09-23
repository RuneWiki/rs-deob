import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private int field977 = 579;

    @OriginalMember(owner = "gc", name = "h", descriptor = "J")
    private long field984 = -1L;

    @OriginalMember(owner = "gc", name = "k", descriptor = "B")
    public byte field987 = 1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field990 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field991 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field992 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field993 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field994 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field998 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field999 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1000 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1001 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1002 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1003 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1004 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1005 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1008 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1009 = 32;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private static int field978 = 6;

    @OriginalMember(owner = "gc", name = "H", descriptor = "Lt;")
    public static LruCache field1010 = new LruCache((byte) 3, 30);

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field983;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Lmb;")
    private static Packet field981;

    @OriginalMember(owner = "gc", name = "i", descriptor = "Ljava/lang/String;")
    public String field985;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[B")
    public byte[] field986;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field980;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field988;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field989;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field996;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static NpcType[] field982;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field997;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method342(Jagfile arg0) {
        field981 = new Packet(arg0.method309("npc.dat", null), (byte) 3);
        Packet var1 = new Packet(arg0.method309("npc.idx", null), (byte) 3);
        field979 = var1.method241();
        field980 = new int[field979];
        int var2 = 2;
        for (int var3 = 0; var3 < field979; var3++) {
            field980[var3] = var2;
            var2 += var1.method241();
        }
        field982 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field982[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)V")
    public static final void method343(int arg0) {
        field1010 = null;
        field980 = null;
        if (arg0 <= 0) {
            field978 = -75;
        }
        field982 = null;
        field981 = null;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lgc;")
    public static final NpcType method344(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field982[var1].field984) {
                return field982[var1];
            }
        }
        field983 = (field983 + 1) % 20;
        NpcType var2 = field982[field983] = new NpcType();
        field981.field711 = field980[arg0];
        var2.field984 = arg0;
        var2.method345(9, field981);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILmb;)V")
    private final void method345(int arg0, Packet arg1) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method239();
                    this.field988 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field988[var5] = arg1.method241();
                    }
                } else if (var3 == 2) {
                    this.field985 = arg1.method246();
                } else if (var3 == 3) {
                    this.field986 = arg1.method247((byte) 3);
                } else if (var3 == 12) {
                    this.field987 = arg1.method240();
                } else if (var3 == 13) {
                    this.field990 = arg1.method241();
                } else if (var3 == 14) {
                    this.field991 = arg1.method241();
                } else if (var3 == 17) {
                    this.field991 = arg1.method241();
                    this.field992 = arg1.method241();
                    this.field993 = arg1.method241();
                    this.field994 = arg1.method241();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field997 == null) {
                        this.field997 = new String[5];
                    }
                    this.field997[var3 - 30] = arg1.method246();
                    if (this.field997[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field997[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method239();
                    this.field995 = new int[var6];
                    this.field996 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field995[var7] = arg1.method241();
                        this.field996[var7] = arg1.method241();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method239();
                    this.field989 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field989[var9] = arg1.method241();
                    }
                } else if (var3 == 90) {
                    this.field998 = arg1.method241();
                } else if (var3 == 91) {
                    this.field999 = arg1.method241();
                } else if (var3 == 92) {
                    this.field1000 = arg1.method241();
                } else if (var3 == 93) {
                    this.field1001 = false;
                } else if (var3 == 95) {
                    this.field1002 = arg1.method241();
                } else if (var3 == 97) {
                    this.field1003 = arg1.method241();
                } else if (var3 == 98) {
                    this.field1004 = arg1.method241();
                } else if (var3 == 99) {
                    this.field1005 = true;
                } else if (var3 == 100) {
                    this.field1006 = arg1.method240();
                } else if (var3 == 101) {
                    this.field1007 = arg1.method240() * 5;
                } else if (var3 == 102) {
                    this.field1008 = arg1.method241();
                } else if (var3 == 103) {
                    this.field1009 = arg1.method241();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(II[II)Lfb;")
    public final Model method346(int arg0, int arg1, int[] arg2, int arg3) {
        Model var5 = (Model) field1010.method115(this.field984);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field988.length; var7++) {
                if (!Model.method140(this.field988[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field988.length];
            for (int var9 = 0; var9 < this.field988.length; var9++) {
                var8[var9] = Model.method139(0, this.field988[var9]);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model(var8, var8.length, -928);
            }
            if (this.field995 != null) {
                for (int var10 = 0; var10 < this.field995.length; var10++) {
                    var5.method153(this.field995[var10], this.field996[var10]);
                }
            }
            var5.method146((byte) 112);
            var5.method156(this.field1006 + 64, this.field1007 + 850, -30, -50, -30, true);
            field1010.method116(var5, false, this.field984);
        }
        Model var11 = Model.field534;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        var11.method141(AnimFrame.method62((byte) 8, arg1) & AnimFrame.method62((byte) 8, arg3), 764, var5);
        if (arg1 != -1 && arg3 != -1) {
            var11.method148(arg2, -620, arg1, arg3);
        } else if (arg1 != -1) {
            var11.method147(true, arg1);
        }
        if (this.field1003 != 128 || this.field1004 != 128) {
            var11.method155(792, this.field1003, this.field1003, this.field1004);
        }
        var11.method143(-15382);
        var11.field571 = null;
        var11.field570 = null;
        if (this.field987 == 1) {
            var11.field572 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Lfb;")
    public final Model method347(int arg0) {
        if (arg0 != 21159) {
            this.field977 = -37;
        }
        if (this.field989 == null) {
            return null;
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < this.field989.length; var3++) {
            if (!Model.method140(this.field989[var3])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var4 = new Model[this.field989.length];
        for (int var5 = 0; var5 < this.field989.length; var5++) {
            var4[var5] = Model.method139(0, this.field989[var5]);
        }
        Model var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new Model(var4, var4.length, -928);
        }
        if (this.field995 != null) {
            for (int var7 = 0; var7 < this.field995.length; var7++) {
                var6.method153(this.field995[var7], this.field996[var7]);
            }
        }
        return var6;
    }
}
