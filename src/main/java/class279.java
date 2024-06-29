import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class279 {

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
    public static boolean field3795 = false;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[I")
    public static int[] field3792 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3800 = 0;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "[[I")
    public static int[][] field3797 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "F")
    public static float field3788;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field3798;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field3801;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[Z")
    public static boolean[] field3799;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1550(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1541(int arg0) {
        field3798++;
        if (arg0 == 1006) {
            class29.field276.method606((byte) 78);
            class189.field2388.method606((byte) 86);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 22)
    public static final void method1542(int arg0) {
        try {
            Method var1 = (field3801 == null ? (field3801 = method1550("java.lang.Runtime")) : field3801).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class436.field6389 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != 1) {
                method1544((Frame) null, (class450) null, (byte) 96);
            }
        } catch (Exception var5) {
        }
        field3791++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 50)
    public static final void method1543(byte arg0) {
        field3796++;
        if (class171.field2153 != null) {
            return;
        }
        int var1 = class373.field5207;
        int var2 = class266.field3626;
        int var3 = class154.field1947 - class333.field4423 - var1;
        if (arg0 > -37) {
            return;
        }
        int var4 = class216.field2894 - class337.field4496 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class213.field2888 == null) {
                var5 = class159.field2055.field6532;
            } else {
                var5 = class213.field2888;
            }
            int var6 = 0;
            int var7 = 0;
            if (class213.field2888 == var5) {
                Insets var8 = class213.field2888.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class216.field2894);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class154.field1947, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class154.field1947 - var3, var7, var3, class216.field2894);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class216.field2894 + var7 - var4, class154.field1947, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Frame;Llh;B)V", line = 118)
    public static final void method1544(Frame arg0, class450 arg1, byte arg2) {
        while (true) {
            class304 var3 = arg1.method2781((byte) -125, arg0);
            while (var3.field4123 == 0) {
                class370.method2235(10L, 10);
            }
            if (var3.field4123 == 1) {
                if (arg2 != 115) {
                    return;
                }
                field3794++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class370.method2235(100L, 10);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZI)Lmc;", line = 145)
    public static final class316 method1545(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3787++;
        long var7 = (long) arg4 * 76724863L ^ (long) arg1 * 475427L ^ (long) arg3 * 97549L ^ (long) arg6 * 67481L ^ (long) arg0 * 986053L ^ (long) arg2 * 32147369L;
        if (arg5) {
            field3788 = 0.106723405F;
        }
        class316 var9 = (class316) class6.field49.method616(124, var7);
        if (var9 == null) {
            class316 var10 = class235.field3242.method1608(arg6, arg3, arg1, arg0, arg2, arg4);
            class6.field49.method615((byte) -103, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lvm;Z)V", line = 166)
    public static final void method1546(class322 arg0, boolean arg1) {
        if (class338.field4511) {
            class429.method2652(arg0, 2);
        } else {
            class402.method2527(arg0, (byte) 58);
        }
        field3793++;
        if (arg1) {
            field3800 = -56;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z", line = 186)
    public static final boolean method1547(byte arg0) {
        int var1 = -24 / ((-arg0 - 59) / 41);
        field3789++;
        class405 var2 = (class405) class342.field4577.field1942.field4506;
        if (var2 == null || class342.field4577.field1942 == var2) {
            return false;
        } else {
            if (var2.field5892 >= 2000) {
                var2.field5892 -= 2000;
            }
            return var2.field5892 == 1006;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIB)V", line = 218)
    public static final void method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3790++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg6 - arg4;
        int var12 = arg3 - arg4;
        int var13 = arg6 * arg6;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = 13 / ((20 - arg7) / 57);
        int var18 = var14 << 1;
        int var19 = var13 << 1;
        int var20 = var16 << 1;
        int var21 = var15 << 1;
        int var22 = arg3 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var22) * var13 + var18;
        int var25 = var14 - ((var22 - 1) * var19);
        int var26 = (1 - var23) * var15 + var20;
        int var27 = var16 - ((var23 - 1) * var21);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = (var23 - 3) * var21;
        int var36 = var29;
        int var37 = (arg3 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var30;
        int[] var40 = class153.field1932[arg5];
        class296.method1740(arg1 - arg6, var40, (byte) 81, arg0, arg1 - var11);
        class296.method1740(arg1 - var11, var40, (byte) 81, arg2, arg1 + var11);
        class296.method1740(arg1 + var11, var40, (byte) 81, arg0, arg1 + arg6);
        while (var9 > 0) {
            boolean var41 = var9 <= var12;
            if (var41) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var27 += var38;
                        var26 += var34;
                        var34 += var31;
                        var38 += var31;
                        var10++;
                    }
                }
                if (var27 < 0) {
                    var27 += var38;
                    var26 += var34;
                    var10++;
                    var38 += var31;
                    var34 += var31;
                }
                var26 += -var39;
                var27 += -var35;
                var39 -= var30;
                var35 -= var30;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var25 += var36;
                    var24 += var32;
                    var36 += var29;
                    var32 += var29;
                    var8++;
                }
            }
            if (var25 < 0) {
                var24 += var32;
                var25 += var36;
                var32 += var29;
                var8++;
                var36 += var29;
            }
            var25 += -var33;
            var24 += -var37;
            var9--;
            var37 -= var28;
            var33 -= var28;
            int var42 = arg5 - var9;
            int var43 = arg5 + var9;
            int var44 = arg1 + var8;
            int var45 = arg1 - var8;
            if (var41) {
                int var46 = arg1 + var10;
                int var47 = arg1 - var10;
                class296.method1740(var45, class153.field1932[var42], (byte) 81, arg0, var47);
                class296.method1740(var47, class153.field1932[var42], (byte) 81, arg2, var46);
                class296.method1740(var46, class153.field1932[var42], (byte) 81, arg0, var44);
                class296.method1740(var45, class153.field1932[var43], (byte) 81, arg0, var47);
                class296.method1740(var47, class153.field1932[var43], (byte) 81, arg2, var46);
                class296.method1740(var46, class153.field1932[var43], (byte) 81, arg0, var44);
            } else {
                class296.method1740(var45, class153.field1932[var42], (byte) 81, arg0, var44);
                class296.method1740(var45, class153.field1932[var43], (byte) 81, arg0, var44);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 387)
    public static void method1549(int arg0) {
        field3792 = null;
        field3797 = null;
        if (arg0 == -1) {
            field3799 = null;
        }
    }
}
