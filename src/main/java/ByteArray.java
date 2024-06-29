import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public abstract class ByteArray {

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lv;")
    public static JagString field126 = class1.method2(255, "Fishing Shop");

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 14)
    public static void method54(byte arg0) {
        field126 = null;
        if (arg0 != -11) {
            method54((byte) 22);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(JB)V", line = 46)
    public static final void method55(long arg0, byte arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            PreciseSleep.method206(arg0 - 1L, 0);
            PreciseSleep.method206(1L, 0);
        } else {
            PreciseSleep.method206(arg0, arg1 - 12);
        }
        if (arg1 != 12) {
            field125 = 117;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)[B")
    public abstract byte[] get(int arg0);

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([BB)V")
    public abstract void set(byte[] arg0, byte arg1);
}
