import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class772 extends class683 {

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "B")
    private byte field10612;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "B")
    private byte field10613;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Ljava/lang/String;")
    private String field10617;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhr;B)V")
    public final void method1668(class551 arg0, byte arg1) {
        field10614++;
        if (arg1 != -60) {
            method4246(76, 66, -70, null);
        }
        if (this.field10617 != null) {
            arg0.field7615 = this.field10612;
            arg0.field7610 = this.field10613;
        }
        arg0.field7604 = this.field10617;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ldt;I)V")
    public final void method1666(class254 arg0, int arg1) {
        if (arg1 > -81) {
            return;
        }
        field10618++;
        this.field10617 = arg0.method1694(0);
        if (this.field10617 != null) {
            arg0.method1731((byte) 64);
            this.field10613 = arg0.method1737(true);
            this.field10612 = arg0.method1737(true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method4245(int arg0) {
        class429.field6219 = null;
        class339.field4752 = null;
        class90.field1279 = null;
        class324.field4598 = null;
        class34.field374 = null;
        class120.field1627 = null;
        class446.field6414 = null;
        class574.field7826 = null;
        class584.field7966 = null;
        field10619++;
        if (arg0 == 30003) {
            ;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILcm;)V")
    public static final void method4246(int arg0, int arg1, int arg2, class758 arg3) {
        if (arg1 == -15715) {
            field10615++;
            int[] var4 = new int[4];
            class421.method2532(var4, 0, var4.length, arg0);
            class661.method3663(arg3, var4, (byte) 106, arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
    public static final void method4247(String arg0, int arg1, String arg2, boolean arg3) {
        class669.field8960 = arg0;
        class115.field1558 = arg2;
        field10616++;
        class34.field355 = arg3;
        if (!class34.field355 && class115.field1558.equals("") || class669.field8960.equals("")) {
            class623.method3439(3, arg1 ^ 0x7D);
            return;
        }
        if (class159.field2142 != 1) {
            class687.field9181 = 0;
            class544.field7525 = -1;
        }
        class160.field2151 = false;
        class623.method3439(-3, 121);
        class624.field8417 = 0;
        class733.field9917 = 1;
        class528.field7308 = arg1;
    }
}
