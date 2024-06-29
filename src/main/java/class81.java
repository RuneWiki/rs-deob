import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class81 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Laj;")
    private class287 field1585 = new class287(64);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lom;")
    private class344 field1587;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lja;")
    public static class254 field1586 = new class254(10, 2, 2, 0);

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lhga;")
    public static class158 field1588 = new class158();

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lf;")
    public static class702 field1590;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[[B")
    public static byte[][] field1589;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method831(String arg0, byte arg1) {
        field1584++;
        if (arg1 != 116) {
            method832((byte) -58);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method832(byte arg0) {
        field1588 = null;
        if (arg0 == 62) {
            field1589 = null;
            field1586 = null;
            field1590 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lbea;")
    public final class205 method833(int arg0, byte arg1) {
        field1583++;
        class287 var3 = this.field1585;
        class205 var4;
        synchronized (this.field1585) {
            var4 = (class205) this.field1585.method1900((long) arg0, 101);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field1587;
        byte[] var6;
        synchronized (this.field1587) {
            var6 = this.field1587.method2216(5, arg0, true);
        }
        class205 var7 = new class205();
        if (var6 != null) {
            var7.method1442(new class61(var6), arg1 + 46);
        }
        if (arg1 != -107) {
            this.method833(56, (byte) 119);
        }
        class287 var8 = this.field1585;
        synchronized (this.field1585) {
            this.field1585.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class81(class398 arg0, int arg1, class344 arg2) {
        this.field1587 = arg2;
        this.field1587.method2236(5, 0);
    }
}
