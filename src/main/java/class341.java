import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class341 {

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Ltq;")
    private class536 field4185 = new class536(64);

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Lwm;")
    private class30 field4184;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field4177 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[Z")
    public static boolean[] field4181 = new boolean[200];

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field4183 = 0;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
    public final void method1976(int arg0, int arg1) {
        class536 var3 = this.field4185;
        synchronized (this.field4185) {
            this.field4185.method2928(true, arg1);
            if (arg0 != 200) {
                field4177 = 91;
            }
        }
        field4178++;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Lhaa;")
    public final class330 method1977(int arg0, int arg1) {
        field4179++;
        class536 var3 = this.field4185;
        class330 var4;
        synchronized (this.field4185) {
            var4 = (class330) this.field4185.method2931((long) arg0, (byte) -78);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field4184;
        byte[] var6;
        synchronized (this.field4184) {
            var6 = this.field4184.method139(arg1, (byte) -94, arg0);
        }
        class330 var7 = new class330();
        if (var6 != null) {
            var7.method1912(new class234(var6), true);
        }
        class536 var8 = this.field4185;
        synchronized (this.field4185) {
            this.field4185.method2918((long) arg0, var7, arg1 ^ 0x67);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static void method1978(byte arg0) {
        field4181 = null;
        int var1 = 91 % ((arg0 - 57) / 36);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    public final void method1979(byte arg0) {
        class536 var2 = this.field4185;
        synchronized (this.field4185) {
            this.field4185.method2932((byte) 80);
        }
        field4182++;
        if (arg0 != -99) {
            this.field4185 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public final void method1980(int arg0) {
        class536 var2 = this.field4185;
        synchronized (this.field4185) {
            this.field4185.method2919(arg0 ^ arg0);
        }
        field4180++;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class341(class473 arg0, int arg1, class30 arg2) {
        this.field4184 = arg2;
        this.field4184.method138(0, 31);
    }
}
