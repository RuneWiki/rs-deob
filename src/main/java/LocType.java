import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field934 = 8;

    @OriginalMember(owner = "ec", name = "b", descriptor = "B")
    private byte field935 = 86;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field937 = 16146;

    @OriginalMember(owner = "ec", name = "k", descriptor = "I")
    private int field944 = -1;

    @OriginalMember(owner = "ec", name = "S", descriptor = "Lt;")
    public static LruCache field978 = new LruCache(500, (byte) 3);

    @OriginalMember(owner = "ec", name = "T", descriptor = "Lt;")
    public static LruCache field979 = new LruCache(30, (byte) 3);

    @OriginalMember(owner = "ec", name = "B", descriptor = "B")
    private byte field961;

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field962;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field939;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field943;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "ec", name = "z", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Lmb;")
    private static Packet field941;

    @OriginalMember(owner = "ec", name = "n", descriptor = "Ljava/lang/String;")
    public String field947;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    private static boolean field936;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Z")
    public static boolean field938;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field953;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field954;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field955;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    private boolean field956;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    private boolean field957;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    public boolean field958;

    @OriginalMember(owner = "ec", name = "E", descriptor = "Z")
    private boolean field964;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field967;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Z")
    public boolean field977;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[B")
    public byte[] field948;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field940;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field945;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field949;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field950;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field942;

    @OriginalMember(owner = "ec", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field963;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method331(Jagfile arg0) {
        field941 = new Packet(arg0.method308("loc.dat", null), false);
        Packet var1 = new Packet(arg0.method308("loc.idx", null), false);
        field939 = var1.method240();
        field940 = new int[field939];
        int var2 = 2;
        for (int var3 = 0; var3 < field939; var3++) {
            field940[var3] = var2;
            var2 += var1.method240();
        }
        field942 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field942[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method332(byte arg0) {
        field978 = null;
        field979 = null;
        field940 = null;
        if (arg0 == 6) {
            boolean var1 = false;
        }
        field942 = null;
        field941 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method333(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field942[var1].field944 == arg0) {
                return field942[var1];
            }
        }
        field943 = (field943 + 1) % 10;
        LocType var2 = field942[field943];
        field941.field713 = field940[arg0];
        var2.field944 = arg0;
        var2.method334();
        var2.method335(true, field941);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method334() {
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
        this.field964 = false;
        this.field965 = -1;
        this.field966 = -1;
        this.field967 = false;
        this.field968 = true;
        this.field969 = 128;
        this.field970 = 128;
        this.field971 = 128;
        this.field975 = 0;
        this.field972 = 0;
        this.field973 = 0;
        this.field974 = 0;
        this.field976 = false;
        this.field977 = false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZLmb;)V")
    private final void method335(boolean arg0, Packet arg1) {
        int var3 = -1;
        if (!arg0) {
            field936 = true;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    if (this.field946 == null) {
                        this.field946 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field955 = false;
                        if (this.field946.length > 0 && this.field946[0] == 10) {
                            this.field955 = true;
                        }
                        if (this.field963 != null) {
                            this.field955 = true;
                        }
                    }
                    if (this.field977) {
                        this.field953 = false;
                        this.field954 = false;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method238();
                    this.field946 = new int[var5];
                    this.field945 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field945[var6] = arg1.method240();
                        this.field946[var6] = arg1.method238();
                    }
                } else if (var4 == 2) {
                    this.field947 = arg1.method245();
                } else if (var4 == 3) {
                    this.field948 = arg1.method246(this.field934);
                } else if (var4 == 14) {
                    this.field951 = arg1.method238();
                } else if (var4 == 15) {
                    this.field952 = arg1.method238();
                } else if (var4 == 17) {
                    this.field953 = false;
                } else if (var4 == 18) {
                    this.field954 = false;
                } else if (var4 == 19) {
                    var3 = arg1.method238();
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
                    this.field959 = arg1.method240();
                    if (this.field959 == 65535) {
                        this.field959 = -1;
                    }
                } else if (var4 == 25) {
                    this.field964 = true;
                } else if (var4 == 28) {
                    this.field960 = arg1.method238();
                } else if (var4 == 29) {
                    this.field961 = arg1.method239();
                } else if (var4 == 39) {
                    this.field962 = arg1.method239();
                } else if (var4 >= 30 && var4 < 39) {
                    if (this.field963 == null) {
                        this.field963 = new String[5];
                    }
                    this.field963[var4 - 30] = arg1.method245();
                    if (this.field963[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field963[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method238();
                    this.field949 = new int[var7];
                    this.field950 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field949[var8] = arg1.method240();
                        this.field950[var8] = arg1.method240();
                    }
                } else if (var4 == 60) {
                    this.field965 = arg1.method240();
                } else if (var4 == 62) {
                    this.field967 = true;
                } else if (var4 == 64) {
                    this.field968 = false;
                } else if (var4 == 65) {
                    this.field969 = arg1.method240();
                } else if (var4 == 66) {
                    this.field970 = arg1.method240();
                } else if (var4 == 67) {
                    this.field971 = arg1.method240();
                } else if (var4 == 68) {
                    this.field966 = arg1.method240();
                } else if (var4 == 69) {
                    this.field975 = arg1.method238();
                } else if (var4 == 70) {
                    this.field972 = arg1.method241();
                } else if (var4 == 71) {
                    this.field973 = arg1.method241();
                } else if (var4 == 72) {
                    this.field974 = arg1.method241();
                } else if (var4 == 73) {
                    this.field976 = true;
                } else if (var4 == 74) {
                    this.field977 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IB)Z")
    public final boolean method336(int arg0, byte arg1) {
        int var3 = -1;
        for (int var4 = 0; var4 < this.field946.length; var4++) {
            if (this.field946[var4] == arg0) {
                var3 = var4;
                break;
            }
        }
        if (var3 == -1) {
            return true;
        } else if (this.field945 == null) {
            return true;
        } else {
            int var5 = this.field945[var3];
            if (arg1 != 39) {
                throw new NullPointerException();
            }
            return var5 == -1 ? true : Model.method139(var5 & 0xFFFF);
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(B)Z")
    public final boolean method337(byte arg0) {
        boolean var2 = true;
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            field936 = true;
        }
        if (this.field945 == null) {
            return true;
        }
        for (int var4 = 0; var4 < this.field945.length; var4++) {
            int var5 = this.field945[var4];
            if (var5 != -1) {
                var2 &= Model.method139(var5 & 0xFFFF);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lvb;I)V")
    public final void method338(OnDemand arg0, int arg1) {
        if (this.field937 != arg1 || this.field945 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field945.length; var3++) {
            int var4 = this.field945[var3];
            if (var4 != -1) {
                arg0.method293(-26459, var4 & 0xFFFF, 0);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field946.length; var9++) {
            if (this.field946[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field944 << 6) + (var8 << 3) + arg1);
        if (field938) {
            var10 = 0L;
        }
        Model var12 = (Model) field979.method114(var10);
        if (var12 == null) {
            if (this.field945 == null || var8 >= this.field945.length) {
                return null;
            }
            int var20 = this.field945[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field967 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field978.method114((long) var20);
            if (var22 == null) {
                var22 = Model.method138(var20 & 0xFFFF, -58);
                if (var22 == null) {
                    return null;
                }
                if (var21) {
                    var22.method153(626);
                }
                field978.method115(false, var22, (long) var20);
            }
            boolean var23;
            if (this.field969 == 128 && this.field970 == 128 && this.field971 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field972 == 0 && this.field973 == 0 && this.field974 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(this.field949 == null, var22, arg1 == 0 && arg6 == -1 && !var23 && !var24, true, !this.field964);
            if (arg6 != -1) {
                var25.method145(this.field935);
                var25.method146(true, arg6);
                var25.field582 = null;
                var25.field581 = null;
            }
            while (arg1-- > 0) {
                var25.method149((byte) 53);
            }
            if (this.field949 != null) {
                for (int var26 = 0; var26 < this.field949.length; var26++) {
                    var25.method152(this.field949[var26], this.field950[var26]);
                }
            }
            if (var23) {
                var25.method154(this.field969, this.field971, this.field970, 7);
            }
            if (var24) {
                var25.method151(this.field972, (byte) 3, this.field974, this.field973);
            }
            var25.method155(this.field961 + 64, this.field962 * 5 + 768, -50, -10, -50, !this.field957);
            if (this.field953) {
                var25.field578 = var25.field410;
            }
            field979.method115(false, var25, var10);
            if (this.field956 || this.field957) {
                var25 = new Model((byte) 22, this.field956, this.field957, var25);
            }
            if (this.field956) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field550; var28++) {
                    int var29 = var25.field551[var28];
                    int var30 = var25.field553[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field552[var28] += var33 - var27;
                }
                var25.method143((byte) -46);
            }
            return var25;
        } else if (field938) {
            return var12;
        } else {
            if (this.field956 || this.field957) {
                var12 = new Model((byte) 22, this.field956, this.field957, var12);
            }
            if (this.field956) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field550; var14++) {
                    int var15 = var12.field551[var14];
                    int var16 = var12.field553[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field552[var14] += var19 - var13;
                }
                var12.method143((byte) -46);
            }
            return var12;
        }
    }
}
