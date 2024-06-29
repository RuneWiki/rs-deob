import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class592 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lpca;")
    private class653 field8417 = new class653(64);

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljo;")
    private class303 field8419;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lbq;")
    public static class261 field8416 = new class261(8);

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lkfa;")
    public static class549 field8421 = new class549(75, -1);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "F")
    public static float field8418;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 10)
    public static void method3320(byte arg0) {
        field8421 = null;
        int var1 = 56 / ((-arg0 - 29) / 55);
        field8416 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Ldfa;", line = 20)
    public final class151 method3321(int arg0, int arg1) {
        field8420++;
        class653 var3 = this.field8417;
        class151 var4;
        synchronized (this.field8417) {
            var4 = (class151) this.field8417.method3690((byte) 123, (long) arg0);
        }
        int var5 = 76 / ((27 - arg1) / 45);
        if (var4 != null) {
            return var4;
        }
        class303 var6 = this.field8419;
        byte[] var7;
        synchronized (this.field8419) {
            var7 = this.field8419.method1719(arg0, 5, 4);
        }
        class151 var8 = new class151();
        if (var7 != null) {
            var8.method832(new class452(var7), (byte) 84);
        }
        class653 var9 = this.field8417;
        synchronized (this.field8417) {
            this.field8417.method3683(var8, (byte) -52, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 56)
    public class592(class207 arg0, int arg1, class303 arg2) {
        this.field8419 = arg2;
        this.field8419.method1727(-77, 5);
    }
}
