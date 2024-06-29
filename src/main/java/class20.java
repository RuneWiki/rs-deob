import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 implements class116 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Luj;")
    private class381 field254;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
    public int[] field264;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lwo;")
    private class741 field255;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[F")
    public float[] field256;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public static int[] field261;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[Luo;")
    public static class573[] field259;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field262++;
        class455.method2783(this.field254.field5308.field8225, arg5, arg7 ? this.field254.field5344 : null, 0, arg7 ? this.field256 : null, arg1, arg4, arg2, this.field257, arg3, arg6 ? this.field254.field5308.field8228 : null, arg0, this.field264);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class455.method2783(this.field257, arg5, arg7 ? this.field256 : null, 0, arg7 ? this.field254.field5344 : null, arg1, arg4, arg2, this.field254.field5308.field8225, arg3, arg6 ? this.field264 : null, arg0, this.field254.field5308.field8228);
        field258++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method125(int arg0) {
        field261 = null;
        field259 = null;
        if (arg0 != 0) {
            method125(-54);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Luj;Lkr;Lwo;)V")
    public class20(class381 arg0, class743 arg1, class741 arg2) {
        this.field254 = arg0;
        if ((arg1 instanceof class286)) {
            class286 var5 = (class286) arg1;
            this.field264 = var5.field4054;
            this.field263 = var5.field9275;
            this.field257 = var5.field9265;
        } else if ((arg1 instanceof class97)) {
            class97 var4 = (class97) arg1;
            this.field264 = var4.field1662;
            this.field263 = var4.field9275;
            this.field257 = var4.field9265;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field255 = arg2;
            if (this.field255.field10396 != this.field257 || this.field255.field10393 != this.field263) {
                throw new RuntimeException();
            }
            this.field256 = this.field255.field10398;
        }
    }
}
