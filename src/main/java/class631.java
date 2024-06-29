import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class631 extends class176 {

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public int field8877;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public int field8872;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public int field8876;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public int field8870;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field8868;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field8871;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Lsb;")
    public static class305 field8874 = new class305(45, 3);

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field8879 = -1;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Lnd;")
    public static class689 field8878 = new class689();

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "[Lf;")
    public static class534[] field8881;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Let;Z)Z", line = 7)
    public static final boolean method3538(class613 arg0, boolean arg1) {
        boolean var2 = class666.field9303 == class156.field1743;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method3413(2);
        if (arg0.field8635 < 0 || arg0.field8627 < 0 || arg0.field8634 >= class122.field1369 || arg0.field8630 >= class247.field3058) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field8635; var7 <= arg0.field8634; var7++) {
            for (int var11 = arg0.field8627; var11 <= arg0.field8630; var11++) {
                class499 var12 = class472.method2722(arg0.field5166, var7, var11);
                if (var12 != null) {
                    class245 var13 = class401.method2257((byte) -93, arg0);
                    class245 var14 = var12.field7215;
                    if (var14 == null) {
                        var12.field7215 = var13;
                    } else {
                        while (var14.field3027 != null) {
                            var14 = var14.field3027;
                        }
                        var14.field3027 = var13;
                    }
                    if (var2 && (class470.field6718[var7][var11] & 0xFF000000) != 0) {
                        var3 = class470.field6718[var7][var11];
                        var4 = class383.field5172[var7][var11];
                        var5 = class559.field7988[var7][var11];
                    }
                    if (!arg1 && var12.field7230 != null && var12.field7230.field8104 > var6) {
                        var6 = var12.field7230.field8104;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field8635; var8 <= arg0.field8634; var8++) {
                for (int var9 = arg0.field8627; var9 <= arg0.field8630; var9++) {
                    if ((class470.field6718[var8][var9] & 0xFF000000) == 0) {
                        class470.field6718[var8][var9] = var3;
                        class383.field5172[var8][var9] = var4;
                        class559.field7988[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class138.field1525[class282.field3532++] = arg0;
        } else {
            int var10 = class666.field9303 == class156.field1743 ? 1 : 0;
            if (!arg0.method180(-1)) {
                class476.field6867[var10][class701.field9822[var10]++] = arg0;
            } else if (arg0.method177(-104)) {
                class13.field115[var10][class635.field8946[var10]++] = arg0;
            } else {
                class469.field6711[var10][class321.field3949[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field5178 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 122)
    public static void method3539(int arg0) {
        if (arg0 == 3) {
            field8878 = null;
            field8881 = null;
            field8874 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIBIIIII)V", line = 135)
    public static final void method3540(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8873++;
        int var8 = class266.method1567(class93.field949, true, class360.field4834, arg7);
        int var9 = class266.method1567(class93.field949, true, class360.field4834, arg0);
        int var10 = class266.method1567(class412.field5526, true, class72.field740, arg6);
        int var11 = class266.method1567(class412.field5526, true, class72.field740, arg1);
        int var12 = class266.method1567(class93.field949, true, class360.field4834, arg4 + arg7);
        if (arg2 > -114) {
            method3538(null, true);
        }
        int var13 = class266.method1567(class93.field949, true, class360.field4834, arg0 - arg4);
        for (int var14 = var8; var14 < var12; var14++) {
            class315.method1809(class557.field7954[var14], arg5, -128, var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class315.method1809(class557.field7954[var15], arg5, -128, var10, var11);
        }
        int var16 = class266.method1567(class412.field5526, true, class72.field740, arg4 + arg6);
        int var17 = class266.method1567(class412.field5526, true, class72.field740, arg1 - arg4);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class557.field7954[var18];
            class315.method1809(var19, arg5, -128, var10, var16);
            class315.method1809(var19, arg3, -128, var16, var17);
            class315.method1809(var19, arg5, -128, var17, var11);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Ldba;Lpa;IIIIIIIIIIIII)V", line = 188)
    public class631(class240 arg0, class648 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8877 = arg10;
        this.field8872 = arg13;
        this.field8876 = arg9;
        this.field8870 = arg11;
        this.field8868 = arg12;
        this.field8871 = arg14;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Lib;", line = 205)
    public class14 method203(byte arg0) {
        if (arg0 != -92) {
            this.field8871 = 90;
        }
        field8875++;
        return class588.field8322;
    }
}
