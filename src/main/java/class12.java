import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class12 implements class456 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lpga;")
    private class491 field108;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[I")
    public int[] field118;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljba;")
    private class10 field107;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[F")
    public float[] field113;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "J")
    public static long field110 = 20000000L;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method53(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -50 % ((arg2 - 59) / 41);
        field116++;
        if (arg4 >= class184.field3102 && arg5 <= class657.field9347 && class76.field1126 <= arg1 && arg3 <= class461.field6699) {
            class150.method1145(arg0, arg5, arg6, arg7, arg4, arg1, 12345678, arg3);
        } else {
            class539.method3161(arg6, arg4, arg3, arg7, arg5, arg1, 65408, arg0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field115++;
        class117.method928(arg6 ? this.field118 : null, arg1, arg7 ? this.field108.field7108 : null, arg3, arg7 ? this.field113 : null, arg5, -28848, arg4, arg2, this.field108.field7084.field6343, this.field108.field7084.field6344, this.field112, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
    public static final void method55() {
        for (int var0 = 0; var0 < class147.field2305.length; var0++) {
            class147.field2305[var0].method3287();
        }
        class147.field2305 = null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lpga;Lit;Ljba;)V")
    public class12(class491 arg0, class34 arg1, class10 arg2) {
        this.field108 = arg0;
        if ((arg1 instanceof class108)) {
            class108 var5 = (class108) arg1;
            this.field118 = var5.field1589;
            this.field112 = var5.field6711;
            this.field114 = var5.field6725;
        } else if ((arg1 instanceof class513)) {
            class513 var4 = (class513) arg1;
            this.field112 = var4.field6711;
            this.field118 = var4.field7452;
            this.field114 = var4.field6725;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field107 = arg2;
            if (this.field107.field103 != this.field112 || this.field107.field101 != this.field114) {
                throw new RuntimeException();
            }
            this.field113 = this.field107.field99;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class117.method928(arg6 ? this.field108.field7084.field6344 : null, arg1, arg7 ? this.field113 : null, arg3, arg7 ? this.field108.field7108 : null, arg5, -28848, arg4, arg2, this.field112, this.field118, this.field108.field7084.field6343, arg0);
        field109++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILrs;II)Lsb;")
    public static final class89 method57(int arg0, int arg1, int arg2, class166 arg3, int arg4, int arg5) {
        field111++;
        if (arg5 != 34037) {
            field110 = -60L;
        }
        if (!arg3.field2818 && (!class668.method3743((byte) -121, arg4) || !class668.method3743((byte) -122, arg0))) {
            return arg3.field2824 ? new class89(arg3, 34037, arg1, arg2, arg4, arg0, true) : new class89(arg3, arg1, arg2, arg4, arg0, class567.method3292(arg4, -106), class567.method3292(arg0, -114), true);
        } else {
            return new class89(arg3, 3553, arg1, arg2, arg4, arg0, true);
        }
    }
}
