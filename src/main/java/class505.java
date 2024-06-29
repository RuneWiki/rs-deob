import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class505 {

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "B")
    private byte field7341;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public int field7340;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "I")
    public int field7346;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "[Lgba;")
    public static class700[] field7343 = new class700[14];

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7344 = "";

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "Lla;")
    public static class423 field7338;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3085(boolean arg0) {
        field7343 = null;
        field7344 = null;
        field7338 = null;
        if (arg0) {
            field7338 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(Z)I", line = 22)
    public final int method3086(boolean arg0) {
        field7347++;
        return arg0 ? 71 : this.field7341 & 0x7;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)I", line = 43)
    public final int method3087(byte arg0) {
        if (arg0 <= 91) {
            field7339 = -84;
        }
        field7349++;
        return (this.field7341 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 59)
    public class505() {
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lsl;)V", line = 61)
    public class505(class479 arg0) {
        this.field7341 = arg0.method2915(-114);
        this.field7340 = arg0.method2882(-1);
        this.field7346 = arg0.method2868(-119);
        this.field7345 = arg0.method2868(-126);
        this.field7351 = arg0.method2868(-59);
        this.field7342 = arg0.method2868(-75);
    }
}
