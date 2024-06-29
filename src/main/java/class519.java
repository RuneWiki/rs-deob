import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class519 extends class89 {

    @OriginalMember(owner = "client!au", name = "s", descriptor = "Z")
    public volatile boolean field7502 = true;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field7501 = 0;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field7503;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Z")
    public boolean field7500;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Z")
    public boolean field7504;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1951(int arg0);

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)V")
    public static void method3090(int arg0) {
        if (arg0 != 0) {
            method3090(83);
        }
        field7503 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
    public abstract int method1952(byte arg0);
}
