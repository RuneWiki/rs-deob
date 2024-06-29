import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class493 extends class657 {

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "[Lit;")
    public class734[] field6979;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[J")
    public static long[] field6978 = new long[100];

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([Lit;)V")
    public class493(class734[] arg0) {
        this.field6979 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static final void method2869(int arg0) {
        class508.field7185 = new class547();
        field6980++;
        if (arg0 != 100) {
            field6978 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static void method2870(byte arg0) {
        if (arg0 > -100) {
            field6978 = null;
        }
        field6978 = null;
    }
}
