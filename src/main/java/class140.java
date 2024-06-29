import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class140 extends class391 {

    @OriginalMember(owner = "client!g", name = "H", descriptor = "[Lbba;")
    public static class98[] field2076 = new class98[14];

    @OriginalMember(owner = "client!g", name = "f", descriptor = "F")
    public float field2048;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "F")
    public float field2050;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "F")
    public float field2052;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "F")
    public float field2054;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "F")
    public float field2057;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "F")
    public float field2059;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "F")
    public float field2060;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "F")
    public static float field2061;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "F")
    public float field2068;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "F")
    public float field2070;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "F")
    public static float field2072;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "F")
    public float field2073;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "F")
    public float field2078;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "F")
    public float field2079;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "(I)V")
    public final void method248(int arg0) {
        field2074++;
        float var2 = class686.field9663[arg0 & 0x3FFF];
        float var3 = class686.field9674[arg0 & 0x3FFF];
        float var4 = this.field2078;
        float var5 = this.field2052;
        float var6 = this.field2068;
        float var7 = this.field2070;
        this.field2078 = var2 * var4 - (this.field2050 * var3);
        this.field2052 = var2 * var5 - this.field2073 * var3;
        this.field2050 = this.field2050 * var2 + var3 * var4;
        this.field2068 = var2 * var6 - this.field2060 * var3;
        this.field2073 = this.field2073 * var2 + var3 * var5;
        this.field2070 = var2 * var7 - (this.field2079 * var3);
        this.field2060 = this.field2060 * var2 + var3 * var6;
        this.field2079 = this.field2079 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!g", name = "na", descriptor = "(IIIIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2051++;
        float var7 = class686.field9663[arg3 & 0x3FFF];
        float var8 = class686.field9674[arg3 & 0x3FFF];
        float var9 = class686.field9663[arg4 & 0x3FFF];
        float var10 = class686.field9674[arg4 & 0x3FFF];
        float var11 = class686.field9663[arg5 & 0x3FFF];
        float var12 = class686.field9674[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2068 = var9 * var13 + var10 * var12;
        this.field2054 = var9 * var11 + var10 * var14;
        this.field2057 = var7 * var12;
        this.field2060 = var7 * var9;
        this.field2059 = -var10 * var11 + var9 * var14;
        this.field2073 = -var8;
        this.field2050 = var7 * var10;
        this.field2052 = var7 * var11;
        this.field2078 = -var9 * var12 + var10 * var13;
        this.field2048 = (float) (-arg0) * this.field2054 - (float) arg1 * this.field2057 - ((float) arg2 * this.field2059);
        this.field2070 = (float) (-arg0) * this.field2078 - ((float) arg1 * this.field2052) - (float) arg2 * this.field2068;
        this.field2079 = (float) (-arg0) * this.field2050 - (float) arg1 * this.field2073 - (float) arg2 * this.field2060;
    }

    @OriginalMember(owner = "client!g", name = "wa", descriptor = "(III[I)V")
    public final void method238(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2060 + (float) arg0 * this.field2050 + (float) arg1 * this.field2073);
        field2071++;
        arg3[1] = (int) ((float) arg2 * this.field2068 + (float) arg0 * this.field2078 + (float) arg1 * this.field2052);
        arg3[0] = (int) ((float) arg2 * this.field2059 + (float) arg0 * this.field2054 + (float) arg1 * this.field2057);
    }

    @OriginalMember(owner = "client!g", name = "ZA", descriptor = "(I)V")
    public final void method272(int arg0) {
        field2075++;
        float var2 = class686.field9663[arg0 & 0x3FFF];
        float var3 = class686.field9674[arg0 & 0x3FFF];
        float var4 = this.field2054;
        float var5 = this.field2057;
        float var6 = this.field2059;
        float var7 = this.field2048;
        this.field2054 = this.field2050 * var3 + var2 * var4;
        this.field2057 = this.field2073 * var3 + var2 * var5;
        this.field2050 = this.field2050 * var2 - var3 * var4;
        this.field2059 = this.field2060 * var3 + var2 * var6;
        this.field2073 = this.field2073 * var2 - var3 * var5;
        this.field2048 = this.field2079 * var3 + var2 * var7;
        this.field2060 = this.field2060 * var2 - (var3 * var6);
        this.field2079 = this.field2079 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "()V")
    public final void method271() {
        field2069++;
        this.field2054 = this.field2052 = this.field2060 = 1.0F;
        this.field2078 = this.field2050 = this.field2057 = this.field2073 = this.field2059 = this.field2068 = this.field2048 = this.field2070 = this.field2079 = 0.0F;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lla;ZLuq;Lr;BLjava/lang/String;)V")
    public static final void method1015(class416 arg0, boolean arg1, class146 arg2, class166 arg3, byte arg4, String arg5) {
        if (class683.field9627 && class632.method3515(-23978)) {
            class146 var11 = class586.field8211;
            class416 var12 = arg3.method128(var11, class132.field1957, true);
            int var13 = var11.method1037(arg5, null, 250, true);
            int var14 = var11.method1036(null, arg5, 250, (byte) 12, var11.field2136);
            int var15 = class539.field7553.field1706;
            int var16 = var15 + 4;
            int var17 = var16 * 2 + var13;
            int var18 = var16 * 2 + var14;
            if (class230.field3599 > var17) {
                var17 = class230.field3599;
            }
            if (var18 < class576.field8107) {
                var18 = class576.field8107;
            }
            int var19 = class564.field7964.method860(class245.field3815, var17, (byte) 106) + class677.field9580;
            int var20 = class345.field5035.method3509(class544.field7651, (byte) 121, var18) + class383.field5412;
            arg3.method138(class252.field3879, false).method3911(class100.field1563.field1706 + var19, class100.field1563.field1708 + var20, var17 - (class100.field1563.field1706 * 2), -(class100.field1563.field1708 * 2) + var18);
            arg3.method138(class100.field1563, true).method3916(var19, var20);
            class100.field1563.method878();
            arg3.method138(class100.field1563, true).method3916(var17 + var19 - var15, var20);
            class100.field1563.method883();
            arg3.method138(class100.field1563, true).method3916(var17 + var19 - var15, var18 + var20 - var15);
            class100.field1563.method878();
            arg3.method138(class100.field1563, true).method3916(var19, var20 + var18 - var15);
            class100.field1563.method883();
            arg3.method138(class539.field7553, true).method3911(var19, class100.field1563.field1708 + var20, var15, var18 - (class100.field1563.field1708 * 2));
            class539.field7553.method885();
            arg3.method138(class539.field7553, true).method3911(class100.field1563.field1706 + var19, var20, var17 - class100.field1563.field1706 * 2, var15);
            class539.field7553.method885();
            arg3.method138(class539.field7553, true).method3911(var17 + var19 - var15, class100.field1563.field1708 + var20, var15, var18 - (class100.field1563.field1708 * 2));
            class539.field7553.method885();
            arg3.method138(class539.field7553, true).method3911(class100.field1563.field1706 + var19, var20 - var15 + var18, var17 - (class100.field1563.field1706 * 2), var15);
            class539.field7553.method885();
            var12.method2501(null, 0, var16 + var19, -(var16 * 2) + var18, -1, null, arg5, 1, null, 0, 0, var16 + var20, 0, var17 - var16 * 2, class35.field609 | 0xFF000000, 1);
            class349.method2156(0, var20, var19, var18, var17);
        } else {
            int var6 = arg2.method1037(arg5, null, 250, true);
            int var7 = arg2.method1046(250, -257, null, arg5) * 13;
            byte var8 = 4;
            int var9 = var8 + 6;
            int var10 = var8 + 6;
            arg3.method114(var9 - var8, -var8 + var10, var6 + var8 + var8, var7 - -var8 + var8, -16777216, 0);
            arg3.method219(var9 - var8, var10 - var8, var6 + var8 + var8, var7 + var8 + var8, -1, 0);
            arg0.method2501(null, 0, var9, var7, -1, null, arg5, 1, null, 0, 0, var10, 0, var6, -1, 1);
            class349.method2156(0, var10 - var8, -var8 + var9, var7 + var8 + var8, var6 - -var8 + var8);
        }
        if (arg4 < 20) {
            return;
        }
        field2077++;
        if (arg1) {
            try {
                arg3.method203();
            } catch (class621 var21) {
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "U", descriptor = "(III)V")
    public final void method270(int arg0, int arg1, int arg2) {
        field2066++;
        this.field2048 += arg0;
        this.field2079 += arg2;
        this.field2070 += arg1;
    }

    @OriginalMember(owner = "client!g", name = "AA", descriptor = "(I)V")
    public final void method258(int arg0) {
        field2058++;
        float var2 = class686.field9663[arg0 & 0x3FFF];
        float var3 = class686.field9674[arg0 & 0x3FFF];
        float var4 = this.field2054;
        float var5 = this.field2057;
        float var6 = this.field2059;
        this.field2054 = var2 * var4 - (this.field2078 * var3);
        float var7 = this.field2048;
        this.field2057 = var2 * var5 - this.field2052 * var3;
        this.field2078 = this.field2078 * var2 + var3 * var4;
        this.field2059 = var2 * var6 - this.field2068 * var3;
        this.field2052 = this.field2052 * var2 + var3 * var5;
        this.field2048 = var2 * var7 - this.field2070 * var3;
        this.field2068 = this.field2068 * var2 + var3 * var6;
        this.field2070 = this.field2070 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()Lq;")
    public final class391 method251() {
        field2065++;
        class140 var1 = new class140();
        var1.field2073 = this.field2073;
        var1.field2059 = this.field2059;
        var1.field2070 = this.field2070;
        var1.field2068 = this.field2068;
        var1.field2054 = this.field2054;
        var1.field2079 = this.field2079;
        var1.field2057 = this.field2057;
        var1.field2050 = this.field2050;
        var1.field2078 = this.field2078;
        var1.field2060 = this.field2060;
        var1.field2052 = this.field2052;
        var1.field2048 = this.field2048;
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "o", descriptor = "(I)V")
    public final void method245(int arg0) {
        this.field2052 = 1.0F;
        field2062++;
        this.field2054 = this.field2060 = class686.field9663[arg0 & 0x3FFF];
        this.field2059 = class686.field9674[arg0 & 0x3FFF];
        this.field2057 = this.field2048 = this.field2078 = this.field2068 = this.field2070 = this.field2073 = this.field2079 = 0.0F;
        this.field2050 = -this.field2059;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I)V")
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2060 + (float) arg0 * this.field2050 + (float) arg1 * this.field2073 + this.field2079);
        field2055++;
        arg3[1] = (int) ((float) arg2 * this.field2068 + (float) arg0 * this.field2078 + (float) arg1 * this.field2052 + this.field2070);
        arg3[0] = (int) ((float) arg2 * this.field2059 + (float) arg0 * this.field2054 + (float) arg1 * this.field2057 + this.field2048);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method1016(int arg0) {
        if (arg0 == -22872) {
            field2076 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "J", descriptor = "(I)V")
    public final void method249(int arg0) {
        field2053++;
        this.field2060 = 1.0F;
        this.field2054 = this.field2052 = class686.field9663[arg0 & 0x3FFF];
        this.field2078 = class686.field9674[arg0 & 0x3FFF];
        this.field2059 = this.field2048 = this.field2068 = this.field2070 = this.field2050 = this.field2073 = this.field2079 = 0.0F;
        this.field2057 = -this.field2078;
    }

    @OriginalMember(owner = "client!g", name = "YA", descriptor = "([I)V")
    public final void method236(int[] arg0) {
        field2063++;
        float var2 = (float) arg0[0] - this.field2048;
        float var3 = (float) arg0[1] - this.field2070;
        float var4 = (float) arg0[2] - this.field2079;
        arg0[2] = (int) (this.field2060 * var4 + this.field2068 * var3 + this.field2059 * var2);
        arg0[0] = (int) (this.field2050 * var4 + this.field2078 * var3 + this.field2054 * var2);
        arg0[1] = (int) (this.field2073 * var4 + this.field2057 * var2 + this.field2052 * var3);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        if (arg0 > -106) {
            field2072 = -1.001782F;
        }
        field2049++;
        class78.field1342.method2285((byte) -97);
    }

    @OriginalMember(owner = "client!g", name = "oa", descriptor = "(I)V")
    public final void method256(int arg0) {
        field2056++;
        this.field2054 = 1.0F;
        this.field2052 = this.field2060 = class686.field9663[arg0 & 0x3FFF];
        this.field2073 = class686.field9674[arg0 & 0x3FFF];
        this.field2068 = -this.field2073;
        this.field2057 = this.field2059 = this.field2048 = this.field2078 = this.field2070 = this.field2050 = this.field2079 = 0.0F;
    }

    @OriginalMember(owner = "client!g", name = "M", descriptor = "(Lq;)V")
    public final void method274(class391 arg0) {
        field2067++;
        class140 var2 = (class140) arg0;
        this.field2070 = var2.field2070;
        this.field2073 = var2.field2073;
        this.field2057 = var2.field2057;
        this.field2079 = var2.field2079;
        this.field2059 = var2.field2059;
        this.field2068 = var2.field2068;
        this.field2052 = var2.field2052;
        this.field2060 = var2.field2060;
        this.field2048 = var2.field2048;
        this.field2078 = var2.field2078;
        this.field2050 = var2.field2050;
        this.field2054 = var2.field2054;
    }

    @OriginalMember(owner = "client!g", name = "NA", descriptor = "(III)V")
    public final void method252(int arg0, int arg1, int arg2) {
        field2064++;
        this.field2078 = this.field2050 = this.field2057 = this.field2073 = this.field2059 = this.field2068 = 0.0F;
        this.field2070 = arg1;
        this.field2079 = arg2;
        this.field2048 = arg0;
        this.field2054 = this.field2052 = this.field2060 = 1.0F;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class140() {
        this.method271();
    }
}
