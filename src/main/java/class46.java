import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class46 {

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "[J")
    private static long[] field602 = new long[1000];

    @OriginalMember(owner = "client!rja", name = "k", descriptor = "[Lhq;")
    private static class58[] field610 = new class58[50];

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "[[I")
    private static int[][] field604 = new int[5][5000];

    @OriginalMember(owner = "client!rja", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field620 = new String[1000];

    @OriginalMember(owner = "client!rja", name = "n", descriptor = "[I")
    private static int[] field613 = new int[3];

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
    private static int field600 = 0;

    @OriginalMember(owner = "client!rja", name = "w", descriptor = "[I")
    private static int[] field622 = new int[5];

    @OriginalMember(owner = "client!rja", name = "x", descriptor = "I")
    private static int field623 = 0;

    @OriginalMember(owner = "client!rja", name = "A", descriptor = "I")
    private static int field626 = 0;

    @OriginalMember(owner = "client!rja", name = "s", descriptor = "[I")
    private static int[] field618 = new int[1000];

    @OriginalMember(owner = "client!rja", name = "E", descriptor = "I")
    private static int field630 = 0;

    @OriginalMember(owner = "client!rja", name = "v", descriptor = "Laq;")
    public static class494 field621 = new class494(4);

    @OriginalMember(owner = "client!rja", name = "F", descriptor = "I")
    private static int field631 = 0;

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!rja", name = "l", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!rja", name = "q", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!rja", name = "t", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!rja", name = "y", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!rja", name = "B", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!rja", name = "C", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!rja", name = "D", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!rja", name = "o", descriptor = "Lhi;")
    private static class465 field614;

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "Lfaa;")
    private static class473 field625;

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "Llm;")
    private static class50 field603;

    @OriginalMember(owner = "client!rja", name = "i", descriptor = "Luf;")
    private static class519 field608;

    @OriginalMember(owner = "client!rja", name = "p", descriptor = "Luf;")
    private static class519 field615;

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "[I")
    private static int[] field606;

    @OriginalMember(owner = "client!rja", name = "r", descriptor = "[J")
    private static long[] field617;

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "[Ljava/lang/String;")
    private static String[] field612;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)J")
    private static final long method343(int arg0) {
        Long var1 = field603.method400(4, class113.field1647.field482 << 16 | arg0);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(I)I")
    private static final int method344(int arg0) {
        class580 var1 = class662.field9323.method1710(64, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field603.method397(class113.field1647.field482 << 16 | arg0, 1);
        if (var2 == null) {
            return var1.field8355 == 'i' || var1.field8355 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method345(String arg0, int arg1) {
        if (class778.field10675 == 0 && !(!class273.field3833 || class115.field1975) || class419.field5810) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class563.field7845.method3281(0, -1))) {
            var3 = 0;
            arg0 = arg0.substring(class563.field7845.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7846.method3281(0, -1))) {
            var3 = 1;
            arg0 = arg0.substring(class563.field7846.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7847.method3281(0, -1))) {
            var3 = 2;
            arg0 = arg0.substring(class563.field7847.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7848.method3281(0, -1))) {
            var3 = 3;
            arg0 = arg0.substring(class563.field7848.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7849.method3281(0, -1))) {
            var3 = 4;
            arg0 = arg0.substring(class563.field7849.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7850.method3281(0, -1))) {
            var3 = 5;
            arg0 = arg0.substring(class563.field7850.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7851.method3281(0, -1))) {
            var3 = 6;
            arg0 = arg0.substring(class563.field7851.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7852.method3281(0, -1))) {
            var3 = 7;
            arg0 = arg0.substring(class563.field7852.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7853.method3281(0, -1))) {
            var3 = 8;
            arg0 = arg0.substring(class563.field7853.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7854.method3281(0, -1))) {
            var3 = 9;
            arg0 = arg0.substring(class563.field7854.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7855.method3281(0, -1))) {
            var3 = 10;
            arg0 = arg0.substring(class563.field7855.method3281(0, -1).length());
        } else if (var2.startsWith(class563.field7856.method3281(0, -1))) {
            var3 = 11;
            arg0 = arg0.substring(class563.field7856.method3281(0, -1).length());
        } else if (class423.field5892 != 0) {
            if (var2.startsWith(class563.field7845.method3281(class423.field5892, -1))) {
                var3 = 0;
                arg0 = arg0.substring(class563.field7845.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7846.method3281(class423.field5892, -1))) {
                var3 = 1;
                arg0 = arg0.substring(class563.field7846.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7847.method3281(class423.field5892, -1))) {
                var3 = 2;
                arg0 = arg0.substring(class563.field7847.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7848.method3281(class423.field5892, -1))) {
                var3 = 3;
                arg0 = arg0.substring(class563.field7848.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7849.method3281(class423.field5892, -1))) {
                var3 = 4;
                arg0 = arg0.substring(class563.field7849.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7850.method3281(class423.field5892, -1))) {
                var3 = 5;
                arg0 = arg0.substring(class563.field7850.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7851.method3281(class423.field5892, -1))) {
                var3 = 6;
                arg0 = arg0.substring(class563.field7851.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7852.method3281(class423.field5892, -1))) {
                var3 = 7;
                arg0 = arg0.substring(class563.field7852.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7853.method3281(class423.field5892, -1))) {
                var3 = 8;
                arg0 = arg0.substring(class563.field7853.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7854.method3281(class423.field5892, -1))) {
                var3 = 9;
                arg0 = arg0.substring(class563.field7854.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7855.method3281(class423.field5892, -1))) {
                var3 = 10;
                arg0 = arg0.substring(class563.field7855.method3281(class423.field5892, -1).length());
            } else if (var2.startsWith(class563.field7856.method3281(class423.field5892, -1))) {
                var3 = 11;
                arg0 = arg0.substring(class563.field7856.method3281(class423.field5892, -1).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class563.field7857.method3281(0, -1))) {
            var5 = 1;
            arg0 = arg0.substring(class563.field7857.method3281(0, -1).length());
        } else if (var4.startsWith(class563.field7858.method3281(0, -1))) {
            var5 = 2;
            arg0 = arg0.substring(class563.field7858.method3281(0, -1).length());
        } else if (var4.startsWith(class563.field7859.method3281(0, -1))) {
            var5 = 3;
            arg0 = arg0.substring(class563.field7859.method3281(0, -1).length());
        } else if (var4.startsWith(class563.field7860.method3281(0, -1))) {
            var5 = 4;
            arg0 = arg0.substring(class563.field7860.method3281(0, -1).length());
        } else if (var4.startsWith(class563.field7861.method3281(0, -1))) {
            var5 = 5;
            arg0 = arg0.substring(class563.field7861.method3281(0, -1).length());
        } else if (class423.field5892 != 0) {
            if (var4.startsWith(class563.field7857.method3281(class423.field5892, -1))) {
                var5 = 1;
                arg0 = arg0.substring(class563.field7857.method3281(class423.field5892, -1).length());
            } else if (var4.startsWith(class563.field7858.method3281(class423.field5892, -1))) {
                var5 = 2;
                arg0 = arg0.substring(class563.field7858.method3281(class423.field5892, -1).length());
            } else if (var4.startsWith(class563.field7859.method3281(class423.field5892, -1))) {
                var5 = 3;
                arg0 = arg0.substring(class563.field7859.method3281(class423.field5892, -1).length());
            } else if (var4.startsWith(class563.field7860.method3281(class423.field5892, -1))) {
                var5 = 4;
                arg0 = arg0.substring(class563.field7860.method3281(class423.field5892, -1).length());
            } else if (var4.startsWith(class563.field7861.method3281(class423.field5892, -1))) {
                var5 = 5;
                arg0 = arg0.substring(class563.field7861.method3281(class423.field5892, -1).length());
            }
        }
        field627++;
        class302 var6 = class582.method3419(class684.field9684, (byte) 125, class626.field8901);
        var6.field4341.method2524(false, 0);
        int var7 = var6.field4341.field5983;
        var6.field4341.method2524(false, var3);
        var6.field4341.method2524(false, var5);
        class339.method2071(arg0, var6.field4341, true);
        var6.field4341.method2571(-1350378040, var6.field4341.field5983 - var7);
        class501.method2928(0, var6);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IZ)V")
    public static final void method346(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(C)I")
    private static final int method347(char arg0) {
        return class276.method1751((byte) 52, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "()V")
    public static final void method348() {
    }

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "(I)V")
    private static final void method349(int arg0) {
        class519 var1 = class604.method3506(arg0, 255);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class519[] var3 = class556.field7720[var2];
        if (var3 == null) {
            class519[] var4 = class610.field8661[var2];
            int var5 = var4.length;
            var3 = class556.field7720[var2] = new class519[var5];
            class171.method1265(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class171.method1265(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljn;I)V")
    private static final void method350(class136 arg0, int arg1) {
        field626 = 0;
        field600 = 0;
        int var2 = -1;
        int[] var3 = arg0.field2263;
        int[] var4 = arg0.field2267;
        byte var5 = -1;
        field623 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method360(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method358(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field618[field626++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field618[field626++] = class578.field8328.field10770[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class578.field8328.method4312(var8, field618[--field626], 268426362);
                } else if (var45 == 3) {
                    field620[field600++] = arg0.field2270[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field626 -= 2;
                    if (field618[field626 + 1] != field618[field626]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field626 -= 2;
                    if (field618[field626 + 1] == field618[field626]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field626 -= 2;
                    if (field618[field626] < field618[field626 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field626 -= 2;
                    if (field618[field626] > field618[field626 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field623 == 0) {
                        return;
                    }
                    class58 var9 = field610[--field623];
                    arg0 = var9.field893;
                    var3 = arg0.field2263;
                    var4 = arg0.field2267;
                    var2 = var9.field892;
                    field606 = var9.field888;
                    field612 = var9.field895;
                    field617 = var9.field891;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field618[field626++] = class578.field8328.method2863((byte) -100, var10);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class578.field8328.method4309(field618[--field626], true, var11);
                } else if (var45 == 31) {
                    field626 -= 2;
                    if (field618[field626] <= field618[field626 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field626 -= 2;
                    if (field618[field626] >= field618[field626 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field618[field626++] = field606[var4[var2]];
                } else if (var45 == 34) {
                    field606[var4[var2]] = field618[--field626];
                } else if (var45 == 35) {
                    field620[field600++] = field612[var4[var2]];
                } else if (var45 == 36) {
                    field612[var4[var2]] = field620[--field600];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field600 -= var12;
                    String var13 = class711.method3962(var12, (byte) -87, field600, field620);
                    field620[field600++] = var13;
                } else if (var45 == 38) {
                    field626--;
                } else if (var45 == 39) {
                    field600--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class136 var15 = class28.method230(7, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field2271];
                    String[] var17 = new String[var15.field2257];
                    long[] var18 = new long[var15.field2266];
                    for (int var19 = 0; var19 < var15.field2262; var19++) {
                        var16[var19] = field618[field626 + var19 - var15.field2262];
                    }
                    for (int var20 = 0; var20 < var15.field2261; var20++) {
                        var17[var20] = field620[field600 + var20 - var15.field2261];
                    }
                    for (int var21 = 0; var21 < var15.field2272; var21++) {
                        var18[var21] = field602[field630 + var21 - var15.field2272];
                    }
                    field626 -= var15.field2262;
                    field600 -= var15.field2261;
                    field630 -= var15.field2272;
                    class58 var22 = new class58();
                    var22.field893 = arg0;
                    var22.field892 = var2;
                    var22.field888 = field606;
                    var22.field895 = field612;
                    var22.field891 = field617;
                    if (field623 >= field610.length) {
                        throw new RuntimeException();
                    }
                    field610[field623++] = var22;
                    arg0 = var15;
                    var3 = var15.field2263;
                    var4 = var15.field2267;
                    var2 = -1;
                    field606 = var16;
                    field612 = var17;
                    field617 = var18;
                } else if (var45 == 42) {
                    field618[field626++] = class362.field5135[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class362.field5135[var23] = field618[--field626];
                    class372.method2218(var23, 1);
                    class193.field2899 |= class769.field10616[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field618[--field626];
                    if (var26 >= 0 && var26 <= 5000) {
                        field622[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field604[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field618[--field626];
                    if (var30 < 0 || var30 >= field622[var29]) {
                        throw new RuntimeException();
                    }
                    field618[field626++] = field604[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field626 -= 2;
                    int var32 = field618[field626];
                    if (var32 < 0 || var32 >= field622[var31]) {
                        throw new RuntimeException();
                    }
                    field604[var31][var32] = field618[field626 + 1];
                } else if (var45 == 47) {
                    String var33 = class17.field187[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field620[field600++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class17.field187[var34] = field620[--field600];
                    class641.method3637((byte) -25, var34);
                } else if (var45 == 51) {
                    class769 var35 = arg0.field2258[var4[var2]];
                    class725 var36 = (class725) var35.method4253((long) field618[--field626], -1);
                    if (var36 != null) {
                        var2 += var36.field10098;
                    }
                } else if (var45 == 54) {
                    field602[field630++] = arg0.field2265[var2];
                } else if (var45 == 55) {
                    field630--;
                } else if (var45 == 66) {
                    field602[field630++] = field617[var4[var2]];
                } else if (var45 == 67) {
                    field617[var4[var2]] = field602[--field630];
                } else if (var45 == 68) {
                    field630 -= 2;
                    if (field602[field630 + 1] != field602[field630]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field630 -= 2;
                    if (field602[field630 + 1] == field602[field630]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field630 -= 2;
                    if (field602[field630] < field602[field630 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field630 -= 2;
                    if (field602[field630] > field602[field630 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field630 -= 2;
                    if (field602[field630] <= field602[field630 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field630 -= 2;
                    if (field602[field630] >= field602[field630 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field618[--field626] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field618[--field626] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field618[field626++] = method344(var4[var2]);
                } else if (var45 == 113) {
                    field618[field626++] = method351(var4[var2]);
                } else if (var45 == 114) {
                    field602[field630++] = method343(var4[var2]);
                } else if (var45 == 115) {
                    field620[field600++] = method352(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field2259 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field10592).append(" ");
                for (int var43 = field623 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field610[var43].field893.field10592).append(" ");
                }
                var42.append("op: ").append(var5);
                class349.method2122(var44, var42.toString(), 1);
            } else {
                class446.method2645("Clientscript error in: " + arg0.field2259, 0, 4);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field2259).append("\n");
                for (int var40 = field623 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field610[var40].field893.field2259).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class349.method2122(var44, var39.toString(), 1);
                class30.method251(false, var39.toString());
            }
        }
    }

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "(I)I")
    private static final int method351(int arg0) {
        class580 var1 = class662.field9323.method1710(64, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        System.out.println("activeClanSettings:" + field603);
        Integer var2 = field603.method407(var1.field8353, 1, var1.field8352, class113.field1647.field482 << 16 | var1.field8350);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "(I)Ljava/lang/String;")
    private static final String method352(int arg0) {
        String var1 = field603.method389((byte) 109, class113.field1647.field482 << 16 | arg0);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lrd;I)V")
    private static final void method353(class511 arg0, int arg1) {
        Object[] var2 = arg0.field7021;
        int var3 = (Integer) var2[0];
        class136 var4 = class28.method230(7, var3);
        if (var4 == null) {
            return;
        }
        field606 = new int[var4.field2271];
        int var5 = 0;
        field612 = new String[var4.field2257];
        int var6 = 0;
        field617 = new long[var4.field2266];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field7029;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field7019;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field7023 == null ? -1 : arg0.field7023.field7247;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field7025;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field7023 == null ? -1 : arg0.field7023.field7193;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field7026 == null ? -1 : arg0.field7026.field7247;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field7026 == null ? -1 : arg0.field7026.field7193;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field7027;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field7030;
                }
                field606[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field7024;
                }
                field612[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field617[var7++] = var11;
            }
        }
        field631 = arg0.field7022;
        method350(var4, arg1);
    }

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "(I)V")
    public static final void method354(int arg0) {
        if (arg0 == -1 || !class484.method2853(arg0, (byte) -102)) {
            return;
        }
        class519[] var1 = class610.field8661[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class519 var3 = var1[var2];
            if (var3.field7242 != null) {
                class511 var4 = new class511();
                var4.field7023 = var3;
                var4.field7021 = var3.field7242;
                method353(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "(I)V")
    private static final void method355(int arg0) {
        class519 var1 = class604.method3506(arg0, 255);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class519[] var3 = class556.field7720[var2];
        if (var3 == null) {
            class519[] var4 = class610.field8661[var2];
            int var5 = var4.length;
            var3 = class556.field7720[var2] = new class519[var5];
            class171.method1265(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class171.method1265(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lss;II)V")
    public static final void method356(class307 arg0, int arg1, int arg2) {
        class136 var3 = class219.method1508(arg0, -115, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field606 = new int[var3.field2271];
        field612 = new String[var3.field2257];
        if (class460.field6282 == var3.field2264 || class273.field3837 == var3.field2264 || class285.field4202 == var3.field2264) {
            int var4 = 0;
            int var5 = 0;
            if (class260.field3685 != null) {
                var4 = class260.field3685.field7191;
                var5 = class260.field3685.field7151;
            }
            field606[0] = class754.field10496.method3065(-28062) - var4;
            field606[1] = class754.field10496.method3066(72) - var5;
        }
        method350(var3, 200000);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lrd;)V")
    public static final void method357(class511 arg0) {
        method353(arg0, 200000);
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(IZ)V")
    private static final void method358(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field618[field626++] = class712.field9943;
                return;
            }
            if (arg0 == 5001) {
                field626 -= 3;
                class712.field9943 = field618[field626];
                class551.field7649 = class372.method2217(0, field618[field626 + 1]);
                if (class551.field7649 == null) {
                    class551.field7649 = class245.field3508;
                }
                class791.field10846 = field618[field626 + 2];
                field629++;
                class302 var2 = class582.method3419(class790.field10802, (byte) 126, class626.field8901);
                var2.field4341.method2524(false, class712.field9943);
                var2.field4341.method2524(false, class551.field7649.field9180);
                var2.field4341.method2524(false, class791.field10846);
                class501.method2928(0, var2);
                return;
            }
            if (arg0 == 5002) {
                field600 -= 2;
                String var3 = field620[field600];
                String var4 = field620[field600 + 1];
                field626 -= 2;
                int var5 = field618[field626];
                int var6 = field618[field626 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field601++;
                class302 var7 = class582.method3419(class461.field6288, (byte) 127, class626.field8901);
                var7.field4341.method2524(false, class389.method2339(var3, true) + class389.method2339(var4, true) + 2);
                var7.field4341.method2566(-2, var3);
                var7.field4341.method2524(false, var5 - 1);
                var7.field4341.method2524(false, var6);
                var7.field4341.method2566(-2, var4);
                class501.method2928(0, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field618[--field626];
                class183 var9 = class477.method2828((byte) 100, var8);
                String var10 = "";
                if (var9 != null && var9.field2783 != null) {
                    var10 = var9.field2783;
                }
                field620[field600++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field618[--field626];
                class183 var12 = class477.method2828((byte) -45, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2779;
                }
                field618[field626++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class551.field7649 == null) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = class551.field7649.field9180;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field618[--field626];
                class302 var15 = class582.method3419(class138.field2282, (byte) 127, class626.field8901);
                var15.field4341.method2524(false, var14);
                class501.method2928(0, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field620[--field600];
                method345(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field600 -= 2;
                String var17 = field620[field600];
                String var18 = field620[field600 + 1];
                if (class778.field10675 != 0 || (!class273.field3833 || class115.field1975) && !class419.field5810) {
                    field616++;
                    class302 var19 = class582.method3419(class451.field6194, (byte) 127, class626.field8901);
                    var19.field4341.method2524(false, 0);
                    int var20 = var19.field4341.field5983;
                    var19.field4341.method2566(-2, var17);
                    class339.method2071(var18, var19.field4341, true);
                    var19.field4341.method2571(-1350378040, var19.field4341.field5983 - var20);
                    class501.method2928(0, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field618[--field626];
                class183 var22 = class477.method2828((byte) -18, var21);
                String var23 = "";
                if (var22 != null && var22.field2790 != null) {
                    var23 = var22.field2790;
                }
                field620[field600++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field618[--field626];
                class183 var25 = class477.method2828((byte) -77, var24);
                String var26 = "";
                if (var25 != null && var25.field2774 != null) {
                    var26 = var25.field2774;
                }
                field620[field600++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field618[--field626];
                class183 var28 = class477.method2828((byte) 96, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2776;
                }
                field618[field626++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class719.field10041 == null || class719.field10041.field224 == null) {
                    var30 = "";
                } else {
                    var30 = class719.field10041.method190(true, -116);
                }
                field620[field600++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field618[field626++] = class791.field10846;
                return;
            }
            if (arg0 == 5017) {
                field618[field626++] = class223.method1529(-101);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field618[--field626];
                class183 var32 = class477.method2828((byte) 126, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2785;
                }
                field618[field626++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field618[--field626];
                class183 var35 = class477.method2828((byte) 2, var34);
                String var36 = "";
                if (var35 != null && var35.field2777 != null) {
                    var36 = var35.field2777;
                }
                field620[field600++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class719.field10041 == null || class719.field10041.field224 == null) {
                    var37 = "";
                } else {
                    var37 = class719.field10041.method208(16383, false);
                }
                field620[field600++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field618[--field626];
                class183 var39 = class477.method2828((byte) 121, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2784;
                }
                field618[field626++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field618[--field626];
                class183 var42 = class477.method2828((byte) -109, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2778;
                }
                field618[field626++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field618[--field626];
                class183 var45 = class477.method2828((byte) -124, var44);
                String var46 = "";
                if (var45 != null && var45.field2789 != null) {
                    var46 = var45.field2789;
                }
                field620[field600++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field618[--field626];
                field620[field600++] = class709.field9922.method4069(63, var47).field10574;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field618[--field626];
                class762 var49 = class709.field9922.method4069(112, var48);
                if (var49.field10572 == null) {
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = var49.field10572.length;
                return;
            }
            if (arg0 == 5052) {
                field626 -= 2;
                int var50 = field618[field626];
                int var51 = field618[field626 + 1];
                class762 var52 = class709.field9922.method4069(109, var50);
                int var53 = var52.field10572[var51];
                field618[field626++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field618[--field626];
                class762 var55 = class709.field9922.method4069(109, var54);
                if (var55.field10569 == null) {
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = var55.field10569.length;
                return;
            }
            if (arg0 == 5054) {
                field626 -= 2;
                int var56 = field618[field626];
                int var57 = field618[field626 + 1];
                field618[field626++] = class709.field9922.method4069(58, var56).field10569[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field618[--field626];
                field620[field600++] = class502.field6884.method2392(var58, 32767).method1036(-1);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field618[--field626];
                class118 var60 = class502.field6884.method2392(var59, 32767);
                if (var60.field2013 == null) {
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = var60.field2013.length;
                return;
            }
            if (arg0 == 5057) {
                field626 -= 2;
                int var61 = field618[field626];
                int var62 = field618[field626 + 1];
                field618[field626++] = class502.field6884.method2392(var61, 32767).field2013[var62];
                return;
            }
            if (arg0 == 5058) {
                field625 = new class473();
                field625.field6436 = field618[--field626];
                field625.field6431 = class502.field6884.method2392(field625.field6436, 32767);
                field625.field6437 = new int[field625.field6431.method1035(false)];
                return;
            }
            if (arg0 == 5059) {
                field607++;
                class302 var63 = class582.method3419(class661.field9318, (byte) 126, class626.field8901);
                var63.field4341.method2524(false, 0);
                int var64 = var63.field4341.field5983;
                var63.field4341.method2524(false, 0);
                var63.field4341.method2546(true, field625.field6436);
                field625.field6431.method1037(field625.field6437, (byte) 110, var63.field4341);
                var63.field4341.method2571(-1350378040, var63.field4341.field5983 - var64);
                class501.method2928(0, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field620[--field600];
                field624++;
                class302 var66 = class582.method3419(class675.field9492, (byte) 126, class626.field8901);
                var66.field4341.method2524(false, 0);
                int var67 = var66.field4341.field5983;
                var66.field4341.method2566(-2, var65);
                var66.field4341.method2546(true, field625.field6436);
                field625.field6431.method1037(field625.field6437, (byte) 110, var66.field4341);
                var66.field4341.method2571(-1350378040, var66.field4341.field5983 - var67);
                class501.method2928(0, var66);
                return;
            }
            if (arg0 == 5061) {
                field607++;
                class302 var68 = class582.method3419(class661.field9318, (byte) 125, class626.field8901);
                var68.field4341.method2524(false, 0);
                int var69 = var68.field4341.field5983;
                var68.field4341.method2524(false, 1);
                var68.field4341.method2546(true, field625.field6436);
                field625.field6431.method1037(field625.field6437, (byte) 110, var68.field4341);
                var68.field4341.method2571(-1350378040, var68.field4341.field5983 - var69);
                class501.method2928(0, var68);
                return;
            }
            if (arg0 == 5062) {
                field626 -= 2;
                int var70 = field618[field626];
                int var71 = field618[field626 + 1];
                field618[field626++] = class709.field9922.method4069(90, var70).field10568[var71];
                return;
            }
            if (arg0 == 5063) {
                field626 -= 2;
                int var72 = field618[field626];
                int var73 = field618[field626 + 1];
                field618[field626++] = class709.field9922.method4069(64, var72).field10567[var73];
                return;
            }
            if (arg0 == 5064) {
                field626 -= 2;
                int var74 = field618[field626];
                int var75 = field618[field626 + 1];
                if (var75 == -1) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = class709.field9922.method4069(116, var74).method4216((byte) -120, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field626 -= 2;
                int var76 = field618[field626];
                int var77 = field618[field626 + 1];
                if (var77 == -1) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = class709.field9922.method4069(52, var76).method4213((char) var77, 0);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field618[--field626];
                field618[field626++] = class502.field6884.method2392(var78, 32767).method1035(false);
                return;
            }
            if (arg0 == 5067) {
                field626 -= 2;
                int var79 = field618[field626];
                int var80 = field618[field626 + 1];
                int var81 = class502.field6884.method2392(var79, 32767).method1038(var80, -25256).field2440;
                field618[field626++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field626 -= 2;
                int var82 = field618[field626];
                int var83 = field618[field626 + 1];
                field625.field6437[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field626 -= 2;
                int var84 = field618[field626];
                int var85 = field618[field626 + 1];
                field625.field6437[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field626 -= 3;
                int var86 = field618[field626];
                int var87 = field618[field626 + 1];
                int var88 = field618[field626 + 2];
                class118 var89 = class502.field6884.method2392(var86, 32767);
                if (var89.method1038(var87, -25256).field2440 != 0) {
                    throw new RuntimeException("bad command");
                }
                field618[field626++] = var89.method1040(var87, var88, -106);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field620[--field600];
                boolean var91 = field618[--field626] == 1;
                class116.method1029(var91, var90, (byte) 93);
                field618[field626++] = class217.field3162;
                return;
            }
            if (arg0 == 5072) {
                if (class781.field10703 != null && class144.field2334 < class217.field3162) {
                    field618[field626++] = class781.field10703[class144.field2334++] & 0xFFFF;
                    return;
                }
                field618[field626++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class144.field2334 = 0;
                return;
            }
            if (arg0 == 5074) {
                class302 var92 = class582.method3419(class661.field9318, (byte) 126, class626.field8901);
                var92.field4341.method2524(false, 0);
                int var93 = var92.field4341.field5983;
                var92.field4341.method2524(false, 2);
                var92.field4341.method2546(true, field625.field6436);
                field625.field6431.method1037(field625.field6437, (byte) 110, var92.field4341);
                var92.field4341.method2571(-1350378040, var92.field4341.field5983 - var93);
                class501.method2928(0, var92);
                return;
            }
            if (arg0 == 5075) {
                class302 var94 = class582.method3419(class661.field9318, (byte) 126, class626.field8901);
                var94.field4341.method2524(false, 0);
                int var95 = var94.field4341.field5983;
                var94.field4341.method2524(false, 3);
                var94.field4341.method2546(true, field625.field6436);
                field625.field6431.method1037(field625.field6437, (byte) 110, var94.field4341);
                var94.field4341.method2571(-1350378040, var94.field4341.field5983 - var95);
                class501.method2928(0, var94);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class681.field9656.method681((byte) 116, 86)) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class681.field9656.method681((byte) 111, 82)) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class681.field9656.method681((byte) 114, 81)) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class128.method1088(field618[--field626], 9005);
                return;
            }
            if (arg0 == 5201) {
                field618[field626++] = class195.method1385(false);
                return;
            }
            if (arg0 == 5205) {
                class138.method1131(-1, false, -1, (byte) -78, field618[--field626]);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field618[--field626];
                class250 var97 = class751.method4144(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = var97.field3596;
                return;
            }
            if (arg0 == 5207) {
                class250 var98 = class751.method4141(field618[--field626]);
                if (var98 != null && var98.field3593 != null) {
                    field620[field600++] = var98.field3593;
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 5208) {
                field618[field626++] = class433.field6048;
                field618[field626++] = class326.field4634;
                return;
            }
            if (arg0 == 5209) {
                field618[field626++] = class761.field10553 + class751.field10445;
                field618[field626++] = class751.field10446 + class488.field6705;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field618[--field626];
                class250 var100 = class751.method4141(var99);
                if (var100 == null) {
                    field618[field626++] = 0;
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = var100.field3597 >> 14 & 0x3FFF;
                field618[field626++] = var100.field3597 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field618[--field626];
                class250 var102 = class751.method4141(var101);
                if (var102 == null) {
                    field618[field626++] = 0;
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = var102.field3595 - var102.field3599;
                field618[field626++] = var102.field3590 - var102.field3586;
                return;
            }
            if (arg0 == 5212) {
                class770 var103 = class47.method366((byte) 67);
                if (var103 == null) {
                    field618[field626++] = -1;
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = var103.field10634;
                int var104 = var103.field10636 << 28 | class751.field10445 + var103.field10629 << 14 | class751.field10446 + var103.field10626;
                field618[field626++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class770 var105 = class412.method2427(106);
                if (var105 == null) {
                    field618[field626++] = -1;
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = var105.field10634;
                int var106 = var105.field10636 << 28 | class751.field10445 + var105.field10629 << 14 | class751.field10446 + var105.field10626;
                field618[field626++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field618[--field626];
                class250 var108 = class466.method2723(50);
                if (var108 != null) {
                    boolean var109 = var108.method1658((byte) -81, var107 & 0x3FFF, var107 >> 28 & 0x3, field613, var107 >> 14 & 0x3FFF);
                    if (var109) {
                        class421.method2483(92, field613[2], field613[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field626 -= 2;
                int var110 = field618[field626];
                int var111 = field618[field626 + 1];
                class30 var112 = class751.method4146(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class250 var114 = (class250) var112.method249(18371); var114 != null; var114 = (class250) var112.method254((byte) -64)) {
                    if (var114.field3596 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field618[--field626];
                class250 var116 = class751.method4141(var115);
                if (var116 == null) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = var116.field3602;
                return;
            }
            if (arg0 == 5220) {
                field618[field626++] = class466.field6347 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field618[--field626];
                class421.method2483(101, var117 & 0x3FFF, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class250 var118 = class466.method2723(50);
                if (var118 != null) {
                    boolean var119 = var118.method1657((byte) -90, field613, class751.field10446 + class488.field6705, class761.field10553 + class751.field10445);
                    if (var119) {
                        field618[field626++] = field613[1];
                        field618[field626++] = field613[2];
                        return;
                    }
                    field618[field626++] = -1;
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = -1;
                field618[field626++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field626 -= 2;
                int var120 = field618[field626];
                int var121 = field618[field626 + 1];
                class138.method1131(var121 & 0x3FFF, false, var121 >> 14 & 0x3FFF, (byte) -90, var120);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field618[--field626];
                class250 var123 = class466.method2723(50);
                if (var123 != null) {
                    boolean var124 = var123.method1658((byte) -55, var122 & 0x3FFF, var122 >> 28 & 0x3, field613, var122 >> 14 & 0x3FFF);
                    if (var124) {
                        field618[field626++] = field613[1];
                        field618[field626++] = field613[2];
                        return;
                    }
                    field618[field626++] = -1;
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = -1;
                field618[field626++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field618[--field626];
                class250 var126 = class466.method2723(50);
                if (var126 != null) {
                    boolean var127 = var126.method1657((byte) -90, field613, var125 & 0x3FFF, var125 >> 14 & 0x3FFF);
                    if (var127) {
                        field618[field626++] = field613[1];
                        field618[field626++] = field613[2];
                        return;
                    }
                    field618[field626++] = -1;
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = -1;
                field618[field626++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class498.method2911((byte) 85, field618[--field626]);
                return;
            }
            if (arg0 == 5227) {
                field626 -= 2;
                int var128 = field618[field626];
                int var129 = field618[field626 + 1];
                class138.method1131(var129 & 0x3FFF, true, var129 >> 14 & 0x3FFF, (byte) -127, var128);
                return;
            }
            if (arg0 == 5228) {
                class495.field6801 = field618[--field626] == 1;
                return;
            }
            if (arg0 == 5229) {
                field618[field626++] = class495.field6801 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field618[--field626];
                class789.method4315((byte) -50, var130);
                return;
            }
            if (arg0 == 5231) {
                field626 -= 2;
                int var131 = field618[field626];
                boolean var132 = field618[field626 + 1] == 1;
                if (class61.field922 != null) {
                    class766 var133 = class61.field922.method4253((long) var131, -1);
                    if (var133 != null && !var132) {
                        var133.method4237(-1);
                        return;
                    }
                    if (var133 == null && var132) {
                        class766 var134 = new class766();
                        class61.field922.method4252(false, var134, (long) var131);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field618[--field626];
                if (class61.field922 != null) {
                    class766 var136 = class61.field922.method4253((long) var135, -1);
                    field618[field626++] = var136 == null ? 0 : 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field626 -= 2;
                int var137 = field618[field626];
                boolean var138 = field618[field626 + 1] == 1;
                if (class432.field6035 != null) {
                    class766 var139 = class432.field6035.method4253((long) var137, -1);
                    if (var139 != null && !var138) {
                        var139.method4237(-1);
                        return;
                    }
                    if (var139 == null && var138) {
                        class766 var140 = new class766();
                        class432.field6035.method4252(false, var140, (long) var137);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field618[--field626];
                if (class432.field6035 != null) {
                    class766 var142 = class432.field6035.method4253((long) var141, -1);
                    field618[field626++] = var142 == null ? 0 : 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field618[field626++] = class751.field10419 == null ? -1 : class751.field10419.field3596;
                return;
            }
            if (arg0 == 5236) {
                field626 -= 2;
                int var143 = field618[field626];
                int var144 = field618[field626 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class269.method1719((byte) -115, var146, var143, var145);
                if (var147 < 0) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class108.method869(true);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field626 -= 2;
                int var148 = field618[field626];
                int var149 = field618[field626 + 1];
                class548.method3169(var148, -8361, 3, var149, false);
                field618[field626++] = class259.field3676 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class259.field3676 != null) {
                    class548.method3169(-1, -8361, class420.field5820.field9488.method3773(17539), -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class157[] var150 = class77.method696(-102);
                field618[field626++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field618[--field626];
                class157[] var152 = class77.method696(-55);
                field618[field626++] = var152[var151].field2458;
                field618[field626++] = var152[var151].field2459;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class61.field941;
                int var154 = class69.field1120;
                int var155 = -1;
                class157[] var156 = class77.method696(-94);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class157 var158 = var156[var157];
                    if (var158.field2458 == var153 && var158.field2459 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field618[field626++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field618[field626++] = class388.method2333((byte) 47);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field618[--field626];
                if (var159 >= 1 && var159 <= 2) {
                    class548.method3169(-1, -8361, var159, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field618[field626++] = class420.field5820.field9488.method3773(17539);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field618[--field626];
                if (var160 >= 1 && var160 <= 2) {
                    class420.field5820.method3781(class420.field5820.field9488, 108, var160);
                    class420.field5820.method3781(class420.field5820.field9445, 110, var160);
                    class95.method797(-98);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field600 -= 2;
                String var161 = field620[field600];
                String var162 = field620[field600 + 1];
                int var163 = field618[--field626];
                field628++;
                class302 var164 = class582.method3419(class439.field6096, (byte) 126, class626.field8901);
                var164.field4341.method2524(false, class389.method2339(var161, true) + class389.method2339(var162, true) + 1);
                var164.field4341.method2566(-2, var161);
                var164.field4341.method2566(-2, var162);
                var164.field4341.method2524(false, var163);
                class501.method2928(0, var164);
                return;
            }
            if (arg0 == 5401) {
                field626 -= 2;
                class715.field9993[field618[field626]] = (short) class246.method1631(-22173, field618[field626 + 1]);
                class422.field5873.method2932(true);
                class422.field5873.method2934(true);
                class677.field9511.method3699((byte) 117);
                class31.method262((byte) -36);
                return;
            }
            if (arg0 == 5405) {
                field626 -= 2;
                int var165 = field618[field626];
                int var166 = field618[field626 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class448.field6179[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field626 -= 7;
                int var167 = field618[field626];
                int var168 = field618[field626 + 1] << 1;
                int var169 = field618[field626 + 2];
                int var170 = field618[field626 + 3];
                int var171 = field618[field626 + 4];
                int var172 = field618[field626 + 5];
                int var173 = field618[field626 + 6];
                if (var167 >= 0 && var167 < 2 && class448.field6179[var167] != null && var168 >= 0 && var168 < class448.field6179[var167].length) {
                    class448.field6179[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class448.field6179[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class448.field6179[field618[--field626]].length >> 1;
                field618[field626++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class259.field3676 != null) {
                    class548.method3169(-1, -8361, class420.field5820.field9488.method3773(17539), -1, false);
                }
                if (class410.field5617 != null) {
                    class203.method1433(126);
                    System.exit(0);
                    return;
                }
                String var175 = class275.field3848 == null ? class81.method717(false) : class275.field3848;
                class157.method1214(class336.field4775, false, -128, class420.field5820.field9482.method2338(17539) == 1, var175);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class18.field191 != null) {
                    if (class18.field191.field10371 == null) {
                        var176 = class267.method1714((byte) 82, class18.field191.field10368);
                    } else {
                        var176 = (String) class18.field191.field10371;
                    }
                }
                field620[field600++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field618[field626++] = class336.field4775.field1585 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class259.field3676 != null) {
                    class548.method3169(-1, -8361, class420.field5820.field9488.method3773(17539), -1, false);
                }
                String var177 = field620[--field600];
                boolean var178 = field618[--field626] == 1;
                String var179 = class81.method717(false) + var177;
                class157.method1214(class336.field4775, var178, -65, class420.field5820.field9482.method2338(17539) == 1, var179);
                return;
            }
            if (arg0 == 5422) {
                field600 -= 2;
                String var180 = field620[field600];
                String var181 = field620[field600 + 1];
                int var182 = field618[--field626];
                if (var180.length() > 0) {
                    if (class56.field877 == null) {
                        class56.field877 = new String[class538.field7477[class113.field1647.field482]];
                    }
                    class56.field877[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class237.field3433 == null) {
                        class237.field3433 = new String[class538.field7477[class113.field1647.field482]];
                    }
                    class237.field3433[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field620[--field600]);
                return;
            }
            if (arg0 == 5424) {
                field626 -= 11;
                class637.field8997 = field618[field626];
                class373.field5246 = field618[field626 + 1];
                class514.field7088 = field618[field626 + 2];
                class414.field5688 = field618[field626 + 3];
                class400.field5512 = field618[field626 + 4];
                class664.field9359 = field618[field626 + 5];
                class211.field3087 = field618[field626 + 6];
                class265.field3743 = field618[field626 + 7];
                class655.field9256 = field618[field626 + 8];
                class421.field5865 = field618[field626 + 9];
                class561.field7773 = field618[field626 + 10];
                class176.field2648.method3005(class400.field5512, (byte) -69);
                class176.field2648.method3005(class664.field9359, (byte) -69);
                class176.field2648.method3005(class211.field3087, (byte) -69);
                class176.field2648.method3005(class265.field3743, (byte) -69);
                class176.field2648.method3005(class655.field9256, (byte) -69);
                class27.field281 = null;
                class26.field279 = null;
                class303.field4359 = null;
                class122.field2073 = null;
                class278.field4013 = null;
                class391.field5447 = null;
                class215.field3139 = null;
                class431.field6017 = null;
                class233.field3393 = true;
                return;
            }
            if (arg0 == 5425) {
                class364.method2190(-28517);
                class233.field3393 = false;
                return;
            }
            if (arg0 == 5426) {
                field626 -= 2;
                class25.field274 = field618[field626];
                class28.field297 = field618[field626 + 1];
                return;
            }
            if (arg0 == 5427) {
                field626 -= 2;
                class645.field9176 = field618[field626 + 1];
                return;
            }
            if (arg0 == 5428) {
                field626 -= 2;
                int var183 = field618[field626];
                int var184 = field618[field626 + 1];
                field618[field626++] = class464.method2701((byte) -57, var184, var183) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class467.method2730(false, false, field620[--field600], 10);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class154.method1204(class343.field4881, "accountcreated", 22458);
                    return;
                } catch (Throwable var332) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class154.method1204(class343.field4881, "accountcreatestarted", 22458);
                    return;
                } catch (Throwable var333) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class338.field4798 != null) {
                    Transferable var186 = class338.field4798.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var334) {
                        }
                    }
                }
                field620[field600++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class309.field4408 = field618[--field626];
                return;
            }
            if (arg0 == 5435) {
                field618[field626++] = class781.field10717 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field626 -= 4;
                int var187 = field618[field626];
                int var188 = field618[field626 + 1];
                int var189 = field618[field626 + 2];
                int var190 = field618[field626 + 3];
                class209.method1448((var187 & 0x3FFF) - class697.field9798, (var187 >> 14 & 0x3FFF) - class222.field3266, false, var188 << 2, (byte) -68, var189, var190);
                return;
            }
            if (arg0 == 5501) {
                field626 -= 4;
                int var191 = field618[field626];
                int var192 = field618[field626 + 1];
                int var193 = field618[field626 + 2];
                int var194 = field618[field626 + 3];
                class452.method2657(var194, (byte) -128, var192 << 2, (var191 & 0x3FFF) - class697.field9798, (var191 >> 14 & 0x3FFF) - class222.field3266, var193);
                return;
            }
            if (arg0 == 5502) {
                field626 -= 6;
                int var195 = field618[field626];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class44.field581 = var195;
                int var196 = field618[field626 + 1];
                if (var196 + 1 >= class448.field6179[class44.field581].length >> 1) {
                    throw new RuntimeException();
                }
                class679.field9597 = var196;
                class486.field6692 = 0;
                class514.field7089 = field618[field626 + 2];
                class439.field6092 = field618[field626 + 3];
                int var197 = field618[field626 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class420.field5831 = var197;
                int var198 = field618[field626 + 5];
                if (var198 + 1 >= class448.field6179[class420.field5831].length >> 1) {
                    throw new RuntimeException();
                }
                class174.field2635 = var198;
                class783.field10725 = 3;
                class401.field5533 = -1;
                class743.field10323 = -1;
                return;
            }
            if (arg0 == 5503) {
                class420.method2482((byte) 97);
                return;
            }
            if (arg0 == 5504) {
                field626 -= 2;
                class222.method1527(field618[field626 + 1], 0, -80, field618[field626]);
                return;
            }
            if (arg0 == 5505) {
                field618[field626++] = (int) class208.field3031 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field618[field626++] = (int) class98.field1423 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class720.method4006(false);
                return;
            }
            if (arg0 == 5508) {
                class24.method218(27309);
                return;
            }
            if (arg0 == 5509) {
                class694.method3897((byte) 91);
                return;
            }
            if (arg0 == 5510) {
                class636.method3626(-2);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field618[--field626];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class222.field3266;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class192.field2891) {
                    var202 = class192.field2891;
                }
                int var203 = var201 - class697.field9798;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class456.field6225) {
                    var203 = class456.field6225;
                }
                class374.field5256 = (var202 << 9) + 256;
                class45.field598 = (var203 << 9) + 256;
                class783.field10725 = 4;
                class401.field5533 = -1;
                class743.field10323 = -1;
                return;
            }
            if (arg0 == 5512) {
                class740.method4074(0);
                return;
            }
            if (arg0 == 5514) {
                class349.field4948 = field618[--field626];
                return;
            }
            if (arg0 == 5516) {
                field618[field626++] = class349.field4948;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field618[--field626];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class222.field3266;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class192.field2891) {
                        var207 = class192.field2891;
                    }
                    int var208 = var206 - class697.field9798;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class456.field6225) {
                        var208 = class456.field6225;
                    }
                    class743.field10323 = (var207 << 9) + 256;
                    class401.field5533 = (var208 << 9) + 256;
                    return;
                }
                class743.field10323 = -1;
                class401.field5533 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field600 -= 2;
                String var209 = field620[field600];
                String var210 = field620[field600 + 1];
                int var211 = field618[--field626];
                if (var209.length() > 320) {
                    return;
                }
                if (class141.field2306 != 3) {
                    return;
                }
                if (class373.field5243 == 0 && class100.field1492 == 0) {
                    class599.field8546 = var209;
                    class110.field1563 = var210;
                    class347.field4939 = var211;
                    class75.method690(true, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class527.method3080(-16978);
                return;
            }
            if (arg0 == 5602) {
                if (class373.field5243 == 0) {
                    class37.field442 = -2;
                    class431.field6011 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field600--;
                if (class141.field2306 != 3) {
                    return;
                }
                if (class373.field5243 == 0 && class100.field1492 == 0) {
                    class716.method3990(-111, field620[field600]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field600 -= 2;
                field626 -= 2;
                if (class141.field2306 != 3) {
                    return;
                }
                if (class373.field5243 == 0 && class100.field1492 == 0) {
                    class84.method746(field618[field626], field618[field626 + 1] == 1, field620[field600 + 1], field620[field600], (byte) -83);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class100.field1492 == 0) {
                    class657.field9273 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field618[field626++] = class431.field6011;
                return;
            }
            if (arg0 == 5608) {
                field618[field626++] = class551.field7651;
                return;
            }
            if (arg0 == 5609) {
                field618[field626++] = class657.field9273;
                return;
            }
            if (arg0 == 5611) {
                field618[field626++] = class28.field294;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field618[--field626];
                if (class141.field2306 != 7) {
                    return;
                }
                if (class373.field5243 == 0 && class100.field1492 == 0) {
                    if (class600.field8551 != null) {
                        class600.field8551.method183((byte) 88);
                        class600.field8551 = null;
                    }
                    class347.field4939 = var212;
                    class75.method690(true, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field618[field626++] = class431.field6011;
                return;
            }
            if (arg0 == 5615) {
                field600 -= 2;
                String var213 = field620[field600];
                String var214 = field620[field600 + 1];
                if (var213.length() > 320) {
                    return;
                }
                if (class141.field2306 != 3) {
                    return;
                }
                if (class373.field5243 == 0 && class100.field1492 == 0) {
                    if (class600.field8551 != null) {
                        class600.field8551.method183((byte) 88);
                        class600.field8551 = null;
                    }
                    class599.field8546 = var213;
                    class110.field1563 = var214;
                    class75.method690(true, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class477.method2832(false, (byte) 111);
                return;
            }
            if (arg0 == 5617) {
                field618[field626++] = class37.field442;
                return;
            }
            if (arg0 == 5618) {
                field626--;
                return;
            }
            if (arg0 == 5619) {
                field626--;
                return;
            }
            if (arg0 == 5620) {
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field600 -= 2;
                field626 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class692.field9757 != null) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field618[field626++] = (int) (class578.field8335 >> 32);
                field618[field626++] = (int) (class578.field8335 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field618[field626++] = class477.field6535 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class477.field6535 = true;
                class337.method2063((byte) -51);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var215 = field618[--field626];
                class420.field5820.method3781(class420.field5820.field9467, 87, var215);
                class473.method2764((byte) 83);
                class95.method797(-98);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var216 = field618[--field626] == 1;
                class420.field5820.method3781(class420.field5820.field9496, 116, var216 ? 1 : 0);
                class420.field5820.method3781(class420.field5820.field9495, 105, var216 ? 1 : 0);
                class473.method2764((byte) 99);
                class244.method1624(true);
                class95.method797(90);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var217 = field618[--field626] == 1;
                class420.field5820.method3781(class420.field5820.field9483, 76, var217 ? 2 : 1);
                class420.field5820.method3781(class420.field5820.field9460, 93, var217 ? 2 : 1);
                class244.method1624(true);
                class95.method797(-39);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6005) {
                class420.field5820.method3781(class420.field5820.field9479, 69, field618[--field626] == 1 ? 1 : 0);
                class473.method2764((byte) 119);
                class95.method797(-97);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6007) {
                class420.field5820.method3781(class420.field5820.field9468, 125, field618[--field626]);
                class95.method797(-87);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6008) {
                class420.field5820.method3781(class420.field5820.field9490, 107, field618[--field626] == 1 ? 1 : 0);
                class95.method797(87);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6010) {
                class420.field5820.method3781(class420.field5820.field9450, 74, field618[--field626] == 1 ? 1 : 0);
                class95.method797(-49);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6011) {
                class420.field5820.method3781(class420.field5820.field9457, 89, field618[--field626]);
                class473.method2764((byte) 63);
                class95.method797(114);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6012) {
                class420.field5820.method3781(class420.field5820.field9481, 71, field618[--field626] == 1 ? 1 : 0);
                class319.method1936((byte) 112);
                class166.method1239(false);
                class95.method797(122);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6014) {
                class420.field5820.method3781(class420.field5820.field9489, 127, field618[--field626] == 1 ? 2 : 0);
                class473.method2764((byte) -98);
                class95.method797(127);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6015) {
                class420.field5820.method3781(class420.field5820.field9459, 79, field618[--field626] == 1 ? 1 : 0);
                class473.method2764((byte) -124);
                class95.method797(92);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6016) {
                class420.field5820.method3781(class420.field5820.field9447, 72, field618[--field626]);
                class636.method3625(false, class420.field5820.field9482.method2338(17539), 114);
                class95.method797(89);
                return;
            }
            if (arg0 == 6017) {
                class420.field5820.method3781(class420.field5820.field9480, 126, field618[--field626] == 1 ? 1 : 0);
                class687.method3879(0);
                class95.method797(-56);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6018) {
                class420.field5820.method3781(class420.field5820.field9448, 107, field618[--field626]);
                class95.method797(-105);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6019) {
                int var218 = field618[--field626];
                int var219 = class420.field5820.field9491.method1367(17539);
                if (var218 != var219) {
                    if (class659.method3694(9, class141.field2306)) {
                        if (var219 == 0 && class371.field5236 != -1) {
                            class531.method3095(class371.field5236, 112, var218, class399.field5495, 0, false);
                            class646.method3658((byte) -51);
                            class301.field4330 = false;
                        } else if (var218 == 0) {
                            class460.method2687(-116);
                            class301.field4330 = false;
                        } else {
                            class496.method2905(0, var218);
                        }
                    }
                    class420.field5820.method3781(class420.field5820.field9491, 104, var218);
                    class95.method797(-92);
                    class356.field5069 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class420.field5820.method3781(class420.field5820.field9484, 87, field618[--field626]);
                class95.method797(-59);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6021) {
                int var220 = class420.field5820.field9483.method3420(17539);
                class420.field5820.method3781(class420.field5820.field9460, 96, field618[--field626] == 1 ? 0 : var220);
                class244.method1624(true);
                return;
            }
            if (arg0 == 6023) {
                int var221 = field618[--field626];
                class420.field5820.method3781(class420.field5820.field9453, 81, var221);
                class95.method797(94);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6024) {
                class420.field5820.method3781(class420.field5820.field9485, 92, field618[--field626]);
                class95.method797(101);
                return;
            }
            if (arg0 == 6025) {
                class420.field5820.method3781(class420.field5820.field9461, 98, field618[--field626]);
                class95.method797(-127);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6027) {
                int var222 = field618[--field626];
                if (var222 < 0 || var222 > 1) {
                    var222 = 0;
                }
                class222.method1524(var222 == 1, (byte) -107);
                return;
            }
            if (arg0 == 6028) {
                class420.field5820.method3781(class420.field5820.field9471, 111, field618[--field626] == 0 ? 0 : 1);
                class95.method797(127);
                return;
            }
            if (arg0 == 6029) {
                class420.field5820.method3781(class420.field5820.field9468, 110, field618[--field626]);
                class95.method797(-66);
                return;
            }
            if (arg0 == 6030) {
                class420.field5820.method3781(class420.field5820.field9454, 97, field618[--field626] == 0 ? 0 : 1);
                class95.method797(102);
                class473.method2764((byte) -102);
                return;
            }
            if (arg0 == 6031) {
                int var223 = field618[--field626];
                if (var223 < 0 || var223 > 5) {
                    var223 = 2;
                }
                class636.method3625(false, var223, -31);
                return;
            }
            if (arg0 == 6032) {
                field626 -= 2;
                int var224 = field618[field626];
                boolean var225 = field618[field626 + 1] == 1;
                class420.field5820.method3781(class420.field5820.field9466, 81, var224);
                if (!var225) {
                    class420.field5820.method3781(class420.field5820.field9443, 108, 0);
                }
                class95.method797(91);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6033) {
                class420.field5820.method3781(class420.field5820.field9470, 121, field618[--field626]);
                class95.method797(-92);
                return;
            }
            if (arg0 == 6034) {
                class420.field5820.method3781(class420.field5820.field9487, 123, field618[--field626] == 1 ? 1 : 0);
                class95.method797(-105);
                class319.method1936((byte) 113);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6035) {
                int var226 = class420.field5820.field9496.method1677(17539);
                class420.field5820.method3781(class420.field5820.field9495, 113, field618[--field626] == 1 ? 1 : var226);
                class473.method2764((byte) -102);
                class244.method1624(true);
                return;
            }
            if (arg0 == 6036) {
                class420.field5820.method3781(class420.field5820.field9493, 80, field618[--field626]);
                class95.method797(78);
                class789.field10785 = true;
                return;
            }
            if (arg0 == 6037) {
                class420.field5820.method3781(class420.field5820.field9451, 121, field618[--field626]);
                class95.method797(-38);
                class356.field5069 = false;
                return;
            }
            if (arg0 == 6038) {
                int var227 = field618[--field626];
                int var228 = class420.field5820.field9478.method1367(17539);
                if (var227 != var228 && class743.field10326 == class371.field5236) {
                    if (!class659.method3694(9, class141.field2306)) {
                        if (var228 == 0) {
                            class531.method3095(class371.field5236, -15, var227, class399.field5495, 0, false);
                            class646.method3658((byte) -24);
                            class301.field4330 = false;
                        } else if (var227 == 0) {
                            class460.method2687(-92);
                            class301.field4330 = false;
                        } else {
                            class496.method2905(0, var227);
                        }
                    }
                    class420.field5820.method3781(class420.field5820.field9478, 92, var227);
                    class95.method797(-67);
                    class356.field5069 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var229 = field618[--field626];
                if (var229 > 255 || var229 < 0) {
                    var229 = 0;
                }
                if (var229 != class420.field5820.field9463.method2184(17539)) {
                    class420.field5820.method3781(class420.field5820.field9463, 105, var229);
                    class95.method797(-92);
                    class356.field5069 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var230 = field618[--field626];
                if (var230 != class420.field5820.field9469.method2839(17539)) {
                    class420.field5820.method3781(class420.field5820.field9469, 126, var230);
                    class95.method797(108);
                    class356.field5069 = false;
                    class134.method1110((byte) 121);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field618[field626++] = class420.field5820.field9467.method1145(17539);
                return;
            }
            if (arg0 == 6102) {
                field618[field626++] = class420.field5820.field9496.method1677(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field618[field626++] = class420.field5820.field9483.method3420(17539) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field618[field626++] = class420.field5820.field9479.method288(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field618[field626++] = class420.field5820.field9468.method776(17539);
                return;
            }
            if (arg0 == 6108) {
                field618[field626++] = class420.field5820.field9490.method798(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field618[field626++] = class420.field5820.field9450.method3133(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field618[field626++] = class420.field5820.field9457.method3741(17539);
                return;
            }
            if (arg0 == 6112) {
                field618[field626++] = class420.field5820.field9481.method3155(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field618[field626++] = class420.field5820.field9489.method2326(17539) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field618[field626++] = class420.field5820.field9459.method3485(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field618[field626++] = class420.field5820.field9447.method745(17539);
                return;
            }
            if (arg0 == 6117) {
                field618[field626++] = class420.field5820.field9480.method1896(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field618[field626++] = class420.field5820.field9448.method1367(17539);
                return;
            }
            if (arg0 == 6119) {
                field618[field626++] = class420.field5820.field9491.method1367(17539);
                return;
            }
            if (arg0 == 6120) {
                field618[field626++] = class420.field5820.field9484.method1367(17539);
                return;
            }
            if (arg0 == 6123) {
                field618[field626++] = class105.method854(1);
                return;
            }
            if (arg0 == 6124) {
                field618[field626++] = class420.field5820.field9485.method745(17539);
                return;
            }
            if (arg0 == 6125) {
                field618[field626++] = class420.field5820.field9461.method3934(17539);
                return;
            }
            if (arg0 == 6127) {
                field618[field626++] = class420.field5820.field9476.method1941(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field618[field626++] = class420.field5820.field9471.method3201(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field618[field626++] = class420.field5820.field9468.method776(17539);
                return;
            }
            if (arg0 == 6130) {
                field618[field626++] = class420.field5820.field9454.method4010(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field618[field626++] = class420.field5820.field9482.method2338(17539);
                return;
            }
            if (arg0 == 6132) {
                field618[field626++] = class420.field5820.field9466.method2338(17539);
                return;
            }
            if (arg0 == 6133) {
                field618[field626++] = class336.field4775.field1585 && !class336.field4775.field1588 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field618[field626++] = class420.field5820.field9470.method3126(17539);
                return;
            }
            if (arg0 == 6136) {
                field618[field626++] = class420.field5820.field9487.method3081(17539) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field618[field626++] = class742.method4090(200, (byte) -125, class420.field5820.field9482.method2338(17539));
                return;
            }
            if (arg0 == 6139) {
                field618[field626++] = class420.field5820.field9493.method1486(17539);
                return;
            }
            if (arg0 == 6142) {
                field618[field626++] = class420.field5820.field9451.method1367(17539);
                return;
            }
            if (arg0 == 6143) {
                field618[field626++] = class420.field5820.field9478.method1367(17539);
                return;
            }
            if (arg0 == 6144) {
                field618[field626++] = class770.field10631 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field618[field626++] = class420.field5820.field9463.method2184(17539);
                return;
            }
            if (arg0 == 6146) {
                field618[field626++] = class420.field5820.field9469.method2839(17539);
                return;
            }
            if (arg0 == 6147) {
                field618[field626++] = class63.field964.field10844 < 512 || class770.field10631 || class61.field934 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field618[field626++] = class689.field9728 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field626 -= 2;
                class677.field9526 = (short) field618[field626];
                if (class677.field9526 <= 0) {
                    class677.field9526 = 256;
                }
                class303.field4353 = (short) field618[field626 + 1];
                if (class303.field4353 <= 0) {
                    class303.field4353 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field626 -= 2;
                class377.field5279 = (short) field618[field626];
                if (class377.field5279 <= 0) {
                    class377.field5279 = 256;
                }
                class740.field10254 = (short) field618[field626 + 1];
                if (class740.field10254 <= 0) {
                    class740.field10254 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field626 -= 4;
                class288.field4215 = (short) field618[field626];
                if (class288.field4215 <= 0) {
                    class288.field4215 = 1;
                }
                class261.field3703 = (short) field618[field626 + 1];
                if (class261.field3703 <= 0) {
                    class261.field3703 = 32767;
                } else if (class261.field3703 < class288.field4215) {
                    class261.field3703 = class288.field4215;
                }
                class116.field1992 = (short) field618[field626 + 2];
                if (class116.field1992 <= 0) {
                    class116.field1992 = 1;
                }
                class774.field10660 = (short) field618[field626 + 3];
                if (class774.field10660 <= 0) {
                    class774.field10660 = 32767;
                    return;
                }
                if (class774.field10660 < class116.field1992) {
                    class774.field10660 = class116.field1992;
                }
                return;
            }
            if (arg0 == 6203) {
                class508.method2970(0, class341.field4857.field7128, false, 0, class341.field4857.field7255, (byte) -87);
                field618[field626++] = class286.field4206;
                field618[field626++] = class580.field8358;
                return;
            }
            if (arg0 == 6204) {
                field618[field626++] = class377.field5279;
                field618[field626++] = class740.field10254;
                return;
            }
            if (arg0 == 6205) {
                field618[field626++] = class677.field9526;
                field618[field626++] = class303.field4353;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field618[field626++] = (int) (class337.method2062(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field618[field626++] = (int) (class337.method2062(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field626 -= 3;
                int var231 = field618[field626];
                int var232 = field618[field626 + 1];
                int var233 = field618[field626 + 2];
                long var234 = class401.method2386(0, 0, var231, 12, var232, var233, (byte) -45);
                int var236 = class88.method774((byte) 50, var234);
                if (var233 < 1970) {
                    var236--;
                }
                field618[field626++] = var236;
                return;
            }
            if (arg0 == 6303) {
                field618[field626++] = class386.method2324(1, class337.method2062(false));
                return;
            }
            if (arg0 == 6304) {
                int var237 = field618[--field626];
                boolean var238 = true;
                if (var237 < 0) {
                    var238 = (var237 + 1) % 4 == 0;
                } else if (var237 < 1582) {
                    var238 = var237 % 4 == 0;
                } else if (var237 % 4 != 0) {
                    var238 = false;
                } else if (var237 % 100 != 0) {
                    var238 = true;
                } else if (var237 % 400 != 0) {
                    var238 = false;
                }
                field618[field626++] = var238 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var239 = field618[--field626];
                int[] var240 = class672.method3766((byte) 103, var239);
                class171.method1262(var240, 0, field618, field626, 3);
                field626 += 3;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field618[field626++] = class133.method1105(-9502) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field618[field626++] = class785.method4299((byte) 91) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class141.field2306 == 7 && class373.field5243 == 0 && class100.field1492 == 0) {
                    if (class555.field7709) {
                        field618[field626++] = 0;
                        return;
                    }
                    if (class180.field2756 > class337.method2062(false) - 1000L) {
                        field618[field626++] = 1;
                        return;
                    }
                    class555.field7709 = true;
                    class302 var241 = class582.method3419(class507.field6975, (byte) 126, class626.field8901);
                    var241.field4341.method2548(class74.field1145, (byte) -105);
                    class501.method2928(0, var241);
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class422 var242 = class269.method1720(false);
                if (var242 != null) {
                    field618[field626++] = var242.field5877;
                    field618[field626++] = var242.field2300;
                    field620[field600++] = var242.field5871;
                    class74 var243 = var242.method2488(-1);
                    field618[field626++] = var243.field1140;
                    field620[field600++] = var243.field1139;
                    field618[field626++] = var242.field2299;
                    field618[field626++] = var242.field5875;
                    field620[field600++] = var242.field5868;
                    return;
                }
                field618[field626++] = -1;
                field618[field626++] = 0;
                field620[field600++] = "";
                field618[field626++] = 0;
                field620[field600++] = "";
                field618[field626++] = 0;
                field618[field626++] = 0;
                field620[field600++] = "";
                return;
            }
            if (arg0 == 6502) {
                class422 var244 = class411.method2420((byte) 87);
                if (var244 != null) {
                    field618[field626++] = var244.field5877;
                    field618[field626++] = var244.field2300;
                    field620[field600++] = var244.field5871;
                    class74 var245 = var244.method2488(-1);
                    field618[field626++] = var245.field1140;
                    field620[field600++] = var245.field1139;
                    field618[field626++] = var244.field2299;
                    field618[field626++] = var244.field5875;
                    field620[field600++] = var244.field5868;
                    return;
                }
                field618[field626++] = -1;
                field618[field626++] = 0;
                field620[field600++] = "";
                field618[field626++] = 0;
                field620[field600++] = "";
                field618[field626++] = 0;
                field618[field626++] = 0;
                field620[field600++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var246 = field618[--field626];
                String var247 = field620[--field600];
                if (class141.field2306 == 7 && class373.field5243 == 0 && class100.field1492 == 0) {
                    field618[field626++] = class293.method1857(var246, var247, 2) ? 1 : 0;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var248 = field618[--field626];
                class422 var249 = class630.method3595(26316, var248);
                if (var249 != null) {
                    field618[field626++] = var249.field2300;
                    field620[field600++] = var249.field5871;
                    class74 var250 = var249.method2488(-1);
                    field618[field626++] = var250.field1140;
                    field620[field600++] = var250.field1139;
                    field618[field626++] = var249.field2299;
                    field618[field626++] = var249.field5875;
                    field620[field600++] = var249.field5868;
                    return;
                }
                field618[field626++] = -1;
                field620[field600++] = "";
                field618[field626++] = 0;
                field620[field600++] = "";
                field618[field626++] = 0;
                field618[field626++] = 0;
                field620[field600++] = "";
                return;
            }
            if (arg0 == 6507) {
                field626 -= 4;
                int var251 = field618[field626];
                boolean var252 = field618[field626 + 1] == 1;
                int var253 = field618[field626 + 2];
                boolean var254 = field618[field626 + 3] == 1;
                class3.method25(-71, var251, var253, var252, var254);
                return;
            }
            if (arg0 == 6508) {
                class302.method1877(5);
                return;
            }
            if (arg0 == 6509) {
                if (class141.field2306 != 7) {
                    return;
                }
                class405.field5580 = field618[--field626] == 1;
                return;
            }
            if (arg0 == 6510) {
                field618[field626++] = class122.field2074;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class92.field1319 == class27.field288) {
                if (arg0 == 6700) {
                    int var255 = class37.field437.method4257(115);
                    if (class379.field5314 != -1) {
                        var255++;
                    }
                    field618[field626++] = var255;
                    return;
                }
                if (arg0 == 6701) {
                    int var256 = field618[--field626];
                    if (class379.field5314 != -1) {
                        if (var256 == 0) {
                            field618[field626++] = class379.field5314;
                            return;
                        }
                        var256--;
                    }
                    class27 var257 = (class27) class37.field437.method4254((byte) 8);
                    while (var256-- > 0) {
                        var257 = (class27) class37.field437.method4251(-115);
                    }
                    field618[field626++] = var257.field284;
                    return;
                }
                if (arg0 == 6702) {
                    int var258 = field618[--field626];
                    if (class610.field8661[var258] == null) {
                        field620[field600++] = "";
                        return;
                    }
                    String var259 = class610.field8661[var258][0].field7298;
                    if (var259 == null) {
                        field620[field600++] = "";
                        return;
                    }
                    field620[field600++] = var259.substring(0, var259.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var260 = field618[--field626];
                    if (class610.field8661[var260] == null) {
                        field618[field626++] = 0;
                        return;
                    }
                    field618[field626++] = class610.field8661[var260].length;
                    return;
                }
                if (arg0 == 6704) {
                    field626 -= 2;
                    int var261 = field618[field626];
                    int var262 = field618[field626 + 1];
                    if (class610.field8661[var261] == null) {
                        field620[field600++] = "";
                        return;
                    }
                    String var263 = class610.field8661[var261][var262].field7298;
                    if (var263 == null) {
                        field620[field600++] = "";
                        return;
                    }
                    field620[field600++] = var263;
                    return;
                }
                if (arg0 == 6705) {
                    field626 -= 2;
                    int var264 = field618[field626];
                    int var265 = field618[field626 + 1];
                    if (class610.field8661[var264] == null) {
                        field618[field626++] = 0;
                        return;
                    }
                    field618[field626++] = class610.field8661[var264][var265].field7147;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field626 -= 3;
                    int var266 = field618[field626];
                    int var267 = field618[field626 + 1];
                    int var268 = field618[field626 + 2];
                    class628.method3589("", 1, -25984, var266 << 16 | var267, var268);
                    return;
                }
                if (arg0 == 6708) {
                    field626 -= 3;
                    int var269 = field618[field626];
                    int var270 = field618[field626 + 1];
                    int var271 = field618[field626 + 2];
                    class628.method3589("", 2, -25984, var269 << 16 | var270, var271);
                    return;
                }
                if (arg0 == 6709) {
                    field626 -= 3;
                    int var272 = field618[field626];
                    int var273 = field618[field626 + 1];
                    int var274 = field618[field626 + 2];
                    class628.method3589("", 3, -25984, var272 << 16 | var273, var274);
                    return;
                }
                if (arg0 == 6710) {
                    field626 -= 3;
                    int var275 = field618[field626];
                    int var276 = field618[field626 + 1];
                    int var277 = field618[field626 + 2];
                    class628.method3589("", 4, -25984, var275 << 16 | var276, var277);
                    return;
                }
                if (arg0 == 6711) {
                    field626 -= 3;
                    int var278 = field618[field626];
                    int var279 = field618[field626 + 1];
                    int var280 = field618[field626 + 2];
                    class628.method3589("", 5, -25984, var278 << 16 | var279, var280);
                    return;
                }
                if (arg0 == 6712) {
                    field626 -= 3;
                    int var281 = field618[field626];
                    int var282 = field618[field626 + 1];
                    int var283 = field618[field626 + 2];
                    class628.method3589("", 6, -25984, var281 << 16 | var282, var283);
                    return;
                }
                if (arg0 == 6713) {
                    field626 -= 3;
                    int var284 = field618[field626];
                    int var285 = field618[field626 + 1];
                    int var286 = field618[field626 + 2];
                    class628.method3589("", 7, -25984, var284 << 16 | var285, var286);
                    return;
                }
                if (arg0 == 6714) {
                    field626 -= 3;
                    int var287 = field618[field626];
                    int var288 = field618[field626 + 1];
                    int var289 = field618[field626 + 2];
                    class628.method3589("", 8, -25984, var287 << 16 | var288, var289);
                    return;
                }
                if (arg0 == 6715) {
                    field626 -= 3;
                    int var290 = field618[field626];
                    int var291 = field618[field626 + 1];
                    int var292 = field618[field626 + 2];
                    class628.method3589("", 9, -25984, var290 << 16 | var291, var292);
                    return;
                }
                if (arg0 == 6716) {
                    field626 -= 3;
                    int var293 = field618[field626];
                    int var294 = field618[field626 + 1];
                    int var295 = field618[field626 + 2];
                    class628.method3589("", 10, -25984, var293 << 16 | var294, var295);
                    return;
                }
                if (arg0 == 6717) {
                    field626 -= 3;
                    int var296 = field618[field626];
                    int var297 = field618[field626 + 1];
                    int var298 = field618[field626 + 2];
                    class519 var299 = class153.method1203(0, var298, var296 << 16 | var297);
                    class558.method3253(-79);
                    class169 var300 = client.method885(var299);
                    class227.method1540(var300.method1255((byte) 114), 23342, var300.field2555, var299);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var301 = field618[--field626];
                    class548 var302 = class451.field6195.method4105(var301, -90);
                    if (var302.field7582 == null) {
                        field620[field600++] = "";
                        return;
                    }
                    field620[field600++] = var302.field7582;
                    return;
                }
                if (arg0 == 6801) {
                    int var303 = field618[--field626];
                    class548 var304 = class451.field6195.method4105(var303, -104);
                    field618[field626++] = var304.field7590;
                    return;
                }
                if (arg0 == 6802) {
                    int var305 = field618[--field626];
                    class548 var306 = class451.field6195.method4105(var305, -118);
                    field618[field626++] = var306.field7610;
                    return;
                }
                if (arg0 == 6803) {
                    int var307 = field618[--field626];
                    class548 var308 = class451.field6195.method4105(var307, -90);
                    field618[field626++] = var308.field7580;
                    return;
                }
                if (arg0 == 6804) {
                    field626 -= 2;
                    int var309 = field618[field626];
                    int var310 = field618[field626 + 1];
                    class93 var311 = class498.field6854.method3434(var310, 10549);
                    if (var311.method789(124)) {
                        field620[field600++] = class451.field6195.method4105(var309, -80).method3173(7, var311.field1332, var310);
                        return;
                    }
                    field618[field626++] = class451.field6195.method4105(var309, -127).method3165(-1, var311.field1331, var310);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field618[field626++] = class273.field3833 && !class115.field1975 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field618[field626++] = (int) (class209.field3075 / 60000L);
                    field618[field626++] = (int) ((class209.field3075 - class337.method2062(false) - class792.field10858) / 60000L);
                    field618[field626++] = class102.field1505 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field618[field626++] = class39.field459;
                    return;
                }
                if (arg0 == 6903) {
                    field618[field626++] = class526.field7341;
                    return;
                }
                if (arg0 == 6904) {
                    field618[field626++] = class592.field8486;
                    return;
                }
                if (arg0 == 6905) {
                    String var312 = "";
                    if (class18.field191 != null) {
                        if (class18.field191.field10371 == null) {
                            var312 = class267.method1714((byte) 72, class18.field191.field10368);
                        } else {
                            var312 = (String) class18.field191.field10371;
                        }
                    }
                    field620[field600++] = var312;
                    return;
                }
                if (arg0 == 6906) {
                    field618[field626++] = class265.field3737;
                    return;
                }
                if (arg0 == 6907) {
                    field618[field626++] = class436.field6071;
                    return;
                }
                if (arg0 == 6908) {
                    field618[field626++] = class542.field7505;
                    return;
                }
                if (arg0 == 6909) {
                    field618[field626++] = class432.field6037 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field618[field626++] = class429.field5940;
                    return;
                }
                if (arg0 == 6911) {
                    field618[field626++] = class464.field6305;
                    return;
                }
                if (arg0 == 6912) {
                    field618[field626++] = class789.field10787;
                    return;
                }
                if (arg0 == 6913) {
                    field618[field626++] = class116.field1980;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var313 = class341.method2095(-75);
                    field618[field626++] = class176.field2654 = class420.field5820.field9482.method2338(17539);
                    field618[field626++] = var313;
                    class473.method2764((byte) 127);
                    class95.method797(-37);
                    class356.field5069 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class565.method3294(-5550);
                    class473.method2764((byte) -119);
                    class95.method797(-115);
                    class356.field5069 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class775.method4271(255);
                    class473.method2764((byte) -114);
                    class95.method797(81);
                    class356.field5069 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class698.method3917(108);
                    class473.method2764((byte) -88);
                    class95.method797(92);
                    class356.field5069 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class713.method3967(true, 2);
                    class473.method2764((byte) 116);
                    class95.method797(-61);
                    class356.field5069 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class420.field5820.method3781(class420.field5820.field9443, 91, 0);
                    class95.method797(108);
                    class356.field5069 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class176.field2654 == 2) {
                        class69.field1123 = true;
                        return;
                    }
                    if (class176.field2654 == 1) {
                        class745.field10363 = true;
                        return;
                    }
                    if (class176.field2654 == 3) {
                        class459.field6271 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field618[field626++] = class420.field5820.field9443.method3690(17539);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field626 -= 2;
                    int var314 = field618[field626];
                    int var315 = field618[field626 + 1];
                    if (var314 != -1) {
                        if (var315 > 255) {
                            var315 = 255;
                        } else if (var315 < 0) {
                            var315 = 0;
                        }
                        class493.method2879(false, var315, 0, var314);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var316 = field618[--field626];
                    if (var316 != -1) {
                        class523.method3073((byte) 76, var316);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var317 = field618[--field626];
                    if (var317 != -1) {
                        class503.method2941((byte) -102, var317);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field618[field626++] = class514.method3023(123, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field618[field626++] = class420.field5820.field9479.method287(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field618[field626++] = class420.field5820.field9450.method3131(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field618[field626++] = class420.field5820.field9457.method3739(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field618[field626++] = class420.field5820.field9489.method2328(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field618[field626++] = class420.field5820.field9485.method749(0) && class686.field9702.method433() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field618[field626++] = class420.field5820.field9453.method2331(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field618[field626++] = class420.field5820.field9461.method3936(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field618[field626++] = class420.field5820.field9476.method1939(0) && class686.field9702.method421() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field618[field626++] = class420.field5820.field9454.method4015(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field618[field626++] = class420.field5820.field9487.method3082(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field618[field626++] = class420.field5820.field9493.method1485(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field618[field626++] = class420.field5820.field9459.method3488(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field618[field626++] = class420.field5820.field9469.method2836(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field618[field626++] = class420.field5820.field9466.method2340(0) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var318 = field618[--field626];
                    field618[field626++] = class420.field5820.field9479.method290(var318, -126);
                    return;
                }
                if (arg0 == 7302) {
                    int var319 = field618[--field626];
                    field618[field626++] = class420.field5820.field9450.method290(var319, -125);
                    return;
                }
                if (arg0 == 7303) {
                    int var320 = field618[--field626];
                    field618[field626++] = class420.field5820.field9457.method290(var320, -125);
                    return;
                }
                if (arg0 == 7304) {
                    int var321 = field618[--field626];
                    field618[field626++] = class420.field5820.field9489.method290(var321, -125);
                    return;
                }
                if (arg0 == 7305) {
                    int var322 = field618[--field626];
                    if (!class686.field9702.method433()) {
                        field618[field626++] = 3;
                        return;
                    }
                    field618[field626++] = class420.field5820.field9485.method290(var322, -126);
                    return;
                }
                if (arg0 == 7306) {
                    int var323 = field618[--field626];
                    field618[field626++] = class420.field5820.field9453.method290(var323, -126);
                    return;
                }
                if (arg0 == 7307) {
                    int var324 = field618[--field626];
                    field618[field626++] = class420.field5820.field9461.method290(var324, -126);
                    return;
                }
                if (arg0 == 7308) {
                    int var325 = field618[--field626];
                    if (!class686.field9702.method421()) {
                        field618[field626++] = 3;
                        return;
                    }
                    field618[field626++] = class420.field5820.field9476.method290(var325, -126);
                    return;
                }
                if (arg0 == 7309) {
                    int var326 = field618[--field626];
                    field618[field626++] = class420.field5820.field9454.method290(var326, -126);
                    return;
                }
                if (arg0 == 7310) {
                    int var327 = field618[--field626];
                    field618[field626++] = class420.field5820.field9487.method290(var327, -127);
                    return;
                }
                if (arg0 == 7311) {
                    int var328 = field618[--field626];
                    field618[field626++] = class420.field5820.field9493.method290(var328, -127);
                    return;
                }
                if (arg0 == 7312) {
                    int var329 = field618[--field626];
                    field618[field626++] = class420.field5820.field9459.method290(var329, -125);
                    return;
                }
                if (arg0 == 7313) {
                    int var330 = field618[--field626];
                    field618[field626++] = class420.field5820.field9469.method290(var330, -128);
                    return;
                }
                if (arg0 == 7314) {
                    int var331 = field618[--field626];
                    field618[field626++] = class420.field5820.field9466.method290(var331, -126);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "()V")
    public static void method359() {
        field606 = null;
        field612 = null;
        field617 = null;
        field622 = null;
        field604 = null;
        field618 = null;
        field620 = null;
        field602 = null;
        field610 = null;
        field615 = null;
        field608 = null;
        field625 = null;
        field603 = null;
        field614 = null;
        field613 = null;
        field621 = null;
    }

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "(IZ)V")
    private static final void method360(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field626 -= 3;
                int var2 = field618[field626];
                int var3 = field618[field626 + 1];
                int var4 = field618[field626 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class519 var5 = class604.method3506(var2, 255);
                if (var5.field7170 == null) {
                    var5.field7170 = new class519[var4 + 1];
                }
                if (var5.field7170.length <= var4) {
                    class519[] var6 = new class519[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7170.length; var7++) {
                        var6[var7] = var5.field7170[var7];
                    }
                    var5.field7170 = var6;
                }
                if (var4 > 0 && var5.field7170[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class519 var8 = new class519();
                var8.field7190 = var3;
                var8.field7223 = var8.field7247 = var5.field7247;
                var8.field7193 = var4;
                var5.field7170[var4] = var8;
                if (arg1) {
                    field608 = var8;
                } else {
                    field615 = var8;
                }
                class172.method1268(var5, -115);
                return;
            }
            if (arg0 == 151) {
                class519 var9 = arg1 ? field608 : field615;
                if (var9.field7193 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class519 var10 = class604.method3506(var9.field7247, 255);
                var10.field7170[var9.field7193] = null;
                class172.method1268(var10, -48);
                return;
            }
            if (arg0 == 152) {
                class519 var11 = class604.method3506(field618[--field626], 255);
                var11.field7170 = null;
                class172.method1268(var11, -112);
                return;
            }
            if (arg0 == 200) {
                field626 -= 2;
                int var12 = field618[field626];
                int var13 = field618[field626 + 1];
                class519 var14 = class153.method1203(0, var13, var12);
                if (var14 != null && var13 != -1) {
                    field618[field626++] = 1;
                    if (arg1) {
                        field608 = var14;
                        return;
                    }
                    field615 = var14;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field618[--field626];
                class519 var16 = class604.method3506(var15, 255);
                if (var16 != null) {
                    field618[field626++] = 1;
                    if (arg1) {
                        field608 = var16;
                        return;
                    }
                    field615 = var16;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field618[--field626];
                method355(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field618[--field626];
                method349(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field626 -= 2;
                int var19 = field618[field626];
                int var20 = field618[field626 + 1];
                if (class719.field10041.field207 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class237.field3427.length; var21++) {
                    if (class237.field3427[var21] == var19) {
                        class719.field10041.field207.method1814(class38.field451, var20, -65536, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class166.field2528.length; var22++) {
                    if (class166.field2528[var22] == var19) {
                        class719.field10041.field207.method1814(class38.field451, var20, -65536, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field626 -= 2;
                int var23 = field618[field626];
                int var24 = field618[field626 + 1];
                if (class719.field10041.field207 == null) {
                    return;
                }
                class719.field10041.field207.method1813(var23, var24, (byte) 58);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field618[--field626] != 0;
                if (class719.field10041.field207 == null) {
                    return;
                }
                class719.field10041.field207.method1810(var25, -101);
                return;
            }
            if (arg0 == 411) {
                field626 -= 2;
                int var26 = field618[field626];
                int var27 = field618[field626 + 1];
                if (class719.field10041.field207 == null) {
                    return;
                }
                class719.field10041.field207.method1819(var27, var26, 1073741824, class422.field5873);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class519 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class604.method3506(field618[--field626], 255);
            } else {
                var28 = arg1 ? field608 : field615;
            }
            if (arg0 == 1000) {
                field626 -= 4;
                var28.field7283 = field618[field626];
                var28.field7124 = field618[field626 + 1];
                int var29 = field618[field626 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field618[field626 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field7184 = (byte) var29;
                var28.field7256 = (byte) var30;
                class172.method1268(var28, -98);
                class369.method2205(var28, 46);
                if (var28.field7193 == -1) {
                    class152.method1197(var28.field7247, (byte) 123);
                }
                return;
            }
            if (arg0 == 1001) {
                field626 -= 4;
                var28.field7166 = field618[field626];
                var28.field7299 = field618[field626 + 1];
                var28.field7289 = 0;
                var28.field7215 = 0;
                int var31 = field618[field626 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field618[field626 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field7261 = (byte) var31;
                var28.field7287 = (byte) var32;
                class172.method1268(var28, -80);
                class369.method2205(var28, 46);
                if (var28.field7190 == 0) {
                    class597.method3483(false, false, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field618[--field626] == 1;
                if (var28.field7264 != var33) {
                    var28.field7264 = var33;
                    class172.method1268(var28, -34);
                }
                if (var28.field7193 == -1) {
                    class623.method3568((byte) 13, var28.field7247);
                }
                return;
            }
            if (arg0 == 1004) {
                field626 -= 2;
                var28.field7142 = field618[field626];
                var28.field7251 = field618[field626 + 1];
                class172.method1268(var28, -60);
                class369.method2205(var28, 46);
                if (var28.field7190 == 0) {
                    class597.method3483(false, false, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field7154 = field618[--field626] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class519 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class604.method3506(field618[--field626], 255);
            } else {
                var34 = arg1 ? field608 : field615;
            }
            if (arg0 == 1100) {
                field626 -= 2;
                var34.field7145 = field618[field626];
                if (var34.field7145 > var34.field7126 - var34.field7128) {
                    var34.field7145 = var34.field7126 - var34.field7128;
                }
                if (var34.field7145 < 0) {
                    var34.field7145 = 0;
                }
                var34.field7244 = field618[field626 + 1];
                if (var34.field7244 > var34.field7161 - var34.field7255) {
                    var34.field7244 = var34.field7161 - var34.field7255;
                }
                if (var34.field7244 < 0) {
                    var34.field7244 = 0;
                }
                class172.method1268(var34, -26);
                if (var34.field7193 == -1) {
                    class224.method1531((byte) -69, var34.field7247);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field7157 = field618[--field626];
                class172.method1268(var34, -119);
                if (var34.field7193 == -1) {
                    class290.method1828(var34.field7247, -15282);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field7230 = field618[--field626] == 1;
                class172.method1268(var34, -49);
                return;
            }
            if (arg0 == 1103) {
                var34.field7228 = field618[--field626];
                class172.method1268(var34, -43);
                return;
            }
            if (arg0 == 1104) {
                var34.field7158 = field618[--field626];
                class172.method1268(var34, -49);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field618[--field626];
                if (var34.field7246 != var35) {
                    var34.field7246 = var35;
                    class172.method1268(var34, -31);
                }
                if (var34.field7193 == -1) {
                    class121.method1063(var34.field7247, 20183);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field7254 = field618[--field626];
                class172.method1268(var34, -95);
                return;
            }
            if (arg0 == 1107) {
                var34.field7205 = field618[--field626] == 1;
                class172.method1268(var34, -54);
                return;
            }
            if (arg0 == 1108) {
                var34.field7146 = 1;
                var34.field7211 = field618[--field626];
                class172.method1268(var34, -95);
                if (var34.field7193 == -1) {
                    class87.method769(var34.field7247, false);
                }
                return;
            }
            if (arg0 == 1109) {
                field626 -= 6;
                var34.field7216 = field618[field626];
                var34.field7176 = field618[field626 + 1];
                var34.field7162 = field618[field626 + 2];
                var34.field7133 = field618[field626 + 3];
                var34.field7266 = field618[field626 + 4];
                var34.field7235 = field618[field626 + 5];
                class172.method1268(var34, -40);
                if (var34.field7193 == -1) {
                    class663.method3717(-125, var34.field7247);
                    class499.method2919(var34.field7247, 26956);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field618[--field626];
                if (var34.field7219 != var36) {
                    var34.field7219 = var36;
                    var34.field7275 = 0;
                    var34.field7152 = 1;
                    var34.field7258 = 0;
                    class98 var37 = var34.field7219 == -1 ? null : class168.field2552.method3287(99, var34.field7219);
                    if (var37 != null) {
                        class354.method2142(255, var34.field7275, var37);
                    }
                    class172.method1268(var34, -114);
                }
                if (var34.field7193 == -1) {
                    class576.method3392(5, var34.field7247);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field7225 = field618[--field626] == 1;
                class172.method1268(var34, -111);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field620[--field600];
                if (!var38.equals(var34.field7181)) {
                    var34.field7181 = var38;
                    class172.method1268(var34, -53);
                }
                if (var34.field7193 == -1) {
                    class358.method2166((byte) -9, var34.field7247);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field7131 = field618[--field626];
                class172.method1268(var34, -26);
                if (var34.field7193 == -1) {
                    class61.method625(var34.field7247, 25013);
                }
                return;
            }
            if (arg0 == 1114) {
                field626 -= 3;
                var34.field7285 = field618[field626];
                var34.field7164 = field618[field626 + 1];
                var34.field7165 = field618[field626 + 2];
                class172.method1268(var34, -122);
                return;
            }
            if (arg0 == 1115) {
                var34.field7297 = field618[--field626] == 1;
                class172.method1268(var34, -22);
                return;
            }
            if (arg0 == 1116) {
                var34.field7137 = field618[--field626];
                class172.method1268(var34, -71);
                return;
            }
            if (arg0 == 1117) {
                var34.field7290 = field618[--field626];
                class172.method1268(var34, -57);
                return;
            }
            if (arg0 == 1118) {
                var34.field7233 = field618[--field626] == 1;
                class172.method1268(var34, -59);
                return;
            }
            if (arg0 == 1119) {
                var34.field7222 = field618[--field626] == 1;
                class172.method1268(var34, -114);
                return;
            }
            if (arg0 == 1120) {
                field626 -= 2;
                var34.field7126 = field618[field626];
                var34.field7161 = field618[field626 + 1];
                class172.method1268(var34, -104);
                if (var34.field7190 == 0) {
                    class597.method3483(false, false, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field7141 = field618[--field626] == 1;
                class172.method1268(var34, -91);
                return;
            }
            if (arg0 == 1123) {
                var34.field7235 = field618[--field626];
                class172.method1268(var34, -37);
                if (var34.field7193 == -1) {
                    class663.method3717(-128, var34.field7247);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field618[--field626];
                var34.field7237 = var39 == 1;
                class172.method1268(var34, -76);
                return;
            }
            if (arg0 == 1125) {
                field626 -= 2;
                var34.field7294 = field618[field626];
                var34.field7180 = field618[field626 + 1];
                class172.method1268(var34, -28);
                return;
            }
            if (arg0 == 1126) {
                var34.field7213 = field618[--field626];
                class172.method1268(var34, -16);
                return;
            }
            if (arg0 == 1127) {
                field626 -= 2;
                int var40 = field618[field626];
                int var41 = field618[field626 + 1];
                class93 var42 = class498.field6854.method3434(var40, 10549);
                if (var42.field1331 != var41) {
                    var34.method3054(true, var41, var40);
                    return;
                }
                var34.method3046(10, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field618[--field626];
                String var44 = field620[--field600];
                class93 var45 = class498.field6854.method3434(var43, 10549);
                if (!var45.field1332.equals(var44)) {
                    var34.method3040(var43, var44, 114);
                    return;
                }
                var34.method3046(10, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field618[--field626];
                if (var34.field7190 != 5 && arg0 == 1129 || var34.field7190 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field7208 != var52) {
                    var34.field7208 = var52;
                    class172.method1268(var34, -72);
                }
                if (var34.field7193 == -1) {
                    class248.method1648(true, var34.field7247);
                }
                return;
            }
            if (arg0 == 1131) {
                field626 -= 3;
                int var46 = field618[field626];
                short var47 = (short) field618[field626 + 1];
                short var48 = (short) field618[field626 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method3044(var46, var48, -1, var47);
                    class172.method1268(var34, -114);
                    if (var34.field7193 == -1) {
                        class283.method1801(var34.field7247, (byte) 118, var46);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field626 -= 3;
                int var49 = field618[field626];
                short var50 = (short) field618[field626 + 1];
                short var51 = (short) field618[field626 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method3045(var50, var49, 0, var51);
                    class172.method1268(var34, -35);
                    if (var34.field7193 == -1) {
                        class387.method2330(var49, 0, var34.field7247);
                    }
                    return;
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class519 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class604.method3506(field618[--field626], 255);
            } else {
                var53 = arg1 ? field608 : field615;
            }
            class172.method1268(var53, -119);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field626 -= 2;
                int var54 = field618[field626];
                int var55 = field618[field626 + 1];
                if (var53.field7193 == -1) {
                    class320.method1940(var53.field7247, 9);
                    class663.method3717(-127, var53.field7247);
                    class499.method2919(var53.field7247, 26956);
                }
                if (var54 == -1) {
                    var53.field7146 = 1;
                    var53.field7211 = -1;
                    var53.field7129 = -1;
                    return;
                }
                var53.field7129 = var54;
                var53.field7132 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field7279 = true;
                } else {
                    var53.field7279 = false;
                }
                class42 var56 = class422.field5873.method2937((byte) -121, var54);
                var53.field7162 = var56.field510;
                var53.field7133 = var56.field559;
                var53.field7266 = var56.field545;
                var53.field7216 = var56.field542;
                var53.field7176 = var56.field523;
                var53.field7235 = var56.field524;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field7194 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field7194 = 1;
                } else {
                    var53.field7194 = 2;
                }
                if (var53.field7289 > 0) {
                    var53.field7235 = var53.field7235 * 32 / var53.field7289;
                    return;
                }
                if (var53.field7166 > 0) {
                    var53.field7235 = var53.field7235 * 32 / var53.field7166;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field7146 = 2;
                var53.field7211 = field618[--field626];
                if (var53.field7193 == -1) {
                    class87.method769(var53.field7247, false);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field7146 = 3;
                var53.field7211 = -1;
                if (var53.field7193 == -1) {
                    class87.method769(var53.field7247, false);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field7146 = 6;
                var53.field7211 = field618[--field626];
                if (var53.field7193 == -1) {
                    class87.method769(var53.field7247, false);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field7146 = 5;
                var53.field7211 = field618[--field626];
                if (var53.field7193 == -1) {
                    class87.method769(var53.field7247, false);
                }
                return;
            }
            if (arg0 == 1206) {
                field626 -= 4;
                var53.field7241 = field618[field626];
                var53.field7257 = field618[field626 + 1];
                var53.field7291 = field618[field626 + 2];
                var53.field7156 = field618[field626 + 3];
                class172.method1268(var53, -117);
                return;
            }
            if (arg0 == 1207) {
                field626 -= 2;
                var53.field7221 = field618[field626];
                var53.field7292 = field618[field626 + 1];
                class172.method1268(var53, -41);
                return;
            }
            if (arg0 == 1210) {
                field626 -= 4;
                var53.field7211 = field618[field626];
                var53.field7226 = field618[field626 + 1];
                if (field618[field626 + 2] == 1) {
                    var53.field7146 = 9;
                } else {
                    var53.field7146 = 8;
                }
                if (field618[field626 + 3] == 1) {
                    var53.field7279 = true;
                } else {
                    var53.field7279 = false;
                }
                if (var53.field7193 == -1) {
                    class87.method769(var53.field7247, false);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field7146 = 5;
                var53.field7211 = class541.field7492;
                var53.field7226 = 0;
                if (var53.field7193 == -1) {
                    class87.method769(var53.field7247, false);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class519 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class604.method3506(field618[--field626], 255);
            } else {
                var57 = arg1 ? field608 : field615;
            }
            if (arg0 == 1300) {
                int var58 = field618[--field626] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method3052(var58, field620[--field600], 0);
                    return;
                }
                field600--;
                return;
            }
            if (arg0 == 1301) {
                field626 -= 2;
                int var59 = field618[field626];
                int var60 = field618[field626 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field7192 = null;
                    return;
                }
                var57.field7192 = class153.method1203(0, var60, var59);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field618[--field626];
                if (class185.field2807 != var61 && class368.field5214 != var61 && class282.field4147 != var61) {
                    return;
                }
                var57.field7248 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field7144 = field618[--field626];
                return;
            }
            if (arg0 == 1304) {
                var57.field7209 = field618[--field626];
                return;
            }
            if (arg0 == 1305) {
                var57.field7123 = field620[--field600];
                return;
            }
            if (arg0 == 1306) {
                var57.field7160 = field620[--field600];
                return;
            }
            if (arg0 == 1307) {
                var57.field7178 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field7284 = field618[--field626];
                var57.field7173 = field618[--field626];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field618[--field626];
                int var63 = field618[--field626];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method3051(var63 - 1, var62, -115);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field7282 = field620[--field600];
                return;
            }
            if (arg0 == 1311) {
                var57.field7295 = field618[--field626];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field626 -= 3;
                    var64 = field618[field626] - 1;
                    var65 = field618[field626 + 1];
                    var66 = field618[field626 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field626 -= 2;
                    var64 = 10;
                    var65 = field618[field626];
                    var66 = field618[field626 + 1];
                }
                if (var57.field7163 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field7163 = new byte[11];
                    var57.field7186 = new byte[11];
                    var57.field7174 = new int[11];
                }
                var57.field7163[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field7238 = false;
                    for (int var67 = 0; var67 < var57.field7163.length; var67++) {
                        if (var57.field7163[var67] != 0) {
                            var57.field7238 = true;
                            break;
                        }
                    }
                } else {
                    var57.field7238 = true;
                }
                var57.field7186[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field7263 = field618[--field626];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class519 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class604.method3506(field618[--field626], 255);
            } else {
                var68 = arg1 ? field608 : field615;
            }
            if (arg0 == 1499) {
                var68.method3035((byte) -68);
                return;
            }
            String var69 = field620[--field600];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field618[--field626];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field618[--field626];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field620[--field600];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field602[--field630]);
                } else {
                    var72[var73] = Integer.valueOf(field618[--field626]);
                }
            }
            int var74 = field618[--field626];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field7196 = var72;
            } else if (arg0 == 1401) {
                var68.field7239 = var72;
            } else if (arg0 == 1402) {
                var68.field7224 = var72;
            } else if (arg0 == 1403) {
                var68.field7159 = var72;
            } else if (arg0 == 1404) {
                var68.field7253 = var72;
            } else if (arg0 == 1405) {
                var68.field7143 = var72;
            } else if (arg0 == 1406) {
                var68.field7202 = var72;
            } else if (arg0 == 1407) {
                var68.field7172 = var72;
                var68.field7286 = var70;
            } else if (arg0 == 1408) {
                var68.field7231 = var72;
            } else if (arg0 == 1409) {
                var68.field7139 = var72;
            } else if (arg0 == 1410) {
                var68.field7150 = var72;
            } else if (arg0 == 1411) {
                var68.field7240 = var72;
            } else if (arg0 == 1412) {
                var68.field7130 = var72;
            } else if (arg0 == 1414) {
                var68.field7250 = var72;
                var68.field7171 = var70;
            } else if (arg0 == 1415) {
                var68.field7288 = var72;
                var68.field7214 = var70;
            } else if (arg0 == 1416) {
                var68.field7252 = var72;
            } else if (arg0 == 1417) {
                var68.field7207 = var72;
            } else if (arg0 == 1418) {
                var68.field7197 = var72;
            } else if (arg0 == 1419) {
                var68.field7182 = var72;
            } else if (arg0 == 1420) {
                var68.field7272 = var72;
            } else if (arg0 == 1421) {
                var68.field7136 = var72;
            } else if (arg0 == 1422) {
                var68.field7274 = var72;
            } else if (arg0 == 1423) {
                var68.field7245 = var72;
            } else if (arg0 == 1424) {
                var68.field7281 = var72;
            } else if (arg0 == 1425) {
                var68.field7206 = var72;
            } else if (arg0 == 1426) {
                var68.field7262 = var72;
            } else if (arg0 == 1427) {
                var68.field7168 = var72;
            } else if (arg0 == 1428) {
                var68.field7260 = var72;
                var68.field7265 = var70;
            } else if (arg0 == 1429) {
                var68.field7277 = var72;
                var68.field7234 = var70;
            } else if (arg0 == 1430) {
                var68.field7271 = var72;
            } else if (arg0 == 1431) {
                var68.field7204 = var72;
            } else if (arg0 == 1432) {
                var68.field7210 = var72;
            }
            var68.field7140 = true;
            return;
        } else if (arg0 < 1600) {
            class519 var75 = arg1 ? field608 : field615;
            if (arg0 == 1500) {
                field618[field626++] = var75.field7191;
                return;
            }
            if (arg0 == 1501) {
                field618[field626++] = var75.field7151;
                return;
            }
            if (arg0 == 1502) {
                field618[field626++] = var75.field7128;
                return;
            }
            if (arg0 == 1503) {
                field618[field626++] = var75.field7255;
                return;
            }
            if (arg0 == 1504) {
                field618[field626++] = var75.field7264 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field618[field626++] = var75.field7223;
                return;
            }
            if (arg0 == 1506) {
                class519 var76 = class188.method1357(var75, (byte) 125);
                field618[field626++] = var76 == null ? -1 : var76.field7247;
                return;
            }
        } else if (arg0 < 1700) {
            class519 var77 = arg1 ? field608 : field615;
            if (arg0 == 1600) {
                field618[field626++] = var77.field7145;
                return;
            }
            if (arg0 == 1601) {
                field618[field626++] = var77.field7244;
                return;
            }
            if (arg0 == 1602) {
                field620[field600++] = var77.field7181;
                return;
            }
            if (arg0 == 1603) {
                field618[field626++] = var77.field7126;
                return;
            }
            if (arg0 == 1604) {
                field618[field626++] = var77.field7161;
                return;
            }
            if (arg0 == 1605) {
                field618[field626++] = var77.field7235;
                return;
            }
            if (arg0 == 1606) {
                field618[field626++] = var77.field7162;
                return;
            }
            if (arg0 == 1607) {
                field618[field626++] = var77.field7266;
                return;
            }
            if (arg0 == 1608) {
                field618[field626++] = var77.field7133;
                return;
            }
            if (arg0 == 1609) {
                field618[field626++] = var77.field7228;
                return;
            }
            if (arg0 == 1610) {
                field618[field626++] = var77.field7216;
                return;
            }
            if (arg0 == 1611) {
                field618[field626++] = var77.field7176;
                return;
            }
            if (arg0 == 1612) {
                field618[field626++] = var77.field7246;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field618[--field626];
                class93 var79 = class498.field6854.method3434(var78, 10549);
                if (var79.method789(37)) {
                    field620[field600++] = var77.method3042(var79.field1332, (byte) -124, var78);
                    return;
                }
                field618[field626++] = var77.method3037(var78, var79.field1331, 111);
                return;
            }
            if (arg0 == 1614) {
                field618[field626++] = var77.field7254;
                return;
            }
            if (arg0 == 2614) {
                field618[field626++] = var77.field7146 == 1 ? var77.field7211 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class519 var80 = arg1 ? field608 : field615;
            if (arg0 == 1700) {
                field618[field626++] = var80.field7129;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field7129 != -1) {
                    field618[field626++] = var80.field7132;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field618[field626++] = var80.field7193;
                return;
            }
        } else if (arg0 < 1900) {
            class519 var81 = arg1 ? field608 : field615;
            if (arg0 == 1800) {
                field618[field626++] = client.method885(var81).method1255((byte) 69);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field618[--field626];
                int var383 = var82 - 1;
                if (var81.field7178 != null && var383 < var81.field7178.length && var81.field7178[var383] != null) {
                    field620[field600++] = var81.field7178[var383];
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field7123 == null) {
                    field620[field600++] = "";
                    return;
                }
                field620[field600++] = var81.field7123;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class519 var381;
            if (arg0 >= 2000) {
                var381 = class604.method3506(field618[--field626], 255);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field608 : field615;
            }
            if (field631 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field7168 == null) {
                    return;
                }
                class511 var382 = new class511();
                var382.field7023 = var381;
                var382.field7021 = var381.field7168;
                var382.field7022 = field631 + 1;
                class37.field441.method3728((byte) 105, var382);
                return;
            }
        } else if (arg0 < 2600) {
            class519 var83 = class604.method3506(field618[--field626], 255);
            if (arg0 == 2500) {
                field618[field626++] = var83.field7191;
                return;
            }
            if (arg0 == 2501) {
                field618[field626++] = var83.field7151;
                return;
            }
            if (arg0 == 2502) {
                field618[field626++] = var83.field7128;
                return;
            }
            if (arg0 == 2503) {
                field618[field626++] = var83.field7255;
                return;
            }
            if (arg0 == 2504) {
                field618[field626++] = var83.field7264 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field618[field626++] = var83.field7223;
                return;
            }
            if (arg0 == 1506) {
                class519 var84 = class188.method1357(var83, (byte) 112);
                field618[field626++] = var84 == null ? -1 : var84.field7247;
                return;
            }
        } else if (arg0 < 2700) {
            class519 var85 = class604.method3506(field618[--field626], 255);
            if (arg0 == 2600) {
                field618[field626++] = var85.field7145;
                return;
            }
            if (arg0 == 2601) {
                field618[field626++] = var85.field7244;
                return;
            }
            if (arg0 == 2602) {
                field620[field600++] = var85.field7181;
                return;
            }
            if (arg0 == 2603) {
                field618[field626++] = var85.field7126;
                return;
            }
            if (arg0 == 2604) {
                field618[field626++] = var85.field7161;
                return;
            }
            if (arg0 == 2605) {
                field618[field626++] = var85.field7235;
                return;
            }
            if (arg0 == 2606) {
                field618[field626++] = var85.field7162;
                return;
            }
            if (arg0 == 2607) {
                field618[field626++] = var85.field7266;
                return;
            }
            if (arg0 == 2608) {
                field618[field626++] = var85.field7133;
                return;
            }
            if (arg0 == 2609) {
                field618[field626++] = var85.field7228;
                return;
            }
            if (arg0 == 2610) {
                field618[field626++] = var85.field7216;
                return;
            }
            if (arg0 == 2611) {
                field618[field626++] = var85.field7176;
                return;
            }
            if (arg0 == 2612) {
                field618[field626++] = var85.field7246;
                return;
            }
            if (arg0 == 2613) {
                field618[field626++] = var85.field7254;
                return;
            }
            if (arg0 == 2614) {
                field618[field626++] = var85.field7146 == 1 ? var85.field7211 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class519 var86 = class604.method3506(field618[--field626], 255);
                field618[field626++] = var86.field7129;
                return;
            }
            if (arg0 == 2701) {
                class519 var87 = class604.method3506(field618[--field626], 255);
                if (var87.field7129 != -1) {
                    field618[field626++] = var87.field7132;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field618[--field626];
                class27 var89 = (class27) class37.field437.method4253((long) var88, -1);
                if (var89 != null) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class519 var90 = class604.method3506(field618[--field626], 255);
                if (var90.field7170 == null) {
                    field618[field626++] = 0;
                    return;
                }
                int var91 = var90.field7170.length;
                for (int var92 = 0; var92 < var90.field7170.length; var92++) {
                    if (var90.field7170[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field618[field626++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field626 -= 2;
                int var93 = field618[field626];
                int var94 = field618[field626 + 1];
                class27 var95 = (class27) class37.field437.method4253((long) var93, -1);
                if (var95 != null && var95.field284 == var94) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class519 var96 = class604.method3506(field618[--field626], 255);
            if (arg0 == 2800) {
                field618[field626++] = client.method885(var96).method1255((byte) 126);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field618[--field626];
                int var384 = var97 - 1;
                if (var96.field7178 != null && var384 < var96.field7178.length && var96.field7178[var384] != null) {
                    field620[field600++] = var96.field7178[var384];
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field7123 == null) {
                    field620[field600++] = "";
                    return;
                }
                field620[field600++] = var96.field7123;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field620[--field600];
                class402.method2388((byte) 56, var98);
                return;
            }
            if (arg0 == 3101) {
                field626 -= 2;
                class673.method3772(field618[field626], field618[field626 + 1], -16287, class719.field10041);
                return;
            }
            if (arg0 == 3103) {
                class47.method362(-1, true);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field620[--field600];
                int var100 = 0;
                if (class256.method1685(var99, (byte) -105)) {
                    var100 = class185.method1340(var99, (byte) 112);
                }
                field605++;
                class302 var101 = class582.method3419(class251.field3605, (byte) 126, class626.field8901);
                var101.field4341.method2548(var100, (byte) -104);
                class501.method2928(0, var101);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field620[--field600];
                field611++;
                class302 var103 = class582.method3419(class27.field280, (byte) 126, class626.field8901);
                var103.field4341.method2524(false, var102.length() + 1);
                var103.field4341.method2566(-2, var102);
                class501.method2928(0, var103);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field620[--field600];
                field619++;
                class302 var105 = class582.method3419(class762.field10571, (byte) 127, class626.field8901);
                var105.field4341.method2524(false, var104.length() + 1);
                var105.field4341.method2566(-2, var104);
                class501.method2928(0, var105);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field618[--field626];
                String var107 = field620[--field600];
                class118.method1041(27961, var107, var106);
                return;
            }
            if (arg0 == 3108) {
                field626 -= 3;
                int var108 = field618[field626];
                int var109 = field618[field626 + 1];
                int var110 = field618[field626 + 2];
                class519 var111 = class604.method3506(var110, 255);
                class370.method2207(var108, var111, false, var109);
                return;
            }
            if (arg0 == 3109) {
                field626 -= 2;
                int var112 = field618[field626];
                int var113 = field618[field626 + 1];
                class519 var114 = arg1 ? field608 : field615;
                class370.method2207(var112, var114, false, var113);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field618[--field626];
                field609++;
                class302 var116 = class582.method3419(class120.field2044, (byte) 126, class626.field8901);
                var116.field4341.method2546(true, var115);
                class501.method2928(0, var116);
                return;
            }
            if (arg0 == 3111) {
                field626 -= 2;
                int var117 = field618[field626];
                int var118 = field618[field626 + 1];
                class27 var119 = (class27) class37.field437.method4253((long) var117, -1);
                if (var119 != null) {
                    class251.method1663(false, true, var119, var119.field284 != var118);
                }
                class33.method271(var118, true, 3, (byte) -104, var117);
                return;
            }
            if (arg0 == 3112) {
                field626--;
                int var120 = field618[field626];
                class27 var121 = (class27) class37.field437.method4253((long) var120, -1);
                if (var121 != null && var121.field285 == 3) {
                    class251.method1663(false, true, var121, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class588.method3446(field620[--field600], (byte) 117);
                return;
            }
            if (arg0 == 3114) {
                field626 -= 2;
                int var122 = field618[field626];
                int var123 = field618[field626 + 1];
                String var124 = field620[--field600];
                class437.method2608("", var124, var122, "", (byte) 120, "", var123);
                return;
            }
            if (arg0 == 3115) {
                field626 -= 11;
                class565[] var125 = class551.method3180(-1);
                class345[] var126 = class91.method777(true);
                class121.method1058(field618[field626 + 3], -24978, field618[field626 + 6], var126[field618[field626 + 1]], field618[field626 + 9], var125[field618[field626]], field618[field626 + 8], field618[field626 + 10], field618[field626 + 5], field618[field626 + 4], field618[field626 + 2], field618[field626 + 7]);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field618[--field626];
                field605++;
                class302 var128 = class582.method3419(class728.field10156, (byte) 126, class626.field8901);
                var128.field4341.method2546(true, var127);
                class501.method2928(0, var128);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field620[--field600];
                class302 var130 = class582.method3419(class707.field9899, (byte) 127, class626.field8901);
                var130.field4341.method2524(false, var129.length() + 1);
                var130.field4341.method2566(-2, var129);
                class501.method2928(0, var130);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field626 -= 3;
                class588.method3448(field618[field626], field618[field626 + 1], 255, 256, -1, field618[field626 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class528.method3086(50, field618[--field626], 255, 10);
                return;
            }
            if (arg0 == 3202) {
                field626 -= 2;
                class133.method1106(255, field618[field626], field618[field626 + 1], -13);
                return;
            }
            if (arg0 == 3203) {
                field626 -= 4;
                class588.method3448(field618[field626], field618[field626 + 1], field618[field626 + 3], 256, -1, field618[field626 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field626 -= 3;
                class528.method3086(field618[field626 + 2], field618[field626], field618[field626 + 1], 18);
                return;
            }
            if (arg0 == 3205) {
                field626 -= 3;
                class133.method1106(field618[field626 + 2], field618[field626], field618[field626 + 1], -13);
                return;
            }
            if (arg0 == 3206) {
                field626 -= 4;
                class75.method691(field618[field626 + 1], field618[field626 + 3], field618[field626], field618[field626 + 2], 256, false, 0);
                return;
            }
            if (arg0 == 3207) {
                field626 -= 4;
                class75.method691(field618[field626 + 1], field618[field626 + 3], field618[field626], field618[field626 + 2], 256, true, 0);
                return;
            }
            if (arg0 == 3208) {
                field626 -= 5;
                class588.method3448(field618[field626], field618[field626 + 1], field618[field626 + 3], field618[field626 + 4], -1, field618[field626 + 2]);
                return;
            }
            if (arg0 == 3209) {
                field626 -= 5;
                class75.method691(field618[field626 + 1], field618[field626 + 3], field618[field626], field618[field626 + 2], field618[field626 + 4], false, 0);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field618[field626++] = class594.field8494;
                return;
            }
            if (arg0 == 3301) {
                field626 -= 2;
                int var131 = field618[field626];
                int var132 = field618[field626 + 1];
                field618[field626++] = class522.method3067(72, var131, false, var132);
                return;
            }
            if (arg0 == 3302) {
                field626 -= 2;
                int var133 = field618[field626];
                int var134 = field618[field626 + 1];
                field618[field626++] = class338.method2069(var134, var133, false, (byte) 111);
                return;
            }
            if (arg0 == 3303) {
                field626 -= 2;
                int var135 = field618[field626];
                int var136 = field618[field626 + 1];
                field618[field626++] = class203.method1434(var135, var136, 222, false);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field618[--field626];
                field618[field626++] = class510.field7010.method2903(var137, (byte) 107).field9022;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field618[--field626];
                field618[field626++] = class500.field6870[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field618[--field626];
                field618[field626++] = class133.field2223[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field618[--field626];
                field618[field626++] = class150.field2406[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class719.field10041.field10361;
                int var142 = (class719.field10041.field10347 >> 9) + class222.field3266;
                int var143 = (class719.field10041.field10350 >> 9) + class697.field9798;
                field618[field626++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field618[--field626];
                field618[field626++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field618[--field626];
                field618[field626++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field618[--field626];
                field618[field626++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field618[field626++] = class362.field5127 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field626 -= 2;
                int var147 = field618[field626];
                int var148 = field618[field626 + 1];
                field618[field626++] = class522.method3067(72, var147, true, var148);
                return;
            }
            if (arg0 == 3314) {
                field626 -= 2;
                int var149 = field618[field626];
                int var150 = field618[field626 + 1];
                field618[field626++] = class338.method2069(var150, var149, true, (byte) 109);
                return;
            }
            if (arg0 == 3315) {
                field626 -= 2;
                int var151 = field618[field626];
                int var152 = field618[field626 + 1];
                field618[field626++] = class203.method1434(var151, var152, 222, true);
                return;
            }
            if (arg0 == 3316) {
                if (class778.field10675 >= 2) {
                    field618[field626++] = class778.field10675;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field618[field626++] = class609.field8651;
                return;
            }
            if (arg0 == 3318) {
                field618[field626++] = class472.field6424.field5598;
                return;
            }
            if (arg0 == 3321) {
                field618[field626++] = class379.field5320;
                return;
            }
            if (arg0 == 3322) {
                field618[field626++] = class728.field10163;
                return;
            }
            if (arg0 == 3323) {
                if (class81.field1201 >= 5 && class81.field1201 <= 9) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class81.field1201 >= 5 && class81.field1201 <= 9) {
                    field618[field626++] = class81.field1201;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field618[field626++] = class29.field315 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field618[field626++] = class719.field10041.field249;
                return;
            }
            if (arg0 == 3327) {
                field618[field626++] = class719.field10041.field207 != null && class719.field10041.field207.field4184 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field618[field626++] = class419.field5810 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field618[--field626];
                field618[field626++] = class430.method2510(-115, var153, false);
                return;
            }
            if (arg0 == 3331) {
                field626 -= 2;
                int var154 = field618[field626];
                int var155 = field618[field626 + 1];
                field618[field626++] = class386.method2325(false, var154, false, var155, false);
                return;
            }
            if (arg0 == 3332) {
                field626 -= 2;
                int var156 = field618[field626];
                int var157 = field618[field626 + 1];
                field618[field626++] = class386.method2325(true, var156, false, var157, false);
                return;
            }
            if (arg0 == 3333) {
                field618[field626++] = class347.field4939;
                return;
            }
            if (arg0 == 3335) {
                field618[field626++] = class423.field5892;
                return;
            }
            if (arg0 == 3336) {
                field626 -= 4;
                int var158 = field618[field626];
                int var159 = field618[field626 + 1];
                int var160 = field618[field626 + 2];
                int var161 = field618[field626 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field618[field626++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field618[field626++] = class276.field3953;
                return;
            }
            if (arg0 == 3338) {
                field618[field626++] = class686.method3874((byte) -127);
                return;
            }
            if (arg0 == 3339) {
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field618[field626++] = class531.field7395 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field618[field626++] = class245.field3515 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field618[field626++] = class754.field10496.method3065(-28062);
                return;
            }
            if (arg0 == 3343) {
                field618[field626++] = class754.field10496.method3066(72);
                return;
            }
            if (arg0 == 3344) {
                field620[field600++] = class55.method605(-31252);
                return;
            }
            if (arg0 == 3345) {
                field620[field600++] = class417.method2459(-11189);
                return;
            }
            if (arg0 == 3346) {
                field618[field626++] = class253.method1675(0);
                return;
            }
            if (arg0 == 3347) {
                field618[field626++] = class538.field7471;
                return;
            }
            if (arg0 == 3349) {
                field618[field626++] = class719.field10041.field4067.method1856(0) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field626 -= 2;
                int var165 = field618[field626];
                int var166 = field618[field626 + 1];
                class584 var167 = class433.field6045.method3759(var165, -126);
                field620[field600++] = var167.method3429((byte) -91, var166);
                return;
            }
            if (arg0 == 3408) {
                field626 -= 4;
                int var168 = field618[field626];
                int var169 = field618[field626 + 1];
                int var170 = field618[field626 + 2];
                int var171 = field618[field626 + 3];
                class584 var172 = class433.field6045.method3759(var170, -122);
                if (var172.field8392 == var168 && var172.field8395 == var169) {
                    if (var169 == 115) {
                        field620[field600++] = var172.method3429((byte) -91, var171);
                        return;
                    }
                    field618[field626++] = var172.method3428(var171, -6);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field626 -= 3;
                int var173 = field618[field626];
                int var174 = field618[field626 + 1];
                int var175 = field618[field626 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class584 var176 = class433.field6045.method3759(var174, 119);
                if (var176.field8395 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field618[field626++] = var176.method3424(false, var175) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field618[--field626];
                String var178 = field620[--field600];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class584 var179 = class433.field6045.method3759(var177, -116);
                if (var179.field8395 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field618[field626++] = var179.method3425((byte) 113, var178) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field618[--field626];
                class584 var181 = class433.field6045.method3759(var180, 92);
                field618[field626++] = var181.field8397.method4257(127);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class576.field8307 == 0) {
                    field618[field626++] = -2;
                    return;
                }
                if (class576.field8307 == 1) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = class381.field5340;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field618[--field626];
                if (class576.field8307 == 2 && var182 < class381.field5340) {
                    field620[field600++] = class586.field8428[var182];
                    if (class713.field9952[var182] != null) {
                        field620[field600++] = class713.field9952[var182];
                        return;
                    }
                    field620[field600++] = "";
                    return;
                }
                field620[field600++] = "";
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field618[--field626];
                if (class576.field8307 == 2 && var183 < class381.field5340) {
                    field618[field626++] = class276.field3930[var183];
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field618[--field626];
                if (class576.field8307 == 2 && var184 < class381.field5340) {
                    field618[field626++] = class724.field10090[var184];
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field620[--field600];
                int var186 = field618[--field626];
                class609.method3529((byte) 104, var185, var186);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field620[--field600];
                class555.method3204(27900, var187);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field620[--field600];
                class108.method871(var188, 106);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field620[--field600];
                class632.method3611(77, false, var189);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field620[--field600];
                class741.method4078(-44, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field620[--field600];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field618[field626++] = class124.method1074(var191, -2779) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field618[--field626];
                if (class576.field8307 == 2 && var192 < class381.field5340) {
                    field620[field600++] = class322.field4583[var192];
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class193.field2893 != null) {
                    field620[field600++] = class380.method2293(false, class193.field2893);
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class193.field2893 != null) {
                    field618[field626++] = class92.field1324;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field618[--field626];
                if (class193.field2893 != null && var193 < class92.field1324) {
                    field620[field600++] = class288.field4217[var193].field9314;
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field618[--field626];
                if (class193.field2893 != null && var194 < class92.field1324) {
                    field618[field626++] = class288.field4217[var194].field9316;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field618[--field626];
                if (class193.field2893 != null && var195 < class92.field1324) {
                    field618[field626++] = class288.field4217[var195].field9308;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field618[field626++] = class668.field9392;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field620[--field600];
                class36.method279(var196, -17462);
                return;
            }
            if (arg0 == 3618) {
                field618[field626++] = class275.field3855;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field620[--field600];
                class229.method1554((byte) -119, var197);
                return;
            }
            if (arg0 == 3620) {
                class380.method2288(90);
                return;
            }
            if (arg0 == 3621) {
                if (class576.field8307 == 0) {
                    field618[field626++] = -1;
                    return;
                }
                field618[field626++] = class458.field6267;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field618[--field626];
                if (class576.field8307 != 0 && var198 < class458.field6267) {
                    field620[field600++] = class263.field3721[var198];
                    if (class581.field8364[var198] != null) {
                        field620[field600++] = class581.field8364[var198];
                        return;
                    }
                    field620[field600++] = "";
                    return;
                }
                field620[field600++] = "";
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field620[--field600];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field618[field626++] = class439.method2611(8348, var199) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field618[--field626];
                if (class288.field4217 != null && var200 < class92.field1324 && class288.field4217[var200].field9309.equalsIgnoreCase(class719.field10041.field212)) {
                    field618[field626++] = 1;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class87.field1295 != null) {
                    field620[field600++] = class87.field1295;
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field618[--field626];
                if (class193.field2893 != null && var201 < class92.field1324) {
                    field620[field600++] = class288.field4217[var201].field9315;
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field618[--field626];
                if (class576.field8307 == 2 && var202 >= 0 && var202 < class381.field5340) {
                    field618[field626++] = class729.field10167[var202] ? 1 : 0;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field620[--field600];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field618[field626++] = class460.method2685(-1, var203);
                return;
            }
            if (arg0 == 3629) {
                field618[field626++] = class363.field5166;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field620[--field600];
                class632.method3611(103, true, var204);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field618[--field626];
                field618[field626++] = class217.field3164[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field618[--field626];
                if (class193.field2893 != null && var206 < class92.field1324) {
                    field620[field600++] = class288.field4217[var206].field9309;
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field618[--field626];
                if (class576.field8307 != 0 && var207 < class458.field6267) {
                    field620[field600++] = class460.field6286[var207];
                    return;
                }
                field620[field600++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class587.field8438 != null) {
                    field618[field626++] = 1;
                    field603 = class587.field8438;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class723.field10086 != null) {
                    field618[field626++] = 1;
                    field603 = class723.field10086;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field620[field600++] = field603.field702;
                return;
            }
            if (arg0 == 3703) {
                field618[field626++] = field603.field725 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field618[field626++] = field603.field690;
                return;
            }
            if (arg0 == 3705) {
                field618[field626++] = field603.field693;
                return;
            }
            if (arg0 == 3706) {
                field618[field626++] = field603.field688;
                return;
            }
            if (arg0 == 3707) {
                field618[field626++] = field603.field710;
                return;
            }
            if (arg0 == 3709) {
                field618[field626++] = field603.field722;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field618[--field626];
                field620[field600++] = field603.field689[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field618[--field626];
                field618[field626++] = field603.field694[var209];
                return;
            }
            if (arg0 == 3712) {
                field618[field626++] = field603.field700;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field618[--field626];
                field620[field600++] = field603.field719[var210];
                return;
            }
            if (arg0 == 3714) {
                field626 -= 3;
                int var211 = field618[field626];
                int var212 = field618[field626 + 1];
                int var213 = field618[field626 + 2];
                field618[field626++] = field603.method404(var212, var211, (byte) 41, var213);
                return;
            }
            if (arg0 == 3715) {
                field618[field626++] = field603.field718;
                return;
            }
            if (arg0 == 3716) {
                field618[field626++] = field603.field721;
                return;
            }
            if (arg0 == 3750) {
                if (class138.field2285 != null) {
                    field618[field626++] = 1;
                    field614 = class138.field2285;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class274.field3846 != null) {
                    field618[field626++] = 1;
                    field614 = class274.field3846;
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field620[field600++] = field614.field6331;
                return;
            }
            if (arg0 == 3753) {
                field618[field626++] = field614.field6332;
                return;
            }
            if (arg0 == 3754) {
                field618[field626++] = field614.field6342;
                return;
            }
            if (arg0 == 3755) {
                field618[field626++] = field614.field6344;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field618[--field626];
                field620[field600++] = field614.field6336[var214].field470;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field618[--field626];
                field618[field626++] = field614.field6336[var215].field473;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field618[--field626];
                field618[field626++] = field614.field6336[var216].field469;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field618[--field626];
                class400.method2375(field614 == class274.field3846, -123, var217);
                return;
            }
            if (arg0 == 3760) {
                field618[field626++] = field614.method2717((byte) 127, field620[--field600]);
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field618[--field626];
                field618[field626++] = class256.field3661[var218].method3991((byte) 41);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field618[--field626];
                field618[field626++] = class256.field3661[var219].field10009;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field618[--field626];
                field618[field626++] = class256.field3661[var220].field10010;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field618[--field626];
                field618[field626++] = class256.field3661[var221].field10008;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field618[--field626];
                field618[field626++] = class256.field3661[var222].field10004;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field618[--field626];
                field618[field626++] = class256.field3661[var223].field10000;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field618[--field626];
                int var225 = class256.field3661[var224].method3987(false);
                field618[field626++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field618[--field626];
                int var227 = class256.field3661[var226].method3987(false);
                field618[field626++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field618[--field626];
                int var229 = class256.field3661[var228].method3987(false);
                field618[field626++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field618[--field626];
                int var231 = class256.field3661[var230].method3987(false);
                field618[field626++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field626 -= 2;
                int var232 = field618[field626];
                int var233 = field618[field626 + 1];
                field618[field626++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field626 -= 2;
                int var234 = field618[field626];
                int var235 = field618[field626 + 1];
                field618[field626++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field626 -= 2;
                int var236 = field618[field626];
                int var237 = field618[field626 + 1];
                field618[field626++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field626 -= 2;
                int var238 = field618[field626];
                int var239 = field618[field626 + 1];
                field618[field626++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field618[--field626];
                field618[field626++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field618[--field626];
                field618[field626++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field626 -= 5;
                int var242 = field618[field626];
                int var243 = field618[field626 + 1];
                int var244 = field618[field626 + 2];
                int var245 = field618[field626 + 3];
                int var246 = field618[field626 + 4];
                field618[field626++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field626 -= 2;
                long var247 = (long) field618[field626];
                long var249 = (long) field618[field626 + 1];
                field618[field626++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field626 -= 2;
                int var251 = field618[field626];
                int var252 = field618[field626 + 1];
                field618[field626++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field626 -= 2;
                int var253 = field618[field626];
                int var254 = field618[field626 + 1];
                field618[field626++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field626 -= 2;
                int var255 = field618[field626];
                int var256 = field618[field626 + 1];
                field618[field626++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field626 -= 2;
                int var257 = field618[field626];
                int var258 = field618[field626 + 1];
                field618[field626++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field626 -= 2;
                int var259 = field618[field626];
                int var260 = field618[field626 + 1];
                if (var259 == 0) {
                    field618[field626++] = 0;
                    return;
                }
                field618[field626++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field626 -= 2;
                int var261 = field618[field626];
                int var262 = field618[field626 + 1];
                if (var261 == 0) {
                    field618[field626++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field618[field626++] = Integer.MAX_VALUE;
                    return;
                }
                field618[field626++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field626 -= 2;
                int var263 = field618[field626];
                int var264 = field618[field626 + 1];
                field618[field626++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field626 -= 2;
                int var265 = field618[field626];
                int var266 = field618[field626 + 1];
                field618[field626++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field626 -= 2;
                int var267 = field618[field626];
                int var268 = field618[field626 + 1];
                field618[field626++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field626 -= 2;
                int var269 = field618[field626];
                int var270 = field618[field626 + 1];
                field618[field626++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field626 -= 3;
                long var271 = (long) field618[field626];
                long var273 = (long) field618[field626 + 1];
                long var275 = (long) field618[field626 + 2];
                field618[field626++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field626 -= 2;
                int var277 = field618[field626];
                int var278 = field618[field626 + 1];
                if (var277 > 700 || var278 > 700) {
                    field618[field626++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field618[field626++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field618[--field626];
                field618[field626++] = class621.field8768[class314.method1915((byte) 105, var281) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field620[--field600];
                int var283 = field618[--field626];
                field620[field600++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field600 -= 2;
                String var284 = field620[field600];
                String var285 = field620[field600 + 1];
                field620[field600++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field620[--field600];
                int var287 = field618[--field626];
                field620[field600++] = var286 + class193.method1376(var287, 16, true);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field620[--field600];
                field620[field600++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field620[field600++] = class364.method2194(true, class423.field5892, class706.method3946(field618[--field626], -101));
                return;
            }
            if (arg0 == 4105) {
                field600 -= 2;
                String var289 = field620[field600];
                String var290 = field620[field600 + 1];
                if (class719.field10041.field207 != null && class719.field10041.field207.field4184) {
                    field620[field600++] = var290;
                    return;
                }
                field620[field600++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field618[--field626];
                field620[field600++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field600 -= 2;
                field618[field626++] = class324.method1956(field620[field600 + 1], 0, class423.field5892, field620[field600]);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field620[--field600];
                field626 -= 2;
                int var293 = field618[field626];
                int var294 = field618[field626 + 1];
                class470 var295 = class119.method1053(class77.field1161, -6394, 0, var294);
                field618[field626++] = var295.method2750(-9233, var292, class581.field8365, var293);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field620[--field600];
                field626 -= 2;
                int var297 = field618[field626];
                int var298 = field618[field626 + 1];
                class470 var299 = class119.method1053(class77.field1161, -6394, 0, var298);
                field618[field626++] = var299.method2744(var297, var296, class581.field8365, -126);
                return;
            }
            if (arg0 == 4110) {
                field600 -= 2;
                String var300 = field620[field600];
                String var301 = field620[field600 + 1];
                if (field618[--field626] == 1) {
                    field620[field600++] = var300;
                    return;
                }
                field620[field600++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field620[--field600];
                field620[field600++] = class326.method1978(var302, false);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field620[--field600];
                int var304 = field618[--field626];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field620[field600++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field618[--field626];
                field618[field626++] = method347((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field618[--field626];
                field618[field626++] = class355.method2143((byte) -105, (char) var306) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field618[--field626];
                field618[field626++] = class353.method2141(true, (char) var307) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field618[--field626];
                field618[field626++] = class441.method2614((char) var308, (byte) 16) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field620[--field600];
                if (var309 != null) {
                    field618[field626++] = var309.length();
                    return;
                }
                field618[field626++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field620[--field600];
                field626 -= 2;
                int var311 = field618[field626];
                int var312 = field618[field626 + 1];
                field620[field600++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field620[--field600];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field620[field600++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field620[--field600];
                field626 -= 2;
                int var319 = field618[field626];
                int var320 = field618[field626 + 1];
                field618[field626++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field600 -= 2;
                String var321 = field620[field600];
                String var322 = field620[field600 + 1];
                int var323 = field618[--field626];
                field618[field626++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field618[--field626];
                field618[field626++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field618[--field626];
                field618[field626++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field618[--field626] != 0;
                int var327 = field618[--field626];
                field620[field600++] = class535.method3109((long) var327, class423.field5892, 0, (byte) -17, var326);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field620[--field600];
                int var329 = field618[--field626];
                class470 var330 = class119.method1053(class77.field1161, -6394, 0, var329);
                field618[field626++] = var330.method2746(var328, class581.field8365, true);
                return;
            }
            if (arg0 == 4126) {
                field620[field600++] = class213.method1472(false, (long) field618[--field626] * 60000L, true, class423.field5892) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field602[--field630];
                field620[field600++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field618[--field626];
                field620[field600++] = class422.field5873.method2937((byte) -32, var333).field554;
                return;
            }
            if (arg0 == 4201) {
                field626 -= 2;
                int var334 = field618[field626];
                int var335 = field618[field626 + 1];
                class42 var336 = class422.field5873.method2937((byte) -61, var334);
                if (var335 >= 1 && var335 <= 5 && var336.field568[var335 - 1] != null) {
                    field620[field600++] = var336.field568[var335 - 1];
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 4202) {
                field626 -= 2;
                int var337 = field618[field626];
                int var338 = field618[field626 + 1];
                class42 var339 = class422.field5873.method2937((byte) -47, var337);
                if (var338 >= 1 && var338 <= 5 && var339.field486[var338 - 1] != null) {
                    field620[field600++] = var339.field486[var338 - 1];
                    return;
                }
                field620[field600++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field618[--field626];
                field618[field626++] = class422.field5873.method2937((byte) -14, var340).field556;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field618[--field626];
                field618[field626++] = class422.field5873.method2937((byte) -59, var341).field572 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field618[--field626];
                class42 var343 = class422.field5873.method2937((byte) -113, var342);
                if (var343.field528 == -1 && var343.field571 >= 0) {
                    field618[field626++] = var343.field571;
                    return;
                }
                field618[field626++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field618[--field626];
                class42 var345 = class422.field5873.method2937((byte) -75, var344);
                if (var345.field528 >= 0 && var345.field571 >= 0) {
                    field618[field626++] = var345.field571;
                    return;
                }
                field618[field626++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field618[--field626];
                field618[field626++] = class422.field5873.method2937((byte) -122, var346).field497 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field626 -= 2;
                int var347 = field618[field626];
                int var348 = field618[field626 + 1];
                class93 var349 = class498.field6854.method3434(var348, 10549);
                if (var349.method789(77)) {
                    field620[field600++] = class422.field5873.method2937((byte) -38, var347).method315(var348, var349.field1332, -93);
                    return;
                }
                field618[field626++] = class422.field5873.method2937((byte) -86, var347).method308(var348, (byte) 88, var349.field1331);
                return;
            }
            if (arg0 == 4209) {
                field626 -= 2;
                int var350 = field618[field626];
                int var351 = field618[field626 + 1] - 1;
                class42 var352 = class422.field5873.method2937((byte) -81, var350);
                if (var352.field501 == var351) {
                    field618[field626++] = var352.field491;
                    return;
                }
                if (var352.field564 == var351) {
                    field618[field626++] = var352.field570;
                    return;
                }
                field618[field626++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field620[--field600];
                int var354 = field618[--field626];
                class599.method3493(var353, false, var354 == 1);
                field618[field626++] = class217.field3162;
                return;
            }
            if (arg0 == 4211) {
                if (class781.field10703 != null && class144.field2334 < class217.field3162) {
                    field618[field626++] = class781.field10703[class144.field2334++] & 0xFFFF;
                    return;
                }
                field618[field626++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class144.field2334 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field618[--field626];
                field618[field626++] = class422.field5873.method2937((byte) -105, var355).field565;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field620[--field600];
                field626 -= 3;
                int var357 = field618[field626];
                int var358 = field618[field626 + 1];
                int var359 = field618[field626 + 2];
                class221.method1520(var357 == 1, var356, var358, -65, var359);
                field618[field626++] = class217.field3162;
                return;
            }
            if (arg0 == 4215) {
                field600 -= 2;
                field626 -= 2;
                String var360 = field620[field600];
                int var361 = field618[field626];
                int var362 = field618[field626 + 1];
                String var363 = field620[field600 + 1];
                class183.method1323(-101, var360, var361 == 1, var363, var362);
                field618[field626++] = class217.field3162;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field626 -= 2;
                int var364 = field618[field626];
                int var365 = field618[field626 + 1];
                class93 var366 = class498.field6854.method3434(var365, 10549);
                if (var366.method789(46)) {
                    field620[field600++] = class677.field9511.method3700(32501, var364).method1302((byte) -95, var365, var366.field1332);
                    return;
                }
                field618[field626++] = class677.field9511.method3700(32501, var364).method1308(122, var366.field1331, var365);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field626 -= 2;
                int var367 = field618[field626];
                int var368 = field618[field626 + 1];
                class93 var369 = class498.field6854.method3434(var368, 10549);
                if (var369.method789(33)) {
                    field620[field600++] = class312.field4418.method369((byte) 126, var367).method2448((byte) 38, var369.field1332, var368);
                    return;
                }
                field618[field626++] = class312.field4418.method369((byte) 126, var367).method2450(var369.field1331, -40, var368);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field626 -= 2;
                int var370 = field618[field626];
                int var371 = field618[field626 + 1];
                class93 var372 = class498.field6854.method3434(var371, 10549);
                if (var372.method789(108)) {
                    field620[field600++] = class233.field3382.method3415(var370, false).method1697(var372.field1332, false, var371);
                    return;
                }
                field618[field626++] = class233.field3382.method3415(var370, false).method1696(var371, var372.field1331, true);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field618[--field626];
                class31 var374 = class150.field2404.method1774(var373, (byte) 77);
                if (var374.field354 != null && var374.field354.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field350[0];
                    for (int var377 = 1; var377 < var374.field354.length; var377++) {
                        if (var374.field350[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field350[var377];
                        }
                    }
                    field618[field626++] = var374.field354[var375];
                    return;
                }
                field618[field626++] = var374.field390;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field618[field626++] = class523.field7330 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field620[--field600];
                if (class141.field2306 == 7 && class373.field5243 == 0) {
                    if (var378.length() > 20) {
                        class353.field5018 = -4;
                        return;
                    }
                    class353.field5018 = -1;
                    class302 var379 = class582.method3419(class216.field3148, (byte) 127, class626.field8901);
                    var379.field4341.method2524(false, 0);
                    int var380 = var379.field4341.field5983;
                    var379.field4341.method2566(-2, var378);
                    var379.field4341.method2571(-1350378040, var379.field4341.field5983 - var380);
                    class501.method2928(0, var379);
                    return;
                }
                class353.field5018 = -5;
                return;
            }
            if (arg0 == 4702) {
                field618[field626++] = class353.field5018;
                if (class353.field5018 != -1) {
                    class353.field5018 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
