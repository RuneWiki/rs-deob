import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class285 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
    public boolean field4518 = false;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static volatile int field4525 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lbg;")
    public static class172 field4527;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZILwd;)V")
    private final void method1896(int arg0, boolean arg1, int arg2, class162 arg3) {
        field4517++;
        if (arg0 == 1) {
            this.field4529 = arg3.method1142(-18970);
        } else if (arg0 == 2) {
            this.field4522 = arg3.method1137(31155);
        } else if (arg0 == 3) {
            this.field4518 = true;
        } else if (arg0 == 4) {
            this.field4529 = -1;
        }
        if (arg1) {
            field4524 = 50;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lqg;IZ)V")
    public static final void method1897(class97 arg0, int arg1, boolean arg2) {
        field4526++;
        int var3 = arg0.field1556;
        int var4 = (int) arg0.field2012;
        arg0.method913(-3542);
        int var5 = 124 % ((arg1 - 53) / 35);
        if (arg2) {
            class53.method370(1, var3);
        }
        class206.method1441(true, var3);
        class211 var6 = class17.method87(var4, -20055);
        if (var6 != null) {
            class117.method834(var6, (byte) -57);
        }
        int var7 = class83.field1384;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class305.method2040((byte) -26, class192.field3103[var8])) {
                class73.method498(var8, true);
            }
        }
        if (class83.field1384 == 1) {
            class286.field4537 = false;
            class236.method1603(class67.field1114, class72.field1211, class169.field2756, class96.field1543, 0);
        } else {
            class236.method1603(class67.field1114, class72.field1211, class169.field2756, class96.field1543, 0);
            int var9 = class59.field967.method634(class211.field3347);
            for (int var10 = 0; var10 < class83.field1384; var10++) {
                int var11 = class59.field967.method634(class112.method789(var10, 111));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class72.field1211 = (class65.field1078 ? 26 : 22) + class83.field1384 * 15;
            class96.field1543 = var9 + 8;
        }
        if (class22.field284 != -1) {
            class258.method1733((byte) 95, class22.field284, 1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        field4527 = null;
        if (arg0 != 64) {
            field4525 = 113;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILwd;I)V")
    public final void method1899(int arg0, class162 arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method1133((byte) 53);
            if (var4 == 0) {
                field4519++;
                return;
            }
            this.method1896(var4, false, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)Lsa;")
    public final class260 method1900(int arg0, int arg1, boolean arg2) {
        field4523++;
        class260 var4 = (class260) class94.field1522.method1261(0, (long) (this.field4529 | arg1 << 16 | (arg2 ? 262144 : 0)));
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 460066352) {
            field4527 = null;
        }
        class258.field4169.method1698((byte) 95, this.field4529);
        class260 var5 = class218.method1506((byte) -76, class258.field4169, 0, this.field4529);
        if (var5 != null) {
            var5.method1750(class60.field978, class212.field3513, class274.field4403);
            var5.field3601 = var5.field3605;
            var5.field3597 = var5.field3603;
            if (arg2) {
                var5.method1749();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method1747();
            }
            class94.field1522.method1264(-1, (long) ((arg2 ? 262144 : 0) | this.field4529 | arg1 << 16), var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4521++;
        if (arg3 == arg4) {
            class209.method1458(arg5, arg0, arg2, 8225, arg4);
        } else if (arg1 <= -11) {
            if (class82.field1374 <= arg5 - arg4 && arg5 + arg4 <= class259.field4188 && class85.field1409 <= (arg2 - arg3) && arg2 + arg3 <= class234.field3774) {
                class73.method495(arg4, arg3, -53, arg0, arg2, arg5);
            } else {
                class309.method2063(arg2, true, arg0, arg3, arg4, arg5);
            }
        }
    }
}
