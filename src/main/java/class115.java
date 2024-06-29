import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class115 {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lbd;")
    public static class162 field2047 = class17.method142(0, "<)4col>");

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "F")
    public static float field2046;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lda;")
    public static class143 field2045;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lob;")
    public static class78 field2041;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 7)
    public static void method907(byte arg0) {
        field2047 = null;
        if (arg0 != -13) {
            field2046 = 0.041403793F;
        }
        field2041 = null;
        field2045 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZI[Lob;ZI)V", line = 26)
    public static final void method908(int arg0, boolean arg1, int arg2, class78[] arg3, boolean arg4, int arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class78 var7 = arg3[var6];
            if (var7 != null && var7.field1371 == arg5) {
                class87.method658(arg0, arg1, 1, arg2, var7);
                class171.method1316(var7, arg2, -30241, arg0);
                if ((var7.field1220 - var7.field1367) < var7.field1258) {
                    var7.field1258 = var7.field1220 - var7.field1367;
                }
                if (var7.field1326 > var7.field1283 - var7.field1340) {
                    var7.field1326 = var7.field1283 - var7.field1340;
                }
                if (var7.field1326 < 0) {
                    var7.field1326 = 0;
                }
                if (var7.field1258 < 0) {
                    var7.field1258 = 0;
                }
                if (var7.field1231 == 0) {
                    class138.method1077(var7, 106, arg1);
                }
            }
        }
        if (arg4) {
            field2041 = (class78) null;
        }
        field2042++;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Ldc;", line = 85)
    public static final class71 method909(byte arg0) {
        field2044++;
        int var1 = class260.field4333[0] * class190.field3253[0];
        byte[] var2 = class317.field5350[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        if (arg0 != -3) {
            return (class71) null;
        }
        while (var1 > var4) {
            var3[var4] = class306.field5152[class92.method695(var2[var4], 255)];
            var4++;
        }
        class71 var5;
        if (class117.field2159) {
            var5 = new class140(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], var3);
        } else {
            var5 = new class79(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], var3);
        }
        class247.method1738(-127);
        return var5;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B[F)[F", line = 116)
    public static final float[] method910(byte arg0, float[] arg1) {
        field2048++;
        if (arg0 != 99) {
            field2046 = -1.5399675F;
        }
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class161.method1234(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
