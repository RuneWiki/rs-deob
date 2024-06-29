import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class333 extends class225 {

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lcr;")
    public static class189 field4826 = new class189(64);

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4829 = "Loaded wordpack";

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lvk;")
    private class56 field4828;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
    public static final int method2196(int arg0, int arg1, int arg2) {
        field4823++;
        int var3 = arg1;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
    public static void method2197(byte arg0) {
        field4826 = null;
        field4829 = null;
        if (arg0 < 90) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2198(int arg0, String arg1, int arg2) {
        field4820++;
        if (this.field4828 == null) {
            return arg1;
        }
        class134 var4 = (class134) this.field4828.method384((long) arg2, true);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 <= 46) {
                field4826 = null;
            }
            return var4.field1871;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Llm;B)V")
    public static final void method2199(class347 arg0, byte arg1) {
        field4825++;
        if (arg1 > -106) {
            method2199((class347) null, (byte) 62);
        }
        class126.field1768 = 0;
        class177.field2344 = 0;
        class106.field1530 = new class162();
        class43.field611 = new class443[1024];
        class83.method587(arg0, (byte) 95);
        class356.method2334(arg0, (byte) 118);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lps;III)V")
    public static final void method2200(class394 arg0, int arg1, int arg2, int arg3) {
        field4824++;
        if (class16.field224 != null || class2.field26 || arg0 == null || class70.method499(-21930, arg0) == null) {
            return;
        }
        class16.field224 = arg0;
        class179.field2370 = class70.method499(-21930, arg0);
        class376.field5486 = false;
        class252.field3471 = arg2;
        class396.field5871 = 0;
        class218.field2886 = arg3;
        if (arg1 != 872) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILnj;)V")
    public final void method2201(int arg0, class228 arg1) {
        field4822++;
        if (arg0 != 0) {
            method2197((byte) 3);
        }
        while (true) {
            int var3 = arg1.method1348(arg0 ^ 0xFFFFFF9C);
            if (var3 == 0) {
                return;
            }
            this.method2203(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)I")
    public final int method2202(int arg0, int arg1, int arg2) {
        field4827++;
        if (arg0 != 0) {
            return 102;
        } else if (this.field4828 == null) {
            return arg1;
        } else {
            class279 var4 = (class279) this.field4828.method384((long) arg2, true);
            return var4 == null ? arg1 : var4.field4054;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lnj;ZI)V")
    private final void method2203(class228 arg0, boolean arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1348(-92);
            if (this.field4828 == null) {
                int var5 = class139.method896(var4, -98);
                this.field4828 = new class56(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1348(-101) == 1;
                int var8 = arg0.method1333((byte) -101);
                class45 var9;
                if (var7) {
                    var9 = new class134(arg0.method1329(991328496));
                } else {
                    var9 = new class279(arg0.method1344((byte) 49));
                }
                this.field4828.method381(true, var9, (long) var8);
            }
        }
        if (arg1) {
            field4821++;
        }
    }
}
