import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class118 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Ldj;")
    public static class362 field1501 = new class362(16);

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lhd;")
    public static class773 field1503;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[[B")
    public static byte[][] field1500;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method925(boolean arg0) {
        field1500 = null;
        if (arg0) {
            field1501 = null;
            field1503 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method926(int arg0) {
        if (arg0 >= -1) {
            method926(-31);
        }
        field1499++;
        if (!class104.field1336) {
            return;
        }
        class620 var1 = class481.method2859(class351.field4370, class215.field2531, 16383);
        if (var1 != null && var1.field8441 != null) {
            class529 var2 = new class529();
            var2.field7473 = var1;
            var2.field7477 = var1.field8441;
            class142.method1045(var2);
        }
        class104.field1336 = false;
        class680.field9309 = -1;
        class520.field7344 = -1;
        if (var1 != null) {
            class576.method3330(var1, -1);
        }
    }
}
