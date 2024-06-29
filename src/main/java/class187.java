import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class187 extends class366 {

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field2670 = -60;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "Las;")
    public static class85 field2661;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "Ljava/lang/String;")
    public String field2669;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "[C")
    public char[] field2664;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "[C")
    public char[] field2676;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
    public int[] field2671;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "[I")
    public int[] field2673;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "[Lbr;")
    public static class223[] field2662;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(CZ)I", line = 8)
    public final int method1337(char arg0, boolean arg1) {
        field2674++;
        if (this.field2673 == null) {
            return -1;
        } else if (arg1) {
            for (int var3 = 0; var3 < this.field2673.length; var3++) {
                if (this.field2676[var3] == arg0) {
                    return this.field2673[var3];
                }
            }
            return -1;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILlf;)V", line = 31)
    public final void method1338(int arg0, class130 arg1) {
        int var3 = -55 / ((arg0 + 41) / 33);
        while (true) {
            int var4 = arg1.method837(true);
            if (var4 == 0) {
                field2677++;
                return;
            }
            this.method1339(var4, (byte) 49, arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLlf;)V", line = 53)
    private final void method1339(int arg0, byte arg1, class130 arg2) {
        int var4 = -87 / ((arg1 + 10) / 48);
        field2666++;
        if (arg0 == 1) {
            this.field2669 = arg2.method843(-82);
        } else if (arg0 == 2) {
            int var5 = arg2.method837(true);
            this.field2671 = new int[var5];
            this.field2664 = new char[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2671[var6] = arg2.method798(false);
                byte var7 = arg2.method823((byte) 112);
                this.field2664[var6] = var7 == 0 ? 0 : class171.method1223(3043, var7);
            }
            return;
        } else if (arg0 == 3) {
            int var8 = arg2.method837(true);
            this.field2673 = new int[var8];
            this.field2676 = new char[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2673[var9] = arg2.method798(false);
                byte var10 = arg2.method823((byte) 104);
                this.field2676[var9] = var10 == 0 ? 0 : class171.method1223(3043, var10);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLmb;)Z", line = 122)
    public static final boolean method1340(boolean arg0, class143 arg1) {
        field2667++;
        class282 var2 = class398.method2496(-124, arg1.method599(-10450));
        if (var2.field4077 == -1) {
            return true;
        } else {
            class320 var3 = class41.method281(var2.field4077, arg0);
            return var3.field4680 == -1 ? true : var3.method2126(0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)V", line = 141)
    public static final void method1341(boolean arg0) {
        field2672++;
        if (!arg0) {
            method1346(127, 89, -127, 61, (byte) -90, -85, -41, 65, -2, 20);
        }
        if (class357.field5166 != null && class185.field2650 != null) {
            return;
        }
        class357.field5166 = new int[256];
        class185.field2650 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class357.field5166[var1] = (int) (Math.sin(var2) * 4096.0D);
            class185.field2650[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IC)I", line = 173)
    public final int method1342(int arg0, char arg1) {
        field2665++;
        if (this.field2671 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2671.length; var3++) {
            if (this.field2664[var3] == arg1) {
                return this.field2671[var3];
            }
        }
        if (arg0 != 3) {
            this.method1343(118);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 202)
    public final void method1343(int arg0) {
        field2678++;
        if (this.field2673 != null) {
            for (int var2 = 0; var2 < this.field2673.length; var2++) {
                this.field2673[var2] = class332.method2176(this.field2673[var2], 32768);
            }
        }
        if (this.field2671 != null) {
            for (int var3 = 0; var3 < this.field2671.length; var3++) {
                this.field2671[var3] = class332.method2176(this.field2671[var3], 32768);
            }
        }
        if (arg0 <= 81) {
            method1341(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZII)I", line = 231)
    public static final int method1344(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return 109;
        }
        field2663++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)V", line = 255)
    public static void method1345(boolean arg0) {
        if (arg0) {
            method1345(true);
        }
        field2661 = null;
        field2662 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIBIIIII)V", line = 272)
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 < 30) {
            return;
        }
        if (arg1 == arg9 && arg0 == arg3 && arg2 == arg7 && arg5 == arg8) {
            class170.method1216((byte) -79, arg0, arg6, arg8, arg1, arg7);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg3 * 3;
            int var16 = arg2 * 3;
            int var17 = arg5 * 3;
            int var18 = var14 + arg7 - var16 - arg1;
            int var19 = arg8 + var15 - arg0 - var17;
            int var20 = var16 - var14 - (-var12 + var14);
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg1;
                int var34 = (var30 + var32 + var28 >> 12) + arg0;
                class170.method1216((byte) -22, var11, arg6, var34, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field2668++;
    }
}
