import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class58 extends class55 {

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "[Lvb;")
    public class132[] field686;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "Ltj;")
    public static class10 field689;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[I")
    public static int[] field685;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lbc;Lbc;IZ)V")
    public class58(class282 arg0, class282 arg1, int arg2, boolean arg3) {
        class234 var5 = new class234();
        int var6 = arg0.method1874((byte) 18, arg2);
        this.field686 = new class132[var6];
        int[] var7 = arg0.method1851(1, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1861(var7[var8], arg2, 1);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class73 var11 = (class73) var5.method1532(-77);
            class73 var12 = null;
            while (var11 != null) {
                if (var11.field879 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class73) var5.method1523(-79);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1855(var10, 0, true);
                } else {
                    var13 = arg1.method1855(0, var10, true);
                }
                var12 = new class73(var10, var13);
                var5.method1522(var12, -106);
            }
            this.field686[var7[var8]] = new class132(var9, var12);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Z")
    public final boolean method357(int arg0, boolean arg1) {
        field688++;
        return arg1 ? false : this.field686[arg0].field1902;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Z")
    public final boolean method358(byte arg0, int arg1) {
        if (arg0 >= -13) {
            return true;
        } else {
            field687++;
            return this.field686[arg1].field1905;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static void method359(int arg0) {
        if (arg0 != -25465) {
            field685 = null;
        }
        field685 = null;
        field689 = null;
    }
}
