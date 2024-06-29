import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class235 extends class17 {

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    private int field3236 = -1;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Z")
    public boolean field3229 = false;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    private int field3241 = 0;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
    private int field3250 = 0;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
    private int field3253 = -32768;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Llb;")
    private class208 field3238;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field3247 = 2;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "Ldp;")
    private class174 field3246;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lvm;")
    public static class322 field3242;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "[[Lfd;")
    public static class194[][] field3227;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
    public final void method1271(byte arg0, int arg1) {
        ++field3239;
        if (!this.field3229) {
            if (arg0 != 35) {
                this.field3226 = -29;
            }
            this.field3241 += arg1;
            while (this.field3238.field2818[this.field3250] < this.field3241) {
                this.field3241 -= this.field3238.field2818[this.field3250];
                ++this.field3250;
                if (~this.field3238.field2823.length >= ~this.field3250) {
                    this.field3229 = true;
                    break;
                }
            }
            if (!this.field3229) {
                class320.method1848(false, -71, this.field3238, this.field3250, super.field152, super.field154);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvm;BLjn;)V")
    private final void method1272(class322 arg0, byte arg1, class396 arg2) {
        ++field3244;
        class357[] var4 = arg2.method2311();
        class149[] var5 = arg2.method2296();
        if (arg1 == 6) {
            if ((this.field3246 == null || this.field3246.field2184) && (var4 != null || var5 != null)) {
                this.field3246 = new class174(class234.field3224);
            }
            if (this.field3246 != null) {
                this.field3246.method914(arg0, (long) class234.field3224, var4, var5, false);
                this.field3246.method918(super.field161, super.field168, super.field158, super.field159, super.field153);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        if (arg0 != -23563) {
            return true;
        } else {
            ++field3234;
            return false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)I")
    public final int method76(int arg0) {
        if (arg0 != 20765) {
            this.field3253 = 3;
        }
        ++field3248;
        return this.field3253;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        ++field3228;
        class396 var3 = this.method1278(arg0, arg1, -1);
        if (var3 != null) {
            this.method1272(arg0, (byte) 6, var3);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltm;Ltm;I)V")
    public static final void method1273(class187 arg0, class187 arg1, int arg2) {
        if (arg2 != 0) {
            method1273((class187) null, (class187) null, 80);
        }
        ++field3233;
        if (arg0.field2362 != null) {
            arg0.method1009((byte) 120);
        }
        arg0.field2362 = arg1;
        arg0.field2358 = arg1.field2358;
        arg0.field2362.field2358 = arg0;
        arg0.field2358.field2362 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            field3227 = null;
        }
        ++field3249;
        return false;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3243 = arg1 + arg2;
        this.field3226 = arg0;
        int var12 = class220.method1186((byte) -110, this.field3226).field5648;
        if (var12 != -1) {
            this.field3229 = false;
            this.field3238 = class193.method1037(36, var12);
        } else {
            this.field3229 = true;
        }
        if (~this.field3243 == ~arg2) {
            class320.method1848(false, -68, this.field3238, this.field3250, super.field152, super.field154);
        }
    }

    @OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3246 != null) {
            this.field3246.method920();
        }
        ++field3245;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V")
    public static final void method1274(int arg0, int arg1) {
        if (arg0 != 64) {
            field3227 = null;
        }
        ++field3240;
        class109 var2 = class110.field1351;
        synchronized (class110.field1351) {
            class318.field4232 = arg1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field3232;
        class396 var3 = this.method1278(arg0, 1024, -1);
        if (var3 == null) {
            return null;
        } else {
            if (arg1) {
                this.method76(114);
            }
            class247 var4 = arg0.method1650();
            var4.method747(super.field152, super.field150, super.field154);
            if (this.field3246 == null) {
                var3.method2284(var4, (class447) null, 0);
            } else {
                class366 var5 = this.field3246.method917();
                arg0.method1622(var3, var5, var4, (class447) null, 0);
            }
            this.field3253 = var3.method2299();
            this.method1272(arg0, (byte) 6, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        ++field3230;
        if (arg0 > -13) {
            this.method1278((class322) null, 124, 45);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIII)V")
    public static final void method1275(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class319 var5 = (class319) class98.field1158.method814((byte) 90); var5 != null; var5 = (class319) class98.field1158.method827(119)) {
            class191.method1025(var5, arg2, arg1, arg3, arg4, -10072);
        }
        ++field3251;
        for (class319 var6 = (class319) class296.field4034.method814((byte) 90); var6 != null; var6 = (class319) class296.field4034.method827(48)) {
            byte var12 = 1;
            class70 var13 = var6.field4247.method2606(0);
            if (!var6.field4247.field6056) {
                if (~var6.field4247.field6100 != ~var13.field783 && ~var6.field4247.field6100 != ~var13.field743 && var6.field4247.field6100 != var13.field770 && var6.field4247.field6100 != var13.field775) {
                    if (~var6.field4247.field6100 == ~var13.field784 || var6.field4247.field6100 == var13.field756 || ~var6.field4247.field6100 == ~var13.field774 || var6.field4247.field6100 == var13.field739) {
                        var12 = 3;
                    }
                } else {
                    var12 = 2;
                }
            } else {
                var12 = 0;
            }
            if (~var6.field4266 != ~var12) {
                int var14 = class247.method1318(var6.field4247, (byte) 119);
                if (~var6.field4256 != ~var14) {
                    if (var6.field4246 != null) {
                        class374.field5265.method2213(var6.field4246);
                        var6.field4246 = null;
                    }
                    var6.field4256 = var14;
                }
                var6.field4266 = var12;
            }
            var6.field4261 = var6.field4247.field152;
            var6.field4245 = var6.field4247.field152 + var6.field4247.method857((byte) -106) * 64;
            var6.field4249 = var6.field4247.field154;
            var6.field4252 = var6.field4247.field154 - -(64 * var6.field4247.method857((byte) -106));
            class191.method1025(var6, arg2, arg1, arg3, arg4, -10072);
        }
        for (class319 var7 = (class319) class420.field6128.method315((byte) -112); var7 != null; var7 = (class319) class420.field6128.method310(-93)) {
            byte var9 = 1;
            class70 var10 = var7.field4270.method2606(0);
            if (!var7.field4270.field6056) {
                if (~var7.field4270.field6100 != ~var10.field783 && ~var7.field4270.field6100 != ~var10.field743 && ~var7.field4270.field6100 != ~var10.field770 && var7.field4270.field6100 != var10.field775) {
                    if (~var7.field4270.field6100 == ~var10.field784 || var7.field4270.field6100 == var10.field756 || ~var7.field4270.field6100 == ~var10.field774 || ~var7.field4270.field6100 == ~var10.field739) {
                        var9 = 3;
                    }
                } else {
                    var9 = 2;
                }
            } else {
                var9 = 0;
            }
            if (var7.field4266 != var9) {
                int var11 = class356.method2169((byte) -86, var7.field4270);
                if (var7.field4256 != var11) {
                    if (var7.field4246 != null) {
                        class374.field5265.method2213(var7.field4246);
                        var7.field4246 = null;
                    }
                    var7.field4256 = var11;
                }
                var7.field4266 = var9;
            }
            var7.field4261 = var7.field4270.field152;
            var7.field4245 = var7.field4270.field152 - -(64 * var7.field4270.method857((byte) -106));
            var7.field4249 = var7.field4270.field154;
            var7.field4252 = var7.field4270.field154 - -(64 * var7.field4270.method857((byte) -106));
            class191.method1025(var7, arg2, arg1, arg3, arg4, -10072);
        }
        int var8 = -45 % ((-81 - arg0) / 42);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1276(byte arg0) {
        field3227 = null;
        if (arg0 != -119) {
            method1276((byte) 56);
        }
        field3242 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public final void method1277(int arg0) {
        if (this.field3246 != null) {
            this.field3246.method920();
        }
        if (arg0 != -6694) {
            this.method1272((class322) null, (byte) -57, (class396) null);
        }
        ++field3231;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        ++field3252;
        if (arg1 >= 36) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvm;II)Ljn;")
    private final class396 method1278(class322 arg0, int arg1, int arg2) {
        ++field3235;
        if (arg2 != -1) {
            method1275((byte) -23, 18, 115, 116, 79);
        }
        class393 var4 = class220.method1186((byte) -110, this.field3226);
        return !this.field3229 ? var4.method2446(this.field3241, this.field3250, arg0, (byte) 2, this.field3236, arg1) : var4.method2446(0, -1, arg0, (byte) 2, -1, arg1);
    }
}
