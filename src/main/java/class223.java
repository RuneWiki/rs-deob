import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class223 extends class128 {

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    private int field3152 = 0;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    private int field3153 = 0;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    private int field3160 = 1;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "[J")
    public static long[] field3149 = new long[500];

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field3154 = 0;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "[Lhc;")
    public static class184[] field3159 = new class184[32768];

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "[I")
    public static int[] field3150;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lp;II)V", line = 4)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field3151++;
        if (arg1 == 0) {
            this.field3152 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field3153 = arg0.method661(-1);
        } else if (arg1 == 3) {
            this.field3160 = arg0.method661(-1);
        }
        if (arg2 >= -85) {
            this.field3153 = 14;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 52)
    public final void method130(boolean arg0) {
        if (arg0) {
            this.field3153 = 115;
        }
        class78.method462(-1);
        field3158++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)I", line = 63)
    public static final int method1529(int arg0, int arg1, byte arg2) {
        if (arg2 < 50) {
            field3154 = -120;
        }
        field3155++;
        int var3 = class42.method247(arg0 - 1, 1376312589, arg1 - 1) - (-class42.method247(arg0 + 1, 1376312589, arg1 - 1) - class42.method247(arg0 - 1, 1376312589, arg1 + 1) - class42.method247(arg0 + 1, 1376312589, arg1 + 1));
        int var4 = class42.method247(arg0 - 1, 1376312589, arg1) + class42.method247(arg0 + 1, 1376312589, arg1) - (-class42.method247(arg0, 1376312589, arg1 + -1) - class42.method247(arg0, 1376312589, arg1 + 1));
        int var5 = class42.method247(arg0, 1376312589, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V", line = 83)
    public static void method1530(byte arg0) {
        int var1 = 113 % ((-arg0 - 1) / 38);
        field3159 = null;
        field3150 = null;
        field3149 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 94)
    public class223() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(BI)[I", line = 103)
    public final int[] method126(byte arg0, int arg1) {
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class49.field600[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class10.field141; var6++) {
                int var7 = class334.field5157[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3152 == 0) {
                    var9 = (var7 - var4) * this.field3160;
                } else {
                    int var10 = var8 * var8 + (var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3160 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field3153 == 0) {
                    var12 = class43.field503[(var12 & 0xFFB) >> 4] + 4096 >> 1;
                } else if (this.field3153 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 <= 100) {
            this.method130(true);
        }
        field3156++;
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V", line = 168)
    public static final void method1531(boolean arg0, int arg1) {
        field3161++;
        if (!arg0) {
            field3154 = -44;
        }
        class96 var2 = class141.method935(arg1, 4, 88);
        var2.method582(-1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLlc;)I", line = 198)
    public static final int method1532(byte arg0, class175 arg1) {
        field3157++;
        int var2 = 0;
        int var3 = 79 / ((arg0 - 57) / 32);
        if (arg1.method1194(class277.field4320, (byte) 126)) {
            var2++;
        }
        if (arg1.method1194(class322.field4957, (byte) 126)) {
            var2++;
        }
        return var2;
    }
}
