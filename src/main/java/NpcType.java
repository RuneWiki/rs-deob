import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class NpcType {

    @OriginalMember(owner = "hc", name = "h", descriptor = "J")
    private long field1007 = -1L;

    @OriginalMember(owner = "hc", name = "k", descriptor = "B")
    public byte field1010 = 1;

    @OriginalMember(owner = "hc", name = "n", descriptor = "I")
    public int field1013 = -1;

    @OriginalMember(owner = "hc", name = "o", descriptor = "I")
    public int field1014 = -1;

    @OriginalMember(owner = "hc", name = "p", descriptor = "I")
    public int field1015 = -1;

    @OriginalMember(owner = "hc", name = "q", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "hc", name = "r", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "hc", name = "v", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "hc", name = "w", descriptor = "I")
    public int field1022 = -1;

    @OriginalMember(owner = "hc", name = "x", descriptor = "I")
    public int field1023 = -1;

    @OriginalMember(owner = "hc", name = "y", descriptor = "Z")
    public boolean field1024 = true;

    @OriginalMember(owner = "hc", name = "z", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "hc", name = "A", descriptor = "I")
    private int field1026 = 128;

    @OriginalMember(owner = "hc", name = "B", descriptor = "I")
    private int field1027 = 128;

    @OriginalMember(owner = "hc", name = "C", descriptor = "Z")
    public boolean field1028 = false;

    @OriginalMember(owner = "hc", name = "F", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "hc", name = "G", descriptor = "I")
    public int field1032 = 32;

    @OriginalMember(owner = "hc", name = "b", descriptor = "I")
    private static int field1001 = -729;

    @OriginalMember(owner = "hc", name = "H", descriptor = "Ls;")
    public static LruCache field1033 = new LruCache(30, false);

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "hc", name = "g", descriptor = "I")
    private static int field1006;

    @OriginalMember(owner = "hc", name = "D", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "hc", name = "E", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "hc", name = "e", descriptor = "Lmb;")
    private static Packet field1004;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Ljava/lang/String;")
    public String field1008;

    @OriginalMember(owner = "hc", name = "j", descriptor = "[B")
    public byte[] field1009;

    @OriginalMember(owner = "hc", name = "d", descriptor = "[I")
    private static int[] field1003;

    @OriginalMember(owner = "hc", name = "l", descriptor = "[I")
    private int[] field1011;

    @OriginalMember(owner = "hc", name = "m", descriptor = "[I")
    private int[] field1012;

    @OriginalMember(owner = "hc", name = "s", descriptor = "[I")
    private int[] field1018;

    @OriginalMember(owner = "hc", name = "t", descriptor = "[I")
    private int[] field1019;

    @OriginalMember(owner = "hc", name = "f", descriptor = "[Lhc;")
    private static NpcType[] field1005;

    @OriginalMember(owner = "hc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1020;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Lyb;)V")
    public static final void method337(Jagfile arg0) {
        field1004 = new Packet(arg0.method298("npc.dat", null), true);
        Packet var1 = new Packet(arg0.method298("npc.idx", null), true);
        field1002 = var1.method230();
        field1003 = new int[field1002];
        int var2 = 2;
        for (int var3 = 0; var3 < field1002; var3++) {
            field1003[var3] = var2;
            var2 += var1.method230();
        }
        field1005 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1005[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(I)V")
    public static final void method338(int arg0) {
        field1033 = null;
        field1003 = null;
        field1005 = null;
        field1004 = null;
        if (arg0 != 0) {
            field1001 = -120;
        }
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lhc;")
    public static final NpcType method339(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1005[var1].field1007) {
                return field1005[var1];
            }
        }
        field1006 = (field1006 + 1) % 20;
        NpcType var2 = field1005[field1006] = new NpcType();
        field1004.field714 = field1003[arg0];
        var2.field1007 = arg0;
        var2.method340((byte) 44, field1004);
        return var2;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(BLmb;)V")
    private final void method340(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method228();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method228();
                    this.field1011 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1011[var5] = arg1.method230();
                    }
                } else if (var3 == 2) {
                    this.field1008 = arg1.method235();
                } else if (var3 == 3) {
                    this.field1009 = arg1.method236(4);
                } else if (var3 == 12) {
                    this.field1010 = arg1.method229();
                } else if (var3 == 13) {
                    this.field1013 = arg1.method230();
                } else if (var3 == 14) {
                    this.field1014 = arg1.method230();
                } else if (var3 == 17) {
                    this.field1014 = arg1.method230();
                    this.field1015 = arg1.method230();
                    this.field1016 = arg1.method230();
                    this.field1017 = arg1.method230();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1020 == null) {
                        this.field1020 = new String[5];
                    }
                    this.field1020[var3 - 30] = arg1.method235();
                    if (this.field1020[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1020[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method228();
                    this.field1018 = new int[var6];
                    this.field1019 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1018[var7] = arg1.method230();
                        this.field1019[var7] = arg1.method230();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method228();
                    this.field1012 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1012[var9] = arg1.method230();
                    }
                } else if (var3 == 90) {
                    this.field1021 = arg1.method230();
                } else if (var3 == 91) {
                    this.field1022 = arg1.method230();
                } else if (var3 == 92) {
                    this.field1023 = arg1.method230();
                } else if (var3 == 93) {
                    this.field1024 = false;
                } else if (var3 == 95) {
                    this.field1025 = arg1.method230();
                } else if (var3 == 97) {
                    this.field1026 = arg1.method230();
                } else if (var3 == 98) {
                    this.field1027 = arg1.method230();
                } else if (var3 == 99) {
                    this.field1028 = true;
                } else if (var3 == 100) {
                    this.field1029 = arg1.method229();
                } else if (var3 == 101) {
                    this.field1030 = arg1.method229() * 5;
                } else if (var3 == 102) {
                    this.field1031 = arg1.method230();
                } else if (var3 == 103) {
                    this.field1032 = arg1.method230();
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZII[I)Leb;")
    public final Model method341(boolean arg0, int arg1, int arg2, int[] arg3) {
        Model var5 = (Model) field1033.method101(this.field1007);
        if (arg0) {
            throw new NullPointerException();
        }
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field1011.length; var7++) {
                if (!Model.method126(this.field1011[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field1011.length];
            for (int var9 = 0; var9 < this.field1011.length; var9++) {
                var8[var9] = Model.method125(this.field1011[var9], 196);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model(172, var8, var8.length);
            }
            if (this.field1018 != null) {
                for (int var10 = 0; var10 < this.field1018.length; var10++) {
                    var5.method139(this.field1018[var10], this.field1019[var10]);
                }
            }
            var5.method132(this.field1000);
            var5.method142(this.field1029 + 64, this.field1030 + 850, -30, -50, -30, true);
            field1033.method102(var5, this.field1007, true);
        }
        Model var11 = Model.field535;
        var11.method127((byte) 6, var5, AnimFrame.method48(arg2, 62) & AnimFrame.method48(arg1, 62));
        if (arg2 != -1 && arg1 != -1) {
            var11.method134(306, arg2, arg3, arg1);
        } else if (arg2 != -1) {
            var11.method133(-278, arg2);
        }
        if (this.field1026 != 128 || this.field1027 != 128) {
            var11.method141(this.field1026, false, this.field1026, this.field1027);
        }
        var11.method129((byte) -17);
        var11.field572 = null;
        var11.field571 = null;
        if (this.field1010 == 1) {
            var11.field573 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(B)Leb;")
    public final Model method342(byte arg0) {
        if (this.field1012 == null) {
            return null;
        }
        boolean var2 = false;
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1012.length; var3++) {
            if (!Model.method126(this.field1012[var3])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var4 = new Model[this.field1012.length];
        for (int var5 = 0; var5 < this.field1012.length; var5++) {
            var4[var5] = Model.method125(this.field1012[var5], 196);
        }
        Model var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new Model(172, var4, var4.length);
        }
        if (this.field1018 != null) {
            for (int var7 = 0; var7 < this.field1018.length; var7++) {
                var6.method139(this.field1018[var7], this.field1019[var7]);
            }
        }
        return var6;
    }
}
