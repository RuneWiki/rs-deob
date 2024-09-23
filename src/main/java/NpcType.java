import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field1002 = false;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Z")
    private boolean field1004 = false;

    @OriginalMember(owner = "gc", name = "j", descriptor = "J")
    public long field1011 = -1L;

    @OriginalMember(owner = "gc", name = "m", descriptor = "B")
    public byte field1014 = 1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1018 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1019 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "gc", name = "t", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "gc", name = "A", descriptor = "Z")
    public boolean field1028 = true;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    public int field1029 = -1;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1030 = 128;

    @OriginalMember(owner = "gc", name = "D", descriptor = "I")
    private int field1031 = 128;

    @OriginalMember(owner = "gc", name = "E", descriptor = "Z")
    public boolean field1032 = false;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "gc", name = "I", descriptor = "I")
    public int field1036 = 32;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "gc", name = "L", descriptor = "I")
    public int field1039 = -1;

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private static boolean field1003 = true;

    @OriginalMember(owner = "gc", name = "M", descriptor = "Ls;")
    public static LruCache field1040 = new LruCache(30, (byte) 1);

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "gc", name = "i", descriptor = "I")
    private static int field1010;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "gc", name = "g", descriptor = "Llb;")
    private static Packet field1008;

    @OriginalMember(owner = "gc", name = "d", descriptor = "Lclient;")
    public static client field1005;

    @OriginalMember(owner = "gc", name = "k", descriptor = "Ljava/lang/String;")
    public String field1012;

    @OriginalMember(owner = "gc", name = "l", descriptor = "[B")
    public byte[] field1013;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    private static int[] field1007;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field1015;

    @OriginalMember(owner = "gc", name = "o", descriptor = "[I")
    private int[] field1016;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[I")
    private int[] field1022;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[I")
    private int[] field1023;

    @OriginalMember(owner = "gc", name = "J", descriptor = "[I")
    public int[] field1037;

    @OriginalMember(owner = "gc", name = "h", descriptor = "[Lgc;")
    private static NpcType[] field1009;

    @OriginalMember(owner = "gc", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field1024;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field1008 = new Packet(arg0.method299("npc.dat", null), (byte) -93);
        Packet var1 = new Packet(arg0.method299("npc.idx", null), (byte) -93);
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

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)V")
    public static final void method340(boolean arg0) {
        field1040 = null;
        field1007 = null;
        field1009 = null;
        if (arg0) {
            field1003 = !field1003;
        }
        field1008 = null;
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
        field1008.field713 = field1007[arg0];
        var2.field1011 = arg0;
        var2.method342(210, field1008);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILlb;)V")
    private final void method342(int arg0, Packet arg1) {
        if (arg0 <= 0) {
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
                    this.field1013 = arg1.method237((byte) -14);
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

    @OriginalMember(owner = "gc", name = "a", descriptor = "(II[II)Leb;")
    public final Model method343(int arg0, int arg1, int[] arg2, int arg3) {
        if (this.field1037 != null) {
            NpcType var5 = this.method345(false);
            return var5 == null ? null : var5.method343(arg0, arg1, arg2, 0);
        }
        Model var6 = (Model) field1040.method101(this.field1011);
        if (arg3 != 0) {
            field1003 = !field1003;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1015.length; var8++) {
                if (!Model.method127(this.field1015[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1015.length];
            for (int var10 = 0; var10 < this.field1015.length; var10++) {
                var9[var10] = Model.method126((byte) -14, this.field1015[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model(var9, var9.length, false);
            }
            if (this.field1022 != null) {
                for (int var11 = 0; var11 < this.field1022.length; var11++) {
                    var6.method140(this.field1022[var11], this.field1023[var11]);
                }
            }
            var6.method133(5);
            var6.method143(this.field1033 + 64, this.field1034 + 850, -30, -50, -30, true);
            field1040.method102(var6, 0, this.field1011);
        }
        Model var12 = Model.field532;
        var12.method128((byte) 9, var6, AnimFrame.method48(577, arg1) & AnimFrame.method48(577, arg0));
        if (arg1 != -1 && arg0 != -1) {
            var12.method135(arg2, arg0, arg1, this.field1002);
        } else if (arg1 != -1) {
            var12.method134(0, arg1);
        }
        if (this.field1030 != 128 || this.field1031 != 128) {
            var12.method142(this.field1030, this.field1031, this.field1030, (byte) -119);
        }
        var12.method130(-29805);
        var12.field569 = null;
        var12.field568 = null;
        if (this.field1014 == 1) {
            var12.field570 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Leb;")
    public final Model method344(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            field1003 = !field1003;
        }
        if (this.field1037 != null) {
            NpcType var2 = this.method345(false);
            return var2 == null ? null : var2.method344(8);
        } else if (this.field1016 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1016.length; var4++) {
                if (!Model.method127(this.field1016[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var5 = new Model[this.field1016.length];
            for (int var6 = 0; var6 < this.field1016.length; var6++) {
                var5[var6] = Model.method126((byte) -14, this.field1016[var6]);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model(var5, var5.length, false);
            }
            if (this.field1022 != null) {
                for (int var8 = 0; var8 < this.field1022.length; var8++) {
                    var7.method140(this.field1022[var8], this.field1023[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(Z)Lgc;")
    public final NpcType method345(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            this.field1002 = !this.field1002;
        }
        if (this.field1038 != -1) {
            VarbitType var3 = VarbitType.field1180[this.field1038];
            int var4 = var3.field1182;
            int var5 = var3.field1183;
            int var6 = var3.field1184;
            int var7 = client.field1425[var6 - var5];
            var2 = field1005.field1416[var4] >> var5 & var7;
        } else if (this.field1039 != -1) {
            var2 = field1005.field1416[this.field1039];
        }
        return var2 < 0 || var2 >= this.field1037.length || this.field1037[var2] == -1 ? null : method341(this.field1037[var2]);
    }
}
