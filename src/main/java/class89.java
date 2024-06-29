import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class89 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "[Lud;")
    public class94[] field1385 = null;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "[Lud;")
    public class94[] field1390 = null;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Ljk;")
    public class134 field1387 = null;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "Ljk;")
    public class134 field1389 = null;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Ljk;")
    public class134 field1393 = null;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Z")
    public boolean field1386;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "[I")
    public static int[] field1388 = new int[200];

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "Lpo;")
    public static class396 field1394;

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lvd;)V", line = 139)
    public class89(class258 arg0) {
        this.field1386 = arg0.field3798;
        class151.method1088(arg0, (byte) 5);
        if (this.field1386) {
            byte[] var2 = class50.method374(false, -1, class459.field6703);
            this.field1389 = new class134(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class50.method374(false, -1, class30.field431);
            this.field1387 = new class134(arg0, 6410, 128, 128, 16, var3, 6410);
            class230 var4 = arg0.field3708;
            if (var4.method1428((byte) -87)) {
                byte[] var5 = class50.method374(false, -1, class530.field7809);
                this.field1393 = new class134(arg0, 6408, 128, 128, 16);
                class134 var6 = new class134(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1430(2.0F, (byte) -20, var6, this.field1393)) {
                    this.field1393.method1694(true);
                } else {
                    this.field1393.method1696(0);
                    this.field1393 = null;
                }
                var6.method1696(0);
                return;
            }
        } else {
            this.field1390 = new class94[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class413.method2476(32768, -11393, var7 * 128 * 128 * 2, class459.field6703);
                this.field1390[var7] = new class94(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field1385 = new class94[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class413.method2476(32768, -11393, var8 * 128 * 256, class30.field431);
                this.field1385[var8] = new class94(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lmv;Z)Z", line = 23)
    public static final boolean method691(class522 arg0, boolean arg1) {
        boolean var2 = class420.field6281 == class249.field3405;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method402(9216);
        if (arg0.field7687 < 0 || arg0.field7676 < 0 || arg0.field7683 >= class445.field6562 || arg0.field7673 >= class167.field2473) {
            return false;
        }
        for (int var6 = arg0.field7687; var6 <= arg0.field7683; var6++) {
            for (int var9 = arg0.field7676; var9 <= arg0.field7673; var9++) {
                class306 var10 = class461.method2673(arg0.field7686, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field7687) {
                        var11++;
                    }
                    if (var6 < arg0.field7683) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field7676) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field7673) {
                        var11 += 2;
                    }
                    class17 var12 = class216.method1376(arg0, var11, (byte) 31);
                    class17 var13 = var10.field4589;
                    if (var13 == null) {
                        var10.field4589 = var12;
                    } else {
                        while (var13.field281 != null) {
                            var13 = var13.field281;
                        }
                        var13.field281 = var12;
                    }
                    var10.field4594 = (byte) (var10.field4594 | var11);
                    if (var2 && (class521.field7668[var6][var9] & 0xFF000000) != 0) {
                        var3 = class521.field7668[var6][var9];
                        var4 = class364.field5563[var6][var9];
                        var5 = class282.field4269[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field7687; var7 <= arg0.field7683; var7++) {
                for (int var8 = arg0.field7676; var8 <= arg0.field7673; var8++) {
                    if ((class521.field7668[var7][var8] & 0xFF000000) == 0) {
                        class521.field7668[var7][var8] = var3;
                        class364.field5563[var7][var8] = var4;
                        class282.field4269[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class132.field1979[class468.field6866++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 203)
    public static void method692(byte arg0) {
        if (arg0 != -103) {
            field1391 = 113;
        }
        field1394 = null;
        field1388 = null;
    }
}
