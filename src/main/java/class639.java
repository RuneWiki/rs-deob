import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class class639 {

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Lwi;")
    public static class202 field8570 = new class202();

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "Lid;")
    public static class467 field8572;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "[I")
    public static int[] field8569;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "[I")
    public static int[] field8571;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)Z")
    public static final boolean method3568(byte arg0, int arg1, int arg2) {
        int var3 = 80 % ((43 - arg0) / 56);
        field8568++;
        return (class352.method2272(arg1, -83, arg2) | class429.method2660(arg2, (byte) -44, arg1) | class35.method189(true, arg1, arg2)) & class268.method1818(arg1, (byte) -123, arg2);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method2966(int arg0, byte arg1);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)Lvh;")
    public abstract class629 method2974(boolean arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
    public static void method3569(byte arg0) {
        field8572 = null;
        field8569 = null;
        field8571 = null;
        int var1 = -9 / (-arg0 / 63);
        field8570 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V")
    public abstract void method2962(int arg0, int arg1);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
    public static final boolean method3570(int arg0) {
        field8573++;
        try {
            if (class217.field2826 == 2) {
                if (class216.field2820 == null) {
                    class216.field2820 = class89.method615(class524.field7281, class720.field10022, class438.field6107);
                    if (class216.field2820 == null) {
                        return false;
                    }
                }
                if (class505.field7027 == null) {
                    class505.field7027 = new class752(class291.field4177, class71.field1080);
                }
                class261 var1 = class149.field2066;
                if (class123.field1689 != null) {
                    var1 = class123.field1689;
                }
                if (var1.method1789(class216.field2820, class562.field7809, (byte) 96, class505.field7027, 22050)) {
                    class149.field2066 = var1;
                    class149.field2066.method1780(127);
                    if (class401.field5751 > 0) {
                        class217.field2826 = 3;
                        class149.field2066.method1786(class517.field7221 < class401.field5751 ? class517.field7221 : class401.field5751, arg0 - 7941);
                        for (int var2 = 0; var2 < class240.field3592.length; var2++) {
                            class149.field2066.method1788(class240.field3592[var2], var2, 16256);
                            class240.field3592[var2] = 255;
                        }
                    } else {
                        class217.field2826 = 0;
                        class149.field2066.method1786(class517.field7221, 77);
                        for (int var3 = 0; var3 < class240.field3592.length; var3++) {
                            class149.field2066.method1788(class240.field3592[var3], var3, 16256);
                            class240.field3592[var3] = 255;
                        }
                    }
                    if (class123.field1689 == null) {
                        if (class48.field726 > 0L) {
                            class149.field2066.method1785(class202.field2679, class216.field2820, class48.field726, true, (byte) 15);
                        } else {
                            class149.field2066.method1766(class202.field2679, false, class216.field2820);
                        }
                    }
                    if (class685.field9520 != null) {
                        class685.field9520.method3157(class149.field2066, 256);
                    }
                    class216.field2820 = null;
                    class505.field7027 = null;
                    class123.field1689 = null;
                    class524.field7281 = null;
                    class48.field726 = 0L;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class149.field2066.method1761(2);
            class123.field1689 = null;
            class217.field2826 = 0;
            class216.field2820 = null;
            class505.field7027 = null;
            class524.field7281 = null;
        }
        if (arg0 != 8048) {
            field8571 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BI)I")
    public abstract int method2968(byte arg0, int arg1);
}
