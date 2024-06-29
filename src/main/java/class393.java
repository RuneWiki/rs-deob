import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class393 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field5740 = 0;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lfg;")
    public static class18 field5744 = new class18(4);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
    public static boolean field5747;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILfb;)V", line = 3)
    public static final void method2501(int arg0, int arg1, int arg2, int arg3, class45 arg4) {
        field5743++;
        if (arg0 != 128) {
            method2506((byte) 27);
        }
        for (class324 var5 = (class324) class127.field2075.method157((byte) -125); var5 != null; var5 = (class324) class127.field2075.method145(109)) {
            if (var5.field4688 == arg2 && arg3 * 128 == var5.field4675 && (arg1 * 128) == var5.field4691 && var5.field4671.field733 == arg4.field733) {
                if (var5.field4690 != null) {
                    class220.field3275.method511(var5.field4690);
                    var5.field4690 = null;
                }
                if (var5.field4679 != null) {
                    class220.field3275.method511(var5.field4679);
                    var5.field4679 = null;
                }
                var5.method251(103);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ICLjava/lang/String;)I", line = 51)
    public static final int method2502(int arg0, char arg1, String arg2) {
        field5745++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            if (arg1 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 78)
    public static void method2503(int arg0) {
        field5744 = null;
        if (arg0 != -13) {
            field5747 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 92)
    public static final void method2504(byte arg0) {
        class397.field5823.method112(0);
        field5741++;
        if (arg0 >= -89) {
            field5744 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIIII)V", line = 105)
    public static final void method2505(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field5739++;
        if (arg1 <= 15) {
            method2503(105);
        }
        for (int var6 = arg5; var6 <= arg4; var6++) {
            class47.method379(arg0, (byte) 70, arg3, class286.field4283[var6], arg2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 127)
    public static final void method2506(byte arg0) {
        field5746++;
        class18 var1 = class105.field1744;
        synchronized (class105.field1744) {
            class105.field1744.method106((byte) -123);
        }
        class18 var2 = class398.field5858;
        synchronized (class398.field5858) {
            class398.field5858.method106((byte) -110);
        }
        int var3 = 46 % ((-arg0 - 29) / 63);
        class18 var4 = class413.field5992;
        synchronized (class413.field5992) {
            class413.field5992.method106((byte) -107);
        }
    }
}
