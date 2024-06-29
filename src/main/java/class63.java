import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class63 extends class426 {

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "[B")
    public byte[] field794;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "[I")
    public static int[] field793 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "[Ldm;")
    public static class265[] field791 = new class265[14];

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "[S")
    public static short[] field796 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "[I")
    public static int[] field795 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Lwl;")
    public static class452 field797 = new class452(103, -1);

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public static void method339(int arg0) {
        field791 = null;
        field793 = null;
        if (arg0 != 19640) {
            method339(-51);
        }
        field795 = null;
        field796 = null;
        field797 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lps;I)V")
    public static final void method340(class306 arg0, int arg1) {
        field792++;
        if (!class306.field4628) {
            arg0.method625((byte) -50);
            class149.field2067--;
            int var2 = -7 / ((arg1 - 4) / 51);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([B)V")
    public class63(byte[] arg0) {
        this.field794 = arg0;
    }
}
