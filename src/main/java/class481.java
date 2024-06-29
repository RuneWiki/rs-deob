import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class481 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Luv;")
    public static class2 field7112 = new class2(20, 5);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
    public static int[] field7113 = new int[32];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 3)
    public static void method2869(byte arg0) {
        field7112 = null;
        field7113 = null;
        if (arg0 > -121) {
            field7112 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ltm;ZLtm;)V", line = 17)
    public static final void method2870(class405 arg0, boolean arg1, class405 arg2) {
        field7109++;
        if (arg1) {
            field7112 = null;
        }
        if (arg0.field6101 != null) {
            arg0.method2440(-40);
        }
        arg0.field6100 = arg2.field6100;
        arg0.field6101 = arg2;
        arg0.field6101.field6100 = arg0;
        arg0.field6100.field6101 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lgk;I)Lvn;", line = 42)
    public static final class263 method2871(class468 arg0, int arg1) {
        field7111++;
        arg0.method2765(75);
        int var2 = arg0.method2765(71);
        class263 var3 = class509.method3003(var2, 64);
        if (arg1 != -5668) {
            field7113 = null;
        }
        var3.field3928 = arg0.method2765(124);
        int var4 = arg0.method2765(105);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2765(108);
            var3.method32(var6, true, arg0);
        }
        var3.method748((byte) 110);
        return var3;
    }
}
