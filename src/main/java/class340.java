import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class340 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Llg;")
    public static class237 field4820 = new class237(8);

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Liq;")
    public static class362 field4821 = new class362("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "[[B")
    public static byte[][] field4822;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lae;BILwq;I)V")
    public static final void method2182(class134 arg0, byte arg1, int arg2, class92 arg3, int arg4) {
        field4816++;
        class174.field2393.method505((byte) 44);
        if (class18.field207) {
            return;
        }
        int var5 = -48 / ((-arg1 - 64) / 54);
        for (class324 var6 = (class324) arg3.method506((byte) -128); var6 != null; var6 = (class324) arg3.method514(true)) {
            class246 var7 = class153.method927(0, var6.field4613);
            if (class366.method2340((byte) -101, var7)) {
                boolean var8 = class328.method2121(var6, var7, arg4, arg2, true, arg0);
                if (var8) {
                    class294.method1943(var7, var6, 1, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method2183(byte arg0) {
        field4820 = null;
        field4822 = null;
        if (arg0 >= -112) {
            field4821 = null;
        }
        field4821 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static final int method2184(int arg0, int arg1) {
        field4818++;
        if (arg0 > -3) {
            method2185(true, false);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZZ)V")
    public static final void method2185(boolean arg0, boolean arg1) {
        class183.method1230(class330.field4671, arg1, (byte) -122, class105.field1259, class248.field3548);
        if (arg0) {
            field4821 = null;
        }
        field4819++;
    }
}
