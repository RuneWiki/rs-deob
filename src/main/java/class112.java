import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class112 extends class181 {

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[I")
    private int[] field1438 = new int[512];

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lgv;")
    public static class72 field1436 = new class72();

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lwo;")
    public static class690 field1439 = new class690(61, -1);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ln;")
    public static class17 field1431;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFIIFIIIFI[F)V", line = 4)
    public final void method800(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float[] arg10) {
        field1432++;
        int var12 = (int) ((float) arg2 * arg1 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg8 + (float) arg6);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg7 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class356.method2008(var21, (byte) 119);
        int var26 = this.field1438[var23];
        int var27 = this.field1438[var24];
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class356.method2008(var32, (byte) 119);
            int var36 = var31 & var15;
            int var37 = this.field1438[var26 + var34];
            int var38 = this.field1438[var26 + var36];
            int var39 = this.field1438[var27 + var34];
            int var40 = this.field1438[var27 + var36];
            for (int var41 = 0; var41 < arg2; var41++) {
                float var42 = (float) var41 * arg1;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class356.method2008(var45, (byte) 118);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg10[arg3++] = class377.method2194(var25, class377.method2194(var35, class377.method2194(var47, class4.method20(class435.method2605(this.field1438[var40 + var49], 7), 2, var21, var45, var32), class4.method20(class435.method2605(7, this.field1438[var48 + var40]), 2, var21, var46, var32), arg6 - 4035), class377.method2194(var47, class4.method20(class435.method2605(this.field1438[var39 + var49], 7), 2, var21, var45, var33), class4.method20(class435.method2605(7, this.field1438[var39 + var48]), 2, var21, var46, var33), -4036), -4036), class377.method2194(var35, class377.method2194(var47, class4.method20(class435.method2605(this.field1438[var38 + var49], 7), arg6 + 3, var22, var45, var32), class4.method20(class435.method2605(7, this.field1438[var38 + var48]), 2, var22, var46, var32), -4036), class377.method2194(var47, class4.method20(class435.method2605(this.field1438[var37 + var49], 7), 2, var22, var45, var33), class4.method20(class435.method2605(7, this.field1438[var37 + var48]), 2, var22, var46, var33), -4036), arg6 - 4035), -4036) * arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BZ)V", line = 97)
    public static final void method801(byte arg0, boolean arg1) {
        if (arg1 && class550.field7975 != null) {
            class323.field4325 = class550.field7975.field1486;
        } else {
            class323.field4325 = -1;
        }
        if (arg0 != 81) {
            field1431 = null;
        }
        field1430++;
        field1431 = null;
        class356.field4756 = null;
        class550.field7975 = null;
        class411.field5847 = 0;
        class550.method3237();
        class550.field7987.method1131((byte) -75);
        class571.field8343 = null;
        class287.field3876 = null;
        class473.field6605 = null;
        class74.field1108 = null;
        class550.field7982 = null;
        class311.field4111 = null;
        class561.field8108 = null;
        class318.field4207 = null;
        class630.field9049 = null;
        class440.field6291 = -1;
        class113.field1458 = -1;
        class630.field9050 = null;
        if (class550.field7973 != null) {
            class550.field7973.method3818(-23182);
            class550.field7973.method3815(128, 64, arg0 ^ 0xFFFFC9BE);
        }
        if (class550.field7974 != null) {
            class550.field7974.method561(64, false, 64);
        }
        if (class550.field7978 != null) {
            class550.field7978.method810(64, true);
        }
        class342.field4519.method2679((byte) -128, 64);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 146)
    public static final void method802(int arg0) {
        class472 var1 = class230.field2993;
        synchronized (class230.field2993) {
            class230.field2993.method2776(false);
        }
        field1437++;
        class472 var2 = class277.field3783;
        synchronized (class277.field3783) {
            if (arg0 <= 105) {
                field1440 = 28;
            }
            class277.field3783.method2776(false);
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V", line = 163)
    public static void method803(int arg0) {
        field1439 = null;
        field1436 = null;
        field1431 = null;
        if (arg0 != -1) {
            field1439 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V", line = 302)
    public class112(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1438[var3] = this.field1438[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1438[var5];
            this.field1438[var5] = this.field1438[var5 + 256] = this.field1438[var4];
            this.field1438[var4] = this.field1438[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILr;)V", line = 193)
    public static final void method804(int arg0, class165 arg1) {
        field1434++;
        int var2 = class22.field548;
        int var3 = class1.field2;
        int var4 = class675.field9685;
        int var5 = class84.field1195;
        int var6 = -10660793;
        arg1.method1042(var2, var4, 1, var3, var6, var5);
        arg1.method1042(var2 + 1, var4 + -2, 1, var3 + 1, -16777216, 16);
        arg1.method1046(127, var5 - 19, -16777216, var3 + 18, var4 - 2, var2 + 1);
        if (arg0 <= 96) {
            return;
        }
        class36.field691.method2515(-1, 0, var6, class424.field6062.method2561(class370.field4980, 0), var3 + 14, var2 - -3);
        int var7 = class478.field6713.method1349(-127);
        int var8 = class478.field6713.method1338(1);
        int var9 = 0;
        for (class377 var10 = (class377) class34.field679.method1132((byte) 108); var10 != null; var10 = (class377) class34.field679.method1134(8446)) {
            int var11 = (class271.field3704 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < var2 + var4 && var8 > (var11 - 13) && var11 + 3 > var8 && var10.field5057) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class267.method1619(var10.field5062, true)) {
                var13 = class65.field1021.method178(false, (int) var10.field5064).field3210;
            } else if (var10.field5067 != -1) {
                var13 = class65.field1021.method178(false, var10.field5067).field3210;
            } else if (class660.method3740((byte) 126, var10.field5062)) {
                class633 var14 = (class633) class522.field7662.method3678((long) ((int) var10.field5064), -124);
                if (var14 != null) {
                    class557 var15 = var14.field9097;
                    class323 var16 = var15.field8052;
                    if (var16.field4315 != null) {
                        var16 = var16.method1881(class410.field5804, (byte) 114);
                    }
                    if (var16 != null) {
                        var13 = var16.field4292;
                    }
                }
            } else if (class19.method333(-1002, var10.field5062)) {
                Object var17 = null;
                class232 var18;
                if (var10.field5062 == 1011) {
                    var18 = class37.field703.method807(0, (int) var10.field5064);
                } else {
                    var18 = class37.field703.method807(0, (int) (var10.field5064 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field3094 != null) {
                    var18 = var18.method1412(107, class410.field5804);
                }
                if (var18 != null) {
                    var13 = var18.field3019;
                }
            }
            String var19 = class207.method1245(false, var10);
            if (var13 != null) {
                var19 = var19 + class416.method2497(-17581, var13);
            }
            class36.field691.method2532(class634.field9106, var2 + 3, var19, var12, var11, class420.field5955, true, 0);
            var9++;
            if (var10.field5061) {
                class612.field8779.method3924(class12.field205.method553(var19, 105) + var2 + 5, var11 + -12);
            }
        }
        class210.method1254(class1.field2, class84.field1195, class22.field548, (byte) -41, class675.field9685);
    }
}
