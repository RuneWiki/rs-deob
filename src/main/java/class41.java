import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 extends Canvas {

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field932;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lrc;")
    public static class105 field925 = class43.method374("::", 0);

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field931 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lrc;")
    public static class105 field923 = class43.method374(" x ", 0);

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lrc;")
    public static class105 field936 = class43.method374("Ladevorgang )2 bitte warten Sie)3", 0);

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lrc;")
    public static class105 field937 = class43.method374(" hat sich eingeloggt)3", 0);

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lrc;")
    private static class105 field939 = class43.method374("To create a new account you need to", 0);

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lrc;")
    public static class105 field940 = class43.method374("gr-Un:", 0);

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lrc;")
    public static class105 field938 = class43.method374("headicons_prayer", 0);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lrc;")
    public static class105 field930 = field939;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field935;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    public static int[] field926;

    @OriginalMember(owner = "client!ge", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 15)
    public final void paint(Graphics arg0) {
        field929++;
        this.field932.paint(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 37)
    public static final void method365(int arg0) {
        class65.method547(null, false, (byte) 92, arg0);
        field934++;
    }

    @OriginalMember(owner = "client!ge", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 45)
    public final void update(Graphics arg0) {
        this.field932.update(arg0);
        field921++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V", line = 53)
    public static final void method366(int arg0, boolean arg1) {
        field927++;
        if (arg0 != 2) {
            method367((byte) 81);
        }
        if (class74.field1630 == null) {
            return;
        }
        try {
            class7 var2 = new class7(4);
            var2.method102((byte) 123, arg1 ? 2 : 3);
            var2.method91((byte) -120, 0);
            class74.field1630.method1034(0, var2.field117, -97, 4);
        } catch (IOException var4) {
            try {
                class74.field1630.method1037(0);
            } catch (Exception var3) {
            }
            class74.field1630 = null;
            class31.field730++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 94)
    public class41(Component arg0) {
        this.field932 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 103)
    public static void method367(byte arg0) {
        field936 = null;
        field940 = null;
        field938 = null;
        field926 = null;
        if (arg0 != -30) {
            method369((byte) -45, null);
        }
        field925 = null;
        field935 = null;
        field923 = null;
        field939 = null;
        field930 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)I", line = 122)
    public static final int method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field928++;
        int var7 = arg6 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg4;
        }
        int var9 = 114 / ((arg3 - 25) / 56);
        if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg5 - arg4;
        } else {
            return 7 + 1 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B[B)[B", line = 173)
    public static final byte[] method369(byte arg0, byte[] arg1) {
        class7 var2 = new class7(arg1);
        if (arg0 >= -76) {
            return null;
        }
        field922++;
        int var3 = var2.method96(27023);
        int var4 = var2.method104(-1699);
        if (var4 < 0 || class111.field2580 != 0 && class111.field2580 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method109(-26519, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method104(-1699);
            if (var6 < 0 || class111.field2580 != 0 && class111.field2580 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class53.method414(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }
}
