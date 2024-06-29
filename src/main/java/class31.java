import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class31 {

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Lna;")
    public static class26 field403 = class6.method40("uitext has incorrect number of strings", 48);

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "Lna;")
    public static class26 field402 = class6.method40("Mining Shop", 48);

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "Lna;")
    public static class26 field404 = class6.method40("Woodcutting stump", 48);

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "Lna;")
    public static class26 field401 = class6.method40("Enter place name to find", 48);

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "Lna;")
    public static class26 field409 = class6.method40("Brewery", 48);

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lna;")
    public static class26 field405 = class6.method40("underlay)3dat", 48);

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "Lna;")
    public static class26 field408 = class6.method40("sprites", 48);

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "Lna;")
    public static class26 field406 = class6.method40("Silver Shop", 48);

    @OriginalMember(owner = "mapview!qa", name = "k", descriptor = "I")
    public static int field410 = 0;

    @OriginalMember(owner = "mapview!qa", name = "n", descriptor = "Lna;")
    public static class26 field413 = class6.method40("labels)3dat", 48);

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "mapview!qa", name = "l", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "mapview!qa", name = "m", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field412;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(IIILa;)Lma;", line = 48)
    public static final class24 method225(int arg0, int arg1, int arg2, class1 arg3) {
        if (class23.method134(arg2, (byte) 61, arg0, arg3)) {
            if (arg1 != 255) {
                method227(-91, (byte) 117, 21);
            }
            return class18.method110((byte) -113);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 96)
    public static void method226(byte arg0) {
        field409 = null;
        field413 = null;
        field402 = null;
        field412 = null;
        field406 = null;
        int var1 = -77 % ((arg0 - 48) / 32);
        field408 = null;
        field404 = null;
        field405 = null;
        field401 = null;
        field403 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(IBI)V", line = 139)
    public static final void method227(int arg0, byte arg1, int arg2) {
        class34.field439 = arg2 >> 6;
        class19.field208 = arg0 & 0x3F;
        class13.field156 = arg2 & 0x3F;
        class20.field213 = (class19.field208 << 6) + class13.field156;
        int var3 = 17 % ((43 - arg1) / 60);
        class1.field20 = arg0 >> 6;
        class34.method245(1);
    }
}
