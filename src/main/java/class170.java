import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class170 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
    public static boolean field3022 = false;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Loa;")
    public static class99 field3028 = class221.method1463(2844, ":assistreq:");

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    public static int[] field3027 = new int[32];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lpi;")
    public static class139 field3031;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    public abstract void method757(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        if (arg0 >= 26) {
            field3031 = null;
            field3028 = null;
            field3027 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)V")
    public static final void method1149(int arg0, boolean arg1) {
        field3025++;
        if (arg0 != 8) {
            field3028 = null;
        }
        byte var2 = 4;
        byte[][] var3 = class123.field2155;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class171.field3042[var5] >> 8) * 64 - class280.field4910;
            byte[] var12 = var3[var5];
            int var13 = (class171.field3042[var5] & 0xFF) * 64 - class215.field3731;
            if (var12 != null) {
                class225.method1485(0);
                class234.method1527(class177.field3091, arg1, var12, arg0 ^ 0x88, var13, class206.field3565 * 8 - 48, (class209.field3628 + -6) * 8, var11);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class171.field3042[var6] >> 8) * 64 - class280.field4910;
            int var8 = (class171.field3042[var6] & 0xFF) * 64 - class215.field3731;
            byte[] var9 = var3[var6];
            if (var9 == null && class206.field3565 < 800) {
                class225.method1485(arg0 ^ 0x8);
                for (int var10 = 0; var10 < var2; var10++) {
                    class107.method743(var10, var7, 64, (byte) -123, var8, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public abstract void method751(int arg0, int arg1);

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3027[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
