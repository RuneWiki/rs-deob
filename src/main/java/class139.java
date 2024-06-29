import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class139 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lha;")
    public static class46 field2494 = class271.method1828("Musik)2Engine vorbereitet)3", -46);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lha;")
    public static class46 field2491 = class271.method1828("Titelbild ge-Offnet)3", -46);

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
    public static int[] field2496 = new int[32];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2490 = 0;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field2499 = 1;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field2501 = 1;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[Z")
    public static boolean[] field2492;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[[I")
    public static int[][] field2493;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIB)V")
    public void method982(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2500++;
        if (arg4 >= -85) {
            field2496 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lj;IIIZ)V")
    public void method467(class139 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2498++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public abstract int method183();

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
    public boolean method486() {
        field2497++;
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method1058(byte arg0) {
        field2493 = null;
        field2492 = null;
        field2491 = null;
        field2494 = null;
        if (arg0 > -52) {
            method1058((byte) -66);
        }
        field2496 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lj;")
    public class139 method474(int arg0, int arg1, int arg2) {
        field2495++;
        return this;
    }
}
