import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class289 extends RuntimeException {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Ljava/lang/String;")
    public String field4115;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4114;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field4117 = 0;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field4120;

    static {
        new class342("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4118 = 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)I", line = 6)
    public static final int method1829(int arg0, byte arg1) {
        if (class116.field1927 != null) {
            class116.field1927.method1305((byte) -95);
            class116.field1927 = null;
        }
        field4120++;
        if (arg1 != 33) {
            return 46;
        }
        class275.field3977++;
        if (class275.field3977 > 4) {
            class431.field6416 = 0;
            class275.field3977 = 0;
            return arg0;
        }
        if (class503.field7420 == class307.field4693) {
            class503.field7420 = class308.field4706;
        } else {
            class503.field7420 = class307.field4693;
        }
        class431.field6416 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZII)I", line = 41)
    public static final int method1830(int arg0, boolean arg1, int arg2, int arg3) {
        field4119++;
        int var4 = 255 - arg0;
        int var5 = ((arg3 & 0xFF00) * arg0 & 0xFF0000 | (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
        return arg1 ? -108 : (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & -16711936) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIBI)V", line = 56)
    public static final void method1831(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 54) {
            method1830(-42, false, 58, -24);
        }
        field4116++;
        class54 var5 = class442.method2651(arg1, 10, arg3 - 13262);
        var5.method480(0);
        var5.field934 = arg2;
        var5.field933 = arg0;
        var5.field930 = arg4;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 71)
    public class289(Throwable arg0, String arg1) {
        this.field4115 = arg1;
        this.field4114 = arg0;
    }
}
