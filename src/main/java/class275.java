import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class275 extends class215 {

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field4393 = 585;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "[I")
    public static int[] field4392 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Lje;")
    public static class154 field4387 = new class154();

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field4396 = 2301979;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "[I")
    public static int[] field4395 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "[I")
    public static int[] field4399 = new int[50];

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "J")
    public static long field4398 = 0L;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "Lte;")
    public static class244 field4400 = new class244(30);

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field4388;
        int[] var3 = super.field3445.method1755(arg0, (byte) 125);
        if (super.field3445.field4163) {
            int var4 = class76.field956[arg0];
            for (int var5 = 0; var5 < class244.field4015; ++var5) {
                int var6 = class166.field2657[var5];
                if (var6 > this.field4393 && ~(4096 - this.field4393) < ~var6 && 2048 - this.field4393 < var4 && ~(this.field4393 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4393);
                    var3[var5] = 4096 - var10;
                } else if (~(-this.field4393 + 2048) > ~var6 && ~(this.field4393 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field4393;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4393 + 2048);
                } else if (var4 >= this.field4393 && var4 <= -this.field4393 + 4096) {
                    if (~var6 <= ~this.field4393 && -this.field4393 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field4393);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4393;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4393 + 2048);
                }
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    public static void method1843(int arg0) {
        field4400 = null;
        field4387 = null;
        field4392 = null;
        field4395 = null;
        field4399 = null;
        if (arg0 >= -18) {
            method1844((byte) -20);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 != 1521146348) {
            this.field4393 = 110;
        }
        ++field4386;
        if (~arg1 == -1) {
            this.field4393 = arg2.method549(255);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public static final void method1844(byte arg0) {
        if (arg0 < 3) {
            method1844((byte) -73);
        }
        ++field4390;
        for (int var1 = 0; var1 < 100; ++var1) {
            class21.field279[var1] = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class275() {
        super(0, true);
    }
}
