import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class310 extends class71 {

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lim;")
    public static class192 field4843 = new class192(new byte[5000]);

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field4847 = 0;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "[[I")
    public static int[][] field4841;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[[I")
    public static int[][] field4846;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIBZZ)V", line = 8)
    public static final void method2166(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, boolean arg6) {
        field4839++;
        if (arg5) {
            class186.method1285();
        }
        if (class113.field1688 != null && (arg1 != 3 || class198.field3256 != arg0 || class80.field1213 != arg3)) {
            class66.method432(class113.field1688, class264.field4183, (byte) 108);
            class113.field1688 = null;
        }
        if (arg1 == 3 && class113.field1688 == null) {
            class113.field1688 = class151.method1059(0, class264.field4183, arg0, true, 0, arg3);
            if (class113.field1688 != null) {
                class80.field1213 = arg3;
                class198.field3256 = arg0;
                class255.method1794(150, class264.field4183);
            }
        }
        if (arg1 == 3 && class113.field1688 == null) {
            method2166(-1, class49.field674, arg2, -1, (byte) -127, true, true);
            return;
        }
        Container var7;
        if (class113.field1688 != null) {
            var7 = class113.field1688;
        } else if (class161.field2635 == null) {
            var7 = class264.field4183.field68;
        } else {
            var7 = class161.field2635;
        }
        class71.field910 = var7.getSize().width;
        class35.field460 = var7.getSize().height;
        if (class161.field2635 == var7) {
            Insets var8 = class161.field2635.getInsets();
            class71.field910 -= var8.right + var8.left;
            class35.field460 -= var8.top + var8.bottom;
        }
        if (arg4 > -110) {
            field4841 = (int[][]) ((int[][]) null);
        }
        if (arg1 < 2) {
            class210.field3432 = 503;
            class28.field398 = 0;
            class170.field2711 = (class71.field910 - 765) / 2;
            class160.field2601 = 765;
        } else {
            class210.field3432 = class35.field460;
            class170.field2711 = 0;
            class28.field398 = 0;
            class160.field2601 = class71.field910;
        }
        if (arg6) {
            class335.method2310(class338.field5247, -1);
            class214.method1565(class338.field5247, -22881);
            if (class238.field3771 != null) {
                class238.field3771.method404(class338.field5247, true);
            }
            class320.field4997.method2225(0);
            class291.method2040(class338.field5247, (byte) -122);
            class261.method1867(class338.field5247, true);
            if (class238.field3771 != null) {
                class238.field3771.method403(class338.field5247, -1);
            }
        } else {
            if (class186.field2991) {
                class186.method1304(class160.field2601, class210.field3432);
            }
            class338.field5247.setSize(class160.field2601, class210.field3432);
            if (class161.field2635 == var7) {
                Insets var9 = class161.field2635.getInsets();
                class338.field5247.setLocation(var9.left + class170.field2711, class28.field398 + var9.top);
            } else {
                class338.field5247.setLocation(class170.field2711, class28.field398);
            }
        }
        if (arg1 == 0 && arg2 > 0) {
            class186.method1310(class338.field5247);
        }
        if (arg5 && arg1 > 0) {
            class338.field5247.setIgnoreRepaint(true);
            if (!class112.field1674) {
                class125.method867();
                class289.field4563 = null;
                class289.field4563 = class26.method178(class338.field5247, -2, class160.field2601, class210.field3432);
                class216.method1583();
                if (class144.field2159 == 5) {
                    class139.method935(true, (byte) -115, class55.field732);
                } else {
                    class303.method2126(false, class288.field4533, -121);
                }
                try {
                    Graphics var10 = class338.field5247.getGraphics();
                    class289.field4563.method222(var10, 0, 0, 96);
                } catch (Exception var14) {
                }
                class80.method589((byte) -110);
                if (arg2 == 0) {
                    class289.field4563 = class26.method178(class338.field5247, -2, 765, 503);
                } else {
                    class289.field4563 = null;
                }
                class217 var12 = class264.field4183.method32(0, class320.field4997.getClass());
                while (var12.field3488 == 0) {
                    class20.method128(0, 100L);
                }
                if (var12.field3488 == 1) {
                    class112.field1674 = true;
                }
            }
            if (class112.field1674) {
                class186.method1279(class338.field5247, class330.field5138 * 2);
            }
        }
        if (!class186.field2991 && arg1 > 0) {
            method2166(-1, 0, arg2, -1, (byte) -127, true, true);
            return;
        }
        if (arg1 > 0 && arg2 == 0) {
            class312.field4856.setPriority(5);
            class289.field4563 = null;
            class76.method560();
            ((class270) class25.field365).method1928((byte) 103, 200);
            if (class269.field4250) {
                class25.method174(0.7F);
            }
            if (class274.field4345 == null) {
                class274.field4345 = new class21[13][13];
            }
            class47.method316(4, 104, 104);
            class32.method211(104, 104);
            class136.method926((byte) 74);
        } else if (arg1 == 0 && arg2 > 0) {
            class312.field4856.setPriority(1);
            class289.field4563 = class26.method178(class338.field5247, -2, 765, 503);
            class76.method562();
            class167.method1153();
            ((class270) class25.field365).method1928((byte) 103, 20);
            if (class269.field4250) {
                if (class91.field1404 == 1) {
                    class25.method174(0.9F);
                }
                if (class91.field1404 == 2) {
                    class25.method174(0.8F);
                }
                if (class91.field1404 == 3) {
                    class25.method174(0.7F);
                }
                if (class91.field1404 == 4) {
                    class25.method174(0.6F);
                }
            }
            class83.method613();
            class136.method926((byte) 74);
        }
        class49.field678 = !class152.method1062(122);
        if (arg5) {
            class246.method1751(-111);
        }
        if (arg1 >= 2) {
            class131.field1926 = true;
        } else {
            class131.field1926 = false;
        }
        if (class246.field3904 != -1) {
            class242.method1713(true, 86);
        }
        if (class69.field901 != null && (class144.field2159 == 30 || class144.field2159 == 25)) {
            class55.method391(1);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class284.field4485[var13] = true;
        }
        class300.field4697 = true;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 243)
    public static void method2167(int arg0) {
        field4843 = null;
        field4846 = (int[][]) null;
        if (arg0 != 765) {
            method2167(-4);
        }
        field4841 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBILkb;)Ln;", line = 264)
    public static final class298 method2168(int arg0, byte arg1, int arg2, class39 arg3) {
        field4840++;
        if (arg1 <= 71) {
            method2167(-87);
        }
        return class288.method2026(arg2, arg0, arg3, -107) ? class302.method2115((byte) 59) : null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBII)V", line = 282)
    public static final void method2169(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4842++;
        if (arg2 < 70) {
            return;
        }
        class179 var5 = class319.method2220(arg4, (byte) -98, 8);
        var5.method1242((byte) -128);
        var5.field2897 = arg1;
        var5.field2889 = arg3;
        var5.field2888 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 295)
    public class310() {
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V", line = 300)
    public class310(int arg0) {
        this.field4844 = arg0;
    }
}
