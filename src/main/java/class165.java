import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class165 extends class242 {

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field2840 = 0;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Ljf;")
    private static class229 field2822 = class212.method1457((byte) 100, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljf;")
    public static class229 field2832 = class212.method1457((byte) 108, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Lrm;")
    public static class248 field2831 = null;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Ljf;")
    public static class229 field2837 = class212.method1457((byte) 66, "::wm1");

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Ljf;")
    public static class229 field2821 = field2822;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lkj;")
    public class178 field2820;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lkj;")
    public class178 field2834;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lbf;")
    public class331 field2830;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lih;")
    public class33 field2846;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lij;")
    public class83 field2833;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Z")
    public boolean field2843;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    public int[] field2825;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1129(int arg0) {
        if (arg0 != 4350) {
            field2837 = (class229) null;
        }
        field2836++;
        class183.field3159.method226((byte) -115);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljf;I)Z", line = 22)
    public static final boolean method1130(class229 arg0, int arg1) {
        if (arg1 != -1) {
            field2821 = (class229) null;
        }
        field2839++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class162.field2753; var2++) {
            if (arg0.method1653(class52.field906[var2], false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)V", line = 61)
    public static void method1131(boolean arg0) {
        if (arg0) {
            field2835 = -93;
        }
        field2837 = null;
        field2832 = null;
        field2822 = null;
        field2821 = null;
        field2831 = null;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)I", line = 112)
    public static final int method1132(byte arg0) {
        field2844++;
        if (class155.field2641 != null) {
            return 3;
        } else if (class108.field1900 && class281.field4807) {
            return 2;
        } else if (class108.field1900 && !class281.field4807) {
            return 1;
        } else if (arg0 == 97) {
            return 0;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 132)
    public final void method1133(int arg0) {
        if (arg0 != 0) {
            this.field2820 = (class178) null;
        }
        int var2 = this.field2845;
        field2828++;
        if (this.field2833 != null) {
            class83 var3 = this.field2833.method598((byte) 15);
            if (var3 == null) {
                this.field2845 = -1;
                this.field2825 = null;
                this.field2848 = 0;
                this.field2842 = 0;
                this.field2826 = 0;
            } else {
                this.field2848 = var3.field1598;
                this.field2826 = var3.field1561 * 128;
                this.field2825 = var3.field1529;
                this.field2845 = var3.field1562;
                this.field2842 = var3.field1585;
            }
        } else if (this.field2830 != null) {
            int var4 = class132.method915(this.field2830, (byte) -106);
            if (var2 != var4) {
                this.field2845 = var4;
                class169 var5 = this.field2830.field5631;
                if (var5.field2950 != null) {
                    var5 = var5.method1154((byte) -107);
                }
                if (var5 == null) {
                    this.field2826 = 0;
                } else {
                    this.field2826 = var5.field2941 * 128;
                }
            }
        } else if (this.field2846 != null) {
            this.field2845 = class331.method2258(this.field2846, 0);
            this.field2826 = this.field2846.field640 * 128;
        }
        if (this.field2845 != var2 && this.field2834 != null) {
            class104.field1816.method613(this.field2834);
            this.field2834 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I", line = 215)
    public static final int method1134(int arg0) {
        field2819++;
        try {
            if (class301.field5129 == 0) {
                if (class228.field3921 > class153.method1032(118) - 5000L) {
                    return 0;
                }
                class193.field3354 = class215.field3689.method1376(class151.field2616, 0, class315.field5342);
                class193.field3338 = class153.method1032(110);
                class301.field5129 = 1;
            }
            if ((class193.field3338 + 30000L) < class153.method1032(106)) {
                return class39.method346((byte) -126, 1000);
            }
            if (class301.field5129 == 1) {
                if (class193.field3354.field4011 == 2) {
                    return class39.method346((byte) -126, 1001);
                }
                if (class193.field3354.field4011 != 1) {
                    return -1;
                }
                class160.field2720 = new class205((Socket) class193.field3354.field4009, class215.field3689);
                int var1 = 0;
                if (class183.field3165) {
                    var1 = class221.field3778;
                }
                class84.field1608.field195 = 0;
                class193.field3354 = null;
                class84.field1608.method140(167, (byte) 75);
                class84.field1608.method100(var1, arg0 + 64278);
                class160.field2720.method1428(22974, class84.field1608.field195, class84.field1608.field174, 0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                int var2 = class160.field2720.method1435(0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                if (var2 != 0) {
                    return class39.method346((byte) -126, var2);
                }
                class301.field5129 = 2;
            }
            if (arg0 != 1002) {
                method1132((byte) -12);
            }
            if (class301.field5129 == 2) {
                if (class160.field2720.method1436(-3616) < 2) {
                    return -1;
                }
                class143.field2497 = class160.field2720.method1435(arg0 - 1002);
                class143.field2497 <<= 0x8;
                class143.field2497 += class160.field2720.method1435(0);
                class107.field1882 = new byte[class143.field2497];
                class106.field1831 = 0;
                class301.field5129 = 3;
            }
            if (class301.field5129 != 3) {
                return -1;
            }
            int var3 = class160.field2720.method1436(-3616);
            if (var3 < 1) {
                return -1;
            }
            if (class143.field2497 - class106.field1831 < var3) {
                var3 = class143.field2497 - class106.field1831;
            }
            class160.field2720.method1431(var3, class107.field1882, class106.field1831, (byte) -92);
            class106.field1831 += var3;
            if (class106.field1831 < class143.field2497) {
                return -1;
            } else if (class222.method1529(-1742, class107.field1882)) {
                class41.field737 = new class222[class173.field3025];
                int var4 = 0;
                for (int var5 = class24.field452; var5 <= class312.field5242; var5++) {
                    class222 var6 = class120.method848(var5, (byte) 118);
                    if (var6 != null) {
                        class41.field737[var4++] = var6;
                    }
                }
                class160.field2720.method1433((byte) -115);
                class257.field4486 = 0;
                class107.field1882 = null;
                class160.field2720 = null;
                class301.field5129 = 0;
                class228.field3921 = class153.method1032(102);
                return 0;
            } else {
                return class39.method346((byte) -126, 1002);
            }
        } catch (IOException var8) {
            return class39.method346((byte) -126, 1003);
        }
    }
}
