import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class145 extends class79 implements class113 {

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lro;")
    public class2 field1878;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Z")
    private boolean field1871;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Lwt;")
    public static class194 field1883 = new class194("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field1885 = new String[200];

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lgs;")
    public static class33 field1887;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lpj;")
    public static class94 field1876;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Z")
    public static boolean field1886;

    static {
        new class194("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field1888 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLeq;)V", line = 3)
    public final void method372(byte arg0, class134 arg1) {
        this.field1878.method7(arg1, (byte) 34);
        if (arg0 > -49) {
            this.method369((byte) 99);
        }
        ++field1879;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Z", line = 14)
    public final boolean method723(int arg0) {
        ++field1881;
        if (arg0 != 17774) {
            this.method369((byte) 50);
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 26)
    public final void method722(int arg0) {
        if (arg0 != 0) {
            this.method361((class134) null, -21);
        }
        ++field1882;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I", line = 37)
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            this.method368(-50);
        }
        ++field1877;
        return this.field1878.field39;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 53)
    public final void method368(int arg0) {
        ++field1874;
        if (arg0 != 5894) {
            this.method364((class134) null, true);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILeq;BI)Z", line = 64)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field1875;
        int var5 = -14 / ((-23 - arg2) / 38);
        class327 var6 = this.field1878.method16(super.field1106, -1, super.field1111, arg1, false, 131072, false);
        if (var6 == null) {
            return false;
        } else {
            class33 var7 = arg1.method830();
            var7.method278(super.field1111, super.field1107, super.field1106);
            return var6.method184(arg0, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I", line = 86)
    public final int method369(byte arg0) {
        ++field1884;
        if (arg0 <= 24) {
            this.method372((byte) 23, (class134) null);
        }
        return this.field1878.field12;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Z", line = 99)
    public final boolean method371(boolean arg0) {
        if (arg0) {
            field1887 = null;
        }
        ++field1880;
        return this.field1878.method14((byte) 81);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 110)
    public static void method908(byte arg0) {
        field1885 = null;
        field1883 = null;
        field1887 = null;
        field1876 = null;
        int var1 = 116 / ((arg0 - 39) / 62);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Leq;I)V", line = 122)
    public final void method361(class134 arg0, int arg1) {
        ++field1873;
        class327 var3 = this.field1878.method16(super.field1106, arg1, super.field1111, arg0, true, 262144, true);
        if (var3 != null) {
            int var4 = super.field1111 >> 7;
            int var5 = super.field1106 >> 7;
            this.field1878.method13(var3, arg1 ^ 32532, var5, var4, false, var4, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Leq;Z)V", line = 140)
    public final void method360(class134 arg0, boolean arg1) {
        ++field1868;
        this.field1878.method4((byte) -38, arg0);
        if (!arg1) {
            this.method719(62, 1, 92, (class250) null, 78, false, (class134) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILeq;Z)Lva;", line = 155)
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field1872;
            return this.field1878.method16(0, -1, 0, arg1, false, arg0, false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Leq;Z)Lgl;", line = 166)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field1869;
        class327 var3 = this.field1878.method16(super.field1106, -1, super.field1111, arg0, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class33 var4 = arg0.method830();
            var4.method278(super.field1111, super.field1107, super.field1106);
            class408 var5 = null;
            if (this.field1871) {
                var5 = class118.method675(-128, 1);
            }
            if (this.field1878.field15 != null) {
                class191 var6 = this.field1878.field15.method2005();
                arg0.method787(var3, var6, var4, var5 != null ? var5.field5983[0] : null, 0);
            } else {
                var3.method191(var4, var5 != null ? var5.field5983[0] : null, 0);
            }
            int var7 = super.field1111 >> 7;
            int var8 = super.field1106 >> 7;
            this.field1878.method13(var3, -32533, var8, var7, true, var7, arg0, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Leq;Lhn;IIIIIZII)V", line = 205)
    public class145(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field7109, arg1.field7083);
        this.field1878 = new class2(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1871 = arg1.field7041 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 214)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg2 != -1) {
            this.field1878 = null;
        }
        ++field1870;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)I", line = 229)
    public final int method362(byte arg0) {
        ++field1867;
        if (arg0 != -72) {
            field1887 = null;
        }
        return this.field1878.field9;
    }
}
