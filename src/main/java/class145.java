import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class145 extends class499 implements class459 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    private int field1854;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Ldq;")
    public static class493 field1857 = new class493(16, -1);

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 4)
    public final int method969(int arg0) {
        ++field1861;
        if (arg0 != 8072) {
            method975((byte) 90, (class89) null, (class89) null);
        }
        return this.field1854;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 15)
    public static void method970(int arg0) {
        field1857 = null;
        if (arg0 != 8) {
            field1862 = 3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BIIB)V", line = 25)
    public final void method971(byte[] arg0, int arg1, int arg2, byte arg3) {
        this.method3008(arg0, arg2);
        ++field1853;
        this.field1854 = arg1;
        int var5 = 80 / ((arg3 - -21) / 52);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lug;ILjaggl/memory/NativeBuffer;)V", line = 36)
    public class145(class395 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field1854 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J", line = 45)
    public final long method972(byte arg0) {
        ++field1860;
        int var2 = 98 / ((arg0 - -63) / 41);
        return super.field7226.method2593();
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lug;I[BI)V", line = 56)
    public class145(class395 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1854 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method973(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class363.field4726; ++var3) {
            class425 var4 = class473.field6854[var3];
            if (var4.field6042 == 1) {
                int var5 = var4.field6029 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6025 * var5 >> 8) + var4.field6036;
                    int var7 = (var4.field6032 * var5 >> 8) + var4.field6033;
                    int var8 = (var4.field6037 * var5 >> 8) + var4.field6030;
                    int var9 = (var4.field6035 * var5 >> 8) + var4.field6026;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6042 == 2) {
                int var10 = arg0 - var4.field6029;
                if (var10 > 0) {
                    int var11 = (var4.field6025 * var10 >> 8) + var4.field6036;
                    int var12 = (var4.field6032 * var10 >> 8) + var4.field6033;
                    int var13 = (var4.field6037 * var10 >> 8) + var4.field6030;
                    int var14 = (var4.field6035 * var10 >> 8) + var4.field6026;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6042 == 3) {
                int var15 = var4.field6036 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6024 * var15 >> 8) + var4.field6029;
                    int var17 = (var4.field6028 * var15 >> 8) + var4.field6041;
                    int var18 = (var4.field6037 * var15 >> 8) + var4.field6030;
                    int var19 = (var4.field6035 * var15 >> 8) + var4.field6026;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6042 == 4) {
                int var20 = arg2 - var4.field6036;
                if (var20 > 0) {
                    int var21 = (var4.field6024 * var20 >> 8) + var4.field6029;
                    int var22 = (var4.field6028 * var20 >> 8) + var4.field6041;
                    int var23 = (var4.field6037 * var20 >> 8) + var4.field6030;
                    int var24 = (var4.field6035 * var20 >> 8) + var4.field6026;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6042 == 5) {
                int var25 = arg1 - var4.field6030;
                if (var25 > 0) {
                    int var26 = (var4.field6024 * var25 >> 8) + var4.field6029;
                    int var27 = (var4.field6028 * var25 >> 8) + var4.field6041;
                    int var28 = (var4.field6025 * var25 >> 8) + var4.field6036;
                    int var29 = (var4.field6032 * var25 >> 8) + var4.field6033;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I", line = 189)
    public final int method974(int arg0) {
        ++field1859;
        return arg0 != 27847 ? -125 : 0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLwf;Lwf;)V", line = 200)
    public static final void method975(byte arg0, class89 arg1, class89 arg2) {
        ++field1858;
        if (arg2.field1094 != null) {
            arg2.method701(119);
        }
        arg2.field1099 = arg1.field1099;
        arg2.field1094 = arg1;
        int var3 = -64 / ((77 - arg0) / 48);
        arg2.field1094.field1099 = arg2;
        arg2.field1099.field1094 = arg2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V", line = 220)
    public static final void method976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1856;
        class40.field511.field6631 = 0;
        class40.field511.method2729(class266.field3364.field1865, false);
        class40.field511.method2729(arg4, false);
        class40.field511.method2729(arg1, false);
        class40.field511.method2759((byte) -27, arg0);
        class40.field511.method2759((byte) -95, arg2);
        class45.field539 = -3;
        class312.field3984 = 0;
        class533.field7846 = 1;
        if (arg3 >= -119) {
            method970(39);
        }
        class456.field6562 = 0;
    }
}
