import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class71 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field1202 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 7)
    public static void method575(byte arg0) {
        field1202 = null;
        if (arg0 != -123) {
            field1203 = 20;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)I", line = 29)
    public static final int method576(int arg0, int arg1, byte arg2) {
        field1201++;
        int var3 = arg0 >>> 24;
        if (arg2 != -102) {
            method576(-16, -42, (byte) -50);
        }
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public abstract int method100(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)J")
    public abstract long method99(byte arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public abstract void method97(int arg0);
}
