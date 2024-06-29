import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class488 extends class98 {

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public int field6755 = -1;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "Z")
    private boolean field6758 = false;

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "I")
    private int field6766 = 0;

    @OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
    public int field6769 = -1;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public int field6751;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public int field6753;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!hg", name = "gb", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIII)V", line = 5)
    public class488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)Z", line = 12)
    public final boolean method161(int arg0) {
        if (arg0 != 28602) {
            this.field6766 = 21;
        }
        ++field6761;
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lga;Z)V", line = 23)
    public static final void method2800(class332 arg0, boolean arg1) {
        class392.field5247 = arg0.method1959(5743, "p11_full");
        if (!arg1) {
            ++field6762;
            class360.field4778 = arg0.method1959(5743, "p12_full");
            class90.field1087 = arg0.method1959(5743, "b12_full");
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLr;II)Z", line = 36)
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field6756;
        class487 var5 = arg1.method1153();
        if (arg0) {
            this.method167(true, (class562) null, 92, 63);
        }
        var5.method359(super.field398, super.field388 + -10, super.field397);
        class634 var6 = class116.method683(super.field385, super.field398 >> class62.field762, super.field397 >> class62.field762);
        if (var6 != null && var6.field8767.field415) {
            var5.method356(0, var6.field8767.method176((byte) -127), 0);
        }
        class470 var7 = class87.field1058.method1394(-109, this.field6751).method3231(0, 128, (class186) null, this.field6753, 131072, (class321) null, -1, 0, arg1);
        if (var7 != null && (!class347.field4632 ? var7.method655(arg3, arg2, var5, true) : var7.method603(arg3, arg2, var5, true, class414.field5430))) {
            return true;
        } else {
            if (this.field6755 != -1) {
                class470 var8 = class87.field1058.method1394(-65, this.field6755).method3231(0, 128, (class186) null, this.field6759, 131072, (class321) null, -1, 0, arg1);
                if (var8 != null && (!class347.field4632 ? var8.method655(arg3, arg2, var5, true) : var8.method603(arg3, arg2, var5, true, class414.field5430))) {
                    return true;
                }
            }
            if (~this.field6769 != 0) {
                class470 var9 = class87.field1058.method1394(-118, this.field6769).method3231(0, 128, (class186) null, this.field6752, 131072, (class321) null, -1, 0, arg1);
                if (var9 != null && (class347.field4632 ? var9.method603(arg3, arg2, var5, true, class414.field5430) : var9.method655(arg3, arg2, var5, true))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "(I)I", line = 80)
    public final int method173(int arg0) {
        ++field6768;
        if (arg0 != 0) {
            method2801((byte) -55);
        }
        return this.field6766;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Z", line = 95)
    public static final boolean method2801(byte arg0) {
        if (arg0 < 65) {
            method2801((byte) 125);
        }
        ++field6757;
        return !class324.method1882("jaclib", 78) ? false : class324.method1882("hw3d", -23);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLr;)Lqw;", line = 112)
    public final class329 method165(byte arg0, class562 arg1) {
        ++field6754;
        class634 var3 = class116.method683(super.field385, super.field398 >> class62.field762, super.field397 >> class62.field762);
        class487 var4 = arg1.method1153();
        var4.method352();
        if (var3 == null || !var3.field8767.field415) {
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            class270 var8 = class246.field3214[super.field386];
            int var9 = this.field6766 << 1;
            int var11 = -var9 / 2;
            int var12 = -var9 / 2;
            int var13 = var8.method1609(super.field398 + var11, super.field397 + var12, -128);
            int var14 = var9 / 2;
            int var15 = -var9 / 2;
            int var16 = var8.method1609(super.field398 + var14, super.field397 + var15, -126);
            int var17 = -var9 / 2;
            int var18 = var9 / 2;
            int var19 = var8.method1609(super.field398 + var17, super.field397 + var18, -125);
            int var20 = var9 / 2;
            int var21 = var9 / 2;
            int var22 = var8.method1609(super.field398 + var20, super.field397 + var21, -123);
            int var23 = ~var16 >= ~var13 ? var16 : var13;
            int var24 = var19 >= var22 ? var22 : var19;
            int var25 = var22 > var16 ? var16 : var22;
            int var26 = var13 >= var19 ? var19 : var13;
            if (~var9 != -1) {
                int var27 = 16383 & (int) (Math.atan2((double) (-var24 + var23), (double) var9) * 2607.5945876176133D);
                if (var27 != 0) {
                    var4.method364(var27);
                }
            }
            int var28 = var13 + var22;
            if (var9 != 0) {
                int var29 = (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var26), (double) var9)) & 16383;
                if (var29 != 0) {
                    var4.method348(-var29);
                }
            }
            if (var16 + var19 < var28) {
                var28 = var16 + var19;
            }
            int var30 = (var28 >> 1) + -super.field388;
            if (~var30 != -1) {
                var4.method356(0, var30, 0);
            }
        }
        var4.method356(super.field398, super.field388 + -10, super.field397);
        if (var3 != null && var3.field8767.field415) {
            var4.method356(0, var3.field8767.method176((byte) -124), 0);
        }
        class329 var31 = class541.method3035(27479, 3);
        this.field6758 = false;
        this.field6766 = 0;
        if (arg0 <= 109) {
            return null;
        } else {
            if (this.field6769 != -1) {
                class470 var32 = class87.field1058.method1394(-114, this.field6769).method3231(0, 128, (class186) null, this.field6752, 2048, (class321) null, -1, 0, arg1);
                if (var32 != null) {
                    if (!class347.field4632) {
                        var32.method625(var4, var31.field4414[2], 0);
                    } else {
                        var32.method648(var4, var31.field4414[2], class414.field5430, 0);
                    }
                    this.field6758 |= var32.method657();
                    this.field6766 = var32.method621();
                }
            }
            if (this.field6755 != -1) {
                class470 var33 = class87.field1058.method1394(-53, this.field6755).method3231(0, 128, (class186) null, this.field6759, 2048, (class321) null, -1, 0, arg1);
                if (var33 != null) {
                    if (class347.field4632) {
                        var33.method648(var4, var31.field4414[1], class414.field5430, 0);
                    } else {
                        var33.method625(var4, var31.field4414[1], 0);
                    }
                    this.field6758 |= var33.method657();
                    if (var33.method621() > this.field6766) {
                        this.field6766 = var33.method621();
                    }
                }
            }
            class470 var34 = class87.field1058.method1394(-49, this.field6751).method3231(0, 128, (class186) null, this.field6753, 2048, (class321) null, -1, 0, arg1);
            if (var34 != null) {
                if (!class347.field4632) {
                    var34.method625(var4, var31.field4414[0], 0);
                } else {
                    var34.method648(var4, var31.field4414[0], class414.field5430, 0);
                }
                this.field6758 |= var34.method657();
                if (~var34.method621() < ~this.field6766) {
                    this.field6766 = var34.method621();
                }
            }
            return var31;
        }
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)Z", line = 270)
    public final boolean method168(int arg0) {
        ++field6764;
        return arg0 != 20071 ? true : this.field6758;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lr;I)Lcu;", line = 281)
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            return null;
        } else {
            ++field6760;
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBII)V", line = 301)
    public static final void method2802(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == 118) {
            if (-arg1 + arg0 >= class281.field3703 && class255.field3350 >= arg0 + arg1 && class6.field66 <= arg3 - arg1 && class151.field2071 >= arg3 - -arg1) {
                class576.method3178(arg4, arg0, arg3, arg1, -1);
            } else {
                class257.method1554(arg1, 1084629345, arg0, arg3, arg4);
            }
            ++field6767;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lr;Z)V", line = 319)
    public final void method177(class562 arg0, boolean arg1) {
        if (!arg1) {
            this.method165((byte) -66, (class562) null);
        }
        ++field6763;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)I", line = 330)
    public final int method176(byte arg0) {
        ++field6765;
        return arg0 >= -114 ? -28 : -10;
    }
}
