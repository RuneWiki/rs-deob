import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class120 implements Runnable {

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[Lig;")
    public volatile class160[] field1884 = new class160[2];

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Z")
    public volatile boolean field1880 = false;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
    public volatile boolean field1878 = false;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[S")
    public static short[] field1882 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Llh;")
    public static class364 field1887 = new class364(200);

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[F")
    public static float[] field1888 = new float[16];

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lci;")
    public class312 field1883;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 3)
    public static final void method870(int arg0) {
        field1879++;
        int var1 = class294.field4197 * 128 + 64;
        int var2 = class311.field4453 * 128 + 64;
        int var3 = 56 % ((43 - arg0) / 34);
        int var4 = class259.method1646(var2, var1, 851701031, class434.field6317) - class114.field1805;
        if (class23.field419 < 100) {
            if (class430.field6262 < var1) {
                class430.field6262 += (var1 - class430.field6262) * class23.field419 / 1000 + class274.field3960;
                if (var1 < class430.field6262) {
                    class430.field6262 = var1;
                }
            }
            if (var4 > class207.field2983) {
                class207.field2983 += (var4 - class207.field2983) * class23.field419 / 1000 + class274.field3960;
                if (class207.field2983 > var4) {
                    class207.field2983 = var4;
                }
            }
            if (var1 < class430.field6262) {
                class430.field6262 -= (class430.field6262 - var1) * class23.field419 / 1000 + class274.field3960;
                if (var1 > class430.field6262) {
                    class430.field6262 = var1;
                }
            }
            if (var4 < class207.field2983) {
                class207.field2983 -= (class207.field2983 - var4) * class23.field419 / 1000 + class274.field3960;
                if (class207.field2983 < var4) {
                    class207.field2983 = var4;
                }
            }
            if (class291.field4175 < var2) {
                class291.field4175 += (var2 - class291.field4175) * class23.field419 / 1000 + class274.field3960;
                if (var2 < class291.field4175) {
                    class291.field4175 = var2;
                }
            }
            if (var2 < class291.field4175) {
                class291.field4175 -= class274.field3960 + ((class291.field4175 - var2) * class23.field419 / 1000);
                if (class291.field4175 < var2) {
                    class291.field4175 = var2;
                }
            }
        } else {
            class291.field4175 = class311.field4453 * 128 + 64;
            class430.field6262 = class294.field4197 * 128 + 64;
            class207.field2983 = class259.method1646(class291.field4175, class430.field6262, 851701031, class434.field6317) - class114.field1805;
        }
        int var5 = class303.field4339 * 128 + 64;
        int var6 = class520.field7637 * 128 + 64;
        int var7 = class259.method1646(var6, var5, 851701031, class434.field6317) - class438.field6389;
        int var8 = var5 - class430.field6262;
        int var9 = var7 - class207.field2983;
        int var10 = var6 - class291.field4175;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        int var13 = (int) (-2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 0x3FFF;
        if (var12 < 1024) {
            var12 = 1024;
        }
        if (var12 > 3072) {
            var12 = 3072;
        }
        if (class310.field4446 < var12) {
            class310.field4446 += (var12 - class310.field4446 >> 3) * class497.field7234 / 1000 + class131.field2025 << 3;
            if (var12 < class310.field4446) {
                class310.field4446 = var12;
            }
        }
        if (class310.field4446 > var12) {
            class310.field4446 -= (class310.field4446 - var12 >> 3) * class497.field7234 / 1000 + class131.field2025 << 3;
            if (class310.field4446 < var12) {
                class310.field4446 = var12;
            }
        }
        int var14 = var13 - class320.field4578;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (var15 > 0) {
            class320.field4578 += class497.field7234 * var15 / 1000 + class131.field2025 << 3;
            class320.field4578 &= 0x3FFF;
        }
        if (var15 < 0) {
            class320.field4578 -= -var15 * class497.field7234 / 1000 + class131.field2025 << 3;
            class320.field4578 &= 0x3FFF;
        }
        int var16 = var13 - class320.field4578;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        class103.field1642 = 0;
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            class320.field4578 = var13;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 174)
    public static void method871(boolean arg0) {
        field1887 = null;
        field1882 = null;
        if (arg0) {
            method873(116, (byte) 17);
        }
        field1888 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILhh;)I", line = 186)
    public static final int method872(int arg0, class84 arg1) {
        field1881++;
        int var2 = 0;
        if (arg1.method682(0, class170.field2553)) {
            var2++;
        }
        if (arg1.method682(0, class281.field4021)) {
            var2++;
        }
        if (arg1.method682(0, class127.field1929)) {
            var2++;
        }
        if (arg1.method682(0, class398.field5854)) {
            var2++;
        }
        if (arg1.method682(arg0, class474.field6988)) {
            var2++;
        }
        if (arg1.method682(0, class11.field176)) {
            var2++;
        }
        if (arg1.method682(0, class274.field3961)) {
            var2++;
        }
        if (arg1.method682(0, class265.field3829)) {
            var2++;
        }
        if (arg1.method682(arg0, class439.field6405)) {
            var2++;
        }
        if (arg1.method682(arg0, class220.field3169)) {
            var2++;
        }
        if (arg1.method682(0, class277.field3995)) {
            var2++;
        }
        if (arg1.method682(0, class292.field4179)) {
            var2++;
        }
        if (arg1.method682(0, class91.field1502)) {
            var2++;
        }
        if (arg1.method682(0, class182.field2746)) {
            var2++;
        }
        if (arg1.method682(arg0, class160.field2430)) {
            var2++;
        }
        if (arg1.method682(0, class17.field259)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V", line = 250)
    public static final void method873(int arg0, byte arg1) {
        field1885++;
        class434 var2 = class483.method2888(arg0, 36, 14);
        var2.method2628(122);
        if (arg1 != -90) {
            method871(true);
        }
    }

    @OriginalMember(owner = "client!r", name = "run", descriptor = "()V", line = 263)
    public final void run() {
        field1886++;
        this.field1878 = true;
        try {
            while (!this.field1880) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class160 var2 = this.field1884[var1];
                    if (var2 != null) {
                        var2.method1153(false);
                    }
                }
                class185.method1285(116, 10L);
                class444.method2701(this.field1883, (byte) 98, null);
            }
        } catch (Exception var9) {
            class169.method1200(null, var9, (byte) -113);
        } finally {
            Object var6 = null;
            this.field1878 = false;
        }
    }
}
