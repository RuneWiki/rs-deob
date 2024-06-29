import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class754 {

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "Lqj;")
    private class535 field10207 = new class535(256);

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "Lee;")
    private class703 field10204;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "Ld;")
    private class161 field10205;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "[[B")
    public static byte[][] field10206;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V", line = 5)
    public final void method4133(byte arg0) {
        field10203++;
        this.field10207.method3103(-11294);
        if (arg0 != 66) {
            this.field10205 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)Lfk;", line = 20)
    public final class678 method4134(int arg0, byte arg1) {
        field10209++;
        Object var3 = this.field10207.method3109((byte) 118, (long) arg0);
        if (arg1 != 72) {
            this.method4136(76);
        }
        if (var3 != null) {
            return (class678) var3;
        } else if (this.field10205.method1112(29302, arg0)) {
            class577 var4 = this.field10205.method1114(arg0, -119);
            int var5 = var4.field7853 ? 64 : this.field10204.field9551;
            class678 var7;
            if (var4.field7872 && this.field10204.method472()) {
                float[] var6 = this.field10205.method1110(false, 0.7F, var5, arg0, var5, arg1 + 77);
                var7 = this.field10204.method3917(var5, var4.field7874 != 0, arg1 - 72, class109.field1521, var5, var6);
            } else {
                int[] var8;
                if (var4.field7860 != 2 && class107.method806((byte) 93, var4.field7855)) {
                    var8 = this.field10205.method1113(-127, var5, var5, true, arg0, 0.7F);
                } else {
                    var8 = this.field10205.method1111(-127, 0.7F, var5, arg0, var5, false);
                }
                var7 = this.field10204.method3856(false, var5, var5, var8, var4.field7874 != 0);
            }
            var7.method622(true, var4.field7873, var4.field7858);
            this.field10207.method3108((long) arg0, arg1 ^ 0x3F99, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V", line = 68)
    public static void method4135(int arg0) {
        if (arg0 != 64) {
            field10206 = null;
        }
        field10206 = null;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V", line = 78)
    public final void method4136(int arg0) {
        field10202++;
        this.field10207.method3101(false, arg0);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lee;Ld;)V", line = 91)
    public class754(class703 arg0, class161 arg1) {
        this.field10204 = arg0;
        this.field10205 = arg1;
    }
}
