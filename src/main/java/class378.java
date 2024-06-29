import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class378 {

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Laa;")
    public static class76 field5693 = new class76(29, 2);

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Luv;")
    public static class2 field5695 = new class2(24, 2);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lqs;")
    public static class50 field5692;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 3)
    public static void method2231(int arg0) {
        field5693 = null;
        field5695 = null;
        field5692 = null;
        if (arg0 < 120) {
            field5694 = 75;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z[Lgo;IIII)V", line = 24)
    public static final void method2232(boolean arg0, class310[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -1) {
            method2233((byte) 2);
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class310 var7 = arg1[var6];
            if (var7 != null && var7.field4753 == arg4) {
                class104.method786(arg3, arg0, arg5, -4400, var7);
                class494.method2937(arg5, var7, arg3, (byte) 125);
                if (var7.field4637 - var7.field4661 < var7.field4719) {
                    var7.field4719 = var7.field4637 - var7.field4661;
                }
                if (var7.field4645 > var7.field4749 - var7.field4736) {
                    var7.field4645 = var7.field4749 - var7.field4736;
                }
                if (var7.field4719 < 0) {
                    var7.field4719 = 0;
                }
                if (var7.field4645 < 0) {
                    var7.field4645 = 0;
                }
                if (var7.field4703 == 0) {
                    class211.method1363(false, var7, arg0);
                }
            }
        }
        field5691++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)I", line = 79)
    public static final int method2233(byte arg0) {
        field5690++;
        if ((double) class137.field2023 == 3.0D) {
            return 37;
        } else if ((double) class137.field2023 == 4.0D) {
            return 50;
        } else if ((double) class137.field2023 == 6.0D) {
            return 75;
        } else if ((double) class137.field2023 == 8.0D) {
            return 100;
        } else {
            if (arg0 != 37) {
                field5692 = null;
            }
            return 200;
        }
    }
}
