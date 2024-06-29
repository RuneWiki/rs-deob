import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class413 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lhg;")
    public class413 field5938;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lhg;")
    public class413 field5941;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([Lon;II)V", line = 6)
    public static final void method2633(class184[] arg0, int arg1, int arg2) {
        field5939++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class184 var4 = arg0[var3];
            if (var4 != null && var4.field2599 == arg1 && !client.method1119(var4)) {
                if (var4.field2524 == 0) {
                    method2633(arg0, var4.field2584, 31793);
                    if (var4.field2603 != null) {
                        method2633(var4.field2603, var4.field2584, arg2);
                    }
                    class167 var5 = (class167) class22.field280.method1888((long) var4.field2584, (byte) -30);
                    if (var5 != null) {
                        class99.method552(var5.field2332, (byte) 88);
                    }
                }
                if (var4.field2524 == 6 && var4.field2544 != -1) {
                    class412 var6 = class189.method1288(-8192, var4.field2544);
                    if (var6 != null) {
                        var4.field2550 += class34.field392;
                        while (var4.field2550 > var6.field5918[var4.field2566]) {
                            var4.field2550 -= var6.field5918[var4.field2566];
                            var4.field2566++;
                            if (var4.field2566 >= var6.field5925.length) {
                                var4.field2566 -= var6.field5915;
                                if (var4.field2566 < 0 || var4.field2566 >= var6.field5925.length) {
                                    var4.field2566 = 0;
                                }
                            }
                            var4.field2541 = var4.field2566 + 1;
                            if (var4.field2541 >= var6.field5925.length) {
                                var4.field2541 -= var6.field5915;
                                if (var4.field2541 < 0 || var6.field5925.length <= var4.field2541) {
                                    var4.field2541 = -1;
                                }
                            }
                            class186.method1277(var4, (byte) 79);
                        }
                    }
                }
            }
        }
        if (arg2 != 31793) {
            field5942 = 1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)Z", line = 97)
    public static final boolean method2634(char arg0, int arg1) {
        field5940++;
        if (arg1 != 6541) {
            method2634('~', -41);
        }
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class273.field3877;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 139)
    public final void method2635(int arg0) {
        if (arg0 != -13388) {
            return;
        }
        field5937++;
        if (this.field5941 != null) {
            this.field5941.field5938 = this.field5938;
            this.field5938.field5941 = this.field5941;
            this.field5941 = null;
            this.field5938 = null;
        }
    }
}
