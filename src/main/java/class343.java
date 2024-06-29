import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class343 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public int field5105;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public int field5107;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field5109 = 0;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "F")
    public static float field5110;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
    public abstract void method308();

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lh;IIIIZ)V")
    public abstract void method304(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
    public abstract int method318(int arg0, int arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lki;[I)V")
    public abstract void method316(class480 arg0, int[] arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method312(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
    public abstract void method306(int arg0, int arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
    public static final void method2110(int arg0, byte arg1) {
        if (arg1 < 37) {
            method2110(-68, (byte) -35);
        }
        field5111++;
        class64 var2 = class230.method1387(arg0, (byte) 40, 6);
        var2.method446(-20033);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method311(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method310(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lh;IIIIZ)V")
    public abstract void method299(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILh;)Lh;")
    public abstract class452 method309(int arg0, int arg1, class452 arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public abstract void method300(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(Lh;IIIIZ)Z")
    public abstract boolean method302(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)I")
    public abstract int method314(int arg0, int arg1);

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V")
    public class343(int arg0, int arg1, int arg2) {
        this.field5108 = arg0;
        this.field5105 = arg1;
        while (arg2 > 1) {
            this.field5112++;
            arg2 >>= 0x1;
        }
        this.field5107 = 0x1 << this.field5112;
    }
}
