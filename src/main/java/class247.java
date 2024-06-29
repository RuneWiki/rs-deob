import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class247 extends RuntimeException {

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3667;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljava/lang/String;")
    public String field3664;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Z")
    public static boolean field3663 = true;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3668 = 1;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3669 = -2;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1624(byte[] arg0, int arg1) {
        field3666++;
        if (arg1 != 1727) {
            method1624(null, 41);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class201.method1412(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class247(Throwable arg0, String arg1) {
        this.field3667 = arg0;
        this.field3664 = arg1;
    }
}
