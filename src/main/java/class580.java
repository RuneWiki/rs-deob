import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class580 extends Canvas {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field8246;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Z")
    public static boolean field8247 = false;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3365(byte arg0) {
        field8248++;
        class254.field3653 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class470.field6859[var1] = null;
            class661.field9247[var1] = 1;
            class581.field8256[var1] = null;
        }
        if (arg0 != 94) {
            field8247 = true;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 29)
    public class580(Component arg0) {
        this.field8246 = arg0;
    }

    @OriginalMember(owner = "client!iu", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 37)
    public final void update(Graphics arg0) {
        field8245++;
        this.field8246.update(arg0);
    }

    @OriginalMember(owner = "client!iu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 45)
    public final void paint(Graphics arg0) {
        field8244++;
        this.field8246.paint(arg0);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lha;ILsca;II)V", line = 59)
    public static final void method3366(class60 arg0, int arg1, class46 arg2, int arg3, int arg4) {
        field8243++;
        class488 var5 = arg2.method339(arg0, 30475);
        if (var5 == null) {
            return;
        }
        int var6 = 64 % ((-arg3 - 65) / 54);
        arg0.method476(arg4, arg1, arg4 + arg2.field549, arg1 - -arg2.field574);
        if (class567.field8049 == 2 || class567.field8049 == 5 || class741.field10402 == null) {
            arg0.method435(-16777216, var5, arg4, arg1);
            return;
        }
        int var7;
        int var8;
        int var9;
        int var10;
        if (class264.field3784 == 4) {
            var10 = class189.field2869;
            var9 = (int) (-class255.field3659) & 0x3FFF;
            var8 = class537.field7685;
            var7 = 4096;
        } else {
            var7 = 4096 - class305.field4322 * 16;
            var8 = class130.field1749.field8428;
            var9 = (int) (-class255.field3659) + class748.field10464 & 0x3FFF;
            var10 = class130.field1749.field8423;
        }
        int var11 = 48 - (((class194.field2946 - 104) * 2) - (var10 / 128));
        int var12 = (class255.field3656 * 4) + 48 - (var8 / 128) - ((class255.field3656 + -104) * 2);
        class741.field10402.method3145((float) arg2.field549 / 2.0F + (float) arg4, (float) arg2.field574 / 2.0F + (float) arg1, (float) var11, (float) var12, var7, var9 << 2, var5, arg4, arg1);
        for (class317 var13 = (class317) class673.field9382.method1195(0); var13 != null; var13 = (class317) class673.field9382.method1201(2)) {
            int var59 = var13.field4518;
            int var60 = (class567.field8057.field2353[var59] >> 14 & 0x3FFF) - class361.field5224;
            int var61 = (class567.field8057.field2353[var59] & 0x3FFF) - class582.field8288;
            int var62 = var60 * 4 + 2 - (var10 / 128);
            int var63 = var61 * 4 - ((var8 / 128) - 2);
            class280.method1788(class567.field8057.field2348[var59], arg2, arg0, var63, arg4, 22087, var62, var5, arg1);
        }
        for (int var14 = 0; var14 < class45.field511; var14++) {
            int var56 = class461.field6801[var14] * 4 + 2 - (var10 / 128);
            int var57 = class309.field4388[var14] * 4 + 2 - (var8 / 128);
            class211 var58 = class239.field3470.method388(class188.field2857[var14], 100);
            if (var58.field3172 != null) {
                var58 = var58.method1442((byte) -31, class83.field1160);
                if (var58 == null || var58.field3118 == -1) {
                    continue;
                }
            }
            class280.method1788(var58.field3118, arg2, arg0, var57, arg4, 22087, var56, var5, arg1);
        }
        for (class258 var15 = (class258) class12.field173.method2283(false); var15 != null; var15 = (class258) class12.field173.method2282((byte) 54)) {
            int var51 = (int) (var15.field2810 >> 28 & 0x3L);
            if (class390.field5885 == var51) {
                int var52 = (int) (var15.field2810 & 0x3FFFL) - class361.field5224;
                int var53 = (int) (var15.field2810 >> 14 & 0x3FFFL) - class582.field8288;
                int var54 = var52 * 4 + 2 - (var10 / 128);
                int var55 = var53 * 4 + 2 - (var8 / 128);
                class260.method1688((byte) -96, var5, var55, arg1, arg2, class667.field9350[0], arg4, var54);
            }
        }
        for (int var16 = 0; var16 < class441.field6552; var16++) {
            class432 var46 = (class432) class497.field7067.method2287((long) class338.field4921[var16], (byte) -117);
            if (var46 != null) {
                class282 var47 = var46.field6439;
                if (var47.method1807(true) && class130.field1749.field8429 == var47.field8429) {
                    class348 var48 = var47.field4008;
                    if (var48 != null && var48.field5076 != null) {
                        var48 = var48.method2207(33, class83.field1160);
                    }
                    if (var48 != null && var48.field5025 && var48.field5058) {
                        int var49 = var47.field8423 / 128 - (var10 / 128);
                        int var50 = var47.field8428 / 128 - (var8 / 128);
                        if (var48.field5037 == -1) {
                            class260.method1688((byte) -96, var5, var50, arg1, arg2, class667.field9350[1], arg4, var49);
                        } else {
                            class280.method1788(var48.field5037, arg2, arg0, var50, arg4, 22087, var49, var5, arg1);
                        }
                    }
                }
            }
        }
        int var17 = class254.field3653;
        int[] var18 = class345.field4993;
        for (int var19 = 0; var19 < var17; var19++) {
            class689 var38 = class314.field4456[var18[var19]];
            if (var38 != null && var38.method3920(true) && !var38.field9532 && class130.field1749 != var38 && class130.field1749.field8429 == var38.field8429) {
                int var39 = var38.field8423 / 128 - (var10 / 128);
                int var40 = var38.field8428 / 128 - var8 / 128;
                boolean var41 = false;
                for (int var42 = 0; var42 < class690.field9544; var42++) {
                    if (var38.field9513.equals(class133.field1790[var42]) && class686.field9486[var42] != 0) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                for (int var44 = 0; var44 < class377.field5712; var44++) {
                    if (var38.field9513.equals(class467.field6838[var44].field5120)) {
                        var43 = true;
                        break;
                    }
                }
                boolean var45 = false;
                if (class130.field1749.field9534 != 0 && var38.field9534 != 0 && class130.field1749.field9534 == var38.field9534) {
                    var45 = true;
                }
                if (var38.field9497) {
                    class260.method1688((byte) -96, var5, var40, arg1, arg2, class667.field9350[6], arg4, var39);
                } else if (var41) {
                    class260.method1688((byte) -96, var5, var40, arg1, arg2, class667.field9350[3], arg4, var39);
                } else if (var43) {
                    class260.method1688((byte) -96, var5, var40, arg1, arg2, class667.field9350[5], arg4, var39);
                } else if (var45) {
                    class260.method1688((byte) -96, var5, var40, arg1, arg2, class667.field9350[4], arg4, var39);
                } else {
                    class260.method1688((byte) -96, var5, var40, arg1, arg2, class667.field9350[2], arg4, var39);
                }
            }
        }
        class635[] var20 = class554.field7904;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class635 var24 = var20[var21];
            if (var24 != null && var24.field8922 != 0 && (class357.field5189 % 20) < 10) {
                if (var24.field8922 == 1) {
                    class432 var25 = (class432) class497.field7067.method2287((long) var24.field8921, (byte) -117);
                    if (var25 != null) {
                        class282 var26 = var25.field6439;
                        int var27 = var26.field8423 / 128 - (var10 / 128);
                        int var28 = var26.field8428 / 128 - (var8 / 128);
                        class581.method3368(arg4, var28, var5, (byte) 5, arg2, var27, 360000L, arg1, var24.field8924);
                    }
                }
                if (var24.field8922 == 2) {
                    int var29 = var24.field8923 / 128 - (var10 / 128);
                    int var30 = var24.field8930 / 128 - var8 / 128;
                    long var31 = (long) (var24.field8932 << 7);
                    long var33 = var31 * var31;
                    class581.method3368(arg4, var30, var5, (byte) 5, arg2, var29, var33, arg1, var24.field8924);
                }
                if (var24.field8922 == 10 && var24.field8921 >= 0 && var24.field8921 < class314.field4456.length) {
                    class689 var35 = class314.field4456[var24.field8921];
                    if (var35 != null) {
                        int var36 = var35.field8423 / 128 - (var10 / 128);
                        int var37 = var35.field8428 / 128 - (var8 / 128);
                        class581.method3368(arg4, var37, var5, (byte) 5, arg2, var36, 360000L, arg1, var24.field8924);
                    }
                }
            }
        }
        if (class264.field3784 == 4) {
            return;
        }
        if (class344.field4987 != 0) {
            int var22 = class344.field4987 * 4 + class130.field1749.method2579(false) * 2 + 2 - (var10 / 128) - 2;
            int var23 = class445.field6615 * 4 + (class130.field1749.method2579(false) * 2) - (var8 / 128 + 2 - 2);
            class260.method1688((byte) -96, var5, var23, arg1, arg2, class504.field7166[class72.field1010 ? 1 : 0], arg4, var22);
        }
        if (!class130.field1749.field9532) {
            arg0.method482(arg2.field549 / 2 + arg4 - 1, -1, 3, 1, arg2.field574 / 2 + arg1 - 1, 3);
            return;
        }
    }
}
