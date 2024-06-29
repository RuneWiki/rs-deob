import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class98 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Loa;")
    private static class99 field1636 = class221.method1463(2844, "Hidden");

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Loa;")
    public static class99 field1639 = field1636;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lik;")
    public static class261 field1637 = new class261(new byte[5000]);

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Luk;")
    public class98 method649(int arg0, int arg1, int arg2) {
        field1640++;
        return this;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method650(int arg0) {
        if (arg0 == 1) {
            field1637 = null;
            field1636 = null;
            field1639 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Luk;IIIZ)V")
    public void method651(class98 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1635++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)Z")
    public static final boolean method652(int arg0, byte arg1) {
        field1642++;
        if (arg1 > -57) {
            return true;
        } else {
            return (arg0 >> 30 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()Z")
    public boolean method653() {
        field1641++;
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILkg;)V")
    public abstract void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class136 arg10);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 59) {
            method654(98, 89, 13, 9);
        }
        class65 var4 = class152.method1010(arg3, 9, (byte) -73);
        field1638++;
        var4.method433(32);
        var4.field1092 = arg2;
        var4.field1094 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public abstract void method320(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
    public abstract int method226();
}
