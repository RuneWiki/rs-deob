import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class267 extends class84 {

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    private int field4319 = 32768;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4312 = "scroll:";

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4315 = "Connected to update server";

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "[Lje;")
    public static class188[] field4321 = new class188[29];

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "[[I")
    public static int[][] field4316;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "[[[B")
    public static byte[][][] field4310;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        if (!arg0) {
            ++field4314;
            class239.method1677((byte) 91);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(1, arg1, false);
            int[] var5 = this.method612(2, arg1, false);
            for (int var6 = 0; ~class20.field221 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field4319 >> 12;
                int var9 = class24.field282[var7] * var8 >> 12;
                int var10 = class239.field3823[var7] * var8 >> 12;
                int var11 = class36.field497 & var6 - -(var9 >> 12);
                int var12 = class58.field822 & (var10 >> 12) + arg1;
                int[] var13 = this.method612(0, var12, false);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 > -125) {
            method1856((byte) -78);
        }
        ++field4320;
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)I")
    public static final int method1856(byte arg0) {
        ++field4317;
        if (arg0 != 85) {
            field4321 = null;
        }
        if (class215.field3416) {
            return 0;
        } else if (!class77.method566((byte) -73)) {
            return 1;
        } else {
            return class5.field40 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)J")
    public static final long method1857(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        return var3 != null && var3.field4526 != null ? var3.field4526.field1464 : 0L;
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 == 0) {
            field4310 = null;
            field4312 = null;
            field4315 = null;
            field4321 = null;
            field4316 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != -18) {
            this.method30(34, (byte) -31);
        }
        ++field4313;
        int[][] var3 = super.field1211.method193((byte) -128, arg0);
        if (super.field1211.field321) {
            int[] var4 = this.method612(1, arg0, false);
            int[] var5 = this.method612(2, arg0, false);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class20.field221 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field4319 >> 12;
                int var12 = class239.field3823[var10] * var11 >> 12;
                int var13 = class24.field282[var10] * var11 >> 12;
                int var14 = var9 - -(var13 >> 12) & class36.field497;
                int var15 = class58.field822 & (var12 >> 12) + arg0;
                int[][] var16 = this.method611(0, (byte) -43, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class267() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 < 87) {
            this.method31((class152) null, (byte) -79, 106);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1217 = arg0.method1111(255) == 1;
            }
        } else {
            this.field4319 = arg0.method1126(false) << 4;
        }
        ++field4318;
    }
}
