import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class223 extends class595 {

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "Lqe;")
    public static class469 field3267 = new class469(20, -2);

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Lfa;")
    public static class235 field3272 = new class235(7, 0, 1, 1);

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1499(int arg0, int arg1, int arg2) {
        field3270++;
        if (arg2 == -31024) {
            return (arg1 & 0xC580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)Z", line = 18)
    public static final boolean method1500(int arg0, int arg1, int arg2) {
        field3268++;
        if (arg0 != 0) {
            field3272 = null;
        }
        return class59.method411(arg2, arg0 + 125, arg1) | (arg2 & 0x40000) != 0 || class530.method3099(arg2, 72, arg1);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1501(boolean arg0) {
        field3272 = null;
        field3267 = null;
        if (arg0) {
            field3267 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 48)
    public static final void method1502(byte arg0, boolean arg1, String arg2) {
        field3271++;
        class196.method1367(arg1, -1, 0, -1, arg2);
        int var3 = -62 / ((arg0 - 40) / 34);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 78)
    public static final void method1503(byte arg0) {
        field3269++;
        class739.method4142((byte) -69);
        class469.field6851.field9084 = 0;
        class128.field1730 = null;
        class228.field3361 = 0;
        class394.field5924 = null;
        class677.field9415 = 0;
        class523.field7482 = 0;
        class242.field3522 = null;
        class542.field7732 = null;
        class270.method1722(127);
        class240.method1594(false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class314.field4456[var1] = null;
        }
        class130.field1749 = null;
        for (int var2 = 0; var2 < class567.field8058; var2++) {
            class282 var4 = class488.field6985[var2].field6439;
            if (var4 != null) {
                var4.field6125 = -1;
            }
        }
        class364.method2256(-81);
        if (arg0 >= -99) {
            field3272 = null;
        }
        class67.field967 = -1;
        class656.field9191 = -1;
        class264.field3784 = 1;
        class49.method363(10, 110);
        for (int var3 = 0; var3 < 100; var3++) {
            class228.field3352[var3] = true;
        }
        class175.method1245(false);
        class430.field6434 = 0L;
        class524.field7489 = null;
    }
}
