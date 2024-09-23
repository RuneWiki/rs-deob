import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private boolean field949 = true;

    @OriginalMember(owner = "ec", name = "d", descriptor = "B")
    private byte field950 = -41;

    @OriginalMember(owner = "ec", name = "e", descriptor = "B")
    private byte field951 = 3;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private int field952 = 6;

    @OriginalMember(owner = "ec", name = "n", descriptor = "I")
    public int field960 = -1;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[Leb;")
    private static Model[] field959 = new Model[4];

    @OriginalMember(owner = "ec", name = "Y", descriptor = "Ls;")
    public static LruCache field997 = new LruCache(false, 500);

    @OriginalMember(owner = "ec", name = "Z", descriptor = "Ls;")
    public static LruCache field998 = new LruCache(false, 30);

    @OriginalMember(owner = "ec", name = "E", descriptor = "B")
    private byte field977;

    @OriginalMember(owner = "ec", name = "F", descriptor = "B")
    private byte field978;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    private static int field954;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    private static int field958;

    @OriginalMember(owner = "ec", name = "u", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ec", name = "v", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "ec", name = "C", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "ec", name = "D", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "ec", name = "R", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "ec", name = "W", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "ec", name = "X", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "ec", name = "j", descriptor = "Llb;")
    private static Packet field956;

    @OriginalMember(owner = "ec", name = "g", descriptor = "Lclient;")
    public static client field953;

    @OriginalMember(owner = "ec", name = "q", descriptor = "Ljava/lang/String;")
    public String field963;

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private static boolean field947;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field970;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    public boolean field971;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "ec", name = "A", descriptor = "Z")
    private boolean field973;

    @OriginalMember(owner = "ec", name = "B", descriptor = "Z")
    public boolean field974;

    @OriginalMember(owner = "ec", name = "J", descriptor = "Z")
    private boolean field982;

    @OriginalMember(owner = "ec", name = "K", descriptor = "Z")
    public boolean field983;

    @OriginalMember(owner = "ec", name = "S", descriptor = "Z")
    public boolean field991;

    @OriginalMember(owner = "ec", name = "T", descriptor = "Z")
    public boolean field992;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[B")
    public byte[] field964;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[I")
    private static int[] field955;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[I")
    private int[] field961;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field962;

    @OriginalMember(owner = "ec", name = "s", descriptor = "[I")
    private int[] field965;

    @OriginalMember(owner = "ec", name = "t", descriptor = "[I")
    private int[] field966;

    @OriginalMember(owner = "ec", name = "V", descriptor = "[I")
    public int[] field994;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[Lec;")
    private static LocType[] field957;

    @OriginalMember(owner = "ec", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field979;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method328(Jagfile arg0) {
        field956 = new Packet(-49365, arg0.method299("loc.dat", null));
        Packet var1 = new Packet(-49365, arg0.method299("loc.idx", null));
        field954 = var1.method231();
        field955 = new int[field954];
        int var2 = 2;
        for (int var3 = 0; var3 < field954; var3++) {
            field955[var3] = var2;
            var2 += var1.method231();
        }
        field957 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field957[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public static final void method329(boolean arg0) {
        field997 = null;
        field998 = null;
        field955 = null;
        if (!arg0) {
            field947 = !field947;
        }
        field957 = null;
        field956 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method330(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field957[var1].field960 == arg0) {
                return field957[var1];
            }
        }
        field958 = (field958 + 1) % 20;
        LocType var2 = field957[field958];
        field956.field722 = field955[arg0];
        var2.field960 = arg0;
        var2.method331();
        var2.method332(field956, false);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method331() {
        this.field961 = null;
        this.field962 = null;
        this.field963 = null;
        this.field964 = null;
        this.field965 = null;
        this.field966 = null;
        this.field967 = 1;
        this.field968 = 1;
        this.field969 = true;
        this.field970 = true;
        this.field971 = false;
        this.field972 = false;
        this.field973 = false;
        this.field974 = false;
        this.field975 = -1;
        this.field976 = 16;
        this.field977 = 0;
        this.field978 = 0;
        this.field979 = null;
        this.field980 = -1;
        this.field981 = -1;
        this.field982 = false;
        this.field983 = true;
        this.field984 = 128;
        this.field985 = 128;
        this.field986 = 128;
        this.field990 = 0;
        this.field987 = 0;
        this.field988 = 0;
        this.field989 = 0;
        this.field991 = false;
        this.field992 = false;
        this.field993 = -1;
        this.field995 = -1;
        this.field996 = -1;
        this.field994 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Llb;Z)V")
    private final void method332(Packet arg0, boolean arg1) {
        int var3 = -1;
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var6;
            do {
                while (true) {
                    int var5 = arg0.method229();
                    if (var5 == 0) {
                        if (var3 == -1) {
                            this.field971 = false;
                            if (this.field961 != null && (this.field962 == null || this.field962[0] == 10)) {
                                this.field971 = true;
                            }
                            if (this.field979 != null) {
                                this.field971 = true;
                            }
                        }
                        if (this.field992) {
                            this.field969 = false;
                            this.field970 = false;
                        }
                        if (this.field993 == -1) {
                            this.field993 = this.field969 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var5 == 1) {
                        var6 = arg0.method229();
                        break;
                    }
                    if (var5 == 2) {
                        this.field963 = arg0.method236();
                    } else if (var5 == 3) {
                        this.field964 = arg0.method237(true);
                    } else if (var5 == 5) {
                        int var8 = arg0.method229();
                        if (var8 > 0) {
                            this.field962 = null;
                            this.field961 = new int[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                this.field961[var9] = arg0.method231();
                            }
                        }
                    } else if (var5 == 14) {
                        this.field967 = arg0.method229();
                    } else if (var5 == 15) {
                        this.field968 = arg0.method229();
                    } else if (var5 == 17) {
                        this.field969 = false;
                    } else if (var5 == 18) {
                        this.field970 = false;
                    } else if (var5 == 19) {
                        var3 = arg0.method229();
                        if (var3 == 1) {
                            this.field971 = true;
                        }
                    } else if (var5 == 21) {
                        this.field972 = true;
                    } else if (var5 == 22) {
                        this.field973 = true;
                    } else if (var5 == 23) {
                        this.field974 = true;
                    } else if (var5 == 24) {
                        this.field975 = arg0.method231();
                        if (this.field975 == 65535) {
                            this.field975 = -1;
                        }
                    } else if (var5 == 28) {
                        this.field976 = arg0.method229();
                    } else if (var5 == 29) {
                        this.field977 = arg0.method230();
                    } else if (var5 == 39) {
                        this.field978 = arg0.method230();
                    } else if (var5 >= 30 && var5 < 39) {
                        if (this.field979 == null) {
                            this.field979 = new String[5];
                        }
                        this.field979[var5 - 30] = arg0.method236();
                        if (this.field979[var5 - 30].equalsIgnoreCase("hidden")) {
                            this.field979[var5 - 30] = null;
                        }
                    } else if (var5 == 40) {
                        int var10 = arg0.method229();
                        this.field965 = new int[var10];
                        this.field966 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field965[var11] = arg0.method231();
                            this.field966[var11] = arg0.method231();
                        }
                    } else if (var5 == 60) {
                        this.field980 = arg0.method231();
                    } else if (var5 == 62) {
                        this.field982 = true;
                    } else if (var5 == 64) {
                        this.field983 = false;
                    } else if (var5 == 65) {
                        this.field984 = arg0.method231();
                    } else if (var5 == 66) {
                        this.field985 = arg0.method231();
                    } else if (var5 == 67) {
                        this.field986 = arg0.method231();
                    } else if (var5 == 68) {
                        this.field981 = arg0.method231();
                    } else if (var5 == 69) {
                        this.field990 = arg0.method229();
                    } else if (var5 == 70) {
                        this.field987 = arg0.method232();
                    } else if (var5 == 71) {
                        this.field988 = arg0.method232();
                    } else if (var5 == 72) {
                        this.field989 = arg0.method232();
                    } else if (var5 == 73) {
                        this.field991 = true;
                    } else if (var5 == 74) {
                        this.field992 = true;
                    } else if (var5 == 75) {
                        this.field993 = arg0.method229();
                    } else if (var5 == 77) {
                        this.field995 = arg0.method231();
                        if (this.field995 == 65535) {
                            this.field995 = -1;
                        }
                        this.field996 = arg0.method231();
                        if (this.field996 == 65535) {
                            this.field996 = -1;
                        }
                        int var12 = arg0.method229();
                        this.field994 = new int[var12 + 1];
                        for (int var13 = 0; var13 <= var12; var13++) {
                            this.field994[var13] = arg0.method231();
                            if (this.field994[var13] == 65535) {
                                this.field994[var13] = -1;
                            }
                        }
                    }
                }
            } while (var6 <= 0);
            this.field962 = new int[var6];
            this.field961 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field961[var7] = arg0.method231();
                this.field962[var7] = arg0.method229();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method333(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field948 = -452;
        }
        if (this.field962 != null) {
            for (int var5 = 0; var5 < this.field962.length; var5++) {
                if (this.field962[var5] == arg1) {
                    return Model.method127(this.field961[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field961 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field961.length; var4++) {
                var3 &= Model.method127(this.field961[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Z")
    public final boolean method334(int arg0) {
        if (arg0 != -20444) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field961 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field961.length; var4++) {
            var3 &= Model.method127(this.field961[var4] & 0xFFFF);
        }
        return var3;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILub;)V")
    public final void method335(int arg0, OnDemand arg1) {
        if (arg0 != -2156) {
            this.field952 = -412;
        }
        if (this.field961 != null) {
            for (int var3 = 0; var3 < this.field961.length; var3++) {
                arg1.method284(false, 0, this.field961[var3] & 0xFFFF);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method337(arg6, arg1, -45961, arg0);
        if (var8 == null) {
            return null;
        }
        if (this.field972 || this.field973) {
            var8 = new Model(3, var8, this.field973, this.field972);
        }
        if (this.field972) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field553; var10++) {
                int var11 = var8.field554[var10];
                int var12 = var8.field556[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field555[var10] += var15 - var9;
            }
            var8.method131(-388);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)Leb;")
    private final Model method337(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -45961) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Model var6 = null;
        long var7;
        if (this.field962 == null) {
            if (arg3 != 10) {
                return null;
            }
            var7 = ((long) (arg0 + 1) << 32) + (long) ((this.field960 << 6) + arg1);
            Model var9 = (Model) field998.method101(var7);
            if (var9 != null) {
                return var9;
            }
            if (this.field961 == null) {
                return null;
            }
            boolean var10 = this.field982 ^ arg1 > 3;
            int var11 = this.field961.length;
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = this.field961[var12];
                if (var10) {
                    var13 += 65536;
                }
                var6 = (Model) field997.method101((long) var13);
                if (var6 == null) {
                    var6 = Model.method126(0, var13 & 0xFFFF);
                    if (var6 == null) {
                        return null;
                    }
                    if (var10) {
                        var6.method141(this.field951);
                    }
                    field997.method102(true, (long) var13, var6);
                }
                if (var11 > 1) {
                    field959[var12] = var6;
                }
            }
            if (var11 > 1) {
                var6 = new Model(field959, this.field950, var11);
            }
        } else {
            int var14 = -1;
            for (int var15 = 0; var15 < this.field962.length; var15++) {
                if (this.field962[var15] == arg3) {
                    var14 = var15;
                    break;
                }
            }
            if (var14 == -1) {
                return null;
            }
            var7 = ((long) (arg0 + 1) << 32) + (long) ((this.field960 << 6) + (var14 << 3) + arg1);
            Model var16 = (Model) field998.method101(var7);
            if (var16 != null) {
                return var16;
            }
            int var17 = this.field961[var14];
            boolean var18 = this.field982 ^ arg1 > 3;
            if (var18) {
                var17 += 65536;
            }
            var6 = (Model) field997.method101((long) var17);
            if (var6 == null) {
                var6 = Model.method126(0, var17 & 0xFFFF);
                if (var6 == null) {
                    return null;
                }
                if (var18) {
                    var6.method141(this.field951);
                }
                field997.method102(true, (long) var17, var6);
            }
        }
        boolean var19;
        if (this.field984 == 128 && this.field985 == 128 && this.field986 == 128) {
            var19 = false;
        } else {
            var19 = true;
        }
        boolean var20;
        if (this.field987 == 0 && this.field988 == 0 && this.field989 == 0) {
            var20 = false;
        } else {
            var20 = true;
        }
        Model var21 = new Model(arg1 == 0 && arg0 == -1 && !var19 && !var20, -16051, var6, AnimFrame.method48(arg0, this.field949), this.field965 == null);
        if (arg0 != -1) {
            var21.method133(true);
            var21.method134(true, arg0);
            var21.field585 = null;
            var21.field584 = null;
        }
        while (arg1-- > 0) {
            var21.method137(34109);
        }
        if (this.field965 != null) {
            for (int var22 = 0; var22 < this.field965.length; var22++) {
                var21.method140(this.field965[var22], this.field966[var22]);
            }
        }
        if (var19) {
            var21.method142(19411, this.field984, this.field986, this.field985);
        }
        if (var20) {
            var21.method139(this.field988, this.field989, 0, this.field987);
        }
        var21.method143(this.field977 + 64, this.field978 * 5 + 768, -50, -10, -50, !this.field973);
        if (this.field993 == 1) {
            var21.field581 = var21.field399;
        }
        field998.method102(true, var7, var21);
        return var21;
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)Lec;")
    public final LocType method338(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            this.field952 = -109;
        }
        if (this.field995 != -1) {
            VarbitType var3 = VarbitType.field1182[this.field995];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field1671[var6 - var5];
            var2 = field953.field1593[var4] >> var5 & var7;
        } else if (this.field996 != -1) {
            var2 = field953.field1593[this.field996];
        }
        return var2 < 0 || var2 >= this.field994.length || this.field994[var2] == -1 ? null : method330(this.field994[var2]);
    }
}
