import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class318 {

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "Ljr;")
    private class112 field4389 = new class112(64);

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "Lin;")
    private class91 field4385;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "[B")
    public static byte[] field4386 = new byte[2048];

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "Ljr;")
    public static class112 field4387 = new class112(30);

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field4392 = 0;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "Lwr;")
    public static class458 field4390;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V")
    public static void method2048(byte arg0) {
        field4387 = null;
        int var1 = -54 / ((arg0 - 77) / 37);
        field4390 = null;
        field4386 = null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Lpa;")
    public final class371 method2049(int arg0, int arg1) {
        field4388++;
        class112 var3 = this.field4389;
        class371 var4;
        synchronized (this.field4389) {
            var4 = (class371) this.field4389.method992((long) arg0, -51);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 44 % ((-arg1 - 41) / 33);
        class91 var6 = this.field4385;
        byte[] var7;
        synchronized (this.field4385) {
            var7 = this.field4385.method863(-1860, 19, arg0);
        }
        class371 var8 = new class371();
        if (var7 != null) {
            var8.method2361(new class215(var7), -1);
        }
        class112 var9 = this.field4389;
        synchronized (this.field4389) {
            this.field4389.method991(var8, (long) arg0, (byte) -120);
            return var8;
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class318(class460 arg0, int arg1, class91 arg2) {
        this.field4385 = arg2;
        this.field4391 = this.field4385.method860(0, 19);
    }
}
