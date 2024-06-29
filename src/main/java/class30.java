import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class30 {

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    public static int[] field329 = new int[50];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lcq;")
    public static class72 field327 = new class72("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public static int[] field330 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 7)
    public static void method186(boolean arg0) {
        if (arg0) {
            method187(-38, 0, 112);
        }
        field330 = null;
        field329 = null;
        field327 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)B", line = 19)
    public static final byte method187(int arg0, int arg1, int arg2) {
        field328++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == arg0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 43)
    public static final void method188(int arg0, int arg1) {
        field326++;
        int var2 = 7 / ((-arg1 - 45) / 45);
        class365 var3 = class168.field1960;
        synchronized (class168.field1960) {
            class168.field1960.method2286(arg0, (byte) 36);
        }
        class365 var4 = class108.field1288;
        synchronized (class108.field1288) {
            class108.field1288.method2286(arg0, (byte) 36);
        }
        class365 var5 = class347.field4723;
        synchronized (class347.field4723) {
            class347.field4723.method2286(arg0, (byte) 36);
        }
    }
}
