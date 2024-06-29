import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class2 extends class447 {

    @OriginalMember(owner = "client!dp", name = "D", descriptor = "I")
    public int field25 = 1;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field17 = new String[200];

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "Lng;")
    public static class190 field21 = new class190(8);

    @OriginalMember(owner = "client!dp", name = "F", descriptor = "[I")
    public static int[] field27 = new int[14];

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "C")
    public char field18;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "C", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "E", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!dp", name = "G", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Lqj;")
    public static class296 field16;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lrg;B)V", line = 5)
    public static final void method6(class383 arg0, byte arg1) {
        field24++;
        if (arg1 != 96) {
            return;
        }
        int var2 = arg0.field5480;
        if (var2 == 324) {
            if (class450.field6542 == -1) {
                class450.field6542 = arg0.field5423;
                class447.field6441 = arg0.field5492;
            }
            if (class296.field4080.field5981) {
                arg0.field5423 = class450.field6542;
            } else {
                arg0.field5423 = class447.field6441;
            }
        } else if (var2 == 325) {
            if (class450.field6542 == -1) {
                class447.field6441 = arg0.field5492;
                class450.field6542 = arg0.field5423;
            }
            if (class296.field4080.field5981) {
                arg0.field5423 = class447.field6441;
            } else {
                arg0.field5423 = class450.field6542;
            }
        } else if (var2 == 327) {
            arg0.field5585 = 150;
            arg0.field5603 = (int) (Math.sin((double) class35.field541 / 40.0D) * 256.0D) & 0x3FFF;
            arg0.field5554 = -1;
            arg0.field5457 = 5;
        } else if (var2 == 328) {
            if (class307.field4211.field4994 == null) {
                arg0.field5437 = 0;
                arg0.field5554 = 0;
            } else {
                arg0.field5585 = 150;
                arg0.field5603 = (int) (Math.sin((double) class35.field541 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field5457 = 5;
                arg0.field5554 = 2047;
                arg0.field5437 = class429.method2701(arg1 ^ 0x15, class307.field4211.field4994);
                arg0.field5446 = 0;
                arg0.field5426 = class307.field4211.field885;
                arg0.field5551 = class307.field4211.field928;
                arg0.field5544 = class307.field4211.field925;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILeb;B)V", line = 87)
    private final void method7(int arg0, class371 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field18 = class46.method329(arg1.method2418(-21337), 0);
        } else if (arg0 == 2) {
            this.field25 = 0;
        }
        field26++;
        if (arg2 <= 11) {
            method10((byte) -104);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLaa;)V", line = 108)
    public static final void method8(boolean arg0, class281 arg1) {
        field22++;
        if (class390.field5740 < 2 && class222.field2980 == 0 && !class309.field4235) {
            return;
        }
        String var2;
        if (class222.field2980 == 1 && class390.field5740 < 2) {
            var2 = class259.field3547 + class154.field2182 + class265.field3624 + " ->";
        } else if (class309.field4235 && class390.field5740 < 2) {
            var2 = class25.field359 + class154.field2182 + class125.field1770 + " ->";
        } else if (class389.field5708 && class293.field4056[81] && class390.field5740 > 2) {
            var2 = class115.method757((class207) class167.field2393.field2720.field5369.field5369, -18357);
        } else {
            class207 var3 = (class207) class167.field2393.field2720.field5369;
            var2 = class115.method757(var3, -18357);
            int[] var4 = null;
            if (class162.method1071(var3.field2797, -84)) {
                var4 = class347.method2222((int) var3.field2807, 18682).field5728;
            } else if (class14.method77((byte) 99, var3.field2797)) {
                class437 var5 = class445.field6422[(int) var3.field2807];
                if (var5 != null) {
                    var4 = var5.field6290.field2974;
                }
            } else if (class326.method2052(false, var3.field2797)) {
                if (var3.field2797 == 1008) {
                    var4 = class310.method1961((int) var3.field2807, (byte) 35).field5181;
                } else {
                    var4 = class310.method1961((int) (var3.field2807 >>> 32 & 0x7FFFFFFFL), (byte) 35).field5181;
                }
            }
            if (var4 != null) {
                var2 = var2 + class153.method1035(false, var4);
            }
        }
        if (class390.field5740 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class390.field5740 - 2) + class129.field1798;
        }
        if (class196.field2706 != null) {
            class352 var6 = class196.field2706.method2505(arg1, 1);
            if (var6 == null) {
                var6 = class220.field2899;
            }
            var6.method2265(class442.field6412, class196.field2706.field5491, class135.field1926, class28.field444, class196.field2706.field5431, class249.field3453, var2, class393.field5749, class165.field2354, class196.field2706.field5520, class196.field2706.field5468, true, class221.field2917, class196.field2706.field5499, class196.field2706.field5556);
            class62.method421(class393.field5749[3], class393.field5749[2], class393.field5749[0], (byte) 99, class393.field5749[1]);
        } else if (class28.field451 != null && class180.field2521 == 0) {
            int var7 = class220.field2899.method2266(class94.field1405 + 4, class165.field2354, class28.field444, 0, 16777215, class359.field5048 + 16, class442.field6412, class135.field1926, var2, (byte) -47);
            class62.method421(16, class204.field2769.method448((byte) -119, var2) + var7, class94.field1405 + 4, (byte) 99, class359.field5048);
        }
        if (arg0) {
            field21 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(B)V", line = 195)
    public static void method9(byte arg0) {
        field21 = null;
        if (arg0 > -27) {
            method10((byte) 45);
        }
        field17 = null;
        field16 = null;
        field27 = null;
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "(B)V", line = 209)
    public static final void method10(byte arg0) {
        if (arg0 > -126) {
            field16 = null;
        }
        field19++;
        class190 var1 = class132.field1834;
        synchronized (class132.field1834) {
            class132.field1834.method1249(1);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 230)
    public static final void method11(Component arg0, boolean arg1) {
        if (!arg1) {
            field21 = null;
        }
        field23++;
        arg0.removeMouseListener(class371.field5260);
        arg0.removeMouseMotionListener(class371.field5260);
        arg0.removeFocusListener(class371.field5260);
        class414.field6013 = 0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILeb;)V", line = 246)
    public final void method12(int arg0, class371 arg1) {
        while (true) {
            int var3 = arg1.method2429(0);
            if (var3 == 0) {
                field20++;
                if (arg0 != 0) {
                    method9((byte) -68);
                    return;
                }
                return;
            }
            this.method7(var3, arg1, (byte) 86);
        }
    }
}
