import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class182 {

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    private int field2636 = 0;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[S")
    private short[] field2638 = new short[512];

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public int field2637 = 4;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    private int field2646 = 4;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    private int field2645 = 4;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    private int field2644 = 4;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "[S")
    private short[] field2642;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lgs;B)Lsu;")
    public static final class590 method1212(class743 arg0, byte arg1) {
        field2641++;
        class590 var2;
        if (class164.field2256 == null) {
            var2 = new class590();
        } else {
            var2 = class164.field2256;
            class164.field2256 = class164.field2256.field8467;
            var2.field8467 = null;
            class232.field3221--;
        }
        int var3 = -80 % ((arg1 + 22) / 41);
        var2.field8468 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    private final void method1213(boolean arg0) {
        field2639++;
        Random var2 = new Random((long) this.field2636);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2638[var3] = (short) var3;
        }
        if (!arg0) {
            this.field2644 = 68;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class99.method676(var5, var2, -128);
            short var7 = this.field2638[var6];
            this.field2638[var6] = this.field2638[var5];
            this.field2638[var5] = this.field2638[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V")
    public abstract void method1214(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public abstract void method1215(int arg0);

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)Lah;")
    public static final class374 method1216(boolean arg0) {
        field2643++;
        class721 var1 = null;
        class374 var2 = new class374(class210.field2984, 0);
        try {
            class436 var3 = class379.field5339.method3596((byte) 117, "", arg0);
            while (var3.field5975 == 0) {
                class740.method4124(1L, 82);
            }
            if (var3.field5975 == 1) {
                var1 = (class721) var3.field5973;
                byte[] var4 = new byte[(int) var1.method4049(91)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method4046(var4, var5, -1, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class374(new class26(var4), class210.field2984, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method4048(1);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
    public final void method1217(int arg0, int arg1, int arg2, int arg3) {
        field2640++;
        int var5 = -17 / ((-arg0 - 28) / 49);
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var6[var8] = (var8 << 12) / arg3;
        }
        int[] var9 = new int[arg1];
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            var9[var11] = (var11 << 12) / arg1;
        }
        this.method1220(-55);
        for (int var12 = 0; var12 < arg1; var12++) {
            for (int var13 = 0; var13 < arg2; var13++) {
                for (int var14 = 0; var14 < arg3; var14++) {
                    for (int var15 = 0; var15 < this.field2637; var15++) {
                        int var16 = this.field2642[var15] << 12;
                        int var17 = var9[var12] * var16 >> 12;
                        int var18 = this.field2646 * var16 >> 12;
                        int var19 = var6[var14] * var16 >> 12;
                        int var20 = this.field2644 * var16 >> 12;
                        int var21 = var7[var13] * var16 >> 12;
                        int var22 = this.field2645 * var16 >> 12;
                        int var23 = this.field2645 * var19;
                        int var24 = this.field2644 * var21;
                        int var25 = this.field2646 * var17;
                        int var26 = var23 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var26 & 0xFF;
                        int var29 = var24 >> 12;
                        int var30 = var29 + 1;
                        int var31 = var29 & 0xFF;
                        int var32 = var25 >> 12;
                        int var33 = var32 + 1;
                        int var34 = var23 & 0xFFF;
                        int var35 = var25 & 0xFFF;
                        int var36;
                        if (var33 >= var18) {
                            var36 = 0;
                        } else {
                            var36 = var33 & 0xFF;
                        }
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var22 > var27) {
                            var38 = var27 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var32 & 0xFF;
                        int var40;
                        if (var20 > var30) {
                            var40 = var30 & 0xFF;
                        } else {
                            var40 = 0;
                        }
                        int var41 = class366.field4703[var35];
                        int var42 = var37 - 4096;
                        int var43 = class366.field4703[var34];
                        int var44 = var34 - 4096;
                        int var45 = var35 - 4096;
                        int var46 = class366.field4703[var37];
                        short var47 = this.field2638[var39];
                        short var48 = this.field2638[var36];
                        short var49 = this.field2638[var40 + var48];
                        short var50 = this.field2638[var40 + var47];
                        short var51 = this.field2638[var31 + var48];
                        short var52 = this.field2638[var31 + var47];
                        int var53 = class714.method4026(var34, var37, var35, 34962, this.field2638[var28 + var52]);
                        int var54 = class714.method4026(var44, var37, var35, 34962, this.field2638[var38 + var52]);
                        int var55 = ((var54 - var53) * var43 >> 12) + var53;
                        int var56 = class714.method4026(var34, var42, var35, 34962, this.field2638[var28 + var50]);
                        int var57 = class714.method4026(var44, var42, var35, 34962, this.field2638[var38 + var50]);
                        int var58 = ((var57 - var56) * var43 >> 12) + var56;
                        int var59 = ((var58 - var55) * var46 >> 12) + var55;
                        int var60 = class714.method4026(var34, var37, var45, 34962, this.field2638[var28 + var51]);
                        int var61 = class714.method4026(var44, var37, var45, 34962, this.field2638[var38 + var51]);
                        int var62 = ((var61 - var60) * var43 >> 12) + var60;
                        int var63 = class714.method4026(var34, var42, var45, 34962, this.field2638[var28 + var49]);
                        int var64 = class714.method4026(var44, var42, var45, 34962, this.field2638[var38 + var49]);
                        int var65 = ((var64 - var63) * var43 >> 12) + var63;
                        int var66 = ((var65 - var62) * var46 >> 12) + var62;
                        this.method1214(((var66 - var59) * var41 >> 12) + var59, var15, 114);
                    }
                    this.method1215(-122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public static final void method1218(int arg0) {
        if (arg0 == 0) {
            if (class188.field2742 == 2) {
                class523.field7347[0].method3396(class66.field912[0]);
                class523.field7347[1].method3396(class66.field912[1]);
            } else if (class188.field2742 == 3) {
                class523.field7347[0].method3396(class66.field912[0]);
                class523.field7347[1].method3396(class66.field912[1]);
                class523.field7347[2].method3396(class66.field912[2]);
            } else {
                class523.field7347[0].method3396(class66.field912[0]);
                class523.field7347[1].method3396(class66.field912[1]);
                class523.field7347[2].method3396(class66.field912[2]);
                class523.field7347[3].method3396(class66.field912[3]);
            }
        } else if (arg0 == 1) {
            if (class188.field2742 == 2) {
                class523.field7347[0].method3396(class66.field912[2]);
            } else if (class188.field2742 == 3) {
                class523.field7347[0].method3396(class66.field912[3]);
                class523.field7347[1].method3396(class66.field912[4]);
            } else {
                class523.field7347[0].method3396(class66.field912[4]);
                class523.field7347[1].method3396(class66.field912[5]);
                class523.field7347[2].method3396(class66.field912[6]);
            }
        } else if (arg0 == 2) {
            if (class188.field2742 == 2) {
                class523.field7347[0].method3396(class66.field912[3]);
                return;
            }
            if (class188.field2742 == 3) {
                class523.field7347[0].method3396(class66.field912[5]);
                return;
            }
            class523.field7347[0].method3396(class66.field912[7]);
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    private final void method1219(int arg0) {
        this.field2642 = new short[this.field2637];
        field2635++;
        if (arg0 != 13725) {
            this.method1215(114);
        }
        for (int var2 = 0; var2 < this.field2637; var2++) {
            this.field2642[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    public abstract void method1220(int arg0);

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIII)V")
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2646 = arg4;
        this.field2637 = arg1;
        this.field2644 = arg3;
        this.field2645 = arg2;
        this.field2636 = arg0;
        this.method1219(13725);
        this.method1213(true);
    }
}
