import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class90 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[S")
    public static short[] field1720 = new short[] { 4, 21, 26, 18, 39, 43, 31, 49 };

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lia;")
    public static class257 field1723 = class28.method234(80, "(U4");

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lia;")
    public static class257 field1731 = class28.method234(87, ")4a=");

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lia;")
    public static class257 field1726 = class28.method234(-48, "Hidden)2use");

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1721 = 0;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
    public static boolean field1727;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public static final void method668(int arg0, int arg1, int arg2) {
        class205.field3524.method908(false, 32);
        class205.field3524.method1018((byte) -11, arg1);
        class205.field3524.method1066(-1687589720, arg2);
        if (arg0 >= -72) {
            field1723 = null;
        }
        field1725++;
        class71.field1398++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method669(int arg0) {
        field1723 = null;
        field1726 = null;
        field1720 = null;
        if (arg0 != 0) {
            field1720 = null;
        }
        field1731 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V")
    public abstract void method670(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lij;IIIII)V")
    public static final void method671(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class236.field4045 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class140.field2491) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class73.field1427 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class177 var14 = class75.field1463[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class243.field4208[var11][var12 + 1][var13] + class243.field4208[var11][var12][var13] + class243.field4208[var11][var12][var13 + 1] + class243.field4208[var11][var12 + 1][var13 + 1]) / 4 - (class243.field4208[arg1][arg2 + 1][arg3] + class243.field4208[arg1][arg2][arg3] + class243.field4208[arg1][arg2][arg3 + 1] + class243.field4208[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class8 var16 = var14.field3024;
                                    if (var16 != null) {
                                        if (var16.field172.method493()) {
                                            arg0.method518(var16.field172, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field169 != null && var16.field169.method493()) {
                                            arg0.method518(var16.field169, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3012; var17++) {
                                        class154 var18 = var14.field3017[var17];
                                        if (var18 != null && var18.field2698.method493() && (var18.field2693 == var12 || var7 == var12) && (var18.field2688 == var13 || var9 == var13)) {
                                            int var19 = var18.field2695 + 1 - var18.field2693;
                                            int var20 = var18.field2700 + 1 - var18.field2688;
                                            arg0.method518(var18.field2698, (var18.field2693 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2688 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static final int method672(int arg0, int arg1) {
        if (arg0 != -24536) {
            field1720 = null;
        }
        field1732++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    public abstract void method673(int arg0, int arg1);
}
