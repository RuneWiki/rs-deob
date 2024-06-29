import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class283 extends class240 {

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    private int field4864 = 4096;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    private int field4875 = 4096;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field4866 = 4096;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Lcd;")
    public static class64 field4869 = class44.method335((byte) 71, "::clientdrop");

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lnf;")
    public static class62 field4865 = class288.method1988(false);

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lcd;")
    public static class64 field4877 = class44.method335((byte) 71, "::rect_debug");

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "Llh;")
    public static class22 field4873;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 3)
    public class283() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lja;I)V", line = 14)
    public static final void method1966(int arg0, class60[] arg1, int arg2) {
        int var3 = -97 % ((arg0 + 34) / 61);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class60 var5 = arg1[var4];
            if (var5 != null && var5.field1113 == arg2 && (!var5.field1017 || !client.method1763(var5))) {
                if (var5.field1091 == 0) {
                    if (!var5.field1017 && client.method1763(var5) && class189.field3256 != var5) {
                        continue;
                    }
                    method1966(73, arg1, var5.field1080);
                    if (var5.field1100 != null) {
                        method1966(101, var5.field1100, var5.field1080);
                    }
                    class172 var6 = (class172) class159.field2805.method1151((long) var5.field1080, 0);
                    if (var6 != null) {
                        class120.method846(var6.field2967, -68);
                    }
                }
                if (var5.field1091 == 6) {
                    if (var5.field1026 != -1 || var5.field1061 != -1) {
                        boolean var7 = class48.method356(var5, (byte) -99);
                        int var8;
                        if (var7) {
                            var8 = var5.field1061;
                        } else {
                            var8 = var5.field1026;
                        }
                        if (var8 != -1) {
                            class199 var9 = class281.method1944(var8, 0);
                            if (var9 != null) {
                                var5.field1085 += class249.field4327;
                                while (var5.field1085 > var9.field3419[var5.field1082]) {
                                    var5.field1085 -= var9.field3419[var5.field1082];
                                    var5.field1082++;
                                    if (var9.field3393.length <= var5.field1082) {
                                        var5.field1082 -= var9.field3395;
                                        if (var5.field1082 < 0 || var9.field3393.length <= var5.field1082) {
                                            var5.field1082 = 0;
                                        }
                                    }
                                    class190.method1342(var5, 0);
                                }
                            }
                        }
                    }
                    if (var5.field1095 != 0 && !var5.field1017) {
                        int var10 = var5.field1095 << 16 >> 16;
                        int var11 = class249.field4327 * var10;
                        int var12 = var5.field1095 >> 16;
                        var5.field1009 = var5.field1009 + var11 & 0x7FF;
                        int var13 = class249.field4327 * var12;
                        var5.field1146 = var5.field1146 + var13 & 0x7FF;
                        class190.method1342(var5, 0);
                    }
                }
            }
        }
        field4871++;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V", line = 118)
    public static final void method1967(int arg0) {
        if (class200.field3425 == 2) {
            if (class306.field5219 == class278.field4789 && class36.field581 == class245.field4259) {
                class200.field3425 = 0;
                class274.method1904(class220.field3736 - 1, -31786);
            }
        } else if (class278.field4789 == class268.field4609 && class245.field4259 == class238.field4061) {
            class200.field3425 = 0;
            class274.method1904(class220.field3736 - 1, -31786);
        } else {
            class306.field5219 = class268.field4609;
            class200.field3425 = 2;
            class36.field581 = class238.field4061;
        }
        if (arg0 == -21576) {
            field4876++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZILqm;I)[Lqd;", line = 169)
    public static final class40[] method1968(boolean arg0, int arg1, class222 arg2, int arg3) {
        field4868++;
        if (arg0) {
            return class135.method966(118, arg3, arg1, arg2) ? class228.method1646((byte) 127) : null;
        } else {
            return (class40[]) null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V", line = 183)
    public static void method1969(int arg0) {
        if (arg0 == -1) {
            field4873 = null;
            field4869 = null;
            field4877 = null;
            field4865 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIII)I", line = 200)
    public static final int method1970(boolean arg0, int arg1, int arg2, int arg3) {
        class115 var4 = (class115) class17.field351.method1151((long) arg2, 0);
        field4863++;
        if (var4 == null) {
            return 0;
        }
        if (arg3 < 61) {
            field4867 = -62;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field2109.length; var6++) {
            if (var4.field2109[var6] >= 0 && class72.field1396 > var4.field2109[var6]) {
                class92 var7 = class132.method949(var4.field2109[var6], false);
                if (var7.field1678 != null) {
                    class84 var8 = (class84) var7.field1678.method1151((long) arg1, 0);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field2112[var6] * var8.field1552;
                        } else {
                            var5 += var8.field1552;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILkh;)V", line = 260)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.field4875 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field4864 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field4866 = arg2.method112((byte) 92);
        }
        field4870++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[[I", line = 316)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 < 34) {
            this.method16(-84, -26, (class13) null);
        }
        field4874++;
        int[][] var3 = this.field4095.method1797(arg1, -34);
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(124, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class169.field2936; var11++) {
                int var12 = var6[var11];
                int var13 = var9[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var10[var11] = this.field4875 * var12 >> 12;
                    var7[var11] = this.field4864 * var13 >> 12;
                    var8[var11] = this.field4866 * var14 >> 12;
                } else {
                    var10[var11] = this.field4875;
                    var7[var11] = this.field4864;
                    var8[var11] = this.field4866;
                }
            }
        }
        return var3;
    }
}
