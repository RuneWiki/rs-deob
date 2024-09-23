import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "h", descriptor = "J")
    public long field996 = -1L;

    @OriginalMember(owner = "gc", name = "k", descriptor = "B")
    public byte field999 = 1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field1002 = -1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1003 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1005 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1006 = -1;

    @OriginalMember(owner = "gc", name = "v", descriptor = "I")
    public int field1010 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1011 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "Z")
    public boolean field1013 = true;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1014 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    private int field1015 = 128;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1016 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "Z")
    public boolean field1017 = false;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1021 = 32;

    @OriginalMember(owner = "gc", name = "H", descriptor = "Ls;")
    public static LruCache field1022 = new LruCache(false, 30);

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    private static int field995;

    @OriginalMember(owner = "gc", name = "e", descriptor = "Llb;")
    private static Packet field993;

    @OriginalMember(owner = "gc", name = "i", descriptor = "Ljava/lang/String;")
    public String field997;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field989;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[B")
    public byte[] field998;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[I")
    private int[] field1000;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1001;

    @OriginalMember(owner = "gc", name = "s", descriptor = "[I")
    private int[] field1007;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1008;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[I")
    private static int[] field992;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    private static NpcType[] field994;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1009;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method334(Jagfile arg0) {
        field993 = new Packet(arg0.method295("npc.dat", null), 185);
        Packet var1 = new Packet(arg0.method295("npc.idx", null), 185);
        field991 = var1.method227();
        field992 = new int[field991];
        int var2 = 2;
        for (int var3 = 0; var3 < field991; var3++) {
            field992[var3] = var2;
            var2 += var1.method227();
        }
        field994 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field994[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)V")
    public static final void method335(int arg0) {
        field1022 = null;
        if (arg0 != 0) {
            field989 = !field989;
        }
        field992 = null;
        field994 = null;
        field993 = null;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lgc;")
    public static final NpcType method336(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field994[var1].field996) {
                return field994[var1];
            }
        }
        field995 = (field995 + 1) % 20;
        NpcType var2 = field994[field995] = new NpcType();
        field993.field708 = field992[arg0];
        var2.field996 = arg0;
        var2.method337(field993, (byte) 81);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Llb;B)V")
    private final void method337(Packet arg0, byte arg1) {
        if (arg1 != 81) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method225();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method225();
                    this.field1000 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1000[var6] = arg0.method227();
                    }
                } else if (var4 == 2) {
                    this.field997 = arg0.method232();
                } else if (var4 == 3) {
                    this.field998 = arg0.method233(986);
                } else if (var4 == 12) {
                    this.field999 = arg0.method226();
                } else if (var4 == 13) {
                    this.field1002 = arg0.method227();
                } else if (var4 == 14) {
                    this.field1003 = arg0.method227();
                } else if (var4 == 17) {
                    this.field1003 = arg0.method227();
                    this.field1004 = arg0.method227();
                    this.field1005 = arg0.method227();
                    this.field1006 = arg0.method227();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1009 == null) {
                        this.field1009 = new String[5];
                    }
                    this.field1009[var4 - 30] = arg0.method232();
                    if (this.field1009[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1009[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method225();
                    this.field1007 = new int[var7];
                    this.field1008 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1007[var8] = arg0.method227();
                        this.field1008[var8] = arg0.method227();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method225();
                    this.field1001 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1001[var10] = arg0.method227();
                    }
                } else if (var4 == 90) {
                    this.field1010 = arg0.method227();
                } else if (var4 == 91) {
                    this.field1011 = arg0.method227();
                } else if (var4 == 92) {
                    this.field1012 = arg0.method227();
                } else if (var4 == 93) {
                    this.field1013 = false;
                } else if (var4 == 95) {
                    this.field1014 = arg0.method227();
                } else if (var4 == 97) {
                    this.field1015 = arg0.method227();
                } else if (var4 == 98) {
                    this.field1016 = arg0.method227();
                } else if (var4 == 99) {
                    this.field1017 = true;
                } else if (var4 == 100) {
                    this.field1018 = arg0.method226();
                } else if (var4 == 101) {
                    this.field1019 = arg0.method226() * 5;
                } else if (var4 == 102) {
                    this.field1020 = arg0.method227();
                } else if (var4 == 103) {
                    this.field1021 = arg0.method227();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III[I)Leb;")
    public final Model method338(int arg0, int arg1, int arg2, int[] arg3) {
        Model var5 = (Model) field1022.method101(this.field996);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field1000.length; var7++) {
                if (!Model.method126(this.field1000[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field1000.length];
            for (int var9 = 0; var9 < this.field1000.length; var9++) {
                var8[var9] = Model.method125(this.field1000[var9], (byte) -104);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model((byte) 3, var8.length, var8);
            }
            if (this.field1007 != null) {
                for (int var10 = 0; var10 < this.field1007.length; var10++) {
                    var5.method139(this.field1007[var10], this.field1008[var10]);
                }
            }
            var5.method132(45941);
            var5.method142(this.field1018 + 64, this.field1019 + 850, -30, -50, -30, true);
            field1022.method102(400, var5, this.field996);
        }
        Model var11 = Model.field533;
        if (arg0 != 0) {
            field989 = !field989;
        }
        var11.method127(var5, (byte) 104, AnimFrame.method48(this.field990, arg1) & AnimFrame.method48(this.field990, arg2));
        if (arg1 != -1 && arg2 != -1) {
            var11.method134(arg3, arg2, arg1, (byte) -116);
        } else if (arg1 != -1) {
            var11.method133(3, arg1);
        }
        if (this.field1015 != 128 || this.field1016 != 128) {
            var11.method141(this.field1015, this.field1015, (byte) 62, this.field1016);
        }
        var11.method129(364);
        var11.field570 = null;
        var11.field569 = null;
        if (this.field999 == 1) {
            var11.field571 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Leb;")
    public final Model method339(int arg0) {
        if (this.field1001 == null) {
            return null;
        }
        boolean var2 = false;
        if (arg0 != 0) {
            this.field990 = 444;
        }
        for (int var3 = 0; var3 < this.field1001.length; var3++) {
            if (!Model.method126(this.field1001[var3])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var4 = new Model[this.field1001.length];
        for (int var5 = 0; var5 < this.field1001.length; var5++) {
            var4[var5] = Model.method125(this.field1001[var5], (byte) -104);
        }
        Model var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new Model((byte) 3, var4.length, var4);
        }
        if (this.field1007 != null) {
            for (int var7 = 0; var7 < this.field1007.length; var7++) {
                var6.method139(this.field1007[var7], this.field1008[var7]);
            }
        }
        return var6;
    }
}
