import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class45 {

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public int field1376 = 0;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lkd;")
    public static class73 field1366 = class126.method1070((byte) -66, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lkd;")
    public static class73 field1368 = class126.method1070((byte) -66, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field1373 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Ljb;")
    public static class64 field1369 = new class64(20);

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "Ljb;")
    public static class64 field1379 = new class64(30);

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lkd;")
    public static class73 field1380 = class126.method1070((byte) -66, "http:)4)4");

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lq;")
    public static class111 field1375;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Lbc;")
    public static class11 field1365;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqc;B)V")
    public final void method413(class114 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method957((byte) 123);
            if (var3 == 0) {
                if (arg1 < 124) {
                    return;
                }
                field1377++;
                return;
            }
            this.method415((byte) -121, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
    public static void method414(byte arg0) {
        field1380 = null;
        field1375 = null;
        field1366 = null;
        field1379 = null;
        if (arg0 > -5) {
            method417(18, (byte) -24);
        }
        field1369 = null;
        field1365 = null;
        field1368 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLqc;I)V")
    private final void method415(byte arg0, class114 arg1, int arg2) {
        field1372++;
        if (arg2 == 5) {
            this.field1376 = arg1.method944((byte) 112);
        }
        if (arg0 != -121) {
            method414((byte) -23);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)I")
    public static final int method416(int arg0, int arg1) {
        field1371++;
        int var2 = 0;
        if (arg0 != -3176) {
            return 17;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)Lre;")
    public static final class123 method417(int arg0, byte arg1) {
        int var2 = -108 / ((arg1 + 69) / 49);
        field1367++;
        class123 var3 = (class123) class142.field3529.method538(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class142.field3540.method898((byte) -108, arg0, 1);
        class123 var5 = new class123();
        if (var4 != null) {
            var5.method1049(0, new class114(var4), arg0);
        }
        var5.method1050((byte) -30);
        class142.field3529.method542(var5, -901, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILgd;BII)V")
    public static final void method418(int arg0, class46 arg1, byte arg2, int arg3, int arg4) {
        class103.field2565.method100(true);
        field1374++;
        class142.field3536.method208(0, 0);
        arg1.method343(class43.field1150, 55, 28, 16777215, 0);
        if (arg3 == 0) {
            arg1.method343(class109.field2689, 55, 41, 65280, 0);
        }
        if (arg3 == 1) {
            arg1.method343(class119.field3046, 55, 41, 16776960, 0);
        }
        if (arg3 == 2) {
            arg1.method343(class125.field3179, 55, 41, 16711680, 0);
        }
        if (arg3 == 3) {
            arg1.method343(class31.field866, 55, 41, 65535, 0);
        }
        arg1.method343(class19.field534, 184, 28, 16777215, 0);
        if (arg2 >= -101) {
            method417(26, (byte) -94);
        }
        if (arg4 == 0) {
            arg1.method343(class109.field2689, 184, 41, 65280, 0);
        }
        if (arg4 == 1) {
            arg1.method343(class119.field3046, 184, 41, 16776960, 0);
        }
        if (arg4 == 2) {
            arg1.method343(class125.field3179, 184, 41, 16711680, 0);
        }
        arg1.method343(class141.field3510, 324, 28, 16777215, 0);
        if (arg0 == 0) {
            arg1.method343(class109.field2689, 324, 41, 65280, 0);
        }
        if (arg0 == 1) {
            arg1.method343(class119.field3046, 324, 41, 16776960, 0);
        }
        if (arg0 == 2) {
            arg1.method343(class125.field3179, 324, 41, 16711680, 0);
        }
        arg1.method362(class77.field1963, 417, 17, 85, 25, 16777215, 0, 1, 1, 0);
        try {
            Graphics var5 = class18.field519.getGraphics();
            class103.field2565.method98(0, 453, -16961, var5);
        } catch (Exception var6) {
            class18.field519.repaint();
        }
    }
}
