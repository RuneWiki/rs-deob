import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class210 extends class120 {

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    private int field3377 = 585;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[I")
    public static int[] field3375 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3378 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Lma;")
    public static class152 field3379;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            method1470(-39);
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = class16.field216[arg0];
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                int var6 = class203.field3278[var5];
                if (var6 > this.field3377 && var6 < (4096 - this.field3377) && var4 > (2048 - this.field3377) && (this.field3377 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3377);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field3377) < var6 && this.field3377 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3377;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3377);
                } else if (this.field3377 > var4 || var4 > (4096 - this.field3377)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3377;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3377);
                } else if (this.field3377 <= var6 && var6 <= 4096 - this.field3377) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3377);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field3376++;
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V", line = 96)
    public static final void method1470(int arg0) {
        class58.method402();
        field3381++;
        class58.method410();
        if (arg0 != 6257) {
            field3375 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Llb;II)V", line = 114)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field3382++;
        if (arg1 == -1 && arg2 == 0) {
            this.field3377 = arg0.method759((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 139)
    public class210() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)I", line = 160)
    public static final int method1471(int arg0, int arg1, int arg2, int arg3) {
        field3380++;
        int var4 = arg2 / arg3;
        int var5 = arg2 & arg3 - 1;
        int var6 = arg3 - 1 & arg1;
        int var7 = arg1 / arg3;
        int var8 = class230.method1647(var4, 1, var7);
        int var9 = class230.method1647(var4 + 1, 1, var7);
        int var10 = class230.method1647(var4, 1, var7 + 1);
        int var11 = class230.method1647(var4 + 1, 1, arg0 + var7);
        int var12 = class26.method171(var8, var5, var9, 1, arg3);
        int var13 = class26.method171(var10, var5, var11, 1, arg3);
        return class26.method171(var12, var6, var13, 1, arg3);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V", line = 189)
    public static void method1472(boolean arg0) {
        field3378 = null;
        field3375 = null;
        field3379 = null;
        if (!arg0) {
            field3379 = (class152) null;
        }
    }
}
