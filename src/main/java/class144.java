import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class class144 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLln;)V", line = 3)
    public static final void method1035(byte arg0, class263 arg1) {
        if (arg0 == -66) {
            field2208++;
            class194.field2811 = arg1;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIII)I", line = 14)
    public static final int method1036(int arg0, int arg1, int arg2, int arg3) {
        field2209++;
        int var4 = 255 - arg1;
        int var5 = ((arg0 & arg3) * arg1 & 0xFF00FF00 | (arg3 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)I", line = 33)
    public static final int method1037(int arg0, int arg1) {
        field2207++;
        return arg1 < 54 ? -89 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
    public abstract int method536(int arg0, int arg1);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public abstract void method535(byte arg0);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)J")
    public abstract long method537(int arg0);
}
