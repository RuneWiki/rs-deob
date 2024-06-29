import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class224 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lof;")
    private class620 field2572 = new class620(16);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Loh;")
    private class404 field2570;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lbq;")
    public static class289 field2568 = new class289();

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lpia;")
    public static class94 field2569 = new class94(3, 1);

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lpia;")
    public static class94 field2575 = new class94(30, 7);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lsk;")
    public final class621 method1300(int arg0, int arg1) {
        field2574++;
        class620 var3 = this.field2572;
        class621 var4;
        synchronized (this.field2572) {
            var4 = (class621) this.field2572.method3538((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field2570;
        byte[] var6;
        synchronized (this.field2570) {
            var6 = this.field2570.method2481(30, arg0, (byte) 106);
        }
        if (arg1 != 2) {
            return null;
        }
        class621 var7 = new class621();
        if (var6 != null) {
            var7.method3555(-1, new class244(var6));
        }
        class620 var8 = this.field2572;
        synchronized (this.field2572) {
            this.field2572.method3537(-111, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1301(int arg0) {
        if (arg0 == 0) {
            field2575 = null;
            field2569 = null;
            field2568 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
    public final void method1302(int arg0, int arg1) {
        if (arg1 != -16382) {
            field2576 = -125;
        }
        class620 var3 = this.field2572;
        synchronized (this.field2572) {
            this.field2572.method3539((byte) -99, arg0);
        }
        field2567++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public final void method1303(boolean arg0) {
        class620 var2 = this.field2572;
        synchronized (this.field2572) {
            this.field2572.method3549(0);
            if (arg0) {
                field2571 = 19;
            }
        }
        field2566++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method1304(int arg0) {
        int var2 = -13 / ((arg0 - 16) / 58);
        class620 var3 = this.field2572;
        synchronized (this.field2572) {
            this.field2572.method3541(-647);
        }
        field2573++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLkw;)[I")
    public static final int[] method1305(byte arg0, class249 arg1) {
        field2565++;
        class244 var2 = new class244(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method1460(10, 24710);
        var2.method1421(var3[0], -20798);
        var2.method1421(var3[1], -20798);
        var2.method1421(var3[2], -20798);
        var2.method1421(var3[3], -20798);
        if (arg0 >= -121) {
            method1301(74);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method1421((int) (Math.random() * 9.9999999E7D), -20798);
        }
        var2.method1446((int) (Math.random() * 9.9999999E7D), true);
        var2.method1455(122, class730.field10212, class676.field9575);
        arg1.field3016.method1430(var2.field2903, (byte) 84, 0, var2.field2912);
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lnb;ILoh;)V")
    public class224(class301 arg0, int arg1, class404 arg2) {
        this.field2570 = arg2;
        this.field2570.method2482(0, 30);
    }
}
