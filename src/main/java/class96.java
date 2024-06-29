import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class96 extends class346 {

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    private int field1307 = 32768;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field1302 = new String[200];

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Z")
    public static boolean field1304 = false;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "Lug;")
    public static class118 field1309;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 6)
    public final void method237(byte arg0) {
        if (arg0 > -95) {
            field1304 = false;
        }
        ++field1305;
        class431.method2689(256);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I", line = 17)
    public final int[] method45(int arg0, int arg1) {
        ++field1308;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            field1309 = null;
        }
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0, 1);
            int[] var5 = this.method2294((byte) 54, arg0, 2);
            for (int var6 = 0; class134.field1753 > var6; ++var6) {
                int var7 = (4089 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field1307 >> 12;
                int var9 = class72.field1021[var7] * var8 >> 12;
                int var10 = class238.field3323[var7] * var8 >> 12;
                int var11 = class188.field2572 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class215.field3000;
                int[] var13 = this.method2294((byte) 54, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 69)
    public static void method763(int arg0) {
        field1302 = null;
        field1309 = null;
        if (arg0 != 200) {
            method763(-65);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 82)
    public class96() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 87)
    public static final void method764(int arg0) {
        class117.field1529.method491(class108.field1416, class128.field1666, class333.field4902);
        ++field1310;
        if (arg0 != -6967) {
            method764(-14);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfb;ZI)V", line = 103)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field1306;
        if (!arg1) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    super.field5151 = ~arg0.method2233((byte) 104) == -2;
                }
            } else {
                this.field1307 = arg0.method2239(-1076227960) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)[[I", line = 141)
    public final int[][] method287(int arg0, int arg1) {
        ++field1303;
        if (arg1 >= -3) {
            return null;
        } else {
            int[][] var3 = super.field5170.method2701(0, arg0);
            if (super.field5170.field6288) {
                int[] var4 = this.method2294((byte) 54, arg0, 1);
                int[] var5 = this.method2294((byte) 54, arg0, 2);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class134.field1753; ++var9) {
                    int var10 = (var4[var9] * 255 & 1047514) >> 12;
                    int var11 = var5[var9] * this.field1307 >> 12;
                    int var12 = class72.field1021[var10] * var11 >> 12;
                    int var13 = class238.field3323[var10] * var11 >> 12;
                    int var14 = class188.field2572 & (var12 >> 12) + var9;
                    int var15 = class215.field3000 & (var13 >> 12) + arg0;
                    int[][] var16 = this.method2293(0, 0, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }
}
