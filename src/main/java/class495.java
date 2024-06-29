import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class495 extends class108 {

    @OriginalMember(owner = "client!of", name = "o", descriptor = "S")
    public short field6942;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field6939 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field6941 = 0;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lio;")
    public static class151 field6943 = new class151(7, 0, 1, 1);

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[[I")
    public static int[][] field6944;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method2820(int arg0, byte arg1) {
        field6938++;
        if (arg1 == 21) {
            class21 var2 = class601.method3413(arg0, 7, (byte) 87);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 21)
    public static void method2821(int arg0) {
        if (arg0 != 7) {
            method2822((byte) -111, 38);
        }
        field6943 = null;
        field6944 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Loh;", line = 32)
    public static final class549 method2822(byte arg0, int arg1) {
        field6940++;
        if (arg0 > -99) {
            method2822((byte) -124, 105);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class177.field2593[var2] == null || class177.field2593[var2][var3] == null) {
            boolean var4 = class543.method3045(var2, -29039);
            if (!var4) {
                return null;
            }
        }
        return class177.field2593[var2][var3];
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 64)
    public class495() {
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(S)V", line = 66)
    public class495(short arg0) {
        this.field6942 = arg0;
    }
}
