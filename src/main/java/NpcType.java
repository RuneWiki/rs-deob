import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class NpcType {

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private int field991 = -22323;

    @OriginalMember(owner = "gc", name = "i", descriptor = "J")
    public long field998 = -1L;

    @OriginalMember(owner = "gc", name = "l", descriptor = "B")
    public byte field1001 = 1;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "gc", name = "p", descriptor = "I")
    public int field1005 = -1;

    @OriginalMember(owner = "gc", name = "q", descriptor = "I")
    public int field1006 = -1;

    @OriginalMember(owner = "gc", name = "r", descriptor = "I")
    public int field1007 = -1;

    @OriginalMember(owner = "gc", name = "s", descriptor = "I")
    public int field1008 = -1;

    @OriginalMember(owner = "gc", name = "w", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "gc", name = "x", descriptor = "I")
    public int field1013 = -1;

    @OriginalMember(owner = "gc", name = "y", descriptor = "I")
    public int field1014 = -1;

    @OriginalMember(owner = "gc", name = "z", descriptor = "Z")
    public boolean field1015 = true;

    @OriginalMember(owner = "gc", name = "A", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "gc", name = "B", descriptor = "I")
    private int field1017 = 128;

    @OriginalMember(owner = "gc", name = "C", descriptor = "I")
    private int field1018 = 128;

    @OriginalMember(owner = "gc", name = "D", descriptor = "Z")
    public boolean field1019 = false;

    @OriginalMember(owner = "gc", name = "G", descriptor = "I")
    public int field1022 = -1;

    @OriginalMember(owner = "gc", name = "H", descriptor = "I")
    public int field1023 = 32;

    @OriginalMember(owner = "gc", name = "J", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "gc", name = "K", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private static int field990 = 1000;

    @OriginalMember(owner = "gc", name = "L", descriptor = "Ls;")
    public static LruCache field1027 = new LruCache((byte) 113, 30);

    @OriginalMember(owner = "gc", name = "E", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "gc", name = "F", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "gc", name = "h", descriptor = "I")
    private static int field997;

    @OriginalMember(owner = "gc", name = "f", descriptor = "Llb;")
    private static Packet field995;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Lclient;")
    public static client field992;

    @OriginalMember(owner = "gc", name = "j", descriptor = "Ljava/lang/String;")
    public String field999;

    @OriginalMember(owner = "gc", name = "k", descriptor = "[B")
    public byte[] field1000;

    @OriginalMember(owner = "gc", name = "m", descriptor = "[I")
    private int[] field1002;

    @OriginalMember(owner = "gc", name = "n", descriptor = "[I")
    private int[] field1003;

    @OriginalMember(owner = "gc", name = "t", descriptor = "[I")
    private int[] field1009;

    @OriginalMember(owner = "gc", name = "u", descriptor = "[I")
    private int[] field1010;

    @OriginalMember(owner = "gc", name = "I", descriptor = "[I")
    public int[] field1024;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    private static int[] field994;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[Lgc;")
    private static NpcType[] field996;

    @OriginalMember(owner = "gc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field1011;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lxb;)V")
    public static final void method339(Jagfile arg0) {
        field995 = new Packet(field990, arg0.method299("npc.dat", null));
        Packet var1 = new Packet(field990, arg0.method299("npc.idx", null));
        field993 = var1.method231();
        field994 = new int[field993];
        int var2 = 2;
        for (int var3 = 0; var3 < field993; var3++) {
            field994[var3] = var2;
            var2 += var1.method231();
        }
        field996 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field996[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)V")
    public static final void method340(int arg0) {
        field1027 = null;
        field994 = null;
        if (arg0 >= 3 && arg0 <= 3) {
            field996 = null;
            field995 = null;
        }
    }

    @OriginalMember(owner = "gc", name = "b", descriptor = "(I)Lgc;")
    public static final NpcType method341(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field996[var1].field998) {
                return field996[var1];
            }
        }
        field997 = (field997 + 1) % 20;
        NpcType var2 = field996[field997] = new NpcType();
        field995.field703 = field994[arg0];
        var2.field998 = arg0;
        var2.method342(8, field995);
        return var2;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILlb;)V")
    private final void method342(int arg0, Packet arg1) {
        if (arg0 < 8 || arg0 > 8) {
            field990 = 158;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method229();
                    this.field1002 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1002[var5] = arg1.method231();
                    }
                } else if (var3 == 2) {
                    this.field999 = arg1.method236();
                } else if (var3 == 3) {
                    this.field1000 = arg1.method237((byte) 31);
                } else if (var3 == 12) {
                    this.field1001 = arg1.method230();
                } else if (var3 == 13) {
                    this.field1004 = arg1.method231();
                } else if (var3 == 14) {
                    this.field1005 = arg1.method231();
                } else if (var3 == 17) {
                    this.field1005 = arg1.method231();
                    this.field1006 = arg1.method231();
                    this.field1007 = arg1.method231();
                    this.field1008 = arg1.method231();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1011 == null) {
                        this.field1011 = new String[5];
                    }
                    this.field1011[var3 - 30] = arg1.method236();
                    if (this.field1011[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1011[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method229();
                    this.field1009 = new int[var6];
                    this.field1010 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1009[var7] = arg1.method231();
                        this.field1010[var7] = arg1.method231();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method229();
                    this.field1003 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1003[var9] = arg1.method231();
                    }
                } else if (var3 == 90) {
                    this.field1012 = arg1.method231();
                } else if (var3 == 91) {
                    this.field1013 = arg1.method231();
                } else if (var3 == 92) {
                    this.field1014 = arg1.method231();
                } else if (var3 == 93) {
                    this.field1015 = false;
                } else if (var3 == 95) {
                    this.field1016 = arg1.method231();
                } else if (var3 == 97) {
                    this.field1017 = arg1.method231();
                } else if (var3 == 98) {
                    this.field1018 = arg1.method231();
                } else if (var3 == 99) {
                    this.field1019 = true;
                } else if (var3 == 100) {
                    this.field1020 = arg1.method230();
                } else if (var3 == 101) {
                    this.field1021 = arg1.method230() * 5;
                } else if (var3 == 102) {
                    this.field1022 = arg1.method231();
                } else if (var3 == 103) {
                    this.field1023 = arg1.method231();
                } else if (var3 == 106) {
                    this.field1025 = arg1.method231();
                    if (this.field1025 == 65535) {
                        this.field1025 = -1;
                    }
                    this.field1026 = arg1.method231();
                    if (this.field1026 == 65535) {
                        this.field1026 = -1;
                    }
                    int var10 = arg1.method229();
                    this.field1024 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1024[var11] = arg1.method231();
                        if (this.field1024[var11] == 65535) {
                            this.field1024[var11] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(III[I)Leb;")
    public final Model method343(int arg0, int arg1, int arg2, int[] arg3) {
        if (this.field1024 != null) {
            NpcType var5 = this.method345(0);
            return var5 == null ? null : var5.method343(arg0, 175, arg2, arg3);
        }
        Model var6 = (Model) field1027.method101(this.field998);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1002.length; var8++) {
                if (!Model.method127(this.field1002[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            Model[] var9 = new Model[this.field1002.length];
            for (int var10 = 0; var10 < this.field1002.length; var10++) {
                var9[var10] = Model.method126(this.field1002[var10], this.field991);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new Model(var9.length, -550, var9);
            }
            if (this.field1009 != null) {
                for (int var11 = 0; var11 < this.field1009.length; var11++) {
                    var6.method140(this.field1009[var11], this.field1010[var11]);
                }
            }
            var6.method133(0);
            var6.method143(this.field1020 + 64, this.field1021 + 850, -30, -50, -30, true);
            field1027.method102(this.field998, true, var6);
        }
        Model var12 = Model.field533;
        int var13 = 61 / arg1;
        var12.method128(AnimFrame.method48(arg0, -47594) & AnimFrame.method48(arg2, -47594), var6, 471);
        if (arg0 != -1 && arg2 != -1) {
            var12.method135(arg2, arg3, arg0, false);
        } else if (arg0 != -1) {
            var12.method134(428, arg0);
        }
        if (this.field1017 != 128 || this.field1018 != 128) {
            var12.method142((byte) 4, this.field1018, this.field1017, this.field1017);
        }
        var12.method130(0);
        var12.field570 = null;
        var12.field569 = null;
        if (this.field1001 == 1) {
            var12.field571 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "gc", name = "c", descriptor = "(I)Leb;")
    public final Model method344(int arg0) {
        if (arg0 != -41730) {
            throw new NullPointerException();
        } else if (this.field1024 != null) {
            NpcType var2 = this.method345(0);
            return var2 == null ? null : var2.method344(-41730);
        } else if (this.field1003 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1003.length; var4++) {
                if (!Model.method127(this.field1003[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            Model[] var5 = new Model[this.field1003.length];
            for (int var6 = 0; var6 < this.field1003.length; var6++) {
                var5[var6] = Model.method126(this.field1003[var6], this.field991);
            }
            Model var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new Model(var5.length, -550, var5);
            }
            if (this.field1009 != null) {
                for (int var8 = 0; var8 < this.field1009.length; var8++) {
                    var7.method140(this.field1009[var8], this.field1010[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "gc", name = "d", descriptor = "(I)Lgc;")
    public final NpcType method345(int arg0) {
        if (arg0 != 0) {
            field990 = -276;
        }
        int var2 = -1;
        if (this.field1025 != -1) {
            VarbitType var3 = VarbitType.field1172[this.field1025];
            int var4 = var3.field1174;
            int var5 = var3.field1175;
            int var6 = var3.field1176;
            int var7 = client.field1349[var6 - var5];
            var2 = field992.field1359[var4] >> var5 & var7;
        } else if (this.field1026 != -1) {
            var2 = field992.field1359[this.field1026];
        }
        return var2 < 0 || var2 >= this.field1024.length || this.field1024[var2] == -1 ? null : method341(this.field1024[var2]);
    }
}
