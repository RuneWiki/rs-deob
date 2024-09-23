import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field931 = true;

    @OriginalMember(owner = "ec", name = "b", descriptor = "B")
    private byte field932 = 67;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field933 = -27210;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private int field940 = -1;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lfb;")
    private static Model[] field939 = new Model[4];

    @OriginalMember(owner = "ec", name = "R", descriptor = "Lt;")
    public static LruCache field974 = new LruCache(500, 0);

    @OriginalMember(owner = "ec", name = "S", descriptor = "Lt;")
    public static LruCache field975 = new LruCache(30, 0);

    @OriginalMember(owner = "ec", name = "A", descriptor = "B")
    private byte field957;

    @OriginalMember(owner = "ec", name = "B", descriptor = "B")
    private byte field958;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private static int field934;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    private static int field938;

    @OriginalMember(owner = "ec", name = "q", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "ec", name = "y", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "ec", name = "z", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "ec", name = "D", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "ec", name = "E", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "ec", name = "f", descriptor = "Lmb;")
    private static Packet field936;

    @OriginalMember(owner = "ec", name = "m", descriptor = "Ljava/lang/String;")
    public String field943;

    @OriginalMember(owner = "ec", name = "s", descriptor = "Z")
    public boolean field949;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field950;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field951;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    private boolean field952;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    private boolean field953;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    public boolean field954;

    @OriginalMember(owner = "ec", name = "F", descriptor = "Z")
    private boolean field962;

    @OriginalMember(owner = "ec", name = "G", descriptor = "Z")
    public boolean field963;

    @OriginalMember(owner = "ec", name = "O", descriptor = "Z")
    public boolean field971;

    @OriginalMember(owner = "ec", name = "P", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[B")
    public byte[] field944;

    @OriginalMember(owner = "ec", name = "e", descriptor = "[I")
    private static int[] field935;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[I")
    private int[] field941;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field942;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[I")
    private int[] field945;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[Lec;")
    private static LocType[] field937;

    @OriginalMember(owner = "ec", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field959;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method332(Jagfile arg0) {
        field936 = new Packet(16, arg0.method309("loc.dat", null));
        Packet var1 = new Packet(16, arg0.method309("loc.idx", null));
        field934 = var1.method241();
        field935 = new int[field934];
        int var2 = 2;
        for (int var3 = 0; var3 < field934; var3++) {
            field935[var3] = var2;
            var2 += var1.method241();
        }
        field937 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field937[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public static final void method333(boolean arg0) {
        if (arg0) {
            return;
        }
        field974 = null;
        field975 = null;
        field935 = null;
        field937 = null;
        field936 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method334(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field937[var1].field940 == arg0) {
                return field937[var1];
            }
        }
        field938 = (field938 + 1) % 10;
        LocType var2 = field937[field938];
        field936.field717 = field935[arg0];
        var2.field940 = arg0;
        var2.method335();
        var2.method336(891, field936);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method335() {
        this.field941 = null;
        this.field942 = null;
        this.field943 = null;
        this.field944 = null;
        this.field945 = null;
        this.field946 = null;
        this.field947 = 1;
        this.field948 = 1;
        this.field949 = true;
        this.field950 = true;
        this.field951 = false;
        this.field952 = false;
        this.field953 = false;
        this.field954 = false;
        this.field955 = -1;
        this.field956 = 16;
        this.field957 = 0;
        this.field958 = 0;
        this.field959 = null;
        this.field960 = -1;
        this.field961 = -1;
        this.field962 = false;
        this.field963 = true;
        this.field964 = 128;
        this.field965 = 128;
        this.field966 = 128;
        this.field970 = 0;
        this.field967 = 0;
        this.field968 = 0;
        this.field969 = 0;
        this.field971 = false;
        this.field972 = false;
        this.field973 = -1;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILmb;)V")
    private final void method336(int arg0, Packet arg1) {
        int var3 = -1;
        int var4 = 80 / arg0;
        while (true) {
            int var6;
            do {
                while (true) {
                    int var5 = arg1.method239();
                    if (var5 == 0) {
                        if (var3 == -1) {
                            this.field951 = false;
                            if (this.field941 != null && (this.field942 == null || this.field942[0] == 10)) {
                                this.field951 = true;
                            }
                            if (this.field959 != null) {
                                this.field951 = true;
                            }
                        }
                        if (this.field972) {
                            this.field949 = false;
                            this.field950 = false;
                        }
                        if (this.field973 == -1) {
                            this.field973 = this.field949 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var5 == 1) {
                        var6 = arg1.method239();
                        break;
                    }
                    if (var5 == 2) {
                        this.field943 = arg1.method246();
                    } else if (var5 == 3) {
                        this.field944 = arg1.method247(-34736);
                    } else if (var5 == 5) {
                        int var8 = arg1.method239();
                        if (var8 > 0) {
                            this.field942 = null;
                            this.field941 = new int[var8];
                            for (int var9 = 0; var9 < var8; var9++) {
                                this.field941[var9] = arg1.method241();
                            }
                        }
                    } else if (var5 == 14) {
                        this.field947 = arg1.method239();
                    } else if (var5 == 15) {
                        this.field948 = arg1.method239();
                    } else if (var5 == 17) {
                        this.field949 = false;
                    } else if (var5 == 18) {
                        this.field950 = false;
                    } else if (var5 == 19) {
                        var3 = arg1.method239();
                        if (var3 == 1) {
                            this.field951 = true;
                        }
                    } else if (var5 == 21) {
                        this.field952 = true;
                    } else if (var5 == 22) {
                        this.field953 = true;
                    } else if (var5 == 23) {
                        this.field954 = true;
                    } else if (var5 == 24) {
                        this.field955 = arg1.method241();
                        if (this.field955 == 65535) {
                            this.field955 = -1;
                        }
                    } else if (var5 == 28) {
                        this.field956 = arg1.method239();
                    } else if (var5 == 29) {
                        this.field957 = arg1.method240();
                    } else if (var5 == 39) {
                        this.field958 = arg1.method240();
                    } else if (var5 >= 30 && var5 < 39) {
                        if (this.field959 == null) {
                            this.field959 = new String[5];
                        }
                        this.field959[var5 - 30] = arg1.method246();
                        if (this.field959[var5 - 30].equalsIgnoreCase("hidden")) {
                            this.field959[var5 - 30] = null;
                        }
                    } else if (var5 == 40) {
                        int var10 = arg1.method239();
                        this.field945 = new int[var10];
                        this.field946 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field945[var11] = arg1.method241();
                            this.field946[var11] = arg1.method241();
                        }
                    } else if (var5 == 60) {
                        this.field960 = arg1.method241();
                    } else if (var5 == 62) {
                        this.field962 = true;
                    } else if (var5 == 64) {
                        this.field963 = false;
                    } else if (var5 == 65) {
                        this.field964 = arg1.method241();
                    } else if (var5 == 66) {
                        this.field965 = arg1.method241();
                    } else if (var5 == 67) {
                        this.field966 = arg1.method241();
                    } else if (var5 == 68) {
                        this.field961 = arg1.method241();
                    } else if (var5 == 69) {
                        this.field970 = arg1.method239();
                    } else if (var5 == 70) {
                        this.field967 = arg1.method242();
                    } else if (var5 == 71) {
                        this.field968 = arg1.method242();
                    } else if (var5 == 72) {
                        this.field969 = arg1.method242();
                    } else if (var5 == 73) {
                        this.field971 = true;
                    } else if (var5 == 74) {
                        this.field972 = true;
                    } else if (var5 == 75) {
                        this.field973 = arg1.method239();
                    }
                }
            } while (var6 <= 0);
            this.field942 = new int[var6];
            this.field941 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field941[var7] = arg1.method241();
                this.field942[var7] = arg1.method239();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZI)Z")
    public final boolean method337(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field942 != null) {
            for (int var5 = 0; var5 < this.field942.length; var5++) {
                if (this.field942[var5] == arg1) {
                    return Model.method140(this.field941[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field941 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field941.length; var4++) {
                var3 &= Model.method140(this.field941[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        int var2 = 89 / arg0;
        if (this.field941 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field941.length; var4++) {
            var3 &= Model.method140(this.field941[var4] & 0xFFFF);
        }
        return var3;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lvb;Z)V")
    public final void method339(OnDemand arg0, boolean arg1) {
        if (this.field941 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field941.length; var3++) {
            arg0.method294((byte) 70, this.field941[var3] & 0xFFFF, 0);
        }
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method341(arg1, arg0, -619, arg6);
        if (var8 == null) {
            return null;
        }
        if (this.field952 || this.field953) {
            var8 = new Model(var8, this.field952, 294, this.field953);
        }
        if (this.field952) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field545; var10++) {
                int var11 = var8.field546[var10];
                int var12 = var8.field548[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field547[var10] += var15 - var9;
            }
            var8.method144((byte) 6);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIII)Lfb;")
    private final Model method341(int arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        if (arg2 >= 0) {
            this.field933 = 241;
        }
        long var6;
        if (this.field942 == null) {
            if (arg1 != 10) {
                return null;
            }
            var6 = ((long) (arg3 + 1) << 32) + (long) ((this.field940 << 6) + arg0);
            Model var8 = (Model) field975.method115(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field941 == null) {
                return null;
            }
            boolean var9 = this.field962 ^ arg0 > 3;
            int var10 = this.field941.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field941[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field974.method115((long) var12);
                if (var5 == null) {
                    var5 = Model.method139(this.field931, var12 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method154((byte) 0);
                    }
                    field974.method116(var5, (long) var12, this.field932);
                }
                if (var10 > 1) {
                    field939[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(field939, var10, (byte) 2);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field942.length; var14++) {
                if (this.field942[var14] == arg1) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg3 + 1) << 32) + (long) ((this.field940 << 6) + (var13 << 3) + arg0);
            Model var15 = (Model) field975.method115(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field941[var13];
            boolean var17 = this.field962 ^ arg0 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field974.method115((long) var16);
            if (var5 == null) {
                var5 = Model.method139(this.field931, var16 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method154((byte) 0);
                }
                field974.method116(var5, (long) var16, this.field932);
            }
        }
        boolean var18;
        if (this.field964 == 128 && this.field965 == 128 && this.field966 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field967 == 0 && this.field968 == 0 && this.field969 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(AnimFrame.method62((byte) 17, arg3), var5, this.field945 == null, 0, arg0 == 0 && arg3 == -1 && !var18 && !var19);
        if (arg3 != -1) {
            var20.method146(0);
            var20.method147((byte) 2, arg3);
            var20.field577 = null;
            var20.field576 = null;
        }
        while (arg0-- > 0) {
            var20.method150(28280);
        }
        if (this.field945 != null) {
            for (int var21 = 0; var21 < this.field945.length; var21++) {
                var20.method153(this.field945[var21], this.field946[var21]);
            }
        }
        if (var18) {
            var20.method155(this.field964, (byte) 9, this.field966, this.field965);
        }
        if (var19) {
            var20.method152(false, this.field967, this.field969, this.field968);
        }
        var20.method156(this.field957 + 64, this.field958 * 5 + 768, -50, -10, -50, !this.field953);
        if (this.field973 == 1) {
            var20.field573 = var20.field406;
        }
        field975.method116(var20, var6, this.field932);
        return var20;
    }
}
