import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class46 implements class527 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lgf;")
    public static class46 field600 = new class46("", 11);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!gf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field605++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
    public static final int method336(int arg0) {
        int var1 = -122 / ((14 - arg0) / 32);
        field599++;
        return 16;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZI)Z")
    public static final boolean method337(int arg0, boolean arg1, int arg2) {
        field601++;
        if (!arg1) {
            field604 = 59;
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method338(int arg0, int arg1) {
        if (arg0 >= 117) {
            field597++;
            class238.field3887 = 1000 / arg1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class46(String arg0, int arg1) {
        this.field598 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BII)[B")
    public static final byte[] method339(byte[] arg0, int arg1, int arg2) {
        field602++;
        byte[] var3 = new byte[arg2];
        if (arg1 <= 114) {
            field604 = -23;
        }
        class324.method2166(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method340(int arg0) {
        field600 = null;
        if (arg0 != 16) {
            method337(77, false, 74);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
    public static final boolean method341(byte arg0, int arg1) {
        if (arg0 <= 111) {
            method336(116);
        }
        field603++;
        return arg1 == 59 || arg1 == 13 || arg1 == 1012 || arg1 == 5 || arg1 == 8;
    }
}
