import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class293 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4612 = 0;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4614 = "yellow:";

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Lee;")
    public static class288 field4615;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[[[Lgb;")
    public static class149[][][] field4613;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method1967(int arg0) {
        field4611++;
        class146.field2258++;
        class292.field4607.method1251(arg0, (byte) -108);
        class292.field4607.method287(440742616, class245.method1659(114));
        class292.field4607.method312(1489253544, class35.field573);
        class292.field4607.method312(1489253544, class277.field4369);
        class292.field4607.method287(arg0 + 440742455, class30.field474);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZB)V")
    public static final void method1968(boolean arg0, byte arg1) {
        field4618++;
        class130.method916(arg1 ^ 0xFFFFFFF0);
        if (class239.field3715 != 30 && class239.field3715 != 25) {
            return;
        }
        class63.field1010++;
        if (class63.field1010 < 50 && !arg0) {
            return;
        }
        class63.field1010 = 0;
        if (!class297.field4686 && class118.field1829 != null) {
            class50.field805++;
            class292.field4607.method1251(6, (byte) -103);
            try {
                class118.field1829.method1243(0, class292.field4607.field583, class292.field4607.field588, (byte) -88);
                class292.field4607.field588 = 0;
            } catch (IOException var2) {
                class297.field4686 = true;
            }
        }
        class130.method916(arg1 - 206);
        if (arg1 != 97) {
            field4612 = -125;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILf;)V")
    public static final void method1969(int arg0, class37 arg1) {
        field4610++;
        if (arg0 >= -94) {
            field4612 = -51;
        }
        for (int var2 = 0; var2 < class222.field3474; var2++) {
            int var3 = arg1.method285((byte) 35);
            int var4 = arg1.method293(92);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class276.field4356[var3] != null) {
                class276.field4356[var3].field1786 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method1970(int arg0) {
        field4613 = null;
        field4614 = null;
        if (arg0 == -2) {
            field4615 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1971(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4616++;
        if (arg0 <= 42 || arg4 < 1 || arg3 < 1 || arg4 > 102 || arg3 > 102) {
            return;
        }
        if (!class223.method1487(98) && (class191.field3041[0][arg4][arg3] & 0x2) == 0) {
            int var8 = arg2;
            if ((class191.field3041[arg2][arg4][arg3] & 0x8) != 0) {
                var8 = 0;
            }
            if (class210.field3264 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class191.field3041[1][arg4][arg3] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class190.method1284((byte) 105, arg3, arg2, class72.field1142[arg2], arg5, arg4, var9);
        if (arg1 < 0) {
            return;
        }
        boolean var10 = class1.field16;
        class1.field16 = true;
        class7.method83(false, arg1, arg7, var9, arg3, arg2, arg6, arg4, -120, false, class72.field1142[arg2]);
        class1.field16 = var10;
        return;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)Lu;")
    public static final class120 method1972(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 6) {
            field4612 = -115;
        }
        class120 var4 = new class120();
        var4.field1852 = arg0;
        var4.field1853 = arg1;
        field4609++;
        class13.field230.method1409((long) arg2, 1, var4);
        class126.method897(0, arg0);
        class188 var5 = class5.method57((byte) -107, arg2);
        if (var5 != null) {
            class246.method1663(255, var5);
        }
        if (class174.field2577 != null) {
            class246.method1663(255, class174.field2577);
            class174.field2577 = null;
        }
        int var6 = class220.field3450;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class165.method1096(3, class80.field1341[var7])) {
                class177.method1180(var7, -91);
            }
        }
        if (class220.field3450 == 1) {
            class64.field1025 = false;
            class178.method1187(0, class154.field2353, class139.field2139, class273.field4313, class92.field1478);
        } else {
            class178.method1187(0, class154.field2353, class139.field2139, class273.field4313, class92.field1478);
            int var8 = class123.field1925.method10(class215.field3315);
            for (int var9 = 0; var9 < class220.field3450; var9++) {
                int var10 = class123.field1925.method10(class57.method454(15827, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class92.field1478 = (class23.field336 ? 26 : 22) + class220.field3450 * 15;
            class273.field4313 = var8 + 8;
        }
        if (var5 != null) {
            class160.method1079(false, 5, var5);
        }
        class208.method1394(arg0, (byte) -123);
        if (class34.field544 != -1) {
            class205.method1374(class34.field544, 1, 1);
        }
        return var4;
    }
}
