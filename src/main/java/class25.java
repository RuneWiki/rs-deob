import java.awt.Component;
import java.awt.Image;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class25 {

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Lw;")
    public static class38 field348 = class35.method219("overlay)3dat", true);

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "[J")
    public static long[] field351 = new long[32];

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lw;")
    public static class38 field350 = class35.method219("labels)3dat", true);

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Lw;")
    public static class38 field355 = class35.method219("Mining Site", true);

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lw;")
    public static class38 field352 = class35.method219("Key", true);

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lw;")
    public static class38 field349 = class35.method219("POH Portal", true);

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Lw;")
    public static class38 field353 = class35.method219("Combat Training", true);

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field354;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field357;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 33)
    public static void method161(byte arg0) {
        field353 = null;
        field357 = null;
        field354 = null;
        field348 = null;
        if (arg0 > -67) {
            return;
        }
        field350 = null;
        field349 = null;
        field355 = null;
        field352 = null;
        field351 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/awt/Component;III)Ln;", line = 59)
    public static final class24 method162(Component arg0, int arg1, int arg2, int arg3) {
        try {
            Class var4 = Class.forName("fa");
            class24 var5 = (class24) var4.getDeclaredConstructor().newInstance();
            if (arg2 != 0) {
                method161((byte) 11);
            }
            var5.method40(arg1, 127, arg0, arg3);
            return var5;
        } catch (Throwable var8) {
            class9 var7 = new class9();
            var7.method40(arg1, 112, arg0, arg3);
            return var7;
        }
    }
}
