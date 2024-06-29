import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class455 extends class715 {

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    private int field6310;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    private int field6305;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    private int field6303;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    private int field6307;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "Ldw;")
    private class664 field6301;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    private int field6312;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "Lkr;")
    public static class602 field6306 = new class602(109, 4);

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "Lifa;")
    private class413 field6311;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Lifa;")
    public final class413 method1148(int arg0) {
        field6304++;
        if (arg0 != 0) {
            this.field6305 = 57;
        }
        if (this.field6311 == null) {
            class99.field1378[4] = this.field6307;
            class99.field1378[1] = this.field6305;
            class99.field1378[2] = this.field6312;
            class270 var2 = this.field6301.field7623;
            class99.field1378[5] = this.field6303;
            class99.field1378[3] = this.field6309;
            class99.field1378[0] = this.field6310;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method517(class99.field1378[var5], true)) {
                    return null;
                }
                class239 var7 = var2.method521(class99.field1378[var5], 108);
                int var8 = var7.field3556 ? 64 : 128;
                if (var7.field3575 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class169.field2351[var6] = var2.method519(-6839, class99.field1378[var6], 1.0F, var4, var4, false);
            }
            this.field6311 = new class413(this.field6301, 6407, var4, var3, class169.field2351);
        }
        return this.field6311;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Z)V")
    public static void method2784(boolean arg0) {
        field6306 = null;
        if (arg0) {
            field6300 = 25;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
    public static final void method2785(int arg0, int arg1) {
        if (arg1 != 64) {
            method2785(98, -79);
        }
        field6302++;
        class346 var2 = class299.method1976(0, 16, arg0);
        var2.method2208(-1719);
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Ldw;IIIIII)V")
    public class455(class664 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6310 = arg1;
        this.field6305 = arg2;
        this.field6303 = arg6;
        this.field6309 = arg4;
        this.field6307 = arg5;
        this.field6301 = arg0;
        this.field6312 = arg3;
    }
}
