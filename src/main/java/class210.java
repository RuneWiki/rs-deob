import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class210 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public int field3359 = -1;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3351 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3363 = 1;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lja;")
    public static class64 field3354;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lja;")
    public static class64 field3356;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[[I")
    public static int[][][] field3362;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 5)
    public static void method1529(int arg0) {
        field3351 = null;
        if (arg0 >= 113) {
            field3362 = (int[][][]) null;
            field3356 = null;
            field3354 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I", line = 23)
    public static final int method1530(int arg0, int arg1) {
        field3366++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        if (arg0 >= -5) {
            field3356 = (class64) null;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lhj;", line = 61)
    public static final class29 method1531(int arg0, byte arg1) {
        field3365++;
        class29 var2 = (class29) class152.field2447.method1830((long) arg0, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -79) {
            field3354 = (class64) null;
        }
        byte[] var3 = class75.field1154.method467(arg0, arg1 + 149, 34);
        class29 var4 = new class29();
        if (var3 != null) {
            var4.method195(arg0, new class101(var3), (byte) -71);
        }
        class152.field2447.method1831((long) arg0, var4, -13897);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)I", line = 91)
    public static final int method1532(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field3355++;
        if (arg0 != -1429694904) {
            field3354 = (class64) null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
