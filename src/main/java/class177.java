import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class177 extends class41 {

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field2686;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Lsv;")
    public static class467 field2690 = new class467(6, 0, 4, 2);

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "[Lul;")
    public static class402[] field2693 = new class402[14];

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Lbg;")
    public static class323 field2685;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        field2682++;
        if (arg3 <= 5) {
            this.field2680 = 42;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field2685 = null;
        field2693 = null;
        field2690 = null;
        if (arg0 != 40) {
            method1262(58);
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
    public final boolean method121(int arg0) {
        if (arg0 == 26923) {
            field2689++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        if (arg0 != 0) {
            field2685 = null;
        }
        class260.method1652();
        field2684++;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static final void method1263(byte arg0) {
        field2678++;
        if (class134.field2068 > 0) {
            class196.method1359(0);
            return;
        }
        if (arg0 != 54) {
            method1263((byte) 115);
        }
        class196.field2904 = class138.field2091;
        class138.field2091 = null;
        class138.method1022(40, 1);
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        field2687++;
        if (arg0 >= -127) {
            this.method117(-104);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)I")
    public abstract int method1264(boolean arg0);

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V")
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2683 = arg2;
        this.field2688 = arg0;
        this.field2679 = arg5;
        this.field2691 = arg1;
        this.field2692 = arg6;
        this.field2686 = arg4;
        this.field2680 = arg3;
    }
}
