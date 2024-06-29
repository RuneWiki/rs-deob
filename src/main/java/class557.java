import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class557 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field7603 = 0;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljj;")
    public static class398 field7601 = new class398(75, -1);

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field7604 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Lfca;", line = 4)
    public static final class188 method3117(int arg0, byte arg1) {
        if (arg1 != 71) {
            field7603 = 80;
        }
        field7600++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class328.field4799[var2] == null || class328.field4799[var2][var3] == null) {
            boolean var4 = class42.method251(var2, 0);
            if (!var4) {
                return null;
            }
        }
        return class328.field4799[var2][var3];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 30)
    public static final int method3118(int arg0, String arg1, int arg2) {
        field7602++;
        if (arg2 != 0) {
            field7604 = -123;
        }
        return class223.method1363(true, arg0, arg1, (byte) 70);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 46)
    public static void method3119(int arg0) {
        if (arg0 == 15628) {
            field7601 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1610(int arg0, int arg1);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Lnaa;")
    public abstract class413 method1608(byte arg0);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)I")
    public abstract int method1609(int arg0, boolean arg1);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
    public abstract void method1611(boolean arg0, int arg1);
}
