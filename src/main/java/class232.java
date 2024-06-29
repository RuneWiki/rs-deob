import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class232 {

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "J")
    public long field4027 = 0L;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field4020 = -1;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Ljf;")
    private static class229 field4024 = class212.method1457((byte) 79, "scroll:");

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Ljf;")
    public static class229 field4032 = field4024;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Ljf;")
    public static class229 field4012 = field4024;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Ljf;")
    public static class229 field4030 = class212.method1457((byte) 98, "::clientdrop");

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "[I")
    public static int[] field4039 = new int[50];

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "F")
    public static float field4031;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lhg;")
    public class174 field4016;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lhg;")
    public class174 field4028;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[I")
    public static int[] field4025;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "[Lrm;")
    public static class248[] field4034;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 7)
    public static final void method1664(int arg0, int arg1) {
        field4033++;
        class150.field2590.method231((byte) 113, arg1);
        client.field4463.method231((byte) 113, arg1);
        if (arg0 <= 28) {
            field4031 = -0.31483063F;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lfj;ILfj;)V", line = 26)
    public static final void method1665(class242 arg0, int arg1, class242 arg2) {
        field4026++;
        if (arg0.field4264 != null) {
            arg0.method1747((byte) -55);
        }
        arg0.field4273 = arg2;
        arg0.field4264 = arg2.field4264;
        arg0.field4264.field4273 = arg0;
        arg0.field4273.field4264 = arg0;
        if (arg1 != 2) {
            field4030 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 50)
    public static final void method1666(int arg0) {
        field4015++;
        class107.field1868.method226((byte) -122);
        int var1 = 51 % ((-arg0 - 33) / 53);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZIIIII)V", line = 64)
    public static final void method1667(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4018++;
        if (arg0) {
            class108.method743();
        }
        if (class155.field2641 != null && (arg3 != 3 || class221.field3771 != arg2 || class70.field1347 != arg5)) {
            class3.method18(-118, class215.field3689, class155.field2641);
            class155.field2641 = null;
        }
        if (arg3 == 3 && class155.field2641 == null) {
            class155.field2641 = class148.method1019(0, true, class215.field3689, arg5, 0, arg2);
            if (class155.field2641 != null) {
                class70.field1347 = arg5;
                class221.field3771 = arg2;
                class244.method1772(class215.field3689, 127);
            }
        }
        if (arg3 == arg4 && class155.field2641 == null) {
            method1667(true, true, -1, class186.field3269, arg4 ^ 0x0, -1, arg6);
            return;
        }
        Container var7;
        if (class155.field2641 != null) {
            var7 = class155.field2641;
        } else if (class112.field2031 == null) {
            var7 = class215.field3689.field3461;
        } else {
            var7 = class112.field2031;
        }
        class115.field2067 = var7.getSize().width;
        class189.field3301 = var7.getSize().height;
        if (class112.field2031 == var7) {
            Insets var8 = class112.field2031.getInsets();
            class189.field3301 -= var8.top + var8.bottom;
            class115.field2067 -= var8.right + var8.left;
        }
        if (arg3 < 2) {
            class78.field1429 = 503;
            class10.field113 = (class115.field2067 - 765) / 2;
            class126.field2246 = 0;
            class175.field3046 = 765;
        } else {
            class126.field2246 = 0;
            class78.field1429 = class189.field3301;
            class175.field3046 = class115.field2067;
            class10.field113 = 0;
        }
        if (arg1) {
            class328.method2231(class299.field5100, -1);
            class109.method779(class299.field5100, (byte) -96);
            if (class329.field5608 != null) {
                class329.field5608.method583(false, class299.field5100);
            }
            class15.field223.method723((byte) -89);
            class81.method573(4096, class299.field5100);
            class312.method2114(-7767, class299.field5100);
            if (class329.field5608 != null) {
                class329.field5608.method579(-26357, class299.field5100);
            }
        } else {
            if (class108.field1900) {
                class108.method760(class175.field3046, class78.field1429);
            }
            class299.field5100.setSize(class175.field3046, class78.field1429);
            if (class112.field2031 == var7) {
                Insets var9 = class112.field2031.getInsets();
                class299.field5100.setLocation(class10.field113 + var9.left, var9.top - -class126.field2246);
            } else {
                class299.field5100.setLocation(class10.field113, class126.field2246);
            }
        }
        if (arg3 == 0 && arg6 > 0) {
            class108.method752(class299.field5100);
        }
        if (arg0 && arg3 > 0) {
            class299.field5100.setIgnoreRepaint(true);
            if (!class73.field1390) {
                class259.method1845();
                class172.field2977 = null;
                class172.field2977 = class102.method687(class175.field3046, class299.field5100, -123, class78.field1429);
                class114.method821();
                if (class325.field5482 == 5) {
                    class15.method148(true, class44.field796, true);
                } else {
                    class18.method178(false, (byte) -4, class47.field856);
                }
                try {
                    Graphics var10 = class299.field5100.getGraphics();
                    class172.field2977.method188(0, (byte) 42, 0, var10);
                } catch (Exception var14) {
                }
                class143.method998((byte) 59);
                if (arg6 == 0) {
                    class172.field2977 = class102.method687(765, class299.field5100, -124, 503);
                } else {
                    class172.field2977 = null;
                }
                class231 var12 = class215.field3689.method1379(class15.field223.getClass(), -47);
                while (var12.field4011 == 0) {
                    class235.method1675((byte) -22, 100L);
                }
                if (var12.field4011 == 1) {
                    class73.field1390 = true;
                }
            }
            if (class73.field1390) {
                class108.method746(class299.field5100, class252.field4406 * 2);
            }
        }
        if (!class108.field1900 && arg3 > 0) {
            method1667(true, true, -1, 0, 3, -1, arg6);
            return;
        }
        if (arg3 > 0 && arg6 == 0) {
            class290.field4971.setPriority(5);
            class172.field2977 = null;
            class32.method264();
            ((class275) class227.field3904).method1933(113, 200);
            if (class329.field5607) {
                class227.method1593(0.7F);
            }
        } else if (arg3 == 0 && arg6 > 0) {
            class290.field4971.setPriority(1);
            class172.field2977 = class102.method687(765, class299.field5100, -123, 503);
            class32.method290();
            class164.method1117();
            ((class275) class227.field3904).method1933(118, 20);
            if (class329.field5607) {
                if (class281.field4822 == 1) {
                    class227.method1593(0.9F);
                }
                if (class281.field4822 == 2) {
                    class227.method1593(0.8F);
                }
                if (class281.field4822 == 3) {
                    class227.method1593(0.7F);
                }
                if (class281.field4822 == 4) {
                    class227.method1593(0.6F);
                }
            }
            class37.method328();
        }
        class93.field1677 = !class110.method781((byte) 126);
        if (arg0) {
            class144.method1002(-1);
        }
        if (arg3 < 2) {
            class281.field4807 = false;
        } else {
            class281.field4807 = true;
        }
        if (class16.field263 != -1) {
            class287.method2005(true, arg4 ^ 0x76);
        }
        if (class160.field2720 != null && (class325.field5482 == 30 || class325.field5482 == 25)) {
            class30.method255((byte) -54);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class244.field4341[var13] = true;
        }
        class35.field660 = true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 313)
    public static void method1668(byte arg0) {
        field4030 = null;
        field4025 = null;
        field4012 = null;
        if (arg0 > 70) {
            field4034 = null;
            field4032 = null;
            field4039 = null;
            field4024 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V", line = 330)
    public static final void method1669(int arg0, int arg1) {
        if (arg1 == -17367) {
            field4022++;
            class73.field1392.method231((byte) 113, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V", line = 341)
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4023++;
        if (arg4 == arg6) {
            class308.method2096(arg1, arg7, arg2, arg4, arg0, 125, arg3);
            return;
        }
        if (arg0 - arg4 >= class149.field2578 && class327.field5490 >= arg0 + arg4 && class56.field991 <= arg7 - arg6 && arg6 + arg7 <= class142.field2458) {
            class278.method1954(arg2, arg6, 3, arg4, arg0, arg3, arg1, arg7);
        } else {
            class41.method352(-24061, arg6, arg3, arg4, arg0, arg1, arg2, arg7);
        }
        if (arg5 != 0) {
            method1667(true, false, 54, 0, 68, 99, 94);
        }
    }
}
