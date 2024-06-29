import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class207 {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "J")
    public long field3535 = 0L;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lsb;")
    public static class98 field3531 = class47.method368("leuchten1:", 0);

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lgj;")
    public static class226 field3546 = new class226(64);

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lsb;")
    public static class98 field3548 = class47.method368("Benutzeroberfl-=che geladen)3", 0);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lsc;")
    public class119 field3533;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lsc;")
    public class119 field3539;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lhc;")
    public static class43 field3537;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static final void method1395(boolean arg0) {
        field3530++;
        if (class262.field4606 != null) {
            class262.field4606.method1585(13270);
        }
        if (class235.field4057 != null) {
            class235.field4057.method1585(13270);
        }
        class138.method1039((byte) -102, 22050, class158.field2873, 2);
        class262.field4606 = class10.method100(-112, 22050, class85.field1504, class119.field2145, 0);
        class262.field4606.method1583(114, client.field1781);
        class235.field4057 = class10.method100(-123, 2048, class85.field1504, class119.field2145, 1);
        if (arg0) {
            field3537 = null;
        }
        class235.field4057.method1583(127, class36.field606);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method1396(byte arg0) {
        if (arg0 < 5) {
            method1397(-90, (class148) null);
        }
        field3546 = null;
        field3548 = null;
        field3531 = null;
        field3537 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILq;)Lsb;")
    public static final class98 method1397(int arg0, class148 arg1) {
        field3536++;
        if (arg0 != -8701) {
            field3547 = -122;
        }
        if (class148.method1091((byte) -78, client.method761(arg1)) == 0) {
            return null;
        } else if (arg1.field2596 == null || arg1.field2596.method723(255).method724((byte) 25) == 0) {
            return class186.field3207 ? class98.field1691 : null;
        } else {
            return arg1.field2596;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)[Lkb;")
    public static final class247[] method1398(int arg0) {
        field3545++;
        if (arg0 < 42) {
            field3549 = 54;
        }
        class247[] var1 = new class247[class110.field1956];
        for (int var2 = 0; var2 < class110.field1956; var2++) {
            int var3 = class245.field4326[var2] * class164.field2958[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class204.field3491[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class33.field572[class214.method1427(255, var5[var6])];
            }
            var1[var2] = new class247(class144.field2538, class101.field1790, class253.field4422[var2], class9.field207[var2], class245.field4326[var2], class164.field2958[var2], var4);
        }
        class125.method932(true);
        return var1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public static final void method1399(boolean arg0, int arg1) {
        field3538++;
        if (!arg0) {
            field3531 = null;
        }
        class56 var2 = (class56) class211.field3609.method1511((byte) -126, (long) arg1);
        if (var2 != null) {
            var2.method1611((byte) -127);
        }
    }
}
