import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class526 extends class296 {

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "Lna;")
    private class211 field7749;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "Lea;")
    private class15 field7756;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field7747 = new String[8];

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public static int field7760 = 0;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "J")
    public static long field7757 = -1L;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "F")
    public static float field7761;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "Lsc;")
    public static class29 field7755;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    public static void method3132(boolean arg0) {
        if (!arg0) {
            method3137(-67, 97, -77, -103, -121, -111, 127, -119);
        }
        field7755 = null;
        field7747 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([I[[BIII[I[B[[B)I")
    public static final int method3133(int[] arg0, byte[][] arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6, byte[][] arg7) {
        field7750++;
        int var8 = -90 % ((-arg3 - 55) / 49);
        int var9 = arg5[arg2];
        int var10 = arg0[arg2] + var9;
        int var11 = arg5[arg4];
        int var12 = arg0[arg4] + var11;
        int var13 = var9;
        if (var9 < var11) {
            var13 = var11;
        }
        int var14 = var10;
        if (var10 > var12) {
            var14 = var12;
        }
        int var15 = arg6[arg2] & 0xFF;
        if (var15 > (arg6[arg4] & 0xFF)) {
            var15 = arg6[arg4] & 0xFF;
        }
        byte[] var16 = arg7[arg2];
        byte[] var17 = arg1[arg4];
        int var18 = var13 - var9;
        int var19 = var13 - var11;
        for (int var20 = var13; var20 < var14; var20++) {
            int var21 = var17[var19++] + var16[var18++];
            if (var21 < var15) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)V")
    public static final void method3134(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field7753++;
        class306.field4803 = arg0;
        class328 var2 = class473.field7252;
        synchronized (class473.field7252) {
            class473.field7252.method2189(false);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;ZILjava/lang/String;)V")
    public static final void method3135(Color arg0, Color arg1, boolean arg2, Color arg3, boolean arg4, int arg5, String arg6) {
        try {
            Graphics var7 = class320.field4980.getGraphics();
            if (class442.field6880 == null) {
                class442.field6880 = new Font("Helvetica", 1, 13);
            }
            if (arg4) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class489.field7400, class219.field3715);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class427.field6456 == null) {
                    class427.field6456 = class320.field4980.createImage(304, 34);
                }
                Graphics var8 = class427.field6456.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg1);
                var8.fillRect(2, 2, arg5 * 3, 30);
                if (!arg2) {
                    method3138(-37);
                }
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class442.field6880);
                var8.setColor(arg3);
                var8.drawString(arg6, (304 - (arg6.length() * 6)) / 2, 22);
                var7.drawImage(class427.field6456, class489.field7400 / 2 - 152, class219.field3715 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class489.field7400 / 2 - 152;
                int var10 = class219.field3715 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class442.field6880);
                var7.setColor(arg3);
                var7.drawString(arg6, var9 + ((304 - (arg6.length() * 6)) / 2), var10 - -22);
            }
            if (class384.field5882 != null) {
                var7.setFont(class442.field6880);
                var7.setColor(arg3);
                var7.drawString(class384.field5882, class489.field7400 / 2 - (class384.field5882.length() * 6 / 2), class219.field3715 / 2 + -26);
            }
        } catch (Exception var12) {
            class320.field4980.repaint();
        }
        field7748++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lea;BLea;F)Z")
    public final boolean method3136(class15 arg0, byte arg1, class15 arg2, float arg3) {
        field7754++;
        boolean var5 = true;
        class146 var6 = this.field7749.field3568;
        this.field7749.method1237(class516.field7659);
        this.field7749.method1228();
        this.field7749.method1561(-107);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7756.field156, this.field7756.field156);
        this.field7749.method1563(1205, false);
        this.field7749.method1504(false, -2414);
        this.field7749.method1572(false, -32);
        this.field7749.method1571(false, (byte) -69);
        this.field7749.method1553(-2, true);
        if (arg1 >= -96) {
            return false;
        }
        this.field7749.method1507(1, 0);
        this.field7749.method1573(0.0F, 0.0F, 0.0F, -80, arg3);
        this.field7749.method1568(34165, 2896, 34165);
        this.field7749.method1540(78, arg2);
        this.field7749.method1507(0, 0);
        this.field7749.method1494(1, -25951);
        this.field7749.method1540(84, arg0);
        this.field7749.method1522(true, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method891(0, 2, this.field7756, var8);
            var6.method877(28154, 0);
            if (!var6.method888(18274)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method880(1675886592, 0);
        this.field7749.method1503(8, var6);
        this.field7749.method1507(1, 0);
        this.field7749.method1540(47, null);
        this.field7749.method1568(8448, 2896, 8448);
        this.field7749.method1507(0, 0);
        this.field7749.method1540(78, null);
        OpenGL.glPopAttrib();
        this.field7749.method1307(class516.field7659[0], class516.field7659[1], class516.field7659[2], class516.field7659[3]);
        if (var5 && !this.field7749.field3612) {
            this.field7756.method2701((byte) 49);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7758++;
        if (arg1 != 65534) {
            field7747 = null;
        }
        if (arg3 == arg6) {
            class128.method796(0, arg4, arg3, arg0, arg7, arg5, arg2);
        } else if (arg5 - arg3 >= class178.field2609 && class460.field7096 >= arg3 + arg5 && class462.field7105 <= arg4 - arg6 && arg4 + arg6 <= class222.field3750) {
            class449.method2828(arg3, arg4, arg6, 11417, arg7, arg2, arg0, arg5);
        } else {
            class522.method3122(arg4, arg0, arg3, arg6, arg2, arg5, arg7, 3);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Lea;")
    public final class15 method1080(byte arg0) {
        field7759++;
        if (arg0 <= 88) {
            method3138(-119);
        }
        return this.field7756;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
    public static final void method3138(int arg0) {
        field7752++;
        if (class247.field4024) {
            return;
        }
        if (arg0 != -128) {
            field7761 = -0.9442926F;
        }
        class247.field4024 = true;
        if (class141.field1911.field6082) {
            class388.field5918 = ((int) class388.field5918 + 191 & 0xFFFFFF80);
        } else {
            class376.field5767 += (24.0F - class376.field5767) / 2.0F;
        }
        class528.field7774 = true;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)I")
    public final int method3139(boolean arg0) {
        if (arg0) {
            this.field7749 = null;
        }
        field7751++;
        return this.field7756.field156;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lna;I)V")
    public class526(class211 arg0, int arg1) {
        this.field7749 = arg0;
        this.field7756 = new class15(arg0, 6408, arg1);
    }
}
