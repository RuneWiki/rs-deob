import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class481 {

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "Lfba;")
    private class348 field6869 = new class348(256);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Ld;")
    private class267 field6867;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "Lkw;")
    private class346 field6873;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "[Lsl;")
    public static class479[] field6874 = new class479[2048];

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6868 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "Llc;")
    public static class435 field6876 = new class435(33, 3);

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field6878 = 0;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Lla;")
    public static class423 field6877;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 10)
    public static void method2930(int arg0) {
        field6877 = null;
        if (arg0 == 3817) {
            field6868 = null;
            field6876 = null;
            field6874 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 23)
    public static final String method2931(byte arg0, int arg1) {
        if (arg0 >= -84) {
            method2930(56);
        }
        field6872++;
        class394 var2 = (class394) class186.field2611.method4020((long) arg1, (byte) -79);
        if (var2 != null) {
            class332 var3 = var2.field5658.method3990(-51);
            if (var3 != null) {
                double var4 = var2.field5658.method3989(true);
                if (var4 >= (double) var3.method2043(-4335) && var4 <= (double) var3.method2042(-121)) {
                    return var3.method2039(3);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V", line = 58)
    public final void method2932(boolean arg0) {
        field6870++;
        this.field6869.method2207(5, 1);
        if (arg0) {
            field6877 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V", line = 69)
    public final void method2933(int arg0) {
        field6871++;
        this.field6869.method2220(false);
        int var2 = -14 % ((76 - arg0) / 44);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lkw;Ld;)V", line = 129)
    public class481(class346 arg0, class267 arg1) {
        this.field6867 = arg1;
        this.field6873 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lol;", line = 84)
    public final class246 method2934(int arg0, int arg1) {
        field6875++;
        Object var3 = this.field6869.method2216(arg0 ^ arg0, (long) arg1);
        if (var3 != null) {
            return (class246) var3;
        } else if (this.field6867.method963((byte) 41, arg1)) {
            class679 var4 = this.field6867.method962(arg1, 2904);
            int var5 = var4.field9636 ? 64 : this.field6873.field4965;
            class246 var7;
            if (var4.field9642 && this.field6873.method1242()) {
                float[] var6 = this.field6867.method961(arg1, false, 0.7F, var5, var5, (byte) 79);
                var7 = new class246(this.field6873, 3553, 34842, var5, var5, var4.field9634 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field9632 != 2 && class250.method1691((byte) -125, var4.field9648)) {
                    var8 = this.field6867.method964(-99, true, var5, arg1, var5, 0.7F);
                } else {
                    var8 = this.field6867.method966(var5, false, 0.7F, var5, false, arg1);
                }
                var7 = new class246(this.field6873, 3553, 6408, var5, var5, var4.field9634 != 0, var8, 0, 0, false);
            }
            var7.method1676(var4.field9641, var4.field9635, (byte) 33);
            this.field6869.method2213((byte) -16, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }
}
