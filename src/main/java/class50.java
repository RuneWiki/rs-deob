import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class50 {

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "J")
    public long field592;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "Ltba;")
    private class147 field588;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        this.field588.method1046(this.field592, 45);
        field590++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 2) {
            method399(110, 92, 3, 0, 7, -91, -95);
        }
        for (class544 var7 = (class544) class43.field508.method3898((byte) -90); var7 != null; var7 = (class544) class43.field508.method3902(true)) {
            if (class186.field2697 >= var7.field7390) {
                var7.method3074((byte) 48);
            } else {
                class405.method2359((var7.field7383 << 9) + 256, var7.field7380, false, var7.field7385 * 2, arg6, (var7.field7381 << 9) + 256, arg3 >> 1, arg5, arg1 >> 1);
                class428.field5986.method2418(false, 0, var7.field7384, class431.field6023[1] + arg4, var7.field7386 | 0xFF000000, class431.field6023[0] + arg0);
            }
        }
        field589++;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ltba;J[Ltu;)V", line = 45)
    public class50(class147 arg0, long arg1, class318[] arg2) {
        this.field592 = arg1;
        this.field588 = arg0;
    }
}
