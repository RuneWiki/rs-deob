import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class54 extends class200 {

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "Z")
    public boolean field979 = false;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Leg;")
    private class52 field978;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "Z")
    public boolean field989;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "Z")
    public boolean field976;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "Z")
    private boolean field986;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Z")
    private boolean field970;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "Ls;")
    public static class190 field987 = new class190();

    @OriginalMember(owner = "client!ei", name = "kb", descriptor = "Ldj;")
    public static class44 field992 = class89.method650(255, "Angreifen");

    @OriginalMember(owner = "client!ei", name = "lb", descriptor = "Ldj;")
    public static class44 field993 = class89.method650(255, "p11_full");

    @OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!ei", name = "ob", descriptor = "Ldj;")
    public static class44 field996 = class89.method650(255, "Freie Welt");

    @OriginalMember(owner = "client!ei", name = "pb", descriptor = "Ldj;")
    public static class44 field997 = class89.method650(255, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ei", name = "mb", descriptor = "I")
    public static int field994 = -1;

    @OriginalMember(owner = "client!ei", name = "nb", descriptor = "[B")
    public static byte[] field995 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "Ll;")
    public static class120 field990 = new class120(32);

    @OriginalMember(owner = "client!ei", name = "rb", descriptor = "I")
    public static int field999 = 0;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "F")
    private float field975;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ei", name = "qb", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "[I")
    private int[] field971;

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field968++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public static void method384(int arg0) {
        field993 = null;
        field995 = null;
        field997 = null;
        field996 = null;
        field992 = null;
        if (arg0 >= 68) {
            field990 = null;
            field987 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IFLve;ILef;)[I")
    public final int[] method385(int arg0, float arg1, class225 arg2, int arg3, class51 arg4) {
        if (arg3 > -61) {
            method391(null, (byte) -27);
        }
        field998++;
        if (this.field971 == null || this.field975 != arg1) {
            if (!this.field978.method377(arg4, (byte) 59, arg2)) {
                return null;
            }
            int var6 = arg0 < this.field973 ? arg0 : this.field973;
            this.field971 = this.field978.method374(true, arg4, this.field970, arg2, var6, (byte) 97, var6, (double) arg1);
            this.field975 = arg1;
            if (this.field986) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var16; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field971[var14];
                        var7[var34] += class29.method202(255, var35 >> 16);
                        var9[var34] += class29.method202(65476, var35) >> 8;
                        var8[var34] += class29.method202(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var13; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    for (int var25 = 2; var25 >= 0; var25--) {
                        var24--;
                        var22 += var8[var24];
                        var23 += var7[var24];
                        var21 += var9[var24];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    int var26 = 1;
                    for (int var27 = var16; var27 >= 0; var27--) {
                        var24--;
                        int var31 = var21 / 9;
                        int var32 = var22 / 9;
                        int var33 = var23 / 9;
                        var26--;
                        var19--;
                        var10[var19] = class238.method1545(var32, class238.method1545(var31 << 8, var33 << 16));
                        var21 += var9[var24] - var9[var26];
                        var22 += var8[var24] - var8[var26];
                        var23 += var7[var24] - var7[var26];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                        if (var26 == 0) {
                            var26 = var12;
                        }
                    }
                    for (int var28 = var16; var28 >= 0; var28--) {
                        var14--;
                        int var29 = this.field971[var14];
                        var15--;
                        int var30 = this.field971[var15];
                        var7[var28] += class29.method202(255, var29 >> 16) - class29.method202(var30 >> 16, 255);
                        var9[var28] += (class29.method202(var29, 65311) >> 8) - (class29.method202(65513, var30) >> 8);
                        var8[var28] += class29.method202(255, var29) - class29.method202(var30, 255);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field971 = var10;
            }
        }
        return this.field971;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static final void method386(int arg0) {
        field967++;
        class200.field3547.method28(-110);
        for (int var1 = 0; var1 < 32; var1++) {
            class147.field2586[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class17.field300[var2] = 0L;
        }
        if (arg0 <= -10) {
            class118.field2106 = 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(II)V")
    public final void method387(int arg0, int arg1) {
        field984++;
        if (arg0 != 23906) {
            method386(-88);
        }
        if (this.field971 == null || this.field981 == 0 && this.field969 == 0) {
            return;
        }
        int var3 = this.field969 * arg1;
        if (class92.field1723 == null || class92.field1723.length < this.field971.length) {
            class92.field1723 = new int[this.field971.length];
        }
        int var4 = this.field971.length == 4096 ? 64 : 128;
        int var5 = this.field971.length;
        int var6 = var5 - 1;
        int var7 = this.field981 * arg1 * var4;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var5; var9 += var4) {
            int var11 = var6 & var7 + var9;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var8 & var3 + var12) + var11;
                class92.field1723[var13] = this.field971[var14];
            }
        }
        int[] var10 = this.field971;
        this.field971 = class92.field1723;
        class92.field1723 = var10;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lve;ILef;)Z")
    public final boolean method388(class225 arg0, int arg1, class51 arg2) {
        if (arg1 == 0) {
            field980++;
            return this.field978.method377(arg2, (byte) 113, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field982++;
        int var9 = arg5 - arg3;
        int var10 = arg4 - arg6;
        int var11 = (arg7 - arg0 << 16) / var9;
        if (class214.field3851 > arg5) {
            var9++;
        }
        int var12 = (arg1 - arg8 << 16) / var10;
        if (class168.field2896 > arg4) {
            var10++;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            int var30 = (var13 + 1) * var12 >> 16;
            int var31 = var12 * var13 >> 16;
            int var32 = var30 - var31;
            if (var32 > 0) {
                int var33 = arg6 + var13 >> 6;
                int var34 = arg8 + var31;
                int var35 = arg8 + var30;
                byte[][] var36 = class228.field4281[var33];
                int[][] var37 = class95.field1772[var33];
                byte[][] var38 = class170.field2968[var33];
                byte[][] var39 = class30.field541[var33];
                byte[][] var40 = class225.field4218[var33];
                byte[][] var41 = class79.field1535[var33];
                for (int var42 = 0; var42 < var9; var42++) {
                    int var43 = var11 * var42 >> 16;
                    int var44 = (var42 + 1) * var11 >> 16;
                    int var45 = var44 - var43;
                    if (var45 > 0) {
                        int var46 = arg0 + var44;
                        int var47 = arg0 + var43;
                        int var48 = var42 + arg3 & 0x3F;
                        int var49 = arg6 + var13 & 0x3F;
                        int var50 = (var48 << 6) + var49;
                        int var51 = var42 + arg3 >> 6;
                        int var54;
                        if (var37[var51] == null) {
                            int var52 = var13 + arg6 & 0x4;
                            int var53 = arg3 + var42 & 0x4;
                            if ((var52 >= 2 || var53 <= 2) && (var52 <= 2 || var53 >= 2)) {
                                var54 = class31.field544[class239.field4414 + 1];
                            } else {
                                var54 = 4936552;
                            }
                        } else {
                            var54 = var37[var51][var50];
                        }
                        int var55 = var36[var51] == null ? 0 : class31.field544[var36[var51][var50] & 0xFF];
                        int var56 = var40[var51] == null ? 0 : class31.field544[var40[var51][var50] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class99.method688(var34, var47, var32, var45, var54);
                        } else {
                            if (var55 != 0) {
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                byte var57 = var38[var51] == null ? 0 : var38[var51][var50];
                                int var58 = var57 & 0xFC;
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class99.method688(var34, var47, var32, var45, var55);
                                } else {
                                    class218.method1415(var32, arg2 ^ 0x3775, var45, var57 & 0x3, class99.field1823, var54, var58 >> 2, var47, var55, true, var34);
                                }
                            }
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = var54;
                                }
                                byte var59 = var39[var51][var50];
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class99.method688(var34, var47, var32, var45, var56);
                                }
                                class218.method1415(var32, -73, var45, var59 & 0x3, class99.field1823, 0, var60 >> 2, var47, var56, var55 == 0, var34);
                            }
                        }
                        if (var41[var51] != null) {
                            int var61 = var41[var51][var50] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var45 == 1) {
                                    var62 = var47;
                                } else {
                                    var62 = var46 - 1;
                                }
                                int var63 = 13421772;
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var61 -= 4;
                                    var63 = 13369344;
                                }
                                int var64;
                                if (var32 == 1) {
                                    var64 = var34;
                                } else {
                                    var64 = var35 - 1;
                                }
                                if (var61 == 1) {
                                    class99.method695(var34, var47, var45, var63);
                                } else if (var61 == 2) {
                                    class99.method704(var34, var47, var32, var63);
                                } else if (var61 == 3) {
                                    class99.method695(var64, var47, var45, var63);
                                } else if (var61 == 4) {
                                    class99.method704(var34, var62, var32, var63);
                                } else if (var61 == 9) {
                                    class99.method695(var34, var47, var45, 16777215);
                                    class99.method704(var34, var47, var32, var63);
                                } else if (var61 == 10) {
                                    class99.method695(var64, var47, var45, 16777215);
                                    class99.method704(var34, var47, var32, var63);
                                } else if (var61 == 11) {
                                    class99.method695(var64, var47, var45, 16777215);
                                    class99.method704(var34, var62, var32, var63);
                                } else if (var61 == 12) {
                                    class99.method695(var34, var47, var45, 16777215);
                                    class99.method704(var34, var62, var32, var63);
                                } else if (var61 == 17) {
                                    class99.method704(var34, var47, 1, var63);
                                } else if (var61 == 18) {
                                    class99.method704(var64, var47, 1, var63);
                                } else if (var61 == 19) {
                                    class99.method704(var64, var62, 1, var63);
                                } else if (var61 == 20) {
                                    class99.method704(var34, var62, 1, var63);
                                } else if (var61 == 25) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class99.method704(var34 + var66, -var66 + var62, 1, var63);
                                    }
                                } else if (var61 == 26) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class99.method704(var34 + var65, var47 + var65, 1, var63);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != -14116) {
            method390(108, -81, 45, null);
        }
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg8 + var15;
                int var10000 = arg8 + var16;
                byte[][] var20 = class180.field3121[arg6 + var14 >> 6];
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = (var21 + 1) * var11 >> 16;
                    int var23 = var11 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        int var25 = var21 + arg3 >> 6;
                        int var26 = arg0 + var23;
                        int var27 = ((arg3 + var21 & 0x3F) << 6) + (var14 + arg6 & 0x3F);
                        var10000 = arg0 + var22;
                        if (var20[var25] != null) {
                            int var29 = var20[var25][var27] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class211.field3785[var29 - 1].method859(var18, var26, var17 * 2 + 1, var24 * 2 + 1);
                                } else {
                                    class211.field3785[var29 - 1].method859(var18 - var17 / 2, -(var24 / 2) + var26, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILve;)[Lle;")
    public static final class125[] method390(int arg0, int arg1, int arg2, class225 arg3) {
        field983++;
        if (arg0 > -114) {
            return null;
        } else if (class171.method1086((byte) 113, arg1, arg2, arg3)) {
            return class101.method750(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lvc;B)Z")
    public static final boolean method391(class223 arg0, byte arg1) {
        if (arg1 != -63) {
            method384(-33);
        }
        field972++;
        if (class153.field2669) {
            if (class117.method821(arg0, 21064) != 0) {
                return false;
            }
            if (arg0.field4076 == 0) {
                return false;
            }
        }
        return arg0.field4173;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lef;IBLve;)[I")
    public final int[] method392(class51 arg0, int arg1, byte arg2, class225 arg3) {
        field985++;
        if (!this.field978.method377(arg0, (byte) 116, arg3)) {
            return null;
        }
        if (arg2 >= -18) {
            method390(64, 71, -116, null);
        }
        int var5 = this.field973 > arg1 ? arg1 : this.field973;
        return this.field978.method374(false, arg0, this.field970, arg3, var5, (byte) 97, var5, 1.0D);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lfj;)V")
    public class54(class66 arg0) {
        this.field978 = new class52(arg0);
        int var2 = arg0.method506(255);
        this.field989 = (var2 & 0x1) != 0;
        this.field976 = (var2 & 0x2) != 0;
        int var3 = var2 >> 3 & 0x3;
        int var4 = arg0.method506(255);
        this.field973 = 0x1 << (var4 & 0x7) + 1;
        this.field986 = (var4 & 0x8) != 0;
        this.field970 = (var4 & 0x80) != 0;
        this.field977 = arg0.method500(50);
        this.field988 = arg0.method506(255);
        if (this.field988 == 255) {
            this.field988 = 256;
        }
        this.field969 = arg0.method505(false);
        this.field981 = arg0.method505(false);
        arg0.method506(255);
        arg0.method506(255);
        arg0.method506(255);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class54() {
        this.field978 = new class52();
        this.field973 = 64;
        this.field989 = true;
    }
}
