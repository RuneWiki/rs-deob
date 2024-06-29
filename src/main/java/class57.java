import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class57 extends class699 {

    @OriginalMember(owner = "client!hka", name = "V", descriptor = "I")
    public int field770 = -1;

    @OriginalMember(owner = "client!hka", name = "Y", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "client!hka", name = "eb", descriptor = "I")
    private int field779 = 0;

    @OriginalMember(owner = "client!hka", name = "fb", descriptor = "Z")
    private boolean field780 = false;

    @OriginalMember(owner = "client!hka", name = "T", descriptor = "I")
    public int field768 = 0;

    @OriginalMember(owner = "client!hka", name = "bb", descriptor = "Z")
    public static boolean field776 = false;

    @OriginalMember(owner = "client!hka", name = "J", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!hka", name = "S", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!hka", name = "U", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!hka", name = "W", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!hka", name = "X", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!hka", name = "Z", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!hka", name = "ab", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!hka", name = "cb", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!hka", name = "db", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!hka", name = "gb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!hka", name = "hb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!hka", name = "ib", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!hka", name = "jb", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!hka", name = "kb", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!hka", name = "lb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!hka", name = "mb", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IZ)I")
    public static final int method498(int arg0, boolean arg1) {
        ++field769;
        if (class208.field2473 == null) {
            return 0;
        } else if (!arg1 && class100.field1308 != null) {
            return class208.field2473.length * 2;
        } else {
            int var2 = arg0;
            for (int var3 = 0; ~class208.field2473.length < ~var3; ++var3) {
                int var4 = class208.field2473[var3];
                if (class459.field6468.method433((byte) -117, var4)) {
                    ++var2;
                }
                if (class755.field10461.method433((byte) -96, var4)) {
                    ++var2;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(Z)I")
    public final int method499(boolean arg0) {
        ++field781;
        class340 var2 = class121.field1555.method2882(this.field785, -22087);
        int var3 = var2.field4237;
        if (this.field773 != -1) {
            class340 var4 = class121.field1555.method2882(this.field773, -22087);
            if (~var4.field4237 < ~var3) {
                var3 = var4.field4237;
            }
        }
        if (!arg0) {
            this.method509(-60);
        }
        if (~this.field770 != 0) {
            class340 var5 = class121.field1555.method2882(this.field770, -22087);
            if (var5.field4237 > var3) {
                var3 = var5.field4237;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(Lha;I)V")
    public final void method500(class66 arg0, int arg1) {
        ++field783;
        if (arg1 != -1) {
            field776 = true;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IBILha;)Z")
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field777;
        if (arg1 < 19) {
            field776 = false;
        }
        class778 var5 = arg3.method576();
        var5.method130(super.field823, super.field809 - 10, super.field813);
        class340 var6 = class121.field1555.method2882(this.field785, -22087);
        class498 var7 = var6.method2006(arg3, 0, 112, this.field778, (class316) null, 0, -1, (class582) null, 131072);
        if (var7 != null && (!class502.field7084 ? var7.method363(arg0, arg2, var5, true, var6.field4237) : var7.method379(arg0, arg2, var5, true, var6.field4237, class621.field8528))) {
            return true;
        } else {
            if (~this.field773 != 0) {
                class340 var8 = class121.field1555.method2882(this.field773, -22087);
                class498 var9 = var8.method2006(arg3, 0, 116, this.field787, (class316) null, 0, -1, (class582) null, 131072);
                if (var9 != null && (!class502.field7084 ? var9.method363(arg0, arg2, var5, true, var8.field4237) : var9.method379(arg0, arg2, var5, true, var8.field4237, class621.field8528))) {
                    return true;
                }
            }
            if (~this.field770 != 0) {
                class340 var10 = class121.field1555.method2882(this.field770, -22087);
                class498 var11 = var10.method2006(arg3, 0, 95, this.field771, (class316) null, 0, -1, (class582) null, 131072);
                if (var11 != null && (!class502.field7084 ? var11.method363(arg0, arg2, var5, true, var10.field4237) : var11.method379(arg0, arg2, var5, true, var10.field4237, class621.field8528))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(ILha;)Lrk;")
    public final class35 method502(int arg0, class66 arg1) {
        ++field786;
        class10 var3 = class425.method2539(super.field808, super.field823 >> class714.field10017, super.field813 >> class714.field10017);
        class328 var4 = class662.method3720(super.field808, super.field823 >> class714.field10017, super.field813 >> class714.field10017);
        int var5 = 0;
        if (var3 != null && var3.field187.field9992) {
            var5 = var3.field187.method509(-104);
        }
        if (var4 != null && ~(-var5) > ~var4.field4055) {
            var5 = -var4.field4055;
        }
        if (this.field768 != var5) {
            super.field809 -= this.field768;
            this.field768 = var5;
            super.field809 += var5;
        }
        class778 var6 = arg1.method576();
        var6.method128();
        int var7 = -77 % ((arg0 - 47) / 63);
        if (this.field768 == 0) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class296 var11 = class621.field8523[super.field811];
            int var12 = this.field779 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method1730(super.field823 + var14, super.field813 + var15, -1);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method1730(super.field823 + var17, super.field813 + var18, -1);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method1730(super.field823 - -var20, super.field813 + var21, -1);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method1730(super.field823 - -var23, super.field813 + var24, -1);
            int var26 = ~var19 >= ~var16 ? var19 : var16;
            int var27 = ~var25 >= ~var22 ? var25 : var22;
            int var28 = var25 > var19 ? var19 : var25;
            int var29 = var16 >= var22 ? var22 : var16;
            if (~var12 != -1) {
                int var30 = 16383 & (int) (Math.atan2((double) (-var27 + var26), (double) var12) * 2607.5945876176133D);
                if (var30 != 0) {
                    var6.method123(var30);
                }
            }
            if (var12 != 0) {
                int var31 = (int) (Math.atan2((double) (-var28 + var29), (double) var12) * 2607.5945876176133D) & 16383;
                if (var31 != 0) {
                    var6.method126(-var31);
                }
            }
            int var32 = var16 - -var25;
            if (var32 > var19 + var22) {
                var32 = var19 + var22;
            }
            int var33 = (var32 >> 1) + -super.field809;
            if (~var33 != -1) {
                var6.method131(0, var33, 0);
            }
        }
        var6.method131(super.field823, super.field809 + -10, super.field813);
        class35 var34 = class415.method2476(3, (byte) 103, true);
        this.field779 = 0;
        this.field780 = false;
        if (this.field770 != -1) {
            class498 var35 = class121.field1555.method2882(this.field770, -22087).method2006(arg1, 0, 100, this.field771, (class316) null, 0, -1, (class582) null, 2048);
            if (var35 != null) {
                if (class502.field7084) {
                    var35.method388(var6, var34.field537[2], class621.field8528, 0);
                } else {
                    var35.method355(var6, var34.field537[2], 0);
                }
                this.field780 |= var35.method380();
                this.field779 = var35.method394();
            }
        }
        if (this.field773 != -1) {
            class498 var36 = class121.field1555.method2882(this.field773, -22087).method2006(arg1, 0, 112, this.field787, (class316) null, 0, -1, (class582) null, 2048);
            if (var36 != null) {
                if (!class502.field7084) {
                    var36.method355(var6, var34.field537[1], 0);
                } else {
                    var36.method388(var6, var34.field537[1], class621.field8528, 0);
                }
                this.field780 |= var36.method380();
                if (~var36.method394() < ~this.field779) {
                    this.field779 = var36.method394();
                }
            }
        }
        class498 var37 = class121.field1555.method2882(this.field785, -22087).method2006(arg1, 0, 126, this.field778, (class316) null, 0, -1, (class582) null, 2048);
        if (var37 != null) {
            if (!class502.field7084) {
                var37.method355(var6, var34.field537[0], 0);
            } else {
                var37.method388(var6, var34.field537[0], class621.field8528, 0);
            }
            this.field780 |= var37.method380();
            if (var37.method394() > this.field779) {
                this.field779 = var37.method394();
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "(Z)Z")
    public final boolean method503(boolean arg0) {
        if (arg0) {
            this.method499(false);
        }
        ++field767;
        return false;
    }

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        if (arg0 != -24) {
            return true;
        } else {
            ++field775;
            return this.field780;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZII)I")
    public static final int method505(boolean arg0, int arg1, int arg2) {
        ++field766;
        if (arg0) {
            return 0;
        } else {
            class430 var3 = class105.method861(arg2, Integer.MIN_VALUE, arg0);
            if (arg1 != 32516) {
                return 117;
            } else if (var3 == null) {
                return class425.field5639.method3213(99, arg2).field6738;
            } else {
                int var4 = 0;
                for (int var5 = 0; var5 < var3.field5670.length; ++var5) {
                    if (var3.field5670[var5] == -1) {
                        ++var4;
                    }
                }
                return var4 + (class425.field5639.method3213(arg1 ^ 32615, arg2).field6738 - var3.field5670.length);
            }
        }
    }

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "(III)Z")
    public static final boolean method506(int arg0, int arg1, int arg2) {
        ++field772;
        if (arg1 != 30202) {
            method505(false, -90, 71);
        }
        return (393216 & arg0) != 0 | class68.method674(arg0, arg2, 16) || class504.method3024(arg2, (byte) 110, arg0);
    }

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(IIIII)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZLha;)Loba;")
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field782;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!hka", name = "e", descriptor = "(I)I")
    public final int method508(int arg0) {
        ++field774;
        if (arg0 != -4798) {
            this.field771 = 65;
        }
        return this.field779;
    }

    @OriginalMember(owner = "client!hka", name = "f", descriptor = "(I)I")
    public final int method509(int arg0) {
        int var2 = -60 % ((arg0 - -38) / 56);
        ++field784;
        return -10;
    }
}
