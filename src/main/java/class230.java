import java.awt.Canvas;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class230 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
    public static boolean field3516 = false;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3518 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
    public static int[] field3520 = new int[13];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public int[] field3515;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
    public static final int method1394(byte arg0, int arg1) {
        if (arg0 != -96) {
            return 110;
        }
        field3514++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCC) >>> 2);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method469(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Ldc;")
    public static final class13 method1395(int arg0, int arg1, int arg2) {
        if (class277.field4216[arg0][arg1][arg2] == null) {
            boolean var3 = class277.field4216[0][arg1][arg2] != null && class277.field4216[0][arg1][arg2].field146 != null;
            if (var3 && arg0 >= class56.field750 - 1) {
                return null;
            }
            class344.method2097(arg0, arg1, arg2);
        }
        return class277.field4216[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method470(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public abstract void method468(Graphics arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1396(byte arg0, String arg1) {
        if (arg0 != 35) {
            field3516 = true;
        }
        class54.field730 = arg1;
        field3513++;
        if (class79.field1043.field3583 == null) {
            return;
        }
        try {
            String var2 = class79.field1043.field3583.getParameter("cookieprefix");
            String var3 = class79.field1043.field3583.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class68.method462((byte) -91, class445.method2750(arg0 ^ 0xFFFF9467) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class232.method1402(class79.field1043.field3583, -15277, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method1397(boolean arg0) {
        if (!arg0) {
            field3518 = null;
        }
        field3520 = null;
        field3518 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
    public static final void method1398(int arg0, boolean arg1) {
        field3512++;
        byte[][] var2;
        if (arg1) {
            var2 = class154.field2122;
        } else {
            var2 = class446.field6568;
        }
        int var3 = 107 / ((arg0 - 21) / 55);
        int var4 = class432.field6343.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class161.field2243[var5] >> 8) * 64 - class17.field250;
                int var8 = (class161.field2243[var5] & 0xFF) * 64 - class112.field1487;
                class374.method2244((byte) -78);
                class288.method1782(var8, var7, arg1, -1, class196.field2965, var6, class449.field6599);
            }
        }
    }
}
