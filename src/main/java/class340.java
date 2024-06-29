import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class340 {

    @OriginalMember(owner = "client!up", name = "e", descriptor = "[I")
    public int[] field4696 = new int[3];

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[Lwt;")
    public class325[] field4697 = new class325[100];

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[I")
    public int[] field4694 = new int[100];

    @OriginalMember(owner = "client!up", name = "h", descriptor = "[Lfq;")
    public class87[] field4699 = new class87[8];

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Leo;")
    public static class443 field4695 = new class443(3, 2);

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public static int field4703 = -1;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field4705 = 0;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Ljd;")
    public static class383 field4704 = new class383("LOCAL", 4);

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "Lvc;")
    public static class89 field4702;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4693;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "[Lij;")
    public static class241[] field4692;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "[Z")
    public static boolean[] field4698;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 4)
    public static void method2126(byte arg0) {
        if (arg0 != 8) {
            return;
        }
        field4704 = null;
        field4692 = null;
        field4695 = null;
        field4698 = null;
        field4702 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lnl;Z)V", line = 35)
    public static final void method2127(class435 arg0, boolean arg1) {
        field4701++;
        if (!arg1) {
            field4706 = -21;
        }
        class347.field4786 = arg0;
    }
}
