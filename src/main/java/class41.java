import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class41 extends class74 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
    public static boolean field729 = true;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "S")
    public static short field731 = 32767;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= class37.field678 && arg4 <= class207.field3680 && arg7 >= class242.field4314 && arg3 <= class99.field1584) {
            class127.method863(arg4, arg5, arg0 + 4577, arg1, arg7, arg6, arg3, arg2);
        } else {
            class248.method1738(arg5, (byte) 122, arg4, arg1, arg3, arg6, arg2, arg7);
        }
        if (arg0 != 20323) {
            method271(-71, -107, 107, 63, 3, -14, 87, 19);
        }
        field726++;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Lmh;")
    public static final class232 method272(boolean arg0) {
        field730++;
        if (!arg0) {
            method271(82, -56, 121, -2, -80, -46, 72, 2);
        }
        class60 var1 = new class60(class36.field661, class3.field22, class253.field4489[0], class245.field4360[0], class68.field1183[0], class47.field842[0], class161.field2731[0], class19.field261);
        class228.method1628((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;B)Le;")
    public static final class191 method273(String arg0, byte arg1) {
        field728++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class191 var3 = new class191();
        var3.field3392 = var2;
        var3.field3379 = 0;
        int var4 = 16 / ((arg1 - 86) / 34);
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var3.field3379++] = var2[var5];
            }
        }
        return var3;
    }
}
