import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class108 extends class330 {

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "I")
    private int field1277 = -1;

    @OriginalMember(owner = "client!lca", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1279 = "";

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!lca", name = "I", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!lca", name = "J", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lca", name = "K", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!lca", name = "L", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!lca", name = "N", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!lca", name = "M", descriptor = "[I")
    public int[] field1284;

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
    public class108() {
        super(0, false);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field1277 = arg0.method3002(-1);
        }
        int var4 = -45 % ((-41 - arg2) / 42);
        ++field1281;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
    public final boolean method765(int arg0) {
        if (arg0 != 657837988) {
            field1279 = null;
        }
        ++field1278;
        if (this.field1284 != null) {
            return true;
        } else if (~this.field1277 <= -1) {
            class279 var2 = ~class324.field4578 > -1 ? class279.method1811(class714.field9928, this.field1277) : class279.method1821(class714.field9928, class324.field4578, this.field1277);
            var2.method1819();
            this.field1284 = var2.method1818();
            this.field1285 = var2.field4014;
            this.field1282 = var2.field4008;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
    public final void method766(byte arg0) {
        ++field1276;
        if (arg0 <= 27) {
            this.method537(10, -113);
        }
        super.method766((byte) 44);
        this.field1284 = null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)[[I")
    public int[][] method537(int arg0, int arg1) {
        ++field1280;
        if (arg0 != 0) {
            this.method766((byte) 97);
        }
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510 && this.method765(arg0 + 657837988)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1285 * (class291.field4285 != this.field1282 ? this.field1282 * arg1 / class291.field4285 : arg1);
            if (~class80.field901 == ~this.field1285) {
                for (int var8 = 0; ~class80.field901 < ~var8; ++var8) {
                    int var9 = this.field1284[var7++];
                    var6[var8] = class407.method2490(var9, 255) << 4;
                    var5[var8] = class407.method2490(var9 >> 4, 4080);
                    var4[var8] = class407.method2490(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class80.field901 > var10; ++var10) {
                    int var11 = this.field1285 * var10 / class80.field901;
                    int var12 = this.field1284[var7 + var11];
                    var6[var10] = class407.method2490(255, var12) << 4;
                    var5[var10] = class407.method2490(var12, 65280) >> 4;
                    var4[var10] = class407.method2490(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)I")
    public final int method767(byte arg0) {
        if (arg0 != -70) {
            field1279 = null;
        }
        ++field1275;
        return this.field1277;
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)V")
    public static void method768(byte arg0) {
        field1279 = null;
        int var1 = 121 / ((-42 - arg0) / 62);
    }
}
