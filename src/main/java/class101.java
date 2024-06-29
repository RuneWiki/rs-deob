import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class101 extends class120 {

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Lgr;")
    public static class247 field1411;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Lmp;")
    public static class452 field1414;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Z")
    public boolean field1409;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V", line = 5)
    public final void method193(int arg0) {
        if (arg0 != 0) {
            field1406 = -102;
        }
        field1407++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 19)
    public static void method763(int arg0) {
        field1414 = null;
        field1411 = null;
        if (arg0 != 28198) {
            field1406 = 102;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILe;IIZLhm;I)V", line = 35)
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        field1412++;
        if (arg3 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z", line = 47)
    public final boolean method186(int arg0) {
        if (arg0 != 0) {
            this.field1405 = 114;
        }
        field1410++;
        return false;
    }
}
