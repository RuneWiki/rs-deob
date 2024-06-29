import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class460 implements Runnable {

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[Lfe;")
    public volatile class235[] field6752 = new class235[2];

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
    public volatile boolean field6753 = false;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Z")
    public volatile boolean field6746 = false;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field6747 = 0;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field6750 = 0;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lhu;")
    public class469 field6749;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lni;")
    public static class87 field6748;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method2761(int arg0) {
        field6748 = null;
        if (arg0 != 1) {
            field6747 = -65;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2762(class496 arg0, int arg1) {
        field6754++;
        int var2 = class107.field1519;
        int var3 = class439.field6536;
        int var4 = class455.field6686;
        int var5 = class148.field2128;
        int var6 = -10660793;
        arg0.method2952(var4, var5, var2, var6, (byte) -53, var3);
        arg0.method2952(var4 - 2, 16, var2 + 1, -16777216, (byte) -53, var3 + 1);
        arg0.method2956(var2 + 1, -20293, -16777216, var4 - 2, var5 + -19, var3 + 18);
        class104.field1497.method235(class167.field2428.method2335((byte) -100, class288.field4292), var6, var2 + 3, arg1, 29451, var3 + 14);
        int var7 = class346.field5419.method812(false);
        int var8 = class346.field5419.method811(false);
        int var9 = 0;
        for (class32 var10 = (class32) class96.field1395.method1970(64); var10 != null; var10 = (class32) class96.field1395.method1960(24)) {
            int var11 = (class12.field201 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && (var2 + var4) > var7 && var11 - 13 < var8 && (var11 + 3) > var8 && var10.field489) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class84.method550(108, var10.field485)) {
                var13 = class84.field1154.method2451(arg1, (int) var10.field493).field863;
            } else if (var10.field498 != -1) {
                var13 = class84.field1154.method2451(arg1, var10.field498).field863;
            } else if (class111.method730(var10.field485, (byte) -40)) {
                class194 var16 = class151.field2174[(int) var10.field493];
                if (var16 != null) {
                    class329 var17 = var16.field2768;
                    if (var17.field5068 != null) {
                        var17 = var17.method2125(class36.field583, false);
                    }
                    if (var17 != null) {
                        var13 = var17.field5035;
                    }
                }
            } else if (class441.method2665(var10.field485, -26)) {
                Object var14 = null;
                class130 var15;
                if (var10.field485 == 1006) {
                    var15 = class56.field755.method2031(-122, (int) var10.field493);
                } else {
                    var15 = class56.field755.method2031(126, (int) (var10.field493 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field1823 != null) {
                    var15 = var15.method832((byte) -128, class36.field583);
                }
                if (var15 != null) {
                    var13 = var15.field1870;
                }
            }
            String var18 = class82.method528(arg1 + 89, var10);
            if (var13 != null) {
                var18 = var18 + class156.method1011(var13, ~arg1);
            }
            class104.field1497.method241(var11, var18, var2 + 3, -18066, class459.field6743, class55.field748, var12, 0);
            var9++;
            if (var10.field487) {
                class285.field4250.method1332(class472.field6901.method45(var18, (byte) -75) + var2 + 5, var11 + -12);
            }
        }
        class407.method2485(class107.field1519, (byte) 55, class439.field6536, class455.field6686, class148.field2128);
    }

    @OriginalMember(owner = "client!tj", name = "run", descriptor = "()V")
    public final void run() {
        field6751++;
        this.field6746 = true;
        try {
            while (!this.field6753) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class235 var2 = this.field6752[var1];
                    if (var2 != null) {
                        var2.method1591(12465);
                    }
                }
                class106.method710(10L, (byte) 6);
                class194.method1368(null, 83, this.field6749);
            }
        } catch (Exception var9) {
            class438.method2644(null, -1, var9);
        } finally {
            Object var6 = null;
            this.field6746 = false;
        }
    }
}
