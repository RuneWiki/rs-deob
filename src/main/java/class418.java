import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class418 {

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lgg;")
    private class114 field5949 = new class114(64);

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lkha;")
    public class687 field5951;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lkha;")
    private class687 field5947;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field5941 = 0;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Laca;")
    public static class580 field5950 = new class580();

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lsga;")
    public static class583 field5952 = new class583(512);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field5953 = 328;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field5954 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method2484(int arg0) {
        if (arg0 != 1) {
            this.field5951 = null;
        }
        field5945++;
        class114 var2 = this.field5949;
        synchronized (this.field5949) {
            this.field5949.method776((byte) 93);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lnu;")
    public final class438 method2485(int arg0, int arg1) {
        field5948++;
        class114 var3 = this.field5949;
        class438 var4;
        synchronized (this.field5949) {
            var4 = (class438) this.field5949.method778((long) arg1, arg0 ^ 0xFFFFFFD7);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 1) {
            this.method2490(false, 2);
        }
        class687 var5 = this.field5947;
        byte[] var6;
        synchronized (this.field5947) {
            var6 = this.field5947.method3810(3, arg0 ^ 0xFFFFA4C1, arg1);
        }
        class438 var7 = new class438();
        var7.field6156 = this;
        if (var6 != null) {
            var7.method2589(-32087, new class179(var6));
        }
        class114 var8 = this.field5949;
        synchronized (this.field5949) {
            this.field5949.method774((long) arg1, 81, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static void method2486(int arg0) {
        field5952 = null;
        field5950 = null;
        if (arg0 != 3) {
            field5953 = -29;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
    public static final void method2487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var10 = arg2 + 1;
        class284.method1709(class15.field220[arg2], arg5, -8251, arg1, arg3);
        field5944++;
        int var6 = -47 % ((79 - arg4) / 46);
        int var9 = arg0 - 1;
        class284.method1709(class15.field220[arg0], arg5, -8251, arg1, arg3);
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class15.field220[var7];
            var8[arg1] = var8[arg5] = arg3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final void method2488(byte arg0) {
        if (arg0 != 30) {
            this.method2485(-21, -78);
        }
        field5946++;
        class114 var2 = this.field5949;
        synchronized (this.field5949) {
            this.field5949.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lkha;IIIZII)V")
    public static final void method2489(class687 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class646.field8905 = arg4;
        class74.field991 = arg6;
        class55.field799 = null;
        class379.field5303 = arg0;
        field5942++;
        class714.field10062 = arg3;
        if (arg1 != -26500) {
            method2486(43);
        }
        class244.field3142 = 1;
        class98.field1225 = arg2;
        class130.field1562 = arg5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
    public final void method2490(boolean arg0, int arg1) {
        class114 var3 = this.field5949;
        synchronized (this.field5949) {
            this.field5949.method775(1, arg1);
        }
        if (arg0) {
            method2486(4);
        }
        field5943++;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;)V")
    public class418(class286 arg0, int arg1, class687 arg2, class687 arg3) {
        this.field5951 = arg3;
        this.field5947 = arg2;
        this.field5947.method3812(0, 3);
    }
}
