import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field949 = 16935;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field950 = -38390;

    @OriginalMember(owner = "ec", name = "k", descriptor = "I")
    public int field958 = -1;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[Leb;")
    private static Model[] field957 = new Model[4];

    @OriginalMember(owner = "ec", name = "V", descriptor = "Ls;")
    public static LruCache field995 = new LruCache(500, true);

    @OriginalMember(owner = "ec", name = "W", descriptor = "Ls;")
    public static LruCache field996 = new LruCache(30, true);

    @OriginalMember(owner = "ec", name = "B", descriptor = "B")
    private byte field975;

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field976;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private static int field952;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    private static int field956;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "ec", name = "z", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "ec", name = "E", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "ec", name = "R", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "ec", name = "T", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "ec", name = "g", descriptor = "Llb;")
    private static Packet field954;

    @OriginalMember(owner = "ec", name = "d", descriptor = "Lclient;")
    public static client field951;

    @OriginalMember(owner = "ec", name = "n", descriptor = "Ljava/lang/String;")
    public String field961;

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private static boolean field948;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field970;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    private boolean field971;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "ec", name = "G", descriptor = "Z")
    private boolean field980;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    public boolean field981;

    @OriginalMember(owner = "ec", name = "P", descriptor = "Z")
    public boolean field989;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field990;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[B")
    public byte[] field962;

    @OriginalMember(owner = "ec", name = "f", descriptor = "[I")
    private static int[] field953;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field959;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field960;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field963;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field964;

    @OriginalMember(owner = "ec", name = "S", descriptor = "[I")
    public int[] field992;

    @OriginalMember(owner = "ec", name = "h", descriptor = "[Lec;")
    private static LocType[] field955;

    @OriginalMember(owner = "ec", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field977;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method328(Jagfile arg0) {
        field954 = new Packet(arg0.method299("loc.dat", null), field948);
        Packet var1 = new Packet(arg0.method299("loc.idx", null), field948);
        field952 = var1.method231();
        field953 = new int[field952];
        int var2 = 2;
        for (int var3 = 0; var3 < field952; var3++) {
            field953[var3] = var2;
            var2 += var1.method231();
        }
        field955 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field955[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method329(byte arg0) {
        if (arg0 != 4) {
            field948 = !field948;
        }
        field995 = null;
        field996 = null;
        field953 = null;
        field955 = null;
        field954 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method330(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field955[var1].field958 == arg0) {
                return field955[var1];
            }
        }
        field956 = (field956 + 1) % 20;
        LocType var2 = field955[field956];
        field954.field712 = field953[arg0];
        var2.field958 = arg0;
        var2.method331();
        var2.method332(false, field954);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method331() {
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
        this.field993 = -1;
        this.field994 = -1;
        this.field992 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZLlb;)V")
    private final void method332(boolean arg0, Packet arg1) {
        int var3 = -1;
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg1.method229();
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
                        var5 = arg1.method229();
                        break;
                    }
                    if (var4 == 2) {
                        this.field961 = arg1.method236();
                    } else if (var4 == 3) {
                        this.field962 = arg1.method237(940);
                    } else if (var4 == 5) {
                        int var7 = arg1.method229();
                        if (var7 > 0) {
                            this.field960 = null;
                            this.field959 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field959[var8] = arg1.method231();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field965 = arg1.method229();
                    } else if (var4 == 15) {
                        this.field966 = arg1.method229();
                    } else if (var4 == 17) {
                        this.field967 = false;
                    } else if (var4 == 18) {
                        this.field968 = false;
                    } else if (var4 == 19) {
                        var3 = arg1.method229();
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
                        this.field973 = arg1.method231();
                        if (this.field973 == 65535) {
                            this.field973 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field974 = arg1.method229();
                    } else if (var4 == 29) {
                        this.field975 = arg1.method230();
                    } else if (var4 == 39) {
                        this.field976 = arg1.method230();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field977 == null) {
                            this.field977 = new String[5];
                        }
                        this.field977[var4 - 30] = arg1.method236();
                        if (this.field977[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field977[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg1.method229();
                        this.field963 = new int[var9];
                        this.field964 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field963[var10] = arg1.method231();
                            this.field964[var10] = arg1.method231();
                        }
                    } else if (var4 == 60) {
                        this.field978 = arg1.method231();
                    } else if (var4 == 62) {
                        this.field980 = true;
                    } else if (var4 == 64) {
                        this.field981 = false;
                    } else if (var4 == 65) {
                        this.field982 = arg1.method231();
                    } else if (var4 == 66) {
                        this.field983 = arg1.method231();
                    } else if (var4 == 67) {
                        this.field984 = arg1.method231();
                    } else if (var4 == 68) {
                        this.field979 = arg1.method231();
                    } else if (var4 == 69) {
                        this.field988 = arg1.method229();
                    } else if (var4 == 70) {
                        this.field985 = arg1.method232();
                    } else if (var4 == 71) {
                        this.field986 = arg1.method232();
                    } else if (var4 == 72) {
                        this.field987 = arg1.method232();
                    } else if (var4 == 73) {
                        this.field989 = true;
                    } else if (var4 == 74) {
                        this.field990 = true;
                    } else if (var4 == 75) {
                        this.field991 = arg1.method229();
                    } else if (var4 == 77) {
                        this.field993 = arg1.method231();
                        if (this.field993 == 65535) {
                            this.field993 = -1;
                        }
                        this.field994 = arg1.method231();
                        if (this.field994 == 65535) {
                            this.field994 = -1;
                        }
                        int var11 = arg1.method229();
                        this.field992 = new int[var11 + 1];
                        for (int var12 = 0; var12 <= var11; var12++) {
                            this.field992[var12] = arg1.method231();
                            if (this.field992[var12] == 65535) {
                                this.field992[var12] = -1;
                            }
                        }
                    }
                }
            } while (var5 <= 0);
            this.field960 = new int[var5];
            this.field959 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field959[var6] = arg1.method231();
                this.field960[var6] = arg1.method229();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method333(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field960 != null) {
            for (int var6 = 0; var6 < this.field960.length; var6++) {
                if (this.field960[var6] == arg1) {
                    return Model.method127(this.field959[var6] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field959 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field959.length; var5++) {
                var4 &= Model.method127(this.field959[var5] & 0xFFFF);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(B)Z")
    public final boolean method334(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field959 == null) {
            return true;
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field959.length; var5++) {
            var4 &= Model.method127(this.field959[var5] & 0xFFFF);
        }
        return var4;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lub;I)V")
    public final void method335(OnDemand arg0, int arg1) {
        if (this.field959 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field959.length; var3++) {
            arg0.method284(633, this.field959[var3] & 0xFFFF, 0);
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method337(-603, arg1, arg0, arg6);
        if (var8 == null) {
            return null;
        }
        if (this.field970 || this.field971) {
            var8 = new Model(var8, this.field971, this.field970, true);
        }
        if (this.field970) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field546; var10++) {
                int var11 = var8.field547[var10];
                int var12 = var8.field549[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field548[var10] += var15 - var9;
            }
            var8.method131(true);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)Leb;")
    private final Model method337(int arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field960 == null) {
            if (arg2 != 10) {
                return null;
            }
            var6 = ((long) (arg3 + 1) << 32) + (long) ((this.field958 << 6) + arg1);
            Model var8 = (Model) field996.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field959 == null) {
                return null;
            }
            boolean var9 = this.field980 ^ arg1 > 3;
            int var10 = this.field959.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field959[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field995.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method126((byte) 4, var12 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method141(4);
                    }
                    field995.method102((long) var12, -533, var5);
                }
                if (var10 > 1) {
                    field957[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(field957, this.field949, var10);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field960.length; var14++) {
                if (this.field960[var14] == arg2) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg3 + 1) << 32) + (long) ((this.field958 << 6) + (var13 << 3) + arg1);
            Model var15 = (Model) field996.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field959[var13];
            boolean var17 = this.field980 ^ arg1 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field995.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method126((byte) 4, var16 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method141(4);
                }
                field995.method102((long) var16, -533, var5);
            }
        }
        if (arg0 >= 0) {
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
        Model var20 = new Model(arg1 == 0 && arg3 == -1 && !var18 && !var19, var5, this.field963 == null, (byte) 119, AnimFrame.method48(arg3, (byte) 7));
        if (arg3 != -1) {
            var20.method133(861);
            var20.method134((byte) -54, arg3);
            var20.field578 = null;
            var20.field577 = null;
        }
        while (arg1-- > 0) {
            var20.method137(-126);
        }
        if (this.field963 != null) {
            for (int var21 = 0; var21 < this.field963.length; var21++) {
                var20.method140(this.field963[var21], this.field964[var21]);
            }
        }
        if (var18) {
            var20.method142(this.field984, true, this.field982, this.field983);
        }
        if (var19) {
            var20.method139(this.field985, this.field987, false, this.field986);
        }
        var20.method143(this.field975 + 64, this.field976 * 5 + 768, -50, -10, -50, !this.field971);
        if (this.field991 == 1) {
            var20.field574 = var20.field398;
        }
        field996.method102(var6, -533, var20);
        return var20;
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(B)Lec;")
    public final LocType method338(byte arg0) {
        int var2 = -1;
        if (arg0 != -115) {
            this.field950 = 334;
        }
        if (this.field993 != -1) {
            VarbitType var3 = VarbitType.field1182[this.field993];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field1673[var6 - var5];
            var2 = field951.field1556[var4] >> var5 & var7;
        } else if (this.field994 != -1) {
            var2 = field951.field1556[this.field994];
        }
        return var2 < 0 || var2 >= this.field992.length || this.field992[var2] == -1 ? null : method330(this.field992[var2]);
    }
}
