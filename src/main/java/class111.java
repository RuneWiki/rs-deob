import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class111 extends class202 {

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[S")
    public static short[] field1811 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Ltl;")
    public static class59 field1814 = class85.method639("Versteckt", 9588);

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ltl;")
    public static class59 field1810 = class85.method639(":chalreq:", 9588);

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lma;")
    public static class263 field1812;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BI)V", line = 22)
    public static final void method806(byte[] arg0, int arg1) {
        field1815++;
        class170 var2 = new class170(arg0);
        var2.field2787 = arg0.length - 2;
        class306.field5183 = var2.method1214(-18254);
        class53.field794 = new byte[class306.field5183][];
        class190.field3184 = new boolean[class306.field5183];
        class311.field5274 = new int[class306.field5183];
        if (arg1 > -78) {
            field1811 = (short[]) null;
        }
        class132.field2193 = new byte[class306.field5183][];
        class236.field3925 = new int[class306.field5183];
        class243.field4061 = new int[class306.field5183];
        class41.field615 = new int[class306.field5183];
        var2.field2787 = arg0.length - (class306.field5183 * 8) - 7;
        class300.field5123 = var2.method1214(-18254);
        class165.field2680 = var2.method1214(-18254);
        int var3 = (var2.method1221(91) & 0xFF) + 1;
        for (int var4 = 0; var4 < class306.field5183; var4++) {
            class243.field4061[var4] = var2.method1214(-18254);
        }
        for (int var5 = 0; var5 < class306.field5183; var5++) {
            class311.field5274[var5] = var2.method1214(-18254);
        }
        for (int var6 = 0; var6 < class306.field5183; var6++) {
            class41.field615[var6] = var2.method1214(-18254);
        }
        for (int var7 = 0; var7 < class306.field5183; var7++) {
            class236.field3925[var7] = var2.method1214(-18254);
        }
        var2.field2787 = arg0.length + (3 - (var3 * 3 - -7)) - class306.field5183 * 8;
        class284.field4879 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class284.field4879[var8] = var2.method1208((byte) -101);
            if (class284.field4879[var8] == 0) {
                class284.field4879[var8] = 1;
            }
        }
        var2.field2787 = 0;
        for (int var9 = 0; var9 < class306.field5183; var9++) {
            int var10 = class41.field615[var9];
            int var11 = class236.field3925[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class53.field794[var9] = var13;
            byte[] var14 = new byte[var12];
            class132.field2193[var9] = var14;
            int var15 = var2.method1221(72);
            boolean var16 = false;
            if ((var15 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1205(-1);
                }
                if ((var15 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1205(-1);
                        var16 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label102: while (true) {
                    if (var20 >= var10) {
                        if ((var15 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var10 <= var22) {
                                break label102;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method1205(-1);
                                var16 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var20 + (var10 * var21)] = var2.method1205(-1);
                    }
                    var20++;
                }
            }
            class190.field3184[var9] = var16;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V", line = 197)
    public static void method807(boolean arg0) {
        field1812 = null;
        field1811 = null;
        field1814 = null;
        field1810 = null;
        if (arg0) {
            field1811 = (short[]) null;
        }
    }
}
