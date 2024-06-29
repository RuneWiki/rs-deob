import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Llh;")
    private class364 field523 = new class364(128);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lhh;")
    private class84 field524;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "[I")
    public static int[] field527 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Lhh;")
    public static class84 field526;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
    public final void method266(int arg0, int arg1) {
        class364 var3 = this.field523;
        synchronized (this.field523) {
            this.field523.method2348(arg0, -128);
            if (arg1 != 128) {
                this.method267(true, 20);
            }
        }
        field525++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)Lmh;")
    public final class443 method267(boolean arg0, int arg1) {
        field528++;
        class364 var3 = this.field523;
        class443 var4;
        synchronized (this.field523) {
            var4 = (class443) this.field523.method2339(-124, (long) arg1);
        }
        if (!arg0) {
            this.method266(-56, 80);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field524.method683(1, arg1, 5);
        class443 var6 = new class443();
        if (var5 != null) {
            var6.method2693(new class303(var5), 15423);
        }
        class364 var7 = this.field523;
        synchronized (this.field523) {
            this.field523.method2342((long) arg1, var6, -64);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static void method268(boolean arg0) {
        if (!arg0) {
            field527 = null;
            field526 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public final void method269(byte arg0) {
        field530++;
        class364 var2 = this.field523;
        synchronized (this.field523) {
            this.field523.method2349(0);
            int var3 = 104 / ((-arg0 - 17) / 50);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class34(class271 arg0, int arg1, class84 arg2) {
        this.field524 = arg2;
        this.field524.method656((byte) 122, 1);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public final void method270(byte arg0) {
        class364 var2 = this.field523;
        synchronized (this.field523) {
            this.field523.method2350((byte) 112);
        }
        int var3 = 2 / ((arg0 + 34) / 41);
        field529++;
    }
}
