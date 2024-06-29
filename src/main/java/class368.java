import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class368 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5312 = new String[200];

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
    public static boolean field5313 = false;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field5320 = 0;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
    public static int[] field5324 = new int[4];

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field5317 = 0;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Lh;")
    public static class427 field5316;

    @OriginalMember(owner = "client!wr", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 8)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class30.field430 != null) {
            class39.field541 = 0;
            class423.field6235 = -1;
            class312.field4572 = -1;
        }
        field5326++;
    }

    @OriginalMember(owner = "client!wr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 25)
    public final void focusGained(FocusEvent arg0) {
        field5327++;
    }

    @OriginalMember(owner = "client!wr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 32)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class30.field430 != null) {
            class271.field3936 = 0;
        }
        field5321++;
    }

    @OriginalMember(owner = "client!wr", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 46)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5329++;
        if (class30.field430 != null) {
            class39.field541 = 0;
            class423.field6235 = arg0.getX();
            class312.field4572 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZLwm;I)V", line = 63)
    public static final void method2391(int arg0, int arg1, boolean arg2, class298 arg3, int arg4) {
        field5315++;
        if (arg2) {
            return;
        }
        class396 var5 = arg3.method2040(arg2);
        int var6 = arg3.field4324 - arg3.field4328.field6099 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg3.field4338 > 25) {
                arg3.field4285 = false;
                if (arg0 < 0 && var5.field5858 != -1) {
                    arg3.field4298 = var5.field5858;
                } else if (arg0 <= 0 || var5.field5854 == -1) {
                    arg3.field4298 = var5.field5887;
                } else {
                    arg3.field4298 = var5.field5854;
                }
            } else if (!arg3.field4285 || !var5.method2541(arg3.field4298, -42)) {
                arg3.field4298 = var5.method2543(-909);
                arg3.field4285 = arg3.field4298 != -1;
            }
        } else if (arg3.field4330 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class35.field483[arg4] - arg3.field4328.field6099 & 0x3FFF;
            arg3.field4285 = false;
            if (arg1 == 2 && var5.field5859 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5861 != -1) {
                    arg3.field4298 = var5.field5861;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5860 != -1) {
                    arg3.field4298 = var5.field5860;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5862 == -1) {
                    arg3.field4298 = var5.field5859;
                } else {
                    arg3.field4298 = var5.field5862;
                }
            } else if (arg1 == 0 && var5.field5867 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5885 != -1) {
                    arg3.field4298 = var5.field5885;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5844 != -1) {
                    arg3.field4298 = var5.field5844;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5877 == -1) {
                    arg3.field4298 = var5.field5867;
                } else {
                    arg3.field4298 = var5.field5877;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field5852 != -1) {
                arg3.field4298 = var5.field5852;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field5863 != -1) {
                arg3.field4298 = var5.field5863;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field5884 == -1) {
                arg3.field4298 = var5.field5887;
            } else {
                arg3.field4298 = var5.field5884;
            }
        } else if (var6 == 0 && arg3.field4338 <= 25) {
            arg3.field4285 = false;
            if (arg1 == 2 && var5.field5859 != -1) {
                arg3.field4298 = var5.field5859;
            } else if (arg1 == 0 && var5.field5867 != -1) {
                arg3.field4298 = var5.field5867;
            } else {
                arg3.field4298 = var5.field5887;
            }
        } else {
            if (arg1 == 2 && var5.field5859 != -1) {
                if (arg0 < 0 && var5.field5850 != -1) {
                    arg3.field4298 = var5.field5850;
                } else if (arg0 <= 0 || var5.field5881 == -1) {
                    arg3.field4298 = var5.field5859;
                } else {
                    arg3.field4298 = var5.field5881;
                }
            } else if (arg1 == 0 && var5.field5867 != -1) {
                if (arg0 < 0 && var5.field5878 != -1) {
                    arg3.field4298 = var5.field5878;
                } else if (arg0 <= 0 || var5.field5843 == -1) {
                    arg3.field4298 = var5.field5867;
                } else {
                    arg3.field4298 = var5.field5843;
                }
            } else if (arg0 < 0 && var5.field5875 != -1) {
                arg3.field4298 = var5.field5875;
            } else if (arg0 <= 0 || var5.field5874 == -1) {
                arg3.field4298 = var5.field5887;
            } else {
                arg3.field4298 = var5.field5874;
            }
            arg3.field4285 = false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 231)
    public static final void method2392(byte arg0) {
        field5314++;
        if (class367.field5302 == -1 || class253.field3491 == -1) {
            return;
        }
        int var1 = class163.field2189 + ((class110.field1566 - class163.field2189) * class444.field6508 >> 16);
        class444.field6508 += var1;
        if (class444.field6508 >= 65535) {
            if (class400.field5975) {
                class39.field539 = false;
            } else {
                class39.field539 = true;
            }
            class444.field6508 = 65535;
            class400.field5975 = true;
        } else {
            class39.field539 = false;
            class400.field5975 = false;
        }
        float var2 = (float) class444.field6508 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class247.field3330 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class164.field2214[class367.field5302][var4][var5] * 3;
            int var22 = class164.field2214[class367.field5302][var4 + 1][var5] * 3;
            int var23 = (class164.field2214[class367.field5302][var4 + 2][var5] + class164.field2214[class367.field5302][var4 + 2][var5] - class164.field2214[class367.field5302][var4 + 3][var5]) * 3;
            int var24 = class164.field2214[class367.field5302][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class164.field2214[class367.field5302][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class400.field5971 = (int) var3[0] - class7.field138 * 128;
        class179.field2371 = (int) var3[2] - class200.field2660 * 128;
        class201.field2667 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class302.field4450 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class164.field2214[class253.field3491][var7][var8] * 3;
            int var15 = class164.field2214[class253.field3491][var7 + 1][var8] * 3;
            int var16 = (class164.field2214[class253.field3491][var7 + 2][var8] - (class164.field2214[class253.field3491][var7 + 3][var8] - class164.field2214[class253.field3491][var7 + 2][var8])) * 3;
            int var17 = class164.field2214[class253.field3491][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class164.field2214[class253.field3491][var7 + 2][var8] - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        if (arg0 != 117) {
            field5324 = null;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class415.field6101 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class5.field66 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class404.field6005 = class164.field2214[class367.field5302][var4][3] + ((class164.field2214[class367.field5302][var4 + 2][3] - class164.field2214[class367.field5302][var4][3]) * class444.field6508 >> 16);
    }

    @OriginalMember(owner = "client!wr", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 337)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class30.field430 != null) {
            class39.field541 = 0;
            class271.field3936 = 0;
            int var2 = arg0.getModifiers();
        }
        field5328++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wr", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 383)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class30.field430 != null) {
            class39.field541 = 0;
            class323.field4738 = arg0.getX();
            class26.field364 = arg0.getY();
            class215.field2864 = class114.method735(95);
            if (arg0.isMetaDown()) {
                class99.field1388 = 2;
                class271.field3936 = 2;
            } else {
                class99.field1388 = 1;
                class271.field3936 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field5319++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wr", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 433)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class30.field430 != null) {
            class39.field541 = 0;
            class423.field6235 = arg0.getX();
            class312.field4572 = arg0.getY();
        }
        field5318++;
    }

    @OriginalMember(owner = "client!wr", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 453)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class30.field430 != null) {
            class39.field541 = 0;
            class423.field6235 = arg0.getX();
            class312.field4572 = arg0.getY();
        }
        field5322++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 469)
    public static final String method2393(boolean arg0, String arg1) {
        field5325++;
        if (!arg0) {
            return null;
        }
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class32.method215(-119, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!wr", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 521)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5323++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 533)
    public static void method2394(int arg0) {
        if (arg0 != 1) {
            method2391(-108, 60, false, (class298) null, 65);
        }
        field5324 = null;
        field5316 = null;
        field5312 = null;
    }
}
