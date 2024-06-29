import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class495 extends class111 implements class57 {

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "B")
    private byte field7220;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Z")
    private boolean field7214;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "Z")
    private boolean field7234;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Z")
    private boolean field7231;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "S")
    private short field7233;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "B")
    private byte field7217;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Z")
    private boolean field7210;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Lba;")
    private class327 field7213;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Lw;")
    private class252 field7211;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lig;")
    public static class206 field7235 = new class206(77, 5);

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field7236 = 2;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "Lq;")
    public static class364 field7240;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Lew;")
    private class425 field7219;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Ljava/awt/Font;")
    public static Font field7237;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)I")
    public final int method92(int arg0) {
        ++field7238;
        if (arg0 != 9812) {
            this.method89(5);
        }
        return this.field7220;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field7229;
        if (arg0 != -10503) {
            return true;
        } else {
            class327 var5 = this.method2969(arg2, 131072, -109);
            if (var5 != null) {
                class364 var6 = arg2.method342();
                var6.method2014(super.field1368, super.field1362, super.field1365);
                return var5.method1381(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        if (arg0 != -76) {
            field7240 = null;
        }
        ++field7215;
        this.field7231 = false;
        if (this.field7213 != null) {
            this.field7213.method1376(-65537 & this.field7213.method1375());
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loa;II)Lba;")
    private final class327 method2969(class605 arg0, int arg1, int arg2) {
        ++field7224;
        if (this.field7213 != null && ~arg0.method293(this.field7213.method1375(), arg1) == -1) {
            return this.field7213;
        } else {
            class651 var4 = this.method2970(65535, arg1, false, arg0);
            if (arg2 > -83) {
                return null;
            } else {
                return var4 == null ? null : var4.field9389;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLoa;)Lba;")
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        if (arg1) {
            return null;
        } else {
            ++field7228;
            return this.method2969(arg2, arg0, -91);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Loa;Lqd;IIIIZIZ)V")
    public class495(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5824, arg1.field5835, arg1.field5870);
        super.field1365 = arg5;
        this.field7220 = (byte) arg7;
        this.field7214 = arg6;
        this.field7234 = arg1.field5806 != 0 && !arg6;
        super.field1368 = arg3;
        this.field7231 = arg8;
        this.field7233 = (short) arg1.field5810;
        this.field7217 = (byte) arg2;
        this.field7210 = arg0.method325() && arg1.field5855 && !this.field7214 && ~class595.field8694.method2735((byte) -128, class81.field908) != -1;
        int var10 = 2048;
        if (this.field7231) {
            var10 |= 65536;
        }
        class651 var11 = this.method2970(65535, var10, this.field7210, arg0);
        if (var11 != null) {
            this.field7213 = var11.field9389;
            this.field7211 = var11.field9386;
            if (this.field7231) {
                this.field7213 = this.field7213.method1382((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZLoa;)Llo;")
    private final class651 method2970(int arg0, int arg1, boolean arg2, class605 arg3) {
        ++field7230;
        class385 var5 = class575.field8301.method1499(-7532, arg0 & this.field7233);
        class132 var6;
        class132 var7;
        if (!this.field7214) {
            if (~this.field7217 > -4) {
                var6 = class544.field7780[this.field7217 + 1];
            } else {
                var6 = null;
            }
            var7 = class544.field7780[this.field7217];
        } else {
            var6 = class544.field7780[0];
            var7 = class492.field7164[this.field7217];
        }
        return var5.method2459(super.field1368, arg1, this.field7220, arg3, super.field1362, arg2, 22, var6, -18, super.field1365, var7);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field7225;
        if (this.field7213 == null) {
            return null;
        } else {
            class364 var3 = arg0.method342();
            var3.method2014(super.field1368, super.field1362, super.field1365);
            class630 var4 = null;
            if (this.field7234) {
                var4 = class471.method2882(-128, 1);
            }
            if (arg1 > -127) {
                field7240 = null;
            }
            this.field7213.method1380(var3, var4 != null ? var4.field9084[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = 41 % ((arg0 - 11) / 51);
        ++field7216;
        return 65535 & this.field7233;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        ++field7226;
        if (arg1 != -5) {
            this.field7214 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public static void method2971(int arg0) {
        field7240 = null;
        if (arg0 != 8222) {
            field7240 = null;
        }
        field7235 = null;
        field7237 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 != 7) {
            this.field7219 = null;
        }
        if (arg3 instanceof class495) {
            class495 var8 = (class495) arg3;
            if (this.field7213 != null && var8.field7213 != null) {
                this.field7213.method1361(var8.field7213, arg1, arg6, arg2, arg5);
            }
        }
        ++field7232;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public final void method87(int arg0) {
        ++field7239;
        if (this.field7213 != null) {
            this.field7213.method1372();
        }
        if (arg0 != 7511) {
            this.method89(-120);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        if (arg0 != -23445) {
            method2972(-97, true);
        }
        ++field7218;
        return this.field7210;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILoa;)V")
    public final void method98(int arg0, class605 arg1) {
        ++field7221;
        Object var3 = null;
        if (arg0 != 16343) {
            field7237 = null;
        }
        class252 var5;
        if (this.field7211 == null && this.field7210) {
            class651 var4 = this.method2970(arg0 + 49192, 262144, true, arg1);
            var5 = var4 != null ? var4.field9386 : null;
        } else {
            var5 = this.field7211;
            this.field7211 = null;
        }
        if (var5 != null) {
            class172.method990(var5, this.field7217, super.field1368, super.field1365, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLoa;)V")
    public final void method102(byte arg0, class605 arg1) {
        ++field7223;
        Object var3 = null;
        class252 var5;
        if (this.field7211 == null && this.field7210) {
            class651 var4 = this.method2970(65535, 262144, true, arg1);
            var5 = var4 == null ? null : var4.field9386;
        } else {
            var5 = this.field7211;
            this.field7211 = null;
        }
        if (arg0 < -54) {
            if (var5 != null) {
                class240.method1600(var5, this.field7217, super.field1368, super.field1365, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            this.method2969((class605) null, 68, -98);
        }
        if (this.field7219 == null) {
            this.field7219 = class645.method3676(super.field1365, super.field1362, (byte) -114, super.field1368, this.method2969(arg0, 0, -108));
        }
        ++field7227;
        return this.field7219;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)Loo;")
    public static final class543 method2972(int arg0, boolean arg1) {
        ++field7222;
        if (arg1) {
            field7237 = null;
        }
        class543[] var2 = class472.method2891(-94);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class543 var4 = var2[var3];
            if (~var4.field7767 == ~arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)I")
    public final int method95(int arg0) {
        ++field7212;
        int var2 = 124 / ((14 - arg0) / 33);
        return 22;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            return false;
        } else {
            ++field7241;
            return this.field7231;
        }
    }

    static {
        new class474("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }
}
