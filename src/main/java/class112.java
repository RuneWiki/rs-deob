import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class112 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Z")
    private boolean field1592 = true;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    private int field1613 = -1;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[Lsb;")
    private class190[] field1605;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lsb;")
    private class190 field1600;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[Lsb;")
    private class190[] field1611;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lcr;")
    public static class403 field1596 = null;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lvj;")
    public static class304 field1594 = new class304("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Ljp;")
    public static class236 field1609 = new class236(10);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lf;")
    private class529 field1595;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method768(byte arg0, int arg1, int arg2) {
        field1604++;
        class253 var3 = class332.method1911(arg2, (byte) -127, 7);
        var3.method1522(arg0 ^ 0xFFFFFFBC);
        var3.field3356 = arg1;
        if (arg0 != -68) {
            method768((byte) 110, 115, -85);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 22)
    public static void method769(int arg0) {
        if (arg0 < 113) {
            method769(-58);
        }
        field1594 = null;
        field1609 = null;
        field1596 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 35)
    public final void method770(byte arg0) {
        int var2 = 73 % ((arg0 + 42) / 37);
        if (this.field1605 != null) {
            for (int var3 = 0; var3 < this.field1605.length; var3++) {
                this.field1605[var3].method1220();
            }
        }
        field1603++;
        this.field1595 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 59)
    public static final void method771(int arg0) {
        if (class413.field5715 <= 0) {
            class294.field3847 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class390.field5283.length; var2++) {
                if (class390.field5283[var2].startsWith("--> ")) {
                    var1++;
                    if (class413.field5715 == var1) {
                        class294.field3847 = class390.field5283[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field1597++;
        if (arg0 != -16054) {
            method773(-21, (byte) 60, 116);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 92)
    public static final void method772(int arg0) {
        field1602++;
        if (class209.field2866) {
            return;
        }
        if (class154.field2244.field7738) {
            class184.field2621 = ((int) class184.field2621 - 65 & 0xFFFFFF80);
        } else {
            class467.field6440 += (-24.0F - class467.field6440) / 2.0F;
        }
        if (arg0 == 10) {
            class104.field1531 = true;
            class209.field2866 = true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBI)V", line = 120)
    public static final void method773(int arg0, byte arg1, int arg2) {
        if (arg1 < -73) {
            field1606++;
            class253 var3 = class332.method1911(arg2, (byte) -126, 16);
            var3.method1522(0);
            var3.field3356 = arg0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I[Lsb;IIII)V", line = 322)
    public class112(int arg0, class190[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1612 = arg4;
        this.field1598 = arg5;
        this.field1605 = arg1;
        this.field1607 = arg3;
        this.field1599 = arg0;
        if (arg1 == null) {
            this.field1600 = null;
            this.field1611 = null;
        } else {
            this.field1611 = new class190[arg1.length];
            this.field1600 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILqa;IIIIIIII)V", line = 145)
    public final void method774(int arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg2 + arg6 & 0x3FFF;
        field1608++;
        if (this.field1599 == -1) {
            arg1.method585(arg4, arg5, arg0, arg9, arg7, 0);
        } else {
            class278 var12 = class155.field2276.method677(2459, this.field1599);
            if (this.field1595 == null && class155.field2276.method680(-16576, this.field1599)) {
                int[] var13 = var12.field3637 ? class155.field2276.method678(0.7F, this.field1599, 24201, false, this.field1591, this.field1591) : class155.field2276.method681(0.7F, false, this.field1591, this.field1591, 1519, this.field1599);
                this.field1595 = arg1.method598(var13, 0, this.field1591, this.field1591, this.field1591);
            }
            if (!var12.field3637) {
                arg1.method585(arg4, arg5, arg0, arg9, arg7, 0);
            }
            if (this.field1595 != null) {
                int var14 = var12.field3637 ? 0 : 1;
                int var15 = arg8 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg0 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (var15 > arg9) {
                    var15 -= arg9;
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg0; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field1595.method155(arg4 + var17, arg5 + var18, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        if (arg3 <= 67) {
            this.method774(-95, null, -14, 23, 72, -120, -35, 39, -92, -35);
        }
        for (int var19 = this.field1601 - 1; var19 >= 0; var19--) {
            this.field1611[var19].method1226(arg1, arg4, arg5, arg0, arg9, arg8, var11);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILqa;I)Z", line = 230)
    public final boolean method775(int arg0, class162 arg1, int arg2) {
        field1593++;
        if (arg2 != 4) {
            field1594 = null;
        }
        if (this.field1613 != arg0) {
            this.field1613 = arg0;
            int var4 = class321.method1857((byte) 113, arg0);
            if (var4 > arg0) {
                var4 = class415.method2408(arg0, (byte) -59);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1591 != var4) {
                this.field1595 = null;
                this.field1591 = var4;
            }
            if (this.field1605 != null) {
                this.field1601 = 0;
                int[] var5 = new int[this.field1605.length];
                for (int var6 = 0; var6 < this.field1605.length; var6++) {
                    class190 var7 = this.field1605[var6];
                    if (var7.method1222(this.field1607, this.field1612, this.field1598, this.field1613)) {
                        var5[this.field1601] = var7.field2674;
                        this.field1611[this.field1601++] = var7;
                    }
                }
                class439.method2537(this.field1611, 81, 0, this.field1601 - 1, var5);
            }
            this.field1592 = true;
        }
        boolean var8 = false;
        if (this.field1592) {
            this.field1592 = false;
            for (int var9 = this.field1601 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1611[var9].method1225(arg1, this.field1600);
                this.field1592 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }
}
