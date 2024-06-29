import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class713 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lbh;")
    private class538 field10109 = new class538(16);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lwu;")
    private class557 field10105;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field10110 = 0;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lpaa;")
    public static class712 field10107 = null;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[I")
    public static int[] field10115 = new int[14];

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lbh;")
    public static class538 field10114 = new class538(4);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[I")
    public static int[] field10118;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static final void method4017(byte arg0) {
        class589.field8463 = null;
        class367.field4707 = null;
        if (arg0 != -104) {
            return;
        }
        class652.field9221 = null;
        class672.field9451 = null;
        class718.field10143 = null;
        class298.field3904 = null;
        field10117++;
        class625.field8929 = null;
        class639.field9081 = null;
        class677.field9539 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
    public static final void method4018(int arg0, int[] arg1, Object[] arg2) {
        field10111++;
        class469.method2791(arg1.length - 1, 0, arg1, 9116, arg2);
        int var3 = -35 % ((arg0 + 28) / 44);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method4019(int arg0) {
        if (arg0 == 0) {
            field10115 = null;
            field10118 = null;
            field10114 = null;
            field10107 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public final void method4020(byte arg0) {
        field10112++;
        int var2 = 122 % ((arg0 - 65) / 35);
        class538 var3 = this.field10109;
        synchronized (this.field10109) {
            this.field10109.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BI)[B")
    public static final byte[] method4021(int arg0, byte[] arg1, int arg2) {
        field10116++;
        byte[] var3 = new byte[arg2];
        class34.method245(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public final void method4022(byte arg0) {
        class538 var2 = this.field10109;
        synchronized (this.field10109) {
            if (arg0 != -60) {
                field10110 = -124;
            }
            this.field10109.method3210(false);
        }
        field10108++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Ljd;")
    public final class440 method4023(int arg0, int arg1) {
        field10106++;
        class538 var3 = this.field10109;
        class440 var4;
        synchronized (this.field10109) {
            var4 = (class440) this.field10109.method3200((long) arg0, -19983);
            if (arg1 != 0) {
                field10115 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field10105;
        byte[] var6;
        synchronized (this.field10105) {
            var6 = this.field10105.method3322(30, arg0, (byte) 124);
        }
        class440 var7 = new class440();
        if (var6 != null) {
            var7.method2632(-2, new class26(var6));
        }
        class538 var8 = this.field10109;
        synchronized (this.field10109) {
            this.field10109.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V")
    public final void method4024(int arg0, int arg1) {
        int var3 = 6 / ((-arg0 - 25) / 52);
        field10113++;
        class538 var4 = this.field10109;
        synchronized (this.field10109) {
            this.field10109.method3204((byte) 72, arg1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class713(class121 arg0, int arg1, class557 arg2) {
        this.field10105 = arg2;
        this.field10105.method3333(30, 3443);
    }
}
