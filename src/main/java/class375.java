import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class375 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lla;")
    public static class319 field5697 = new class319(104, -2);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field5700 = 0;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5701 = new Rectangle[100];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Low;")
    public static class234 field5696;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[Z")
    public static boolean[] field5703;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Lfg;")
    public static final class84 method2360(boolean arg0, int arg1) {
        field5698++;
        class84[] var2 = class2.method9((byte) 108);
        if (arg0) {
            method2361(75, 38);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field1235 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method2361(int arg0, int arg1) {
        field5699++;
        if (arg0 != -101) {
            method2360(true, 62);
        }
        class177 var2 = class344.method2229(9, arg1, (byte) 126);
        var2.method1194(arg0 ^ 0x53);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method2362(int arg0) {
        field5703 = null;
        if (arg0 != 27338) {
            field5697 = null;
        }
        field5696 = null;
        field5697 = null;
        field5701 = null;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field5701[var0] = new Rectangle();
        }
    }
}
