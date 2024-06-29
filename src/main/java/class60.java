import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class60 extends class264 {

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    private int field928 = 32768;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "Lma;")
    private static class5 field933 = class12.method119("wave2:", (byte) 97);

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "Lma;")
    public static class5 field927 = field933;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lma;")
    public static class5 field929 = field933;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILii;)V", line = 18)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field928 = arg2.method1524((byte) 77) << 4;
        } else if (arg0 == 1) {
            this.field4496 = arg2.method1509(true) == 1;
        }
        field935++;
        if (arg1 >= -27) {
            this.method4(108, -20, (class221) null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V", line = 50)
    public static void method446(byte arg0) {
        field929 = null;
        if (arg0 < 43) {
            method446((byte) 98);
        }
        field927 = null;
        field933 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 76)
    public class60() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 68)
    public final void method111(int arg0) {
        int var2 = 118 % ((66 - arg0) / 44);
        field930++;
        class90.method592(0);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)[[I", line = 95)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -38 / ((-arg0 - 43) / 55);
        field931++;
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[] var5 = this.method1815(1, arg1, 108);
            int[] var6 = this.method1815(2, arg1, 49);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class226.field3716; var10++) {
                int var11 = (var5[var10] * 255 & 0xFF6F2) >> 12;
                int var12 = var6[var10] * this.field928 >> 12;
                int var13 = class195.field3043[var11] * var12 >> 12;
                int var14 = class257.field4404[var11] * var12 >> 12;
                int var15 = var10 + (var13 >> 12) & class256.field4370;
                int var16 = class68.field1082 & (var14 >> 12) + arg1;
                int[][] var17 = this.method1817(-107, 0, var16);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V", line = 151)
    public static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field937++;
        class202.field3240[0].method525(arg0, arg4);
        class202.field3240[1].method525(arg0, arg4 + arg5 - 16);
        int var6 = (arg5 - 32) * arg5 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = 57 / ((arg2 - 42) / 53);
        int var8 = (arg5 - var6 - 32) * arg1 / (arg3 - arg5);
        class124.method826(arg0, arg4 + 16, 16, arg5 - 32, class213.field3381);
        class124.method826(arg0, arg4 + var8 + 16, 16, var6, class66.field1035);
        class124.method827(arg0, arg4 + var8 + 16, var6, class235.field3887);
        class124.method827(arg0 + 1, arg4 - -16 + var8, var6, class235.field3887);
        class124.method828(arg0, arg4 + var8 + 16, 16, class235.field3887);
        class124.method828(arg0, arg4 + var8 + 17, 16, class235.field3887);
        class124.method827(arg0 + 15, 16 - -var8 + arg4, var6, class165.field2522);
        class124.method827(arg0 + 14, arg4 + var8 + 17, var6 - 1, class165.field2522);
        class124.method828(arg0, var6 + var8 + arg4 + 15, 16, class165.field2522);
        class124.method828(arg0 + 1, arg4 - -var8 + var6 + 14, 15, class165.field2522);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[I", line = 187)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            method447(-124, -64, -124, -121, 93, 50);
        }
        field936++;
        int[] var3 = this.field4501.method1176(arg1, 122);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(1, arg1, -90);
            int[] var5 = this.method1815(2, arg1, 102);
            for (int var6 = 0; var6 < class226.field3716; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field928 >> 12;
                int var9 = class195.field3043[var7] * var8 >> 12;
                int var10 = class257.field4404[var7] * var8 >> 12;
                int var11 = class256.field4370 & (var9 >> 12) + var6;
                int var12 = class68.field1082 & (var10 >> 12) + arg1;
                int[] var13 = this.method1815(0, var12, 94);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
