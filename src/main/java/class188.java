import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class188 extends class472 {

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "Ljava/lang/String;")
    public String field2881;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)J", line = 3)
    public final long method1304(int arg0) {
        ++field2874;
        if (arg0 != 8) {
            this.method1306(34);
        }
        return super.field6926 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)I", line = 15)
    public final int method1305(byte arg0) {
        int var2 = 62 / ((78 - arg0) / 37);
        ++field2880;
        return (int) (super.field1932 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V", line = 30)
    public final void method1306(int arg0) {
        ++field2875;
        super.field6926 = Long.MIN_VALUE & super.field6926 | 500L + class375.method2397((byte) -75);
        if (arg0 != -23128) {
            method1307(false, 6, -112, -56, -68);
        }
        class104.field1607.method2829(-14061, this);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V", line = 49)
    public static final void method1307(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method1307(false, 66, -114, 28, 21);
        }
        ++field2879;
        class188 var5 = class10.method48((byte) 51, 8, arg3);
        var5.method1308(false);
        var5.field2873 = arg2;
        var5.field2882 = arg1;
        var5.field2876 = arg4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 65)
    public final void method1308(boolean arg0) {
        super.field6926 |= Long.MIN_VALUE;
        ++field2878;
        if (arg0) {
            this.method1308(true);
        }
        if (this.method1304(8) == 0L) {
            class200.field3103.method2829(-14061, this);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V", line = 79)
    public class188(int arg0, int arg1) {
        super.field1932 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)I", line = 87)
    public final int method1309(int arg0) {
        if (arg0 != 1072363744) {
            this.field2882 = -119;
        }
        ++field2877;
        return (int) super.field1932;
    }
}
