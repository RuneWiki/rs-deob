import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class266 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lsg;")
    private static class30 field4685 = class167.method1221((byte) 33, "flash1:");

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lsg;")
    private static class30 field4681 = class167.method1221((byte) 33, "Starting 3d Library");

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lsg;")
    public static class30 field4683 = field4681;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lsg;")
    public static class30 field4693 = field4685;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lsg;")
    public static class30 field4684 = field4685;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4696 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lsg;")
    public static class30 field4699 = class167.method1221((byte) 33, "(U4");

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!nd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class74.field1659 != null) {
            class35.field859 = 0;
            class77.field1683 = arg0.getX();
            class221.field3981 = arg0.getY();
        }
        field4691++;
    }

    @OriginalMember(owner = "client!nd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class74.field1659 != null) {
            class35.field859 = 0;
            class77.field1683 = arg0.getX();
            class221.field3981 = arg0.getY();
        }
        field4692++;
    }

    @OriginalMember(owner = "client!nd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4695++;
    }

    @OriginalMember(owner = "client!nd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4697++;
        if (class74.field1659 != null) {
            class35.field859 = 0;
            class30.field613 = arg0.getX();
            class265.field4670 = arg0.getY();
            class131.field2577 = class111.method874(30351);
            if (arg0.isMetaDown()) {
                class203.field3626 = 2;
                class28.field517 = 2;
            } else {
                class203.field3626 = 1;
                class28.field517 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class74.field1659 != null) {
            class28.field517 = 0;
        }
        field4694++;
    }

    @OriginalMember(owner = "client!nd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4687++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method1824(int arg0) {
        field4681 = null;
        field4685 = null;
        field4699 = null;
        field4683 = null;
        if (arg0 >= -72) {
            field4685 = null;
        }
        field4696 = null;
        field4693 = null;
        field4684 = null;
    }

    @OriginalMember(owner = "client!nd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4689++;
        if (class74.field1659 != null) {
            class35.field859 = 0;
            class77.field1683 = arg0.getX();
            class221.field3981 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!nd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4690++;
        if (class74.field1659 != null) {
            class35.field859 = 0;
            class28.field517 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1825(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4688++;
        if (class100.field2054 == arg0 && class202.field3611 == arg6 && class109.field2191 == arg1 || class81.method703(-15861)) {
            return;
        }
        class109.field2191 = arg1;
        class100.field2054 = arg0;
        class202.field3611 = arg6;
        if (class81.method703(arg5 - 15861)) {
            class109.field2191 = 0;
        }
        if (arg2) {
            class253.method1764((byte) -85, 28);
        } else {
            class253.method1764((byte) -85, 25);
        }
        class63.method566(true, class242.field4335, -119);
        int var7 = class196.field3547;
        int var8 = class22.field421;
        class196.field3547 = arg6 * 8 - 48;
        class22.field421 = (arg0 - 6) * 8;
        class126.field2459 = class28.method237(258, class100.field2054 * 8, class202.field3611 * 8);
        int var9 = class22.field421 - var8;
        int var10 = class196.field3547 - var7;
        int var11 = class196.field3547;
        class113.field2247 = null;
        int var12 = class22.field421;
        if (arg2) {
            class221.field3985 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class275 var32 = class125.field2443[var16];
                if (var32 != null) {
                    var32.field1360 -= var9 * 128;
                    var32.field1336 -= var10 * 128;
                    if (var32.field1360 >= 0 && var32.field1360 <= 13184 && var32.field1336 >= 0 && var32.field1336 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field1349[var33] -= var9;
                            var32.field1372[var33] -= var10;
                        }
                        class4.field55[class221.field3985++] = var16;
                    } else {
                        class125.field2443[var16].field4805 = null;
                        class125.field2443[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class275 var14 = class125.field2443[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field1349[var15] -= var9;
                        var14.field1372[var15] -= var10;
                    }
                    var14.field1336 -= var10 * 128;
                    var14.field1360 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class120 var30 = class75.field1670[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field1349[var31] -= var9;
                    var30.field1372[var31] -= var10;
                }
                var30.field1336 -= var10 * 128;
                var30.field1360 -= var9 * 128;
            }
        }
        byte var18 = 0;
        class159.field2998 = arg1;
        class247.field4394.method914(arg4, arg3, false, 0);
        byte var19 = 1;
        byte var20 = 104;
        byte var21 = 104;
        byte var22 = 1;
        int var23 = arg5;
        if (var9 < 0) {
            var19 = -1;
            var20 = -1;
            var18 = 103;
        }
        if (var10 < 0) {
            var22 = -1;
            var21 = -1;
            var23 = 103;
        }
        for (int var24 = var18; var24 != var20; var24 += var19) {
            for (int var26 = var23; var26 != var21; var26 += var22) {
                int var27 = var9 + var24;
                int var28 = var10 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class103.field2078[var29][var24][var26] = class103.field2078[var29][var27][var28];
                    } else {
                        class103.field2078[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class202 var25 = (class202) class41.field1024.method478(arg5); var25 != null; var25 = (class202) class41.field1024.method476((byte) 13)) {
            var25.field3616 -= var9;
            var25.field3596 -= var10;
            if (var25.field3616 < 0 || var25.field3596 < 0 || var25.field3616 >= 104 || var25.field3596 >= 104) {
                var25.method1681(false);
            }
        }
        if (arg2) {
            class223.field4002 -= var9;
            class142.field2750 -= var10;
            class71.field1599 -= var9;
            class77.field1685 -= var10;
        } else {
            class215.field3931 = 1;
        }
        class233.field4153 = 0;
        class86.field1769 = -1;
        if (class210.field3771 != 0) {
            class210.field3771 -= var9;
            class173.field3239 -= var10;
        }
        class238.field4237.method480(73);
        class77.field1681.method480(121);
    }

    @OriginalMember(owner = "client!nd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4698++;
        if (class74.field1659 != null) {
            class35.field859 = 0;
            class77.field1683 = -1;
            class221.field3981 = -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method1826(int arg0) {
        class148.method1081((byte) -78);
        field4682++;
        class256.method1777((byte) -42);
        class202.method1432(-32);
        class154.method1159((byte) 101);
        int var1 = -35 % ((arg0 + 54) / 48);
        class126.method947((byte) 57);
        class69.method641((byte) -33);
        class102.method826(false);
        class229.method1632(105);
        class31.method318((byte) -122);
        class127.method950(-9186);
        class227.method1619((byte) 65);
        class197.method1423((byte) 80);
        class20.method194((byte) 11);
        class236.method1682(-125);
        class90.field1811.method1652(-8259);
    }
}
