import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class163 {

    @OriginalMember(owner = "client!g", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2642 = new String[] { method1539(method1538("gBl\u001aX")), method1539(method1538("{B\u0006\u001c")), method1539(method1538("r\u0019.X")), method1539(method1538("{B\u0007\u001c")), method1539(method1538("{B\u0000\u001c")), method1539(method1538("{B\u0001\u001c")), method1539(method1538("{B\u0003\u001c")), method1539(method1538("o\u0004-CLr\u000b\u0014]Ay\u0003\u0003P")) };

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lko;")
    public static class532 field2640 = new class532("", 13);

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[B")
    public byte[] field2637;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[S")
    public short[] field2634;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[S")
    public short[] field2635;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
    public short[] field2641;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z", line = 3)
    public static final boolean method1533(int arg0) {
        try {
            if (arg0 != -2) {
                return true;
            }
            field2639++;
            if (class40.field466) {
                try {
                    if ((Boolean) class470.method3617((byte) 52, class476.field7255, field2642[7])) {
                        return false;
                    }
                    return true;
                } catch (Throwable var2) {
                }
            }
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2642[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 24)
    public static final void method1534(Canvas arg0, int arg1) {
        try {
            field2632++;
            Dimension var2 = arg0.getSize();
            class244.method2105(var2.width, var2.height, 48);
            if (arg1 >= -89) {
                method1533(2);
            }
            if (class184.field2931 == 1) {
                class761.field11182.method231(arg0, class82.field1244, class413.field6569);
            } else {
                class761.field11182.method231(arg0, class263.field4279, class705.field10114);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2642[1] + (arg0 == null ? field2642[2] : field2642[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 47)
    public static void method1535(boolean arg0) {
        try {
            if (!arg0) {
                method1535(true);
            }
            field2640 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2642[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 62)
    public static final void method1536(int arg0) {
        try {
            field2633++;
            if (arg0 != 1024) {
                field2640 = null;
            }
            if (class254.field3874 != null) {
                class254.field3874.method5703(-17953);
            }
            if (class477.field7261 != null) {
                class477.field7261.method5703(-17953);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2642[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLgda;)V", line = 81)
    public static final void method1537(byte arg0, class58 arg1) {
        try {
            class285.field4611 = 0;
            field2636++;
            class738.field10851 = 0;
            class440.field6871 = new class71();
            class787.field11507 = new class777[1024];
            class640.field9186 = new class92[class350.field5665[class395.field6272] + 1];
            class497.field7453 = 0;
            if (arg0 < 13) {
                method1534(null, -87);
            }
            class164.field2654 = 0;
            class609.method4444(arg1, (byte) -94);
            class203.method1836(false, arg1);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2642[3] + arg0 + ',' + (arg1 == null ? field2642[2] : field2642[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1538(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!g", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1539(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
