import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class170 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    private int[] field2550;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
    private int[] field2551;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2553 = "red:";

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2556 = "glow1:";

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2555 = -2;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
    public static boolean field2549 = true;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2563 = "wishes to trade with you.";

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Ljava/util/Random;")
    public static Random field2548 = new Random();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field2547;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "J")
    public static long field2552;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lli;")
    public static class182 field2560;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Llm;")
    public static class210 field2561;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 10)
    private final void method1188(byte arg0) {
        field2562++;
        if (arg0 < 36) {
            field2563 = (String) null;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var5 + var14;
            int var18 = var4 + var16;
            int var19 = var12 + var17;
            var6 = var19 ^ var17 >>> 16;
            int var20 = var3 + var6;
            int var21 = var17 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var20 + var22;
            int var25 = var4 + var11;
            var3 = var24 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var16;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2551[var27 + 6] + var3;
            int var29 = this.field2551[var27 + 1] + var8;
            int var30 = this.field2551[var27 + 5] + var4;
            int var31 = this.field2551[var27 + 4] + var5;
            int var32 = this.field2551[var27 + 2] + var7;
            int var33 = this.field2551[var27 + 7] + var2;
            int var34 = this.field2551[var27] + var9;
            int var35 = this.field2551[var27 + 3] + var6;
            int var36 = var34 ^ var29 << 11;
            int var37 = var29 + var32;
            int var38 = var35 + var36;
            int var39 = var37 ^ var32 >>> 2;
            int var40 = var32 + var38;
            int var41 = var31 + var39;
            int var42 = var40 ^ var38 << 8;
            int var43 = var38 + var41;
            var6 = var43 ^ var41 >>> 16;
            int var44 = var30 + var42;
            int var45 = var41 + var44;
            var5 = var45 ^ var44 << 10;
            int var46 = var5 + var33;
            int var47 = var6 + var28;
            int var48 = var44 + var47;
            var4 = var48 ^ var47 >>> 4;
            int var49 = var4 + var36;
            int var50 = var46 + var47;
            var3 = var50 ^ var46 << 8;
            var8 = var3 + var39;
            int var51 = var46 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            this.field2550[var27] = var9;
            this.field2550[var27 + 1] = var8;
            var7 = var2 + var42;
            this.field2550[var27 + 2] = var7;
            this.field2550[var27 + 3] = var6;
            this.field2550[var27 + 4] = var5;
            this.field2550[var27 + 5] = var4;
            this.field2550[var27 + 6] = var3;
            this.field2550[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2550[var52] + var9;
            int var54 = this.field2550[var52 + 1] + var8;
            int var55 = this.field2550[var52 + 4] + var5;
            int var56 = this.field2550[var52 + 7] + var2;
            int var57 = this.field2550[var52 + 5] + var4;
            int var58 = var53 ^ var54 << 11;
            int var59 = this.field2550[var52 + 3] + var6;
            int var60 = this.field2550[var52 + 2] + var7;
            int var61 = var58 + var59;
            int var62 = var54 + var60;
            int var63 = var62 ^ var60 >>> 2;
            int var64 = var55 + var63;
            int var65 = var60 + var61;
            int var66 = var65 ^ var61 << 8;
            int var67 = var61 + var64;
            int var68 = var57 + var66;
            var6 = var67 ^ var64 >>> 16;
            int var69 = var64 + var68;
            var5 = var69 ^ var68 << 10;
            int var70 = this.field2550[var52 + 6] + var3;
            int var71 = var5 + var56;
            int var72 = var6 + var70;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var58;
            var3 = var74 ^ var71 << 8;
            int var76 = var71 + var75;
            var8 = var3 + var63;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            this.field2550[var52] = var9;
            var7 = var2 + var66;
            this.field2550[var52 + 1] = var8;
            this.field2550[var52 + 2] = var7;
            this.field2550[var52 + 3] = var6;
            this.field2550[var52 + 4] = var5;
            this.field2550[var52 + 5] = var4;
            this.field2550[var52 + 6] = var3;
            this.field2550[var52 + 7] = var2;
        }
        this.method1192(117);
        this.field2546 = 256;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIII)V", line = 165)
    public static final void method1189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2545++;
        if (arg7 != 29250) {
            field2560 = (class182) null;
        }
        int var9 = arg2 - arg1;
        int var10 = arg5 - arg0;
        int var11 = (arg6 - arg8 << 16) / var9;
        int var12 = (arg4 - arg3 << 16) / var10;
        class44.method289(arg5, arg3, var12, 0, (byte) -16, arg1, var11, arg0, arg8, 0, arg2);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 190)
    public static void method1190(int arg0) {
        field2560 = null;
        field2548 = null;
        field2556 = null;
        field2561 = null;
        if (arg0 == 17605) {
            field2553 = null;
            field2563 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I", line = 209)
    public final int method1191(byte arg0) {
        if (arg0 <= 60) {
            return 110;
        }
        if (this.field2546-- == 0) {
            this.method1192(127);
            this.field2546 = 255;
        }
        field2559++;
        return this.field2551[this.field2546];
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 227)
    private final void method1192(int arg0) {
        field2564++;
        if (arg0 <= 104) {
            return;
        }
        this.field2547 += ++this.field2558;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2550[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2565 ^= this.field2565 << 13;
                } else {
                    this.field2565 ^= this.field2565 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2565 ^= this.field2565 << 2;
            } else {
                this.field2565 ^= this.field2565 >>> 16;
            }
            this.field2565 += this.field2550[var2 + 128 & 0xFF];
            int var4;
            this.field2550[var2] = var4 = this.field2550[class124.method893(var3 >> 2, 255)] + this.field2565 + this.field2547;
            this.field2551[var2] = this.field2547 = var3 + this.field2550[class124.method893(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 295)
    private class170() {
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([I)V", line = 297)
    public class170(int[] arg0) {
        this.field2550 = new int[256];
        this.field2551 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2551[var2] = arg0[var2];
        }
        this.method1188((byte) 41);
    }
}
