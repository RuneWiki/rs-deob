import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class325 extends class406 {

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "S")
    public short field4623;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[I")
    public static int[] field4625;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Ljj;")
    public static class60 field4626;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[[[B")
    public static byte[][][] field4622;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2112(String arg0, int arg1, int arg2, String arg3, int arg4, String arg5) {
        field4624++;
        class123.method780(-1, arg5, arg3, arg1, arg4 + 27338, arg0, arg2, (String) null);
        if (arg4 != -27259) {
            field4622 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lve;")
    public static final class292 method2113(Canvas arg0, byte arg1) {
        if (arg1 <= 8) {
            return null;
        }
        field4627++;
        try {
            Class var2 = Class.forName("jn");
            class292 var3 = (class292) var2.getDeclaredConstructor().newInstance();
            var3.method1639(arg0, 1730965570);
            return var3;
        } catch (Throwable var5) {
            class240 var4 = new class240();
            var4.method1639(arg0, 1730965570);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class325() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(S)V")
    public class325(short arg0) {
        this.field4623 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public static void method2114(byte arg0) {
        field4625 = null;
        if (arg0 >= -26) {
            method2114((byte) -21);
        }
        field4622 = null;
        field4626 = null;
    }

    static {
        new class362("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field4625 = new int[256];
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4625[var0] = var1;
        }
    }
}
