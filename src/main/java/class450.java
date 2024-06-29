import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class450 extends class465 implements class662 {

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    private int field6775;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "F")
    public static float field6770;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "Ljava/applet/Applet;")
    public static Applet field6772;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)V")
    public static void method2839(int arg0) {
        field6772 = null;
        int var1 = 35 / ((-20 - arg0) / 52);
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Ler;I[BI)V")
    public class450(class92 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6775 = arg1;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I")
    public final int method695(int arg0) {
        if (arg0 != -589) {
            return -96;
        } else {
            ++field6774;
            return 0;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)J")
    public final long method693(int arg0) {
        ++field6773;
        return arg0 != -32459 ? -85L : super.field6933.getAddress();
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II[BI)V")
    public final void method694(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2900(arg2, arg0);
        if (arg1 != 2112) {
            this.method695(29);
        }
        ++field6769;
        this.field6775 = arg3;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)I")
    public final int method691(byte arg0) {
        ++field6771;
        if (arg0 > -34) {
            this.method694(42, 10, (byte[]) null, 55);
        }
        return this.field6775;
    }
}
