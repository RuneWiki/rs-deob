import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class217 {

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lck;")
    private final class119 field3499;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
    private final boolean field3500;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lck;")
    public final class119 field3508;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lck;")
    private final class119 field3504;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lck;")
    public final class119 field3506;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public final int field3492;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lck;")
    public static class119 field3493 = class298.method1987((byte) 86, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lck;")
    public static class119 field3496 = class298.method1987((byte) 74, "scrollbar");

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    public static int[] field3503 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "S")
    public static short field3505 = 205;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "[Lnc;")
    public static class266[] field3510 = new class266[4];

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lck;")
    public static class119 field3509 = class298.method1987((byte) 24, "(Z");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "F")
    public static float field3501;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[Lmd;")
    public static class88[] field3498;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 4)
    public static void method1371(int arg0) {
        field3503 = null;
        field3498 = null;
        if (arg0 <= -43) {
            field3496 = null;
            field3493 = null;
            field3510 = null;
            field3509 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILwi;Z)V", line = 67)
    public static final void method1372(int arg0, class23 arg1, boolean arg2) {
        field3495++;
        if (class102.field1557 != null) {
            class102.field1557.field44 = arg0 * 8 + 5;
            int var3 = class102.field1557.method71(-668527048);
            int var4 = class102.field1557.method71(-668527048);
            arg1.method178(var3, var4, -2210);
            return;
        }
        class87.method593((byte) 0, 0, true, 455041648, 255, (class23) null, 255);
        if (arg2) {
            field3498 = (class88[]) null;
        }
        class129.field1976[arg0] = arg1;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lck;Lck;Lck;IZLck;)V", line = 97)
    public class217(class119 arg0, class119 arg1, class119 arg2, int arg3, boolean arg4, class119 arg5) {
        this.field3499 = arg1;
        this.field3500 = arg4;
        this.field3508 = arg0;
        this.field3504 = arg5;
        this.field3506 = arg2;
        this.field3492 = arg3;
    }
}
