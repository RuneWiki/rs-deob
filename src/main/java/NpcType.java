import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class NpcType {

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private int field955 = -797;

    @OriginalMember(owner = "fc", name = "h", descriptor = "J")
    private long field962 = -1L;

    @OriginalMember(owner = "fc", name = "k", descriptor = "B")
    public byte field965 = 1;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field968 = -1;

    @OriginalMember(owner = "fc", name = "o", descriptor = "I")
    public int field969 = -1;

    @OriginalMember(owner = "fc", name = "p", descriptor = "I")
    public int field970 = -1;

    @OriginalMember(owner = "fc", name = "q", descriptor = "I")
    public int field971 = -1;

    @OriginalMember(owner = "fc", name = "r", descriptor = "I")
    public int field972 = -1;

    @OriginalMember(owner = "fc", name = "s", descriptor = "Z")
    private boolean field973 = false;

    @OriginalMember(owner = "fc", name = "w", descriptor = "I")
    public int field977 = -1;

    @OriginalMember(owner = "fc", name = "x", descriptor = "I")
    public int field978 = -1;

    @OriginalMember(owner = "fc", name = "y", descriptor = "I")
    public int field979 = -1;

    @OriginalMember(owner = "fc", name = "z", descriptor = "Z")
    public boolean field980 = true;

    @OriginalMember(owner = "fc", name = "A", descriptor = "I")
    public int field981 = -1;

    @OriginalMember(owner = "fc", name = "B", descriptor = "I")
    private int field982 = 128;

    @OriginalMember(owner = "fc", name = "C", descriptor = "I")
    private int field983 = 128;

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    private static boolean field956 = true;

    @OriginalMember(owner = "fc", name = "D", descriptor = "Lt;")
    public static LruCache field984 = new LruCache(5, 30);

    @OriginalMember(owner = "fc", name = "c", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "fc", name = "g", descriptor = "I")
    private static int field961;

    @OriginalMember(owner = "fc", name = "e", descriptor = "Lmb;")
    private static Packet field959;

    @OriginalMember(owner = "fc", name = "i", descriptor = "Ljava/lang/String;")
    public String field963;

    @OriginalMember(owner = "fc", name = "j", descriptor = "[B")
    public byte[] field964;

    @OriginalMember(owner = "fc", name = "d", descriptor = "[I")
    private static int[] field958;

    @OriginalMember(owner = "fc", name = "l", descriptor = "[I")
    private int[] field966;

    @OriginalMember(owner = "fc", name = "m", descriptor = "[I")
    private int[] field967;

    @OriginalMember(owner = "fc", name = "t", descriptor = "[I")
    private int[] field974;

    @OriginalMember(owner = "fc", name = "u", descriptor = "[I")
    private int[] field975;

    @OriginalMember(owner = "fc", name = "f", descriptor = "[Lfc;")
    private static NpcType[] field960;

    @OriginalMember(owner = "fc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field976;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lyb;)V")
    public static final void method331(Jagfile arg0) {
        field959 = new Packet(arg0.method299("npc.dat", null), true);
        Packet var1 = new Packet(arg0.method299("npc.idx", null), true);
        field957 = var1.method233();
        field958 = new int[field957];
        int var2 = 2;
        for (int var3 = 0; var3 < field957; var3++) {
            field958[var3] = var2;
            var2 += var1.method233();
        }
        field960 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field960[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(B)V")
    public static final void method332(byte arg0) {
        field984 = null;
        if (arg0 != 7) {
            field956 = !field956;
        }
        field958 = null;
        field960 = null;
        field959 = null;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(I)Lfc;")
    public static final NpcType method333(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field960[var1].field962) {
                return field960[var1];
            }
        }
        field961 = (field961 + 1) % 20;
        NpcType var2 = field960[field961] = new NpcType();
        field959.field698 = field958[arg0];
        var2.field962 = arg0;
        var2.method334(3251, field959);
        return var2;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ILmb;)V")
    private final void method334(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method231();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method231();
                    this.field966 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field966[var6] = arg1.method233();
                    }
                } else if (var4 == 2) {
                    this.field963 = arg1.method238();
                } else if (var4 == 3) {
                    this.field964 = arg1.method239(true);
                } else if (var4 == 12) {
                    this.field965 = arg1.method232();
                } else if (var4 == 13) {
                    this.field968 = arg1.method233();
                } else if (var4 == 14) {
                    this.field969 = arg1.method233();
                } else if (var4 == 16) {
                    this.field973 = true;
                } else if (var4 == 17) {
                    this.field969 = arg1.method233();
                    this.field970 = arg1.method233();
                    this.field971 = arg1.method233();
                    this.field972 = arg1.method233();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field976 == null) {
                        this.field976 = new String[5];
                    }
                    this.field976[var4 - 30] = arg1.method238();
                    if (this.field976[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field976[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method231();
                    this.field974 = new int[var7];
                    this.field975 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field974[var8] = arg1.method233();
                        this.field975[var8] = arg1.method233();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method231();
                    this.field967 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field967[var10] = arg1.method233();
                    }
                } else if (var4 == 90) {
                    this.field977 = arg1.method233();
                } else if (var4 == 91) {
                    this.field978 = arg1.method233();
                } else if (var4 == 92) {
                    this.field979 = arg1.method233();
                } else if (var4 == 93) {
                    this.field980 = false;
                } else if (var4 == 95) {
                    this.field981 = arg1.method233();
                } else if (var4 == 97) {
                    this.field982 = arg1.method233();
                } else if (var4 == 98) {
                    this.field983 = arg1.method233();
                }
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(IIZ[I)Lfb;")
    public final Model method335(int arg0, int arg1, boolean arg2, int[] arg3) {
        if (arg2) {
            throw new NullPointerException();
        }
        Model var5 = (Model) field984.method113(this.field962);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field966.length; var7++) {
                if (!Model.method136(this.field966[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field966.length];
            for (int var9 = 0; var9 < this.field966.length; var9++) {
                var8[var9] = Model.method135(this.field966[var9], this.field955);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model(var8.length, var8, (byte) 4);
            }
            if (this.field974 != null) {
                for (int var10 = 0; var10 < this.field974.length; var10++) {
                    var5.method149(this.field974[var10], this.field975[var10]);
                }
            }
            var5.method142(8);
            var5.method152(64, 850, -30, -50, -30, true);
            field984.method114(var5, this.field962, 7);
        }
        Model var11 = Model.field529;
        var11.method137(var5, (byte) 6, !this.field973);
        if (arg1 != -1 && arg0 != -1) {
            var11.method144(false, arg0, arg1, arg3);
        } else if (arg1 != -1) {
            var11.method143(true, arg1);
        }
        if (this.field982 != 128 || this.field983 != 128) {
            var11.method151(this.field983, this.field982, 0, this.field982);
        }
        var11.method139(-849);
        var11.field566 = null;
        var11.field565 = null;
        if (this.field965 == 1) {
            var11.field567 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "fc", name = "b", descriptor = "(I)Lfb;")
    public final Model method336(int arg0) {
        if (this.field967 == null) {
            return null;
        }
        boolean var2 = false;
        int var3 = 97 / arg0;
        for (int var4 = 0; var4 < this.field967.length; var4++) {
            if (!Model.method136(this.field967[var4])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var5 = new Model[this.field967.length];
        for (int var6 = 0; var6 < this.field967.length; var6++) {
            var5[var6] = Model.method135(this.field967[var6], this.field955);
        }
        Model var7;
        if (var5.length == 1) {
            var7 = var5[0];
        } else {
            var7 = new Model(var5.length, var5, (byte) 4);
        }
        if (this.field974 != null) {
            for (int var8 = 0; var8 < this.field974.length; var8++) {
                var7.method149(this.field974[var8], this.field975[var8]);
            }
        }
        return var7;
    }
}
