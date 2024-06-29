import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class117 extends class13 {

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
    public static int[] field1673 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Lai;")
    public static class357 field1679;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        field1675++;
        if (!arg0) {
            method812((byte) -113);
        }
        return class296.field4148;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public static void method808(int arg0) {
        field1673 = null;
        field1679 = null;
        if (arg0 != -19286) {
            method809(3, (byte) -53);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
    public static final void method809(int arg0, byte arg1) {
        field1677++;
        if (arg0 == -1 || !class378.field5403[arg0]) {
            return;
        }
        class274.field3825.method1761(arg0, -66);
        if (class143.field2057[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 <= 44) {
            return;
        }
        for (int var3 = 0; var3 < class143.field2057[arg0].length; var3++) {
            if (class143.field2057[arg0][var3] != null) {
                if (class143.field2057[arg0][var3].field6356 == 2) {
                    var2 = false;
                } else {
                    class143.field2057[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class143.field2057[arg0] = null;
        }
        class378.field5403[arg0] = false;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Lkb;")
    public static final class412 method810(int arg0, int arg1) {
        field1678++;
        class412 var2 = (class412) class420.field5962.method2637((long) arg1, 18620);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1271.method1745(arg1, (byte) -108, 19);
        class412 var4 = new class412();
        if (var3 != null) {
            var4.method2583(new class11(var3), true);
        }
        class420.field5962.method2633((byte) -120, var4, (long) arg1);
        if (arg0 != 7) {
            field1673 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V")
    public static final void method811(byte arg0, int arg1, int arg2) {
        class297.field4156[arg2] = arg1;
        field1674++;
        if (arg0 != 114) {
            method811((byte) 88, -125, 114);
        }
        class75 var3 = (class75) class361.field4987.method886((long) arg2, arg0 + 25537);
        if (var3 == null) {
            class75 var4 = new class75(class385.method2442(-6631) + 500L);
            class361.field4987.method883((byte) -54, (long) arg2, var4);
        } else {
            var3.field1071 = class385.method2442(arg0 - 6745) + 500L;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
    public static final void method812(byte arg0) {
        field1676++;
        if (!class51.method428(-1) && class142.field2034 != class125.field1760) {
            class316.method2051(false, class412.field5841.field5332[0], class218.field3021, false, -65, class412.field5841.field5326[0], class316.field4320, class142.field2034);
            return;
        }
        class253.method1690(class64.field949, (byte) -103);
        if (class16.field298 != class142.field2034) {
            class163.method1077((byte) 0);
        }
        if (arg0 >= -35) {
            field1679 = null;
        }
    }

    static {
        new class442(" days.", " Tage.", " jours.", " dias.");
        new class442((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
    }
}
