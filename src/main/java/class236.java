import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class236 extends class454 {

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Z")
    public boolean field3647 = false;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    private int field3657 = 0;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field3649 = 0;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    private int field3662 = 0;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    private int field3670 = -1;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Z")
    private boolean field3665 = false;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    private int field3678 = 0;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    private int field3679 = 0;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "Lrk;")
    private class30 field3676;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Lnea;")
    public static class664 field3648 = new class664(106, 8);

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Z")
    public static boolean field3663 = false;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field3675 = 0;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lmca;")
    private class29 field3677;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
    public static final void method1611(int arg0, int arg1, int arg2, int arg3) {
        ++field3651;
        int var4 = class287.field4270.field3701 * arg0 >> 8;
        if (arg3 == -1 && !class43.field701) {
            class691.method3804(true);
        } else if (arg3 != -1 && (class392.field5800 != arg3 || !class165.method1146(true)) && ~var4 != -1 && !class43.field701) {
            class618.method3429(var4, 0, arg2 + -30863, arg1, arg3, false, class652.field9171);
        }
        if (arg2 == 30867) {
            class392.field5800 = arg3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)I")
    public final int method1182(int arg0) {
        if (arg0 != -32768) {
            this.method1616(-68, (class166) null, (byte) 108, 39);
        }
        ++field3653;
        return this.field3657;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static void method1612(byte arg0) {
        field3648 = null;
        if (arg0 != -60) {
            method1612((byte) 97);
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Z")
    public final boolean method1181(int arg0) {
        ++field3660;
        return arg0 != -1;
    }

    @OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3677 != null) {
            this.field3677.method334();
        }
        ++field3672;
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        if (arg0 >= -26) {
            return true;
        } else {
            ++field3659;
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method1613(int arg0) {
        ++field3655;
        if (arg0 <= 41) {
            this.field3676 = null;
        }
        if (this.field3677 != null) {
            this.field3677.method334();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
    public final int method1171(byte arg0) {
        ++field3671;
        if (arg0 <= 39) {
            method1611(-31, -65, 61, -80);
        }
        return this.field3649;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V")
    public static final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3674;
        if (arg1 <= 62) {
            method1614(-97, 79, -68, -80, -100);
        }
        for (int var5 = 0; var5 < class28.field407; ++var5) {
            Rectangle var6 = class210.field2933[var5];
            if (~(var6.x - -var6.width) < ~arg3 && arg3 + arg4 > var6.x && var6.y + var6.height > arg2 && arg2 - -arg0 > var6.y) {
                class380.field5381[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
    public final void method1615(int arg0, int arg1) {
        ++field3661;
        if (!this.field3647) {
            if (arg1 < 97) {
                this.method951(105);
            }
            this.field3679 += arg0;
            while (this.field3679 > this.field3676.field450[this.field3678]) {
                this.field3679 -= this.field3676.field450[this.field3678];
                ++this.field3678;
                if (~this.field3676.field456.length >= ~this.field3678) {
                    this.field3647 = true;
                    break;
                }
            }
            if (!this.field3647) {
                class603.method3399(this.field3676, super.field3024, this.field3678, false, -103, super.field3029, super.field3019);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(ILr;)Lnu;")
    public final class548 method1183(int arg0, class166 arg1) {
        ++field3658;
        if (arg0 != 6433) {
            this.field3654 = 86;
        }
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        if (arg0 != -26798) {
            this.method1185(-114, -87, (class166) null, 28);
        }
        ++field3673;
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3656 = arg1 + arg2;
        this.field3662 = arg12;
        this.field3654 = arg0;
        class309 var14 = class86.field1411.method1475((byte) -74, this.field3654);
        int var15 = var14.field4566;
        if (var15 == -1) {
            this.field3647 = true;
        } else {
            this.field3676 = class188.field2708.method2140(var15, 123);
            this.field3647 = false;
        }
        if (this.field3656 == arg2) {
            class603.method3399(this.field3676, super.field3024, this.field3678, false, -96, super.field3029, super.field3019);
        }
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        int var2 = 5 % ((-44 - arg0) / 42);
        ++field3669;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILr;BI)Lda;")
    private final class55 method1616(int arg0, class166 arg1, byte arg2, int arg3) {
        ++field3668;
        class309 var5 = class86.field1411.method1475((byte) -74, arg3);
        class37 var6 = class420.field6108[super.field3019];
        class37 var7 = ~super.field3023 > -4 ? class420.field6108[super.field3023 + 1] : null;
        if (arg2 < 58) {
            this.method951(-10);
        }
        return !this.field3647 ? var5.method1972(arg0, super.field3018, this.field3670, var7, this.field3678, arg1, true, this.field3679, (byte) -116, super.field3029, super.field3024, var6, class188.field2708) : var5.method1972(arg0, super.field3018, -1, var7, -1, arg1, true, 0, (byte) -116, super.field3029, super.field3024, var6, class188.field2708);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            ++field3667;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Z")
    public final boolean method1184(int arg0) {
        ++field3652;
        int var2 = 124 % ((arg0 - -1) / 59);
        return this.field3665;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILr;)V")
    public final void method1177(int arg0, class166 arg1) {
        ++field3650;
        class55 var3 = this.method1616(arg0, arg1, (byte) 101, this.field3654);
        if (var3 != null) {
            class391 var4 = arg1.method130();
            var4.method252(super.field3024, super.field3018, super.field3029);
            this.method1617(var4, arg1, var3, 1280629128);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lr;Z)Lkq;")
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field3666;
        class55 var3 = this.method1616((~this.field3662 == -1 ? 0 : 5) | 2048, arg0, (byte) 105, this.field3654);
        if (var3 == null) {
            return null;
        } else {
            if (this.field3662 != 0) {
                var3.method540(this.field3662 * 2048);
            }
            class391 var4 = arg0.method130();
            var4.method252(super.field3024, super.field3018, super.field3029);
            this.method1617(var4, arg0, var3, 1280629128);
            if (class676.field9574) {
                var3.method495(var4, (class253) null, class341.field5008, 0);
            } else {
                var3.method513(var4, (class253) null, 0);
            }
            if (this.field3677 != null) {
                class499 var5 = this.field3677.method339();
                if (!class676.field9574) {
                    arg0.method156(var5);
                } else {
                    arg0.method165(var5, class341.field5008);
                }
            }
            if (!arg1) {
                return null;
            } else {
                this.field3665 = var3.method545();
                this.field3657 = var3.method488();
                this.field3649 = var3.method525();
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lq;Lr;Lda;I)V")
    private final void method1617(class391 arg0, class166 arg1, class55 arg2, int arg3) {
        ++field3664;
        arg2.method538(arg0);
        if (arg3 != 1280629128) {
            this.field3677 = null;
        }
        class568[] var5 = arg2.method501();
        class77[] var6 = arg2.method487();
        if ((this.field3677 == null || this.field3677.field440) && (var5 != null || var6 != null)) {
            this.field3677 = class29.method329(class564.field7962, true);
        }
        if (this.field3677 != null) {
            this.field3677.method336(arg1, (long) class564.field7962, var5, var6, false);
            this.field3677.method333(super.field3019, super.field6524, super.field6526, super.field6521, super.field6516);
        }
    }
}
