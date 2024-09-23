import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field954 = false;

    @OriginalMember(owner = "ec", name = "d", descriptor = "B")
    private byte field957 = -70;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    public int field965 = -1;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private static boolean field956 = true;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[Leb;")
    private static Model[] field964 = new Model[4];

    @OriginalMember(owner = "ec", name = "W", descriptor = "Ls;")
    public static LruCache field1002 = new LruCache(-739, 500);

    @OriginalMember(owner = "ec", name = "X", descriptor = "Ls;")
    public static LruCache field1003 = new LruCache(-739, 30);

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field982;

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field983;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "ec", name = "V", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field959;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field963;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "ec", name = "S", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Llb;")
    private static Packet field961;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Lclient;")
    public static client field958;

    @OriginalMember(owner = "ec", name = "o", descriptor = "Ljava/lang/String;")
    public String field968;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field974;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field975;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field977;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    private boolean field978;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field979;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field987;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field988;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field996;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field997;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[B")
    public byte[] field969;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field960;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field966;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field967;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field970;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field971;

    @OriginalMember(owner = "ec", name = "T", descriptor = "[I")
    public int[] field999;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field962;

    @OriginalMember(owner = "ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field984;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method328(Jagfile arg0) {
        field961 = new Packet(arg0.method299("loc.dat", null), -26728);
        Packet var1 = new Packet(arg0.method299("loc.idx", null), -26728);
        field959 = var1.method231();
        field960 = new int[field959];
        int var2 = 2;
        for (int var3 = 0; var3 < field959; var3++) {
            field960[var3] = var2;
            var2 += var1.method231();
        }
        field962 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field962[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public static final void method329(int arg0) {
        field1002 = null;
        if (arg0 != 0) {
            field956 = !field956;
        }
        field1003 = null;
        field960 = null;
        field962 = null;
        field961 = null;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Lec;")
    public static final LocType method330(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field962[var1].field965 == arg0) {
                return field962[var1];
            }
        }
        field963 = (field963 + 1) % 20;
        LocType var2 = field962[field963];
        field961.field717 = field960[arg0];
        var2.field965 = arg0;
        var2.method331();
        var2.method332(field961, 8);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method331() {
        this.field966 = null;
        this.field967 = null;
        this.field968 = null;
        this.field969 = null;
        this.field970 = null;
        this.field971 = null;
        this.field972 = 1;
        this.field973 = 1;
        this.field974 = true;
        this.field975 = true;
        this.field976 = false;
        this.field977 = false;
        this.field978 = false;
        this.field979 = false;
        this.field980 = -1;
        this.field981 = 16;
        this.field982 = 0;
        this.field983 = 0;
        this.field984 = null;
        this.field985 = -1;
        this.field986 = -1;
        this.field987 = false;
        this.field988 = true;
        this.field989 = 128;
        this.field990 = 128;
        this.field991 = 128;
        this.field995 = 0;
        this.field992 = 0;
        this.field993 = 0;
        this.field994 = 0;
        this.field996 = false;
        this.field997 = false;
        this.field998 = -1;
        this.field1000 = -1;
        this.field1001 = -1;
        this.field999 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Llb;I)V")
    private final void method332(Packet arg0, int arg1) {
        int var3 = -1;
        if (arg1 < 8 || arg1 > 8) {
            throw new NullPointerException();
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg0.method229();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field976 = false;
                            if (this.field966 != null && (this.field967 == null || this.field967[0] == 10)) {
                                this.field976 = true;
                            }
                            if (this.field984 != null) {
                                this.field976 = true;
                            }
                        }
                        if (this.field997) {
                            this.field974 = false;
                            this.field975 = false;
                        }
                        if (this.field998 == -1) {
                            this.field998 = this.field974 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg0.method229();
                        break;
                    }
                    if (var4 == 2) {
                        this.field968 = arg0.method236();
                    } else if (var4 == 3) {
                        this.field969 = arg0.method237((byte) 6);
                    } else if (var4 == 5) {
                        int var7 = arg0.method229();
                        if (var7 > 0) {
                            this.field967 = null;
                            this.field966 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field966[var8] = arg0.method231();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field972 = arg0.method229();
                    } else if (var4 == 15) {
                        this.field973 = arg0.method229();
                    } else if (var4 == 17) {
                        this.field974 = false;
                    } else if (var4 == 18) {
                        this.field975 = false;
                    } else if (var4 == 19) {
                        var3 = arg0.method229();
                        if (var3 == 1) {
                            this.field976 = true;
                        }
                    } else if (var4 == 21) {
                        this.field977 = true;
                    } else if (var4 == 22) {
                        this.field978 = true;
                    } else if (var4 == 23) {
                        this.field979 = true;
                    } else if (var4 == 24) {
                        this.field980 = arg0.method231();
                        if (this.field980 == 65535) {
                            this.field980 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field981 = arg0.method229();
                    } else if (var4 == 29) {
                        this.field982 = arg0.method230();
                    } else if (var4 == 39) {
                        this.field983 = arg0.method230();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field984 == null) {
                            this.field984 = new String[5];
                        }
                        this.field984[var4 - 30] = arg0.method236();
                        if (this.field984[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field984[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg0.method229();
                        this.field970 = new int[var9];
                        this.field971 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field970[var10] = arg0.method231();
                            this.field971[var10] = arg0.method231();
                        }
                    } else if (var4 == 60) {
                        this.field985 = arg0.method231();
                    } else if (var4 == 62) {
                        this.field987 = true;
                    } else if (var4 == 64) {
                        this.field988 = false;
                    } else if (var4 == 65) {
                        this.field989 = arg0.method231();
                    } else if (var4 == 66) {
                        this.field990 = arg0.method231();
                    } else if (var4 == 67) {
                        this.field991 = arg0.method231();
                    } else if (var4 == 68) {
                        this.field986 = arg0.method231();
                    } else if (var4 == 69) {
                        this.field995 = arg0.method229();
                    } else if (var4 == 70) {
                        this.field992 = arg0.method232();
                    } else if (var4 == 71) {
                        this.field993 = arg0.method232();
                    } else if (var4 == 72) {
                        this.field994 = arg0.method232();
                    } else if (var4 == 73) {
                        this.field996 = true;
                    } else if (var4 == 74) {
                        this.field997 = true;
                    } else if (var4 == 75) {
                        this.field998 = arg0.method229();
                    } else if (var4 == 77) {
                        this.field1000 = arg0.method231();
                        if (this.field1000 == 65535) {
                            this.field1000 = -1;
                        }
                        this.field1001 = arg0.method231();
                        if (this.field1001 == 65535) {
                            this.field1001 = -1;
                        }
                        int var11 = arg0.method229();
                        this.field999 = new int[var11 + 1];
                        for (int var12 = 0; var12 <= var11; var12++) {
                            this.field999[var12] = arg0.method231();
                            if (this.field999[var12] == 65535) {
                                this.field999[var12] = -1;
                            }
                        }
                    }
                }
            } while (var5 <= 0);
            this.field967 = new int[var5];
            this.field966 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field966[var6] = arg0.method231();
                this.field967[var6] = arg0.method229();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method333(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.field954 = !this.field954;
        }
        if (this.field967 != null) {
            for (int var5 = 0; var5 < this.field967.length; var5++) {
                if (this.field967[var5] == arg1) {
                    return Model.method127(this.field966[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field966 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field966.length; var4++) {
                var3 &= Model.method127(this.field966[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)Z")
    public final boolean method334(int arg0) {
        if (this.field966 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field966.length; var3++) {
            var2 &= Model.method127(this.field966[var3] & 0xFFFF);
        }
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILub;)V")
    public final void method335(int arg0, OnDemand arg1) {
        if (this.field966 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field966.length; var3++) {
            arg1.method284(0, 47179, this.field966[var3] & 0xFFFF);
        }
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method337(arg6, arg0, true, arg1);
        if (var8 == null) {
            return null;
        }
        if (this.field977 || this.field978) {
            var8 = new Model(this.field977, var8, (byte) 80, this.field978);
        }
        if (this.field977) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field540; var10++) {
                int var11 = var8.field541[var10];
                int var12 = var8.field543[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field542[var10] += var15 - var9;
            }
            var8.method131(this.field955);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIZI)Leb;")
    private final Model method337(int arg0, int arg1, boolean arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field967 == null) {
            if (arg1 != 10) {
                return null;
            }
            var6 = ((long) (arg0 + 1) << 32) + (long) ((this.field965 << 6) + arg3);
            Model var8 = (Model) field1003.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field966 == null) {
                return null;
            }
            boolean var9 = this.field987 ^ arg3 > 3;
            int var10 = this.field966.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field966[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field1002.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method126(true, var12 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method141((byte) -72);
                    }
                    field1002.method102((long) var12, var5, 10514);
                }
                if (var10 > 1) {
                    field964[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(var10, -314, field964);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field967.length; var14++) {
                if (this.field967[var14] == arg1) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg0 + 1) << 32) + (long) ((this.field965 << 6) + (var13 << 3) + arg3);
            Model var15 = (Model) field1003.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field966[var13];
            boolean var17 = this.field987 ^ arg3 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field1002.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method126(true, var16 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method141((byte) -72);
                }
                field1002.method102((long) var16, var5, 10514);
            }
        }
        boolean var18;
        if (this.field989 == 128 && this.field990 == 128 && this.field991 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field992 == 0 && this.field993 == 0 && this.field994 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(AnimFrame.method48(arg0, 45733), arg3 == 0 && arg0 == -1 && !var18 && !var19, this.field970 == null, var5, 0);
        if (arg0 != -1) {
            var20.method133(true);
            var20.method134(true, arg0);
            var20.field572 = null;
            var20.field571 = null;
        }
        while (arg3-- > 0) {
            var20.method137((byte) -125);
        }
        if (this.field970 != null) {
            for (int var21 = 0; var21 < this.field970.length; var21++) {
                var20.method140(this.field970[var21], this.field971[var21]);
            }
        }
        if (var18) {
            var20.method142(this.field989, this.field991, -34245, this.field990);
        }
        if (var19) {
            var20.method139(this.field993, false, this.field994, this.field992);
        }
        var20.method143(this.field982 + 64, this.field983 * 5 + 768, -50, -10, -50, !this.field978);
        if (!arg2) {
            throw new NullPointerException();
        }
        if (this.field998 == 1) {
            var20.field568 = var20.field394;
        }
        field1003.method102(var6, var20, 10514);
        return var20;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)Lec;")
    public final LocType method338(byte arg0) {
        int var2 = -1;
        if (this.field957 != arg0) {
            field956 = !field956;
        }
        if (this.field1000 != -1) {
            VarbitType var3 = VarbitType.field1186[this.field1000];
            int var4 = var3.field1188;
            int var5 = var3.field1189;
            int var6 = var3.field1190;
            int var7 = client.field1344[var6 - var5];
            var2 = field958.field1384[var4] >> var5 & var7;
        } else if (this.field1001 != -1) {
            var2 = field958.field1384[this.field1001];
        }
        return var2 < 0 || var2 >= this.field999.length || this.field999[var2] == -1 ? null : method330(this.field999[var2]);
    }
}
