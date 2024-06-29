import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class65 extends class212 {

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    private int field1056 = 1;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    private int field1058 = 0;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "I")
    private int field1063 = 0;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lak;")
    public static class152 field1059 = new class152(64);

    @OriginalMember(owner = "client!dk", name = "gb", descriptor = "Lsc;")
    public static class181 field1067 = class149.method967(255, "lila:");

    @OriginalMember(owner = "client!dk", name = "ib", descriptor = "I")
    public static int field1069 = 0;

    @OriginalMember(owner = "client!dk", name = "hb", descriptor = "Lsc;")
    private static class181 field1068 = class149.method967(255, "Ok");

    @OriginalMember(owner = "client!dk", name = "fb", descriptor = "Lsc;")
    public static class181 field1066 = field1068;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!dk", name = "eb", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        ++field1064;
        if (!arg0) {
            this.method26((class230) null, 112, 126);
        }
        class85.method575(120);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public static final void method464(int arg0) {
        ++field1057;
        class174.field2918.method1798(-33);
        if (arg0 != 0) {
            method465(-110);
        }
        class20.field362.method1798(arg0 ^ -18);
        class96.field1540.method1798(arg0 ^ -49);
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
    public static final void method465(int arg0) {
        ++field1062;
        if (arg0 != 9949) {
            field1067 = null;
        }
        for (int var1 = 0; ~var1 > ~class137.field2236; ++var1) {
            int var2 = class30.field498[var1];
            class178 var3 = class129.field2140[var2];
            int var4 = class76.field1223.method1516((byte) 82);
            if ((var4 & 64) != 0) {
                var3.field2682 = class76.field1223.method1535(2);
                int var5 = class76.field1223.method1552((byte) 86);
                var3.field2662 = (65535 & var5) + class237.field4125;
                var3.field2673 = 0;
                var3.field2687 = 0;
                if (var3.field2682 == 65535) {
                    var3.field2682 = -1;
                }
                if (~class237.field4125 > ~var3.field2662) {
                    var3.field2673 = -1;
                }
                var3.field2679 = var5 >> 16;
            }
            if (~(var4 & 32) != -1) {
                var3.field2668 = class76.field1223.method1549(32);
                var3.field2620 = 100;
            }
            if ((var4 & 2) != 0) {
                int var6 = class76.field1223.method1539(-24286);
                int var7 = class76.field1223.method1516((byte) 82);
                var3.method1052(124, var7, var6, class237.field4125);
            }
            if (~(4 & var4) != -1) {
                int var8 = class76.field1223.method1516((byte) 82);
                int var9 = class76.field1223.method1539(-24286);
                var3.method1052(arg0 ^ 9890, var9, var8, class237.field4125);
                var3.field2640 = class237.field4125 + 300;
                var3.field2688 = class76.field1223.method1513(-12137);
            }
            if ((var4 & 16) != 0) {
                int var10 = class76.field1223.method1548(-100001);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class76.field1223.method1513(-12137);
                class160.method1074(var3, (byte) -73, var11, var10);
            }
            if (~(var4 & 8) != -1) {
                var3.field2658 = class76.field1223.method1535(2);
                if (var3.field2658 == 65535) {
                    var3.field2658 = -1;
                }
            }
            if ((1 & var4) != 0) {
                var3.field2641 = class76.field1223.method1548(-100001);
                var3.field2659 = class76.field1223.method1558((byte) -123);
            }
            if ((128 & var4) != 0) {
                if (var3.field3117.method456(false)) {
                    class181.method1231(var3, 122);
                }
                var3.field3117 = class9.method75(-1, class76.field1223.method1558((byte) -77));
                var3.field2619 = var3.field3117.field995;
                var3.field2655 = var3.field3117.field1015;
                var3.field2663 = var3.field3117.field990;
                var3.field2689 = var3.field3117.field1054;
                var3.field2653 = var3.field3117.field1040;
                var3.field2628 = var3.field3117.field1028;
                var3.field2669 = var3.field3117.field1005;
                var3.field2635 = var3.field3117.field1043;
                var3.field2671 = var3.field3117.field1021;
                if (var3.field3117.method456(false)) {
                    class76.method531(9522, (class116) null, var3, (class148) null, 0, var3.field2672[0], class38.field581, var3.field2623[0]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class65() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field1060;
        if (arg1 <= 25) {
            field1069 = -104;
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = class176.field3090[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class26.field452; ++var6) {
                int var7 = class253.field4416[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field1058 == -1) {
                    var9 = (-var4 + var7) * this.field1056;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field1056 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field1063 != -1) {
                    if (this.field1063 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class152.field2534[(4084 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field1055;
        if (arg2 != -3) {
            method464(-90);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field1056 = arg0.method1516((byte) 82);
                }
            } else {
                this.field1063 = arg0.method1516((byte) 82);
            }
        } else {
            this.field1058 = arg0.method1516((byte) 82);
        }
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
    public static void method466(int arg0) {
        field1059 = null;
        field1068 = null;
        if (arg0 > -122) {
            field1059 = null;
        }
        field1067 = null;
        field1066 = null;
    }
}
