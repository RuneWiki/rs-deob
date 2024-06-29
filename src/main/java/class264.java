import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class264 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lcs;")
    public static class189 field3704 = new class189(8);

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field3709 = 2;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Lfi;")
    public static class331 field3708 = new class331(64);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V", line = 16)
    public static final void method1686(boolean arg0) {
        class257[] var1 = class160.field2268;
        synchronized (class160.field2268) {
            int var2 = 0;
            if (arg0) {
                field3704 = null;
            }
            while (true) {
                if (class160.field2268.length <= var2) {
                    break;
                }
                class160.field2268[var2] = new class257();
                class111.field1281[var2] = 0;
                var2++;
            }
        }
        field3706++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lra;I)V", line = 39)
    public static final void method1687(class57 arg0, int arg1) {
        if (arg1 != 14816) {
            method1690(124, 68, 75);
        }
        field3705++;
        class329.field4708 = arg0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 51)
    public static void method1688(byte arg0) {
        if (arg0 != 80) {
            method1690(-100, 103, 91);
        }
        field3704 = null;
        field3708 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)I", line = 63)
    public static final int method1689(int arg0, int arg1, int arg2) {
        if (arg0 != -15406) {
            method1687((class57) null, -13);
        }
        field3707++;
        return arg1 == 4 || arg1 == 5 ? class50.field576[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V", line = 78)
    public static final void method1690(int arg0, int arg1, int arg2) {
        field3703++;
        class348 var3 = class385.method2464(arg1, arg1 + 1288, arg0);
        var3.method2216((byte) 23);
        var3.field5093 = arg2;
    }
}
