import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field938 = true;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field939 = true;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field940 = 4697;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field941 = 848;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Z")
    private boolean field942 = true;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    private int field949 = -1;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[Leb;")
    private static Model[] field948 = new Model[4];

    @OriginalMember(owner = "ec", name = "T", descriptor = "Ls;")
    public static LruCache field983 = new LruCache(500, 0);

    @OriginalMember(owner = "ec", name = "U", descriptor = "Ls;")
    public static LruCache field984 = new LruCache(30, 0);

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field966;

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field967;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field943;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field947;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "ec", name = "S", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Llb;")
    private static Packet field945;

    @OriginalMember(owner = "ec", name = "o", descriptor = "Ljava/lang/String;")
    public String field952;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field958;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field959;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field960;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field961;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    private boolean field962;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field963;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field971;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field980;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field981;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[B")
    public byte[] field953;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field944;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field950;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field951;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field954;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field955;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field946;

    @OriginalMember(owner = "ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field968;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lxb;)V")
    public static final void method323(Jagfile arg0) {
        field945 = new Packet((byte) 3, arg0.method294("loc.dat", null));
        Packet var1 = new Packet((byte) 3, arg0.method294("loc.idx", null));
        field943 = var1.method226();
        field944 = new int[field943];
        int var2 = 2;
        for (int var3 = 0; var3 < field943; var3++) {
            field944[var3] = var2;
            var2 += var1.method226();
        }
        field946 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field946[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method324(byte arg0) {
        if (arg0 != 5) {
            return;
        }
        field983 = null;
        field984 = null;
        field944 = null;
        field946 = null;
        field945 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method325(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field946[var1].field949 == arg0) {
                return field946[var1];
            }
        }
        field947 = (field947 + 1) % 10;
        LocType var2 = field946[field947];
        field945.field702 = field944[arg0];
        var2.field949 = arg0;
        var2.method326();
        var2.method327(field945, -32477);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method326() {
        this.field950 = null;
        this.field951 = null;
        this.field952 = null;
        this.field953 = null;
        this.field954 = null;
        this.field955 = null;
        this.field956 = 1;
        this.field957 = 1;
        this.field958 = true;
        this.field959 = true;
        this.field960 = false;
        this.field961 = false;
        this.field962 = false;
        this.field963 = false;
        this.field964 = -1;
        this.field965 = 16;
        this.field966 = 0;
        this.field967 = 0;
        this.field968 = null;
        this.field969 = -1;
        this.field970 = -1;
        this.field971 = false;
        this.field972 = true;
        this.field973 = 128;
        this.field974 = 128;
        this.field975 = 128;
        this.field979 = 0;
        this.field976 = 0;
        this.field977 = 0;
        this.field978 = 0;
        this.field980 = false;
        this.field981 = false;
        this.field982 = -1;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Llb;I)V")
    private final void method327(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            this.field938 = !this.field938;
        }
        int var3 = -1;
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg0.method224();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field960 = false;
                            if (this.field950 != null && (this.field951 == null || this.field951[0] == 10)) {
                                this.field960 = true;
                            }
                            if (this.field968 != null) {
                                this.field960 = true;
                            }
                        }
                        if (this.field981) {
                            this.field958 = false;
                            this.field959 = false;
                        }
                        if (this.field982 == -1) {
                            this.field982 = this.field958 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg0.method224();
                        break;
                    }
                    if (var4 == 2) {
                        this.field952 = arg0.method231();
                    } else if (var4 == 3) {
                        this.field953 = arg0.method232(-399);
                    } else if (var4 == 5) {
                        int var7 = arg0.method224();
                        if (var7 > 0) {
                            this.field951 = null;
                            this.field950 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field950[var8] = arg0.method226();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field956 = arg0.method224();
                    } else if (var4 == 15) {
                        this.field957 = arg0.method224();
                    } else if (var4 == 17) {
                        this.field958 = false;
                    } else if (var4 == 18) {
                        this.field959 = false;
                    } else if (var4 == 19) {
                        var3 = arg0.method224();
                        if (var3 == 1) {
                            this.field960 = true;
                        }
                    } else if (var4 == 21) {
                        this.field961 = true;
                    } else if (var4 == 22) {
                        this.field962 = true;
                    } else if (var4 == 23) {
                        this.field963 = true;
                    } else if (var4 == 24) {
                        this.field964 = arg0.method226();
                        if (this.field964 == 65535) {
                            this.field964 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field965 = arg0.method224();
                    } else if (var4 == 29) {
                        this.field966 = arg0.method225();
                    } else if (var4 == 39) {
                        this.field967 = arg0.method225();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field968 == null) {
                            this.field968 = new String[5];
                        }
                        this.field968[var4 - 30] = arg0.method231();
                        if (this.field968[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field968[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg0.method224();
                        this.field954 = new int[var9];
                        this.field955 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field954[var10] = arg0.method226();
                            this.field955[var10] = arg0.method226();
                        }
                    } else if (var4 == 60) {
                        this.field969 = arg0.method226();
                    } else if (var4 == 62) {
                        this.field971 = true;
                    } else if (var4 == 64) {
                        this.field972 = false;
                    } else if (var4 == 65) {
                        this.field973 = arg0.method226();
                    } else if (var4 == 66) {
                        this.field974 = arg0.method226();
                    } else if (var4 == 67) {
                        this.field975 = arg0.method226();
                    } else if (var4 == 68) {
                        this.field970 = arg0.method226();
                    } else if (var4 == 69) {
                        this.field979 = arg0.method224();
                    } else if (var4 == 70) {
                        this.field976 = arg0.method227();
                    } else if (var4 == 71) {
                        this.field977 = arg0.method227();
                    } else if (var4 == 72) {
                        this.field978 = arg0.method227();
                    } else if (var4 == 73) {
                        this.field980 = true;
                    } else if (var4 == 74) {
                        this.field981 = true;
                    } else if (var4 == 75) {
                        this.field982 = arg0.method224();
                    }
                }
            } while (var5 <= 0);
            this.field951 = new int[var5];
            this.field950 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field950[var6] = arg0.method226();
                this.field951[var6] = arg0.method224();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BI)Z")
    public final boolean method328(byte arg0, int arg1) {
        if (arg0 != 3) {
            this.field942 = !this.field942;
        }
        if (this.field951 != null) {
            for (int var5 = 0; var5 < this.field951.length; var5++) {
                if (this.field951[var5] == arg1) {
                    return Model.method126(this.field950[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field950 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field950.length; var4++) {
                var3 &= Model.method126(this.field950[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Z")
    public final boolean method329(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        } else if (this.field950 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field950.length; var3++) {
                var2 &= Model.method126(this.field950[var3] & 0xFFFF);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILub;)V")
    public final void method330(int arg0, OnDemand arg1) {
        if (arg0 == 8 && this.field950 != null) {
            for (int var3 = 0; var3 < this.field950.length; var3++) {
                arg1.method279(0, this.field950[var3] & 0xFFFF, false);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method332(arg0, arg1, 913, arg6);
        if (var8 == null) {
            return null;
        }
        if (this.field961 || this.field962) {
            var8 = new Model(-638, this.field962, var8, this.field961);
        }
        if (this.field961) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field532; var10++) {
                int var11 = var8.field533[var10];
                int var12 = var8.field535[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field534[var10] += var15 - var9;
            }
            var8.method130(true);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)Leb;")
    private final Model method332(int arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        if (arg2 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        long var7;
        if (this.field951 == null) {
            if (arg0 != 10) {
                return null;
            }
            var7 = ((long) (arg3 + 1) << 32) + (long) ((this.field949 << 6) + arg1);
            Model var9 = (Model) field984.method101(var7);
            if (var9 != null) {
                return var9;
            }
            if (this.field950 == null) {
                return null;
            }
            boolean var10 = this.field971 ^ arg1 > 3;
            int var11 = this.field950.length;
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = this.field950[var12];
                if (var10) {
                    var13 += 65536;
                }
                var5 = (Model) field983.method101((long) var13);
                if (var5 == null) {
                    var5 = Model.method125(this.field939, var13 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var10) {
                        var5.method140(5);
                    }
                    field983.method102((long) var13, var5, this.field941);
                }
                if (var11 > 1) {
                    field948[var12] = var5;
                }
            }
            if (var11 > 1) {
                var5 = new Model(var11, field948, this.field940);
            }
        } else {
            int var14 = -1;
            for (int var15 = 0; var15 < this.field951.length; var15++) {
                if (this.field951[var15] == arg0) {
                    var14 = var15;
                    break;
                }
            }
            if (var14 == -1) {
                return null;
            }
            var7 = ((long) (arg3 + 1) << 32) + (long) ((this.field949 << 6) + (var14 << 3) + arg1);
            Model var16 = (Model) field984.method101(var7);
            if (var16 != null) {
                return var16;
            }
            int var17 = this.field950[var14];
            boolean var18 = this.field971 ^ arg1 > 3;
            if (var18) {
                var17 += 65536;
            }
            var5 = (Model) field983.method101((long) var17);
            if (var5 == null) {
                var5 = Model.method125(this.field939, var17 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var18) {
                    var5.method140(5);
                }
                field983.method102((long) var17, var5, this.field941);
            }
        }
        boolean var19;
        if (this.field973 == 128 && this.field974 == 128 && this.field975 == 128) {
            var19 = false;
        } else {
            var19 = true;
        }
        boolean var20;
        if (this.field976 == 0 && this.field977 == 0 && this.field978 == 0) {
            var20 = false;
        } else {
            var20 = true;
        }
        Model var21 = new Model(arg1 == 0 && arg3 == -1 && !var19 && !var20, this.field954 == null, var5, AnimFrame.method48(arg3, 681), 9);
        if (arg3 != -1) {
            var21.method132(1);
            var21.method133(arg3, false);
            var21.field564 = null;
            var21.field563 = null;
        }
        while (arg1-- > 0) {
            var21.method136((byte) 4);
        }
        if (this.field954 != null) {
            for (int var22 = 0; var22 < this.field954.length; var22++) {
                var21.method139(this.field954[var22], this.field955[var22]);
            }
        }
        if (var19) {
            var21.method141(this.field975, this.field974, 9, this.field973);
        }
        if (var20) {
            var21.method138(this.field976, this.field977, this.field978, -97);
        }
        var21.method142(this.field966 + 64, this.field967 * 5 + 768, -50, -10, -50, !this.field962);
        if (this.field982 == 1) {
            var21.field560 = var21.field389;
        }
        field984.method102(var7, var21, this.field941);
        return var21;
    }
}
