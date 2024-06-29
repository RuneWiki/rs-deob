import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class79 {

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Lwf;")
    private class117 field1067 = new class117(64);

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Lkda;")
    private class328 field1068;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "[F")
    public static float[] field1062 = new float[4];

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1069;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "[Z")
    public static boolean[] field1064;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
    public static void method606(boolean arg0) {
        field1062 = null;
        field1064 = null;
        field1069 = null;
        if (arg0) {
            method606(true);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)Laca;")
    public final class621 method607(int arg0, int arg1) {
        field1063++;
        class117 var3 = this.field1067;
        class621 var4;
        synchronized (this.field1067) {
            var4 = (class621) this.field1067.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field1068;
        byte[] var6;
        synchronized (this.field1068) {
            var6 = this.field1068.method1966(arg1, 5, true);
        }
        class621 var7 = new class621();
        int var8 = 11 / ((-arg0 - 39) / 63);
        if (var6 != null) {
            var7.method3628(new class148(var6), (byte) 92);
        }
        class117 var9 = this.field1067;
        synchronized (this.field1067) {
            this.field1067.method835((byte) 125, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static final void method608(int arg0) {
        field1065++;
        if (class111.field1583 != null) {
            return;
        }
        class111.field1583 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = arg0; var4 < 512; var4++) {
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
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
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
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class111.field1583[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class79(class39 arg0, int arg1, class328 arg2) {
        this.field1068 = arg2;
        this.field1068.method1975(124, 5);
    }
}
