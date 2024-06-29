import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class523 extends class611 {

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    private int field7671 = 0;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public int field7673 = -1;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public int field7672 = 0;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
    private boolean field7667 = false;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    public int field7685 = -1;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field7669 = -1;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "Lwo;")
    public static class690 field7670 = null;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public int field7674;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public int field7675;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public int field7684;

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIII)V", line = 3)
    public class523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lr;Z)V", line = 6)
    public final void method162(class165 arg0, boolean arg1) {
        ++field7682;
        if (arg1) {
            this.field7685 = -45;
        }
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(B)Z", line = 20)
    public final boolean method165(byte arg0) {
        if (arg0 >= -21) {
            this.method175(-32);
        }
        ++field7683;
        return this.field7667;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method3096(boolean arg0) {
        if (!arg0) {
            method3097((byte) 108);
        }
        class590.field8545.method2776(false);
        ++field7686;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 56)
    public static void method3097(byte arg0) {
        field7670 = null;
        if (arg0 != -126) {
            method3096(true);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIBI)V", line = 66)
    public static final void method3098(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == -62) {
            ++field7676;
            class233 var5 = class7.method44(arg1, 8, arg3 ^ 61);
            var5.method1422(arg3 + 62);
            var5.field3114 = arg4;
            var5.field3116 = arg2;
            var5.field3118 = arg0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lr;B)Llt;", line = 82)
    public final class626 method170(class165 arg0, byte arg1) {
        ++field7668;
        class182 var3 = class603.method3476(super.field532, super.field530 >> class295.field3981, super.field531 >> class295.field3981);
        if (var3 != null && var3.field2227.field763) {
            int var4 = var3.field2227.method173(32249);
            if (~this.field7672 != ~var4) {
                super.field527 -= this.field7672;
                super.field527 += var4;
                this.field7672 = var4;
            }
        }
        class394 var5 = arg0.method315();
        var5.method710();
        if (var3 == null || !var3.field2227.field763) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class37 var9 = class155.field1899[super.field535];
            int var10 = this.field7671 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method428(true, super.field530 + var12, super.field531 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method428(true, super.field530 - -var15, super.field531 - -var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method428(true, super.field530 + var18, super.field531 + var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method428(true, super.field530 + var21, super.field531 + var22);
            int var24 = var14 < var17 ? var14 : var17;
            int var25 = var23 <= var20 ? var23 : var20;
            int var26 = var23 <= var17 ? var23 : var17;
            if (~var10 != -1) {
                int var27 = (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D) & 16383;
                if (var27 != 0) {
                    var5.method713(var27);
                }
            }
            int var28 = ~var14 > ~var20 ? var14 : var20;
            int var29 = var14 + var23;
            if (~var10 != -1) {
                int var30 = 16383 & (int) (Math.atan2((double) (-var26 + var28), (double) var10) * 2607.5945876176133D);
                if (~var30 != -1) {
                    var5.method718(-var30);
                }
            }
            if (~var29 < ~(var17 - -var20)) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field527;
            if (var31 != 0) {
                var5.method723(0, var31, 0);
            }
        }
        if (arg1 != -2) {
            this.field7675 = 82;
        }
        var5.method723(super.field530, super.field527 - 10, super.field531);
        class626 var32 = class547.method3208(3, arg1 ^ 16658);
        this.field7667 = false;
        this.field7671 = 0;
        if (~this.field7685 != 0) {
            class55 var33 = class65.field1021.method178(false, this.field7685).method1456(0, arg0, -1, (class569) null, 0, (class282) null, arg1 ^ -2, 2048, this.field7674);
            if (var33 != null) {
                if (!class547.field7943) {
                    var33.method67(var5, var32.field8985[2], 0);
                } else {
                    var33.method122(var5, var32.field8985[2], class676.field9693, 0);
                }
                this.field7667 |= var33.method112();
                this.field7671 = var33.method72();
            }
        }
        if (this.field7673 != -1) {
            class55 var34 = class65.field1021.method178(false, this.field7673).method1456(0, arg0, -1, (class569) null, 0, (class282) null, 0, 2048, this.field7684);
            if (var34 != null) {
                if (class547.field7943) {
                    var34.method122(var5, var32.field8985[1], class676.field9693, 0);
                } else {
                    var34.method67(var5, var32.field8985[1], 0);
                }
                this.field7667 |= var34.method112();
                if (var34.method72() > this.field7671) {
                    this.field7671 = var34.method72();
                }
            }
        }
        class55 var35 = class65.field1021.method178(false, this.field7675).method1456(0, arg0, -1, (class569) null, 0, (class282) null, arg1 ^ -2, 2048, this.field7681);
        if (var35 != null) {
            if (!class547.field7943) {
                var35.method67(var5, var32.field8985[0], 0);
            } else {
                var35.method122(var5, var32.field8985[0], class676.field9693, 0);
            }
            this.field7667 |= var35.method112();
            if (~var35.method72() < ~this.field7671) {
                this.field7671 = var35.method72();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)Z", line = 247)
    public final boolean method175(int arg0) {
        if (arg0 != 0) {
            this.method162((class165) null, false);
        }
        ++field7666;
        return false;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)I", line = 262)
    public final int method173(int arg0) {
        if (arg0 != 32249) {
            this.method172((byte) -67);
        }
        ++field7678;
        return -10;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(BLr;)Lsr;", line = 278)
    public final class229 method161(byte arg0, class165 arg1) {
        ++field7680;
        if (arg0 < 100) {
            method3097((byte) 109);
        }
        return null;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)I", line = 291)
    public final int method172(byte arg0) {
        if (arg0 != -117) {
            this.field7672 = -55;
        }
        ++field7679;
        return this.field7671;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lr;III)Z", line = 310)
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -20) {
            this.field7674 = 20;
        }
        ++field7677;
        class394 var5 = arg0.method315();
        var5.method712(super.field530, super.field527 - 10, super.field531);
        class55 var6 = class65.field1021.method178(false, this.field7675).method1456(0, arg0, -1, (class569) null, 0, (class282) null, 0, 131072, this.field7681);
        if (var6 != null && (!class547.field7943 ? var6.method129(arg1, arg2, var5, true) : var6.method124(arg1, arg2, var5, true, class676.field9693))) {
            return true;
        } else {
            if (this.field7673 != -1) {
                class55 var7 = class65.field1021.method178(false, this.field7673).method1456(0, arg0, -1, (class569) null, 0, (class282) null, 0, 131072, this.field7684);
                if (var7 != null && (!class547.field7943 ? var7.method129(arg1, arg2, var5, true) : var7.method124(arg1, arg2, var5, true, class676.field9693))) {
                    return true;
                }
            }
            if (this.field7685 != -1) {
                class55 var8 = class65.field1021.method178(false, this.field7685).method1456(0, arg0, -1, (class569) null, 0, (class282) null, 0, 131072, this.field7674);
                if (var8 != null && (!class547.field7943 ? var8.method129(arg1, arg2, var5, true) : var8.method124(arg1, arg2, var5, true, class676.field9693))) {
                    return true;
                }
            }
            return false;
        }
    }
}
