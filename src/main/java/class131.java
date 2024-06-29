import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class131 extends class163 {

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[J")
    private long[] field2713 = new long[10];

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    private int field2721 = 1;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    private int field2709 = 0;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    private int field2716 = 256;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "J")
    private long field2715 = class30.method224((byte) 95);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lcd;")
    public static class23 field2711 = class54.method414("Clientscript error )2 check log for details", -1);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[Lcd;")
    public static class23[] field2717 = new class23[100];

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lcd;")
    public static class23 field2710 = class54.method414("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", -1);

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field2718 = 0;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lcd;")
    public static class23 field2714 = class54.method414("Bitte warten Sie eine Minute", -1);

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    private int field2719;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
    public static final void method839(int arg0, int arg1, int arg2, int arg3) {
        field2712++;
        if (arg0 != -3846) {
            method842(-87);
        }
        if (arg2 < 128 || arg3 < 128 || arg2 > 13056 || arg3 > 13056) {
            class5.field94 = -1;
            class132.field2726 = -1;
            return;
        }
        int var4 = class203.method1330((byte) -88, arg3, arg2, class59.field1385) - arg1;
        int var5 = arg2 - class119.field2452;
        int var6 = var4 - class122.field2530;
        int var7 = class140.field2878[class181.field3574];
        int var8 = class140.field2878[class105.field2266];
        int var9 = class140.field2891[class105.field2266];
        int var10 = arg3 - class115.field2404;
        int var11 = class140.field2891[class181.field3574];
        int var12 = var7 * var10 + var5 * var11 >> 16;
        int var13 = var10 * var11 - var5 * var7 >> 16;
        int var15 = var6 * var9 - var8 * var13 >> 16;
        int var16 = var6 * var8 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class132.field2726 = (var15 << 9) / var16 + 167;
            class5.field94 = (var12 << 9) / var16 + 256;
        } else {
            class132.field2726 = -1;
            class5.field94 = -1;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static final void method840(byte arg0) {
        field2707++;
        class110.field2332.method997(false);
        class25.field545.method997(false);
        class28.field607.method997(false);
        if (arg0 <= 23) {
            method840((byte) 55);
        }
        class134.field2781.method997(false);
        class51.field1220.method997(false);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)[B")
    public static final byte[] method841(byte[] arg0, byte arg1) {
        if (arg1 < 4) {
            method841(null, (byte) 90);
        }
        class189 var2 = new class189(arg0);
        field2708++;
        int var3 = var2.method1202(-55);
        int var4 = var2.method1190(-4);
        if (var4 < 0 || class121.field2505 != 0 && class121.field2505 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1214(var4, -1, 0, var7);
            return var7;
        } else {
            int var5 = var2.method1190(-4);
            if (var5 < 0 || class121.field2505 != 0 && class121.field2505 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class33.method243(var6, var5, arg0, var4, 9);
            } else {
                class111.field2352.method721((byte) -56, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I")
    public final int method535(int arg0, int arg1, int arg2) {
        int var4 = this.field2716;
        this.field2716 = 300;
        field2722++;
        int var5 = this.field2721;
        this.field2721 = 1;
        this.field2715 = class30.method224((byte) 95);
        if (arg1 != 1000) {
            this.field2716 = 83;
        }
        if (this.field2713[this.field2719] == 0L) {
            this.field2721 = var5;
            this.field2716 = var4;
        } else if (this.field2715 > this.field2713[this.field2719]) {
            this.field2716 = (int) ((long) (arg0 * 2560) / (this.field2715 - this.field2713[this.field2719]));
        }
        if (this.field2716 < 25) {
            this.field2716 = 25;
        }
        if (this.field2716 > 256) {
            this.field2716 = 256;
            this.field2721 = (int) ((long) arg0 - (this.field2715 - this.field2713[this.field2719]) / 10L);
        }
        if (this.field2721 > arg0) {
            this.field2721 = arg0;
        }
        this.field2713[this.field2719] = this.field2715;
        this.field2719 = (this.field2719 + 1) % 10;
        if (this.field2721 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2713[var6] != 0L) {
                    this.field2713[var6] += this.field2721;
                }
            }
        }
        if (this.field2721 < arg2) {
            this.field2721 = arg2;
        }
        int var7 = 0;
        class53.method409((long) this.field2721, arg1 - 26391);
        while (this.field2709 < 256) {
            this.field2709 += this.field2716;
            var7++;
        }
        this.field2709 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public final void method536(byte arg0) {
        field2720++;
        int var2 = 0;
        if (arg0 != 61) {
            method840((byte) 89);
        }
        while (var2 < 10) {
            this.field2713[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method842(int arg0) {
        field2710 = null;
        field2717 = null;
        field2714 = null;
        field2711 = null;
        if (arg0 != 256) {
            field2714 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class131() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2713[var1] = this.field2715;
        }
    }
}
