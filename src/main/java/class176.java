import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class176 extends class508 {

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Ltu;")
    public static class7 field2250;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1141(int arg0, String arg1) {
        field2253++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZBZLte;)V")
    public static final void method1142(boolean arg0, byte arg1, boolean arg2, class367 arg3) {
        field2251++;
        int var4 = arg3.field4719;
        int var5 = (int) arg3.field7456;
        arg3.method3021(-103);
        if (arg2) {
            class275.method1690(var4, (byte) 17);
        }
        class81.method464((byte) -43, var4);
        class423 var6 = class497.method2965(0, var5);
        int var7 = 120 % ((arg1 - 21) / 44);
        if (var6 != null) {
            class415.method2440(10, var6);
        }
        class260.method1623((byte) 67);
        if (!arg0 && class282.field3610 != -1) {
            class194.method1256(class282.field3610, 0, 1);
        }
        class376 var8 = new class376(class381.field4963);
        for (class367 var9 = (class367) var8.method2198(false); var9 != null; var9 = (class367) var8.method2196(true)) {
            if (!var9.method3019(-128)) {
                var9 = (class367) var8.method2198(false);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field4721 == 3) {
                int var10 = (int) var9.field7456;
                if ((var10 >>> 16) == var4) {
                    method1142(arg0, (byte) 103, true, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2250 = null;
        if (arg0 != 1) {
            method1141(-53, null);
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(II)V")
    public class176(int arg0, int arg1) {
        this.field2254 = arg1;
        this.field2252 = arg0;
    }
}
