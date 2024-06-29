import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class422 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lnj;")
    public static class162 field6179 = new class162(64);

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field6182 = 104;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field6183 = 0;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field6185 = new int[13];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[[B")
    public static byte[][] field6186 = new byte[50][];

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field6187 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lmg;III)Lom;", line = 3)
    public static final class252 method2512(class101 arg0, int arg1, int arg2, int arg3) {
        field6181++;
        class391 var4 = new class391(arg0.method727(arg1, arg2, 110));
        class252 var5 = new class252(arg1, var4.method2347((byte) -119), var4.method2347((byte) 105), var4.method2361((byte) -56), var4.method2361((byte) -56), var4.method2348(-2) == 1, var4.method2348(-2), var4.method2348(-2));
        int var6 = var4.method2348(-2);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3483.method2809(new class41(var4.method2348(-2), var4.method2353((byte) 95), var4.method2353((byte) 69), var4.method2353((byte) 108), var4.method2353((byte) 88), var4.method2353((byte) 126), var4.method2353((byte) 66), var4.method2353((byte) 80), var4.method2353((byte) 103)), 2);
        }
        if (arg3 >= -124) {
            field6179 = null;
        }
        var5.method1505(0);
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)V", line = 33)
    public static final void method2513(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 108) {
            field6186 = null;
        }
        field6180++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class326.method1893(101, true, var4);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIIIII)V", line = 47)
    public static final void method2514(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class424.field6204 <= arg7 && arg3 <= class76.field1021 && class417.field6057 <= arg1 && arg5 <= class224.field3193) {
            class517.method3079(arg1, arg2, arg6, 116, arg7, arg5, arg4, arg3);
        } else {
            class467.method2739(arg4, arg1, 159, arg2, arg5, arg7, arg6, arg3);
        }
        int var8 = -37 % ((arg0 + 21) / 35);
        field6184++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 70)
    public static void method2515(byte arg0) {
        if (arg0 >= -29) {
            method2512(null, -100, 100, 110);
        }
        field6186 = null;
        field6185 = null;
        field6179 = null;
    }
}
