import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class451 {

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
    public static float[] field6714 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!or", name = "b", descriptor = "[I")
    public static int[] field6711 = new int[8];

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field6716 = 0;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field6717 = -1;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[Lf;")
    public static class529[] field6710;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2719(byte arg0) {
        field6715++;
        int var1 = class145.field2151.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class145.field2151[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class372.field5690; var4++) {
                    if (class331.field4689[var2] == class151.field2241[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class151.field2241[class372.field5690] = class331.field4689[var2];
                    var3 = class372.field5690++;
                }
                class209 var5 = new class209(class145.field2151[var2]);
                int var6 = 0;
                while (var5.field3037 < class145.field2151[var2].length && var6 < 511 && class402.field6044 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1450((byte) 75);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FCA) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class331.field4689[var2] >> 8) * 64 + var10 - class68.field1038;
                    int var13 = (class331.field4689[var2] & 0xFF) * 64 + var11 - class24.field259;
                    class342 var14 = class431.field6451.method1733(true, var5.method1450((byte) 114));
                    if (class193.field2821[var7] == null && (var14.field4921 & 0x1) > 0 && class271.field3942 == var9 && var12 >= 0 && (var14.field4881 + var12) < class30.field323 && var13 >= 0 && class182.field2661 > var14.field4881 + var13) {
                        class193.field2821[var7] = new class167();
                        class193.field2821[var7].field1942 = var7;
                        class167 var15 = class193.field2821[var7];
                        class378.field5766[class402.field6044++] = var7;
                        var15.field1939 = class317.field4559;
                        var15.method1160(var14, arg0 ^ 0x6C);
                        var15.method860((byte) 117, var15.field2472.field4881);
                        var15.field1986 = var15.field2472.field4918 << 3;
                        if (var15.field1986 == 0) {
                            var15.method855(0, 2);
                        } else {
                            var15.method855((var15.field2472.field4899 + 4 & 0x75200007) << 11, arg0 - 27);
                        }
                        var15.method1162((byte) -25, var13, var15.method847(-1), var12, true, var9);
                    }
                }
            }
        }
        if (arg0 != 29) {
            method2719((byte) -19);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([Ljava/lang/Object;IB[JI)V", line = 106)
    public static final void method2720(Object[] arg0, int arg1, byte arg2, long[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg1; var11++) {
                if (arg3[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method2720(arg0, var6 - 1, (byte) 21, arg3, arg4);
            method2720(arg0, arg1, (byte) 21, arg3, var6 + 1);
        }
        if (arg2 != 21) {
            field6717 = 42;
        }
        field6713++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 167)
    public static void method2721(boolean arg0) {
        field6710 = null;
        if (arg0) {
            field6714 = null;
            field6711 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V", line = 183)
    public static final void method2722(int arg0, int arg1, int arg2) {
        field6712++;
        int var3 = class163.field2401.method1797(false, class397.field5946.method2838(false, class143.field2137));
        for (class118 var4 = (class118) class312.field4467.method816(arg2 ^ 0xFFFFE386); var4 != null; var4 = (class118) class312.field4467.method812(arg2 ^ 0xFFFFE39C)) {
            int var8 = class442.method2663((byte) -35, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class450.field6706 * 16 + 21;
        int var6 = arg0 - var3 / 2;
        if (var3 + var6 > class4.field57) {
            var6 = class4.field57 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg2 != -7197) {
            field6710 = null;
        }
        int var7 = arg1;
        if ((var5 + arg1) > class116.field1743) {
            var7 = class116.field1743 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class25.field267 = var6;
        class11.field148 = var7;
        class85.field1299 = var3;
        class207.field2963 = true;
        class61.field928 = (class402.field6034 ? 26 : 22) + class450.field6706 * 16;
    }
}
