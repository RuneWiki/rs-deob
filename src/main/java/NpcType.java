import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "g", descriptor = "J")
    private long field993 = -1L;

    @OriginalMember(owner = "gc", name = "j", descriptor = "B")
    public byte field996 = 1;

    @OriginalMember(owner = "gc", name = "m", descriptor = "I")
    public int field999 = -1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field1000 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1002 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1003 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "Z")
    private boolean field1004 = false;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field1008 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1009 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1010 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1011 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1013 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1014 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1015 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1018 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "Lt;")
    public static LruCache field1019 = new LruCache(30, 1);

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private static int field987;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    private static int field992;

    @OriginalMember(owner = "gc", name = "d", descriptor = "Lmb;")
    private static Packet field990;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Ljava/lang/String;")
    public String field994;

    @OriginalMember(owner = "gc", name = "i", descriptor = "[B")
    public byte[] field995;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field1005;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1006;

    @OriginalMember(owner = "gc", name = "c", descriptor = "[I")
    private static int[] field989;

    @OriginalMember(owner = "gc", name = "k", descriptor = "[I")
    private int[] field997;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field998;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[Lgc;")
    private static NpcType[] field991;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1007;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lyb;)V")
    public static final void method340(Jagfile arg0) {
        field990 = new Packet((byte) -109, arg0.method308("npc.dat", null));
        Packet var1 = new Packet((byte) -109, arg0.method308("npc.idx", null));
        field988 = var1.method240();
        field989 = new int[field988];
        int var2 = 2;
        for (int var3 = 0; var3 < field988; var3++) {
            field989[var3] = var2;
            var2 += var1.method240();
        }
        field991 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field991[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method341(byte arg0) {
        field1019 = null;
        field989 = null;
        field991 = null;
        if (arg0 == 9) {
            boolean var1 = false;
        } else {
            field987 = 11;
        }
        field990 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method342(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field991[var1].field993) {
                return field991[var1];
            }
        }
        field992 = (field992 + 1) % 20;
        NpcType var2 = field991[field992] = new NpcType();
        field990.field719 = field989[arg0];
        var2.field993 = arg0;
        var2.method343(168, field990);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILmb;)V")
    private final void method343(int arg0, Packet arg1) {
        int var3 = 15 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method238();
                    this.field997 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field997[var6] = arg1.method240();
                    }
                } else if (var4 == 2) {
                    this.field994 = arg1.method245();
                } else if (var4 == 3) {
                    this.field995 = arg1.method246(1);
                } else if (var4 == 12) {
                    this.field996 = arg1.method239();
                } else if (var4 == 13) {
                    this.field999 = arg1.method240();
                } else if (var4 == 14) {
                    this.field1000 = arg1.method240();
                } else if (var4 == 16) {
                    this.field1004 = true;
                } else if (var4 == 17) {
                    this.field1000 = arg1.method240();
                    this.field1001 = arg1.method240();
                    this.field1002 = arg1.method240();
                    this.field1003 = arg1.method240();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1007 == null) {
                        this.field1007 = new String[5];
                    }
                    this.field1007[var4 - 30] = arg1.method245();
                    if (this.field1007[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1007[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method238();
                    this.field1005 = new int[var7];
                    this.field1006 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1005[var8] = arg1.method240();
                        this.field1006[var8] = arg1.method240();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method238();
                    this.field998 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field998[var10] = arg1.method240();
                    }
                } else if (var4 == 90) {
                    this.field1008 = arg1.method240();
                } else if (var4 == 91) {
                    this.field1009 = arg1.method240();
                } else if (var4 == 92) {
                    this.field1010 = arg1.method240();
                } else if (var4 == 93) {
                    this.field1011 = false;
                } else if (var4 == 95) {
                    this.field1012 = arg1.method240();
                } else if (var4 == 97) {
                    this.field1013 = arg1.method240();
                } else if (var4 == 98) {
                    this.field1014 = arg1.method240();
                } else if (var4 == 99) {
                    this.field1015 = true;
                } else if (var4 == 100) {
                    this.field1016 = arg1.method239();
                } else if (var4 == 101) {
                    this.field1017 = arg1.method239() * 5;
                } else if (var4 == 102) {
                    this.field1018 = arg1.method240();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BII[I)Lfb;")
    public final Model method344(byte arg0, int arg1, int arg2, int[] arg3) {
        Model var5 = (Model) field1019.method114(this.field993);
        if (arg0 == 0) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field997.length; var9++) {
                if (!Model.method139(this.field997[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            Model[] var10 = new Model[this.field997.length];
            for (int var11 = 0; var11 < this.field997.length; var11++) {
                var10[var11] = Model.method138(this.field997[var11], -404);
            }
            if (var10.length == 1) {
                var5 = var10[0];
            } else {
                var5 = new Model(var10.length, 652, var10);
            }
            if (this.field1005 != null) {
                for (int var12 = 0; var12 < this.field1005.length; var12++) {
                    var5.method152(this.field1005[var12], this.field1006[var12]);
                }
            }
            var5.method145(-591);
            var5.method155(this.field1016 + 64, this.field1017 + 850, -30, -50, -30, true);
            field1019.method115(var5, this.field993, 39399);
        }
        Model var13 = Model.field538;
        var13.method140(!this.field1004, var5, true);
        if (arg1 != -1 && arg2 != -1) {
            var13.method147((byte) 74, arg1, arg2, arg3);
        } else if (arg1 != -1) {
            var13.method146(arg1, 13056);
        }
        if (this.field1013 != 128 || this.field1014 != 128) {
            var13.method154(this.field1014, this.field1013, 4, this.field1013);
        }
        var13.method142(true);
        var13.field575 = null;
        var13.field574 = null;
        if (this.field996 == 1) {
            var13.field576 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)Lfb;")
    public final Model method345(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field998 == null) {
            return null;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < this.field998.length; var4++) {
            if (!Model.method139(this.field998[var4])) {
                var3 = true;
            }
        }
        if (var3) {
            return null;
        }
        Model[] var5 = new Model[this.field998.length];
        for (int var6 = 0; var6 < this.field998.length; var6++) {
            var5[var6] = Model.method138(this.field998[var6], -404);
        }
        Model var7;
        if (var5.length == 1) {
            var7 = var5[0];
        } else {
            var7 = new Model(var5.length, 652, var5);
        }
        if (this.field1005 != null) {
            for (int var8 = 0; var8 < this.field1005.length; var8++) {
                var7.method152(this.field1005[var8], this.field1006[var8]);
            }
        }
        return var7;
    }
}
