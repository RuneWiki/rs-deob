import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class226 extends class259 {

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    private int field4040 = 32768;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Lsg;")
    public static class30 field4044 = class167.method1221((byte) 33, "runes");

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "[I")
    public static int[] field4049 = new int[128];

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lud;")
    public static class235 field4045;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field4041;
        class168.method1242((byte) -110);
        if (arg0 < 11) {
            this.method17(-26, true);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class226() {
        super(3, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            field4049 = null;
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        ++field4043;
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(1, arg0, 117);
            int[] var5 = this.method1799(2, arg0, 120);
            for (int var6 = 0; ~var6 > ~class223.field3999; ++var6) {
                int var7 = (4092 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field4040 >> 12;
                int var9 = class201.field3592[var7] * var8 >> 12;
                int var10 = class250.field4420[var7] * var8 >> 12;
                int var11 = class52.field1174 & (var9 >> 12) + var6;
                int var12 = class263.field4649 & arg0 - -(var10 >> 12);
                int[] var13 = this.method1799(0, var12, 125);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static void method1616(byte arg0) {
        field4045 = null;
        field4044 = null;
        field4049 = null;
        if (arg0 != -56) {
            field4045 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field4042;
        if (arg1 != -1586849108) {
            field4044 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4588 = arg2.method63((byte) 120) == 1;
            }
        } else {
            this.field4040 = arg2.method65((byte) 111) << 4;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field4046;
        int[][] var3 = super.field4568.method241(-85, arg1);
        if (super.field4568.field564) {
            int[] var4 = this.method1799(1, arg1, 120);
            int[] var5 = this.method1799(2, arg1, 124);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; ~var9 > ~class223.field3999; ++var9) {
                int var10 = var5[var9] * this.field4040 >> 12;
                int var11 = 255 & var4[var9] * 255 >> 12;
                int var12 = class250.field4420[var11] * var10 >> 12;
                int var13 = (var12 >> 12) + arg1 & class263.field4649;
                int var14 = class201.field3592[var11] * var10 >> 12;
                int var15 = class52.field1174 & (var14 >> 12) + var9;
                int[][] var16 = this.method1795(var13, 2, 0);
                var7[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var6[var9] = var16[2][var15];
            }
        }
        int var17 = 25 / ((arg0 - -48) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILmc;Lmc;)V")
    public static final void method1617(int arg0, class151 arg1, class151 arg2) {
        if (arg0 <= -28) {
            ++field4047;
            class244.field4370 = arg2;
            class172.field3215 = arg1;
        }
    }
}
