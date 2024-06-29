import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class472 extends class86 {

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    private int field6908;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lwi;")
    public static class340 field6897 = new class340(11, 0, 1, 2);

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "Z")
    public static boolean field6899 = false;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "Lsi;")
    public static class512 field6904 = new class512(8, 3);

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Lse;")
    public static class4 field6901;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "[Lrq;")
    public class318[] field6905;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[[B")
    private byte[][] field6903;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Z")
    public final boolean method2834(byte arg0, int arg1) {
        field6906++;
        if (arg0 < 60) {
            field6897 = null;
        }
        return this.field6905[arg1].field4879;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public static void method2835(int arg0) {
        field6904 = null;
        if (arg0 > -92) {
            method2835(-2);
        }
        field6901 = null;
        field6897 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Z")
    public final boolean method2836(int arg0, byte arg1) {
        if (arg1 != 11) {
            this.method2834((byte) -14, 123);
        }
        field6907++;
        return this.field6905[arg0].field4875;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
    public final boolean method2837(int arg0, int arg1) {
        if (arg1 != 26582) {
            this.field6908 = 112;
        }
        field6900++;
        return this.field6905[arg0].field4877;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
    public final boolean method2838(boolean arg0) {
        if (arg0) {
            return true;
        }
        field6902++;
        if (this.field6905 != null) {
            return true;
        }
        if (this.field6903 == null) {
            if (!class140.field2034.method2634(-44, this.field6908)) {
                return false;
            }
            int[] var2 = class140.field2034.method2641(this.field6908, 0);
            this.field6903 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6903[var3] = class140.field2034.method2650(var2[var3], -90, this.field6908);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6903.length; var5++) {
            byte[] var14 = this.field6903[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class339.field5362.method2624(-106, var15);
        }
        if (!var4) {
            return false;
        }
        class306 var6 = new class306();
        int var7 = class140.field2034.method2645(1, this.field6908);
        this.field6905 = new class318[var7];
        int[] var8 = class140.field2034.method2641(this.field6908, 0);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6903[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class183 var12 = null;
            for (class183 var13 = (class183) var6.method1970(64); var13 != null; var13 = (class183) var6.method1960(24)) {
                if (var13.field2587 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class183(var11, class339.field5362.method2638(!arg0, var11));
                var6.method1958(var12, 0);
            }
            this.field6905[var8[var9]] = new class318(var10, var12);
        }
        this.field6903 = null;
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V")
    public class472(int arg0) {
        this.field6908 = arg0;
    }
}
