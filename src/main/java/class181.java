import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class181 extends class312 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lhga;")
    public static class158 field2926 = new class158();

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field2929 = -1;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        ++field2927;
        super.field4632.method5(3845, arg2);
        super.field4632.method133(arg0, (byte) -122);
        if (arg1 >= -78) {
            field2926 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        ++field2921;
        if (arg0 != -123) {
            field2926 = null;
        }
        super.field4632.method47(false, (byte) 77);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method1332(int arg0) {
        field2926 = null;
        if (arg0 != -1) {
            field2929 = 70;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        ++field2924;
        int var2 = -44 % ((25 - arg0) / 57);
        return true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        ++field2925;
        if (arg1 <= 102) {
            field2929 = 17;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        if (arg1) {
            field2926 = null;
        }
        ++field2923;
        super.field4632.method47(true, (byte) 77);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lus;)V")
    public class181(class1 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        int var4 = 88 / ((74 - arg2) / 45);
        ++field2922;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
    public static final int method1333(byte arg0) {
        ++field2928;
        if (arg0 != 93) {
            method1332(43);
        }
        return class107.method970(false, (byte) -13);
    }
}
