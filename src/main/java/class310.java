import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class310 extends class300 {

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    private int field4979 = 1024;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    private int field4984 = 2048;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    private int field4983 = 3072;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4982 = "Connection lost.";

    @OriginalMember(owner = "client!km", name = "P", descriptor = "Z")
    public static boolean field4986 = false;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "[I")
    public static int[] field4988;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field4981;
        if (arg0 <= 126) {
            method2091(120);
        }
        this.field4984 = this.field4983 - this.field4979;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V")
    public static final void method2090() {
        for (int var0 = 0; var0 < class66.field974; ++var0) {
            class158 var1 = class21.field276[var0];
            class139.method878(var1);
            class21.field276[var0] = null;
        }
        class66.field974 = 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field4989;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field4784 = ~arg0.method1218(101) == -2;
                }
            } else {
                this.field4983 = arg0.method1186((byte) -95);
            }
        } else {
            this.field4979 = arg0.method1186((byte) -85);
        }
        if (arg1 >= -43) {
            this.method144(71);
        }
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
    public static void method2091(int arg0) {
        field4988 = null;
        field4982 = null;
        if (arg0 != 0) {
            field4982 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field4990;
        int var3 = -14 % (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) 92);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var4[0];
            int[] var9 = var5[1];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; class180.field2826 > var12; ++var12) {
                var8[var12] = (var7[var12] * this.field4984 >> 12) + this.field4979;
                var11[var12] = (var9[var12] * this.field4984 >> 12) + this.field4979;
                var10[var12] = (var6[var12] * this.field4984 >> 12) + this.field4979;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
    public class310() {
        super(1, false);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -2) {
            field4986 = false;
        }
        if (arg3 >= class56.field816 && class187.field2938 >= arg2 && ~arg0 <= ~class115.field1678 && ~arg5 >= ~class60.field882) {
            class97.method661(arg4, arg1, arg2, arg3, arg0, 1, arg5, arg7);
        } else {
            class303.method2035(arg3, arg2, arg1, arg4, arg6 ^ 23693, arg0, arg7, arg5);
        }
        ++field4980;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field4987;
        if (arg1 != -957953300) {
            this.field4979 = -75;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int[] var4 = this.method2018(0, arg1 ^ 957953299, arg0);
            for (int var5 = 0; class180.field2826 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field4984 >> 12) + this.field4979;
            }
        }
        return var3;
    }
}
