import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class110 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[[[I")
    public static int[][][] field2377 = new int[4][105][105];

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[[[Lod;")
    public static class88[][][] field2379 = new class88[4][104][104];

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lo;")
    public static class84 field2387 = class15.method124("_", 255);

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2388 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[[B")
    public static byte[][] field2385;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 4)
    public static void method852(int arg0) {
        field2385 = null;
        field2377 = null;
        field2387 = null;
        field2379 = null;
        if (arg0 != 23017) {
            method853(null, null, -82, 56);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;Lo;II)V", line = 32)
    public static final void method853(Color arg0, class84 arg1, int arg2, int arg3) {
        if (class26.field462 == null) {
            class26.field462 = new Font("Helvetica", 1, 13);
            class31.field626 = class8.method61(-102).getFontMetrics(class26.field462);
        }
        if (class1.field5) {
            class1.field5 = false;
            class30.field593.setColor(Color.black);
            class30.field593.fillRect(0, 0, class104.field2195, class89.field2018);
        }
        field2375++;
        if (arg0 == null) {
            arg0 = new Color(140, 17, 17);
        }
        try {
            if (class93.field2045 == null) {
                class93.field2045 = class8.method61(-110).createImage(304, 34);
            }
            if (arg3 >= -88) {
                method857(null, null, (byte) -120, null);
            }
            Graphics var4 = class93.field2045.getGraphics();
            var4.setColor(arg0);
            var4.drawRect(0, 0, 303, 33);
            var4.fillRect(2, 2, arg2 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(1, 1, 301, 31);
            var4.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
            var4.setFont(class26.field462);
            var4.setColor(Color.white);
            arg1.method664(0, 22, var4, (304 - arg1.method651((byte) 95, class31.field626)) / 2);
            class30.field593.drawImage(class93.field2045, class104.field2195 / 2 - 152, class89.field2018 / 2 + -18, null);
        } catch (Exception var7) {
            int var5 = class104.field2195 / 2 - 152;
            int var6 = class89.field2018 / 2 - 18;
            class30.field593.setColor(arg0);
            class30.field593.drawRect(var5, var6, 303, 33);
            class30.field593.fillRect(var5 + 2, var6 - -2, arg2 * 3, 30);
            class30.field593.setColor(Color.black);
            class30.field593.drawRect(var5 + 1, var6 - -1, 301, 31);
            class30.field593.fillRect(arg2 * 3 + var5 + 2, var6 + 2, 300 - arg2 * 3, 30);
            class30.field593.setFont(class26.field462);
            class30.field593.setColor(Color.white);
            arg1.method664(0, var6 + 22, class30.field593, (304 - arg1.method651((byte) 67, class31.field626)) / 2 + var5);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lke;II)V", line = 97)
    public static final void method854(class65 arg0, int arg1, int arg2) {
        field2381++;
        if (arg0.field1380 < 128 || arg0.field1391 < 128 || arg0.field1380 >= 13184 || arg0.field1391 >= 13184) {
            arg0.field1411 = 0;
            arg0.field1383 = 0;
            arg0.field1417 = -1;
            arg0.field1423 = -1;
            arg0.field1380 = arg0.field1374[0] * 128 + arg0.field1384 * 64;
            arg0.field1391 = arg0.field1436[0] * 128 + arg0.field1384 * 64;
            arg0.method506(arg2 - 66);
        }
        if (class107.field2271 == arg0 && (arg0.field1380 < 1536 || arg0.field1391 < 1536 || arg0.field1380 >= 11776 || arg0.field1391 >= 11776)) {
            arg0.field1417 = -1;
            arg0.field1383 = 0;
            arg0.field1423 = -1;
            arg0.field1411 = 0;
            arg0.field1380 = arg0.field1374[0] * 128 + arg0.field1384 * 64;
            arg0.field1391 = arg0.field1436[0] * 128 + arg0.field1384 * 64;
            arg0.method506(-2);
        }
        if (arg2 != 64) {
            field2383 = -32;
        }
        if (class128.field2837 < arg0.field1383) {
            class4.method15((byte) -115, arg0);
        } else if (arg0.field1411 >= class128.field2837) {
            class1.method4(arg0, true);
        } else {
            class50.method428(true, arg0);
        }
        class73.method552(0, arg0);
        class115.method887((byte) 106, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Lv;", line = 158)
    public static final class119 method855(boolean arg0, int arg1) {
        field2380++;
        class119 var2 = (class119) class123.field2748.method737((long) arg1, (byte) -95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field1718.method909((byte) -127, arg1, 3);
        if (!arg0) {
            return null;
        }
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method932(new class27(var3), 18688);
        }
        class123.field2748.method744(-123, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Lia;", line = 208)
    public static final class49 method856(byte arg0, int arg1) {
        field2384++;
        class49 var2 = (class49) class48.field1008.method737((long) arg1, (byte) -121);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -106) {
            field2387 = null;
        }
        byte[] var3 = class85.field1941.method909((byte) -123, arg1, 6);
        class49 var4 = new class49();
        var4.field1024 = arg1;
        if (var3 != null) {
            var4.method416((byte) -3, new class27(var3));
        }
        var4.method421(0);
        if (var4.field1070) {
            var4.field1021 = false;
            var4.field1030 = false;
        }
        class48.field1008.method744(-120, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lud;Lud;BLud;)V", line = 248)
    public static final void method857(class118 arg0, class118 arg1, byte arg2, class118 arg3) {
        field2386++;
        class100.field2132 = arg3;
        class63.field1315 = arg1;
        if (arg2 < -2) {
            class69.field1482 = arg0;
            class60.field1254 = new class75[class63.field1315.method912((byte) 45)][];
            class111.field2418 = new boolean[class63.field1315.method912((byte) -118)];
        }
    }
}
