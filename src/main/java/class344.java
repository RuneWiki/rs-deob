import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class344 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Llh;")
    private class364 field5246 = new class364(64);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lhh;")
    private class84 field5240;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public int field5242;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lgf;")
    public static class180 field5241 = new class180("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "[I")
    public static int[] field5245 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 5)
    public static void method2238(int arg0) {
        field5245 = null;
        if (arg0 != 99) {
            method2238(-96);
        }
        field5241 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lln;", line = 31)
    public final class256 method2239(byte arg0, int arg1) {
        field5244++;
        class364 var3 = this.field5246;
        class256 var4;
        synchronized (this.field5246) {
            var4 = (class256) this.field5246.method2339(-105, (long) arg1);
            if (arg0 > -84) {
                this.field5240 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5240.method683(19, arg1, 5);
        class256 var6 = new class256();
        if (var5 != null) {
            var6.method1622((byte) -44, new class303(var5));
        }
        class364 var7 = this.field5246;
        synchronized (this.field5246) {
            this.field5246.method2342((long) arg1, var6, -122);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)B", line = 61)
    public static final byte method2240(int arg0, int arg1, int arg2) {
        field5243++;
        if (arg2 == 9) {
            if (arg1 != 0) {
                field5241 = null;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lmt;ILhh;)V", line = 84)
    public class344(class271 arg0, int arg1, class84 arg2) {
        this.field5240 = arg2;
        this.field5242 = this.field5240.method656((byte) 122, 19);
    }
}
