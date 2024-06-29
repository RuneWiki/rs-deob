import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class326 extends class71 {

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    private int field5673 = 4096;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Lud;")
    public static class279 field5671 = class130.method1024("Schlie-8en", 255);

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "[I")
    public static int[] field5679 = new int[2500];

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Lok;")
    public static class149 field5674;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLvh;)V", line = 5)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            this.field5673 = arg2.method468(28214);
        }
        field5680++;
        if (!arg1) {
            field5671 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBII)I", line = 18)
    public static final int method2281(int arg0, byte arg1, int arg2, int arg3) {
        field5672++;
        int var4 = arg3 & 0x3;
        if (arg1 != 120) {
            method2285((byte) -25, -93);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)[I", line = 47)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            this.field5673 = -76;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        field5675++;
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0 - 1 & class262.field4688, -3, 0);
            int[] var5 = this.method624(arg0, -3, 0);
            int[] var6 = this.method624(arg0 + 1 & class262.field4688, -3, 0);
            for (int var7 = 0; var7 < class215.field3787; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field5673;
                int var9 = (var5[class309.field5478 & var7 + 1] - var5[var7 - 1 & class309.field5478]) * this.field5673;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIBII)V", line = 102)
    public static final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field5678++;
        int var8 = class125.method1001(arg7, class108.field2002, false, class135.field2463);
        int var9 = class125.method1001(arg6, class108.field2002, false, class135.field2463);
        int var10 = class125.method1001(arg1, class44.field929, false, class249.field4449);
        int var11 = class125.method1001(arg0, class44.field929, false, class249.field4449);
        int var12 = class125.method1001(arg7 + arg4, class108.field2002, false, class135.field2463);
        int var13 = class125.method1001(arg6 - arg4, class108.field2002, false, class135.field2463);
        for (int var14 = var8; var14 < var12; var14++) {
            class152.method1208(var10, arg2, var11, class182.field3348[var14], -7);
        }
        if (arg5 >= -40) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class152.method1208(var10, arg2, var11, class182.field3348[var15], -7);
        }
        int var16 = class125.method1001(arg1 + arg4, class44.field929, false, class249.field4449);
        int var17 = class125.method1001(arg0 - arg4, class44.field929, false, class249.field4449);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class182.field3348[var18];
            class152.method1208(var10, arg2, var16, var19, -7);
            class152.method1208(var16, arg3, var17, var19, -7);
            class152.method1208(var17, arg2, var11, var19, -7);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 216)
    public class326() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBII)V", line = 172)
    public static final void method2283(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5677++;
        class104 var5 = class293.method2085(10, arg3, false);
        if (arg2 != 3) {
            method2282(67, 85, -68, 55, -2, (byte) 10, 124, -93);
        }
        var5.method879(arg2 ^ 0x3);
        var5.field1965 = arg1;
        var5.field1962 = arg4;
        var5.field1966 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 200)
    public static void method2284(byte arg0) {
        field5671 = null;
        field5679 = null;
        if (arg0 < 12) {
            method2281(-58, (byte) -81, -113, 114);
        }
        field5674 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z", line = 221)
    public static final boolean method2285(byte arg0, int arg1) {
        field5676++;
        int var2 = 101 % ((35 - arg0) / 46);
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }
}
