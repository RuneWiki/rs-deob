import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class414 {

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "B")
    public byte field5323;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "B")
    public byte field5325;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "S")
    public short field5330;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Lsj;")
    public class373 field5324;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Lnj;")
    public static class415 field5326 = new class415(15, 11);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Ltp;")
    public static class545 field5331;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Lpe;")
    public static class615 field5327;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2338(int arg0) {
        field5329++;
        class195.field2541.method3656((byte) 0);
        if (arg0 != 11) {
            field5331 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V", line = 25)
    public static void method2339(boolean arg0) {
        field5331 = null;
        field5327 = null;
        if (!arg0) {
            field5331 = null;
        }
        field5326 = null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lsj;III)V", line = 40)
    public class414(class373 arg0, int arg1, int arg2, int arg3) {
        this.field5323 = (byte) arg2;
        this.field5325 = (byte) arg3;
        this.field5330 = (short) arg1;
        this.field5324 = arg0;
    }
}
