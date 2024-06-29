import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class461 {

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lgg;")
    public class114 field6644 = new class114(20);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lgg;")
    private class114 field6646 = new class114(64);

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lkha;")
    public class687 field6642;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lkha;")
    private class687 field6635;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
    public static int[] field6643 = new int[1000];

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljs;")
    public static class281 field6637;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lwr;")
    public static class90 field6639;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field6641;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public final void method2712(byte arg0) {
        field6636++;
        class114 var2 = this.field6646;
        synchronized (this.field6646) {
            this.field6646.method776((byte) -36);
            if (arg0 > -116) {
                this.field6635 = null;
            }
        }
        class114 var3 = this.field6644;
        synchronized (this.field6644) {
            this.field6644.method776((byte) -30);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public final void method2713(int arg0, int arg1) {
        if (arg0 != 1000) {
            return;
        }
        class114 var3 = this.field6646;
        synchronized (this.field6646) {
            this.field6646.method775(1, arg1);
        }
        field6638++;
        class114 var4 = this.field6644;
        synchronized (this.field6644) {
            this.field6644.method775(1, arg1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Lsd;")
    public final class282 method2714(int arg0, int arg1) {
        field6645++;
        class114 var3 = this.field6646;
        class282 var4;
        synchronized (this.field6646) {
            var4 = (class282) this.field6646.method778((long) arg1, -98);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field6635;
        byte[] var6;
        synchronized (this.field6635) {
            var6 = this.field6635.method3810(arg0, -23360, arg1);
        }
        class282 var7 = new class282();
        var7.field3577 = this;
        if (var6 != null) {
            var7.method1688(new class179(var6), -18431);
        }
        class114 var8 = this.field6646;
        synchronized (this.field6646) {
            this.field6646.method774((long) arg1, arg0 + 70, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method2715(int arg0) {
        field6639 = null;
        field6643 = null;
        field6641 = null;
        if (arg0 >= -91) {
            method2715(26);
        }
        field6637 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public final void method2716(byte arg0) {
        field6640++;
        class114 var2 = this.field6646;
        synchronized (this.field6646) {
            this.field6646.method781((byte) 47);
        }
        class114 var3 = this.field6644;
        synchronized (this.field6644) {
            if (arg0 != -15) {
                this.method2712((byte) 84);
            }
            this.field6644.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;)V")
    public class461(class286 arg0, int arg1, class687 arg2, class687 arg3) {
        this.field6642 = arg3;
        this.field6635 = arg2;
        this.field6635.method3812(0, 46);
    }
}
