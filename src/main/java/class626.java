import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class626 implements class100 {

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Lwu;")
    private class557 field8942;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Lwu;")
    private class557 field8936;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Log;")
    private class548 field8933;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lvfa;")
    public static class92 field8940 = new class92();

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Lmha;")
    public static class701 field8941 = new class701(4, 1, 1, 1);

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Z")
    public static volatile boolean field8944 = false;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "F")
    public static float field8943;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lda;")
    private class400 field8939;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method680(int arg0) {
        field8937++;
        boolean var2 = true;
        if (!this.field8936.method3340(arg0 ^ arg0, this.field8933.field7733)) {
            var2 = false;
        }
        if (!this.field8942.method3340(0, this.field8933.field7733)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 22)
    public final void method682(byte arg0) {
        field8935++;
        if (arg0 <= 29) {
            this.method682((byte) 87);
        }
        class742 var2 = class216.method1415(this.field8942, (byte) 104, this.field8933.field7733);
        this.field8939 = class96.field1401.method2085(var2, class320.method1869(this.field8936, this.field8933.field7733), true);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 37)
    public static void method3657(byte arg0) {
        if (arg0 != -99) {
            field8941 = null;
        }
        field8940 = null;
        field8941 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZZ)V", line = 53)
    public final void method681(boolean arg0, boolean arg1) {
        field8938++;
        if (arg1) {
            int var3 = this.field8933.field7729.method554(class95.field1381, (byte) -9, this.field8933.field7723) + this.field8933.field7721;
            int var4 = this.field8933.field7725.method2838(this.field8933.field7718, class631.field8989, true) + this.field8933.field7722;
            this.field8939.method2423(null, this.field8933.field7732, (byte) -113, var3, this.field8933.field7720, this.field8933.field7731, 0, this.field8933.field7727, null, 0, this.field8933.field7724, var4, this.field8933.field7719, null, this.field8933.field7723, this.field8933.field7718);
        }
        if (!arg0) {
            this.field8936 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lwu;Lwu;Log;)V", line = 84)
    public class626(class557 arg0, class557 arg1, class548 arg2) {
        this.field8942 = arg1;
        this.field8936 = arg0;
        this.field8933 = arg2;
    }
}
