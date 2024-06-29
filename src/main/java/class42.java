import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class42 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
    public static boolean field606 = true;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public static String field611 = "Loading interfaces - ";

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[Lij;")
    public static class69[] field601;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method286(boolean arg0) {
        field611 = null;
        field601 = null;
        if (arg0) {
            field606 = false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static final void method287(int arg0) {
        if (arg0 != 32292) {
            field606 = false;
        }
        field608++;
        for (class136 var1 = (class136) class146.field2094.method656(106); var1 != null; var1 = (class136) class146.field2094.method650(125)) {
            class202 var2 = var1.field1966;
            if (class163.field2364 != var2.field2938 || var2.field2916 < class82.field1267) {
                var1.method1706(arg0 ^ 0xFFFF81BF);
            } else if (class82.field1267 >= var2.field2937) {
                if (var2.field2905 > 0) {
                    class72 var3 = class82.field1268[var2.field2905 - 1];
                    if (var3 != null && var3.field45 >= 0 && var3.field45 < 13312 && var3.field94 >= 0 && var3.field94 < 13312) {
                        var2.method1313(class81.method542(var3.field45, -1, var2.field2938, var3.field94) - var2.field2902, arg0 + -32419, var3.field94, class82.field1267, var3.field45);
                    }
                }
                if (var2.field2905 < 0) {
                    int var4 = -var2.field2905 - 1;
                    class53 var5;
                    if (class73.field1133 == var4) {
                        var5 = class55.field847;
                    } else {
                        var5 = class194.field2777[var4];
                    }
                    if (var5 != null && var5.field45 >= 0 && var5.field45 < 13312 && var5.field94 >= 0 && var5.field94 < 13312) {
                        var2.method1313(class81.method542(var5.field45, -1, var2.field2938, var5.field94) - var2.field2902, 50, var5.field94, class82.field1267, var5.field45);
                    }
                }
                var2.method1311(class38.field566, (byte) -100);
                class43.method294(class163.field2364, (int) var2.field2939, (int) var2.field2936, (int) var2.field2912, 60, var2, var2.field2926, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILve;Lve;)V")
    public static final void method288(int arg0, class233 arg1, class233 arg2) {
        field607++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class284.field4517 = arg1;
        class232.field3466 = arg2;
        class284.field4517.method1525(11672, 34);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class33.field481 = var4 + var5;
        class151.field2184 = var3 + var5;
        int var6 = (int) (Math.random() * (double) arg0) - 10;
        class47.field666 = var6 + var5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)Z")
    public static final boolean method289(int arg0, boolean arg1) {
        class225.field3370 = arg1;
        class30.field426 = arg0 + 1 & 0xFFFF;
        field603++;
        return true;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
    public static final int method290(int arg0) {
        if (arg0 == 19514) {
            class51.field747 = 0;
            field610++;
            return class135.method915(28654);
        } else {
            return 110;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I")
    public static final int method291(int arg0, int arg1) {
        field605++;
        int var2 = -36 % ((arg1 + 62) / 44);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method292(int arg0) {
        class194.field2782 = 1;
        class148.field2109 = false;
        if (arg0 != -19389) {
            return;
        }
        class59.field905 = 0;
        class118.field1741 = -3;
        class259.field3924 = 0;
        class90.field1366 = -1;
        field612++;
        class62.field994 = 0;
    }
}
