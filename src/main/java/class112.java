import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class112 {

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lok;")
    public static class146 field1789 = class235.method1724(-12908, "blaugr-Un:");

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
    public static int[] field1791 = new int[2048];

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lok;")
    public static class146 field1793 = class235.method1724(-12908, " <col=00ff80>");

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lok;")
    public static class146 field1792 = class235.method1724(-12908, "::rebuild");

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ldi;")
    public static class147 field1784;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Loh;")
    public static class15 field1783;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 14)
    public static void method754(byte arg0) {
        if (arg0 <= 44) {
            field1789 = (class146) null;
        }
        field1783 = null;
        field1789 = null;
        field1793 = null;
        field1792 = null;
        field1784 = null;
        field1791 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method755(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class229.field3821; var3++) {
            class302 var4 = class64.field1106[var3];
            if (var4.field5176 == 1) {
                int var5 = var4.field5166 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5169 * var5 >> 8) + var4.field5178;
                    int var7 = (var4.field5173 * var5 >> 8) + var4.field5175;
                    int var8 = (var4.field5180 * var5 >> 8) + var4.field5163;
                    int var9 = (var4.field5191 * var5 >> 8) + var4.field5164;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5176 == 2) {
                int var10 = arg0 - var4.field5166;
                if (var10 > 0) {
                    int var11 = (var4.field5169 * var10 >> 8) + var4.field5178;
                    int var12 = (var4.field5173 * var10 >> 8) + var4.field5175;
                    int var13 = (var4.field5180 * var10 >> 8) + var4.field5163;
                    int var14 = (var4.field5191 * var10 >> 8) + var4.field5164;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5176 == 3) {
                int var15 = var4.field5178 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5165 * var15 >> 8) + var4.field5166;
                    int var17 = (var4.field5167 * var15 >> 8) + var4.field5174;
                    int var18 = (var4.field5180 * var15 >> 8) + var4.field5163;
                    int var19 = (var4.field5191 * var15 >> 8) + var4.field5164;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5176 == 4) {
                int var20 = arg2 - var4.field5178;
                if (var20 > 0) {
                    int var21 = (var4.field5165 * var20 >> 8) + var4.field5166;
                    int var22 = (var4.field5167 * var20 >> 8) + var4.field5174;
                    int var23 = (var4.field5180 * var20 >> 8) + var4.field5163;
                    int var24 = (var4.field5191 * var20 >> 8) + var4.field5164;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5176 == 5) {
                int var25 = arg1 - var4.field5163;
                if (var25 > 0) {
                    int var26 = (var4.field5165 * var25 >> 8) + var4.field5166;
                    int var27 = (var4.field5167 * var25 >> 8) + var4.field5174;
                    int var28 = (var4.field5169 * var25 >> 8) + var4.field5178;
                    int var29 = (var4.field5173 * var25 >> 8) + var4.field5175;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Lvi;", line = 155)
    public static final class5 method756(byte arg0, int arg1) {
        field1788++;
        class5 var2 = (class5) class226.field3765.method799((byte) 52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field1783.method92(class245.method1772((byte) 124, arg1), 0, class143.method1049(255, arg1));
        class5 var4 = new class5();
        var4.field68 = arg1;
        int var5 = 29 / ((-arg0 - 47) / 62);
        if (var3 != null) {
            var4.method22((byte) -34, new class47(var3));
        }
        var4.method32(0);
        if (var4.field103) {
            var4.field125 = 0;
            var4.field111 = false;
        }
        if (!class292.field4966 && var4.field85) {
            var4.field58 = null;
        }
        class226.field3765.method797(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lok;ZI)V", line = 194)
    public static final void method757(class146 arg0, boolean arg1, int arg2) {
        class146 var3 = arg0.method1108(true);
        field1785++;
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class79.field1267; var6++) {
            class248 var7 = class84.method589(false, var6);
            if ((!arg1 || var7.field4133) && var7.field4145 == -1 && var7.field4115 == -1 && var7.field4104 == 0 && var7.field4149.method1108(true).method1081(var3, -1) != -1) {
                if (var4 >= 250) {
                    class146.field2476 = null;
                    class148.field2520 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        if (arg2 != 8) {
            field1789 = (class146) null;
        }
        class146.field2476 = var5;
        class84.field1334 = 0;
        class148.field2520 = var4;
        class146[] var10 = new class146[class148.field2520];
        for (int var11 = 0; var11 < class148.field2520; var11++) {
            var10[var11] = class84.method589(false, var5[var11]).field4149;
        }
        class55.method444(class146.field2476, true, var10);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[Lok;)Lok;", line = 275)
    public static final class146 method758(int arg0, class146[] arg1) {
        field1786++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        int var2 = 88 / ((arg0 - 58) / 61);
        return class205.method1553(0, arg1, 17804, arg1.length);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V", line = 320)
    public static final void method759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class227.field3783; var5++) {
            if (arg4 < class91.field1442[var5] + class175.field2922[var5] && class175.field2922[var5] < (arg3 + arg4) && arg1 < (class298.field5068[var5] + class52.field952[var5]) && class298.field5068[var5] < (arg0 + arg1)) {
                class14.field264[var5] = true;
            }
        }
        if (arg2 != 8) {
            method757((class146) null, false, -26);
        }
        field1787++;
    }
}
