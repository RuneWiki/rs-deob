import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class12 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "S")
    public static short field120 = 256;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field122 = "Loading textures - ";

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
    public static boolean field123 = false;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V", line = 7)
    public static final void method70(int arg0, int arg1) {
        class122.field1686.method387(arg1, false);
        field121++;
        if (arg0 < 25) {
            method73(16, (class16) null, (byte) -67, 81);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZZI)V", line = 26)
    public static final void method71(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field125++;
        if (arg4) {
            class272.method1963();
        }
        if (class80.field1065 != null && (arg1 != 3 || class352.field5609 != arg3 || class226.field3413 != arg6)) {
            class250.method1774(class156.field2451, class80.field1065, 0);
            class80.field1065 = null;
        }
        if (arg1 == 3 && class80.field1065 == null) {
            class80.field1065 = class267.method1875(class156.field2451, 0, arg6, arg3, 0, (byte) 9);
            if (class80.field1065 != null) {
                class352.field5609 = arg3;
                class226.field3413 = arg6;
                class160.method1162(class156.field2451, (byte) -128);
            }
        }
        if (arg1 == 3 && class80.field1065 == null) {
            method71(-125, class161.field2482, arg2, -1, true, true, -1);
            return;
        }
        Container var7;
        if (class80.field1065 != null) {
            var7 = class80.field1065;
        } else if (class231.field3498 == null) {
            var7 = class156.field2451.field254;
        } else {
            var7 = class231.field3498;
        }
        class56.field670 = var7.getSize().width;
        class168.field2580 = var7.getSize().height;
        if (class231.field3498 == var7) {
            Insets var8 = class231.field3498.getInsets();
            class56.field670 -= var8.left + var8.right;
            class168.field2580 -= var8.top + var8.bottom;
        }
        if (arg1 < 2) {
            class95.field1307 = 503;
            class165.field2546 = 765;
            class107.field1473 = (class56.field670 - 765) / 2;
            class258.field4076 = 0;
        } else {
            class165.field2546 = class56.field670;
            class95.field1307 = class168.field2580;
            class107.field1473 = 0;
            class258.field4076 = 0;
        }
        if (arg5) {
            class180.method1244(-1, class328.field5287);
            class190.method1300((byte) -18, class328.field5287);
            if (class171.field2599 != null) {
                class171.field2599.method455(class328.field5287, -5680);
            }
            class5.field59.method2272(-128);
            class52.method315(-84, class328.field5287);
            class306.method2162(-1, class328.field5287);
            if (class171.field2599 != null) {
                class171.field2599.method453(97, class328.field5287);
            }
        } else {
            if (class272.field4317) {
                class272.method1929(class165.field2546, class95.field1307);
            }
            class328.field5287.setSize(class165.field2546, class95.field1307);
            if (class231.field3498 == var7) {
                Insets var9 = class231.field3498.getInsets();
                class328.field5287.setLocation(class107.field1473 + var9.left, var9.top - -class258.field4076);
            } else {
                class328.field5287.setLocation(class107.field1473, class258.field4076);
            }
        }
        if (arg1 == 0 && arg2 > 0) {
            class272.method1954(class328.field5287);
        }
        if (arg4 && arg1 > 0) {
            class328.field5287.setIgnoreRepaint(true);
            if (!class315.field4949) {
                class160.method1160();
                class10.field107 = null;
                class10.field107 = class138.method946(64, class328.field5287, class95.field1307, class165.field2546);
                class343.method2367();
                if (client.field4443 == 5) {
                    class252.method1785(true, class93.field1233, (byte) 126);
                } else {
                    class305.method2152(false, class174.field2628, -9223);
                }
                try {
                    Graphics var10 = class328.field5287.getGraphics();
                    class10.field107.method58(0, -113, 0, var10);
                } catch (Exception var14) {
                }
                class282.method2044((byte) 56);
                if (arg2 == 0) {
                    class10.field107 = class138.method946(64, class328.field5287, 503, 765);
                } else {
                    class10.field107 = null;
                }
                class153 var12 = class156.field2451.method153(27520, class5.field59.getClass());
                while (var12.field2419 == 0) {
                    class19.method140(100L, 16711680);
                }
                if (var12.field2419 == 1) {
                    class315.field4949 = true;
                }
            }
            if (class315.field4949) {
                class272.method1933(class328.field5287, class24.field285 * 2);
            }
        }
        if (!class272.field4317 && arg1 > 0) {
            method71(-125, 0, arg2, -1, true, true, -1);
            return;
        }
        if (arg1 > 0 && arg2 == 0) {
            class73.field909.setPriority(5);
            class10.field107 = null;
            class133.method916();
            ((class138) class104.field1438).method950(70, 200);
            if (class290.field4566) {
                class104.method658(0.7F);
            }
            if (class296.field4652 == null) {
                class296.field4652 = new class322[13][13];
            }
            class195.method1362(4, 104, 104);
            class358.method2476(104, 104);
            class101.method639((byte) -123);
        } else if (arg1 == 0 && arg2 > 0) {
            class73.field909.setPriority(1);
            class10.field107 = class138.method946(64, class328.field5287, 503, 765);
            class133.method920();
            class141.method991();
            ((class138) class104.field1438).method950(-107, 20);
            if (class290.field4566) {
                if (class164.field2522 == 1) {
                    class104.method658(0.9F);
                }
                if (class164.field2522 == 2) {
                    class104.method658(0.8F);
                }
                if (class164.field2522 == 3) {
                    class104.method658(0.7F);
                }
                if (class164.field2522 == 4) {
                    class104.method658(0.6F);
                }
            }
            class175.method1219();
            class101.method639((byte) -123);
        }
        class361.field5709 = !class103.method653(-29308);
        class141.method982(class165.field2546, class95.field1307);
        if (arg4) {
            class241.method1701(1048575);
        }
        if (arg1 >= 2) {
            class71.field889 = true;
        } else {
            class71.field889 = false;
        }
        if (class345.field5482 != -1) {
            class241.method1707(536870911, true);
        }
        if (class147.field2352 != null && (client.field4443 == 30 || client.field4443 == 25)) {
            class30.method215((byte) 112);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class302.field4702[var13] = true;
        }
        if (arg0 >= -55) {
            field122 = (String) null;
        }
        class237.field3646 = true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 277)
    public static void method72(int arg0) {
        if (arg0 != 0) {
            method73(9, (class16) null, (byte) -46, -16);
        }
        field122 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILnk;BI)[Lfe;", line = 289)
    public static final class270[] method73(int arg0, class16 arg1, byte arg2, int arg3) {
        field124++;
        if (class102.method648(arg3, -1000000000, arg0, arg1)) {
            if (arg2 != 18) {
                method72(-31);
            }
            return class303.method2139((byte) 7);
        } else {
            return null;
        }
    }
}
