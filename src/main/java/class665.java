import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class665 extends class354 {

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "Lbda;")
    public static class508 field9357 = new class508();

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field9359 = 0;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "Lkg;")
    public static class275 field9360 = new class275(6, 1);

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "[[[Lds;")
    public static class14[][][] field9356;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field9354;
        if (arg0 != 3) {
            this.method391(-77, -48);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(ILwo;)V")
    public class665(int arg0, class746 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lwo;)V")
    public class665(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)V")
    public static void method3747(int arg0) {
        field9356 = null;
        field9357 = null;
        field9360 = null;
        if (arg0 > -104) {
            method3747(-53);
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I")
    public final int method3748(byte arg0) {
        int var2 = -81 % ((7 - arg0) / 45);
        ++field9358;
        return super.field4545;
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field9352;
        super.field4545 = arg1;
        if (arg0 != -1) {
            this.method388(-58);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = -89 / ((arg0 - 37) / 63);
        ++field9355;
        return 1;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (~super.field4545 != -2 && super.field4545 != 0) {
            super.field4545 = this.method393((byte) -119);
        }
        if (arg0 == 6384) {
            ++field9353;
        }
    }
}
