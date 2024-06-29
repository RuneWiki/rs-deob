import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class430 extends class448 {

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
    public static int[] field6267 = new int[1];

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Lfg;")
    public static class83 field6265 = new class83("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public int field6263;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public int field6271;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "Lir;")
    public class22 field6262;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "Lvh;")
    public static class240 field6268;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvf;")
    public static final class103 method2567(Throwable arg0, String arg1) {
        field6270++;
        class103 var2;
        if ((arg0 instanceof class103)) {
            var2 = (class103) arg0;
            var2.field1406 = var2.field1406 + ' ' + arg1;
        } else {
            var2 = new class103(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public static void method2568(int arg0) {
        field6265 = null;
        if (arg0 != -65) {
            field6265 = null;
        }
        field6268 = null;
        field6267 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Lub;")
    public static final class18 method2569(int arg0, int arg1) {
        field6261++;
        class18[] var2 = class210.method1268(108);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class18 var4 = var2[var3];
            if (var4.field190 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
    public static final void method2570(int arg0) {
        field6269++;
        if (class125.field1717) {
            return;
        }
        class351.field4800 = true;
        class125.field1717 = true;
        if (arg0 != 28) {
            return;
        }
        if (class437.field6374.field4261) {
            class40.field553 = ((int) class40.field553 - 65 & 0xFFFFFF80);
        } else {
            class401.field5582 += (-24.0F - class401.field5582) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V")
    public static final void method2571(byte arg0) {
        if (class137.field1958 == 10) {
            class26.method186(28, 8);
        }
        if (arg0 >= -35) {
            field6267 = null;
        }
        field6266++;
        if (class137.field1958 == 30) {
            class26.method186(25, 8);
        }
    }
}
