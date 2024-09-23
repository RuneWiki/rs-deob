import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "a", descriptor = "Z")
    private boolean field910 = true;

    @OriginalMember(owner = "ec", name = "b", descriptor = "I")
    private int field911 = -797;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private int field913 = -45277;

    @OriginalMember(owner = "ec", name = "k", descriptor = "I")
    private int field920 = -1;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Lt;")
    public static LruCache field953 = new LruCache(5, 500);

    @OriginalMember(owner = "ec", name = "S", descriptor = "Lt;")
    public static LruCache field954 = new LruCache(5, 30);

    @OriginalMember(owner = "ec", name = "B", descriptor = "B")
    private byte field937;

    @OriginalMember(owner = "ec", name = "C", descriptor = "B")
    private byte field938;

    @OriginalMember(owner = "ec", name = "c", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "ec", name = "f", descriptor = "I")
    private static int field915;

    @OriginalMember(owner = "ec", name = "j", descriptor = "I")
    private static int field919;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "ec", name = "z", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "ec", name = "A", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "ec", name = "F", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "ec", name = "G", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "ec", name = "O", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "ec", name = "P", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Lmb;")
    private static Packet field917;

    @OriginalMember(owner = "ec", name = "n", descriptor = "Ljava/lang/String;")
    public String field923;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Z")
    public static boolean field914;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field929;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    public boolean field930;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    public boolean field931;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    private boolean field932;

    @OriginalMember(owner = "ec", name = "x", descriptor = "Z")
    private boolean field933;

    @OriginalMember(owner = "ec", name = "y", descriptor = "Z")
    public boolean field934;

    @OriginalMember(owner = "ec", name = "E", descriptor = "Z")
    public boolean field940;

    @OriginalMember(owner = "ec", name = "H", descriptor = "Z")
    private boolean field943;

    @OriginalMember(owner = "ec", name = "I", descriptor = "Z")
    public boolean field944;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Z")
    public boolean field952;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[B")
    public byte[] field924;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[I")
    private static int[] field916;

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field921;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field922;

    @OriginalMember(owner = "ec", name = "p", descriptor = "[I")
    private int[] field925;

    @OriginalMember(owner = "ec", name = "q", descriptor = "[I")
    private int[] field926;

    @OriginalMember(owner = "ec", name = "i", descriptor = "[Lec;")
    private static LocType[] field918;

    @OriginalMember(owner = "ec", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field939;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method322(Jagfile arg0) {
        field917 = new Packet(arg0.method299("loc.dat", null), true);
        Packet var1 = new Packet(arg0.method299("loc.idx", null), true);
        field915 = var1.method233();
        field916 = new int[field915];
        int var2 = 2;
        for (int var3 = 0; var3 < field915; var3++) {
            field916[var3] = var2;
            var2 += var1.method233();
        }
        field918 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field918[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(B)V")
    public static final void method323(byte arg0) {
        field953 = null;
        field954 = null;
        field916 = null;
        field918 = null;
        field917 = null;
        if (arg0 != 7) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method324(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field918[var1].field920 == arg0) {
                return field918[var1];
            }
        }
        field919 = (field919 + 1) % 10;
        LocType var2 = field918[field919];
        field917.field698 = field916[arg0];
        var2.field920 = arg0;
        var2.method325();
        var2.method326(3251, field917);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method325() {
        this.field921 = null;
        this.field922 = null;
        this.field923 = null;
        this.field924 = null;
        this.field925 = null;
        this.field926 = null;
        this.field927 = 1;
        this.field928 = 1;
        this.field929 = true;
        this.field930 = true;
        this.field931 = false;
        this.field932 = false;
        this.field933 = false;
        this.field934 = false;
        this.field935 = -1;
        this.field936 = 16;
        this.field937 = 0;
        this.field938 = 0;
        this.field939 = null;
        this.field940 = false;
        this.field941 = -1;
        this.field942 = -1;
        this.field943 = false;
        this.field944 = true;
        this.field945 = 128;
        this.field946 = 128;
        this.field947 = 128;
        this.field951 = 0;
        this.field948 = 0;
        this.field949 = 0;
        this.field950 = 0;
        this.field952 = false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ILmb;)V")
    private final void method326(int arg0, Packet arg1) {
        int var3 = -1;
        if (arg0 != 3251) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg1.method231();
                if (var5 == 0) {
                    if (this.field922 == null) {
                        this.field922 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field931 = false;
                        if (this.field922.length > 0 && this.field922[0] == 10) {
                            this.field931 = true;
                        }
                        if (this.field939 != null) {
                            this.field931 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method231();
                    this.field922 = new int[var6];
                    this.field921 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field921[var7] = arg1.method233();
                        this.field922[var7] = arg1.method231();
                    }
                } else if (var5 == 2) {
                    this.field923 = arg1.method238();
                } else if (var5 == 3) {
                    this.field924 = arg1.method239(true);
                } else if (var5 == 14) {
                    this.field927 = arg1.method231();
                } else if (var5 == 15) {
                    this.field928 = arg1.method231();
                } else if (var5 == 17) {
                    this.field929 = false;
                } else if (var5 == 18) {
                    this.field930 = false;
                } else if (var5 == 19) {
                    var3 = arg1.method231();
                    if (var3 == 1) {
                        this.field931 = true;
                    }
                } else if (var5 == 21) {
                    this.field932 = true;
                } else if (var5 == 22) {
                    this.field933 = true;
                } else if (var5 == 23) {
                    this.field934 = true;
                } else if (var5 == 24) {
                    this.field935 = arg1.method233();
                    if (this.field935 == 65535) {
                        this.field935 = -1;
                    }
                } else if (var5 == 25) {
                    this.field940 = true;
                } else if (var5 == 28) {
                    this.field936 = arg1.method231();
                } else if (var5 == 29) {
                    this.field937 = arg1.method232();
                } else if (var5 == 39) {
                    this.field938 = arg1.method232();
                } else if (var5 >= 30 && var5 < 39) {
                    if (this.field939 == null) {
                        this.field939 = new String[5];
                    }
                    this.field939[var5 - 30] = arg1.method238();
                    if (this.field939[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field939[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method231();
                    this.field925 = new int[var8];
                    this.field926 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field925[var9] = arg1.method233();
                        this.field926[var9] = arg1.method233();
                    }
                } else if (var5 == 60) {
                    this.field941 = arg1.method233();
                } else if (var5 == 62) {
                    this.field943 = true;
                } else if (var5 == 64) {
                    this.field944 = false;
                } else if (var5 == 65) {
                    this.field945 = arg1.method233();
                } else if (var5 == 66) {
                    this.field946 = arg1.method233();
                } else if (var5 == 67) {
                    this.field947 = arg1.method233();
                } else if (var5 == 68) {
                    this.field942 = arg1.method233();
                } else if (var5 == 69) {
                    this.field951 = arg1.method231();
                } else if (var5 == 70) {
                    this.field948 = arg1.method234();
                } else if (var5 == 71) {
                    this.field949 = arg1.method234();
                } else if (var5 == 72) {
                    this.field950 = arg1.method234();
                } else if (var5 == 73) {
                    this.field952 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IB)Z")
    public final boolean method327(int arg0, byte arg1) {
        int var3 = -1;
        for (int var4 = 0; var4 < this.field922.length; var4++) {
            if (this.field922[var4] == arg0) {
                var3 = var4;
                break;
            }
        }
        if (arg1 != 23) {
            throw new NullPointerException();
        } else if (var3 == -1) {
            return true;
        } else if (this.field921 == null) {
            return true;
        } else {
            int var5 = this.field921[var3];
            return var5 == -1 ? true : Model.method136(var5 & 0xFFFF);
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)Z")
    public final boolean method328(boolean arg0) {
        if (!arg0) {
            this.field910 = !this.field910;
        }
        boolean var2 = true;
        if (this.field921 == null) {
            return true;
        }
        for (int var3 = 0; var3 < this.field921.length; var3++) {
            int var4 = this.field921[var3];
            if (var4 != -1) {
                var2 &= Model.method136(var4 & 0xFFFF);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZLvb;)V")
    public final void method329(boolean arg0, OnDemand arg1) {
        if (this.field921 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field921.length; var3++) {
            int var4 = this.field921[var3];
            if (var4 != -1) {
                arg1.method284(true, 0, var4 & 0xFFFF);
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field922.length; var9++) {
            if (this.field922[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field920 << 6) + (var8 << 3) + arg1);
        if (field914) {
            var10 = 0L;
        }
        Model var12 = (Model) field954.method113(var10);
        if (var12 == null) {
            if (this.field921 == null || var8 >= this.field921.length) {
                return null;
            }
            int var20 = this.field921[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field943 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field953.method113((long) var20);
            if (var22 == null) {
                var22 = Model.method135(var20 & 0xFFFF, this.field911);
                if (var22 == null) {
                    return null;
                }
                if (var21) {
                    var22.method150(-960);
                }
                field953.method114(var22, (long) var20, 7);
            }
            boolean var23;
            if (this.field945 == 128 && this.field946 == 128 && this.field947 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field948 == 0 && this.field949 == 0 && this.field950 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(-435, this.field925 == null, arg1 == 0 && arg6 == -1 && !var23 && !var24, var22, !this.field940);
            if (arg6 != -1) {
                var25.method142(8);
                var25.method143(true, arg6);
                var25.field566 = null;
                var25.field565 = null;
            }
            while (arg1-- > 0) {
                var25.method146(0);
            }
            if (this.field925 != null) {
                for (int var26 = 0; var26 < this.field925.length; var26++) {
                    var25.method149(this.field925[var26], this.field926[var26]);
                }
            }
            if (var23) {
                var25.method151(this.field946, this.field945, 0, this.field947);
            }
            if (var24) {
                var25.method148(this.field949, this.field913, this.field948, this.field950);
            }
            var25.method152(this.field937 + 64, this.field938 * 5 + 768, -50, -10, -50, !this.field933);
            if (this.field929) {
                var25.field562 = var25.field398;
            }
            field954.method114(var25, var10, 7);
            if (this.field932 || this.field933) {
                var25 = new Model(var25, this.field932, this.field933, this.field912);
            }
            if (this.field932) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field534; var28++) {
                    int var29 = var25.field535[var28];
                    int var30 = var25.field537[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field536[var28] += var33 - var27;
                }
                var25.method140(true);
            }
            return var25;
        } else if (field914) {
            return var12;
        } else {
            if (this.field932 || this.field933) {
                var12 = new Model(var12, this.field932, this.field933, this.field912);
            }
            if (this.field932) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field534; var14++) {
                    int var15 = var12.field535[var14];
                    int var16 = var12.field537[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field536[var14] += var19 - var13;
                }
                var12.method140(true);
            }
            return var12;
        }
    }
}
