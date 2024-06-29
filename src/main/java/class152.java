import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class152 {

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "[I")
    private int[] field2697;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
    private int[] field2691;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    private int field2694;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[B")
    public static byte[][][] field2683;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 6)
    public static void method1195(byte arg0) {
        field2683 = (byte[][][]) null;
        if (arg0 > -123) {
            field2686 = 103;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1196(int arg0) {
        class13 var1 = class296.field4723;
        synchronized (class296.field4723) {
            if (arg0 != 15744) {
                return;
            }
            class18.field299++;
            class253.field4075 = class101.field1635;
            if (class140.field2569 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class97.field1572[var2] = false;
                }
                class140.field2569 = class17.field282;
            } else {
                while (class17.field282 != class140.field2569) {
                    int var3 = class176.field2995[class17.field282];
                    class17.field282 = class17.field282 + 1 & 0x7F;
                    if (var3 < 0) {
                        class97.field1572[~var3] = false;
                    } else {
                        class97.field1572[var3] = true;
                    }
                }
            }
            class101.field1635 = class331.field5276;
        }
        field2679++;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lqh;", line = 77)
    public static final class325 method1197(byte arg0) {
        field2685++;
        if (arg0 <= 78) {
            method1196(12);
        }
        return class38.field552;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V", line = 88)
    public static final void method1198(byte arg0) {
        class41.field612.method466(arg0 + 84);
        if (arg0 == -85) {
            field2680++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lpi;I)V", line = 101)
    public static final void method1199(class336 arg0, int arg1) {
        field2681++;
        byte[] var2 = new byte[arg1];
        if (class112.field1881 != null) {
            try {
                class112.field1881.method1864(0L, 111);
                class112.field1881.method1869((byte) -89, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method2345((byte) 115, 24, var2, 0);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 143)
    public static final void method1200(int arg0) {
        if (arg0 != 6) {
            return;
        }
        field2696++;
        for (class287 var1 = (class287) class203.field3460.method2297(14204); var1 != null; var1 = (class287) class203.field3460.method2291(-126)) {
            if (var1.field4568 == -1) {
                var1.field4584 = 0;
                class318.method2188((byte) 105, var1);
            } else {
                var1.method2195(arg0 ^ 0xFFFFFFF9);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V", line = 173)
    private final void method1201(byte arg0) {
        field2688++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 < 27) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var7 + var13;
            int var16 = var5 + var14;
            int var17 = var15 ^ var13 << 8;
            int var18 = var13 + var16;
            int var19 = var4 + var17;
            var6 = var18 ^ var16 >>> 16;
            int var20 = var3 + var6;
            int var21 = var16 + var19;
            var5 = var21 ^ var19 << 10;
            int var22 = var19 + var20;
            int var23 = var2 + var5;
            var4 = var22 ^ var20 >>> 4;
            int var24 = var20 + var23;
            var3 = var24 ^ var23 << 8;
            int var25 = var4 + var11;
            var8 = var3 + var14;
            int var26 = var23 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2691[var27 + 6] + var3;
            int var29 = this.field2691[var27 + 3] + var6;
            int var30 = this.field2691[var27 + 2] + var7;
            int var31 = this.field2691[var27 + 7] + var2;
            int var32 = this.field2691[var27 + 4] + var5;
            int var33 = this.field2691[var27 + 5] + var4;
            int var34 = this.field2691[var27] + var9;
            int var35 = this.field2691[var27 + 1] + var8;
            int var36 = var34 ^ var35 << 11;
            int var37 = var30 + var35;
            int var38 = var29 + var36;
            int var39 = var37 ^ var30 >>> 2;
            int var40 = var30 + var38;
            int var41 = var32 + var39;
            int var42 = var40 ^ var38 << 8;
            int var43 = var33 + var42;
            int var44 = var38 + var41;
            var6 = var44 ^ var41 >>> 16;
            int var45 = var6 + var28;
            int var46 = var41 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var31;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field2697[var27] = var9;
            this.field2697[var27 + 1] = var8;
            this.field2697[var27 + 2] = var7;
            this.field2697[var27 + 3] = var6;
            this.field2697[var27 + 4] = var5;
            this.field2697[var27 + 5] = var4;
            this.field2697[var27 + 6] = var3;
            this.field2697[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2697[var52 + 4] + var5;
            int var54 = this.field2697[var52 + 2] + var7;
            int var55 = this.field2697[var52 + 1] + var8;
            int var56 = this.field2697[var52] + var9;
            int var57 = this.field2697[var52 + 3] + var6;
            int var58 = this.field2697[var52 + 7] + var2;
            int var59 = this.field2697[var52 + 5] + var4;
            int var60 = var56 ^ var55 << 11;
            int var61 = var57 + var60;
            int var62 = var54 + var55;
            int var63 = this.field2697[var52 + 6] + var3;
            int var64 = var62 ^ var54 >>> 2;
            int var65 = var54 + var61;
            int var66 = var65 ^ var61 << 8;
            int var67 = var59 + var66;
            int var68 = var53 + var64;
            int var69 = var61 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var6 + var63;
            int var71 = var67 + var68;
            var5 = var71 ^ var67 << 10;
            int var72 = var5 + var58;
            int var73 = var67 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var60;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            this.field2697[var52] = var9;
            var7 = var2 + var66;
            this.field2697[var52 + 1] = var8;
            this.field2697[var52 + 2] = var7;
            this.field2697[var52 + 3] = var6;
            this.field2697[var52 + 4] = var5;
            this.field2697[var52 + 5] = var4;
            this.field2697[var52 + 6] = var3;
            this.field2697[var52 + 7] = var2;
        }
        this.method1203((byte) 76);
        this.field2682 = 256;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)I", line = 320)
    public final int method1202(int arg0) {
        int var2 = 101 % ((-arg0 - 15) / 51);
        if (this.field2682-- == 0) {
            this.method1203((byte) 67);
            this.field2682 = 255;
        }
        field2695++;
        return this.field2691[this.field2682];
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V", line = 338)
    private final void method1203(byte arg0) {
        this.field2694 += ++this.field2693;
        field2690++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2697[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2684 ^= this.field2684 << 13;
                } else {
                    this.field2684 ^= this.field2684 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2684 ^= this.field2684 << 2;
            } else {
                this.field2684 ^= this.field2684 >>> 16;
            }
            this.field2684 += this.field2697[var2 + 128 & 0xFF];
            int var4;
            this.field2697[var2] = var4 = this.field2694 + this.field2697[class36.method319(1020, var3) >> 2] + this.field2684;
            this.field2691[var2] = this.field2694 = var3 + this.field2697[class36.method319(1020, var4 >> 8) >> 2];
        }
        if (arg0 <= 64) {
            this.method1203((byte) -118);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 380)
    private class152() {
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([I)V", line = 382)
    public class152(int[] arg0) {
        this.field2697 = new int[256];
        this.field2691 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2691[var2] = arg0[var2];
        }
        this.method1201((byte) 48);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I", line = 402)
    public static final int method1204(int arg0, int arg1, int arg2) {
        field2689++;
        if (arg0 != 30298) {
            method1200(14);
        }
        int var3 = (class190.method1440(4, arg1 + 91923, arg2 + 45365, 0) + (class190.method1440(2, arg1 + 37821, arg2 + 10294, 0) - 128 >> 1) + (class190.method1440(1, arg1, arg2, 0) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
