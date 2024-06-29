import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class class125 {

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lur;")
    public class377 field1617;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lao;")
    public static class191 field1614 = new class191(67, 6);

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "Ljc;")
    public static class305 field1616 = new class305("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "Ljc;")
    public static class305 field1618 = new class305("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "Lho;")
    public static class103 field1619 = new class103(37, 6);

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field1621 = -1;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "[I")
    public static int[] field1615;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)V")
    public abstract void method668(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILhe;I)V")
    public abstract void method669(int arg0, class252 arg1, int arg2);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lir;[I[IB[I)V")
    public static final void method758(class22 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        int var5 = 40 / ((arg3 + 20) / 44);
        for (int var6 = 0; var6 < arg4.length; var6++) {
            int var7 = arg4[var6];
            int var8 = arg1[var6];
            int var9 = arg2[var6];
            for (int var10 = 0; var8 != 0 && var10 < arg0.field1218.length; var10++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field1218[var10] = null;
                    } else {
                        class260 var11 = class7.field97.method2951(var7, -13765);
                        int var12 = var11.field3475;
                        class533 var13 = arg0.field1218[var10];
                        if (var13 != null) {
                            if (var13.field7847 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field1218[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field7845 = 1;
                                    var13.field7842 = 0;
                                    var13.field7841 = 0;
                                    var13.field7844 = 0;
                                    var13.field7843 = var9;
                                    class276.method1678(var11, arg0.field3695, arg0.field3704, (byte) 125, arg0.field3694, false, 0);
                                } else if (var12 == 2) {
                                    var13.field7844 = 0;
                                }
                            } else if (var11.field3478 >= class7.field97.method2951(var13.field7847, -13765).field3478) {
                                var13 = arg0.field1218[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class533 var14 = arg0.field1218[var10] = new class533();
                            var14.field7841 = 0;
                            var14.field7847 = var7;
                            var14.field7844 = 0;
                            var14.field7842 = 0;
                            var14.field7845 = 1;
                            var14.field7843 = var9;
                            class276.method1678(var11, arg0.field3695, arg0.field3704, (byte) 74, arg0.field3694, false, 0);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        field1622++;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
    public abstract boolean method666(int arg0);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
    public abstract void method667(int arg0);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(ZI)V")
    public abstract void method665(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
    public static void method759(int arg0) {
        field1616 = null;
        field1614 = null;
        field1615 = null;
        field1619 = null;
        field1618 = null;
        int var1 = -60 % ((80 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lur;)V")
    public class125(class377 arg0) {
        this.field1617 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
    public abstract void method662(int arg0, int arg1, int arg2);
}
