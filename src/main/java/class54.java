import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class54 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lcq;")
    public static class72 field628 = new class72("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
    public static int[] field635 = new int[14];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Ljava/lang/String;")
    public String field634;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Object;Lnh;I)V", line = 9)
    public static final void method304(Object arg0, class441 arg1, int arg2) {
        field631++;
        if (arg1.field6090 == null || arg2 != 1001) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field6090.peekEvent() != null; var3++) {
            class219.method1330(1L, true);
        }
        if (arg0 != null) {
            arg1.field6090.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 34)
    public static void method305(boolean arg0) {
        if (!arg0) {
            field628 = null;
            field635 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I", line = 46)
    public static final int method306(int arg0, int arg1) {
        field627++;
        return ~arg0 == arg1 ? -1 : class168.method1070(arg0, true);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 59)
    public static final void method307(int arg0) {
        field630++;
        class365 var1 = class168.field1960;
        synchronized (class168.field1960) {
            class168.field1960.method2298(0);
        }
        class365 var2 = class108.field1288;
        synchronized (class108.field1288) {
            class108.field1288.method2298(0);
        }
        class365 var3 = class347.field4723;
        synchronized (class347.field4723) {
            class347.field4723.method2298(0);
        }
        if (arg0 != 5748) {
            field633 = 48;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 84)
    public static final void method308(String arg0, int arg1, int arg2, int arg3, int arg4) {
        field632++;
        class453 var5 = class378.method2346(-23490, arg2, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field6396 != null) {
            class221 var6 = new class221();
            var6.field2732 = var5;
            var6.field2742 = arg0;
            var6.field2735 = var5.field6396;
            var6.field2739 = arg3;
            class93.method578(var6);
        }
        boolean var7 = true;
        if (var5.field6415 > 0) {
            var7 = class352.method2241((byte) -34, var5);
        }
        if (arg1 > -63) {
            field633 = -26;
        }
        if (!var7 || !client.method2696(var5).method2256(-74, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class306.field4101++;
            class427.field5837.method2162(false, 217);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 2) {
            class190.field2226++;
            class427.field5837.method2162(false, 172);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 3) {
            class307.field4152++;
            class427.field5837.method2162(false, 245);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 4) {
            class427.field5837.method2162(false, 197);
            class295.field3885++;
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 5) {
            class168.field1961++;
            class427.field5837.method2162(false, 152);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 6) {
            class427.field5837.method2162(false, 178);
            class449.field6277++;
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 7) {
            class127.field1422++;
            class427.field5837.method2162(false, 131);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 8) {
            class427.field5837.method2162(false, 0);
            class113.field1319++;
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 9) {
            class12.field145++;
            class427.field5837.method2162(false, 124);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
        if (arg3 == 10) {
            class113.field1324++;
            class427.field5837.method2162(false, 2);
            class259.method1638(29582, arg4, arg2, var5.field6358);
        }
    }
}
