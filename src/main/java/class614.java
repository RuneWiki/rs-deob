import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class614 {

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
    public int field8714 = -1;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public int field8716 = -1;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public int field8710 = -1;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
    public static int field8712 = 0;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "Lhl;")
    public static class353 field8711 = new class353(4, 1);

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "I")
    public int field8706;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
    public int field8707;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
    public int field8708;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "I")
    public int field8709;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public int field8713;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public int field8715;

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V", line = 11)
    public static void method3539(byte arg0) {
        int var1 = -3 / ((89 - arg0) / 32);
        field8711 = null;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lgga;Lgga;Lgga;ILiv;Lof;)Z", line = 31)
    public static final boolean method3540(class513 arg0, class513 arg1, class513 arg2, int arg3, class635 arg4, class477 arg5) {
        class475.field6454 = new int[arg3];
        class233.field3384 = arg5;
        class781.field10715 = arg0;
        class771.field10639 = arg4;
        field8717++;
        class300.field4324 = arg1;
        class470.field6407 = arg2;
        for (int var6 = 0; var6 < 16; var6++) {
            class475.field6454[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lfm;)V", line = 64)
    public class614(class281 arg0) {
    }
}
