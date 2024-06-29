import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class228 {

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    public boolean field3466 = true;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3463 = "Connecting to update server";

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lhb;")
    public static class318 field3471 = new class318(64);

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[I")
    public static int[] field3473 = new int[100];

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Ljl;")
    public static class112 field3472;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Llm;")
    public static class210 field3465;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Llm;BLlm;)V", line = 7)
    public static final void method1578(class210 arg0, byte arg1, class210 arg2) {
        if (arg1 != -56) {
            field3463 = (String) null;
        }
        field3464++;
        class61.field817 = class225.method1569(class164.field2481, -1, arg0, arg2, 0);
        if (class117.field1817) {
            class80.field1130 = class253.method1711(0, -190, class164.field2481, arg0, arg2);
        } else {
            class80.field1130 = (class112) class61.field817;
        }
        class84.field1247 = class225.method1569(class73.field954, -1, arg0, arg2, 0);
        class217.field3299 = class225.method1569(class29.field395, -1, arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lig;IIIIIIZ)V", line = 27)
    public static final void method1579(class99 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1581.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1581[var9] - class44.field556;
            int var11 = arg0.field1573[var9] - class257.field3885;
            int var12 = arg0.field1580[var9] - class316.field4773;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1588 != null) {
                class99.field1578[var9] = var13;
                class99.field1576[var9] = var16;
                class99.field1585[var9] = var17;
            }
            class99.field1572[var9] = (var13 << 9) / var17 + class148.field2236;
            class99.field1591[var9] = (var16 << 9) / var17 + class148.field2231;
        }
        class148.field2237 = 0;
        int var19 = arg0.field1587.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1587[var20];
            int var22 = arg0.field1589[var20];
            int var23 = arg0.field1577[var20];
            int var24 = class99.field1572[var21];
            int var25 = class99.field1572[var22];
            int var26 = class99.field1572[var23];
            int var27 = class99.field1591[var21];
            int var28 = class99.field1591[var22];
            int var29 = class99.field1591[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class126.field1976 && class3.method8(class42.field506 + class148.field2236, class76.field996 + class148.field2231, var27, var28, var29, var24, var25, var26)) {
                    class41.field495 = arg5;
                    class190.field2826 = arg6;
                }
                if (!class117.field1817 && !arg7) {
                    class148.field2227 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class148.field2223 || var25 > class148.field2223 || var26 > class148.field2223) {
                        class148.field2227 = true;
                    }
                    if (arg0.field1588 == null || arg0.field1588[var20] == -1) {
                        if (arg0.field1574[var20] != 12345678) {
                            class148.method1061(var27, var28, var29, var24, var25, var26, arg0.field1574[var20], arg0.field1579[var20], arg0.field1575[var20]);
                        }
                    } else if (!class233.field3506) {
                        int var30 = class148.field2233.method739(arg0.field1588[var20], -26067);
                        class148.method1061(var27, var28, var29, var24, var25, var26, class23.method160(var30, arg0.field1574[var20]), class23.method160(var30, arg0.field1579[var20]), class23.method160(var30, arg0.field1575[var20]));
                    } else if (arg0.field1583) {
                        class148.method1074(var27, var28, var29, var24, var25, var26, arg0.field1574[var20], arg0.field1579[var20], arg0.field1575[var20], class99.field1578[0], class99.field1578[1], class99.field1578[3], class99.field1576[0], class99.field1576[1], class99.field1576[3], class99.field1585[0], class99.field1585[1], class99.field1585[3], arg0.field1588[var20]);
                    } else {
                        class148.method1074(var27, var28, var29, var24, var25, var26, arg0.field1574[var20], arg0.field1579[var20], arg0.field1575[var20], class99.field1578[var21], class99.field1578[var22], class99.field1578[var23], class99.field1576[var21], class99.field1576[var22], class99.field1576[var23], class99.field1585[var21], class99.field1585[var22], class99.field1585[var23], arg0.field1588[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lle;", line = 145)
    public static final class127 method1580(byte arg0) {
        field3468++;
        int var1 = class203.field3051[0] * class160.field2403[0];
        byte[] var2 = class205.field3083[0];
        int[] var3 = new int[var1];
        if (arg0 > -6) {
            field3465 = (class210) null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class66.field865[class124.method893(var2[var4], 255)];
        }
        class127 var5 = new class127(class12.field136, class132.field2034, class203.field3039[0], class184.field2754[0], class203.field3051[0], class160.field2403[0], var3);
        class10.method49((byte) 74);
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIZ)V", line = 223)
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3470 = arg0;
        this.field3462 = arg3;
        this.field3467 = arg2;
        this.field3466 = arg6;
        this.field3459 = arg4;
        this.field3458 = arg5;
        this.field3469 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 183)
    public static final void method1581(byte arg0) {
        field3460++;
        if (arg0 >= -35) {
            method1581((byte) 38);
        }
        for (int var1 = 0; var1 < class172.field2577; var1++) {
            int var2 = class56.field711[var1];
            class69 var3 = class187.field2788[var2];
            if (var3 != null) {
                class226.method1576(var3.field914.field759, var3, (byte) -61);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 211)
    public static void method1582(byte arg0) {
        field3471 = null;
        field3473 = null;
        if (arg0 != -22) {
            method1579((class99) null, -92, -5, -57, -13, 23, 34, true);
        }
        field3472 = null;
        field3465 = null;
        field3463 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 238)
    public static final void method1583(int arg0) {
        if (arg0 > -108) {
            field3473 = (int[]) null;
        }
        class29.field391.method2182(false);
        field3461++;
    }
}
