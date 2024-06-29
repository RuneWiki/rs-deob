import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class90 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lmh;")
    public static class62 field1418 = class201.method1405(true, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1422 = -1;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lmh;")
    public static class62 field1423 = class201.method1405(true, "www)2wtrc");

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lmh;")
    private static class62 field1420 = class201.method1405(true, "Connecting to update server");

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1425 = -1;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lmh;")
    public static class62 field1424 = field1420;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Z")
    public static boolean field1427 = true;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 13)
    public static final void method673(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1426++;
        class250.method1744(class164.field2674, (byte) 96);
        class263.field4431++;
        if (class215.field3652 && class205.field3453) {
            int var1 = class275.field4725;
            int var2 = var1 - class72.field1101;
            int var3 = class221.field3795;
            int var4 = var3 - class209.field3544;
            if (var4 < class232.field4005) {
                var4 = class232.field4005;
            }
            if ((class164.field2674.field3126 + var4) > (class232.field4005 + class80.field1342.field3126)) {
                var4 = class232.field4005 + class80.field1342.field3126 - class164.field2674.field3126;
            }
            int var5 = class164.field2674.field3184;
            int var6 = class80.field1342.field3188 + var4 - class232.field4005;
            int var7 = var4 - class264.field4442;
            if (var2 < class131.field2139) {
                var2 = class131.field2139;
            }
            if ((class164.field2674.field3190 + var2) > (class131.field2139 + class80.field1342.field3190)) {
                var2 = class131.field2139 + class80.field1342.field3190 - class164.field2674.field3190;
            }
            int var8 = var2 - class53.field780;
            if (class263.field4431 > class164.field2674.field3081 && (var8 > var5 || var8 < (-var5) || var5 < var7 || var7 < (-var5))) {
                class78.field1300 = true;
            }
            int var9 = var2 + class80.field1342.field3073 - class131.field2139;
            if (class164.field2674.field3096 != null && class78.field1300) {
                class161 var10 = new class161();
                var10.field2598 = class164.field2674.field3096;
                var10.field2606 = var6;
                var10.field2597 = class164.field2674;
                var10.field2603 = var9;
                class262.method1818(var10, -123);
            }
            if (class127.field2106 == 0) {
                if (class78.field1300) {
                    if (class164.field2674.field3088 != null) {
                        class161 var11 = new class161();
                        var11.field2606 = var6;
                        var11.field2597 = class164.field2674;
                        var11.field2603 = var9;
                        var11.field2598 = class164.field2674.field3088;
                        var11.field2611 = class26.field301;
                        class262.method1818(var11, -126);
                    }
                    if (class26.field301 != null && client.method2053(class164.field2674) != null) {
                        class170.field2772.method1693(64, false);
                        class170.field2772.method700(class164.field2674.field3142, -1745);
                        class170.field2772.method692(class164.field2674.field3104, -1640588568);
                        class252.field4279++;
                        class170.field2772.method747((byte) 120, class26.field301.field3104);
                        class170.field2772.method711(class26.field301.field3142, -253);
                    }
                } else if ((class240.field4090 == 1 || class195.method1373((byte) 66, class195.field3293 - 1)) && class195.field3293 > 2) {
                    class96.method763(18141);
                } else if (class195.field3293 > 0) {
                    class36.method237(-1);
                }
                class164.field2674 = null;
            }
        } else if (class263.field4431 > 1) {
            class164.field2674 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Lkb;", line = 137)
    public static final class82 method674(int arg0) {
        field1419++;
        int var1 = class184.field2940[0] * class15.field132[0];
        byte[] var2 = class42.field645[0];
        int[] var3 = new int[var1];
        if (arg0 != 30000) {
            field1427 = false;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class235.field4048[class234.method1648(255, var2[var4])];
        }
        class82 var5 = new class82(class41.field626, class189.field3005, class183.field2931[0], class113.field1878[0], class15.field132[0], class184.field2940[0], var3);
        class135.method1020(-106);
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[B", line = 168)
    public static final synchronized byte[] method675(int arg0, int arg1) {
        field1416++;
        if (arg1 == 100 && class30.field417 > 0) {
            byte[] var2 = class158.field2548[--class30.field417];
            class158.field2548[class30.field417] = null;
            return var2;
        } else if (arg1 == 5000 && class292.field4963 > 0) {
            byte[] var3 = class269.field4571[--class292.field4963];
            class269.field4571[class292.field4963] = null;
            return var3;
        } else if (arg0 != -17841) {
            return (byte[]) null;
        } else if (arg1 == 30000 && class134.field2184 > 0) {
            byte[] var4 = class171.field2785[--class134.field2184];
            class171.field2785[class134.field2184] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V", line = 212)
    public static final void method676(int arg0) {
        int var1 = -64 / ((arg0 + 66) / 50);
        field1417++;
        class163.field2647 = null;
        class40.method274();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 229)
    public static void method677(byte arg0) {
        field1424 = null;
        field1418 = null;
        field1420 = null;
        field1423 = null;
        if (arg0 > -3) {
            field1425 = -109;
        }
    }
}
