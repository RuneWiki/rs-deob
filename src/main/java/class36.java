import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class36 extends class508 {

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public int field551 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public int field550 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public int field559 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public int field557 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public int field560 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public int field563 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
    public int field565 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public int field564 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "Lcc;")
    public class343 field549;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "[I")
    public static int[] field561 = new int[100];

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "F")
    public static float field553 = 0.0F;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 3)
    public static void method231(int arg0) {
        if (arg0 != 100) {
            method232(51);
        }
        field561 = null;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lcc;)V", line = 158)
    public class36(class343 arg0) {
        this.field549 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V", line = 24)
    public static final void method232(int arg0) {
        class419.field5574 = 0;
        class214.field2736 = 0;
        class156.field2062 = 0;
        class199.field2561 = 0;
        if (arg0 == 3) {
            field555++;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZII)I", line = 39)
    public static final int method233(int arg0, boolean arg1, int arg2, int arg3) {
        field558++;
        class378 var4 = class188.method1235(arg1, (byte) -128, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 <= arg3 && var4.field4905.length > arg3) {
            return var4.field4905[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)I", line = 56)
    public static final int method234(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg3 != -22116) {
            field553 = -1.144627F;
        }
        field554++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V", line = 83)
    public static final void method235(int arg0) {
        field566++;
        class294.method1767(arg0, (byte) -85);
        class326.method1939((byte) -42);
        System.gc();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)V", line = 95)
    public static final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field562++;
        if (arg0 != 0) {
            return;
        }
        if (arg4 - arg1 >= class65.field827 && class281.field3589 >= arg1 + arg4 && (arg5 - arg1) >= class418.field5559 && class456.field6365 >= (arg5 + arg1)) {
            class352.method2068(arg1, arg2, arg3, arg4, arg6, arg5, arg0 ^ 0xFFFFE9FF);
        } else {
            class437.method2576(arg2, false, arg3, arg1, arg4, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZ)Z", line = 124)
    public final boolean method237(int arg0, int arg1, boolean arg2) {
        field556++;
        if (arg1 >= this.field557 && this.field550 >= arg1 && this.field551 <= arg0 && this.field559 >= arg0) {
            return true;
        } else if (arg1 >= this.field564 && arg1 <= this.field563 && this.field560 <= arg0 && this.field565 >= arg0) {
            return true;
        } else {
            return arg2;
        }
    }
}
