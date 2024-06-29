import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class194 {

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lqj;")
    public static class196 field3412 = class80.method502(": ", -48);

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[I")
    public static int[] field3415 = new int[5];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lqj;")
    public static class196 field3406 = class80.method502("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", -48);

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lqj;")
    public static class196 field3413 = class80.method502("null", -48);

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3417 = 128;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lqj;")
    public static class196 field3416 = class80.method502("welle2:", -48);

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[Lqj;")
    public static class196[] field3410 = new class196[8];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lai;")
    public static class77 field3408;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lnb;")
    public static class95 field3414;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method1277(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg10 < 41) {
            method1278(-57);
        }
        field3411++;
        if (class102.field1477.field2049 == 2) {
            return class182.method1190(arg6, arg11, (byte) -66, arg5, arg0, arg9, arg3, arg4, arg1, arg8, arg2, arg7);
        } else if (class102.field1477.field2049 > 2) {
            return class57.method371(arg2, arg6, arg8, arg9, arg11, arg5, arg7, arg4, (byte) -127, arg0, arg1, arg3, class102.field1477.field2049);
        } else {
            return class56.method356(arg2, arg0, arg8, arg9, arg5, arg4, arg11, arg7, (byte) -63, arg6, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field3412 = null;
        field3408 = null;
        if (arg0 != 22055) {
            return;
        }
        field3410 = null;
        field3406 = null;
        field3416 = null;
        field3415 = null;
        field3413 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    public static final int method1279(int arg0, int arg1) {
        field3409++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= -88) {
            return 42;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }
}
