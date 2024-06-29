import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class95 implements class690 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/lang/String;")
    private String field1203;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lkha;")
    private class687 field1202;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lmq;")
    public static class78 field1201 = new class78(88, 6);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1205;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
    public final int method648(byte arg0) {
        field1207++;
        if (this.field1202.method3840(this.field1203, -1)) {
            return 100;
        } else if (arg0 > -101) {
            return 24;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method649(int arg0) {
        if (arg0 == 88) {
            field1201 = null;
            field1205 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lam;")
    public final class309 method650(byte arg0) {
        if (arg0 != 8) {
            this.method648((byte) -33);
        }
        field1204++;
        return class309.field3949;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lkha;Ljava/lang/String;)V")
    public class95(class687 arg0, String arg1) {
        this.field1203 = arg1;
        this.field1202 = arg0;
    }
}
