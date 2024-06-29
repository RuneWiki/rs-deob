import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class10 extends class110 {

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    private int field87 = 4096;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    private int field86 = 2000;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    private int field90 = 0;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    private int field97 = 16;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Lfc;")
    public static class107 field94 = new class107(0, 0);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "[I")
    public static int[] field100 = new int[32];

    @OriginalMember(owner = "client!l", name = "V", descriptor = "J")
    public static long field101 = 0L;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Z")
    public static boolean field102 = false;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "[S")
    public static short[] field104 = new short[] { 14, 12, 16, 36, 59, 10, 44, 20 };

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILre;I)V", line = 20)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field98 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field86 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field97 = arg1.method1787(false);
        } else if (arg0 == 3) {
            this.field90 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field87 = arg1.method1830((byte) -77);
        }
        if (arg2 > -37) {
            method50(-20);
        }
        field88++;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V", line = 69)
    public static final void method45(int arg0) {
        field93++;
        int var1 = (class203.field3052 >> 10) + (class189.field2807 >> 3);
        int var2 = (class302.field4612 >> 10) + (class217.field3309 >> 3);
        byte var3 = 8;
        byte var4 = 0;
        byte var5 = 8;
        byte var6 = 18;
        class158.field2371 = new int[var6];
        class73.field947 = new byte[var6][];
        class28.field381 = new int[var6];
        class205.field3100 = new int[var6];
        class21.field262 = new byte[var6][];
        class110.field1692 = new int[var6];
        client.field1947 = new int[var6];
        class211.field3217 = new int[var6];
        if (arg0 != -1) {
            field95 = -121;
        }
        class304.field4631 = new byte[var6][];
        class51.field637 = new int[var6][4];
        class21.field257 = new byte[var6][];
        class96.field1443 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= ((var2 + 6) / 8); var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                client.field1947[var7] = var10;
                class110.field1692[var7] = class222.field3389.method1448((byte) 10, "m" + var8 + "_" + var9);
                class158.field2371[var7] = class222.field3389.method1448((byte) 10, "l" + var8 + "_" + var9);
                class28.field381[var7] = class222.field3389.method1448((byte) 10, "n" + var8 + "_" + var9);
                class211.field3217[var7] = class222.field3389.method1448((byte) 10, "um" + var8 + "_" + var9);
                class205.field3100[var7] = class222.field3389.method1448((byte) 10, "ul" + var8 + "_" + var9);
                if (class28.field381[var7] == -1) {
                    class110.field1692[var7] = -1;
                    class158.field2371[var7] = -1;
                    class211.field3217[var7] = -1;
                    class205.field3100[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class28.field381.length; var11++) {
            class28.field381[var11] = -1;
            class110.field1692[var11] = -1;
            class158.field2371[var11] = -1;
            class211.field3217[var11] = -1;
            class205.field3100[var11] = -1;
        }
        class30.method196(var5, var1, var3, true, var2, 0, var4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I", line = 155)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            method48(-33, -8, (byte) 36);
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = this.field87 >> 1;
            int[][] var5 = this.field1695.method439(-126);
            Random var6 = new Random((long) this.field98);
            for (int var7 = 0; var7 < this.field86; var7++) {
                int var8 = this.field87 > 0 ? this.field90 + (class216.method1488(this.field87, true, var6) - var4) : this.field90;
                int var9 = (var8 & 0xFF3) >> 4;
                int var10 = class216.method1488(class124.field1936, true, var6);
                int var11 = class216.method1488(class295.field4523, true, var6);
                int var12 = (class22.field285[var9] * this.field97 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = var10 + (class321.field4852[var9] * this.field97 >> 12);
                int var15 = var14 - var10;
                if (var15 != 0 || var13 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var15 < var13;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var14;
                        var14 = var12;
                        var12 = var18;
                        var11 = var17;
                    }
                    if (var14 < var10) {
                        int var19 = var10;
                        var10 = var14;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                        var14 = var19;
                    }
                    int var21 = var11;
                    int var22 = var14 - var10;
                    int var23 = var12 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = var12 > var11 ? 1 : -1;
                    int var27 = 1024 - (class216.method1488(4096, true, var6) >> 2);
                    for (int var28 = var10; var28 < var14; var28++) {
                        int var29 = ((var28 - var10) * var25) + var27 + 1024;
                        int var30 = var28 & class196.field2949;
                        int var31 = class154.field2320 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var26;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        field99++;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 290)
    public final void method47(int arg0) {
        if (arg0 != -9) {
            this.field86 = -89;
        }
        field89++;
        class314.method2157(-55);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)Lf;", line = 303)
    public static final class329 method48(int arg0, int arg1, byte arg2) {
        int var3 = 83 / ((arg2 - 62) / 35);
        class329 var4 = class80.method541((byte) 96, arg1);
        field92++;
        if (arg0 == -1) {
            return var4;
        } else if (var4 == null || var4.field4964 == null || arg0 >= var4.field4964.length) {
            return null;
        } else {
            return var4.field4964[arg0];
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 358)
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 326)
    public static final void method49(byte arg0) {
        class203.field3051 = null;
        class184.field2754 = null;
        class203.field3039 = null;
        field96++;
        class205.field3083 = (byte[][]) null;
        if (arg0 > 72) {
            class66.field865 = null;
            class160.field2403 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V", line = 342)
    public static void method50(int arg0) {
        field100 = null;
        field94 = null;
        if (arg0 >= -98) {
            method48(-27, -50, (byte) -41);
        }
        field104 = null;
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "(I)V", line = 375)
    public static final void method51(int arg0) {
        int var1 = class242.field3633;
        int var2 = class176.field2609;
        field91++;
        int var3 = class23.field347;
        int var4 = 6116423;
        int var5 = class163.field2466;
        int var6 = -49 % ((arg0 - 55) / 51);
        if (class117.field1817) {
            class308.method2126(var1, var3, var5, var2, var4);
            class308.method2126(var1 + 1, var3 + 1, var5 - 2, 16, 0);
            class308.method2128(var1 + 1, var3 + 18, var5 - 2, var2 + -19, 0);
        } else {
            class46.method312(var1, var3, var5, var2, var4);
            class46.method312(var1 + 1, var3 + 1, var5 - 2, 16, 0);
            class46.method318(var1 + 1, var3 - -18, var5 - 2, var2 + -19, 0);
        }
        class217.field3299.method620(class154.field2312, var1 + 3, var3 + 14, var4, -1);
        int var7 = class132.field2036;
        int var8 = class237.field3557;
        for (int var9 = 0; var9 < class190.field2829; var9++) {
            int var10 = (class190.field2829 - var9 - 1) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var1 && var7 < var1 + var5 && (var10 - 13) < var8 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            class217.field3299.method620(class163.method1152(-128, var9), var1 + 3, var10, var11, 0);
        }
        class162.method1147(class242.field3633, class163.field2466, class23.field347, 5, class176.field2609);
    }
}
