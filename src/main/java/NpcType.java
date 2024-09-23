import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field991 = true;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field992 = 4697;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Z")
    private boolean field993 = true;

    @OriginalMember(owner = "gc", name = "d", descriptor = "Z")
    private boolean field994 = false;

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    private int field995 = 848;

    @OriginalMember(owner = "gc", name = "k", descriptor = "J")
    private long field1001 = -1L;

    @OriginalMember(owner = "gc", name = "n", descriptor = "B")
    public byte field1004 = 1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1007 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1008 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1009 = -1;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1010 = -1;

    @OriginalMember(owner = "gc", name = "u", descriptor = "I")
    public int field1011 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1015 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "Z")
    public boolean field1018 = true;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    public int field1019 = -1;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1020 = 128;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1021 = 128;

    @OriginalMember(owner = "gc", name = "F", descriptor = "Z")
    public boolean field1022 = false;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    public int field1026 = 32;

    @OriginalMember(owner = "gc", name = "K", descriptor = "Ls;")
    public static LruCache field1027 = new LruCache(30, 0);

    @OriginalMember(owner = "gc", name = "j", descriptor = "I")
    private static int field1000;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Llb;")
    private static Packet field998;

    @OriginalMember(owner = "gc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1002;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[B")
    public byte[] field1003;

    @OriginalMember(owner = "gc", name = "o", descriptor = "[I")
    private int[] field1005;

    @OriginalMember(owner = "gc", name = "p", descriptor = "[I")
    private int[] field1006;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[I")
    private int[] field1012;

    @OriginalMember(owner = "gc", name = "w", descriptor = "[I")
    private int[] field1013;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    private static int[] field997;

    @OriginalMember(owner = "gc", name = "i", descriptor = "[Lgc;")
    private static NpcType[] field999;

    @OriginalMember(owner = "gc", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field1014;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method333(Jagfile arg0) {
        field998 = new Packet((byte) 3, arg0.method294("npc.dat", null));
        Packet var1 = new Packet((byte) 3, arg0.method294("npc.idx", null));
        field996 = var1.method226();
        field997 = new int[field996];
        int var2 = 2;
        for (int var3 = 0; var3 < field996; var3++) {
            field997[var3] = var2;
            var2 += var1.method226();
        }
        field999 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field999[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method334(byte arg0) {
        field1027 = null;
        if (arg0 != 5) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field997 = null;
        field999 = null;
        field998 = null;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method335(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field999[var1].field1001) {
                return field999[var1];
            }
        }
        field1000 = (field1000 + 1) % 20;
        NpcType var2 = field999[field1000] = new NpcType();
        field998.field702 = field997[arg0];
        var2.field1001 = arg0;
        var2.method336(field998, -32477);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Llb;I)V")
    private final void method336(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            this.field994 = !this.field994;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method224();
                    this.field1005 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1005[var5] = arg0.method226();
                    }
                } else if (var3 == 2) {
                    this.field1002 = arg0.method231();
                } else if (var3 == 3) {
                    this.field1003 = arg0.method232(-399);
                } else if (var3 == 12) {
                    this.field1004 = arg0.method225();
                } else if (var3 == 13) {
                    this.field1007 = arg0.method226();
                } else if (var3 == 14) {
                    this.field1008 = arg0.method226();
                } else if (var3 == 17) {
                    this.field1008 = arg0.method226();
                    this.field1009 = arg0.method226();
                    this.field1010 = arg0.method226();
                    this.field1011 = arg0.method226();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1014 == null) {
                        this.field1014 = new String[5];
                    }
                    this.field1014[var3 - 30] = arg0.method231();
                    if (this.field1014[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1014[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method224();
                    this.field1012 = new int[var6];
                    this.field1013 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1012[var7] = arg0.method226();
                        this.field1013[var7] = arg0.method226();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method224();
                    this.field1006 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1006[var9] = arg0.method226();
                    }
                } else if (var3 == 90) {
                    this.field1015 = arg0.method226();
                } else if (var3 == 91) {
                    this.field1016 = arg0.method226();
                } else if (var3 == 92) {
                    this.field1017 = arg0.method226();
                } else if (var3 == 93) {
                    this.field1018 = false;
                } else if (var3 == 95) {
                    this.field1019 = arg0.method226();
                } else if (var3 == 97) {
                    this.field1020 = arg0.method226();
                } else if (var3 == 98) {
                    this.field1021 = arg0.method226();
                } else if (var3 == 99) {
                    this.field1022 = true;
                } else if (var3 == 100) {
                    this.field1023 = arg0.method225();
                } else if (var3 == 101) {
                    this.field1024 = arg0.method225() * 5;
                } else if (var3 == 102) {
                    this.field1025 = arg0.method226();
                } else if (var3 == 103) {
                    this.field1026 = arg0.method226();
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I[III)Leb;")
    public final Model method337(int arg0, int[] arg1, int arg2, int arg3) {
        Model var5 = (Model) field1027.method101(this.field1001);
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1005.length; var8++) {
                if (!Model.method126(this.field1005[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1005.length];
            for (int var10 = 0; var10 < this.field1005.length; var10++) {
                var9[var10] = Model.method125(this.field991, this.field1005[var10]);
            }
            if (var9.length == 1) {
                var5 = var9[0];
            } else {
                var5 = new Model(var9.length, var9, this.field992);
            }
            if (this.field1012 != null) {
                for (int var11 = 0; var11 < this.field1012.length; var11++) {
                    var5.method139(this.field1012[var11], this.field1013[var11]);
                }
            }
            var5.method132(1);
            var5.method142(this.field1023 + 64, this.field1024 + 850, -30, -50, -30, true);
            field1027.method102(this.field1001, var5, this.field995);
        }
        Model var12 = Model.field527;
        var12.method127(AnimFrame.method48(arg0, 681) & AnimFrame.method48(arg3, 681), var5, 8);
        if (arg0 != -1 && arg3 != -1) {
            var12.method134(arg3, arg1, arg0, true);
        } else if (arg0 != -1) {
            var12.method133(arg0, false);
        }
        if (this.field1020 != 128 || this.field1021 != 128) {
            var12.method141(this.field1020, this.field1021, 9, this.field1020);
        }
        var12.method129(this.field993);
        var12.field564 = null;
        var12.field563 = null;
        if (this.field1004 == 1) {
            var12.field565 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)Leb;")
    public final Model method338(boolean arg0) {
        if (arg0) {
            this.field995 = 386;
        }
        if (this.field1006 == null) {
            return null;
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < this.field1006.length; var3++) {
            if (!Model.method126(this.field1006[var3])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var4 = new Model[this.field1006.length];
        for (int var5 = 0; var5 < this.field1006.length; var5++) {
            var4[var5] = Model.method125(this.field991, this.field1006[var5]);
        }
        Model var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new Model(var4.length, var4, this.field992);
        }
        if (this.field1012 != null) {
            for (int var7 = 0; var7 < this.field1012.length; var7++) {
                var6.method139(this.field1012[var7], this.field1013[var7]);
            }
        }
        return var6;
    }
}
