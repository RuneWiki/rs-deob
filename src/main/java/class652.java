import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class652 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Lhp;")
    private class277 field9392 = new class277(64);

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "Lkea;")
    private class203 field9395;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(CI)Z", line = 8)
    public static final boolean method3719(char arg0, int arg1) {
        field9397++;
        if (arg1 < 113) {
            return true;
        } else {
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Ldj;", line = 20)
    public static final class291 method3720(int arg0) {
        field9393++;
        return arg0 == -33 ? class182.field2250 : null;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V", line = 34)
    public static final void method3721(int arg0) {
        field9394++;
        class324.method2110(-23199);
        class453.method2798((byte) -127);
        if (arg0 != 5) {
            method3721(122);
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 53)
    public class652(class149 arg0, int arg1, class203 arg2) {
        this.field9395 = arg2;
        this.field9395.method1309(1675886592, 5);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)Lkda;", line = 68)
    public final class329 method3722(int arg0, int arg1) {
        field9396++;
        class277 var3 = this.field9392;
        class329 var4;
        synchronized (this.field9392) {
            var4 = (class329) this.field9392.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field9395;
        byte[] var6;
        synchronized (this.field9395) {
            var6 = this.field9395.method1286(arg0, arg1, (byte) -49);
        }
        class329 var7 = new class329();
        if (var6 != null) {
            var7.method2145(4, new class194(var6));
        }
        class277 var8 = this.field9392;
        synchronized (this.field9392) {
            this.field9392.method1808((long) arg0, var7, (byte) -90);
            return var7;
        }
    }
}
