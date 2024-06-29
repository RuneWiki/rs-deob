import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class208 extends class264 {

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    private int field3300 = 1;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
    private int field3301 = 1;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    private int field3298 = 204;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "Ltj;")
    public static class73 field3294 = new class73(50);

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "Leb;")
    public static class253 field3306 = null;

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "Lma;")
    public static class5 field3308 = class12.method119("_labels", (byte) 78);

    @OriginalMember(owner = "client!e", name = "vb", descriptor = "J")
    public static long field3309 = 0L;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "Lpe;")
    public static class245 field3296;

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "[[[I")
    public static int[][][] field3304;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V", line = 13)
    public static void method1367(int arg0) {
        field3308 = null;
        field3306 = null;
        field3294 = null;
        if (arg0 == 18415) {
            field3304 = (int[][][]) null;
            field3296 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(III)V", line = 27)
    public static final void method1368(int arg0, int arg1, int arg2) {
        field3297++;
        class250 var3 = class282.method1912(384132640, arg0, 1);
        var3.method1749(-32);
        if (arg2 == 3) {
            var3.field4137 = arg1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIB)I", line = 44)
    public static final int method1369(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 - 1 & arg2;
        if (arg3 > -14) {
            method1371(-108, -126);
        }
        int var5 = arg1 / arg0;
        field3295++;
        int var6 = arg1 & arg0 - 1;
        int var7 = arg2 / arg0;
        int var8 = class225.method1593(16, var5, var7);
        int var9 = class225.method1593(16, var5, var7 + 1);
        int var10 = class225.method1593(16, var5 + 1, var7);
        int var11 = class225.method1593(16, var5 + 1, var7 + 1);
        int var12 = class66.method472(var9, arg0, var8, var4, 2110642128);
        int var13 = class66.method472(var11, arg0, var10, var4, 2110642128);
        return class66.method472(var13, arg0, var12, var6, 2110642128);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[I", line = 74)
    public final int[] method5(int arg0, int arg1) {
        field3307++;
        int[] var3 = this.field4501.method1176(arg1, 127);
        if (arg0 >= -58) {
            method1369(-93, -37, -65, (byte) 109);
        }
        if (this.field4501.field2741) {
            for (int var4 = 0; var4 < class226.field3716; var4++) {
                int var5 = class251.field4159[var4];
                int var6 = class116.field1726[arg1];
                int var7 = this.field3301 * var5 >> 12;
                int var8 = this.field3300 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3301) * this.field3301;
                int var10 = var6 % (4096 / this.field3300) * this.field3300;
                if (var10 < this.field3298) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field3298) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field3298) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZII)V", line = 166)
    public static final void method1370(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3299++;
        class81[] var7 = class226.field3714;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class81 var9 = var7[var8];
            if (var9 != null && var9.field1259 == 2) {
                class290.method1959((var9.field1258 - class193.field3017 << 7) + var9.field1252, arg3 >> 1, arg6 >> 1, !arg4, arg2, var9.field1260 * 2, (var9.field1254 - class74.field1158 << 7) + var9.field1251, arg0);
                if (class39.field597 > -1 && class50.field784 % 20 < 10) {
                    class66.field1030[var9.field1249].method213(arg5 + class39.field597 - 12, class79.field1218 - 28 + arg1);
                }
            }
        }
        if (!arg4) {
            field3294 = (class73) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 195)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILii;)V", line = 200)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 >= -27) {
            method1367(61);
        }
        if (arg0 == 0) {
            this.field3301 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field3300 = arg2.method1509(true);
        } else if (arg0 == 2) {
            this.field3298 = arg2.method1524((byte) 53);
        }
        field3305++;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)I", line = 248)
    public static final int method1371(int arg0, int arg1) {
        if (arg1 <= 63) {
            return 84;
        } else {
            field3293++;
            return arg0 & 0x7F;
        }
    }
}
