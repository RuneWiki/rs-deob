import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class282 extends class217 {

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[[S")
    public static short[][] field4352 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[C")
    public static char[] field4360 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Llb;")
    public static class211 field4357;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "[I")
    public int[] field4358;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
    public int[] field4362;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
    public int[] field4365;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "[Lqm;")
    public class233[] field4363;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "[Lqm;")
    public class233[] field4366;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[[[B")
    public byte[][][] field4359;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1985(int arg0) {
        class88.field1293.method69((byte) 59);
        field4354++;
        int var1 = class88.field1293.method63(arg0 + 273, 8);
        if (class122.field1923 > var1) {
            for (int var2 = var1; var2 < class122.field1923; var2++) {
                class224.field3493[class167.field2521++] = class126.field1995[var2];
            }
        }
        if (var1 > class122.field1923) {
            throw new RuntimeException("gnpov1");
        }
        class122.field1923 = 0;
        int var3 = 0;
        if (arg0 != -161) {
            field4357 = (class211) null;
        }
        while (var3 < var1) {
            int var4 = class126.field1995[var3];
            class45 var5 = class161.field2394[var4];
            int var6 = class88.field1293.method63(arg0 + 274, 1);
            if (var6 == 0) {
                class126.field1995[class122.field1923++] = var4;
                var5.field4481 = class312.field4852;
            } else {
                int var7 = class88.field1293.method63(125, 2);
                if (var7 == 0) {
                    class126.field1995[class122.field1923++] = var4;
                    var5.field4481 = class312.field4852;
                    class227.field3515[class122.field1922++] = var4;
                } else if (var7 == 1) {
                    class126.field1995[class122.field1923++] = var4;
                    var5.field4481 = class312.field4852;
                    int var12 = class88.field1293.method63(127, 3);
                    var5.method2034(var12, (byte) 64, 1);
                    int var13 = class88.field1293.method63(125, 1);
                    if (var13 == 1) {
                        class227.field3515[class122.field1922++] = var4;
                    }
                } else if (var7 == 2) {
                    class126.field1995[class122.field1923++] = var4;
                    var5.field4481 = class312.field4852;
                    if (class88.field1293.method63(arg0 + 284, 1) == 1) {
                        int var9 = class88.field1293.method63(arg0 ^ 0xFFFFFF24, 3);
                        var5.method2034(var9, (byte) 80, 2);
                        int var10 = class88.field1293.method63(113, 3);
                        var5.method2034(var10, (byte) 98, 2);
                    } else {
                        int var8 = class88.field1293.method63(122, 3);
                        var5.method2034(var8, (byte) 32, 0);
                    }
                    int var11 = class88.field1293.method63(120, 1);
                    if (var11 == 1) {
                        class227.field3515[class122.field1922++] = var4;
                    }
                } else if (var7 == 3) {
                    class224.field3493[class167.field2521++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 122)
    public static final String method1986(int arg0, byte[] arg1, int arg2, int arg3) {
        field4355++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = 0;
        int var7 = -47 / ((arg2 - 44) / 58);
        while (arg3 > var6) {
            int var8 = arg1[arg0 + var6] & 0xFF;
            if (var8 != 0) {
                label31: {
                    if (var8 >= 128 && var8 < 160) {
                        char var9 = field4360[var8 - 128];
                        if (var9 == '\u0000') {
                            break label31;
                        }
                        var8 = var9;
                    }
                    var4[var5++] = (char) var8;
                }
            }
            var6++;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 170)
    public static final void method1987(boolean arg0) {
        field4364++;
        class34.field431.method1428(10935);
        class178.field2659.method1428(10935);
        if (!arg0) {
            field4361 = -51;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 186)
    public static void method1988(int arg0) {
        field4352 = (short[][]) null;
        field4360 = null;
        if (arg0 == -5279) {
            field4357 = null;
        }
    }
}
