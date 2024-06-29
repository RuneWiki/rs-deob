import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field2192;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[[I")
    private int[][] field2199;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lfc;")
    public static class39 field2196 = class90.method774(" x ", -101);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lee;")
    public static class34 field2193 = new class34(5000);

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lfc;")
    public static class39 field2204 = class90.method774("compass", -113);

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lfc;")
    private static class39 field2205 = class90.method774("Enter name of player to delete from list", -86);

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lfc;")
    public static class39 field2201 = class90.method774(" )2> <col=ffff00>", -98);

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lfc;")
    public static class39 field2202 = field2205;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
    public static boolean field2206 = false;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field2207 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lv;")
    public static class142 field2197;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[Lke;")
    public static class74[] field2208;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 4)
    public final int method794(int arg0, int arg1) {
        if (arg0 != -9141) {
            this.method796(92, null);
        }
        field2195++;
        if (this.field2199 != null) {
            arg1 = (int) ((long) this.field2192 * (long) arg1 / (long) this.field2194);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 20)
    public static final void method795(byte arg0) {
        field2191++;
        if (class17.field482 == 104) {
            int var1;
            if (class146.field3647 == -1) {
                var1 = class100.field2506;
            } else {
                var1 = class146.field3647;
            }
            if (class146.field3647 != class100.field2506) {
                var1--;
                if (var1 < 0) {
                    var1 = 19;
                }
                if (class147.field3661[var1] != null) {
                    class107.field2685 = class147.field3661[var1];
                    class146.field3647 = var1;
                    class128.field3242 = true;
                }
            }
        }
        if (arg0 != -75) {
            method795((byte) -64);
        }
        if (class17.field482 != 105 || class146.field3647 == -1) {
            return;
        }
        class146.field3647++;
        if (class146.field3647 >= 20) {
            class146.field3647 = 0;
        }
        if (class146.field3647 == class100.field2506) {
            class128.field3242 = true;
            class107.field2685 = class107.field2693;
            class146.field3647 = -1;
        } else if (class147.field3661[class146.field3647] != null) {
            class107.field2685 = class147.field3661[class146.field3647];
            class128.field3242 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B)[B", line = 87)
    public final byte[] method796(int arg0, byte[] arg1) {
        if (arg0 != -309476240) {
            field2197 = null;
        }
        field2190++;
        if (this.field2199 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2192 / (long) this.field2194) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2199[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2192 + var6;
                int var14 = var13 / this.field2194;
                var5 += var14;
                var6 = var13 - this.field2194 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 166)
    public static void method797(int arg0) {
        field2193 = null;
        field2201 = null;
        field2208 = null;
        field2205 = null;
        field2202 = null;
        if (arg0 != 1230099650) {
            field2203 = 104;
        }
        field2196 = null;
        field2197 = null;
        field2204 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V", line = 194)
    public class94(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class62.method616(-75, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2192 = var5;
            this.field2194 = var4;
            this.field2199 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field2199[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)I", line = 259)
    public final int method798(int arg0, boolean arg1) {
        if (arg1) {
            method797(74);
        }
        if (this.field2199 != null) {
            arg0 = (int) ((long) this.field2192 * (long) arg0 / (long) this.field2194) + 6;
        }
        field2189++;
        return arg0;
    }
}
