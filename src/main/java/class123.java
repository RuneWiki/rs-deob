import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class123 {

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
    public static int[] field1638 = new int[2];

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field1639 = -1;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lfi;")
    public static class331 field1633 = new class331(64);

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lra;")
    public static class57 field1629;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 5)
    public static void method694(byte arg0) {
        field1629 = null;
        field1638 = null;
        int var1 = -2 % ((-arg0 - 54) / 40);
        field1633 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZILvn;Len;I)V", line = 17)
    public static final void method695(boolean arg0, int arg1, class169 arg2, class174 arg3, int arg4) {
        field1641++;
        class188.field2550.method1116((byte) 112);
        if (class188.field2551) {
            return;
        }
        if (!arg0) {
            method695(false, -40, (class169) null, (class174) null, 37);
        }
        for (class278 var5 = (class278) arg2.method1124(-1); var5 != null; var5 = (class278) arg2.method1119(!arg0)) {
            class290 var6 = class117.method661((byte) 96, var5.field3920);
            if (class207.method1311((byte) 117, var6)) {
                boolean var7 = class192.method1226(arg4, -81, arg3, var6, var5, arg1);
                if (var7) {
                    class71.method417(-26981, var6, var5, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLbk;I)V", line = 53)
    public final void method696(byte arg0, class211 arg1, int arg2) {
        if (arg0 != 12) {
            return;
        }
        while (true) {
            int var4 = arg1.method1342((byte) -126);
            if (var4 == 0) {
                field1634++;
                return;
            }
            this.method698(var4, arg2, arg1, 109);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lcl;", line = 76)
    public final class145 method697(boolean arg0) {
        field1632++;
        class145 var2 = (class145) class97.field1094.method2049(-115, (long) this.field1630);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            this.field1635 = 60;
        }
        class145 var3 = class145.method854(class311.field4438, this.field1630, 0);
        if (var3 != null) {
            class97.field1094.method2046((long) this.field1630, 0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILbk;I)V", line = 100)
    private final void method698(int arg0, int arg1, class211 arg2, int arg3) {
        if (arg0 == 1) {
            this.field1630 = arg2.method1355(32136);
        } else if (arg0 == 2) {
            this.field1635 = arg2.method1342((byte) -127);
            this.field1636 = arg2.method1342((byte) -127);
        }
        if (arg3 < 79) {
            field1633 = null;
        }
        field1631++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjf;)V", line = 126)
    public static final void method699(int arg0, class119 arg1) {
        field1640++;
        class119 var2 = class392.method2496(arg1, arg0 + 10074);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class222.field3039;
            var4 = class38.field389;
        } else {
            var3 = var2.field1498;
            var4 = var2.field1552;
        }
        if (arg0 != 13189) {
            field1638 = null;
        }
        class379.method2412(arg1, var3, false, var4, -1);
        class443.method2745(arg1, (byte) -22, var3, var4);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIB)V", line = 156)
    public static final void method700(boolean arg0, int arg1, byte arg2) {
        field1637++;
        try {
            if (arg1 != 0 && arg0) {
                class218.field2991 = class349.method2222(0, class225.field3070, 8, 0, class348.field5096, class323.field4554);
                class218.field2991.method929(0);
                class277 var3 = class302.method1906(class323.field4546, 15163, 0, class242.field3277);
                class196 var4 = class218.field2991.method966(var3, class145.method865(class92.field1012, class242.field3277, 0), true);
                class289.method1846(class407.field5907, var4, true, (byte) -79);
                class218.field2991.method1022();
                class397.method2527((byte) 96);
            }
            class218.field2991 = class349.method2222(class384.field5630 * 2, class225.field3070, 8, arg1, class348.field5096, class323.field4554);
            if (arg2 < 70) {
                method700(false, 14, (byte) -65);
            }
            if (class218.field2991.method979()) {
                class73 var5 = class218.field2991.method1001(536870912);
                class218.field2991.method997(var5);
            }
        } catch (Throwable var7) {
            if (arg1 != 0) {
                class218.field2991 = class349.method2222(0, class225.field3070, 8, 0, class348.field5096, class323.field4554);
                arg1 = 0;
            }
        }
        class341.field5018 = arg1;
        class122.method693(-124);
        if (!class218.field2991.method940()) {
            class404.field5887 = 1;
        }
        class218.field2991.method952(class404.field5887);
        class218.field2991.method985(0);
        class397.field5789 = class218.field2991.method922();
        class98.field1102 = class218.field2991.method922();
        int var6 = (int) ((double) class279.field3935 * 34.46D);
        if (class218.field2991.method969()) {
            var6 += 128;
        }
        class218.field2991.method1011(50, var6);
        class218.field2991.method944(!class78.field885);
        if (class218.field2991.method975()) {
            class262.method1644(2, class73.field820);
        }
        class181.field2484 = !class257.method1613(-124);
        class148.method881(class218.field2991, class164.field2287 >> 3, class279.field3935 >> 3, 124);
        class6.method58(-104);
        class174.field2418 = false;
    }
}
