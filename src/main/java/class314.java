import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class314 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lkh;")
    private class13 field4734 = new class13(128);

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lul;")
    private class406 field4737;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lak;")
    public static class234 field4739 = new class234("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lob;")
    public static class521 field4741 = new class521(24, 8);

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4742 = new CRC32();

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lur;")
    public static class377 field4740;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2011(byte arg0) {
        class448.field6563.method1880((byte) -112);
        field4735++;
        class60.field718 = 1;
        class216.field3506 = null;
        if (arg0 != -54) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Lrp;", line = 26)
    public static final class303 method2012(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class303 var4 = var3.field2102;
            var3.field2102 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lmr;", line = 38)
    public final class98 method2013(int arg0, int arg1) {
        field4738++;
        class13 var3 = this.field4734;
        class98 var4;
        synchronized (this.field4734) {
            var4 = (class98) this.field4734.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 24) {
            field4741 = null;
        }
        byte[] var5 = this.field4737.method2536(class364.method2279(arg1, -1545518168), 0, class464.method2805(arg0 - 25, arg1));
        class98 var6 = new class98();
        if (var5 != null) {
            var6.method793(new class217(var5), (byte) 21);
        }
        class13 var7 = this.field4734;
        synchronized (this.field4734) {
            this.field4734.method84((long) arg1, var6, (byte) 27);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lee;ILul;)V", line = 87)
    public class314(class480 arg0, int arg1, class406 arg2) {
        this.field4737 = arg2;
        if (this.field4737 != null) {
            int var4 = this.field4737.method2561(-108) - 1;
            this.field4737.method2551(var4, -26070);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lhp;I)Lcv;", line = 72)
    public static final class402 method2014(class217 arg0, int arg1) {
        field4736++;
        class402 var2 = new class402();
        var2.field5973 = arg0.method1511(-59);
        if (arg1 <= 95) {
            field4740 = null;
        }
        var2.field5968 = class507.field7412.method963(var2.field5973, (byte) 87);
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 113)
    public static void method2015(int arg0) {
        field4741 = null;
        field4740 = null;
        field4742 = null;
        if (arg0 != 1) {
            field4741 = null;
        }
        field4739 = null;
    }
}
