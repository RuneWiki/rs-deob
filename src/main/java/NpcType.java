import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field1004 = 16935;

    @OriginalMember(owner = "gc", name = "i", descriptor = "J")
    public long field1011 = -1L;

    @OriginalMember(owner = "gc", name = "l", descriptor = "B")
    public byte field1014 = 1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1018 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1019 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "Z")
    public boolean field1028 = true;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1029 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1030 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1031 = 128;

    @OriginalMember(owner = "gc", name = "D", descriptor = "Z")
    public boolean field1032 = false;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1036 = 32;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    public int field1039 = -1;

    @OriginalMember(owner = "gc", name = "L", descriptor = "Ls;")
    public static LruCache field1040 = new LruCache(30, true);

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "gc", name = "h", descriptor = "I")
    private static int field1010;

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "gc", name = "f", descriptor = "Llb;")
    private static Packet field1008;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Lclient;")
    public static client field1005;

    @OriginalMember(owner = "gc", name = "j", descriptor = "Ljava/lang/String;")
    public String field1012;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field1003;

    @OriginalMember(owner = "gc", name = "k", descriptor = "[B")
    public byte[] field1013;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    private static int[] field1007;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1015;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field1016;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[I")
    private int[] field1023;

    @OriginalMember(owner = "gc", name = "I", descriptor = "[I")
    public int[] field1037;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[Lgc;")
    private static NpcType[] field1009;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field1024;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1008 = new Packet(arg0.method299("npc.dat", null), field1003);
        Packet var1 = new Packet(arg0.method299("npc.idx", null), field1003);
        field1006 = var1.method231();
        field1007 = new int[field1006];
        int var2 = 2;
        for (int var3 = 0; var3 < field1006; var3++) {
            field1007[var3] = var2;
            var2 += var1.method231();
        }
        field1009 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1009[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)V")
    public static final void method340(byte arg0) {
        field1040 = null;
        field1007 = null;
        if (arg0 == 4) {
            boolean var1 = false;
            field1009 = null;
            field1008 = null;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Lgc;")
    public static final NpcType method341(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1009[var1].field1011) {
                return field1009[var1];
            }
        }
        field1010 = (field1010 + 1) % 20;
        NpcType var2 = field1009[field1010] = new NpcType();
        field1008.field712 = field1007[arg0];
        var2.field1011 = arg0;
        var2.method342(false, field1008);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZLlb;)V")
    private final void method342(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method229();
                    this.field1015 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1015[var5] = arg1.method231();
                    }
                } else if (var3 == 2) {
                    this.field1012 = arg1.method236();
                } else if (var3 == 3) {
                    this.field1013 = arg1.method237(940);
                } else if (var3 == 12) {
                    this.field1014 = arg1.method230();
                } else if (var3 == 13) {
                    this.field1017 = arg1.method231();
                } else if (var3 == 14) {
                    this.field1018 = arg1.method231();
                } else if (var3 == 17) {
                    this.field1018 = arg1.method231();
                    this.field1019 = arg1.method231();
                    this.field1020 = arg1.method231();
                    this.field1021 = arg1.method231();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1024 == null) {
                        this.field1024 = new String[5];
                    }
                    this.field1024[var3 - 30] = arg1.method236();
                    if (this.field1024[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1024[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method229();
                    this.field1022 = new int[var6];
                    this.field1023 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1022[var7] = arg1.method231();
                        this.field1023[var7] = arg1.method231();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method229();
                    this.field1016 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1016[var9] = arg1.method231();
                    }
                } else if (var3 == 90) {
                    this.field1025 = arg1.method231();
                } else if (var3 == 91) {
                    this.field1026 = arg1.method231();
                } else if (var3 == 92) {
                    this.field1027 = arg1.method231();
                } else if (var3 == 93) {
                    this.field1028 = false;
                } else if (var3 == 95) {
                    this.field1029 = arg1.method231();
                } else if (var3 == 97) {
                    this.field1030 = arg1.method231();
                } else if (var3 == 98) {
                    this.field1031 = arg1.method231();
                } else if (var3 == 99) {
                    this.field1032 = true;
                } else if (var3 == 100) {
                    this.field1033 = arg1.method230();
                } else if (var3 == 101) {
                    this.field1034 = arg1.method230() * 5;
                } else if (var3 == 102) {
                    this.field1035 = arg1.method231();
                } else if (var3 == 103) {
                    this.field1036 = arg1.method231();
                } else if (var3 == 106) {
                    this.field1038 = arg1.method231();
                    if (this.field1038 == 65535) {
                        this.field1038 = -1;
                    }
                    this.field1039 = arg1.method231();
                    if (this.field1039 == 65535) {
                        this.field1039 = -1;
                    }
                    int var10 = arg1.method229();
                    this.field1037 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1037[var11] = arg1.method231();
                        if (this.field1037[var11] == 65535) {
                            this.field1037[var11] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BII[I)Leb;")
    public final Model method343(byte arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        if (this.field1037 != null) {
            NpcType var6 = this.method345(-13461);
            return var6 == null ? null : var6.method343((byte) 3, arg1, arg2, arg3);
        }
        Model var7 = (Model) field1040.method101(this.field1011);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1015.length; var9++) {
                if (!Model.method127(this.field1015[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            Model[] var10 = new Model[this.field1015.length];
            for (int var11 = 0; var11 < this.field1015.length; var11++) {
                var10[var11] = Model.method126((byte) 4, this.field1015[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new Model(var10, this.field1004, var10.length);
            }
            if (this.field1022 != null) {
                for (int var12 = 0; var12 < this.field1022.length; var12++) {
                    var7.method140(this.field1022[var12], this.field1023[var12]);
                }
            }
            var7.method133(861);
            var7.method143(this.field1033 + 64, this.field1034 + 850, -30, -50, -30, true);
            field1040.method102(this.field1011, -533, var7);
        }
        Model var13 = Model.field541;
        var13.method128(var7, 0, AnimFrame.method48(arg2, (byte) 7) & AnimFrame.method48(arg1, (byte) 7));
        if (arg2 != -1 && arg1 != -1) {
            var13.method135(-76, arg2, arg1, arg3);
        } else if (arg2 != -1) {
            var13.method134((byte) -54, arg2);
        }
        if (this.field1030 != 128 || this.field1031 != 128) {
            var13.method142(this.field1030, true, this.field1030, this.field1031);
        }
        var13.method130(3);
        var13.field578 = null;
        var13.field577 = null;
        if (this.field1014 == 1) {
            var13.field579 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(B)Leb;")
    public final Model method344(byte arg0) {
        if (this.field1037 != null) {
            NpcType var2 = this.method345(-13461);
            return var2 == null ? null : var2.method344((byte) 7);
        } else if (this.field1016 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 7) {
                throw new NullPointerException();
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field1016.length; var5++) {
                if (!Model.method127(this.field1016[var5])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var6 = new Model[this.field1016.length];
            for (int var7 = 0; var7 < this.field1016.length; var7++) {
                var6[var7] = Model.method126((byte) 4, this.field1016[var7]);
            }
            Model var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new Model(var6, this.field1004, var6.length);
            }
            if (this.field1022 != null) {
                for (int var9 = 0; var9 < this.field1022.length; var9++) {
                    var8.method140(this.field1022[var9], this.field1023[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lgc;")
    public final NpcType method345(int arg0) {
        if (arg0 != -13461) {
            field1003 = !field1003;
        }
        int var2 = -1;
        if (this.field1038 != -1) {
            VarbitType var3 = VarbitType.field1182[this.field1038];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field1673[var6 - var5];
            var2 = field1005.field1556[var4] >> var5 & var7;
        } else if (this.field1039 != -1) {
            var2 = field1005.field1556[this.field1039];
        }
        return var2 < 0 || var2 >= this.field1037.length || this.field1037[var2] == -1 ? null : method341(this.field1037[var2]);
    }
}
