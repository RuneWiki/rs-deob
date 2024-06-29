import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class327 extends class6 {

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "I")
    private int field4468;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "Lqp;")
    public static class466 field4475 = new class466("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "[Lqf;")
    public class478[] field4471;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "[[B")
    private byte[][] field4473;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;BZ)La;")
    public static final class435 method1894(Component arg0, byte arg1, boolean arg2) {
        if (arg1 != -51) {
            method1895((byte) 78);
        }
        field4472++;
        return new class314(arg0, arg2);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        field4475 = null;
        if (arg0 <= 85) {
            field4475 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)Z")
    public final boolean method1896(int arg0, byte arg1) {
        field4470++;
        return arg1 == 122 ? this.field4471[arg0].field6987 : false;
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)Z")
    public final boolean method1897(int arg0) {
        field4474++;
        if (this.field4471 != null) {
            return true;
        }
        if (this.field4473 == null) {
            if (!class204.field2872.method750(this.field4468, 57)) {
                return false;
            }
            int[] var2 = class204.field2872.method754(this.field4468, (byte) 82);
            this.field4473 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4473[var3] = class204.field2872.method727(var2[var3], this.field4468, -105);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4473.length; var5++) {
            byte[] var14 = this.field4473[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class204.field2870.method747(var15, (byte) -68);
        }
        if (arg0 != -25737) {
            field4475 = null;
        }
        if (!var4) {
            return false;
        }
        class479 var6 = new class479();
        int var7 = class204.field2872.method753(this.field4468, -87);
        this.field4471 = new class478[var7];
        int[] var8 = class204.field2872.method754(this.field4468, (byte) 82);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4473[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class367 var12 = null;
            for (class367 var13 = (class367) var6.method2818((byte) 120); var13 != null; var13 = (class367) var6.method2820((byte) -58)) {
                if (var13.field5388 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class367(var11, class204.field2870.method742(var11, 1));
                var6.method2809(var12, 2);
            }
            this.field4471[var8[var9]] = new class478(var10, var12);
        }
        this.field4473 = null;
        return true;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class317.method1854(-89, arg0);
        field4467++;
        int var7 = 0;
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg2 > -106) {
            method1894(null, (byte) 34, false);
        }
        if (class417.field6057 <= arg6 && arg6 <= class224.field3193) {
            int[] var15 = class437.field6400[arg6];
            int var16 = class46.method425(true, arg4 - arg0, class76.field1021, class424.field6204);
            int var17 = class46.method425(true, arg0 + arg4, class76.field1021, class424.field6204);
            int var18 = class46.method425(true, arg4 - var8, class76.field1021, class424.field6204);
            int var19 = class46.method425(true, arg4 + var8, class76.field1021, class424.field6204);
            class210.method1300(var16, var15, (byte) 74, var18, arg1);
            class210.method1300(var18, var15, (byte) 125, var19, arg5);
            class210.method1300(var19, var15, (byte) 119, var17, arg1);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class485.field7088[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg6 - var9;
                int var21 = arg6 + var9;
                if (var21 >= class417.field6057 && var20 <= class224.field3193) {
                    if (var9 < var8) {
                        int var22 = class485.field7088[var9];
                        int var23 = class46.method425(true, arg4 + var7, class76.field1021, class424.field6204);
                        int var24 = class46.method425(true, arg4 - var7, class76.field1021, class424.field6204);
                        int var25 = class46.method425(true, arg4 + var22, class76.field1021, class424.field6204);
                        int var26 = class46.method425(true, arg4 - var22, class76.field1021, class424.field6204);
                        if (class224.field3193 >= var21) {
                            int[] var27 = class437.field6400[var21];
                            class210.method1300(var24, var27, (byte) 123, var26, arg1);
                            class210.method1300(var26, var27, (byte) 88, var25, arg5);
                            class210.method1300(var25, var27, (byte) 107, var23, arg1);
                        }
                        if (var20 >= class417.field6057) {
                            int[] var28 = class437.field6400[var20];
                            class210.method1300(var24, var28, (byte) 76, var26, arg1);
                            class210.method1300(var26, var28, (byte) 87, var25, arg5);
                            class210.method1300(var25, var28, (byte) 102, var23, arg1);
                        }
                    } else {
                        int var29 = class46.method425(true, arg4 + var7, class76.field1021, class424.field6204);
                        int var30 = class46.method425(true, arg4 - var7, class76.field1021, class424.field6204);
                        if (class224.field3193 >= var21) {
                            class210.method1300(var30, class437.field6400[var21], (byte) 72, var29, arg1);
                        }
                        if (class417.field6057 <= var20) {
                            class210.method1300(var30, class437.field6400[var20], (byte) 99, var29, arg1);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (var32 >= class417.field6057 && var31 <= class224.field3193) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (class424.field6204 <= var33 && var34 <= class76.field1021) {
                    int var35 = class46.method425(true, var33, class76.field1021, class424.field6204);
                    int var36 = class46.method425(true, var34, class76.field1021, class424.field6204);
                    if (var8 <= var7) {
                        if (class224.field3193 >= var32) {
                            class210.method1300(var36, class437.field6400[var32], (byte) 85, var35, arg1);
                        }
                        if (class417.field6057 <= var31) {
                            class210.method1300(var36, class437.field6400[var31], (byte) 84, var35, arg1);
                        }
                    } else {
                        int var37 = var7 > var11 ? class485.field7088[var7] : var11;
                        int var38 = class46.method425(true, arg4 + var37, class76.field1021, class424.field6204);
                        int var39 = class46.method425(true, arg4 - var37, class76.field1021, class424.field6204);
                        if (var32 <= class224.field3193) {
                            int[] var40 = class437.field6400[var32];
                            class210.method1300(var36, var40, (byte) 124, var39, arg1);
                            class210.method1300(var39, var40, (byte) 71, var38, arg5);
                            class210.method1300(var38, var40, (byte) 91, var35, arg1);
                        }
                        if (class417.field6057 <= var31) {
                            int[] var41 = class437.field6400[var31];
                            class210.method1300(var36, var41, (byte) 92, var39, arg1);
                            class210.method1300(var39, var41, (byte) 110, var38, arg5);
                            class210.method1300(var38, var41, (byte) 88, var35, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Z")
    public final boolean method1899(int arg0, int arg1) {
        field4469++;
        if (arg0 != -1) {
            this.field4471 = null;
        }
        return this.field4471[arg1].field6981;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
    public class327(int arg0) {
        this.field4468 = arg0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)Z")
    public final boolean method1900(byte arg0, int arg1) {
        if (arg0 != -87) {
            method1894(null, (byte) 92, false);
        }
        field4466++;
        return this.field4471[arg1].field6990;
    }
}
