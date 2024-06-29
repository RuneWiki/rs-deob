import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class158 extends class96 {

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "[I")
    private int[] field2075 = new int[3];

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    private int field2076 = 4096;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    private int field2080 = 4096;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
    private int field2084 = 4096;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    private int field2078 = 409;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "Lpi;")
    public static class340 field2079 = new class340(15, -1);

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "[[I")
    public static int[][] field2083 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field2082;
        if (arg0 != 3) {
            method1063((byte) 20);
        }
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, -90, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class269.field3403; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2075[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field2078) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2075[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2078) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2075[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2078) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2084 * var12 >> 12;
                            var9[var11] = this.field2080 * var14 >> 12;
                            var10[var11] = this.field2076 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)V")
    public static void method1063(byte arg0) {
        field2079 = null;
        field2083 = null;
        int var1 = 43 % ((-3 - arg0) / 57);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 == -1) {
            ++field2081;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 == 4) {
                                int var5 = arg2.method584(255);
                                this.field2075[2] = class60.method339(255, var5) >> 12;
                                this.field2075[0] = class60.method339(var5, 16711680) << 4;
                                this.field2075[1] = class60.method339(65280, var5) >> 4;
                            }
                        } else {
                            this.field2084 = arg2.method568((byte) 110);
                        }
                    } else {
                        this.field2080 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field2076 = arg2.method568((byte) 110);
                }
            } else {
                this.field2078 = arg2.method568((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Z")
    public static final boolean method1064(int arg0, byte arg1) {
        if (arg1 >= -7) {
            return false;
        } else {
            ++field2077;
            return ~(-arg0 & arg0) == ~arg0;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method1065(byte arg0, int[] arg1) {
        ++field2085;
        StringBuffer var2 = new StringBuffer();
        int var3 = class221.field2853;
        int var4 = 0;
        if (arg0 != -67) {
            method1065((byte) -59, (int[]) null);
        }
        while (var4 < arg1.length) {
            class348 var5 = class285.field3637.method1243(-5922, arg1[var4]);
            if (~var5.field4445 != 0) {
                class404 var6 = (class404) class437.field5993.method78((long) var5.field4445, (byte) -127);
                if (var6 == null) {
                    class136 var7 = class136.method945(class391.field5121, var5.field4445, 0);
                    if (var7 != null) {
                        var6 = class512.field7538.method851(var7, true);
                        class437.field5993.method88((long) var5.field4445, arg0 + 106, var6);
                    }
                }
                if (var6 != null) {
                    class270.field3427[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
            ++var4;
        }
        return var2.toString();
    }
}
