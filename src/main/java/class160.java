import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class160 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Z")
    public static boolean field2151 = false;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "[Z")
    public static boolean[] field2152 = new boolean[8];

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[[[J")
    public static long[][][] field2148;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(JI)V", line = 10)
    public static final void method1105(long arg0, int arg1) {
        field2153++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 1) {
            method1105(60L, 69);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 24)
    public static void method1106(byte arg0) {
        field2148 = null;
        if (arg0 != 42) {
            method1107(-53, 24, -24);
        }
        field2152 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V", line = 38)
    public static final void method1107(int arg0, int arg1, int arg2) {
        if (arg1 > -42) {
            field2151 = false;
        }
        field2149++;
        class778 var3 = class389.method2406(-95, (long) arg0, 16);
        var3.method4274(120);
        var3.field10690 = arg2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZII)I", line = 60)
    public static final int method1108(boolean arg0, int arg1, int arg2) {
        field2150++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            if (arg0) {
                field2151 = false;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)J")
    public abstract long method108(int arg0);
}
