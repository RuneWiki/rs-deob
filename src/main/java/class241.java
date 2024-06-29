import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class241 extends class170 {

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "Z")
    public static boolean field3008 = false;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field3010 = 0;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Lbk;")
    public static class314 field3007 = new class314();

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)Llc;", line = 10)
    public static final class552 method1362(int arg0, byte arg1) {
        field3011++;
        class552[] var2 = class556.method3256(262144);
        int var3 = -56 / ((-arg1 - 72) / 51);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class552 var5 = var2[var4];
            if (var5.field8128 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)V", line = 49)
    public static void method1363(int arg0) {
        if (arg0 != -14514) {
            field3008 = true;
        }
        field3007 = null;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIII)V", line = 58)
    public class241(int arg0, int arg1, int arg2, int arg3) {
        this.field3004 = arg2;
        this.field3009 = arg1;
        this.field3006 = arg3;
        this.field3005 = arg0;
    }
}
