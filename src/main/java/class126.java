import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class126 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lob;")
    public static class141 field2419 = class175.method1195(40, "<col=ff7000>");

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lob;")
    public static class141 field2418 = class175.method1195(40, ": ");

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lob;")
    private static class141 field2423 = class175.method1195(40, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2425 = 5063219;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Lob;")
    public static class141 field2429 = field2423;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lob;")
    private static class141 field2428 = class175.method1195(40, "Type");

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lob;")
    public static class141 field2420 = field2428;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Ln;")
    public static class129 field2417 = new class129();

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lob;")
    public static class141 field2430 = class175.method1195(40, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lsh;")
    public static class187 field2424;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method807(int arg0, Component arg1) {
        if (arg0 != 0) {
            field2424 = null;
        }
        field2426++;
        Method var2 = class189.field3662;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class150.field2889);
        arg1.addFocusListener(class150.field2889);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILdg;IZ)V")
    public static final void method808(int arg0, class38 arg1, int arg2, boolean arg3) {
        field2427++;
        if ((arg0 & 0x8) != 0) {
            int var4 = class156.field3014.method1015((byte) 110);
            int var5 = class156.field3014.method991(255);
            int var6 = class156.field3014.method991(255);
            int var7 = class156.field3014.field2865;
            if (arg1.field773 != null && arg1.field765 != null) {
                long var8 = arg1.field773.method926(19790);
                boolean var10 = false;
                if (var5 <= 1) {
                    for (int var11 = 0; var11 < class96.field1912; var11++) {
                        if (class154.field2999[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                }
                if (!var10 && class19.field329 == 0) {
                    class43.field830.field2865 = 0;
                    class156.field3014.method1001(var6, 0, 115, class43.field830.field2859);
                    class43.field830.field2865 = 0;
                    class141 var12 = class137.method858(class179.method1216(class43.field830, true).method935((byte) -43));
                    arg1.field3866 = var12.method924(38);
                    arg1.field3886 = 150;
                    arg1.field3853 = var4 & 0xFF;
                    arg1.field3891 = var4 >> 8;
                    if (var5 == 2 || var5 == 3) {
                        class131.method836(1, (byte) -119, class220.method1422(new class141[] { class82.field1635, arg1.field773 }, -3), var12);
                    } else if (var5 == 1) {
                        class131.method836(1, (byte) -115, class220.method1422(new class141[] { class209.field3958, arg1.field773 }, -3), var12);
                    } else {
                        class131.method836(2, (byte) -95, arg1.field773, var12);
                    }
                }
            }
            class156.field3014.field2865 = var7 + var6;
        }
        if ((arg0 & 0x2) != 0) {
            int var13 = class156.field3014.method982((byte) -45);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class156.field3014.method967((byte) -127);
            class86.method589(var13, 0, var14, arg1);
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field3827 = class156.field3014.method965((byte) -116);
            int var15 = class156.field3014.method985((byte) -70);
            arg1.field3829 = var15 >> 16;
            arg1.field3894 = (var15 & 0xFFFF) + class20.field344;
            arg1.field3883 = 0;
            arg1.field3838 = 0;
            if (class20.field344 < arg1.field3894) {
                arg1.field3883 = -1;
            }
            if (arg1.field3827 == 65535) {
                arg1.field3827 = -1;
            }
        }
        if ((arg0 & 0x80) != 0) {
            arg1.field3866 = class156.field3014.method1013(-19405);
            if (arg1.field3866.method900(125, 0) == 126) {
                arg1.field3866 = arg1.field3866.method907((byte) 122, 1);
                class131.method836(2, (byte) -96, arg1.field773, arg1.field3866);
            } else if (class114.field2176 == arg1) {
                class131.method836(2, (byte) -96, arg1.field773, arg1.field3866);
            }
            arg1.field3891 = 0;
            arg1.field3886 = 150;
            arg1.field3853 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            arg1.field3877 = class156.field3014.method982((byte) 88);
            if (arg1.field3877 == 65535) {
                arg1.field3877 = -1;
            }
        }
        if ((arg0 & 0x200) != 0) {
            int var16 = class156.field3014.method991(255);
            int var17 = class156.field3014.method991(255);
            arg1.method1347(var16, class20.field344, var17, !arg3);
        }
        if ((arg0 & 0x20) != 0) {
            int var18 = class156.field3014.method991(255);
            byte[] var19 = new byte[var18];
            class146 var20 = new class146(var19);
            class156.field3014.method968(0, var19, var18, false);
            class14.field262[arg2] = var20;
            arg1.method254(-25014, var20);
        }
        if ((arg0 & 0x10) != 0) {
            int var21 = class156.field3014.method1002(-8544);
            int var22 = class156.field3014.method991(255);
            arg1.method1347(var21, class20.field344, var22, !arg3);
            arg1.field3880 = class20.field344 + 300;
            arg1.field3863 = class156.field3014.method967((byte) -127);
        }
        if ((arg0 & 0x100) != 0) {
            arg1.field3884 = class156.field3014.method974(-711444088);
            arg1.field3835 = class156.field3014.method1002(-8544);
            arg1.field3852 = class156.field3014.method967((byte) -127);
            arg1.field3872 = class156.field3014.method974(-711444088);
            arg1.field3843 = class156.field3014.method982((byte) 73) + class20.field344;
            arg1.field3881 = class156.field3014.method1007(97) + class20.field344;
            arg1.field3847 = class156.field3014.method991(255);
            arg1.field3893 = 0;
            arg1.field3832 = 1;
        }
        if ((arg0 & 0x4) != 0) {
            arg1.field3879 = class156.field3014.method1015((byte) 110);
            arg1.field3850 = class156.field3014.method1007(70);
        }
        if (!arg3) {
            method810(-50);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lpe;BLpe;Lpe;)V")
    public static final void method809(class154 arg0, byte arg1, class154 arg2, class154 arg3) {
        field2421++;
        class175.field3473 = arg3.method1071((byte) -115, class60.field1170);
        class187.field3629 = arg0.method1071((byte) -122, class16.field284);
        if (arg1 < 5) {
            return;
        }
        class54.field1048 = arg0.method1071((byte) -127, class90.field1803);
        class43.field841 = arg0.method1071((byte) -120, class30.field577);
        class169.field3261 = arg0.method1071((byte) -117, class173.field3445);
        class206.field3918 = arg0.method1071((byte) -117, class123.field2376);
        class54.field1039 = arg0.method1071((byte) -125, class175.field3468);
        class142.field2754 = arg0.method1071((byte) -117, class116.field2243);
        class218.field4138 = arg0.method1071((byte) -128, class6.field87);
        class128.field2444 = arg0.method1071((byte) -124, class95.field1893);
        class128.field2443 = arg0.method1071((byte) -121, class225.field4242);
        class54.field1076 = arg2.method1071((byte) -115, class170.field3287);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method810(int arg0) {
        field2428 = null;
        field2430 = null;
        if (arg0 != 64) {
            field2429 = null;
        }
        field2418 = null;
        field2420 = null;
        field2419 = null;
        field2417 = null;
        field2423 = null;
        field2424 = null;
        field2429 = null;
    }
}
