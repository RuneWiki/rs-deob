import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class436 {

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field6079 = 128;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field6077 = 128;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public int field6082;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public int field6074;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[[Ljava/lang/String;")
    public static String[][] field6078 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "Lkr;")
    public static class602 field6090 = new class602(49, 6);

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "[I")
    public static int[] field6093 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public int field6080;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public int field6081;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Luu;")
    public static class237 field6092;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "[[B")
    public static byte[][] field6089;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method2687(int arg0) {
        field6089 = null;
        field6078 = null;
        field6092 = null;
        field6090 = null;
        field6093 = null;
        if (arg0 != 2) {
            method2688(59);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static final void method2688(int arg0) {
        field6083++;
        if (arg0 != 3) {
            field6078 = null;
        }
        class284.field4091++;
        class583 var1 = class54.method400(class213.field2800, (byte) 122, class169.field2353);
        var1.field7963.method444(0, 128);
        class463.method2838(var1, (byte) 119);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lbs;I)V")
    public final void method2689(class436 arg0, int arg1) {
        field6075++;
        this.field6077 = arg0.field6077;
        if (arg1 != 128) {
            method2687(90);
        }
        this.field6079 = arg0.field6079;
        this.field6086 = arg0.field6086;
        this.field6074 = arg0.field6074;
        this.field6085 = arg0.field6085;
        this.field6082 = arg0.field6082;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)Lbs;")
    public final class436 method2690(int arg0) {
        field6087++;
        return arg0 > -79 ? null : new class436(this.field6086, this.field6079, this.field6077, this.field6082, this.field6085, this.field6074);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
    public class436(int arg0) {
        this.field6086 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(IIIIII)V")
    private class436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6085 = arg4;
        this.field6079 = arg1;
        this.field6086 = arg0;
        this.field6077 = arg2;
        this.field6082 = arg3;
        this.field6074 = arg5;
    }
}
