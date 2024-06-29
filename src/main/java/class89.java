import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class89 {

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "Lpa;")
    private class387 field1153 = new class387(64);

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Lcb;")
    private class544 field1154;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "[Z")
    public static boolean[] field1151 = new boolean[100];

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "[B")
    public static byte[] field1152 = new byte[2048];

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lha;B)V")
    public static final void method629(class66 arg0, byte arg1) {
        field1156++;
        class391.field5552 = new class461[class469.field6699.length];
        for (int var2 = 0; var2 < class469.field6699.length; var2++) {
            int var3 = class469.field6699[var2];
            class263 var4 = class96.method677(class13.field257, var3, (byte) -125);
            class67 var5 = arg0.method403(var4, class625.method3581(class412.field5831, var3), true);
            class391.field5552[var2] = new class461(var5, var4);
        }
        if (arg1 >= -87) {
            method630(true);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)[Lkq;")
    public static final class617[] method630(boolean arg0) {
        if (arg0) {
            method629(null, (byte) -38);
        }
        field1158++;
        return new class617[] { class17.field277, class17.field279, class17.field281, class17.field283, class17.field284, class17.field285, class17.field286, class17.field287, class17.field288, class17.field289, class17.field290, class17.field291 };
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)I")
    public static final int method631(byte arg0, int arg1) {
        int var2 = 101 / ((-arg0 - 9) / 51);
        int var8 = arg1 - 1;
        field1150++;
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
    public static void method632(byte arg0) {
        field1152 = null;
        if (arg0 > 110) {
            field1151 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(BI)Lsha;")
    public final class757 method633(byte arg0, int arg1) {
        field1157++;
        class387 var3 = this.field1153;
        class757 var4;
        synchronized (this.field1153) {
            var4 = (class757) this.field1153.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == -20) {
            class544 var5 = this.field1154;
            byte[] var6;
            synchronized (this.field1154) {
                var6 = this.field1154.method3150(arg1, -68, 19);
            }
            class757 var7 = new class757();
            if (var6 != null) {
                var7.method4183(new class120(var6), -84);
            }
            class387 var8 = this.field1153;
            synchronized (this.field1153) {
                this.field1153.method2362(var7, arg0 + 20, (long) arg1);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Liv;ILcb;)V")
    public class89(class106 arg0, int arg1, class544 arg2) {
        this.field1154 = arg2;
        this.field1155 = this.field1154.method3147(19, 89);
    }
}
