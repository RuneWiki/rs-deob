import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class297 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[S")
    public static short[] field5270 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lud;")
    public static class279 field5272 = class130.method1024("Moteur son pr-Bpar-B", 255);

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lud;")
    public static class279 field5275 = class130.method1024("Clientscript error in: ", 255);

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lud;")
    public static class279 field5277 = class130.method1024("Jeter", 255);

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lud;")
    public static class279 field5279 = class130.method1024("<br>(X100(U(Y", 255);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lgf;")
    public static class8 field5269;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[[B")
    public static byte[][] field5280;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 7)
    public static void method2098(int arg0) {
        field5275 = null;
        field5277 = null;
        field5279 = null;
        field5272 = null;
        field5280 = (byte[][]) null;
        field5269 = null;
        field5270 = null;
        if (arg0 != 32052) {
            method2099(76, false, true, -52);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZZI)Lud;", line = 30)
    public static final class279 method2099(int arg0, boolean arg1, boolean arg2, int arg3) {
        field5278++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2) {
            int var4 = 1;
            for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            int var6 = var4;
            if (arg3 < 0 || arg1) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg3 < 0) {
                var7[0] = 45;
            } else if (arg1) {
                var7[0] = 43;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = arg3 % arg0;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > 9) {
                    var9 += 39;
                }
                var7[var6 - var8 - 1] = (byte) (var9 + 48);
                arg3 /= arg0;
            }
            class279 var10 = new class279();
            var10.field4967 = var6;
            var10.field4935 = var7;
            return var10;
        } else {
            return (class279) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 96)
    public static final void method2100(int arg0) {
        field5273++;
        for (class176 var1 = (class176) class226.field3977.method609(-26368); var1 != null; var1 = (class176) class226.field3977.method604(2)) {
            int var2 = var1.field3165;
            if (class283.method2031(20714, var2)) {
                boolean var3 = true;
                class8[] var4 = class18.field545[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field223;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5539;
                    class8 var7 = class273.method1940(var6, 105);
                    if (var7 != null) {
                        class50.method426(var7, false);
                    }
                }
            }
        }
        if (arg0 < 3) {
            field5279 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZZBIIII)V", line = 157)
    public static final void method2101(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            class97.method810();
        }
        field5274++;
        if (class120.field2159 != null && (arg4 != 3 || class236.field4121 != arg5 || class239.field4218 != arg3)) {
            class125.method997(class110.field2022, (byte) 23, class120.field2159);
            class120.field2159 = null;
        }
        if (arg4 == 3 && class120.field2159 == null) {
            class120.field2159 = class220.method1616(0, class110.field2022, arg3, 0, 284736560, arg5);
            if (class120.field2159 != null) {
                class239.field4218 = arg3;
                class236.field4121 = arg5;
                class54.method507(class110.field2022, -6);
            }
        }
        if (arg4 == 3 && class120.field2159 == null) {
            method2101(true, true, (byte) 124, -1, class283.field5062, -1, arg6);
            return;
        }
        Container var7;
        if (class120.field2159 != null) {
            var7 = class120.field2159;
        } else if (class5.field115 == null) {
            var7 = class110.field2022.field5418;
        } else {
            var7 = class5.field115;
        }
        class113.field2082 = var7.getSize().width;
        class105.field1985 = var7.getSize().height;
        if (class5.field115 == var7) {
            Insets var8 = class5.field115.getInsets();
            class105.field1985 -= var8.top + var8.bottom;
            class113.field2082 -= var8.right + var8.left;
        }
        if (arg4 >= 2) {
            class176.field3150 = class105.field1985;
            class252.field4496 = 0;
            class221.field3899 = class113.field2082;
            class90.field1703 = 0;
        } else {
            class176.field3150 = 503;
            class221.field3899 = 765;
            class90.field1703 = (class113.field2082 - 765) / 2;
            class252.field4496 = 0;
        }
        if (arg0) {
            class236.method1697(class132.field2419, (byte) -29);
            class37.method328(class132.field2419, true);
            if (class163.field2931 != null) {
                class163.field2931.method28((byte) 32, class132.field2419);
            }
            class124.field2252.method674(5);
            class131.method1032(class132.field2419, (byte) -90);
            class320.method2252(class132.field2419, (byte) -105);
            if (class163.field2931 != null) {
                class163.field2931.method33((byte) -125, class132.field2419);
            }
        } else {
            if (class97.field1824) {
                class97.method816(class221.field3899, class176.field3150);
            }
            class132.field2419.setSize(class221.field3899, class176.field3150);
            if (class5.field115 == var7) {
                Insets var9 = class5.field115.getInsets();
                class132.field2419.setLocation(class90.field1703 + var9.left, class252.field4496 + var9.top);
            } else {
                class132.field2419.setLocation(class90.field1703, class252.field4496);
            }
        }
        if (arg4 == 0 && arg6 > 0) {
            class97.method820(class132.field2419);
        }
        if (arg1 && arg4 > 0) {
            class132.field2419.setIgnoreRepaint(true);
            if (!class12.field380) {
                class52.method435();
                class250.field4455 = null;
                class250.field4455 = class165.method1287(class132.field2419, class176.field3150, class221.field3899, -4);
                class146.method1118();
                if (class53.field1111 == 5) {
                    class320.method2254(2, class292.field5210, true);
                } else {
                    class321.method2258(class200.field3575, false, (byte) -42);
                }
                try {
                    Graphics var10 = class132.field2419.getGraphics();
                    class250.field4455.method541(var10, -60, 0, 0);
                } catch (Exception var14) {
                }
                class100.method848((byte) -120);
                if (arg6 == 0) {
                    class250.field4455 = class165.method1287(class132.field2419, 503, 765, -4);
                } else {
                    class250.field4455 = null;
                }
                class206 var12 = class110.field2022.method2167(class124.field2252.getClass(), (byte) 26);
                while (var12.field3655 == 0) {
                    class204.method1510(100L, 1);
                }
                if (var12.field3655 == 1) {
                    class12.field380 = true;
                }
            }
            if (class12.field380) {
                class97.method806(class132.field2419, class232.field4062 * 2);
            }
        }
        if (!class97.field1824 && arg4 > 0) {
            method2101(true, true, (byte) 91, -1, 0, -1, arg6);
            return;
        }
        if (arg4 > 0 && arg6 == 0) {
            class236.field4115.setPriority(5);
            class250.field4455 = null;
            class242.method1738();
            ((class237) class27.field656).method1704(200, 1);
            if (class126.field2340) {
                class27.method250(0.7F);
            }
            class17.method152(false);
        } else if (arg4 == 0 && arg6 > 0) {
            class236.field4115.setPriority(1);
            class250.field4455 = class165.method1287(class132.field2419, 503, 765, -4);
            class242.method1740();
            class208.method1529();
            ((class237) class27.field656).method1704(20, 1);
            if (class126.field2340) {
                if (class253.field4519 == 1) {
                    class27.method250(0.9F);
                }
                if (class253.field4519 == 2) {
                    class27.method250(0.8F);
                }
                if (class253.field4519 == 3) {
                    class27.method250(0.7F);
                }
                if (class253.field4519 == 4) {
                    class27.method250(0.6F);
                }
            }
            class168.method1312();
            class17.method152(false);
        }
        class266.field4798 = !class221.method1617((byte) 29);
        if (arg1) {
            class287.method2052(77);
        }
        if (arg4 < 2) {
            class290.field5162 = false;
        } else {
            class290.field5162 = true;
        }
        if (arg2 <= 79) {
            return;
        }
        if (class307.field5444 != -1) {
            class237.method1702(true, (byte) -15);
        }
        if (class202.field3603 != null && (class53.field1111 == 30 || class53.field1111 == 25)) {
            class38.method342((byte) 124);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class71.field1398[var13] = true;
        }
        class52.field1097 = true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I", line = 390)
    public static final int method2102(byte arg0, int arg1, int arg2) {
        field5271++;
        int var3 = arg1 >>> 31;
        return arg0 > -53 ? 109 : (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIZI)V", line = 423)
    public static final void method2103(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class214.field3758 = arg3;
        class307.field5450 = arg4;
        field5276++;
        class322.field5633 = arg6;
        class322.field5632 = arg1;
        class195.field3504 = arg0;
        if (arg5 && class322.field5633 >= 100) {
            class21.field589 = class322.field5632 * 128 + 64;
            class92.field1747 = class214.field3758 * 128 + 64;
            class306.field5438 = class130.method1025(class21.field589, 1008652135, class287.field5134, class92.field1747) - class307.field5450;
        }
        class122.field2191 = 2;
        if (arg2 != 0) {
            method2102((byte) 95, 79, 127);
        }
    }
}
