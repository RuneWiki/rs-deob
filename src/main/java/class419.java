import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class419 extends class712 implements class238 {

    @OriginalMember(owner = "client!jba", name = "db", descriptor = "B")
    private byte field5465;

    @OriginalMember(owner = "client!jba", name = "zb", descriptor = "Z")
    private boolean field5487;

    @OriginalMember(owner = "client!jba", name = "bb", descriptor = "B")
    private byte field5463;

    @OriginalMember(owner = "client!jba", name = "Z", descriptor = "Z")
    private boolean field5461;

    @OriginalMember(owner = "client!jba", name = "qb", descriptor = "S")
    private short field5478;

    @OriginalMember(owner = "client!jba", name = "S", descriptor = "Z")
    private boolean field5454;

    @OriginalMember(owner = "client!jba", name = "xb", descriptor = "Z")
    private boolean field5485;

    @OriginalMember(owner = "client!jba", name = "Y", descriptor = "Lka;")
    public class498 field5460;

    @OriginalMember(owner = "client!jba", name = "U", descriptor = "Lr;")
    private class196 field5456;

    @OriginalMember(owner = "client!jba", name = "nb", descriptor = "[[F")
    public static float[][] field5475 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!jba", name = "T", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5455 = new BigInteger("91656ea42ff687c97c2d48a39a16c2fae5f76fc2d32c88d9c402243478e7cf6e8d12b77f8010c29deee5b770727c7e16e39ae0367145bede97ca6bbbbc60b2b1", 16);

    @OriginalMember(owner = "client!jba", name = "Ab", descriptor = "Llja;")
    public static class744 field5488 = new class744(57, 4);

    @OriginalMember(owner = "client!jba", name = "V", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!jba", name = "W", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!jba", name = "X", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!jba", name = "ab", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!jba", name = "cb", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!jba", name = "eb", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!jba", name = "fb", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!jba", name = "gb", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!jba", name = "hb", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!jba", name = "ib", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!jba", name = "jb", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!jba", name = "kb", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!jba", name = "lb", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!jba", name = "mb", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!jba", name = "ob", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!jba", name = "pb", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!jba", name = "rb", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!jba", name = "tb", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!jba", name = "ub", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!jba", name = "vb", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!jba", name = "wb", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!jba", name = "yb", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!jba", name = "Bb", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!jba", name = "sb", descriptor = "Loba;")
    private class276 field5480;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(ILha;)Lrk;")
    public final class35 method502(int arg0, class66 arg1) {
        int var3 = 84 % ((arg0 - 47) / 63);
        ++field5459;
        if (this.field5460 == null) {
            return null;
        } else {
            class778 var4 = arg1.method576();
            var4.method130(super.field823, super.field809, super.field813);
            class35 var5 = class415.method2476(1, (byte) 125, this.field5487);
            if (!class502.field7084) {
                this.field5460.method355(var4, var5.field537[0], 0);
            } else {
                this.field5460.method388(var4, var5.field537[0], class621.field8528, 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        if (arg0 != -24) {
            field5488 = null;
        }
        ++field5484;
        return this.field5460 != null ? this.field5460.method380() : false;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLha;)Loba;")
    public final class276 method507(boolean arg0, class66 arg1) {
        if (arg0) {
            field5455 = null;
        }
        if (this.field5480 == null) {
            this.field5480 = class792.method4369(super.field809, super.field823, this.method2500(arg1, 114, 0), (byte) -5, super.field813);
        }
        ++field5469;
        return this.field5480;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lha;II)Lka;")
    private final class498 method2500(class66 arg0, int arg1, int arg2) {
        ++field5481;
        if (this.field5460 != null && ~arg0.method620(this.field5460.method396(), arg2) == -1) {
            return this.field5460;
        } else {
            if (arg1 < 112) {
                this.method935(-29);
            }
            class37 var4 = this.method2505(85, arg2, false, arg0);
            return var4 != null ? var4.field549 : null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "(I)I")
    public final int method2501(int arg0) {
        ++field5476;
        if (arg0 < 118) {
            return 117;
        } else {
            return this.field5460 != null ? this.field5460.method367() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
    public final int method929(byte arg0) {
        ++field5462;
        if (arg0 != -45) {
            field5475 = null;
        }
        return this.field5465;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)I")
    public final int method927(int arg0) {
        ++field5466;
        return arg0 != -24482 ? 11 : 65535 & this.field5478;
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Z")
    public final boolean method935(int arg0) {
        ++field5477;
        return arg0 != 25271 ? true : this.field5485;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
    public final void method936(boolean arg0) {
        if (arg0) {
            this.method927(51);
        }
        if (this.field5460 != null) {
            this.field5460.method392();
        }
        ++field5486;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(Lha;I)V")
    public final void method500(class66 arg0, int arg1) {
        ++field5467;
        if (arg1 != -1) {
            this.field5463 = 124;
        }
    }

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "(I)V")
    public static final void method2502(int arg0) {
        ++field5468;
        if (class260.field3075 == null) {
            if (arg0 != -16315) {
                field5455 = null;
            }
            int var1 = class449.field6100;
            int var2 = class269.field3181;
            int var3 = class484.field6751 - var1 + -class701.field9880;
            int var4 = class39.field570 - class705.field9921 + -var2;
            if (~var1 < -1 || var3 > 0 || var2 > 0 || ~var4 < -1) {
                try {
                    Container var5;
                    if (class645.field8790 == null) {
                        if (class345.field4331 == null) {
                            var5 = class672.field9220;
                        } else {
                            var5 = class345.field4331;
                        }
                    } else {
                        var5 = class645.field8790;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class645.field8790 == var5) {
                        Insets var8 = class645.field8790.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class39.field570);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class484.field6751, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(class484.field6751 + var6 + -var3, var7, var3, class39.field570);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, class39.field570 - var4 + var7, class484.field6751, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIIIIIIZ)V")
    public class419(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2085 == -2, class172.method1167(-81, arg12, arg13));
        this.field5465 = (byte) arg12;
        this.field5487 = arg1.field2171 != 0 && !arg7;
        this.field5463 = (byte) arg13;
        this.field5461 = arg14;
        this.field5478 = (short) arg1.field2166;
        super.field811 = (byte) arg3;
        this.field5454 = arg7;
        this.field5485 = arg0.method646() && arg1.field2141 && !this.field5454 && class118.field1503.field10672.method4113(0) != 0;
        int var16 = 2048;
        if (this.field5461) {
            var16 |= 65536;
        }
        class37 var17 = this.method2505(89, var16, this.field5485, arg0);
        if (var17 != null) {
            this.field5460 = var17.field549;
            this.field5456 = var17.field550;
            if (this.field5461) {
                this.field5460 = this.field5460.method364((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "(Z)Z")
    public final boolean method531(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field5474;
            return this.field5461;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILha;)V")
    public final void method930(int arg0, class66 arg1) {
        ++field5464;
        Object var3 = null;
        class196 var5;
        if (this.field5456 == null && this.field5485) {
            class37 var4 = this.method2505(72, 262144, true, arg1);
            var5 = var4 != null ? var4.field550 : null;
        } else {
            var5 = this.field5456;
            this.field5456 = null;
        }
        if (arg0 != 14353) {
            this.method509(-74);
        }
        if (var5 != null) {
            class793.method4371(var5, super.field811, super.field823, super.field813, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "(Z)V")
    public static void method2503(boolean arg0) {
        field5488 = null;
        if (!arg0) {
            field5488 = null;
        }
        field5455 = null;
        field5475 = null;
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(II)Lcf;")
    public static final class631 method2504(int arg0, int arg1) {
        ++field5457;
        if (arg1 != 4014) {
            field5455 = null;
        }
        return class664.field9119 && ~arg0 <= ~class354.field4398 && ~class497.field6951 <= ~arg0 ? class147.field1832[-class354.field4398 + arg0] : null;
    }

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)I")
    public final int method508(int arg0) {
        ++field5458;
        if (arg0 != -4798) {
            method2504(81, -57);
        }
        return this.field5460 != null ? this.field5460.method394() : 0;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
    public final int method928(int arg0) {
        if (arg0 != 13272) {
            this.field5485 = true;
        }
        ++field5473;
        return this.field5463;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIZLha;)Lwv;")
    private final class37 method2505(int arg0, int arg1, boolean arg2, class66 arg3) {
        ++field5483;
        if (arg0 <= 59) {
            this.field5454 = false;
        }
        class174 var5 = class379.field4811.method4192(27324, this.field5478 & 65535);
        class296 var6;
        class296 var7;
        if (this.field5454) {
            var6 = class707.field9933[0];
            var7 = class704.field9910[super.field811];
        } else {
            if (~super.field811 > -4) {
                var6 = class707.field9933[super.field811 + 1];
            } else {
                var6 = null;
            }
            var7 = class707.field9933[super.field811];
        }
        return var5.method1181(super.field823, super.field813, var7, arg3, (byte) 118, var6, arg1, (class481) null, arg2, ~this.field5465 != -12 ? this.field5465 : 10, ~this.field5465 == -12 ? this.field5463 + 4 : this.field5463, super.field809);
    }

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)I")
    public final int method509(int arg0) {
        int var2 = -84 / ((-38 - arg0) / 56);
        ++field5482;
        return this.field5460 != null ? this.field5460.method404() : 0;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lha;I)V")
    public final void method931(class66 arg0, int arg1) {
        ++field5471;
        Object var3 = null;
        class196 var5;
        if (this.field5456 == null && this.field5485) {
            class37 var4 = this.method2505(121, 262144, true, arg0);
            var5 = var4 == null ? null : var4.field550;
        } else {
            var5 = this.field5456;
            this.field5456 = null;
        }
        if (var5 != null) {
            class418.method2496(var5, super.field811, super.field823, super.field813, (boolean[]) null);
        }
        int var6 = -85 / ((28 - arg1) / 63);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lgda;Lha;IIZII)V")
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 > -6) {
            this.method500((class66) null, 30);
        }
        if (arg0 instanceof class431) {
            class431 var8 = (class431) arg0;
            if (this.field5460 != null && var8.field5681 != null) {
                this.field5460.method384(var8.field5681, arg5, arg3, arg2, arg4);
            }
        } else if (arg0 instanceof class419) {
            class419 var9 = (class419) arg0;
            if (this.field5460 != null && var9.field5460 != null) {
                this.field5460.method384(var9.field5460, arg5, arg3, arg2, arg4);
            }
        }
        ++field5489;
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        ++field5470;
        this.field5461 = arg0;
        if (this.field5460 != null) {
            this.field5460.method378(this.field5460.method396() & -65537);
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(Z)Z")
    public final boolean method503(boolean arg0) {
        ++field5472;
        if (arg0) {
            return true;
        } else if (this.field5460 != null) {
            return !this.field5460.method391();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBILha;)Z")
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field5479;
        if (arg1 <= 19) {
            this.method931((class66) null, -31);
        }
        class498 var5 = this.method2500(arg3, 114, 131072);
        if (var5 != null) {
            class778 var6 = arg3.method576();
            var6.method130(super.field823, super.field809, super.field813);
            return !class502.field7084 ? var5.method363(arg0, arg2, var6, false, 0) : var5.method379(arg0, arg2, var6, false, 0, class621.field8528);
        } else {
            return false;
        }
    }
}
