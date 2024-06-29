import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class420 implements class255 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field5969;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Ljava/lang/String;")
    public String field5964;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field5976;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lkfa;")
    public class407 field5967;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lgq;")
    public class761 field5973;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field5966;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lmq;")
    public static class78 field5971 = new class78(51, 6);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2496(int arg0) {
        if (arg0 != 256) {
            field5971 = null;
        }
        field5971 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Lqi;")
    public final class669 method271(boolean arg0) {
        if (arg0) {
            this.method271(false);
        }
        field5968++;
        return class6.field66;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2497(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5972++;
        if (arg0 < 8) {
            field5971 = null;
        }
        for (class241 var7 = (class241) class652.field8973.method1839(-118); var7 != null; var7 = (class241) class652.field8973.method1836((byte) -26)) {
            if (var7.field3100 <= class266.field3368) {
                var7.method3869(true);
            } else {
                class411.method2438(arg5, arg4 >> 1, var7.field3108 * 2, (var7.field3113 << 9) + 256, arg2, var7.field3103, (var7.field3105 << 9) + 256, 103, arg1 >> 1);
                class100.field1234.method2510(class681.field9310[1] + arg3, 0, var7.field3104 | 0xFF000000, 16777215, var7.field3109, class681.field9310[0] + arg6);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/lang/String;Lgq;Lkfa;IIIIIIIIII)V")
    public class420(String arg0, class761 arg1, class407 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field5969 = arg11;
        this.field5970 = arg7;
        this.field5964 = arg0;
        this.field5975 = arg5;
        this.field5976 = arg10;
        this.field5979 = arg4;
        this.field5978 = arg12;
        this.field5974 = arg6;
        this.field5967 = arg2;
        this.field5973 = arg1;
        this.field5966 = arg8;
        this.field5965 = arg9;
        this.field5977 = arg3;
    }
}
