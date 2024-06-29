import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class141 extends class196 {

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private int field2364 = 4096;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lvh;")
    public static class252 field2367 = new class252();

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, true);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0 + -1 & class214.field3717, 0, -118);
            int[] var5 = this.method1390(arg0, 0, -102);
            int[] var6 = this.method1390(arg0 + 1 & class214.field3717, 0, -95);
            for (int var7 = 0; ~class49.field767 < ~var7; ++var7) {
                int var8 = (var5[class135.field2245 & var7 + 1] + -var5[var7 - 1 & class135.field2245]) * this.field2364;
                int var9 = (var6[var7] + -var4[var7]) * this.field2364;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != 10565) {
            return null;
        } else {
            ++field2365;
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 != 82) {
            this.field2364 = 41;
        }
        if (arg0 == 0) {
            this.field2364 = arg1.method876(false);
        }
        ++field2366;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method1020(boolean arg0) {
        if (arg0) {
            field2367 = null;
        }
    }
}
