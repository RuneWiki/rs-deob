import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class83 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static volatile int field1300 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1304 = "Loading title screen - ";

    @OriginalMember(owner = "client!b", name = "g", descriptor = "[Lie;")
    public static class32[] field1305 = new class32[50];

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    public static int[] field1301 = new int[128];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    public static int[] field1302;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "[[[I")
    public static int[][][] field1307;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lfg;")
    public static final class12 method595(int arg0, int arg1) {
        field1299++;
        class12 var2 = (class12) class64.field1065.method480((long) arg0, 106);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -58) {
            method598(52, (byte) 68);
        }
        byte[] var3 = class194.field3102.method1357(class152.method1060(8, arg0), method598(arg0, (byte) -111), -1);
        class12 var4 = new class12();
        var4.field196 = arg0;
        if (var3 != null) {
            var4.method102(new class221(var3), 104);
        }
        var4.method91((byte) -123);
        if (var4.field206 != -1) {
            var4.method99(method595(var4.field206, -88), true, method595(var4.field232, -106));
        }
        if (var4.field186 != -1) {
            var4.method103((byte) -124, method595(var4.field186, -120), method595(var4.field197, -113));
        }
        if (!class176.field2782 && var4.field203) {
            var4.field165 = class124.field2010;
            var4.field222 = class286.field4518;
            var4.field174 = class185.field2935;
            var4.field183 = 0;
            var4.field163 = false;
        }
        class64.field1065.method474((long) arg0, (byte) 93, var4);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1307 = null;
        field1302 = null;
        if (arg0 != -1) {
            field1300 = 10;
        }
        field1305 = null;
        field1301 = null;
        field1304 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lqh;I)V")
    public static final void method597(class201 arg0, int arg1) {
        class190.field3080 = class129.method919(class179.field2813, 10072, arg0, 0);
        field1306++;
        class7.field87 = class146.method999(class255.field4058, arg0, -12640, 0);
        class257.field4098 = class146.method999(class217.field3540, arg0, -12640, 0);
        class115.field1916 = class146.method999(class256.field4070, arg0, -12640, 0);
        class129.field2092 = class146.method999(class189.field3057, arg0, -12640, 0);
        class278.field4377 = class146.method999(class181.field2849, arg0, -12640, 0);
        class97.field1597 = class146.method999(class177.field2798, arg0, -12640, 0);
        class43.field793 = class132.method932(class176.field2779, 0, arg0, 128);
        class40.field753 = class196.method1333(class289.field4572, arg0, 0, 91);
        class221.field3631 = class196.method1333(class136.field2238, arg0, 0, 99);
        class189.field3066 = class66.method464(-3256, class210.field3437, arg0, 0);
        class247.field3947 = class66.method464(-3256, class240.field3891, arg0, 0);
        class158.field2555.method1805(class247.field3947, (int[]) null);
        class184.field2892.method1805(class247.field3947, (int[]) null);
        class262.field4165.method1805(class247.field3947, (int[]) null);
        class37 var2 = class56.method421(class181.field2833, -17364, 0, arg0);
        var2.method323();
        class219.field3578 = var2;
        class37[] var3 = class129.method919(class280.field4438, 10072, arg0, 0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method323();
        }
        class76.field1227 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        if (arg1 >= -28) {
            field1305 = null;
        }
        for (int var9 = 0; var9 < class190.field3080.length; var9++) {
            class190.field3080[var9].method325(var6 + var8, var5 - -var8, var7 + var8);
        }
        class127.field2051 = class190.field3080;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)I")
    private static final int method598(int arg0, byte arg1) {
        field1303++;
        return arg1 >= -74 ? 64 : arg0 >>> 8;
    }
}
