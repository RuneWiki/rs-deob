import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class196 extends class23 {

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    private int field3657 = 4096;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    private int field3661 = 0;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Ldc;")
    private static class37 field3656 = class185.method1233((byte) 86, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "Ldc;")
    public static class37 field3668 = class185.method1233((byte) 86, "<col=ff9040>");

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "[I")
    public static int[] field3670 = new int[256];

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Ldc;")
    private static class37 field3672 = class185.method1233((byte) 86, "flash1:");

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Ldc;")
    public static class37 field3666 = field3672;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Z")
    public static boolean field3663 = true;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Ldc;")
    public static class37 field3664 = class185.method1233((byte) 86, "underlay)3dat");

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Ldc;")
    public static class37 field3674 = field3656;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Ldc;")
    public static class37 field3669 = field3672;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[S")
    public static short[] field3667;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lwa;Lwa;Ljava/awt/Component;I)V")
    public static final void method1304(class238 arg0, class238 arg1, Component arg2, int arg3) {
        ++field3660;
        if (!class73.field1290) {
            class48.method417();
            byte[] var4 = arg0.method1547(0, 0, class75.field1335);
            class140.field2718 = new class182(var4, arg2);
            class49.field984 = class140.field2718.method1206();
            class149.field2830 = class201.method1330(arg1, class83.field1481, true);
            class32.field648 = class201.method1330(arg1, class6.field70, true);
            class99.field1723 = class201.method1330(arg1, class64.field1163, true);
            class163.field3093 = class155.method1053(arg1, false, class112.field1991);
            class144.field2758 = class241.method1575(arg1, (byte) -102, class140.field2714);
            class233.field4258 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                class233.field4258[var5] = var5 * 262144;
            }
            for (int var6 = 0; ~var6 > -65; ++var6) {
                class233.field4258[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                class233.field4258[var7 - -128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                class233.field4258[var8 + 192] = 16777215;
            }
            class94.field1656 = new int[256];
            for (int var9 = 0; ~var9 > -65; ++var9) {
                class94.field1656[var9] = var9 * 1024;
            }
            for (int var10 = 0; ~var10 > -65; ++var10) {
                class94.field1656[var10 + 64] = 65280 - -(var10 * 4);
            }
            for (int var11 = 0; ~var11 > -65; ++var11) {
                class94.field1656[var11 + 128] = 65535 - -(var11 * 262144);
            }
            if (arg3 > -122) {
                field3666 = null;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                class94.field1656[var12 - -192] = 16777215;
            }
            class82.field1461 = new int[256];
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class82.field1461[var13] = var13 * 4;
            }
            for (int var14 = 0; ~var14 > -65; ++var14) {
                class82.field1461[var14 + 64] = 255 - -(var14 * 262144);
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                class82.field1461[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; ~var16 > -65; ++var16) {
                class82.field1461[var16 + 192] = 16777215;
            }
            class209.field3910 = new int[32768];
            class15.field233 = new int[256];
            class65.field1173 = new int[32768];
            class245.method1594((class148) null, (byte) 80);
            class103.field1789 = new int[32768];
            class242.field4442 = 0;
            class181.field3371 = false;
            class19.field325 = class19.field323;
            class63.field1157 = new int[32768];
            class19.field326 = class19.field323;
            if (class52.field1050 == 0) {
                class167.field3190 = true;
            } else {
                class167.field3190 = false;
            }
            if (!class167.field3190) {
                class103.method668(class10.field131, 13910, 0, false, 2, class68.field1236, 255);
            } else {
                class91.method602(-257, 2);
            }
            class19.method129(0, false);
            class73.field1290 = true;
            class237.method1533(-107);
            class109.field1889 = new class182(128, 254);
            class106.field1844 = new class182(128, 254);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class196() {
        super(1, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3657 = arg0.method230((byte) -103);
            }
        } else {
            this.field3661 = arg0.method230((byte) -112);
        }
        if (arg2 == 1000) {
            ++field3659;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1305(Component arg0, byte arg1) {
        arg0.removeKeyListener(class94.field1647);
        ++field3665;
        if (arg1 != 34) {
            field3668 = null;
        }
        arg0.removeFocusListener(class94.field1647);
        class38.field799 = -1;
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public static void method1306(int arg0) {
        if (arg0 <= -93) {
            field3666 = null;
            field3664 = null;
            field3668 = null;
            field3669 = null;
            field3667 = null;
            field3670 = null;
            field3672 = null;
            field3656 = null;
            field3674 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field3671;
        if (arg0 != 0) {
            this.method40((class28) null, -44, 96);
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -103);
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            for (int var5 = 0; var5 < class199.field3705; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field3661 >= ~var6 && ~this.field3657 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ldc;Z)V")
    public static final void method1307(class37 arg0, boolean arg1) {
        ++field3662;
        if (class147.field2794 != null) {
            long var2 = arg0.method347(58);
            int var4 = 0;
            if (~var2 != -1L) {
                while (var4 < class147.field2794.length && class147.field2794[var4].field1066 != var2) {
                    ++var4;
                }
                if (~class147.field2794.length < ~var4 && class147.field2794[var4] != null) {
                    class49.field970.method1503(87, 2976);
                    ++class118.field2109;
                    if (!arg1) {
                        class49.field970.method190(class147.field2794[var4].field1066, (byte) -115);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)I")
    public static final int method1308(int arg0, int arg1, int arg2, int arg3) {
        ++field3658;
        if (arg0 < 47) {
            return 107;
        } else if (~arg2 > ~arg1) {
            return arg1;
        } else {
            return ~arg2 >= ~arg3 ? arg2 : arg3;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
    public static final void method1309(int arg0, int arg1) {
        if (~arg1 != -38) {
            if (~arg1 == -51) {
                class31.field632 = 4.0D;
            } else if (~arg1 != -76) {
                class31.field632 = 8.0D;
            } else {
                class31.field632 = 6.0D;
            }
        } else {
            class31.field632 = 3.0D;
        }
        ++field3673;
        class168.field3206 = -1;
        if (arg0 != -7606) {
            field3667 = null;
        }
        class168.field3206 = -1;
    }
}
