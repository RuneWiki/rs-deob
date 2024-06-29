import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class315 extends Canvas {

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field4222;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "Luf;")
    public static class380 field4217 = new class380(50);

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "[I")
    public static int[] field4226 = new int[5];

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "Ltca;")
    public static class141 field4228 = new class141(3, 2);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "Lfa;")
    public static class522 field4225;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "Leba;")
    public static class550 field4223;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "[[I")
    public static int[][] field4224;

    @OriginalMember(owner = "client!sea", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4220++;
        this.field4222.update(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILwv;I)V")
    public static final void method1840(int arg0, int arg1, class423 arg2, int arg3) {
        field4219++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field5544 != null) {
            class274 var4 = new class274();
            var4.field3639 = arg2.field5544;
            var4.field3644 = arg2;
            class656.method3743(var4);
        }
        class396.field5273 = arg3;
        class38.field507 = true;
        class351.field4679 = arg2.field5685;
        class689.field9739 = arg2.field5650;
        class544.field7442 = arg0;
        class390.field5225 = arg2.field5552;
        class101.field1208 = arg2.field5615;
        class369.field4847 = arg2.field5610;
        if (arg1 != 0) {
            method1840(-73, -98, null, -99);
        }
        class552.method3091(arg2, 12618);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLr;J)V")
    public static final void method1841(byte arg0, class562 arg1, long arg2) {
        class114.field1459 = 0;
        class275.field3658 = 0;
        field4216++;
        class67.field825 = class125.field1752;
        class125.field1752 = 0;
        long var4 = class529.method2982((byte) -69);
        for (class514 var6 = (class514) class251.field3302.method1298((byte) 40); var6 != null; var6 = (class514) class251.field3302.method1305((byte) -114)) {
            if (var6.method2905(arg1, arg2)) {
                class275.field3658++;
            }
        }
        int var7 = 95 / ((arg0 - 20) / 44);
        if (class133.field1846 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class251.field3302.method1299(-92) + ", running: " + class275.field3658);
            System.out.println("Emitters: " + class114.field1459 + " Particles: " + class125.field1752 + ". Time taken: " + (class529.method2982((byte) -69) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[FIFIIIIB)V")
    public static final void method1842(int arg0, int arg1, float[] arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        int var10 = arg0 - arg1;
        if (arg9 >= -25) {
            field4224 = null;
        }
        int var11 = arg6 - arg3;
        field4218++;
        int var12 = arg5 - arg8;
        float var13 = arg2[2] * (float) var10 + arg2[0] * (float) var11 + arg2[1] * (float) var12;
        float var14 = arg2[5] * (float) var10 + arg2[4] * (float) var12 + arg2[3] * (float) var11;
        float var15 = arg2[8] * (float) var10 + arg2[7] * (float) var12 + arg2[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg4 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg7 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg7 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg7 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class82.field956 = var18;
        class646.field8934 = var17;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public static void method1843(int arg0) {
        field4225 = null;
        field4223 = null;
        field4217 = null;
        field4228 = null;
        field4226 = null;
        field4224 = null;
        if (arg0 > -31) {
            method1842(0, -61, null, 45, -1.3150749F, -33, 107, 90, 106, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!sea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4227++;
        this.field4222.paint(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(FFBIIIFFI[BLhc;IF)V")
    public static final void method1844(float arg0, float arg1, byte arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, byte[] arg9, class427 arg10, int arg11, float arg12) {
        field4221++;
        for (int var13 = 0; var13 < arg8; var13++) {
            class329.method1912(arg1, arg7, arg12, arg9, arg0, arg10, arg4, (byte) -7, var13, arg8, arg11, arg5, arg6, arg3);
            arg11 += arg4 * arg5;
        }
        if (arg2 != 111) {
            method1843(38);
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class315(Component arg0) {
        this.field4222 = arg0;
    }
}
