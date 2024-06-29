import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class377 extends class36 {

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "Lgd;")
    public static class206 field5195 = new class206("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "Lkk;")
    public static class114 field5197;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "[I")
    public static int[] field5193;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "[I")
    public static int[] field5196;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)I", line = 5)
    public static final int method2315(boolean arg0, int arg1) {
        field5194++;
        if (!arg0) {
            method2315(true, 96);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIIIII)V", line = 30)
    public static final void method2316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 >= -52) {
            method2318(73);
        }
        field5191++;
        class108.method673(arg4, arg3, arg1, 0, arg0, arg2, arg6, arg7, (byte) 25, arg5);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 41)
    public static void method2317(byte arg0) {
        int var1 = -15 / ((-arg0 - 50) / 62);
        field5195 = null;
        field5193 = null;
        field5197 = null;
        field5196 = null;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 53)
    public static final void method2318(int arg0) {
        if (arg0 != 2850) {
            field5195 = null;
        }
        field5192++;
        if (class76.field1030) {
            return;
        }
        if (class488.field6789.field6670) {
            class239.field3186 = (float) ((int) class239.field3186 - 17 & 0xFFFFFFF0);
        } else {
            class63.field842 += (-class63.field842 - 12.0F) / 2.0F;
        }
        class76.field1030 = true;
        class82.field1094 = true;
    }
}
