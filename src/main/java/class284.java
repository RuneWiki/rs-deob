import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class284 extends class466 {

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "[I")
    private int[] field3786 = new int[512];

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Liba;")
    public static class211 field3790 = new class211(7, 3);

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lvs;")
    public static class476 field3792 = new class476();

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([ILum;I[IIB)Lgi;")
    public static final class571 method1678(int[] arg0, class528 arg1, int arg2, int[] arg3, int arg4, byte arg5) {
        field3787++;
        if (arg5 != 69) {
            field3790 = null;
        }
        if (!arg1.method780(class592.field8601, class106.field1573, -103)) {
            int[] var10 = new int[arg2 * arg4];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg2 * var11 + arg0[var11];
                for (int var13 = 0; var13 < arg3[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class571(arg1, arg2, arg4, var10);
        }
        byte[] var6 = new byte[arg2 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg2 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class571(arg1, arg2, arg4, var6);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lps;I)V")
    public static final void method1679(class5 arg0, int arg1) {
        if (class22.field430 == arg0.field177) {
            class394.field5969[arg0.field79] = true;
        }
        if (arg1 >= 0) {
            method1682(null, 79, null);
        }
        field3791++;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I)V")
    public class284(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field3786[var3] = this.field3786[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field3786[var5];
            this.field3786[var5] = this.field3786[var5 + 256] = this.field3786[var4];
            this.field3786[var4] = this.field3786[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field3790 = null;
        field3792 = null;
        if (arg0 != -11427) {
            field3792 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZFFIIIF[FFI)V")
    public final void method1681(int arg0, boolean arg1, float arg2, float arg3, int arg4, int arg5, int arg6, float arg7, float[] arg8, float arg9, int arg10) {
        field3793++;
        int var12 = (int) ((float) arg10 * arg7 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg5 * arg3 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        if (arg1) {
            method1682(null, 66, null);
        }
        float var18 = (float) arg4 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class21.method137(true, var21);
        int var25 = var19 & var17;
        int var26 = this.field3786[var25];
        int var27 = this.field3786[var23];
        for (int var28 = 0; var28 < arg5; var28++) {
            float var29 = (float) var28 * arg3;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class21.method137(!arg1, var32);
            int var37 = this.field3786[var34 + var26];
            int var38 = this.field3786[var26 + var35];
            int var39 = this.field3786[var27 + var34];
            int var40 = this.field3786[var35 + var27];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg7;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class21.method137(true, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg8[arg0++] = arg9 * class379.method2349(var24, class379.method2349(var36, class379.method2349(var47, class261.method1574(var32, var45, class425.method2563(this.field3786[var40 + var49], 7), var21, (byte) -77), class261.method1574(var32, var46, class425.method2563(this.field3786[var48 + var40], 7), var21, (byte) -77), (byte) -57), class379.method2349(var47, class261.method1574(var33, var45, class425.method2563(this.field3786[var39 + var49], 7), var21, (byte) -77), class261.method1574(var33, var46, class425.method2563(7, this.field3786[var39 + var48]), var21, (byte) -77), (byte) -57), (byte) -57), class379.method2349(var36, class379.method2349(var47, class261.method1574(var32, var45, class425.method2563(7, this.field3786[var38 + var49]), var22, (byte) -77), class261.method1574(var32, var46, class425.method2563(this.field3786[var38 + var48], 7), var22, (byte) -77), (byte) -57), class379.method2349(var47, class261.method1574(var33, var45, class425.method2563(7, this.field3786[var37 + var49]), var22, (byte) -77), class261.method1574(var33, var46, class425.method2563(7, this.field3786[var37 + var48]), var22, (byte) -77), (byte) -57), (byte) -57), (byte) -57);
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lr;ILjo;)I")
    public static final int method1682(class98 arg0, int arg1, class335 arg2) {
        if (arg1 != 26685) {
            return 49;
        }
        field3789++;
        if (arg2.field4882 != -1) {
            return arg2.field4882;
        }
        if (arg2.field4881 != -1) {
            class457 var3 = arg0.field1491.method955(-1330, arg2.field4881);
            if (!var3.field6612) {
                return var3.field6597;
            }
        }
        return arg2.field4876;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lmv;IIIIIZJ)V")
    public static final void method1683(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, long arg7) {
        class303.field4504 = arg4;
        class512.field7217 = arg6;
        class71.field1103 = 10000;
        class166.field2325 = arg3;
        class20.field381 = arg5;
        class258.field3346 = null;
        if (arg2 >= 0) {
            return;
        }
        class634.field9148 = arg0;
        class250.field3286 = arg7;
        class177.field2475 = 1;
        class658.field9403 = arg1;
        field3788++;
    }
}
