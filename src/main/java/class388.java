import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class388 extends class35 {

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "Z")
    public static boolean field5557 = false;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "[I")
    public static int[] field5563 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "[I")
    public static int[] field5566 = new int[4096];

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5568 = "flash1:";

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "[I")
    public int[] field5556;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "[I")
    public int[] field5560;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "[I")
    public int[] field5561;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "[I")
    public static int[] field5565;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "[Lue;")
    public class131[] field5555;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "[Lue;")
    public class131[] field5562;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "[[[B")
    public byte[][][] field5564;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILmb;)Ljava/lang/String;", line = 14)
    public static final String method2454(int arg0, int arg1, class258 arg2) {
        field5553++;
        if (arg1 != 8) {
            return null;
        } else if (!client.method1815(arg2).method2617(arg0, arg1 - 131) && arg2.field3831 == null) {
            return null;
        } else if (arg2.field3795 == null || arg0 >= arg2.field3795.length || arg2.field3795[arg0] == null || arg2.field3795[arg0].trim().length() == 0) {
            return class342.field4850 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field3795[arg0];
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)V", line = 38)
    public static final void method2455(byte arg0) {
        field5559++;
        class284 var1 = class23.field350;
        synchronized (class23.field350) {
            class408.field5943 = class439.field6381;
            class275.field4134++;
            class129.field2111 = class349.field4941;
            class291.field4327 = class228.field3338;
            class60.field951 = class432.field6230;
            class62.field1000 = class333.field4777;
            class78.field1320 = class452.field6563;
            class338.field4823 = class34.field496;
            class432.field6230 = 0;
            if (arg0 != 45) {
                method2454(107, -91, (class258) null);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 67)
    public static void method2456(boolean arg0) {
        field5568 = null;
        field5565 = null;
        field5566 = null;
        if (arg0) {
            field5566 = null;
        }
        field5563 = null;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V", line = 87)
    public static final void method2457(int arg0) {
        field5554++;
        class389.field5591 = arg0;
        class276.field4153.method147(arg0 + 35);
        class276.field4153.method148((byte) 85, class157.field2400);
        class389.field5591++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLdp;Ldp;)I", line = 99)
    public static final int method2458(byte arg0, class174 arg1, class174 arg2) {
        field5569++;
        int var3 = 0;
        if (arg0 != -32) {
            field5563 = null;
        }
        if (arg1.method1348(255, class375.field5314)) {
            var3++;
        }
        if (arg1.method1348(255, class228.field3346)) {
            var3++;
        }
        if (arg1.method1348(255, class197.field2879)) {
            var3++;
        }
        if (arg2.method1348(255, class375.field5314)) {
            var3++;
        }
        if (arg2.method1348(255, class228.field3346)) {
            var3++;
        }
        if (arg2.method1348(arg0 + 287, class197.field2879)) {
            var3++;
        }
        return var3;
    }
}
