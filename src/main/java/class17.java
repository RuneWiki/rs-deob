import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class17 {

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lgg;")
    private class114 field239 = new class114(64);

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Lgg;")
    public class114 field241 = new class114(2);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lkha;")
    public class687 field229;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lkha;")
    private class687 field234;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    public static int[] field232 = new int[14];

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field238 = new String[200];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lmq;")
    public static class78 field227 = new class78(106, 6);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method204(int arg0) {
        field228++;
        class114 var2 = this.field239;
        synchronized (this.field239) {
            this.field239.method781((byte) 47);
        }
        class114 var3 = this.field241;
        synchronized (this.field241) {
            if (arg0 >= -36) {
                method208(true);
            }
            this.field241.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Ltaa;")
    public final class147 method205(int arg0, int arg1) {
        if (arg0 != 18592) {
            method208(false);
        }
        field236++;
        class114 var3 = this.field239;
        class147 var4;
        synchronized (this.field239) {
            var4 = (class147) this.field239.method778((long) arg1, arg0 - 18676);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field234;
        byte[] var6;
        synchronized (this.field234) {
            var6 = this.field234.method3810(33, -23360, arg1);
        }
        class147 var7 = new class147();
        var7.field1784 = this;
        if (var6 != null) {
            var7.method921((byte) 61, new class179(var6));
        }
        class114 var8 = this.field239;
        synchronized (this.field239) {
            this.field239.method774((long) arg1, 100, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method206(byte arg0) {
        class168.field2216 = new class653(8);
        field237++;
        class541.field7619 = 0;
        for (class428 var1 = (class428) class173.field2264.method1839(arg0 - 191); var1 != null; var1 = (class428) class173.field2264.method1836((byte) -26)) {
            var1.method2543();
        }
        if (arg0 != 70) {
            method208(true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public final void method207(boolean arg0) {
        if (!arg0) {
            field227 = null;
        }
        class114 var2 = this.field239;
        synchronized (this.field239) {
            this.field239.method776((byte) -68);
        }
        field233++;
        class114 var3 = this.field241;
        synchronized (this.field241) {
            this.field241.method776((byte) -110);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static void method208(boolean arg0) {
        if (arg0) {
            field238 = null;
            field227 = null;
            field232 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public final void method209(int arg0, boolean arg1) {
        field231++;
        if (!arg1) {
            method210(-44);
        }
        class114 var3 = this.field239;
        synchronized (this.field239) {
            this.field239.method775(1, arg0);
        }
        class114 var4 = this.field241;
        synchronized (this.field241) {
            this.field241.method775(1, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
    public static final int method210(int arg0) {
        field240++;
        return arg0 == 16 ? 16 : -91;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;)V")
    public class17(class286 arg0, int arg1, class687 arg2, class687 arg3) {
        this.field229 = arg3;
        this.field234 = arg2;
        this.field234.method3812(0, 33);
    }
}
