import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class157 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2167 = 0;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "B")
    public static byte field2168 = 0;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ldb;")
    public static class68 field2162;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2164;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V")
    public static final void method971(int arg0, boolean arg1) {
        if (!arg1) {
            field2169 = -14;
        }
        field2160++;
        class39 var2 = class149.method935(-123, arg0, 12);
        var2.method268((byte) -19);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class212.method1323((byte) -120, arg1, arg5, arg2, arg3, arg4, arg0, arg6, arg7);
        field2166++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method973(int arg0) {
        if (arg0 == 4) {
            field2159++;
            class15.field267.method944(-59);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILrl;)I")
    public static final int method974(int arg0, class310 arg1) {
        field2163++;
        if (arg0 < 52) {
            return 68;
        }
        class211 var2 = arg1.field4993;
        if (var2.field3173 != null) {
            var2 = var2.method1316((byte) 75);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3139;
        class85 var4 = arg1.method1685(0);
        if (arg1.field4102 == var4.field1201) {
            var3 = var2.field3121;
        } else if (arg1.field4102 == var4.field1199 || arg1.field4102 == var4.field1223 || arg1.field4102 == var4.field1220 || arg1.field4102 == var4.field1214) {
            var3 = var2.field3166;
        } else if (arg1.field4102 == var4.field1192 || arg1.field4102 == var4.field1229 || arg1.field4102 == var4.field1217 || arg1.field4102 == var4.field1231) {
            var3 = var2.field3127;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method975(int arg0) {
        field2162 = null;
        if (arg0 >= -55) {
            method973(2);
        }
        field2164 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    public static final void method976(boolean arg0, int arg1) {
        if (arg1 != -1336169736) {
            method971(-122, true);
        }
        field2165++;
        int[] var2 = null;
        byte[][] var3 = class117.field1685;
        byte var4 = 4;
        for (int var5 = 0; var5 < var4; var5++) {
            class8.method45(4087);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class45.field665[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x347B9DC) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0xFFEE8F) >> 14;
                            int var12 = var9 >> 3 & 0x7FF;
                            int var13 = (var9 & 0x6) >> 1;
                            int var14 = (var11 / 8 << 8) + var12 / 8;
                            for (int var15 = 0; var15 < class213.field3218.length; var15++) {
                                if (class213.field3218[var15] == var14 && var3[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class24.method157(var10, var11, (byte) 71, var7 * 8, arg0, class156.field2153, var6 * 8, var5, var12, var3[var15], var13);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class303.method2024(104, 8, var5, var6 * 8, 8, var7 * 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class227.field3551 = -1;
            return;
        }
        class223.field3470 = var2[3];
        class48.field688 = var2[4];
        class241.field3786 = var2[1];
        class106.field1516 = var2[2];
        class227.field3551 = var2[0];
    }
}
