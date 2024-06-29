import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class325 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public int[] field4441;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
    public short[] field4445;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "J")
    public long field4446;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[S")
    public short[] field4442;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Laca;")
    public static class758 field4443 = new class758(0, 1);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lvl;")
    public static class15 field4449 = new class15(75, 3);

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[[[Lni;")
    public static class549[][][] field4448;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method2063(int arg0) {
        if (arg0 < 17) {
            method2063(-86);
        }
        field4448 = null;
        field4449 = null;
        field4443 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public static final void method2064(int arg0, int arg1, int arg2) {
        field4444++;
        class28 var3 = class378.field5161[arg2][arg1];
        if (var3 != null) {
            class680.field9469 = var3.field522;
            class571.field8134 = var3.field526;
            class752.field10378 = var3.field535;
        }
        class518.method2953((byte) -26);
        if (arg0 != 1) {
            method2063(14);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(J[I[S[S)V")
    public class325(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field4441 = arg1;
        this.field4445 = arg3;
        this.field4446 = arg0;
        this.field4442 = arg2;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    protected class325() {
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILgj;IIIIZ)V")
    public static final void method2065(int arg0, class662 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class11.field180 = arg1;
        class457.field6220 = arg3;
        class171.field2733 = arg5;
        class126.field2224 = arg0;
        class676.field9431 = null;
        class752.field10377 = arg4;
        class469.field6348 = arg2;
        class234.field3371 = arg6;
        field4447++;
    }
}
