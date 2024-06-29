import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class221 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public static int[] field3714 = new int[50];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3718 = -1;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    public static int[] field3716 = new int[14];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Laj;")
    public static class151 field3713;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lda;")
    public class312 field3720;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIII)V")
    public static final void method1568(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            method1569((byte) 0);
        }
        field3715++;
        if (arg2 >= arg3) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class41.field630[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class41.field630[var6][arg4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method1569(byte arg0) {
        field3713 = null;
        field3714 = null;
        field3716 = null;
        if (arg0 > -110) {
            field3716 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static final void method1570(int arg0) {
        field3717++;
        if (class274.field4582 != null || class162.field2635 != null || class209.field3539 > 0) {
            return;
        }
        int var1 = class29.field490;
        int var2 = 40 / ((arg0 + 67) / 57);
        if (!class259.field4360) {
            if (var1 == 1 && class287.field4747 > 0) {
                short var14 = class195.field3154[class287.field4747 - 1];
                if (var14 == 2 || var14 == 37 || var14 == 51 || var14 == 46 || var14 == 24 || var14 == 19 || var14 == 32 || var14 == 15 || var14 == 31 || var14 == 41 || var14 == 60 || var14 == 1010) {
                    int var15 = class67.field1125[class287.field4747 - 1];
                    int var16 = class197.field3204[class287.field4747 - 1];
                    class207 var17 = class222.method1574(114, var15);
                    class20 var18 = client.method732(var17);
                    if (var18.method128(-126) || var18.method131(false)) {
                        class183.field2928 = false;
                        class36.field572 = 0;
                        if (class274.field4582 != null) {
                            class206.method1441(0, class274.field4582);
                        }
                        class274.field4582 = class222.method1574(118, var15);
                        class61.field1053 = class32.field526;
                        class11.field192 = class298.field4870;
                        class78.field1320 = var16;
                        class206.method1441(0, class274.field4582);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class20.field375 == 1 && class287.field4747 > 2 || class174.method1284(4001, class287.field4747 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class287.field4747 > 0 || class313.field5033 == 1) {
                class1.method7(-13055);
            }
            if ((var1 != 1 || class287.field4747 <= 0) && class313.field5033 != 2) {
                return;
            }
            class6.method45(2);
            return;
        }
        if (var1 != 1) {
            int var3 = class96.field1558;
            int var4 = class87.field1448;
            if (var3 < class213.field3596 - 10 || (class213.field3596 + class275.field4604 + 10) < var3 || var4 < class58.field1020 - 10 || var4 > (class263.field4398 + class58.field1020 + 10)) {
                class259.field4360 = false;
                class244.method1748(class263.field4398, (byte) -93, class275.field4604, class58.field1020, class213.field3596);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var5 = class213.field3596;
        int var6 = class275.field4604;
        int var7 = class58.field1020;
        int var8 = class298.field4870;
        int var9 = -1;
        int var10 = class32.field526;
        for (int var11 = 0; var11 < class287.field4747; var11++) {
            if (class67.field1133) {
                int var12 = (class287.field4747 - var11 - 1) * 15 + var7 + 33;
                if (var8 > var5 && var8 < (var5 + var6) && var10 > var12 - 13 && (var12 + 3) > var10) {
                    var9 = var11;
                }
            } else {
                int var13 = (class287.field4747 - var11 - 1) * 15 + var7 + 31;
                if (var5 < var8 && var8 < var5 + var6 && var10 > var13 - 13 && var10 < var13 + 3) {
                    var9 = var11;
                }
            }
        }
        if (var9 != -1) {
            class122.method915(Integer.MAX_VALUE, var9);
        }
        class259.field4360 = false;
        class244.method1748(class263.field4398, (byte) -93, class275.field4604, class58.field1020, class213.field3596);
        return;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1571(int arg0, int arg1, String arg2) {
        class236.field3980.method640((byte) 97, 119);
        class236.field3980.method1780(class73.method517(-1, arg2) + 1, 104);
        class180.field2870++;
        int var3 = -80 / ((arg0 - 11) / 50);
        field3711++;
        class236.field3980.method1782(arg1, -1);
        class236.field3980.method1786(-25149, arg2);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static final void method1572(int arg0) {
        if (arg0 != -1) {
            field3714 = null;
        }
        field3712++;
        class88.field1454.method97(74);
    }
}
