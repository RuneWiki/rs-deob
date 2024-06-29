import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class155 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lma;")
    private static class5 field2283 = class12.method119("Wed", (byte) 113);

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lma;")
    private static class5 field2285 = class12.method119("Tue", (byte) 117);

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lma;")
    private static class5 field2295 = class12.method119("Fri", (byte) 111);

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field2304 = 0;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lma;")
    private static class5 field2289 = class12.method119("Sat", (byte) 107);

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lma;")
    private static class5 field2301 = class12.method119("Sun", (byte) 74);

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lma;")
    private static class5 field2305 = class12.method119("Thu", (byte) 127);

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lma;")
    private static class5 field2299 = class12.method119("Mon", (byte) 68);

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[Lma;")
    public static class5[] field2293 = new class5[] { field2301, field2299, field2285, field2283, field2305, field2295, field2289 };

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!sg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 13)
    public final void focusGained(FocusEvent arg0) {
        field2294++;
    }

    @OriginalMember(owner = "client!sg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 28)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2298++;
        if (class265.field4536 != null) {
            class106.field1581 = 0;
            class1.field1 = arg0.getX();
            class245.field4069 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZ)V", line = 45)
    public static final void method992(int arg0, int arg1, int arg2, boolean arg3) {
        field2284++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2 <= -8) {
            class37.field591 = arg3;
            class138.field2049 = arg1;
            class290.field4937 = arg0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lpl;", line = 71)
    public static final class264 method993(int arg0, int arg1) {
        field2296++;
        if (arg0 != 2514) {
            field2283 = (class5) null;
        }
        if (arg1 == 0) {
            return new class116();
        } else if (arg1 == 1) {
            return new class47();
        } else if (arg1 == 2) {
            return new class102();
        } else if (arg1 == 3) {
            return new class141();
        } else if (arg1 == 4) {
            return new class241();
        } else if (arg1 == 5) {
            return new class93();
        } else if (arg1 == 6) {
            return new class161();
        } else if (arg1 == 7) {
            return new class248();
        } else if (arg1 == 8) {
            return new class67();
        } else if (arg1 == 9) {
            return new class131();
        } else if (arg1 == 10) {
            return new class70();
        } else if (arg1 == 11) {
            return new class200();
        } else if (arg1 == 12) {
            return new class188();
        } else if (arg1 == 13) {
            return new class118();
        } else if (arg1 == 14) {
            return new class88();
        } else if (arg1 == 15) {
            return new class268();
        } else if (arg1 == 16) {
            return new class208();
        } else if (arg1 == 17) {
            return new class111();
        } else if (arg1 == 18) {
            return new class165();
        } else if (arg1 == 19) {
            return new class60();
        } else if (arg1 == 20) {
            return new class55();
        } else if (arg1 == 21) {
            return new class190();
        } else if (arg1 == 22) {
            return new class15();
        } else if (arg1 == 23) {
            return new class123();
        } else if (arg1 == 24) {
            return new class182();
        } else if (arg1 == 25) {
            return new class49();
        } else if (arg1 == 26) {
            return new class287();
        } else if (arg1 == 27) {
            return new class261();
        } else if (arg1 == 28) {
            return new class193();
        } else if (arg1 == 29) {
            return new class262();
        } else if (arg1 == 30) {
            return new class179();
        } else if (arg1 == 31) {
            return new class76();
        } else if (arg1 == 32) {
            return new class11();
        } else if (arg1 == 33) {
            return new class65();
        } else if (arg1 == 34) {
            return new class156();
        } else if (arg1 == 35) {
            return new class1();
        } else if (arg1 == 36) {
            return new class113();
        } else if (arg1 == 37) {
            return new class157();
        } else if (arg1 == 38) {
            return new class257();
        } else if (arg1 == 39) {
            return new class103();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[[[BIBII)V", line = 390)
    public static final void method994(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class172.field2645++;
        class77.field1205 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class286.field4820; var12 < class168.field2570; var12++) {
            class198[][] var13 = class43.field646[var12];
            for (int var14 = class70.field1111; var14 < class72.field1132; var14++) {
                for (int var15 = class74.field1159; var15 < class80.field1242; var15++) {
                    class198 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class251.field4166[var14 + class147.field2137 - class195.field3038][var15 + class147.field2137 - class103.field1537] && arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5) {
                            var16.field3157 = true;
                            var16.field3143 = true;
                            if (var16.field3162 > 0) {
                                var16.field3163 = true;
                            } else {
                                var16.field3163 = false;
                            }
                            class77.field1205++;
                        } else {
                            var16.field3157 = false;
                            var16.field3143 = false;
                            var16.field3147 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3149 != null) {
                                    class89 var17 = var16.field3149;
                                    var17.field1337.method492(var17.field1331, var17.field1330, -33, var17.field1331, var17.field1330);
                                    if (var17.field1326 != null) {
                                        var17.field1326.method492(var17.field1331, var17.field1330, 119, var17.field1331, var17.field1330);
                                    }
                                }
                                if (var16.field3144 != null) {
                                    class133 var18 = var16.field3144;
                                    var18.field1971.method492(var18.field1972, var18.field1973, 120, var18.field1972, var18.field1973);
                                    if (var18.field1977 != null) {
                                        var18.field1977.method492(var18.field1972, var18.field1973, 124, var18.field1972, var18.field1973);
                                    }
                                }
                                if (var16.field3158 != null) {
                                    class51 var19 = var16.field3158;
                                    var19.field809.method492(var19.field810, var19.field812, -111, var19.field810, var19.field812);
                                }
                                if (var16.field3166 != null) {
                                    for (int var20 = 0; var20 < var16.field3162; var20++) {
                                        class107 var21 = var16.field3166[var20];
                                        var21.field1589.method492(var21.field1595, var21.field1597, -92, var21.field1598, var21.field1587);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class208.field3304 == class181.field2769;
        GL var23 = class45.field688;
        var23.glPushMatrix();
        var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        if (var22) {
            class91.method597();
            class264.method1814(3, -1, (byte) 86);
            class257.field4397 = true;
            class3.method18();
            class69.field1093 = -1;
            class170.field2617 = -1;
            for (int var24 = 0; var24 < class280.field4749[0].length; var24++) {
                class56 var25 = class280.field4749[0][var24];
                float var26 = 251.5F - (var25.field870 ? 1.0F : 0.5F);
                if (class69.field1093 != var25.field896) {
                    class69.field1093 = var25.field896;
                    class116.method760(var25.field896, 81);
                    class293.method1977(class141.method905(false));
                }
                var25.method427(class43.field646, var26, false);
            }
            class3.method14();
        } else {
            for (int var27 = class286.field4820; var27 < class168.field2570; var27++) {
                for (int var28 = 0; var28 < class280.field4749[var27].length; var28++) {
                    class56 var29 = class280.field4749[var27][var28];
                    float var30 = 201.5F - (float) var27 * 50.0F - (var29.field870 ? 1.0F : 0.5F);
                    if (var29.field883 != -1 && class229.field3802.method1099((byte) -82, var29.field883) == 4 && class265.field4531) {
                        class116.method760(var29.field896, 95);
                    }
                    var29.method427(class43.field646, var30, false);
                }
                if (var27 == 0 && class236.field3895 > 0) {
                    class45.method315(101.5F);
                    class134.method880(class195.field3038, class103.field1537, class147.field2137, arg1, class251.field4166, class208.field3304[0]);
                }
            }
            class53.method407(class195.field3038, class103.field1537, class43.field646);
        }
        var23.glPopMatrix();
        for (int var31 = class286.field4820; var31 < class168.field2570; var31++) {
            class198[][] var32 = class43.field646[var31];
            for (int var33 = -class147.field2137; var33 <= 0; var33++) {
                int var34 = class195.field3038 + var33;
                int var35 = class195.field3038 - var33;
                if (var34 >= class70.field1111 || var35 < class72.field1132) {
                    for (int var36 = -class147.field2137; var36 <= 0; var36++) {
                        int var37 = class103.field1537 + var36;
                        int var38 = class103.field1537 - var36;
                        if (var34 >= class70.field1111) {
                            if (var37 >= class74.field1159) {
                                class198 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3157) {
                                    class249.method1737(var39, true);
                                }
                            }
                            if (var38 < class80.field1242) {
                                class198 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3157) {
                                    class249.method1737(var40, true);
                                }
                            }
                        }
                        if (var35 < class72.field1132) {
                            if (var37 >= class74.field1159) {
                                class198 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3157) {
                                    class249.method1737(var41, true);
                                }
                            }
                            if (var38 < class80.field1242) {
                                class198 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3157) {
                                    class249.method1737(var42, true);
                                }
                            }
                        }
                        if (class77.field1205 == 0) {
                            if (!var22) {
                                class101.field1516 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class286.field4820; var43 < class168.field2570; var43++) {
            class198[][] var44 = class43.field646[var43];
            for (int var45 = -class147.field2137; var45 <= 0; var45++) {
                int var46 = class195.field3038 + var45;
                int var47 = class195.field3038 - var45;
                if (var46 >= class70.field1111 || var47 < class72.field1132) {
                    for (int var48 = -class147.field2137; var48 <= 0; var48++) {
                        int var49 = class103.field1537 + var48;
                        int var50 = class103.field1537 - var48;
                        if (var46 >= class70.field1111) {
                            if (var49 >= class74.field1159) {
                                class198 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3157) {
                                    class249.method1737(var51, false);
                                }
                            }
                            if (var50 < class80.field1242) {
                                class198 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3157) {
                                    class249.method1737(var52, false);
                                }
                            }
                        }
                        if (var47 < class72.field1132) {
                            if (var49 >= class74.field1159) {
                                class198 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3157) {
                                    class249.method1737(var53, false);
                                }
                            }
                            if (var50 < class80.field1242) {
                                class198 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3157) {
                                    class249.method1737(var54, false);
                                }
                            }
                        }
                        if (class77.field1205 == 0) {
                            if (!var22) {
                                class101.field1516 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class101.field1516 = false;
    }

    @OriginalMember(owner = "client!sg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 757)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class265.field4536 != null) {
            class106.field1581 = 0;
            class1.field1 = arg0.getX();
            class245.field4069 = arg0.getY();
        }
        field2290++;
    }

    @OriginalMember(owner = "client!sg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 778)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2306++;
        if (class265.field4536 != null) {
            class106.field1581 = 0;
            class133.field1982 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V", line = 821)
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2297++;
        int var6 = class76.method533(class294.field4956, arg4, true, class101.field1505);
        int var7 = class76.method533(class294.field4956, arg2, true, class101.field1505);
        int var8 = class76.method533(class57.field899, arg0, true, class301.field5073);
        int var9 = class76.method533(class57.field899, arg1, true, class301.field5073);
        for (int var10 = var6; var10 <= var7; var10++) {
            class239.method1690(var8, 23267, var9, class137.field2032[var10], arg3);
        }
        if (arg5 != 1004) {
            field2299 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 849)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2288++;
        if (class265.field4536 != null) {
            class106.field1581 = 0;
            class1.field1 = arg0.getX();
            class245.field4069 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 866)
    public static void method996(int arg0) {
        field2283 = null;
        if (arg0 != -1) {
            method997(true);
        }
        field2301 = null;
        field2289 = null;
        field2293 = null;
        field2285 = null;
        field2305 = null;
        field2299 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!sg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 895)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class265.field4536 != null) {
            class106.field1581 = 0;
            class1.field1 = -1;
            class245.field4069 = -1;
        }
        field2292++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 915)
    public static final void method997(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2307++;
        int var1 = class261.field4462;
        int var2 = class18.field307;
        int var3 = class209.field3323;
        int var4 = class86.field1305;
        int var5 = 6116423;
        class124.method826(var2, var1, var3, var4, var5);
        class124.method826(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class124.method823(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class201.field3197.method2032(class111.field1651, var2 + 3, var1 + 14, var5, -1);
        int var6 = class18.field308;
        int var7 = class271.field4636;
        for (int var8 = 0; var8 < class282.field4794; var8++) {
            int var9 = var1 + ((-var8 + class282.field4794 - 1) * 15) + 31;
            int var10 = 16777215;
            if (var7 > var2 && var7 < (var2 + var3) && var6 > (var9 - 13) && (var9 + 3) > var6) {
                var10 = 16776960;
            }
            class201.field3197.method2032(class104.method663(0, var8), var2 + 3, var9, var10, 0);
        }
        class46.method344(class86.field1305, class261.field4462, class209.field3323, class18.field307, false);
    }

    @OriginalMember(owner = "client!sg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 964)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class265.field4536 != null) {
            class133.field1982 = 0;
        }
        field2287++;
    }

    @OriginalMember(owner = "client!sg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 976)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2286++;
    }

    @OriginalMember(owner = "client!sg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 992)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2302++;
        if (class265.field4536 != null) {
            class106.field1581 = 0;
            class100.field1488 = arg0.getX();
            class221.field3650 = arg0.getY();
            class14.field265 = class212.method1404((byte) -103);
            if (arg0.isMetaDown()) {
                class62.field962 = 2;
                class133.field1982 = 2;
            } else {
                class62.field962 = 1;
                class133.field1982 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
