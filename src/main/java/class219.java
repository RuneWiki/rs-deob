import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class219 extends class78 {

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Z")
    public boolean field3490 = true;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field3506 = 128;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Lea;")
    public static class204 field3499 = new class204();

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "Lkj;")
    public static class178 field3509 = new class178(0, 0);

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "Lik;")
    public static class259 field3511 = new class259(64);

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "[[Z")
    public static boolean[][] field3512 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "Z")
    public static boolean field3514 = false;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "Lja;")
    public static class64 field3510;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "[I")
    public int[] field3498;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "[I")
    private int[] field3507;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field3504;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "[[I")
    private int[][] field3491;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3496++;
        if (class265.field4126) {
            int var8 = arg2 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class71.field1117 - class109.field1804) * var8 / 100 + class109.field1804;
            arg6 = arg6 * var9 >> 8;
        }
        int var10 = -7 % ((arg7 + 21) / 52);
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = arg6;
        if (var11 != 0) {
            int var16 = class174.field2731[var11];
            var13 = -arg6 * var16 >> 16;
            int var17 = class174.field2732[var11];
            var15 = arg6 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class174.field2731[var12];
            var14 = var15 * var18 >> 16;
            int var19 = class174.field2732[var12];
            var15 = var15 * var19 >> 16;
        }
        class48.field801 = arg0 - var13;
        class312.field4904 = arg1 - var15;
        class140.field2223 = arg4 - var14;
        class181.field2891 = arg3;
        class103.field1746 = arg5;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)I", line = 72)
    public final int method1577(int arg0, byte arg1) {
        if (arg1 >= -25) {
            return -83;
        } else {
            field3505++;
            return this.field3507 == null || arg0 < 0 || arg0 > this.field3507.length ? -1 : this.field3507[arg0];
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V", line = 90)
    public final void method1578(int arg0) {
        if (this.field3498 != null) {
            for (int var2 = 0; var2 < this.field3498.length; var2++) {
                this.field3498[var2] = class94.method673(this.field3498[var2], 32768);
            }
        }
        if (arg0 == 7291) {
            field3492++;
        }
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V", line = 110)
    public static void method1579(int arg0) {
        field3499 = null;
        field3511 = null;
        field3509 = null;
        field3510 = null;
        field3512 = (boolean[][]) null;
        if (arg0 != 24754) {
            method1576(-108, 104, -72, -113, -68, 47, -20, 67);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBI)I", line = 128)
    public final int method1580(int arg0, byte arg1, int arg2) {
        field3503++;
        if (arg1 >= -86) {
            this.field3491 = (int[][]) ((int[][]) null);
        }
        if (this.field3507 == null || arg0 < 0 || arg0 > this.field3507.length) {
            return -1;
        } else if (this.field3491[arg0] == null || arg2 < 0 || arg2 > this.field3491[arg0].length) {
            return -1;
        } else {
            return this.field3491[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)I", line = 161)
    public final int method1581(int arg0) {
        field3500++;
        if (arg0 != -1) {
            method1576(-41, 119, -106, 30, -27, -96, -115, -2);
        }
        return this.field3507 == null ? 0 : this.field3507.length;
    }

    @OriginalMember(owner = "client!li", name = "j", descriptor = "(I)Ljava/lang/String;", line = 175)
    public final String method1582(int arg0) {
        field3508++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3504 == null) {
            return "";
        }
        var2.append(this.field3504[0]);
        if (arg0 != -4) {
            return (String) null;
        }
        for (int var3 = 1; var3 < this.field3504.length; var3++) {
            var2.append("...");
            var2.append(this.field3504[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lpe;I)V", line = 205)
    public final void method1583(class101 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method741(55);
            if (var3 == 0) {
                field3495++;
                if (arg1 > -115) {
                    field3512 = (boolean[][]) ((boolean[][]) null);
                }
                return;
            }
            this.method1584(32443, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILpe;I)V", line = 222)
    private final void method1584(int arg0, class101 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3504 = class326.method2240(arg0 ^ 0xFFFF8118, arg1.method749((byte) -86), '<');
        } else if (arg2 == 2) {
            int var4 = arg1.method741(39);
            this.field3498 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3498[var5] = arg1.method731(false);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method741(113);
            this.field3491 = new int[var6][];
            this.field3507 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method731(false);
                this.field3507[var7] = var8;
                this.field3491[var7] = new int[class87.field1327[var8]];
                for (int var9 = 0; var9 < class87.field1327[var8]; var9++) {
                    this.field3491[var7][var9] = arg1.method731(false);
                }
            }
        } else if (arg2 == 4) {
            this.field3490 = false;
        }
        field3493++;
        if (arg0 != 32443) {
            this.method1581(122);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lpe;I)Ljava/lang/String;", line = 295)
    public final String method1585(class101 arg0, int arg1) {
        StringBuffer var3 = new StringBuffer(80);
        field3501++;
        if (this.field3507 != null) {
            for (int var4 = 0; var4 < this.field3507.length; var4++) {
                var3.append(this.field3504[var4]);
                var3.append(class217.method1573(arg0.method752(class197.field3127[this.field3507[var4]], 979), this.field3491[var4], this.field3507[var4], 13682));
            }
        }
        if (arg1 != 3813) {
            this.field3491 = (int[][]) ((int[][]) null);
        }
        var3.append(this.field3504[this.field3504.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!li", name = "k", descriptor = "(I)V", line = 323)
    public static final void method1586(int arg0) {
        field3497++;
        int var1 = 0;
        if (arg0 != -1267385406) {
            return;
        }
        while (var1 < class77.field1173) {
            int var2 = class145.field2279[var1];
            class305 var3 = class138.field2196[var2];
            if (var3 != null) {
                class127.method953(arg0 + 1267385534, var3, var3.field4778.field3292);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Loj;I)[Leg;", line = 358)
    public static final class302[] method1587(class325 arg0, int arg1) {
        field3502++;
        if (!arg0.method2233(-22152)) {
            return new class302[0];
        }
        class21 var2 = arg0.method2232(-19926);
        while (var2.field387 == 0) {
            class279.method1991(101, 10L);
        }
        if (var2.field387 == 2) {
            return new class302[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field391);
        class302[] var4 = new class302[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class302 var6 = new class302();
            var4[var5] = var6;
            var6.field4754 = var3[var5 << 2];
            var6.field4751 = var3[(var5 << 2) + 1];
            var6.field4749 = var3[(var5 << 2) + 2];
            var6.field4755 = var3[(var5 << 2) + 3];
        }
        if (arg1 < 62) {
            method1587((class325) null, -20);
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B[ILpe;)V", line = 402)
    public final void method1588(byte arg0, int[] arg1, class101 arg2) {
        field3489++;
        if (this.field3507 == null) {
            return;
        }
        for (int var4 = 0; this.field3507.length > var4 && arg1.length > var4; var4++) {
            int var5 = class226.field3616[this.method1577(var4, (byte) -119)];
            if (var5 > 0) {
                arg2.method757((long) arg1[var4], 108, var5);
            }
        }
        if (arg0 > -113) {
            field3513 = 39;
        }
    }
}
