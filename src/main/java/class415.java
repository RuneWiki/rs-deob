import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class415 extends class7 {

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field6144 = -1;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public int field6133;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public int field6134;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public int field6135;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public int field6148;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lmo;")
    public static class447 field6131;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Ljava/lang/String;")
    public String field6138;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "[I")
    public int[] field6140;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "[I")
    public int[] field6142;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[Lbn;")
    public class256[] field6136;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field6147;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
    public static final int method2592(int arg0, byte arg1) {
        if (arg1 >= -42) {
            return -9;
        } else {
            field6143++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static final void method2593(int arg0) {
        field6132++;
        int var1 = 0;
        if (class377.field5695) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class162.method1126((byte) -74, var1);
        class94.method557(var1, (byte) 122);
        class58.method382(var1, 2);
        class374.method2386(var1, (byte) -36);
        class297.method2001((byte) -88, var1);
        class412.method2583(0, var1);
        class305.method2055(arg0 + 26515, var1);
        class261.method1796(var1, -96);
        class216.method1547(var1, false);
        if (~class262.field4219 == arg0) {
            class128.method953(16205, 28);
        } else if (class262.field4219 == 30) {
            class128.method953(16205, 25);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjd;Z)V")
    public static final void method2594(int arg0, class124 arg1, boolean arg2) {
        field6141++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field1840 > class183.field2987) {
            class321.method2133(arg1, 25498);
        } else if (class183.field2987 > arg1.field1888) {
            class36.method234(arg1, -2, false);
            var4 = field6145;
            var3 = class290.field4634;
        } else {
            class346.method2262((byte) 29, arg1);
        }
        if (arg1.field724 < 128 || arg1.field722 < 128 || (class80.field1003 - 1) * 128 <= arg1.field724 || class380.field5751 * 128 - 128 <= arg1.field722) {
            arg1.field1840 = 0;
            arg1.field1873 = -1;
            arg1.field1878 = -1;
            arg1.field1888 = 0;
            arg1.field724 = arg1.field1906[0] * 128 + (arg1.method903(-38) * 64);
            arg1.field722 = arg1.field1916[0] * 128 + (arg1.method903(-64) * 64);
            arg1.method908(true);
        }
        if (class261.field4201 == arg1 && (arg1.field724 < 1536 || arg1.field722 < 1536 || (class80.field1003 * 128 - 1536) <= arg1.field724 || arg1.field722 >= (class380.field5751 - 12) * 128)) {
            arg1.field1873 = -1;
            arg1.field1840 = 0;
            arg1.field1878 = -1;
            arg1.field1888 = 0;
            arg1.field724 = arg1.field1906[0] * 128 + arg1.method903(-59) * 64;
            arg1.field722 = arg1.field1916[0] * 128 + (arg1.method903(-81) * 64);
            arg1.method908(!arg2);
        }
        int var5 = class94.method552(arg1, !arg2);
        if (arg2) {
            method2596(115, 31, 88, 52);
        }
        class271.method1833(100, arg1, var5, var4, var3);
        class98.method742(79, arg1);
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
    public static final void method2595(int arg0) {
        field6146++;
        if (class31.field389 == 0) {
            return;
        }
        try {
            if (++class367.field5567 > 2000) {
                if (class421.field6216 != null) {
                    class421.field6216.method1098((byte) 111);
                    class421.field6216 = null;
                }
                if (class402.field6004 >= 1) {
                    class190.field3103 = -5;
                    class31.field389 = 0;
                    return;
                }
                if (class422.field6235 == class299.field4756) {
                    class299.field4756 = class196.field3170;
                } else {
                    class299.field4756 = class422.field6235;
                }
                class367.field5567 = 0;
                class31.field389 = 1;
                class402.field6004++;
            }
            if (arg0 <= -80) {
                if (class31.field389 == 1) {
                    class234.field3906 = class63.field822.method1894(0, class430.field6323, class299.field4756);
                    class31.field389 = 2;
                }
                if (class31.field389 == 2) {
                    if (class234.field3906.field304 == 2) {
                        throw new IOException();
                    }
                    if (class234.field3906.field304 != 1) {
                        return;
                    }
                    class421.field6216 = new class156((Socket) class234.field3906.field305, class63.field822);
                    class234.field3906 = null;
                    class421.field6216.method1101(class11.field139.field3066, 0, class11.field139.field3044, 3);
                    if (class441.field6457 != null) {
                        class441.field6457.method1546(2124);
                    }
                    if (class313.field4928 != null) {
                        class313.field4928.method1546(2124);
                    }
                    int var1 = class421.field6216.method1105(false);
                    if (class441.field6457 != null) {
                        class441.field6457.method1546(2124);
                    }
                    if (class313.field4928 != null) {
                        class313.field4928.method1546(2124);
                    }
                    if (var1 != 21) {
                        class190.field3103 = var1;
                        class31.field389 = 0;
                        class421.field6216.method1098((byte) 92);
                        class421.field6216 = null;
                        return;
                    }
                    class31.field389 = 3;
                }
                if (class31.field389 == 3) {
                    if (class421.field6216.method1102(30000) < 1) {
                        return;
                    }
                    class182.field2976 = new String[class421.field6216.method1105(false)];
                    class31.field389 = 4;
                }
                if (class31.field389 == 4 && class421.field6216.method1102(30000) >= (class182.field2976.length * 8)) {
                    class158.field2514.field3044 = 0;
                    class421.field6216.method1103(0, class158.field2514.field3066, class182.field2976.length * 8, 0);
                    for (int var2 = 0; var2 < class182.field2976.length; var2++) {
                        class182.field2976[var2] = class353.method2302(class158.field2514.method1290(false), 4);
                    }
                    class190.field3103 = 21;
                    class31.field389 = 0;
                    class421.field6216.method1098((byte) 76);
                    class421.field6216 = null;
                }
            }
        } catch (IOException var3) {
            if (class421.field6216 != null) {
                class421.field6216.method1098((byte) 96);
                class421.field6216 = null;
            }
            if (class402.field6004 >= 1) {
                class190.field3103 = -4;
                class31.field389 = 0;
            } else {
                class31.field389 = 1;
                if (class422.field6235 == class299.field4756) {
                    class299.field4756 = class196.field3170;
                } else {
                    class299.field4756 = class422.field6235;
                }
                class367.field5567 = 0;
                class402.field6004++;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    public static final void method2596(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg1 << 3;
        if (arg2 <= 58) {
            method2592(57, (byte) 72);
        }
        field6137++;
        int var6 = arg3 << 3;
        if (class13.field194 == 2) {
            class396.field5928 = var4;
            class264.field4261 = var6;
            class108.field1516 = var5;
        }
        class329.field5153 = (float) var5;
        class316.field4958 = (float) var4;
        class372.method2376(80);
        class324.field5089 = true;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
    public static void method2597(int arg0) {
        field6131 = null;
        int var1 = -61 / ((4 - arg0) / 54);
    }
}
