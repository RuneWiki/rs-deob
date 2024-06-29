import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class200 extends class5 {

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field3615 = 1;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "Lhj;")
    public static class69 field3623 = class181.method1318("Schlie-8en", (byte) -128);

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Lf;")
    public static class35 field3614 = class161.method1207(false);

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "Lhj;")
    public static class69 field3624 = null;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "Lhj;")
    public class69 field3610;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "[I")
    public int[] field3608;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "[I")
    public int[] field3609;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "[I")
    public static int[] field3625;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "[Lc;")
    public class103[] field3612;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[Lhj;")
    public class69[] field3616;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLnc;I)[Lhk;")
    public static final class121[] method1455(byte arg0, class83 arg1, int arg2) {
        if (arg0 < 21) {
            method1457(69, (class83) null, 2, -107);
        }
        field3622++;
        return class240.method1702(-128, arg1, arg2) ? class123.method886(-81) : null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method1456(int arg0, int arg1) {
        if (arg1 == 9423) {
            field3619++;
            class159.field2960.method1708(-1009973721, arg0);
            class46.field661.method1708(-1009973721, arg0);
            class237.field4299.method1708(-1009973721, arg0);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILnc;II)[Lqb;")
    public static final class56[] method1457(int arg0, class83 arg1, int arg2, int arg3) {
        field3607++;
        return class244.method1735(arg1, arg3 ^ arg3, arg0, arg2) ? class59.method361(16342) : null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI[B)I")
    public static final int method1458(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3618++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class62.field1188[(var4 ^ arg3[var5]) & 0xFF];
        }
        if (arg1 > -111) {
            method1457(65, (class83) null, 31, -50);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static void method1459(int arg0) {
        field3624 = null;
        field3625 = null;
        field3614 = null;
        if (arg0 != -4278) {
            method1455((byte) -88, (class83) null, -103);
        }
        field3623 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lnc;Lnc;IBI)Ld;")
    public static final class225 method1460(class83 arg0, class83 arg1, int arg2, byte arg3, int arg4) {
        field3606++;
        if (class244.method1735(arg0, 0, arg4, arg2)) {
            if (arg3 >= -96) {
                field3625 = null;
            }
            return class201.method1465(107, arg1.method590(arg2, arg4, 0));
        } else {
            return null;
        }
    }
}
