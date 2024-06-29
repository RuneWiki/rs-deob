import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class619 extends class45 {

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "Lag;")
    public class469 field8592;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "Z")
    public static boolean field8595 = false;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
    public static int field8600 = -1;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "Leba;")
    public static class550 field8596 = new class550(48, -2);

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "Z")
    public boolean field8599;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
    public abstract void method2778(byte arg0);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ldga;IILdga;)V")
    public abstract void method2782(class441 arg0, int arg1, int arg2, class441 arg3);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)V")
    public abstract void method2772(int arg0, int arg1);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)Z")
    public abstract boolean method2781(int arg0);

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
    public final int method3422(int arg0) {
        if (arg0 == 1) {
            field8593++;
            return 1;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)Z")
    public abstract boolean method2774(byte arg0);

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)Z")
    public final boolean method3423(int arg0) {
        field8597++;
        if (arg0 > -30) {
            this.method3424((byte) 60);
        }
        return this.field8599;
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)Z")
    public final boolean method3424(byte arg0) {
        int var2 = -56 % ((arg0 + 16) / 36);
        field8594++;
        return false;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V")
    public abstract void method2779(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(B)V")
    public static void method3425(byte arg0) {
        field8596 = null;
        if (arg0 < 65) {
            field8600 = 117;
        }
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)I")
    public int method2773(int arg0) {
        if (arg0 != 0) {
            this.method2779(4, 68, 121);
        }
        field8598++;
        return 0;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lag;)V")
    public class619(class469 arg0) {
        this.field8592 = arg0;
    }
}
