import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class322 implements class318 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Ljava/lang/String;")
    public String field3956;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Ldba;")
    public class240 field3963;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lpa;")
    public class648 field3954;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        field3965++;
        if (arg0 != -92) {
            this.field3955 = -61;
        }
        return class632.field8899;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)V")
    public static final void method1825(String arg0, String arg1, String arg2, int arg3, String arg4, int arg5, int arg6, String arg7, int arg8) {
        if (arg8 <= 103) {
            return;
        }
        field3953++;
        class192 var9 = class518.field7380[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class518.field7380[var10] = class518.field7380[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class192(arg5, arg6, arg4, arg1, arg0, arg2, arg3, arg7);
        } else {
            var9.method1171(arg6, arg1, arg3, arg5, arg4, arg0, (byte) 68, arg2, arg7);
        }
        class518.field7380[0] = var9;
        class659.field9249++;
        class583.field8281 = class158.field1780;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/lang/String;Ldba;Lpa;IIIIIIIIII)V")
    public class322(String arg0, class240 arg1, class648 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field3960 = arg4;
        this.field3959 = arg9;
        this.field3964 = arg8;
        this.field3956 = arg0;
        this.field3962 = arg7;
        this.field3966 = arg3;
        this.field3963 = arg1;
        this.field3957 = arg12;
        this.field3952 = arg5;
        this.field3955 = arg10;
        this.field3954 = arg2;
        this.field3958 = arg11;
        this.field3961 = arg6;
    }
}
