import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class207 {

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lia;")
    public static class257 field3552 = class28.method234(91, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!h", name = "g", descriptor = "B")
    public static byte field3550;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lfa;")
    public static class176 field3551;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "[[[B")
    public static byte[][][] field3553;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V")
    public static final void method1394(boolean arg0, int arg1) {
        field3544++;
        byte[][] var2 = class253.field4353;
        int var3 = class135.field2409.length;
        int var4 = -31 % ((-arg1 - 74) / 37);
        for (int var5 = 0; var5 < var3; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class197.field3328[var5] >> 8) * 64 - class244.field4232;
                int var8 = (class197.field3328[var5] & 0xFF) * 64 - class231.field3878;
                class39.method319((byte) 57);
                class175.method1190(var8, var7, class173.field2961, 125, arg0, var6);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)Lia;")
    public static final class257 method1395(boolean arg0, int arg1, int arg2) {
        if (arg2 != -8222) {
            method1397(-125, true, -97, -30L);
        }
        field3549++;
        return class244.method1599(121, arg1, 10, arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method1396(byte arg0) {
        int var1 = -125 % ((arg0 + 14) / 42);
        field3551 = null;
        field3553 = null;
        field3552 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZIJ)Lia;")
    public static final class257 method1397(int arg0, boolean arg1, int arg2, long arg3) {
        field3545++;
        if (arg0 < ~arg2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        for (long var6 = arg3 / (long) arg2; var6 != 0L; var6 /= (long) arg2) {
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg3 % (long) arg2);
            arg3 /= (long) arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - (var10 + 1)] = (byte) (var12 + 48);
        }
        class257 var11 = new class257();
        var11.field4407 = var9;
        var11.field4447 = var8;
        return var11;
    }
}
