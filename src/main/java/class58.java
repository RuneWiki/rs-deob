import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 extends class120 {

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "[I")
    public static int[] field1336 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "[I")
    public static int[] field1350 = new int[5];

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "[Lva;")
    public static class121[] field1354 = new class121[100];

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lva;")
    private static class121 field1349 = class107.method797("We suspect someone knows your password)3", -10983);

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "Lva;")
    public static class121 field1352 = field1349;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Lqa;")
    public static class96 field1341 = new class96(32);

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "Li;")
    public static class48 field1355 = new class48(64);

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "B")
    public byte field1340;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lrc;")
    public static class103 field1348;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "Lbe;")
    public class12 field1337;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "[I")
    public static int[] field1351;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 11)
    public static final void method418(int arg0) {
        field1353++;
        if (class119.field2740 != null) {
            class119.field2740.method293(-2);
        }
        class119.field2740 = null;
        class97.method658((byte) 80);
        field1348.method755();
        for (int var1 = 0; var1 < 4; var1++) {
            class18.field385[var1].method124(-115);
        }
        System.gc();
        class18.method155(10, (byte) 119);
        class85.field1957 = 0;
        if (arg0 <= -65) {
            class57.field1323 = -1;
            class60.method437((byte) 67, 10);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lhe;Lhe;ZII)Lhd;", line = 47)
    public static final class46 method419(class47 arg0, class47 arg1, boolean arg2, int arg3, int arg4) {
        field1342++;
        boolean var5 = true;
        int[] var6 = arg1.method333(arg3, 87);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method320(var6[var7], arg4 - 536852857, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method320(var9, 18054, 0);
                } else {
                    var10 = arg0.method320(0, arg4 ^ 0x1FFFB979, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg4 != 536870911) {
            method418(116);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class46(arg1, arg0, arg3, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 100)
    public static final void method420(int arg0) {
        field1343++;
        class103.field2345 = true;
        if (arg0 == 12855) {
            class38.field879 = true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V", line = 143)
    public static void method421(byte arg0) {
        if (arg0 != 27) {
            return;
        }
        field1341 = null;
        field1354 = null;
        field1349 = null;
        field1336 = null;
        field1355 = null;
        field1350 = null;
        field1351 = null;
        field1352 = null;
        field1348 = null;
    }
}
