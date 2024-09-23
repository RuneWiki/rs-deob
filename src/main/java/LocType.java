import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field938 = 438;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private int field946 = -1;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private static int field939 = -747;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Leb;")
    private static Model[] field945 = new Model[4];

    @OriginalMember(owner = "ec", name = "R", descriptor = "Ls;")
    public static LruCache field980 = new LruCache(false, 500);

    @OriginalMember(owner = "ec", name = "S", descriptor = "Ls;")
    public static LruCache field981 = new LruCache(false, 30);

    @OriginalMember(owner = "ec", name = "A", descriptor = "B")
    private byte field963;

    @OriginalMember(owner = "ec", name = "B", descriptor = "B")
    private byte field964;

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private static int field940;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    private static int field944;

    @OriginalMember(owner = "ec", name = "q", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "ec", name = "y", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "ec", name = "z", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "ec", name = "D", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "ec", name = "E", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "ec", name = "f", descriptor = "Llb;")
    private static Packet field942;

    @OriginalMember(owner = "ec", name = "m", descriptor = "Ljava/lang/String;")
    public String field949;

    @OriginalMember(owner = "ec", name = "s", descriptor = "Z")
    public boolean field955;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field956;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field957;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field958;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    private boolean field959;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field960;

    @OriginalMember(owner = "ec", name = "F", descriptor = "Z")
    private boolean field968;

    @OriginalMember(owner = "ec", name = "G", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "ec", name = "O", descriptor = "Z")
    public boolean field977;

    @OriginalMember(owner = "ec", name = "P", descriptor = "Z")
    public boolean field978;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[B")
    public byte[] field950;

    @OriginalMember(owner = "ec", name = "e", descriptor = "[I")
    private static int[] field941;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[I")
    private int[] field947;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field948;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[I")
    private int[] field951;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field952;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[Lec;")
    private static LocType[] field943;

    @OriginalMember(owner = "ec", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field965;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method324(Jagfile arg0) {
        field942 = new Packet(arg0.method295("loc.dat", null), 185);
        Packet var1 = new Packet(arg0.method295("loc.idx", null), 185);
        field940 = var1.method227();
        field941 = new int[field940];
        int var2 = 2;
        for (int var3 = 0; var3 < field940; var3++) {
            field941[var3] = var2;
            var2 += var1.method227();
        }
        field943 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field943[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public static final void method325(int arg0) {
        field980 = null;
        field981 = null;
        if (arg0 != 0) {
            field939 = 290;
        }
        field941 = null;
        field943 = null;
        field942 = null;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Lec;")
    public static final LocType method326(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field943[var1].field946 == arg0) {
                return field943[var1];
            }
        }
        field944 = (field944 + 1) % 10;
        LocType var2 = field943[field944];
        field942.field708 = field941[arg0];
        var2.field946 = arg0;
        var2.method327();
        var2.method328(field942, (byte) 81);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method327() {
        this.field947 = null;
        this.field948 = null;
        this.field949 = null;
        this.field950 = null;
        this.field951 = null;
        this.field952 = null;
        this.field953 = 1;
        this.field954 = 1;
        this.field955 = true;
        this.field956 = true;
        this.field957 = false;
        this.field958 = false;
        this.field959 = false;
        this.field960 = false;
        this.field961 = -1;
        this.field962 = 16;
        this.field963 = 0;
        this.field964 = 0;
        this.field965 = null;
        this.field966 = -1;
        this.field967 = -1;
        this.field968 = false;
        this.field969 = true;
        this.field970 = 128;
        this.field971 = 128;
        this.field972 = 128;
        this.field976 = 0;
        this.field973 = 0;
        this.field974 = 0;
        this.field975 = 0;
        this.field977 = false;
        this.field978 = false;
        this.field979 = -1;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Llb;B)V")
    private final void method328(Packet arg0, byte arg1) {
        int var3 = -1;
        if (arg1 != 81) {
            throw new NullPointerException();
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg0.method225();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field957 = false;
                            if (this.field947 != null && (this.field948 == null || this.field948[0] == 10)) {
                                this.field957 = true;
                            }
                            if (this.field965 != null) {
                                this.field957 = true;
                            }
                        }
                        if (this.field978) {
                            this.field955 = false;
                            this.field956 = false;
                        }
                        if (this.field979 == -1) {
                            this.field979 = this.field955 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg0.method225();
                        break;
                    }
                    if (var4 == 2) {
                        this.field949 = arg0.method232();
                    } else if (var4 == 3) {
                        this.field950 = arg0.method233(986);
                    } else if (var4 == 5) {
                        int var7 = arg0.method225();
                        if (var7 > 0) {
                            this.field948 = null;
                            this.field947 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field947[var8] = arg0.method227();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field953 = arg0.method225();
                    } else if (var4 == 15) {
                        this.field954 = arg0.method225();
                    } else if (var4 == 17) {
                        this.field955 = false;
                    } else if (var4 == 18) {
                        this.field956 = false;
                    } else if (var4 == 19) {
                        var3 = arg0.method225();
                        if (var3 == 1) {
                            this.field957 = true;
                        }
                    } else if (var4 == 21) {
                        this.field958 = true;
                    } else if (var4 == 22) {
                        this.field959 = true;
                    } else if (var4 == 23) {
                        this.field960 = true;
                    } else if (var4 == 24) {
                        this.field961 = arg0.method227();
                        if (this.field961 == 65535) {
                            this.field961 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field962 = arg0.method225();
                    } else if (var4 == 29) {
                        this.field963 = arg0.method226();
                    } else if (var4 == 39) {
                        this.field964 = arg0.method226();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field965 == null) {
                            this.field965 = new String[5];
                        }
                        this.field965[var4 - 30] = arg0.method232();
                        if (this.field965[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field965[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg0.method225();
                        this.field951 = new int[var9];
                        this.field952 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field951[var10] = arg0.method227();
                            this.field952[var10] = arg0.method227();
                        }
                    } else if (var4 == 60) {
                        this.field966 = arg0.method227();
                    } else if (var4 == 62) {
                        this.field968 = true;
                    } else if (var4 == 64) {
                        this.field969 = false;
                    } else if (var4 == 65) {
                        this.field970 = arg0.method227();
                    } else if (var4 == 66) {
                        this.field971 = arg0.method227();
                    } else if (var4 == 67) {
                        this.field972 = arg0.method227();
                    } else if (var4 == 68) {
                        this.field967 = arg0.method227();
                    } else if (var4 == 69) {
                        this.field976 = arg0.method225();
                    } else if (var4 == 70) {
                        this.field973 = arg0.method228();
                    } else if (var4 == 71) {
                        this.field974 = arg0.method228();
                    } else if (var4 == 72) {
                        this.field975 = arg0.method228();
                    } else if (var4 == 73) {
                        this.field977 = true;
                    } else if (var4 == 74) {
                        this.field978 = true;
                    } else if (var4 == 75) {
                        this.field979 = arg0.method225();
                    }
                }
            } while (var5 <= 0);
            this.field948 = new int[var5];
            this.field947 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field947[var6] = arg0.method227();
                this.field948[var6] = arg0.method225();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZI)Z")
    public final boolean method329(boolean arg0, int arg1) {
        if (arg0) {
            field939 = 28;
        }
        if (this.field948 != null) {
            for (int var5 = 0; var5 < this.field948.length; var5++) {
                if (this.field948[var5] == arg1) {
                    return Model.method126(this.field947[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field947 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field947.length; var4++) {
                var3 &= Model.method126(this.field947[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)Z")
    public final boolean method330(int arg0) {
        if (this.field947 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field947.length; var3++) {
            var2 &= Model.method126(this.field947[var3] & 0xFFFF);
        }
        if (arg0 != 1) {
            field939 = 177;
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lub;I)V")
    public final void method331(OnDemand arg0, int arg1) {
        if (this.field947 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field947.length; var3++) {
            arg0.method280(false, 0, this.field947[var3] & 0xFFFF);
        }
        if (arg1 != -26443) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method333(402, arg6, arg1, arg0);
        if (var8 == null) {
            return null;
        }
        if (this.field958 || this.field959) {
            var8 = new Model(this.field959, var8, true, this.field958);
        }
        if (this.field958) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field538; var10++) {
                int var11 = var8.field539[var10];
                int var12 = var8.field541[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field540[var10] += var15 - var9;
            }
            var8.method130((byte) 109);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)Leb;")
    private final Model method333(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 44 / arg0;
        Model var6 = null;
        long var7;
        if (this.field948 == null) {
            if (arg3 != 10) {
                return null;
            }
            var7 = ((long) (arg1 + 1) << 32) + (long) ((this.field946 << 6) + arg2);
            Model var9 = (Model) field981.method101(var7);
            if (var9 != null) {
                return var9;
            }
            if (this.field947 == null) {
                return null;
            }
            boolean var10 = this.field968 ^ arg2 > 3;
            int var11 = this.field947.length;
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = this.field947[var12];
                if (var10) {
                    var13 += 65536;
                }
                var6 = (Model) field980.method101((long) var13);
                if (var6 == null) {
                    var6 = Model.method125(var13 & 0xFFFF, (byte) -104);
                    if (var6 == null) {
                        return null;
                    }
                    if (var10) {
                        var6.method140(this.field938);
                    }
                    field980.method102(400, var6, (long) var13);
                }
                if (var11 > 1) {
                    field945[var12] = var6;
                }
            }
            if (var11 > 1) {
                var6 = new Model((byte) 3, var11, field945);
            }
        } else {
            int var14 = -1;
            for (int var15 = 0; var15 < this.field948.length; var15++) {
                if (this.field948[var15] == arg3) {
                    var14 = var15;
                    break;
                }
            }
            if (var14 == -1) {
                return null;
            }
            var7 = ((long) (arg1 + 1) << 32) + (long) ((this.field946 << 6) + (var14 << 3) + arg2);
            Model var16 = (Model) field981.method101(var7);
            if (var16 != null) {
                return var16;
            }
            int var17 = this.field947[var14];
            boolean var18 = this.field968 ^ arg2 > 3;
            if (var18) {
                var17 += 65536;
            }
            var6 = (Model) field980.method101((long) var17);
            if (var6 == null) {
                var6 = Model.method125(var17 & 0xFFFF, (byte) -104);
                if (var6 == null) {
                    return null;
                }
                if (var18) {
                    var6.method140(this.field938);
                }
                field980.method102(400, var6, (long) var17);
            }
        }
        boolean var19;
        if (this.field970 == 128 && this.field971 == 128 && this.field972 == 128) {
            var19 = false;
        } else {
            var19 = true;
        }
        boolean var20;
        if (this.field973 == 0 && this.field974 == 0 && this.field975 == 0) {
            var20 = false;
        } else {
            var20 = true;
        }
        Model var21 = new Model(9, arg2 == 0 && arg1 == -1 && !var19 && !var20, AnimFrame.method48(this.field937, arg1), this.field951 == null, var6);
        if (arg1 != -1) {
            var21.method132(45941);
            var21.method133(3, arg1);
            var21.field570 = null;
            var21.field569 = null;
        }
        while (arg2-- > 0) {
            var21.method136(false);
        }
        if (this.field951 != null) {
            for (int var22 = 0; var22 < this.field951.length; var22++) {
                var21.method139(this.field951[var22], this.field952[var22]);
            }
        }
        if (var19) {
            var21.method141(this.field972, this.field970, (byte) 62, this.field971);
        }
        if (var20) {
            var21.method138(this.field973, this.field974, (byte) 25, this.field975);
        }
        var21.method142(this.field963 + 64, this.field964 * 5 + 768, -50, -10, -50, !this.field959);
        if (this.field979 == 1) {
            var21.field566 = var21.field393;
        }
        field981.method102(400, var21, var7);
        return var21;
    }
}
