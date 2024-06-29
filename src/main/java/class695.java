import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class695 {

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public int field9737 = 0;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "Z")
    private boolean field9748 = false;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public int field9749 = 0;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public static int field9739 = 16777215;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    private int field9734;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public int field9735;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public int field9736;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public int field9738;

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
    public int field9741;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public int field9743;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public int field9750;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public int field9751;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public int field9753;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
    public int field9754;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "J")
    public long field9747;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "[I")
    public static int[] field9740;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    public final void method3821(int arg0) {
        field9752++;
        if (arg0 >= -114) {
            this.field9754 = -91;
        }
        this.field9754 = class435.field6135[this.field9734 << 3];
        long var2 = (long) this.field9738;
        long var4 = (long) this.field9751;
        long var6 = (long) this.field9750;
        this.field9753 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field9736 == 0) {
            this.field9736 = 1;
        }
        if (this.field9741 == 0) {
            this.field9747 = 2147483647L;
        } else if (this.field9741 == 1) {
            this.field9747 = (this.field9753 * 8 / this.field9736);
            this.field9747 *= this.field9747;
        } else if (this.field9741 == 2) {
            this.field9747 = (this.field9753 * 8 / this.field9736);
        }
        if (this.field9748) {
            this.field9753 *= -1;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lnp;I)V")
    public final void method3822(class115 arg0, int arg1) {
        field9742++;
        while (true) {
            int var3 = arg0.method620((byte) -127);
            if (var3 == 0) {
                if (arg1 == 1) {
                    return;
                } else {
                    this.field9754 = -80;
                    return;
                }
            }
            this.method3825(var3, arg1 ^ 0xFFFFFF93, arg0);
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V")
    public static void method3823(int arg0) {
        field9740 = null;
        if (arg0 != -5) {
            field9739 = -45;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;Lr;Lla;ZLho;Z)V")
    public static final void method3824(String arg0, class564 arg1, class413 arg2, boolean arg3, class463 arg4, boolean arg5) {
        field9744++;
        boolean var6 = !class474.field6834 || class66.method351(0);
        if (!var6) {
            return;
        }
        if (arg3) {
            method3824(null, null, null, false, null, true);
        }
        if (class474.field6834 && var6) {
            class463 var12 = class537.field7558;
            class413 var13 = arg1.method998(var12, class385.field5195, true);
            int var14 = var12.method2664(arg0, null, 250, (byte) 21);
            int var15 = var12.method2660(250, false, var12.field6602, arg0, null);
            int var16 = class103.field1110.field7873;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (class507.field7279 > var18) {
                var18 = class507.field7279;
            }
            if (var19 < class602.field8469) {
                var19 = class602.field8469;
            }
            int var20 = class564.field8064.method1426(class267.field3329, var18, -1) + class42.field413;
            int var21 = class629.field8862.method3625(var19, class87.field873, 0) + class631.field8880;
            arg1.method1041(class460.field6530, false).method307(class8.field85.field7873 + var20, class8.field85.field7872 + var21, var18 - (class8.field85.field7873 * 2), -(class8.field85.field7872 * 2) + var19, 1, 0, 0);
            arg1.method1041(class8.field85, true).method3001(var20, var21);
            class8.field85.method3115();
            arg1.method1041(class8.field85, true).method3001(var18 + var20 - var16, var21);
            class8.field85.method3114();
            arg1.method1041(class8.field85, true).method3001(var20 + var18 - var16, -var16 + var21 - -var19);
            class8.field85.method3115();
            arg1.method1041(class8.field85, true).method3001(var20, var21 + var19 - var16);
            class8.field85.method3114();
            arg1.method1041(class103.field1110, true).method3003(var20, class8.field85.field7872 + var21, var16, var19 - (class8.field85.field7872 * 2));
            class103.field1110.method3124();
            arg1.method1041(class103.field1110, true).method3003(class8.field85.field7873 + var20, var21, var18 - (class8.field85.field7873 * 2), var16);
            class103.field1110.method3124();
            arg1.method1041(class103.field1110, true).method3003(var20 + var18 - var16, class8.field85.field7872 + var21, var16, var19 - class8.field85.field7872 * 2);
            class103.field1110.method3124();
            arg1.method1041(class103.field1110, true).method3003(class8.field85.field7873 + var20, var19 + var21 - var16, var18 - (class8.field85.field7873 * 2), var16);
            class103.field1110.method3124();
            var13.method2313(null, null, 0, 89, 1, -1, var18 - (var17 * 2), var17 + var21, var19 - var17 * 2, 1, 0, class175.field1958 | 0xFF000000, var17 + var20, arg0, 0, null);
            class556.method3151(var18, var21, var20, 0, var19);
        } else {
            int var7 = arg4.method2664(arg0, null, 250, (byte) 21);
            int var8 = arg4.method2661(null, 114, 250, arg0) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg1.method1022(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 - -var9, -16777216, 0);
            arg1.method999(var10 - var9, -var9 + var11, var7 + var9 + var9, var9 + var9 + var8, -1, 0);
            arg2.method2313(null, null, 0, 110, 1, -1, var7, var11, var8, 1, 0, -1, var10, arg0, 0, null);
            class556.method3151(var7 + var9 + var9, -var9 + var11, var10 - var9, 0, var8 + var9 + var9);
        }
        if (arg5) {
            try {
                arg1.method979();
            } catch (class20 var22) {
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILnp;)V")
    private final void method3825(int arg0, int arg1, class115 arg2) {
        int var4 = -43 % ((arg1 + 36) / 42);
        if (arg0 == 1) {
            this.field9734 = arg2.method643((byte) -77);
        } else if (arg0 == 2) {
            arg2.method620((byte) -128);
        } else if (arg0 == 3) {
            this.field9738 = arg2.method631(false);
            this.field9751 = arg2.method631(false);
            this.field9750 = arg2.method631(false);
        } else if (arg0 == 4) {
            this.field9741 = arg2.method620((byte) -127);
            this.field9736 = arg2.method631(false);
        } else if (arg0 == 6) {
            this.field9735 = arg2.method620((byte) 40);
        } else if (arg0 == 8) {
            this.field9737 = 1;
        } else if (arg0 == 9) {
            this.field9749 = 1;
        } else if (arg0 == 10) {
            this.field9748 = true;
        }
        field9745++;
    }
}
