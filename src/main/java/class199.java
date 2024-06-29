import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class199 {

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "B")
    private byte field3203;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "[Lom;")
    public static class209[] field3212 = new class209[14];

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Z")
    public static boolean field3216 = false;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3206 = " has logged out.";

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lmo;")
    public static class447 field3201;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "Lmo;")
    public static class447 field3218;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I", line = 3)
    public static final int method1386(byte arg0) {
        int var1 = 86 % ((32 - arg0) / 59);
        field3207++;
        if (class395.field5920 == null) {
            return class9.field112 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)I", line = 19)
    public final int method1387(byte arg0) {
        field3209++;
        if (arg0 != -25) {
            this.method1387((byte) 73);
        }
        return (this.field3203 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)I", line = 32)
    public final int method1388(byte arg0) {
        field3213++;
        int var2 = -125 / ((arg0 + 2) / 43);
        return this.field3203 & 0x7;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lmo;I)V", line = 47)
    public static final void method1389(class447 arg0, int arg1) {
        class441.field6454 = arg0;
        field3214++;
        if (arg1 != 2) {
            method1389((class447) null, 51);
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V", line = 81)
    public class199() {
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V", line = 87)
    public static final void method1390(boolean arg0) {
        field3210++;
        if (class62.field814 != null) {
            return;
        }
        class62.field814 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var11 = var16;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var9 = var8;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + ((var22 << 16) + var24 - 16777216);
                class62.field814[var3++] = var25;
            }
        }
        if (arg0) {
            field3217 = -30;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljg;)V", line = 206)
    public class199(class186 arg0) {
        this.field3203 = arg0.method1327((byte) -112);
        this.field3204 = arg0.method1272((byte) -88);
        this.field3205 = arg0.method1284(8388607);
        this.field3215 = arg0.method1284(8388607);
        this.field3208 = arg0.method1284(8388607);
        this.field3202 = arg0.method1284(8388607);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 219)
    public static void method1391(int arg0) {
        field3206 = null;
        field3218 = null;
        field3201 = null;
        if (arg0 < 102) {
            field3216 = true;
        }
        field3212 = null;
    }
}
