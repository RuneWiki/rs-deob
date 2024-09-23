import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field941 = 6;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private boolean field943 = true;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    public int field952 = -1;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private static int field942 = 8;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[Leb;")
    private static Model[] field951 = new Model[4];

    @OriginalMember(owner = "ec", name = "W", descriptor = "Ls;")
    public static LruCache field989 = new LruCache((byte) 8, 500);

    @OriginalMember(owner = "ec", name = "X", descriptor = "Ls;")
    public static LruCache field990 = new LruCache((byte) 8, 30);

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field969;

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field970;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field946;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field950;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "ec", name = "S", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "ec", name = "V", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Llb;")
    private static Packet field948;

    @OriginalMember(owner = "ec", name = "d", descriptor = "Lclient;")
    public static client field944;

    @OriginalMember(owner = "ec", name = "o", descriptor = "Ljava/lang/String;")
    public String field955;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Z")
    public static boolean field945;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field961;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field962;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field963;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field964;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    private boolean field965;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field966;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field974;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field975;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field983;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field984;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[B")
    public byte[] field956;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field947;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field953;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field954;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field957;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "ec", name = "T", descriptor = "[I")
    public int[] field986;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field949;

    @OriginalMember(owner = "ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field971;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method328(Jagfile arg0) {
        field948 = new Packet(arg0.method299("loc.dat", null), 58);
        Packet var1 = new Packet(arg0.method299("loc.idx", null), 58);
        field946 = var1.method231();
        field947 = new int[field946];
        int var2 = 2;
        for (int var3 = 0; var3 < field946; var3++) {
            field947[var3] = var2;
            var2 += var1.method231();
        }
        field949 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field949[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public static final void method329(int arg0) {
        field989 = null;
        field990 = null;
        field947 = null;
        field949 = null;
        field948 = null;
        if (arg0 < 0 || arg0 > 0) {
            field942 = 239;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Lec;")
    public static final LocType method330(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field949[var1].field952 == arg0) {
                return field949[var1];
            }
        }
        field950 = (field950 + 1) % 20;
        LocType var2 = field949[field950];
        field948.field711 = field947[arg0];
        var2.field952 = arg0;
        var2.method331();
        var2.method332(field948, 913);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method331() {
        this.field953 = null;
        this.field954 = null;
        this.field955 = null;
        this.field956 = null;
        this.field957 = null;
        this.field958 = null;
        this.field959 = 1;
        this.field960 = 1;
        this.field961 = true;
        this.field962 = true;
        this.field963 = false;
        this.field964 = false;
        this.field965 = false;
        this.field966 = false;
        this.field967 = -1;
        this.field968 = 16;
        this.field969 = 0;
        this.field970 = 0;
        this.field971 = null;
        this.field972 = -1;
        this.field973 = -1;
        this.field974 = false;
        this.field975 = true;
        this.field976 = 128;
        this.field977 = 128;
        this.field978 = 128;
        this.field982 = 0;
        this.field979 = 0;
        this.field980 = 0;
        this.field981 = 0;
        this.field983 = false;
        this.field984 = false;
        this.field985 = -1;
        this.field987 = -1;
        this.field988 = -1;
        this.field986 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Llb;I)V")
    private final void method332(Packet arg0, int arg1) {
        if (arg1 <= 0) {
            this.field943 = !this.field943;
        }
        int var3 = -1;
        while (true) {
            while (true) {
                int var5;
                do {
                    while (true) {
                        int var4 = arg0.method229();
                        if (var4 == 0) {
                            if (var3 == -1) {
                                this.field963 = false;
                                if (this.field953 != null && (this.field954 == null || this.field954[0] == 10)) {
                                    this.field963 = true;
                                }
                                if (this.field971 != null) {
                                    this.field963 = true;
                                }
                            }
                            if (this.field984) {
                                this.field961 = false;
                                this.field962 = false;
                            }
                            if (this.field985 == -1) {
                                this.field985 = this.field961 ? 1 : 0;
                                return;
                            }
                            return;
                        }
                        if (var4 == 1) {
                            var5 = arg0.method229();
                            break;
                        }
                        if (var4 == 2) {
                            this.field955 = arg0.method236();
                        } else if (var4 == 3) {
                            this.field956 = arg0.method237(0);
                        } else if (var4 == 5) {
                            int var7 = arg0.method229();
                            if (var7 > 0) {
                                if (this.field953 == null || field945) {
                                    this.field954 = null;
                                    this.field953 = new int[var7];
                                    for (int var8 = 0; var8 < var7; var8++) {
                                        this.field953[var8] = arg0.method231();
                                    }
                                } else {
                                    arg0.field711 += var7 * 2;
                                }
                            }
                        } else if (var4 == 14) {
                            this.field959 = arg0.method229();
                        } else if (var4 == 15) {
                            this.field960 = arg0.method229();
                        } else if (var4 == 17) {
                            this.field961 = false;
                        } else if (var4 == 18) {
                            this.field962 = false;
                        } else if (var4 == 19) {
                            var3 = arg0.method229();
                            if (var3 == 1) {
                                this.field963 = true;
                            }
                        } else if (var4 == 21) {
                            this.field964 = true;
                        } else if (var4 == 22) {
                            this.field965 = true;
                        } else if (var4 == 23) {
                            this.field966 = true;
                        } else if (var4 == 24) {
                            this.field967 = arg0.method231();
                            if (this.field967 == 65535) {
                                this.field967 = -1;
                            }
                        } else if (var4 == 28) {
                            this.field968 = arg0.method229();
                        } else if (var4 == 29) {
                            this.field969 = arg0.method230();
                        } else if (var4 == 39) {
                            this.field970 = arg0.method230();
                        } else if (var4 >= 30 && var4 < 39) {
                            if (this.field971 == null) {
                                this.field971 = new String[5];
                            }
                            this.field971[var4 - 30] = arg0.method236();
                            if (this.field971[var4 - 30].equalsIgnoreCase("hidden")) {
                                this.field971[var4 - 30] = null;
                            }
                        } else if (var4 == 40) {
                            int var9 = arg0.method229();
                            this.field957 = new int[var9];
                            this.field958 = new int[var9];
                            for (int var10 = 0; var10 < var9; var10++) {
                                this.field957[var10] = arg0.method231();
                                this.field958[var10] = arg0.method231();
                            }
                        } else if (var4 == 60) {
                            this.field972 = arg0.method231();
                        } else if (var4 == 62) {
                            this.field974 = true;
                        } else if (var4 == 64) {
                            this.field975 = false;
                        } else if (var4 == 65) {
                            this.field976 = arg0.method231();
                        } else if (var4 == 66) {
                            this.field977 = arg0.method231();
                        } else if (var4 == 67) {
                            this.field978 = arg0.method231();
                        } else if (var4 == 68) {
                            this.field973 = arg0.method231();
                        } else if (var4 == 69) {
                            this.field982 = arg0.method229();
                        } else if (var4 == 70) {
                            this.field979 = arg0.method232();
                        } else if (var4 == 71) {
                            this.field980 = arg0.method232();
                        } else if (var4 == 72) {
                            this.field981 = arg0.method232();
                        } else if (var4 == 73) {
                            this.field983 = true;
                        } else if (var4 == 74) {
                            this.field984 = true;
                        } else if (var4 == 75) {
                            this.field985 = arg0.method229();
                        } else if (var4 == 77) {
                            this.field987 = arg0.method231();
                            if (this.field987 == 65535) {
                                this.field987 = -1;
                            }
                            this.field988 = arg0.method231();
                            if (this.field988 == 65535) {
                                this.field988 = -1;
                            }
                            int var11 = arg0.method229();
                            this.field986 = new int[var11 + 1];
                            for (int var12 = 0; var12 <= var11; var12++) {
                                this.field986[var12] = arg0.method231();
                                if (this.field986[var12] == 65535) {
                                    this.field986[var12] = -1;
                                }
                            }
                        }
                    }
                } while (var5 <= 0);
                if (this.field953 == null || field945) {
                    this.field954 = new int[var5];
                    this.field953 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field953[var6] = arg0.method231();
                        this.field954[var6] = arg0.method229();
                    }
                } else {
                    arg0.field711 += var5 * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method333(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field954 != null) {
            for (int var5 = 0; var5 < this.field954.length; var5++) {
                if (this.field954[var5] == arg1) {
                    return Model.method127(this.field953[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field953 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field953.length; var4++) {
                var3 &= Model.method127(this.field953[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)Z")
    public final boolean method334(int arg0) {
        if (this.field953 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 62 / arg0;
        for (int var4 = 0; var4 < this.field953.length; var4++) {
            var2 &= Model.method127(this.field953[var4] & 0xFFFF);
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lub;B)V")
    public final void method335(OnDemand arg0, byte arg1) {
        if (arg1 == 61 && this.field953 != null) {
            for (int var3 = 0; var3 < this.field953.length; var3++) {
                arg0.method284(0, this.field953[var3] & 0xFFFF, (byte) 3);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method337(arg1, arg6, arg0, -42223);
        if (var8 == null) {
            return null;
        }
        if (this.field964 || this.field965) {
            var8 = new Model(this.field964, false, var8, this.field965);
        }
        if (this.field964) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field541; var10++) {
                int var11 = var8.field542[var10];
                int var12 = var8.field544[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field543[var10] += var15 - var9;
            }
            var8.method131(-649);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)Leb;")
    private final Model method337(int arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field954 == null) {
            if (arg2 != 10) {
                return null;
            }
            var6 = ((long) (arg1 + 1) << 32) + (long) ((this.field952 << 6) + arg0);
            Model var8 = (Model) field990.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field953 == null) {
                return null;
            }
            boolean var9 = this.field974 ^ arg0 > 3;
            int var10 = this.field953.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field953[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field989.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method126(var12 & 0xFFFF, 1);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method141(-3417);
                    }
                    field989.method102((long) var12, 0, var5);
                }
                if (var10 > 1) {
                    field951[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model((byte) 2, field951, var10);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field954.length; var14++) {
                if (this.field954[var14] == arg2) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg1 + 1) << 32) + (long) ((this.field952 << 6) + (var13 << 3) + arg0);
            Model var15 = (Model) field990.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field953[var13];
            boolean var17 = this.field974 ^ arg0 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field989.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method126(var16 & 0xFFFF, 1);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method141(-3417);
                }
                field989.method102((long) var16, 0, var5);
            }
        }
        boolean var18;
        if (this.field976 == 128 && this.field977 == 128 && this.field978 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field979 == 0 && this.field980 == 0 && this.field981 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(arg0 == 0 && arg1 == -1 && !var18 && !var19, this.field957 == null, AnimFrame.method48(4, arg1), var5, 396);
        if (arg3 != -42223) {
            throw new NullPointerException();
        }
        if (arg1 != -1) {
            var20.method133(false);
            var20.method134(2, arg1);
            var20.field573 = null;
            var20.field572 = null;
        }
        while (arg0-- > 0) {
            var20.method137((byte) -37);
        }
        if (this.field957 != null) {
            for (int var21 = 0; var21 < this.field957.length; var21++) {
                var20.method140(this.field957[var21], this.field958[var21]);
            }
        }
        if (var18) {
            var20.method142(this.field978, this.field976, this.field977, 0);
        }
        if (var19) {
            var20.method139(this.field941, this.field981, this.field980, this.field979);
        }
        var20.method143(this.field969 + 64, this.field970 * 5 + 768, -50, -10, -50, !this.field965);
        if (this.field985 == 1) {
            var20.field569 = var20.field394;
        }
        field990.method102(var6, 0, var20);
        return var20;
    }

    @OriginalMember(owner = "ec", name = "d", descriptor = "(I)Lec;")
    public final LocType method338(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field987 != -1) {
            VarbitType var3 = VarbitType.field1172[this.field987];
            int var4 = var3.field1174;
            int var5 = var3.field1175;
            int var6 = var3.field1176;
            int var7 = client.field1520[var6 - var5];
            var2 = field944.field1227[var4] >> var5 & var7;
        } else if (this.field988 != -1) {
            var2 = field944.field1227[this.field988];
        }
        return var2 < 0 || var2 >= this.field986.length || this.field986[var2] == -1 ? null : method330(this.field986[var2]);
    }
}
