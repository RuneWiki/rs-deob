import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class92 {

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field1240 = 1;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "[I")
    public static int[] field1244 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lkq;")
    public static class343 field1241;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I[Ljava/awt/Rectangle;Z)V", line = 3)
    public static final void method551(int arg0, Rectangle[] arg1, boolean arg2) throws class425 {
        field1239++;
        if (class589.field8461 == 1) {
            class410.field5731.method622(arg1, arg0, class694.field9698, class720.field10169);
        } else {
            class410.field5731.method622(arg1, arg0, 0, 0);
        }
        if (arg2) {
            field1244 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 19)
    public static void method552(int arg0) {
        if (arg0 != -21012) {
            method552(-69);
        }
        field1241 = null;
        field1244 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLeg;)V", line = 32)
    public static final void method553(byte arg0, class317 arg1) {
        field1243++;
        class375.field5218 = arg1;
        if (arg0 >= -8) {
            method552(20);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IBI)I", line = 45)
    public final int method554(int arg0, byte arg1, int arg2) {
        int var4 = -60 / ((81 - arg1) / 41);
        field1242++;
        int var5 = arg0 < class58.field807 ? class58.field807 : arg0;
        if (class121.field1658 == this) {
            return 0;
        } else if (class626.field8940 == this) {
            return var5 - arg2;
        } else if (class116.field1625 == this) {
            return (var5 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIZ)V", line = 71)
    public static final void method555(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1245++;
        if (!arg4 && class585.field8427 == arg2 && class13.field192 == arg3 && class392.field5459 == class183.field2654 || class674.field9500.field5113.method3798(arg0 - 512) == 1) {
            return;
        }
        class183.field2654 = class392.field5459;
        class585.field8427 = arg2;
        class13.field192 = arg3;
        if (class674.field9500.field5113.method3798(0) == 1) {
            class183.field2654 = 0;
        }
        class647.method3754(arg1, true);
        class665.method3817(class442.field6064, -122, class138.field1848.method891(arg0 ^ -2041650192, class369.field4721), class339.field4345, true, class96.field1401);
        int var5 = class179.field2535;
        int var6 = class510.field7109;
        class179.field2535 = (class585.field8427 - (class514.field7179 >> 4)) * 8;
        class510.field7109 = (class13.field192 - (class456.field6281 >> 4)) * 8;
        class577.field8265 = class531.method3156(class585.field8427 * 8, class13.field192 * 8);
        class669.field9413 = null;
        int var7 = class179.field2535 - var5;
        int var8 = class510.field7109 - var6;
        if (arg1 == 11) {
            for (int var9 = 0; var9 < class287.field3776; var9++) {
                class15 var10 = class312.field4003[var9];
                if (var10 != null) {
                    class55 var11 = var10.field204;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field8421[var12] -= var7;
                        var11.field8414[var12] -= var8;
                    }
                    var11.field9489 -= var8 * 512;
                    var11.field9490 -= var7 * 512;
                }
            }
        } else {
            class676.field9533 = 0;
            boolean var13 = false;
            int var14 = class514.field7179 * 512 - 512;
            int var15 = (class456.field6281 - 1) * 512;
            for (int var16 = 0; var16 < class287.field3776; var16++) {
                class15 var29 = class312.field4003[var16];
                if (var29 != null) {
                    class55 var30 = var29.field204;
                    var30.field9489 -= var8 * 512;
                    var30.field9490 -= var7 * 512;
                    if (var30.field9490 >= 0 && var30.field9490 <= var14 && var30.field9489 >= 0 && var30.field9489 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field8421[var32] -= var7;
                            var30.field8414[var32] -= var8;
                            if (var30.field8421[var32] < 0 || class514.field7179 <= var30.field8421[var32] || var30.field8414[var32] < 0 || var30.field8414[var32] >= class456.field6281) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class731.field10231[class676.field9533++] = var30.field8344;
                        } else {
                            var30.method379(null, -122);
                            var29.method3065(-17363);
                            var13 = true;
                        }
                    } else {
                        var30.method379(null, -118);
                        var13 = true;
                        var29.method3065(-17363);
                    }
                }
            }
            if (var13) {
                class287.field3776 = class403.field5587.method1388(false);
                class403.field5587.method1384(0, class312.field4003);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class655 var27 = class40.field563[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field8421[var28] -= var7;
                    var27.field8414[var28] -= var8;
                }
                var27.field9490 -= var7 * 512;
                var27.field9489 -= var8 * 512;
            }
        }
        class729[] var18 = class349.field4441;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class729 var26 = var18[var19];
            if (var26 != null) {
                var26.field10217 -= var7 * 512;
                var26.field10221 -= var8 * 512;
            }
        }
        for (class200 var20 = (class200) class503.field7030.method3118((byte) 73); var20 != null; var20 = (class200) class503.field7030.method3111(arg0 ^ 0x27C)) {
            var20.field2895 -= var8;
            var20.field2900 -= var7;
            if (class734.field10279 != 4 && (var20.field2900 < 0 || var20.field2895 < 0 || class514.field7179 <= var20.field2900 || var20.field2895 >= class456.field6281)) {
                var20.method3065(-17363);
            }
        }
        if (class734.field10279 != 4) {
            for (class731 var21 = (class731) class118.field1631.method1382(arg0 ^ 0x6EFD); var21 != null; var21 = (class731) class118.field1631.method1383(false)) {
                int var22 = (int) (var21.field7166 & 0x3FFFL);
                int var23 = var22 - class179.field2535;
                int var24 = (int) (var21.field7166 >> 14 & 0x3FFFL);
                int var25 = var24 - class510.field7109;
                if (var23 < 0 || var25 < 0 || class514.field7179 <= var23 || class456.field6281 <= var25) {
                    var21.method3065(-17363);
                }
            }
        }
        if (class729.field10226 != 0) {
            class93.field1329 -= var8;
            class729.field10226 -= var7;
        }
        class677.method3877(-82);
        if (arg1 != 11) {
            class93.field1343 -= var8;
            class676.field9532 -= var8;
            class24.field266 -= var7 * 512;
            class235.field3250 -= var8 * 512;
            class651.field9208 -= var7;
            class584.field8361 -= var7;
            if (Math.abs(var7) > class514.field7179 || Math.abs(var8) > class456.field6281) {
                class507.method3027(-1);
            }
        } else if (class665.field9377 == 4) {
            class264.field3603 -= var7 * 512;
            class668.field9412 -= var8 * 512;
            class128.field1755 -= var8 * 512;
            class595.field8572 -= var7 * 512;
        } else {
            class374.field5167 = -1;
            class13.field180 = -1;
            class665.field9377 = 1;
        }
        class666.method3820(0);
        class446.method2659(-1);
        class450.field6178.method3122(0);
        class512.field7156.method3122(0);
        class184.field2669.method1955(true);
        if (arg0 == 512) {
            class513.method3063(arg0 - 435);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 336)
    public final String toString() {
        field1238++;
        throw new IllegalStateException();
    }
}
