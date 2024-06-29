import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class287 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field4367 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field4366 = 2048;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field4368 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field4372 = 2048;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lnn;")
    public static class151 field4370 = new class151("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lwl;")
    public static class452 field4373 = new class452(80, -2);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "D")
    public static double field4374 = -1.0D;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    public static int[] field4375 = new int[2500];

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field4375 = null;
        if (arg0 == -6028) {
            field4370 = null;
            field4373 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILef;II)V")
    private final void method1776(int arg0, class385 arg1, int arg2, int arg3) {
        if (arg2 != -22990) {
            this.field4368 = 36;
        }
        if (arg0 == 1) {
            this.field4368 = arg1.method2343(255);
        } else if (arg0 == 2) {
            this.field4366 = arg1.method2323(arg2 ^ 0x59B4);
        } else if (arg0 == 3) {
            this.field4372 = arg1.method2323(arg2 ^ 0x59CF);
        } else if (arg0 == 4) {
            this.field4367 = arg1.method2327((byte) -116);
        }
        field4371++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lef;BI)V")
    public final void method1777(class385 arg0, byte arg1, int arg2) {
        int var4 = 83 % ((20 - arg1) / 59);
        while (true) {
            int var5 = arg0.method2343(255);
            if (var5 == 0) {
                field4369++;
                return;
            }
            this.method1776(var5, arg0, -22990, arg2);
        }
    }
}
