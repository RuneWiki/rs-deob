import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class61 {

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lfr;")
    private class231 field933 = new class231(64);

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Lqs;")
    private class496 field932;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "[I")
    public static int[] field926 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Lls;")
    public static class110 field928;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Lo;")
    public static class138 field925;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method403(int arg0) {
        field925 = null;
        field928 = null;
        field926 = null;
        if (arg0 != 7) {
            field925 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
    public final void method404(byte arg0, int arg1) {
        field927++;
        if (arg0 > -32) {
            field928 = null;
        }
        class231 var3 = this.field933;
        synchronized (this.field933) {
            this.field933.method1603((byte) -109, arg1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public final void method405(int arg0) {
        field929++;
        class231 var2 = this.field933;
        synchronized (this.field933) {
            this.field933.method1604(4);
            if (arg0 >= -37) {
                this.field932 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Lqi;")
    public final class469 method406(int arg0, int arg1) {
        field930++;
        class231 var3 = this.field933;
        class469 var4;
        synchronized (this.field933) {
            var4 = (class469) this.field933.method1593((byte) -25, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field932;
        byte[] var6;
        synchronized (this.field932) {
            var6 = this.field932.method2926(arg0, arg1 ^ 0xFFFFD92D, 31);
        }
        class469 var7 = new class469();
        if (var6 != null) {
            var7.method2785(new class23(var6), (byte) -97);
        }
        class231 var8 = this.field933;
        synchronized (this.field933) {
            this.field933.method1595(var7, (long) arg0, (byte) 78);
        }
        if (arg1 != 9869) {
            method403(8);
        }
        return var7;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
        field931++;
        class231 var2 = this.field933;
        synchronized (this.field933) {
            this.field933.method1598(89);
        }
        if (arg0) {
            this.method406(45, -120);
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class61(class535 arg0, int arg1, class496 arg2) {
        this.field932 = arg2;
        this.field932.method2940(31, -10511);
    }
}
