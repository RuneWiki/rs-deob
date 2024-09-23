import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field934 = -22323;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private boolean field935 = true;

    @OriginalMember(owner = "ec", name = "d", descriptor = "B")
    private byte field936 = 3;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    public int field944 = -1;

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private static int field933 = 1000;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[Leb;")
    private static Model[] field943 = new Model[4];

    @OriginalMember(owner = "ec", name = "W", descriptor = "Ls;")
    public static LruCache field981 = new LruCache((byte) 113, 500);

    @OriginalMember(owner = "ec", name = "X", descriptor = "Ls;")
    public static LruCache field982 = new LruCache((byte) 113, 30);

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field961;

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field962;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field938;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field942;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "ec", name = "S", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "ec", name = "V", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Llb;")
    private static Packet field940;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Lclient;")
    public static client field937;

    @OriginalMember(owner = "ec", name = "o", descriptor = "Ljava/lang/String;")
    public String field947;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field953;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field954;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field955;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field956;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    private boolean field957;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field958;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field966;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field975;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[B")
    public byte[] field948;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field939;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field945;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field949;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field950;

    @OriginalMember(owner = "ec", name = "T", descriptor = "[I")
    public int[] field978;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field941;

    @OriginalMember(owner = "ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field963;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method328(Jagfile arg0) {
        field940 = new Packet(field933, arg0.method299("loc.dat", null));
        Packet var1 = new Packet(field933, arg0.method299("loc.idx", null));
        field938 = var1.method231();
        field939 = new int[field938];
        int var2 = 2;
        for (int var3 = 0; var3 < field938; var3++) {
            field939[var3] = var2;
            var2 += var1.method231();
        }
        field941 = new LocType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field941[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public static final void method329(int arg0) {
        field981 = null;
        field982 = null;
        field939 = null;
        field941 = null;
        field940 = null;
        if (arg0 != 3) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Lec;")
    public static final LocType method330(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (field941[var1].field944 == arg0) {
                return field941[var1];
            }
        }
        field942 = (field942 + 1) % 20;
        LocType var2 = field941[field942];
        field940.field703 = field939[arg0];
        var2.field944 = arg0;
        var2.method331();
        var2.method332(8, field940);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method331() {
        this.field945 = null;
        this.field946 = null;
        this.field947 = null;
        this.field948 = null;
        this.field949 = null;
        this.field950 = null;
        this.field951 = 1;
        this.field952 = 1;
        this.field953 = true;
        this.field954 = true;
        this.field955 = false;
        this.field956 = false;
        this.field957 = false;
        this.field958 = false;
        this.field959 = -1;
        this.field960 = 16;
        this.field961 = 0;
        this.field962 = 0;
        this.field963 = null;
        this.field964 = -1;
        this.field965 = -1;
        this.field966 = false;
        this.field967 = true;
        this.field968 = 128;
        this.field969 = 128;
        this.field970 = 128;
        this.field974 = 0;
        this.field971 = 0;
        this.field972 = 0;
        this.field973 = 0;
        this.field975 = false;
        this.field976 = false;
        this.field977 = -1;
        this.field979 = -1;
        this.field980 = -1;
        this.field978 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILlb;)V")
    private final void method332(int arg0, Packet arg1) {
        int var3 = -1;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg1.method229();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field955 = false;
                            if (this.field945 != null && (this.field946 == null || this.field946[0] == 10)) {
                                this.field955 = true;
                            }
                            if (this.field963 != null) {
                                this.field955 = true;
                            }
                        }
                        if (this.field976) {
                            this.field953 = false;
                            this.field954 = false;
                        }
                        if (this.field977 == -1) {
                            this.field977 = this.field953 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg1.method229();
                        break;
                    }
                    if (var4 == 2) {
                        this.field947 = arg1.method236();
                    } else if (var4 == 3) {
                        this.field948 = arg1.method237((byte) 31);
                    } else if (var4 == 5) {
                        int var7 = arg1.method229();
                        if (var7 > 0) {
                            this.field946 = null;
                            this.field945 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field945[var8] = arg1.method231();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field951 = arg1.method229();
                    } else if (var4 == 15) {
                        this.field952 = arg1.method229();
                    } else if (var4 == 17) {
                        this.field953 = false;
                    } else if (var4 == 18) {
                        this.field954 = false;
                    } else if (var4 == 19) {
                        var3 = arg1.method229();
                        if (var3 == 1) {
                            this.field955 = true;
                        }
                    } else if (var4 == 21) {
                        this.field956 = true;
                    } else if (var4 == 22) {
                        this.field957 = true;
                    } else if (var4 == 23) {
                        this.field958 = true;
                    } else if (var4 == 24) {
                        this.field959 = arg1.method231();
                        if (this.field959 == 65535) {
                            this.field959 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field960 = arg1.method229();
                    } else if (var4 == 29) {
                        this.field961 = arg1.method230();
                    } else if (var4 == 39) {
                        this.field962 = arg1.method230();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field963 == null) {
                            this.field963 = new String[5];
                        }
                        this.field963[var4 - 30] = arg1.method236();
                        if (this.field963[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field963[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg1.method229();
                        this.field949 = new int[var9];
                        this.field950 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field949[var10] = arg1.method231();
                            this.field950[var10] = arg1.method231();
                        }
                    } else if (var4 == 60) {
                        this.field964 = arg1.method231();
                    } else if (var4 == 62) {
                        this.field966 = true;
                    } else if (var4 == 64) {
                        this.field967 = false;
                    } else if (var4 == 65) {
                        this.field968 = arg1.method231();
                    } else if (var4 == 66) {
                        this.field969 = arg1.method231();
                    } else if (var4 == 67) {
                        this.field970 = arg1.method231();
                    } else if (var4 == 68) {
                        this.field965 = arg1.method231();
                    } else if (var4 == 69) {
                        this.field974 = arg1.method229();
                    } else if (var4 == 70) {
                        this.field971 = arg1.method232();
                    } else if (var4 == 71) {
                        this.field972 = arg1.method232();
                    } else if (var4 == 72) {
                        this.field973 = arg1.method232();
                    } else if (var4 == 73) {
                        this.field975 = true;
                    } else if (var4 == 74) {
                        this.field976 = true;
                    } else if (var4 == 75) {
                        this.field977 = arg1.method229();
                    } else if (var4 == 77) {
                        this.field979 = arg1.method231();
                        if (this.field979 == 65535) {
                            this.field979 = -1;
                        }
                        this.field980 = arg1.method231();
                        if (this.field980 == 65535) {
                            this.field980 = -1;
                        }
                        int var11 = arg1.method229();
                        this.field978 = new int[var11 + 1];
                        for (int var12 = 0; var12 <= var11; var12++) {
                            this.field978[var12] = arg1.method231();
                            if (this.field978[var12] == 65535) {
                                this.field978[var12] = -1;
                            }
                        }
                    }
                }
            } while (var5 <= 0);
            this.field946 = new int[var5];
            this.field945 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field945[var6] = arg1.method231();
                this.field946[var6] = arg1.method229();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method333(int arg0, int arg1) {
        if (arg0 != -23698) {
            throw new NullPointerException();
        } else if (this.field946 != null) {
            for (int var5 = 0; var5 < this.field946.length; var5++) {
                if (this.field946[var5] == arg1) {
                    return Model.method127(this.field945[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field945 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field945.length; var4++) {
                var3 &= Model.method127(this.field945[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)Z")
    public final boolean method334(int arg0) {
        if (this.field945 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field945.length; var3++) {
            var2 &= Model.method127(this.field945[var3] & 0xFFFF);
        }
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILub;)V")
    public final void method335(int arg0, OnDemand arg1) {
        if (this.field945 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field945.length; var3++) {
            arg1.method284(0, this.field936, this.field945[var3] & 0xFFFF);
        }
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method337(arg0, arg1, true, arg6);
        if (var8 == null) {
            return null;
        }
        if (this.field956 || this.field957) {
            var8 = new Model(this.field957, var8, (byte) 4, this.field956);
        }
        if (this.field956) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field538; var10++) {
                int var11 = var8.field539[var10];
                int var12 = var8.field541[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field540[var10] += var15 - var9;
            }
            var8.method131(false);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIZI)Leb;")
    private final Model method337(int arg0, int arg1, boolean arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field946 == null) {
            if (arg0 != 10) {
                return null;
            }
            var6 = ((long) (arg3 + 1) << 32) + (long) ((this.field944 << 6) + arg1);
            Model var8 = (Model) field982.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field945 == null) {
                return null;
            }
            boolean var9 = this.field966 ^ arg1 > 3;
            int var10 = this.field945.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field945[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field981.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method126(var12 & 0xFFFF, this.field934);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method141(498);
                    }
                    field981.method102((long) var12, true, var5);
                }
                if (var10 > 1) {
                    field943[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(var10, -550, field943);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field946.length; var14++) {
                if (this.field946[var14] == arg0) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg3 + 1) << 32) + (long) ((this.field944 << 6) + (var13 << 3) + arg1);
            Model var15 = (Model) field982.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field945[var13];
            boolean var17 = this.field966 ^ arg1 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field981.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method126(var16 & 0xFFFF, this.field934);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method141(498);
                }
                field981.method102((long) var16, true, var5);
            }
        }
        boolean var18;
        if (this.field968 == 128 && this.field969 == 128 && this.field970 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field971 == 0 && this.field972 == 0 && this.field973 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(var5, this.field949 == null, arg1 == 0 && arg3 == -1 && !var18 && !var19, AnimFrame.method48(arg3, -47594), 0);
        if (arg3 != -1) {
            var20.method133(0);
            var20.method134(428, arg3);
            var20.field570 = null;
            var20.field569 = null;
        }
        while (arg1-- > 0) {
            var20.method137(0);
        }
        if (this.field949 != null) {
            for (int var21 = 0; var21 < this.field949.length; var21++) {
                var20.method140(this.field949[var21], this.field950[var21]);
            }
        }
        if (var18) {
            var20.method142((byte) 4, this.field969, this.field970, this.field968);
        }
        if (var19) {
            var20.method139(this.field972, this.field973, this.field971, 216);
        }
        var20.method143(this.field961 + 64, this.field962 * 5 + 768, -50, -10, -50, !this.field957);
        if (!arg2) {
            throw new NullPointerException();
        }
        if (this.field977 == 1) {
            var20.field566 = var20.field393;
        }
        field982.method102(var6, true, var20);
        return var20;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)Lec;")
    public final LocType method338(byte arg0) {
        if (arg0 != 1) {
            this.field935 = !this.field935;
        }
        int var2 = -1;
        if (this.field979 != -1) {
            VarbitType var3 = VarbitType.field1172[this.field979];
            int var4 = var3.field1174;
            int var5 = var3.field1175;
            int var6 = var3.field1176;
            int var7 = client.field1349[var6 - var5];
            var2 = field937.field1359[var4] >> var5 & var7;
        } else if (this.field980 != -1) {
            var2 = field937.field1359[this.field980];
        }
        return var2 < 0 || var2 >= this.field978.length || this.field978[var2] == -1 ? null : method330(this.field978[var2]);
    }
}
