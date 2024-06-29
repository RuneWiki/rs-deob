import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class123 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Le;")
    public static class29 field2938 = new class29(64);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lda;")
    public static class23 field2940 = new class23();

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lu;")
    public static class135 field2942 = class87.method676((byte) -87, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lu;")
    public static class135 field2941 = class87.method676((byte) -54, "Wordpack geladen)3");

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public static int[] field2944 = new int[256];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lu;")
    public static class135 field2943 = class87.method676((byte) -97, "welle2:");

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2945 = 1;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I")
    public abstract int method967(byte arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method968(int arg0, Component arg1);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method969(byte arg0) {
        if (arg0 <= 101) {
            return;
        }
        for (int var1 = 0; var1 < class126.field3009; var1++) {
            int var2 = class97.field2358[var1];
            class145 var3 = class131.field3166[var2];
            int var4 = class23.field581.method480(0);
            if ((var4 & 0x40) != 0) {
                var4 += class23.field581.method480(0) << 8;
            }
            class95.method778(var3, var2, 86, var4);
        }
        field2939++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method970(Component arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2944 = null;
        field2940 = null;
        if (arg0 != -25933) {
            field2940 = null;
        }
        field2943 = null;
        field2942 = null;
        field2941 = null;
        field2938 = null;
    }
}
