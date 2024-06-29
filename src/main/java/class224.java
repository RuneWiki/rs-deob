import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class224 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lkh;")
    public static class117 field4039 = method1450((byte) 115, "blaugr-Un:");

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field4040 = 100;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lkh;")
    public static class117 field4041 = method1450((byte) 114, "Mem:");

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Lkh;")
    public static class117 field4042 = method1450((byte) -78, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
    public static boolean field4044 = true;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1449(int arg0, byte arg1) {
        field4035++;
        if (arg0 == 100 && class175.field3164 > 0) {
            byte[] var2 = class178.field3221[--class175.field3164];
            class178.field3221[class175.field3164] = null;
            return var2;
        }
        if (arg1 >= -6) {
            method1450((byte) -97, null);
        }
        if (arg0 == 5000 && class103.field1871 > 0) {
            byte[] var3 = class137.field2471[--class103.field1871];
            class137.field2471[class103.field1871] = null;
            return var3;
        } else if (arg0 == 30000 && class62.field1240 > 0) {
            byte[] var4 = class45.field982[--class62.field1240];
            class45.field982[class62.field1240] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)Lkh;")
    public static final class117 method1450(byte arg0, String arg1) {
        field4038++;
        byte[] var2 = arg1.getBytes();
        int var3 = 43 / ((arg0 - 66) / 39);
        int var4 = var2.length;
        class117 var5 = new class117();
        var5.field2196 = new byte[var4];
        int var6 = 0;
        while (var4 > var6) {
            int var7 = var2[var6++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var4 <= var6) {
                    break;
                }
                int var8 = var2[var6++] & 0xFF;
                var5.field2196[var5.field2213++] = (byte) (var7 * 43 + var8 - 1720 - 48);
            } else if (var7 != 0) {
                var5.field2196[var5.field2213++] = (byte) var7;
            }
        }
        var5.method779(26553);
        return var5.method793(4096);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1451(byte arg0) {
        field4039 = null;
        if (arg0 >= -79) {
            field4040 = -14;
        }
        field4041 = null;
        field4042 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLai;Lai;)V")
    public static final void method1452(byte arg0, class10 arg1, class10 arg2) {
        field4036++;
        class196.field3527 = arg2;
        class222.field4002 = arg1;
        if (arg0 < 26) {
            method1452((byte) -2, null, null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILai;)Lnb;")
    public static final class144 method1453(int arg0, int arg1, int arg2, class10 arg3) {
        field4043++;
        if (arg0 != 100) {
            method1452((byte) -98, null, null);
        }
        return class96.method654(arg1, arg0 ^ 0xFFFFF7F6, arg2, arg3) ? class101.method681((byte) 3) : null;
    }
}
