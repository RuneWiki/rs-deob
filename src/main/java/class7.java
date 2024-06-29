import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class7 {

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Laf;")
    private class39 field42 = new class39(64);

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Lae;")
    private class283 field43;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "[Lnr;")
    public static class22[] field40 = new class22[50];

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Lha;")
    public static class473 field41;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public static void method17(byte arg0) {
        field41 = null;
        field40 = null;
        if (arg0 < 41) {
            field41 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Lki;")
    public final class403 method18(int arg0, int arg1) {
        field39++;
        class39 var3 = this.field42;
        class403 var4;
        synchronized (this.field42) {
            var4 = (class403) this.field42.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == 64) {
            class283 var5 = this.field43;
            byte[] var6;
            synchronized (this.field43) {
                var6 = this.field43.method1849(arg1, (byte) -112, 19);
            }
            class403 var7 = new class403();
            if (var6 != null) {
                var7.method2470(new class511(var6), -1);
            }
            class39 var8 = this.field42;
            synchronized (this.field42) {
                this.field42.method305(var7, (long) arg1, 18320);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class7(class788 arg0, int arg1, class283 arg2) {
        this.field43 = arg2;
        this.field44 = this.field43.method1867(19, (byte) 49);
    }
}
