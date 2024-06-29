import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class310 {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4395 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "F")
    public static float field4391;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLjava/lang/String;Lhia;Lda;BLha;)V")
    public static final void method1960(boolean arg0, String arg1, class66 arg2, class61 arg3, byte arg4, class60 arg5) {
        field4392++;
        if (arg4 != -124) {
            field4395 = -40;
        }
        boolean var6 = !class433.field6448 || class59.method415((byte) -80);
        if (!var6) {
            return;
        }
        if (class433.field6448 && var6) {
            class66 var12 = class46.field526;
            class61 var13 = arg5.method474(var12, class559.field7995, true);
            int var14 = var12.method583(250, null, 0, arg1);
            int var15 = var12.method590(arg4 + 173, null, arg1, 250, var12.field945);
            int var16 = class727.field10154.field1734;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (var19 < class649.field9149) {
                var19 = class649.field9149;
            }
            if (class564.field8025 > var18) {
                var18 = class564.field8025;
            }
            int var20 = class91.field1278.method3778(class291.field4165, var18, false) + class585.field8300;
            int var21 = class91.field1271.method4065((byte) -125, var19, class344.field4988) + class462.field6812;
            if (class419.field6265) {
                var20 += class210.method1422(true);
                var21 += class407.method2589((byte) -45);
            }
            arg5.method422(class566.field8045, false).method1513(var20 + class55.field768.field1734, class55.field768.field1739 + var21, var18 - class55.field768.field1734 * 2, var19 - class55.field768.field1739 * 2, 1, 0, 0);
            arg5.method422(class55.field768, true).method3142(var20, var21);
            class55.field768.method914();
            arg5.method422(class55.field768, true).method3142(var20 + var18 - var16, var21);
            class55.field768.method917();
            arg5.method422(class55.field768, true).method3142(var18 + var20 - var16, var21 - (-var19 + var16));
            class55.field768.method914();
            arg5.method422(class55.field768, true).method3142(var20, var19 + var21 - var16);
            class55.field768.method917();
            arg5.method422(class727.field10154, true).method3150(var20, class55.field768.field1739 + var21, var16, var19 - class55.field768.field1739 * 2);
            class727.field10154.method910();
            arg5.method422(class727.field10154, true).method3150(class55.field768.field1734 + var20, var21, var18 - class55.field768.field1734 * 2, var16);
            class727.field10154.method910();
            arg5.method422(class727.field10154, true).method3150(var18 + var20 - var16, class55.field768.field1739 + var21, var16, var19 - (class55.field768.field1739 * 2));
            class727.field10154.method910();
            arg5.method422(class727.field10154, true).method3150(class55.field768.field1734 + var20, -var16 + var21 + var19, var18 - (class55.field768.field1734 * 2), var16);
            class727.field10154.method910();
            var13.method551(0, null, -1, var21 + var17, class130.field1750 | 0xFF000000, 0, null, 1, arg1, 0, 1, var19 - (var17 * 2), var18 - var17 * 2, var17 + var20, -1, null);
            class235.method1563(100, var19, var20, var18, var21);
        } else {
            int var7 = arg2.method583(250, null, 0, arg1);
            int var8 = arg2.method592(250, (byte) -86, null, arg1) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg5.method516(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
            arg5.method525(var10 - var9, -var9 + var11, var7 + var9 + var9, var9 + var9 + var8, -1, 0);
            arg3.method551(0, null, -1, var11, -1, 0, null, 1, arg1, 0, 1, var8, var7, var10, -1, null);
            class235.method1563(arg4 ^ 0xFFFFFFE0, var8 + var9 + var9, -var9 + var10, var7 + var9 + var9, -var9 + var11);
        }
        if (!arg0) {
            return;
        }
        try {
            if (class419.field6265) {
                class509.method3018(-30201);
            } else {
                arg5.method420(0);
            }
        } catch (class566 var22) {
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)[Lhc;")
    public static final class141[] method1961(boolean arg0) {
        if (class367.field5284 == null) {
            class141[] var1 = class46.method343(class179.field2759, (byte) 117);
            class141[] var2 = new class141[var1.length];
            int var3 = 0;
            int var4 = class63.field916.field10160.method4217(17503);
            label74: for (int var5 = 0; var5 < var1.length; var5++) {
                class141 var9 = var1[var5];
                if ((var9.field1863 <= 0 || var9.field1863 >= 24) && var9.field1860 >= 800 && var9.field1861 >= 600 && (var4 != 2 || var9.field1860 <= 800 && var9.field1861 <= 600) && (var4 != 1 || var9.field1860 <= 1024 && var9.field1861 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class141 var11 = var2[var10];
                        if (var9.field1860 == var11.field1860 && var9.field1861 == var11.field1861) {
                            if (var9.field1863 > var11.field1863) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class367.field5284 = new class141[var3];
            class319.method2017(var2, 0, class367.field5284, 0, var3);
            int[] var6 = new int[class367.field5284.length];
            for (int var7 = 0; var7 < class367.field5284.length; var7++) {
                class141 var8 = class367.field5284[var7];
                var6[var7] = var8.field1861 * var8.field1860;
            }
            class369.method2269(var6, class367.field5284, 1);
        }
        field4394++;
        if (arg0) {
            method1960(true, null, null, null, (byte) 86, null);
        }
        return class367.field5284;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Z")
    public static final boolean method1962(int arg0, byte arg1) {
        if (arg1 < 45) {
            method1962(-106, (byte) -20);
        }
        field4390++;
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)Z")
    public static final boolean method1963(byte arg0, int arg1, int arg2) {
        field4393++;
        if (arg0 != 102) {
            method1960(false, null, null, null, (byte) 93, null);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILs;)V")
    public static final void method1964(int arg0, class280 arg1) {
        class582.field8287[arg0] = arg1;
    }
}
