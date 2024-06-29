import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class139 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Loc;")
    public static class151 field2539 = class137.method873(2, "rect_debug=");

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2542 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[J")
    public static long[] field2536 = new long[1000];

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Loc;")
    public static class151 field2543 = class137.method873(2, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lwa;")
    public static class229 field2537 = new class229(8);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lle;")
    public static class123 field2545 = new class123();

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2546 = -1;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method897(int arg0) {
        field2544++;
        class37.field775.method1317((byte) 27);
        if (arg0 != 22036) {
            field2542 = 78;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method898(int arg0) {
        field2538++;
        class20.field434.method544(0, 0);
        if (arg0 != -3793) {
            method900(28);
        }
        class228.field3979.method544(382, 0);
        class222.field3843.method229(382 - class222.field3843.field633 / 2, 18);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method899(boolean arg0, int arg1) {
        field2540++;
        if (arg1 == 100 && class33.field671 > 0) {
            byte[] var2 = class78.field1520[--class33.field671];
            class78.field1520[class33.field671] = null;
            return var2;
        } else if (arg1 == 5000 && class47.field973 > 0) {
            byte[] var3 = class194.field3469[--class47.field973];
            class194.field3469[class47.field973] = null;
            return var3;
        } else {
            if (!arg0) {
                method897(-104);
            }
            if (arg1 == 30000 && class197.field3509 > 0) {
                byte[] var4 = class178.field3210[--class197.field3509];
                class178.field3210[class197.field3509] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static void method900(int arg0) {
        field2545 = null;
        field2543 = null;
        field2539 = null;
        field2536 = null;
        if (arg0 == 100) {
            field2537 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZLoc;)V")
    public static final void method901(boolean arg0, boolean arg1, class151 arg2) {
        field2541++;
        short[] var3 = new short[16];
        class151 var4 = arg2.method993((byte) -127);
        int var5 = 0;
        if (arg1) {
            method897(95);
        }
        for (int var6 = 0; var6 < class108.field1913; var6++) {
            class12 var9 = class43.method311(var6, 0);
            if ((!arg0 || var9.field250) && var9.field241.method993((byte) -102).method990(var4, (byte) 66) != -1) {
                if (var5 >= 250) {
                    client.field695 = null;
                    class226.field3933 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        client.field695 = var3;
        class226.field3933 = var5;
        class64.field1256 = 0;
        class151[] var7 = new class151[class226.field3933];
        for (int var8 = 0; var8 < class226.field3933; var8++) {
            var7[var8] = class43.method311(var3[var8], 0).field241;
        }
        class91.method580(client.field695, 118, var7);
    }
}
