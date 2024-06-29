import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class62 extends class79 {

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lfi;")
    public static class332 field718 = new class332(5000);

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lon;")
    public static class184 field721 = null;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field722;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ldg;B)V")
    public static final void method357(class236 arg0, byte arg1) {
        int var2 = -22 % ((-arg1 - 1) / 41);
        field720++;
        byte[] var3 = new byte[24];
        if (class348.field4944 != null) {
            try {
                class348.field4944.method2502(0L, (byte) 83);
                class348.field4944.method2505(var3, (byte) -108);
                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var3[var5] = -1;
                }
            }
        }
        arg0.method1571(var3, 86, 24, 0);
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
    public static void method358(int arg0) {
        field718 = null;
        field721 = null;
        field722 = null;
        if (arg0 != -30094) {
            field722 = null;
        }
    }
}
