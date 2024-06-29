import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class254 extends class392 {

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "Low;")
    public static class665 field3641 = new class665();

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public static int field3644 = -1;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "J")
    public static long field3645 = -1L;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Ljava/lang/Thread;")
    public static Thread field3642;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "[I")
    public static int[] field3643;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BI)V", line = 4)
    public final void method286(byte arg0, int arg1) {
        ++field3638;
        super.field5452 = arg1;
        int var3 = -62 % ((arg0 - -80) / 38);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(ILw;)V", line = 14)
    public class254(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lw;)V", line = 17)
    public class254(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 20)
    public static final void method1676(byte arg0) {
        ++field3640;
        if (class547.field7575 != null) {
            for (int var1 = 0; var1 < class258.field3667; ++var1) {
                class547.field7575[var1] = null;
            }
            class547.field7575 = null;
        }
        if (class792.field10863 != null) {
            for (int var2 = 0; ~class393.field5456 < ~var2; ++var2) {
                class792.field10863[var2] = null;
            }
            class792.field10863 = null;
        }
        if (class289.field4221 != null) {
            for (int var3 = 0; class260.field3684 > var3; ++var3) {
                class289.field4221[var3] = null;
            }
            class289.field4221 = null;
        }
        class695.field9788 = null;
        class717.field10013 = null;
        int var4 = -70 / ((arg0 - -74) / 36);
        class116.field1991 = null;
        class122.field2067 = -1;
        class597.field8526 = -1;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I", line = 75)
    public final int method1677(int arg0) {
        ++field3639;
        if (arg0 != 17539) {
            field3642 = null;
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I", line = 86)
    public final int method290(int arg0, int arg1) {
        ++field3636;
        if (arg1 >= -124) {
            this.method291(true);
        }
        return 3;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(Z)V", line = 98)
    public final void method291(boolean arg0) {
        super.field5452 = this.method292(true);
        if (!arg0) {
            ++field3635;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)I", line = 109)
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method290(66, -52);
        }
        ++field3637;
        return super.field5454.method3775(-127) == class448.field6175 && super.field5454.method3782((byte) 118) ? 0 : 1;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V", line = 130)
    public static void method1678(byte arg0) {
        if (arg0 == 54) {
            field3643 = null;
            field3642 = null;
            field3641 = null;
        }
    }
}
