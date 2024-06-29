import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class236 extends class324 {

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lea;")
    public static class474 field3382 = new class474("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field3383 = 0;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "[I")
    public static int[] field3386 = new int[2048];

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3378;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V")
    public static void method1585(boolean arg0) {
        if (!arg0) {
            method1587(-29, (byte) 40);
        }
        field3382 = null;
        field3378 = null;
        field3386 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B[BI)[B")
    public static final byte[] method1586(byte arg0, byte[] arg1, int arg2) {
        field3380++;
        if (arg0 == 90) {
            byte[] var3 = new byte[arg2];
            class210.method1330(arg1, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lbg;")
    public static final class400 method1587(int arg0, byte arg1) {
        field3381++;
        int var2 = 103 % ((32 - arg1) / 60);
        class400[] var3 = class366.method2351((byte) 76);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class400 var5 = var3[var4];
            if (var5.field6063 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(II)V")
    public class236(int arg0, int arg1) {
        this.field3385 = arg0;
        this.field3379 = arg1;
    }
}
