import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class144 extends class155 {

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public int field2332 = 0;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2331 = "Ok";

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field2336 = 0;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "[S")
    public static short[] field2340 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!km", name = "K", descriptor = "Lue;")
    public static class91 field2338 = new class91(5000);

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2331 = null;
        if (arg0 != 0) {
            field2336 = 12;
        }
        field2338 = null;
        field2340 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLhc;)V")
    public final void method1077(boolean arg0, class53 arg1) {
        while (true) {
            int var3 = arg1.method366(-16505);
            if (var3 == 0) {
                field2334++;
                if (!arg0) {
                    this.method1081(2, 23, (class53) null);
                    return;
                }
                return;
            }
            this.method1081(var3, 124, arg1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lmh;")
    public static final class263 method1078(int arg0, int arg1) {
        field2335++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class134.field2195[var2] == null || class134.field2195[var2][var3] == null) {
            boolean var4 = class309.method2092(91923, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != 8534) {
            field2336 = 39;
        }
        return class134.field2195[var2][var3];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILlc;IB)Z")
    public static final boolean method1079(int arg0, class270 arg1, int arg2, byte arg3) {
        field2333++;
        if (arg3 != 59) {
            return true;
        }
        byte[] var4 = arg1.method1868(arg2, arg0, 1);
        if (var4 == null) {
            return false;
        } else {
            class303.method2064(var4, (byte) 7);
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Llc;BLlc;Z)V")
    public static final void method1080(class270 arg0, byte arg1, class270 arg2, boolean arg3) {
        field2337++;
        class72.field1136 = arg2;
        class7.field73 = arg3;
        class1.field19 = arg0;
        if (arg1 != 74) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILhc;)V")
    private final void method1081(int arg0, int arg1, class53 arg2) {
        if (arg0 == 2) {
            this.field2332 = arg2.method331(-4);
        }
        field2339++;
        if (arg1 <= 63) {
            this.field2332 = -119;
        }
    }
}
