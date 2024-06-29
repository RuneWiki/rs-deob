import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class623 extends class339 {

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field8632 = 0;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field8637 = 0;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "Lwh;")
    private class546 field8639;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "[Lf;")
    public static class532[] field8633;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILio;)V")
    public final void method3464(int arg0, class157 arg1) {
        field8638++;
        while (true) {
            int var3 = arg1.method930(arg0 + 254);
            if (var3 == 0) {
                if (arg0 == 1) {
                    return;
                } else {
                    method3467(-49);
                    return;
                }
            }
            this.method3468(arg1, 1751, var3);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(ZII)I")
    public final int method3465(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method3466(107, 41, null);
        }
        field8631++;
        if (this.field8639 == null) {
            return arg1;
        } else {
            class37 var4 = (class37) this.field8639.method3057(1, (long) arg2);
            return var4 == null ? arg1 : var4.field505;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method3466(int arg0, int arg1, String arg2) {
        if (arg0 != 249) {
            field8637 = 61;
        }
        field8635++;
        if (this.field8639 == null) {
            return arg2;
        } else {
            class419 var4 = (class419) this.field8639.method3057(arg0 - 248, (long) arg1);
            return var4 == null ? arg2 : var4.field5506;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method3467(int arg0) {
        field8633 = null;
        if (arg0 != 0) {
            method3467(-13);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lio;II)V")
    private final void method3468(class157 arg0, int arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method930(255);
            if (this.field8639 == null) {
                int var5 = class385.method2206(0, var4);
                this.field8639 = new class546(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method930(255) == 1;
                int var8 = arg0.method933((byte) 1);
                class45 var9;
                if (var7) {
                    var9 = new class419(arg0.method925(50));
                } else {
                    var9 = new class37(arg0.method908(false));
                }
                this.field8639.method3061(arg1 - 1628, (long) var8, var9);
            }
        }
        field8634++;
        if (arg1 != 1751) {
            this.field8639 = null;
        }
    }
}
