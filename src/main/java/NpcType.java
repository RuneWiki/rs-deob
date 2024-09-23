import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class NpcType {

    @OriginalMember(owner = "fc", name = "f", descriptor = "J")
    private long field953 = -1L;

    @OriginalMember(owner = "fc", name = "i", descriptor = "B")
    public byte field956 = 1;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field959 = -1;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field960 = -1;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field961 = -1;

    @OriginalMember(owner = "fc", name = "o", descriptor = "I")
    public int field962 = -1;

    @OriginalMember(owner = "fc", name = "p", descriptor = "I")
    public int field963 = -1;

    @OriginalMember(owner = "fc", name = "q", descriptor = "Z")
    private boolean field964 = false;

    @OriginalMember(owner = "fc", name = "u", descriptor = "I")
    public int field968 = -1;

    @OriginalMember(owner = "fc", name = "v", descriptor = "I")
    public int field969 = -1;

    @OriginalMember(owner = "fc", name = "w", descriptor = "I")
    public int field970 = -1;

    @OriginalMember(owner = "fc", name = "x", descriptor = "Z")
    public boolean field971 = true;

    @OriginalMember(owner = "fc", name = "y", descriptor = "I")
    public int field972 = -1;

    @OriginalMember(owner = "fc", name = "z", descriptor = "I")
    private int field973 = 128;

    @OriginalMember(owner = "fc", name = "A", descriptor = "I")
    private int field974 = 128;

    @OriginalMember(owner = "fc", name = "B", descriptor = "Lt;")
    public static LruCache field975 = new LruCache(false, 30);

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    private static int field952;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Lmb;")
    private static Packet field950;

    @OriginalMember(owner = "fc", name = "g", descriptor = "Ljava/lang/String;")
    public String field954;

    @OriginalMember(owner = "fc", name = "h", descriptor = "[B")
    public byte[] field955;

    @OriginalMember(owner = "fc", name = "b", descriptor = "[I")
    private static int[] field949;

    @OriginalMember(owner = "fc", name = "j", descriptor = "[I")
    private int[] field957;

    @OriginalMember(owner = "fc", name = "k", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "fc", name = "r", descriptor = "[I")
    private int[] field965;

    @OriginalMember(owner = "fc", name = "s", descriptor = "[I")
    private int[] field966;

    @OriginalMember(owner = "fc", name = "d", descriptor = "[Lfc;")
    private static NpcType[] field951;

    @OriginalMember(owner = "fc", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field967;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lyb;)V")
    public static final void method327(Jagfile arg0) {
        field950 = new Packet(699, arg0.method295("npc.dat", null));
        Packet var1 = new Packet(699, arg0.method295("npc.idx", null));
        field948 = var1.method233();
        field949 = new int[field948];
        int var2 = 2;
        for (int var3 = 0; var3 < field948; var3++) {
            field949[var3] = var2;
            var2 += var1.method233();
        }
        field951 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field951[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Z)V")
    public static final void method328(boolean arg0) {
        field975 = null;
        field949 = null;
        if (arg0) {
            field951 = null;
            field950 = null;
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(I)Lfc;")
    public static final NpcType method329(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field951[var1].field953) {
                return field951[var1];
            }
        }
        field952 = (field952 + 1) % 20;
        NpcType var2 = field951[field952] = new NpcType();
        field950.field694 = field949[arg0];
        var2.field953 = arg0;
        var2.method330(false, field950);
        return var2;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ZLmb;)V")
    private final void method330(boolean arg0, Packet arg1) {
        if (arg0) {
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
                    this.field957 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field957[var6] = arg1.method233();
                    }
                } else if (var4 == 2) {
                    this.field954 = arg1.method238();
                } else if (var4 == 3) {
                    this.field955 = arg1.method239(-139);
                } else if (var4 == 12) {
                    this.field956 = arg1.method232();
                } else if (var4 == 13) {
                    this.field959 = arg1.method233();
                } else if (var4 == 14) {
                    this.field960 = arg1.method233();
                } else if (var4 == 16) {
                    this.field964 = true;
                } else if (var4 == 17) {
                    this.field960 = arg1.method233();
                    this.field961 = arg1.method233();
                    this.field962 = arg1.method233();
                    this.field963 = arg1.method233();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field967 == null) {
                        this.field967 = new String[5];
                    }
                    this.field967[var4 - 30] = arg1.method238();
                    if (this.field967[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field967[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method231();
                    this.field965 = new int[var7];
                    this.field966 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field965[var8] = arg1.method233();
                        this.field966[var8] = arg1.method233();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method231();
                    this.field958 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field958[var10] = arg1.method233();
                    }
                } else if (var4 == 90) {
                    this.field968 = arg1.method233();
                } else if (var4 == 91) {
                    this.field969 = arg1.method233();
                } else if (var4 == 92) {
                    this.field970 = arg1.method233();
                } else if (var4 == 93) {
                    this.field971 = false;
                } else if (var4 == 95) {
                    this.field972 = arg1.method233();
                } else if (var4 == 97) {
                    this.field973 = arg1.method233();
                } else if (var4 == 98) {
                    this.field974 = arg1.method233();
                }
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II[II)Lfb;")
    public final Model method331(int arg0, int arg1, int[] arg2, int arg3) {
        Model var5 = (Model) field975.method113(this.field953);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field957.length; var7++) {
                if (!Model.method136(this.field957[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            Model[] var8 = new Model[this.field957.length];
            for (int var9 = 0; var9 < this.field957.length; var9++) {
                var8[var9] = Model.method135(this.field957[var9], -30419);
            }
            if (var8.length == 1) {
                var5 = var8[0];
            } else {
                var5 = new Model(var8.length, false, var8);
            }
            if (this.field965 != null) {
                for (int var10 = 0; var10 < this.field965.length; var10++) {
                    var5.method149(this.field965[var10], this.field966[var10]);
                }
            }
            var5.method142((byte) 9);
            var5.method152(64, 850, -30, -50, -30, true);
            field975.method114(this.field953, true, var5);
        }
        Model var11 = Model.field520;
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        var11.method137(!this.field964, var5, -67);
        if (arg0 != -1 && arg1 != -1) {
            var11.method144(365, arg1, arg0, arg2);
        } else if (arg0 != -1) {
            var11.method143(arg0, false);
        }
        if (this.field973 != 128 || this.field974 != 128) {
            var11.method151(this.field973, this.field973, this.field974, -797);
        }
        var11.method139((byte) 3);
        var11.field557 = null;
        var11.field556 = null;
        if (this.field956 == 1) {
            var11.field558 = true;
        }
        return var11;
    }

    @OriginalMember(owner = "fc", name = "b", descriptor = "(I)Lfb;")
    public final Model method332(int arg0) {
        if (this.field958 == null) {
            return null;
        }
        boolean var2 = false;
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field958.length; var3++) {
            if (!Model.method136(this.field958[var3])) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        Model[] var4 = new Model[this.field958.length];
        for (int var5 = 0; var5 < this.field958.length; var5++) {
            var4[var5] = Model.method135(this.field958[var5], -30419);
        }
        Model var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new Model(var4.length, false, var4);
        }
        if (this.field965 != null) {
            for (int var7 = 0; var7 < this.field965.length; var7++) {
                var6.method149(this.field965[var7], this.field966[var7]);
            }
        }
        return var6;
    }
}
