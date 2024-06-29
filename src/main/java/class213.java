import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class213 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Ltl;")
    public static class59 field3484 = class85.method639("::noclip", 9588);

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3489 = 0;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Ltl;")
    private static class59 field3496 = class85.method639("Attack", 9588);

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Ltl;")
    public static class59 field3490 = field3496;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Ltl;")
    public static class59 field3499 = class85.method639("Musik)2Engine vorbereitet)3", 9588);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[I")
    public static int[] field3503 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
    public static int[] field3495;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[[Lkj;")
    public static class32[][] field3485;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "[[[B")
    public static byte[][][] field3500;

    @OriginalMember(owner = "client!jc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class262.field4365 != null) {
            class37.field550 = 0;
            class139.field2295 = arg0.getX();
            class101.field1654 = arg0.getY();
            class219.field3561 = class205.method1451(94);
            if (arg0.isMetaDown()) {
                class93.field1449 = 2;
                class155.field2530 = 2;
            } else {
                class93.field1449 = 1;
                class155.field2530 = 1;
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
        field3493++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 52)
    public static void method1490(boolean arg0) {
        field3499 = null;
        if (!arg0) {
            method1492(-106, -20, (byte[]) null, -115);
        }
        field3503 = null;
        field3500 = (byte[][][]) null;
        field3484 = null;
        field3485 = (class32[][]) null;
        field3490 = null;
        field3495 = null;
        field3496 = null;
    }

    @OriginalMember(owner = "client!jc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 69)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3486++;
        if (class262.field4365 != null) {
            class37.field550 = 0;
            class94.field1455 = -1;
            class147.field2400 = -1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 85)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class262.field4365 != null) {
            class37.field550 = 0;
            class94.field1455 = arg0.getX();
            class147.field2400 = arg0.getY();
        }
        field3483++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lme;B)V", line = 102)
    public static final void method1491(class295 arg0, byte arg1) {
        if (arg1 != -15) {
            method1492(-18, 125, (byte[]) null, 26);
        }
        class284.field4890 = arg0.method2064(123, class101.field1644);
        field3494++;
    }

    @OriginalMember(owner = "client!jc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 114)
    public final void focusGained(FocusEvent arg0) {
        field3488++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BI)I", line = 121)
    public static final int method1492(int arg0, int arg1, byte[] arg2, int arg3) {
        field3498++;
        int var4 = arg0;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class286.field4912[(arg2[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!jc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 162)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class262.field4365 != null) {
            class37.field550 = 0;
            class94.field1455 = arg0.getX();
            class147.field2400 = arg0.getY();
        }
        field3501++;
    }

    @OriginalMember(owner = "client!jc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 183)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class262.field4365 != null) {
            class37.field550 = 0;
            class94.field1455 = arg0.getX();
            class147.field2400 = arg0.getY();
        }
        field3502++;
    }

    @OriginalMember(owner = "client!jc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 200)
    public final void mouseClicked(MouseEvent arg0) {
        field3492++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 226)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3491++;
        if (class262.field4365 != null) {
            class155.field2530 = 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[[[BIBII)V", line = 255)
    public static final void method1493(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class59.field932++;
        class300.field5138 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class238.field3974; var12 < class105.field1732; var12++) {
            class245[][] var13 = class120.field2010[var12];
            for (int var14 = class224.field3631; var14 < class245.field4096; var14++) {
                for (int var15 = class259.field4332; var15 < class309.field5248; var15++) {
                    class245 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class292.field4994[var14 + class286.field4918 - class33.field469][var15 + class286.field4918 - class88.field1390] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field4095 = true;
                            var16.field4087 = true;
                            if (var16.field4092 > 0) {
                                var16.field4081 = true;
                            } else {
                                var16.field4081 = false;
                            }
                            class300.field5138++;
                        } else {
                            var16.field4095 = false;
                            var16.field4087 = false;
                            var16.field4093 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field4098 != null) {
                                    class201 var17 = var16.field4098;
                                    var17.field3323.method1311(var17.field3324, (byte) -7, var17.field3328, var17.field3328, var17.field3324);
                                    if (var17.field3326 != null) {
                                        var17.field3326.method1311(var17.field3324, (byte) 101, var17.field3328, var17.field3328, var17.field3324);
                                    }
                                }
                                if (var16.field4104 != null) {
                                    class222 var18 = var16.field4104;
                                    var18.field3588.method1311(var18.field3589, (byte) 102, var18.field3590, var18.field3590, var18.field3589);
                                    if (var18.field3593 != null) {
                                        var18.field3593.method1311(var18.field3589, (byte) -40, var18.field3590, var18.field3590, var18.field3589);
                                    }
                                }
                                if (var16.field4085 != null) {
                                    class296 var19 = var16.field4085;
                                    var19.field5073.method1311(var19.field5072, (byte) -37, var19.field5075, var19.field5075, var19.field5072);
                                }
                                if (var16.field4107 != null) {
                                    for (int var20 = 0; var20 < var16.field4092; var20++) {
                                        class165 var21 = var16.field4107[var20];
                                        var21.field2688.method1311(var21.field2670, (byte) -62, var21.field2682, var21.field2681, var21.field2676);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class97.field1558 == class4.field57;
        if (class55.field815) {
            GL var23 = class55.field812;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class119.method886();
                class131.method963(-12390, -1, 3);
                class14.field199 = true;
                class76.method598();
                class300.field5127 = -1;
                class270.field4678 = -1;
                for (int var24 = 0; var24 < class45.field725[0].length; var24++) {
                    class32 var25 = class45.field725[0][var24];
                    float var26 = 251.5F - (var25.field445 ? 1.0F : 0.5F);
                    if (class300.field5127 != var25.field466) {
                        class300.field5127 = var25.field466;
                        class27.method175(116, var25.field466);
                        class141.method1025(class313.method2158((byte) 72));
                    }
                    var25.method212(class120.field2010, var26, false);
                }
                class76.method601();
            } else {
                int var27 = class238.field3974;
                while (true) {
                    if (var27 >= class105.field1732) {
                        class135.method989(class33.field469, class88.field1390, class120.field2010);
                        break;
                    }
                    for (int var28 = 0; var28 < class45.field725[var27].length; var28++) {
                        class32 var29 = class45.field725[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field445 ? 1.0F : 0.5F);
                        if (var29.field456 != -1 && class298.field5107.method373(var29.field456, (byte) -128) == 4 && class193.field3216) {
                            class27.method175(103, var29.field466);
                        }
                        var29.method212(class120.field2010, var30, false);
                    }
                    if (var27 == 0 && class268.field4658 > 0) {
                        class55.method391(101.5F);
                        class158.method1129(class33.field469, class88.field1390, class286.field4918, arg1, class292.field4994, class97.field1558[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class238.field3974; var31 < class105.field1732; var31++) {
            class245[][] var32 = class120.field2010[var31];
            for (int var33 = -class286.field4918; var33 <= 0; var33++) {
                int var34 = class33.field469 + var33;
                int var35 = class33.field469 - var33;
                if (var34 >= class224.field3631 || var35 < class245.field4096) {
                    for (int var36 = -class286.field4918; var36 <= 0; var36++) {
                        int var37 = class88.field1390 + var36;
                        int var38 = class88.field1390 - var36;
                        if (var34 >= class224.field3631) {
                            if (var37 >= class259.field4332) {
                                class245 var39 = var32[var34][var37];
                                if (var39 != null && var39.field4095) {
                                    class312.method2156(var39, true);
                                }
                            }
                            if (var38 < class309.field5248) {
                                class245 var40 = var32[var34][var38];
                                if (var40 != null && var40.field4095) {
                                    class312.method2156(var40, true);
                                }
                            }
                        }
                        if (var35 < class245.field4096) {
                            if (var37 >= class259.field4332) {
                                class245 var41 = var32[var35][var37];
                                if (var41 != null && var41.field4095) {
                                    class312.method2156(var41, true);
                                }
                            }
                            if (var38 < class309.field5248) {
                                class245 var42 = var32[var35][var38];
                                if (var42 != null && var42.field4095) {
                                    class312.method2156(var42, true);
                                }
                            }
                        }
                        if (class300.field5138 == 0) {
                            if (!var22) {
                                class274.field4719 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class238.field3974; var43 < class105.field1732; var43++) {
            class245[][] var44 = class120.field2010[var43];
            for (int var45 = -class286.field4918; var45 <= 0; var45++) {
                int var46 = class33.field469 + var45;
                int var47 = class33.field469 - var45;
                if (var46 >= class224.field3631 || var47 < class245.field4096) {
                    for (int var48 = -class286.field4918; var48 <= 0; var48++) {
                        int var49 = class88.field1390 + var48;
                        int var50 = class88.field1390 - var48;
                        if (var46 >= class224.field3631) {
                            if (var49 >= class259.field4332) {
                                class245 var51 = var44[var46][var49];
                                if (var51 != null && var51.field4095) {
                                    class312.method2156(var51, false);
                                }
                            }
                            if (var50 < class309.field5248) {
                                class245 var52 = var44[var46][var50];
                                if (var52 != null && var52.field4095) {
                                    class312.method2156(var52, false);
                                }
                            }
                        }
                        if (var47 < class245.field4096) {
                            if (var49 >= class259.field4332) {
                                class245 var53 = var44[var47][var49];
                                if (var53 != null && var53.field4095) {
                                    class312.method2156(var53, false);
                                }
                            }
                            if (var50 < class309.field5248) {
                                class245 var54 = var44[var47][var50];
                                if (var54 != null && var54.field4095) {
                                    class312.method2156(var54, false);
                                }
                            }
                        }
                        if (class300.field5138 == 0) {
                            if (!var22) {
                                class274.field4719 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class274.field4719 = false;
    }

    @OriginalMember(owner = "client!jc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 621)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3487++;
        if (class262.field4365 != null) {
            class37.field550 = 0;
            class155.field2530 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
