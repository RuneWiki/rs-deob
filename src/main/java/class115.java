import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class115 extends class335 {

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "Z")
    private boolean field1472 = true;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    private int field1470 = 4096;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "Z")
    public static boolean field1477 = false;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "[[I")
    public static int[][] field1476 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "Leba;")
    public static class550 field1478 = new class550(74, 2);

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "Llg;")
    public static class32 field1479 = new class32(12, 0, 1, 0);

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "Lga;")
    public static class332 field1481;

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class115() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field1473;
        if (arg2 != -66) {
            this.field1470 = 69;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1472 = arg1.method930(255) == 1;
            }
        } else {
            this.field1470 = arg1.method963(-124);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lhe;IB)V")
    public static final void method675(class231 arg0, int arg1, byte arg2) {
        ++field1474;
        if (arg0.field2989 != null) {
            int var3 = arg0.field2989[arg1 + 1];
            if (~arg0.field3048 != ~var3) {
                arg0.field3048 = var3;
                arg0.field3051 = 0;
                arg0.field2991 = 0;
                arg0.field3026 = 1;
                arg0.field3085 = arg0.field3095;
                arg0.field3058 = 0;
                if (~arg0.field3048 != 0) {
                    class615.method3398(arg0.field2991, arg0.field398, class423.field5620.method1707(arg0.field3048, 65), -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                }
            }
        }
        int var4 = 23 / ((arg2 - -6) / 48);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B[B)Ljava/lang/String;")
    public static final String method676(byte arg0, byte[] arg1) {
        ++field1471;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        if (arg0 >= -124) {
            return null;
        } else {
            int var4 = 0;
            for (int var5 = 0; ~var5 > ~var2; ++var5) {
                int var6 = arg1[var5] & 255;
                if (~var6 <= -129) {
                    if (~var6 > -195) {
                        throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                    }
                    if (~var6 > -225) {
                        if (~(var5 + 1) <= ~var2) {
                            throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var7 = arg1[var5] & 255;
                        if (var7 < 128 || ~var7 < -192) {
                            throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                        }
                        var3[var4++] = (char) class665.method3789(class15.method97(-129, var7), class15.method97(-193, var6) << 6);
                    } else {
                        if (var6 >= 240) {
                            if (var6 >= 244) {
                                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                            }
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        if (var5 + 2 >= var2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var8 = arg1[var5] & 255;
                        if (~var8 <= -129 && ~var8 >= -192) {
                            ++var5;
                            int var9 = 255 & arg1[var5];
                            if (~var9 <= -129 && var9 <= 191) {
                                var3[var4++] = (char) class665.method3789(class15.method97(-129, var9), class665.method3789(class15.method97(var6, -225) << 12, class15.method97(-129, var8) << 6));
                                continue;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                } else {
                    var3[var4++] = (char) var6;
                }
            }
            return new String(var3, 0, var4);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field1475;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[] var4 = this.method1969(0, class326.field4386 & arg0 + -1, -89);
            int[] var5 = this.method1969(0, arg0, -85);
            int[] var6 = this.method1969(0, arg0 + 1 & class326.field4386, -61);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class649.field8968; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1470;
                int var12 = (var5[var10 - -1 & class29.field413] + -var5[var10 + -1 & class29.field413]) * this.field1470;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                    var18 = var11 / var17;
                }
                if (this.field1472) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        if (arg1) {
            field1481 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)V")
    public static void method677(int arg0) {
        field1481 = null;
        field1476 = null;
        field1479 = null;
        field1478 = null;
        if (arg0 != 0) {
            method677(-110);
        }
    }
}
