import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class218 extends class63 {

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    public int field3104 = 0;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "Z")
    private boolean field3114 = false;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    private int field3113 = 0;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    public int field3115 = -1;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public int field3098 = -1;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
    public static int field3100 = 0;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "Lkca;")
    public static class82 field3109 = new class82(1);

    @OriginalMember(owner = "client!hm", name = "jb", descriptor = "Z")
    public static boolean field3120 = false;

    @OriginalMember(owner = "client!hm", name = "kb", descriptor = "Lrr;")
    public static class361 field3121 = new class361();

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!hm", name = "hb", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!hm", name = "ib", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!hm", name = "lb", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "Lbda;")
    public static class503 field3110;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lha;Z)Ltb;")
    public final class397 method397(class58 arg0, boolean arg1) {
        ++field3119;
        if (arg1) {
            this.method404(-28);
        }
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)I")
    public final int method404(int arg0) {
        if (arg0 != 65535) {
            return -123;
        } else {
            ++field3112;
            return -10;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(BLha;)V")
    public final void method401(byte arg0, class58 arg1) {
        ++field3116;
        if (arg0 != -39) {
            this.method393((byte) -28);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)Z")
    public static final boolean method1514(int arg0, int arg1, int arg2) {
        if (arg0 != -12064) {
            return true;
        } else {
            ++field3118;
            return class500.method3004(93, arg1, arg2) || class725.method4034(arg1, arg2, false);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lbj;Z)V")
    public static final void method1515(class241 arg0, boolean arg1) {
        ++field3103;
        boolean var2 = arg1;
        arg0.method1553(-116);
        for (class241 var3 = (class241) class211.field3046.method1196(-125); var3 != null; var3 = (class241) class211.field3046.method1204(false)) {
            if (class288.method1866(false, var3.method1622(-1), arg0.method1622(-1))) {
                class576.method3343(91, arg0, var3);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class211.field3046.method1203(arg0, -101);
        }
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(B)Z")
    public final boolean method395(byte arg0) {
        ++field3117;
        if (arg0 != 84) {
            method1514(42, 93, 51);
        }
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(B)Z")
    public final boolean method399(byte arg0) {
        ++field3111;
        if (arg0 != 38) {
            this.field3106 = -105;
        }
        return this.field3114;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lha;IZI)Z")
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field3099;
        class280 var5 = arg0.method530();
        if (!arg2) {
            return false;
        } else {
            var5.method157(super.field644, super.field651 + -10, super.field648);
            class253 var6 = class558.field7942.method721(-62, this.field3108);
            class469 var7 = var6.method1730((class90) null, (class718) null, -1, 131072, (byte) 45, 0, this.field3106, 0, arg0);
            if (var7 != null && (class339.field4781 ? var7.method318(arg3, arg1, var5, true, var6.field3603, class220.field3129) : var7.method348(arg3, arg1, var5, true, var6.field3603))) {
                return true;
            } else {
                if (~this.field3098 != 0) {
                    class253 var8 = class558.field7942.method721(-114, this.field3098);
                    class469 var9 = var8.method1730((class90) null, (class718) null, -1, 131072, (byte) 45, 0, this.field3101, 0, arg0);
                    if (var9 != null && (!class339.field4781 ? var9.method348(arg3, arg1, var5, true, var8.field3603) : var9.method318(arg3, arg1, var5, true, var8.field3603, class220.field3129))) {
                        return true;
                    }
                }
                if (~this.field3115 != 0) {
                    class253 var10 = class558.field7942.method721(-123, this.field3115);
                    class469 var11 = var10.method1730((class90) null, (class718) null, -1, 131072, (byte) 45, 0, this.field3122, 0, arg0);
                    if (var11 != null && (class339.field4781 ? var11.method318(arg3, arg1, var5, true, var10.field3603, class220.field3129) : var11.method348(arg3, arg1, var5, true, var10.field3603))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field3102;
        if (arg0 != -83) {
            this.field3108 = 62;
        }
        return this.field3113;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public static void method1516(int arg0) {
        if (arg0 != 16383) {
            method1514(103, 55, -107);
        }
        field3109 = null;
        field3121 = null;
        field3110 = null;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(BLha;)Lvw;")
    public final class304 method396(byte arg0, class58 arg1) {
        ++field3107;
        class217 var3 = class130.method997(super.field649, super.field644 >> class440.field6142, super.field648 >> class440.field6142);
        if (var3 != null && var3.field3090.field1821) {
            int var4 = var3.field3090.method404(65535);
            if (~this.field3104 != ~var4) {
                super.field651 -= this.field3104;
                this.field3104 = var4;
                super.field651 += var4;
            }
        }
        class280 var5 = arg1.method530();
        var5.method181();
        if (var3 == null || !var3.field3090.field1821) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class278 var9 = class138.field2153[super.field659];
            int var10 = this.field3113 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1827(-3458, super.field644 - -var12, super.field648 - -var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1827(-3458, super.field644 - -var15, super.field648 - -var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1827(-3458, super.field644 - -var18, super.field648 + var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1827(-3458, super.field644 + var21, super.field648 - -var22);
            int var24 = var14 >= var17 ? var17 : var14;
            int var25 = var23 <= var20 ? var23 : var20;
            int var26 = ~var17 > ~var23 ? var17 : var23;
            int var27 = var14 >= var20 ? var20 : var14;
            if (var10 != 0) {
                int var28 = (int) (2607.5945876176133D * Math.atan2((double) (var24 - var25), (double) var10)) & 16383;
                if (~var28 != -1) {
                    var5.method188(var28);
                }
            }
            if (~var10 != -1) {
                int var29 = (int) (2607.5945876176133D * Math.atan2((double) (var27 - var26), (double) var10)) & 16383;
                if (~var29 != -1) {
                    var5.method156(-var29);
                }
            }
            int var30 = var14 + var23;
            if (var17 + var20 < var30) {
                var30 = var17 + var20;
            }
            int var31 = (var30 >> 1) + -super.field651;
            if (var31 != 0) {
                var5.method149(0, var31, 0);
            }
        }
        var5.method149(super.field644, super.field651 + -10, super.field648);
        class304 var32 = class359.method2239(3, true, (byte) 124);
        this.field3114 = false;
        if (arg0 < 3) {
            return null;
        } else {
            this.field3113 = 0;
            if (~this.field3115 != 0) {
                class469 var33 = class558.field7942.method721(79, this.field3115).method1730((class90) null, (class718) null, -1, 2048, (byte) 45, 0, this.field3122, 0, arg1);
                if (var33 != null) {
                    if (class339.field4781) {
                        var33.method343(var5, var32.field4298[2], class220.field3129, 0);
                    } else {
                        var33.method329(var5, var32.field4298[2], 0);
                    }
                    this.field3114 |= var33.method332();
                    this.field3113 = var33.method324();
                }
            }
            if (this.field3098 != -1) {
                class469 var34 = class558.field7942.method721(-79, this.field3098).method1730((class90) null, (class718) null, -1, 2048, (byte) 45, 0, this.field3101, 0, arg1);
                if (var34 != null) {
                    if (class339.field4781) {
                        var34.method343(var5, var32.field4298[1], class220.field3129, 0);
                    } else {
                        var34.method329(var5, var32.field4298[1], 0);
                    }
                    this.field3114 |= var34.method332();
                    if (~var34.method324() < ~this.field3113) {
                        this.field3113 = var34.method324();
                    }
                }
            }
            class469 var35 = class558.field7942.method721(-122, this.field3108).method1730((class90) null, (class718) null, -1, 2048, (byte) 45, 0, this.field3106, 0, arg1);
            if (var35 != null) {
                if (!class339.field4781) {
                    var35.method329(var5, var32.field4298[0], 0);
                } else {
                    var35.method343(var5, var32.field4298[0], class220.field3129, 0);
                }
                this.field3114 |= var35.method332();
                if (~var35.method324() < ~this.field3113) {
                    this.field3113 = var35.method324();
                }
            }
            return var32;
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(B)I")
    public final int method394(byte arg0) {
        ++field3105;
        if (arg0 != 1) {
            this.field3101 = -96;
        }
        class253 var2 = class558.field7942.method721(86, this.field3108);
        int var3 = var2.field3603;
        if (~this.field3098 != 0) {
            class253 var4 = class558.field7942.method721(-91, this.field3098);
            if (var3 < var4.field3603) {
                var3 = var4.field3603;
            }
        }
        if (this.field3115 != -1) {
            class253 var5 = class558.field7942.method721(arg0 ^ 70, this.field3115);
            if (~var3 > ~var5.field3603) {
                var3 = var5.field3603;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIII)V")
    public class218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }
}
