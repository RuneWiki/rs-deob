import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class325 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    public static int[] field4871 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lo;")
    public static class332 field4873 = new class332("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
    public static int[] field4876 = new int[50];

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 7)
    public static void method2003(int arg0) {
        field4876 = null;
        field4873 = null;
        field4871 = null;
        if (arg0 != 16711680) {
            field4875 = -82;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIII)V", line = 25)
    public static final void method2004(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -117) {
            return;
        }
        field4874++;
        int var4 = class337.field5038.field3946 * arg3 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class132.method919(class476.field6654, arg1, false, 0, 6481, var4);
            class208.field3142 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZJ)V", line = 53)
    public static final void method2005(boolean arg0, long arg1) {
        field4872++;
        if (!arg0 || arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class476.method2770(false, arg1 - 1L);
            class476.method2770(false, 1L);
        } else {
            class476.method2770(false, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public abstract void method716(byte arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public abstract int method719(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)J")
    public abstract long method718(boolean arg0);
}
