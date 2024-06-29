import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class152 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lub;")
    public static class227 field2643 = class257.method1749("leuchten1:", 17263);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljk;")
    public static class192 field2641;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[Lna;")
    public static class209[] field2639;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2641 = null;
        field2639 = null;
        field2643 = null;
        if (arg0 <= 102) {
            method957(72);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lnj;I)V")
    public final void method958(class226 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1471(arg1 ^ 0xFF);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method958((class226) null, 112);
                }
                field2646++;
                return;
            }
            this.method959(arg0, 107, var3);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lnj;II)V")
    private final void method959(class226 arg0, int arg1, int arg2) {
        field2644++;
        if (arg1 < 54) {
            this.method958((class226) null, -86);
        }
        if (arg2 == 1) {
            this.field2647 = arg0.method1447(0);
            this.field2640 = arg0.method1471(255);
            this.field2642 = arg0.method1471(255);
        }
    }
}
