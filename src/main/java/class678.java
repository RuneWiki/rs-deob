import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class678 {

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public int field9489;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "Laf;")
    public static class39 field9487 = new class39(4);

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "F")
    public static float field9486;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
    public static final void method3857(byte arg0, long[] arg1, Object[] arg2) {
        class367.method2289(arg1.length - 1, 31439, 0, arg1, arg2);
        field9483++;
        if (arg0 != -58) {
            field9487 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public static void method3858(int arg0) {
        if (arg0 != 0) {
            method3857((byte) 103, null, null);
        }
        field9487 = null;
    }

    @OriginalMember(owner = "client!fea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9488++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILae;)I")
    public static final int method3859(int arg0, class283 arg1) {
        field9484++;
        int var2 = 0;
        if (arg1.method1860(class680.field9500, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class302.field4406, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class17.field108, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class9.field53, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class769.field10589, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class145.field1876, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class681.field9548, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class764.field10473, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class591.field8334, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class351.field5100, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class559.field7874, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class392.field5588, (byte) 124)) {
            var2++;
        }
        if (arg0 != -3764) {
            field9486 = 1.2629381F;
        }
        if (arg1.method1860(class436.field6054, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class685.field9572, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class758.field10424, (byte) 124)) {
            var2++;
        }
        if (arg1.method1860(class479.field6648, (byte) 124)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(FIFFILnh;FIIFI)[B")
    public static final byte[] method3860(float arg0, int arg1, float arg2, float arg3, int arg4, class551 arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        if (arg7 != -19839) {
            field9487 = null;
        }
        field9485++;
        byte[] var11 = new byte[arg1 * arg4 * arg8];
        class282.method1833(0, arg8, arg2, arg4, var11, arg5, arg1, arg10, arg0, arg6, arg9, arg3, (byte) 77);
        return var11;
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public class678(String arg0, String arg1, String arg2, int arg3) {
        this.field9489 = arg3;
    }
}
