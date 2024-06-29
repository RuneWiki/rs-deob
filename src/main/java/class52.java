import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class52 {

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
    public int[] field850 = new int[6];

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[I")
    public int[] field856 = new int[16];

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[Z")
    public boolean[] field852 = new boolean[256];

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[I")
    public int[] field862 = new int[256];

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "[[I")
    public int[][] field860 = new int[6][258];

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    public int[] field842 = new int[257];

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[B")
    public byte[] field851 = new byte[4096];

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "[[B")
    public byte[][] field855 = new byte[6][258];

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "[[I")
    public int[][] field854 = new int[6][258];

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "[B")
    public byte[] field873 = new byte[18002];

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "[[I")
    public int[][] field878 = new int[6][258];

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public int field879 = 0;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "[B")
    public byte[] field874 = new byte[18002];

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "[Z")
    public boolean[] field877 = new boolean[16];

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public int field883 = 0;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "[B")
    public byte[] field876 = new byte[256];

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Ljava/lang/String;")
    public static String field864 = "K";

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field870 = 0;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field868 = -1;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "B")
    public byte field841;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lad;")
    public static class326 field849;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[B")
    public byte[] field846;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[B")
    public static byte[] field875;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "[B")
    public byte[] field884;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "[I")
    public static int[] field885;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)I", line = 23)
    public static final int method431(byte arg0, int arg1) {
        field843++;
        if (arg0 <= 86) {
            method432(-109, -127, 62, 73, -124, false, 84);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIZI)V", line = 36)
    public static final void method432(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field866++;
        class217.method1532(-109, arg3);
        int var7 = 0;
        int var8 = arg3 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -1;
        if (!arg5) {
            field875 = (byte[]) null;
        }
        int var13 = -var8;
        int var14 = -1;
        int var15 = arg4 - var8;
        int var16 = arg4 + var8;
        int[] var17 = class34.field525[arg2];
        class272.method1876(var17, var15, arg4 - arg3, arg1, (byte) -123);
        class272.method1876(var17, var16, var15, arg0, (byte) -83);
        class272.method1876(var17, arg3 + arg4, var16, arg1, (byte) -62);
        while (var7 < var9) {
            var14 += 2;
            var13 += var14;
            var12 += 2;
            if (var13 >= 0 && var11 >= 1) {
                class158.field2373[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var7++;
            var10 += var12;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class34.field525[arg2 + var9];
                    int[] var19 = class34.field525[arg2 - var9];
                    int var20 = arg4 + var7;
                    int var21 = arg4 - var7;
                    class272.method1876(var18, var20, var21, arg1, (byte) -36);
                    class272.method1876(var19, var20, var21, arg1, (byte) -106);
                } else {
                    int[] var22 = class34.field525[arg2 - var9];
                    int[] var23 = class34.field525[arg2 + var9];
                    int var24 = class158.field2373[var9];
                    int var25 = arg4 + var7;
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var24;
                    int var28 = arg4 - var24;
                    class272.method1876(var23, var28, var26, arg1, (byte) -96);
                    class272.method1876(var23, var27, var28, arg0, (byte) -44);
                    class272.method1876(var23, var25, var27, arg1, (byte) -100);
                    class272.method1876(var22, var28, var26, arg1, (byte) -78);
                    class272.method1876(var22, var27, var28, arg0, (byte) -35);
                    class272.method1876(var22, var25, var27, arg1, (byte) -26);
                }
            }
            int[] var29 = class34.field525[arg2 + var7];
            int var30 = arg4 + var9;
            int[] var31 = class34.field525[arg2 - var7];
            int var32 = arg4 - var9;
            if (var7 >= var8) {
                class272.method1876(var29, var30, var32, arg1, (byte) -79);
                class272.method1876(var31, var30, var32, arg1, (byte) -18);
            } else {
                int var33 = var11 < var7 ? class158.field2373[var7] : var11;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class272.method1876(var29, var35, var32, arg1, (byte) -13);
                class272.method1876(var29, var34, var35, arg0, (byte) -50);
                class272.method1876(var29, var30, var34, arg1, (byte) -73);
                class272.method1876(var31, var35, var32, arg1, (byte) -56);
                class272.method1876(var31, var34, var35, arg0, (byte) -85);
                class272.method1876(var31, var30, var34, arg1, (byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 173)
    public static void method433(boolean arg0) {
        field864 = null;
        field885 = null;
        field849 = null;
        if (!arg0) {
            method434(72, (class220) null, 76);
        }
        field875 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILtb;I)I", line = 188)
    public static final int method434(int arg0, class220 arg1, int arg2) {
        field867++;
        if (!client.method393(arg1).method1086(arg2, -71) && arg1.field3414 == null) {
            return -1;
        } else {
            if (arg0 != 21030) {
                method435(-126, 66, (byte) 51);
            }
            return arg1.field3416 == null || arg1.field3416.length <= arg2 ? -1 : arg1.field3416[arg2];
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)V", line = 234)
    public static final void method435(int arg0, int arg1, byte arg2) {
        field869++;
        class285.field4461[arg0] = arg1;
        int var3 = 5 / ((arg2 - 33) / 44);
        class65 var4 = (class65) class292.field4538.method1222(0, (long) arg0);
        if (var4 == null) {
            class65 var5 = new class65(class102.method743((byte) 76) + 500L);
            class292.field4538.method1227(var5, 0, (long) arg0);
        } else {
            var4.field1022 = class102.method743((byte) 75) + 500L;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 277)
    public static final int method436(int arg0, int arg1) {
        field865++;
        return arg0 >= -66 ? -125 : arg1 >>> 8;
    }
}
