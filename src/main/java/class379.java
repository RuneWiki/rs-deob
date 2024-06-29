import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class379 extends class547 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "Ldc;")
    private class302 field5711 = new class302();

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "Ldc;")
    private class302 field5716 = new class302();

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "Z")
    private boolean field5720;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Z")
    public static boolean field5684 = false;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    public static int field5696 = -1;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "Lvg;")
    public static class622 field5698 = new class622(72, -1);

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "F")
    public static float field5707;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    private int field5686;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    private int field5687;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    private int field5712;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    private int field5713;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    private int field5717;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "Ljava/awt/Component;")
    private Component field5719;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "[[Lps;")
    public static class5[][] field5710;

    @OriginalMember(owner = "client!gt", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5714++;
    }

    @OriginalMember(owner = "client!gt", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5703++;
        this.method2345(arg0.getY(), arg0.getX(), -24903);
    }

    @OriginalMember(owner = "client!gt", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2345(arg0.getY(), arg0.getX(), -24903);
        field5694++;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Z")
    public final boolean method2337(int arg0) {
        if (arg0 > -49) {
            this.method2340(-59);
        }
        field5683++;
        return (this.field5686 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gt", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5705++;
        int var2 = this.method2343(arg0, -99);
        if ((var2 & this.field5713) == 0) {
            var2 = this.field5713;
        }
        if ((var2 & 0x1) != 0) {
            this.method2339(-328983796, arg0.getY(), 3, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2339(-328983796, arg0.getY(), 5, arg0.getClickCount(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2339(-328983796, arg0.getY(), 4, arg0.getClickCount(), arg0.getX());
        }
        this.field5713 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)I")
    public final int method2338(byte arg0) {
        int var2 = 119 / ((arg0 + 12) / 47);
        field5690++;
        return this.field5712;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)V")
    private final void method2339(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5682++;
        class118 var6 = new class118();
        var6.field1767 = arg2;
        var6.field1759 = arg4;
        var6.field1757 = arg3;
        var6.field1763 = arg1;
        if (arg0 == -328983796) {
            var6.field1762 = class60.method371(false);
            this.field5716.method1909(var6, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
    public final int method2340(int arg0) {
        if (arg0 == 40960) {
            field5706++;
            return this.field5687;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!gt", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5688++;
        int var2 = this.method2343(arg0, -119);
        if (var2 == 1) {
            this.method2339(-328983796, arg0.getY(), 0, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 4) {
            this.method2339(-328983796, arg0.getY(), 2, arg0.getClickCount(), arg0.getX());
        } else if (var2 == 2) {
            this.method2339(-328983796, arg0.getY(), 1, arg0.getClickCount(), arg0.getX());
        }
        this.field5713 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IIIII)V")
    public static final void method2341(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5700++;
        if (class36.field566 == 1) {
            class306.field4531[class216.field2892 / 100].method1534(class347.field5149 - 8, class584.field8482 + -8);
        }
        if (class36.field566 == 2) {
            class306.field4531[class216.field2892 / 100 + 4].method1534(class347.field5149 - 8, class584.field8482 + -8);
        }
        class581.method3334(true);
        if (arg3 > -116) {
            method2352(false, 75);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public final synchronized void method2342(byte arg0) {
        this.field5686 = this.field5713;
        this.field5687 = this.field5718;
        field5691++;
        this.field5712 = this.field5717;
        class302 var2 = this.field5711;
        this.field5711 = this.field5716;
        this.field5716 = var2;
        if (arg0 != -32) {
            this.field5711 = null;
        }
        this.field5716.method1905(arg0 ^ 0xFFFFFFE0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method2343(MouseEvent arg0, int arg1) {
        if (arg1 > -86) {
            return 96;
        }
        field5699++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V")
    public final void method2344(boolean arg0) {
        this.method2354((byte) 117);
        if (!arg0) {
            this.field5713 = 46;
        }
        field5697++;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)V")
    private final void method2345(int arg0, int arg1, int arg2) {
        this.field5718 = arg1;
        if (arg2 != -24903) {
            this.field5719 = null;
        }
        this.field5717 = arg0;
        field5709++;
        if (this.field5720) {
            this.method2339(-328983796, arg0, -1, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Lls;")
    public final class147 method2346(boolean arg0) {
        if (!arg0) {
            this.field5713 = 103;
        }
        field5693++;
        return (class147) this.field5711.method1902(107);
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)V")
    public static void method2347(int arg0) {
        field5698 = null;
        field5710 = null;
        if (arg0 >= -29) {
            field5698 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Z")
    public final boolean method2348(byte arg0) {
        field5704++;
        if (arg0 != -69) {
            field5684 = false;
        }
        return (this.field5686 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(FFFB)F")
    public static final float method2349(float arg0, float arg1, float arg2, byte arg3) {
        field5702++;
        if (arg3 != -57) {
            field5684 = true;
        }
        return (arg1 - arg2) * arg0 + arg2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2350(byte arg0, Component arg1) {
        field5689++;
        this.method2354((byte) 43);
        this.field5719 = arg1;
        this.field5719.addMouseListener(this);
        this.field5719.addMouseMotionListener(this);
        if (arg0 < 120) {
            this.field5716 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Z")
    public final boolean method2351(int arg0) {
        if (arg0 != 17452) {
            field5684 = false;
        }
        field5715++;
        return (this.field5686 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gt", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2345(arg0.getY(), arg0.getX(), -24903);
        field5701++;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2352(boolean arg0, int arg1) {
        field5685++;
        if (arg1 != -1) {
            field5696 = 102;
        }
        boolean var2 = class332.field4821.method705();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class332.field4821.method653();
        } else if (!class332.field4821.method650()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class335.field4872.field9473 = arg0;
            class335.field4872.method3442(class61.field978, 122);
            return true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5708++;
        if (arg5 > 2000 || arg0 > 2000 || arg2 > 2000 || arg6 > 2000 || arg9 > 2000 || arg8 > 2000) {
            return false;
        } else if (arg5 < -2000 || arg0 < -2000 || arg2 < -2000 || arg6 < -2000 || arg9 < -2000 || arg8 < -2000) {
            return false;
        } else if (arg3 <= 105) {
            return true;
        } else {
            if (class432.field6277 == 2) {
                int var10 = arg6 + (class76.field1228 * arg5);
                if (var10 >= 0 && var10 < class351.field5202.length && class351.field5202[var10] > (arg7 << 8) - 38400) {
                    return false;
                }
                int var11 = class76.field1228 * arg0 + arg9;
                if (var11 >= 0 && var11 < class351.field5202.length && class351.field5202[var11] > (arg1 << 8) - 38400) {
                    return false;
                }
                int var12 = class76.field1228 * arg2 + arg8;
                if (var12 >= 0 && var12 < class351.field5202.length && ((arg4 << 8) - 38400) < class351.field5202[var12]) {
                    return false;
                }
            }
            int var13 = arg9 - arg6;
            int var14 = arg0 - arg5;
            int var15 = arg8 - arg6;
            int var16 = arg2 - arg5;
            int var17 = arg1 - arg7;
            if (arg5 < arg0 && arg2 < arg2) {
                if (arg2 < arg0) {
                    arg0++;
                } else {
                    arg2++;
                }
                arg5--;
            } else if (arg2 <= arg0) {
                if (arg0 < arg5) {
                    arg5++;
                } else {
                    arg0++;
                }
                arg2--;
            } else {
                if (arg2 >= arg5) {
                    arg2++;
                } else {
                    arg5++;
                }
                arg0--;
            }
            int var18 = arg4 - arg7;
            int var19 = 0;
            if (arg0 != arg5) {
                var19 = (arg9 - arg6 << 12) / (arg0 - arg5);
            }
            int var20 = 0;
            if (arg0 != arg2) {
                var20 = (arg8 - arg9 << 12) / (arg2 - arg0);
            }
            int var21 = 0;
            if (arg2 != arg5) {
                var21 = (arg6 - arg8 << 12) / (arg5 - arg2);
            }
            int var22 = var13 * var16 - var14 * var15;
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg0 >= arg5 && arg2 >= arg5) {
                if (arg5 >= class645.field9297) {
                    return true;
                }
                if (arg0 > class645.field9297) {
                    arg0 = class645.field9297;
                }
                if (class645.field9297 < arg2) {
                    arg2 = class645.field9297;
                }
                int var25 = (arg7 << 8) + var23 - (arg6 * var23);
                if (arg0 >= arg2) {
                    int var26;
                    int var27 = var26 = arg6 << 12;
                    if (arg5 < 0) {
                        var25 -= arg5 * var24;
                        var26 -= arg5 * var19;
                        var27 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var28 = arg8 << 12;
                    if (arg2 < 0) {
                        var28 -= arg2 * var20;
                        arg2 = 0;
                    }
                    if (arg2 != arg5 && var21 < var19 || arg2 == arg5 && var20 > var19) {
                        int var29 = arg0 - arg2;
                        int var30 = arg2 - arg5;
                        int var31 = class76.field1228 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var26 >> 12) + 1, (byte) 77, (var28 >> 12) - 1, class351.field5202, var31, var23, 0, var25)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var31 += class76.field1228;
                                    var26 += var19;
                                    var25 += var24;
                                }
                            }
                            if (!class408.method2503((var26 >> 12) + 1, (byte) 95, (var27 >> 12) - 1, class351.field5202, var31, var23, 0, var25)) {
                                return false;
                            }
                            var31 += class76.field1228;
                            var27 += var21;
                            var25 += var24;
                            var26 += var19;
                        }
                    } else {
                        int var32 = arg0 - arg2;
                        int var33 = arg2 - arg5;
                        int var34 = class76.field1228 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var28 >> 12) + 1, (byte) 83, (var26 >> 12) - 1, class351.field5202, var34, var23, 0, var25)) {
                                        return false;
                                    }
                                    var26 += var19;
                                    var34 += class76.field1228;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class408.method2503((var27 >> 12) + 1, (byte) -110, (var26 >> 12) - 1, class351.field5202, var34, var23, 0, var25)) {
                                return false;
                            }
                            var34 += class76.field1228;
                            var25 += var24;
                            var27 += var21;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg6 << 12;
                    if (arg5 < 0) {
                        var25 -= arg5 * var24;
                        var36 -= arg5 * var21;
                        var35 -= arg5 * var19;
                        arg5 = 0;
                    }
                    int var37 = arg9 << 12;
                    if (arg0 < 0) {
                        var37 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg0 != arg5 && var21 < var19 || arg0 == arg5 && var20 < var21) {
                        int var38 = arg2 - arg0;
                        int var39 = arg0 - arg5;
                        int var40 = class76.field1228 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var37 >> 12) + 1, (byte) 78, (var36 >> 12) - 1, class351.field5202, var40, var23, 0, var25)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var40 += class76.field1228;
                                    var25 += var24;
                                    var36 += var21;
                                }
                            }
                            if (!class408.method2503((var35 >> 12) + 1, (byte) -64, (var36 >> 12) - 1, class351.field5202, var40, var23, 0, var25)) {
                                return false;
                            }
                            var36 += var21;
                            var40 += class76.field1228;
                            var25 += var24;
                            var35 += var19;
                        }
                    } else {
                        int var41 = arg2 - arg0;
                        int var42 = arg0 - arg5;
                        int var43 = class76.field1228 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var36 >> 12) + 1, (byte) 97, (var37 >> 12) - 1, class351.field5202, var43, var23, 0, var25)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var36 += var21;
                                    var43 += class76.field1228;
                                    var25 += var24;
                                }
                            }
                            if (!class408.method2503((var36 >> 12) + 1, (byte) 95, (var35 >> 12) - 1, class351.field5202, var43, var23, 0, var25)) {
                                return false;
                            }
                            var25 += var24;
                            var35 += var19;
                            var36 += var21;
                            var43 += class76.field1228;
                        }
                    }
                }
            } else if (arg0 <= arg2) {
                if (class645.field9297 <= arg0) {
                    return true;
                }
                if (arg5 > class645.field9297) {
                    arg5 = class645.field9297;
                }
                if (class645.field9297 < arg2) {
                    arg2 = class645.field9297;
                }
                int var44 = (arg1 << 8) + var23 - (arg9 * var23);
                if (arg5 > arg2) {
                    int var45;
                    int var46 = var45 = arg9 << 12;
                    int var47 = arg8 << 12;
                    if (arg0 < 0) {
                        var46 -= arg0 * var19;
                        var44 -= arg0 * var24;
                        var45 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg2 < 0) {
                        var47 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if ((arg0 == arg2 || var19 >= var20) && (arg0 != arg2 || var21 >= var19)) {
                        int var51 = arg5 - arg2;
                        int var52 = arg2 - arg0;
                        int var53 = class76.field1228 * arg0;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var46 >> 12) + 1, (byte) 126, (var47 >> 12) - 1, class351.field5202, var53, var23, 0, var44)) {
                                        return false;
                                    }
                                    var53 += class76.field1228;
                                    var44 += var24;
                                    var46 += var19;
                                    var47 += var21;
                                }
                            }
                            if (!class408.method2503((var46 >> 12) + 1, (byte) 86, (var45 >> 12) - 1, class351.field5202, var53, var23, 0, var44)) {
                                return false;
                            }
                            var44 += var24;
                            var45 += var20;
                            var46 += var19;
                            var53 += class76.field1228;
                        }
                    } else {
                        int var48 = arg5 - arg2;
                        int var49 = arg2 - arg0;
                        int var50 = class76.field1228 * arg0;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var47 >> 12) + 1, (byte) -103, (var46 >> 12) - 1, class351.field5202, var50, var23, 0, var44)) {
                                        return false;
                                    }
                                    var50 += class76.field1228;
                                    var47 += var21;
                                    var46 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class408.method2503((var45 >> 12) + 1, (byte) -122, (var46 >> 12) - 1, class351.field5202, var50, var23, 0, var44)) {
                                return false;
                            }
                            var44 += var24;
                            var45 += var20;
                            var46 += var19;
                            var50 += class76.field1228;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg9 << 12;
                    if (arg0 < 0) {
                        var55 -= arg0 * var19;
                        var44 -= arg0 * var24;
                        var54 -= arg0 * var20;
                        arg0 = 0;
                    }
                    int var56 = arg6 << 12;
                    if (arg5 < 0) {
                        var56 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var19 < var20) {
                        int var57 = arg2 - arg5;
                        int var58 = arg5 - arg0;
                        int var59 = class76.field1228 * arg0;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var54 >> 12) + 1, (byte) -126, (var56 >> 12) - 1, class351.field5202, var59, var23, 0, var44)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var54 += var20;
                                    var59 += class76.field1228;
                                    var56 += var21;
                                }
                            }
                            if (!class408.method2503((var54 >> 12) + 1, (byte) -80, (var55 >> 12) - 1, class351.field5202, var59, var23, 0, var44)) {
                                return false;
                            }
                            var59 += class76.field1228;
                            var54 += var20;
                            var55 += var19;
                            var44 += var24;
                        }
                    } else {
                        int var60 = arg2 - arg5;
                        int var61 = arg5 - arg0;
                        int var62 = class76.field1228 * arg0;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var56 >> 12) + 1, (byte) 102, (var54 >> 12) - 1, class351.field5202, var62, var23, 0, var44)) {
                                        return false;
                                    }
                                    var56 += var21;
                                    var62 += class76.field1228;
                                    var44 += var24;
                                    var54 += var20;
                                }
                            }
                            if (!class408.method2503((var55 >> 12) + 1, (byte) 50, (var54 >> 12) - 1, class351.field5202, var62, var23, 0, var44)) {
                                return false;
                            }
                            var62 += class76.field1228;
                            var55 += var19;
                            var54 += var20;
                            var44 += var24;
                        }
                    }
                }
            } else if (arg2 >= class645.field9297) {
                return true;
            } else {
                if (class645.field9297 < arg0) {
                    arg0 = class645.field9297;
                }
                int var63 = (arg4 << 8) + var23 - arg8 * var23;
                if (arg5 > class645.field9297) {
                    arg5 = class645.field9297;
                }
                if (arg0 <= arg5) {
                    int var64;
                    int var65 = var64 = arg8 << 12;
                    int var66 = arg9 << 12;
                    if (arg2 < 0) {
                        var65 -= arg2 * var20;
                        var63 -= arg2 * var24;
                        var64 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if (arg0 < 0) {
                        var66 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var21 <= var20) {
                        int var67 = arg5 - arg0;
                        int var68 = arg0 - arg2;
                        int var69 = class76.field1228 * arg2;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var66 >> 12) + 1, (byte) 67, (var64 >> 12) - 1, class351.field5202, var69, var23, 0, var63)) {
                                        return false;
                                    }
                                    var64 += var21;
                                    var63 += var24;
                                    var69 += class76.field1228;
                                    var66 += var19;
                                }
                            }
                            if (!class408.method2503((var65 >> 12) + 1, (byte) 92, (var64 >> 12) - 1, class351.field5202, var69, var23, 0, var63)) {
                                return false;
                            }
                            var69 += class76.field1228;
                            var65 += var20;
                            var64 += var21;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg5 - arg0;
                        int var71 = arg0 - arg2;
                        int var72 = class76.field1228 * arg2;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var64 >> 12) + 1, (byte) -50, (var66 >> 12) - 1, class351.field5202, var72, var23, 0, var63)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var64 += var21;
                                    var66 += var19;
                                    var72 += class76.field1228;
                                }
                            }
                            if (!class408.method2503((var64 >> 12) + 1, (byte) -109, (var65 >> 12) - 1, class351.field5202, var72, var23, 0, var63)) {
                                return false;
                            }
                            var64 += var21;
                            var63 += var24;
                            var65 += var20;
                            var72 += class76.field1228;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg8 << 12;
                    if (arg2 < 0) {
                        var73 -= arg2 * var21;
                        var63 -= arg2 * var24;
                        var74 -= arg2 * var20;
                        arg2 = 0;
                    }
                    int var75 = arg6 << 12;
                    if (arg5 < 0) {
                        var75 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var21 > var20) {
                        int var76 = arg0 - arg5;
                        int var77 = arg5 - arg2;
                        int var78 = class76.field1228 * arg2;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var75 >> 12) + 1, (byte) 49, (var74 >> 12) - 1, class351.field5202, var78, var23, 0, var63)) {
                                        return false;
                                    }
                                    var74 += var20;
                                    var78 += class76.field1228;
                                    var63 += var24;
                                    var75 += var19;
                                }
                            }
                            if (!class408.method2503((var73 >> 12) + 1, (byte) -114, (var74 >> 12) - 1, class351.field5202, var78, var23, 0, var63)) {
                                return false;
                            }
                            var63 += var24;
                            var78 += class76.field1228;
                            var73 += var21;
                            var74 += var20;
                        }
                    } else {
                        int var79 = arg0 - arg5;
                        int var80 = arg5 - arg2;
                        int var81 = class76.field1228 * arg2;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class408.method2503((var74 >> 12) + 1, (byte) -72, (var75 >> 12) - 1, class351.field5202, var81, var23, 0, var63)) {
                                        return false;
                                    }
                                    var74 += var20;
                                    var75 += var19;
                                    var63 += var24;
                                    var81 += class76.field1228;
                                }
                            }
                            if (!class408.method2503((var74 >> 12) + 1, (byte) 52, (var73 >> 12) - 1, class351.field5202, var81, var23, 0, var63)) {
                                return false;
                            }
                            var81 += class76.field1228;
                            var73 += var21;
                            var74 += var20;
                            var63 += var24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
    private final void method2354(byte arg0) {
        field5695++;
        if (this.field5719 == null) {
            return;
        }
        this.field5719.removeMouseMotionListener(this);
        this.field5719.removeMouseListener(this);
        this.field5687 = this.field5712 = this.field5686 = 0;
        this.field5718 = this.field5717 = this.field5713 = 0;
        if (arg0 <= 7) {
            this.field5713 = -53;
        }
        this.field5719 = null;
        this.field5711 = null;
        this.field5716 = null;
    }

    @OriginalMember(owner = "client!gt", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5692++;
        this.method2345(arg0.getY(), arg0.getX(), -24903);
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class379(Component arg0, boolean arg1) {
        this.method2350((byte) 124, arg0);
        this.field5720 = arg1;
    }
}
