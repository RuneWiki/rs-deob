import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class344 {

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    private int field5338 = 4;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    private int field5341 = 0;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field5339 = 4;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    private int field5343 = 4;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "[S")
    private short[] field5347 = new short[512];

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    private int field5348 = 4;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field5333 = 0;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5334 = new String[1000];

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Z")
    public static boolean field5340 = false;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[[S")
    public static short[][] field5335 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "[S")
    private short[] field5346;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2385(byte arg0) {
        if (class180.field2863 < 0) {
            class180.field2863 = 0;
            class32.field496 = -1;
            class339.field5234 = -1;
        }
        if (class180.field2863 > class113.field1833) {
            class32.field496 = -1;
            class339.field5234 = -1;
            class180.field2863 = class113.field1833;
        }
        field5345++;
        if (class67.field1013 < 0) {
            class32.field496 = -1;
            class339.field5234 = -1;
            class67.field1013 = 0;
        }
        if (class67.field1013 > class286.field4473) {
            class339.field5234 = -1;
            class32.field496 = -1;
            class67.field1013 = class286.field4473;
        }
        if (arg0 != 25) {
            method2390(36);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V", line = 51)
    public static void method2386(byte arg0) {
        if (arg0 < 78) {
            method2386((byte) -57);
        }
        field5335 = (short[][]) null;
        field5334 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIBI)V", line = 68)
    public final void method2387(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -26) {
            this.field5347 = (short[]) null;
        }
        field5342++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg3; var8++) {
            var7[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var5[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var6[var10] = (var10 << 12) / arg0;
        }
        this.method160((byte) 94);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field5339; var14++) {
                        int var15 = this.field5346[var14] << 12;
                        int var16 = var5[var12] * var15 >> 12;
                        int var17 = var6[var11] * var15 >> 12;
                        int var18 = var7[var13] * var15 >> 12;
                        int var19 = this.field5343 * var15 >> 12;
                        int var20 = this.field5343 * var17;
                        int var21 = this.field5338 * var18;
                        int var22 = this.field5348 * var15 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var20 & 0xFFF;
                        int var25 = var24 - 4096;
                        int var26 = this.field5348 * var16;
                        int var27 = var21 >> 12;
                        int var28 = var27 + 1;
                        int var29 = class264.field3909[var24];
                        int var30 = var27 & 0xFF;
                        int var31 = var26 >> 12;
                        int var32 = var26 & 0xFFF;
                        int var33 = class264.field3909[var32];
                        int var34 = var21 & 0xFFF;
                        int var35 = var34 - 4096;
                        int var36 = var31 + 1;
                        int var37 = class264.field3909[var34];
                        int var38 = var23 + 1;
                        int var39;
                        if (var22 <= var36) {
                            var39 = 0;
                        } else {
                            var39 = var36 & 0xFF;
                        }
                        int var40 = var31 & 0xFF;
                        int var41;
                        if (var38 >= var19) {
                            var41 = 0;
                        } else {
                            var41 = var38 & 0xFF;
                        }
                        short var42 = this.field5347[var41];
                        int var43 = var23 & 0xFF;
                        int var44 = this.field5338 * var15 >> 12;
                        short var45 = this.field5347[var40 + var42];
                        short var46 = this.field5347[var39 + var42];
                        int var47;
                        if (var44 <= var28) {
                            var47 = 0;
                        } else {
                            var47 = var28 & 0xFF;
                        }
                        int var48 = var32 - 4096;
                        short var49 = this.field5347[var43];
                        short var50 = this.field5347[var40 + var49];
                        short var51 = this.field5347[var39 + var49];
                        int var52 = class310.method2193(this.field5347[var30 + var50], var32, (byte) 126, var24, var34);
                        int var53 = class310.method2193(this.field5347[var47 + var50], var32, (byte) 121, var24, var35);
                        int var54 = ((var53 - var52) * var37 >> 12) + var52;
                        int var55 = class310.method2193(this.field5347[var30 + var51], var48, (byte) 119, var24, var34);
                        int var56 = class310.method2193(this.field5347[var47 + var51], var48, (byte) 118, var24, var35);
                        int var57 = ((var56 - var55) * var37 >> 12) + var55;
                        int var58 = ((var57 - var54) * var33 >> 12) + var54;
                        int var59 = class310.method2193(this.field5347[var30 + var45], var32, (byte) 127, var25, var34);
                        int var60 = class310.method2193(this.field5347[var45 + var47], var32, (byte) 123, var25, var35);
                        int var61 = var59 + ((var60 - var59) * var37 >> 12);
                        int var62 = class310.method2193(this.field5347[var30 + var46], var48, (byte) 120, var25, var34);
                        int var63 = class310.method2193(this.field5347[var46 + var47], var48, (byte) 124, var25, var35);
                        int var64 = ((var63 - var62) * var37 >> 12) + var62;
                        int var65 = ((var64 - var61) * var33 >> 12) + var61;
                        this.method161(((var65 - var58) * var29 >> 12) + var58, var14, arg2 ^ 0xFFFFFFE7);
                    }
                    this.method163((byte) -8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 241)
    private final void method2388(int arg0) {
        this.field5346 = new short[this.field5339];
        int var2 = -92 % ((arg0 + 28) / 60);
        for (int var3 = 0; var3 < this.field5339; var3++) {
            this.field5346[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
        field5337++;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIII)V", line = 491)
    public class344(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5348 = arg3;
        this.field5339 = arg1;
        this.field5338 = arg2;
        this.field5343 = arg4;
        this.field5341 = arg0;
        this.method2388(-115);
        this.method2389(86);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 277)
    private final void method2389(int arg0) {
        field5336++;
        Random var2 = new Random((long) this.field5341);
        if (arg0 < 29) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5347[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class64.method509(var5, var2, 39);
            short var7 = this.field5347[var6];
            this.field5347[var6] = this.field5347[var5];
            this.field5347[var5] = this.field5347[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 336)
    public static final void method2390(int arg0) {
        field5344++;
        if (class109.field1774 != null || class86.field1377 != null || arg0 != 0) {
            return;
        }
        int var1 = class200.field3072;
        if (!class260.field3858) {
            if (var1 == 1 && class137.field2225 > 0) {
                short var2 = class120.field1960[class137.field2225 - 1];
                if (var2 == 51 || var2 == 28 || var2 == 13 || var2 == 43 || var2 == 33 || var2 == 35 || var2 == 15 || var2 == 2 || var2 == 37 || var2 == 36 || var2 == 1 || var2 == 1006) {
                    int var3 = class304.field4847[class137.field2225 - 1];
                    int var4 = class247.field3683[class137.field2225 - 1];
                    class266 var5 = class171.method1276(var4, (byte) -115);
                    class257 var6 = client.method1867(var5);
                    if (var6.method1780(arg0 ^ 0x7F) || var6.method1786(arg0 + 118)) {
                        class9.field216 = 0;
                        class8.field204 = false;
                        if (class109.field1774 != null) {
                            class280.method1971((byte) 101, class109.field1774);
                        }
                        class109.field1774 = class171.method1276(var4, (byte) 56);
                        class89.field1424 = class170.field2740;
                        class85.field1369 = class243.field3639;
                        class16.field334 = var3;
                        class280.method1971((byte) 101, class109.field1774);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class118.field1907 == 1 && class137.field2225 > 2 || class221.method1607(0, class137.field2225 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class137.field2225 > 0 || class4.field109 == 1) {
                class136.method1051(true);
            }
            if (var1 == 1 && class137.field2225 > 0 || class4.field109 == 2) {
                class345.method2394((byte) 106);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class303.field4832;
            int var8 = class22.field389;
            if ((class37.field554 - 10) > var7 || var7 > class37.field554 + class99.field1591 + 10 || (class315.field4968 - 10) > var8 || (class326.field5096 + class315.field4968 + 10) < var8) {
                class260.field3858 = false;
                class318.method2250(class99.field1591, -89, class326.field5096, class37.field554, class315.field4968);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class315.field4968;
        int var10 = class37.field554;
        int var11 = class99.field1591;
        int var12 = class170.field2740;
        int var13 = class243.field3639;
        int var14 = -1;
        for (int var15 = 0; var15 < class137.field2225; var15++) {
            if (class183.field2908) {
                int var17 = ((class137.field2225 - var15 - 1) * 15) + var9 + 33;
                if (var10 < var12 && var12 < var10 + var11 && var13 > var17 - 13 && var17 + 3 > var13) {
                    var14 = var15;
                }
            } else {
                int var16 = var9 + ((class137.field2225 - var15 - 1) * 15) + 31;
                if (var12 > var10 && var12 < var10 + var11 && (var16 - 13) < var13 && var13 < var16 + 3) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class147.method1123((byte) -101, var14);
        }
        class260.field3858 = false;
        class318.method2250(class99.field1591, -105, class326.field5096, class37.field554, class315.field4968);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIILeh;JZ)V", line = 470)
    public static final void method2391(int arg0, int arg1, int arg2, int arg3, class179 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class241 var8 = new class241();
        var8.field3609 = arg4;
        var8.field3603 = arg1 * 128 + 64;
        var8.field3613 = arg2 * 128 + 64;
        var8.field3611 = arg3;
        var8.field3605 = arg5;
        var8.field3604 = arg6;
        if (class34.field521[arg0][arg1][arg2] == null) {
            class34.field521[arg0][arg1][arg2] = new class42(arg0, arg1, arg2);
        }
        class34.field521[arg0][arg1][arg2].field655 = var8;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
    public abstract void method160(byte arg0);

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V")
    public abstract void method163(byte arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
    public abstract void method161(int arg0, int arg1, int arg2);
}
