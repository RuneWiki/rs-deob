import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hg")
public class class76 {

    @OriginalMember(owner = "hg", name = "i", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "hg", name = "b", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "hg", name = "f", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "hg", name = "d", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "hg", name = "e", descriptor = "Llf;")
    public static class109 field1459 = class35.method275("Clientscript error )2 check log for details", 2);

    @OriginalMember(owner = "hg", name = "g", descriptor = "I")
    public static volatile int field1461 = 0;

    @OriginalMember(owner = "hg", name = "a", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "hg", name = "h", descriptor = "Lja;")
    public static class86 field1462 = new class86(new byte[5000]);

    @OriginalMember(owner = "hg", name = "k", descriptor = "Llf;")
    public static class109 field1465 = class35.method275("::fpsoff", 2);

    @OriginalMember(owner = "hg", name = "j", descriptor = "I")
    public static int field1464 = 0;

    @OriginalMember(owner = "hg", name = "l", descriptor = "Leh;")
    public static class49 field1466 = new class49(32);

    @OriginalMember(owner = "hg", name = "n", descriptor = "Lrc;")
    public static class160 field1468 = new class160(500);

    @OriginalMember(owner = "hg", name = "o", descriptor = "Z")
    public static boolean field1469 = false;

    @OriginalMember(owner = "hg", name = "c", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "hg", name = "m", descriptor = "[I")
    public static int[] field1467;

    @OriginalMember(owner = "hg", name = "a", descriptor = "(I)V")
    public static void method480(int arg0) {
        field1468 = null;
        field1462 = null;
        if (arg0 < -114) {
            field1465 = null;
            field1466 = null;
            field1467 = null;
            field1459 = null;
        }
    }

    @OriginalMember(owner = "hg", name = "a", descriptor = "(Lnd;ZZ)V")
    public static final void method481(class125 arg0, boolean arg1, boolean arg2) {
        if (class199.field3800 != null) {
            try {
                class199.field3800.method915((byte) -70);
            } catch (Exception var8) {
            }
            class199.field3800 = null;
        }
        class199.field3800 = arg0;
        field1457++;
        class41.method297(-1, arg1);
        class105.field2092.field1773 = 0;
        class79.field1568 = 0;
        class103.field2031 = null;
        class150.field2895 = null;
        while (true) {
            class180 var3 = (class180) class134.field2571.method338((byte) 66);
            if (var3 == null) {
                while (true) {
                    class180 var4 = (class180) class13.field211.method338((byte) 114);
                    if (var4 == null) {
                        if (!arg2) {
                            return;
                        }
                        if (class75.field1453 != 0) {
                            try {
                                class86 var5 = new class86(4);
                                var5.method568(-13488, 4);
                                var5.method568(-13488, class75.field1453);
                                var5.method557(9698, 0);
                                class199.field3800.method908(-126, 0, 4, var5.field1808);
                            } catch (IOException var7) {
                                try {
                                    class199.field3800.method915((byte) -119);
                                } catch (Exception var6) {
                                }
                                class199.field3800 = null;
                                class75.field1428++;
                            }
                        }
                        client.field681 = 0;
                        class173.field3232 = class123.method880(false);
                        return;
                    }
                    class5.field66.method736((byte) -89, var4);
                    class22.field495.method339(var4.field1381, false, var4);
                    class26.field550++;
                    class5.field79--;
                }
            }
            class149.field2880.method339(var3.field1381, false, var3);
            class150.field2889++;
            class163.field3044--;
        }
    }

    @OriginalMember(owner = "hg", name = "<init>", descriptor = "()V")
    public class76() {
    }

    @OriginalMember(owner = "hg", name = "<init>", descriptor = "(Lhg;)V")
    public class76(class76 arg0) {
        this.field1463 = arg0.field1463;
        this.field1456 = arg0.field1456;
        this.field1460 = arg0.field1460;
        this.field1458 = arg0.field1458;
    }

    @OriginalMember(owner = "hg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method482(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class50.field1023 * arg0 + class185.field3528 * arg2 >> 16;
        int var5 = class50.field1023 * arg2 - class185.field3528 * arg0 >> 16;
        int var6 = class142.field2743 * arg1 + class118.field2330 * var5 >> 16;
        int var7 = class118.field2330 * arg1 - class142.field2743 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class130.field2520;
            int var9 = (var7 << 9) / var6 + class4.field46;
            return var8 >= class24.field543 && var8 <= class193.field3696 && var9 >= class44.field919 && var9 <= class128.field2482;
        } else {
            return false;
        }
    }
}
