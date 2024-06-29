import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class111 extends class105 {

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "[S")
    private short[] field1945 = new short[257];

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    private int field1949 = 0;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "[[B")
    public static byte[][] field1937 = new byte[50][];

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "[J")
    public static long[] field1943 = new long[1000];

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "Lvf;")
    public static class265 field1933 = class87.method582(-46, "<col=ff9040>");

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "Z")
    public static boolean field1938 = false;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
    public static int field1952 = 0;

    @OriginalMember(owner = "client!cf", name = "hb", descriptor = "Lvf;")
    private static class265 field1954 = class87.method582(-46, "skill: ");

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "Lvf;")
    public static class265 field1934 = field1954;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "[I")
    private int[] field1941;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "[I")
    private int[] field1946;

    @OriginalMember(owner = "client!cf", name = "gb", descriptor = "[I")
    public static int[] field1953;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "[[I")
    private int[][] field1944;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            this.method12(-32, -42, (class135) null);
        }
        ++field1942;
        if (arg0 == 0) {
            this.field1949 = arg2.method920((byte) 84);
            this.field1944 = new int[arg2.method920((byte) 42)][2];
            for (int var4 = 0; ~var4 > ~this.field1944.length; ++var4) {
                this.field1944[var4][0] = arg2.method927(arg1 + -128);
                this.field1944[var4][1] = arg2.method927(127);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Lvf;")
    public static final class265 method732(byte arg0, int arg1) {
        ++field1940;
        if (~arg1 < -1 && arg1 <= 255) {
            class265 var2 = new class265();
            var2.field4640 = 1;
            int var3 = -50 / ((53 - arg0) / 37);
            var2.field4643 = new byte[1];
            var2.field4643[0] = (byte) arg1;
            return var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        if (this.field1944 == null) {
            this.field1944 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1948;
        if (~this.field1944.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1949 == 2) {
                this.method734(1);
            }
            class123.method831(118);
            this.method736(255);
            if (arg0) {
                this.method12(-76, -123, (class135) null);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)V")
    public static void method733(boolean arg0) {
        field1937 = null;
        field1954 = null;
        if (arg0) {
            field1953 = null;
        }
        field1943 = null;
        field1953 = null;
        field1933 = null;
        field1934 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class111() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
    private final void method734(int arg0) {
        ++field1951;
        int[] var2 = this.field1944[0];
        int[] var3 = this.field1944[arg0];
        int[] var4 = this.field1944[this.field1944.length + -2];
        int[] var5 = this.field1944[this.field1944.length + -1];
        this.field1946 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
        this.field1941 = new int[] { -var3[0] - (-var2[0] - var2[0]), var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)[I")
    private final int[] method735(int arg0, byte arg1) {
        if (arg1 != 94) {
            method733(false);
        }
        ++field1950;
        if (~arg0 > -1) {
            return this.field1941;
        } else {
            return arg0 >= this.field1944.length ? this.field1946 : this.field1944[arg0];
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field1947;
        if (arg0 != 8055) {
            return null;
        } else {
            int[] var3 = super.field1862.method458(arg1, false);
            if (super.field1862.field1236) {
                int[] var4 = this.method705(arg1, (byte) -119, 0);
                for (int var5 = 0; ~class94.field1668 < ~var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1945[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
    private final void method736(int arg0) {
        if (arg0 == 255) {
            int var2 = this.field1949;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~(this.field1944.length - 1) < ~var5 && ~this.field1944[var5][0] >= ~var4; ++var5) {
                        }
                        int[] var6 = this.field1944[var5];
                        int[] var7 = this.field1944[var5 + -1];
                        int var8 = (var4 - var7[0] << 12) / (var6[0] + -var7[0]);
                        int var9 = -class227.field4029[255 & var8 >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field1945[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~(this.field1944.length + -1) < ~var14 && ~var13 <= ~this.field1944[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field1944[var14 + -1];
                        int[] var16 = this.field1944[var14];
                        int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field1945[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field1944.length + -1) && var21 >= this.field1944[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field1944[var22 + -1];
                    int[] var24 = this.field1944[var22];
                    int var25 = this.method735(var22 + -2, (byte) 94)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method735(var22 + 1, (byte) 94)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = var27 - var25;
                    int var32 = -var25 + var26 + -var27 + var28;
                    int var33 = -var26 + var25 + -var32;
                    int var35 = var29 * var31 >> 12;
                    int var36 = var30 * var33 >> 12;
                    int var37 = (var29 * var32 >> 12) * var30 >> 12;
                    int var38 = var37 - -var36 + var26 + var35;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field1945[var20] = (short) var38;
                }
            }
            ++field1939;
        }
    }
}
