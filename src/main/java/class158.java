import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class158 extends class283 {

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Z")
    private boolean field2458 = true;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "Z")
    private boolean field2467 = true;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "Lna;")
    public static class26 field2471 = class69.method505("clignotant2:", (byte) -124);

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "F")
    public static float field2470;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILwa;Z)V", line = 4)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field2468++;
        if (!arg2) {
            method1077(18, false, -19, 102L);
        }
        if (arg0 == 0) {
            this.field2458 = arg1.method642((byte) -117) == 1;
        } else if (arg0 == 1) {
            this.field2467 = arg1.method642((byte) -93) == 1;
        } else if (arg0 == 2) {
            this.field4715 = arg1.method642((byte) -45) == 1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[[I", line = 65)
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 != -1) {
            method1077(-98, true, 95, 79L);
        }
        field2461++;
        int[][] var3 = this.field4719.method2182((byte) 54, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(this.field2467 ? class210.field3268 - arg1 : arg1, 0, (byte) -105);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            if (this.field2458) {
                for (int var11 = 0; var11 < class101.field1632; var11++) {
                    var10[var11] = var5[class236.field3783 - var11];
                    var8[var11] = var7[class236.field3783 - var11];
                    var9[var11] = var6[class236.field3783 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class101.field1632; var12++) {
                    var10[var12] = var5[var12];
                    var8[var12] = var7[var12];
                    var9[var12] = var6[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V", line = 129)
    public static final void method1073(int arg0) {
        field2462++;
        int var1 = 15 / ((-arg0 - 11) / 63);
        if (class133.field2025 == 2) {
            if (class261.field4265 == class187.field2959 && class89.field1478 == class11.field150) {
                class133.field2025 = 0;
                if (class225.field3564 && class78.field1183[81] && class126.field1955 > 2) {
                    class214.method1421(2597, class126.field1955 - 2);
                } else {
                    class214.method1421(2597, class126.field1955 - 1);
                }
            }
        } else if (class205.field3210 == class187.field2959 && class11.field152 == class11.field150) {
            class133.field2025 = 0;
            if (class225.field3564 && class78.field1183[81] && class126.field1955 > 2) {
                class214.method1421(2597, class126.field1955 - 2);
            } else {
                class214.method1421(2597, class126.field1955 - 1);
            }
        } else {
            class89.field1478 = class11.field152;
            class133.field2025 = 2;
            class261.field4265 = class205.field3210;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 239)
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "(I)V", line = 192)
    public static final void method1074(int arg0) {
        field2460++;
        class114.field1789.method1431(0, 243);
        class114.field1789.method591((byte) -66, class243.method1677(0));
        class114.field1789.method643(arg0 - 20034, class38.field622);
        if (arg0 != -3) {
            field2466 = -41;
        }
        class325.field5608++;
        class114.field1789.method643(-20037, class141.field2153);
        class114.field1789.method591((byte) -31, class2.field17);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lve;ILve;Lof;)V", line = 215)
    public static final void method1075(class266 arg0, int arg1, class266 arg2, class237 arg3) {
        class307.field5294 = arg0;
        class258.field4210 = arg3;
        field2469++;
        class293.field4876 = arg2;
        if (class293.field4876 != null) {
            class243.field3997 = class293.field4876.method1898(1, (byte) 100);
        }
        if (class307.field5294 != null) {
            class236.field3763 = class307.field5294.method1898(1, (byte) 83);
        }
        if (arg1 <= 32) {
            field2471 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 250)
    public static void method1076(boolean arg0) {
        field2471 = null;
        if (!arg0) {
            method1074(-76);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[I", line = 261)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -34 / ((arg1 - 30) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        field2464++;
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, this.field2467 ? class210.field3268 - arg0 : arg0, 32755);
            if (this.field2458) {
                for (int var6 = 0; var6 < class101.field1632; var6++) {
                    var4[var6] = var5[class236.field3783 - var6];
                }
            } else {
                class75.method537(var5, 0, var4, 0, class101.field1632);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZIJ)Lna;", line = 301)
    public static final class26 method1077(int arg0, boolean arg1, int arg2, long arg3) {
        field2459++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg2 <= 71) {
            field2470 = 1.3008908F;
        }
        long var5 = arg3 / (long) arg0;
        int var7 = 1;
        while (var5 != 0L) {
            var7++;
            var5 /= (long) arg0;
        }
        int var8 = var7;
        if (arg3 < 0L || arg1) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var11 = (int) (arg3 % (long) arg0);
            arg3 /= (long) arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class26 var12 = new class26();
        var12.field418 = var9;
        var12.field436 = var8;
        return var12;
    }
}
