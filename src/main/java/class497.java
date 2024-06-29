import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class497 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field6718 = class91.method503(-107);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/lang/String;")
    public String field6711;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/lang/String;")
    public String field6714;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Ljava/lang/String;")
    public String field6724;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field6720;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field6721;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Ljava/lang/String;")
    public String field6726;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljava/lang/String;")
    public String field6717;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field6716 = -1;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lrf;")
    public static class238[] field6723 = new class238[4];

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
    public static boolean field6725 = false;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2800(byte arg0) {
        field6722++;
        if (!class613.field8378) {
            return;
        }
        class188 var1 = class630.method3443(class68.field898, -1, class59.field828);
        if (var1 != null && var1.field2459 != null) {
            class425 var2 = new class425();
            var2.field5913 = var1.field2459;
            var2.field5911 = var1;
            class317.method2051(var2);
        }
        class664.field9413 = -1;
        class443.field6115 = -1;
        if (arg0 > -24) {
            method2801(true);
        }
        class613.field8378 = false;
        if (var1 != null) {
            class553.method3100(var1, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 38)
    public static void method2801(boolean arg0) {
        if (arg0) {
            field6716 = -19;
        }
        field6723 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 48)
    public final void method2802(String arg0, byte arg1, int arg2, int arg3, String arg4, String arg5, String arg6, int arg7, String arg8) {
        this.field6718 = class91.method503(-121);
        field6715++;
        this.field6721 = arg3;
        this.field6724 = arg4;
        this.field6726 = arg8;
        this.field6719 = arg2;
        if (arg1 != 2) {
            method2801(false);
        }
        this.field6712 = class430.field5984;
        this.field6717 = arg0;
        this.field6720 = arg7;
        this.field6714 = arg5;
        this.field6711 = arg6;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILfca;IZ)V", line = 83)
    public static final void method2803(int arg0, class188 arg1, int arg2, boolean arg3) {
        class541.field7416 = arg1;
        class60.field842 = arg0;
        field6713++;
        class635.field8652 = arg2;
        if (!arg3) {
            method2800((byte) -25);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 102)
    public class497(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field6711 = arg7;
        this.field6714 = arg5;
        this.field6724 = arg3;
        this.field6720 = arg6;
        this.field6712 = class430.field5984;
        this.field6721 = arg0;
        this.field6726 = arg2;
        this.field6719 = arg1;
        this.field6717 = arg4;
    }
}
