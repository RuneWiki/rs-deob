import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class58 {

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "J")
    public static long field766;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Loha;")
    public static class465 field765;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method350(int arg0) {
        field765 = null;
        if (arg0 != -20928) {
            field766 = -108L;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
    public static final void method351(boolean arg0) {
        field767++;
        try {
            if (class693.field8903 == 1) {
                int var1 = class687.field8841.method3575(true);
                if (var1 > 0 && class687.field8841.method3566((byte) 127)) {
                    int var2 = var1 - class685.field8831;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class687.field8841.method3555(-122, var2);
                    return;
                }
                class687.field8841.method3540(73);
                class687.field8841.method3542(false);
                class38.field431 = null;
                class181.field2475 = null;
                if (class416.field5500 == null) {
                    class693.field8903 = 0;
                } else {
                    class693.field8903 = 2;
                }
            }
            if (class693.field8903 == 3) {
                int var3 = class687.field8841.method3575(true);
                if (class745.field10115 > var3 && class687.field8841.method3566((byte) 127)) {
                    int var4 = class405.field5380 + var3;
                    if (class745.field10115 < var4) {
                        var4 = class745.field10115;
                    }
                    class687.field8841.method3555(-122, var4);
                    return;
                }
                class693.field8903 = 0;
                class405.field5380 = 0;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class687.field8841.method3540(107);
            class38.field431 = null;
            class416.field5500 = null;
            class168.field2234 = null;
            class693.field8903 = 0;
            class181.field2475 = null;
        }
        if (!arg0) {
            method350(-12);
        }
    }
}
