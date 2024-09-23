import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    public int field957 = -1;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[Leb;")
    private static Model[] field956 = new Model[4];

    @OriginalMember(owner = "ec", name = "S", descriptor = "Ls;")
    public static LruCache field994 = new LruCache(500, (byte) 1);

    @OriginalMember(owner = "ec", name = "T", descriptor = "Ls;")
    public static LruCache field995 = new LruCache(30, (byte) 1);

    @OriginalMember(owner = "ec", name = "y", descriptor = "B")
    private byte field974;

    @OriginalMember(owner = "ec", name = "z", descriptor = "B")
    private byte field975;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private static int field951;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field955;

    @OriginalMember(owner = "ec", name = "o", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "ec", name = "p", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "ec", name = "w", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "ec", name = "x", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "ec", name = "C", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "ec", name = "R", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "ec", name = "d", descriptor = "Llb;")
    private static Packet field953;

    @OriginalMember(owner = "ec", name = "a", descriptor = "Lclient;")
    public static client field950;

    @OriginalMember(owner = "ec", name = "k", descriptor = "Ljava/lang/String;")
    public String field960;

    @OriginalMember(owner = "ec", name = "q", descriptor = "Z")
    public boolean field966;

    @OriginalMember(owner = "ec", name = "r", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "ec", name = "s", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    private boolean field970;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field971;

    @OriginalMember(owner = "ec", name = "D", descriptor = "Z")
    private boolean field979;

    @OriginalMember(owner = "ec", name = "E", descriptor = "Z")
    public boolean field980;

    @OriginalMember(owner = "ec", name = "M", descriptor = "Z")
    public boolean field988;

    @OriginalMember(owner = "ec", name = "N", descriptor = "Z")
    public boolean field989;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[B")
    public byte[] field961;

    @OriginalMember(owner = "ec", name = "c", descriptor = "[I")
    private static int[] field952;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[I")
    private int[] field959;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field962;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field963;

    @OriginalMember(owner = "ec", name = "P", descriptor = "[I")
    public int[] field991;

    @OriginalMember(owner = "ec", name = "e", descriptor = "[Lec;")
    private static LocType[] field954;

    @OriginalMember(owner = "ec", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field976;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method328(Jagfile arg0) {
        field953 = new Packet(arg0.method299("loc.dat", null), (byte) -93);
        Packet var1 = new Packet(arg0.method299("loc.idx", null), (byte) -93);
        field951 = var1.method231();
        field952 = new int[field951];
        int var2 = 2;
        for (int var3 = 0; var3 < field951; var3++) {
            field952[var3] = var2;
            var2 += var1.method231();
        }
        field954 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field954[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public static final void method329(boolean arg0) {
        field994 = null;
        field995 = null;
        field952 = null;
        if (!arg0) {
            field954 = null;
            field953 = null;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method330(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field954[var1].field957 == arg0) {
                return field954[var1];
            }
        }
        field955 = (field955 + 1) % 20;
        LocType var2 = field954[field955];
        field953.field713 = field952[arg0];
        var2.field957 = arg0;
        var2.method331();
        var2.method332(210, field953);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method331() {
        this.field958 = null;
        this.field959 = null;
        this.field960 = null;
        this.field961 = null;
        this.field962 = null;
        this.field963 = null;
        this.field964 = 1;
        this.field965 = 1;
        this.field966 = true;
        this.field967 = true;
        this.field968 = false;
        this.field969 = false;
        this.field970 = false;
        this.field971 = false;
        this.field972 = -1;
        this.field973 = 16;
        this.field974 = 0;
        this.field975 = 0;
        this.field976 = null;
        this.field977 = -1;
        this.field978 = -1;
        this.field979 = false;
        this.field980 = true;
        this.field981 = 128;
        this.field982 = 128;
        this.field983 = 128;
        this.field987 = 0;
        this.field984 = 0;
        this.field985 = 0;
        this.field986 = 0;
        this.field988 = false;
        this.field989 = false;
        this.field990 = -1;
        this.field992 = -1;
        this.field993 = -1;
        this.field991 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILlb;)V")
    private final void method332(int arg0, Packet arg1) {
        int var3 = -1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg1.method229();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field968 = false;
                            if (this.field958 != null && (this.field959 == null || this.field959[0] == 10)) {
                                this.field968 = true;
                            }
                            if (this.field976 != null) {
                                this.field968 = true;
                            }
                        }
                        if (this.field989) {
                            this.field966 = false;
                            this.field967 = false;
                        }
                        if (this.field990 == -1) {
                            this.field990 = this.field966 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg1.method229();
                        break;
                    }
                    if (var4 == 2) {
                        this.field960 = arg1.method236();
                    } else if (var4 == 3) {
                        this.field961 = arg1.method237((byte) -14);
                    } else if (var4 == 5) {
                        int var7 = arg1.method229();
                        if (var7 > 0) {
                            this.field959 = null;
                            this.field958 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field958[var8] = arg1.method231();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field964 = arg1.method229();
                    } else if (var4 == 15) {
                        this.field965 = arg1.method229();
                    } else if (var4 == 17) {
                        this.field966 = false;
                    } else if (var4 == 18) {
                        this.field967 = false;
                    } else if (var4 == 19) {
                        var3 = arg1.method229();
                        if (var3 == 1) {
                            this.field968 = true;
                        }
                    } else if (var4 == 21) {
                        this.field969 = true;
                    } else if (var4 == 22) {
                        this.field970 = true;
                    } else if (var4 == 23) {
                        this.field971 = true;
                    } else if (var4 == 24) {
                        this.field972 = arg1.method231();
                        if (this.field972 == 65535) {
                            this.field972 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field973 = arg1.method229();
                    } else if (var4 == 29) {
                        this.field974 = arg1.method230();
                    } else if (var4 == 39) {
                        this.field975 = arg1.method230();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field976 == null) {
                            this.field976 = new String[5];
                        }
                        this.field976[var4 - 30] = arg1.method236();
                        if (this.field976[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field976[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg1.method229();
                        this.field962 = new int[var9];
                        this.field963 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field962[var10] = arg1.method231();
                            this.field963[var10] = arg1.method231();
                        }
                    } else if (var4 == 60) {
                        this.field977 = arg1.method231();
                    } else if (var4 == 62) {
                        this.field979 = true;
                    } else if (var4 == 64) {
                        this.field980 = false;
                    } else if (var4 == 65) {
                        this.field981 = arg1.method231();
                    } else if (var4 == 66) {
                        this.field982 = arg1.method231();
                    } else if (var4 == 67) {
                        this.field983 = arg1.method231();
                    } else if (var4 == 68) {
                        this.field978 = arg1.method231();
                    } else if (var4 == 69) {
                        this.field987 = arg1.method229();
                    } else if (var4 == 70) {
                        this.field984 = arg1.method232();
                    } else if (var4 == 71) {
                        this.field985 = arg1.method232();
                    } else if (var4 == 72) {
                        this.field986 = arg1.method232();
                    } else if (var4 == 73) {
                        this.field988 = true;
                    } else if (var4 == 74) {
                        this.field989 = true;
                    } else if (var4 == 75) {
                        this.field990 = arg1.method229();
                    } else if (var4 == 77) {
                        this.field992 = arg1.method231();
                        if (this.field992 == 65535) {
                            this.field992 = -1;
                        }
                        this.field993 = arg1.method231();
                        if (this.field993 == 65535) {
                            this.field993 = -1;
                        }
                        int var11 = arg1.method229();
                        this.field991 = new int[var11 + 1];
                        for (int var12 = 0; var12 <= var11; var12++) {
                            this.field991[var12] = arg1.method231();
                            if (this.field991[var12] == 65535) {
                                this.field991[var12] = -1;
                            }
                        }
                    }
                }
            } while (var5 <= 0);
            this.field959 = new int[var5];
            this.field958 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field958[var6] = arg1.method231();
                this.field959[var6] = arg1.method229();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method333(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field959 != null) {
            for (int var5 = 0; var5 < this.field959.length; var5++) {
                if (this.field959[var5] == arg1) {
                    return Model.method127(this.field958[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field958 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field958.length; var4++) {
                var3 &= Model.method127(this.field958[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(Z)Z")
    public final boolean method334(boolean arg0) {
        if (this.field958 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field958.length; var3++) {
            var2 &= Model.method127(this.field958[var3] & 0xFFFF);
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lub;B)V")
    public final void method335(OnDemand arg0, byte arg1) {
        if (arg1 != 9) {
            return;
        }
        boolean var3 = false;
        if (this.field958 != null) {
            for (int var4 = 0; var4 < this.field958.length; var4++) {
                arg0.method284(this.field958[var4] & 0xFFFF, -43609, 0);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method337(arg6, (byte) 21, arg1, arg0);
        if (var8 == null) {
            return null;
        }
        if (this.field969 || this.field970) {
            var8 = new Model((byte) 60, var8, this.field970, this.field969);
        }
        if (this.field969) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field537; var10++) {
                int var11 = var8.field538[var10];
                int var12 = var8.field540[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field539[var10] += var15 - var9;
            }
            var8.method131(0);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IBII)Leb;")
    private final Model method337(int arg0, byte arg1, int arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field959 == null) {
            if (arg3 != 10) {
                return null;
            }
            var6 = ((long) (arg0 + 1) << 32) + (long) ((this.field957 << 6) + arg2);
            Model var8 = (Model) field995.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field958 == null) {
                return null;
            }
            boolean var9 = this.field979 ^ arg2 > 3;
            int var10 = this.field958.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field958[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field994.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method126((byte) -14, var12 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method141(1);
                    }
                    field994.method102(var5, 0, (long) var12);
                }
                if (var10 > 1) {
                    field956[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(field956, var10, false);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field959.length; var14++) {
                if (this.field959[var14] == arg3) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg0 + 1) << 32) + (long) ((this.field957 << 6) + (var13 << 3) + arg2);
            Model var15 = (Model) field995.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field958[var13];
            boolean var17 = this.field979 ^ arg2 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field994.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method126((byte) -14, var16 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method141(1);
                }
                field994.method102(var5, 0, (long) var16);
            }
        }
        boolean var18;
        if (this.field981 == 128 && this.field982 == 128 && this.field983 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field984 == 0 && this.field985 == 0 && this.field986 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(arg2 == 0 && arg0 == -1 && !var18 && !var19, 201, var5, AnimFrame.method48(577, arg0), this.field962 == null);
        if (arg0 != -1) {
            var20.method133(5);
            var20.method134(0, arg0);
            var20.field569 = null;
            var20.field568 = null;
        }
        while (arg2-- > 0) {
            var20.method137((byte) -57);
        }
        if (this.field962 != null) {
            for (int var21 = 0; var21 < this.field962.length; var21++) {
                var20.method140(this.field962[var21], this.field963[var21]);
            }
        }
        if (var18) {
            var20.method142(this.field983, this.field982, this.field981, (byte) -119);
        }
        if (var19) {
            var20.method139(-9236, this.field986, this.field985, this.field984);
        }
        var20.method143(this.field974 + 64, this.field975 * 5 + 768, -50, -10, -50, !this.field970);
        if (arg1 != 21) {
            throw new NullPointerException();
        }
        if (this.field990 == 1) {
            var20.field565 = var20.field390;
        }
        field995.method102(var20, 0, var6);
        return var20;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Lec;")
    public final LocType method338(int arg0) {
        if (arg0 != 33093) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field992 != -1) {
            VarbitType var4 = VarbitType.field1180[this.field992];
            int var5 = var4.field1182;
            int var6 = var4.field1183;
            int var7 = var4.field1184;
            int var8 = client.field1425[var7 - var6];
            var3 = field950.field1416[var5] >> var6 & var8;
        } else if (this.field993 != -1) {
            var3 = field950.field1416[this.field993];
        }
        return var3 < 0 || var3 >= this.field991.length || this.field991[var3] == -1 ? null : method330(this.field991[var3]);
    }
}
