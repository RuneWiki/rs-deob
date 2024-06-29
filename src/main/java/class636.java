import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class636 {

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Lkv;")
    public static class227 field9304 = new class227();

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public int field9301;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lkda;")
    public static class328 field9300;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Lpc;")
    public class577 field9299;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lkr;")
    public class636 field9302;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[Lek;")
    public static class434[] field9306;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 5)
    public static void method3692(byte arg0) {
        field9300 = null;
        field9304 = null;
        int var1 = -111 % ((40 - arg0) / 59);
        field9306 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([BII)[B", line = 17)
    public static final byte[] method3693(byte[] arg0, int arg1, int arg2) {
        field9303++;
        byte[] var3 = new byte[arg2];
        class648.method3737(arg0, 0, var3, arg1, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 30)
    public final void method3694(int arg0) {
        field9305++;
        if (~class212.field3122 <= arg0) {
            return;
        }
        this.field9301 = 0;
        this.field9299 = null;
        this.field9302 = class394.field5424;
        class212.field3122++;
        class394.field5424 = this;
    }
}
