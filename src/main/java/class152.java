import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class152 extends Canvas {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field2303;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Led;")
    public static class323 field2307;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Z")
    public static boolean field2305;

    @OriginalMember(owner = "client!sc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 7)
    public final void update(Graphics arg0) {
        field2300++;
        this.field2303.update(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1144(int arg0) {
        field2302++;
        if (arg0 < -118) {
            class261.field4017.method750((byte) 105);
        }
    }

    @OriginalMember(owner = "client!sc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 30)
    public final void paint(Graphics arg0) {
        field2304++;
        this.field2303.paint(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)B", line = 40)
    public static final byte method1145(byte arg0, char arg1) {
        if (arg0 > -14) {
            field2305 = false;
        }
        field2301++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 166)
    public static final void method1146(byte arg0) {
        field2299++;
        if (arg0 != -120) {
            field2307 = (class323) null;
        }
        for (class232 var1 = (class232) class240.field3671.method1954(arg0 ^ 0x36); var1 != null; var1 = (class232) class240.field3671.method1950((byte) 118)) {
            class201 var2 = var1.field3538;
            if (class265.field4112 != var2.field3064 || class233.field3542 > var2.field3060) {
                var1.method39(10717);
            } else if (var2.field3055 <= class233.field3542) {
                if (var2.field3076 > 0) {
                    class76 var3 = class264.field4064[var2.field3076 - 1];
                    if (var3 != null && var3.field4713 >= 0 && var3.field4713 < 13312 && var3.field4731 >= 0 && var3.field4731 < 13312) {
                        var2.method1452(class328.method2291(var2.field3064, var3.field4731, var3.field4713, 87) - var2.field3086, (byte) 113, var3.field4713, var3.field4731, class233.field3542);
                    }
                }
                if (var2.field3076 < 0) {
                    int var4 = -var2.field3076 - 1;
                    class270 var5;
                    if (class153.field2323 == var4) {
                        var5 = class39.field575;
                    } else {
                        var5 = class201.field3096[var4];
                    }
                    if (var5 != null && var5.field4713 >= 0 && var5.field4713 < 13312 && var5.field4731 >= 0 && var5.field4731 < 13312) {
                        var2.method1452(class328.method2291(var2.field3064, var5.field4731, var5.field4713, 91) - var2.field3086, (byte) 115, var5.field4713, var5.field4731, class233.field3542);
                    }
                }
                var2.method1456(0, class228.field3488);
                class114.method874(class265.field4112, (int) var2.field3071, (int) var2.field3074, (int) var2.field3072, 60, var2, var2.field3078, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 220)
    public class152(Component arg0) {
        this.field2303 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 229)
    public static final void method1147(byte arg0) {
        field2306++;
        class36.field517.method750((byte) 87);
        if (arg0 == 119) {
            class71.field1018.method750((byte) 118);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 241)
    public static final String method1148(byte[] arg0, int arg1, int arg2, int arg3) {
        field2298++;
        if (arg2 < 9) {
            method1144(-23);
        }
        int var4 = 0;
        char[] var5 = new char[arg1];
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class181.field2872[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 285)
    public static void method1149(int arg0) {
        int var1 = -23 / ((arg0 + 16) / 45);
        field2307 = null;
    }
}
