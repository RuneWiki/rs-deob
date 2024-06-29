import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class38 {

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "[[[[B")
    public static byte[][][][] field506 = new byte[5][][][];

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "Lna;")
    public static class26 field504 = class33.method219(" map", 121);

    @OriginalMember(owner = "mapview!ta", name = "i", descriptor = "Z")
    public static boolean field509 = false;

    @OriginalMember(owner = "mapview!ta", name = "h", descriptor = "Lna;")
    public static class26 field508 = class33.method219("sprites", 119);

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "I")
    public static volatile int field502 = -1;

    @OriginalMember(owner = "mapview!ta", name = "j", descriptor = "Lna;")
    public static class26 field510 = class33.method219("Farming patch", 90);

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "Lna;")
    public static class26 field501 = class33.method219("Next page", 112);

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "B")
    public byte field505;

    @OriginalMember(owner = "mapview!ta", name = "k", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "Lh;")
    public static class14 field507;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "[B")
    public byte[] field503;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)V", line = 16)
    public final void method240(int arg0) {
        boolean var2 = true;
        if (this.field503 != null) {
            this.field505 = this.field503[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field503[var3] != this.field505) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field503 = null;
            }
        }
        if (arg0 != 0) {
            method244(38);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)V", line = 55)
    public static void method241(byte arg0) {
        field507 = null;
        field508 = null;
        int var1 = -48 % ((-arg0 - 1) / 40);
        field510 = null;
        field506 = null;
        field501 = null;
        field504 = null;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 107)
    public static final void method242(Component arg0, boolean arg1) {
        arg0.addMouseListener(class6.field64);
        arg0.addMouseMotionListener(class6.field64);
        if (!arg1) {
            method241((byte) -78);
        }
        arg0.addFocusListener(class6.field64);
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(I)I", line = 119)
    public static final int method243(int arg0) {
        if (arg0 != 255) {
            field502 = -93;
        }
        if (class26.field407 == null) {
            return 0;
        } else if (class26.field407.field503 == null) {
            return class12.field118[class26.field407.field505 & 0xFF];
        } else {
            return class12.field118[class26.field407.field503[class6.field65] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "(I)[Lq;", line = 138)
    public static final class31[] method244(int arg0) {
        class31[] var1 = new class31[class28.field427];
        for (int var2 = arg0; var2 < class28.field427; var2++) {
            class31 var3 = new class31();
            var3.field460 = class25.field379[var2];
            var3.field462 = class10.field100[var2];
            var3.field463 = class10.field92[var2];
            var3.field459 = class39.field520[var2];
            byte[] var4 = class2.field27[var2];
            int var5 = var3.field463 * var3.field459;
            var3.field461 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field461[var6] = class29.field446[class22.method119(var4[var6], 255)];
            }
            var1[var2] = var3;
        }
        class6.method34(-14485);
        return var1;
    }
}
