import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class53 extends class512 implements class401 {

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "B")
    private byte field699;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "Z")
    private boolean field702;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "Z")
    private boolean field691;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "B")
    private byte field700;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "S")
    private short field705;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Z")
    private boolean field684;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "B")
    private byte field693;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "Z")
    private boolean field689;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "Lt;")
    public class398 field688;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Lba;")
    private class502 field686;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[J")
    public static long[] field676 = new long[32];

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "Z")
    public static boolean field706 = false;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Z")
    public static boolean field704 = false;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field690 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 == 28007) {
            ++field682;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIIIIFII)[[I")
    public static final int[][] method392(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8) {
        ++field694;
        int[][] var9 = new int[arg0][arg8];
        class96 var10 = new class96();
        var10.field1487 = (int) (arg6 * 4096.0F);
        var10.field1497 = arg5;
        var10.field1502 = arg2;
        var10.field1493 = arg3;
        var10.field1491 = arg1;
        if (arg4 != 7535) {
            method392(71, true, 94, -29, 32, -41, 1.0929626F, -42, -8);
        }
        var10.method748((byte) 110);
        class275.method1714(96, arg0, arg8);
        for (int var11 = 0; var11 < arg0; ++var11) {
            var10.method750(-125, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILya;B)Lt;")
    private final class398 method393(int arg0, class11 arg1, byte arg2) {
        ++field707;
        if (this.field688 != null && ~arg1.method160(this.field688.method626(), arg0) == -1) {
            return this.field688;
        } else {
            class126 var4 = this.method396(65535, arg1, arg0, false);
            int var5 = 33 % ((arg2 - 21) / 61);
            return var4 != null ? var4.field1903 : null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lya;Lpf;IIIIZIIZ)V")
    public class53(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class2.method7(arg8, arg7, (byte) -33));
        super.field7505 = arg3;
        this.field699 = (byte) arg7;
        this.field702 = arg9;
        this.field691 = arg1.field7230 != 0 && !arg6;
        this.field700 = (byte) arg8;
        this.field705 = (short) arg1.field7207;
        this.field684 = arg6;
        super.field7504 = arg5;
        this.field693 = (byte) arg2;
        this.field689 = arg0.method77() && arg1.field7152 && !this.field684 && ~class454.field6661.method509(class113.field1723, -2) != -1;
        int var11 = 2048;
        if (this.field702) {
            var11 |= 65536;
        }
        class126 var12 = this.method396(65535, arg0, var11, this.field689);
        if (var12 != null) {
            this.field688 = var12.field1903;
            this.field686 = var12.field1897;
            if (this.field702) {
                this.field688 = this.field688.method610((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field678;
        if (arg1 != -1) {
            field676 = null;
        }
        if (this.field688 == null) {
            return null;
        } else {
            class511 var3 = arg0.method66();
            var3.method1307(super.field7505, super.field7503, super.field7504);
            class268 var4 = null;
            if (this.field691) {
                var4 = class281.method1757(0, 1);
            }
            this.field688.method640(var3, var4 == null ? null : var4.field3992[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        ++field695;
        Object var3 = null;
        class502 var5;
        if (this.field686 == null && this.field689) {
            class126 var4 = this.method396(65535, arg0, 262144, true);
            var5 = var4 != null ? var4.field1897 : null;
        } else {
            var5 = this.field686;
            this.field686 = null;
        }
        int var6 = -89 % ((42 - arg1) / 36);
        if (var5 != null) {
            class489.method2918(var5, this.field693, super.field7505, super.field7504, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        int var4 = -117 / ((arg2 - 62) / 42);
        ++field697;
        return this.method393(arg0, arg1, (byte) -114);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        if (arg0 != 33) {
            this.method396(-42, (class11) null, 107, false);
        }
        ++field677;
        Object var3 = null;
        class502 var5;
        if (this.field686 == null && this.field689) {
            class126 var4 = this.method396(65535, arg1, 262144, true);
            var5 = var4 != null ? var4.field1897 : null;
        } else {
            var5 = this.field686;
            this.field686 = null;
        }
        if (var5 != null) {
            class174.method1197(var5, this.field693, super.field7505, super.field7504, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        ++field698;
        if (this.field688 != null) {
            this.field688.method624();
        }
        if (arg0) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        if (arg0 != -19634) {
            this.method231((byte) -83, (class11) null);
        }
        ++field692;
        return this.field700;
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public static void method394(int arg0) {
        int var1 = 45 % ((arg0 - -9) / 47);
        field676 = null;
        field690 = null;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        ++field681;
        if (arg0 > -38) {
            this.method233(7, (class11) null, 65, -20);
        }
        this.field702 = false;
        if (this.field688 != null) {
            this.field688.method602(this.field688.method626() & -65537);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        ++field703;
        if (!(arg4 instanceof class53)) {
            if (arg4 instanceof class326) {
                class326 var8 = (class326) arg4;
                if (this.field688 != null && var8.field5098 != null) {
                    this.field688.method604(var8.field5098, arg2, arg1, arg3, arg6);
                }
            }
        } else {
            class53 var9 = (class53) arg4;
            if (this.field688 != null && var9.field688 != null) {
                this.field688.method604(var9.field688, arg2, arg1, arg3, arg6);
            }
        }
        int var10 = 19 / ((arg5 - 24) / 62);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
    public static final void method395(byte arg0, int arg1) {
        int var2 = -115 % ((61 - arg0) / 36);
        ++field679;
        class506 var3 = class14.method185(-1304589728, arg1, 8);
        var3.method2986(119);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        if (arg0 >= -99) {
            return 78;
        } else {
            ++field685;
            return this.field699;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        if (arg0) {
            this.method230(-114);
        }
        ++field701;
        return this.field689;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        ++field680;
        return arg0 != -15578 ? -44 : 65535 & this.field705;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILya;IZ)Lro;")
    private final class126 method396(int arg0, class11 arg1, int arg2, boolean arg3) {
        ++field696;
        class486 var5 = class119.field1824.method248(this.field705 & arg0, 30);
        class337 var6;
        class337 var7;
        if (this.field684) {
            var6 = class213.field3048[0];
            var7 = class420.field6281[this.field693];
        } else {
            var7 = class213.field3048[this.field693];
            if (this.field693 < 3) {
                var6 = class213.field3048[this.field693 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2900(arg2, arg3, super.field7503, this.field700, super.field7505, arg1, var7, this.field699, var6, true, super.field7504);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field683;
        if (arg2 != 2) {
            method392(-121, true, 15, 25, -19, -126, -0.67899835F, -38, -80);
        }
        class398 var5 = this.method393(131072, arg1, (byte) -92);
        if (var5 != null) {
            class511 var6 = arg1.method66();
            var6.method1307(super.field7505, super.field7503, super.field7504);
            return var5.method655(arg0, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        ++field687;
        if (arg0 != -22611) {
            field690 = null;
        }
        return this.field702;
    }
}
