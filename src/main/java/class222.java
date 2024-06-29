import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class222 extends class405 {

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "[I")
    public static int[] field3228;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "Llu;")
    public static class610 field3227;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!oca", name = "H", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "[[Z")
    public static boolean[][] field3230;

    static {
        new class572("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field3228 = new int[4096];
        field3227 = new class610(79, -1);
    }

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "(I)V", line = 4)
    public static void method1435(int arg0) {
        field3227 = null;
        if (arg0 <= 26) {
            field3227 = null;
        }
        field3230 = null;
        field3228 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)Z", line = 16)
    public static final boolean method1436(int arg0, int arg1, byte arg2) {
        if (arg2 != 2) {
            method1436(57, -34, (byte) -7);
        }
        ++field3226;
        return ~(arg1 & 52) != -1;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BIII)V", line = 27)
    public final void method1437(byte arg0, int arg1, int arg2, int arg3) {
        super.field5537 = arg2;
        ++field3223;
        super.field5536 = arg1;
        super.field5533 = arg3;
        int var5 = 37 % ((arg0 - -59) / 53);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBI)I", line = 39)
    public static final int method1438(int arg0, byte arg1, int arg2) {
        ++field3224;
        if (arg0 != 4 && ~arg0 != -6) {
            return arg1 != -18 ? 120 : 256;
        } else {
            return class45.field545[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(FZ)V", line = 53)
    public final void method1439(float arg0, boolean arg1) {
        if (arg1) {
            method1440(-117, -112, 111);
        }
        super.field5546 = arg0;
        ++field3225;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIIF)V", line = 69)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V", line = 72)
    public static final void method1440(int arg0, int arg1, int arg2) {
        ++class25.field241;
        ++field3221;
        class402.method2367(class205.field3054, (byte) 97);
        if (arg0 > -111) {
            field3227 = null;
        }
        class112.field1589.method1053(arg2, (byte) -126);
        class112.field1589.method1017(arg1, 428082024);
    }
}
