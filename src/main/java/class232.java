import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class232 implements class716 {

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lnc;")
    private class24 field3047;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lnd;")
    private class547 field3040;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lnd;")
    private class547 field3043;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lria;")
    public static class288 field3042 = null;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lcha;")
    public static class220 field3049 = new class220(13, 3);

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Ljv;")
    public static class81 field3051 = new class81();

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
    public static boolean field3053 = false;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lda;")
    private class61 field3054;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[[[B")
    public static byte[][][] field3052;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1466(int arg0) {
        field3041++;
        if (arg0 != -1383906493) {
            method1467(-80, (byte) -13);
        }
        if (class505.field7122 != null) {
            try {
                class505.field7122.close();
            } catch (IOException var1) {
            }
        }
        class505.field7122 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1467(int arg0, byte arg1) {
        field3050++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class454.field6036.method2547(-87, class243.field3143) + " (" + var2 + ")</col>";
        } else {
            int var4 = 5 % ((arg1 + 61) / 45);
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class454.field6038.method2547(-76, class243.field3143) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        field3045++;
        boolean var2 = true;
        if (!this.field3040.method3154(this.field3047.field439, (byte) 98)) {
            var2 = false;
        }
        if (!this.field3043.method3154(this.field3047.field439, (byte) 98)) {
            var2 = false;
        }
        if (arg0 != 11107) {
            method1468((byte) -68);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method366(int arg0) {
        field3048++;
        class274 var2 = class335.method1930(this.field3047.field439, (byte) -72, this.field3043);
        if (arg0 != 18295) {
            field3055 = 29;
        }
        this.field3054 = class386.field4930.method500(var2, class728.method4058(this.field3040, this.field3047.field439), true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1468(byte arg0) {
        field3049 = null;
        field3051 = null;
        if (arg0 >= -50) {
            field3052 = null;
        }
        field3042 = null;
        field3052 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lsa;I[[B)V")
    public static final void method1469(class207 arg0, int arg1, byte[][] arg2) {
        field3044++;
        int var3 = -56 / ((arg1 - 13) / 52);
        int[] var4 = new int[] { -1, 0, 0, 0, 0 };
        for (int var5 = 0; var5 < arg0.field5208; var5++) {
            class14.method102(true);
            for (int var10 = 0; var10 < (class409.field5183 >> 3); var10++) {
                for (int var11 = 0; var11 < (class543.field7597 >> 3); var11++) {
                    int var12 = class387.field4934[var5][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0x3B9BDE5) >> 24;
                        if (!arg0.field5215 || var13 == 0) {
                            int var14 = (var12 & 0x6) >> 1;
                            int var15 = var12 >> 14 & 0x3FF;
                            int var16 = (var12 & 0x3FFA) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < class201.field2708.length; var18++) {
                                if (class201.field2708[var18] == var17 && arg2[var18] != null) {
                                    class461 var19 = new class461(arg2[var18]);
                                    arg0.method2295(var14, -1, var15, var13, class526.field7350, var10 * 8, var11 * 8, var19, var5, var16);
                                    arg0.method1333(class386.field4930, var4[0] == -1 ? var4 : null, var15, var14, var16, var13, var10 * 8, var5, var11 * 8, var19, 122);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < arg0.field5208; var6++) {
            class14.method102(true);
            for (int var7 = 0; var7 < (class409.field5183 >> 3); var7++) {
                for (int var8 = 0; var8 < (class543.field7597 >> 3); var8++) {
                    int var9 = class387.field4934[var6][var7][var8];
                    if (var9 == -1) {
                        arg0.method2299(var7 * 8, 8, 8, var8 * 8, (byte) 63, var6);
                    }
                }
            }
        }
        if (var4[0] != -1) {
            class1.field4 = class507.field7153.method3922(var4[0], class623.field8571, var4[2], var4[1], var4[3], 16);
            class344.field4355 = var4[4];
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = this.field3047.field442.method735(0, this.field3047.field435, class482.field6548) + this.field3047.field433;
            int var4 = this.field3047.field444.method3397(this.field3047.field440, class478.field6509, -104) + this.field3047.field434;
            this.field3054.method566(this.field3047.field443, var4, this.field3047.field446, var3, this.field3047.field435, 0, this.field3047.field436, null, 13518, this.field3047.field440, this.field3047.field438, this.field3047.field447, 0, null, this.field3047.field445, null);
        }
        if (arg1 > -57) {
            this.method368(true, (byte) -10);
        }
        field3046++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lnd;Lnd;Lnc;)V")
    public class232(class547 arg0, class547 arg1, class24 arg2) {
        this.field3047 = arg2;
        this.field3040 = arg0;
        this.field3043 = arg1;
    }
}
