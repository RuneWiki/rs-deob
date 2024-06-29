import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class375 extends class665 {

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Z")
    public static boolean field5342 = false;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "[I")
    public static int[] field5346 = new int[3];

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "J")
    public long field5344;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "Lfr;")
    public class375 field5347;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "Lfr;")
    public class375 field5349;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public final void method2258(byte arg0) {
        field5345++;
        if (this.field5349 != null && arg0 >= 110) {
            this.field5349.field5347 = this.field5347;
            this.field5347.field5349 = this.field5349;
            this.field5347 = null;
            this.field5349 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
    public final boolean method2259(int arg0) {
        field5343++;
        if (arg0 != 3) {
            field5342 = false;
        }
        return this.field5349 != null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILd;III)V")
    public static final void method2260(int arg0, class135 arg1, int arg2, int arg3, int arg4) {
        arg1.field1978.method3868(arg2, -318419336);
        if (arg4 <= 77) {
            field5342 = false;
        }
        field5348++;
        arg1.field1978.method3840(false, arg0);
        arg1.field1978.method3816(arg3, -99);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
    public static void method2261(byte arg0) {
        if (arg0 == 37) {
            field5346 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)[Lsn;")
    public static final class583[] method2262(boolean arg0) {
        if (arg0) {
            field5346 = null;
        }
        field5341++;
        return new class583[] { class296.field4357, class261.field3970, class331.field4889, class667.field9412, class160.field2306, class573.field8067 };
    }
}
