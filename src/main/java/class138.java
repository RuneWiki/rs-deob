import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class138 {

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lsw;")
    private class641 field1687 = new class641(64);

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Lsw;")
    private class641 field1688 = new class641(100);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Ldn;")
    private class438 field1679;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lvj;")
    public static class373 field1680 = new class373(56, 0);

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[[F")
    public static float[][] field1686 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lm;")
    public static class163 field1681;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public final void method765(int arg0) {
        class641 var2 = this.field1687;
        synchronized (this.field1687) {
            this.field1687.method3694(arg0);
        }
        field1684++;
        class641 var3 = this.field1688;
        synchronized (this.field1688) {
            this.field1688.method3694(arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lsba;")
    public final class183 method766(int arg0, int arg1) {
        field1683++;
        class641 var3 = this.field1688;
        class183 var4;
        synchronized (this.field1688) {
            var4 = (class183) this.field1688.method3682(arg1 ^ arg1, (long) arg0);
            if (var4 == null) {
                var4 = new class183(arg0);
                this.field1688.method3684(var4, 0, (long) arg0);
            }
        }
        synchronized (var4) {
            return var4.method1003(-19422) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)J")
    public static final long method767(byte arg0) {
        field1678++;
        if (arg0 != 69) {
            field1682 = 80;
        }
        return class611.field8871.method1772((byte) 127);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
    public final void method768(int arg0, boolean arg1) {
        field1685++;
        class641 var3 = this.field1687;
        synchronized (this.field1687) {
            this.field1687.method3686((byte) 53, arg0);
        }
        if (!arg1) {
            class641 var4 = this.field1688;
            synchronized (this.field1688) {
                this.field1688.method3686((byte) 53, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public final void method769(int arg0) {
        if (arg0 != 56) {
            return;
        }
        field1689++;
        class641 var2 = this.field1687;
        synchronized (this.field1687) {
            this.field1687.method3687(1402);
        }
        class641 var3 = this.field1688;
        synchronized (this.field1688) {
            this.field1688.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Llk;")
    public final class502 method770(int arg0, int arg1) {
        field1677++;
        class641 var3 = this.field1687;
        class502 var4;
        synchronized (this.field1687) {
            var4 = (class502) this.field1687.method3682(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field1679;
        byte[] var6;
        synchronized (this.field1679) {
            var6 = this.field1679.method2558(100, class286.method1609(127, arg0), class136.method758((byte) 111, arg0));
        }
        class502 var7 = new class502();
        var7.field6953 = this;
        var7.field6963 = arg0;
        if (arg1 > -48) {
            this.method766(14, -83);
        }
        if (var6 != null) {
            var7.method2902(new class374(var6), (byte) 115);
        }
        var7.method2895(-8453);
        class641 var8 = this.field1687;
        synchronized (this.field1687) {
            this.field1687.method3684(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static void method771(byte arg0) {
        if (arg0 >= -80) {
            field1686 = null;
        }
        field1686 = null;
        field1681 = null;
        field1680 = null;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lre;ILdn;Ldn;Ldn;)V")
    public class138(class515 arg0, int arg1, class438 arg2, class438 arg3, class438 arg4) {
        this.field1679 = arg2;
        if (this.field1679 != null) {
            int var6 = this.field1679.method2565((byte) 100) - 1;
            this.field1679.method2554(var6, 124);
        }
        class19.method125(arg4, arg3, 32);
    }
}
