import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class LocType {

    @OriginalMember(owner = "fc", name = "a", descriptor = "Z")
    private boolean field948 = false;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    private boolean field950 = false;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    private int field957 = -1;

    @OriginalMember(owner = "fc", name = "i", descriptor = "[Leb;")
    private static Model[] field956 = new Model[4];

    @OriginalMember(owner = "fc", name = "R", descriptor = "Ls;")
    public static LruCache field991 = new LruCache(500, false);

    @OriginalMember(owner = "fc", name = "S", descriptor = "Ls;")
    public static LruCache field992 = new LruCache(30, false);

    @OriginalMember(owner = "fc", name = "A", descriptor = "B")
    private byte field974;

    @OriginalMember(owner = "fc", name = "B", descriptor = "B")
    private byte field975;

    @OriginalMember(owner = "fc", name = "b", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    private static int field951;

    @OriginalMember(owner = "fc", name = "h", descriptor = "I")
    private static int field955;

    @OriginalMember(owner = "fc", name = "q", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "fc", name = "r", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "fc", name = "y", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "fc", name = "z", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "fc", name = "D", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "fc", name = "E", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "fc", name = "H", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "fc", name = "I", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "fc", name = "J", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "fc", name = "K", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "fc", name = "L", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "fc", name = "M", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "fc", name = "N", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "fc", name = "Q", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "fc", name = "f", descriptor = "Lmb;")
    private static Packet field953;

    @OriginalMember(owner = "fc", name = "m", descriptor = "Ljava/lang/String;")
    public String field960;

    @OriginalMember(owner = "fc", name = "s", descriptor = "Z")
    public boolean field966;

    @OriginalMember(owner = "fc", name = "t", descriptor = "Z")
    public boolean field967;

    @OriginalMember(owner = "fc", name = "u", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "fc", name = "v", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "fc", name = "w", descriptor = "Z")
    private boolean field970;

    @OriginalMember(owner = "fc", name = "x", descriptor = "Z")
    public boolean field971;

    @OriginalMember(owner = "fc", name = "F", descriptor = "Z")
    private boolean field979;

    @OriginalMember(owner = "fc", name = "G", descriptor = "Z")
    public boolean field980;

    @OriginalMember(owner = "fc", name = "O", descriptor = "Z")
    public boolean field988;

    @OriginalMember(owner = "fc", name = "P", descriptor = "Z")
    public boolean field989;

    @OriginalMember(owner = "fc", name = "n", descriptor = "[B")
    public byte[] field961;

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    private static int[] field952;

    @OriginalMember(owner = "fc", name = "k", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "fc", name = "l", descriptor = "[I")
    private int[] field959;

    @OriginalMember(owner = "fc", name = "o", descriptor = "[I")
    private int[] field962;

    @OriginalMember(owner = "fc", name = "p", descriptor = "[I")
    private int[] field963;

    @OriginalMember(owner = "fc", name = "g", descriptor = "[Lfc;")
    private static LocType[] field954;

    @OriginalMember(owner = "fc", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field976;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Lyb;)V")
    public static final void method327(Jagfile arg0) {
        field953 = new Packet(arg0.method298("loc.dat", null), true);
        Packet var1 = new Packet(arg0.method298("loc.idx", null), true);
        field951 = var1.method230();
        field952 = new int[field951];
        int var2 = 2;
        for (int var3 = 0; var3 < field951; var3++) {
            field952[var3] = var2;
            var2 += var1.method230();
        }
        field954 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field954[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(I)V")
    public static final void method328(int arg0) {
        field991 = null;
        field992 = null;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field952 = null;
        field954 = null;
        field953 = null;
    }

    @OriginalMember(owner = "fc", name = "b", descriptor = "(I)Lfc;")
    public static final LocType method329(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field954[var1].field957 == arg0) {
                return field954[var1];
            }
        }
        field955 = (field955 + 1) % 10;
        LocType var2 = field954[field955];
        field953.field714 = field952[arg0];
        var2.field957 = arg0;
        var2.method330();
        var2.method331((byte) 44, field953);
        return var2;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "()V")
    private final void method330() {
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
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(BLmb;)V")
    private final void method331(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            throw new NullPointerException();
        }
        int var3 = -1;
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg1.method228();
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
                        var5 = arg1.method228();
                        break;
                    }
                    if (var4 == 2) {
                        this.field960 = arg1.method235();
                    } else if (var4 == 3) {
                        this.field961 = arg1.method236(4);
                    } else if (var4 == 5) {
                        int var7 = arg1.method228();
                        if (var7 > 0) {
                            this.field959 = null;
                            this.field958 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field958[var8] = arg1.method230();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field964 = arg1.method228();
                    } else if (var4 == 15) {
                        this.field965 = arg1.method228();
                    } else if (var4 == 17) {
                        this.field966 = false;
                    } else if (var4 == 18) {
                        this.field967 = false;
                    } else if (var4 == 19) {
                        var3 = arg1.method228();
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
                        this.field972 = arg1.method230();
                        if (this.field972 == 65535) {
                            this.field972 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field973 = arg1.method228();
                    } else if (var4 == 29) {
                        this.field974 = arg1.method229();
                    } else if (var4 == 39) {
                        this.field975 = arg1.method229();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field976 == null) {
                            this.field976 = new String[5];
                        }
                        this.field976[var4 - 30] = arg1.method235();
                        if (this.field976[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field976[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg1.method228();
                        this.field962 = new int[var9];
                        this.field963 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field962[var10] = arg1.method230();
                            this.field963[var10] = arg1.method230();
                        }
                    } else if (var4 == 60) {
                        this.field977 = arg1.method230();
                    } else if (var4 == 62) {
                        this.field979 = true;
                    } else if (var4 == 64) {
                        this.field980 = false;
                    } else if (var4 == 65) {
                        this.field981 = arg1.method230();
                    } else if (var4 == 66) {
                        this.field982 = arg1.method230();
                    } else if (var4 == 67) {
                        this.field983 = arg1.method230();
                    } else if (var4 == 68) {
                        this.field978 = arg1.method230();
                    } else if (var4 == 69) {
                        this.field987 = arg1.method228();
                    } else if (var4 == 70) {
                        this.field984 = arg1.method231();
                    } else if (var4 == 71) {
                        this.field985 = arg1.method231();
                    } else if (var4 == 72) {
                        this.field986 = arg1.method231();
                    } else if (var4 == 73) {
                        this.field988 = true;
                    } else if (var4 == 74) {
                        this.field989 = true;
                    } else if (var4 == 75) {
                        this.field990 = arg1.method228();
                    }
                }
            } while (var5 <= 0);
            this.field959 = new int[var5];
            this.field958 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field958[var6] = arg1.method230();
                this.field959[var6] = arg1.method228();
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(II)Z")
    public final boolean method332(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field959 != null) {
            for (int var6 = 0; var6 < this.field959.length; var6++) {
                if (this.field959[var6] == arg1) {
                    return Model.method126(this.field958[var6] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field958 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field958.length; var5++) {
                var4 &= Model.method126(this.field958[var5] & 0xFFFF);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Z)Z")
    public final boolean method333(boolean arg0) {
        if (this.field958 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field958.length; var3++) {
            var2 &= Model.method126(this.field958[var3] & 0xFFFF);
        }
        if (!arg0) {
            this.field950 = !this.field950;
        }
        return var2;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(ZLvb;)V")
    public final void method334(boolean arg0, OnDemand arg1) {
        if (this.field958 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field958.length; var3++) {
            arg1.method283(0, (byte) 3, this.field958[var3] & 0xFFFF);
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method336(arg1, arg0, arg6, 0);
        if (var8 == null) {
            return null;
        }
        if (this.field969 || this.field970) {
            var8 = new Model(this.field969, this.field970, var8, 144);
        }
        if (this.field969) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field540; var10++) {
                int var11 = var8.field541[var10];
                int var12 = var8.field543[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field542[var10] += var15 - var9;
            }
            var8.method130(true);
        }
        return var8;
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(IIII)Leb;")
    private final Model method336(int arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        if (arg3 < 0 || arg3 > 0) {
            this.field948 = !this.field948;
        }
        long var6;
        if (this.field959 == null) {
            if (arg1 != 10) {
                return null;
            }
            var6 = ((long) (arg2 + 1) << 32) + (long) ((this.field957 << 6) + arg0);
            Model var8 = (Model) field992.method101(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field958 == null) {
                return null;
            }
            boolean var9 = this.field979 ^ arg0 > 3;
            int var10 = this.field958.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field958[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field991.method101((long) var12);
                if (var5 == null) {
                    var5 = Model.method125(var12 & 0xFFFF, 196);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method140(false);
                    }
                    field991.method102(var5, (long) var12, true);
                }
                if (var10 > 1) {
                    field956[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(172, field956, var10);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field959.length; var14++) {
                if (this.field959[var14] == arg1) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg2 + 1) << 32) + (long) ((this.field957 << 6) + (var13 << 3) + arg0);
            Model var15 = (Model) field992.method101(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field958[var13];
            boolean var17 = this.field979 ^ arg0 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field991.method101((long) var16);
            if (var5 == null) {
                var5 = Model.method125(var16 & 0xFFFF, 196);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method140(false);
                }
                field991.method102(var5, (long) var16, true);
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
        Model var20 = new Model(arg0 == 0 && arg2 == -1 && !var18 && !var19, -164, var5, this.field962 == null, AnimFrame.method48(arg2, 62));
        if (arg2 != -1) {
            var20.method132(this.field949);
            var20.method133(-278, arg2);
            var20.field572 = null;
            var20.field571 = null;
        }
        while (arg0-- > 0) {
            var20.method136(-66);
        }
        if (this.field962 != null) {
            for (int var21 = 0; var21 < this.field962.length; var21++) {
                var20.method139(this.field962[var21], this.field963[var21]);
            }
        }
        if (var18) {
            var20.method141(this.field981, false, this.field983, this.field982);
        }
        if (var19) {
            var20.method138(this.field985, -34664, this.field984, this.field986);
        }
        var20.method142(this.field974 + 64, this.field975 * 5 + 768, -50, -10, -50, !this.field970);
        if (this.field990 == 1) {
            var20.field568 = var20.field397;
        }
        field992.method102(var20, var6, true);
        return var20;
    }
}
