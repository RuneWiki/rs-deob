import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class145 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lpa;")
    private class387 field1846 = new class387(64);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lcb;")
    private class544 field1850;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1843 = class305.method2009(1600, (byte) 63);

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[I")
    public static int[] field1854 = new int[2];

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lcb;")
    public static class544 field1851;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lmfa;")
    public static class640 field1852;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
    public static int[] field1853;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Llj;", line = 3)
    public final class632 method994(int arg0, int arg1) {
        field1848++;
        class387 var3 = this.field1846;
        class632 var4;
        synchronized (this.field1846) {
            var4 = (class632) this.field1846.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field1850;
        byte[] var6;
        synchronized (this.field1850) {
            var6 = this.field1850.method3150(arg0, -127, arg1);
        }
        class632 var7 = new class632();
        if (var6 != null) {
            var7.method3610(new class120(var6), (byte) -63);
        }
        class387 var8 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2362(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 35)
    public final void method995(byte arg0) {
        class387 var2 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2369(-1);
        }
        if (arg0 >= 89) {
            field1847++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V", line = 55)
    public static final void method996(boolean arg0, int arg1) {
        class441.field6300 = arg1;
        if (!arg0) {
            return;
        }
        field1844++;
        class387 var2 = class204.field2986;
        synchronized (class204.field2986) {
            class204.field2986.method2364(1);
        }
        class387 var3 = class211.field3052;
        synchronized (class211.field3052) {
            class211.field3052.method2364(1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V", line = 72)
    public static final void method997() {
        class437.method2634(1, class456.field6545);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILwq;II)V", line = 80)
    public static final void method998(int arg0, class176 arg1, int arg2, int arg3) {
        int var4 = -20 % ((arg0 - 45) / 50);
        field1855++;
        class421.field5947 = arg1;
        class472.field6737 = arg2;
        class258.field3632 = arg3;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 109)
    public class145(class106 arg0, int arg1, class544 arg2) {
        this.field1850 = arg2;
        if (this.field1850 != null) {
            this.field1850.method3147(54, 64);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 97)
    public final void method999(int arg0) {
        field1849++;
        int var2 = -19 % ((41 - arg0) / 60);
        class387 var3 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2364(1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 129)
    public static void method1000(byte arg0) {
        field1853 = null;
        if (arg0 > 30) {
            field1852 = null;
            field1851 = null;
            field1854 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V", line = 143)
    public final void method1001(int arg0, boolean arg1) {
        class387 var3 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2366(arg0, 123);
        }
        if (!arg1) {
            method998(10, null, -3, 27);
        }
        field1845++;
    }
}
