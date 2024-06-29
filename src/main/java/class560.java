import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class560 extends class578 {

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
    public int field7543 = 0;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "F")
    public static float field7542;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3127(byte arg0) {
        if (class266.field3598 < 0) {
            class255.field3490 = -1;
            class266.field3598 = 0;
            class14.field152 = -1;
        }
        field7541++;
        if (class266.field3598 > class510.field7009) {
            class255.field3490 = -1;
            class14.field152 = -1;
            class266.field3598 = class510.field7009;
        }
        if (arg0 < 63) {
            field7547 = -52;
        }
        if (class670.field9403 < 0) {
            class255.field3490 = -1;
            class670.field9403 = 0;
            class14.field152 = -1;
        }
        if (class510.field7013 < class670.field9403) {
            class670.field9403 = class510.field7013;
            class14.field152 = -1;
            class255.field3490 = -1;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILac;)V", line = 46)
    public final void method3128(int arg0, class501 arg1) {
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                field7545++;
                int var4 = -36 / ((arg0 + 36) / 55);
                return;
            }
            this.method3131(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)I", line = 70)
    public static final int method3129(int arg0, int arg1, boolean arg2) {
        field7540++;
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (!arg2) {
            method3129(116, -37, false);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V", line = 96)
    public static final void method3130(byte arg0) {
        field7546++;
        class541.field7315 = 0;
        if (arg0 != 101) {
            field7547 = 38;
        }
        int var1 = (class143.field2063.field4042 >> 9) + class498.field6774;
        int var2 = (class143.field2063.field4047 >> 9) + class613.field8555;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class541.field7315 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class541.field7315 = 1;
        }
        if (class541.field7315 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class541.field7315 = 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILac;)V", line = 126)
    private final void method3131(int arg0, int arg1, class501 arg2) {
        if (arg1 == 0) {
            if (arg0 == 2) {
                this.field7543 = arg2.method2845(-1);
            }
            field7544++;
        }
    }
}
