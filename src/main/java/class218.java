import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class218 extends class271 {

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Lek;")
    public class172 field3722;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "[Z")
    public static boolean[] field3723 = new boolean[8];

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Lwa;")
    public static class75 field3726 = class66.method560("Konfig geladen)3", false);

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "[Z")
    public static boolean[] field3727 = new boolean[100];

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "[Z")
    public static boolean[] field3721;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lwa;Z)I", line = 13)
    public static final int method1594(class75 arg0, boolean arg1) {
        field3724++;
        if (arg1) {
            return 111;
        } else if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class40.field628; var2++) {
                if (arg0.method614(class106.field1779[var2], -66)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)V", line = 40)
    public static final void method1595(int arg0, byte arg1, int arg2) {
        field3725++;
        class270.field4660 = class213.field3629[arg0][arg2].field3909;
        int var3 = 23 / ((-arg1 - 54) / 38);
        class7.field83 = class213.field3629[arg0][arg2].field3908;
        class90.field1489 = class213.field3629[arg0][arg2].field3910;
        class239.method1746((float) class270.field4660, (float) class7.field83, (float) class90.field1489);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lek;)V", line = 51)
    public class218(class172 arg0) {
        this.field3722 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 68)
    public static void method1596(byte arg0) {
        field3727 = null;
        field3723 = null;
        if (arg0 <= -50) {
            field3721 = null;
            field3726 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V", line = 91)
    public static final void method1597(int arg0) {
        for (int var1 = arg0; var1 < class121.field2031; var1++) {
            int var2 = class132.field2281[var1];
            class295 var3 = class35.field521[var2];
            if (var3 != null) {
                class29.method200(arg0, var3, var3.field5070.field3854);
            }
        }
        field3728++;
    }
}
