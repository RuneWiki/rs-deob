import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class744 {

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "I")
    private int field10361;

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "I")
    public int field10362;

    @OriginalMember(owner = "client!lja", name = "e", descriptor = "[F")
    public static float[] field10364 = new float[16];

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "I")
    public static int field10360;

    @OriginalMember(owner = "client!lja", name = "d", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!lja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10363++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)V")
    public static void method4168(boolean arg0) {
        if (!arg0) {
            method4168(false);
        }
        field10364 = null;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)I")
    public final int method4169(byte arg0) {
        field10360++;
        if (arg0 > -44) {
            this.toString();
        }
        return this.field10361;
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(II)V")
    public class744(int arg0, int arg1) {
        this.field10361 = arg0;
        this.field10362 = arg1;
    }
}
