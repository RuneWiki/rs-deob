import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class228 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljd;")
    public static class85 field3831;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3834;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[Ljd;")
    public static class85[] field3836;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method1556(byte arg0) {
        class170.field2855 = 0;
        field3832++;
        class207.field3446 = 0;
        class183.method1242(false);
        class49.method361(24561);
        class19.method143(-2);
        class252.method1712(true);
        for (int var1 = 0; var1 < class207.field3446; var1++) {
            int var3 = class104.field1896[var1];
            if (class244.field4245 != class71.field1370[var3].field3981) {
                if (class71.field1370[var3].field3062 > 0) {
                    class174.method1200(-8064, class71.field1370[var3]);
                }
                class71.field1370[var3] = null;
            }
        }
        if (class20.field428 != class119.field2109.field3581) {
            throw new RuntimeException("gpp1 pos:" + class119.field2109.field3581 + " psize:" + class20.field428);
        }
        if (arg0 >= -112) {
            method1557((byte) 87);
        }
        for (int var2 = 0; var2 < class78.field1450; var2++) {
            if (class71.field1370[class60.field1116[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class78.field1450);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        field3836 = null;
        field3834 = null;
        int var1 = 75 % ((arg0 - 53) / 39);
        field3831 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)Luj;")
    public static final class137 method1558(int arg0) {
        field3833++;
        if (arg0 != 0) {
            return null;
        }
        class137 var1 = (class137) class167.field2825.method1684(-1128);
        if (var1 != null) {
            var1.method267(arg0 ^ 0xFFFFFFE8);
            var1.method1693(63);
            return var1;
        }
        class137 var2;
        do {
            var2 = (class137) class8.field115.method1684(arg0 - 1128);
            if (var2 == null) {
                return null;
            }
            if (var2.method951((byte) -14) > class104.method785(-1)) {
                return null;
            }
            var2.method267(115);
            var2.method1693(63);
        } while ((var2.field4309 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
