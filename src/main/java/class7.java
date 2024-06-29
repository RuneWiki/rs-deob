import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class384 {

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[S")
    private static short[] field44 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[S")
    private static short[] field48 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[S")
    private static short[] field49 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[S")
    private static short[] field46 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[[S")
    public static short[][] field47 = new short[][] { field48, field44, field49, field46 };

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    public static int[] field55 = null;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "J")
    public static long field52;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
    public final void method24(boolean arg0, int arg1) {
        ++field51;
        super.field5349.method2249(true, (byte) -122);
        if (arg1 != -1) {
            field47 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(ZB)V")
    public static final void method25(boolean arg0, byte arg1) {
        ++field53;
        if (class751.field10504 != null) {
            class751.field10504.method1691(121);
            class751.field10504 = null;
        }
        class461.field6567 = 0;
        class38.method185(true);
        class655.method3719();
        for (int var2 = 0; var2 < 4; ++var2) {
            class205.field2430[var2].method1809(false);
        }
        class40.method245(8, false);
        System.gc();
        class735.method4095(-1, 2);
        class533.field7714 = false;
        class326.field4223 = -1;
        class703.method3949(66);
        class591.method3384((byte) 49, true);
        class630.field9065 = 0;
        class443.field6427 = 0;
        class614.field8787 = 0;
        class141.field1588 = 0;
        class464.field6624 = 0;
        class181.field2144 = 0;
        for (int var3 = 0; class115.field1203.length > var3; ++var3) {
            class115.field1203[var3] = null;
        }
        class117.method766(-29040);
        for (int var4 = 0; var4 < 2048; ++var4) {
            class75.field792[var4] = null;
        }
        class302.field3784 = 0;
        if (arg1 >= 39) {
            class253.field3052.method1758(-47);
            class529.field7533 = 0;
            class450.field6490.method1758(-44);
            class608.method3445(-113);
            class442.field6417 = 0;
            class722.field10125.method4010(14784);
            class254.method1516((byte) 89);
            class132.method846((byte) -115);
            class99.field1036 = 0L;
            class230.field2690 = null;
            if (arg0) {
                class313.method1860(true, 12);
            } else {
                class313.method1860(true, 3);
                try {
                    class393.method2415("loggedout", -101, class255.field3123);
                } catch (Throwable var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Z")
    public final boolean method26(int arg0) {
        if (arg0 != 13326) {
            return false;
        } else {
            ++field54;
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lln;)V")
    public class7(class377 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lke;BI)V")
    public final void method27(class596 arg0, byte arg1, int arg2) {
        ++field50;
        if (arg1 != 123) {
            field44 = null;
        }
        super.field5349.method2207((byte) -61, arg0);
        super.field5349.method2255(arg2, arg1 ^ 15793);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    public static final void method28(int arg0, int arg1) {
        ++field56;
        int var2 = -7 % ((19 - arg1) / 62);
        class359.field4592 = arg0;
        class519.field7380.method3549(0);
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public static void method29(int arg0) {
        field44 = null;
        field47 = null;
        field49 = null;
        field46 = null;
        field55 = null;
        if (arg0 == 957) {
            field48 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
    public final void method30(boolean arg0, byte arg1) {
        if (arg1 < 78) {
            field52 = -18L;
        }
        ++field58;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public final void method31(byte arg0) {
        if (arg0 <= -18) {
            super.field5349.method2249(false, (byte) -107);
            ++field45;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V")
    public final void method32(int arg0, int arg1, boolean arg2) {
        ++field57;
        if (!arg2) {
            field47 = null;
        }
    }
}
