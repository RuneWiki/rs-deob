import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class25 {

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "Llea;")
    private class573 field275;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "J")
    public long field277;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "[[Ljava/lang/String;")
    public static String[][] field276 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field274 = -1;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
    public static void method220(byte arg0) {
        field276 = null;
        if (arg0 != 33) {
            field274 = 64;
        }
    }

    @OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field272++;
        this.field275.method3328(this.field277, (byte) 35);
        super.finalize();
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Llea;J[Lck;)V")
    public class25(class573 arg0, long arg1, class235[] arg2) {
        this.field275 = arg0;
        this.field277 = arg1;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)Lqw;")
    public static final class623 method221(int arg0, int arg1) {
        field273++;
        class623 var2 = (class623) class169.field2563.method2882((long) arg1, (byte) -122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class210.field3082.method3019(0, arg1, 105);
        class623 var4 = new class623();
        if (var3 != null) {
            var4.method3563((byte) 127, new class431(var3));
        }
        var4.method3566(66);
        int var5 = -114 % ((arg0 - 33) / 61);
        class169.field2563.method2890(-7307, (long) arg1, var4);
        return var4;
    }
}
