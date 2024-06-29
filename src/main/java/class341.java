import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class341 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Z")
    public static boolean[] field5290 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5296 = 0;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[I")
    public static int[] field5298 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lab;")
    public static class279 field5286 = new class279(2);

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5301 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public int field5287;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public int field5294;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2362(int arg0) {
        class213.field3422.method1884(-22054);
        if (arg0 == 64) {
            field5297++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 22)
    public static final void method2363(byte arg0, boolean arg1, String arg2) {
        short[] var3 = new short[16];
        int var4 = arg1 ? 32768 : 0;
        String var5 = arg2.toLowerCase();
        int var6 = 0;
        field5288++;
        int var7 = (arg1 ? class134.field2259 : class131.field2210) + var4;
        for (int var8 = var4; var8 < var7; var8++) {
            class233 var9 = class169.method1079(var8, (byte) 51);
            if (var9.field3645 && var9.method1538((byte) -48).toLowerCase().indexOf(var5) != -1) {
                if (var6 >= 50) {
                    class201.field3214 = -1;
                    class220.field3487 = null;
                    return;
                }
                if (var6 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var6; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var6++] = (short) var8;
            }
        }
        class189.field3076 = 0;
        class220.field3487 = var3;
        class201.field3214 = var6;
        String[] var12 = new String[class201.field3214];
        for (int var13 = 0; var13 < class201.field3214; var13++) {
            var12[var13] = class169.method1079(var3[var13], (byte) 90).method1538((byte) -125);
        }
        class138.method906(class220.field3487, false, var12);
        if (arg0 > -127) {
            method2365(-16);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbm;ZLbm;)V", line = 102)
    public static final void method2364(class307 arg0, boolean arg1, class307 arg2) {
        class40.field783 = arg0;
        class79.field1566 = arg2;
        class79.field1566.method2056(34, -122);
        if (arg1) {
            field5296 = 127;
        }
        field5293++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class43.field821 = var4 + var6;
        class252.field3944 = var3 + var6;
        class18.field333 = var5 + var6;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 129)
    public static void method2365(int arg0) {
        if (arg0 != 21) {
            method2364((class307) null, false, (class307) null);
        }
        field5286 = null;
        field5301 = null;
        field5298 = null;
        field5290 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lag;I)V", line = 146)
    public static final void method2366(class202 arg0, int arg1) {
        if (arg1 <= 105) {
            field5298 = (int[]) null;
        }
        field5291++;
        while (true) {
            while (arg0.field3249 < arg0.field3273.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1317((byte) -116) == 1) {
                    var4 = arg0.method1317((byte) -71);
                    var2 = true;
                    var3 = arg0.method1317((byte) -128);
                }
                int var5 = arg0.method1317((byte) -95);
                int var6 = arg0.method1317((byte) -84);
                int var7 = var5 * 64 - class38.field734;
                int var8 = class17.field322 + class9.field199 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class163.field2629 && class9.field199 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && var11 < (var4 * 8 + 8) && var12 >= (var3 * 8) && var3 * 8 + 8 > var12) {
                                byte var13 = arg0.method1333(-127);
                                if (var13 != 0) {
                                    if (class97.field1721[var10][var9] == null) {
                                        class97.field1721[var10][var9] = new byte[4096];
                                    }
                                    class97.field1721[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1333(-127);
                                    if (class51.field1021[var10][var9] == null) {
                                        class51.field1021[var10][var9] = new byte[4096];
                                    }
                                    class51.field1021[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1333(-127);
                        if (var16 != 0) {
                            arg0.field3249++;
                        }
                    }
                }
            }
            return;
        }
    }
}
