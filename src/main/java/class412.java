import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class412 extends class665 {

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Ljava/lang/String;")
    public String field6002;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[Lfga;")
    public static class229[] field6003;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILpu;I)Luq;", line = 8)
    public static final class146 method2482(int arg0, class522 arg1, int arg2) {
        field6001++;
        int var3 = 31 % ((arg0 + 21) / 47);
        byte[] var4 = arg1.method2994(arg2, (byte) 93);
        return var4 == null ? null : new class146(var4);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 23)
    public static void method2483(int arg0) {
        field6003 = null;
        if (arg0 != -6909) {
            method2483(-33);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 34)
    public class412() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
    public class412(String arg0, int arg1) {
        this.field6002 = arg0;
    }
}
