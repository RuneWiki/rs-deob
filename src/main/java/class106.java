import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class106 extends class6 {

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[B")
    public byte[] field1591;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Lkr;")
    public static class524 field1592 = new class524(128);

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
    public static boolean field1593 = false;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method779(int arg0, byte arg1) {
        class149.method995((byte) -93);
        field1589++;
        if (arg1 >= -69) {
            method780(-109, null, (byte) -50);
        }
        int var2 = class73.field996.method824(false, arg0).field6058;
        if (var2 == 0) {
            return;
        }
        int var3 = class421.field6166.field1972[arg0];
        if (var2 == 5) {
            class70.field990 = var3;
        }
        if (var2 == 6) {
            class147.field2130 = var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILem;B)I", line = 31)
    public static final int method780(int arg0, class150 arg1, byte arg2) {
        field1590++;
        if (!client.method1228(arg1).method1181(-2049225995, arg0) && arg1.field2209 == null) {
            return -1;
        } else {
            int var3 = -78 / ((arg2 - 71) / 40);
            return arg1.field2195 == null || arg1.field2195.length <= arg0 ? -1 : arg1.field2195[arg0];
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 46)
    public static void method781(int arg0) {
        field1592 = null;
        if (arg0 != -4203) {
            method780(30, null, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V", line = 61)
    public class106(byte[] arg0) {
        this.field1591 = arg0;
    }
}
