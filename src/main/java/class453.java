import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class453 extends class179 {

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "[I")
    public static int[] field6764 = new int[14];

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "F")
    public static float field6761;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 9)
    public static void method2706(int arg0) {
        int var1 = 75 / ((-52 - arg0) / 63);
        field6764 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ll;Lqs;B)V", line = 18)
    public static final void method2707(class196 arg0, class496 arg1, byte arg2) {
        class452.field6752 = arg1;
        ++field6763;
        class215.field3752 = arg0;
        if (arg2 != -37) {
            method2708(14, 88, -34);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lec;", line = 33)
    public static final class68 method2708(int arg0, int arg1, int arg2) {
        ++field6759;
        if (arg1 <= 60) {
            return null;
        } else {
            class68 var3 = class22.method115(7521, arg0);
            if (arg2 == -1) {
                return var3;
            } else {
                return var3 != null && var3.field997 != null && var3.field997.length > arg2 ? var3.field997[arg2] : null;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)[Lvi;", line = 54)
    public static final class206[] method2709(byte arg0) {
        if (arg0 < 64) {
            method2708(-117, 65, -75);
        }
        ++field6762;
        return new class206[] { class398.field6082, class189.field2957, class95.field1601 };
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V", line = 67)
    public static final void method2710(int arg0) {
        class300.field4809.method2779(5, (byte) -96);
        ++field6758;
        class1.field7.method2960(arg0, 83);
        class106.field1901.method1497(5, -13594);
        class61.field928.method788(53, 5);
        class22.field239.method1090((byte) -75, 5);
        class20.field218.method2222(arg0 ^ 33, 5);
        class130.field2232.method632(5, arg0 ^ 13077);
        class30.field482.method2633(5, (byte) 41);
        class189.field2953.method2905(16383, 5);
        class338.field5296.method2583(5, false);
        class224.field3870.method1939(5, 5845);
        class94.field1585.method495(-95, 5);
        class272.field4515.method2003(arg0 + -106, 5);
        class213.field3383.method2256(5, -23543);
        class446.field6660.method2978(5, true);
        class503.field7338.method1613(5, (byte) -115);
        class279.field4582.method2508(5, (byte) 97);
        class343.field5367.method404((byte) -109, 5);
        class209.field3313.method1913(5, 64);
        class160.field2563.method1345((byte) 81, 5);
        class216.method1493((byte) -114, 5);
        class465.method2767(false, 50);
        class462.method2754(126, 5);
        class330.method2076(5, 79);
        class462.field6872.method1603((byte) -111, 5);
        class115.field2049.method1603((byte) -125, 5);
        class22.field235.method1603((byte) -104, 5);
        class469.field6965.method1603((byte) -112, 5);
        class521.field7693.method1603((byte) -128, 5);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 103)
    public final void method1213(int arg0) {
        ++field6766;
        if (arg0 != 0) {
            field6764 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lih;II[BI)V", line = 118)
    public class453(class214 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6757 = arg2;
        super.field2845.method1471(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2829, 0, super.field2832, this.field6757, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1208(true, -114);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILza;IIII)V", line = 132)
    public static final void method2711(int arg0, class491 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6760;
        arg1.method829(arg3, arg0, arg3 - -arg2, arg0 + arg4);
        arg1.method2864(arg0, (byte) 13, arg2, arg3, arg4, -16777216);
        if (~class57.field900 <= -101) {
            float var6 = (float) class210.field3342 / (float) class210.field3343;
            int var7 = arg2;
            int var8 = arg4;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg4 / var6);
            } else {
                var8 = (int) ((float) arg2 * var6);
            }
            int var9 = (arg4 - var8) / 2 + arg0;
            int var10 = (arg2 - var7) / 2 + arg3;
            if (class295.field4756 == null || arg2 != class295.field4756.method204() || arg4 != class295.field4756.method210()) {
                class210.method1390(class210.field3357, class210.field3342 + class210.field3340, class210.field3357 + class210.field3343, class210.field3340, var10, var9, var7 + var10, var8 + var9);
                class210.method1389(arg1);
                class295.field4756 = arg1.method843(var10, var9, var7, var8, false);
            }
            class295.field4756.method1039(var10, var9);
            int var11 = class156.field2537 * var7 / class210.field3343;
            int var12 = class14.field158 * var8 / class210.field3342;
            int var13 = class188.field2948 * var7 / class210.field3343 + var10;
            int var14 = -(class104.field1712 * var8 / class210.field3342) + var9 + var8 + -var12;
            int var15 = -1996554240;
            if (class271.field4501 == class131.field2246) {
                var15 = -1996488705;
            }
            arg1.method914(var13, var14, var11, var12, var15, arg5);
            arg1.method915(var13, var14, var11, var12, var15, 0);
            if (~class461.field6825 < -1) {
                int var16;
                if (class187.field2933 > 50) {
                    var16 = (100 - class187.field2933) * 5;
                } else {
                    var16 = class187.field2933 * 5;
                }
                for (class366 var17 = (class366) class210.field3332.method2538(-3); var17 != null; var17 = (class366) class210.field3332.method2535((byte) -72)) {
                    class445 var18 = class210.field3329.method492(var17.field5694, (byte) -10);
                    if (class78.method572(var18, -120)) {
                        if (~class536.field7876 != ~var17.field5694) {
                            if (~class1.field10 != 0 && ~class1.field10 == ~var18.field6613) {
                                int var19 = var17.field5692 * var7 / class210.field3343 + var10;
                                int var20 = (-var17.field5690 + class210.field3342) * var8 / class210.field3342 + var9;
                                arg1.method2864(var20 + -2, (byte) 13, 4, var19 + -2, 4, var16 << 24 | 16776960);
                            }
                        } else {
                            int var21 = var17.field5692 * var7 / class210.field3343 + var10;
                            int var22 = (class210.field3342 - var17.field5690) * var8 / class210.field3342 + var9;
                            arg1.method2864(var22 + -2, (byte) 13, 4, var21 + -2, 4, 16776960 | var16 << 24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V", line = 223)
    public final void method2712(int arg0, boolean arg1) {
        ++field6765;
        super.field2845.method1471(true, this);
        OpenGL.glTexParameteri(super.field2829, 10242, !arg1 ? 33071 : 10497);
        if (arg0 != 5990) {
            method2708(67, 88, 4);
        }
    }
}
