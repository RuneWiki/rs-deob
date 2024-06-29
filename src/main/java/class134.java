import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class134 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[I")
    public static int[] field2348 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lcf;")
    private static class93 field2343 = class147.method1066("Starting 3d Library", -48);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lcf;")
    public static class93 field2349 = field2343;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lg;")
    public static class276 field2347 = new class276(64);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Ljl;")
    public static class245 field2346;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[[[B")
    public static byte[][][] field2350;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
    public static final void method977(int arg0, boolean arg1) {
        field2345++;
        int var2 = class204.field3675.length;
        byte[][] var3 = class50.field827;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class149.field2614[var4] >> 8) * 64 - class229.field4111;
                int var7 = (class149.field2614[var4] & 0xFF) * 64 - class4.field52;
                class226.method1559(false);
                class264.method1766(var5, arg1, (byte) 29, class148.field2605, var6, var7);
            }
        }
        if (arg0 != 8) {
            method977(10, true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
    public abstract int method978(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public abstract void method979(byte arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)[Ldh;")
    public static final class120[] method980(int arg0) {
        field2344++;
        if (arg0 >= -51) {
            method980(98);
        }
        class120[] var1 = new class120[class245.field4415];
        for (int var2 = 0; var2 < class245.field4415; var2++) {
            byte[] var3 = class255.field4614[var2];
            int var4 = class42.field663[var2] * class246.field4435[var2];
            if (class72.field1291[var2]) {
                byte[] var7 = class246.field4439[var2];
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class270.method1797(class58.method333(255, var7[var9]) << 24, class248.field4475[class58.method333(255, var3[var9])]);
                }
                var1[var2] = new class81(class153.field2693, class226.field4044, class169.field2974[var2], class67.field1230[var2], class246.field4435[var2], class42.field663[var2], var8);
            } else {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    var5[var6] = class248.field4475[class58.method333(255, var3[var6])];
                }
                var1[var2] = new class158(class153.field2693, class226.field4044, class169.field2974[var2], class67.field1230[var2], class246.field4435[var2], class42.field663[var2], var5);
            }
        }
        class50.method276((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static void method981(boolean arg0) {
        field2346 = null;
        if (!arg0) {
            method977(-58, false);
        }
        field2349 = null;
        field2350 = null;
        field2343 = null;
        field2348 = null;
        field2347 = null;
    }
}
