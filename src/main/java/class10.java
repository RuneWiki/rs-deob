import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class23 {

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    private int field136 = 32768;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field131 = -1;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Ldc;")
    public static class37 field132 = class185.method1233((byte) 86, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Ldc;")
    public static class37 field129 = class185.method1233((byte) 86, "logo");

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Lqb;")
    public static class176 field137 = new class176(4);

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "[Ldc;")
    public static class37[] field142 = new class37[1000];

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Lbi;")
    public static class21 field130;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Lwa;")
    public static class238 field134;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[I")
    public static int[] field138;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field128;
        int[] var3 = super.field405.method1461(arg1, (byte) -110);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field405.field4114) {
                int[] var4 = this.method162(arg1, 1, (byte) 18);
                int[] var5 = this.method162(arg1, 2, (byte) 18);
                for (int var6 = 0; ~var6 > ~class199.field3705; ++var6) {
                    int var7 = 255 & var4[var6] >> 4;
                    int var8 = var5[var6] * this.field136 >> 12;
                    int var9 = class120.field2144[var7] * var8 >> 12;
                    int var10 = class107.field1874[var7] * var8 >> 12;
                    int var11 = class215.field4008 & (var9 >> 12) + var6;
                    int var12 = class5.field44 & (var10 >> 12) + arg1;
                    int[] var13 = this.method162(var12, 0, (byte) 18);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V")
    public static void method66(int arg0) {
        field132 = null;
        field134 = null;
        field137 = null;
        field130 = null;
        field142 = null;
        field129 = null;
        if (arg0 != 0) {
            field132 = null;
        }
        field138 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLmf;)Lmf;")
    public static final class136 method67(byte arg0, class136 arg1) {
        ++field133;
        int var2 = class215.method1420((byte) -53, class107.method699(arg1, 103));
        if (~var2 == -1) {
            return null;
        } else {
            if (arg0 < 17) {
                field138 = null;
            }
            for (int var3 = 0; var3 < var2; ++var3) {
                arg1 = class180.method1200(arg1.field2566, (byte) 111);
                if (arg1 == null) {
                    return null;
                }
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field127;
        if (arg1 != 9) {
            field132 = null;
        }
        int[][] var3 = super.field398.method1522(arg1 + -29668, arg0);
        if (super.field398.field4303) {
            int[] var4 = this.method162(arg0, 1, (byte) 18);
            int[] var5 = this.method162(arg0, 2, (byte) 18);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; ~class199.field3705 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1047926) >> 12;
                int var11 = var5[var9] * this.field136 >> 12;
                int var12 = class120.field2144[var10] * var11 >> 12;
                int var13 = class107.field1874[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + arg0 & class5.field44;
                int var15 = class215.field4008 & var9 - -(var12 >> 12);
                int[][] var16 = this.method159(0, (byte) -69, var14);
                var7[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var6[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        ++field139;
        if (arg0 != -21746) {
            field132 = null;
        }
        class74.method521(2);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field135;
        int var5 = -18 / ((arg4 - 13) / 48);
        class117 var6 = (class117) class41.field831.method1047((byte) -84, (long) arg3);
        if (var6 == null) {
            var6 = new class117();
            class41.field831.method1044(var6, (byte) -14, (long) arg3);
        }
        if (~arg0 <= ~var6.field2104.length) {
            int[] var7 = new int[arg0 + 1];
            int[] var8 = new int[arg0 + 1];
            for (int var9 = 0; ~var6.field2104.length < ~var9; ++var9) {
                var7[var9] = var6.field2104[var9];
                var8[var9] = var6.field2095[var9];
            }
            for (int var10 = var6.field2104.length; ~var10 > ~arg0; ++var10) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var6.field2104 = var7;
            var6.field2095 = var8;
        }
        var6.field2104[arg0] = arg2;
        var6.field2095[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field407 = ~arg0.method215(-1797813752) == -2;
            }
        } else {
            this.field136 = arg0.method230((byte) -123) << 4;
        }
        if (arg2 != 1000) {
            this.method57(98, 115);
        }
        ++field140;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static final void method69(byte arg0) {
        int[] var1 = new int[class69.field1256];
        ++field126;
        int var2 = 0;
        for (int var3 = 0; ~class69.field1256 < ~var3; ++var3) {
            class125 var5 = class223.method1471(-25, var3);
            if (~var5.field2261 <= -1 || var5.field2269 >= 0) {
                var1[var2++] = var3;
            }
        }
        class235.field4280 = new int[var2];
        if (arg0 <= -107) {
            for (int var4 = 0; var2 > var4; ++var4) {
                class235.field4280[var4] = var1[var4];
            }
        }
    }
}
