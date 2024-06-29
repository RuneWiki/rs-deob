import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class369 extends class502 {

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "[I")
    public static int[] field4984 = new int[32];

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Ljv;")
    public static class73 field4983 = new class73("", 12);

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lcu;")
    public static class206 field4991 = new class206(15, 8);

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Lcu;")
    public static class206 field4992 = new class206(69, 0);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Lvj;")
    public class411 field4986;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II[F)[F")
    public static final float[] method2172(int arg0, int arg1, float[] arg2) {
        field4987++;
        float[] var3 = new float[arg0];
        class83.method687(arg2, 0, var3, arg1, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BIBII)V")
    public static final void method2173(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4990++;
        if (arg0 >= arg2) {
            return;
        }
        int var6 = arg2 - arg0 >> 2;
        int var7 = arg0 + arg4;
        if (arg3 > -8) {
            field4992 = null;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var7++] = 1;
                }
            }
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILeh;)Loi;")
    public static final class67 method2174(int arg0, class335 arg1) {
        field4981++;
        int var2 = arg1.method2034(255);
        class212 var3 = class287.method1770(true)[arg1.method2034(255)];
        class679 var4 = class601.method3318(true)[arg1.method2034(255)];
        int var5 = arg1.method2022(-29089);
        int var6 = arg1.method2022(-29089);
        int var7 = arg1.method2001((byte) -83);
        int var8 = arg1.method2001((byte) -83);
        if (arg0 != 26571) {
            field4984 = null;
        }
        int var9 = arg1.method2045(arg0 - 26669);
        int var10 = arg1.method2045(-98);
        int var11 = arg1.method2045(-98);
        boolean var12 = arg1.method2034(255) == 1;
        return new class67(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method2175(byte arg0) {
        if (arg0 == -50) {
            field4992 = null;
            field4984 = null;
            field4983 = null;
            field4991 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ldw;IIIII)V")
    public static final void method2176(class673 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field9523 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class510.field6812[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class225 var13 = class350.field4791[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field9523; var14++) {
                            if (arg0.field9524[var14] == var13.field3173) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field9524[arg0.field9523++] = var13.field3173;
                        if (arg0.field9523 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field9523; var15 < 4; var15++) {
            arg0.field9524[var15] = null;
        }
    }
}
