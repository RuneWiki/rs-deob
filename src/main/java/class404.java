import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class404 extends class105 {

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "[I")
    public static int[] field5534 = new int[1];

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "[Z")
    public static boolean[] field5535 = new boolean[100];

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "J")
    public static long field5551 = -1L;

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
    public static int field5542 = 0;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "F")
    public float field5521;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "F")
    public float field5526;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "F")
    public float field5529;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "F")
    public float field5533;

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "F")
    public float field5536;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "F")
    public float field5537;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "F")
    public float field5538;

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "F")
    public float field5540;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "F")
    public float field5544;

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "F")
    public float field5546;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "F")
    public float field5548;

    @OriginalMember(owner = "client!hba", name = "M", descriptor = "F")
    public float field5556;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!hba", name = "J", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!hba", name = "K", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!hba", name = "L", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public static void method2411(int arg0) {
        field5535 = null;
        if (arg0 <= 21) {
            field5551 = -70L;
        }
        field5534 = null;
    }

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "(III[I)V")
    public final void method367(int arg0, int arg1, int arg2, int[] arg3) {
        field5524++;
        arg3[0] = (int) ((float) arg2 * this.field5556 + (float) arg0 * this.field5540 + (float) arg1 * this.field5526);
        arg3[2] = (int) ((float) arg2 * this.field5521 + (float) arg0 * this.field5533 + (float) arg1 * this.field5538);
        arg3[1] = (int) ((float) arg2 * this.field5537 + (float) arg0 * this.field5548 + (float) arg1 * this.field5536);
    }

    @OriginalMember(owner = "client!hba", name = "va", descriptor = "([I)V")
    public final void method364(int[] arg0) {
        field5545++;
        float var2 = (float) arg0[0] - this.field5529;
        float var3 = (float) arg0[1] - this.field5544;
        float var4 = (float) arg0[2] - this.field5546;
        arg0[1] = (int) (this.field5538 * var4 + this.field5536 * var3 + this.field5526 * var2);
        arg0[2] = (int) (this.field5521 * var4 + this.field5556 * var2 + this.field5537 * var3);
        arg0[0] = (int) (this.field5533 * var4 + this.field5548 * var3 + this.field5540 * var2);
    }

    @OriginalMember(owner = "client!hba", name = "ha", descriptor = "()V")
    public final void method354() {
        field5555++;
        this.field5548 = this.field5533 = this.field5526 = this.field5538 = this.field5556 = this.field5537 = this.field5529 = this.field5544 = this.field5546 = 0.0F;
        this.field5540 = this.field5536 = this.field5521 = 1.0F;
    }

    @OriginalMember(owner = "client!hba", name = "EA", descriptor = "(Lm;)V")
    public final void method362(class105 arg0) {
        field5527++;
        class404 var2 = (class404) arg0;
        this.field5544 = var2.field5544;
        this.field5548 = var2.field5548;
        this.field5533 = var2.field5533;
        this.field5521 = var2.field5521;
        this.field5529 = var2.field5529;
        this.field5556 = var2.field5556;
        this.field5536 = var2.field5536;
        this.field5537 = var2.field5537;
        this.field5526 = var2.field5526;
        this.field5546 = var2.field5546;
        this.field5538 = var2.field5538;
        this.field5540 = var2.field5540;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/lang/String;I)V")
    public static final void method2412(int arg0, Color arg1, Color arg2, Color arg3, boolean arg4, String arg5, int arg6) {
        field5522++;
        try {
            Graphics var7 = class141.field1806.getGraphics();
            if (class523.field7293 == null) {
                class523.field7293 = new Font("Helvetica", 1, 13);
            }
            if (arg4) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class502.field6955, class604.field8711);
            }
            int var8 = -60 % ((-arg0 - 36) / 38);
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class31.field487 == null) {
                    class31.field487 = class141.field1806.createImage(304, 34);
                }
                Graphics var9 = class31.field487.getGraphics();
                var9.setColor(arg2);
                var9.drawRect(0, 0, 303, 33);
                var9.setColor(arg1);
                var9.fillRect(2, 2, arg6 * 3, 30);
                var9.setColor(Color.black);
                var9.drawRect(1, 1, 301, 31);
                var9.fillRect(arg6 * 3 + 2, 2, 300 - (arg6 * 3), 30);
                var9.setFont(class523.field7293);
                var9.setColor(arg3);
                var9.drawString(arg5, (304 - (arg5.length() * 6)) / 2, 22);
                var7.drawImage(class31.field487, class502.field6955 / 2 - 152, class604.field8711 / 2 + -18, null);
            } catch (Exception var12) {
                int var10 = class502.field6955 / 2 - 152;
                int var11 = class604.field8711 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var10 + 2, var11 + 2, arg6 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                var7.fillRect(arg6 * 3 + var10 + 2, var11 + 2, 300 - (arg6 * 3), 30);
                var7.setFont(class523.field7293);
                var7.setColor(arg3);
                var7.drawString(arg5, var10 + ((304 - (arg5.length() * 6)) / 2), var11 - -22);
            }
            if (class373.field5188 != null) {
                var7.setFont(class523.field7293);
                var7.setColor(arg3);
                var7.drawString(class373.field5188, class502.field6955 / 2 - (class373.field5188.length() * 6 / 2), class604.field8711 / 2 + -26);
            }
        } catch (Exception var13) {
            class141.field1806.repaint();
        }
    }

    @OriginalMember(owner = "client!hba", name = "TA", descriptor = "(III)V")
    public final void method365(int arg0, int arg1, int arg2) {
        this.field5546 += arg2;
        field5541++;
        this.field5544 += arg1;
        this.field5529 += arg0;
    }

    @OriginalMember(owner = "client!hba", name = "XA", descriptor = "(I)V")
    public final void method356(int arg0) {
        field5554++;
        float var2 = class90.field1217[arg0 & 0x3FFF];
        float var3 = class90.field1216[arg0 & 0x3FFF];
        float var4 = this.field5540;
        float var5 = this.field5526;
        float var6 = this.field5556;
        float var7 = this.field5529;
        this.field5540 = this.field5533 * var3 + var2 * var4;
        this.field5526 = this.field5538 * var3 + var2 * var5;
        this.field5533 = this.field5533 * var2 - var3 * var4;
        this.field5556 = this.field5521 * var3 + var2 * var6;
        this.field5538 = this.field5538 * var2 - var3 * var5;
        this.field5521 = this.field5521 * var2 - var3 * var6;
        this.field5529 = this.field5546 * var3 + var2 * var7;
        this.field5546 = this.field5546 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "()Lm;")
    public final class105 method357() {
        field5552++;
        class404 var1 = new class404();
        var1.field5533 = this.field5533;
        var1.field5538 = this.field5538;
        var1.field5529 = this.field5529;
        var1.field5536 = this.field5536;
        var1.field5546 = this.field5546;
        var1.field5526 = this.field5526;
        var1.field5544 = this.field5544;
        var1.field5548 = this.field5548;
        var1.field5537 = this.field5537;
        var1.field5540 = this.field5540;
        var1.field5521 = this.field5521;
        var1.field5556 = this.field5556;
        return var1;
    }

    @OriginalMember(owner = "client!hba", name = "ta", descriptor = "(I)V")
    public final void method355(int arg0) {
        this.field5521 = 1.0F;
        field5531++;
        this.field5540 = this.field5536 = class90.field1217[arg0 & 0x3FFF];
        this.field5548 = class90.field1216[arg0 & 0x3FFF];
        this.field5556 = this.field5529 = this.field5537 = this.field5544 = this.field5533 = this.field5538 = this.field5546 = 0.0F;
        this.field5526 = -this.field5548;
    }

    @OriginalMember(owner = "client!hba", name = "ma", descriptor = "(I)V")
    public final void method359(int arg0) {
        this.field5536 = 1.0F;
        field5532++;
        this.field5540 = this.field5521 = class90.field1217[arg0 & 0x3FFF];
        this.field5556 = class90.field1216[arg0 & 0x3FFF];
        this.field5533 = -this.field5556;
        this.field5526 = this.field5529 = this.field5548 = this.field5537 = this.field5544 = this.field5538 = this.field5546 = 0.0F;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
    public static final void method2413(int arg0, int arg1) {
        field5530++;
        if (arg1 == 0) {
            class592.field8548 = 3;
            class35.field537 = arg0;
            class535.field7468 = 100;
            class145.field1888 = -1;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IFIIFBF)V")
    public final void method2414(int arg0, float arg1, int arg2, int arg3, float arg4, byte arg5, float arg6) {
        if (arg5 >= -49) {
            this.method2414(91, 0.30736068F, 52, -99, -0.04184633F, (byte) 44, 0.9662552F);
        }
        field5525++;
        if (arg3 == 0) {
            this.field5540 = arg2;
            this.field5521 = 1.0F;
            this.field5536 = arg0;
            this.field5548 = this.field5533 = this.field5526 = this.field5538 = this.field5556 = this.field5537 = 0.0F;
        } else {
            float var8 = class90.field1217[arg3 & 0x3FFF];
            float var9 = class90.field1216[arg3 & 0x3FFF];
            this.field5536 = (float) arg0 * var8;
            this.field5548 = (float) arg2 * var9;
            this.field5533 = this.field5538 = this.field5556 = this.field5537 = 0.0F;
            this.field5526 = (float) arg0 * -var9;
            this.field5540 = (float) arg2 * var8;
            this.field5521 = 1.0F;
        }
        this.field5544 = arg6;
        this.field5546 = arg4;
        this.field5529 = arg1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III[I)V")
    public final void method363(int arg0, int arg1, int arg2, int[] arg3) {
        field5550++;
        arg3[2] = (int) ((float) arg2 * this.field5521 + (float) arg0 * this.field5533 + (float) arg1 * this.field5538 + this.field5546);
        arg3[1] = (int) ((float) arg2 * this.field5537 + (float) arg0 * this.field5548 + (float) arg1 * this.field5536 + this.field5544);
        arg3[0] = (int) ((float) arg2 * this.field5556 + (float) arg0 * this.field5540 + (float) arg1 * this.field5526 + this.field5529);
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)[F")
    public final float[] method2415(int arg0) {
        class222.field2848[8] = this.field5556;
        class222.field2848[1] = this.field5548;
        class222.field2848[5] = this.field5536;
        class222.field2848[2] = this.field5533;
        class222.field2848[10] = this.field5521;
        class222.field2848[14] = this.field5546;
        class222.field2848[13] = this.field5544;
        class222.field2848[arg0] = this.field5540;
        class222.field2848[12] = this.field5529;
        class222.field2848[9] = this.field5537;
        field5549++;
        class222.field2848[6] = this.field5538;
        class222.field2848[4] = this.field5526;
        return class222.field2848;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLm;)V")
    public final void method2416(byte arg0, class105 arg1) {
        field5523++;
        int var3 = -5 % ((arg0 + 53) / 49);
        class404 var4 = (class404) arg1;
        this.field5526 = var4.field5548;
        this.field5556 = var4.field5533;
        this.field5540 = var4.field5540;
        this.field5537 = var4.field5538;
        this.field5548 = var4.field5526;
        this.field5536 = var4.field5536;
        this.field5533 = var4.field5556;
        this.field5529 = -(this.field5556 * var4.field5546 + this.field5540 * var4.field5529 + this.field5526 * var4.field5544);
        this.field5521 = var4.field5521;
        this.field5538 = var4.field5537;
        this.field5544 = -(this.field5537 * var4.field5546 + this.field5548 * var4.field5529 + this.field5536 * var4.field5544);
        this.field5546 = -(this.field5521 * var4.field5546 + this.field5538 * var4.field5544 + this.field5533 * var4.field5529);
    }

    @OriginalMember(owner = "client!hba", name = "KA", descriptor = "(I)V")
    public final void method366(int arg0) {
        field5528++;
        this.field5540 = 1.0F;
        this.field5536 = this.field5521 = class90.field1217[arg0 & 0x3FFF];
        this.field5538 = class90.field1216[arg0 & 0x3FFF];
        this.field5526 = this.field5556 = this.field5529 = this.field5548 = this.field5544 = this.field5533 = this.field5546 = 0.0F;
        this.field5537 = -this.field5538;
    }

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "(I)V")
    public final void method358(int arg0) {
        field5539++;
        float var2 = class90.field1217[arg0 & 0x3FFF];
        float var3 = class90.field1216[arg0 & 0x3FFF];
        float var4 = this.field5548;
        float var5 = this.field5536;
        float var6 = this.field5537;
        this.field5548 = var2 * var4 - this.field5533 * var3;
        float var7 = this.field5544;
        this.field5533 = this.field5533 * var2 + var3 * var4;
        this.field5536 = var2 * var5 - this.field5538 * var3;
        this.field5538 = this.field5538 * var2 + var3 * var5;
        this.field5537 = var2 * var6 - this.field5521 * var3;
        this.field5544 = var2 * var7 - this.field5546 * var3;
        this.field5521 = this.field5521 * var2 + var3 * var6;
        this.field5546 = this.field5546 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)[F")
    public final float[] method2417(int arg0) {
        class222.field2848[4] = this.field5526;
        class222.field2848[8] = this.field5556;
        class222.field2848[1] = this.field5548;
        class222.field2848[2] = this.field5533;
        class222.field2848[5] = this.field5536;
        class222.field2848[0] = this.field5540;
        class222.field2848[13] = 0.0F;
        class222.field2848[14] = 0.0F;
        class222.field2848[10] = this.field5521;
        field5543++;
        class222.field2848[9] = this.field5537;
        if (arg0 <= 126) {
            this.method354();
        }
        class222.field2848[12] = 0.0F;
        class222.field2848[6] = this.field5538;
        return class222.field2848;
    }

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "(IIIIII)V")
    public final void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5553++;
        float var7 = class90.field1217[arg3 & 0x3FFF];
        float var8 = class90.field1216[arg3 & 0x3FFF];
        float var9 = class90.field1217[arg4 & 0x3FFF];
        float var10 = class90.field1216[arg4 & 0x3FFF];
        float var11 = class90.field1217[arg5 & 0x3FFF];
        float var12 = class90.field1216[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5537 = var9 * var13 + var10 * var12;
        this.field5521 = var7 * var9;
        this.field5533 = var7 * var10;
        this.field5548 = -var9 * var12 + var10 * var13;
        this.field5538 = -var8;
        this.field5526 = var7 * var12;
        this.field5556 = -var10 * var11 + var9 * var14;
        this.field5540 = var9 * var11 + var10 * var14;
        this.field5536 = var7 * var11;
        this.field5546 = (float) (-arg0) * this.field5533 - (float) arg1 * this.field5538 - ((float) arg2 * this.field5521);
        this.field5544 = (float) (-arg0) * this.field5548 - (float) arg1 * this.field5536 - (float) arg2 * this.field5537;
        this.field5529 = (float) (-arg0) * this.field5540 - (float) arg1 * this.field5526 - ((float) arg2 * this.field5556);
    }

    @OriginalMember(owner = "client!hba", name = "oa", descriptor = "(III)V")
    public final void method361(int arg0, int arg1, int arg2) {
        this.field5548 = this.field5533 = this.field5526 = this.field5538 = this.field5556 = this.field5537 = 0.0F;
        field5547++;
        this.field5540 = this.field5536 = this.field5521 = 1.0F;
        this.field5529 = arg0;
        this.field5544 = arg1;
        this.field5546 = arg2;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
    public class404() {
        this.method354();
    }
}
