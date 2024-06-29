import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class140 extends class476 {

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Lrb;")
    public static class283 field2094 = new class283(32, 8);

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "[B")
    public static byte[] field2098 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[I")
    public int[] field2089;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[I")
    public int[] field2092;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[I")
    public int[] field2093;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[Ltn;")
    public static class434[] field2099;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "[Lgp;")
    public class464[] field2096;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[Lgp;")
    public class464[] field2100;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[[[B")
    public byte[][][] field2090;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    public static final void method985(byte arg0) {
        field2088++;
        class526.field7677 = false;
        int var1 = 74 % ((arg0 - 49) / 49);
        class94.method767(class110.field1797, class72.field1031, class334.field4880, class27.field371, (byte) 39);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2094 = null;
        field2099 = null;
        field2098 = null;
        if (arg0 != 8) {
            field2098 = null;
        }
    }
}
