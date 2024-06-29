import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class18 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lda;")
    private static class275 field256 = class255.method1672(112, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "S")
    public static short field262 = 1;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Lda;")
    public static class275 field261 = class255.method1672(106, "p11_full");

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Lda;")
    public static class275 field259 = field256;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method92(boolean arg0) {
        field261 = null;
        field259 = null;
        field256 = null;
        if (arg0) {
            field259 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;B)Lda;")
    public static final class275 method93(String arg0, byte arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class275 var3 = new class275();
        var3.field4749 = var2;
        field260++;
        var3.field4752 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4752++] = var2[var4];
            }
        }
        if (arg1 != -10) {
            method93((String) null, (byte) 32);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Z")
    public static final boolean method94(byte arg0) {
        if (arg0 < 1) {
            method94((byte) 33);
        }
        field258++;
        try {
            if (class83.field1347 == 2) {
                if (class170.field2961 == null) {
                    class170.field2961 = class257.method1681(class96.field1636, class116.field2070, class100.field1688);
                    if (class170.field2961 == null) {
                        return false;
                    }
                }
                if (class156.field2743 == null) {
                    class156.field2743 = new class261(class181.field3103, class41.field703);
                }
                if (class6.field92.method1562(class156.field2743, 22050, class170.field2961, class19.field277, (byte) -89)) {
                    class6.field92.method1574(16);
                    class6.field92.method1543(true, class238.field4185);
                    class6.field92.method1568(class192.field3309, (byte) 91, class170.field2961);
                    class156.field2743 = null;
                    class96.field1636 = null;
                    class83.field1347 = 0;
                    class170.field2961 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class6.field92.method1567(-32717);
            class96.field1636 = null;
            class83.field1347 = 0;
            class170.field2961 = null;
            class156.field2743 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILma;)V")
    public static final void method95(int arg0, class105 arg1) {
        field263++;
        class133.field2370 = arg1;
        class46.field766 = class133.field2370.method779((byte) -51, 4);
        if (arg0 != 0) {
            field262 = -69;
        }
    }
}
