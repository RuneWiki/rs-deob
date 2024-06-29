import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class28 extends class161 {

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "Ljava/lang/String;")
    public String field322;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lrm;")
    public static class234 field319 = new class234(64);

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "[Loh;")
    public static class231[] field323 = new class231[0];

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "Lmo;")
    public static class447 field324;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)V", line = 10)
    public static final void method181(int arg0, byte arg1) {
        field320++;
        class52 var2 = class216.field3527;
        synchronized (class216.field3527) {
            class216.field3527.method337(arg0, (byte) -113);
            if (arg1 < 6) {
                field324 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V", line = 26)
    public static void method182(int arg0) {
        field323 = null;
        field324 = null;
        if (arg0 != 64) {
            field323 = null;
        }
        field319 = null;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 39)
    public class28() {
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 46)
    public class28(String arg0, int arg1) {
        this.field322 = arg0;
    }
}
