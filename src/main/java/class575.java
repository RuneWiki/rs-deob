import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class575 {

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field7920 = 16777215;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field7924 = 8;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field7926 = -1;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Ldm;")
    public static class46 field7922 = new class46();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field7915;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field7919;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field7921;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public int field7925;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field7927;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Z")
    public boolean field7916;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[B")
    public static final byte[] method3274(int arg0, int arg1) {
        if (arg0 != 511) {
            field7926 = -74;
        }
        field7917++;
        class614 var2 = (class614) class74.field1188.method1880((byte) 123, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class303.method1924((byte) -115, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class614(var3);
            class74.field1188.method1882((long) arg1, var2, -3028);
        }
        return var2.field8823;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldaa;B)V")
    public final void method3275(class11 arg0, byte arg1) {
        if (arg1 < 88) {
            return;
        }
        while (true) {
            int var3 = arg0.method110((byte) 68);
            if (var3 == 0) {
                field7913++;
                return;
            }
            this.method3279(88, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lrw;")
    public static final class645 method3276(int arg0, byte arg1) {
        field7918++;
        if (arg1 != -95) {
            return null;
        }
        class645[] var2 = class337.method2048(975);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class645 var4 = var2[var3];
            if (var4.field9363 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method3277(byte arg0) {
        field7922 = null;
        if (arg0 != 7) {
            field7926 = -93;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
    public static final boolean method3278(int arg0, int arg1, int arg2) {
        field7914++;
        if (arg0 != -5) {
            field7922 = null;
        }
        return class97.method691(arg1, arg2, -2) & class21.method223(arg2, arg1, arg0 ^ 0x7F);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILdaa;)V")
    private final void method3279(int arg0, int arg1, class11 arg2) {
        if (arg1 == 1) {
            this.field7924 = arg2.method93((byte) 99);
        } else if (arg1 == 2) {
            this.field7916 = true;
        } else if (arg1 == 3) {
            this.field7921 = arg2.method111(-121);
            this.field7919 = arg2.method111(-120);
            this.field7927 = arg2.method111(-120);
        } else if (arg1 == 4) {
            this.field7925 = arg2.method110((byte) 110);
        } else if (arg1 == 5) {
            this.field7915 = arg2.method93((byte) 112);
        } else if (arg1 == 6) {
            this.field7920 = arg2.method89((byte) -63);
        }
        int var4 = -44 % ((-arg0 - 12) / 57);
        field7923++;
    }
}
