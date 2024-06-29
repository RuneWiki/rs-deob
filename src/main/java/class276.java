import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class276 extends class120 {

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "[I")
    public static int[] field4511 = new int[256];

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "Lfl;")
    public static class86 field4519 = new class86(16);

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "Lok;")
    private static class41 field4520 = class137.method956("Oct", 45);

    @OriginalMember(owner = "client!ij", name = "ib", descriptor = "Lok;")
    private static class41 field4526 = class137.method956("Apr", 45);

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "Lok;")
    private static class41 field4522 = class137.method956("Aug", 45);

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "Lok;")
    private static class41 field4525 = class137.method956("Sep", 45);

    @OriginalMember(owner = "client!ij", name = "kb", descriptor = "Lok;")
    private static class41 field4528 = class137.method956("May", 45);

    @OriginalMember(owner = "client!ij", name = "jb", descriptor = "Lok;")
    private static class41 field4527 = class137.method956("Feb", 45);

    @OriginalMember(owner = "client!ij", name = "nb", descriptor = "Lok;")
    private static class41 field4531 = class137.method956("Jun", 45);

    @OriginalMember(owner = "client!ij", name = "pb", descriptor = "Lok;")
    private static class41 field4533 = class137.method956("Dec", 45);

    @OriginalMember(owner = "client!ij", name = "lb", descriptor = "Lok;")
    private static class41 field4529 = class137.method956("Jul", 45);

    @OriginalMember(owner = "client!ij", name = "ob", descriptor = "Lok;")
    private static class41 field4532 = class137.method956("Jan", 45);

    @OriginalMember(owner = "client!ij", name = "mb", descriptor = "Lok;")
    private static class41 field4530 = class137.method956("Nov", 45);

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "Lok;")
    private static class41 field4523 = class137.method956("Mar", 45);

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "[Lok;")
    public static class41[] field4524 = new class41[] { field4532, field4527, field4523, field4526, field4528, field4531, field4529, field4522, field4525, field4520, field4530, field4533 };

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ij", name = "qb", descriptor = "Lal;")
    public static class134 field4534;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "[Led;")
    private class51[] field4513;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "[[[B")
    public static byte[][][] field4521;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V", line = 7)
    public static void method1955(boolean arg0) {
        field4521 = (byte[][][]) null;
        field4527 = null;
        field4511 = null;
        field4531 = null;
        field4533 = null;
        field4524 = null;
        field4532 = null;
        field4519 = null;
        field4522 = null;
        field4525 = null;
        field4523 = null;
        field4530 = null;
        field4529 = null;
        field4520 = null;
        if (!arg0) {
            field4526 = null;
            field4534 = null;
            field4528 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IZ)[[I", line = 39)
    public final int[][] method168(int arg0, boolean arg1) {
        field4514++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int var4 = class226.field3609;
            int var5 = class307.field5160;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field1764.method870((byte) -105);
            this.method1958(82, var6);
            for (int var8 = 0; var8 < class226.field3609; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class307.field5160; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class217.method1563(var15, 255) << 4;
                    var13[var14] = class217.method1563(var15 >> 4, 4080);
                    var11[var14] = class217.method1563(16711680, var15) >> 12;
                }
            }
        }
        if (!arg1) {
            this.method1958(89, (int[][]) ((int[][]) null));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I", line = 99)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            field4527 = (class41) null;
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            this.method1958(122, this.field1775.method860(0));
        }
        field4516++;
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)I", line = 129)
    public static final int method1956(int arg0, int arg1) {
        field4517++;
        if (arg1 != -15417) {
            field4532 = (class41) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)V", line = 142)
    public static final void method1957(int arg0, int arg1) {
        field4512++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class97.field1423 += arg1 * 128;
        if (class184.field3007.length < class97.field1423) {
            class97.field1423 -= class184.field3007.length;
            int var3 = (int) (Math.random() * 12.0D);
            class62.method434((byte) -28, class208.field3362[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class116.field1694[var4 + var5] - (class184.field3007[class97.field1423 + var4 & class184.field3007.length - 1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class116.field1694[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class116.field1694[var10 + var11] = 255;
                } else {
                    class116.field1694[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            field4511[var13] = field4511[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            field4511[var14] = (int) (Math.sin((double) class118.field1740 / 14.0D) * 16.0D + Math.sin((double) class118.field1740 / 15.0D) * 14.0D + Math.sin((double) class118.field1740 / 16.0D) * 12.0D);
            class118.field1740++;
        }
        class268.field4286 += arg1;
        int var15 = ((arg0 & class18.field234) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class268.field4286; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class116.field1694[(var18 << 7) + var17] = 192;
        }
        class268.field4286 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var20 += class116.field1694[var21 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class116.field1694[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class97.field1430[var22 + var21] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class97.field1430[var15 * 128 + var26 + var23];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class97.field1430[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class116.field1694[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[[I)V", line = 316)
    private final void method1958(int arg0, int[][] arg1) {
        if (arg0 < 77) {
            return;
        }
        field4515++;
        int var3 = class307.field5160;
        int var4 = class226.field3609;
        class57.method397(arg1, 6);
        class145.method1003(0, class27.field410, class51.field776, 0, (byte) -32);
        if (this.field4513 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4513.length; var5++) {
            class51 var6 = this.field4513[var5];
            int var7 = var6.field772;
            int var8 = var6.field767;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method71(var3, 0, var4);
                }
            } else if (var8 < 0) {
                var6.method72(-15071, var4, var3);
            } else {
                var6.method73(0, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llb;II)V", line = 370)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field4518++;
        if (arg2 == 0) {
            this.field4513 = new class51[arg0.method792(2)];
            for (int var4 = 0; var4 < this.field4513.length; var4++) {
                int var5 = arg0.method792(arg1 + 3);
                if (var5 == 0) {
                    this.field4513[var4] = class110.method743(arg0, (byte) -34);
                } else if (var5 == 1) {
                    this.field4513[var4] = class132.method925(arg0, true);
                } else if (var5 == 2) {
                    this.field4513[var4] = class294.method2033(-123, arg0);
                } else if (var5 == 3) {
                    this.field4513[var4] = class59.method415(arg0, -115);
                }
            }
        } else if (arg2 == 1) {
            this.field1770 = arg0.method792(2) == 1;
        }
        if (arg1 != -1) {
            field4531 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 449)
    public class276() {
        super(0, true);
    }
}
