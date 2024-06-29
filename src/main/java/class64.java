import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class64 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Leh;")
    public static class47 field1391 = class195.method1282((byte) -4, ":chalreq:");

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Leh;")
    public static class47 field1395 = class195.method1282((byte) -4, "<col=ff3000>");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Leh;")
    public static class47 field1405 = class195.method1282((byte) -4, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Leh;")
    public static class47 field1408 = class195.method1282((byte) -4, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "J")
    public long field1396;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Ldh;")
    public static class38 field1407;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lkb;")
    public class92 field1397;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lkb;")
    public class92 field1401;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lkb;")
    public class92 field1410;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
    public static int[] field1390;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "[Ldh;")
    public static class38[] field1399;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method534(boolean arg0) {
        field1408 = null;
        field1391 = null;
        field1395 = null;
        field1405 = null;
        field1399 = null;
        field1390 = null;
        if (!arg0) {
            field1408 = null;
        }
        field1407 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)I")
    public static final int method535(int arg0, int arg1, byte arg2) {
        int var3 = 100 / ((arg2 + 78) / 44);
        field1403++;
        if (arg0 > arg1) {
            int var4 = arg1;
            arg1 = arg0;
            arg0 = var4;
        }
        while (arg0 != 0) {
            int var5 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var5;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIB)V")
    public static final void method536(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = -4 % ((arg3 + 5) / 36);
        field1402++;
        class61 var5 = class32.method278((byte) -101, arg1, arg0);
        if (var5 != null && var5.field1294 != null) {
            class43 var6 = new class43();
            var6.field859 = var5;
            var6.field871 = var5.field1294;
            class188.method1242(var6, 124);
        }
        class44.field889 = arg1;
        class196.field3811 = arg2;
        class201.field3917 = arg0;
        class78.field1688 = true;
        class20.method204(var5, (byte) -5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ldh;I)V")
    public static final void method537(class38 arg0, int arg1) {
        field1400++;
        short var2 = 256;
        for (int var3 = 0; var3 < class3.field47.length; var3++) {
            class3.field47[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class3.field47[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != -10815) {
            return;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class68.field1460[var15] = (class3.field47[var15 - 1] + class3.field47[var15 - 128] + class3.field47[var15 + 1] + class3.field47[var15 + 128]) / 4;
                }
            }
            int[] var13 = class3.field47;
            class3.field47 = class68.field1460;
            class68.field1460 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field750; var7++) {
            for (int var8 = 0; var8 < arg0.field749; var8++) {
                if (arg0.field753[var6++] != 0) {
                    int var9 = var7 + arg0.field747 + 16;
                    int var10 = arg0.field748 + var8 + 16;
                    int var11 = var10 + (var9 << 7);
                    class3.field47[var11] = 0;
                }
            }
        }
    }
}
