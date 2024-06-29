import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class511 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Liv;")
    public static class64 field7534 = new class64(71, -1);

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field7541 = -2;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field7537;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Lld;")
    public static class114 field7536;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Luc;")
    public class23 field7545;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Luf;")
    public static class309 field7544;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[I")
    public int[] field7539;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "[[I")
    public static int[][] field7542;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 6)
    public static void method3059(byte arg0) {
        field7536 = null;
        field7534 = null;
        field7542 = null;
        if (arg0 != 19) {
            method3062(-7, (byte) 97);
        }
        field7544 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)I", line = 20)
    public static final int method3060(int arg0, int arg1, int arg2, int arg3) {
        field7535++;
        if (arg2 == arg3) {
            return arg3;
        }
        int var4 = arg0 - arg1;
        int var5 = (arg3 & 0x7F) * var4 + ((arg2 & 0x7F) * arg1) >> 7;
        int var6 = (arg2 & 0x380) * arg1 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg3 & 0xFC00) * var4 + ((arg2 & 0xFC00) * arg1) >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 44)
    public static final void method3061(int arg0) {
        field7540++;
        if (arg0 != 22843) {
            field7543 = -79;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class355.field5424[var1] = true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)Lfi;", line = 63)
    public static final class388 method3062(int arg0, byte arg1) {
        field7538++;
        int var2 = -19 / ((27 - arg1) / 36);
        class388[] var3 = class89.method695((byte) 123);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class388 var5 = var3[var4];
            if (var5.field5836 == arg0) {
                return var5;
            }
        }
        return null;
    }
}
