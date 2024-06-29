import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class298 extends class165 {

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "I")
    private int field4488 = -1;

    @OriginalMember(owner = "client!ria", name = "r", descriptor = "Ljo;")
    public static class351 field4486 = new class351(80, 2);

    @OriginalMember(owner = "client!ria", name = "s", descriptor = "[Ljw;")
    public static class578[] field4487 = new class578[8];

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "[[I")
    public static int[][] field4492 = new int[128][128];

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "Lfa;")
    public static class243 field4491;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILmia;)V")
    public final void method612(int arg0, class69 arg1) {
        if (arg0 >= -100) {
            field4491 = null;
        }
        field4489++;
        arg1.method551(this.field4488, 0);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4492 = null;
        if (arg0 == 128) {
            field4486 = null;
            field4491 = null;
            field4487 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
    public static final byte[] method1991(Object arg0, int arg1, int arg2, int arg3) {
        field4490++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != -18784) {
            method1990(58);
        }
        if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class676.method3828(arg3, var4, arg1, arg2 + 3751);
        } else if (arg0 instanceof class581) {
            class581 var5 = (class581) arg0;
            return var5.method283(0, arg3, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lrv;I)V")
    public final void method614(class120 arg0, int arg1) {
        if (arg1 == 1070) {
            this.field4488 = arg0.method898((byte) -105);
            field4485++;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1992(int arg0, byte[] arg1) {
        field4484++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class42.method288(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }
}
