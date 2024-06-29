import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class468 extends class184 {

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public int field6840;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public int field6841;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Lvt;")
    public class304 field6839;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "Lmia;")
    public class63 field6843;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "[I")
    public static int[] field6842;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBLsca;I)V", line = 3)
    public static final void method2837(int arg0, byte arg1, class46 arg2, int arg3) {
        field6845++;
        if (class282.field3986) {
            class323 var4 = class616.field8673 == -1 ? null : class153.field2479.method1653(class616.field8673, (byte) -119);
            if (client.method1886(arg2).method1557(true) && (class295.field4202 & 0x20) != 0 && (var4 == null || arg2.method342(var4.field4610, (byte) -55, class616.field8673) != var4.field4610)) {
                class209.field3061++;
                class240.method1593(class298.field4229, arg2.field603, (byte) -85, false, 0L, class488.field6984, false, arg2.field687, 16, arg2.field610, true, (long) (arg2.field603 << 0 | arg2.field610), class29.field278 + " -> " + arg2.field612);
            }
        }
        if (arg1 != -12) {
            method2838(33);
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class22.method114(arg2, var5, arg1 ^ 0xB);
            if (var9 != null) {
                class573.field8102++;
                class240.method1593(var9, arg2.field603, (byte) -80, false, (long) (var5 + 1), client.method1901(arg2, -107, var5), false, arg2.field687, 1003, arg2.field610, true, (long) (arg2.field610 | arg2.field603 << 0), arg2.field612);
            }
        }
        String var6 = class227.method1527(true, arg2);
        if (var6 != null) {
            class240.method1593(var6, arg2.field603, (byte) 123, false, 0L, arg2.field564, false, arg2.field687, 47, arg2.field610, true, (long) (arg2.field603 << 0 | arg2.field610), arg2.field612);
            class367.field5290++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class22.method114(arg2, var7, arg1 ^ 0xB);
            if (var8 != null) {
                class240.method1593(var8, arg2.field603, (byte) 111, false, (long) (var7 + 1), client.method1901(arg2, arg1 - 106, var7), false, arg2.field687, 44, arg2.field610, true, (long) (arg2.field603 << 0 | arg2.field610), arg2.field612);
                class573.field8102++;
            }
        }
        if (!client.method1886(arg2).method1553(-4953)) {
            return;
        }
        if (arg2.field645 == null) {
            class240.method1593(class430.field6379.method2679(class650.field9160, 102), arg2.field603, (byte) -126, false, 0L, -1, false, arg2.field687, 15, arg2.field610, true, (long) (arg2.field610 | arg2.field603 << 0), "");
        } else {
            class240.method1593(arg2.field645, arg2.field603, (byte) 123, false, 0L, -1, false, arg2.field687, 15, arg2.field610, true, (long) (arg2.field610 | arg2.field603 << 0), "");
        }
        class608.field8596++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 78)
    public static void method2838(int arg0) {
        int var1 = -126 % ((arg0 + 19) / 48);
        field6842 = null;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 96)
    public final void method2839(int arg0) {
        field6844++;
        if (class280.field3964.length > class502.field7146) {
            int var2 = 95 % ((57 - arg0) / 58);
            class280.field3964[class502.field7146++] = this;
        }
    }
}
