import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class652 {

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public int field8976 = 128;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public int field8982 = 128;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field8970;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public int field8980;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public int field8968;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public int field8969;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field8972 = 0;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Lwo;")
    public static class314 field8973 = new class314();

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public int field8971;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public int field8975;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public int field8979;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public int field8981;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public int field8983;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static final void method3516(int arg0) {
        field8974++;
        int var1 = class223.field2944.field588.method329((byte) -124);
        if (var1 == 0) {
            class406.field5734 = null;
            class278.method1666(0, (byte) -101);
        } else if (var1 == 1) {
            class378.method2294(87, (byte) 0);
            class278.method1666(512, (byte) -101);
            if (class215.field2728 != null) {
                class240.method1497(0);
            }
        } else {
            class378.method2294(61, (byte) (class710.field9990 - 4 & 0xFF));
            class278.method1666(2, (byte) -101);
        }
        if (arg0 >= -73) {
            field8984 = 7;
        }
        class609.field8437 = class223.field2946;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lfo;B)V")
    public final void method3517(class652 arg0, byte arg1) {
        this.field8980 = arg0.field8980;
        this.field8982 = arg0.field8982;
        this.field8969 = arg0.field8969;
        field8978++;
        this.field8968 = arg0.field8968;
        this.field8970 = arg0.field8970;
        if (arg1 >= -38) {
            this.field8981 = -86;
        }
        this.field8976 = arg0.field8976;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public static void method3518(boolean arg0) {
        field8973 = null;
        if (arg0) {
            field8984 = -4;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Lfo;")
    public final class652 method3519(int arg0) {
        field8977++;
        return arg0 == 128 ? new class652(this.field8970, this.field8982, this.field8976, this.field8980, this.field8968, this.field8969) : null;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
    public static final void method3520(int arg0) {
        field8967++;
        if (arg0 == 6090) {
            class548 var1 = class696.method3872(0, 15, arg0 - 1633388034);
            var1.method3127((byte) -6);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(I)V")
    public class652(int arg0) {
        this.field8970 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIII)V")
    private class652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8980 = arg3;
        this.field8968 = arg4;
        this.field8976 = arg2;
        this.field8969 = arg5;
        this.field8982 = arg1;
        this.field8970 = arg0;
    }
}
