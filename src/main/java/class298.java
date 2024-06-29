import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class298 extends class426 {

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lmp;")
    public class95 field4507;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "Lug;")
    public class291 field4504;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "[I")
    public static int[] field4506 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "Z")
    public static boolean field4509 = false;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field4511 = -2;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "Liq;")
    public static class134 field4505;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lkr;")
    public static class234 field4515;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "Lsf;")
    public static class398 field4502;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1840(byte arg0, String arg1) {
        System.out.println("Error: " + class114.method693("%0a", "\n", arg0 - 112, arg1));
        field4513++;
        if (arg0 != 113) {
            field4505 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public final void method1841(boolean arg0) {
        field4512++;
        this.field4508 = this.field4507.field1326;
        this.field4503 = this.field4507.field1319;
        if (arg0) {
            return;
        }
        this.field4516 = this.field4507.field1321;
        if (this.field4507.field1318 != null) {
            this.field4507.field1318.method606(this.field4504.field4434, this.field4504.field4423, this.field4504.field4426, class320.field4832);
        }
        this.field4518 = class320.field4832[2];
        this.field4510 = class320.field4832[0];
    }

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "(I)V")
    public static void method1842(int arg0) {
        if (arg0 == 2) {
            field4506 = null;
            field4505 = null;
            field4515 = null;
            field4502 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1843(boolean arg0, String arg1, int arg2) {
        field4514++;
        class81.field1079.field1767 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class186.field2796.field2743; var6++) {
            class167 var10 = class186.field2796.method1106(50, var6);
            if ((!arg0 || var10.field2359) && var10.field2345 == -1 && var10.field2372 == -1 && var10.field2320 == 0 && var10.field2329.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class411.field6117 = null;
                    class90.field1279 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var12 < var5; var12++) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var5++] = (short) var6;
            }
        }
        class411.field6117 = var4;
        class90.field1279 = var5;
        int var7 = -11 % ((arg2 - 9) / 59);
        class337.field5019 = 0;
        String[] var8 = new String[class90.field1279];
        for (int var9 = 0; var9 < class90.field1279; var9++) {
            var8[var9] = class186.field2796.method1106(50, var4[var9]).field2329;
        }
        class184.method1122((byte) 53, class411.field6117, var8);
        class81.field1079.method818(127);
        class81.field1079.field1767 = 2;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lmp;Lmk;)V")
    public class298(class95 arg0, class336 arg1) {
        this.field4507 = arg0;
        this.field4504 = class128.method751(-31686, arg0.field1322);
        this.method1841(false);
    }
}
