import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class446 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
    public static boolean field6280 = false;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
    public static volatile boolean field6283 = true;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field6281 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Z")
    public static boolean field6285 = false;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILha;IIIII)Lka;")
    public static final class219 method2635(int arg0, class454 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6284++;
        long var7 = (long) arg5;
        class219 var9 = (class219) class721.field10157.method778(var7, 109);
        short var10 = 2055;
        if (arg4 >= -33) {
            method2635(-80, null, 53, 49, 109, 17, 64);
        }
        if (var9 == null) {
            class415 var11 = class566.method3193(true, 0, arg5, class426.field6058);
            if (var11 == null) {
                return null;
            }
            if (var11.field5853 < 13) {
                var11.method2458((byte) 122, 2);
            }
            var9 = arg1.method150(var11, var10, class691.field9805, 64, 768);
            class721.field10157.method774(var7, 112, var9);
        }
        class219 var12 = var9.method1337((byte) 2, var10, true);
        if (arg6 != 0) {
            var12.method1358(arg6);
        }
        if (arg3 != 0) {
            var12.method1343(arg3);
        }
        if (arg0 != 0) {
            var12.method1373(arg0);
        }
        if (arg2 != 0) {
            var12.method1348(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BB)Z")
    public static final boolean method2636(byte arg0, byte arg1) {
        if (arg1 >= -43) {
            method2636((byte) -39, (byte) -103);
        }
        field6279++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class244.field3144[var2 - 128] != '\u0000';
        }
    }
}
