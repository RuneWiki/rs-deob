import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class614 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Ltja;")
    private class288 field8247 = new class288(64);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field8256 = 0;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lbt;")
    private class48 field8249;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field8252;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field8250 = null;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lhj;")
    public static class596 field8255 = new class596(97, -2);

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 5)
    public final void method3476(int arg0) {
        if (arg0 <= 6) {
            this.method3476(-69);
        }
        field8254++;
        class288 var2 = this.field8247;
        synchronized (this.field8247) {
            this.field8247.method1690(0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 22)
    public final void method3477(boolean arg0) {
        field8253++;
        class288 var2 = this.field8247;
        synchronized (this.field8247) {
            if (arg0) {
                field8250 = null;
            }
            this.field8247.method1687((byte) 61);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V", line = 37)
    public final void method3478(int arg0, int arg1) {
        if (arg1 != 4) {
            return;
        }
        field8251++;
        class288 var3 = this.field8247;
        synchronized (this.field8247) {
            this.field8247.method1694(arg0, -111);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)Lfw;", line = 50)
    public final class63 method3479(byte arg0, int arg1) {
        field8248++;
        class288 var3 = this.field8247;
        class63 var4;
        synchronized (this.field8247) {
            var4 = (class63) this.field8247.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field8249;
        byte[] var6;
        synchronized (this.field8249) {
            var6 = this.field8249.method437(4, (byte) -51, arg1);
        }
        class63 var7 = new class63();
        var7.field869 = this;
        if (arg0 != 81) {
            this.method3476(-60);
        }
        var7.field865 = arg1;
        if (var6 != null) {
            var7.method541((byte) 49, new class403(var6));
        }
        var7.method538(0);
        class288 var8 = this.field8247;
        synchronized (this.field8247) {
            this.field8247.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 91)
    public static void method3480(int arg0) {
        field8250 = null;
        if (arg0 == -2) {
            field8255 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 111)
    public class614(class441 arg0, int arg1, class48 arg2) {
        this.field8249 = arg2;
        this.field8252 = this.field8249.method431(4, 4);
    }
}
