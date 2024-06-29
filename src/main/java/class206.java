import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class206 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lbh;")
    private class538 field2940 = new class538(64);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lwu;")
    private class557 field2943;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[[B")
    public static byte[][] field2944 = new byte[50][];

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method1373(byte arg0) {
        field2944 = null;
        if (arg0 < 6) {
            field2944 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lbca;")
    public final class470 method1374(int arg0, int arg1) {
        field2941++;
        class538 var3 = this.field2940;
        class470 var4;
        synchronized (this.field2940) {
            var4 = (class470) this.field2940.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field2943;
        byte[] var6;
        synchronized (this.field2943) {
            var6 = this.field2943.method3322(5, arg0, (byte) 97);
            if (arg1 <= 56) {
                this.method1374(69, -38);
            }
        }
        class470 var7 = new class470();
        if (var6 != null) {
            var7.method2798((byte) 112, new class26(var6));
        }
        class538 var8 = this.field2940;
        synchronized (this.field2940) {
            this.field2940.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class206(class121 arg0, int arg1, class557 arg2) {
        this.field2943 = arg2;
        this.field2943.method3333(5, 3443);
    }
}
