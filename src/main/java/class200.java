import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class200 extends class390 {

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Ljava/lang/String;")
    public String field2765;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Z")
    public static boolean field2769 = false;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Lmn;")
    public static class206 field2763;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Lnq;")
    public static class268 field2767;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILmj;IIIILuo;III)Lmj;")
    public static final class394 method1305(int arg0, int arg1, class394 arg2, int arg3, int arg4, int arg5, int arg6, class345 arg7, int arg8, int arg9, int arg10) {
        field2764++;
        long var11 = (long) arg9;
        class394 var13 = (class394) class248.field3509.method904(false, var11);
        if (arg4 >= -19) {
            field2763 = null;
        }
        short var14 = 1031;
        if (var13 == null) {
            class223 var15 = class121.method823(0, false, class248.field3512, arg9);
            if (var15 == null) {
                return null;
            }
            var13 = arg7.method62(var15, var14, class13.field258, 64, 768);
            class248.field3509.method902(var11, (byte) 112, var13);
        }
        class394 var16 = var13.method1430((byte) 2, var14, true);
        if (arg1 != 0) {
            var16.method1441(arg1);
        }
        if (arg8 != 0) {
            var16.method1413(arg8);
        }
        if (arg6 != 0) {
            var16.method1427(arg6);
        }
        if (arg3 != 0) {
            var16.method1455(0, arg3, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static void method1306(int arg0) {
        field2763 = null;
        if (arg0 == -1) {
            field2767 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)Lhh;")
    public static final class67 method1307(int arg0, int arg1, int arg2) {
        field2766++;
        class67 var3 = new class67();
        var3.field1009 = -1;
        var3.field993 = -1;
        var3.field995 = arg0 + 1 + 5;
        var3.field1013 = arg1 + 1 + 5;
        if (arg2 <= 118) {
            method1305(-49, 93, (class394) null, -25, 126, 40, 10, (class345) null, -115, -118, 114);
        }
        var3.field1016 = new int[var3.field1013][var3.field995];
        var3.method532((byte) -95);
        return var3;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
    public class200() {
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class200(String arg0) {
        this.field2765 = arg0;
    }
}
