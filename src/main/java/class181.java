import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class181 extends class59 {

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field2851 = 20;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2844 = "Opened title screen";

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field2855 = -1;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "Lgh;")
    public static class217 field2854 = new class217(0, 0);

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "Lol;")
    public static class220 field2857 = new class220();

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "Ltf;")
    public static class244 field2846;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "Ljava/lang/String;")
    public String field2850;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field2857 = null;
        field2844 = null;
        field2846 = null;
        if (arg0 != -1291486552) {
            method1287((byte) -91, 82);
        }
        field2854 = null;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)I")
    public final int method1282(int arg0) {
        ++field2852;
        if (arg0 != 377131010) {
            method1284(-78);
        }
        return (int) super.field4018;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    public final void method1283(int arg0) {
        super.field874 = Long.MIN_VALUE & super.field874 | class98.method665(true) + 500L;
        ++field2856;
        class196.field3101.method1149(arg0 ^ 4144, this);
        if (arg0 != 192) {
            field2858 = 33;
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        class31.field380 = 0;
        class121.field1741 = 0;
        class3.field43 = arg0;
        ++field2848;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
    public final void method1285(byte arg0) {
        if (arg0 == 64) {
            super.field874 |= Long.MIN_VALUE;
            ++field2839;
            if (this.method1288(-11701) == 0L) {
                class220.field3455.method1149(4336, this);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)I")
    public static final int method1286(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -19695) {
            return 57;
        } else {
            if (~arg0 < -244) {
                arg3 >>= 4;
            } else if (arg0 > 217) {
                arg3 >>= 3;
            } else if (arg0 <= 192) {
                if (arg0 > 179) {
                    arg3 >>= 1;
                }
            } else {
                arg3 >>= 2;
            }
            ++field2842;
            return (arg1 >> 2 << 10) + (arg3 >> 5 << 7) + (arg0 >> 1);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V")
    public static final void method1287(byte arg0, int arg1) {
        ++field2840;
        if (arg0 > 52) {
            if (class190.method1322(arg1, (byte) 97)) {
                class231[] var2 = class68.field1018[arg1];
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class231 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field3659 = 0;
                        var4.field3669 = 0;
                        var4.field3647 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)J")
    public final long method1288(int arg0) {
        if (arg0 != -11701) {
            method1289((byte) -36);
        }
        ++field2838;
        return super.field874 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        ++field2841;
        if (class1.field27 != null) {
            class1.field27.method1528(-97);
        }
        if (class195.field3078 != null) {
            class195.field3078.method1528(-105);
        }
        if (arg0 != -105) {
            field2854 = null;
        }
        class172.method1228(22050, 2, (byte) -95, class23.field295);
        class1.field27 = class225.method1592(0, 22050, 16384, class95.field1425, class304.field4831);
        class1.field27.method1529((byte) 122, class295.field4718);
        class195.field3078 = class225.method1592(1, 2048, 16384, class95.field1425, class304.field4831);
        class195.field3078.method1529((byte) 122, class81.field1231);
    }

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "(I)I")
    public static final int method1290(int arg0) {
        if (arg0 != 62288211) {
            method1289((byte) 121);
        }
        ++field2837;
        return ((~class235.field3792 == -1 ? 0 : 1) << 22) + ((~class136.field1960 == -1 ? 0 : 1) << 21) + ((class96.field1437 == 0 ? 0 : 1) << 20) + (class306.field4876 << 17) + ((!class89.field1333 ? 0 : 1) << 10) + ((!class118.field1707 ? 0 : 1) << 8) + (((!class17.field234 ? 0 : 1) << 6) + ((!class44.field528 ? 0 : 1) << 4) + ((7 & class229.field3547) - -((!class3.field46 ? 0 : 1) << 3)) - -((class73.field1106 ? 1 : 0) << 5)) + (((!class162.field2440 ? 0 : 1) << 7) + ((class234.field3773 ? 1 : 0) << 9) - -(6144 & class22.field286 << 11) + ((class250.field4053 ? 1 : 0) << 13) - -((!class274.field4452 ? 0 : 1) << 15)) + (((!class64.field925 ? 0 : 1) << 16) - (-((class23.field295 ? 1 : 0) << 19) - (class65.method429() << 23)));
    }

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "(I)I")
    public final int method1291(int arg0) {
        ++field2849;
        if (arg0 != 172107424) {
            field2859 = 7;
        }
        return (int) (255L & super.field4018 >>> 32);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(II)V")
    public class181(int arg0, int arg1) {
        super.field4018 = (long) arg1 | (long) arg0 << 32;
    }
}
