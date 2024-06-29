import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class753 extends class354 {

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "Lria;")
    public static class288 field10505 = null;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "Lhg;")
    public static class693 field10503 = new class693(46, 3);

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field10508 = 0;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public static int field10504;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public static int field10507;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BIII)V", line = 5)
    public static final void method4184(byte arg0, int arg1, int arg2, int arg3) {
        ++field10502;
        class37 var4 = class636.method3571(11, arg1, -115);
        var4.method232(-3);
        var4.field582 = arg3;
        if (arg0 >= 86) {
            var4.field579 = arg2;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)I", line = 21)
    public final int method393(byte arg0) {
        ++field10500;
        int var2 = 107 % ((arg0 - 37) / 63);
        return 127;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lwo;)V", line = 31)
    public class753(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(II)V", line = 35)
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        if (arg0 != -1) {
            this.method393((byte) -72);
        }
        ++field10501;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(ILwo;)V", line = 47)
    public class753(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 50)
    public final void method388(int arg0) {
        ++field10506;
        if (arg0 != 6384) {
            field10505 = null;
        }
        if (~super.field4545 > -1 && super.field4545 > 127) {
            super.field4545 = this.method393((byte) 122);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V", line = 67)
    public static void method4185(int arg0) {
        if (arg0 == 127) {
            field10503 = null;
            field10505 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(II)I", line = 78)
    public final int method391(int arg0, int arg1) {
        ++field10504;
        if (arg0 != 3) {
            this.method393((byte) -103);
        }
        return 1;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)I", line = 89)
    public final int method4186(byte arg0) {
        int var2 = -91 / ((7 - arg0) / 45);
        ++field10507;
        return super.field4545;
    }
}
