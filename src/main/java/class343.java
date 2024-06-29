import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class343 {

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    private int field4716 = -1;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    private int field4724 = 0;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Lmr;")
    private class611 field4715 = new class611();

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "Z")
    public boolean field4727 = false;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    private int field4722;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "[[[I")
    private int[][][] field4723;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "[Lml;")
    private class176[] field4726;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Z")
    public static boolean field4709 = false;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "S")
    public static short field4719 = 205;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[I")
    public static int[] field4720 = new int[2];

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "[Z")
    public static boolean[] field4711 = new boolean[200];

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2101(int arg0) {
        field4718++;
        if (this.field4722 != this.field4717) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 > -97) {
            this.field4716 = 97;
        }
        while (this.field4722 > var2) {
            this.field4726[var2] = class131.field1786;
            var2++;
        }
        return this.field4723;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lqk;II)Ljava/lang/String;")
    public static final String method2102(class146 arg0, int arg1, int arg2) {
        field4714++;
        if (arg1 < 70) {
            return null;
        } else if (!client.method2732(arg0).method2856((byte) 47, arg2) && arg0.field2086 == null) {
            return null;
        } else if (arg0.field2100 == null || arg2 >= arg0.field2100.length || arg0.field2100[arg2] == null || arg0.field2100[arg2].trim().length() == 0) {
            return class284.field3960 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field2100[arg2];
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method2103(byte arg0) {
        if (arg0 <= -112) {
            field4711 = null;
            field4720 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
    public final void method2104(boolean arg0) {
        field4721++;
        for (int var2 = 0; var2 < this.field4722; var2++) {
            this.field4723[var2][0] = null;
            this.field4723[var2][1] = null;
            this.field4723[var2][2] = null;
            this.field4723[var2] = null;
        }
        if (!arg0) {
            this.field4723 = null;
            this.field4726 = null;
            this.field4715.method3553(0);
            this.field4715 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lqt;Lha;Lda;BZLjava/lang/String;)V")
    public static final void method2105(class502 arg0, class543 arg1, class400 arg2, byte arg3, boolean arg4, String arg5) {
        field4708++;
        boolean var6 = !class694.field9824 || class192.method1359(96);
        if (!var6) {
            return;
        }
        if (class694.field9824 && var6) {
            class502 var12 = class596.field8478;
            class400 var13 = arg1.method322(var12, class367.field5364, true);
            int var14 = var12.method3067(250, arg5, arg3 ^ 0xFFFFFF88, null);
            int var15 = var12.method3065(250, null, arg5, var12.field7298, 0);
            int var16 = class40.field680.field9614;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (class404.field5762 > var18) {
                var18 = class404.field5762;
            }
            if (var19 < class574.field8268) {
                var19 = class574.field8268;
            }
            int var20 = class189.field2643.method71(class758.field10546, (byte) 59, var18) + class350.field5197;
            int var21 = class413.field5882.method995(var19, class544.field7915, (byte) 77) + class606.field8592;
            if (class416.field5919) {
                var20 += class352.method2243(arg3 ^ 0x7F);
                var21 += class695.method3915((byte) 86);
            }
            arg1.method202(class463.field6618, false).method775(class542.field7868.field9614 + var20, class542.field7868.field9618 + var21, var18 - (class542.field7868.field9614 * 2), var19 - class542.field7868.field9618 * 2, 1, 0, 0);
            arg1.method202(class542.field7868, true).method3128(var20, var21);
            class542.field7868.method3842();
            arg1.method202(class542.field7868, true).method3128(var18 + var20 - var16, var21);
            class542.field7868.method3838();
            arg1.method202(class542.field7868, true).method3128(var20 + var18 - var16, var19 + var21 - var16);
            class542.field7868.method3842();
            arg1.method202(class542.field7868, true).method3128(var20, var21 + var19 - var16);
            class542.field7868.method3838();
            arg1.method202(class40.field680, true).method3135(var20, var21 + class542.field7868.field9618, var16, var19 - class542.field7868.field9618 * 2);
            class40.field680.method3844();
            arg1.method202(class40.field680, true).method3135(var20 + class542.field7868.field9614, var21, var18 - (class542.field7868.field9614 * 2), var16);
            class40.field680.method3844();
            arg1.method202(class40.field680, true).method3135(var18 + var20 - var16, class542.field7868.field9618 + var21, var16, var19 - (class542.field7868.field9618 * 2));
            class40.field680.method3844();
            arg1.method202(class40.field680, true).method3135(class542.field7868.field9614 + var20, var19 + var21 + -var16, var18 - (class542.field7868.field9614 * 2), var16);
            class40.field680.method3844();
            var13.method2435(-1, arg5, 1, null, class205.field3092 | 0xFF000000, (byte) -71, null, var17 + var21, 0, 0, var19 - (var17 * 2), 0, var18 - (var17 * 2), var20 - -var17, null, 1);
            class517.method3144(var21, -122, var19, var18, var20);
        } else {
            int var7 = arg0.method3067(250, arg5, 119, null);
            int var8 = arg0.method3059(250, arg5, null, 160) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg1.method397(var10 - var9, var11 - var9, var9 + var9 + var7, var8 + var9 + var9, -16777216, 0);
            arg1.method305(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 - -var9 + var9, -1, 0);
            arg2.method2435(-1, arg5, 1, null, -1, (byte) -71, null, var11, 0, 0, var8, 0, var7, var10, null, 1);
            class517.method3144(var11 - var9, -119, var8 + var9 + var9, var7 + var9 + var9, var10 - var9);
        }
        if (arg4) {
            try {
                if (class416.field5919) {
                    class325.method2007(8);
                } else {
                    arg1.method3268(true);
                }
            } catch (class360 var22) {
            }
        }
        if (arg3 != -14) {
            field4720 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method2106(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field4712++;
        if (this.field4722 == this.field4717) {
            this.field4727 = this.field4726[arg0] == null;
            this.field4726[arg0] = class131.field1786;
            return this.field4723[arg0];
        } else if (this.field4722 == 1) {
            this.field4727 = this.field4716 != arg0;
            this.field4716 = arg0;
            return this.field4723[0];
        } else {
            class176 var3 = this.field4726[arg0];
            if (var3 == null) {
                this.field4727 = true;
                if (this.field4724 >= this.field4722) {
                    class176 var4 = (class176) this.field4715.method3564((byte) -118);
                    var3 = new class176(arg0, var4.field2469);
                    this.field4726[var4.field2462] = null;
                    var4.method2656((byte) 118);
                } else {
                    var3 = new class176(arg0, this.field4724);
                    this.field4724++;
                }
                this.field4726[arg0] = var3;
            } else {
                this.field4727 = false;
            }
            this.field4715.method3558(0, var3);
            return this.field4723[var3.field2469];
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILsl;)Ljava/lang/String;")
    public static final String method2107(int arg0, int arg1, class479 arg2) {
        field4725++;
        try {
            int var3 = arg2.method2889(-18098);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field6864 += class461.field6566.method2762(var3, arg2.field6864, 0, var4, arg2.field6800, -19956);
            return class62.method577(86, var4, var3, arg1);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(III)V")
    public class343(int arg0, int arg1, int arg2) {
        this.field4717 = arg1;
        this.field4722 = arg0;
        this.field4723 = new int[this.field4722][3][arg2];
        this.field4726 = new class176[this.field4717];
    }
}
