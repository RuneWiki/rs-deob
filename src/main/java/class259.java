import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class259 extends class279 {

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    private int field4324 = 4096;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    private int field4326 = 4096;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    private int field4329 = 4096;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Lkl;")
    public static class64 field4322 = new class64();

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "Ltl;")
    public static class59 field4333 = class85.method639("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 9588);

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Ltl;")
    public static class59 field4330 = class85.method639("Lade Liste der Welten", 9588);

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "Lme;")
    public static class295 field4331;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZII)I", line = 4)
    public static final int method1799(int arg0, boolean arg1, int arg2, int arg3) {
        field4325++;
        class22 var4 = (class22) class238.field3969.method685((long) arg3, 128);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field297.length; var6++) {
            if (var4.field297[var6] >= 0 && class147.field2416 > var4.field297[var6]) {
                class44 var7 = class81.method616(var4.field297[var6], (byte) 25);
                if (var7.field683 != null) {
                    class174 var8 = (class174) var7.field683.method685((long) arg0, 128);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field294[var6] * var8.field2851;
                        } else {
                            var5 += var8.field2851;
                        }
                    }
                }
            }
        }
        if (arg2 != -32004) {
            field4333 = (class59) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 101)
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V", line = 64)
    public static void method1800(int arg0) {
        field4322 = null;
        field4330 = null;
        field4333 = null;
        if (arg0 != -18794) {
            field4333 = (class59) null;
        }
        field4331 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Lva;", line = 78)
    public static final class234 method1801(byte arg0, int arg1) {
        field4321++;
        class234 var2 = (class234) class224.field3629.method1483((byte) -74, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -87) {
            field4327 = 21;
        }
        byte[] var3 = class17.field216.method2042(3, arg1, (byte) -123);
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1648(new class170(var3), 5000);
        }
        class224.field3629.method1488((long) arg1, var4, 25838);
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)[[I", line = 124)
    public final int[][] method87(int arg0, int arg1) {
        field4328++;
        if (arg0 != -7523) {
            this.method87(-114, 74);
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class56.field835; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field4326 * var12 >> 12;
                    var8[var11] = this.field4324 * var13 >> 12;
                    var10[var11] = this.field4329 * var14 >> 12;
                } else {
                    var9[var11] = this.field4326;
                    var8[var11] = this.field4324;
                    var10[var11] = this.field4329;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILs;)V", line = 190)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field4323++;
        if (arg1 == 0) {
            this.field4326 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field4324 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field4329 = arg2.method1214(-18254);
        }
        if (arg0 >= -125) {
            field4331 = (class295) null;
        }
    }
}
