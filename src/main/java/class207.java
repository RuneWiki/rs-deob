import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class207 extends class60 {

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field3325 = -32768;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3332 = "wishes to trade with you.";

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[I")
    public static int[] field3324 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3336 = 0;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lqi;")
    public static class217 field3334;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field3327;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[Lbf;")
    public static class102[] field3326;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10) {
        class168 var13 = class190.method1314(this.field3329, (byte) 68).method521((class77) null, this.field3333, (class81) null, -1, 0, 0, -1);
        field3335++;
        if (var13 != null) {
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3325 = var13.method99();
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method1388(int arg0) {
        field3327 = null;
        field3334 = null;
        field3326 = null;
        field3324 = null;
        if (arg0 == -1) {
            field3332 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3337++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
    public final int method99() {
        field3330++;
        return this.field3325;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public static final void method1389(int arg0, int arg1) {
        field3328++;
        class250.field3987.method1163(arg0, false);
        if (arg1 > -106) {
            method1389(25, 69);
        }
    }
}
