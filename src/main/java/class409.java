import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class409 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lbj;")
    private class131 field5798 = new class131(256);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lja;")
    private class152 field5796;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Ltb;")
    private class227 field5797;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 4)
    public final void method2562(int arg0) {
        this.field5798.method905((byte) 77);
        if (arg0 > -101) {
            this.method2563(117, -121);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)Lim;", line = 16)
    public final class342 method2563(int arg0, int arg1) {
        if (arg0 != 34842) {
            return (class342) null;
        }
        Object var3 = this.field5798.method904(false, (long) arg1);
        if (var3 != null) {
            return (class342) var3;
        } else if (this.field5796.method473(arg1, 116)) {
            class454 var4 = this.field5796.method469(arg1, (byte) -93);
            int var5 = var4.field6488 ? 64 : 128;
            class342 var7;
            if (var4.field6483 && this.field5797.method141()) {
                float[] var6 = this.field5796.method474(false, 10682, var5, arg1, var5, 0.7F);
                var7 = new class342(this.field5797, 3553, 34842, var5, var5, var4.field6486 != 0, var6, 6408);
            } else {
                int[] var8 = this.field5796.method468(var5, 0.7F, -24250, var5, arg1, false);
                short var9 = 6408;
                var7 = new class342(this.field5797, 3553, var9, var5, var5, var4.field6486 != 0, var8, false);
            }
            var7.method2174(var4.field6472, var4.field6494);
            this.field5798.method902((long) arg1, (byte) 112, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ltb;Lja;)V", line = 63)
    public class409(class227 arg0, class152 arg1) {
        this.field5796 = arg1;
        this.field5797 = arg0;
    }
}
