import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class420 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5918 = -60;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "[[Lvv;")
    public static class295[][] field5921;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lhd;IZ)V", line = 7)
    public static final void method2433(class689 arg0, int arg1, boolean arg2) {
        field5919++;
        if (arg2) {
            method2436(-74);
        }
        if (class373.field5026) {
            arg1 = 0;
            class373.field5026 = false;
        }
        if (class318.field4362 != null && class318.field4362.method3884(arg0, -1487477086)) {
            return;
        }
        class318.field4362 = arg0;
        class668.field9388 = class577.method3295((byte) 15);
        class450.field6175 = arg1;
        class233.field3216 = arg1;
        if (class233.field3216 == 0) {
            class485.method2757(!arg2);
            return;
        }
        class120.field1659 = class328.field4448;
        class113.field1570 = class54.field612;
        class426.field5972 = class529.field7167;
        class239.field3285 = class284.field3907;
        class27.field335 = class525.field7116;
        class63.field730 = class382.field5241;
        class108.field1502 = class171.field2476;
        class354.field4705 = class341.field4581;
        class244.field3324 = class14.field151;
        class222.field3095 = class454.field6292;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Z", line = 51)
    public static final boolean method2434(int arg0, byte arg1) {
        field5922++;
        if (arg0 == 8 || arg0 == 19 || arg0 == 16 || arg0 == 60 || arg0 == 25) {
            return true;
        } else if (arg0 == 44 || arg0 == 1006) {
            return true;
        } else {
            int var2 = -16 / ((36 - arg1) / 59);
            return false;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 69)
    public static final void method2435(String arg0, int arg1) {
        field5920++;
        if (arg0 == null) {
            return;
        }
        if (!(class671.field9419 < 200 || class656.field9121) || class671.field9419 >= 200) {
            class114.method819((byte) -71, 4, class65.field798.method555(class697.field9900, true));
            String var2 = class65.field799.method555(class697.field9900, true);
            if (var2 != null) {
                class114.method819((byte) -59, 4, var2);
            }
            return;
        }
        String var3 = class430.method2473(15570, arg0);
        if (arg1 != -18716) {
            method2434(-14, (byte) 47);
        }
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class671.field9419; var4++) {
            String var9 = class430.method2473(15570, class696.field9891[var4]);
            if (var9 != null && var9.equals(var3)) {
                class114.method819((byte) -125, 4, arg0 + class65.field826.method555(class697.field9900, true));
                return;
            }
            if (class287.field3952[var4] != null) {
                String var10 = class430.method2473(15570, class287.field3952[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class114.method819((byte) -71, 4, arg0 + class65.field826.method555(class697.field9900, true));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class165.field2390; var5++) {
            String var7 = class430.method2473(15570, class356.field4722[var5]);
            if (var7 != null && var7.equals(var3)) {
                class114.method819((byte) -39, 4, class65.field831.method555(class697.field9900, true) + arg0 + class65.field832.method555(class697.field9900, true));
                return;
            }
            if (class238.field3258[var5] != null) {
                String var8 = class430.method2473(arg1 + 34286, class238.field3258[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class114.method819((byte) -43, 4, class65.field831.method555(class697.field9900, true) + arg0 + class65.field832.method555(class697.field9900, true));
                    return;
                }
            }
        }
        if (class430.method2473(15570, class143.field2063.field9693).equals(var3)) {
            class114.method819((byte) -58, 4, class65.field829.method555(class697.field9900, true));
            return;
        }
        class58.field653++;
        class352 var6 = class290.method1786(98, class199.field2836, class235.field3246);
        var6.field4686.method2817(class705.method3947((byte) -47, arg0), true);
        var6.field4686.method2820(-24, arg0);
        class602.method3388(var6, (byte) 28);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 171)
    public static void method2436(int arg0) {
        if (arg0 == 0) {
            field5921 = null;
        }
    }
}
