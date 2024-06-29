import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class9 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Lmo;")
    private class336 field64 = new class336(64);

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Lnl;")
    private class435 field68;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Lch;")
    public static class151 field67 = new class151("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "[[Ljf;")
    public static class483[][] field71;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 4)
    public static void method48(int arg0) {
        field67 = null;
        field71 = null;
        int var1 = 34 / ((-arg0 - 31) / 35);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)Lpd;", line = 23)
    public final class397 method49(byte arg0, int arg1) {
        field69++;
        class336 var3 = this.field64;
        class397 var4;
        synchronized (this.field64) {
            var4 = (class397) this.field64.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field68.method2633(5, arg1, 106);
        class397 var6 = new class397();
        int var7 = 108 / ((arg0 - 41) / 37);
        if (var5 != null) {
            var6.method2390(new class161(var5), 0);
        }
        class336 var8 = this.field64;
        synchronized (this.field64) {
            this.field64.method2116((long) arg1, (byte) -25, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILjf;B)V", line = 51)
    public static final void method50(int arg0, int arg1, class483 arg2, byte arg3) {
        if (arg3 != 65) {
            method50(46, -91, (class483) null, (byte) -26);
        }
        field65++;
        field71[arg0][arg1] = arg2;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 75)
    public class9(class280 arg0, int arg1, class435 arg2) {
        this.field68 = arg2;
        this.field68.method2638(1, 5);
    }
}
