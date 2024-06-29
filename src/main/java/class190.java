import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class190 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[I")
    public static int[] field3241 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lbe;")
    public static class283 field3244 = class153.method941(-96, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lbe;")
    public static class283 field3247 = class153.method941(125, "Fps:");

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3245 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Ltf;")
    public static class242 field3249 = new class242(50);

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Lbe;")
    public static class283 field3250 = class153.method941(15, "::");

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lbe;")
    public static class283 field3252 = class153.method941(-123, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lek;")
    public static class172 field3253;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field3242;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "[Lkg;")
    public static class69[] field3251;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)V", line = 12)
    public static final void method1236(byte[] arg0, int arg1) {
        field3243++;
        class229 var2 = new class229(arg0);
        var2.field3905 = arg0.length - 2;
        class160.field2613 = var2.method1496(true);
        class69.field1146 = new byte[class160.field2613][];
        class232.field3933 = new int[class160.field2613];
        class201.field3440 = new int[class160.field2613];
        class202.field3451 = new int[class160.field2613];
        class126.field2080 = new boolean[class160.field2613];
        class247.field4226 = new int[class160.field2613];
        class256.field4329 = new byte[class160.field2613][];
        var2.field3905 = arg0.length - ((class160.field2613 * 8) + 7);
        if (arg1 >= -57) {
            method1236((byte[]) null, 67);
        }
        class197.field3372 = var2.method1496(true);
        class193.field3301 = var2.method1496(true);
        int var3 = (var2.method1535((byte) 72) & 0xFF) + 1;
        for (int var4 = 0; var4 < class160.field2613; var4++) {
            class247.field4226[var4] = var2.method1496(true);
        }
        for (int var5 = 0; var5 < class160.field2613; var5++) {
            class232.field3933[var5] = var2.method1496(true);
        }
        for (int var6 = 0; var6 < class160.field2613; var6++) {
            class202.field3451[var6] = var2.method1496(true);
        }
        for (int var7 = 0; var7 < class160.field2613; var7++) {
            class201.field3440[var7] = var2.method1496(true);
        }
        var2.field3905 = arg0.length - (class160.field2613 * 8) - (var3 + -1) * 3 - 7;
        class296.field5018 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class296.field5018[var8] = var2.method1551(-126);
            if (class296.field5018[var8] == 0) {
                class296.field5018[var8] = 1;
            }
        }
        var2.field3905 = 0;
        for (int var9 = 0; var9 < class160.field2613; var9++) {
            int var10 = class202.field3451[var9];
            int var11 = class201.field3440[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class256.field4329[var9] = var15;
            class69.field1146[var9] = var13;
            int var16 = var2.method1535((byte) 117);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var15[var22] = var2.method1497(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method1497(false);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label93: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var10 <= var19) {
                                break label93;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var13[var10 * var20 + var19] = var2.method1497(false);
                                var14 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var15[var17 + (var10 * var18)] = var2.method1497(false);
                    }
                    var17++;
                }
            }
            class126.field2080[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 181)
    public static void method1237(boolean arg0) {
        field3244 = null;
        field3252 = null;
        field3251 = null;
        field3253 = null;
        field3245 = null;
        field3242 = null;
        field3241 = null;
        if (arg0) {
            field3247 = null;
            field3250 = null;
            field3249 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIBII)V", line = 224)
    public static final void method1238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var9 = arg3 - arg2;
        int var10 = arg4 - arg1;
        int var11 = (arg8 - arg0 << 16) / var9;
        if (arg6 != -111) {
            field3250 = (class283) null;
        }
        int var12 = (arg5 - arg7 << 16) / var10;
        field3246++;
        class259.method1749(arg7, 0, arg2, arg6 + 28, var11, arg1, arg4, arg0, var12, arg3, 0);
    }
}
