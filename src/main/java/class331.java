import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class331 extends class17 {

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    private int field5647 = -1;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field5645 = 0;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "[I")
    public static int[] field5650 = new int[256];

    @OriginalMember(owner = "client!dj", name = "nb", descriptor = "Lsf;")
    private static class108 field5658 = class140.method973(255, "Opened title screen");

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "Lsf;")
    public static class108 field5656 = field5658;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "Lhe;")
    public static class94 field5651 = new class94(64);

    @OriginalMember(owner = "client!dj", name = "qb", descriptor = "S")
    public static short field5661 = 256;

    @OriginalMember(owner = "client!dj", name = "rb", descriptor = "Lsf;")
    public static class108 field5662 = null;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!dj", name = "mb", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!dj", name = "ob", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!dj", name = "pb", descriptor = "I")
    public int field5660;

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "[I")
    public int[] field5652;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V", line = 5)
    public static void method2264(byte arg0) {
        field5658 = null;
        if (arg0 >= -45) {
            field5656 = (class108) null;
        }
        field5651 = null;
        field5656 = null;
        field5662 = null;
        field5650 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 27)
    public final void method107(int arg0) {
        field5649++;
        super.method107(arg0);
        this.field5652 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZZLsf;)V", line = 39)
    public static final void method2265(boolean arg0, boolean arg1, class108 arg2) {
        field5653++;
        class108 var3 = arg2.method764(arg0);
        int var4 = arg1 ? 32768 : 0;
        short[] var5 = new short[16];
        int var6 = 0;
        int var7 = var4 + (arg1 ? class96.field1540 : class272.field4747);
        for (int var8 = var4; var8 < var7; var8++) {
            class34 var9 = class36.method248(var8, -4394);
            if (var9.field457 && var9.method228(61).method764(false).method762(var3, -43) != -1) {
                if (var6 >= 50) {
                    class143.field2524 = null;
                    class282.field4940 = -1;
                    return;
                }
                if (var5.length <= var6) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var6; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var6++] = (short) var8;
            }
        }
        class143.field2524 = var5;
        class176.field3202 = 0;
        class282.field4940 = var6;
        class108[] var12 = new class108[class282.field4940];
        for (int var13 = 0; var13 < class282.field4940; var13++) {
            var12[var13] = class36.method248(var5[var13], -4394).method228(22);
        }
        class213.method1473(class143.field2524, var12, (byte) -27);
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)I", line = 112)
    public final int method119(int arg0) {
        int var2 = 125 / ((-arg0 - 46) / 56);
        field5646++;
        return this.field5647;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLrm;I)V", line = 124)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field5654++;
        if (arg2 == 0) {
            this.field5647 = arg1.method1712(arg0 + 113);
        }
        if (arg0 != -114) {
            method2265(true, true, (class108) null);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 140)
    public class331() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)Z", line = 156)
    public final boolean method2266(byte arg0) {
        field5659++;
        if (this.field5652 != null) {
            return true;
        } else if (this.field5647 >= 0) {
            class12 var2 = class182.field3342 < 0 ? class92.method625(47, class203.field3672, this.field5647) : class178.method1262(class203.field3672, class182.field3342, (byte) -33, this.field5647);
            var2.method77();
            this.field5652 = var2.field141;
            this.field5660 = var2.field2329;
            this.field5648 = var2.field2347;
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)[[I", line = 183)
    public int[][] method122(boolean arg0, int arg1) {
        field5657++;
        if (arg0) {
            this.method122(true, -89);
        }
        int[][] var3 = this.field224.method2081(arg1, -92);
        if (this.field224.field5106 && this.method2266((byte) 1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field5648 * (class289.field5059 == this.field5660 ? arg1 : this.field5660 * arg1 / class289.field5059);
            if (class116.field2008 == this.field5648) {
                for (int var11 = 0; var11 < class116.field2008; var11++) {
                    int var12 = this.field5652[var7++];
                    var5[var11] = class162.method1118(var12 << 4, 4080);
                    var6[var11] = class162.method1118(var12, 65280) >> 4;
                    var4[var11] = class162.method1118(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class116.field2008; var8++) {
                    int var9 = this.field5648 * var8 / class116.field2008;
                    int var10 = this.field5652[var7 + var9];
                    var5[var8] = class162.method1118(var10 << 4, 4080);
                    var6[var8] = class162.method1118(var10, 65280) >> 4;
                    var4[var8] = class162.method1118(var10, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
