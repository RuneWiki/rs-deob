import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class236 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Lsw;")
    private class641 field2888 = new class641(64);

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Ldn;")
    private class438 field2890;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "[I")
    public static int[] field2886 = new int[25];

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ljr;")
    public static class92 field2889 = new class92("", 13);

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
    public static boolean field2894 = false;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ldn;")
    public static class438 field2895;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method1338(int arg0, byte arg1) {
        field2892++;
        class557 var2 = class93.method564(12, -14073, arg0);
        var2.method3264(-1037624096);
        if (arg1 <= 123) {
            field2895 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLdn;Ljava/lang/String;Z)Loh;", line = 19)
    public static final class342 method1339(byte arg0, class438 arg1, String arg2, boolean arg3) {
        field2896++;
        int var4 = arg1.method2579(arg0 ^ 0x51, arg2);
        if (var4 == -1) {
            return new class342(0);
        }
        int[] var5 = arg1.method2559(var4, (byte) -56);
        if (arg0 != -82) {
            field2889 = null;
        }
        class342 var6 = new class342(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field4406) {
                class374 var9 = new class374(arg1.method2558(100, var5[var8++], var4));
                int var10 = var9.method2123(false);
                int var11 = var9.method2136(false);
                int var12 = var9.method2129(-90);
                if (!arg3 && var12 == 1) {
                    var6.field4406--;
                } else {
                    var6.field4403[var7] = var10;
                    var6.field4404[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 69)
    public static void method1340(byte arg0) {
        if (arg0 != -114) {
            field2894 = true;
        }
        field2889 = null;
        field2895 = null;
        field2886 = null;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IB)Lrh;", line = 85)
    public final class222 method1341(int arg0, byte arg1) {
        field2891++;
        class641 var3 = this.field2888;
        class222 var4;
        synchronized (this.field2888) {
            var4 = (class222) this.field2888.method3682(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field2890;
        byte[] var6;
        synchronized (this.field2890) {
            var6 = this.field2890.method2558(100, arg0, 19);
        }
        class222 var7 = new class222();
        if (var6 != null) {
            var7.method1278(new class374(var6), (byte) -124);
        }
        class641 var8 = this.field2888;
        synchronized (this.field2888) {
            if (arg1 != -1) {
                field2895 = null;
            }
            this.field2888.method3684(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 126)
    public class236(class515 arg0, int arg1, class438 arg2) {
        this.field2890 = arg2;
        this.field2887 = this.field2890.method2554(19, 125);
    }
}
