import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class310 extends class283 {

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field5324 = 0;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public static int field5325 = 0;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field5331 = 0;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field5332 = -1;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field5328 = 0;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[[I", line = 9)
    public final int[][] method3(int arg0, int arg1) {
        field5329++;
        if (arg0 != -1) {
            field5325 = 67;
        }
        int[][] var3 = this.field4719.method2182((byte) 7, arg1);
        if (this.field4719.field5381) {
            int[] var4 = this.method1990(2, arg1, 32755);
            int[][] var5 = this.method1994(arg1, 0, (byte) -119);
            int[][] var6 = this.method1994(arg1, 1, (byte) -107);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var3[0];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class101.field1632; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var11[var16] = var9[var16];
                    var8[var16] = var10[var16];
                    var7[var16] = var13[var16];
                } else if (var17 == 0) {
                    var11[var16] = var12[var16];
                    var8[var16] = var15[var16];
                    var7[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var11[var16] = var9[var16] * var17 + var12[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                    var7[var16] = var13[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 94)
    public class310() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILwa;Z)V", line = 100)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field5326++;
        if (arg0 == 0) {
            this.field4715 = arg1.method642((byte) -91) == 1;
        }
        if (!arg2) {
            this.method1(118, (class82) null, true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIII)V", line = 114)
    public static final void method2163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class225.field3572 <= arg7 && class27.field454 >= arg6 && arg4 >= class80.field1259 && arg1 <= class117.field1840) {
            class181.method1251(arg3, 119, arg4, arg1, arg2, arg0, arg6, arg7);
        } else {
            class207.method1386(arg6, arg2, arg5 - 4185, arg1, arg0, arg3, arg4, arg7);
        }
        if (arg5 == 4096) {
            field5327++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)[I", line = 154)
    public final int[] method8(int arg0, byte arg1) {
        field5330++;
        int[] var3 = this.field4733.method664(-16409, arg0);
        int var4 = 51 / ((30 - arg1) / 36);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, arg0, 32755);
            int[] var6 = this.method1990(1, arg0, 32755);
            int[] var7 = this.method1990(2, arg0, 32755);
            for (int var8 = 0; var8 < class101.field1632; var8++) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var3[var8] = var5[var8];
                } else if (var9 == 0) {
                    var3[var8] = var6[var8];
                } else {
                    var3[var8] = var5[var8] * var9 + ((4096 - var9) * var6[var8]) >> 12;
                }
            }
        }
        return var3;
    }
}
