import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class215 extends class76 {

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    private int field3655 = 32768;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field3649 = 0;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "Z")
    public static boolean field3651 = true;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "Lia;")
    public static class257 field3659 = class28.method234(120, ":assist:");

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        ++field3652;
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 1, (byte) -104);
            int[] var5 = this.method562(arg1, 2, (byte) -104);
            for (int var6 = 0; class96.field1807 > var6; ++var6) {
                int var7 = var5[var6] * this.field3655 >> 12;
                int var8 = (var4[var6] & 4095) >> 4;
                int var9 = class205.field3514[var8] * var7 >> 12;
                int var10 = class106.field1962[var8] * var7 >> 12;
                int var11 = arg1 - -(var9 >> 12) & class105.field1950;
                int var12 = class157.field2753 & (var10 >> 12) + var6;
                int[] var13 = this.method562(var11, 0, (byte) -104);
                var3[var6] = var13[var12];
            }
        }
        if (arg0 != -9351) {
            field3651 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        if (arg1 < 2) {
            field3659 = null;
        }
        ++field3658;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[] var4 = this.method562(arg0, 1, (byte) -104);
            int[] var5 = this.method562(arg0, 2, (byte) -104);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class96.field1807 > var9; ++var9) {
                int var10 = (1047477 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3655 >> 12;
                int var12 = class106.field1962[var10] * var11 >> 12;
                int var13 = class157.field2753 & var9 - -(var12 >> 12);
                int var14 = class205.field3514[var10] * var11 >> 12;
                int var15 = class105.field1950 & (var14 >> 12) + arg0;
                int[][] var16 = this.method565((byte) -20, 0, var15);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        if (arg0 != 111) {
            this.method209((byte) -119);
        }
        class251.method1645((byte) 114);
        ++field3653;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field3656;
        if (arg1 > -86) {
            this.field3655 = -111;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field1477 = arg0.method1051((byte) 95) == 1;
            }
        } else {
            this.field3655 = arg0.method1063(-17162) << 4;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class215() {
        super(3, false);
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
    public static void method1435(int arg0) {
        if (arg0 != -5182) {
            field3650 = 66;
        }
        field3659 = null;
    }
}
