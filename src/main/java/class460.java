import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public abstract class class460 {

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "Lkfa;")
    public class382 field6621;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field6620 = 1;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "F")
    public static float field6619;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public abstract void method1174(byte arg0);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V")
    public abstract void method1175(boolean arg0, int arg1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2674(boolean arg0, int arg1, int arg2) {
        field6623++;
        if (!arg0) {
            method2677(null, 14, null);
        }
        return class172.method1271(arg2, (byte) 60, arg1) & class443.method2585(arg1, arg2, -19048);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
    public static final boolean method2675(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2675(55, 98, 0);
        }
        field6624++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)Z")
    public abstract boolean method1168(int arg0);

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lkfa;)V")
    public class460(class382 arg0) {
        this.field6621 = arg0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)I")
    public static int method2676(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(III)V")
    public abstract void method1170(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILjo;I)V")
    public abstract void method1169(int arg0, class337 arg1, int arg2);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "([II[I)V")
    public static final void method2677(int[] arg0, int arg1, int[] arg2) {
        field6622++;
        if (arg2 == null || arg0 == null) {
            class622.field8867 = null;
            class665.field9346 = null;
            class63.field918 = null;
            return;
        }
        class665.field9346 = arg2;
        class63.field918 = new int[arg2.length];
        class622.field8867 = new byte[arg2.length][][];
        if (arg1 != 1) {
            field6619 = -0.24919921F;
        }
        for (int var3 = 0; var3 < class665.field9346.length; var3++) {
            class622.field8867[var3] = new byte[arg0[var3]][];
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BZ)V")
    public abstract void method1177(byte arg0, boolean arg1);
}
