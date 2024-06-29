import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class143 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1033(int arg0, int arg1) {
        field2023++;
        if (arg1 == 100 && class514.field7216 > 0) {
            byte[] var2 = class360.field4663[--class514.field7216];
            class360.field4663[class514.field7216] = null;
            return var2;
        } else if (arg1 == 5000 && class248.field3190 > 0) {
            byte[] var3 = class270.field3401[--class248.field3190];
            class270.field3401[class248.field3190] = null;
            return var3;
        } else {
            if (arg0 != -11523) {
                field2026 = 10;
            }
            if (arg1 == 30000 && class618.field8530 > 0) {
                byte[] var4 = class310.field4074[--class618.field8530];
                class310.field4074[class618.field8530] = null;
                return var4;
            }
            if (class565.field7938 != null) {
                for (int var5 = 0; var5 < class712.field9881.length; var5++) {
                    if (class712.field9881[var5] == arg1 && class106.field1532[var5] > 0) {
                        byte[] var6 = class565.field7938[var5][--class106.field1532[var5]];
                        class565.field7938[var5][class106.field1532[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
    public static final boolean method1034(int arg0, int arg1, int arg2) {
        field2025++;
        int var3 = 53 % ((-arg2 - 66) / 35);
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BB)V")
    public static final synchronized void method1035(byte[] arg0, byte arg1) {
        field2027++;
        if (arg0.length == 100 && class514.field7216 < 1000) {
            class360.field4663[class514.field7216++] = arg0;
        } else if (arg0.length == 5000 && class248.field3190 < 250) {
            class270.field3401[class248.field3190++] = arg0;
        } else {
            int var2 = 38 % (-arg1 / 53);
            if (arg0.length == 30000 && class618.field8530 < 50) {
                class310.field4074[class618.field8530++] = arg0;
            } else if (class565.field7938 != null) {
                for (int var3 = 0; var3 < class712.field9881.length; var3++) {
                    if (class712.field9881[var3] == arg0.length && class106.field1532[var3] < class565.field7938[var3].length) {
                        class565.field7938[var3][class106.field1532[var3]++] = arg0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILcea;)Lcea;")
    public static final class216 method1036(int arg0, class216 arg1) {
        field2024++;
        class216 var2 = arg1 == null ? new class216() : new class216(arg1);
        if (arg0 >= -2) {
            field2026 = -38;
        }
        var2.method1405(9, 128, (byte) 124);
        return var2;
    }
}
