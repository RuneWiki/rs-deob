import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class309 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "[I")
    public static int[] field4546 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field4552 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[I")
    public static int[] field4545 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Llm;")
    public static class347 field4551;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLlm;)V")
    public static final void method2100(byte arg0, class347 arg1) {
        class295.field4228 = arg1;
        if (arg0 != -103) {
            method2101(-23, -119, -113, -63, -11);
        }
        field4553++;
        class55.field746 = class295.field4228.method2272(arg0 + 153, 16);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
    public static final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class185.field2507.field3029 = 0;
        field4548++;
        class185.field2507.method1346(20, 32767);
        class185.field2507.method1346(arg3, 32767);
        class185.field2507.method1346(arg4, 32767);
        class185.field2507.method1326(arg0, -51);
        class185.field2507.method1326(arg2, -68);
        if (arg1 != 20) {
            method2103((byte) -10);
        }
        class275.field3989 = 0;
        class163.field2190 = 1;
        class47.field661 = 0;
        class214.field2856 = -3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Llm;Llm;ZI)V")
    public static final void method2102(class347 arg0, class347 arg1, boolean arg2, int arg3) {
        field4547++;
        if (arg3 != 64) {
            field4551 = null;
        }
        class62.field814 = arg1;
        class211.field2800 = arg2;
        class152.field2065 = arg0;
        int var4 = class152.field2065.method2268((byte) 67) - 1;
        class16.field220 = class152.field2065.method2272(38, var4) + var4 * 256;
        class143.field1951 = new String[] { null, null, null, null, class393.field5623 };
        class276.field3995 = new String[] { null, null, class199.field2654, null, null };
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method2103(byte arg0) {
        field4545 = null;
        if (arg0 == -25) {
            field4546 = null;
            field4551 = null;
        }
    }
}
