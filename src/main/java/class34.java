import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 extends class371 {

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field348;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Lo;")
    public static class24 field343;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "Lo;")
    public static class24 field349;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "Ljb;")
    public static class343 field347;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "Z")
    public static boolean field346;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)Z", line = 9)
    public final boolean method187(int arg0) {
        field345++;
        if (arg0 != 2) {
            field349 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 21)
    public class34(Object arg0, int arg1) {
        super(arg1);
        this.field348 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 29)
    public final Object method188(int arg0) {
        field350++;
        if (arg0 != 21051) {
            this.field348 = null;
        }
        return this.field348;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)V", line = 46)
    public static void method189(boolean arg0) {
        field347 = null;
        field343 = null;
        field349 = null;
        if (!arg0) {
            method189(true);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI)I", line = 59)
    public static final int method190(int arg0, byte arg1, int arg2) {
        field344++;
        if (arg1 >= -81) {
            return -15;
        } else {
            int var3 = arg2 >>> 24;
            int var4 = ((arg2 & 0xFF00) * var3 & 0xFF0000 | (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - var3;
            return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        }
    }
}
