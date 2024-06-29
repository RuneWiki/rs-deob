import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class347 extends class54 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
    public static boolean field5452 = false;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field5456 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "[B")
    private byte[] field5459;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)I")
    public static final int method2239(boolean arg0, int arg1, int arg2) {
        field5457++;
        if (arg0) {
            int var3 = arg2 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg2 + var3;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
    public final void method377(int arg0, int arg1, byte arg2) {
        field5455++;
        int var4 = arg1 * 2;
        if (arg0 > -102) {
            this.method2241(115, -127, -69, -44);
        }
        int var5 = arg2 & 0xFF;
        this.field5459[var4++] = (byte) (var5 * 3 >> 5);
        this.field5459[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)Lfb;")
    public static final class368 method2240(byte arg0) {
        field5454++;
        if (arg0 <= 111) {
            method2243(null, -59);
        }
        try {
            return (class368) Class.forName("ll").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class347() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2241(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 11339) {
            field5458 = -44;
        }
        this.field5459 = new byte[arg1 * arg2 * arg3 * 2];
        field5451++;
        this.method2024(arg2, arg0 ^ 0xFFFFD3CB, arg3, arg1);
        return this.field5459;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method2242(int arg0) {
        if (arg0 != 8) {
            field5458 = -59;
        }
        field5456 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lza;I)V")
    public static final void method2243(class491 arg0, int arg1) {
        field5453++;
        if (class78.field1358.method2542(-105) == 0) {
            return;
        }
        if (class511.field7485 == arg1) {
            for (class446 var4 = (class446) class78.field1358.method2538(-3); var4 != null; var4 = (class446) class78.field1358.method2535((byte) -99)) {
                class20.field218.method2213(false, var4.field6671, var4.field6667, var4.field6670, arg0, var4.field6663, var4.field6664 ? class302.field4850.field2650 : null, (byte) -59, arg0, var4.field6672, class151.field2423, false);
                var4.method1821((byte) -108);
            }
            class408.method2530(17234);
            return;
        }
        if (class246.field4225 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class246.field4225 = class491.method2860(var2, class419.field6342, 0, class317.field4980, 0, 0);
            class527.field7765 = class246.field4225.method892(class216.method1495(0, class147.field2392, class191.field2972, (byte) -83), class523.method3090(class536.field7881, class191.field2972, 0), true);
        }
        for (class446 var3 = (class446) class78.field1358.method2538(-3); var3 != null; var3 = (class446) class78.field1358.method2535((byte) -64)) {
            class20.field218.method2213(false, var3.field6671, var3.field6667, var3.field6670, arg0, var3.field6663, var3.field6664 ? class302.field4850.field2650 : null, (byte) -59, class246.field4225, var3.field6672, class527.field7765, false);
            var3.method1821((byte) 52);
        }
    }
}
