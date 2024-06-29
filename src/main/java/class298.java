import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class298 extends class9 {

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4850 = "green:";

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
    public static int[] field4848;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I", line = 6)
    public static final int method2132(byte arg0, int arg1) {
        field4844++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = 32 / ((arg0 - 51) / 58);
        int var6 = var4 | var4 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg1 & ~var8;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBI)V", line = 25)
    public static final void method2133(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class344.method2417(class232.field3799[arg1], arg4 - arg0, arg4 - -arg0, arg2, (byte) -126);
        field4846++;
        int var5 = 0;
        int var6 = -arg0;
        int var7 = arg0;
        int var8 = -1;
        while (var5 < var7) {
            var8 += 2;
            var5++;
            var6 += var8;
            if (var6 >= 0) {
                var7--;
                var6 -= var7 << 1;
                int[] var9 = class232.field3799[arg1 - var7];
                int[] var10 = class232.field3799[arg1 + var7];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class344.method2417(var10, var12, var11, arg2, (byte) -122);
                class344.method2417(var9, var12, var11, arg2, (byte) -118);
            }
            int var13 = arg4 + var7;
            int var14 = arg4 - var7;
            int[] var15 = class232.field3799[arg1 + var5];
            int[] var16 = class232.field3799[arg1 - var5];
            class344.method2417(var15, var14, var13, arg2, (byte) -123);
            class344.method2417(var16, var14, var13, arg2, (byte) -118);
        }
        if (arg3 > -116) {
            field4850 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 77)
    public static void method2134(int arg0) {
        field4848 = null;
        field4850 = null;
        if (arg0 <= 88) {
            method2132((byte) -8, 72);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 95)
    public static final void method2135(int arg0) {
        class178.field2938 = new class181[class198.field3319.method1423((byte) -49)][];
        class232.field3797 = new boolean[class198.field3319.method1423((byte) -112)];
        field4845++;
        if (arg0 != 1296610864) {
            field4847 = 26;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 112)
    public static final String method2136(byte arg0, String arg1) {
        if (arg0 < 98) {
            field4848 = (int[]) null;
        }
        field4849++;
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class156.method1106(var6, (byte) 39);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }
}
