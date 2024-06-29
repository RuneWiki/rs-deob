import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class class316 extends class540 {

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLcb;II)Lot;")
    public static final class614 method2073(byte arg0, class544 arg1, int arg2, int arg3) {
        field4713++;
        if (arg0 < 114) {
            return null;
        }
        class120 var4 = new class120(arg1.method3150(arg2, -89, arg3));
        class614 var5 = new class614(arg2, var4.method861(true), var4.method861(true), var4.method871(23995), var4.method871(23995), var4.method842(2384) == 1, var4.method842(2384), var4.method842(2384));
        int var6 = var4.method842(2384);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field8664.method2510(new class265(var4.method842(2384), var4.method898((byte) -127), var4.method898((byte) -117), var4.method898((byte) -122), var4.method898((byte) -107), var4.method898((byte) -85), var4.method898((byte) -103), var4.method898((byte) -81), var4.method898((byte) -85)), false);
        }
        var5.method3530((byte) 9);
        return var5;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILrv;)V")
    public abstract void method818(int arg0, class120 arg1);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lft;I)I")
    public static final int method2074(class4 arg0, int arg1) {
        if (arg1 == 0) {
            field4712++;
            String var2 = class36.method243(30697, arg0);
            return class33.field439.method1735((byte) -12, class725.field10175, var2);
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lua;I)V")
    public abstract void method819(class692 arg0, int arg1);
}
