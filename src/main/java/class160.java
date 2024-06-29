import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class160 extends class123 {

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    private int field2865 = 32768;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Leb;")
    private static class230 field2859 = class68.method589(0, "slide:");

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Leb;")
    public static class230 field2856 = field2859;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field2862 = 0;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field2858 = -1;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "[Leb;")
    public static class230[] field2868 = new class230[100];

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Leb;")
    public static class230 field2857 = field2859;

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "Leb;")
    public static class230 field2871 = class68.method589(0, "overlay2");

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "[I")
    public static int[] field2864;

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class160() {
        super(3, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field2869;
        int var3 = -47 % ((arg1 - -24) / 57);
        int[] var4 = super.field2160.method1323((byte) 93, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(1, arg0, (byte) 59);
            int[] var6 = this.method965(2, arg0, (byte) 78);
            for (int var7 = 0; ~var7 > ~class140.field2505; ++var7) {
                int var8 = var5[var7] >> 4 & 255;
                int var9 = var6[var7] * this.field2865 >> 12;
                int var10 = class72.field1320[var8] * var9 >> 12;
                int var11 = class213.field3695[var8] * var9 >> 12;
                int var12 = class217.field3743 & (var10 >> 12) + var7;
                int var13 = class79.field1431 & (var11 >> 12) + arg0;
                int[] var14 = this.method965(0, var13, (byte) 43);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            field2857 = null;
        }
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616) {
            int[] var4 = this.method965(1, arg0, (byte) 45);
            int[] var5 = this.method965(2, arg0, (byte) 52);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; ~class140.field2505 < ~var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2865 >> 12;
                int var12 = class72.field1320[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class217.field3743;
                int var14 = class213.field3695[var10] * var11 >> 12;
                int var15 = class79.field1431 & (var14 >> 12) + arg0;
                int[][] var16 = this.method960(0, var15, (byte) -74);
                var6[var9] = var16[0][var13];
                var8[var9] = var16[1][var13];
                var7[var9] = var16[2][var13];
            }
        }
        ++field2866;
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Leb;JILeb;IIS)V")
    public static final void method1208(class230 arg0, long arg1, int arg2, class230 arg3, int arg4, int arg5, short arg6) {
        ++field2870;
        if (!class243.field4188) {
            if (arg2 != -6600) {
                field2862 = 8;
            }
            if (~class186.field3266 > -501) {
                class149.field2667[class186.field3266] = arg3;
                class192.field3388[class186.field3266] = arg0;
                class225.field3890[class186.field3266] = arg6;
                class145.field2599[class186.field3266] = arg1;
                class46.field809[class186.field3266] = arg5;
                class244.field4196[class186.field3266] = arg4;
                ++class186.field3266;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
    public static void method1209(byte arg0) {
        if (arg0 > -54) {
            method1208((class230) null, -42L, -16, (class230) null, -58, 85, (short) 28);
        }
        field2859 = null;
        field2857 = null;
        field2868 = null;
        field2856 = null;
        field2864 = null;
        field2871 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        class210.method1466(true);
        ++field2860;
        if (arg0 != 0) {
            this.field2865 = -7;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
    public static final void method1210(byte arg0) {
        if (arg0 != -108) {
            field2868 = null;
        }
        class116.field2088.method1122(10);
        class46.field806.method1122(10);
        class213.field3686.method1122(10);
        ++field2867;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field2872;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field2147 = arg1.method200(255) == 1;
            }
        } else {
            this.field2865 = arg1.method161(4) << 4;
        }
        if (arg2 != 1876195788) {
            this.method4(103, (byte) -75);
        }
    }
}
