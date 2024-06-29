import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class136 extends class30 {

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    private int field1906;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    private int field1905;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Lwf;")
    public static class70 field1908 = new class70(64);

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "[I")
    public static int[] field1913 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 6)
    public static void method818(byte arg0) {
        if (arg0 <= 93) {
            method818((byte) -103);
        }
        field1913 = null;
        field1908 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V", line = 17)
    public final void method174(int arg0, int arg1, int arg2) {
        ++field1910;
        if (arg1 != 27492) {
            this.method172(-99, 36, (byte) -84);
        }
        int var4 = this.field1906 * arg0 >> 12;
        int var5 = this.field1911 * arg0 >> 12;
        int var6 = this.field1907 * arg2 >> 12;
        int var7 = this.field1905 * arg2 >> 12;
        class122.method688(var5, var6, super.field276, (byte) -97, var7, var4);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIII)V", line = 39)
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1911 = arg2;
        this.field1906 = arg0;
        this.field1905 = arg3;
        this.field1907 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)V", line = 54)
    public final void method170(int arg0, int arg1, byte arg2) {
        ++field1909;
        int var4 = this.field1906 * arg0 >> 12;
        int var5 = this.field1911 * arg0 >> 12;
        if (arg2 >= 99) {
            int var6 = this.field1907 * arg1 >> 12;
            int var7 = this.field1905 * arg1 >> 12;
            class360.method2298((byte) 99, var6, super.field270, var5, super.field277, var7, var4);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIB)V", line = 75)
    public final void method172(int arg0, int arg1, byte arg2) {
        ++field1904;
        if (arg2 == 78) {
            int var4 = this.field1906 * arg1 >> 12;
            int var5 = this.field1911 * arg1 >> 12;
            int var6 = this.field1907 * arg0 >> 12;
            int var7 = this.field1905 * arg0 >> 12;
            class379.method2408(super.field277, super.field276, var6, super.field270, var4, var7, arg2 ^ -49, var5);
        }
    }
}
