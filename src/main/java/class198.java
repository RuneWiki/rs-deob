import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class198 {

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lqj;")
    private class535 field2566 = new class535(64);

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "Luq;")
    public class172 field2567;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Luq;")
    private class172 field2560;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    public static int field2568 = 2;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "[I")
    public static int[] field2563 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lmw;")
    public static class517 field2562 = new class517(47, 12);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lec;")
    public static class248 field2565;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 5)
    public final void method1293(int arg0) {
        field2558++;
        class535 var2 = this.field2566;
        synchronized (this.field2566) {
            this.field2566.method3103(arg0 - 11295);
        }
        if (arg0 != 1) {
            this.method1293(27);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)Lca;", line = 19)
    public final class322 method1294(int arg0, int arg1) {
        field2559++;
        class535 var3 = this.field2566;
        class322 var4;
        synchronized (this.field2566) {
            var4 = (class322) this.field2566.method3109((byte) 119, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field2560;
        byte[] var6;
        synchronized (this.field2560) {
            var6 = this.field2560.method1188(3, -18047, arg1);
        }
        class322 var7 = new class322();
        var7.field4568 = this;
        if (var6 != null) {
            var7.method2085((byte) 54, new class254(var6));
        }
        class535 var8 = this.field2566;
        synchronized (this.field2566) {
            this.field2566.method3108((long) arg1, 16337, var7);
        }
        if (arg0 != 23707) {
            this.method1294(-24, -82);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lkw;ILuq;Luq;)V", line = 85)
    public class198(class263 arg0, int arg1, class172 arg2, class172 arg3) {
        this.field2567 = arg3;
        this.field2560 = arg2;
        this.field2560.method1175(3, (byte) 127);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V", line = 76)
    public final void method1295(boolean arg0, int arg1) {
        class535 var3 = this.field2566;
        synchronized (this.field2566) {
            this.field2566.method3101(arg0, arg1);
        }
        field2561++;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 101)
    public static void method1296(int arg0) {
        field2565 = null;
        if (arg0 <= 108) {
            field2562 = null;
        }
        field2563 = null;
        field2562 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V", line = 113)
    public final void method1297(int arg0) {
        field2564++;
        class535 var2 = this.field2566;
        synchronized (this.field2566) {
            this.field2566.method3113(arg0 ^ 0x5846);
            if (arg0 != -22585) {
                this.method1295(true, 4);
            }
        }
    }
}
