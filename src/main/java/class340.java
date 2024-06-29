import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class340 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field5103 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Z")
    public static boolean field5106 = false;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5110 = "Loaded input handler";

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Z")
    public static volatile boolean field5112 = false;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lkm;")
    public static class133 field5107;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIB)I", line = 4)
    public static final int method2349(int arg0, int arg1, byte arg2) {
        field5108++;
        if (arg2 >= -85) {
            field5109 = 27;
        }
        int var3 = arg0 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[Ltk;)V", line = 16)
    public static final void method2350(int arg0, class268[] arg1) {
        class278.field4175[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 25)
    public static void method2351(int arg0) {
        field5107 = null;
        field5110 = null;
        if (arg0 != 28) {
            field5103 = -122;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZII)V", line = 37)
    public static final void method2352(int arg0, boolean arg1, int arg2, int arg3) {
        field5105++;
        if (arg2 < arg0 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class10.field93 = arg1;
        class98.field1325 = arg3;
        class273.field4085 = arg2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(SI)Z", line = 63)
    public static final boolean method2353(short arg0, int arg1) {
        field5102++;
        if (arg0 == 17 || arg0 == 24 || arg0 == 44 || arg0 == 25 || arg0 == 21 || arg0 == 28 || arg0 == 36 || arg0 == 4) {
            return true;
        } else if (arg0 == 13 || arg0 == 31 || arg0 == 1003 || arg0 == 1002) {
            return true;
        } else {
            if (arg1 > -27) {
                field5104 = 75;
            }
            if (arg0 == 23 || arg0 == 1 || arg0 == 41 || arg0 == 33 || arg0 == 22) {
                return true;
            } else {
                return arg0 == 14 || arg0 == 46 || arg0 == 45 || arg0 == 29 || arg0 == 10 || arg0 == 50;
            }
        }
    }
}
