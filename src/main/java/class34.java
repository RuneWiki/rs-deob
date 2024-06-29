import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class34 extends class263 {

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Z")
    public static boolean field418 = false;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Z")
    public static boolean field414 = false;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Z")
    public static boolean field420 = false;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "D")
    public static double field424 = -1.0D;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "[I")
    public static int[] field423 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)I")
    public static final int method193(int arg0, int arg1, int arg2) {
        ++field419;
        if (arg2 != -13057) {
            return -7;
        } else {
            class120 var3 = (class120) class42.field550.method872((byte) -83, (long) arg0);
            if (var3 == null) {
                return -1;
            } else {
                return arg1 >= 0 && ~var3.field1842.length < ~arg1 ? var3.field1842[arg1] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public static final void method194(int arg0) {
        int var1 = 0;
        if (arg0 != -27925) {
            field424 = 1.0725186676670286D;
        }
        while (var1 < class70.field1018) {
            int var2 = class208.field3323[var1];
            class208 var3 = class300.field4925[var2];
            int var4 = class192.field3042.method1420((byte) 0);
            if (~(var4 & 2) != -1) {
                var4 += class192.field3042.method1420((byte) 0) << 8;
            }
            class35.method216(var2, var4, (byte) -121, var3);
            ++var1;
        }
        ++field416;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method195(int arg0, String arg1) {
        ++field417;
        if (arg1 == null) {
            return -1;
        } else {
            int var2 = 0;
            if (arg0 != 1430) {
                return -113;
            } else {
                while (~class140.field2164 < ~var2) {
                    if (arg1.equalsIgnoreCase(class120.field1848[var2])) {
                        return var2;
                    }
                    ++var2;
                }
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V")
    public static void method196(int arg0) {
        if (arg0 >= -16) {
            field420 = false;
        }
        field423 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
    public static final void method197(int arg0, Object[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 > arg0) {
            int var5 = (arg0 - -arg3) / 2;
            int var6 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var6;
            Object var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg0;
            for (int var9 = arg0; ~arg3 < ~var9; ++var9) {
                if (~arg4[var9] > ~(var6 - -(1 & var9))) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var8];
                    arg4[var8] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var8];
                    arg1[var8++] = var11;
                }
            }
            arg4[arg3] = arg4[var8];
            arg4[var8] = var6;
            arg1[arg3] = arg1[var8];
            arg1[var8] = var7;
            method197(arg0, arg1, -1, var8 + -1, arg4);
            method197(var8 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg2 != -1) {
            field424 = -0.12734842096761467D;
        }
        ++field422;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field425;
        if (arg3 >= 128 && ~arg8 <= -129 && ~arg3 >= -13057 && arg8 <= 13056) {
            int var9 = -arg2 + class12.method66(arg3, class165.field2600, arg8, 0);
            int var10 = arg3 - class53.field715;
            int var11 = arg8 - class174.field2724;
            int var12 = class172.field2669[class132.field2037];
            if (arg0 == -10479) {
                int var13 = class172.field2658[class132.field2037];
                int var14 = class172.field2669[class100.field1514];
                int var15 = var9 - class262.field4326;
                int var16 = class172.field2658[class100.field1514];
                int var17 = var10 * var16 + var11 * var14 >> 16;
                int var18 = var11 * var16 + -(var10 * var14) >> 16;
                int var20 = var13 * var15 - var12 * var18 >> 16;
                int var21 = var12 * var15 + var13 * var18 >> 16;
                int var23 = arg6 + var17;
                if (~var21 > -51) {
                    class227.field3597 = -1;
                    class19.field256 = -1;
                } else {
                    class227.field3597 = (var20 << 9) / var21 + arg1;
                    class19.field256 = arg4 - -((var23 << 9) / var21);
                }
            }
        } else {
            class227.field3597 = -1;
            class19.field256 = -1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)V")
    public static final void method199(int arg0, byte arg1, int arg2) {
        class120.field1849 = -arg2 - -class13.field169 + -1 + class13.field165;
        class184.field2862 = arg0 - class13.field173;
        if (arg1 == -124) {
            ++field415;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field426;
        if (arg1 != -2) {
            field414 = false;
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498 && this.method1819((byte) -26)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = arg0 % super.field4336 * super.field4336;
            int[] var7 = var3[2];
            for (int var8 = 0; class42.field590 > var8; ++var8) {
                int var9 = super.field4335[var8 % super.field4342 + var6];
                var7[var8] = class10.method53(4080, var9 << 4);
                var4[var8] = class10.method53(var9, 65280) >> 4;
                var5[var8] = class10.method53(4080, var9 >> 12);
            }
        }
        return var3;
    }
}
