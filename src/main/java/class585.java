import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class585 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field8270 = 0;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Z")
    public static boolean field8273 = false;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lga;")
    public static class420 field8267 = new class420();

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lve;")
    public static class527 field8276 = new class527(6, 1);

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lke;")
    public static class622 field8277 = new class622(89, 6);

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
    public static int[] field8278 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field8279 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field8268;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public int field8274;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field8281;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLts;)V")
    public static final void method3391(boolean arg0, class559 arg1) {
        if (!arg0) {
            field8270 = 45;
        }
        field8271++;
        class315 var2 = (class315) class649.field9134.method380((byte) -3, (long) arg1.field6361);
        if (var2 == null) {
            class653.method3743(arg1.field6445[0], -98, 0, arg1, null, arg1.field7710, arg1.field6448[0], null);
        } else {
            var2.method2068((byte) -80);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method3392(byte arg0) {
        if (arg0 != -55) {
            field8273 = true;
        }
        field8278 = null;
        field8277 = null;
        field8267 = null;
        field8276 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method3393(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg1 ? class145.field1852.field9009.method978((byte) -65) : class145.field1852.field9029.method978((byte) -85)) != 0 && arg3 != 0 && class636.field8961 < 50 && arg5 != -1) {
            class458.field6558[class636.field8961++] = new class472((byte) (arg1 ? 3 : 2), arg5, arg3, arg6, arg2, arg4, arg7, null);
        }
        field8275++;
        if (arg0 < 46) {
            field8267 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3394(int arg0, byte arg1, int arg2) {
        field8269++;
        if (arg1 == -100) {
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/io/File;)[B")
    public static final byte[] method3395(byte arg0, File arg1) {
        if (arg0 < 106) {
            return null;
        } else {
            field8272++;
            return class733.method4098(false, (int) arg1.length(), arg1);
        }
    }
}
