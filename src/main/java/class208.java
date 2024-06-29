import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class208 extends class195 {

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    private int field3315 = 8192;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    private int field3320 = 4096;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    private int field3321 = 0;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    private int field3309 = 2048;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
    private int field3322 = 2048;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    private int field3319 = 12288;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    private int field3317 = 0;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Lck;")
    public static class119 field3310 = class298.method1987((byte) 114, "");

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "Lck;")
    public static class119 field3318 = class298.method1987((byte) 5, "<col=ffb000>");

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Lck;")
    public static class119 field3311 = class298.method1987((byte) 56, "ul");

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lck;")
    public static class119 field3313 = class298.method1987((byte) 6, "<img=1>");

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!qg", name = "ob", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!qg", name = "qb", descriptor = "Lwl;")
    public static class258 field3329;

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "[Lra;")
    public static class43[] field3325;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)Z", line = 5)
    private final boolean method1306(int arg0, int arg1, int arg2) {
        field3326++;
        int var4 = (arg0 + arg2) * this.field3319 >> 12;
        int var5 = class237.field3802[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3319;
        if (arg1 != 0) {
            this.method1306(-71, -114, -103);
        }
        int var7 = (var6 << 12) / this.field3315;
        int var8 = this.field3320 * var7 >> 12;
        return var8 > (arg2 - arg0) && (-var8) < (arg2 - arg0);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 26)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lfj;II)V", line = 34)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field3324++;
        if (arg1 >= -117) {
            this.method1306(2, 47, -88);
        }
        if (arg2 == 0) {
            this.field3322 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field3321 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field3317 = arg0.method63((byte) 1);
        } else if (arg2 == 3) {
            this.field3309 = arg0.method63((byte) 1);
        } else if (arg2 == 4) {
            this.field3319 = arg0.method63((byte) 1);
        } else if (arg2 == 5) {
            this.field3320 = arg0.method63((byte) 1);
        } else if (arg2 == 6) {
            this.field3315 = arg0.method63((byte) 1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)I", line = 111)
    public static final int method1307(int arg0) {
        field3316++;
        return arg0 == -4304 ? 6 : -5;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)[I", line = 134)
    public final int[] method11(int arg0, boolean arg1) {
        field3308++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int var4 = class215.field3424[arg0] - 2048;
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                int var6 = class157.field2505[var5] - 2048;
                int var7 = var4 + this.field3321;
                int var8 = this.field3317 + var6;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = var7 >= -2048 ? var7 : var7 + 4096;
                int var11 = var6 + this.field3322;
                int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                int var13 = var4 + this.field3309;
                int var14 = var9 > 2048 ? var9 - 4096 : var9;
                int var15 = var13 >= -2048 ? var13 : var13 + 4096;
                int var16 = var15 > 2048 ? var15 - 4096 : var15;
                int var17 = var12 <= 2048 ? var12 : var12 - 4096;
                int var18 = var10 <= 2048 ? var10 : var10 - 4096;
                var3[var5] = this.method1308(var17, var18, 255) || this.method1306(var14, 0, var16) ? 4096 : 0;
            }
        }
        if (arg1) {
            method1309((byte) 50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 193)
    public final void method14(int arg0) {
        if (arg0 != 2048879374) {
            field3314 = 122;
        }
        class166.method1046((byte) 64);
        field3307++;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(III)Z", line = 224)
    private final boolean method1308(int arg0, int arg1, int arg2) {
        field3312++;
        int var4 = (arg1 - arg0) * this.field3319 >> 12;
        int var5 = class237.field3802[(arg2 * var4 & 0xFF4FC) >> 12];
        int var6 = (var5 << 12) / this.field3319;
        int var7 = (var6 << 12) / this.field3315;
        int var8 = this.field3320 * var7 >> 12;
        return (arg0 + arg1) < var8 && (arg0 + arg1) > (-var8);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V", line = 238)
    public static void method1309(byte arg0) {
        field3325 = null;
        if (arg0 != -105) {
            return;
        }
        field3310 = null;
        field3313 = null;
        field3311 = null;
        field3318 = null;
        field3329 = null;
    }
}
