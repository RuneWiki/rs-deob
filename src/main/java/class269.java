import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class269 extends class195 {

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    private int field4436 = 0;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    private int field4442 = 0;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    private int field4435 = 0;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "Lck;")
    public static class119 field4430 = class298.method1987((byte) 107, "::rect_debug");

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    private int field4447;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "Lva;")
    public static class36 field4440;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V", line = 7)
    private final void method1783(int arg0, int arg1, int arg2, int arg3) {
        field4444++;
        int var5 = arg3 > 2048 ? arg2 + arg3 - (arg2 * arg3 >> 12) : (arg2 + 4096) * arg3 >> 12;
        if (arg0 != 14061) {
            this.field4436 = -65;
        }
        if (var5 <= 0) {
            this.field4447 = this.field4445 = this.field4441 = arg3;
            return;
        }
        int var6 = arg3 + arg3 - var5;
        int var7 = arg1 * 6;
        int var8 = (var5 - var6 << 12) / var5;
        int var9 = var7 >> 12;
        int var11 = var8 * var5 >> 12;
        int var12 = var7 - (var9 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var6 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field4447 = var5;
            this.field4441 = var6;
            this.field4445 = var14;
        } else if (var9 == 1) {
            this.field4447 = var15;
            this.field4441 = var6;
            this.field4445 = var5;
        } else if (var9 == 2) {
            this.field4441 = var14;
            this.field4447 = var6;
            this.field4445 = var5;
        } else if (var9 == 3) {
            this.field4441 = var5;
            this.field4445 = var15;
            this.field4447 = var6;
        } else if (var9 == 4) {
            this.field4441 = var5;
            this.field4447 = var14;
            this.field4445 = var6;
        } else if (var9 == 5) {
            this.field4447 = var5;
            this.field4445 = var6;
            this.field4441 = var15;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)[[I", line = 116)
    public final int[][] method9(byte arg0, int arg1) {
        if (arg0 != 3) {
            this.field4443 = 61;
        }
        field4432++;
        int[][] var3 = this.field3126.method603(arg1, arg0 ^ 0xFFFFFF81);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, -10072);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class157.field2504; var11++) {
                this.method1789(var7[var11], 0, var5[var11], var6[var11]);
                this.field4439 += this.field4436;
                this.field4443 += this.field4435;
                if (this.field4439 < 0) {
                    this.field4439 = 0;
                }
                while (this.field4443 < 0) {
                    this.field4443 += 4096;
                }
                if (this.field4439 > 4096) {
                    this.field4439 = 4096;
                }
                this.field4448 += this.field4442;
                if (this.field4448 < 0) {
                    this.field4448 = 0;
                }
                if (this.field4448 > 4096) {
                    this.field4448 = 4096;
                }
                while (this.field4443 > 4096) {
                    this.field4443 -= 4096;
                }
                this.method1783(14061, this.field4443, this.field4448, this.field4439);
                var9[var11] = this.field4447;
                var8[var11] = this.field4445;
                var10[var11] = this.field4441;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLfj;)Lti;", line = 186)
    public static final class120 method1784(byte arg0, class3 arg1) {
        field4446++;
        return arg0 == 64 ? new class120(arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method48(64), arg1.method64((byte) 58)) : (class120) null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 213)
    public class269() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V", line = 217)
    public static final void method1785(long[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        field4438++;
        if (arg4 != 1374812652 || arg1 >= arg3) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        Object var9 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var9;
        for (int var10 = arg1; var10 < arg3; var10++) {
            if (arg0[var10] < var7 + ((long) (var10 & 0x1))) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var13 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var13;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var9;
        method1785(arg0, arg1, arg2, var6 - 1, 1374812652);
        method1785(arg0, var6 + 1, arg2, arg3, 1374812652);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(III)V", line = 273)
    public static final void method1786(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class35.field481; var3++) {
            for (int var4 = 0; var4 < class208.field3328; var4++) {
                for (int var5 = 0; var5 < class103.field1569; var5++) {
                    class104 var6 = class150.field2390[var3][var4][var5];
                    if (var6 != null) {
                        class146 var7 = var6.field1593;
                        if (var7 != null && var7.field2348.method1465()) {
                            class106.method692(var7.field2348, var3, var4, var5, 1, 1);
                            if (var7.field2347 != null && var7.field2347.method1465()) {
                                class106.method692(var7.field2347, var3, var4, var5, 1, 1);
                                var7.field2348.method1481(var7.field2347, 0, 0, 0, false);
                                var7.field2347 = var7.field2347.method1453(arg0, arg1, arg2);
                            }
                            var7.field2348 = var7.field2348.method1453(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1596; var8++) {
                            class196 var9 = var6.field1610[var8];
                            if (var9 != null && var9.field3140.method1465()) {
                                class106.method692(var9.field3140, var3, var4, var5, var9.field3136 + 1 - var9.field3131, var9.field3137 - var9.field3146 + 1);
                                var9.field3140 = var9.field3140.method1453(arg0, arg1, arg2);
                            }
                        }
                        class199 var10 = var6.field1598;
                        if (var10 != null && var10.field3178.method1465()) {
                            class58.method432(var10.field3178, var3, var4, var5);
                            var10.field3178 = var10.field3178.method1453(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfj;II)V", line = 345)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field4434++;
        if (arg2 == 0) {
            this.field4435 = arg0.method59((byte) -68);
        } else if (arg2 == 1) {
            this.field4442 = (arg0.method24(false) << 12) / 100;
        } else if (arg2 == 2) {
            this.field4436 = (arg0.method24(false) << 12) / 100;
        }
        if (arg1 >= -117) {
            method1787(-116, 23);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 389)
    public static final void method1787(int arg0, int arg1) {
        class104 var2 = class150.field2390[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class104 var4 = class150.field2390[var3][arg0][arg1] = class150.field2390[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1592--;
                for (int var5 = 0; var5 < var4.field1596; var5++) {
                    class196 var6 = var4.field1610[var5];
                    if ((var6.field3130 >> 29 & 0x3L) == 2L && var6.field3131 == arg0 && var6.field3146 == arg1) {
                        var6.field3132--;
                    }
                }
            }
        }
        if (class150.field2390[0][arg0][arg1] == null) {
            class150.field2390[0][arg0][arg1] = new class104(0, arg0, arg1);
        }
        class150.field2390[0][arg0][arg1].field1603 = var2;
        class150.field2390[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V", line = 433)
    public static void method1788(byte arg0) {
        field4430 = null;
        if (arg0 < 34) {
            method1785((long[]) null, 56, (Object[]) null, -74, 70);
        }
        field4440 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIII)V", line = 462)
    private final void method1789(int arg0, int arg1, int arg2, int arg3) {
        field4431++;
        if (arg1 != 0) {
            this.field4439 = -56;
        }
        int var5 = arg3 >= arg2 ? arg3 : arg2;
        int var6 = arg2 >= arg3 ? arg3 : arg2;
        int var7 = var6 > arg0 ? arg0 : var6;
        int var8 = arg0 > var5 ? arg0 : var5;
        int var9 = var8 - var7;
        if (var9 <= 0) {
            this.field4443 = 0;
        } else {
            int var10 = (var8 - arg3 << 12) / var9;
            int var11 = (var8 - arg2 << 12) / var9;
            int var12 = (var8 - arg0 << 12) / var9;
            if (arg2 == var8) {
                this.field4443 = arg3 == var7 ? var12 + 20480 : -var10 + 4096;
            } else if (arg3 == var8) {
                this.field4443 = arg0 == var7 ? var11 + 4096 : -var12 + 12288;
            } else {
                this.field4443 = arg2 == var7 ? var10 + 12288 : -var11 + 20480;
            }
            this.field4443 /= 6;
        }
        this.field4439 = (var7 + var8) / 2;
        if (this.field4439 > 0 && this.field4439 < 4096) {
            this.field4448 = (var9 << 12) / (this.field4439 > 2048 ? 8192 - (this.field4439 * 2) : this.field4439 * 2);
        } else {
            this.field4448 = 0;
        }
    }
}
