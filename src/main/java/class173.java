import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class173 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Z")
    public boolean field2663 = true;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
    public boolean field2678 = true;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field2667 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public int field2685 = -1;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    private int field2677 = -1;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    private int field2693 = -1;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field2684 = -1;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public int field2697 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    private int field2700 = -1;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public int field2679 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "Z")
    public boolean field2699 = true;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public int field2675 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public int field2689 = -1;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    private int field2691 = -1;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    private int field2682 = -1;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public int field2701 = 0;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Z")
    public boolean field2692 = false;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public int field2671 = -1;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "[Ljava/lang/String;")
    public String[] field2704 = new String[5];

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[I")
    public static int[] field2672 = new int[1];

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[S")
    public static short[] field2676 = new short[256];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lvq;")
    public class307 field2690;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Lke;")
    private class407 field2698;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "Llt;")
    public static class458 field2694;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Ljava/lang/String;")
    public String field2662;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "Ljava/lang/String;")
    public String field2702;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
    public int[] field2670;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2694 = null;
        field2672 = null;
        field2676 = null;
        if (arg0 != 30105) {
            field2694 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1080(int arg0, int arg1, String arg2) {
        field2665++;
        if (arg1 < 112) {
            this.field2663 = false;
        }
        if (this.field2698 == null) {
            return arg2;
        } else {
            class65 var4 = (class65) this.field2698.method2409(false, (long) arg0);
            return var4 == null ? arg2 : var4.field1073;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lha;II)V")
    private final void method1081(class40 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2689 = arg0.method254((byte) -109);
        } else if (arg1 == 2) {
            this.field2671 = arg0.method254((byte) -120);
        } else if (arg1 == 3) {
            this.field2702 = arg0.method239(true);
        } else if (arg1 == 4) {
            this.field2673 = arg0.method224(arg2 - 19911);
        } else if (arg1 == 5) {
            this.field2685 = arg0.method224(-2);
        } else if (arg1 == 6) {
            this.field2701 = arg0.method257((byte) 46);
        } else if (arg1 == 7) {
            int var12 = arg0.method257((byte) 41);
            if ((var12 & 0x1) == 0) {
                this.field2663 = false;
            }
            if ((var12 & 0x2) == 2) {
                this.field2692 = true;
            }
        } else if (arg1 == 8) {
            this.field2699 = arg0.method257((byte) 127) == 1;
        } else if (arg1 == 9) {
            this.field2691 = arg0.method254((byte) -42);
            if (this.field2691 == 65535) {
                this.field2691 = -1;
            }
            this.field2700 = arg0.method254((byte) -100);
            if (this.field2700 == 65535) {
                this.field2700 = -1;
            }
            this.field2688 = arg0.method255((byte) 96);
            this.field2669 = arg0.method255((byte) 96);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field2704[arg1 - 10] = arg0.method239(true);
        } else if (arg1 == 15) {
            int var10 = arg0.method257((byte) 125);
            this.field2670 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field2670[var11] = arg0.method249(false);
            }
            this.field2668 = arg0.method255((byte) 96);
            this.field2680 = arg0.method255((byte) 96);
        } else if (arg1 == 16) {
            this.field2678 = false;
        } else if (arg1 == 17) {
            this.field2662 = arg0.method239(true);
        } else if (arg1 == 18) {
            this.field2677 = arg0.method254((byte) -51);
        } else if (arg1 == 19) {
            this.field2684 = arg0.method254((byte) -107);
        } else if (arg1 == 20) {
            this.field2693 = arg0.method254((byte) -61);
            if (this.field2693 == 65535) {
                this.field2693 = -1;
            }
            this.field2682 = arg0.method254((byte) -68);
            if (this.field2682 == 65535) {
                this.field2682 = -1;
            }
            this.field2705 = arg0.method255((byte) 96);
            this.field2696 = arg0.method255((byte) 96);
        } else if (arg1 == 21) {
            this.field2695 = arg0.method255((byte) 96);
        } else if (arg1 == 22) {
            this.field2687 = arg0.method255((byte) 96);
        } else if (arg1 == 249) {
            int var4 = arg0.method257((byte) 84);
            if (this.field2698 == null) {
                int var5 = class99.method749(var4, arg2 ^ 0xFFFFEF03);
                this.field2698 = new class407(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method257((byte) 70) == 1;
                int var8 = arg0.method224(arg2 - 19911);
                class179 var9;
                if (var7) {
                    var9 = new class65(arg0.method239(true));
                } else {
                    var9 = new class361(arg0.method255((byte) 96));
                }
                this.field2698.method2413((long) var8, -1, var9);
            }
        }
        if (arg2 != 19909) {
            this.method1085(null, -52);
        }
        field2664++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ldr;I)Z")
    public final boolean method1082(class485 arg0, int arg1) {
        field2661++;
        int var3;
        if (this.field2700 == -1) {
            if (this.field2691 == -1) {
                return true;
            }
            var3 = arg0.method1618(-73, this.field2691);
        } else {
            var3 = arg0.method1623((byte) -126, this.field2700);
        }
        if (this.field2688 > var3 || this.field2669 < var3) {
            return false;
        } else if (arg1 == 18358) {
            boolean var4 = false;
            int var5;
            if (this.field2682 == -1) {
                if (this.field2693 == -1) {
                    return true;
                }
                var5 = arg0.method1618(arg1 ^ 0x47C4, this.field2693);
            } else {
                var5 = arg0.method1623((byte) -124, this.field2682);
            }
            return var5 >= this.field2705 && var5 <= this.field2696;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqq;ZI)Lig;")
    public final class154 method1083(class318 arg0, boolean arg1, int arg2) {
        field2666++;
        int var4 = arg1 ? this.field2671 : this.field2689;
        int var5 = var4 | arg0.field4787 << 29;
        class154 var6 = (class154) this.field2690.field4658.method1752(0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field2690.field4653.method2729(var4, -9055)) {
            if (arg2 != 1477) {
                this.method1083(null, true, 35);
            }
            class351 var7 = class351.method2132(this.field2690.field4653, var4, 0);
            if (var7 != null) {
                var6 = arg0.method1952(var7, true);
                this.field2690.field4658.method1758(arg2 - 1476, var6, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
    public static final int method1084(int arg0, int arg1) {
        return class226.field3467 == null ? 0 : (class226.field3467[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lha;I)V")
    public final void method1085(class40 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 118);
            if (var3 == 0) {
                if (arg1 != Integer.MIN_VALUE) {
                    return;
                }
                field2681++;
                return;
            }
            this.method1081(arg0, var3, 19909);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILqq;)Lig;")
    public final class154 method1086(int arg0, class318 arg1) {
        field2674++;
        if (arg0 < 124) {
            this.method1081(null, -9, 105);
        }
        class154 var3 = (class154) this.field2690.field4658.method1752(0, (long) (arg1.field4787 << 29 | 0x20000 | this.field2677));
        if (var3 != null) {
            return var3;
        }
        this.field2690.field4653.method2729(this.field2677, -9055);
        class351 var4 = class351.method2132(this.field2690.field4653, this.field2677, 0);
        if (var4 != null) {
            var3 = arg1.method1952(var4, true);
            this.field2690.field4658.method1758(1, var3, (long) (this.field2677 | 0x20000 | arg1.field4787 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZ)I")
    public final int method1087(int arg0, int arg1, boolean arg2) {
        field2686++;
        if (this.field2698 == null) {
            return arg1;
        }
        class361 var4 = (class361) this.field2698.method2409(false, (long) arg0);
        if (!arg2) {
            this.method1087(95, 99, true);
        }
        return var4 == null ? arg1 : var4.field5334;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method1088(int arg0) {
        field2683++;
        if (arg0 != 1) {
            this.field2679 = 126;
        }
        if (this.field2670 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2670.length; var2 += 2) {
            if (this.field2670[var2] < this.field2667) {
                this.field2667 = this.field2670[var2];
            } else if (this.field2675 < this.field2670[var2]) {
                this.field2675 = this.field2670[var2];
            }
            if (this.field2679 > this.field2670[var2 + 1]) {
                this.field2679 = this.field2670[var2 + 1];
            } else if (this.field2697 < this.field2670[var2 + 1]) {
                this.field2697 = this.field2670[var2 + 1];
            }
        }
    }
}
