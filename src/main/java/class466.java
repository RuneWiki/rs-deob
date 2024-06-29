import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class466 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ltja;")
    private class288 field6522 = new class288(64);

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lbt;")
    private class48 field6521;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field6524;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Loh;")
    public static class425 field6516 = new class425("", 18);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lbq;")
    public static class307 field6523;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lbt;")
    public static class48 field6519;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2793(String arg0, int arg1, int arg2) {
        int var3 = 17 / ((-arg1 - 33) / 38);
        field6517++;
        class770.field10589++;
        class336 var4 = class512.method3076(class307.field3780, class591.field8030, (byte) 93);
        var4.field4150.method2353(60, class615.method3482(arg0, 1) + 1);
        var4.field4150.method2388(255, arg0);
        var4.field4150.method2353(-76, arg2);
        class578.method3334(4, var4);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2794(int arg0) {
        field6516 = null;
        field6523 = null;
        field6519 = null;
        if (arg0 != 15135) {
            field6519 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lbi;")
    public final class507 method2795(int arg0, int arg1) {
        field6518++;
        class288 var3 = this.field6522;
        class507 var4;
        synchronized (this.field6522) {
            var4 = (class507) this.field6522.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field6521;
        byte[] var6;
        synchronized (this.field6521) {
            var6 = this.field6521.method437(19, (byte) -38, arg1);
            if (arg0 <= 120) {
                method2793(null, 8, -16);
            }
        }
        class507 var7 = new class507();
        if (var6 != null) {
            var7.method3040(new class403(var6), -1);
        }
        class288 var8 = this.field6522;
        synchronized (this.field6522) {
            this.field6522.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class466(class441 arg0, int arg1, class48 arg2) {
        this.field6521 = arg2;
        this.field6524 = this.field6521.method431(4, 19);
    }
}
