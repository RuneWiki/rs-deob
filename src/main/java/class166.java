import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class166 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Z")
    public static boolean field2034 = false;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "B")
    public static byte field2037;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 7)
    public static final void method925(int arg0, int arg1) {
        class483 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class174 var4 = class90.field1114[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class548.field8061; var5++) {
                    for (int var6 = 0; var6 < class238.field2985; var6++) {
                        var2 = var4.method853(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class362.field4756;
                            int var8 = var5 << class362.field4756;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class174 var10 = class90.field1114[var9];
                                if (var10 != null) {
                                    int var11 = var4.method855(var6, var5) - var10.method855(var6, var5);
                                    int var12 = var4.method855(var6 + 1, var5) - var10.method855(var6 + 1, var5);
                                    int var13 = var4.method855(var6 + 1, var5 + 1) - var10.method855(var6 + 1, var5 + 1);
                                    int var14 = var4.method855(var6, var5 + 1) - var10.method855(var6, var5 + 1);
                                    var10.method848(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Los;I)Lbb;", line = 71)
    public static final class277 method926(class374 arg0, int arg1) {
        if (arg1 != 1) {
            field2037 = 117;
        }
        field2035++;
        return new class277(arg0.method2089(true), arg0.method2089(true), arg0.method2089(true), arg0.method2089(true), arg0.method2128(true), arg0.method2128(true), arg0.method2129(-62));
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V", line = 83)
    public static final void method927(int arg0, int arg1) {
        if (arg0 < 35) {
            method925(125, -53);
        }
        class126.field1550 = arg1;
        field2036++;
        class641 var2 = class341.field4398;
        synchronized (class341.field4398) {
            class341.field4398.method3687(1402);
        }
    }
}
