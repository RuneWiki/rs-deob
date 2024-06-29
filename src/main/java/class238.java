import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class238 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    public static int[] field3329 = new int[50];

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Li;")
    public static class30 field3325 = new class30();

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field3336 = -1;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lhe;")
    public static class239 field3338;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[B")
    public byte[] field3331;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[B")
    public byte[] field3333;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[[B")
    public static byte[][] field3337;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method1437(boolean arg0) {
        field3337 = null;
        if (!arg0) {
            method1440(null, 102, 115, -112, 97);
        }
        field3338 = null;
        field3325 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Frame;Lqn;I)V")
    public static final void method1438(Frame arg0, class44 arg1, int arg2) {
        field3327++;
        while (true) {
            class439 var3 = arg1.method323((byte) 25, arg0);
            while (var3.field6417 == 0) {
                class322.method1935(true, 10L);
            }
            if (var3.field6417 == 1) {
                arg0.setVisible(false);
                if (arg2 != 1) {
                    method1437(true);
                }
                arg0.dispose();
                return;
            }
            class322.method1935(true, 100L);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V")
    public static final void method1439(boolean arg0) {
        class252.field3648++;
        class386.method2321(arg0, class96.field1285);
        field3326++;
        class79.field1108.method947(-121, 0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIII)V")
    public static final void method1440(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -14726) {
            return;
        }
        field3334++;
        arg3--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg0[var7] = arg1;
            int var8 = var7 + 1;
            arg0[var8] = arg1;
            int var9 = var8 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg3 = var13 + 1;
            arg0[arg3] = arg1;
        }
        while (var6 > arg3) {
            arg3++;
            arg0[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)V")
    public static final void method1441(boolean arg0) {
        field3321++;
        if (class65.field971 != null) {
            return;
        }
        class65.field971 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (!arg0) {
            field3337 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var11 = var8;
                    var10 = var16;
                    var9 = var18;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class65.field971[var3++] = var25;
            }
        }
    }
}
