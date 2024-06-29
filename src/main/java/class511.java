import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class511 extends class513 {

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public int field7467;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public int field7468;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
    public boolean field7471;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "[Lf;")
    public static class701[] field7470;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILeba;)V", line = 6)
    public static final void method3028(int arg0, class543 arg1) {
        if (arg0 != 7482) {
            return;
        }
        field7466++;
        class349.field4587.method1129(arg1, 262144);
        arg1.field7874 = arg1.field7872.field5195;
        arg1.field7872.field5195 = 0;
        class628.field9000 += arg1.field7874;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 21)
    public static void method3029(byte arg0) {
        if (arg0 != -82) {
            field7473 = -94;
        }
        field7470 = null;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)Lrh;", line = 37)
    public static final class242 method3030(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6217;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIIZ)V", line = 45)
    public class511(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7469 = arg1;
        this.field7474 = arg0;
        this.field7467 = arg2;
        this.field7472 = arg3;
        this.field7468 = arg4;
        this.field7471 = arg5;
    }
}
