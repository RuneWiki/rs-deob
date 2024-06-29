import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[J")
    public static long[] field1264 = new long[32];

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lpe;")
    private static class109 field1265 = class141.method1120("Could not complete login)3", 0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Z")
    public static boolean field1269 = false;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lpe;")
    public static class109 field1268 = field1265;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[I")
    public static int[] field1279 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lpe;")
    public static class109 field1263 = class141.method1120(" loggt sich aus)3", 0);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lpe;")
    public static class109 field1283 = class141.method1120(" )2> <col=00ffff>", 0);

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lna;")
    public static class91 field1280;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[Lk;")
    public static class69[] field1281;

    @OriginalMember(owner = "client!j", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1275++;
        if (class63.field1288 != null) {
            class12.field277 = 0;
            class124.field2754 = -1;
            class156.field3600 = -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1279 = null;
        field1268 = null;
        field1281 = null;
        field1280 = null;
        field1283 = null;
        if (arg0 != 205) {
            method496(null, -118, 1, 15, -43, null, 8);
        }
        field1263 = null;
        field1264 = null;
        field1265 = null;
    }

    @OriginalMember(owner = "client!j", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1267++;
    }

    @OriginalMember(owner = "client!j", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class63.field1288 != null) {
            class12.field277 = 0;
            class147.field3214 = arg0.getX();
            class138.field3013 = arg0.getY();
            class8.field199 = class94.method779(104);
            if (arg0.isMetaDown()) {
                class139.field3045 = 2;
                class123.field2703 = 2;
            } else {
                class139.field3045 = 1;
                class123.field2703 = 1;
            }
        }
        field1276++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
    public static final int method495(int arg0, int arg1, int arg2) {
        if (arg1 != 87) {
            field1265 = null;
        }
        field1277++;
        int var3 = class82.method704(arg2 - 1, arg0 + -1, 57) + class82.method704(arg2 + 1, arg0 - 1, 57) + class82.method704(arg2 + -1, arg0 + 1, arg1 + -30) + class82.method704(arg2 + 1, arg0 + 1, arg1 + -30);
        int var4 = class82.method704(arg2 - 1, arg0, 57) + class82.method704(arg2 + 1, arg0, 57) + class82.method704(arg2, arg0 - 1, 57) + class82.method704(arg2, arg0 + 1, 57);
        int var5 = class82.method704(arg2, arg0, arg1 - 30);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!j", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1278++;
        if (class63.field1288 != null) {
            class12.field277 = 0;
            class124.field2754 = arg0.getX();
            class156.field3600 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!j", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1271++;
        if (class63.field1288 != null) {
            class123.field2703 = 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BIIII[Lla;I)V")
    public static final void method496(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class77[] arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg6 + var13 > 0 && arg6 + var13 < 103) {
                        arg5[var7].field1618[arg1 + var12][arg6 + var13] = class4.method34(arg5[var7].field1618[arg1 + var12][arg6 + var13], -16777217);
                    }
                }
            }
        }
        if (arg2 != 90) {
            method496(null, -10, 58, -52, 107, null, 118);
        }
        field1262++;
        class13 var8 = new class13(arg0);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class44.method400(var8, 0, arg4, true, var9, arg1 + var10, arg6 + var11, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class63.field1288 != null) {
            class12.field277 = 0;
            class124.field2754 = arg0.getX();
            class156.field3600 = arg0.getY();
        }
        field1284++;
    }

    @OriginalMember(owner = "client!j", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1266++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!j", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class63.field1288 != null) {
            class12.field277 = 0;
            class123.field2703 = 0;
        }
        field1270++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!j", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1274++;
        if (class63.field1288 != null) {
            class12.field277 = 0;
            class124.field2754 = arg0.getX();
            class156.field3600 = arg0.getY();
        }
    }
}
