import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class369 {

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field5541 = -1;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public int field5534 = -1;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field5542 = 2;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
    public int[] field5536;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[[B")
    public static byte[][] field5535;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLae;)V")
    public final void method2247(boolean arg0, class156 arg1) {
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method941((byte) 125);
            if (var3 == 0) {
                field5537++;
                return;
            }
            this.method2249(arg1, var3, 30);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
    public static final int method2248(int arg0, int arg1, int arg2) {
        field5540++;
        int var3 = arg1 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg1 & arg2) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lae;II)V")
    private final void method2249(class156 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field5541 = arg0.method993((byte) -78);
        } else if (arg1 == 2) {
            this.field5536 = new int[arg0.method941((byte) 126)];
            for (int var4 = 0; var4 < this.field5536.length; var4++) {
                this.field5536[var4] = arg0.method993((byte) -67);
            }
        } else if (arg1 == 3) {
            this.field5534 = arg0.method941((byte) 124);
        }
        field5538++;
        if (arg2 <= 22) {
            method2250((byte) 7);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method2250(byte arg0) {
        if (arg0 != -69) {
            field5535 = null;
        }
        field5535 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
    public static final void method2251(int arg0, byte arg1) {
        if (arg0 == 37) {
            class249.field3576 = 3.0F;
        } else if (arg0 == 50) {
            class249.field3576 = 4.0F;
        } else if (arg0 == 75) {
            class249.field3576 = 6.0F;
        } else if (arg0 == 100) {
            class249.field3576 = 8.0F;
        } else if (arg0 == 200) {
            class249.field3576 = 16.0F;
        }
        field5539++;
        if (arg1 < -77) {
            class134.field1711 = -1;
            class134.field1711 = -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILhe;I)Luj;")
    public static final class248 method2252(int arg0, int arg1, class239 arg2, int arg3) {
        field5543++;
        class156 var4 = new class156(arg2.method1470(4, arg3, arg0));
        class248 var5 = new class248(arg3, var4.method981(false), var4.method981(false), var4.method950(186), var4.method950(186), var4.method941((byte) 124) == 1, var4.method941((byte) 126), var4.method941((byte) 124));
        int var6 = var4.method941((byte) 125);
        for (int var7 = arg1; var7 < var6; var7++) {
            var5.field3557.method2086((byte) -120, new class39(var4.method941((byte) 124), var4.method993((byte) -50), var4.method993((byte) -71), var4.method993((byte) -110), var4.method993((byte) -128), var4.method993((byte) -121), var4.method993((byte) -125), var4.method993((byte) -121), var4.method993((byte) -125)));
        }
        var5.method1548(-28825);
        return var5;
    }
}
