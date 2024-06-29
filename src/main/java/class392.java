import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class392 extends class270 {

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "Lvv;")
    public static class313 field6003 = new class313(7, 1);

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "Lvv;")
    public static class313 field6006 = new class313(86, 7);

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "Lbu;")
    private class407 field6000;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lia;I)V", line = 5)
    public final void method2450(class23 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method126((byte) -118);
            if (var3 == 0) {
                if (arg1 != 86) {
                    return;
                }
                field6002++;
                return;
            }
            this.method2453(arg1 ^ 0xFFFFFF50, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)V", line = 25)
    public static void method2451(boolean arg0) {
        field6003 = null;
        if (arg0) {
            method2451(false);
        }
        field6006 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)I", line = 39)
    public final int method2452(int arg0, int arg1, byte arg2) {
        field6001++;
        if (arg2 > -20) {
            this.method2454(null, -94, (byte) 29);
        }
        if (this.field6000 == null) {
            return arg0;
        } else {
            class22 var4 = (class22) this.field6000.method2516((long) arg1, -1);
            return var4 == null ? arg0 : var4.field238;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILia;)V", line = 59)
    private final void method2453(int arg0, int arg1, class23 arg2) {
        if (~arg1 == arg0) {
            int var4 = arg2.method126((byte) -111);
            if (this.field6000 == null) {
                int var5 = class206.method1351(var4, 103);
                this.field6000 = new class407(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method126((byte) -107) == 1;
                int var8 = arg2.method181(104);
                class276 var9;
                if (var7) {
                    var9 = new class17(arg2.method156((byte) -105));
                } else {
                    var9 = new class22(arg2.method143(-3230));
                }
                this.field6000.method2517(var9, (long) var8, (byte) 98);
            }
        }
        field6005++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 101)
    public final String method2454(String arg0, int arg1, byte arg2) {
        field6004++;
        if (arg2 > -60) {
            return null;
        } else if (this.field6000 == null) {
            return arg0;
        } else {
            class17 var4 = (class17) this.field6000.method2516((long) arg1, -1);
            return var4 == null ? arg0 : var4.field192;
        }
    }
}
