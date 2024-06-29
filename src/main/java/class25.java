import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class25 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
    public static boolean field405 = false;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lbd;")
    public static class162 field410 = class17.method142(0, "Konfig geladen)3");

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field412 = 0;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    public static int[] field411 = new int[32];

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
    public static boolean field413 = false;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field409 = new CRC32();

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
    public static int[] field414 = new int[2];

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 10)
    public static final void method202(int arg0) {
        field408++;
        class308.method2091();
        class135.field2400 = null;
        class279.field4693 = -1;
        class202.method1506((byte) 84);
        class271.field4523.method1384(arg0 - 10531);
        class199.field3381 = new class128();
        if (arg0 != 25) {
            field410 = (class162) null;
        }
        ((class17) class312.field5271).method150(-2);
        class221.field3695 = new class196[255];
        class221.field3690 = 0;
        class100.method810();
        class287.method1983();
        class289.method2004((byte) -106);
        class235.method1676((byte) 104);
        class184.method1395(arg0 ^ 0x71);
        for (int var1 = 0; var1 < 2048; var1++) {
            class39 var2 = class270.field4520[var1];
            if (var2 != null) {
                var2.field625 = null;
            }
        }
        if (class117.field2159) {
            class287.method1992(104, 104);
        }
        class6.method33(class51.field817, class35.field577, -147);
        class190.method1417(class35.field577, 21);
        if (class262.field4380 == 5) {
            class251.method1755(arg0 + 61, class35.field577);
        }
        if (class262.field4380 == 10) {
            class256.method1766(false, true);
        }
        if (class262.field4380 == 30) {
            class122.method984(25, arg0 + 2022);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 76)
    public static void method203(int arg0) {
        if (arg0 != 2048) {
            method205((byte) 46);
        }
        field410 = null;
        field414 = null;
        field411 = null;
        field409 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILbd;)Lbd;", line = 100)
    public static final class162 method204(int arg0, class162 arg1) {
        int var2 = class12.method108(arg1, false);
        field406++;
        if (arg0 > -48) {
            return (class162) null;
        } else if (var2 == -1) {
            return class86.field1534;
        } else {
            return class9.field112.field534[var2].method1285(class47.field747, class237.field3947, true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I", line = 126)
    public static final int method205(byte arg0) {
        field407++;
        return arg0 == -105 ? class102.field1854 : 10;
    }
}
