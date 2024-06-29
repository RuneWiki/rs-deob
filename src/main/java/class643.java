import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class643 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lo;")
    private class29 field8971 = new class29();

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/lang/String;")
    public String field8976;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[Lul;")
    public static class573[] field8975 = new class573[50];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    private volatile int field8978;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lni;")
    public static class522 field8969;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lni;")
    public static class522 field8974;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Llk;")
    private class588 field8979;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 3)
    public static void method3633(byte arg0) {
        if (arg0 != 67) {
            field8969 = null;
        }
        field8969 = null;
        field8975 = null;
        field8974 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Lpha;", line = 17)
    public final class166 method3634(int arg0) {
        field8967++;
        Object var2 = null;
        class29 var3 = this.field8971;
        synchronized (this.field8971) {
            class166 var4 = this.field8971.method113((byte) 15);
            var4.method975((byte) 123);
            this.field8978--;
            if (arg0 != 0) {
                this.method3636((byte) 124, null);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llk;Z)V", line = 38)
    public final void method3635(class588 arg0, boolean arg1) {
        this.field8979 = arg0;
        if (arg1) {
            this.field8978 = -25;
        }
        field8972++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLgg;)V", line = 49)
    public final void method3636(byte arg0, class176 arg1) {
        field8973++;
        int var3 = 106 % ((arg0 + 71) / 50);
        arg1.field2164 = true;
        class29 var4 = this.field8971;
        synchronized (this.field8971) {
            this.field8971.method118(true, arg1);
            this.field8978++;
        }
        if (this.field8979 != null) {
            class588 var5 = this.field8979;
            synchronized (this.field8979) {
                this.field8979.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Z", line = 72)
    public final boolean method3637(int arg0) {
        if (arg0 < 113) {
            field8975 = null;
        }
        field8977++;
        return this.field8978 == 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lgg;I)V", line = 87)
    public final void method3638(class176 arg0, int arg1) {
        arg0.field2164 = false;
        field8968++;
        class29 var3 = this.field8971;
        synchronized (this.field8971) {
            this.field8971.method118(true, arg0);
            this.field8978++;
        }
        if (arg1 != 0) {
            this.method3637(22);
        }
        if (this.field8979 != null) {
            class588 var4 = this.field8979;
            synchronized (this.field8979) {
                this.field8979.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 136)
    public class643(String arg0) {
        this.field8976 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLqe;)V", line = 119)
    public final void method3639(boolean arg0, class468 arg1) {
        class29 var3 = this.field8971;
        synchronized (this.field8971) {
            this.field8971.method118(arg0, arg1);
            this.field8978++;
        }
        field8970++;
        if (this.field8979 != null) {
            class588 var4 = this.field8979;
            synchronized (this.field8979) {
                this.field8979.notify();
            }
        }
    }
}
