import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class519 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lsl;")
    public static class318 field7636 = new class318(50, -1);

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lib;")
    public static class106 field7638 = new class106(512);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Lae;", line = 3)
    public static final class164 method3085(int arg0, int arg1) {
        field7634++;
        class164 var2 = (class164) class427.field6304.method2871((long) arg0, (byte) 63);
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 48) {
            method3088(-63);
        }
        byte[] var3 = class82.field1116.method2363(0, arg0, 113);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class164 var4 = class245.method1607((byte) 112, var3);
            class427.field6304.method2868((long) arg0, var4, -8869);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZZ)Z", line = 28)
    public static boolean method3086(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 35)
    public static void method3087(byte arg0) {
        field7638 = null;
        field7636 = null;
        if (arg0 > -39) {
            field7638 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 50)
    public static final void method3088(int arg0) {
        class507.field7494 = class85.field1163.method577(arg0 - 9839);
        if (arg0 != 10094) {
            field7636 = null;
        }
        field7635++;
        int var1 = class85.field1163.method602((byte) 55);
        boolean var2 = class85.field1163.method576((byte) -105) == 1;
        int var3 = class85.field1163.method635(arg0 + 952958514);
        int var4 = class85.field1163.method576((byte) 127);
        class525.method3116((byte) 52, var4);
        class85.field1163.method945(-934);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class397.field5828 >> 3; var20++) {
                for (int var21 = 0; var21 < (class457.field6713 >> 3); var21++) {
                    int var22 = class85.field1163.method952(-126, 1);
                    if (var22 == 1) {
                        class310.field4420[var5][var20][var21] = class85.field1163.method952(-120, 26);
                    } else {
                        class310.field4420[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class85.field1163.method944((byte) -120);
        int var6 = (class26.field314 - class85.field1163.field827) / 16;
        class471.field6962 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class471.field6962[var7][var19] = class85.field1163.method616((byte) 98);
            }
        }
        class455.field6700 = null;
        class411.field6110 = new int[var6];
        class265.field3914 = new byte[var6][];
        class307.field4359 = null;
        class413.field6138 = new int[var6];
        class289.field4156 = new int[var6];
        class264.field3877 = new byte[var6][];
        class446.field6598 = new int[var6];
        class213.field3061 = new byte[var6][];
        class237.field3484 = new byte[var6][];
        class506.field7491 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class397.field5828 >> 3); var10++) {
                for (int var11 = 0; var11 < (class457.field6713 >> 3); var11++) {
                    int var12 = class310.field4420[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFE53F) >> 14;
                        int var14 = (var12 & 0x3FFD) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class411.field6110[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class411.field6110[var8] = var15;
                            int var17 = (var15 & 0xFFC5) >> 8;
                            int var18 = var15 & 0xFF;
                            class413.field6138[var8] = class91.field1256.method2358("m" + var17 + "_" + var18, (byte) 125);
                            class506.field7491[var8] = class91.field1256.method2358("l" + var17 + "_" + var18, (byte) -79);
                            class289.field4156[var8] = class91.field1256.method2358("um" + var17 + "_" + var18, (byte) -112);
                            class446.field6598[var8] = class91.field1256.method2358("ul" + var17 + "_" + var18, (byte) -112);
                            var8++;
                        }
                    }
                }
            }
        }
        class268.method1722(false, (byte) 104, var1, var3, var2);
    }
}
