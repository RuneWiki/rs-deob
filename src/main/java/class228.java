import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class228 implements class577 {

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "Lrda;")
    private class467 field3087 = new class467(128);

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "[I")
    public int[] field3081 = new int[class182.field2489.field5883];

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "[I")
    private int[] field3075 = new int[class182.field2489.field5883];

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "[C")
    public static char[] field3076 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "F")
    public static float field3077;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
    public final void method1463(int arg0, int arg1, int arg2) {
        field3082++;
        if (arg0 != -17566) {
            return;
        }
        class186 var4 = class229.field3089.method226(arg2, (byte) -78);
        int var5 = var4.field2607;
        int var6 = var4.field2601;
        int var7 = var4.field2604;
        int var8 = class338.field4139[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1465(arg0 ^ 0xFFFF869C, var5, ~var9 & this.field3075[var5] | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V")
    public final void method1464(int arg0, int arg1, int arg2) {
        field3078++;
        if (arg2 >= -65) {
            return;
        }
        class186 var4 = class229.field3089.method226(arg1, (byte) 122);
        int var5 = var4.field2607;
        int var6 = var4.field2601;
        int var7 = var4.field2604;
        int var8 = class338.field4139[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1466(arg0 << var6 & var9 | this.field3081[var5] & ~var9, 53, var5);
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(III)V")
    public final void method1465(int arg0, int arg1, int arg2) {
        field3079++;
        this.field3075[arg1] = arg2;
        class599 var4 = (class599) this.field3087.method2616((long) arg1, (byte) -122);
        if (arg0 != 15870) {
            return;
        }
        if (var4 == null) {
            class599 var5 = new class599(4611686018427387905L);
            this.field3087.method2619(var5, (long) arg1, -1);
        } else if (var4.field7616 != 4611686018427387905L) {
            var4.field7616 = class502.method2786(-7114) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(III)V")
    public final void method1466(int arg0, int arg1, int arg2) {
        this.field3081[arg2] = arg0;
        field3085++;
        class599 var4 = (class599) this.field3087.method2616((long) arg2, (byte) -82);
        if (var4 == null) {
            class599 var5 = new class599(class502.method2786(-7114) + 500L);
            this.field3087.method2619(var5, (long) arg2, -1);
        } else {
            var4.field7616 = class502.method2786(-7114) + 500L;
        }
        if (arg1 != 53) {
            this.field3075 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)I")
    public final int method1467(boolean arg0, int arg1) {
        field3086++;
        class186 var3 = class229.field3089.method226(arg1, (byte) -120);
        int var4 = var3.field2607;
        int var5 = var3.field2601;
        if (arg0) {
            return 28;
        } else {
            int var6 = var3.field2604;
            int var7 = class338.field4139[var6 - var5];
            return this.field3081[var4] >> var5 & var7;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public final void method1468(byte arg0) {
        field3084++;
        if (arg0 != -37) {
            field3076 = null;
        }
        for (int var2 = 0; var2 < class182.field2489.field5883; var2++) {
            class329 var3 = class182.field2489.method2572(-92, var2);
            if (var3 != null && var3.field4026 == 0) {
                this.field3075[var2] = 0;
                this.field3081[var2] = 0;
            }
        }
        this.field3087 = new class467(128);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
    public final int method1469(int arg0, int arg1) {
        int var3 = -96 / ((arg1 + 1) / 56);
        field3080++;
        return this.field3081[arg0];
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BZ)I")
    public final int method1470(byte arg0, boolean arg1) {
        int var3 = -127 / ((24 - arg0) / 45);
        field3083++;
        long var4 = class502.method2786(-7114);
        for (class599 var6 = arg1 ? (class599) this.field3087.method2610((byte) -81) : (class599) this.field3087.method2620(0); var6 != null; var6 = (class599) this.field3087.method2620(0)) {
            if (var4 > (var6.field7616 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var6.field7616 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field4108;
                    this.field3081[var7] = this.field3075[var7];
                    var6.method1946(-10364);
                    return var7;
                }
                var6.method1946(-10364);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method1471(boolean arg0) {
        if (!arg0) {
            method1471(false);
        }
        field3076 = null;
    }
}
