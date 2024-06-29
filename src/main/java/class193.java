import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class193 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[I")
    private int[] field2649;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
    private int[] field2645;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2654 = "Please remove ";

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2656 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lqc;")
    public static class99 field2646 = new class99(2);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    private int field2648;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field2652;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    private int field2653;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    private int field2655;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 8)
    public static void method1351(int arg0) {
        if (arg0 != 113044970) {
            method1352(-90, -51, -118);
        }
        field2654 = null;
        field2646 = null;
        field2656 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)J", line = 27)
    public static final long method1352(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2875; var4++) {
            class280 var5 = var3.field2896[var4];
            if ((var5.field4203 >> 29 & 0x3L) == 2L && var5.field4204 == arg1 && var5.field4200 == arg2) {
                return var5.field4203;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 49)
    private final void method1353(int arg0) {
        field2651++;
        if (arg0 >= -93) {
            method1351(64);
        }
        this.field2653 += ++this.field2655;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2645[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2652 ^= this.field2652 << 13;
                } else {
                    this.field2652 ^= this.field2652 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2652 ^= this.field2652 << 2;
            } else {
                this.field2652 ^= this.field2652 >>> 16;
            }
            this.field2652 += this.field2645[var2 + 128 & 0xFF];
            int var4;
            this.field2645[var2] = var4 = this.field2653 + this.field2645[class47.method303(var3, 1020) >> 2] + this.field2652;
            this.field2649[var2] = this.field2653 = var3 + this.field2645[class47.method303(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 94)
    private final void method1354(byte arg0) {
        field2647++;
        if (arg0 != 76) {
            return;
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
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var6 + var11;
            int var15 = var7 + var14;
            int var16 = var5 + var13;
            int var17 = var15 ^ var14 << 8;
            int var18 = var4 + var17;
            int var19 = var14 + var16;
            var6 = var19 ^ var16 >>> 16;
            int var20 = var16 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var22 << 8;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var17;
            var8 = var3 + var13;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2649[var27 + 3] + var6;
            int var29 = this.field2649[var27 + 1] + var8;
            int var30 = this.field2649[var27] + var9;
            int var31 = var30 ^ var29 << 11;
            int var32 = this.field2649[var27 + 7] + var2;
            int var33 = var28 + var31;
            int var34 = this.field2649[var27 + 2] + var7;
            int var35 = this.field2649[var27 + 6] + var3;
            int var36 = var29 + var34;
            int var37 = var36 ^ var34 >>> 2;
            int var38 = this.field2649[var27 + 4] + var5;
            int var39 = var37 + var38;
            int var40 = this.field2649[var27 + 5] + var4;
            int var41 = var33 + var34;
            int var42 = var41 ^ var33 << 8;
            int var43 = var33 + var39;
            var6 = var43 ^ var39 >>> 16;
            int var44 = var40 + var42;
            int var45 = var6 + var35;
            int var46 = var39 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            var4 = var47 ^ var45 >>> 4;
            int var48 = var5 + var32;
            int var49 = var4 + var31;
            int var50 = var45 + var48;
            var3 = var50 ^ var48 << 8;
            var8 = var3 + var37;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            var7 = var2 + var42;
            this.field2645[var27] = var9;
            this.field2645[var27 + 1] = var8;
            this.field2645[var27 + 2] = var7;
            this.field2645[var27 + 3] = var6;
            this.field2645[var27 + 4] = var5;
            this.field2645[var27 + 5] = var4;
            this.field2645[var27 + 6] = var3;
            this.field2645[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2645[var52 + 6] + var3;
            int var54 = this.field2645[var52 + 4] + var5;
            int var55 = this.field2645[var52 + 7] + var2;
            int var56 = this.field2645[var52 + 1] + var8;
            int var57 = this.field2645[var52 + 3] + var6;
            int var58 = this.field2645[var52] + var9;
            int var59 = var58 ^ var56 << 11;
            int var60 = var57 + var59;
            int var61 = this.field2645[var52 + 5] + var4;
            int var62 = this.field2645[var52 + 2] + var7;
            int var63 = var56 + var62;
            int var64 = var63 ^ var62 >>> 2;
            int var65 = var54 + var64;
            int var66 = var60 + var62;
            int var67 = var66 ^ var60 << 8;
            int var68 = var61 + var67;
            int var69 = var60 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var6 + var53;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var5 + var55;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var59;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var75;
            this.field2645[var52] = var9;
            this.field2645[var52 + 1] = var8;
            this.field2645[var52 + 2] = var7;
            this.field2645[var52 + 3] = var6;
            this.field2645[var52 + 4] = var5;
            this.field2645[var52 + 5] = var4;
            this.field2645[var52 + 6] = var3;
            this.field2645[var52 + 7] = var2;
        }
        this.method1353(-117);
        this.field2648 = 256;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 244)
    private class193() {
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([I)V", line = 251)
    public class193(int[] arg0) {
        this.field2649 = new int[256];
        this.field2645 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2649[var2] = arg0[var2];
        }
        this.method1354((byte) 76);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)I", line = 275)
    public final int method1355(byte arg0) {
        if ((this.field2648--) == 0) {
            this.method1353(-113);
            this.field2648 = 255;
        }
        if (arg0 <= 99) {
            method1351(-119);
        }
        field2650++;
        return this.field2649[this.field2648];
    }
}
