import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class137 {

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[B")
    private byte[] field2227 = new byte[4];

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lga;")
    private class147 field2229;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "J")
    private long field2224;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[S")
    public static short[] field2228 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lmh;")
    public static class62 field2218 = class201.method1405(true, "Hidden)2");

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lmh;")
    public static class62 field2225 = class201.method1405(true, "Hidden)2use");

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lmi;")
    public static class92 field2222 = new class92(new byte[5000]);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2230;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[B")
    private byte[] field2221;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1034(int arg0, int arg1) {
        field2217++;
        if (!class20.method95(true, arg1)) {
            return;
        }
        class191[] var2 = class275.field4713[arg1];
        int var3 = 0;
        int var4 = 13 % ((arg0 - 66) / 42);
        while (var3 < var2.length) {
            class191 var5 = var2[var3];
            if (var5 != null) {
                var5.field3086 = 0;
                var5.field3160 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 47)
    public static void method1035(byte arg0) {
        if (arg0 <= -73) {
            field2228 = null;
            field2222 = null;
            field2218 = null;
            field2225 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Lmh;", line = 73)
    public static final class62 method1036(int arg0, boolean arg1) {
        field2226++;
        class62 var2 = class42.method284(arg0, -116);
        for (int var3 = var2.method439(-51) - 3; var3 > 0; var3 -= 3) {
            var2 = class254.method1772(new class62[] { var2.method429(var3, 0, true), class186.field2975, var2.method407(var3, 15552) }, 0);
        }
        if (!arg1) {
            method1037(88, true);
        }
        if (var2.method439(-81) > 9) {
            return class254.method1772(new class62[] { class115.field1927, var2.method429(var2.method439(79) - 8, 0, true), class271.field4602, class260.field4374, var2, class222.field3827 }, 0);
        } else if (var2.method439(-125) > 6) {
            return class254.method1772(new class62[] { class252.field4269, var2.method429(var2.method439(-85) - 4, 0, true), class153.field2440, class260.field4374, var2, class222.field3827 }, 0);
        } else {
            return class254.method1772(new class62[] { class197.field3334, var2, class17.field162 }, 0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IZ)V", line = 101)
    public static final void method1037(int arg0, boolean arg1) {
        class209.method1460(110);
        field2219++;
        if (class118.field1983 != 30 && class118.field1983 != 25) {
            return;
        }
        class108.field1749++;
        if (class108.field1749 < 50 && !arg1) {
            return;
        }
        class108.field1749 = 0;
        if (!class288.field4913 && class200.field3381 != null) {
            class259.field4360++;
            class170.field2772.method1693(131, false);
            try {
                class200.field3381.method1187(0, class170.field2772.field1476, -112, class170.field2772.field1495);
                class170.field2772.field1476 = 0;
            } catch (IOException var3) {
                class288.field4913 = true;
            }
        }
        class209.method1460(124);
        if (arg0 != 25) {
            method1038(53);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I", line = 142)
    public static final int method1038(int arg0) {
        field2235++;
        if (arg0 > -4) {
            method1039(false, -3, (class62) null, -75, (Color) null);
        }
        return class244.field4150;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZILmh;ILjava/awt/Color;)V", line = 169)
    public static final void method1039(boolean arg0, int arg1, class62 arg2, int arg3, Color arg4) {
        field2231++;
        try {
            Graphics var5 = class243.field4132.getGraphics();
            if (class21.field227 == null) {
                class21.field227 = new Font("Helvetica", 1, 13);
                class286.field4891 = class243.field4132.getFontMetrics(class21.field227);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class306.field5258, class60.field878);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class92.field1513 == null) {
                    class92.field1513 = class243.field4132.createImage(304, 34);
                }
                Graphics var6 = class92.field1513.getGraphics();
                int var7 = -4 / ((arg3 + 23) / 58);
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * 3) + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class21.field227);
                var6.setColor(Color.white);
                arg2.method409(var6, (304 - arg2.method418(0, class286.field4891)) / 2, true, 22);
                var5.drawImage(class92.field1513, class306.field5258 / 2 - 152, class60.field878 / 2 + -18, (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = class306.field5258 / 2 - 152;
                int var10 = class60.field878 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + var9 + 2, var10 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class21.field227);
                var5.setColor(Color.white);
                arg2.method409(var5, var9 + (304 - arg2.method418(0, class286.field4891)) / 2, true, var10 + 22);
            }
            if (class227.field3945 != null) {
                var5.setFont(class21.field227);
                var5.setColor(Color.white);
                class227.field3945.method409(var5, class306.field5258 / 2 - class227.field3945.method418(0, class286.field4891) / 2, true, class60.field878 / 2 - 26);
            }
        } catch (Exception var13) {
            class243.field4132.repaint();
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)[B", line = 241)
    public final byte[] method1040(byte arg0) throws IOException {
        field2232++;
        if (class293.method1985((byte) -71) > this.field2224) {
            throw new IOException("fdt");
        }
        if (this.field2234 == 0) {
            if (this.field2229.field2322 == 2) {
                throw new IOException("fds");
            }
            if (this.field2229.field2322 == 1) {
                this.field2230 = (DataInputStream) this.field2229.field2323;
                this.field2234 = 1;
            }
        }
        if (this.field2234 == 1) {
            int var2 = this.field2230.available();
            if (var2 > 0) {
                if (this.field2220 + var2 > 4) {
                    var2 = 4 - this.field2220;
                }
                this.field2220 += this.field2230.read(this.field2227, this.field2220, var2);
                if (this.field2220 == 4) {
                    int var3 = (new class92(this.field2227)).method704(1509947792);
                    this.field2234 = 2;
                    this.field2221 = new byte[var3];
                }
            }
        }
        if (this.field2234 == 2) {
            int var4 = this.field2230.available();
            if (var4 > 0) {
                if (this.field2221.length < (this.field2233 + var4)) {
                    var4 = this.field2221.length - this.field2233;
                }
                this.field2233 += this.field2230.read(this.field2221, this.field2233, var4);
                if (this.field2221.length == this.field2233) {
                    return this.field2221;
                }
            }
        }
        int var5 = 17 % ((arg0 + 91) / 34);
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)Lmh;", line = 316)
    public static final class62 method1041(boolean arg0, int arg1) {
        field2223++;
        if (arg1 < 100000) {
            return class254.method1772(new class62[] { class42.field646, class42.method284(arg1, -117), class226.field3938 }, 0);
        } else if (arg1 >= 10000000) {
            if (!arg0) {
                method1037(-83, false);
            }
            return class254.method1772(new class62[] { class263.field4437, class42.method284(arg1 / 1000000, -119), class271.field4610, class226.field3938 }, 0);
        } else {
            return class254.method1772(new class62[] { class121.field2017, class42.method284(arg1 / 1000, -119), class153.field2438, class226.field3938 }, 0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lgi;Ljava/net/URL;)V", line = 341)
    public class137(class285 arg0, URL arg1) {
        this.field2229 = arg0.method1957(arg1, 0);
        this.field2234 = 0;
        this.field2224 = class293.method1985((byte) -71) + 30000L;
    }
}
