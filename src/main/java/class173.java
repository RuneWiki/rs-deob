import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class173 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Z")
    public boolean field2337 = true;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lqp;")
    public static class586 field2340 = new class586(93, 0);

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[[I")
    public static int[][] field2342 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!el", name = "i", descriptor = "C")
    private char field2341;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Ljava/lang/String;")
    public String field2338;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 5)
    public static void method1092(int arg0) {
        if (arg0 != 3) {
            field2342 = null;
        }
        field2342 = null;
        field2340 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lps;II)V", line = 18)
    private final void method1093(class428 arg0, int arg1, int arg2) {
        field2333++;
        if (arg2 == 1) {
            this.field2341 = class281.method1772(true, arg0.method2570((byte) 57));
        } else if (arg2 == 2) {
            this.field2339 = arg0.method2589(-11179);
        } else if (arg2 == 4) {
            this.field2337 = false;
        } else if (arg2 == 5) {
            this.field2338 = arg0.method2585(-25);
        }
        if (arg1 != 5) {
            this.method1096(26, null);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BILjava/lang/String;[B)I", line = 49)
    public static final int method1094(byte arg0, int arg1, String arg2, byte[] arg3) {
        field2334++;
        if (arg0 != 3) {
            field2340 = null;
        }
        int var4 = arg1;
        int var5 = arg2.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class383.method2317(arg2.charAt(var6), -46);
            int var8 = var5 > var6 + 1 ? class383.method2317(arg2.charAt(var6 + 1), arg0 ^ 0xFFFFFFC0) : -1;
            int var9 = var5 <= var6 + 2 ? -1 : class383.method2317(arg2.charAt(var6 + 2), -80);
            int var10 = var5 <= var6 + 3 ? -1 : class383.method2317(arg2.charAt(var6 + 3), arg0 ^ -82);
            arg3[arg1++] = (byte) class313.method1926(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg3[arg1++] = (byte) class313.method1926(var9 >>> 2, class637.method3693(240, var8 << 4));
            if (var10 == -1) {
                break;
            }
            arg3[arg1++] = (byte) class313.method1926(var10, class637.method3693(3, var9) << 6);
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z", line = 101)
    public final boolean method1095(byte arg0) {
        if (arg0 != 46) {
            this.method1093(null, 4, 91);
        }
        field2336++;
        return this.field2341 == 's';
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILps;)V", line = 119)
    public final void method1096(int arg0, class428 arg1) {
        if (arg0 <= 46) {
            this.method1093(null, 77, -120);
        }
        field2335++;
        while (true) {
            int var3 = arg1.method2561((byte) -50);
            if (var3 == 0) {
                return;
            }
            this.method1093(arg1, 5, var3);
        }
    }
}
