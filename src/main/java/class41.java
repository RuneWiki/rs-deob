import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class41 {

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lij;")
    public static class50 field756 = class78.method578(125, "p12_full");

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field758 = -1;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field757 = 2;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lij;")
    private static class50 field762 = class78.method578(125, "wave:");

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "[Ltf;")
    public static class53[] field764 = new class53[32768];

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[I")
    public static int[] field755 = new int[500];

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
    public static int[] field753 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lij;")
    public static class50 field760 = field762;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
    public static int[] field754 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lij;")
    public static class50 field766 = null;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Lij;")
    public static class50 field767 = field762;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field759 = new Random();

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lv;")
    public static class143 field750;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I")
    public static final int method311(int arg0, boolean arg1) {
        int var7 = arg0 - 1;
        if (arg1) {
            return -51;
        }
        int var2 = var7 | var7 >>> 1;
        field761++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static void method312(boolean arg0) {
        field760 = null;
        field762 = null;
        field756 = null;
        field754 = null;
        field766 = null;
        field750 = null;
        field767 = null;
        field755 = null;
        field753 = null;
        if (arg0) {
            field764 = null;
            field759 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lij;")
    public static final class50 method313(int arg0) {
        class50 var1 = class137.field2374;
        if (~class40.field737 != arg0) {
            var1 = class223.field3763;
        }
        field751++;
        return class80.method589(new class50[] { class222.field3731, var1, class7.field99, class78.method579(class44.field804, arg0 ^ 0x6670), class217.field3645, class78.method579(class89.field1693, arg0 ^ 0x6670), class84.field1626 }, 28743);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)J")
    public static final long method314(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        return var3 == null || var3.field1235 == null ? 0L : var3.field1235.field2425;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lve;")
    public static final class31 method315(int arg0, int arg1) {
        class31 var2 = (class31) class141.field2475.method912((long) arg0, (byte) 90);
        field765++;
        if (arg1 != -3777) {
            method311(7, false);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field4265.method190((byte) -100, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class31 var4 = new class31();
        class217 var5 = new class217(var3);
        var5.field3581 = var5.field3633.length - 2;
        int var6 = var5.method1441(arg1 + 3866);
        int var7 = var5.field3633.length - var6 - 14;
        var5.field3581 = var7;
        int var8 = var5.method1466((byte) -15);
        var4.field631 = var5.method1441(-45);
        var4.field623 = var5.method1441(arg1 ^ 0xE9C);
        var4.field629 = var5.method1441(-32);
        var4.field620 = var5.method1441(-30);
        int var9 = var5.method1487(arg1 ^ 0xFFFFF1C0);
        if (var9 > 0) {
            var4.field622 = new class56[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1441(arg1 ^ 0xFFFFF14F);
                class56 var12 = new class56(method311(var11, false));
                var4.field622[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1466((byte) -15);
                    int var14 = var5.method1466((byte) -15);
                    var12.method445(79, (long) var13, new class199(var14));
                }
            }
        }
        var5.field3581 = 0;
        int var15 = 0;
        var4.field624 = var5.method1435(0);
        var4.field618 = new int[var8];
        var4.field630 = new class50[var8];
        var4.field634 = new int[var8];
        while (var5.field3581 < var7) {
            int var16 = var5.method1441(arg1 ^ 0xEEA);
            if (var16 == 3) {
                var4.field630[var15] = var5.method1469((byte) -94);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field634[var15] = var5.method1487(255);
            } else {
                var4.field634[var15] = var5.method1466((byte) -15);
            }
            var4.field618[var15++] = var16;
        }
        class141.field2475.method913(var4, 106, (long) arg0);
        return var4;
    }
}
