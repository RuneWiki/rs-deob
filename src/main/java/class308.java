import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class308 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lbd;")
    public static class162 field5171 = class17.method142(0, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lda;")
    public static class143 field5176;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5173;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 24)
    public static void method2089(byte arg0) {
        if (arg0 == 100) {
            field5171 = null;
            field5173 = null;
            field5176 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLda;Lda;Lda;)V", line = 36)
    public static final void method2090(boolean arg0, class143 arg1, class143 arg2, class143 arg3) {
        field5175++;
        class158.field2786 = arg1;
        class261.field4352 = arg2;
        if (arg0) {
            field5174 = -95;
        }
        class200.field3402 = arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V", line = 51)
    public static final void method2091() {
        if (class57.field896 != null) {
            for (int var0 = 0; var0 < class57.field896.length; var0++) {
                for (int var1 = 0; var1 < class32.field524; var1++) {
                    for (int var2 = 0; var2 < class158.field2787; var2++) {
                        class57.field896[var0][var1][var2] = null;
                    }
                }
            }
        }
        class274.field4545 = (class26[][]) null;
        if (class86.field1528 != null) {
            for (int var3 = 0; var3 < class86.field1528.length; var3++) {
                for (int var4 = 0; var4 < class32.field524; var4++) {
                    for (int var5 = 0; var5 < class158.field2787; var5++) {
                        class86.field1528[var3][var4][var5] = null;
                    }
                }
            }
        }
        class315.field5316 = (class26[][]) null;
        class127.field2314 = 0;
        if (class129.field2335 != null) {
            for (int var6 = 0; var6 < class127.field2314; var6++) {
                class129.field2335[var6] = null;
            }
        }
        if (class98.field1785 != null) {
            for (int var7 = 0; var7 < class72.field1145; var7++) {
                class98.field1785[var7] = null;
            }
            class72.field1145 = 0;
        }
        if (class23.field398 != null) {
            for (int var8 = 0; var8 < class23.field398.length; var8++) {
                class23.field398[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lda;Z)V", line = 156)
    public static final void method2092(class143 arg0, boolean arg1) {
        field5172++;
        if (!arg1) {
            class186.field3203 = arg0.method1136(class151.field2695, 63);
            class263.field4393 = arg0.method1136(class250.field4156, 63);
        }
    }
}
