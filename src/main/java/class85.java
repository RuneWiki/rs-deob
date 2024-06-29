import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class85 extends class134 {

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field1340 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public int field1341 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public int field1342 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public int field1343 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public int field1346 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field1336 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public int field1349 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public int field1345 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lli;")
    public class314 field1339;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Lwe;")
    public static class16 field1337 = new class16();

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Z")
    public final boolean method568(int arg0, int arg1, int arg2) {
        field1338++;
        if (this.field1342 <= arg0 && arg0 <= this.field1345 && arg2 >= this.field1346 && this.field1349 >= arg2) {
            return true;
        } else {
            if (arg1 != -12751) {
                this.method568(13, 4, 126);
            }
            return arg0 >= this.field1341 && arg0 <= this.field1340 && arg2 >= this.field1343 && arg2 <= this.field1336;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method569(int arg0, String arg1, char arg2) {
        field1347++;
        int var3 = class154.method1014(111, arg1, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -32153) {
            return null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var6++] = arg1.substring(var5, var8);
            var5 = var8 + 1;
        }
        var4[var3] = arg1.substring(var5);
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
    public static void method570(int arg0) {
        if (arg0 != 0) {
            method569(35, (String) null, (char) 65529);
        }
        field1337 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lli;)V")
    public class85(class314 arg0) {
        this.field1339 = arg0;
    }
}
