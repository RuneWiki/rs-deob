import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "B")
    private byte field926 = 8;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field927 = false;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    private int field934 = -1;

    @OriginalMember(owner = "ec", name = "h", descriptor = "[Lfb;")
    private static Model[] field933 = new Model[4];

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Lt;")
    public static LruCache field968 = new LruCache((byte) 3, 500);

    @OriginalMember(owner = "ec", name = "R", descriptor = "Lt;")
    public static LruCache field969 = new LruCache((byte) 3, 30);

    @OriginalMember(owner = "ec", name = "z", descriptor = "B")
    private byte field951;

    @OriginalMember(owner = "ec", name = "A", descriptor = "B")
    private byte field952;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private static int field928;

    @OriginalMember(owner = "ec", name = "g", descriptor = "I")
    private static int field932;

    @OriginalMember(owner = "ec", name = "p", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "ec", name = "q", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "ec", name = "x", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "ec", name = "y", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "ec", name = "C", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "ec", name = "D", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Lmb;")
    private static Packet field930;

    @OriginalMember(owner = "ec", name = "l", descriptor = "Ljava/lang/String;")
    public String field937;

    @OriginalMember(owner = "ec", name = "r", descriptor = "Z")
    public boolean field943;

    @OriginalMember(owner = "ec", name = "s", descriptor = "Z")
    public boolean field944;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field945;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    private boolean field946;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    private boolean field947;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field948;

    @OriginalMember(owner = "ec", name = "E", descriptor = "Z")
    private boolean field956;

    @OriginalMember(owner = "ec", name = "F", descriptor = "Z")
    public boolean field957;

    @OriginalMember(owner = "ec", name = "N", descriptor = "Z")
    public boolean field965;

    @OriginalMember(owner = "ec", name = "O", descriptor = "Z")
    public boolean field966;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[B")
    public byte[] field938;

    @OriginalMember(owner = "ec", name = "d", descriptor = "[I")
    private static int[] field929;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[I")
    private int[] field935;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[I")
    private int[] field936;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field939;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[I")
    private int[] field940;

    @OriginalMember(owner = "ec", name = "f", descriptor = "[Lec;")
    private static LocType[] field931;

    @OriginalMember(owner = "ec", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field953;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method332(Jagfile arg0) {
        field930 = new Packet(arg0.method309("loc.dat", null), (byte) 3);
        Packet var1 = new Packet(arg0.method309("loc.idx", null), (byte) 3);
        field928 = var1.method241();
        field929 = new int[field928];
        int var2 = 2;
        for (int var3 = 0; var3 < field928; var3++) {
            field929[var3] = var2;
            var2 += var1.method241();
        }
        field931 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field931[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)V")
    public static final void method333(int arg0) {
        field968 = null;
        field969 = null;
        int var1 = 44 / arg0;
        field929 = null;
        field931 = null;
        field930 = null;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Lec;")
    public static final LocType method334(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field931[var1].field934 == arg0) {
                return field931[var1];
            }
        }
        field932 = (field932 + 1) % 10;
        LocType var2 = field931[field932];
        field930.field711 = field929[arg0];
        var2.field934 = arg0;
        var2.method335();
        var2.method336(9, field930);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method335() {
        this.field935 = null;
        this.field936 = null;
        this.field937 = null;
        this.field938 = null;
        this.field939 = null;
        this.field940 = null;
        this.field941 = 1;
        this.field942 = 1;
        this.field943 = true;
        this.field944 = true;
        this.field945 = false;
        this.field946 = false;
        this.field947 = false;
        this.field948 = false;
        this.field949 = -1;
        this.field950 = 16;
        this.field951 = 0;
        this.field952 = 0;
        this.field953 = null;
        this.field954 = -1;
        this.field955 = -1;
        this.field956 = false;
        this.field957 = true;
        this.field958 = 128;
        this.field959 = 128;
        this.field960 = 128;
        this.field964 = 0;
        this.field961 = 0;
        this.field962 = 0;
        this.field963 = 0;
        this.field965 = false;
        this.field966 = false;
        this.field967 = -1;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILmb;)V")
    private final void method336(int arg0, Packet arg1) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        int var3 = -1;
        while (true) {
            int var5;
            do {
                while (true) {
                    int var4 = arg1.method239();
                    if (var4 == 0) {
                        if (var3 == -1) {
                            this.field945 = false;
                            if (this.field935 != null && (this.field936 == null || this.field936[0] == 10)) {
                                this.field945 = true;
                            }
                            if (this.field953 != null) {
                                this.field945 = true;
                            }
                        }
                        if (this.field966) {
                            this.field943 = false;
                            this.field944 = false;
                        }
                        if (this.field967 == -1) {
                            this.field967 = this.field943 ? 1 : 0;
                            return;
                        }
                        return;
                    }
                    if (var4 == 1) {
                        var5 = arg1.method239();
                        break;
                    }
                    if (var4 == 2) {
                        this.field937 = arg1.method246();
                    } else if (var4 == 3) {
                        this.field938 = arg1.method247((byte) 3);
                    } else if (var4 == 5) {
                        int var7 = arg1.method239();
                        if (var7 > 0) {
                            this.field936 = null;
                            this.field935 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                this.field935[var8] = arg1.method241();
                            }
                        }
                    } else if (var4 == 14) {
                        this.field941 = arg1.method239();
                    } else if (var4 == 15) {
                        this.field942 = arg1.method239();
                    } else if (var4 == 17) {
                        this.field943 = false;
                    } else if (var4 == 18) {
                        this.field944 = false;
                    } else if (var4 == 19) {
                        var3 = arg1.method239();
                        if (var3 == 1) {
                            this.field945 = true;
                        }
                    } else if (var4 == 21) {
                        this.field946 = true;
                    } else if (var4 == 22) {
                        this.field947 = true;
                    } else if (var4 == 23) {
                        this.field948 = true;
                    } else if (var4 == 24) {
                        this.field949 = arg1.method241();
                        if (this.field949 == 65535) {
                            this.field949 = -1;
                        }
                    } else if (var4 == 28) {
                        this.field950 = arg1.method239();
                    } else if (var4 == 29) {
                        this.field951 = arg1.method240();
                    } else if (var4 == 39) {
                        this.field952 = arg1.method240();
                    } else if (var4 >= 30 && var4 < 39) {
                        if (this.field953 == null) {
                            this.field953 = new String[5];
                        }
                        this.field953[var4 - 30] = arg1.method246();
                        if (this.field953[var4 - 30].equalsIgnoreCase("hidden")) {
                            this.field953[var4 - 30] = null;
                        }
                    } else if (var4 == 40) {
                        int var9 = arg1.method239();
                        this.field939 = new int[var9];
                        this.field940 = new int[var9];
                        for (int var10 = 0; var10 < var9; var10++) {
                            this.field939[var10] = arg1.method241();
                            this.field940[var10] = arg1.method241();
                        }
                    } else if (var4 == 60) {
                        this.field954 = arg1.method241();
                    } else if (var4 == 62) {
                        this.field956 = true;
                    } else if (var4 == 64) {
                        this.field957 = false;
                    } else if (var4 == 65) {
                        this.field958 = arg1.method241();
                    } else if (var4 == 66) {
                        this.field959 = arg1.method241();
                    } else if (var4 == 67) {
                        this.field960 = arg1.method241();
                    } else if (var4 == 68) {
                        this.field955 = arg1.method241();
                    } else if (var4 == 69) {
                        this.field964 = arg1.method239();
                    } else if (var4 == 70) {
                        this.field961 = arg1.method242();
                    } else if (var4 == 71) {
                        this.field962 = arg1.method242();
                    } else if (var4 == 72) {
                        this.field963 = arg1.method242();
                    } else if (var4 == 73) {
                        this.field965 = true;
                    } else if (var4 == 74) {
                        this.field966 = true;
                    } else if (var4 == 75) {
                        this.field967 = arg1.method239();
                    }
                }
            } while (var5 <= 0);
            this.field936 = new int[var5];
            this.field935 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field935[var6] = arg1.method241();
                this.field936[var6] = arg1.method239();
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZ)Z")
    public final boolean method337(int arg0, boolean arg1) {
        if (!arg1) {
            this.field927 = !this.field927;
        }
        if (this.field936 != null) {
            for (int var5 = 0; var5 < this.field936.length; var5++) {
                if (this.field936[var5] == arg0) {
                    return Model.method140(this.field935[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field935 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field935.length; var4++) {
                var3 &= Model.method140(this.field935[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field935 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field935.length; var3++) {
                var2 &= Model.method140(this.field935[var3] & 0xFFFF);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILvb;)V")
    public final void method339(int arg0, OnDemand arg1) {
        if (arg0 == 38488 && this.field935 != null) {
            for (int var3 = 0; var3 < this.field935.length; var3++) {
                arg1.method294(0, this.field935[var3] & 0xFFFF, 0);
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        Model var8 = this.method341(arg0, (byte) 7, arg6, arg1);
        if (var8 == null) {
            return null;
        }
        if (this.field946 || this.field947) {
            var8 = new Model((byte) 9, this.field946, var8, this.field947);
        }
        if (this.field946) {
            int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var10 = 0; var10 < var8.field539; var10++) {
                int var11 = var8.field540[var10];
                int var12 = var8.field542[var10];
                int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
                int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
                int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
                var8.field541[var10] += var15 - var9;
            }
            var8.method144(true);
        }
        return var8;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IBII)Lfb;")
    private final Model method341(int arg0, byte arg1, int arg2, int arg3) {
        Model var5 = null;
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        long var7;
        if (this.field936 == null) {
            if (arg0 != 10) {
                return null;
            }
            var7 = ((long) (arg2 + 1) << 32) + (long) ((this.field934 << 6) + arg3);
            Model var9 = (Model) field969.method115(var7);
            if (var9 != null) {
                return var9;
            }
            if (this.field935 == null) {
                return null;
            }
            boolean var10 = this.field956 ^ arg3 > 3;
            int var11 = this.field935.length;
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = this.field935[var12];
                if (var10) {
                    var13 += 65536;
                }
                var5 = (Model) field968.method115((long) var13);
                if (var5 == null) {
                    var5 = Model.method139(0, var13 & 0xFFFF);
                    if (var5 == null) {
                        return null;
                    }
                    if (var10) {
                        var5.method154((byte) 15);
                    }
                    field968.method116(var5, false, (long) var13);
                }
                if (var11 > 1) {
                    field933[var12] = var5;
                }
            }
            if (var11 > 1) {
                var5 = new Model(field933, var11, -928);
            }
        } else {
            int var14 = -1;
            for (int var15 = 0; var15 < this.field936.length; var15++) {
                if (this.field936[var15] == arg0) {
                    var14 = var15;
                    break;
                }
            }
            if (var14 == -1) {
                return null;
            }
            var7 = ((long) (arg2 + 1) << 32) + (long) ((this.field934 << 6) + (var14 << 3) + arg3);
            Model var16 = (Model) field969.method115(var7);
            if (var16 != null) {
                return var16;
            }
            int var17 = this.field935[var14];
            boolean var18 = this.field956 ^ arg3 > 3;
            if (var18) {
                var17 += 65536;
            }
            var5 = (Model) field968.method115((long) var17);
            if (var5 == null) {
                var5 = Model.method139(0, var17 & 0xFFFF);
                if (var5 == null) {
                    return null;
                }
                if (var18) {
                    var5.method154((byte) 15);
                }
                field968.method116(var5, false, (long) var17);
            }
        }
        boolean var19;
        if (this.field958 == 128 && this.field959 == 128 && this.field960 == 128) {
            var19 = false;
        } else {
            var19 = true;
        }
        boolean var20;
        if (this.field961 == 0 && this.field962 == 0 && this.field963 == 0) {
            var20 = false;
        } else {
            var20 = true;
        }
        Model var21 = new Model(AnimFrame.method62((byte) 8, arg2), 992, arg3 == 0 && arg2 == -1 && !var19 && !var20, this.field939 == null, var5);
        if (arg2 != -1) {
            var21.method146((byte) 112);
            var21.method147(true, arg2);
            var21.field571 = null;
            var21.field570 = null;
        }
        while (arg3-- > 0) {
            var21.method150(this.field926);
        }
        if (this.field939 != null) {
            for (int var22 = 0; var22 < this.field939.length; var22++) {
                var21.method153(this.field939[var22], this.field940[var22]);
            }
        }
        if (var19) {
            var21.method155(792, this.field960, this.field958, this.field959);
        }
        if (var20) {
            var21.method152((byte) -32, this.field961, this.field963, this.field962);
        }
        var21.method156(this.field951 + 64, this.field952 * 5 + 768, -50, -10, -50, !this.field947);
        if (this.field967 == 1) {
            var21.field567 = var21.field406;
        }
        field969.method116(var21, false, var7);
        return var21;
    }
}
