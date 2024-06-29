import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class105 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    private int field1853 = 4;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    private int field1850 = 4;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[S")
    private short[] field1867 = new short[512];

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    private int field1866 = 0;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public int field1871 = 4;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    private int field1861 = 4;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Z")
    public static boolean field1863 = false;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
    public static int[] field1862 = new int[50];

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field1869 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field1865 = 0;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Lhi;")
    private static class82 field1873 = class95.method664((byte) -114, "Loaded input handler");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lhi;")
    public static class82 field1864 = field1873;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lum;")
    public static class222 field1855;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lum;")
    public static class222 field1859;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[S")
    private short[] field1854;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "[S")
    public static short[] field1872;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)Z", line = 9)
    public static final boolean method720(int arg0, int arg1, int arg2, int arg3) {
        if (!class305.method2107(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class245.field4255[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class129.field2252) {
                    if (!class160.method1163(var4, var6, var5)) {
                        return false;
                    }
                    if (!class160.method1163(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class160.method1163(var4, var7, var5)) {
                        return false;
                    }
                    if (!class160.method1163(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class160.method1163(var4, var8, var5)) {
                    return false;
                }
                if (!class160.method1163(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class37.field621) {
                    if (!class160.method1163(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class160.method1163(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class160.method1163(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class160.method1163(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class160.method1163(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class160.method1163(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class129.field2252) {
                    if (!class160.method1163(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class160.method1163(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class160.method1163(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class160.method1163(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class160.method1163(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class160.method1163(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class37.field621) {
                    if (!class160.method1163(var4, var6, var5)) {
                        return false;
                    }
                    if (!class160.method1163(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class160.method1163(var4, var7, var5)) {
                        return false;
                    }
                    if (!class160.method1163(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class160.method1163(var4, var8, var5)) {
                    return false;
                }
                if (!class160.method1163(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class160.method1163(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class160.method1163(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class160.method1163(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class160.method1163(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class160.method1163(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 198)
    public static final void method721(int arg0, int arg1, int arg2) {
        field1852++;
        class227 var3 = class215.method1531(-1, arg0, arg2);
        var3.method1616(64);
        var3.field3923 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 208)
    private final void method722(byte arg0) {
        field1856++;
        if (arg0 != 118) {
            field1864 = (class82) null;
        }
        Random var2 = new Random((long) this.field1866);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1867[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class232.method1650(var5, false, var2);
            short var7 = this.field1867[var6];
            this.field1867[var6] = this.field1867[var5];
            this.field1867[var5] = this.field1867[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lsm;B)[Lql;", line = 246)
    public static final class324[] method723(class120 arg0, byte arg1) {
        field1851++;
        if (!arg0.method825(true)) {
            return new class324[0];
        }
        class301 var2 = arg0.method823(29984);
        while (var2.field5121 == 0) {
            class290.method2001(10L, false);
        }
        if (var2.field5121 == 2) {
            return new class324[0];
        }
        if (arg1 >= -121) {
            method725((byte) -13);
        }
        int[] var3 = (int[]) ((int[]) var2.field5122);
        class324[] var4 = new class324[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class324 var6 = new class324();
            var4[var5] = var6;
            var6.field5563 = var3[var5 << 2];
            var6.field5562 = var3[(var5 << 2) + 1];
            var6.field5573 = var3[(var5 << 2) + 2];
            var6.field5565 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZIIIII)V", line = 293)
    public static final void method724(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            return;
        }
        field1870++;
        if (arg2 <= arg6) {
            return;
        }
        int var7 = arg6;
        int var8 = (arg2 + arg6) / 2;
        class67 var9 = class189.field3187[var8];
        class189.field3187[var8] = class189.field3187[arg2];
        class189.field3187[arg2] = var9;
        for (int var10 = arg6; var10 < arg2; var10++) {
            if (class216.method1542(arg3, arg4, var9, class189.field3187[var10], arg1, arg0, (byte) 70) <= 0) {
                class67 var11 = class189.field3187[var10];
                class189.field3187[var10] = class189.field3187[var7];
                class189.field3187[var7++] = var11;
            }
        }
        class189.field3187[arg2] = class189.field3187[var7];
        class189.field3187[var7] = var9;
        method724(arg0, arg1, var7 - 1, arg3, arg4, 0, arg6);
        method724(arg0, arg1, arg2, arg3, arg4, arg5, var7 - -1);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 337)
    public static void method725(byte arg0) {
        field1862 = null;
        field1873 = null;
        if (arg0 != -84) {
            method726((class153) null, 59);
        }
        field1864 = null;
        field1859 = null;
        field1855 = null;
        field1872 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIII)V", line = 611)
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1861 = arg3;
        this.field1853 = arg2;
        this.field1866 = arg0;
        this.field1850 = arg4;
        this.field1871 = arg1;
        this.method728(1194646348);
        this.method722((byte) 118);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lbc;I)Lcl;", line = 359)
    public static final class111 method726(class153 arg0, int arg1) {
        field1868++;
        if (arg1 > -31) {
            method726((class153) null, 123);
        }
        return new class111(arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1052(31521), arg0.method1107((byte) 82), arg0.method1107((byte) 82), arg0.method1082(-41));
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIZ)V", line = 394)
    public final void method727(int arg0, int arg1, int arg2, boolean arg3) {
        field1858++;
        int[] var5 = new int[arg1];
        int var6 = 0;
        if (arg3) {
            this.field1871 = -77;
        }
        while (arg1 > var6) {
            var5[var6] = (var6 << 12) / arg1;
            var6++;
        }
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg2; var8++) {
            var7[var8] = (var8 << 12) / arg2;
        }
        int[] var9 = new int[arg0];
        for (int var10 = 0; var10 < arg0; var10++) {
            var9[var10] = (var10 << 12) / arg0;
        }
        this.method85(4631);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field1871; var14++) {
                        int var15 = this.field1854[var14] << 12;
                        int var16 = var7[var12] * var15 >> 12;
                        int var17 = this.field1850 * var15 >> 12;
                        int var18 = this.field1861 * var16;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var9[var11] * var15 >> 12;
                        int var21 = this.field1850 * var20;
                        int var22 = this.field1853 * var15 >> 12;
                        int var23 = this.field1861 * var15 >> 12;
                        int var24 = var21 >> 12;
                        int var25 = var24 + 1;
                        int var26 = this.field1853 * var19;
                        int var27 = var18 >> 12;
                        int var28 = var24 & 0xFF;
                        int var29 = var26 >> 12;
                        int var30 = var29 + 1;
                        int var31;
                        if (var25 >= var17) {
                            var31 = 0;
                        } else {
                            var31 = var25 & 0xFF;
                        }
                        short var32 = this.field1867[var31];
                        int var33;
                        if (var22 > var30) {
                            var33 = var30 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var18 & 0xFFF;
                        int var35 = var26 & 0xFFF;
                        int var36 = var35 - 4096;
                        int var37 = class56.field900[var34];
                        int var38 = var21 & 0xFFF;
                        int var39 = class56.field900[var35];
                        short var40 = this.field1867[var28];
                        int var41 = var38 - 4096;
                        int var42 = var27 + 1;
                        int var43 = var29 & 0xFF;
                        int var44 = var34 - 4096;
                        int var45 = var27 & 0xFF;
                        int var46;
                        if (var42 < var23) {
                            var46 = var42 & 0xFF;
                        } else {
                            var46 = 0;
                        }
                        int var47 = class56.field900[var38];
                        short var48 = this.field1867[var32 + var46];
                        short var49 = this.field1867[var45 + var32];
                        short var50 = this.field1867[var40 + var46];
                        short var51 = this.field1867[var40 + var45];
                        int var52 = class317.method2170(this.field1867[var43 + var51], var38, var35, var34, 4014);
                        int var53 = class317.method2170(this.field1867[var33 + var51], var38, var36, var34, 4014);
                        int var54 = ((var53 - var52) * var39 >> 12) + var52;
                        int var55 = class317.method2170(this.field1867[var43 + var50], var38, var35, var44, 4014);
                        int var56 = class317.method2170(this.field1867[var33 + var50], var38, var36, var44, 4014);
                        int var57 = ((var56 - var55) * var39 >> 12) + var55;
                        int var58 = ((var57 - var54) * var37 >> 12) + var54;
                        int var59 = class317.method2170(this.field1867[var43 + var49], var41, var35, var34, 4014);
                        int var60 = class317.method2170(this.field1867[var33 + var49], var41, var36, var34, 4014);
                        int var61 = ((var60 - var59) * var39 >> 12) + var59;
                        int var62 = class317.method2170(this.field1867[var43 + var48], var41, var35, var44, 4014);
                        int var63 = class317.method2170(this.field1867[var33 + var48], var41, var36, var44, 4014);
                        int var64 = ((var63 - var62) * var39 >> 12) + var62;
                        int var65 = ((var64 - var61) * var37 >> 12) + var61;
                        this.method87(var14, (byte) -109, ((var65 - var58) * var47 >> 12) + var58);
                    }
                    this.method89(-93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 576)
    private final void method728(int arg0) {
        field1857++;
        if (arg0 == 1194646348) {
            this.field1854 = new short[this.field1871];
            for (int var2 = 0; var2 < this.field1871; var2++) {
                this.field1854[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)V")
    public abstract void method87(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public abstract void method89(int arg0);
}
