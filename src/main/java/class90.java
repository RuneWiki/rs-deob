import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class90 extends class325 {

    @OriginalMember(owner = "client!kca", name = "I", descriptor = "[Lvl;")
    public static class15[] field1244 = new class15[5];

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!kca", name = "G", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!kca", name = "H", descriptor = "I")
    public static int field1243;

    static {
        for (int var0 = 0; var0 < field1244.length; ++var0) {
            field1244[var0] = new class15();
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIZIIILjava/lang/String;)V", line = 4)
    public static final void method725(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7) {
        ++field1243;
        class122 var8 = new class122();
        var8.field1783 = arg6;
        if (!arg3) {
            var8.field1772 = arg5;
            var8.field1774 = arg7;
            var8.field1773 = arg2;
            var8.field1777 = arg1;
            var8.field1779 = class100.field1401 - -arg0;
            var8.field1771 = arg4;
            class237.field3201.method106(var8, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V", line = 24)
    public class90() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)[I", line = 27)
    public final int[] method100(byte arg0, int arg1) {
        if (arg0 < 21) {
            field1244 = null;
        }
        ++field1241;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1, 0, (byte) 33);
            int[] var5 = this.method2062(arg1, 1, (byte) 33);
            int[] var6 = this.method2062(arg1, 2, (byte) 33);
            for (int var7 = 0; var7 < class261.field3874; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lha;B)V", line = 81)
    public static final void method726(class65 arg0, byte arg1) {
        ++field1239;
        if (arg1 > -34) {
            field1244 = null;
        }
        if (!class38.field591) {
            class292.method1848(arg0, 18075);
        } else {
            class113.method850(arg0, -16777216);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljp;IB)V", line = 98)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            super.field4738 = arg0.method2398(-1372747256) == 1;
        }
        if (arg2 <= -41) {
            ++field1238;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)[[I", line = 115)
    public final int[][] method360(int arg0, byte arg1) {
        ++field1240;
        int[][] var3 = super.field4733.method1251((byte) 117, arg0);
        if (arg1 != -9) {
            field1244 = null;
        }
        if (super.field4733.field2369) {
            int[] var4 = this.method2062(arg0, 2, (byte) 33);
            int[][] var5 = this.method2063(0, 1, arg0);
            int[][] var6 = this.method2063(1, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class261.field3874 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 195)
    public static void method727(int arg0) {
        if (arg0 != 1) {
            method728(-104);
        }
        field1244 = null;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)I", line = 220)
    public static final int method728(int arg0) {
        ++field1242;
        if (~class669.field9399 == -2) {
            return class756.field10491;
        } else {
            return arg0 != 364409068 ? -39 : class670.field9427;
        }
    }
}
