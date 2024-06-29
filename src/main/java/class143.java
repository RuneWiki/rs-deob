import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class143 extends class33 {

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    private int field2675 = 1;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    private int field2678 = 1;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    private int field2682 = 204;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "La;")
    public static class1 field2683;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field2681;
        if (arg1 >= -99) {
            field2683 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2682 = arg2.method755((byte) -54);
                }
            } else {
                this.field2678 = arg2.method751((byte) -104);
            }
        } else {
            this.field2675 = arg2.method751((byte) -96);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field2680;
        int[] var3 = super.field718.method514(arg0, -74);
        int var4 = 11 % ((arg1 - -65) / 60);
        if (super.field718.field1615) {
            for (int var5 = 0; ~var5 > ~class117.field2173; ++var5) {
                int var6 = class138.field2585[var5];
                int var7 = class105.field1937[arg0];
                int var8 = this.field2675 * var6 >> 12;
                int var9 = this.field2678 * var7 >> 12;
                int var10 = var6 % (4096 / this.field2675) * this.field2675;
                int var11 = var7 % (4096 / this.field2678) * this.field2678;
                if (~var11 > ~this.field2682) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (~var8 < -4) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var5] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field2682) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                if (this.field2682 > var10) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                var3[var5] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static final void method902(byte arg0) {
        class179 var1 = class205.field4011;
        synchronized (class205.field4011) {
            class144.field2685 = class93.field1745;
            if (arg0 != -107) {
                method905((byte) -100);
            }
            class214.field4154 = class202.field3911;
            class4.field72 = class23.field511;
            class120.field2208 = class23.field499;
            class41.field849 = class74.field1450;
            class23.field493 = class40.field816;
            class42.field865 = class46.field966;
            class23.field499 = 0;
        }
        ++field2677;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
    public static final void method903(int arg0, int arg1, int arg2, int arg3) {
        class105 var4 = class208.field4055[arg0][arg1][arg2];
        if (var4 != null) {
            class208.field4055[arg0][arg1][arg2].field1940 = arg3;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
    public static final void method904(int arg0, int arg1) {
        class134.field2535 = -1;
        class193.field3749 = false;
        class55.field1097 = arg0;
        class194.field3761 = -1;
        ++field2676;
        class28.field570 = 0;
        class12.field192 = null;
        class58.field1145 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public static void method905(byte arg0) {
        field2683 = null;
        int var1 = -54 % ((-63 - arg0) / 39);
    }
}
