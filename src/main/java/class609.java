import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class609 extends class354 {

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
    public static int[] field8449 = new int[2];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lei;")
    public static class180 field8448 = new class180(7500);

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Z")
    public static boolean field8451 = false;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lud;")
    public static class36 field8450;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method3422(boolean arg0) {
        class416.field5303 = 0;
        if (arg0) {
            method3423(21, (String) null, (String) null);
        }
        ++field8444;
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class511.field7199[var1] = null;
            class182.field2548[var1] = 1;
            class32.field531[var1] = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ILwo;)V", line = 39)
    public class609(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V", line = 42)
    public final void method389(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method3424((byte) -114);
        }
        super.field4545 = arg1;
        ++field8453;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lwo;)V", line = 54)
    public class609(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V", line = 60)
    public static final void method3423(int arg0, String arg1, String arg2) {
        class468.field6275 = arg0;
        class622.field8563 = -1;
        ++field8445;
        class4.method20(false, 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)I", line = 71)
    public final int method3424(byte arg0) {
        int var2 = -128 % ((7 - arg0) / 45);
        ++field8452;
        return super.field4545;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 81)
    public final void method388(int arg0) {
        ++field8446;
        if (arg0 == 6384) {
            super.field4545 = this.method393((byte) 111);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I", line = 92)
    public final int method393(byte arg0) {
        int var2 = -124 / ((arg0 - 37) / 63);
        ++field8447;
        return !super.field4544.method4149((byte) 33) ? 0 : 1;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V", line = 106)
    public static void method3425(boolean arg0) {
        field8448 = null;
        field8449 = null;
        if (!arg0) {
            method3423(56, (String) null, (String) null);
        }
        field8450 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I", line = 119)
    public final int method391(int arg0, int arg1) {
        if (arg0 != 3) {
            field8449 = null;
        }
        ++field8454;
        return 3;
    }
}
