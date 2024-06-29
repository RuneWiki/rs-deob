import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class208 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field3273 = 0;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[[[I")
    public static int[][][] field3270;

    @OriginalMember(owner = "client!vk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class4.field38 != null) {
            class125.field2129 = 0;
            class138.field2276 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3278++;
    }

    @OriginalMember(owner = "client!vk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 39)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3277++;
        if (class4.field38 != null) {
            class125.field2129 = 0;
            class294.field4743 = -1;
            class260.field4367 = -1;
        }
    }

    @OriginalMember(owner = "client!vk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 57)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class4.field38 != null) {
            class138.field2276 = 0;
        }
        field3265++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I", line = 69)
    public static final int method1576(int arg0, int arg1) {
        if (arg0 < 122) {
            method1578(-9, (class22) null, -88, -31, 41, 104, 8);
        }
        field3267++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 84)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3272++;
        if (class4.field38 != null) {
            class125.field2129 = 0;
            class294.field4743 = arg0.getX();
            class260.field4367 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 100)
    public static void method1577(boolean arg0) {
        field3270 = (int[][][]) null;
        if (!arg0) {
            field3273 = 88;
        }
    }

    @OriginalMember(owner = "client!vk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 111)
    public final void focusGained(FocusEvent arg0) {
        field3271++;
    }

    @OriginalMember(owner = "client!vk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 118)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class4.field38 != null) {
            class125.field2129 = 0;
            class294.field4743 = arg0.getX();
            class260.field4367 = arg0.getY();
        }
        field3275++;
    }

    @OriginalMember(owner = "client!vk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 151)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3264++;
        if (class4.field38 != null) {
            class125.field2129 = 0;
            class122.field2097 = arg0.getX();
            class350.field5548 = arg0.getY();
            class241.field3993 = class47.method371(-111);
            if (arg0.isMetaDown()) {
                class315.field5021 = 2;
                class138.field2276 = 2;
            } else {
                class315.field5021 = 1;
                class138.field2276 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILic;IIIII)V", line = 200)
    public static final void method1578(int arg0, class22 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3266++;
        long var7 = 0L;
        boolean var9 = false;
        if (arg0 == 0) {
            var7 = class252.method1955(arg5, arg6, arg4);
        } else if (arg0 == 1) {
            var7 = class64.method555(arg5, arg6, arg4);
        } else if (arg0 == 2) {
            var7 = class1.method1(arg5, arg6, arg4);
        } else if (arg0 == 3) {
            var7 = class117.method922(arg5, arg6, arg4);
        }
        int var10 = (int) var7 >> 14 & 0x1F;
        boolean var11 = false;
        int var12 = ((int) var7 & 0x3C4CEC) >> 20;
        if (arg2 != 2) {
            method1576(-14, 82);
        }
        boolean var13 = true;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class29 var15 = class166.method1292(0, var14);
        if (var15.method181(0)) {
            class287.method2090(var15, -63, arg6, arg5, arg4);
        }
        if (var7 == 0L) {
            return;
        }
        class161 var16 = null;
        class161 var17 = null;
        if (arg0 == 0) {
            class338 var21 = class152.method1174(arg5, arg6, arg4);
            if (var21 != null) {
                var17 = var21.field5390;
                var16 = var21.field5392;
            }
            if (var15.field371 != 0) {
                arg1.method140((byte) 6, var15.field420, arg4, var10, var12, arg6, !var15.field365);
            }
        } else if (arg0 == 1) {
            class339 var18 = class138.method1041(arg5, arg6, arg4);
            if (var18 != null) {
                var17 = var18.field5410;
                var16 = var18.field5400;
            }
        } else if (arg0 == 2) {
            class209 var20 = class220.method1642(arg5, arg6, arg4);
            if (var20 != null) {
                var16 = var20.field3287;
            }
            if (var15.field371 != 0 && (var15.field414 + arg6) < 104 && var15.field414 + arg4 < 104 && var15.field342 + arg6 < 104 && var15.field342 + arg4 < 104) {
                arg1.method136(!var15.field365, var15.field420, -23999, var15.field414, var15.field342, arg4, var12, arg6);
            }
        } else if (arg0 == 3) {
            class184 var19 = class282.method2073(arg5, arg6, arg4);
            if (var19 != null) {
                var16 = var19.field2968;
            }
            if (var15.field371 == 1) {
                arg1.method142(arg6, 23407, arg4);
            }
        }
        if (var15.field418 != null) {
            var15 = var15.method177(5000);
        }
        if (!class42.field607 || var15 == null || !var15.field391) {
            return;
        }
        if (var10 == 2) {
            if ((var16 instanceof class56)) {
                ((class56) var16).method447(10874);
            } else {
                class318.method2249(var15, arg4, 0, true, arg6, var10, arg3, var12 + 4, 0);
            }
            if ((var17 instanceof class56)) {
                ((class56) var17).method447(10874);
            } else {
                class318.method2249(var15, arg4, 0, true, arg6, var10, arg3, var12 + 1 & 0x3, 0);
            }
        } else if (var10 == 5) {
            if (var16 instanceof class56) {
                ((class56) var16).method447(10874);
            } else {
                class318.method2249(var15, arg4, class130.field2200[var12] * 8, true, arg6, 4, arg3, var12, class253.field4275[var12] * 8);
            }
        } else if (var10 == 6) {
            if ((var16 instanceof class56)) {
                ((class56) var16).method447(10874);
            } else {
                class318.method2249(var15, arg4, class190.field3045[var12] * 8, true, arg6, 4, arg3, var12 + 4, class329.field5231[var12] * 8);
            }
        } else if (var10 == 7) {
            if (var16 instanceof class56) {
                ((class56) var16).method447(10874);
            } else {
                class318.method2249(var15, arg4, 0, true, arg6, 4, arg3, (var12 + 2 & 0x3) + 4, 0);
            }
        } else if (var10 == 8) {
            if (var16 instanceof class56) {
                ((class56) var16).method447(10874);
            } else {
                class318.method2249(var15, arg4, class190.field3045[var12] * 8, true, arg6, 4, arg3, var12 + 4, class329.field5231[var12] * 8);
            }
            if (var17 instanceof class56) {
                ((class56) var17).method447(10874);
            } else {
                class318.method2249(var15, arg4, class190.field3045[var12] * 8, true, arg6, 4, arg3, (var12 + 2 & 0x3) + 4, class329.field5231[var12] * 8);
            }
        } else if (var10 == 11) {
            if ((var16 instanceof class56)) {
                ((class56) var16).method447(10874);
            } else {
                class318.method2249(var15, arg4, 0, true, arg6, 10, arg3, var12 + 4, 0);
            }
        } else if (var16 instanceof class56) {
            ((class56) var16).method447(10874);
        } else {
            class318.method2249(var15, arg4, 0, true, arg6, var10, arg3, var12, 0);
        }
    }

    @OriginalMember(owner = "client!vk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 396)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3274++;
    }

    @OriginalMember(owner = "client!vk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 407)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class4.field38 != null) {
            class125.field2129 = 0;
            class294.field4743 = arg0.getX();
            class260.field4367 = arg0.getY();
        }
        field3269++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/lang/String;BII)V", line = 426)
    public static final void method1579(int arg0, String arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -21) {
            return;
        }
        field3276++;
        class250 var5 = class25.method165(arg4, arg3, 24836);
        if (var5 == null) {
            return;
        }
        if (var5.field4166 != null) {
            class40 var6 = new class40();
            var6.field581 = var5.field4166;
            var6.field591 = arg0;
            var6.field579 = arg1;
            var6.field593 = var5;
            class29.method183((byte) 123, var6);
        }
        boolean var7 = true;
        if (var5.field4134 > 0) {
            var7 = class311.method2206(var5, 16);
        }
        if (!var7 || !client.method336(var5).method810((byte) 89, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class36.field520.method2228(55, 16547);
            class36.field520.method1757(arg3, -104);
            class36.field520.method1729(arg4, 206);
            class159.field2529++;
        }
        if (arg0 == 2) {
            class55.field905++;
            class36.field520.method2228(186, 16547);
            class36.field520.method1757(arg3, -114);
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 3) {
            class36.field520.method2228(38, 16547);
            class36.field520.method1757(arg3, -100);
            class36.field520.method1729(arg4, 206);
            class122.field2092++;
        }
        if (arg0 == 4) {
            class36.field520.method2228(86, 16547);
            class36.field520.method1757(arg3, -120);
            class320.field5090++;
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 5) {
            class36.field520.method2228(91, 16547);
            class36.field548++;
            class36.field520.method1757(arg3, -101);
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 6) {
            class59.field1019++;
            class36.field520.method2228(225, 16547);
            class36.field520.method1757(arg3, -105);
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 7) {
            class103.field1669++;
            class36.field520.method2228(49, 16547);
            class36.field520.method1757(arg3, -108);
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 8) {
            class354.field5619++;
            class36.field520.method2228(96, 16547);
            class36.field520.method1757(arg3, -109);
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 9) {
            class148.field2371++;
            class36.field520.method2228(0, 16547);
            class36.field520.method1757(arg3, -101);
            class36.field520.method1729(arg4, 206);
        }
        if (arg0 == 10) {
            class36.field520.method2228(10, 16547);
            class65.field1159++;
            class36.field520.method1757(arg3, -118);
            class36.field520.method1729(arg4, 206);
        }
    }
}
