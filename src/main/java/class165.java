import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class165 extends class127 {

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "[I")
    private int[] field2613 = new int[512];

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2607 = new String[5];

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field2616 = 0;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "F")
    public static float field2614;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIB)V")
    public static final void method1129(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class261.field4357.field301 = 0;
        field2608++;
        class261.field4357.method163(class23.field321.field955, (byte) 49);
        class261.field4357.method163(arg0, (byte) 49);
        class261.field4357.method163(arg3, (byte) 49);
        class261.field4357.method182(arg1, 104);
        if (arg4 >= -68) {
            method1130((byte) -76);
        }
        class261.field4357.method182(arg2, -126);
        class23.field311 = -3;
        class266.field4460 = 1;
        class398.field6086 = 0;
        class156.field2529 = 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method1130(byte arg0) {
        field2607 = null;
        int var1 = 76 % ((arg0 + 7) / 36);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IFIIIBF[FFFI)V")
    public final void method988(int arg0, float arg1, int arg2, int arg3, int arg4, byte arg5, float arg6, float[] arg7, float arg8, float arg9, int arg10) {
        field2617++;
        int var12 = (int) ((float) arg10 * arg6 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg0 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg4 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        if (arg5 >= -124) {
            method1132(true, true);
        }
        float var22 = 1.0F - var21;
        float var23 = class124.method977(var21, 6);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field2613[var25];
        int var27 = this.field2613[var24];
        for (int var28 = 0; var28 < arg0; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class124.method977(var32, 6);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field2613[var26 + var35];
            int var38 = this.field2613[var26 + var36];
            int var39 = this.field2613[var27 + var35];
            int var40 = this.field2613[var27 + var36];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg6;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class124.method977(var45, 6);
                arg7[arg2++] = class536.method3174(0, var23, class536.method3174(0, var34, class536.method3174(0, var49, class22.method116(var33, class344.method2224(7, this.field2613[var48 + var37]), true, var22, var46), class22.method116(var33, class344.method2224(this.field2613[var47 + var37], 7), true, var22, var45)), class536.method3174(0, var49, class22.method116(var32, class344.method2224(7, this.field2613[var38 + var48]), true, var22, var46), class22.method116(var32, class344.method2224(this.field2613[var38 + var47], 7), true, var22, var45))), class536.method3174(0, var34, class536.method3174(0, var49, class22.method116(var33, class344.method2224(this.field2613[var39 + var48], 7), true, var21, var46), class22.method116(var33, class344.method2224(7, this.field2613[var39 + var47]), true, var21, var45)), class536.method3174(0, var49, class22.method116(var32, class344.method2224(this.field2613[var40 + var48], 7), true, var21, var46), class22.method116(var32, class344.method2224(this.field2613[var40 + var47], 7), true, var21, var45)))) * arg9;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(I)V")
    public class165(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2613[var3] = this.field2613[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2613[var5];
            this.field2613[var5] = this.field2613[var5 + 256] = this.field2613[var4];
            this.field2613[var4] = this.field2613[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lza;Lec;Z)V")
    public static final void method1131(class491 arg0, class68 arg1, boolean arg2) {
        field2610++;
        if (arg2) {
            return;
        }
        boolean var3 = class20.field218.method2223(arg1.field1069, arg0, arg1.field1161 | 0xFF000000, arg1.field1062, arg1.field1107, 6407, arg1.field1012 ? class302.field4850.field2650 : null, arg1.field1007) == null;
        if (var3) {
            class78.field1358.method2541(0, new class446(arg1.field1062, arg1.field1007, arg1.field1069, arg1.field1161 | 0xFF000000, arg1.field1107, arg1.field1012));
            class396.method2476(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZZ)V")
    public static final void method1132(boolean arg0, boolean arg1) {
        field2612++;
        if (class463.field6886 != null) {
            class463.field6886.method2804(true);
            class463.field6886 = null;
        }
        class350.field5480 = 0;
        class416.method2565((byte) -49);
        class337.method2131();
        for (int var2 = 0; var2 < 4; var2++) {
            class106.field1865[var2].method1706(76);
        }
        class118.method942(arg1, 25616);
        System.gc();
        class51.method364(2, 4096);
        class282.field4615 = -1;
        class151.field2419 = false;
        class156.method1089((byte) 120, true);
        class419.field6341 = 0;
        class455.field6794 = 0;
        class344.field5393 = 0;
        class194.field3037 = 0;
        class536.field7868 = 0;
        class16.field181 = 0;
        for (int var3 = 0; var3 < class413.field6289.length; var3++) {
            class413.field6289[var3] = null;
        }
        class338.method2134(false);
        for (int var4 = 0; var4 < 2048; var4++) {
            class435.field6489[var4] = null;
        }
        class86.field1471 = 0;
        class147.field2396.method2525(0);
        class353.field5506 = 0;
        class244.field4176.method2525(0);
        class100.method692((byte) 29);
        class524.field7713 = 0;
        class327.field5160.method1929((byte) -92);
        class217.method1501(-1);
        class157.method1099(127);
        class57.field897 = null;
        class249.field4246 = 0L;
        if (arg0) {
            class75.method540(-7, 11);
            return;
        }
        class75.method540(-7, 2);
        try {
            class456.method2735(-27001, "loggedout", class419.field6342.field7203);
        } catch (Throwable var5) {
        }
    }
}
