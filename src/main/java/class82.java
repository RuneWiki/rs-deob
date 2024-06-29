import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class82 extends class80 {

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field1598 = -32768;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    private int field1597 = 0;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field1605 = 0;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Z")
    public boolean field1607 = false;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Lq;")
    private class122 field1604;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "Lqh;")
    public static class195 field1601 = new class195(5000);

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "Ljd;")
    public static class86 field1612 = class122.method868("Fallen lassen", true);

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Ljd;")
    public static class86 field1614 = class122.method868("<col=00ff00>", true);

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Lrk;")
    public static class257 field1613 = new class257();

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method572(byte arg0) {
        field1601 = null;
        field1614 = null;
        field1612 = null;
        if (arg0 != -71) {
            method572((byte) 101);
        }
        field1613 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1599++;
        class32 var11 = this.method576(true);
        if (var11 != null) {
            var11.method230(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1598 = var11.method233();
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()I")
    public final int method233() {
        field1603++;
        return this.field1598;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)Z")
    public static final boolean method573(int arg0, int arg1, int arg2, int arg3) {
        if (!class230.method1600(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class35.field796[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class81.field1591) {
                    if (!class55.method406(var4, var6, var5)) {
                        return false;
                    }
                    if (!class55.method406(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class55.method406(var4, var7, var5)) {
                        return false;
                    }
                    if (!class55.method406(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class55.method406(var4, var8, var5)) {
                    return false;
                }
                if (!class55.method406(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class191.field3389) {
                    if (!class55.method406(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class55.method406(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class55.method406(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class55.method406(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class55.method406(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class55.method406(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class81.field1591) {
                    if (!class55.method406(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class55.method406(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class55.method406(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class55.method406(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class55.method406(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class55.method406(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class191.field3389) {
                    if (!class55.method406(var4, var6, var5)) {
                        return false;
                    }
                    if (!class55.method406(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class55.method406(var4, var7, var5)) {
                        return false;
                    }
                    if (!class55.method406(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class55.method406(var4, var8, var5)) {
                    return false;
                }
                if (!class55.method406(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class55.method406(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class55.method406(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class55.method406(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class55.method406(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class55.method406(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIILeh;JZ)V")
    public static final void method574(int arg0, int arg1, int arg2, int arg3, class80 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class107 var8 = new class107();
        var8.field2051 = arg4;
        var8.field2064 = arg1 * 128 + 64;
        var8.field2066 = arg2 * 128 + 64;
        var8.field2058 = arg3;
        var8.field2065 = arg5;
        if (class248.field4406[arg0][arg1][arg2] == null) {
            class248.field4406[arg0][arg1][arg2] = new class249(arg0, arg1, arg2);
        }
        class248.field4406[arg0][arg1][arg2].field4437 = var8;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IB)V")
    public final void method575(int arg0, byte arg1) {
        field1602++;
        if (this.field1607) {
            return;
        }
        if (arg1 != -101) {
            this.method575(48, (byte) -26);
        }
        this.field1605 += arg0;
        while (this.field1605 > this.field1604.field2357[this.field1597]) {
            this.field1605 -= this.field1604.field2357[this.field1597];
            this.field1597++;
            if (this.field1597 >= this.field1604.field2361.length) {
                this.field1607 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)Lie;")
    private final class32 method576(boolean arg0) {
        field1595++;
        if (!arg0) {
            field1601 = null;
        }
        class127 var2 = class219.method1547(this.field1608, -124);
        class32 var3;
        if (this.field1607) {
            var3 = var2.method899(-120, -1);
        } else {
            var3 = var2.method899(-121, this.field1597);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1600 = arg1;
        this.field1606 = arg3;
        this.field1593 = arg5 + arg6;
        this.field1594 = arg4;
        this.field1596 = arg2;
        this.field1608 = arg0;
        int var8 = class219.method1547(this.field1608, -124).field2466;
        if (var8 == -1) {
            this.field1607 = true;
        } else {
            this.field1607 = false;
            this.field1604 = class133.method952(var8, 127);
        }
    }
}
