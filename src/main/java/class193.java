import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class193 extends class408 {

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "Lmia;")
    public static class63 field2923 = new class63(55, 2);

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "[I")
    public static int[] field2931 = new int[2];

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "Loi;")
    public class73 field2930;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "Ljava/lang/String;")
    public String field2928;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "[I")
    public int[] field2920;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "[I")
    public int[] field2924;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "[Lhe;")
    public class372[] field2921;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field2918;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field2931 = null;
        field2923 = null;
        if (arg0 != 0) {
            field2925 = -8;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([Lsca;IZ)V")
    public static final void method1344(class46[] arg0, int arg1, boolean arg2) {
        field2917++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class46 var4 = arg0[var3];
            if (var4 != null && var4.field557 == arg1 && !client.method1889(var4)) {
                if (var4.field577 == 0) {
                    method1344(arg0, var4.field610, false);
                    if (var4.field621 != null) {
                        method1344(var4.field621, var4.field610, false);
                    }
                    class421 var5 = (class421) class291.field4168.method2287((long) var4.field610, (byte) -117);
                    if (var5 != null) {
                        class453.method2774(var5.field6282, 1024);
                    }
                }
                if (var4.field577 == 6 && var4.field544 != -1) {
                    class288 var6 = class742.field10404.method2663(0, var4.field544);
                    if (var6 != null) {
                        var4.field607 += class12.field171;
                        int var7 = var4.field619;
                        while (var6.field4087[var4.field619] < var4.field607) {
                            var4.field607 -= var6.field4087[var4.field619];
                            var4.field619++;
                            if (var4.field619 >= var6.field4081.length) {
                                var4.field619 -= var6.field4082;
                                if (var4.field619 < 0 || var6.field4081.length <= var4.field619) {
                                    var4.field619 = 0;
                                }
                            }
                            var4.field522 = var4.field619 + 1;
                            if (var6.field4081.length <= var4.field522) {
                                var4.field522 -= var6.field4082;
                                if (var4.field522 < 0 || var6.field4081.length <= var4.field522) {
                                    var4.field522 = -1;
                                }
                            }
                            class673.method3850(var4, (byte) -96);
                        }
                        if (var4.field619 != var7) {
                            class103.method790(-25839, var6, var4.field619);
                        }
                    }
                }
            }
        }
        if (arg2) {
            method1344(null, 95, true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILha;Z)V")
    public static final void method1345(int arg0, class60 arg1, boolean arg2) {
        field2929++;
        if (!class24.field247 || !class587.field8325) {
            class266.field3799 = 0;
            return;
        }
        if (class393.field5909) {
            class586.field8313 = class115.field1596.method2683(2);
        }
        if (arg2) {
            method1345(95, null, false);
        }
        class406.field6142 = 0;
        class619.field8704 = 0;
        class118.field1621 = 0;
        int[] var3 = arg1.method434();
        class548.field7822 = (int) ((float) var3[3] / 3.0F);
        class413.field6212 = (int) ((float) var3[2] / 3.0F);
        arg1.method479(class570.field8069);
        if ((int) ((float) class570.field8069[0] / 3.0F) != class270.field3864 || ((int) ((float) class570.field8069[1] / 3.0F)) != class394.field5922) {
            class394.field5922 = (int) ((float) class570.field8069[1] / 3.0F);
            class270.field3864 = (int) ((float) class570.field8069[0] / 3.0F);
            class622.field8733 = class270.field3864 >> 1;
            class255.field3667 = new int[class394.field5922 * class270.field3864];
            class516.field7342 = class394.field5922 >> 1;
        }
        class122.field1656 = arg1.method504();
        class266.field3799 = 0;
        for (int var4 = 0; var4 < class44.field480; var4++) {
            class523.method3071(arg0, 10, arg1, class31.field316[var4]);
        }
        for (int var5 = 0; var5 < class411.field6179; var5++) {
            class523.method3071(arg0, 18, arg1, class240.field3494[var5]);
        }
        for (int var6 = 0; var6 < class233.field3398; var6++) {
            class523.method3071(arg0, 113, arg1, class315.field4461[var6]);
        }
        class357.field5193 = 0;
        if (class266.field3799 > 0) {
            int var7 = class255.field3667.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
                class255.field3667[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class255.field3667[var9++] = Integer.MAX_VALUE;
            }
            class505.field7182 = 1;
            for (int var10 = 0; var10 < class266.field3799; var10++) {
                class417 var11 = class85.field1210[var10];
                class657.method3795(var11.field6247[1], (byte) 82, var11.field6240[1], var11.field6247[0], var11.field6255[0], var11.field6240[0], var11.field6247[3], var11.field6240[3], var11.field6255[1], var11.field6255[3]);
                class657.method3795(var11.field6247[2], (byte) -60, var11.field6240[2], var11.field6247[1], var11.field6255[1], var11.field6240[1], var11.field6247[3], var11.field6240[3], var11.field6255[2], var11.field6255[3]);
            }
            class505.field7182 = 2;
        }
        if (class393.field5909) {
            class461.field6803 = class115.field1596.method2683(2) - class586.field8313;
        }
    }
}
