import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class237 {

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "[I")
    public static int[] field3519 = new int[8];

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field3520 = 0;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "Ldv;")
    public static class612 field3521;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "[Loe;")
    public static class185[] field3522;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)Lot;")
    public abstract class548 method953(boolean arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V")
    public abstract void method943(int arg0, int arg1);

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)[B")
    public abstract byte[] method945(int arg0, int arg1);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)I")
    public abstract int method956(byte arg0, int arg1);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public static void method1581(byte arg0) {
        field3521 = null;
        field3522 = null;
        field3519 = null;
        if (arg0 != -24) {
            field3519 = null;
        }
    }
}
