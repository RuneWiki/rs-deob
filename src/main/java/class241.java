import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class241 extends class5 {

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "B")
    public static byte field3677;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[Ljn;")
    public static class327[] field3676;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)V", line = 8)
    public static final void method1671(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1672(81, -3, -72);
        }
        class188 var3 = class147.method1111(-6, arg0, 1);
        field3673++;
        var3.method1392((byte) -48);
        var3.field2959 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V", line = 24)
    public static final void method1672(int arg0, int arg1, int arg2) {
        if (arg2 == 8) {
            arg2 = 4;
        }
        if (arg1 >= -122) {
            method1671(85, 86, false);
        }
        field3678++;
        if (arg2 == 4 && !class122.field1874) {
            arg0 = 2;
            arg2 = 2;
        }
        if (class224.field3430 != arg2) {
            if (class234.field3557) {
                return;
            }
            if (class224.field3430 != 0) {
                class178.field2831[class224.field3430].method355();
            }
            if (arg2 != 0) {
                class321 var3 = class178.field2831[arg2];
                var3.method351();
                var3.method353(arg0);
            }
            class38.field569 = arg0;
            class224.field3430 = arg2;
        } else if (arg2 != 0 && class38.field569 != arg0) {
            class178.field2831[arg2].method353(arg0);
            class38.field569 = arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()V", line = 72)
    public static final void method1673() {
        if (class263.field4062 != null) {
            for (int var0 = 0; var0 < class263.field4062.length; var0++) {
                for (int var1 = 0; var1 < class75.field1091; var1++) {
                    for (int var2 = 0; var2 < class115.field1818; var2++) {
                        class263.field4062[var0][var1][var2] = null;
                    }
                }
            }
        }
        class319.field4929 = (class58[][]) null;
        if (class67.field967 != null) {
            for (int var3 = 0; var3 < class67.field967.length; var3++) {
                for (int var4 = 0; var4 < class75.field1091; var4++) {
                    for (int var5 = 0; var5 < class115.field1818; var5++) {
                        class67.field967[var3][var4][var5] = null;
                    }
                }
            }
        }
        class134.field2034 = (class58[][]) null;
        class298.field4582 = 0;
        if (class262.field4047 != null) {
            for (int var6 = 0; var6 < class298.field4582; var6++) {
                class262.field4047[var6] = null;
            }
        }
        if (class192.field2994 != null) {
            for (int var7 = 0; var7 < class31.field370; var7++) {
                class192.field2994[var7] = null;
            }
            class31.field370 = 0;
        }
        if (class146.field2226 != null) {
            for (int var8 = 0; var8 < class146.field2226.length; var8++) {
                class146.field2226[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 176)
    public static void method1674(int arg0) {
        if (arg0 == 29836) {
            field3676 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V", line = 190)
    public class241(int arg0, int arg1) {
        this.field3675 = arg1;
        this.field3674 = arg0;
    }
}
