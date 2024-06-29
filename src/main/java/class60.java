import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class60 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "[I")
    private int[] field784;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "[B")
    public static byte[] field785;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method338(int arg0) {
        if (arg0 != 0) {
            field787 = -55;
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I")
    public static int method339(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
    public static final boolean method340(int arg0, int arg1, int arg2) {
        int var3 = class180.field2347[arg0][arg1][arg2];
        if (-class206.field2685 == var3) {
            return false;
        } else if (class206.field2685 == var3) {
            return true;
        } else {
            int var4 = arg1 << class169.field2206;
            int var5 = arg2 << class169.field2206;
            if (class300.method1801(var4 + 1, class92.field1285[arg0].method1187(arg1, arg2), var5 + 1) && class300.method1801(class286.field3658 + var4 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg2), var5 + 1) && class300.method1801(class286.field3658 + var4 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg2 + 1), class286.field3658 + var5 - 1) && class300.method1801(var4 + 1, class92.field1285[arg0].method1187(arg1, arg2 + 1), class286.field3658 + var5 - 1) && class300.method1801(class477.field6971 + var4, class92.field1285[arg0].method1187(arg1, arg2), var5 + 1) && class300.method1801(class286.field3658 + var4 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg2), class477.field6971 + var5) && class300.method1801(class477.field6971 + var4, class92.field1285[arg0].method1187(arg1, arg2 + 1), class286.field3658 + var5 - 1) && class300.method1801(class286.field3658 + var4 - 1, class92.field1285[arg0].method1187(arg1, arg2), class477.field6971 + var5) && class300.method1801(class477.field6971 + var4, class92.field1285[arg0].method1187(arg1, arg2), class477.field6971 + var5)) {
                class180.field2347[arg0][arg1][arg2] = class206.field2685;
                return true;
            } else {
                class180.field2347[arg0][arg1][arg2] = -class206.field2685;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)I")
    public final int method341(int arg0, int arg1) {
        field786++;
        int var3 = (this.field784.length >> 1) + arg1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field784[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field784[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([I)V")
    public class60(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field784 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field784[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field784[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field784[var5 + var5] = arg0[var4];
            this.field784[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static final void method342(byte arg0) {
        if (class267.field3389 < 0) {
            class294.field3816 = -1;
            class203.field2665 = -1;
            class267.field3389 = 0;
        }
        field789++;
        if (class230.field2970 < class267.field3389) {
            class267.field3389 = class230.field2970;
            class203.field2665 = -1;
            class294.field3816 = -1;
        }
        if (arg0 != 90) {
            field785 = null;
        }
        if (class346.field4413 < 0) {
            class203.field2665 = -1;
            class346.field4413 = 0;
            class294.field3816 = -1;
        }
        if (class346.field4413 > class230.field2978) {
            class294.field3816 = -1;
            class346.field4413 = class230.field2978;
            class203.field2665 = -1;
        }
    }

    static {
        new class169("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field787 = 0;
        field785 = new byte[520];
    }
}
