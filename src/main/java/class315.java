import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class315 extends class202 {

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public int field4866 = -1;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public int field4859 = -1;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Ldp;")
    public static class347 field4868 = new class347("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            this.field4867 = -99;
        }
        ++field4862;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method1974(int arg0) {
        if (arg0 <= 38) {
            field4860 = -124;
        }
        field4868 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field4869;
        class511 var3 = arg0.method66();
        var3.method1307(super.field2943, super.field2935, super.field2939);
        class268 var4 = class281.method1757(~arg1, 3);
        if (~this.field4866 != 0) {
            class398 var5 = class164.field2437.method1749(this.field4866, arg1 + -20229).method578(arg0, this.field4861, (byte) -83, (class520) null, 0, 0, 2048, (class36) null, -1);
            if (var5 != null) {
                var5.method640(var3, var4.field3992[2], 0);
            }
        }
        if (~this.field4859 != 0) {
            class398 var6 = class164.field2437.method1749(this.field4859, -20230).method578(arg0, this.field4867, (byte) -83, (class520) null, 0, 0, 2048, (class36) null, -1);
            if (var6 != null) {
                var6.method640(var3, var4.field3992[1], 0);
            }
        }
        class398 var7 = class164.field2437.method1749(this.field4864, -20230).method578(arg0, this.field4863, (byte) -83, (class520) null, 0, 0, 2048, (class36) null, arg1);
        if (var7 != null) {
            var7.method640(var3, var4.field3992[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field4865;
        class511 var5 = arg1.method66();
        var5.method1307(super.field2943, super.field2935, super.field2939);
        class398 var6 = class164.field2437.method1749(this.field4864, -20230).method578(arg1, this.field4863, (byte) -83, (class520) null, 0, 0, 131072, (class36) null, -1);
        if (arg2 != 2) {
            return true;
        } else if (var6 != null && var6.method655(arg0, arg3, var5, true)) {
            return true;
        } else {
            if (~this.field4859 != 0) {
                class398 var7 = class164.field2437.method1749(this.field4859, -20230).method578(arg1, this.field4867, (byte) -83, (class520) null, 0, 0, 131072, (class36) null, -1);
                if (var7 != null && var7.method655(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            if (this.field4866 != -1) {
                class398 var8 = class164.field2437.method1749(this.field4866, -20230).method578(arg1, this.field4861, (byte) -83, (class520) null, 0, 0, 131072, (class36) null, -1);
                if (var8 != null && var8.method655(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
