import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class325 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lfa;")
    private class156 field4559 = new class156(64);

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Lfa;")
    public class156 field4575 = new class156(64);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lfs;")
    public class387 field4565;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lfs;")
    private class387 field4561;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public static int[] field4562 = new int[2];

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Lbg;")
    public static class324 field4573 = new class324(101, -1);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
    public static int[] field4560;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 3)
    public final void method2004(int arg0) {
        class156 var2 = this.field4559;
        synchronized (this.field4559) {
            this.field4559.method1105(false);
        }
        field4574++;
        class156 var3 = this.field4575;
        synchronized (this.field4575) {
            this.field4575.method1105(false);
            if (arg0 != 34) {
                this.field4565 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lco;", line = 19)
    public final class77 method2005(int arg0, int arg1) {
        field4563++;
        class156 var3 = this.field4559;
        class77 var4;
        synchronized (this.field4559) {
            var4 = (class77) this.field4559.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 1409) {
            field4573 = null;
        }
        byte[] var5 = this.field4561.method2363(arg1, 34, 113);
        class77 var6 = new class77();
        var6.field1051 = this;
        if (var5 != null) {
            var6.method714(new class65(var5), -8616);
        }
        class156 var7 = this.field4559;
        synchronized (this.field4559) {
            this.field4559.method1107(1, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IJII)V", line = 55)
    public static final void method2006(int arg0, long arg1, int arg2, int arg3) {
        field4566++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = ((int) arg1 & 0x34EE89) >> 20;
        if (arg0 != 22) {
            return;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class139.method1044(var6, arg3, arg2, 0, true, 0, 0, var5, arg0 + 79);
            return;
        }
        class222 var8 = class384.field5645.method786(var7, arg0 - 22);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field3180;
            var9 = var8.field3206;
        } else {
            var9 = var8.field3180;
            var10 = var8.field3206;
        }
        int var11 = var8.field3239;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class139.method1044(0, arg3, arg2, var10, true, var9, var11, 0, 108);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 98)
    public static void method2007(boolean arg0) {
        field4562 = null;
        field4573 = null;
        if (arg0) {
            method2006(-87, -67L, 95, -31);
        }
        field4560 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V", line = 112)
    public final void method2008(int arg0, int arg1, int arg2) {
        if (arg2 == 383137607) {
            this.field4559 = new class156(arg1);
            field4570++;
            this.field4575 = new class156(arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lya;BLfs;)V", line = 127)
    public static final void method2009(class38 arg0, byte arg1, class387 arg2) {
        field4564++;
        if (class397.field5823) {
            return;
        }
        arg0.method381(0);
        class155.field2206 = arg0.method389(class218.method1498(arg2, class222.field3259), true);
        class155.field2206.method111((class94.field1278 - class155.field2206.method125()) / 2, (class410.field6100 - class155.field2206.method117()) / 2);
        if (arg1 <= 97) {
            field4562 = null;
        }
        class439.field6528 = arg0.method389(class218.method1498(arg2, class443.field6571), true);
        class439.field6528.method111((class94.field1278 - class439.field6528.method125()) / 2, 18);
        class397.field5823 = true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 147)
    public static final void method2010(String arg0, int arg1, byte arg2) {
        field4572++;
        int var3 = 117 / ((68 - arg2) / 50);
        int var4 = class75.field1027;
        int[] var5 = class334.field4634;
        boolean var6 = false;
        for (int var7 = 0; var7 < var4; var7++) {
            class364 var8 = class384.field5647[var5[var7]];
            if (var8 != null && class435.field6375 != var8 && var8.field5074 != null && var8.field5074.equalsIgnoreCase(arg0)) {
                if (arg1 == 1) {
                    class128.field1856++;
                    class32.method258(-54, class462.field6801);
                    class472.field6970.method592((byte) -128, var5[var7]);
                    class472.field6970.method638(255, 0);
                } else if (arg1 == 4) {
                    class32.method258(-104, class80.field1075);
                    class280.field4101++;
                    class472.field6970.method608(0, 0);
                    class472.field6970.method583((byte) -78, var5[var7]);
                } else if (arg1 == 5) {
                    class90.field1235++;
                    class32.method258(-76, class369.field5484);
                    class472.field6970.method583((byte) -88, var5[var7]);
                    class472.field6970.method608(0, 0);
                } else if (arg1 == 6) {
                    class32.method258(-62, class225.field3297);
                    class56.field604++;
                    class472.field6970.method608(0, 0);
                    class472.field6970.method592((byte) -127, var5[var7]);
                } else if (arg1 == 7) {
                    class32.method258(-85, class264.field3901);
                    class384.field5644++;
                    class472.field6970.method582((byte) 23, 0);
                    class472.field6970.method611((byte) 67, var5[var7]);
                }
                var6 = true;
                break;
            }
        }
        if (!var6) {
            class407.method2497((byte) -99, class504.field7474.method2031(true, class377.field5585) + arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V", line = 232)
    public final void method2011(int arg0, int arg1) {
        field4571++;
        class156 var3 = this.field4559;
        synchronized (this.field4559) {
            this.field4559.method1116(arg0, -50);
            int var4 = 120 % ((arg1 + 94) / 32);
        }
        class156 var5 = this.field4575;
        synchronized (this.field4575) {
            this.field4575.method1116(arg0, -50);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)V", line = 247)
    public static final void method2012(int arg0, int arg1, int arg2, int arg3) {
        field4568++;
        if (class422.field6240 == null) {
            return;
        }
        long var4 = (long) (arg3 << 14 | arg0 << 28 | arg2);
        class518 var6 = (class518) class89.field1216.method875(var4, 127);
        if (var6 == null) {
            class373.method2301(arg0, arg2, arg3);
            return;
        }
        class203 var7 = (class203) var6.field7628.method1018(arg1 ^ 0x5C302B41);
        if (arg1 != 1546660647) {
            method2006(-12, -72L, 30, -54);
        }
        if (var7 == null) {
            class373.method2301(arg0, arg2, arg3);
            return;
        }
        class200 var8 = (class200) class373.method2301(arg0, arg2, arg3);
        if (var8 == null) {
            var8 = new class200();
        } else {
            var8.field2931 = var8.field2918 = -1;
        }
        var8.field2928 = var7.field2939;
        var8.field2929 = var7.field2940;
        label48: while (true) {
            class203 var9 = (class203) var6.field7628.method1022((byte) -112);
            if (var9 == null) {
                break;
            }
            if (var8.field2928 != var9.field2939) {
                var8.field2931 = var9.field2939;
                var8.field2925 = var9.field2940;
                while (true) {
                    class203 var10 = (class203) var6.field7628.method1022((byte) -112);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field2928 != var10.field2939 && var8.field2931 != var10.field2939) {
                        var8.field2918 = var10.field2939;
                        var8.field2921 = var10.field2940;
                    }
                }
            }
        }
        int var11 = class66.method643((arg2 << 7) + 64, 97, arg0, (arg3 << 7) + 64);
        class491.method2947(arg0, arg2, arg3, var11, var8);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 325)
    public final void method2013(byte arg0) {
        if (arg0 > -85) {
            return;
        }
        class156 var2 = this.field4559;
        synchronized (this.field4559) {
            this.field4559.method1119(119);
        }
        field4567++;
        class156 var3 = this.field4575;
        synchronized (this.field4575) {
            this.field4575.method1119(107);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljk;ILfs;Lfs;)V", line = 361)
    public class325(class446 arg0, int arg1, class387 arg2, class387 arg3) {
        this.field4565 = arg3;
        this.field4561 = arg2;
        this.field4561.method2367(34, 28724);
    }
}
