import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class705 {

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    private int field9880 = -1;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "Z")
    private boolean field9888 = true;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "[Lui;")
    private class242[] field9875;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    private int field9887;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    private int field9872;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    private int field9870;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    private int field9882;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "[Lui;")
    private class242[] field9891;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Lui;")
    private class242 field9877;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Z")
    public static boolean field9878 = false;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Lfb;")
    public static class704 field9871 = new class704();

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    private int field9881;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    private int field9885;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lvr;")
    private class147 field9873;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "Lvr;")
    public static class147 field9890;

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field9892;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLha;I)Z", line = 4)
    public final boolean method3944(byte arg0, class65 arg1, int arg2) {
        if (this.field9880 != arg2) {
            this.field9880 = arg2;
            int var4 = class37.method261(arg2, false);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field9885 != var4) {
                this.field9873 = null;
                this.field9885 = var4;
            }
            if (this.field9875 != null) {
                this.field9881 = 0;
                int[] var5 = new int[this.field9875.length];
                for (int var6 = 0; var6 < this.field9875.length; var6++) {
                    class242 var7 = this.field9875[var6];
                    if (var7.method1559(this.field9870, this.field9882, this.field9872, this.field9880)) {
                        var5[this.field9881] = var7.field3250;
                        this.field9891[this.field9881++] = var7;
                    }
                }
                class186.method1288(var5, 0, this.field9891, 85, this.field9881 - 1);
            }
            this.field9888 = true;
        }
        field9883++;
        if (arg0 >= -73) {
            this.field9882 = 12;
        }
        boolean var8 = false;
        if (this.field9888) {
            this.field9888 = false;
            for (int var9 = this.field9881 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field9891[var9].method1566(arg1, this.field9877);
                var8 |= var10;
                this.field9888 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 79)
    public static void method3945(int arg0) {
        if (arg0 != -1) {
            field9871 = null;
        }
        field9871 = null;
        field9892 = null;
        field9890 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 97)
    public static final void method3946(Canvas arg0, int arg1) {
        field9879++;
        Dimension var2 = arg0.getSize();
        class403.method2515(var2.height, (byte) 122, var2.width);
        if (arg1 <= 101) {
            method3949(-103, null, 38, -124, null);
        }
        if (class669.field9399 == 1) {
            class86.field1200.method480(arg0, class688.field9675, class756.field10491);
        } else {
            class86.field1200.method480(arg0, class564.field7561, class670.field9427);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 121)
    public final void method3947(byte arg0) {
        field9884++;
        if (arg0 > -31) {
            return;
        }
        if (this.field9875 != null) {
            for (int var2 = 0; var2 < this.field9875.length; var2++) {
                this.field9875[var2].method1568();
            }
        }
        this.field9873 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILha;IIIIIII)V", line = 145)
    public final void method3948(int arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9889++;
        if (arg0 > -78) {
            return;
        }
        int var11 = arg3 + arg5 & 0x3FFF;
        if (this.field9887 == -1 || this.field9885 == 0) {
            arg2.method563(arg4, arg7, arg6, arg8, arg9, 0);
        } else {
            class662 var12 = class293.field4280.method1174(this.field9887, true);
            if (this.field9873 == null && class293.field4280.method1173(true, this.field9887)) {
                int[] var13 = var12.field9135 == 2 ? class293.field4280.method1178(this.field9885, this.field9887, -126, 0.7F, this.field9885, false) : class293.field4280.method1177(this.field9885, false, this.field9885, 0.7F, this.field9887, (byte) -128);
                this.field9873 = arg2.method499(this.field9885, var13, true, 0, this.field9885, this.field9885);
            }
            if (var12.field9135 == 2) {
                arg2.method563(arg4, arg7, arg6, arg8, arg9, 0);
            }
            if (this.field9873 != null) {
                int var14 = var12.field9135 == 2 ? 1 : 0;
                int var15 = arg1 * arg8 / -4096;
                int var16;
                for (var16 = arg8 * var11 / 4096 + (arg6 - arg8) / 2; var16 > arg8; var16 -= arg8) {
                }
                while (var16 < 0) {
                    var16 += arg8;
                }
                while (arg8 < var15) {
                    var15 -= arg8;
                }
                while (var15 < 0) {
                    var15 += arg8;
                }
                for (int var17 = var16 - arg8; var17 < arg6; var17 += arg8) {
                    for (int var18 = var15 - arg8; var18 < arg8; var18 += arg8) {
                        this.field9873.method1104(var17 + arg4, arg7 + var18, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field9881 - 1; var19 >= 0; var19--) {
            this.field9891[var19].method1560(arg2, arg4, arg7, arg6, arg8, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[Ljava/lang/String;II[S)V", line = 224)
    public static final void method3949(int arg0, String[] arg1, int arg2, int arg3, short[] arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method3949(var6 - 1, arg1, arg2, 94, arg4);
            method3949(arg0, arg1, var6 + 1, 52, arg4);
        }
        if (arg3 < 36) {
            method3946(null, 49);
        }
        field9886++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I", line = 286)
    public static final int method3950(int arg0, boolean arg1) {
        field9869++;
        byte var2;
        if (arg0 > 12000) {
            class117.method960(-18861);
            var2 = 4;
        } else if (arg0 > 5000) {
            var2 = 3;
            class57.method409(0);
        } else if (arg0 <= 2000) {
            var2 = 1;
            class261.method1727(true, (byte) -97);
        } else {
            var2 = 2;
            class310.method1948(1);
        }
        if (class712.field9959.field1270.method4293(5) != 2) {
            class712.field9959.method735(2, class712.field9959.field1299, 75);
            class793.method4365((byte) -41, false, 2);
        }
        class617.method3389(arg1);
        return var2;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I[Lui;IIII)V", line = 381)
    public class705(int arg0, class242[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9875 = arg1;
        this.field9887 = arg0;
        this.field9872 = arg5;
        this.field9870 = arg3;
        this.field9882 = arg4;
        if (arg1 == null) {
            this.field9891 = null;
            this.field9877 = null;
        } else {
            this.field9891 = new class242[arg1.length];
            this.field9877 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIII)V", line = 339)
    public static final void method3951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class553[] var7 = class581.field7771;
        if (arg2 != 1780724097) {
            field9890 = null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class553 var9 = var7[var8];
            if (var9 != null && var9.field7465 == 2) {
                class86.method707(var9.field7464, arg3 >> 1, arg2 ^ 0x6A23B1C1, arg4 >> 1, arg0, var9.field7460 * 2, arg5, var9.field7470, var9.field7469);
                if (class744.field10277[0] > -1 && (class100.field1401 % 20) < 10) {
                    class147 var10 = class399.field5839[var9.field7468];
                    int var11 = class744.field10277[0] + arg1 - 12;
                    int var12 = class744.field10277[1] + arg6 - 28;
                    var10.method1102(var11, var12);
                    class716.method4001(var11 + var10.method1096(), (byte) -102, var10.method1106() + var12, var12, var11);
                }
            }
        }
        field9874++;
    }
}
