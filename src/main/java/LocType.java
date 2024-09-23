import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "b", descriptor = "B")
    private byte field960 = 0;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private boolean field961 = true;

    @OriginalMember(owner = "ec", name = "k", descriptor = "I")
    private int field969 = -1;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[Lfb;")
    private static Model[] field968 = new Model[4];

    @OriginalMember(owner = "ec", name = "S", descriptor = "Lt;")
    public static LruCache field1003 = new LruCache(0, 500);

    @OriginalMember(owner = "ec", name = "T", descriptor = "Lt;")
    public static LruCache field1004 = new LruCache(0, 30);

    @OriginalMember(owner = "ec", name = "B", descriptor = "B")
    private byte field986;

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field987;

    @OriginalMember(owner = "ec", name = "R", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "ec", name = "e", descriptor = "I")
    private static int field963;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    private static int field967;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "ec", name = "z", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "ec", name = "E", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "ec", name = "g", descriptor = "Lmb;")
    private static Packet field965;

    @OriginalMember(owner = "ec", name = "n", descriptor = "Ljava/lang/String;")
    public String field972;

    @OriginalMember(owner = "ec", name = "P", descriptor = "Z")
    public boolean field1000;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field1001;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field978;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field979;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field980;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    private boolean field981;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    private boolean field982;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    public boolean field983;

    @OriginalMember(owner = "ec", name = "G", descriptor = "Z")
    private boolean field991;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    public boolean field992;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[B")
    public byte[] field973;

    @OriginalMember(owner = "ec", name = "f", descriptor = "[I")
    private static int[] field964;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field970;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field971;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field974;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field975;

    @OriginalMember(owner = "ec", name = "h", descriptor = "[Lec;")
    private static LocType[] field966;

    @OriginalMember(owner = "ec", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field988;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method332(Jagfile arg0) {
        field965 = new Packet(45427, arg0.method309("loc.dat", null));
        Packet var1 = new Packet(45427, arg0.method309("loc.idx", null));
        field963 = var1.method241();
        field964 = new int[field963];
        int var2 = 2;
        for (int var3 = 0; var3 < field963; var3++) {
            field964[var3] = var2;
            var2 += var1.method241();
        }
        field966 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field966[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public static final void method333(boolean arg0) {
        field1003 = null;
        field1004 = null;
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field964 = null;
        field966 = null;
        field965 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method334(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field966[var1].field969 == arg0) {
                return field966[var1];
            }
        }
        field967 = (field967 + 1) % 10;
        LocType var2 = field966[field967];
        field965.field736 = field964[arg0];
        var2.field969 = arg0;
        var2.method335();
        var2.method336(field965, (byte) 66);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method335() {
        this.field970 = null;
        this.field971 = null;
        this.field972 = null;
        this.field973 = null;
        this.field974 = null;
        this.field975 = null;
        this.field976 = 1;
        this.field977 = 1;
        this.field978 = true;
        this.field979 = true;
        this.field980 = false;
        this.field981 = false;
        this.field982 = false;
        this.field983 = false;
        this.field984 = -1;
        this.field985 = 16;
        this.field986 = 0;
        this.field987 = 0;
        this.field988 = null;
        this.field989 = -1;
        this.field990 = -1;
        this.field991 = false;
        this.field992 = true;
        this.field993 = 128;
        this.field994 = 128;
        this.field995 = 128;
        this.field999 = 0;
        this.field996 = 0;
        this.field997 = 0;
        this.field998 = 0;
        this.field1000 = false;
        this.field1001 = false;
        this.field1002 = -1;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lmb;B)V")
    private final void method336(Packet arg0, byte arg1) {
        int var3 = -1;
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg0.method239();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field980 = false;
                            if (this.field970 != null && (this.field971 == null || this.field971[0] == 10)) {
                                this.field980 = true;
                            }
                            if (this.field988 != null) {
                                this.field980 = true;
                            }
                        }
                        if (this.field1001) {
                            this.field978 = false;
                            this.field979 = false;
                        }
                        if (this.field1002 == -1) {
                            this.field1002 = this.field978 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg0.method239();
                        break;
                    }
                    if (var4 == 2) {
                        this.field972 = arg0.method246();
                    } else if (var4 == 3) {
                        this.field973 = arg0.method247(true);
                    } else if (var4 == 5) {
                        int var7 = arg0.method239();
                        if (var7 > 0) {
                            this.field971 = null;
                            this.field970 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field970[var8] = arg0.method241();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field976 = arg0.method239();
                    } else if (var4 == 15) {
                        this.field977 = arg0.method239();
                    } else if (var4 == 17) {
                        this.field978 = false;
                    } else if (var4 == 18) {
                        this.field979 = false;
                    } else if (var4 == 19) {
                        var3 = arg0.method239();
                        if (var3 == 1) {
                            this.field980 = true;
                        }
                    } else if (var4 == 21) {
                        this.field981 = true;
                    } else if (var4 == 22) {
                        this.field982 = true;
                    } else if (var4 == 23) {
                        this.field983 = true;
                    } else if (var4 == 24) {
                        this.field984 = arg0.method241();
                        if (this.field984 == 65535) {
                            this.field984 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field985 = arg0.method239();
                    } else if (var4 == 29) {
                        this.field986 = arg0.method240();
                    } else if (var4 == 39) {
                        this.field987 = arg0.method240();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field988 == null) {
                            this.field988 = new String[5];
                        }
                        this.field988[var4 - 30] = arg0.method246();
                        if (this.field988[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field988[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg0.method239();
                        this.field974 = new int[var9];
                        this.field975 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field974[var10] = arg0.method241();
                            this.field975[var10] = arg0.method241();
                        }
                    } else if (var4 == 60) {
                        this.field989 = arg0.method241();
                    } else if (var4 == 62) {
                        this.field991 = true;
                    } else if (var4 == 64) {
                        this.field992 = false;
                    } else if (var4 == 65) {
                        this.field993 = arg0.method241();
                    } else if (var4 == 66) {
                        this.field994 = arg0.method241();
                    } else if (var4 == 67) {
                        this.field995 = arg0.method241();
                    } else if (var4 == 68) {
                        this.field990 = arg0.method241();
                    } else if (var4 == 69) {
                        this.field999 = arg0.method239();
                    } else if (var4 == 70) {
                        this.field996 = arg0.method242();
                    } else if (var4 == 71) {
                        this.field997 = arg0.method242();
                    } else if (var4 == 72) {
                        this.field998 = arg0.method242();
                    } else if (var4 == 73) {
                        this.field1000 = true;
                    } else if (var4 == 74) {
                        this.field1001 = true;
                    } else if (var4 == 75) {
                        this.field1002 = arg0.method239();
                    }
                }
            } while (var5 <= 0);
            this.field971 = new int[var5];
            this.field970 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field970[var6] = arg0.method241();
                this.field971[var6] = arg0.method239();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method337(int arg0, int arg1) {
        if (arg0 != 7332) {
            this.field959 = -55;
        }
        if (this.field971 != null) {
            for (int var5 = 0; var5 < this.field971.length; var5++) {
                if (this.field971[var5] == arg1) {
                    return Model.method140(this.field970[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field970 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field970.length; var4++) {
                var3 &= Model.method140(this.field970[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)Z")
    public final boolean method338(byte arg0) {
        if (this.field970 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 98) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field970.length; var3++) {
            var2 &= Model.method140(this.field970[var3] & 0xFFFF);
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lvb;I)V")
    public final void method339(OnDemand arg0, int arg1) {
        if (this.field970 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field970.length; var3++) {
            arg0.method294(this.field962, 0, this.field970[var3] & 0xFFFF);
        }
        if (arg1 != 30492) {
            this.field961 = !this.field961;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method341(true, arg0, arg6, arg1);
        if (var8 == null) {
            return null;
        }
        if (this.field981 || this.field982) {
            var8 = new Model(var8, this.field982, this.field981, 0);
        }
        if (this.field981) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field563; var10++) {
                int var11 = var8.field564[var10];
                int var12 = var8.field566[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field565[var10] += var15 - var9;
            }
            var8.method144(0);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZIII)Lfb;")
    private final Model method341(boolean arg0, int arg1, int arg2, int arg3) {
        Model var5 = null;
        long var6;
        if (this.field971 == null) {
            if (arg1 != 10) {
                return null;
            }
            var6 = ((long) (arg2 + 1) << 32) + (long) ((this.field969 << 6) + arg3);
            Model var8 = (Model) field1004.method115(var6);
            if (var8 != null) {
                return var8;
            }
            if (this.field970 == null) {
                return null;
            }
            boolean var9 = this.field991 ^ arg3 > 3;
            int var10 = this.field970.length;
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = this.field970[var11];
                if (var9) {
                    var12 += 65536;
                }
                var5 = (Model) field1003.method115((long) var12);
                if (var5 == null) {
                    var5 = Model.method139(0, var12 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var9) {
                        var5.method154(923);
                    }
                    field1003.method116(true, (long) var12, var5);
                }
                if (var10 > 1) {
                    field968[var11] = var5;
                }
            }
            if (var10 > 1) {
                var5 = new Model(var10, field968, -38792);
            }
        } else {
            int var13 = -1;
            for (int var14 = 0; var14 < this.field971.length; var14++) {
                if (this.field971[var14] == arg1) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == -1) {
                return null;
            }
            var6 = ((long) (arg2 + 1) << 32) + (long) ((this.field969 << 6) + (var13 << 3) + arg3);
            Model var15 = (Model) field1004.method115(var6);
            if (var15 != null) {
                return var15;
            }
            int var16 = this.field970[var13];
            boolean var17 = this.field991 ^ arg3 > 3;
            if (var17) {
                var16 += 65536;
            }
            var5 = (Model) field1003.method115((long) var16);
            if (var5 == null) {
                var5 = Model.method139(0, var16 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var17) {
                    var5.method154(923);
                }
                field1003.method116(true, (long) var16, var5);
            }
        }
        boolean var18;
        if (this.field993 == 128 && this.field994 == 128 && this.field995 == 128) {
            var18 = false;
        } else {
            var18 = true;
        }
        boolean var19;
        if (this.field996 == 0 && this.field997 == 0 && this.field998 == 0) {
            var19 = false;
        } else {
            var19 = true;
        }
        Model var20 = new Model(AnimFrame.method62((byte) 7, arg2), arg3 == 0 && arg2 == -1 && !var18 && !var19, this.field974 == null, true, var5);
        if (arg2 != -1) {
            var20.method146((byte) 107);
            var20.method147(this.field960, arg2);
            var20.field595 = null;
            var20.field594 = null;
        }
        while (arg3-- > 0) {
            var20.method150(880);
        }
        if (this.field974 != null) {
            for (int var21 = 0; var21 < this.field974.length; var21++) {
                var20.method153(this.field974[var21], this.field975[var21]);
            }
        }
        if (var18) {
            var20.method155(this.field995, this.field994, (byte) -121, this.field993);
        }
        if (var19) {
            var20.method152(this.field998, this.field996, this.field997, (byte) -20);
        }
        var20.method156(this.field986 + 64, this.field987 * 5 + 768, -50, -10, -50, !this.field982);
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field1002 == 1) {
            var20.field591 = var20.field422;
        }
        field1004.method116(true, var6, var20);
        return var20;
    }
}
