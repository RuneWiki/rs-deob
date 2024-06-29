import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class42 extends class187 {

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "[I")
    public int[] field595;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[[I")
    public int[][] field596;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[I")
    public int[] field590;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[Z")
    public boolean[] field589;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lcd;")
    public static class4 field594;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIIIIIIIIZII)V", line = 10)
    public static final void method303(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field598++;
        int var12 = arg8 - arg10;
        int var13 = arg3 - arg11;
        int var14 = -1;
        if (class190.field2894 > 0) {
            if (class96.field1470 > 10) {
                var14 = (20 - class96.field1470) * 5;
            } else {
                var14 = class96.field1470 * 5;
            }
        }
        int var15 = 125 % ((-arg0 - 68) / 38);
        int var16 = 983040 / arg2;
        int var17 = 983040 / arg7;
        for (int var18 = -var16; var18 < (var12 + var16); var18++) {
            int var19 = (var18 + 1) * arg2 + arg1 >> 16;
            int var20 = arg1 + (arg2 * var18) >> 16;
            int var21 = var19 - var20;
            if (var21 > 0) {
                int var10000 = arg4 + var19;
                int var23 = arg4 + var20;
                int var24 = arg10 + var18 >> 6;
                if (var24 >= 0 && var24 <= class163.field2519.length - 1) {
                    int[][] var25 = class163.field2519[var24];
                    for (int var26 = -var17; var26 < var13 + var17; var26++) {
                        int var27 = arg6 + (arg7 * var26) >> 16;
                        int var28 = (var26 + 1) * arg7 + arg6 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg5 + var27;
                            int var31 = arg11 + var26 >> 6;
                            var10000 = arg5 + var28;
                            if (var31 >= 0 && var31 <= var25.length - 1 && var25[var31] != null) {
                                int var33 = ((var26 + arg11 & 0x3F) << 6) + (arg10 + var18 & 0x3F);
                                int var34 = var25[var31][var33];
                                if (var34 != 0) {
                                    class17 var35 = class277.method1819((byte) -42, var34 - 1);
                                    if (!class311.field4934[var35.field205]) {
                                        if (var14 != -1 && class30.field368 == var35.field205) {
                                            class282 var36 = new class282();
                                            var36.field4339 = var35.field205;
                                            var36.field4333 = var30;
                                            var36.field4334 = var23;
                                            class112.field1722.method7((byte) -51, var36);
                                        } else {
                                            class271.field4165[var35.field205].method921(var23 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class282 var37 = (class282) class112.field1722.method10((byte) 105); var37 != null; var37 = (class282) class112.field1722.method13((byte) -32)) {
            class57.method390(var37.field4334, var37.field4333, 15, 16776960, var14);
            class57.method390(var37.field4334, var37.field4333, 13, 16776960, var14);
            class57.method390(var37.field4334, var37.field4333, 11, 16776960, var14);
            class57.method390(var37.field4334, var37.field4333, 9, 16776960, var14);
            class271.field4165[var37.field4339].method921(var37.field4334 - 7, var37.field4333 + -7);
        }
        class112.field1722.method5(35);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V", line = 137)
    public static final void method304(int arg0, int arg1, int arg2) {
        field591++;
        if (arg0 != -27661) {
            return;
        }
        class156.field2442[arg2] = arg1;
        class36 var3 = (class36) class211.field3345.method1558((long) arg2, false);
        if (var3 == null) {
            class36 var4 = new class36(class195.method1322(125) + 500L);
            class211.field3345.method1550(var4, (long) arg2, (byte) 84);
        } else {
            var3.field454 = class195.method1322(127) + 500L;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Ljm;", line = 165)
    public static final class69 method305(byte arg0) {
        field597++;
        if (arg0 != -24) {
            method305((byte) -104);
        }
        try {
            return (class69) Class.forName("vc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class111();
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[B)V", line = 179)
    public class42(int arg0, byte[] arg1) {
        this.field593 = arg0;
        class303 var3 = new class303(arg1);
        this.field592 = var3.method2043((byte) -109);
        this.field595 = new int[this.field592];
        this.field596 = new int[this.field592][];
        this.field590 = new int[this.field592];
        this.field589 = new boolean[this.field592];
        for (int var4 = 0; var4 < this.field592; var4++) {
            this.field595[var4] = var3.method2043((byte) -119);
        }
        for (int var5 = 0; var5 < this.field592; var5++) {
            this.field589[var5] = var3.method2043((byte) -113) == 1;
        }
        for (int var6 = 0; var6 < this.field592; var6++) {
            this.field590[var6] = var3.method1994(false);
        }
        for (int var7 = 0; var7 < this.field592; var7++) {
            this.field596[var7] = new int[var3.method2043((byte) -120)];
        }
        for (int var8 = 0; var8 < this.field592; var8++) {
            for (int var9 = 0; var9 < this.field596[var8].length; var9++) {
                this.field596[var8][var9] = var3.method2043((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V", line = 238)
    public static void method306(boolean arg0) {
        field594 = null;
        if (!arg0) {
            method304(120, 14, -85);
        }
    }
}
