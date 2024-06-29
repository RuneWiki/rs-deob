import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class162 extends class183 {

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    private int field2748 = 4096;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    private int field2756 = 8192;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    private int field2750 = 2048;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    private int field2749 = 0;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    private int field2754 = 0;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    private int field2760 = 2048;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
    private int field2765 = 12288;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "Ljf;")
    private static class229 field2752 = class212.method1457((byte) 65, "Opened title screen");

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "J")
    public static volatile long field2761 = 0L;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "[I")
    public static int[] field2764 = new int[100];

    @OriginalMember(owner = "client!g", name = "T", descriptor = "[J")
    public static long[] field2745 = new long[100];

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Ljf;")
    public static class229 field2758 = field2752;

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Z")
    public static boolean field2766 = false;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Z")
    public static boolean field2747;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 8)
    public final void method25(int arg0) {
        field2746++;
        class298.method2055((byte) 103);
        if (arg0 != -8) {
            field2761 = -10L;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(III)Z", line = 28)
    private final boolean method1089(int arg0, int arg1, int arg2) {
        int var4 = (arg2 - arg0) * this.field2765 >> 12;
        int var5 = class281.field4824[(arg1 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2765;
        field2759++;
        int var7 = (var6 << 12) / this.field2756;
        int var8 = this.field2748 * var7 >> 12;
        return var8 > arg0 + arg2 && -var8 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 48)
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(III)Z", line = 53)
    private final boolean method1090(int arg0, int arg1, int arg2) {
        field2763++;
        int var4 = (arg1 + arg2) * this.field2765 >> 12;
        int var5 = class281.field4824[var4 * 255 >> 12 & 0xFF];
        if (arg0 != -16706) {
            this.method1090(45, -3, -86);
        }
        int var6 = (var5 << 12) / this.field2765;
        int var7 = (var6 << 12) / this.field2756;
        int var8 = this.field2748 * var7 >> 12;
        return (arg2 - arg1) < var8 && (-var8) < (arg2 - arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILkh;I)V", line = 71)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field2762++;
        if (arg0 > -43) {
            field2752 = (class229) null;
        }
        if (arg2 == 0) {
            this.field2760 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field2754 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field2749 = arg1.method116(-1);
        } else if (arg2 == 3) {
            this.field2750 = arg1.method116(-1);
        } else if (arg2 == 4) {
            this.field2765 = arg1.method116(-1);
        } else if (arg2 == 5) {
            this.field2748 = arg1.method116(-1);
        } else if (arg2 == 6) {
            this.field2756 = arg1.method116(-1);
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V", line = 173)
    public static final void method1091(int arg0) {
        class232.field4017++;
        if (arg0 != 0) {
            field2766 = true;
        }
        field2751++;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V", line = 185)
    public static void method1092(int arg0) {
        field2752 = null;
        if (arg0 <= 119) {
            method1092(16);
        }
        field2745 = null;
        field2764 = null;
        field2758 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)[I", line = 237)
    public final int[] method10(int arg0, int arg1) {
        field2757++;
        if (arg1 != -1) {
            this.method1090(14, -66, -116);
        }
        int[] var3 = this.field3161.method664(arg0, arg1 + 1);
        if (this.field3161.field1736) {
            int var4 = class42.field746[arg0] - 2048;
            for (int var5 = 0; var5 < class22.field393; var5++) {
                int var6 = class97.field1737[var5] - 2048;
                int var7 = this.field2760 + var6;
                int var8 = var4 + this.field2750;
                int var9 = this.field2754 + var4;
                int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                int var11 = this.field2749 + var6;
                int var12 = var10 <= 2048 ? var10 : var10 - 4096;
                int var13 = var11 < -2048 ? var11 + 4096 : var11;
                int var14 = var13 <= 2048 ? var13 : var13 - 4096;
                int var15 = var7 < -2048 ? var7 + 4096 : var7;
                int var16 = var8 < -2048 ? var8 + 4096 : var8;
                int var17 = var15 > 2048 ? var15 - 4096 : var15;
                int var18 = var16 <= 2048 ? var16 : var16 - 4096;
                var3[var5] = this.method1089(var17, 1047783, var12) || this.method1090(-16706, var14, var18) ? 4096 : 0;
            }
        }
        return var3;
    }
}
