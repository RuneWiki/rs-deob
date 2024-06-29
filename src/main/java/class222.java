import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class222 extends class144 {

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Z")
    private boolean field3136 = true;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    private int field3144 = 4096;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field3141 = 0;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Ljava/awt/Font;")
    public static Font field3138;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "[Lnc;")
    public static class243[] field3140;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class222() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            method1444((byte) -8, true);
        }
        ++field3143;
        if (class254.field3663 != 0 && ~arg1 != -1 && ~class37.field432 > -51 && ~arg4 != 0) {
            class243.field3548[class37.field432] = arg4;
            class223.field3148[class37.field432] = arg1;
            class157.field2258[class37.field432] = arg0;
            class101.field1397[class37.field432] = null;
            class176.field2501[class37.field432] = 0;
            class77.field924[class37.field432] = arg2;
            ++class37.field432;
        }
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field3138 = null;
        if (arg0 >= -119) {
            field3141 = 116;
        }
        field3140 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field3136 = ~arg1.method1407(109) == -2;
            }
        } else {
            this.field3144 = arg1.method1380(true);
        }
        if (arg2 == 20630) {
            ++field3137;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field3135;
        if (arg0 != 5) {
            method1443(-14);
        }
        int[][] var3 = super.field2053.method1542(91, arg1);
        if (super.field2053.field3408) {
            int[] var4 = this.method934(-18877, 0, class166.field2391 & arg1 + -1);
            int[] var5 = this.method934(arg0 + -18882, 0, arg1);
            int[] var6 = this.method934(-18877, 0, class166.field2391 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class104.field1411 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3144;
                int var12 = (var5[class112.field1487 & var10 - -1] + -var5[class112.field1487 & var10 + -1]) * this.field3144;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field3136) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BZ)V")
    public static final void method1444(byte arg0, boolean arg1) {
        class265.field3829 = null;
        class52.field594 = null;
        class105.field1428 = null;
        ++field3139;
        if (arg1 && class173.field2480 != null) {
            class33.field389 = class173.field2480.field842;
        } else {
            class33.field389 = -1;
        }
        class261.field3791 = null;
        class173.field2480 = null;
        class238.field3431 = null;
        class116.field1613 = 0;
        class178.field2533 = null;
        class248.field3612 = null;
        class141.field2031 = null;
        class104.field1413 = null;
        class252.field3644 = null;
        class119.field1704.method1528(false);
        class294.field4647 = -1;
        class293.field4640 = null;
        if (arg0 <= -123) {
            class238.field3439 = null;
            class130.field1874 = null;
            class87.field1183 = null;
            class274.field4103 = -1;
            class200.field2840 = null;
            class220.field3117 = null;
            class59.field700 = null;
            class80.field952 = null;
            class103.field1406 = null;
            class24.field292 = null;
        }
    }
}
