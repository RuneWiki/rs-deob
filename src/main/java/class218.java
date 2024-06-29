import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class218 extends class137 {

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "Lea;")
    public class66 field3579;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "[I")
    public static int[] field3589 = new int[14];

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Lhb;")
    public static class155 field3574 = new class155(16);

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "[[[Llm;")
    public static class151[][][] field3584;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBI)I")
    public static final int method1504(int arg0, int arg1, byte arg2, int arg3) {
        field3582++;
        int var4 = arg1 - 1 & arg0;
        int var5 = arg3 / arg1;
        int var6 = arg0 / arg1;
        int var7 = class298.method1972(30000, var5, var6);
        int var8 = class298.method1972(30000, var5, var6 + 1);
        if (arg2 != -122) {
            field3574 = null;
        }
        int var9 = arg1 - 1 & arg3;
        int var10 = class298.method1972(30000, var5 + 1, var6);
        int var11 = class298.method1972(30000, var5 + 1, var6 + 1);
        int var12 = class5.method27(var4, 0, var8, var7, arg1);
        int var13 = class5.method27(var4, 0, var11, var10, arg1);
        return class5.method27(var9, 0, var13, var12, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1505(String arg0, boolean arg1, int arg2) {
        field3572++;
        if (arg0 == null) {
            return;
        }
        if (class169.field2755 >= 100) {
            class99.method673(true, class6.field60);
            return;
        }
        String var3 = class310.method2071(arg2 + 214565223, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class169.field2755; var4++) {
            String var8 = class310.method2071(-28047, class263.field4224[var4]);
            if (var8 != null && var8.equals(var3)) {
                class99.method673(true, arg0 + class229.field3709);
                return;
            }
            if (class79.field1314[var4] != null) {
                String var9 = class310.method2071(arg2 + 214565223, class79.field1314[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class99.method673(true, arg0 + class229.field3709);
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg2 != -214593270) {
            method1508(-38, -109, 4, -38);
        }
        while (class124.field1968 > var5) {
            String var6 = class310.method2071(-28047, class258.field4165[var5]);
            if (var6 != null && var6.equals(var3)) {
                class99.method673(true, class141.field2254 + arg0 + class98.field1568);
                return;
            }
            if (class308.field4931[var5] != null) {
                String var7 = class310.method2071(-28047, class308.field4931[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class99.method673(true, class141.field2254 + arg0 + class98.field1568);
                    return;
                }
            }
            var5++;
        }
        if (class310.method2071(arg2 ^ 0xCCA037B, class239.field3829.field4778).equals(var3)) {
            class99.method673(true, class77.field1286);
            return;
        }
        class123.field1949++;
        class314.field5061.method828(121, 26);
        class314.field5061.method1108(class230.method1551(arg0, (byte) -87) + 1, true);
        class314.field5061.method1148((byte) -99, arg0);
        class314.field5061.method1108(arg1 ? 1 : 0, true);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLdk;II)Lsa;")
    public static final class260 method1506(byte arg0, class251 arg1, int arg2, int arg3) {
        if (arg0 != -76) {
            method1510((byte) -32);
        }
        field3587++;
        return class290.method1932(127, arg3, arg2, arg1) ? class258.method1735((byte) 22) : null;
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
    public static void method1507(int arg0) {
        if (arg0 != 8) {
            method1507(-25);
        }
        field3589 = null;
        field3584 = null;
        field3574 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
    public static final int method1508(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        field3586++;
        if (arg2 >= -86) {
            method1506((byte) 13, (class251) null, 51, 51);
        }
        return (arg0 >> 5 << 7) + (arg3 >> 2 << 10) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII)V")
    public final void method1509(int arg0, byte arg1, int arg2, int arg3) {
        field3580++;
        this.field3576 = arg3;
        this.field3581 = arg2;
        this.field3575 = arg0;
        if (arg1 != 47) {
            this.field3575 = -71;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method1510(byte arg0) {
        class55.method381(120, class312.field4979);
        field3583++;
        int var1 = (class276.field4438 >> 3) + (class148.field2314 >> 10);
        int var2 = (class108.field1732 >> 3) + (class104.field1666 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class249.field3946 = new int[var6];
        class65.field1080 = new int[var6];
        class115.field1856 = new int[var6];
        class153.field2382 = new int[var6][4];
        class264.field4231 = new int[var6];
        class117.field1893 = new byte[var6][];
        class180.field2944 = new byte[var6][];
        class57.field956 = new byte[var6][];
        class120.field1914 = new int[var6];
        class173.field2825 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class120.field1914[var7] = var11;
                class65.field1080[var7] = class84.field1393.method1699(0, "m" + var8 + "_" + var10);
                class249.field3946[var7] = class84.field1393.method1699(0, "l" + var8 + "_" + var10);
                class115.field1856[var7] = class84.field1393.method1699(0, "n" + var8 + "_" + var10);
                class264.field4231[var7] = class84.field1393.method1699(0, "um" + var8 + "_" + var10);
                class173.field2825[var7] = class84.field1393.method1699(0, "ul" + var8 + "_" + var10);
                if (class115.field1856[var7] == -1) {
                    class65.field1080[var7] = -1;
                    class249.field3946[var7] = -1;
                    class264.field4231[var7] = -1;
                    class173.field2825[var7] = -1;
                }
                var7++;
            }
        }
        int var9 = var7;
        if (arg0 < 113) {
            method1510((byte) 108);
        }
        while (var9 < class115.field1856.length) {
            class115.field1856[var9] = -1;
            class65.field1080[var9] = -1;
            class249.field3946[var9] = -1;
            class264.field4231[var9] = -1;
            class173.field2825[var9] = -1;
            var9++;
        }
        class100.method685(var1, var2, true, false, var3, var4, var5, false);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lea;Lic;)V")
    public class218(class66 arg0, class171 arg1) {
        this.field3579 = arg0;
    }
}
