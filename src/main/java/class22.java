import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class22 {

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Z")
    public boolean field340 = false;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field331 = 0;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public int field341 = 0;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lbe;")
    public static class283 field332 = class153.method941(126, "null");

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lbe;")
    private static class283 field338 = class153.method941(-6, "Continue");

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lbe;")
    public static class283 field334 = class153.method941(125, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lbe;")
    public static class283 field337 = field338;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lek;")
    public static class172 field336;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ln;")
    public class268 field333;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field335;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBII)V", line = 19)
    public static final void method164(int arg0, byte arg1, int arg2, int arg3) {
        class72 var4 = class25.method174(arg3, (byte) -65, 9);
        var4.method477(-92);
        field339++;
        var4.field1265 = arg0;
        var4.field1268 = arg2;
        if (arg1 != 26) {
            method164(19, (byte) 77, 19, -20);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)I", line = 50)
    public static final int method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if ((arg2 & arg5) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        field342++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 1 - (arg3 + arg4 - 7);
        } else {
            return (7 - arg0) + 1 - arg1;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 100)
    public static void method166(int arg0) {
        field336 = null;
        field334 = null;
        field332 = null;
        if (arg0 != -25248) {
            method166(-69);
        }
        field338 = null;
        field337 = null;
    }
}
