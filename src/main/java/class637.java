import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class637 extends class678 {

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Z")
    public volatile boolean field9179 = true;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "Lqfa;")
    public static class85 field9181 = new class85(94, -1);

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field9183 = -2;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "F")
    public static float field9184;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Z")
    public boolean field9180;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "Z")
    public boolean field9182;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method3634(int arg0) {
        field9181 = null;
        if (arg0 != -1) {
            field9183 = -20;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3635(int arg0, int arg1, byte arg2) {
        field9177++;
        if (arg2 < 45) {
            field9181 = null;
        }
        return (class478.method2905(-7484, arg1, arg0) | class167.method1268(arg0, arg1, 84) | class454.method2736((byte) -123, arg1, arg0)) & class437.method2648((byte) 41, arg0, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)I")
    public abstract int method237(int arg0);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)[B")
    public abstract byte[] method235(byte arg0);
}
