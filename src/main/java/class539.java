import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class539 extends class91 implements class722 {

    @OriginalMember(owner = "client!dfa", name = "kb", descriptor = "S")
    private short field7500;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "Z")
    private boolean field7476;

    @OriginalMember(owner = "client!dfa", name = "cb", descriptor = "B")
    private byte field7492;

    @OriginalMember(owner = "client!dfa", name = "ab", descriptor = "B")
    private byte field7490;

    @OriginalMember(owner = "client!dfa", name = "U", descriptor = "Z")
    private boolean field7484;

    @OriginalMember(owner = "client!dfa", name = "mb", descriptor = "Z")
    private boolean field7502;

    @OriginalMember(owner = "client!dfa", name = "P", descriptor = "Z")
    private boolean field7479;

    @OriginalMember(owner = "client!dfa", name = "X", descriptor = "Lka;")
    public class284 field7487;

    @OriginalMember(owner = "client!dfa", name = "fb", descriptor = "Lr;")
    private class709 field7495;

    @OriginalMember(owner = "client!dfa", name = "W", descriptor = "Lkr;")
    public static class602 field7486 = new class602(8, 8);

    @OriginalMember(owner = "client!dfa", name = "nb", descriptor = "Lst;")
    public static class335 field7503 = new class335(73, -1);

    @OriginalMember(owner = "client!dfa", name = "ob", descriptor = "[I")
    public static int[] field7504 = new int[1];

    @OriginalMember(owner = "client!dfa", name = "pb", descriptor = "Lst;")
    public static class335 field7505 = new class335(24, -1);

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!dfa", name = "Q", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!dfa", name = "R", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!dfa", name = "S", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!dfa", name = "V", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!dfa", name = "Z", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!dfa", name = "bb", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!dfa", name = "db", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!dfa", name = "eb", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!dfa", name = "gb", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!dfa", name = "hb", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!dfa", name = "ib", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!dfa", name = "jb", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!dfa", name = "lb", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!dfa", name = "Y", descriptor = "Liha;")
    private class613 field7488;

    @OriginalMember(owner = "client!dfa", name = "T", descriptor = "Ljava/lang/String;")
    public static String field7483;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)I", line = 5)
    public final int method784(int arg0) {
        ++field7485;
        return arg0 != -4532 ? -88 : this.field7490;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lha;Z)V", line = 20)
    public final void method786(class548 arg0, boolean arg1) {
        ++field7477;
        Object var3 = null;
        class709 var5;
        if (this.field7495 == null && this.field7479) {
            class308 var4 = this.method3194(262144, true, arg0, (byte) -79);
            var5 = var4 != null ? var4.field4321 : null;
        } else {
            var5 = this.field7495;
            this.field7495 = null;
        }
        if (arg1) {
            if (var5 != null) {
                class569.method3337(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lha;I)Lua;", line = 52)
    public final class3 method660(class548 arg0, int arg1) {
        ++field7472;
        if (arg1 != -1) {
            this.field7500 = 77;
        }
        if (this.field7487 == null) {
            return null;
        } else {
            class744 var3 = arg0.method1404();
            var3.method905(super.field4410, super.field4413, super.field4418);
            class3 var4 = class682.method3841(1, this.field7502, arg1 + 28390);
            if (class301.field4261) {
                this.field7487.method1682(var3, var4.field18[0], class3.field30, 0);
            } else {
                this.field7487.method1686(var3, var4.field18[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZILha;)Lka;", line = 80)
    private final class284 method3193(boolean arg0, int arg1, class548 arg2) {
        ++field7475;
        if (this.field7487 != null && ~arg2.method1484(this.field7487.method1703(), arg1) == -1) {
            return this.field7487;
        } else {
            class308 var4 = this.method3194(arg1, arg0, arg2, (byte) -48);
            return var4 != null ? var4.field4319 : null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 103)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        ++field7494;
        if (arg0 > -8) {
            field7483 = null;
        }
        if (arg4 instanceof class539) {
            class539 var8 = (class539) arg4;
            if (this.field7487 != null && var8.field7487 != null) {
                this.field7487.method1654(var8.field7487, arg6, arg3, arg5, arg2);
            }
        } else {
            if (arg4 instanceof class229) {
                class229 var9 = (class229) arg4;
                if (this.field7487 != null && var9.field3074 != null) {
                    this.field7487.method1654(var9.field3074, arg6, arg3, arg5, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILha;IB)Z", line = 136)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field7482;
        class284 var5 = this.method3193(false, 131072, arg1);
        if (arg3 >= -58) {
            return false;
        } else if (var5 != null) {
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            return !class301.field4261 ? var5.method1669(arg0, arg2, var6, false, 0) : var5.method1653(arg0, arg2, var6, false, 0, class3.field30);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lha;Lts;IIIIIZIIZ)V", line = 157)
    public class539(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class745.method4145(arg9, arg8, 3));
        super.field4418 = arg6;
        this.field7500 = (short) arg1.field2964;
        this.field7476 = arg7;
        this.field7492 = (byte) arg9;
        this.field7490 = (byte) arg8;
        this.field7484 = arg10;
        this.field7502 = arg1.field2948 != 0 && !arg7;
        super.field4410 = arg4;
        this.field7479 = arg0.method1490() && arg1.field2956 && !this.field7476 && ~class332.field4707.field4787.method942(0) != -1;
        int var12 = 2048;
        if (this.field7484) {
            var12 |= 65536;
        }
        class308 var13 = this.method3194(var12, this.field7479, arg0, (byte) -110);
        if (var13 != null) {
            this.field7487 = var13.field4319;
            this.field7495 = var13.field4321;
            if (this.field7484) {
                this.field7487 = this.field7487.method1659((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)Z", line = 190)
    public final boolean method783(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field7471;
            if (this.field7487 == null) {
                return true;
            } else {
                return !this.field7487.method1689();
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)I", line = 205)
    public final int method794(int arg0) {
        if (arg0 <= 92) {
            this.field7495 = null;
        }
        ++field7499;
        return this.field7492;
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)Z", line = 216)
    public final boolean method781(int arg0) {
        ++field7493;
        if (arg0 > -86) {
            this.method793((byte) 105);
        }
        return this.field7479;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZLha;)V", line = 230)
    public final void method659(boolean arg0, class548 arg1) {
        ++field7496;
        if (arg0) {
            this.method781(40);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)V", line = 241)
    public final void method795(int arg0) {
        ++field7501;
        if (arg0 <= 31) {
            this.field7484 = false;
        }
        if (this.field7487 != null) {
            this.field7487.method1705();
        }
    }

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "(I)Z", line = 255)
    public final boolean method785(int arg0) {
        if (arg0 >= -117) {
            field7504 = null;
        }
        ++field7481;
        return this.field7487 == null ? false : this.field7487.method1673();
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lha;B)V", line = 270)
    public final void method792(class548 arg0, byte arg1) {
        if (arg1 <= -105) {
            ++field7491;
            Object var3 = null;
            class709 var5;
            if (this.field7495 == null && this.field7479) {
                class308 var4 = this.method3194(262144, true, arg0, (byte) -93);
                var5 = var4 != null ? var4.field4321 : null;
            } else {
                var5 = this.field7495;
                this.field7495 = null;
            }
            if (var5 != null) {
                class569.method3336(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLha;B)Lcn;", line = 297)
    private final class308 method3194(int arg0, boolean arg1, class548 arg2, byte arg3) {
        ++field7498;
        class220 var5 = class20.field192.method716(6, this.field7500 & 65535);
        if (arg3 > -47) {
            this.method794(96);
        }
        class341 var6;
        class341 var7;
        if (this.field7476) {
            var6 = class371.field5240[super.field4419];
            var7 = class550.field7649[0];
        } else {
            if (~super.field4419 > -4) {
                var7 = class550.field7649[super.field4419 - -1];
            } else {
                var7 = null;
            }
            var6 = class550.field7649[super.field4419];
        }
        return var5.method1295(this.field7492, -5488, (class77) null, arg0, arg2, this.field7490, super.field4418, arg1, super.field4413, var7, var6, super.field4410);
    }

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "(I)V", line = 329)
    public final void method641(int arg0) {
        ++field7489;
        if (arg0 <= 91) {
            this.method794(95);
        }
        this.field7484 = false;
        if (this.field7487 != null) {
            this.field7487.method1691(-65537 & this.field7487.method1703());
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(Lha;B)Liha;", line = 345)
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            this.field7490 = -32;
        }
        ++field7478;
        if (this.field7488 == null) {
            this.field7488 = class491.method2980(super.field4418, 117, super.field4413, this.method3193(false, 0, arg0), super.field4410);
        }
        return this.field7488;
    }

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "(I)I", line = 362)
    public final int method790(int arg0) {
        ++field7497;
        if (arg0 != -11692) {
            this.field7492 = 68;
        }
        return this.field7487 == null ? 0 : this.field7487.method1668();
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)Z", line = 373)
    public final boolean method642(byte arg0) {
        ++field7480;
        return arg0 != 2 ? true : this.field7484;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)I", line = 386)
    public final int method793(byte arg0) {
        ++field7474;
        if (arg0 != -86) {
            this.field7492 = -96;
        }
        return this.field7487 == null ? 0 : this.field7487.method1697();
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)V", line = 397)
    public static void method3195(boolean arg0) {
        field7483 = null;
        field7503 = null;
        field7505 = null;
        field7486 = null;
        field7504 = null;
        if (!arg0) {
            method3195(false);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)I", line = 417)
    public final int method782(byte arg0) {
        int var2 = 101 / ((arg0 - -5) / 54);
        ++field7473;
        return 65535 & this.field7500;
    }
}
