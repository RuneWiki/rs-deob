import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public abstract class class24 {

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Lw;")
    public static class38 field335 = class35.method219("Food Shop", true);

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "I")
    public static int field340 = 0;

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "Z")
    public static boolean field343 = false;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "Lw;")
    public static class38 field345 = class35.method219("Kebab Seller", true);

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field337 = -1;

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "[I")
    public static int[] field346 = new int[128];

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Lw;")
    public static class38 field342 = class35.method219("Farming patch", true);

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "Lm;")
    public static class22 field338;

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field344;

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "[I")
    public int[] field347;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "[Ll;")
    public static class20[] field339;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)I", line = 25)
    public static final int method157(int arg0) {
        if (arg0 != 255) {
            return 12;
        } else if (class5.field34 == null) {
            return 0;
        } else if (class5.field34.field486 == null) {
            return class8.field65[class5.field34.field488 & 0xFF];
        } else {
            return class8.field65[class5.field34.field486[mapview.field257] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 53)
    public static void method158(int arg0) {
        field335 = null;
        field339 = null;
        field346 = null;
        if (arg0 != 255) {
            field336 = 59;
        }
        field345 = null;
        field338 = null;
        field342 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(I)V", line = 74)
    public final void method159(int arg0) {
        class15.method79(this.field347, this.field334, this.field341);
        if (arg0 > -44) {
            field346 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "()V", line = 95)
    protected class24() {
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([BI)V", line = 103)
    public static final void method160(byte[] arg0, int arg1) {
        class18 var2 = new class18(arg0);
        var2.field186 = arg0.length - 2;
        class19.field187 = var2.method107(-5286);
        class23.field242 = new int[class19.field187];
        class38.field505 = new int[class19.field187];
        class35.field480 = new int[class19.field187];
        class31.field401 = new int[class19.field187];
        class32.field418 = new byte[class19.field187][];
        var2.field186 = arg0.length - class19.field187 * 8 - 7;
        class10.field87 = var2.method107(-5286);
        class31.field409 = var2.method107(-5286);
        int var3 = (var2.method103(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class19.field187; var4++) {
            class35.field480[var4] = var2.method107(-5286);
        }
        if (arg1 != -13784) {
            method160(null, -31);
        }
        for (int var5 = 0; var5 < class19.field187; var5++) {
            class23.field242[var5] = var2.method107(-5286);
        }
        for (int var6 = 0; var6 < class19.field187; var6++) {
            class38.field505[var6] = var2.method107(-5286);
        }
        for (int var7 = 0; var7 < class19.field187; var7++) {
            class31.field401[var7] = var2.method107(arg1 + 8498);
        }
        var2.field186 = arg0.length - class19.field187 * 8 - (var3 - 1) * 3 - 7;
        class1.field6 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class1.field6[var8] = var2.method112(class34.method204(arg1, -1687212456));
            if (class1.field6[var8] == 0) {
                class1.field6[var8] = 1;
            }
        }
        var2.field186 = 0;
        for (int var9 = 0; var9 < class19.field187; var9++) {
            int var10 = class38.field505[var9];
            int var11 = class31.field401[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class32.field418[var9] = var13;
            int var14 = var2.method103(255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method109(false);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method109(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method40(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public abstract void method41(Graphics arg0, int arg1, int arg2, boolean arg3);
}
