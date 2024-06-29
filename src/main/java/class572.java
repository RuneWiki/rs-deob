import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class572 extends class379 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field7790;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field7788 = 0;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljb;")
    public static class519 field7786 = new class519(12, 8);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Ljea;")
    public static class474 field7791 = new class474(10, 4);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lsaa;")
    public static class345 field7792 = new class345();

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    public static int[] field7793 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Z")
    public static boolean field7794 = false;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[I")
    public static int[] field7795 = new int[5];

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field7796 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        if (arg0 != 41) {
            field7792 = null;
        }
        field7787++;
        return class273.field3967;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Luq;ZLd;)V")
    public static final void method3250(class172 arg0, boolean arg1, class161 arg2) {
        if (!arg1) {
            field7788 = -76;
        }
        field7789++;
        class759.field10404 = arg2;
        class568.field7756 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method3251(boolean arg0) {
        field7795 = null;
        field7793 = null;
        if (arg0) {
            field7793 = null;
        }
        field7791 = null;
        field7786 = null;
        field7792 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ILog;Lgi;III)V")
    public class572(int arg0, class673 arg1, class705 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7790 = arg5;
    }
}
