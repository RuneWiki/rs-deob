import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class389 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Laj;")
    private class287 field5679 = new class287(256);

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Lcf;")
    private class562 field5686;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Lfa;")
    private class214 field5687;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field5682 = 0;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field5685 = 0;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Lkp;")
    public static class456 field5684;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
    public static boolean field5681;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)Lhi;")
    public final class190 method2396(byte arg0, int arg1) {
        field5680++;
        Object var3 = this.field5679.method1900((long) arg1, 127);
        if (arg0 <= 25) {
            return null;
        } else if (var3 != null) {
            return (class190) var3;
        } else if (this.field5687.method1499(arg1, -24052)) {
            class699 var4 = this.field5687.method1500(arg1, -22);
            int var5 = var4.field9836 ? 64 : this.field5686.field8114;
            class190 var7;
            if (var4.field9827 && this.field5686.method162()) {
                float[] var6 = this.field5687.method1498(arg1, var5, false, var5, 0.7F, true);
                var7 = this.field5686.method3221(var5, var4.field9842 != 0, var6, (byte) 88, var5, class121.field2214);
            } else {
                int[] var8 = !var4.field9840 && class673.method3797(1, var4.field9829) ? this.field5687.method1495(arg1, true, 0.7F, var5, var5, 32682) : this.field5687.method1496(arg1, var5, 0.7F, false, var5, -15473);
                var7 = this.field5686.method3270(var5, var8, (byte) 50, var4.field9842 != 0, var5);
            }
            var7.method465(var4.field9847, 13321, var4.field9832);
            this.field5679.method1904(var7, (long) arg1, -1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjava/net/Socket;)Lqr;")
    public static final class59 method2397(int arg0, int arg1, Socket arg2) throws IOException {
        if (arg1 != 256) {
            field5681 = false;
        }
        field5677++;
        return new class25(arg2, arg0);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public final void method2398(boolean arg0) {
        field5683++;
        if (!arg0) {
            this.method2399(-18);
        }
        this.field5679.method1908(5, (byte) -11);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final void method2399(int arg0) {
        this.field5679.method1913(true);
        field5678++;
        if (arg0 != -21406) {
            this.method2396((byte) -85, 118);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method2400(int arg0) {
        if (arg0 != -20086) {
            method2400(76);
        }
        field5684 = null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lcf;Lfa;)V")
    public class389(class562 arg0, class214 arg1) {
        this.field5686 = arg0;
        this.field5687 = arg1;
    }
}
