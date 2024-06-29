import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class28 extends class179 {

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    private int field381 = 4;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    private int field389 = 4;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "Lke;")
    public static class256 field385 = class316.method2202("::gc", 27626);

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Lke;")
    public static class256 field382 = class316.method2202(" (X", 27626);

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "Lke;")
    public static class256 field387 = class316.method2202("<col=80ff00>", 27626);

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field384 = 0;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Z")
    public static boolean field380 = false;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "[I")
    public static int[] field383;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILra;I)V", line = 18)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field381 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field389 = arg1.method357(false);
        }
        if (arg0 <= 108) {
            field385 = (class256) null;
        }
        field379++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I", line = 45)
    public final int[] method41(int arg0, int arg1) {
        field378++;
        if (arg1 != -31598) {
            field387 = (class256) null;
        }
        int[] var3 = this.field3157.method1258(arg1 ^ 0x7B2E, arg0);
        if (this.field3157.field3081) {
            int var4 = class161.field2858 / this.field381;
            int var5 = class38.field697 / this.field389;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1312(0, 0, (byte) 3);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1312(0, class38.field697 * var7 / var5, (byte) 110);
            }
            for (int var8 = 0; var8 < class161.field2858; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class161.field2858 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILke;Lke;IBLke;)V", line = 99)
    public static final void method206(int arg0, class256 arg1, class256 arg2, int arg3, byte arg4, class256 arg5) {
        int var6 = 99;
        if (arg4 != -84) {
            return;
        }
        while (var6 > 0) {
            class115.field2025[var6] = class115.field2025[var6 - 1];
            class292.field5051[var6] = class292.field5051[var6 - 1];
            class102.field1843[var6] = class102.field1843[var6 - 1];
            class292.field5055[var6] = class292.field5055[var6 - 1];
            class72.field1315[var6] = class72.field1315[var6 - 1];
            var6--;
        }
        class115.field2025[0] = arg0;
        class292.field5051[0] = arg2;
        class72.field1315[0] = arg3;
        class181.field3214 = class35.field549;
        class102.field1843[0] = arg5;
        class292.field5055[0] = arg1;
        field386++;
        class145.field2562++;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)[[I", line = 139)
    public final int[][] method55(int arg0, int arg1) {
        field377++;
        int[][] var3 = this.field3169.method463(arg1, arg0 ^ 0x4A);
        if (arg0 != 75) {
            this.method41(-102, 63);
        }
        if (this.field3169.field1080) {
            int var4 = class38.field697 / this.field389;
            int var5 = class161.field2858 / this.field381;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1314(0, 158, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method1314(class38.field697 * var7 / var4, 158, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class161.field2858; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class161.field2858 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 249)
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V", line = 232)
    public static void method207(byte arg0) {
        field383 = null;
        field382 = null;
        int var1 = -62 % ((-arg0 - 33) / 43);
        field385 = null;
        field387 = null;
    }
}
