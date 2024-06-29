import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class333 {

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public int field4937 = 43594;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field4941 = 443;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Z")
    private boolean field4939 = false;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "Z")
    private boolean field4940 = false;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Lrw;")
    public static class703 field4944 = new class703(3, 2);

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "[F")
    public static float[] field4947 = new float[16];

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field4946 = 1;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Ljava/lang/String;")
    public String field4948;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2096(int arg0, int arg1) {
        field4933++;
        if (arg1 != 611577031) {
            method2100((byte) 119);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lkq;I)V", line = 16)
    public static final void method2097(class549 arg0, int arg1) {
        field4934++;
        arg0.field7712 = null;
        int var2 = arg0.field7711.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field7711[var3].field3896 = false;
        }
        if (arg1 != -1) {
            field4947 = null;
        }
        class392[] var4 = class552.field7824;
        synchronized (class552.field7824) {
            if (var2 < class552.field7824.length && class97.field1522[var2] < 200) {
                class552.field7824[var2].method2413(arg0, (byte) 96);
                int var10002 = class97.field1522[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2098(int arg0) {
        field4932++;
        class337.method2119();
        if (arg0 != -4107) {
            field4944 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 59)
    public static void method2099(int arg0) {
        field4944 = null;
        if (arg0 == -2) {
            field4947 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I", line = 77)
    public static final int method2100(byte arg0) {
        field4936++;
        return arg0 < 117 ? 12 : class546.field7679;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILmn;)Z", line = 88)
    public final boolean method2101(int arg0, class333 arg1) {
        field4945++;
        if (arg0 > -18) {
            this.method2104(-88, null);
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field4938 == arg1.field4938 && this.field4948.equals(arg1.field4948);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLpaa;B)V", line = 116)
    public static final void method2102(boolean arg0, class577 arg1, byte arg2) {
        field4943++;
        if (class340.field5002 >= 400) {
            return;
        }
        int var3 = 54 % ((arg2 + 14) / 47);
        class592 var4 = arg1.field8121;
        if (var4.field8315 != null) {
            var4 = var4.method3356(94, class61.field1163);
            if (var4 == null) {
                return;
            }
        }
        if (!var4.field8352) {
            return;
        }
        String var5 = var4.field8294;
        if (var4.field8327 != 0) {
            String var6 = class673.field9519 == class586.field8208 ? class274.field4146.method1804(7175, class512.field7203) : class274.field4144.method1804(7175, class512.field7203);
            var5 = var5 + class322.method2017(class648.field9106.field6971, 12858, var4.field8327) + " (" + var6 + var4.field8327 + ")";
        }
        if (class245.field3797 && !arg0) {
            class262 var7 = class642.field9054 == -1 ? null : class329.field4869.method3552(class642.field9054, -119);
            if ((class435.field6357 & 0x2) != 0 && (var7 == null || var4.method3348(var7.field3986, class642.field9054, (byte) -45) != var7.field3986)) {
                class605.method3404(0, class338.field4988 + " -> <col=ffff00>" + var5, 0, true, 25, -1, false, -42, class484.field6876, (long) arg1.field6216, class331.field4896);
                class693.field9735++;
            }
        }
        if (!arg0) {
            String[] var8 = var4.field8302;
            if (class676.field9569) {
                var8 = class122.method925(false, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (var4.field8359 == 0 || !var8[var9].equalsIgnoreCase(class274.field4139.method1804(7175, class512.field7203)))) {
                        byte var10 = 0;
                        int var11 = class102.field1607;
                        if (var9 == 0) {
                            var10 = 15;
                        }
                        if (var9 == 1) {
                            var10 = 13;
                        }
                        if (var9 == 2) {
                            var10 = 49;
                        }
                        if (var9 == 3) {
                            var10 = 30;
                        }
                        if (var9 == 4) {
                            var10 = 45;
                        }
                        if (var4.field8333 == var9) {
                            var11 = var4.field8347;
                        }
                        if (var4.field8322 == var9) {
                            var11 = var4.field8323;
                        }
                        class605.method3404(0, "<col=ffff00>" + var5, 0, true, var10, -1, false, -112, var8[var9].equalsIgnoreCase(class274.field4139.method1804(7175, class512.field7203)) ? var4.field8306 : var11, (long) arg1.field6216, var8[var9]);
                        class215.field3021++;
                    }
                }
            }
            if (var4.field8359 == 1 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class274.field4139.method1804(7175, class512.field7203))) {
                        short var13 = 0;
                        if (var4.field8327 > class648.field9106.field6971) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 15;
                        }
                        if (var12 == 1) {
                            var14 = 13;
                        }
                        if (var12 == 2) {
                            var14 = 49;
                        }
                        if (var12 == 3) {
                            var14 = 30;
                        }
                        if (var12 == 4) {
                            var14 = 45;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class165.field2370++;
                        class605.method3404(0, "<col=ffff00>" + var5, 0, true, var14, -1, false, -65, var4.field8306, (long) arg1.field6216, var8[var12]);
                    }
                }
            }
        }
        class605.method3404(0, "<col=ffff00>" + var5, 0, true, 1007, -1, arg0, -14, class231.field3602, (long) arg1.field6216, class274.field4138.method1804(7175, class512.field7203));
        class637.field9000++;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 274)
    public final void method2103(int arg0) {
        field4935++;
        if (!this.field4939) {
            this.field4940 = true;
            this.field4939 = true;
        } else if (this.field4940) {
            this.field4940 = false;
        } else {
            this.field4939 = false;
        }
        if (arg0 != -1) {
            field4946 = 122;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILft;)Lpga;", line = 301)
    public final class494 method2104(int arg0, class4 arg1) {
        if (arg0 != 29767) {
            method2099(85);
        }
        field4942++;
        return arg1.method20(arg0 ^ 0x7447, this.field4948, this.field4939 ? this.field4941 : this.field4937, this.field4940);
    }
}
