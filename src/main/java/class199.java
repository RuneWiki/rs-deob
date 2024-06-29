import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class199 extends class86 {

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    private int field3091 = 4096;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    private int field3095 = 4096;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    private int field3094 = 4096;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3098 = "Loading...";

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field3093 = 0;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(IB)Z", line = 5)
    public static final boolean method1499(int arg0, byte arg1) {
        field3100++;
        int var2 = 23 / ((-arg1 - 25) / 43);
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILrg;)I", line = 15)
    public static final int method1500(byte arg0, int arg1, class342 arg2) {
        field3101++;
        if (arg0 <= 53) {
            field3096 = -23;
        }
        if (!client.method1022(arg2).method1701(true, arg1) && arg2.field5422 == null) {
            return -1;
        } else if (arg2.field5273 == null || arg2.field5273.length <= arg1) {
            return -1;
        } else {
            return arg2.field5273[arg1];
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZLug;)V", line = 43)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field3094 = arg2.method314((byte) 69);
        } else if (arg0 == 1) {
            this.field3095 = arg2.method314((byte) 73);
        } else if (arg0 == 2) {
            this.field3091 = arg2.method314((byte) 32);
        }
        field3097++;
        if (arg1) {
            this.field3091 = -90;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 160)
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)[[I", line = 93)
    public final int[][] method156(int arg0, byte arg1) {
        int[][] var3 = this.field1227.method2025(false, arg0);
        field3099++;
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class93.field1424; var11++) {
                int var12 = var5[var11];
                int var13 = var8[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field3094 * var12 >> 12;
                    var9[var11] = this.field3095 * var13 >> 12;
                    var10[var11] = this.field3091 * var14 >> 12;
                } else {
                    var7[var11] = this.field3094;
                    var9[var11] = this.field3095;
                    var10[var11] = this.field3091;
                }
            }
        }
        if (arg1 > -126) {
            field3096 = -71;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V", line = 150)
    public static void method1501(int arg0) {
        field3098 = null;
        if (arg0 >= -39) {
            method1501(-66);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)I", line = 172)
    public static final int method1502(byte arg0, int arg1) {
        if (arg0 <= 10) {
            method1501(-84);
        }
        field3092++;
        return arg1 >>> 7;
    }
}
