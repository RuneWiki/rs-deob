import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class60 extends class166 {

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "Z")
    public static boolean field911 = true;

    @OriginalMember(owner = "client!pba", name = "H", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!pba", name = "I", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!pba", name = "G", descriptor = "[I")
    public static int[] field912;

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lgga;Lgga;Lpo;)V", line = 8)
    public class60(class513 arg0, class513 arg1, class370 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "(I)V", line = 15)
    public static void method621(int arg0) {
        if (arg0 > -47) {
            method621(77);
        }
        field912 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)I", line = 25)
    public static final int method622(int arg0, int arg1) {
        if (arg1 < 71) {
            method624(126, 30, -34, (class685) null, 75, -68);
        }
        ++field915;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIII)V", line = 39)
    public final void method623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field914;
        int var6 = super.field2532.method11();
        int var7 = ((class370) super.field5885).field5219 * class526.method3077((byte) -38) / 10 % var6;
        if (arg0 != 12) {
            method621(123);
        }
        super.field2532.method757(-var6 + arg3 - -var7, arg1, -var7 + arg4 + var6, arg2);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILpe;II)V", line = 57)
    public static final void method624(int arg0, int arg1, int arg2, class685 arg3, int arg4, int arg5) {
        ++field910;
        if (arg2 == 23104) {
            if (~arg4 <= -2 && ~arg5 <= -2 && class192.field2891 - 2 >= arg4 && ~arg5 >= ~(class456.field6225 + -2)) {
                if (class514.field7096 == null) {
                    return;
                }
                class226 var6 = class465.field6343.method708(-3, arg1, arg0, arg5, arg4);
                if (var6 != null) {
                    if (var6 instanceof class148) {
                        ((class148) var6).method1176(arg3, (byte) 82);
                        return;
                    }
                    if (var6 instanceof class457) {
                        ((class457) var6).method2676(1, arg3);
                        return;
                    }
                    if (var6 instanceof class266) {
                        ((class266) var6).method1711(0, arg3);
                        return;
                    }
                    if (var6 instanceof class413) {
                        ((class413) var6).method2434(arg3, (byte) -100);
                        return;
                    }
                }
            }
        }
    }
}
