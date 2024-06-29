import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class class36 {

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Ltm;")
    public static class112 field621 = new class112("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Lcs;")
    public static class351 field624 = new class351(71, 18);

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Ldc;")
    public static class167 field622;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "[Laq;")
    public static class385[] field626;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public static final void method303(int arg0) {
        field620++;
        class422.field5809 = new class445(8);
        class81.field1220 = arg0;
        for (class83 var1 = (class83) class70.field1038.method2823(64); var1 != null; var1 = (class83) class70.field1038.method2818(0)) {
            var1.method569();
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
    public abstract int method304(boolean arg0);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method305(Component arg0, int arg1);

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
    public static void method306(boolean arg0) {
        field622 = null;
        field621 = null;
        if (!arg0) {
            field626 = null;
            field624 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method307(int arg0, Component arg1);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBI)I")
    public static final int method308(int arg0, byte arg1, int arg2) {
        if (arg1 != 24) {
            return -74;
        }
        field623++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }
}
