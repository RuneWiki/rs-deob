import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class378 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field5540;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public int field5538;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lkg;")
    public static class223 field5539 = null;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public abstract int method1429(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
    public abstract int method1427(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    public abstract void method1421();

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILqh;)Lqh;")
    public abstract class337 method1426(int arg0, int arg1, class337 arg2);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1423(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1419(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lct;BII)Lhi;")
    public static final class365 method2393(class104 arg0, byte arg1, int arg2, int arg3) {
        field5535++;
        byte[] var4 = arg0.method715(arg2, (byte) 57, arg3);
        if (arg1 < 43) {
            field5537 = 27;
        }
        return var4 == null ? null : new class365(var4);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method2394(int arg0) {
        if (arg0 == 9267) {
            field5539 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)V")
    public abstract void method1420(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqh;IIIIZ)V")
    public abstract void method1431(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public abstract void method1424(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lqh;IIIIZ)V")
    public abstract void method1430(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(Lqh;IIIIZ)Z")
    public abstract boolean method1428(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;I)Lon;")
    public static final class37 method2395(Component arg0, int arg1) {
        field5536++;
        if (arg1 != 12127) {
            method2393((class104) null, (byte) -108, -70, -55);
        }
        return new class25(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lap;[I)V")
    public abstract void method1432(class298 arg0, int[] arg1);

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
    public class378(int arg0, int arg1) {
        this.field5540 = arg1;
        this.field5538 = arg0;
    }
}
