import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class421 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public int field5980 = class266.method1599(22396);

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljava/lang/String;")
    public String field5986;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public int field5995;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Ljava/lang/String;")
    public String field5985;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Ljava/lang/String;")
    public String field5990;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public int field5981;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Ljava/lang/String;")
    public String field5988;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
    public String field5984;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field5982 = 500;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Lkfa;")
    public static class407 field5992 = new class407();

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
    public static int[] field5994 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lgg;")
    public static class114 field5993 = new class114(10);

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
    public static int[] field5991;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static final void method2498(int arg0) {
        for (class718 var1 = (class718) class565.field7906.method3111(110); var1 != null; var1 = (class718) class565.field7906.method3116(arg0 - 104)) {
            if (class169.method1057(var1.field10134, 125)) {
                class167.method1035(var1, 0);
            }
        }
        field5997++;
        if (arg0 != 6) {
            field5994 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;I)V")
    public final void method2499(String arg0, int arg1, String arg2, String arg3, boolean arg4, String arg5, int arg6, String arg7, int arg8) {
        this.field5980 = class266.method1599(22396);
        field5996++;
        this.field5985 = arg7;
        this.field5986 = arg0;
        this.field5989 = arg8;
        this.field5984 = arg2;
        this.field5983 = arg1;
        this.field5981 = arg6;
        this.field5988 = arg3;
        this.field5990 = arg5;
        if (arg4) {
            this.field5995 = class266.field3368;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class421(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5986 = arg5;
        this.field5995 = class266.field3368;
        this.field5985 = arg7;
        this.field5990 = arg3;
        this.field5981 = arg1;
        this.field5988 = arg2;
        this.field5984 = arg4;
        this.field5983 = arg6;
        this.field5989 = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public static void method2500(int arg0) {
        field5994 = null;
        if (arg0 <= 19) {
            field5994 = null;
        }
        field5992 = null;
        field5991 = null;
        field5993 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)Z")
    public static final boolean method2501(byte arg0, int arg1, int arg2) {
        if (arg0 != 72) {
            method2498(44);
        }
        field5987++;
        return (arg1 & 0x70000) != 0 | class414.method2453(arg2, arg0 ^ 0x35, arg1) || class506.method2928(arg1, arg2, 16);
    }
}
