import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class35 extends class185 {

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "[I")
    private int[] field547 = new int[512];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[I")
    public static int[] field542;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        if (arg0 != -98) {
            field540 = -61;
        }
        field539++;
        for (int var1 = 0; var1 < class119.field1860.length; var1++) {
            for (int var2 = 0; var2 < class119.field1860[var1].length; var2++) {
                class119.field1860[var1][var2] = class366.field5257;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method256(byte arg0, String arg1) {
        class9.method68("", 0, 0, -1, arg1, "");
        if (arg0 >= 92) {
            field545++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLat;)V")
    public static final void method257(byte arg0, class444 arg1) {
        field546++;
        if (arg0 != -113) {
            field542 = null;
        }
        class444 var2 = class345.method2079(arg0 - 273095053, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class348.field5033;
            var4 = class66.field953;
        } else {
            var4 = var2.field6470;
            var3 = var2.field6453;
        }
        class411.method2418(var3, false, arg1, var4, -125);
        class157.method1124(var3, arg1, var4, -1);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method258(int arg0) {
        if (arg0 <= 54) {
            field540 = 21;
        }
        class527.field7694 = null;
        class41.field615 = -1;
        field544++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[FFIZFIIFFI)V")
    public final void method259(int arg0, float[] arg1, float arg2, int arg3, boolean arg4, float arg5, int arg6, int arg7, float arg8, float arg9, int arg10) {
        field543++;
        int var12 = (int) ((float) arg0 * arg2 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg7 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg5 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg5;
        int var19 = (int) var18;
        if (!arg4) {
            method255((byte) -127);
        }
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class408.method2391((byte) 107, var21);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field547[var24];
        int var27 = this.field547[var25];
        for (int var28 = 0; var28 < arg7; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class408.method2391((byte) 114, var32);
            int var37 = this.field547[var26 + var35];
            int var38 = this.field547[var26 + var34];
            int var39 = this.field547[var27 + var35];
            int var40 = this.field547[var34 + var27];
            for (int var41 = 0; var41 < arg0; var41++) {
                float var42 = (float) var41 * arg2;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class408.method2391((byte) 106, var45);
                arg1[arg6++] = arg9 * class223.method1386(class223.method1386(class223.method1386(class457.method2670(96, var22, class375.method2245(7, this.field547[var47 + var37]), var46, var33), -13349, class457.method2670(-126, var22, class375.method2245(7, this.field547[var48 + var37]), var45, var33), var49), -13349, class223.method1386(class457.method2670(5, var22, class375.method2245(7, this.field547[var38 + var47]), var46, var32), -13349, class457.method2670(29, var22, class375.method2245(this.field547[var38 + var48], 7), var45, var32), var49), var36), -13349, class223.method1386(class223.method1386(class457.method2670(38, var21, class375.method2245(this.field547[var39 + var47], 7), var46, var33), -13349, class457.method2670(29, var21, class375.method2245(this.field547[var39 + var48], 7), var45, var33), var49), -13349, class223.method1386(class457.method2670(-126, var21, class375.method2245(this.field547[var40 + var47], 7), var46, var32), -13349, class457.method2670(-124, var21, class375.method2245(7, this.field547[var48 + var40]), var45, var32), var49), var36), var23);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
    public static final void method260(int arg0, byte arg1, int arg2) {
        int var3 = -68 % ((50 - arg1) / 36);
        field541++;
        class281.field3828 = arg2 - class472.field6835;
        class470.field6776 = arg0 - class472.field6838;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method261(boolean arg0) {
        field542 = null;
        if (!arg0) {
            method255((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
    public class35(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field547[var3] = this.field547[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field547[var5];
            this.field547[var5] = this.field547[var5 + 256] = this.field547[var4];
            this.field547[var4] = this.field547[var4 + 256] = var6;
        }
    }
}
