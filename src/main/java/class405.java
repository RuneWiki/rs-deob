import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class405 {

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lcq;")
    public static class110 field5418 = new class110(94, 0);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field5419;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public int field5421;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2270(boolean arg0) {
        if (!arg0) {
            field5418 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2271(int arg0) {
        class304.field3767 = arg0;
        for (int var1 = 0; var1 < class122.field1369; var1++) {
            for (int var2 = 0; var2 < class247.field3058; var2++) {
                if (class487.field7044[arg0][var1][var2] == null) {
                    class487.field7044[arg0][var1][var2] = new class499(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 40)
    public static final void method2272(byte arg0) {
        class273.field3419 = null;
        field5416++;
        if (arg0 != -13) {
            field5418 = null;
        }
        class46.field473 = null;
        class381.field5162 = null;
        class90.field910 = false;
        class112.field1185 = null;
        class46.field479 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLjava/lang/String;I)Lnk;", line = 63)
    public static final class415 method2273(byte arg0, String arg1, int arg2) {
        field5422++;
        class415 var3;
        try {
            var3 = (class415) Class.forName("ofa").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class294();
        }
        var3.field5570 = arg2;
        var3.field5569 = arg1;
        if (arg0 != 4) {
            method2273((byte) -96, null, -105);
        }
        return var3;
    }
}
