import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field942 = -32952;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field943 = false;

    @OriginalMember(owner = "ec", name = "d", descriptor = "Z")
    private boolean field945 = false;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    private int field953 = -1;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[Leb;")
    private static Model[] field952 = new Model[4];

    @OriginalMember(owner = "ec", name = "T", descriptor = "Ls;")
    public static LruCache field987 = new LruCache(500, 0);

    @OriginalMember(owner = "ec", name = "U", descriptor = "Ls;")
    public static LruCache field988 = new LruCache(30, 0);

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field970;

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field971;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field947;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field951;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "ec", name = "S", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Llb;")
    private static Packet field949;

    @OriginalMember(owner = "ec", name = "o", descriptor = "Ljava/lang/String;")
    public String field956;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field962;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field963;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field964;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field965;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    private boolean field966;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field975;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field984;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field985;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[B")
    public byte[] field957;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field948;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field954;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field955;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field959;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field950;

    @OriginalMember(owner = "ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field972;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method323(Jagfile arg0) {
        field949 = new Packet(arg0.method294("loc.dat", null), (byte) 1);
        Packet var1 = new Packet(arg0.method294("loc.idx", null), (byte) 1);
        field947 = var1.method226();
        field948 = new int[field947];
        int var2 = 2;
        for (int var3 = 0; var3 < field947; var3++) {
            field948[var3] = var2;
            var2 += var1.method226();
        }
        field950 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field950[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method324(byte arg0) {
        field987 = null;
        field988 = null;
        field948 = null;
        field950 = null;
        field949 = null;
        if (arg0 == 1) {
            boolean var1 = false;
        } else {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method325(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field950[var1].field953 == arg0) {
                return field950[var1];
            }
        }
        field951 = (field951 + 1) % 10;
        LocType var2 = field950[field951];
        field949.field709 = field948[arg0];
        var2.field953 = arg0;
        var2.method326();
        var2.method327((byte) 2, field949);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method326() {
        this.field954 = null;
        this.field955 = null;
        this.field956 = null;
        this.field957 = null;
        this.field958 = null;
        this.field959 = null;
        this.field960 = 1;
        this.field961 = 1;
        this.field962 = true;
        this.field963 = true;
        this.field964 = false;
        this.field965 = false;
        this.field966 = false;
        this.field967 = false;
        this.field968 = -1;
        this.field969 = 16;
        this.field970 = 0;
        this.field971 = 0;
        this.field972 = null;
        this.field973 = -1;
        this.field974 = -1;
        this.field975 = false;
        this.field976 = true;
        this.field977 = 128;
        this.field978 = 128;
        this.field979 = 128;
        this.field983 = 0;
        this.field980 = 0;
        this.field981 = 0;
        this.field982 = 0;
        this.field984 = false;
        this.field985 = false;
        this.field986 = -1;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BLlb;)V")
    private final void method327(byte arg0, Packet arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field946 = -350;
        }
        int var4 = -1;
        while (true) {
            int var6;
            do {
                while (true) {
                    int var5 = arg1.method224();
                    if (var5 == 0) {
                        if (var4 == -1) {
                            this.field964 = false;
                            if (this.field954 != null && (this.field955 == null || this.field955[0] == 10)) {
                                this.field964 = true;
                            }
                            if (this.field972 != null) {
                                this.field964 = true;
                            }
                        }
                        if (this.field985) {
                            this.field962 = false;
                            this.field963 = false;
                        }
                        if (this.field986 == -1) {
                            this.field986 = this.field962 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var5 == 1) {
                        var6 = arg1.method224();
                        break;
                    }
                    if (var5 == 2) {
                        this.field956 = arg1.method231();
                    } else if (var5 == 3) {
                        this.field957 = arg1.method232(this.field942);
                    } else if (var5 == 5) {
                        int var8 = arg1.method224();
                        if (var8 > 0) {
                            this.field955 = null;
                            this.field954 = new int[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                this.field954[var9] = arg1.method226();
                            }
                        }
                    } else if (var5 == 14) {
                        this.field960 = arg1.method224();
                    } else if (var5 == 15) {
                        this.field961 = arg1.method224();
                    } else if (var5 == 17) {
                        this.field962 = false;
                    } else if (var5 == 18) {
                        this.field963 = false;
                    } else if (var5 == 19) {
                        var4 = arg1.method224();
                        if (var4 == 1) {
                            this.field964 = true;
                        }
                    } else if (var5 == 21) {
                        this.field965 = true;
                    } else if (var5 == 22) {
                        this.field966 = true;
                    } else if (var5 == 23) {
                        this.field967 = true;
                    } else if (var5 == 24) {
                        this.field968 = arg1.method226();
                        if (this.field968 == 65535) {
                            this.field968 = -1;
                        }
                    } else if (var5 == 28) {
                        this.field969 = arg1.method224();
                    } else if (var5 == 29) {
                        this.field970 = arg1.method225();
                    } else if (var5 == 39) {
                        this.field971 = arg1.method225();
                    } else if (var5 >= 30 && var5 < 39) {
                        if (this.field972 == null) {
                            this.field972 = new String[5];
                        }
                        this.field972[var5 - 30] = arg1.method231();
                        if (this.field972[var5 - 30].equalsIgnoreCase("hidden")) {
                            this.field972[var5 - 30] = null;
                        }
                    } else if (var5 == 40) {
                        int var10 = arg1.method224();
                        this.field958 = new int[var10];
                        this.field959 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field958[var11] = arg1.method226();
                            this.field959[var11] = arg1.method226();
                        }
                    } else if (var5 == 60) {
                        this.field973 = arg1.method226();
                    } else if (var5 == 62) {
                        this.field975 = true;
                    } else if (var5 == 64) {
                        this.field976 = false;
                    } else if (var5 == 65) {
                        this.field977 = arg1.method226();
                    } else if (var5 == 66) {
                        this.field978 = arg1.method226();
                    } else if (var5 == 67) {
                        this.field979 = arg1.method226();
                    } else if (var5 == 68) {
                        this.field974 = arg1.method226();
                    } else if (var5 == 69) {
                        this.field983 = arg1.method224();
                    } else if (var5 == 70) {
                        this.field980 = arg1.method227();
                    } else if (var5 == 71) {
                        this.field981 = arg1.method227();
                    } else if (var5 == 72) {
                        this.field982 = arg1.method227();
                    } else if (var5 == 73) {
                        this.field984 = true;
                    } else if (var5 == 74) {
                        this.field985 = true;
                    } else if (var5 == 75) {
                        this.field986 = arg1.method224();
                    }
                }
            } while (var6 <= 0);
            this.field955 = new int[var6];
            this.field954 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field954[var7] = arg1.method226();
                this.field955[var7] = arg1.method224();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method328(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field955 != null) {
            for (int var6 = 0; var6 < this.field955.length; var6++) {
                if (this.field955[var6] == arg1) {
                    return Model.method126(this.field954[var6] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field954 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field954.length; var5++) {
                var4 &= Model.method126(this.field954[var5] & 0xFFFF);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)Z")
    public final boolean method329(boolean arg0) {
        if (this.field954 == null) {
            return true;
        }
        boolean var2 = true;
        if (!arg0) {
            this.field944 = 308;
        }
        for (int var3 = 0; var3 < this.field954.length; var3++) {
            var2 &= Model.method126(this.field954[var3] & 0xFFFF);
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BLub;)V")
    public final void method330(byte arg0, OnDemand arg1) {
        if (this.field954 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field954.length; var3++) {
            arg1.method279(-21322, 0, this.field954[var3] & 0xFFFF);
        }
        if (arg0 != 0) {
            this.field945 = !this.field945;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method332(arg1, false, arg6, arg0);
        if (var8 == null) {
            return null;
        }
        if (this.field965 || this.field966) {
            var8 = new Model(this.field966, (byte) 72, var8, this.field965);
        }
        if (this.field965) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field536; var10++) {
                int var11 = var8.field537[var10];
                int var12 = var8.field539[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field538[var10] += var15 - var9;
            }
            var8.method130(368);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZII)Leb;")
    private final Model method332(int arg0, boolean arg1, int arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field955 == null) {
            if (arg3 != 10) {
                return null;
            }
            var6 = ((long) (arg2 + 1) << 32) + (long) ((this.field953 << 6) + arg0);
            Model var8 = (Model) field988.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field954 == null) {
                return null;
            }
            boolean var9 = this.field975 ^ arg0 > 3;
            int var10 = this.field954.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field954[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field987.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method125(var12 & 0xFFFF, 6);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method140(2);
                    }
                    field987.method102(201, (long) var12, var5);
                }
                if (var10 > 1) {
                    field952[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(var10, -643, field952);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field955.length; var14++) {
                if (this.field955[var14] == arg3) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg2 + 1) << 32) + (long) ((this.field953 << 6) + (var13 << 3) + arg0);
            Model var15 = (Model) field988.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field954[var13];
            boolean var17 = this.field975 ^ arg0 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field987.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method125(var16 & 0xFFFF, 6);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method140(2);
                }
                field987.method102(201, (long) var16, var5);
            }
        }
        boolean var18;
        if (this.field977 == 128 && this.field978 == 128 && this.field979 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field980 == 0 && this.field981 == 0 && this.field982 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(this.field958 == null, AnimFrame.method48(arg2, 0), var5, true, arg0 == 0 && arg2 == -1 && !var18 && !var19);
        if (arg2 != -1) {
            var20.method132(9);
            var20.method133(arg2, -284);
            var20.field568 = null;
            var20.field567 = null;
        }
        while (arg0-- > 0) {
            var20.method136((byte) 89);
        }
        if (this.field958 != null) {
            for (int var21 = 0; var21 < this.field958.length; var21++) {
                var20.method139(this.field958[var21], this.field959[var21]);
            }
        }
        if (var18) {
            var20.method141(9, this.field979, this.field977, this.field978);
        }
        if (var19) {
            var20.method138(this.field980, this.field981, (byte) 10, this.field982);
        }
        var20.method142(this.field970 + 64, this.field971 * 5 + 768, -50, -10, -50, !this.field966);
        if (this.field986 == 1) {
            var20.field564 = var20.field394;
        }
        field988.method102(201, var6, var20);
        if (arg1) {
            throw new NullPointerException();
        }
        return var20;
    }
}
