import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class451 extends class403 implements class223 {

    @OriginalMember(owner = "client!sn", name = "R", descriptor = "S")
    private short field6481;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Z")
    private boolean field6463;

    @OriginalMember(owner = "client!sn", name = "O", descriptor = "B")
    private byte field6478;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "B")
    private byte field6471;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "Z")
    private boolean field6461;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "Z")
    private boolean field6465;

    @OriginalMember(owner = "client!sn", name = "ab", descriptor = "B")
    private byte field6490;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "Z")
    private boolean field6462;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "Lts;")
    public class116 field6473;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "Llb;")
    private class210 field6468;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6479 = new Rectangle[100];

    @OriginalMember(owner = "client!sn", name = "bb", descriptor = "Ljm;")
    public static class162 field6491;

    @OriginalMember(owner = "client!sn", name = "eb", descriptor = "[J")
    public static long[] field6494;

    @OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!sn", name = "Q", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!sn", name = "S", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!sn", name = "T", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!sn", name = "U", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!sn", name = "V", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!sn", name = "W", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!sn", name = "Z", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!sn", name = "db", descriptor = "Lsg;")
    public static class267 field6493;

    @OriginalMember(owner = "client!sn", name = "cb", descriptor = "Lij;")
    public static class316 field6492;

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field6479[var0] = new Rectangle();
        }
        field6491 = new class162();
        field6494 = new long[256];
        for (int var1 = 0; var1 < 256; ++var1) {
            long var2 = (long) var1;
            for (int var4 = 0; ~var4 > -9; ++var4) {
                if (~(1L & var2) != -2L) {
                    var2 >>>= 1;
                } else {
                    var2 = -3932672073523589310L ^ var2 >>> 1;
                }
            }
            field6494[var1] = var2;
        }
        field6496 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I", line = 9)
    public final int method695(int arg0) {
        ++field6470;
        if (arg0 != 898) {
            this.method709(47);
        }
        return this.field6490;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lea;BI)Lts;", line = 23)
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        if (arg1 != -63) {
            return null;
        } else {
            ++field6467;
            return this.method2819(arg2, false, arg0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLea;)V", line = 34)
    public final void method698(byte arg0, class58 arg1) {
        ++field6482;
        Object var3 = null;
        class210 var5;
        if (this.field6468 == null && this.field6462) {
            class274 var4 = this.method2814(arg1, true, (byte) -46, 131072);
            var5 = var4 != null ? var4.field3745 : null;
        } else {
            var5 = this.field6468;
            this.field6468 = null;
        }
        int var6 = 116 % ((arg0 - 24) / 49);
        if (var5 != null) {
            class259.method1669(var5, this.field6478, super.field5561, super.field5565, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V", line = 60)
    public static final void method2813(int arg0) {
        if (arg0 >= 60) {
            class113.field1742.method2530((byte) -53);
            ++field6489;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lea;Lp;IIIIZIIZ)V", line = 73)
    public class451(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class431.method2659(arg7, arg8, (byte) -110));
        this.field6481 = (short) arg1.field6323;
        this.field6463 = arg6;
        super.field5565 = (short) arg5;
        this.field6478 = (byte) arg2;
        this.field6471 = (byte) arg8;
        super.field5561 = (short) arg3;
        this.field6461 = ~arg1.field6297 != -1 && !arg6;
        this.field6465 = arg9;
        this.field6490 = (byte) arg7;
        this.field6462 = arg0.method218() && arg1.field6332 && !this.field6463 && class228.field3188 != 0;
        int var11 = 1024;
        if (this.field6465) {
            var11 |= 32768;
        }
        class274 var12 = this.method2814(arg0, this.field6462, (byte) -46, var11);
        if (var12 != null) {
            this.field6473 = var12.field3748;
            this.field6468 = var12.field3745;
            if (this.field6465) {
                this.field6473 = this.field6473.method907((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)Z", line = 109)
    public final boolean method706(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field6485;
            return this.field6462;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lea;ZBI)Lto;", line = 122)
    private final class274 method2814(class58 arg0, boolean arg1, byte arg2, int arg3) {
        ++field6476;
        if (arg2 != -46) {
            this.field6478 = -126;
        }
        class447 var5 = class133.method996((byte) -19, 65535 & this.field6481);
        class323 var6;
        class323 var7;
        if (!this.field6463) {
            if (~this.field6478 <= -4) {
                var6 = null;
            } else {
                var6 = class82.field1130[this.field6478 + 1];
            }
            var7 = class82.field1130[this.field6478];
        } else {
            var6 = class82.field1130[0];
            var7 = class125.field1879[this.field6478];
        }
        return var5.method2761(var7, arg0, this.field6471, -783202211, arg1, this.field6490, super.field5569, arg3, super.field5565, super.field5561, var6);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lea;I)V", line = 155)
    public final void method707(class58 arg0, int arg1) {
        ++field6469;
        if (arg1 >= -99) {
            this.field6465 = false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIB)Lvg;", line = 166)
    public static final class108 method2815(int arg0, int arg1, byte arg2) {
        if (arg2 != -53) {
            field6494 = null;
        }
        ++field6466;
        class108 var3 = class157.method1139(arg0, false);
        if (~arg1 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field1651 != null && arg1 < var3.field1651.length ? var3.field1651[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZILea;I)Z", line = 185)
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field6484;
        class116 var5 = this.method2819(65536, false, arg2);
        if (var5 != null) {
            class309 var6 = arg2.method210();
            var6.method1866(super.field5561, super.field5569, super.field5565);
            return var5.method898(arg3, arg1, var6, false);
        } else {
            if (!arg0) {
                this.method2819(71, true, (class58) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(ILea;)Lms;", line = 210)
    public final class450 method696(int arg0, class58 arg1) {
        ++field6472;
        if (this.field6473 == null) {
            return null;
        } else {
            class309 var3 = arg1.method210();
            var3.method1866(super.field5561, super.field5569, super.field5565);
            class450 var4 = null;
            if (this.field6461) {
                var4 = class61.method494(arg0 + -77, 1);
            }
            this.field6473.method896(var3, var4 == null ? null : var4.field6451[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Z", line = 233)
    public final boolean method697(int arg0) {
        ++field6488;
        if (arg0 <= 115) {
            this.field6461 = false;
        }
        return this.field6465;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z", line = 247)
    public static final boolean method2816(int arg0, int arg1, int arg2) {
        ++field6475;
        class447 var3 = class133.method996((byte) -19, arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg0 <= 62) {
            return true;
        } else {
            if (~arg1 <= -6 && arg1 <= 8) {
                arg1 = 4;
            }
            return var3.method2764(-31236, arg1);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 267)
    public final void method708(int arg0) {
        if (arg0 == 26389) {
            if (this.field6473 != null) {
                this.field6473.method901();
            }
            ++field6483;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(Z)V", line = 283)
    public static void method2817(boolean arg0) {
        field6492 = null;
        if (arg0) {
            field6491 = null;
        }
        field6479 = null;
        field6491 = null;
        field6493 = null;
        field6494 = null;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)I", line = 297)
    public final int method709(int arg0) {
        if (arg0 != 30030) {
            field6494 = null;
        }
        ++field6464;
        return this.field6471;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I", line = 308)
    public final int method711(boolean arg0) {
        ++field6487;
        return !arg0 ? 16 : 65535 & this.field6481;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 322)
    public final void method702(byte arg0) {
        ++field6474;
        if (arg0 == 46) {
            this.field6465 = false;
            if (this.field6473 != null) {
                this.field6473.method897(-32769 & this.field6473.method866());
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)V", line = 341)
    public static final void method2818(int arg0, int arg1, int arg2, int arg3) {
        class63 var4 = class341.field4617[arg0][arg1][arg2];
        if (var4 != null) {
            class371 var5 = var4.field861;
            class371 var6 = var4.field859;
            if (var5 != null) {
                var5.field5139 = var5.field5139 * arg3 / 16;
                var5.field5143 = var5.field5143 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field5139 = var6.field5139 * arg3 / 16;
                var6.field5143 = var6.field5143 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILea;)V", line = 363)
    public final void method704(int arg0, class58 arg1) {
        ++field6477;
        Object var3 = null;
        class210 var5;
        if (this.field6468 == null && this.field6462) {
            class274 var4 = this.method2814(arg1, true, (byte) -46, 131072);
            var5 = var4 != null ? var4.field3745 : null;
        } else {
            var5 = this.field6468;
            this.field6468 = null;
        }
        if (arg0 != -29096) {
            this.field6478 = -5;
        }
        if (var5 != null) {
            class383.method2369(var5, this.field6478, super.field5561, super.field5565, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 390)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 22546) {
            if (!(arg3 instanceof class451)) {
                if (arg3 instanceof class163) {
                    class163 var8 = (class163) arg3;
                    if (this.field6473 != null && var8.field2308 != null) {
                        this.field6473.method869(var8.field2308, arg1, arg6, arg5, arg4);
                    }
                }
            } else {
                class451 var9 = (class451) arg3;
                if (this.field6473 != null && var9.field6473 != null) {
                    this.field6473.method869(var9.field6473, arg1, arg6, arg5, arg4);
                }
            }
            ++field6486;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZLea;)Lts;", line = 419)
    private final class116 method2819(int arg0, boolean arg1, class58 arg2) {
        ++field6480;
        if (this.field6473 != null && ~arg2.method187(this.field6473.method866(), arg0) == -1) {
            return this.field6473;
        } else {
            class274 var4 = this.method2814(arg2, arg1, (byte) -46, arg0);
            return var4 != null ? var4.field3748 : null;
        }
    }
}
