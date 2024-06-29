import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class267 extends class134 {

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[I")
    public int[] field4450;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "[Z")
    public boolean[] field4452;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "[I")
    public int[] field4451;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "[[I")
    public int[][] field4444;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field4453 = 0;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static final void method1882(int arg0) {
        if (class148.field2442 < class148.field2444) {
            class148.field2442 = (float) ((double) class148.field2442 / 30.0D + (double) class148.field2442);
            if (class148.field2444 < class148.field2442) {
                class148.field2442 = class148.field2444;
            }
            class245.method1753(12627);
        } else if (class148.field2444 < class148.field2442) {
            class148.field2442 = (float) ((double) class148.field2442 - (double) class148.field2442 / 30.0D);
            if (class148.field2444 > class148.field2442) {
                class148.field2442 = class148.field2444;
            }
            class245.method1753(12627);
        }
        field4449++;
        if (class306.field4951 != -1 && class253.field4282 != -1) {
            int var1 = class253.field4282 - class219.field3701;
            int var2 = class306.field4951 - class122.field2044;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class219.field3701 -= -var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class122.field2044 += var2;
            if (var2 == 0 && var1 == 0) {
                class306.field4951 = -1;
                class253.field4282 = -1;
            }
            class245.method1753(12627);
        }
        if (class118.field1984 <= 0) {
            class271.field4507 = -1;
            class84.field1401 = -1;
        } else {
            class146.field2401--;
            if (class146.field2401 == 0) {
                class118.field1984--;
                class146.field2401 = 100;
            }
        }
        if (arg0 != -1) {
            field4453 = 13;
        }
        if (!class71.field1238 || class294.field4831 == null) {
            return;
        }
        for (class254 var3 = (class254) class294.field4831.method309(0); var3 != null; var3 = (class254) class294.field4831.method312((byte) -75)) {
            class195 var4 = class22.method146((byte) -126, var3.field4309.field3327);
            if (class209.field3539 == 0 && var3.method1838((byte) -91, class87.field1448, class96.field1558)) {
                if (!var3.field4309.field3320) {
                    var3.field4309.field3320 = true;
                    class226.method1603(var3.field4309.field3327, var4.field3139, 15, (byte) -122);
                }
                if (var3.field4309.field3320) {
                    class226.method1603(var3.field4309.field3327, var4.field3139, 17, (byte) -99);
                }
            } else if (var3.field4309.field3320) {
                var3.field4309.field3320 = false;
                class226.method1603(var3.field4309.field3327, var4.field3139, 16, (byte) -98);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BC)Z")
    public static final boolean method1883(byte arg0, char arg1) {
        field4445++;
        int var2 = -5 / ((5 - arg0) / 62);
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I[B)V")
    public class267(int arg0, byte[] arg1) {
        this.field4447 = arg0;
        class249 var3 = new class249(arg1);
        this.field4448 = var3.method1802((byte) 50);
        this.field4450 = new int[this.field4448];
        this.field4452 = new boolean[this.field4448];
        this.field4451 = new int[this.field4448];
        this.field4444 = new int[this.field4448][];
        for (int var4 = 0; var4 < this.field4448; var4++) {
            this.field4451[var4] = var3.method1802((byte) 92);
        }
        for (int var5 = 0; var5 < this.field4448; var5++) {
            this.field4452[var5] = var3.method1802((byte) -113) == 1;
        }
        for (int var6 = 0; var6 < this.field4448; var6++) {
            this.field4450[var6] = var3.method1821((byte) 51);
        }
        for (int var7 = 0; var7 < this.field4448; var7++) {
            this.field4444[var7] = new int[var3.method1802((byte) -116)];
        }
        for (int var8 = 0; var8 < this.field4448; var8++) {
            for (int var9 = 0; var9 < this.field4444[var8].length; var9++) {
                this.field4444[var8][var9] = var3.method1802((byte) 40);
            }
        }
    }
}
