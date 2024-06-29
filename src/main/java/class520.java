import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class520 {

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "Lwr;")
    public static class459 field6994 = new class459(8);

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "Ljga;")
    public static class716 field6997;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6998;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLha;)V", line = 4)
    public static final void method2864(byte arg0, class60 arg1) {
        if (class527.field7072) {
            class746.method4162(6, arg1);
        } else {
            class756.method4211(arg1, -256);
        }
        if (arg0 <= 31) {
            field6999 = -116;
        }
        field6993++;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V", line = 22)
    public static void method2865(int arg0) {
        field6994 = null;
        if (arg0 != -25882) {
            method2865(-43);
        }
        field6997 = null;
        field6998 = null;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIB)V", line = 37)
    public static final void method2866(int arg0, int arg1, byte arg2) {
        field6995++;
        if (arg2 == -120) {
            class252 var3 = class150.method916(arg1, -124, 1);
            var3.method1502((byte) -103);
            var3.field3251 = arg0;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)Z", line = 61)
    public static final boolean method2867(boolean arg0) {
        field6996++;
        try {
            if (arg0) {
                return true;
            } else {
                class105 var1 = new class105();
                byte[] var2 = var1.method717((byte) 126, class423.field5924);
                class636.method3583(var2, 1);
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }
}
