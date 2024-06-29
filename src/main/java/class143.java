import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class143 extends class182 {

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field2408 = 4096;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    private int field2412 = 3216;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    private int field2414 = 3216;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "[I")
    private int[] field2416 = new int[3];

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lek;")
    public static class206 field2409;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIILkk;II)Lbn;", line = 4)
    public static final class75 method977(int arg0, boolean arg1, int arg2, int arg3, class260 arg4, int arg5, int arg6) {
        field2402++;
        if (arg3 != -256) {
            return (class75) null;
        }
        int var8 = (arg5 << 19) + (arg1 ? 65536 : 0) + (arg0 << 17) + arg6;
        long var9 = (long) arg2 * 3147483667L + (long) var8 * 3849834839L;
        class75 var11 = (class75) class192.field3251.method893(var9, 105);
        if (var11 != null) {
            return var11;
        }
        class305.field4966 = false;
        class75 var12 = class164.method1178(arg1, arg0, arg2, arg4, arg5, arg6, false, false, (byte) 45);
        if (var12 != null && !class305.field4966) {
            class192.field3251.method888(var9, var12, arg3 + 383);
        }
        return var12;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lek;B)V", line = 32)
    public static final void method978(class206 arg0, byte arg1) {
        field2405++;
        if (arg1 > 104) {
            class317.field5174 = arg0.method1402(-125, "runes");
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V", line = 45)
    public static void method979(int arg0) {
        if (arg0 != 2) {
            method978((class206) null, (byte) 97);
        }
        field2409 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I", line = 66)
    public final int[] method125(int arg0, int arg1) {
        int[] var3 = this.field3166.method775(arg1, arg0 + 124);
        if (arg0 != 2) {
            field2401 = 121;
        }
        field2407++;
        if (this.field3166.field1903) {
            int var4 = class347.field5536 * this.field2408 >> 12;
            int[] var5 = this.method1292(class194.field3266 & arg1 - 1, 0, -84);
            int[] var6 = this.method1292(arg1, 0, arg0 - 86);
            int[] var7 = this.method1292(arg1 + 1 & class194.field3266, 0, -108);
            for (int var8 = 0; var8 < class26.field672; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class53.field1056] - var6[var8 + 1 & class53.field1056]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class15.field445[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field2416[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field2416[1] * var16 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field2416[0] * var18 >> 12;
                var3[var8] = var17 + var19 + var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 134)
    public final void method163(int arg0) {
        field2411++;
        this.method980(2);
        if (arg0 != 100) {
            method981(-19, -25, -23);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 150)
    public class143() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V", line = 158)
    private final void method980(int arg0) {
        field2410++;
        double var2 = Math.cos((double) ((float) this.field2412 / 4096.0F));
        this.field2416[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field2414 / 4096.0F)));
        this.field2416[1] = (int) (Math.cos((double) ((float) this.field2414 / 4096.0F)) * 4096.0D * var2);
        this.field2416[2] = (int) (Math.sin((double) ((float) this.field2412 / 4096.0F)) * 4096.0D);
        int var4 = this.field2416[0] * this.field2416[0] >> 12;
        int var5 = this.field2416[1] * this.field2416[1] >> 12;
        int var6 = this.field2416[arg0] * this.field2416[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2416[1] = (this.field2416[1] << 12) / var7;
            this.field2416[0] = (this.field2416[0] << 12) / var7;
            this.field2416[2] = (this.field2416[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Loe;IB)V", line = 186)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field2406++;
        if (arg1 == 0) {
            this.field2408 = arg0.method989(66);
        } else if (arg1 == 1) {
            this.field2414 = arg0.method989(126);
        } else if (arg1 == 2) {
            this.field2412 = arg0.method989(arg2 ^ 0x46);
        }
        if (arg2 != 60) {
            method979(-30);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)Ltk;", line = 234)
    public static final class278 method981(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5078; var4++) {
            class278 var5 = var3.field5089[var4];
            if ((var5.field4527 >> 29 & 0x3L) == 2L && var5.field4523 == arg1 && var5.field4530 == arg2) {
                class134.method947(var5);
                return var5;
            }
        }
        return null;
    }
}
