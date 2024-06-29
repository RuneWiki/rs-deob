import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class68 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lgg;")
    private static class63 field1702 = class116.method911(43, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lgg;")
    public static class63 field1703 = class116.method911(43, "sch-Utteln:");

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lgg;")
    public static class63 field1701 = class116.method911(43, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lgg;")
    public static class63 field1707 = class116.method911(43, "sl_arrows");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1710 = 0;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lgg;")
    public static class63 field1714 = field1702;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lgg;")
    public static class63 field1699 = class116.method911(43, "Welt");

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lgg;")
    private static class63 field1716 = class116.method911(43, "glow2:");

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lgg;")
    public static class63 field1711 = field1716;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lgg;")
    public static class63 field1713 = field1716;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field1706;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lab;I)Lv;")
    public static final class189 method627(class3 arg0, int arg1) {
        int var2 = arg0.method64(31790);
        int var3 = arg0.method64(31790);
        Class var4 = class170.method1145(38, var3);
        field1704++;
        try {
            class189 var5 = (class189) var4.getDeclaredConstructor().newInstance();
            if (var5 != null) {
                var5.field3821 = var2;
                var5.field3828 = arg0.method64(31790);
                int var6 = arg0.method64(31790);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg0.method64(31790);
                    var5.method77(var8, (byte) 71, arg0);
                }
            }
            if (arg1 >= -92) {
                return null;
            } else {
                var5.method84(true);
                return var5;
            }
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method628(byte arg0) {
        field1701 = null;
        field1703 = null;
        field1706 = null;
        field1702 = null;
        field1713 = null;
        field1714 = null;
        field1707 = null;
        if (arg0 <= 76) {
            method629(-34, -97, -44);
        }
        field1699 = null;
        field1716 = null;
        field1711 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method629(int arg0, int arg1, int arg2) {
        field1700++;
        if (arg1 != 16950) {
            field1716 = null;
        }
        int var3 = arg0 >> 31 & arg2 - 1;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljc;I)V")
    public static final void method630(class85 arg0, int arg1) {
        class162.field3343 = arg0;
        field1708++;
        if (arg1 != 0) {
            method627(null, -5);
        }
    }
}
