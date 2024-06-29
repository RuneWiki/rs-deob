import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class180 extends class681 {

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field2610 = -1;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[I")
    public static int[] field2611;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILrga;I)V")
    public final void method744(int arg0, class218 arg1, int arg2) {
        super.field9721.method2241(arg1, (byte) 44);
        if (arg2 != -3) {
            method1239(true);
        }
        ++field2608;
        super.field9721.method2246(arg0, 26770);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        ++field2605;
        return arg0;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lnv;)V")
    public class180(class382 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(ZI)V")
    public final void method741(boolean arg0, int arg1) {
        super.field9721.method2220(14, true);
        if (arg1 != 3) {
            method1239(false);
        }
        ++field2604;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
    public final void method742(int arg0, int arg1, byte arg2) {
        int var4 = -116 / ((arg2 - -38) / 35);
        ++field2606;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
    public final void method740(int arg0) {
        if (arg0 != -3) {
            this.method739(true, 124);
        }
        super.field9721.method2220(14, false);
        ++field2601;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        if (arg1 != 7) {
            field2611 = null;
        }
        ++field2609;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    public static void method1239(boolean arg0) {
        field2611 = null;
        if (!arg0) {
            method1239(false);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
    public static final int method1240(int arg0, int arg1) {
        ++field2602;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg1 != -1) {
            return -3;
        } else {
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
    public static final void method1241(int arg0, int arg1) {
        class542.field7334 = arg1;
        class686.field9799 = arg0;
        ++field2603;
        class450.field6183 = 1;
        class439.field6090 = false;
        class4.field34 = null;
        class131.field1891 = -1;
        class123.field1688 = null;
        class129.field1848 = 0;
    }
}
