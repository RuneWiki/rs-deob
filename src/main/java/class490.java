import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class490 {

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public int field6847 = 0;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field6846 = 0;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "Lfa;")
    public static class212 field6845;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iba", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field6852;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
    public static void method2854(byte arg0) {
        int var1 = -95 % ((79 - arg0) / 44);
        field6845 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)V")
    public static final void method2855(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class328.method1909(var3.field6212);
        class328.method1909(var3.field6209);
        if (var3.field6212 != null) {
            var3.field6212 = null;
        }
        if (var3.field6209 != null) {
            var3.field6209 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILun;)V")
    public final void method2856(int arg0, class389 arg1) {
        if (arg0 != 1) {
            field6846 = 40;
        }
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                field6849++;
                return;
            }
            this.method2859(var3, -6, arg1);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILdc;)V")
    public static final void method2857(int arg0, class5 arg1) {
        for (int var2 = arg0; var2 < class677.field9699; var2++) {
            int var3 = class700.field9908[var2];
            class613 var4 = class184.field2252[var3];
            int var5 = arg1.method2229(arg0 + 255);
            if ((var5 & 0x80) != 0) {
                var5 += arg1.method2229(255) << 8;
            }
            if ((var5 & 0x4000) != 0) {
                var5 += arg1.method2229(255) << 16;
            }
            class406.method2462(-65536, var3, var4, arg1, var5);
        }
        field6850++;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static final void method2858(int arg0) {
        if (class517.field7570.field3401) {
            class590.field8558 = 96;
        } else {
            try {
                Method var1 = (field6852 == null ? (field6852 = method2860("java.lang.Runtime")) : field6852).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class590.field8558 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != 1048576) {
            method2855(-23, -27, -33);
        }
        field6851++;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IILun;)V")
    private final void method2859(int arg0, int arg1, class389 arg2) {
        if (~arg0 == arg1) {
            this.field6847 = arg2.method2260(-76);
        }
        field6848++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2860(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
