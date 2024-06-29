import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class283 extends class54 {

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Z")
    public static boolean field4985 = true;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Llc;")
    public static class143 field4997 = class66.method374("::serverjs5drop", -1);

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "Lek;")
    public static class160 field4988;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Lka;")
    public class164 field4990;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Lvh;")
    public static class43 field4994;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "[B")
    public byte[] field4995;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "[Lbc;")
    public static class100[] field4993;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "[[[B")
    public static byte[][][] field4992;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method1867(int arg0) {
        field4997 = null;
        field4994 = null;
        if (arg0 == 21457) {
            field4993 = null;
            field4988 = null;
            field4992 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLgf;)V")
    public static final void method1868(boolean arg0, class7 arg1) {
        class65.field1216 = arg1.method55(-1, class289.field5077);
        class76.field1412 = arg1.method55(-1, class95.field1748);
        if (!arg0) {
            method1868(true, (class7) null);
        }
        ++field4987;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
    public final int method330(int arg0) {
        ++field4989;
        if (super.field1054) {
            return 0;
        } else {
            int var2 = 53 % ((14 - arg0) / 59);
            return 100;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)[B")
    public final byte[] method326(int arg0) {
        ++field4991;
        if (arg0 != 0) {
            return null;
        } else if (super.field1054) {
            throw new RuntimeException();
        } else {
            return this.field4995;
        }
    }
}
