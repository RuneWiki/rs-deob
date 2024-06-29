import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class170 extends class115 {

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    private int field2380 = -1;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "Z")
    public static boolean field2378 = false;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "S")
    public static short field2383 = 256;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "Lcj;")
    public static class412 field2387;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "[I")
    private int[] field2375;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method634(int arg0, int arg1, byte arg2) {
        super.method634(arg0, arg1, arg2);
        ++field2389;
        if (~this.field2380 <= -1) {
            int var4 = !class16.field167.method371(this.field2380, (byte) 96).field4442 ? 128 : 64;
            this.field2375 = class16.field167.method373(var4, this.field2380, 1.0F, var4, 8125, false);
            this.field2374 = var4;
            this.field2385 = var4;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method1127(boolean arg0) {
        ++field2388;
        class412.field5955.method2043(-121);
        class396.field5782.method2043(-116);
        class21.field216.method2043(-57);
        if (!arg0) {
            class252.field3405.method2043(-106);
            class147.field2055.method2043(-110);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V", line = 37)
    public static final void method1128(int arg0, byte arg1) {
        ++field2386;
        class331 var2 = class238.field3243;
        synchronized (class238.field3243) {
            class238.field3243.method2054(126, arg0);
        }
        class331 var3 = class402.field5855;
        synchronized (class402.field5855) {
            class402.field5855.method2054(-51, arg0);
            if (arg1 != -92) {
                method1128(67, (byte) 21);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I", line = 54)
    public final int[][] method144(int arg0, int arg1) {
        ++field2377;
        int var3 = -104 % ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 124);
        if (super.field1342.field5819) {
            int var5 = this.field2385 * (class392.field5738 == this.field2374 ? arg0 : this.field2374 * arg0 / class392.field5738);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (class218.field2979 != this.field2385) {
                for (int var9 = 0; ~class218.field2979 < ~var9; ++var9) {
                    int var10 = this.field2385 * var9 / class218.field2979;
                    int var11 = this.field2375[var5 - -var10];
                    var8[var9] = class40.method253(4080, var11 << 4);
                    var7[var9] = class40.method253(65280, var11) >> 4;
                    var6[var9] = class40.method253(var11 >> 12, 4080);
                }
            } else {
                for (int var12 = 0; class218.field2979 > var12; ++var12) {
                    int var13 = this.field2375[var5++];
                    var8[var12] = class40.method253(255, var13) << 4;
                    var7[var12] = class40.method253(4080, var13 >> 4);
                    var6[var12] = class40.method253(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I", line = 118)
    public final int method635(int arg0) {
        ++field2381;
        int var2 = 106 % ((arg0 - 25) / 56);
        return this.field2380;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLbk;I)V", line = 129)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2380 = arg1.method1355(32136);
        }
        if (arg0 <= 83) {
            this.method634(49, -90, (byte) 70);
        }
        ++field2376;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIB)V", line = 148)
    public static final void method1129(int arg0, int arg1, byte arg2) {
        ++field2384;
        class348 var3 = class385.method2464(15, 1302, 0);
        if (arg2 != 99) {
            method1131(-14);
        }
        var3.method2216((byte) 23);
        var3.field5091 = arg1;
        var3.field5093 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)V", line = 163)
    public static void method1130(byte arg0) {
        field2387 = null;
        if (arg0 <= 58) {
            method1127(true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 181)
    public final void method630(int arg0) {
        super.method630(-122);
        ++field2379;
        this.field2375 = null;
        int var2 = 15 % ((arg0 - -57) / 52);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 197)
    public class170() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V", line = 207)
    public static final void method1131(int arg0) {
        ++field2382;
        if (arg0 != 256) {
            method1129(32, 4, (byte) 31);
        }
        if (class157.field2227 == null || class63.field726 == null) {
            class63.field726 = new int[256];
            class157.field2227 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class157.field2227[var1] = (int) (4096.0D * Math.sin(var2));
                class63.field726[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
    }
}
