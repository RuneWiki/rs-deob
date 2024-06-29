import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class163 extends class212 {

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "Lsc;")
    public static class181 field2777 = class149.method967(255, ")1j");

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Z")
    public static boolean field2778 = false;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "Lsc;")
    public static class181 field2784 = class149.method967(255, "Hidden)2use");

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "J")
    public static long field2785 = 0L;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lej;IIILjava/awt/Component;)Ljh;")
    public static final class250 method1089(class142 arg0, int arg1, int arg2, int arg3, Component arg4) {
        ++field2776;
        if (class207.field3554 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && ~arg3 > -3) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class250 var5 = (class250) Class.forName("nj").newInstance();
                var5.field4349 = new int[(!class145.field2372 ? 1 : 2) * 256];
                var5.field4373 = arg2;
                var5.method84(arg4);
                var5.field4379 = (arg2 & -1024) + 1024;
                if (var5.field4379 > 16384) {
                    var5.field4379 = 16384;
                }
                var5.method81(var5.field4379);
                if (class198.field3443 > 0 && class16.field299 == null) {
                    class16.field299 = new class241();
                    class16.field299.field4183 = arg0;
                    arg0.method918(class198.field3443, 0, class16.field299);
                }
                if (class16.field299 != null) {
                    if (class16.field299.field4176[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class16.field299.field4176[arg3] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class10 var6 = new class10(arg0, arg3);
                    var6.field4349 = new int[256 * (!class145.field2372 ? 1 : 2)];
                    var6.field4373 = arg2;
                    var6.method84(arg4);
                    var6.field4379 = 16384;
                    var6.method81(var6.field4379);
                    if (class198.field3443 > 0 && class16.field299 == null) {
                        class16.field299 = new class241();
                        class16.field299.field4183 = arg0;
                        arg0.method918(class198.field3443, 0, class16.field299);
                    }
                    if (class16.field299 != null) {
                        if (class16.field299.field4176[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class16.field299.field4176[arg3] = var6;
                    }
                    int var7 = 9 % ((arg1 - 62) / 55);
                    return var6;
                } catch (Throwable var8) {
                    return new class250();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public static final void method1090(int arg0) {
        class70.field1113.method1790(0);
        ++field2781;
        if (arg0 != 13624) {
            field2780 = 18;
        }
        class73.field1164.method1790(arg0 + -13624);
        class188.field3324.method1790(0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            this.method24(21, (byte) -39);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            class252.method1719(var3, 0, class26.field452, class176.field3090[arg0]);
        }
        ++field2783;
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1091(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 > -87) {
            method1091(122, -85, -101, (byte) 34, -2, 34, -48, -120, -81, 103);
        }
        ++field2782;
        if (~arg5 == ~arg9 && ~arg6 == ~arg7 && ~arg1 == ~arg4 && ~arg2 == ~arg8) {
            class237.method1623(arg7, arg4, arg0, true, arg8, arg5);
        } else {
            int var10 = arg7;
            int var11 = arg5 * 3;
            int var12 = arg7 * 3;
            int var13 = arg5;
            int var14 = arg9 * 3;
            int var15 = arg1 * 3;
            int var16 = arg6 * 3;
            int var17 = arg2 * 3;
            int var18 = -var14 + var15 - var14 + var11;
            int var19 = -arg7 + -var17 + arg8 + var16;
            int var20 = -var16 + -var16 + var12 + var17;
            int var21 = -var11 + var14;
            int var22 = arg4 - (arg5 + var15) + var14;
            int var23 = var16 - var12;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var19 * var26;
                int var29 = var18 * var25;
                int var30 = var20 * var25;
                int var31 = var21 * var24;
                int var32 = var23 * var24;
                int var33 = arg7 - -(var28 + var30 + var32 >> 12);
                int var34 = (var27 - -var29 + var31 >> 12) + arg5;
                class237.method1623(var10, var34, arg0, true, var33, var13);
                var13 = var34;
                var10 = var33;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2784 = null;
        int var1 = 0 % ((52 - arg0) / 49);
        field2777 = null;
    }
}
