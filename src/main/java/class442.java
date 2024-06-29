import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class442 {

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Luq;")
    private class172 field6361;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    private int field6356;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "[Z")
    private boolean[] field6362;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "[[I")
    private int[][] field6357;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lg;")
    public static class166 field6353 = new class166(3);

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field6364 = 0;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field6366 = 0;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)Lww;", line = 8)
    public final class761 method2637(byte arg0, int arg1) {
        field6354++;
        byte[] var3 = this.field6361.method1188(1, -18047, arg1);
        class761 var4 = new class761();
        if (arg0 <= 100) {
            method2639(98, (byte) -105);
        }
        var4.method4199(new class254(var3), false);
        return var4;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/lang/String;I)Lfda;", line = 24)
    public static final class339 method2638(int arg0, String arg1, int arg2) {
        if (arg0 != -1) {
            field6366 = 71;
        }
        field6358++;
        class339 var3;
        try {
            var3 = (class339) Class.forName("bt").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class722();
        }
        var3.field4751 = arg1;
        var3.field4753 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V", line = 47)
    public static final void method2639(int arg0, byte arg1) {
        if (arg1 > 61) {
            field6363++;
            class778 var2 = class389.method2406(-116, (long) arg0, 3);
            var2.method4276(0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Z", line = 61)
    public final boolean method2640(byte arg0) {
        field6359++;
        if (arg0 != -66) {
            field6364 = 9;
        }
        return this.field6356 != -1;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 82)
    public class442(class263 arg0, int arg1, class172 arg2) {
        this.field6361 = arg2;
        this.field6361.method1175(1, (byte) 91);
        class254 var4 = new class254(this.field6361.method1188(0, -18047, 0));
        int var5 = var4.method1731((byte) 64);
        if (var5 > 3) {
            this.field6356 = -1;
            this.field6362 = new boolean[0];
            this.field6357 = new int[0][];
        } else {
            int var6 = var4.method1731((byte) 64);
            class313[] var7 = class439.method2625((byte) 121);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method1731((byte) 64);
                    if (var7[var9].field4421 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method1731((byte) 64);
                int var12 = var4.method1731((byte) 64);
                if (var5 <= 2) {
                    this.field6356 = -1;
                } else {
                    this.field6356 = var4.method1695(423951304);
                }
                this.field6362 = new boolean[var12 + 1];
                this.field6357 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method1731((byte) 64);
                    this.field6362[var15] = var4.method1731((byte) 64) == 1;
                    int var16 = var4.method1728((byte) 97);
                    if (this.field6356 == -1) {
                        this.field6357[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6357[var15][var18] = var4.method1728((byte) 49);
                        }
                    } else {
                        this.field6357[var15] = new int[var16 + 1];
                        this.field6357[var15][0] = this.field6356;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6357[var15][var17 + 1] = var4.method1728((byte) 14);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field6357[var14] == null) {
                        if (this.field6356 == -1) {
                            this.field6357[var14] = new int[0];
                        } else {
                            this.field6357[var14] = new int[] { this.field6356 };
                        }
                    }
                }
            } else {
                this.field6357 = new int[0][];
                this.field6362 = new boolean[0];
                this.field6356 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)[I", line = 224)
    public final int[] method2641(int arg0, int arg1) {
        field6355++;
        if (arg1 != -29149) {
            this.method2641(18, -28);
        }
        if (arg0 < 0 || this.field6357.length <= arg0) {
            return this.field6356 == -1 ? new int[0] : new int[] { this.field6356 };
        } else if (this.field6362[arg0] && this.field6357[arg0].length > 1) {
            int var3 = this.field6356 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field6357[arg0].length];
            class421.method2531(this.field6357[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class594.method3335(var5.length - var3, false, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field6357[arg0];
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 270)
    public static void method2642(int arg0) {
        field6353 = null;
        if (arg0 != -1) {
            method2639(42, (byte) -39);
        }
    }
}
