import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "J")
    public long field444 = 0L;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Ldd;")
    public static class35 field452 = class180.method1196((byte) 126, "title_mute");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Z")
    public static boolean field442 = false;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Ll;")
    public static class107 field445 = new class107(8);

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Ldd;")
    public static class35 field456 = class180.method1196((byte) 126, "Die Verbindung konnte");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Llc;")
    public class110 field446;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Llc;")
    public class110 field448;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lag;")
    public static class8 field455;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "[I")
    public static int[] field450;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        if (arg0 != 0) {
            method198(null, null, -127);
        }
        field452 = null;
        field450 = null;
        field445 = null;
        field455 = null;
        field456 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field439++;
        if (class193.method1261((byte) 111, arg7)) {
            class93.field2056 = null;
            class102.method761(arg5 + 27136, arg3, arg6, arg1, arg2, arg8, class163.field3299[arg7], -1, arg4, arg0);
            if (arg5 != -27036) {
                method196(29);
            }
            if (class93.field2056 != null) {
                class102.method761(32, class74.field1758, arg6, arg1, arg2, arg8, class93.field2056, -1412584499, arg4, class102.field2285);
                class93.field2056 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class158.field3228[var9] = true;
            }
        } else {
            class158.field3228[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([S[Ldd;I)V")
    public static final void method198(short[] arg0, class35[] arg1, int arg2) {
        if (arg2 != -16794) {
            field442 = false;
        }
        field453++;
        class168.method1103(18053, arg1, arg0, arg1.length - 1, 0);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method199(int arg0) {
        field443++;
        while (class172.field3441.method664(false, class101.field2224) >= 27) {
            int var1 = class172.field3441.method661(15, (byte) -79);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class204.field4058[var1] == null) {
                var2 = true;
                class204.field4058[var1] = new class19();
            }
            class19 var3 = class204.field4058[var1];
            class73.field1738[class83.field1921++] = var1;
            var3.field1665 = class89.field1988;
            int var4 = class172.field3441.method661(5, (byte) -79);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class172.field3441.method661(5, (byte) -79);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class172.field3441.method661(1, (byte) -79);
            var3.field377 = class184.method1222(-20643, class172.field3441.method661(14, (byte) -79));
            int var7 = class195.field3888[class172.field3441.method661(3, (byte) -79)];
            if (var2) {
                var3.field1613 = var3.field1618 = var7;
            }
            int var8 = class172.field3441.method661(1, (byte) -79);
            if (var8 == 1) {
                class165.field3327[class175.field3579++] = var1;
            }
            var3.field1638 = var3.field377.field3746;
            var3.field1607 = var3.field377.field3720;
            var3.field1635 = var3.field377.field3742;
            var3.field1644 = var3.field377.field3717;
            var3.field1609 = var3.field377.field3708;
            var3.field1643 = var3.field377.field3709;
            if (var3.field1638 == 0) {
                var3.field1618 = 0;
            }
            var3.field1642 = var3.field377.field3727;
            var3.field1619 = var3.field377.field3743;
            var3.field1645 = var3.field377.field3755;
            var3.method558(var6 == 1, -50, class71.field1704.field1605[0] + var4, class71.field1704.field1603[0] + var5);
        }
        if (arg0 != 0) {
            field450 = null;
        }
        class172.field3441.method667(false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILag;)Lbg;")
    public static final class18 method200(int arg0, int arg1, class8 arg2) {
        if (arg1 != -21755) {
            field452 = null;
        }
        field447++;
        return class100.method751((byte) 104, arg2, arg0) ? class73.method581(115) : null;
    }
}
