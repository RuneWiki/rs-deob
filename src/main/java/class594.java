import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class594 extends RuntimeException {

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "Ljava/lang/String;")
    public String field8378;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field8382;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "Lsb;")
    public static class305 field8379 = new class305(13, -1);

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "[Lkf;")
    public static class287[] field8381 = new class287[5];

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field8380;

    static {
        for (int var0 = 0; var0 < field8381.length; var0++) {
            field8381[var0] = new class287();
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V", line = 3)
    public static void method3339(int arg0) {
        field8381 = null;
        field8379 = null;
        if (arg0 != 8848) {
            method3339(-9);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)Z", line = 14)
    public static final boolean method3340(int arg0, byte arg1) {
        field8380++;
        if (arg1 != 48) {
            field8379 = null;
        }
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 38)
    public class594(Throwable arg0, String arg1) {
        this.field8378 = arg1;
        this.field8382 = arg0;
    }
}
