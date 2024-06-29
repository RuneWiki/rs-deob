import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class171 extends class544 {

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field2084;

    static {
        new class180("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field2082 = 13156520;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(III)Z", line = 4)
    public static final boolean method954(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field2080++;
            return (arg1 & 0x60000) != 0 | class199.method1073(arg0, false, arg1) || class140.method780((byte) -105, arg1, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)I", line = 16)
    public static final int method955(byte arg0) {
        if (arg0 >= -52) {
            return 104;
        }
        field2083++;
        if (class289.field3757 == null) {
            if (!class473.field6634 && class199.field2397 > 0) {
                if (class236.field2894 && class443.field6109.method185(53, 81) && class199.field2397 > 2) {
                    return ((class99) class89.field1096.field2331.field7965.field7965).field1223;
                }
                return ((class99) class89.field1096.field2331.field7965).field1223;
            }
            int var1 = class368.field4859.method167(64);
            int var2 = class368.field4859.method169(21);
            int var3 = class308.field3933;
            int var4 = class521.field7314;
            int var5 = class609.field8848;
            if (var1 > var3 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class199.field2397; var7++) {
                    if (class590.field8552) {
                        int var12 = var4 + ((class199.field2397 - var7 - 1) * 16) + 33;
                        if (var2 > var12 - 13 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = var4 + ((class199.field2397 - var7 - 1) * 16) + 31;
                        if (var2 > (var11 - 13) && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class580 var9 = new class580(class89.field1096);
                    for (class99 var10 = (class99) var9.method3382(-19983); var10 != null; var10 = (class99) var9.method3381(-16796)) {
                        if (var6 == var8++) {
                            return var10.field1223;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V", line = 114)
    public static final void method956(byte arg0) {
        class84.field1033++;
        field2078++;
        class418.method2378(17984, class19.field130);
        if (arg0 != 47) {
            method954(107, -86, 104);
        }
        class136.field1663.method2093(0, arg0 - 167);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Z", line = 133)
    public static final boolean method957(byte arg0, int arg1) {
        field2079++;
        if (arg0 != 7) {
            field2082 = -128;
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 146)
    public class171() {
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V", line = 148)
    public class171(int arg0) {
        this.field2081 = arg0;
    }
}
