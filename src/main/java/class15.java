import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class140 {

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field251 = -1;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        if (arg0 <= 116) {
            this.method119((byte) -95);
        }
        field249++;
        return class464.field6513;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lsd;Lec;IIIIIIIIII)V")
    public class15(class95 arg0, class236 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field248 = arg10;
        this.field250 = arg11;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static final void method120(boolean arg0) {
        if (class297.field4175 != null) {
            class297.field4175.method3165(-6858);
        }
        field247++;
        if (class603.field8276 != null) {
            class603.field8276.method3165(-6858);
        }
        if (arg0) {
            field251 = 30;
        }
    }
}
