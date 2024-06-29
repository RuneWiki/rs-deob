import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class108 {

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Z")
    public static boolean field1253 = false;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Lpr;")
    public static class407 field1257 = new class407(85, 10);

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Lsba;")
    public static class199 field1255;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 6)
    public static void method676(int arg0) {
        field1257 = null;
        if (arg0 == 85) {
            field1255 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field1258++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIII)V", line = 36)
    public class108(int arg0, int arg1, int arg2, int arg3) {
        this.field1256 = arg1;
        this.field1259 = arg2;
        this.field1254 = arg0;
        this.field1252 = arg3;
    }
}
