import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class196 extends class555 {

    @OriginalMember(owner = "client!br", name = "K", descriptor = "Z")
    public boolean field2264;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "F")
    public float field2267;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "F")
    public float field2266;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!br", name = "R", descriptor = "[[I")
    public static int[][] field2270 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!br", name = "P", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "Lad;")
    public static class19 field2265 = new class19(3000000, 200);

    @OriginalMember(owner = "client!br", name = "J", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "Ltf;")
    public static class701 field2269;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIII)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field3988 == -34038) {
            this.field2264 = false;
            this.field2267 = (float) arg4;
            this.field2266 = (float) arg3;
        } else {
            this.field2264 = true;
            this.field2266 = this.field2267 = 1.0F;
        }
        this.field2261 = arg4;
        this.field2262 = arg3;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIIIZ[BI)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2261 = arg4;
        if (~super.field3988 == -34038) {
            this.field2266 = (float) arg3;
            this.field2267 = (float) arg4;
            this.field2264 = false;
        } else {
            this.field2264 = true;
            this.field2266 = this.field2267 = 1.0F;
        }
        this.field2262 = arg3;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIIZ[I)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field3988 != 34037) {
            this.field2264 = true;
            this.field2266 = this.field2267 = 1.0F;
        } else {
            this.field2267 = (float) arg3;
            this.field2266 = (float) arg2;
            this.field2264 = false;
        }
        this.field2262 = arg2;
        this.field2261 = arg3;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIII[I)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2262 = arg1;
        this.field2261 = arg2;
        this.method3147(0, arg2, arg1, (byte) 119, true, 0, 0, arg5, 0);
        this.field2264 = false;
        this.field2266 = (float) arg1 / (float) arg3;
        this.field2267 = (float) arg2 / (float) arg4;
        this.method3148(10243, false, false);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIIIIZ)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field3988 == 34037) {
            this.field2266 = (float) arg4;
            this.field2267 = (float) arg5;
            this.field2264 = false;
        } else {
            this.field2264 = true;
            this.field2266 = this.field2267 = 1.0F;
        }
        this.field2262 = arg4;
        this.field2261 = arg5;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIIII[BI)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2262 = arg2;
        this.field2261 = arg3;
        this.method3149(true, 0, 0, arg3, arg2, arg6, 0, 4, 0, arg7);
        this.field2264 = false;
        this.field2266 = (float) arg2 / (float) arg4;
        this.field2267 = (float) arg3 / (float) arg5;
        this.method3148(10243, false, false);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIIII)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2266 = (float) arg2 / (float) arg4;
        this.field2267 = (float) arg3 / (float) arg5;
        this.field2264 = false;
        this.field2262 = arg2;
        this.field2261 = arg3;
        this.method3148(10243, false, false);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lvj;IIIIIIZ)V")
    public class196(class422 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2267 = (float) arg4 / (float) arg6;
        this.field2262 = arg3;
        this.field2266 = (float) arg3 / (float) arg5;
        this.field2261 = arg4;
        this.field2264 = false;
        this.method3148(10243, false, false);
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field2265 = null;
        field2270 = null;
        field2269 = null;
        if (arg0 != 6) {
            field2270 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ltf;Lfa;I)V")
    public static final void method1188(class701 arg0, class524 arg1, int arg2) {
        class291.field3641 = arg0;
        class93.field939 = arg1;
        if (arg2 != 0) {
            field2269 = null;
        }
        ++field2263;
    }
}
