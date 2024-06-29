import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class533 extends class72 {

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[[Z")
    public static boolean[][] field7539;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field7541;
        if (arg1 != 11260) {
            this.method59(-6, -61);
        }
        return 1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 < 30) {
            this.method59(-89, 1);
        }
        if (~super.field1282 > -1 && ~super.field1282 < -128) {
            super.field1282 = this.method60(-3271);
        }
        ++field7543;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lcq;)V")
    public class533(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field7540;
        super.field1282 = arg0;
        if (arg1 != 3) {
            field7539 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
    public static final void method3132(boolean arg0, int arg1) {
        class93.field1633 = arg1;
        ++field7538;
        if (!arg0) {
            class583.field8235.method3048(arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method3133(byte arg0) {
        if (arg0 >= -127) {
            field7539 = null;
        }
        field7539 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILcq;)V")
    public class533(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
    public final int method3134(int arg0) {
        if (arg0 != 27669) {
            this.method60(-6);
        }
        ++field7542;
        return super.field1282;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            return 0;
        } else {
            ++field7537;
            return 127;
        }
    }
}
