import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class35 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[J")
    public static long[] field643 = new long[200];

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field641 = -1;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lng;")
    public static class121 field647;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lng;")
    public static class121 field653;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lmg;")
    public static class49 field648;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
    public static final boolean method241(int arg0, int arg1) {
        if (arg1 >= -58) {
            return true;
        } else {
            field654++;
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method242(int arg0) {
        field643 = null;
        field653 = null;
        if (arg0 == 1) {
            field648 = null;
            field647 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILji;I)V")
    private final void method243(int arg0, class225 arg1, int arg2) {
        field651++;
        if (~arg0 == arg2) {
            this.field652 = arg1.method1593(true);
            this.field644 = arg1.method1580(arg2 ^ 0x5C);
            this.field646 = arg1.method1580(-13);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method244(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class270.field4766 * arg0 + class17.field230 * arg3 >> 16;
        int var6 = class270.field4766 * arg3 - class17.field230 * arg0 >> 16;
        int var7 = class62.field1118 * var6 + class45.field803 * arg1 >> 16;
        int var8 = class62.field1118 * arg1 - class45.field803 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class62.field1118 * var6 + class45.field803 * arg2 >> 16;
        int var12 = class62.field1118 * arg2 - class45.field803 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class90.field1456 && var13 < class90.field1456) {
            return false;
        } else if (var9 > class29.field416 && var13 > class29.field416) {
            return false;
        } else if (var10 < class165.field2797 && var14 < class165.field2797) {
            return false;
        } else {
            return var10 <= class189.field3328 || var14 <= class189.field3328;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lji;I)V")
    public final void method245(class225 arg0, int arg1) {
        field645++;
        while (true) {
            int var3 = arg0.method1580(-119);
            if (var3 == 0) {
                int var4 = 104 / ((arg1 + 11) / 62);
                return;
            }
            this.method243(var3, arg0, -2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
    public static final int method246(int arg0) {
        if (arg0 > -104) {
            field641 = -102;
        }
        field642++;
        return class45.field808;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[B")
    public static final byte[] method247(int arg0, int arg1) {
        field649++;
        class112 var2 = (class112) class220.field3872.method437((byte) 127, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class172.method1156(var4, Integer.MIN_VALUE, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class112(var3);
            class220.field3872.method439(var2, arg1 - 17, (long) arg0);
        }
        if (arg1 != 16) {
            method242(42);
        }
        return var2.field1876;
    }
}
