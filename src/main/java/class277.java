import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class277 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4346 = new String[100];

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljp;")
    public static class55 field4343 = new class55(38, -1);

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Lnv;")
    public static class44 field4347 = new class44();

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "[I")
    public static int[] field4348;

    @OriginalMember(owner = "client!rp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4344++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method1887(int arg0) {
        field4348 = null;
        field4343 = null;
        if (arg0 == -1) {
            field4347 = null;
            field4346 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
    public class277(int arg0) {
        this.field4345 = arg0;
    }
}
