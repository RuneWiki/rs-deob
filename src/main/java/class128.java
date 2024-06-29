import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class128 {

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "Lfba;")
    private class348 field1767 = new class348(64);

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Lla;")
    private class423 field1770;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 3)
    public final void method903(int arg0) {
        class348 var2 = this.field1767;
        synchronized (this.field1767) {
            this.field1767.method2219(-5300);
        }
        if (arg0 == -3136) {
            field1766++;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Lvba;", line = 18)
    public final class732 method904(int arg0, int arg1) {
        field1769++;
        class348 var3 = this.field1767;
        class732 var4;
        synchronized (this.field1767) {
            var4 = (class732) this.field1767.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field1770;
        byte[] var6;
        synchronized (this.field1770) {
            var6 = this.field1770.method2600(0, arg1, arg0);
        }
        class732 var7 = new class732();
        if (var6 != null) {
            var7.method4076(896, new class479(var6));
        }
        class348 var8 = this.field1767;
        synchronized (this.field1767) {
            this.field1767.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V", line = 48)
    public final void method905(int arg0) {
        if (arg0 != 16) {
            return;
        }
        class348 var2 = this.field1767;
        synchronized (this.field1767) {
            this.field1767.method2220(false);
        }
        field1771++;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(II)V", line = 61)
    public final void method906(int arg0, int arg1) {
        class348 var3 = this.field1767;
        synchronized (this.field1767) {
            this.field1767.method2207(arg1, 1);
            int var4 = 58 % ((arg0 + 54) / 40);
        }
        field1772++;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 80)
    public class128(class315 arg0, int arg1, class423 arg2) {
        this.field1770 = arg2;
        if (this.field1770 == null) {
            this.field1768 = 0;
        } else {
            this.field1768 = this.field1770.method2616(16, 0);
        }
    }
}
