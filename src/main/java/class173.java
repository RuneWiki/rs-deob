import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class173 {

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Lte;")
    private class527 field2674;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field2675;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([BI)V")
    public final void method1221(byte[] arg0, int arg1) {
        if (this.field2675 == null || this.field2675.getSize() < arg1) {
            this.field2675 = this.field2674.field7744.method3440(arg1, false);
        }
        this.field2675.method2438(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lte;[BI)V")
    public class173(class527 arg0, byte[] arg1, int arg2) {
        this.field2674 = arg0;
        this.field2675 = this.field2674.field7744.method3440(arg2, false);
        if (arg1 != null) {
            this.field2675.method2438(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lte;Ljaclib/memory/Buffer;)V")
    public class173(class527 arg0, Buffer arg1) {
        this.field2674 = arg0;
        this.field2675 = arg1;
    }
}
