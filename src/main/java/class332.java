import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class332 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lvt;")
    public static class344 field4583 = new class344("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lra;")
    public static class262 field4584;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2084(int arg0, int arg1) {
        field4582++;
        if (arg0 == 100 && class14.field139 > 0) {
            byte[] var2 = class530.field7404[--class14.field139];
            class530.field7404[class14.field139] = null;
            return var2;
        } else if (arg0 == 5000 && class174.field2258 > 0) {
            byte[] var3 = class88.field1168[--class174.field2258];
            class88.field1168[class174.field2258] = null;
            return var3;
        } else if (arg1 > -42) {
            return null;
        } else if (arg0 == 30000 && class411.field5649 > 0) {
            byte[] var4 = class591.field8536[--class411.field5649];
            class591.field8536[class411.field5649] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method2085(int arg0) {
        field4583 = null;
        field4584 = null;
        if (arg0 != -1) {
            method2084(-90, 17);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)I")
    public static final int method2086(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 97 / ((-arg0 - 42) / 63);
        field4581++;
        if ((class310.field3971[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class310.field3971[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
