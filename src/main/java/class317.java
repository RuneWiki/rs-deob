import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class317 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lwe;")
    private class24 field4539 = new class24(256);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lih;")
    private class330 field4540;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lfl;")
    private class386 field4538;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Leq;", line = 8)
    public final class140 method1972(boolean arg0, int arg1) {
        Object var3 = this.field4539.method209(127, (long) arg1);
        if (var3 != null) {
            return (class140) var3;
        } else if (this.field4538.method1756(arg0, arg1)) {
            class175 var4 = this.field4538.method1760(-19907, arg1);
            int var5 = var4.field2281 ? 64 : 128;
            class140 var7;
            if (var4.field2292 && this.field4540.method2051()) {
                float[] var6 = this.field4538.method1763(var5, (byte) -88, false, 0.7F, arg1, var5);
                var7 = new class140(this.field4540, 3553, 34842, var5, var5, var4.field2278 != 0, var6, 6408);
            } else {
                int[] var8 = this.field4538.method1758(var5, arg1, false, -11047, 0.7F, var5);
                short var9 = 6408;
                var7 = new class140(this.field4540, 3553, var9, var5, var5, var4.field2278 != 0, var8, false);
            }
            var7.method944(var4.field2277, var4.field2285);
            this.field4539.method202(true, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 48)
    public final void method1973(int arg0) {
        if (arg0 != 3553) {
            this.field4539 = (class24) null;
        }
        this.field4539.method212(-102);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lih;Lfl;)V", line = 59)
    public class317(class330 arg0, class386 arg1) {
        this.field4540 = arg0;
        this.field4538 = arg1;
    }
}
