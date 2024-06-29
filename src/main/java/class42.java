import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class42 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lna;")
    public static class26 field695 = class69.method505("1", (byte) -126);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field696 = 127;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lna;")
    public static class26 field694 = class69.method505("Ablegen", (byte) -117);

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lna;")
    public static class26 field698 = class69.method505(")3", (byte) -125);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
    public static boolean field693;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZILve;I)[Lek;", line = 6)
    private static final class183[] method337(boolean arg0, int arg1, class266 arg2, int arg3) {
        if (!arg0) {
            field694 = (class26) null;
        }
        field691++;
        return class196.method1317(arg2, arg3, arg1, -30901) ? class299.method2108(0) : null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 23)
    public static void method338(byte arg0) {
        if (arg0 < 26) {
            field695 = (class26) null;
        }
        field694 = null;
        field695 = null;
        field698 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILve;)V", line = 37)
    public static final void method339(int arg0, class266 arg1) {
        class13.field218 = class107.method762(0, 32767, class89.field1484, arg1);
        class276.field4615 = class319.method2219(0, (byte) 11, class76.field1163, arg1);
        field697++;
        class28.field472 = class319.method2219(0, (byte) 11, client.field4111, arg1);
        class194.field3022 = class319.method2219(0, (byte) 11, class96.field1571, arg1);
        class324.field5566 = class319.method2219(0, (byte) 11, class236.field3766, arg1);
        class10.field133 = class319.method2219(0, (byte) 11, class240.field3875, arg1);
        class50.field787 = class319.method2219(0, (byte) 11, class50.field786, arg1);
        class7.field88 = class277.method1956(0, class84.field1379, (byte) -18, arg1);
        class312.field5337 = class76.method547(arg0 ^ 0xFFFFFFEA, 0, class199.field3094, arg1);
        class295.field4917 = class76.method547(-1, 0, class308.field5306, arg1);
        class86.field1412 = class123.method844(arg1, (byte) -12, 0, class88.field1457);
        class268.field4428 = class123.method844(arg1, (byte) -12, 0, class27.field444);
        class283.field4723.method1214(class268.field4428, (int[]) null);
        class136.field2083.method1214(class268.field4428, (int[]) null);
        class89.field1474.method1214(class268.field4428, (int[]) null);
        if (class255.field4184) {
            class179.field2806 = method337(true, class7.field86, arg1, 0);
            for (int var2 = 0; var2 < class179.field2806.length; var2++) {
                class179.field2806[var2].method1266();
            }
        }
        class256 var3 = class308.method2154(0, arg1, arg0 - 3199, class282.field4698);
        var3.method1809();
        if (class255.field4184) {
            class117.field1831 = new class130(var3);
        } else {
            class117.field1831 = var3;
        }
        class256[] var4 = class107.method762(0, 32767, class188.field2966, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1809();
        }
        if (class255.field4184) {
            class261.field4260 = new class148[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class261.field4260[var6] = new class130(var4[var6]);
            }
        } else {
            class261.field4260 = var4;
        }
        int var7 = (int) ((double) arg0 * Math.random()) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class13.field218.length; var11++) {
            class13.field218[var11].method1812(var8 + var10, var7 + var10, var9 + var10);
        }
        if (class255.field4184) {
            class241.field3983 = new class148[class13.field218.length];
            for (int var12 = 0; var12 < class13.field218.length; var12++) {
                class241.field3983[var12] = new class130(class13.field218[var12]);
            }
        } else {
            class241.field3983 = class13.field218;
        }
    }
}
