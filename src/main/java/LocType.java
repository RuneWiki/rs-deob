import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class LocType {

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field906 = false;

    @OriginalMember(owner = "ec", name = "i", descriptor = "I")
    private int field913 = -1;

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private static int field905 = 451;

    @OriginalMember(owner = "ec", name = "P", descriptor = "Lt;")
    public static LruCache field946 = new LruCache(false, 500);

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Lt;")
    public static LruCache field947 = new LruCache(false, 30);

    @OriginalMember(owner = "ec", name = "z", descriptor = "B")
    private byte field930;

    @OriginalMember(owner = "ec", name = "A", descriptor = "B")
    private byte field931;

    @OriginalMember(owner = "ec", name = "d", descriptor = "I")
    private static int field908;

    @OriginalMember(owner = "ec", name = "h", descriptor = "I")
    private static int field912;

    @OriginalMember(owner = "ec", name = "p", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "ec", name = "q", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "ec", name = "x", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "ec", name = "y", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "ec", name = "D", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "ec", name = "E", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "ec", name = "H", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "ec", name = "I", descriptor = "I")
    private int field939;

    @OriginalMember(owner = "ec", name = "J", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "ec", name = "K", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "ec", name = "L", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "ec", name = "M", descriptor = "I")
    private int field943;

    @OriginalMember(owner = "ec", name = "N", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "ec", name = "f", descriptor = "Lmb;")
    private static Packet field910;

    @OriginalMember(owner = "ec", name = "l", descriptor = "Ljava/lang/String;")
    public String field916;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Z")
    public static boolean field907;

    @OriginalMember(owner = "ec", name = "r", descriptor = "Z")
    public boolean field922;

    @OriginalMember(owner = "ec", name = "s", descriptor = "Z")
    public boolean field923;

    @OriginalMember(owner = "ec", name = "t", descriptor = "Z")
    public boolean field924;

    @OriginalMember(owner = "ec", name = "u", descriptor = "Z")
    private boolean field925;

    @OriginalMember(owner = "ec", name = "v", descriptor = "Z")
    private boolean field926;

    @OriginalMember(owner = "ec", name = "w", descriptor = "Z")
    public boolean field927;

    @OriginalMember(owner = "ec", name = "C", descriptor = "Z")
    public boolean field933;

    @OriginalMember(owner = "ec", name = "F", descriptor = "Z")
    private boolean field936;

    @OriginalMember(owner = "ec", name = "G", descriptor = "Z")
    public boolean field937;

    @OriginalMember(owner = "ec", name = "O", descriptor = "Z")
    public boolean field945;

    @OriginalMember(owner = "ec", name = "m", descriptor = "[B")
    public byte[] field917;

    @OriginalMember(owner = "ec", name = "e", descriptor = "[I")
    private static int[] field909;

    @OriginalMember(owner = "ec", name = "j", descriptor = "[I")
    private int[] field914;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[I")
    private int[] field915;

    @OriginalMember(owner = "ec", name = "n", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "ec", name = "o", descriptor = "[I")
    private int[] field919;

    @OriginalMember(owner = "ec", name = "g", descriptor = "[Lec;")
    private static LocType[] field911;

    @OriginalMember(owner = "ec", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field932;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lyb;)V")
    public static final void method318(Jagfile arg0) {
        field910 = new Packet(699, arg0.method295("loc.dat", null));
        Packet var1 = new Packet(699, arg0.method295("loc.idx", null));
        field908 = var1.method233();
        field909 = new int[field908];
        int var2 = 2;
        for (int var3 = 0; var3 < field908; var3++) {
            field909[var3] = var2;
            var2 += var1.method233();
        }
        field911 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field911[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Z)V")
    public static final void method319(boolean arg0) {
        field946 = null;
        field947 = null;
        field909 = null;
        if (!arg0) {
            field905 = -125;
        }
        field911 = null;
        field910 = null;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(I)Lec;")
    public static final LocType method320(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field911[var1].field913 == arg0) {
                return field911[var1];
            }
        }
        field912 = (field912 + 1) % 10;
        LocType var2 = field911[field912];
        field910.field694 = field909[arg0];
        var2.field913 = arg0;
        var2.method321();
        var2.method322(false, field910);
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    private final void method321() {
        this.field914 = null;
        this.field915 = null;
        this.field916 = null;
        this.field917 = null;
        this.field918 = null;
        this.field919 = null;
        this.field920 = 1;
        this.field921 = 1;
        this.field922 = true;
        this.field923 = true;
        this.field924 = false;
        this.field925 = false;
        this.field926 = false;
        this.field927 = false;
        this.field928 = -1;
        this.field929 = 16;
        this.field930 = 0;
        this.field931 = 0;
        this.field932 = null;
        this.field933 = false;
        this.field934 = -1;
        this.field935 = -1;
        this.field936 = false;
        this.field937 = true;
        this.field938 = 128;
        this.field939 = 128;
        this.field940 = 128;
        this.field944 = 0;
        this.field941 = 0;
        this.field942 = 0;
        this.field943 = 0;
        this.field945 = false;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(ZLmb;)V")
    private final void method322(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        int var3 = -1;
        while (true) {
            while (true) {
                int var4 = arg1.method231();
                if (var4 == 0) {
                    if (this.field915 == null) {
                        this.field915 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field924 = false;
                        if (this.field915.length > 0 && this.field915[0] == 10) {
                            this.field924 = true;
                        }
                        if (this.field932 != null) {
                            this.field924 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method231();
                    this.field915 = new int[var5];
                    this.field914 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field914[var6] = arg1.method233();
                        this.field915[var6] = arg1.method231();
                    }
                } else if (var4 == 2) {
                    this.field916 = arg1.method238();
                } else if (var4 == 3) {
                    this.field917 = arg1.method239(-139);
                } else if (var4 == 14) {
                    this.field920 = arg1.method231();
                } else if (var4 == 15) {
                    this.field921 = arg1.method231();
                } else if (var4 == 17) {
                    this.field922 = false;
                } else if (var4 == 18) {
                    this.field923 = false;
                } else if (var4 == 19) {
                    var3 = arg1.method231();
                    if (var3 == 1) {
                        this.field924 = true;
                    }
                } else if (var4 == 21) {
                    this.field925 = true;
                } else if (var4 == 22) {
                    this.field926 = true;
                } else if (var4 == 23) {
                    this.field927 = true;
                } else if (var4 == 24) {
                    this.field928 = arg1.method233();
                    if (this.field928 == 65535) {
                        this.field928 = -1;
                    }
                } else if (var4 == 25) {
                    this.field933 = true;
                } else if (var4 == 28) {
                    this.field929 = arg1.method231();
                } else if (var4 == 29) {
                    this.field930 = arg1.method232();
                } else if (var4 == 39) {
                    this.field931 = arg1.method232();
                } else if (var4 >= 30 && var4 < 39) {
                    if (this.field932 == null) {
                        this.field932 = new String[5];
                    }
                    this.field932[var4 - 30] = arg1.method238();
                    if (this.field932[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field932[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method231();
                    this.field918 = new int[var7];
                    this.field919 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field918[var8] = arg1.method233();
                        this.field919[var8] = arg1.method233();
                    }
                } else if (var4 == 60) {
                    this.field934 = arg1.method233();
                } else if (var4 == 62) {
                    this.field936 = true;
                } else if (var4 == 64) {
                    this.field937 = false;
                } else if (var4 == 65) {
                    this.field938 = arg1.method233();
                } else if (var4 == 66) {
                    this.field939 = arg1.method233();
                } else if (var4 == 67) {
                    this.field940 = arg1.method233();
                } else if (var4 == 68) {
                    this.field935 = arg1.method233();
                } else if (var4 == 69) {
                    this.field944 = arg1.method231();
                } else if (var4 == 70) {
                    this.field941 = arg1.method234();
                } else if (var4 == 71) {
                    this.field942 = arg1.method234();
                } else if (var4 == 72) {
                    this.field943 = arg1.method234();
                } else if (var4 == 73) {
                    this.field945 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZ)Z")
    public final boolean method323(int arg0, boolean arg1) {
        if (arg1) {
            this.field906 = !this.field906;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < this.field915.length; var4++) {
            if (this.field915[var4] == arg0) {
                var3 = var4;
                break;
            }
        }
        if (var3 == -1) {
            return true;
        } else if (this.field914 == null) {
            return true;
        } else {
            int var5 = this.field914[var3];
            return var5 == -1 ? true : Model.method136(var5 & 0xFFFF);
        }
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(I)Z")
    public final boolean method324(int arg0) {
        boolean var2 = true;
        if (this.field914 == null) {
            return true;
        }
        for (int var3 = 0; var3 < this.field914.length; var3++) {
            int var4 = this.field914[var3];
            if (var4 != -1) {
                var2 &= Model.method136(var4 & 0xFFFF);
            }
        }
        if (arg0 != -16491) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Lvb;I)V")
    public final void method325(OnDemand arg0, int arg1) {
        if (this.field914 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field914.length; var3++) {
            int var4 = this.field914[var3];
            if (var4 != -1) {
                arg0.method284(0, var4 & 0xFFFF, 0);
            }
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIIIIII)Lfb;")
    public final Model method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field915.length; var9++) {
            if (this.field915[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field913 << 6) + (var8 << 3) + arg1);
        if (field907) {
            var10 = 0L;
        }
        Model var12 = (Model) field947.method113(var10);
        if (var12 == null) {
            if (this.field914 == null || var8 >= this.field914.length) {
                return null;
            }
            int var20 = this.field914[var8];
            if (var20 == -1) {
                return null;
            }
            boolean var21 = this.field936 ^ arg1 > 3;
            if (var21) {
                var20 += 65536;
            }
            Model var22 = (Model) field946.method113((long) var20);
            if (var22 == null) {
                var22 = Model.method135(var20 & 0xFFFF, -30419);
                if (var22 == null) {
                    return null;
                }
                if (var21) {
                    var22.method150((byte) 123);
                }
                field946.method114((long) var20, true, var22);
            }
            boolean var23;
            if (this.field938 == 128 && this.field939 == 128 && this.field940 == 128) {
                var23 = false;
            } else {
                var23 = true;
            }
            boolean var24;
            if (this.field941 == 0 && this.field942 == 0 && this.field943 == 0) {
                var24 = false;
            } else {
                var24 = true;
            }
            Model var25 = new Model(8, this.field918 == null, !this.field933, arg1 == 0 && arg6 == -1 && !var23 && !var24, var22);
            if (arg6 != -1) {
                var25.method142((byte) 9);
                var25.method143(arg6, false);
                var25.field557 = null;
                var25.field556 = null;
            }
            while (arg1-- > 0) {
                var25.method146(35866);
            }
            if (this.field918 != null) {
                for (int var26 = 0; var26 < this.field918.length; var26++) {
                    var25.method149(this.field918[var26], this.field919[var26]);
                }
            }
            if (var23) {
                var25.method151(this.field938, this.field940, this.field939, -797);
            }
            if (var24) {
                var25.method148(false, this.field942, this.field941, this.field943);
            }
            var25.method152(this.field930 + 64, this.field931 * 5 + 768, -50, -10, -50, !this.field926);
            if (this.field922) {
                var25.field553 = var25.field394;
            }
            field947.method114(var10, true, var25);
            if (this.field925 || this.field926) {
                var25 = new Model(this.field926, this.field925, var25, -591);
            }
            if (this.field925) {
                int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var28 = 0; var28 < var25.field525; var28++) {
                    int var29 = var25.field526[var28];
                    int var30 = var25.field528[var28];
                    int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
                    int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
                    int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
                    var25.field527[var28] += var33 - var27;
                }
                var25.method140(396);
            }
            return var25;
        } else if (field907) {
            return var12;
        } else {
            if (this.field925 || this.field926) {
                var12 = new Model(this.field926, this.field925, var12, -591);
            }
            if (this.field925) {
                int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
                for (int var14 = 0; var14 < var12.field525; var14++) {
                    int var15 = var12.field526[var14];
                    int var16 = var12.field528[var14];
                    int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
                    int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
                    int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
                    var12.field527[var14] += var19 - var13;
                }
                var12.method140(396);
            }
            return var12;
        }
    }
}
