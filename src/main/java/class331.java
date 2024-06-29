import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class331 extends class179 {

    @OriginalMember(owner = "client!qo", name = "V", descriptor = "Ljava/lang/String;")
    public static String field5305 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5303 = "Loading config - ";

    @OriginalMember(owner = "client!qo", name = "Y", descriptor = "I")
    public static int field5307 = 0;

    @OriginalMember(owner = "client!qo", name = "U", descriptor = "B")
    public byte field5304;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!qo", name = "R", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!qo", name = "X", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!qo", name = "Z", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "Llf;")
    public class143 field5300;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I", line = 7)
    public final int method1235(boolean arg0) {
        field5297++;
        if (arg0) {
            method2293(21);
        }
        return this.field5300 == null ? 0 : this.field5300.field2295 * 100 / (this.field5300.field2260.length - this.field5304);
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)V", line = 23)
    public static void method2293(int arg0) {
        field5303 = null;
        if (arg0 != 0) {
            method2296(108, true, -1, 36);
        }
        field5305 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIBIII)V", line = 45)
    public static final void method2294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg6 < 90) {
            method2294(-13, 2, -56, -14, -96, -55, (byte) 7, 101, -4, 53);
        }
        field5306++;
        if (arg8 >= class337.field5389 && class344.field5460 >= arg8 && class337.field5389 <= arg9 && arg9 <= class344.field5460 && arg3 >= class337.field5389 && arg3 <= class344.field5460 && arg0 >= class337.field5389 && class344.field5460 >= arg0 && class244.field3844 <= arg5 && arg5 <= class2.field22 && class244.field3844 <= arg2 && arg2 <= class2.field22 && class244.field3844 <= arg1 && class2.field22 >= arg1 && arg7 >= class244.field3844 && arg7 <= class2.field22) {
            class77.method496(arg5, arg3, arg7, arg9, arg8, -5605, arg2, arg0, arg1, arg4);
        } else {
            class125.method856(arg9, 1558, arg0, arg1, arg5, arg4, arg2, arg8, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILlf;)Ltl;", line = 62)
    public static final class232 method2295(int arg0, class143 arg1) {
        field5298++;
        class232 var2 = new class232();
        var2.field3510 = arg1.method1051(1);
        int var3 = 82 % ((arg0 + 74) / 52);
        var2.field3508 = class259.method1822(128, var2.field3510);
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)[B", line = 86)
    public final byte[] method1238(byte arg0) {
        field5308++;
        if (this.field2683 || this.field5300.field2295 < this.field5300.field2260.length - this.field5304) {
            throw new RuntimeException();
        }
        if (arg0 != -107) {
            field5307 = 78;
        }
        return this.field5300.field2260;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZII)I", line = 109)
    public static final int method2296(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (!arg1) {
            return 3;
        }
        field5299++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILgi;I)V", line = 131)
    public static final void method2297(int arg0, class242 arg1, int arg2) {
        field5295++;
        if (arg0 != 20126) {
            field5307 = -119;
        }
        if (arg1.field3773 > class102.field1381) {
            class213.method1488(arg1, 127);
        } else if (arg1.field3780 >= class102.field1381) {
            class147.method1084(arg1, 0);
        } else {
            class63.method390(arg1, (byte) -121);
        }
        if (arg1.field3767 < 128 || arg1.field3763 < 128 || arg1.field3767 >= 13184 || arg1.field3763 >= 13184) {
            arg1.field3780 = 0;
            arg1.field3703 = -1;
            arg1.field3773 = 0;
            arg1.field3807 = -1;
            arg1.field3767 = arg1.field3747[0] * 128 + arg1.method412((byte) 76) * 64;
            arg1.field3763 = arg1.field3786[0] * 128 + (arg1.method412((byte) 80) * 64);
            arg1.method1722(arg0 ^ 0xFFFFB118);
        }
        if (class11.field113 == arg1 && (arg1.field3767 < 1536 || arg1.field3763 < 1536 || arg1.field3767 >= 11776 || arg1.field3763 >= 11776)) {
            arg1.field3773 = 0;
            arg1.field3807 = -1;
            arg1.field3703 = -1;
            arg1.field3780 = 0;
            arg1.field3767 = arg1.field3747[0] * 128 + arg1.method412((byte) 82) * 64;
            arg1.field3763 = arg1.field3786[0] * 128 + (arg1.method412((byte) 89) * 64);
            arg1.method1722(-119);
        }
        class127.method868(arg1, (byte) -100);
        class96.method624(0, arg1);
    }
}
