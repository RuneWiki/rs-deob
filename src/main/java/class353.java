import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class353 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field4534 = new Random();

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4536 = 999999;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Leda;")
    public static class100 field4537;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static void method2085(int arg0) {
        field4537 = null;
        if (arg0 == -17684) {
            field4534 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2086(int arg0, String arg1, int arg2) {
        field4538++;
        class47 var3 = class258.method1546(2, arg0, (byte) 121);
        if (arg2 == 2) {
            var3.method271((byte) 123);
            var3.field513 = arg1;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
    public static final int method2087(int arg0) {
        field4535++;
        if (arg0 != -22528) {
            method2087(90);
        }
        if ((double) class656.field9370 == 3.0D) {
            return 37;
        } else if ((double) class656.field9370 == 4.0D) {
            return 50;
        } else if ((double) class656.field9370 == 6.0D) {
            return 75;
        } else if ((double) class656.field9370 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Loh;III)Lur;")
    public static final class535 method2088(class404 arg0, int arg1, int arg2, int arg3) {
        field4532++;
        byte[] var4 = arg0.method2481(arg1, arg2, (byte) 117);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 > -71) {
                field4536 = -76;
            }
            return new class535(var4);
        }
    }
}
