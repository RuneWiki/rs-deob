import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class175 implements Runnable {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lgf;")
    public volatile class173[] field3065 = new class173[2];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
    public volatile boolean field3072 = false;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
    public volatile boolean field3066 = false;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lqe;")
    public static class168 field3071 = class66.method448("Konfig geladen)3", 116);

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lqe;")
    public static class168 field3070 = class66.method448("sl_flags", -114);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    public static int[] field3063 = new int[4096];

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lqe;")
    private static class168 field3077;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lqe;")
    public static class168 field3074;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Lqe;")
    private static class168 field3075;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lqe;")
    public static class168 field3078;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Ljh;")
    public static class2 field3076;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lgj;")
    public class239 field3067;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public static boolean field3068;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[Lgd;")
    public static class65[] field3062;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field3075 = null;
        field3077 = null;
        if (arg0 != -1) {
            field3076 = null;
        }
        field3078 = null;
        field3070 = null;
        field3076 = null;
        field3063 = null;
        field3062 = null;
        field3071 = null;
        field3074 = null;
    }

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
    public final void run() {
        this.field3066 = true;
        try {
            while (!this.field3072) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class173 var2 = this.field3065[var1];
                    if (var2 != null) {
                        var2.method1143(8);
                    }
                }
                class38.method259(10L, 31644);
                class229.method1477((byte) -122, null, this.field3067);
            }
        } catch (Exception var9) {
            class112.method763(var9, null, 115);
        } finally {
            Object var6 = null;
            this.field3066 = false;
        }
        field3064++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method1159(byte arg0) {
        field3073++;
        for (int var1 = 0; var1 < class95.field1502; var1++) {
            int var10002 = class101.field1596[var1]--;
            if (class101.field1596[var1] >= -10) {
                class28 var3 = class152.field2642[var1];
                if (var3 == null) {
                    var3 = class28.method188(class127.field2111, class221.field3799[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class101.field1596[var1] += var3.method187();
                    class152.field2642[var1] = var3;
                }
                if (class101.field1596[var1] < 0) {
                    int var10;
                    if (class237.field4056[var1] == 0) {
                        var10 = class62.field847;
                    } else {
                        int var4 = (class237.field4056[var1] & 0xFF) * 128;
                        int var5 = class237.field4056[var1] >> 16 & 0xFF;
                        int var6 = class237.field4056[var1] >> 8 & 0xFF;
                        int var7 = var5 * 128 + 64 - class7.field85.field190;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class7.field85.field166;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var7 - 128;
                        if (var4 < var9) {
                            class101.field1596[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class166.field2828 / var4;
                    }
                    if (var10 > 0) {
                        class220 var11 = var3.method186().method1452(class108.field1736);
                        class24 var12 = class24.method139(var11, 100, var10);
                        var12.method124(class64.field878[var1] - 1);
                        class86.field1341.method507(var12);
                    }
                    class101.field1596[var1] = -100;
                }
            } else {
                class95.field1502--;
                for (int var2 = var1; var2 < class95.field1502; var2++) {
                    class221.field3799[var2] = class221.field3799[var2 + 1];
                    class152.field2642[var2] = class152.field2642[var2 + 1];
                    class64.field878[var2] = class64.field878[var2 + 1];
                    class101.field1596[var2] = class101.field1596[var2 + 1];
                    class237.field4056[var2] = class237.field4056[var2 + 1];
                }
                var1--;
            }
        }
        if (class147.field2574 && !class212.method1368(false)) {
            if (class93.field1464 != 0 && class230.field3908 != -1) {
                class192.method1247(class230.field3908, class159.field2749, (byte) -77, class93.field1464, 0, false);
            }
            class147.field2574 = false;
        } else if (class93.field1464 != 0 && class230.field3908 != -1 && !class212.method1368(false)) {
            class87.field1348.method672(80, 238);
            class172.field2988++;
            class87.field1348.method770(class230.field3908, (byte) -10);
            class230.field3908 = -1;
        }
        if (arg0 != 70) {
            method1158(-127);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3063[var0] = class31.method205(var0, 25);
        }
        field3077 = class66.method448(" is already on your friend list)3", 39);
        field3074 = field3077;
        field3075 = class66.method448("Loading title screen )2 ", 17);
        field3078 = field3075;
        field3076 = new class2(50);
    }
}
