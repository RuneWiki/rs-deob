import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field946 = false;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field947 = 44692;

    @OriginalMember(owner = "ec", name = "c", descriptor = "B")
    private byte field948 = 4;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private int field950 = -139;

    @OriginalMember(owner = "ec", name = "m", descriptor = "I")
    public int field958 = -1;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[Leb;")
    private static Model[] field957 = new Model[4];

    @OriginalMember(owner = "ec", name = "W", descriptor = "Ls;")
    public static LruCache field994 = new LruCache((byte) 7, 500);

    @OriginalMember(owner = "ec", name = "X", descriptor = "Ls;")
    public static LruCache field995 = new LruCache((byte) 7, 30);

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field975;

    @OriginalMember(owner = "ec", name = "E", descriptor = "B")
    private byte field976;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    private static int field952;

    @OriginalMember(owner = "ec", name = "k", descriptor = "I")
    private static int field956;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "ec", name = "u", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "C", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "ec", name = "T", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "ec", name = "i", descriptor = "Llb;")
    private static Packet field954;

    @OriginalMember(owner = "ec", name = "p", descriptor = "Ljava/lang/String;")
    public String field961;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    public boolean field970;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    private boolean field971;

    @OriginalMember(owner = "ec", name = "A", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    private boolean field980;

    @OriginalMember(owner = "ec", name = "J", descriptor = "Z")
    public boolean field981;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field989;

    @OriginalMember(owner = "ec", name = "S", descriptor = "Z")
    public boolean field990;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[B")
    public byte[] field962;

    @OriginalMember(owner = "ec", name = "h", descriptor = "[I")
    private static int[] field953;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field959;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[I")
    private int[] field960;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field963;

    @OriginalMember(owner = "ec", name = "s", descriptor = "[I")
    private int[] field964;

    @OriginalMember(owner = "ec", name = "V", descriptor = "[I")
    public int[] field993;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[Lec;")
    private static LocType[] field955;

    @OriginalMember(owner = "ec", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field977;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method326(Jagfile arg0) {
        field954 = new Packet(arg0.method297("loc.dat", null), 15787);
        Packet var1 = new Packet(arg0.method297("loc.idx", null), 15787);
        field952 = var1.method229();
        field953 = new int[field952];
        int var2 = 2;
        for (int var3 = 0; var3 < field952; var3++) {
            field953[var3] = var2;
            var2 += var1.method229();
        }
        field955 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field955[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method327(byte arg0) {
        field994 = null;
        field995 = null;
        field953 = null;
        field955 = null;
        field954 = null;
        if (arg0 == 42) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method328(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field955[var1].field958 == arg0) {
                return field955[var1];
            }
        }
        field956 = (field956 + 1) % 20;
        LocType var2 = field955[field956];
        field954.field710 = field953[arg0];
        var2.field958 = arg0;
        var2.method329();
        var2.method330(false, field954);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method329() {
        this.field959 = null;
        this.field960 = null;
        this.field961 = null;
        this.field962 = null;
        this.field963 = null;
        this.field964 = null;
        this.field965 = 1;
        this.field966 = 1;
        this.field967 = true;
        this.field968 = true;
        this.field969 = false;
        this.field970 = false;
        this.field971 = false;
        this.field972 = false;
        this.field973 = -1;
        this.field974 = 16;
        this.field975 = 0;
        this.field976 = 0;
        this.field977 = null;
        this.field978 = -1;
        this.field979 = -1;
        this.field980 = false;
        this.field981 = true;
        this.field982 = 128;
        this.field983 = 128;
        this.field984 = 128;
        this.field988 = 0;
        this.field985 = 0;
        this.field986 = 0;
        this.field987 = 0;
        this.field989 = false;
        this.field990 = false;
        this.field991 = -1;
        this.field992 = -1;
        this.field993 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZLlb;)V")
    private final void method330(boolean arg0, Packet arg1) {
        int var3 = -1;
        if (arg0) {
            this.field951 = -264;
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg1.method227();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field969 = false;
                            if (this.field959 != null && (this.field960 == null || this.field960[0] == 10)) {
                                this.field969 = true;
                            }
                            if (this.field977 != null) {
                                this.field969 = true;
                            }
                        }
                        if (this.field990) {
                            this.field967 = false;
                            this.field968 = false;
                        }
                        if (this.field991 == -1) {
                            this.field991 = this.field967 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg1.method227();
                        break;
                    }
                    if (var4 == 2) {
                        this.field961 = arg1.method234();
                    } else if (var4 == 3) {
                        this.field962 = arg1.method235(this.field947);
                    } else if (var4 == 5) {
                        int var7 = arg1.method227();
                        if (var7 > 0) {
                            this.field960 = null;
                            this.field959 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field959[var8] = arg1.method229();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field965 = arg1.method227();
                    } else if (var4 == 15) {
                        this.field966 = arg1.method227();
                    } else if (var4 == 17) {
                        this.field967 = false;
                    } else if (var4 == 18) {
                        this.field968 = false;
                    } else if (var4 == 19) {
                        var3 = arg1.method227();
                        if (var3 == 1) {
                            this.field969 = true;
                        }
                    } else if (var4 == 21) {
                        this.field970 = true;
                    } else if (var4 == 22) {
                        this.field971 = true;
                    } else if (var4 == 23) {
                        this.field972 = true;
                    } else if (var4 == 24) {
                        this.field973 = arg1.method229();
                        if (this.field973 == 65535) {
                            this.field973 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field974 = arg1.method227();
                    } else if (var4 == 29) {
                        this.field975 = arg1.method228();
                    } else if (var4 == 39) {
                        this.field976 = arg1.method228();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field977 == null) {
                            this.field977 = new String[5];
                        }
                        this.field977[var4 - 30] = arg1.method234();
                        if (this.field977[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field977[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg1.method227();
                        this.field963 = new int[var9];
                        this.field964 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field963[var10] = arg1.method229();
                            this.field964[var10] = arg1.method229();
                        }
                    } else if (var4 == 60) {
                        this.field978 = arg1.method229();
                    } else if (var4 == 62) {
                        this.field980 = true;
                    } else if (var4 == 64) {
                        this.field981 = false;
                    } else if (var4 == 65) {
                        this.field982 = arg1.method229();
                    } else if (var4 == 66) {
                        this.field983 = arg1.method229();
                    } else if (var4 == 67) {
                        this.field984 = arg1.method229();
                    } else if (var4 == 68) {
                        this.field979 = arg1.method229();
                    } else if (var4 == 69) {
                        this.field988 = arg1.method227();
                    } else if (var4 == 70) {
                        this.field985 = arg1.method230();
                    } else if (var4 == 71) {
                        this.field986 = arg1.method230();
                    } else if (var4 == 72) {
                        this.field987 = arg1.method230();
                    } else if (var4 == 73) {
                        this.field989 = true;
                    } else if (var4 == 74) {
                        this.field990 = true;
                    } else if (var4 == 75) {
                        this.field991 = arg1.method227();
                    } else if (var4 == 77) {
                        this.field992 = arg1.method229();
                        int var11 = arg1.method227();
                        this.field993 = new int[var11 + 1];
                        for (int var12 = 0; var12 <= var11; var12++) {
                            this.field993[var12] = arg1.method229();
                            if (this.field993[var12] == 65535) {
                                this.field993[var12] = -1;
                            }
                        }
                    }
                }
            } while (var5 <= 0);
            this.field960 = new int[var5];
            this.field959 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field959[var6] = arg1.method229();
                this.field960[var6] = arg1.method227();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method331(int arg0, int arg1) {
        int var3 = 56 / arg1;
        if (this.field960 != null) {
            for (int var6 = 0; var6 < this.field960.length; var6++) {
                if (this.field960[var6] == arg0) {
                    return Model.method126(this.field959[var6] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field959 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field959.length; var5++) {
                var4 &= Model.method126(this.field959[var5] & 0xFFFF);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        if (this.field959 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field959.length; var3++) {
            var2 &= Model.method126(this.field959[var3] & 0xFFFF);
        }
        while (arg0 >= 0) {
            this.field946 = !this.field946;
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lub;B)V")
    public final void method333(OnDemand arg0, byte arg1) {
        if (this.field959 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field959.length; var3++) {
            arg0.method282(this.field959[var3] & 0xFFFF, 0, (byte) 6);
        }
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method335((byte) -74, arg6, arg1, arg0);
        if (var8 == null) {
            return null;
        }
        if (this.field970 || this.field971) {
            var8 = new Model(this.field971, 0, var8, this.field970);
        }
        if (this.field970) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field536; var10++) {
                int var11 = var8.field537[var10];
                int var12 = var8.field539[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field538[var10] += var15 - var9;
            }
            var8.method130(this.field950);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BIII)Leb;")
    private final Model method335(byte arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field960 == null) {
            if (arg3 != 10) {
                return null;
            }
            var6 = ((long) (arg1 + 1) << 32) + (long) ((this.field958 << 6) + arg2);
            Model var8 = (Model) field995.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field959 == null) {
                return null;
            }
            boolean var9 = this.field980 ^ arg2 > 3;
            int var10 = this.field959.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field959[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field994.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method125(var12 & 0xFFFF, this.field948);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method140(6);
                    }
                    field994.method102((long) var12, (byte) 76, var5);
                }
                if (var10 > 1) {
                    field957[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(field957, var10, -33019);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field960.length; var14++) {
                if (this.field960[var14] == arg3) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg1 + 1) << 32) + (long) ((this.field958 << 6) + (var13 << 3) + arg2);
            Model var15 = (Model) field995.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field959[var13];
            boolean var17 = this.field980 ^ arg2 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field994.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method125(var16 & 0xFFFF, this.field948);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method140(6);
                }
                field994.method102((long) var16, (byte) 76, var5);
            }
        }
        if (arg0 != -74) {
            throw new NullPointerException();
        }
        boolean var18;
        if (this.field982 == 128 && this.field983 == 128 && this.field984 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field985 == 0 && this.field986 == 0 && this.field987 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(var5, AnimFrame.method48(arg1, 0), arg2 == 0 && arg1 == -1 && !var18 && !var19, this.field949, this.field963 == null);
        if (arg1 != -1) {
            var20.method132((byte) 3);
            var20.method133(arg1, 188);
            var20.field568 = null;
            var20.field567 = null;
        }
        while (arg2-- > 0) {
            var20.method136(0);
        }
        if (this.field963 != null) {
            for (int var21 = 0; var21 < this.field963.length; var21++) {
                var20.method139(this.field963[var21], this.field964[var21]);
            }
        }
        if (var18) {
            var20.method141(this.field982, this.field984, this.field983, (byte) 31);
        }
        if (var19) {
            var20.method138(this.field986, this.field985, (byte) 2, this.field987);
        }
        var20.method142(this.field975 + 64, this.field976 * 5 + 768, -50, -10, -50, !this.field971);
        if (this.field991 == 1) {
            var20.field564 = var20.field392;
        }
        field995.method102(var6, (byte) 76, var20);
        return var20;
    }
}
