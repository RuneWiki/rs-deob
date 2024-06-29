import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class29 extends class102 {

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    private int field625 = 1638;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    private int field637 = 0;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field633 = 4;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    private int field647 = 4;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    private int field627 = 4;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "[B")
    private byte[] field641 = new byte[512];

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "Z")
    private boolean field635 = true;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Lqe;")
    public static class179 field630 = class206.method1380("Fehler beim Laden Ihres Spielcharakters)3", (byte) -128);

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "Lqe;")
    private static class179 field634 = class206.method1380("Created gameworld", (byte) 28);

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "[I")
    public static int[] field640 = new int[1000];

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "Z")
    public static boolean field631 = false;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "Lqe;")
    public static class179 field628 = class206.method1380("(U1", (byte) -126);

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "Lqe;")
    public static class179 field645 = field634;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "Lsg;")
    public static class201 field643 = new class201(5);

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "[I")
    public static int[] field636;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "[S")
    private short[] field624;

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "[S")
    private short[] field648;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILeh;II)Lgg;")
    public static final class72 method188(int arg0, class52 arg1, int arg2, int arg3) {
        ++field629;
        if (!class77.method495(20480, arg3, arg2, arg1)) {
            return null;
        } else {
            return arg0 > -83 ? null : class238.method1545((byte) 100);
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
    public static void method189(int arg0) {
        field634 = null;
        field630 = null;
        if (arg0 != -858392404) {
            method188(-90, (class52) null, -93, -26);
        }
        field628 = null;
        field636 = null;
        field645 = null;
        field643 = null;
        field640 = null;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public static final void method190(int arg0) {
        class102.field1961 = 0;
        class202.field3742 = 0;
        ++field644;
        class190.method1281(-112);
        class74.method470((byte) -80);
        client.method215(-27015);
        class231.method1513(-20023);
        for (int var1 = 0; class102.field1961 > var1; ++var1) {
            int var3 = field640[var1];
            if (~class13.field322 != ~class23.field554[var3].field3152) {
                class23.field554[var3] = null;
            }
        }
        if (arg0 < -123) {
            if (~class150.field2705 != ~class36.field789.field3432) {
                throw new RuntimeException("gpp1 pos:" + class36.field789.field3432 + " psize:" + class150.field2705);
            } else {
                for (int var2 = 0; var2 < class22.field548; ++var2) {
                    if (class23.field554[class10.field279[var2]] == null) {
                        throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class22.field548);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field627 = arg0.method1243(3);
                                }
                            } else {
                                this.field647 = arg0.method1243(3);
                            }
                        } else {
                            this.field637 = arg0.method1243(3);
                        }
                    } else {
                        this.field647 = this.field627 = arg0.method1243(3);
                    }
                } else {
                    this.field625 = arg0.method1225((byte) -77);
                    if (~this.field625 > -1) {
                        this.field648 = new short[this.field633];
                        for (int var5 = 0; this.field633 > var5; ++var5) {
                            this.field648[var5] = (short) arg0.method1225((byte) -77);
                        }
                    }
                }
            } else {
                this.field633 = arg0.method1243(3);
            }
        } else {
            this.field635 = ~arg0.method1243(3) == -2;
        }
        if (!arg2) {
            ++field638;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        this.field641 = class207.method1383(92, this.field637);
        this.method193(0);
        ++field626;
        for (int var2 = this.field633 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field648[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field633;
        }
        if (arg0 != 14005) {
            this.field637 = 56;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIZ)I")
    private final int method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field649;
        if (!arg6) {
            this.field647 = 24;
        }
        int var8 = arg1 + -4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 4095;
        int var11 = var10 + -4096;
        int var12 = var9 - -1;
        int var13 = class112.field2092[var10];
        int var14 = var9 & 255;
        if (~var12 <= ~arg4) {
            var12 = 0;
        }
        int var15 = this.field641[arg3 + var14] & 3;
        int var16 = var12 & 255;
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 == -1 ? arg1 + var10 : -var10 + arg1;
        } else {
            var17 = ~var15 == -3 ? -arg1 + var10 : -arg1 + -var10;
        }
        int var18 = 3 & this.field641[var16 - -arg3];
        int var19;
        if (var18 > 1) {
            var19 = ~var18 == -3 ? -arg1 + var11 : -arg1 + -var11;
        } else {
            var19 = var18 == 0 ? var11 - -arg1 : arg1 - var11;
        }
        int var20 = ((var19 - var17) * var13 >> 12) + var17;
        int var21 = 3 & this.field641[arg2 + var14];
        int var22;
        if (~var21 >= -2) {
            var22 = ~var21 == -1 ? var8 + var10 : var8 - var10;
        } else {
            var22 = var21 == 2 ? -var8 + var10 : -var8 + -var10;
        }
        int var23 = 3 & this.field641[var16 - -arg2];
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 == -1 ? var8 + var11 : var8 - var11;
        } else {
            var24 = var23 == 2 ? -var8 + var11 : -var8 + -var11;
        }
        int var25 = ((-var22 + var24) * var13 >> 12) + var22;
        return var20 - -((var25 - var20) * arg5 >> 12);
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    private final void method193(int arg0) {
        ++field646;
        if (arg0 == 0) {
            if (~this.field625 < -1) {
                this.field624 = new short[this.field633];
                this.field648 = new short[this.field633];
                for (int var2 = 0; var2 < this.field633; ++var2) {
                    this.field648[var2] = (short) ((int) (Math.pow((double) ((float) this.field625 / 4096.0F), (double) var2) * 4096.0D));
                    this.field624[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field648 != null && ~this.field648.length == ~this.field633) {
                this.field624 = new short[this.field633];
                for (int var3 = 0; this.field633 > var3; ++var3) {
                    this.field624[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            method190(-123);
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        ++field632;
        if (super.field1960.field2007) {
            this.method194(arg1, 0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[I)V")
    private final void method194(int arg0, int arg1, int[] arg2) {
        ++field639;
        int var4 = class94.field1769[arg0] * this.field627;
        if (arg1 != 0) {
            this.method13((class185) null, -116, true);
        }
        if (this.field633 == 1) {
            short var5 = this.field648[0];
            int var6 = this.field624[0] << 12;
            int var7 = this.field647 * var6 >> 12;
            int var8 = this.field627 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = 255 & this.field641[var10 & 255];
            if (~var11 <= ~var8) {
                var11 = 0;
            }
            int var13 = this.field641[255 & var11] & 255;
            int var14 = var9 & 4095;
            int var15 = class112.field2092[var14];
            if (this.field635) {
                for (int var16 = 0; class155.field2796 > var16; ++var16) {
                    int var17 = class124.field2292[var16] * this.field647;
                    int var18 = this.method192(var6 * var17 >> 12, var14, var13, var12, var7, var15, true);
                    int var19 = var5 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; class155.field2796 > var20; ++var20) {
                    int var21 = class124.field2292[var20] * this.field647;
                    int var22 = this.method192(var6 * var21 >> 12, var14, var13, var12, var7, var15, true);
                    arg2[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field648[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field624[0] << 12;
                int var25 = this.field627 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = var26 >> 12;
                int var28 = this.field647 * var24 >> 12;
                int var29 = 255 & this.field641[255 & var27];
                int var30 = var27 + 1;
                int var31 = var26 & 4095;
                int var32 = class112.field2092[var31];
                if (var30 >= var25) {
                    var30 = 0;
                }
                int var33 = 255 & this.field641[var30 & 255];
                for (int var34 = 0; class155.field2796 > var34; ++var34) {
                    int var54 = class124.field2292[var34] * this.field647;
                    int var55 = this.method192(var24 * var54 >> 12, var31, var33, var29, var28, var32, true);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field633 > var35; ++var35) {
                short var36 = this.field648[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field624[var35] << 12;
                    int var38 = this.field647 * var37 >> 12;
                    int var39 = this.field627 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = this.field641[255 & var41] & 255;
                    int var43 = var40 & 4095;
                    int var44 = class112.field2092[var43];
                    int var45 = var41 + 1;
                    if (~var39 >= ~var45) {
                        var45 = 0;
                    }
                    int var46 = this.field641[var45 & 255] & 255;
                    if (this.field635 && this.field633 + -1 == var35) {
                        for (int var47 = 0; var47 < class155.field2796; ++var47) {
                            int var48 = class124.field2292[var47] * this.field647;
                            int var49 = this.method192(var37 * var48 >> 12, var43, var46, var42, var38, var44, true);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; var51 < class155.field2796; ++var51) {
                            int var52 = class124.field2292[var51] * this.field647;
                            int var53 = this.method192(var37 * var52 >> 12, var43, var46, var42, var38, var44, true);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }
}
