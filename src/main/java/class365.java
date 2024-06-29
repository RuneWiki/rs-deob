import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class365 extends class293 {

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "[I")
    public static int[] field5225 = new int[5];

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Ltj;")
    public static class108 field5227;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method2357(byte arg0) {
        if (arg0 >= 2) {
            class1.field2.method102((byte) -108);
            field5223++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static final void method2358(int arg0) {
        field5222++;
        class443 var1 = null;
        try {
            if (arg0 >= -3) {
                method2358(11);
            }
            class156 var2 = class401.field5628.method1535(12);
            while (var2.field2298 == 0) {
                class259.method1790((byte) -105, 1L);
            }
            if (var2.field2298 == 1) {
                var1 = (class443) var2.field2295;
                class130 var3 = new class130(class19.field258 * 6 + 3);
                var3.method831(1, (byte) -52);
                var3.method799(class19.field258, 48);
                for (int var4 = 0; var4 < class114.field1471.length; var4++) {
                    if (class442.field6334[var4]) {
                        var3.method799(var4, -103);
                        var3.method849(class114.field1471[var4], (byte) -84);
                    }
                }
                var1.method2766(var3.field1851, -7120, 0, var3.field1880);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2762(-1);
            }
        } catch (Exception var5) {
        }
        class380.field5398 = class18.method107(-16145);
        class242.field3580 = false;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static void method2359(int arg0) {
        field5227 = null;
        field5225 = null;
        if (arg0 <= 38) {
            method2357((byte) 2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static final void method2360(boolean arg0) {
        class25.field311.method98(0);
        field5226++;
        class109.field1413.method98(0);
        if (arg0) {
            class40.field548.method98(0);
            class53.field686.method98(0);
            class295.field4267.method98(0);
        }
    }
}
