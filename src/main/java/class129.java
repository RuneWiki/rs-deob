import java.awt.event.KeyEvent;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class129 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2255 = 0;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2257 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lga;")
    public static class167 field2261 = new class167();

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lke;")
    public static class256 field2266 = class316.method2202("Chargement des textures )2 ", 27626);

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lke;")
    public static class256 field2267 = class316.method2202("Lade Benutzeroberfl-=che )2 ", 27626);

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lke;")
    public static class256 field2262 = class316.method2202("<col=ff0000>", 27626);

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lke;")
    private static class256 field2268 = class316.method2202("Loaded sprites", 27626);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lke;")
    public static class256 field2265 = field2268;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILng;ZLng;)Ldg;", line = 10)
    public static final class172 method884(int arg0, int arg1, class138 arg2, boolean arg3, class138 arg4) {
        field2254++;
        boolean var5 = true;
        int[] var6 = arg4.method1001(-2658, arg0);
        if (arg1 <= 111) {
            return (class172) null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1010(var6[var7], arg0, 24977);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg2.method1010(var9, 0, 24977);
                } else {
                    var10 = arg2.method1010(0, var9, 24977);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class172(arg4, arg2, arg0, arg3);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 76)
    public static final int method885(KeyEvent arg0, int arg1) {
        field2258++;
        int var2 = arg0.getKeyChar();
        if (arg1 != -17006) {
            return 56;
        } else if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 99)
    public static void method886(byte arg0) {
        field2266 = null;
        field2268 = null;
        field2262 = null;
        field2257 = null;
        field2267 = null;
        field2265 = null;
        int var1 = -39 / ((arg0 - 30) / 34);
        field2261 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 118)
    public static final void method887(int arg0) {
        int var1 = class106.method750(arg0 ^ 0x35B0);
        if (arg0 == var1) {
            class278.field4807 = (byte[][][]) null;
            class17.method101((byte) -53, 0);
        } else if (var1 == 1) {
            class196.method1422(7385, (byte) 0);
            class17.method101((byte) -53, 512);
            class154.method1152(0);
        } else {
            class196.method1422(7385, (byte) (class78.field1469 - 4 & 0xFF));
            class17.method101((byte) -53, 2);
        }
        field2256++;
    }
}
