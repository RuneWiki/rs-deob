import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class367 extends class271 {

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "I")
    public int field5606 = 0;

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "Lwt;")
    public static class202 field5603 = new class202("", 11);

    @OriginalMember(owner = "client!pt", name = "J", descriptor = "Llt;")
    public static class475 field5609 = new class475("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "Lcw;")
    public static class119 field5610 = null;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field5612 = 0;

    @OriginalMember(owner = "client!pt", name = "L", descriptor = "S")
    public static short field5611 = 256;

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!pt", name = "F", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method2276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5608++;
        int var6 = arg1;
        if (arg4 != -18394) {
            method2276(-90, 38, 3, -46, -88, 93);
        }
        while (var6 <= arg3) {
            class415.method2491(arg0, arg2, class339.field4800[var6], arg5, -31541);
            var6++;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLdh;)V", line = 26)
    public final void method2277(byte arg0, class209 arg1) {
        if (arg0 != -124) {
            method2279((byte) -12);
        }
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field5604++;
                return;
            }
            this.method2278(var3, arg1, arg0 - 30565);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILdh;I)V", line = 47)
    private final void method2278(int arg0, class209 arg1, int arg2) {
        if (arg2 != -30689) {
            this.field5606 = 124;
        }
        if (arg0 == 2) {
            this.field5606 = arg1.method1450((byte) 80);
        }
        field5602++;
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(B)V", line = 64)
    public static void method2279(byte arg0) {
        field5603 = null;
        if (arg0 < 29) {
            method2280(false, false, -38);
        }
        field5610 = null;
        field5609 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZI)I", line = 82)
    public static final int method2280(boolean arg0, boolean arg1, int arg2) {
        field5605++;
        if (arg1) {
            return 0;
        }
        class138 var3 = class307.method1936((byte) 64, arg1, arg2);
        if (var3 == null) {
            return class514.field7512.method2798(arg2, arg0).field5606;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field2079.length; var5++) {
            if (var3.field2079[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class514.field7512.method2798(arg2, arg0).field5606 - var3.field2079.length);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILvg;)Z", line = 116)
    public static final boolean method2281(int arg0, class38 arg1) {
        field5601++;
        if (class386.field5848 == arg1.field448) {
            class12.field162 = 250;
            return true;
        } else {
            if (arg0 <= 87) {
                field5610 = null;
            }
            return false;
        }
    }
}
