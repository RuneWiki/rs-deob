import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class192 extends class170 {

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    private int field3325 = 4096;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    private int field3328 = 4096;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    private int field3333 = 4096;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field3330 = -2;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "Lmh;")
    public static class128 field3329 = class22.method156(126, "null");

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "[[B")
    public static byte[][] field3332 = new byte[1000][];

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 4)
    public static void method1286(int arg0) {
        field3332 = (byte[][]) null;
        field3329 = null;
        if (arg0 != 64) {
            field3329 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BZ)V", line = 15)
    public static final void method1287(byte arg0, boolean arg1) {
        class218.method1503(false);
        field3327++;
        if (class105.field1799 != 30 && class105.field1799 != 25) {
            return;
        }
        class17.field486++;
        int var2 = 78 % ((arg0 + 8) / 58);
        if (class17.field486 < 50 && !arg1) {
            return;
        }
        class17.field486 = 0;
        if (!class74.field1400 && class121.field2041 != null) {
            class242.field4140++;
            class71.field1320.method570(1, -1);
            try {
                class121.field2041.method1228(class71.field1320.field3417, 0, false, class71.field1320.field3380);
                class71.field1320.field3380 = 0;
            } catch (IOException var4) {
                class74.field1400 = true;
            }
        }
        class218.method1503(false);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BZ)V", line = 47)
    public static final void method1288(byte arg0, boolean arg1) {
        field3323++;
        if (arg0 != 86) {
            return;
        }
        if (arg1) {
            if (class196.field3433 != -1) {
                class144.method958((byte) 120, class196.field3433);
            }
            for (class88 var2 = (class88) class182.field3198.method729(-120); var2 != null; var2 = (class88) class182.field3198.method732(arg0 - 85)) {
                class50.method341(123, true, var2);
            }
            class196.field3433 = -1;
            class182.field3198 = new class120(8);
            class45.method303(true);
            class196.field3433 = class31.field683;
            class206.method1420(false, -124);
            class232.method1598(0);
            class181.method1237(class196.field3433, -107);
        }
        class163.field2796 = new class123();
        class163.field2796.field418 = 3000;
        class163.field2796.field478 = 3000;
        if (!class247.field4247) {
            class201.method1401(class4.field74, -8);
            class298.method2039((byte) -52, 10);
            return;
        }
        if (class1.field21 == 2) {
            class143.field2445 = class276.field4781 << 7;
            class142.field2436 = class162.field2770 << 7;
        } else {
            class118.method705(arg0 ^ 0x57);
        }
        class129.method872(-1);
        class218.method1509(84);
        class298.method2039((byte) -52, 28);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[F", line = 104)
    public static final float[] method1289(int arg0, int arg1) {
        field3331++;
        if (arg0 >= -99) {
            return (float[]) null;
        }
        float var2 = class119.method715() + class119.method720();
        int var3 = class119.method721();
        float var4 = (float) ((var3 & 0xFF5AA3) >> 16) / 255.0F;
        class51.field1003[3] = 1.0F;
        float var5 = (float) ((var3 & 0xFFD6) >> 8) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class51.field1003[1] = var7 * (float) class238.method1622(255, arg1 >> 8) / 255.0F * var5 * var2;
        class51.field1003[2] = var2 * var6 * ((float) class238.method1622(arg1, 255) / 255.0F) * var7;
        class51.field1003[0] = var4 * ((float) class238.method1622(arg1 >> 16, 255) / 255.0F) * var7 * var2;
        return class51.field1003;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 184)
    public class192() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILbg;B)V", line = 141)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field3322++;
        if (arg0 == 0) {
            this.field3325 = arg1.method1308(-102);
        } else if (arg0 == 1) {
            this.field3333 = arg1.method1308(arg2 ^ 0xFFFFFFA2);
        } else if (arg0 == 2) {
            this.field3328 = arg1.method1308(-116);
        }
        if (arg2 != 13) {
            this.field3333 = -81;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[[I", line = 198)
    public final int[][] method62(int arg0, int arg1) {
        int var3 = -67 % ((arg1 + 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        field3326++;
        if (this.field2976.field2883) {
            int[][] var5 = this.method1139(0, arg0, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class185.field3225; var12++) {
                int var13 = var8[var12];
                int var14 = var7[var12];
                int var15 = var6[var12];
                if (var13 == var14 && var14 == var15) {
                    var10[var12] = this.field3325 * var13 >> 12;
                    var9[var12] = this.field3333 * var14 >> 12;
                    var11[var12] = this.field3328 * var15 >> 12;
                } else {
                    var10[var12] = this.field3325;
                    var9[var12] = this.field3333;
                    var11[var12] = this.field3328;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIILjm;Ljm;IIJ)V", line = 265)
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, class226 arg4, class226 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class65 var10 = new class65();
        var10.field1264 = arg8;
        var10.field1249 = arg1 * 128 + 64;
        var10.field1261 = arg2 * 128 + 64;
        var10.field1258 = arg3;
        var10.field1252 = arg4;
        var10.field1251 = arg5;
        var10.field1254 = arg6;
        var10.field1262 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class182.field3184[var11][arg1][arg2] == null) {
                class182.field3184[var11][arg1][arg2] = new class150(var11, arg1, arg2);
            }
        }
        class182.field3184[arg0][arg1][arg2].field2571 = var10;
    }
}
