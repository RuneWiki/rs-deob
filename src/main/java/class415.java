import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class415 implements class205 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field5876;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5877;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method2583(int arg0) {
        field5877 = null;
        int var1 = 71 / ((1 - arg0) / 35);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Lww;")
    public final class288 method1206(boolean arg0) {
        field5875++;
        if (arg0) {
            field5878 = -63;
        }
        return class731.field10160;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ldc;I)Lgm;")
    public static final class210 method2584(class63 arg0, int arg1) {
        field5879++;
        return arg1 == 6965 ? new class210(arg0.method496(-118), arg0.method496(arg1 - 7074), arg0.method496(arg1 - 7011), arg0.method496(-62), arg0.method476((byte) -39), arg0.method476((byte) -122), arg0.method505((byte) -119)) : null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V")
    public class415(int arg0) {
        this.field5876 = arg0;
    }
}
