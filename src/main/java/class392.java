import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class392 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field5407 = 0;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
    public static boolean field5411 = false;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lha;")
    public static class294 field5410;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[Z")
    public static boolean[] field5409;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 15)
    public static final void method2372(int arg0) {
        field5408++;
        int var1 = -119 % ((-arg0 - 3) / 56);
        class184.method1314(class464.field6538, 119);
        class139.field1927++;
        if (class487.field6893 && class442.field6293) {
            int var2 = class175.field2661.method1625((byte) -128);
            int var3 = class175.field2661.method1617(false);
            int var4 = var2 - class423.field5856;
            int var5 = var3 - class135.field1876;
            if (var4 < class340.field4703) {
                var4 = class340.field4703;
            }
            if (class315.field4454 > var5) {
                var5 = class315.field4454;
            }
            if (class340.field4703 + class86.field1215.field2554 < class464.field6538.field2554 + var4) {
                var4 = class340.field4703 + class86.field1215.field2554 - class464.field6538.field2554;
            }
            if (class464.field6538.field2579 + var5 > class315.field4454 + class86.field1215.field2579) {
                var5 = class315.field4454 + class86.field1215.field2579 - class464.field6538.field2579;
            }
            int var6 = var4 - (class340.field4703 - class86.field1215.field2477);
            int var7 = var5 + class86.field1215.field2518 - class315.field4454;
            if (class175.field2661.method1620(44)) {
                if (class464.field6538.field2497 < class139.field1927) {
                    int var8 = var4 - class30.field307;
                    int var9 = var5 - class332.field4628;
                    if (class464.field6538.field2508 < var8 || var8 < (-class464.field6538.field2508) || var9 > class464.field6538.field2508 || var9 < (-class464.field6538.field2508)) {
                        class122.field1672 = true;
                    }
                }
                if (class464.field6538.field2587 != null && class122.field1672) {
                    class472 var10 = new class472();
                    var10.field6652 = var6;
                    var10.field6650 = var7;
                    var10.field6649 = class464.field6538.field2587;
                    var10.field6642 = class464.field6538;
                    class457.method2745(var10);
                    return;
                }
            } else {
                if (class122.field1672) {
                    if (class464.field6538.field2614 != null) {
                        class472 var11 = new class472();
                        var11.field6642 = class464.field6538;
                        var11.field6639 = class119.field1648;
                        var11.field6650 = var7;
                        var11.field6652 = var6;
                        var11.field6649 = class464.field6538.field2614;
                        class457.method2745(var11);
                    }
                    if (class119.field1648 != null && client.method532(class464.field6538) != null) {
                        class83.method705(class119.field1648, class464.field6538, 1);
                    }
                } else if ((class398.field5463 == 1 || class206.method1414((byte) 85)) && class303.field4310 > 2) {
                    class67.method625((byte) -78, class332.field4628 + class135.field1876, class423.field5856 + class30.field307);
                } else if (class391.method2371((byte) -100)) {
                    class67.method625((byte) -85, class332.field4628 + class135.field1876, class423.field5856 + class30.field307);
                }
                class464.field6538 = null;
            }
        } else if (class139.field1927 > 1) {
            class464.field6538 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 133)
    public static void method2373(int arg0) {
        field5409 = null;
        if (arg0 == 0) {
            field5410 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhu;I)Lhu;")
    public abstract class432 method1886(class432 arg0, int arg1);
}
