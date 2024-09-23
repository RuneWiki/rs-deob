import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field935 = 2;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field938 = 679;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Z")
    private boolean field939 = true;

    @OriginalMember(owner = "ec", name = "l", descriptor = "I")
    private int field946 = -1;

    @OriginalMember(owner = "ec", name = "S", descriptor = "Lt;")
    public static LruCache field979 = new LruCache(500, 1);

    @OriginalMember(owner = "ec", name = "T", descriptor = "Lt;")
    public static LruCache field980 = new LruCache(30, 1);

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field963;

    @OriginalMember(owner = "ec", name = "D", descriptor = "B")
    private byte field964;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    private static int field941;

    @OriginalMember(owner = "ec", name = "k", descriptor = "I")
    private static int field945;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "ec", name = "t", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "ec", name = "B", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "ec", name = "i", descriptor = "Lmb;")
    private static Packet field943;

    @OriginalMember(owner = "ec", name = "o", descriptor = "Ljava/lang/String;")
    public String field949;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private static boolean field936;

    @OriginalMember(owner = "ec", name = "f", descriptor = "Z")
    public static boolean field940;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field955;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field956;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field957;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    private boolean field958;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    private boolean field959;

    @OriginalMember(owner = "ec", name = "z", descriptor = "Z")
    public boolean field960;

    @OriginalMember(owner = "ec", name = "F", descriptor = "Z")
    public boolean field966;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    private boolean field969;

    @OriginalMember(owner = "ec", name = "J", descriptor = "Z")
    public boolean field970;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field978;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[B")
    public byte[] field950;

    @OriginalMember(owner = "ec", name = "h", descriptor = "[I")
    private static int[] field942;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field947;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field948;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field951;

    @OriginalMember(owner = "ec", name = "r", descriptor = "[I")
    private int[] field952;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[Lec;")
    private static LocType[] field944;

    @OriginalMember(owner = "ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field965;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method331(Jagfile arg0) {
        field943 = new Packet((byte) -109, arg0.method308("loc.dat", null));
        Packet var1 = new Packet((byte) -109, arg0.method308("loc.idx", null));
        field941 = var1.method240();
        field942 = new int[field941];
        int var2 = 2;
        for (int var3 = 0; var3 < field941; var3++) {
            field942[var3] = var2;
            var2 += var1.method240();
        }
        field944 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field944[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method332(byte arg0) {
        field979 = null;
        if (arg0 != 9) {
            field936 = !field936;
        }
        field980 = null;
        field942 = null;
        field944 = null;
        field943 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method333(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field944[var1].field946 == arg0) {
                return field944[var1];
            }
        }
        field945 = (field945 + 1) % 10;
        LocType var2 = field944[field945];
        field943.field719 = field942[arg0];
        var2.field946 = arg0;
        var2.method334();
        var2.method335(168, field943);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method334() {
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
        this.field966 = false;
        this.field967 = -1;
        this.field968 = -1;
        this.field969 = false;
        this.field970 = true;
        this.field971 = 128;
        this.field972 = 128;
        this.field973 = 128;
        this.field977 = 0;
        this.field974 = 0;
        this.field975 = 0;
        this.field976 = 0;
        this.field978 = false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILmb;)V")
    private final void method335(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            this.field939 = !this.field939;
        }
        int var3 = -1;
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    if (this.field948 == null) {
                        this.field948 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field957 = false;
                        if (this.field948.length > 0 && this.field948[0] == 10) {
                            this.field957 = true;
                        }
                        if (this.field965 != null) {
                            this.field957 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method238();
                    this.field948 = new int[var5];
                    this.field947 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field947[var6] = arg1.method240();
                        this.field948[var6] = arg1.method238();
                    }
                } else if (var4 == 2) {
                    this.field949 = arg1.method245();
                } else if (var4 == 3) {
                    this.field950 = arg1.method246(1);
                } else if (var4 == 14) {
                    this.field953 = arg1.method238();
                } else if (var4 == 15) {
                    this.field954 = arg1.method238();
                } else if (var4 == 17) {
                    this.field955 = false;
                } else if (var4 == 18) {
                    this.field956 = false;
                } else if (var4 == 19) {
                    var3 = arg1.method238();
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
                    this.field961 = arg1.method240();
                    if (this.field961 == 65535) {
                        this.field961 = -1;
                    }
                } else if (var4 == 25) {
                    this.field966 = true;
                } else if (var4 == 28) {
                    this.field962 = arg1.method238();
                } else if (var4 == 29) {
                    this.field963 = arg1.method239();
                } else if (var4 == 39) {
                    this.field964 = arg1.method239();
                } else if (var4 >= 30 && var4 < 39) {
                    if (this.field965 == null) {
                        this.field965 = new String[5];
                    }
                    this.field965[var4 - 30] = arg1.method245();
                    if (this.field965[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field965[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method238();
                    this.field951 = new int[var7];
                    this.field952 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field951[var8] = arg1.method240();
                        this.field952[var8] = arg1.method240();
                    }
                } else if (var4 == 60) {
                    this.field967 = arg1.method240();
                } else if (var4 == 62) {
                    this.field969 = true;
                } else if (var4 == 64) {
                    this.field970 = false;
                } else if (var4 == 65) {
                    this.field971 = arg1.method240();
                } else if (var4 == 66) {
                    this.field972 = arg1.method240();
                } else if (var4 == 67) {
                    this.field973 = arg1.method240();
                } else if (var4 == 68) {
                    this.field968 = arg1.method240();
                } else if (var4 == 69) {
                    this.field977 = arg1.method238();
                } else if (var4 == 70) {
                    this.field974 = arg1.method241();
                } else if (var4 == 71) {
                    this.field975 = arg1.method241();
                } else if (var4 == 72) {
                    this.field976 = arg1.method241();
                } else if (var4 == 73) {
                    this.field978 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)Z")
    public final boolean method336(int arg0, int arg1) {
        int var3 = -1;
        for (int var4 = 0; var4 < this.field948.length; var4++) {
            if (this.field948[var4] == arg1) {
                var3 = var4;
                break;
            }
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (var3 == -1) {
            return true;
        } else if (this.field947 == null) {
            return true;
        } else {
            int var5 = this.field947[var3];
            return var5 == -1 ? true : Model.method139(var5 & 0xFFFF);
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Z")
    public final boolean method337(int arg0) {
        boolean var2 = true;
        if (arg0 != 0) {
            this.field938 = -413;
        }
        if (this.field947 == null) {
            return true;
        }
        for (int var3 = 0; var3 < this.field947.length; var3++) {
            int var4 = this.field947[var3];
            if (var4 != -1) {
                var2 &= Model.method139(var4 & 0xFFFF);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILvb;)V")
    public final void method338(int arg0, OnDemand arg1) {
        while (arg0 >= 0) {
            this.field935 = -234;
        }
        if (this.field947 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field947.length; var3++) {
            int var4 = this.field947[var3];
            if (var4 != -1) {
                arg1.method293(0, var4 & 0xFFFF, -938);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field948.length; var9++) {
            if (this.field948[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field946 << 6) + (var8 << 3) + arg1);
        if (field940) {
            var10 = 0L;
        }
        Model var12 = (Model) field980.method114(var10);
        if (var12 == null) {
            if (this.field947 == null || var8 >= this.field947.length) {
                return null;
            }
            int var20 = this.field947[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field969 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field979.method114((long) var20);
            if (var22 == null) {
                var22 = Model.method138(var20 & 0xFFFF, -404);
                if (var22 == null) {
                    return null;
                }
                if (var21) {
                    var22.method153(4);
                }
                field979.method115(var22, (long) var20, 39399);
            }
            boolean var23;
            if (this.field971 == 128 && this.field972 == 128 && this.field973 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field974 == 0 && this.field975 == 0 && this.field976 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(var22, this.field951 == null, arg1 == 0 && arg6 == -1 && !var23 && !var24, !this.field966, -796);
            if (arg6 != -1) {
                var25.method145(-591);
                var25.method146(arg6, 13056);
                var25.field575 = null;
                var25.field574 = null;
            }
            while (arg1-- > 0) {
                var25.method149((byte) 3);
            }
            if (this.field951 != null) {
                for (int var26 = 0; var26 < this.field951.length; var26++) {
                    var25.method152(this.field951[var26], this.field952[var26]);
                }
            }
            if (var23) {
                var25.method154(this.field972, this.field973, 4, this.field971);
            }
            if (var24) {
                var25.method151(this.field975, this.field974, this.field976, false);
            }
            var25.method155(this.field963 + 64, this.field964 * 5 + 768, -50, -10, -50, !this.field959);
            if (this.field955) {
                var25.field571 = var25.field400;
            }
            field980.method115(var25, var10, 39399);
            if (this.field958 || this.field959) {
                var25 = new Model(this.field937, this.field959, this.field958, var25);
            }
            if (this.field958) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field543; var28++) {
                    int var29 = var25.field544[var28];
                    int var30 = var25.field546[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field545[var28] += var33 - var27;
                }
                var25.method143((byte) 6);
            }
            return var25;
        } else if (field940) {
            return var12;
        } else {
            if (this.field958 || this.field959) {
                var12 = new Model(this.field937, this.field959, this.field958, var12);
            }
            if (this.field958) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field543; var14++) {
                    int var15 = var12.field544[var14];
                    int var16 = var12.field546[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field545[var14] += var19 - var13;
                }
                var12.method143((byte) 6);
            }
            return var12;
        }
    }
}
