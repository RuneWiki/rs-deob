import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class80 extends Canvas {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field1896;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1891 = 127;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lea;")
    public static class38 field1890 = class9.method46((byte) 125, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lea;")
    public static class38 field1900 = class9.method46((byte) 121, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lea;")
    public static class38 field1899 = class9.method46((byte) 126, "Fertigkeit)2");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lea;")
    private static class38 field1901 = class9.method46((byte) 107, "Enter your username (V password)3");

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lea;")
    public static class38 field1902 = field1901;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lob;")
    public static class127 field1892;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lfa;")
    public static class47 field1893;

    @OriginalMember(owner = "client!j", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1898++;
        this.field1896.update(arg0);
    }

    @OriginalMember(owner = "client!j", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1894++;
        this.field1896.paint(arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method678(int arg0) {
        field1892 = null;
        field1900 = null;
        field1901 = null;
        if (arg0 <= 21) {
            method680(null, -42, (byte) 88, true, null);
        }
        field1899 = null;
        field1893 = null;
        field1902 = null;
        field1890 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method679(int arg0, int arg1) {
        class92.field2083 = false;
        class8.field189 = -1;
        class45.field1104 = 1;
        class105.field2350 = 0;
        class52.field1340 = -1;
        field1897++;
        if (arg0 < -103) {
            class196.field3860 = null;
            class36.field764 = arg1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ldd;IBZLdd;)Lt;")
    public static final class170 method680(class32 arg0, int arg1, byte arg2, boolean arg3, class32 arg4) {
        field1895++;
        boolean var5 = true;
        int[] var6 = arg4.method203(arg1, (byte) 68);
        int var7 = 0;
        if (arg2 < 119) {
            return null;
        }
        while (var6.length > var7) {
            byte[] var8 = arg4.method194(var6[var7], 87, arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method194(var9, 100, 0);
                } else {
                    var10 = arg0.method194(0, 126, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            var7++;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class170(arg4, arg0, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class80(Component arg0) {
        this.field1896 = arg0;
    }
}
