import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 extends Canvas {

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field729;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lmh;")
    public static class62 field722 = class201.method1405(true, "::rebuild");

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lmh;")
    public static class62 field724 = class201.method1405(true, "leuchten2:");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lmh;")
    private static class62 field731 = class201.method1405(true, "Close");

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Z")
    public static boolean field730 = true;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lmh;")
    public static class62 field732 = class201.method1405(true, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lmh;")
    public static class62 field723 = field731;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ha", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void update(Graphics arg0) {
        field727++;
        this.field729.update(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I", line = 21)
    public static final int method323(int arg0, int arg1) {
        if (arg1 != 1) {
            field722 = (class62) null;
        }
        field721++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 81)
    public static void method324(byte arg0) {
        field722 = null;
        field723 = null;
        field732 = null;
        field724 = null;
        field731 = null;
        if (arg0 >= -19) {
            method326();
        }
    }

    @OriginalMember(owner = "client!ha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 96)
    public final void paint(Graphics arg0) {
        field726++;
        this.field729.paint(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 106)
    public static final void method325(int arg0) {
        while (true) {
            if (class75.field1223.method1692(false, class60.field874) >= 27) {
                int var1 = class75.field1223.method1687(15, (byte) 26);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class301.field5186[var1] == null) {
                        var2 = true;
                        class301.field5186[var1] = new class204();
                    }
                    class204 var3 = class301.field5186[var1];
                    class288.field4914[class133.field2163++] = var1;
                    var3.field3854 = class199.field3367;
                    if (var3.field3435 != null && var3.field3435.method1881((byte) -80)) {
                        class293.method1988(var3, 119);
                    }
                    int var4 = class75.field1223.method1687(5, (byte) 26);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class71.field1088[class75.field1223.method1687(3, (byte) 26)];
                    if (var2) {
                        var3.field3862 = var3.field3856 = var5;
                    }
                    var3.field3435 = class226.method1601(768, class75.field1223.method1687(14, (byte) 26));
                    int var6 = class75.field1223.method1687(1, (byte) 26);
                    if (var6 == 1) {
                        class21.field224[class294.field5010++] = var1;
                    }
                    int var7 = class75.field1223.method1687(5, (byte) 26);
                    int var8 = class75.field1223.method1687(1, (byte) 26);
                    var3.method1581((byte) 29, var3.field3435.field4714);
                    var3.field3815 = var3.field3435.field4675;
                    var3.field3870 = var3.field3435.field4715;
                    var3.field3831 = var3.field3435.field4699;
                    var3.field3816 = var3.field3435.field4669;
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field3879 = var3.field3435.field4682;
                    var3.field3817 = var3.field3435.field4664;
                    var3.field3868 = var3.field3435.field4677;
                    if (var3.field3816 == 0) {
                        var3.field3856 = 0;
                    }
                    var3.field3811 = var3.field3435.field4667;
                    var3.method1583(class268.field4551.field3846[0] + var4, class268.field4551.field3828[0] + var7, var3.method1101(true), var8 == 1, -14041);
                    if (var3.field3435.method1881((byte) -55)) {
                        class271.method1857((class216) null, (class153) null, class7.field85, var3.field3828[0], 111, 0, var3.field3846[0], var3);
                    }
                    continue;
                }
            }
            field725++;
            class75.field1223.method1686((byte) -17);
            int var9 = 91 % ((-arg0 - 38) / 54);
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 196)
    public static final void method326() {
        for (int var0 = 0; var0 < class143.field2276; var0++) {
            class164 var1 = class208.field3531[var0];
            class264.method1823(var1);
            class208.field3531[var0] = null;
        }
        class143.field2276 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 213)
    public class50(Component arg0) {
        this.field729 = arg0;
    }
}
