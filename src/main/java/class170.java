import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class170 extends Canvas {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field2651;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2645 = " is already on your friend list.";

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ltd;")
    public static class241 field2647;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 5)
    public static void method1236(byte arg0) {
        int var1 = -48 / ((41 - arg0) / 43);
        field2645 = null;
        field2647 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lja;B)V", line = 19)
    public static final void method1237(class64 arg0, byte arg1) {
        class159.field2512 = arg0;
        if (arg1 == -110) {
            field2652++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 30)
    public static final void method1238(byte arg0) {
        class29.method192();
        if (arg0 != 26) {
            return;
        }
        class217.field3481 = -1;
        field2650++;
        class329.field5088 = null;
        class116.method867(arg0 ^ 0x1A);
        class218.field3488.method2019((byte) -54);
        class95.field1563 = new class293();
        ((class203) class174.field2734).method1472(74);
        class38.field678 = 0;
        class38.field693 = new class306[255];
        class171.method1252();
        class69.method528();
        class115.method865(arg0 ^ 0x1A);
        class191.method1414(false, false);
        class36.method283(-124);
        for (int var1 = 0; var1 < 2048; var1++) {
            class30 var2 = class82.field1228[var1];
            if (var2 != null) {
                var2.field1381 = null;
            }
        }
        if (class265.field4126) {
            class69.method520(104, 104);
            class47.method367();
        }
        class84.method607(class210.field3356, class292.field4534, 29);
        class125.method941(class210.field3356, -18560);
        class62.field959 = null;
        class280.field4330 = null;
        class235.field3698 = null;
        class118.field1905 = null;
        class9.field149 = null;
        if (class22.field394 == 5) {
            class132.method1002(99, class210.field3356);
        }
        if (class22.field394 == 10) {
            class98.method712(2957, false);
        }
        if (class22.field394 == 30) {
            class320.method2196(25, 0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZIIII)V", line = 94)
    public static final void method1239(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        field2653++;
        if (class265.field4126) {
            int var6 = arg2 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class67.field1085 + ((class127.field2023 - class67.field1085) * var6 / 100);
            if (class328.field5075 > var7) {
                var7 = class328.field5075;
            } else if (var7 > class168.field2608) {
                var7 = class168.field2608;
            }
            int var8 = arg2 * var7 * 512 / (arg4 * 334);
            if (class96.field1592 > var8) {
                short var9 = class96.field1592;
                var7 = arg4 * var9 * 334 / (arg2 * 512);
                if (var7 > class168.field2608) {
                    var7 = class168.field2608;
                    int var10 = arg2 * var7 * 512 / (var9 * 334);
                    int var11 = (arg4 - var10) / 2;
                    if (arg1) {
                        class262.method1864();
                        class262.method1855(arg3, arg5, var11, arg2, 0);
                        class262.method1855(arg3 + arg4 - var11, arg5, var11, arg2, 0);
                    }
                    arg4 -= var11 * 2;
                    arg3 += var11;
                }
            } else if (var8 > class12.field231) {
                short var12 = class12.field231;
                var7 = arg4 * var12 * 334 / (arg2 * 512);
                if (var7 < class328.field5075) {
                    var7 = class328.field5075;
                    int var13 = arg4 * var12 * 334 / (var7 * 512);
                    int var14 = (arg2 - var13) / 2;
                    if (arg1) {
                        class262.method1864();
                        class262.method1855(arg3, arg5, arg4, var14, 0);
                        class262.method1855(arg3, arg2 + arg5 - var14, arg4, var14, 0);
                    }
                    arg2 -= var14 * 2;
                    arg5 += var14;
                }
            }
            class43.field757 = arg2 * var7 / 334;
        }
        if (arg0 != -30400) {
            field2647 = (class241) null;
        }
        class147.field2376 = (short) arg2;
        class181.field2892 = (short) arg4;
        class278.field4302 = arg3;
        class294.field4625 = arg5;
    }

    @OriginalMember(owner = "client!dh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 191)
    public final void update(Graphics arg0) {
        this.field2651.update(arg0);
        field2644++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V", line = 201)
    public static final void method1240(byte arg0, int arg1) {
        field2646++;
        class188.field2994 = -1;
        if (arg1 == 37) {
            class54.field862 = 3.0F;
        } else if (arg1 == 50) {
            class54.field862 = 4.0F;
        } else if (arg1 == 75) {
            class54.field862 = 6.0F;
        } else if (arg1 == 100) {
            class54.field862 = 8.0F;
        } else if (arg1 == 200) {
            class54.field862 = 16.0F;
        }
        class188.field2994 = -1;
        if (arg0 > -62) {
            method1236((byte) -44);
        }
    }

    @OriginalMember(owner = "client!dh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 234)
    public final void paint(Graphics arg0) {
        this.field2651.paint(arg0);
        field2649++;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)I", line = 242)
    public static final int method1241(byte arg0) {
        field2648++;
        return arg0 == -82 ? 15 : 4;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 262)
    public class170(Component arg0) {
        this.field2651 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(SI)Z", line = 272)
    public static final boolean method1242(short arg0, int arg1) {
        field2643++;
        if (arg0 == 44 || arg0 == 58 || arg0 == 17 || arg0 == 41 || arg0 == 37 || arg0 == 57 || arg0 == 21 || arg0 == 60) {
            return true;
        } else if (arg0 == 18 || arg0 == 4 || arg0 == 1005 || arg0 == 1006) {
            return true;
        } else {
            if (arg1 > -124) {
                field2647 = (class241) null;
            }
            if (arg0 == 1 || arg0 == 28 || arg0 == 24 || arg0 == 30 || arg0 == 31) {
                return true;
            } else {
                return arg0 == 25 || arg0 == 2 || arg0 == 15 || arg0 == 7 || arg0 == 3 || arg0 == 32;
            }
        }
    }
}
