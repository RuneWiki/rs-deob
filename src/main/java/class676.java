import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class676 {

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    private int field9520 = -1;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    private int field9524 = 0;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lfha;")
    private class522 field9518 = new class522();

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "Z")
    public boolean field9527 = false;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    private int field9519;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    private int field9516;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "[Lhia;")
    private class570[] field9523;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "[[I")
    private int[][] field9513;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lqk;")
    public static class148 field9515 = new class148(85, 5);

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Lqk;")
    public static class148 field9522 = new class148(120, 7);

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "[F")
    public static float[] field9528 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field9531 = 0;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "Lqk;")
    public static class148 field9529 = new class148(73, 4);

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field9533 = 0;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method3870(byte arg0) {
        field9522 = null;
        field9528 = null;
        if (arg0 < -114) {
            field9515 = null;
            field9529 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method3871(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class556.field7850 = 0;
        class706.field9853 = 0;
        class582.field8284++;
        if ((arg5 & 0x2) == 0) {
            for (int var8 = 0; var8 < class269.field3635[var7]; var8++) {
                if (!class678.method3881(class261.field3566[var7][var8], arg0, arg1, arg2, arg3)) {
                    class724.method4055(class261.field3566[var7][var8]);
                    if (class261.field3566[var7][var8].field9491 != -1) {
                        class603.field8622[class556.field7850++] = class261.field3566[var7][var8];
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (int var9 = 0; var9 < class352.field4548[var7]; var9++) {
                if (!class678.method3881(class160.field2206[var7][var9], arg0, arg1, arg2, arg3)) {
                    class724.method4055(class160.field2206[var7][var9]);
                    if (class160.field2206[var7][var9].field9491 != -1) {
                        class232.field3220[class706.field9853++] = class160.field2206[var7][var9];
                    }
                }
            }
            for (int var10 = 0; var10 < class609.field8671[var7]; var10++) {
                if (!class678.method3881(class140.field1931[var7][var10], arg0, arg1, arg2, arg3)) {
                    if (class140.field1931[var7][var10].method283((byte) -35)) {
                        class724.method4055(class140.field1931[var7][var10]);
                        if (class140.field1931[var7][var10].field9491 != -1) {
                            class232.field3220[class706.field9853++] = class140.field1931[var7][var10];
                        }
                    } else {
                        class724.method4055(class140.field1931[var7][var10]);
                        if (class140.field1931[var7][var10].field9491 != -1) {
                            class603.field8622[class556.field7850++] = class140.field1931[var7][var10];
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class354.field4557; var11++) {
                    if (!class678.method3881(class707.field9873[var11], arg0, arg1, arg2, arg3)) {
                        class724.method4055(class707.field9873[var11]);
                        if (class707.field9873[var11].field9491 != -1) {
                            if (class707.field9873[var11].method283((byte) -73)) {
                                class232.field3220[class706.field9853++] = class707.field9873[var11];
                            } else {
                                class603.field8622[class556.field7850++] = class707.field9873[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class556.field7850 > 0) {
            class209.method1389(class603.field8622, 0, class556.field7850 - 1);
            for (int var12 = 0; var12 < class556.field7850; var12++) {
                class460.method2756(class603.field8622[var12], true, arg6);
            }
        }
        if (class561.field7980) {
            class646.field9160.method2106(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class383.field5378; var13 < class214.field3021; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class359.field4594.length;
                    if (class359.field4594.length + class422.field5839 > class485.field6556) {
                        var23 -= class359.field4594.length + class422.field5839 - class485.field6556;
                    }
                    int var24 = class359.field4594[0].length;
                    if (class359.field4594[0].length + class625.field8925 > class314.field4059) {
                        var24 -= class359.field4594[0].length + class625.field8925 - class314.field4059;
                    }
                    boolean[][] var25 = class419.field5809;
                    if (class22.field251) {
                        if (class659.field9305) {
                            var25 = class534.field7490[var13];
                        }
                        for (int var26 = class661.field9318; var26 < var23; var26++) {
                            int var27 = class422.field5839 + var26 - class661.field9318;
                            for (int var28 = class105.field1534; var28 < var24; var28++) {
                                if (class359.field4594[var26][var28] && !class614.method3603(class625.field8925 + var28 - class105.field1534, false, var27, var13)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class659.field9305) {
                        if (arg4 >= 0) {
                            class52.field741[var13].method517(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class52.field741[var13].method510(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class188.field2742; var29++) {
                            class66.field912[var29].method1652(-112, new class488(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class52.field741[var13].method517(class126.field1717, class157.field2139, class707.field9874, class419.field5809, true, arg4, arg5);
                    } else {
                        class52.field741[var13].method510(class126.field1717, class157.field2139, class707.field9874, class419.field5809, true, arg5);
                    }
                } else {
                    int var14 = class359.field4594.length;
                    if (class359.field4594.length + class422.field5839 > class485.field6556) {
                        var14 -= class359.field4594.length + class422.field5839 - class485.field6556;
                    }
                    int var15 = class359.field4594[0].length;
                    if (class359.field4594[0].length + class625.field8925 > class314.field4059) {
                        var15 -= class359.field4594[0].length + class625.field8925 - class314.field4059;
                    }
                    boolean[][] var16 = class419.field5809;
                    if (class22.field251) {
                        if (class659.field9305) {
                            var16 = class534.field7490[var13];
                        }
                        for (int var17 = class661.field9318; var17 < var14; var17++) {
                            int var18 = class422.field5839 + var17 - class661.field9318;
                            for (int var19 = class105.field1534; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class359.field4594[var17][var19]) {
                                    int var20 = class625.field8925 + var19 - class105.field1534;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class352.field4549[var21][var18][var20] != null && class352.field4549[var21][var18][var20].field535 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class614.method3603(var20, false, var18, var13)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class659.field9305) {
                        if (arg4 >= 0) {
                            class52.field741[var13].method517(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class52.field741[var13].method510(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class188.field2742; var22++) {
                            class66.field912[var22].method1652(-99, new class488(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class52.field741[var13].method517(class126.field1717, class157.field2139, class707.field9874, class419.field5809, false, arg4, arg5);
                    } else {
                        class52.field741[var13].method510(class126.field1717, class157.field2139, class707.field9874, class419.field5809, false, arg5);
                    }
                }
            }
        }
        if (class706.field9853 > 0) {
            class207.method1375(class232.field3220, 0, class706.field9853 - 1);
            for (int var30 = 0; var30 < class706.field9853; var30++) {
                class460.method2756(class232.field3220[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public final void method3872(int arg0) {
        for (int var2 = 0; var2 < this.field9519; var2++) {
            this.field9513[var2] = null;
        }
        field9514++;
        this.field9523 = null;
        int var3 = -87 % ((-arg0 - 75) / 34);
        this.field9513 = null;
        this.field9518.method3122(0);
        this.field9518 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[I")
    public final int[] method3873(int arg0, int arg1) {
        field9526++;
        if (arg0 != 0) {
            this.method3874(-25);
        }
        if (this.field9519 == this.field9516) {
            this.field9527 = this.field9523[arg1] == null;
            this.field9523[arg1] = class555.field7840;
            return this.field9513[arg1];
        } else if (this.field9519 == 1) {
            this.field9527 = this.field9520 != arg1;
            this.field9520 = arg1;
            return this.field9513[0];
        } else {
            class570 var3 = this.field9523[arg1];
            if (var3 == null) {
                this.field9527 = true;
                if (this.field9524 >= this.field9519) {
                    class570 var4 = (class570) this.field9518.method3114(arg0 - 86);
                    var3 = new class570(arg1, var4.field8080);
                    this.field9523[var4.field8082] = null;
                    var4.method3065(-17363);
                } else {
                    var3 = new class570(arg1, this.field9524);
                    this.field9524++;
                }
                this.field9523[arg1] = var3;
            } else {
                this.field9527 = false;
            }
            this.field9518.method3124(var3, (byte) -123);
            return this.field9513[var3.field8080];
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)[[I")
    public final int[][] method3874(int arg0) {
        field9525++;
        if (this.field9519 != this.field9516) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field9519; var2++) {
            this.field9523[var2] = class555.field7840;
        }
        if (arg0 < 46) {
            method3870((byte) 108);
        }
        return this.field9513;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(III)V")
    public class676(int arg0, int arg1, int arg2) {
        this.field9519 = arg0;
        this.field9516 = arg1;
        this.field9523 = new class570[this.field9516];
        this.field9513 = new int[this.field9519][arg2];
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Z")
    public static final boolean method3875(int arg0, int arg1, int arg2) {
        field9521++;
        int var3 = -73 % ((arg1 + 54) / 59);
        return class526.method3135((byte) -113, arg0, arg2) & class442.method2640(3, arg2, arg0);
    }
}
