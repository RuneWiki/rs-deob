import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class112 {

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "[I")
    public static int[] field1723 = new int[4096];

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Lej;")
    public static class104 field1724 = new class104("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "Lej;")
    public static class104 field1725 = new class104("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public static int field1726 = 0;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "[Lnaa;")
    public static class62[] field1727 = new class62[2048];

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)V")
    public static final void method779(int arg0, boolean arg1) {
        if (!arg1) {
            method780(114, null);
        }
        field1722++;
        if (class377.method2232(120, arg0)) {
            class390.method2349(-1, (byte) -119, class618.field8850[arg0]);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILbe;)V")
    public static final void method780(int arg0, class33 arg1) {
        field1728++;
        int var2 = arg1.field538 - class405.field5763;
        int var3 = arg1.field547 * 128 + arg0 * arg1.method337(0);
        int var4 = arg1.field565 * 128 + arg1.method337(0) * 64;
        arg1.field619 = 0;
        arg1.field6029 += (var4 - arg1.field6029) / var2;
        arg1.field6037 += (var3 - arg1.field6037) / var2;
        if (arg1.field577 == 0) {
            arg1.method348((byte) 28, 8192);
        }
        if (arg1.field577 == 1) {
            arg1.method348((byte) 28, 12288);
        }
        if (arg1.field577 == 2) {
            arg1.method348((byte) 28, 0);
        }
        if (arg1.field577 == 3) {
            arg1.method348((byte) 28, 4096);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
    public static void method781(int arg0) {
        field1727 = null;
        int var1 = 88 / ((13 - arg0) / 46);
        field1725 = null;
        field1723 = null;
        field1724 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIILfa;)V")
    public static final void method782(int arg0, int arg1, int arg2, class197 arg3) {
        class622 var4 = class452.method2656(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field8979 = arg3;
        }
    }
}
