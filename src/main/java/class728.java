import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class728 extends class24 {

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    private int field10111 = -1;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "Lml;")
    public static class410 field10108 = new class410("", 13);

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field10115 = 0;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "Lmga;")
    public static class739 field10113 = new class739(11, 16);

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    private int field10110;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    private int field10112;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    private int field10114;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjp;)V")
    public final void method191(int arg0, class376 arg1) {
        this.field10111 = arg1.method2359(-1);
        field10109++;
        this.field10114 = arg1.method2384(37);
        this.field10112 = arg1.method2398(-1372747256);
        this.field10110 = arg1.method2398(-1372747256);
        if (arg0 > -56) {
            field10113 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lke;I)V")
    public final void method190(class625 arg0, int arg1) {
        field10116++;
        if (arg1 == 5) {
            arg0.method3423(this.field10111, this.field10112, true, this.field10110, this.field10114);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method4050(int arg0) {
        if (arg0 != 7) {
            method4050(92);
        }
        field10108 = null;
        field10113 = null;
    }
}
