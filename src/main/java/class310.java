import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class310 {

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lmq;")
    private class472 field4095 = new class472(256);

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ljn;")
    private class668 field4098;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lwo;")
    public static class690 field4094 = new class690(112, -2);

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lmq;")
    public static class472 field4100 = new class472(50);

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4102 = new String[200];

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Ljk;")
    public static class585 field4101 = new class585(75, 2);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4103;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[[I")
    public static int[][] field4099;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 7)
    public static void method1820(int arg0) {
        field4101 = null;
        field4100 = null;
        field4103 = null;
        if (arg0 < -42) {
            field4099 = null;
            field4102 = null;
            field4094 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 22)
    public final void method1821(int arg0) {
        field4092++;
        class472 var2 = this.field4095;
        synchronized (this.field4095) {
            this.field4095.method2776(false);
        }
        if (arg0 <= 76) {
            field4100 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Lud;", line = 36)
    public final class33 method1822(int arg0, boolean arg1) {
        field4093++;
        class472 var3 = this.field4095;
        class33 var4;
        synchronized (this.field4095) {
            var4 = (class33) this.field4095.method2766(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field4098;
        byte[] var6;
        synchronized (this.field4098) {
            var6 = this.field4098.method3800(arg0, 26, (byte) -92);
        }
        class33 var7 = new class33();
        if (var6 != null) {
            var7.method408((byte) -59, new class389(var6));
        }
        class472 var8 = this.field4095;
        synchronized (this.field4095) {
            this.field4095.method2772(var7, arg1, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V", line = 68)
    public final void method1823(int arg0) {
        field4096++;
        class472 var2 = this.field4095;
        synchronized (this.field4095) {
            this.field4095.method2778((byte) 104);
        }
        if (arg0 != 26125) {
            this.method1823(89);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 105)
    public class310(class90 arg0, int arg1, class668 arg2) {
        this.field4098 = arg2;
        this.field4098.method3805(26, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V", line = 89)
    public final void method1824(int arg0, int arg1) {
        class472 var3 = this.field4095;
        synchronized (this.field4095) {
            if (arg0 != 3157) {
                return;
            }
            this.field4095.method2777(arg1, 47);
        }
        field4097++;
    }
}
