import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class443 extends class227 {

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    private int field6453 = -1;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "[I")
    public static int[] field6449 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "Lho;")
    public static class103 field6445 = new class103(21, 8);

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "Lho;")
    public static class103 field6457;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public int field6443;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public int field6451;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "[I")
    public int[] field6447;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)V")
    public static void method2741(int arg0) {
        field6457 = null;
        field6445 = null;
        int var1 = -109 / ((arg0 - -47) / 45);
        field6449 = null;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
    public final void method1454(int arg0) {
        if (arg0 <= -33) {
            ++field6444;
            super.method1454(-125);
            this.field6447 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class443() {
        super(0, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZBJLjava/lang/String;)V")
    public static final void method2742(boolean arg0, byte arg1, long arg2, String arg3) {
        ++field6454;
        if (arg0) {
            class442.method2714(true);
            if (class524.field7707.equals("")) {
                class173.field2226 = 39;
                return;
            }
        }
        class396 var5 = new class396(128);
        var5.method2449((byte) 123, 10);
        var5.method2444((byte) 65, (int) (65535.0D * Math.random()));
        var5.method2422(arg2, arg1 ^ 114);
        if (arg1 == 4) {
            var5.method2444((byte) 65, class385.field5601);
            var5.method2398(126, (int) (9.9999999E7D * Math.random()));
            var5.method2415(arg3, 21742);
            var5.method2398(127, (int) (Math.random() * 9.9999999E7D));
            if (!arg0) {
                var5.method2398(arg1 + -88, (int) (9.9999999E7D * Math.random()));
                var5.method2398(-58, (int) (9.9999999E7D * Math.random()));
                var5.method2398(117, (int) (9.9999999E7D * Math.random()));
                var5.method2398(-19, (int) (9.9999999E7D * Math.random()));
            } else {
                var5.method2422(class408.method2501(class524.field7707, 57), arg1 ^ 123);
                try {
                    var5.method2422(Long.parseLong(class289.field3809), 118);
                } catch (Exception var6) {
                    class173.field2226 = 39;
                    return;
                }
            }
            var5.method2398(121, (int) (Math.random() * 9.9999999E7D));
            var5.method2424(class183.field2384, class318.field4248, 0);
            class106.field1443.field5729 = 0;
            class106.field1443.method2449((byte) 121, arg0 ? class459.field6859.field782 : class459.field6856.field782);
            class106.field1443.method2444((byte) 65, var5.field5729 + 28);
            class106.field1443.method2444((byte) 65, 596);
            class106.field1443.method2449((byte) 126, class374.field5072);
            class106.field1443.method2449((byte) 116, class381.field5520.field1407);
            class321.method1906(-1, class106.field1443);
            class106.field1443.method2438(0, var5.field5761, var5.field5729, 1769508784);
            class114.field1497 = 1;
            class173.field2226 = -3;
            class329.field4373 = 0;
            class225.field3030 = 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)[[I")
    public int[][] method112(int arg0, boolean arg1) {
        ++field6452;
        int[][] var3 = super.field3059.method28((byte) 88, arg0);
        if (!arg1) {
            this.field6447 = null;
        }
        if (super.field3059.field57 && this.method2743((byte) 117)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class305.field4055 == this.field6443 ? arg0 : this.field6443 * arg0 / class305.field4055) * this.field6451;
            if (~class446.field6486 == ~this.field6451) {
                for (int var8 = 0; ~class446.field6486 < ~var8; ++var8) {
                    int var9 = this.field6447[var7++];
                    var6[var8] = class95.method534(var9, 255) << 4;
                    var5[var8] = class95.method534(4080, var9 >> 4);
                    var4[var8] = class95.method534(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; class446.field6486 > var10; ++var10) {
                    int var11 = this.field6451 * var10 / class446.field6486;
                    int var12 = this.field6447[var7 - -var11];
                    var6[var10] = class95.method534(var12, 255) << 4;
                    var5[var10] = class95.method534(65280, var12) >> 4;
                    var4[var10] = class95.method534(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
    public final boolean method2743(byte arg0) {
        ++field6442;
        if (this.field6447 != null) {
            return true;
        } else if (this.field6453 >= 0) {
            class491 var2 = class38.field396 < 0 ? class491.method2963(class47.field488, this.field6453) : class491.method2969(class47.field488, class38.field396, this.field6453);
            var2.method2965();
            this.field6447 = var2.method2962();
            this.field6443 = var2.field7191;
            this.field6451 = var2.field7196;
            return true;
        } else {
            if (arg0 <= 94) {
                field6449 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 == 487215116) {
            if (~arg2 == -1) {
                this.field6453 = arg0.method2386(-23648);
            }
            ++field6448;
        }
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)I")
    public final int method1458(int arg0) {
        ++field6446;
        if (arg0 != -1) {
            this.method61((class396) null, -43, 122);
        }
        return this.field6453;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)V")
    public static final void method2744(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field7264 != null) {
                var3.field7264 = null;
            }
            if (var3.field7257 != null) {
                var3.field7257 = null;
            }
        }
    }

    static {
        new class305("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6456 = -1;
        field6457 = new class103(43, 3);
    }
}
