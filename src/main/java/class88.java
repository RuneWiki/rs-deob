import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class88 {

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[Lor;Z)V")
    public static final void method719(int arg0, class668[] arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field1230++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class668 var4 = arg1[var3];
            if (var4 != null && var4.field9336 == arg0 && !client.method2008(var4)) {
                if (var4.field9353 == 0) {
                    method719(var4.field9221, arg1, false);
                    if (var4.field9289 != null) {
                        method719(var4.field9221, var4.field9289, arg2);
                    }
                    class237 var5 = (class237) class609.field8283.method3953((long) var4.field9221, 14);
                    if (var5 != null) {
                        class586.method3253(-113, var5.field3202);
                    }
                }
                if (var4.field9353 == 6 && var4.field9218 != -1) {
                    class489 var6 = class6.field65.method1034(var4.field9218, 0);
                    if (var6 != null) {
                        var4.field9323 += class303.field4368;
                        int var7 = var4.field9264;
                        while (var4.field9323 > var6.field6773[var4.field9264]) {
                            var4.field9323 -= var6.field6773[var4.field9264];
                            var4.field9264++;
                            if (var6.field6775.length <= var4.field9264) {
                                var4.field9264 -= var6.field6789;
                                if (var4.field9264 < 0 || var4.field9264 >= var6.field6775.length) {
                                    var4.field9264 = 0;
                                }
                            }
                            var4.field9315 = var4.field9264 + 1;
                            if (var6.field6775.length <= var4.field9315) {
                                var4.field9315 -= var6.field6789;
                                if (var4.field9315 < 0 || var4.field9315 >= var6.field6775.length) {
                                    var4.field9315 = -1;
                                }
                            }
                            class763.method4242(var4, true);
                        }
                        if (var4.field9264 != var7) {
                            class291.method1842(0, var4.field9264, var6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public static final void method720(int arg0) {
        class66.field937.method550(class380.field5557, class712.field9959.field1316.method1192(43) == 1 ? class114.field1554 + 256 << 2 : -1, 0);
        field1231++;
        if (arg0 >= -30) {
            method720(97);
        }
    }
}
