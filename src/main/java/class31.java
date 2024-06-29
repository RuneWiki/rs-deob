import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class31 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field531 = 127;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[J")
    public static long[] field536 = new long[200];

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Ljf;")
    public static class229 field534 = class212.method1457((byte) 120, "leuchten3:");

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lkm;Lek;ILek;Lek;)Z", line = 4)
    public static final boolean method260(class328 arg0, class185 arg1, int arg2, class185 arg3, class185 arg4) {
        field537++;
        class224.field3835 = arg4;
        class264.field4560 = arg1;
        class184.field3186 = arg0;
        class107.field1880 = arg3;
        int var5 = -77 % ((arg2 + 68) / 55);
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 20)
    public static void method261(int arg0) {
        field534 = null;
        if (arg0 != 0) {
            method260((class328) null, (class185) null, 102, (class185) null, (class185) null);
        }
        field536 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lmj;", line = 34)
    public static final class232 method262(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class232 var4 = var3.field2192;
            var3.field2192 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)J", line = 50)
    public static final long method263(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        return var3 == null || var3.field2192 == null ? 0L : var3.field2192.field4027;
    }
}
