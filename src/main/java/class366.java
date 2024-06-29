import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class366 {

    @OriginalMember(owner = "client!ija", name = "g", descriptor = "Ljda;")
    private class239 field5332 = new class239(64);

    @OriginalMember(owner = "client!ija", name = "e", descriptor = "Laj;")
    private class333 field5330;

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "F")
    public static float field5327;

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ija", name = "d", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "Laj;")
    public static class333 field5326;

    @OriginalMember(owner = "client!ija", name = "f", descriptor = "[I")
    public static int[] field5331;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(BI)Lep;", line = 5)
    public final class445 method2290(byte arg0, int arg1) {
        field5329++;
        class239 var3 = this.field5332;
        class445 var4;
        synchronized (this.field5332) {
            var4 = (class445) this.field5332.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field5330;
        byte[] var6;
        synchronized (this.field5330) {
            var6 = this.field5330.method2095(arg1, 5, 1);
        }
        class445 var7 = new class445();
        if (arg0 < 99) {
            return null;
        }
        if (var6 != null) {
            var7.method2668(0, new class376(var6));
        }
        class239 var8 = this.field5332;
        synchronized (this.field5332) {
            this.field5332.method1544(true, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V", line = 40)
    public static void method2291(int arg0) {
        if (arg0 != -31235) {
            field5328 = -76;
        }
        field5331 = null;
        field5326 = null;
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 59)
    public class366(class285 arg0, int arg1, class333 arg2) {
        this.field5330 = arg2;
        this.field5330.method2090(5, false);
    }
}
