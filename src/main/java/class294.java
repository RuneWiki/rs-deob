import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class294 extends class41 {

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static volatile int field4743 = -1;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
    public static boolean field4746 = false;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZIIZII)V", line = 5)
    public static final void method2117(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4741++;
        if (arg0) {
            class42.method310();
        }
        if (arg1) {
            field4744 = 43;
        }
        if (class89.field1502 != null && (arg2 != 3 || class137.field2274 != arg3 || class231.field3837 != arg6)) {
            class169.method1317((byte) -7, class89.field1502, class128.field2163);
            class89.field1502 = null;
        }
        if (arg2 == 3 && class89.field1502 == null) {
            class89.field1502 = class11.method50(arg6, arg3, class128.field2163, 0, 98, 0);
            if (class89.field1502 != null) {
                class231.field3837 = arg6;
                class137.field2274 = arg3;
                class16.method87(class128.field2163, (byte) -64);
            }
        }
        if (arg2 == 3 && class89.field1502 == null) {
            method2117(true, false, class267.field4462, -1, true, arg5, -1);
            return;
        }
        Container var7;
        if (class89.field1502 != null) {
            var7 = class89.field1502;
        } else if (class241.field3994 == null) {
            var7 = class128.field2163.field2350;
        } else {
            var7 = class241.field3994;
        }
        class117.field1969 = var7.getSize().width;
        class129.field2188 = var7.getSize().height;
        if (class241.field3994 == var7) {
            Insets var8 = class241.field3994.getInsets();
            class117.field1969 -= var8.right + var8.left;
            class129.field2188 -= var8.top + var8.bottom;
        }
        if (arg2 < 2) {
            class298.field4779 = 765;
            class252.field4266 = 503;
            class313.field4976 = (class117.field1969 - 765) / 2;
            class190.field3048 = 0;
        } else {
            class313.field4976 = 0;
            class252.field4266 = class129.field2188;
            class190.field3048 = 0;
            class298.field4779 = class117.field1969;
        }
        if (arg4) {
            class121.method957(0, class151.field2402);
            class102.method794(!arg1, class151.field2402);
            if (class38.field569 != null) {
                class38.field569.method111(class151.field2402, false);
            }
            class215.field3444.method686((byte) -113);
            class92.method724(!arg1, class151.field2402);
            class116.method908(64, class151.field2402);
            if (class38.field569 != null) {
                class38.field569.method109(-17223, class151.field2402);
            }
        } else {
            if (class42.field607) {
                class42.method291(class298.field4779, class252.field4266);
            }
            class151.field2402.setSize(class298.field4779, class252.field4266);
            if (class241.field3994 == var7) {
                Insets var9 = class241.field3994.getInsets();
                class151.field2402.setLocation(var9.left + class313.field4976, class190.field3048 + var9.top);
            } else {
                class151.field2402.setLocation(class313.field4976, class190.field3048);
            }
        }
        if (arg2 == 0 && arg5 > 0) {
            class42.method306(class151.field2402);
        }
        if (arg0 && arg2 > 0) {
            class151.field2402.setIgnoreRepaint(true);
            if (!class81.field1388) {
                class187.method1471();
                class292.field4728 = null;
                class292.field4728 = class235.method1809(class298.field4779, class252.field4266, class151.field2402, (byte) -88);
                class246.method1882();
                if (class259.field4362 == 5) {
                    class352.method2486(class109.field1792, true, 2);
                } else {
                    class63.method552(class148.field2373, false, 82);
                }
                try {
                    Graphics var10 = class151.field2402.getGraphics();
                    class292.field4728.method572(0, 0, (byte) -121, var10);
                } catch (Exception var14) {
                }
                class143.method1098(81);
                if (arg5 == 0) {
                    class292.field4728 = class235.method1809(765, 503, class151.field2402, (byte) -51);
                } else {
                    class292.field4728 = null;
                }
                class192 var12 = class128.field2163.method1132(-118, class215.field3444.getClass());
                while (var12.field3064 == 0) {
                    class283.method2076((byte) 15, 100L);
                }
                if (var12.field3064 == 1) {
                    class81.field1388 = true;
                }
            }
            if (class81.field1388) {
                class42.method292(class151.field2402, class267.field4482 * 2);
            }
        }
        if (!class42.field607 && arg2 > 0) {
            method2117(true, arg1, 0, -1, true, arg5, -1);
            return;
        }
        if (arg2 > 0 && arg5 == 0) {
            class35.field511.setPriority(5);
            class292.field4728 = null;
            class62.method510();
            ((class98) class153.field2439).method759(128, 200);
            if (class3.field36) {
                class153.method1181(0.7F);
            }
            if (class235.field3904 == null) {
                class235.field3904 = new class179[13][13];
            }
            class30.method211(4, 104, 104);
            class249.method1929(104, 104);
            class255.method1967(-1);
        } else if (arg2 == 0 && arg5 > 0) {
            class35.field511.setPriority(1);
            class292.field4728 = class235.method1809(765, 503, class151.field2402, (byte) 104);
            class62.method533();
            class158.method1223();
            ((class98) class153.field2439).method759(128, 20);
            if (class3.field36) {
                if (class166.field2649 == 1) {
                    class153.method1181(0.9F);
                }
                if (class166.field2649 == 2) {
                    class153.method1181(0.8F);
                }
                if (class166.field2649 == 3) {
                    class153.method1181(0.7F);
                }
                if (class166.field2649 == 4) {
                    class153.method1181(0.6F);
                }
            }
            class299.method2139();
            class255.method1967(-1);
        }
        class26.field316 = !class215.method1621(25);
        class158.method1235(class298.field4779, class252.field4266);
        if (arg0) {
            class215.method1626((byte) 111);
        }
        if (arg2 >= 2) {
            class35.field514 = true;
        } else {
            class35.field514 = false;
        }
        if (class304.field4870 != -1) {
            class14.method83((byte) 94, true);
        }
        if (class342.field5449 != null && (class259.field4362 == 30 || class259.field4362 == 25)) {
            class306.method2178((byte) -100);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class270.field4498[var13] = true;
        }
        class257.field4313 = true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Ljava/lang/String;", line = 247)
    public static final String method2118(int arg0, int arg1) {
        field4745++;
        return arg1 > -66 ? (String) null : (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFEE27) >> 16) + "." + ((arg0 & 0xFFBB) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLth;)V", line = 272)
    public static final void method2119(byte arg0, class57 arg1) {
        field4742++;
        class329.field5233 = arg1;
        if (arg0 != -69) {
            field4743 = 81;
        }
    }
}
