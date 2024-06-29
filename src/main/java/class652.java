import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class652 {

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "Lfca;")
    private class139 field9205 = new class139();

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "Ljava/lang/String;")
    public String field9206;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "Lmv;")
    public static class688 field9201 = new class688();

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "F")
    public static float field9207;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    private volatile int field9208;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "Lwda;")
    private class251 field9209;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Llo;B)V")
    public final void method3656(class488 arg0, byte arg1) {
        arg0.field6457 = true;
        field9204++;
        class139 var3 = this.field9205;
        synchronized (this.field9205) {
            this.field9205.method801(arg0, 78);
            if (arg1 != 87) {
                return;
            }
            this.field9208++;
        }
        if (this.field9209 != null) {
            class251 var4 = this.field9209;
            synchronized (this.field9209) {
                this.field9209.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLlo;)V")
    public final void method3657(boolean arg0, class488 arg1) {
        field9198++;
        arg1.field6457 = false;
        class139 var3 = this.field9205;
        synchronized (this.field9205) {
            this.field9205.method801(arg1, 41);
            this.field9208++;
        }
        if (this.field9209 != null) {
            class251 var4 = this.field9209;
            synchronized (this.field9209) {
                this.field9209.notify();
            }
        }
        if (!arg0) {
            this.field9208 = -81;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public static void method3658(int arg0) {
        if (arg0 == 25860) {
            field9201 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Lfga;")
    public final class569 method3659(int arg0) {
        int var2 = -113 / ((38 - arg0) / 40);
        field9203++;
        Object var3 = null;
        class139 var4 = this.field9205;
        synchronized (this.field9205) {
            class569 var5 = this.field9205.method802((byte) 94);
            var5.method3146(2);
            this.field9208--;
            return var5;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLwu;)V")
    public final void method3660(byte arg0, class545 arg1) {
        field9200++;
        class139 var3 = this.field9205;
        synchronized (this.field9205) {
            this.field9205.method801(arg1, 62);
            this.field9208++;
        }
        if (arg0 != -32) {
            this.method3659(-8);
        }
        if (this.field9209 != null) {
            class251 var4 = this.field9209;
            synchronized (this.field9209) {
                this.field9209.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILwda;)V")
    public final void method3661(int arg0, class251 arg1) {
        this.field9209 = arg1;
        field9199++;
        if (arg0 >= -66) {
            this.method3659(-19);
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)Z")
    public final boolean method3662(int arg0) {
        int var2 = -105 % ((-arg0 - 39) / 59);
        field9202++;
        return this.field9208 == 0;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class652(String arg0) {
        this.field9206 = arg0;
    }
}
