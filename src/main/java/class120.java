import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class120 {

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    private int field1864 = 4;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    private int field1859 = 4;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[S")
    private short[] field1869 = new short[512];

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public int field1872 = 4;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    private int field1873 = 0;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    private int field1874 = 4;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[[Z")
    public static boolean[][] field1858 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[J")
    public static long[] field1866 = new long[32];

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field1865 = 0;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
    public static int[] field1870 = new int[2];

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1871 = "Close";

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1876 = "Checking for updates - ";

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[S")
    private short[] field1860;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 9)
    private final void method1046(int arg0) {
        field1868++;
        Random var2 = new Random((long) this.field1873);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1869[var3] = (short) var3;
        }
        if (arg0 != 4095) {
            this.method223(true);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class67.method659(var5, var2, true);
            short var7 = this.field1869[var6];
            this.field1869[var6] = this.field1869[var5];
            this.field1869[var5] = this.field1869[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V", line = 47)
    public static final void method1047(int arg0, int arg1, int arg2) {
        field1867++;
        class138 var3 = class149.method1242(arg1, 0, 14);
        var3.method1153((byte) 50);
        if (arg2 != 2253) {
            method1048(true);
        }
        var3.field2282 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 63)
    public static void method1048(boolean arg0) {
        if (arg0) {
            return;
        }
        field1871 = null;
        field1858 = (boolean[][]) null;
        field1876 = null;
        field1870 = null;
        field1866 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIII)V", line = 326)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1872 = arg1;
        this.field1864 = arg2;
        this.field1874 = arg3;
        this.field1873 = arg0;
        this.field1859 = arg4;
        this.method1049(5133);
        this.method1046(4095);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V", line = 92)
    private final void method1049(int arg0) {
        field1875++;
        this.field1860 = new short[this.field1872];
        int var2 = 0;
        if (arg0 == 5133) {
            while (this.field1872 > var2) {
                this.field1860[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                var2++;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)V", line = 140)
    public final void method1050(int arg0, int arg1, int arg2, int arg3) {
        field1862++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = arg0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method223(false);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field1872; var14++) {
                        int var15 = this.field1860[var14] << 12;
                        int var16 = this.field1874 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field1859 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field1864 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field1859 * var21;
                        int var23 = this.field1874 * var19;
                        int var24 = var23 >> 12;
                        int var25 = this.field1864 * var17;
                        int var26 = var25 >> 12;
                        int var27 = var24 + 1;
                        int var28 = var22 >> 12;
                        int var29 = var24 & 0xFF;
                        int var30 = var25 & 0xFFF;
                        int var31 = var30 - 4096;
                        int var32;
                        if (var27 < var16) {
                            var32 = var27 & 0xFF;
                        } else {
                            var32 = 0;
                        }
                        int var33 = class212.field3298[var30];
                        int var34 = var23 & 0xFFF;
                        int var35 = var34 - 4096;
                        int var36 = var26 + 1;
                        int var37 = var28 + 1;
                        int var38 = class212.field3298[var34];
                        int var39;
                        if (var36 >= var20) {
                            var39 = 0;
                        } else {
                            var39 = var36 & 0xFF;
                        }
                        int var40 = var26 & 0xFF;
                        int var41 = var28 & 0xFF;
                        int var42 = var22 & 0xFFF;
                        int var43 = class212.field3298[var42];
                        short var44 = this.field1869[var41];
                        short var45 = this.field1869[var32 + var44];
                        int var46;
                        if (var18 > var37) {
                            var46 = var37 & 0xFF;
                        } else {
                            var46 = 0;
                        }
                        short var47 = this.field1869[var46];
                        int var48 = var42 - 4096;
                        short var49 = this.field1869[var32 + var47];
                        short var50 = this.field1869[var29 + var47];
                        short var51 = this.field1869[var29 + var44];
                        int var52 = class268.method1968(var42, (byte) 98, var30, this.field1869[var40 + var51], var34);
                        int var53 = class268.method1968(var42, (byte) -115, var31, this.field1869[var39 + var51], var34);
                        int var54 = var52 + ((var53 - var52) * var33 >> 12);
                        int var55 = class268.method1968(var42, (byte) 91, var30, this.field1869[var40 + var45], var35);
                        int var56 = class268.method1968(var42, (byte) -108, var31, this.field1869[var39 + var45], var35);
                        int var57 = ((var56 - var55) * var33 >> 12) + var55;
                        int var58 = ((var57 - var54) * var38 >> 12) + var54;
                        int var59 = class268.method1968(var48, (byte) -20, var30, this.field1869[var40 + var50], var34);
                        int var60 = class268.method1968(var48, (byte) -126, var31, this.field1869[var39 + var50], var34);
                        int var61 = ((var60 - var59) * var33 >> 12) + var59;
                        int var62 = class268.method1968(var48, (byte) 116, var30, this.field1869[var40 + var49], var35);
                        int var63 = class268.method1968(var48, (byte) -71, var31, this.field1869[var39 + var49], var35);
                        int var64 = var62 + ((var63 - var62) * var33 >> 12);
                        int var65 = ((var64 - var61) * var38 >> 12) + var61;
                        this.method221(var14, ((var65 - var58) * var43 >> 12) + var58, arg0 + 512);
                    }
                    this.method224(arg0 ^ 0xCC40FCAC);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public abstract void method221(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public abstract void method224(int arg0);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public abstract void method223(boolean arg0);
}
