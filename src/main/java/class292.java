import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class292 {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    private int field3691 = 32;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Z")
    private boolean field3705 = false;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "J")
    private long field3698 = class321.method1854(-46);

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "[Lmi;")
    private class463[] field3713 = new class463[8];

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "[Lmi;")
    private class463[] field3715 = new class463[8];

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    private int field3719 = 0;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    private int field3720 = 0;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    private int field3717 = 0;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
    private int field3714 = 0;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Z")
    private boolean field3721 = true;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "J")
    private long field3724 = 0L;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "J")
    private long field3723 = 0L;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field3700 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lpfa;")
    public static class275 field3706;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Lpfa;")
    public static class275 field3712;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lmi;")
    private class463 field3689;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Lxa;")
    public static class468 field3710;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public int[] field3701;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
    public void method1751() {
        field3697++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
    private final void method1752(int arg0, byte arg1) {
        field3711++;
        if (arg1 >= -37) {
            this.method1752(1, (byte) -73);
        }
        this.field3714 -= arg0;
        if (this.field3714 < 0) {
            this.field3714 = 0;
        }
        if (this.field3689 != null) {
            this.field3689.method1486(arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final synchronized void method1753(int arg0) {
        if (class8.field80 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class8.field80.field8039[var3] == this) {
                    class8.field80.field8039[var3] = null;
                }
                if (class8.field80.field8039[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class8.field80.field8037 = true;
                while (class8.field80.field8036) {
                    class700.method3867(arg0 ^ 0x725F, 50L);
                }
                class8.field80 = null;
            }
        }
        field3690++;
        this.method1751();
        this.field3701 = null;
        this.field3705 = true;
        if (arg0 != 0) {
            this.field3724 = 86L;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()I")
    public int method1754() throws Exception {
        field3708++;
        return this.field3718;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILmi;)V")
    public final synchronized void method1755(int arg0, class463 arg1) {
        this.field3689 = arg1;
        field3694++;
        if (arg0 != 5221) {
            this.field3721 = true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public final synchronized void method1756(boolean arg0) {
        field3699++;
        if (this.field3705) {
            return;
        }
        long var2 = class321.method1854(-76);
        try {
            if (var2 > (this.field3698 + 500000L)) {
                this.field3698 = var2 - 500000L;
            }
            if (arg0) {
                this.method1756(true);
            }
            while (this.field3698 + 5000L < var2) {
                this.method1752(256, (byte) -85);
                this.field3698 += (256000 / class278.field3535);
            }
        } catch (Exception var7) {
            this.field3698 = var2;
        }
        if (this.field3701 == null) {
            return;
        }
        try {
            if (this.field3723 != 0L) {
                if (this.field3723 > var2) {
                    return;
                }
                this.method1763(this.field3718);
                this.field3721 = true;
                this.field3723 = 0L;
            }
            int var4 = this.method1754();
            if (this.field3720 - var4 > this.field3717) {
                this.field3717 = this.field3720 - var4;
            }
            int var5 = this.field3722 + this.field3716;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3718) {
                this.field3718 += 1024;
                if (this.field3718 > 16384) {
                    this.field3718 = 16384;
                }
                this.method1751();
                this.method1763(this.field3718);
                var4 = 0;
                this.field3721 = true;
                if ((var5 + 256) > this.field3718) {
                    var5 = this.field3718 - 256;
                    this.field3716 = var5 - this.field3722;
                }
            }
            while (var5 > var4) {
                this.method1764(this.field3701, 256);
                this.method1766();
                var4 += 256;
            }
            if (this.field3724 < var2) {
                if (this.field3721) {
                    this.field3721 = false;
                } else if (this.field3717 == 0 && this.field3719 == 0) {
                    this.method1751();
                    this.field3723 = var2 + 2000L;
                    return;
                } else {
                    this.field3716 = Math.min(this.field3719, this.field3717);
                    this.field3719 = this.field3717;
                }
                this.field3717 = 0;
                this.field3724 = var2 + 2000L;
            }
            this.field3720 = var4;
        } catch (Exception var6) {
            this.method1751();
            this.field3723 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lji;B)Lqba;")
    public static final class377 method1757(class572 arg0, byte arg1) {
        field3696++;
        arg0.method3097((byte) 12);
        if (arg1 < 61) {
            field3700 = -1;
        }
        int var2 = arg0.method3097((byte) 12);
        class377 var3 = class183.method1087(var2, 74);
        var3.field4844 = arg0.method3097((byte) 12);
        int var4 = arg0.method3097((byte) 12);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method3097((byte) 12);
            var3.method27(var6, 93, arg0);
        }
        var3.method91((byte) 75);
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final synchronized void method1758(int arg0) {
        field3707++;
        this.field3721 = true;
        try {
            this.method1762();
            if (arg0 < 108) {
                this.method1764(null, -100);
            }
        } catch (Exception var2) {
            this.method1751();
            this.field3723 = class321.method1854(-80) + 2000L;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1759(Component arg0) throws Exception {
        field3692++;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
    public static final int method1760(int arg0) {
        if (arg0 < 102) {
            return 110;
        }
        field3693++;
        if (class338.field4324 == null) {
            if (!class367.field4752 && class638.field8648 > 0) {
                if (class272.field3438 && class307.field3884.method1592((byte) -120, 81) && class638.field8648 > 2) {
                    return ((class501) class345.field4438.field4121.field3319.field3319).field6246;
                }
                return ((class501) class345.field4438.field4121.field3319).field6246;
            }
            int var1 = class113.field1423.method1074((byte) 122);
            int var2 = class113.field1423.method1078((byte) 118);
            int var3 = class284.field3593;
            int var4 = class465.field5774;
            int var5 = class559.field6988;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class638.field8648; var7++) {
                    if (class353.field4564) {
                        int var12 = (class638.field8648 - var7 - 1) * 16 + var4 + 33;
                        if (var12 - 13 < var2 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class638.field8648 - (var7 + 1)) * 16 + var4 + 31;
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class270 var9 = new class270(class345.field4438);
                    for (class501 var10 = (class501) var9.method1608(3); var10 != null; var10 = (class501) var9.method1604(63)) {
                        if (var6 == (var8++)) {
                            return var10.field6246;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method1761(byte arg0) {
        field3706 = null;
        field3710 = null;
        if (arg0 != 2) {
            method1767(true, null);
        }
        field3712 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
    public void method1762() throws Exception {
        field3709++;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public void method1763(int arg0) throws Exception {
        field3695++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([II)V")
    private final void method1764(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class487.field6095) {
            var3 = arg1 << 1;
        }
        class70.method555(arg0, 0, var3);
        this.field3714 -= arg1;
        if (this.field3689 != null && this.field3714 <= 0) {
            this.field3714 += class278.field3535 >> 4;
            class243.method1459(this.field3689, false);
            this.method1768(false, this.field3689.method2534(), this.field3689);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class463 var10 = null;
                        class463 var11 = this.field3715[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class302 var12 = var11.field5758;
                                if (var12 == null || var12.field3836 <= var8) {
                                    var11.field5756 = true;
                                    int var13 = var11.method1495();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3836 += var13;
                                    }
                                    if (var4 >= this.field3691) {
                                        break label107;
                                    }
                                    class463 var14 = var11.method1496();
                                    if (var14 != null) {
                                        int var15 = var11.field5757;
                                        while (var14 != null) {
                                            this.method1768(false, var15 * var14.method2534() >> 8, var14);
                                            var14 = var11.method1487();
                                        }
                                    }
                                    class463 var16 = var11.field5755;
                                    var11.field5755 = null;
                                    if (var10 == null) {
                                        this.field3715[var7] = var16;
                                    } else {
                                        var10.field5755 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3713[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5755;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class463 var18 = this.field3715[var17];
                this.field3715[var17] = this.field3713[var17] = null;
                while (var18 != null) {
                    class463 var19 = var18.field5755;
                    var18.field5755 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3714 < 0) {
            this.field3714 = 0;
        }
        if (this.field3689 != null) {
            this.field3689.method1493(arg0, 0, arg1);
        }
        this.field3698 = class321.method1854(-27);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([IILac;I)V")
    public static final void method1765(int[] arg0, int arg1, class506 arg2, int arg3) {
        field3704++;
        if (arg2.field448 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field448.length; var5++) {
                if (arg2.field448[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field447 != -1) {
                class207 var6 = class11.field110.method1141(arg2.field447, (byte) 113);
                int var7 = var6.field2451;
                if (var7 == 1) {
                    arg2.field407 = 0;
                    arg2.field489 = 0;
                    arg2.field472 = arg3;
                    arg2.field466 = 1;
                    arg2.field478 = 0;
                    class526.method2841(-305539927, arg2.field8010, var6, false, arg2.field8018, arg2.field478, arg2.field8011);
                }
                if (var7 == 2) {
                    arg2.field489 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg2.field448 == null || arg2.field448[var9] == -1 || class11.field110.method1141(arg0[var9], (byte) 119).field2425 >= class11.field110.method1141(arg2.field448[var9], (byte) -41).field2425) {
                arg2.field506 = arg2.field503;
                arg2.field448 = arg0;
                arg2.field472 = arg3;
            }
        }
        if (arg1 >= -47) {
            method1757(null, (byte) -53);
        }
        if (var8) {
            arg2.field448 = arg0;
            arg2.field472 = arg3;
            arg2.field506 = arg2.field503;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()V")
    public void method1766() throws Exception {
        field3686++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method1767(boolean arg0, String arg1) {
        field3688++;
        int var2 = 0;
        if (arg0) {
            field3702 = -68;
        }
        while (var2 < class639.field8658.length) {
            if (class639.field8658[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZILmi;)V")
    private final void method1768(boolean arg0, int arg1, class463 arg2) {
        field3703++;
        int var4 = arg1 >> 5;
        if (arg0) {
            method1761((byte) 79);
        }
        class463 var5 = this.field3713[var4];
        if (var5 == null) {
            this.field3715[var4] = arg2;
        } else {
            var5.field5755 = arg2;
        }
        this.field3713[var4] = arg2;
        arg2.field5757 = arg1;
    }
}
