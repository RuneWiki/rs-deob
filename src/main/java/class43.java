import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class43 extends class187 {

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field611 = 1;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[Lvf;")
    public static class89[] field602 = new class89[14];

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
    public int[] field601;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "[I")
    public int[] field604;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[I")
    public int[] field609;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "[Lrk;")
    public class252[] field599;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[Lrk;")
    public class252[] field614;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[[[B")
    public byte[][][] field600;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)I", line = 14)
    public static final int method307(int arg0, int arg1, int arg2) {
        if (arg0 < 49) {
            method308(-91);
        }
        field612++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Ljava/lang/String;", line = 39)
    public static final String method308(int arg0) {
        field603++;
        String var1 = "";
        String var2 = "www";
        if (class266.field4101 != null) {
            var1 = "/p=" + class266.field4101;
        }
        if (class208.field3307 != arg0) {
            var2 = "www-wtqa";
        }
        return "http://" + var2 + ".runescape.com/l=" + class157.field2462 + "/a=" + class123.field1928 + var1 + "/";
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V", line = 66)
    public static final void method309(int arg0, boolean arg1) {
        class163.field2519 = (int[][][]) null;
        if (arg1 && class205.field3110 != null) {
            class144.field2287 = class205.field3110.field3010;
        } else {
            class144.field2287 = -1;
        }
        class128.field1993 = (int[][][]) null;
        if (arg0 != -8977) {
            method310((byte) -85);
        }
        class277.field4275 = null;
        class338.field5234 = (byte[][][]) null;
        class164.field2525 = (byte[][][]) null;
        class165.field2548 = (int[][][]) null;
        class76.field1145 = (byte[][][]) null;
        class205.field3110 = null;
        class94.field1445 = (byte[][][]) null;
        class157.field2461 = null;
        field606++;
        class74.field1109 = 0;
        class34.field435 = (byte[][][]) null;
        class155.field2431.method5(104);
        class288.field4405 = null;
        class121.field1869 = -1;
        class22.field272 = null;
        class144.field2285 = null;
        class310.field4910 = null;
        class23.field293 = null;
        class305.field4777 = null;
        class312.field4937 = null;
        class324.field5050 = -1;
        class92.field1428 = null;
        class152.field2400 = null;
        class47.field672 = null;
        class61.field853 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 108)
    public static void method310(byte arg0) {
        field602 = null;
        if (arg0 != 36) {
            method307(27, -109, 8);
        }
    }
}
