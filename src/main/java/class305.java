import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class305 {

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Loo;")
    private class652 field4392 = new class652(64);

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lwia;")
    private class791 field4389;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4395 = new String[100];

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "Ljo;")
    public static class353 field4394 = new class353(16);

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Lji;")
    public static class635 field4396;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Lwia;")
    public static class791 field4397;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
    public static final int method1974(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            field4394 = null;
        }
        field4393++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class305(class252 arg0, int arg1, class791 arg2) {
        this.field4389 = arg2;
        this.field4389.method4353(5, true);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lnb;")
    public final class317 method1975(byte arg0, int arg1) {
        field4390++;
        if (arg0 != 6) {
            this.field4392 = null;
        }
        class652 var3 = this.field4392;
        class317 var4;
        synchronized (this.field4392) {
            var4 = (class317) this.field4392.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field4389;
        byte[] var6;
        synchronized (this.field4389) {
            var6 = this.field4389.method4339(arg1, 0, 5);
        }
        class317 var7 = new class317();
        if (var6 != null) {
            var7.method2059(new class494(var6), -1);
        }
        class652 var8 = this.field4392;
        synchronized (this.field4392) {
            this.field4392.method3739((long) arg1, (byte) 62, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method1976(int arg0) {
        field4396 = null;
        field4395 = null;
        if (arg0 == 5) {
            field4394 = null;
            field4397 = null;
        }
    }
}
