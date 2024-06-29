import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class26 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lhe;")
    private static class54 field696 = class6.method58("Error loading your profile)3", false);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lhe;")
    public static class54 field694 = class6.method58("Bitte entfernen Sie ", false);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lhe;")
    public static class54 field691 = field696;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lhe;")
    public static class54 field689 = class6.method58("l", false);

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lse;")
    public static class130 field702 = new class130();

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[Lhe;")
    public static class54[] field706 = new class54[100];

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lhe;")
    public static class54 field707 = class6.method58("welle2:", false);

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lse;")
    public static class130 field704 = new class130();

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field699;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[I")
    public int[] field705;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZI)V")
    public static final void method197(int arg0, int arg1, boolean arg2, int arg3) {
        field700++;
        class78.method595((byte) 0);
        class90.method714(arg0, arg3, class4.field136.field574 + arg0, class4.field136.field577 + arg3);
        if (class75.field1866 == 2 || class75.field1866 == 5) {
            class90.method711(arg0 + 25, arg3 - -5, 0, class156.field3532, class91.field2216);
        } else {
            int var4 = class91.field2220 + class63.field1533 & 0x7FF;
            int var5 = 464 - class108.field2639.field971 / 32;
            int var6 = class108.field2639.field974 / 32 + 48;
            class6.field185.method868(arg0 + 25, arg3 - -5, 146, 151, var6, var5, var4, class40.field1050 + 256, class156.field3532, class91.field2216);
            for (int var7 = 0; var7 < class56.field1402; var7++) {
                int var37 = class12.field327[var7] * 4 + 2 - class108.field2639.field974 / 32;
                int var38 = class51.field1234[var7] * 4 + 2 - class108.field2639.field971 / 32;
                class75.method575(var37, var38, (byte) 123, class14.field420[var7], arg3, arg0);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class130 var34 = class77.field1878[class157.field3573][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class108.field2639.field974 / 32;
                        int var36 = var33 * 4 + 2 - class108.field2639.field971 / 32;
                        class75.method575(var35, var36, (byte) 118, class68.field1709[0], arg3, arg0);
                    }
                }
            }
            for (int var9 = 0; var9 < class158.field3598; var9++) {
                class120 var29 = class111.field2679[class58.field1480[var9]];
                if (var29 != null && var29.method183(-19456)) {
                    class9 var30 = var29.field2788;
                    if (var30 != null && var30.field293 != null) {
                        var30 = var30.method78((byte) 120);
                    }
                    if (var30 != null && var30.field265 && var30.field296) {
                        int var31 = var29.field974 / 32 - class108.field2639.field974 / 32;
                        int var32 = var29.field971 / 32 - class108.field2639.field971 / 32;
                        class75.method575(var31, var32, (byte) 124, class68.field1709[1], arg3, arg0);
                    }
                }
            }
            for (int var10 = 0; var10 < class74.field1823; var10++) {
                class22 var21 = class48.field1148[class141.field3227[var10]];
                if (var21 != null && var21.method183(-19456)) {
                    int var22 = var21.field974 / 32 - class108.field2639.field974 / 32;
                    boolean var23 = false;
                    int var24 = var21.field971 / 32 - class108.field2639.field971 / 32;
                    long var25 = var21.field626.method385((byte) -111);
                    for (int var27 = 0; var27 < class158.field3609; var27++) {
                        if (class129.field2920[var27] == var25 && class94.field2368[var27] != 0) {
                            var23 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class108.field2639.field623 != 0 && var21.field623 != 0 && class108.field2639.field623 == var21.field623) {
                        var28 = true;
                    }
                    if (var23) {
                        class75.method575(var22, var24, (byte) 121, class68.field1709[3], arg3, arg0);
                    } else if (var28) {
                        class75.method575(var22, var24, (byte) 124, class68.field1709[4], arg3, arg0);
                    } else {
                        class75.method575(var22, var24, (byte) 126, class68.field1709[2], arg3, arg0);
                    }
                }
            }
            if (class111.field2669 != 0 && class4.field138 % 20 < 10) {
                if (class111.field2669 == 1 && class17.field515 >= 0 && class17.field515 < class111.field2679.length) {
                    class120 var11 = class111.field2679[class17.field515];
                    if (var11 != null) {
                        int var12 = var11.field974 / 32 - class108.field2639.field974 / 32;
                        int var13 = var11.field971 / 32 - class108.field2639.field971 / 32;
                        class121.method939(class72.field1780[1], arg3, var13, (byte) 125, arg0, var12);
                    }
                }
                if (class111.field2669 == 2) {
                    int var14 = (class149.field3355 - class67.field1648) * 4 + 2 - class108.field2639.field971 / 32;
                    int var15 = (class149.field3387 - class11.field323) * 4 + 2 - class108.field2639.field974 / 32;
                    class121.method939(class72.field1780[1], arg3, var14, (byte) 107, arg0, var15);
                }
                if (class111.field2669 == 10 && class32.field806 >= 0 && class32.field806 < class48.field1148.length) {
                    class22 var16 = class48.field1148[class32.field806];
                    if (var16 != null) {
                        int var17 = var16.field974 / 32 - class108.field2639.field974 / 32;
                        int var18 = var16.field971 / 32 - class108.field2639.field971 / 32;
                        class121.method939(class72.field1780[1], arg3, var18, (byte) -9, arg0, var17);
                    }
                }
            }
            if (class1.field15 != 0) {
                int var19 = class1.field15 * 4 + 2 - class108.field2639.field974 / 32;
                int var20 = class134.field3035 * 4 + 2 - class108.field2639.field971 / 32;
                class75.method575(var19, var20, (byte) 116, class72.field1780[0], arg3, arg0);
            }
            class90.method710(arg0 + 97, arg3 - -82 + -4, 3, 3, 16777215);
        }
        if (class75.field1866 >= 3) {
            class90.method711(arg0, arg3, 0, class124.field2860, class156.field3516);
        } else {
            class71.field1766.method868(arg0, arg3, 33, 33, 25, 25, class91.field2220, 256, class124.field2860, class156.field3516);
        }
        if (class44.field1125[arg1]) {
            class4.field136.method161(arg0, arg3);
        }
        class32.field832[arg1] = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLjava/awt/Graphics;III)V")
    public abstract void method80(int arg0, byte arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method198(int arg0) {
        class100.field2530 = null;
        class27.field728 = null;
        class16.field474 = null;
        class70.field1727 = null;
        if (arg0 != 4) {
            method197(-69, -59, false, -101);
        }
        class141.field3206 = null;
        class118.field2760 = null;
        field708++;
        class130.field2938 = null;
        class87.field2151 = null;
        class84.field2085 = null;
        class132.field2988 = null;
        class54.field1318 = null;
        class84.field2096 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method199(byte arg0) {
        field701++;
        if (class6.field179 != null || class133.field3017 != null) {
            return;
        }
        int var1 = class124.field2854;
        if (class133.field3007) {
            if (var1 != 1) {
                int var6 = class71.field1772;
                int var7 = class7.field211;
                if (class142.field3242 - 10 > var6 || class142.field3242 + class125.field2870 + 10 < var6 || class7.field212 - 10 > var7 || var7 > class7.field212 + class82.field2017 + 10) {
                    class133.field3007 = false;
                    class142.method1101(class7.field212, 16052, class125.field2870, class142.field3242, class82.field2017);
                }
            }
            if (var1 == 1) {
                int var8 = class142.field3242;
                int var9 = class7.field212;
                int var10 = class125.field2870;
                int var11 = class71.field1763;
                int var12 = class21.field582;
                int var13 = -1;
                for (int var14 = 0; var14 < class67.field1641; var14++) {
                    int var15 = (class67.field1641 - var14 - 1) * 15 + var9 + 31;
                    if (var8 < var11 && var8 + var10 > var11 && var12 > var15 - 13 && var12 < var15 + 3) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class83.method643(0, var13);
                }
                class133.field3007 = false;
                class142.method1101(class7.field212, 16052, class125.field2870, class142.field3242, class82.field2017);
            }
        } else {
            if (var1 == 1 && class67.field1641 > 0) {
                int var2 = class157.field3574[class67.field1641 - 1];
                if (var2 == 29 || var2 == 39 || var2 == 20 || var2 == 21 || var2 == 31 || var2 == 37 || var2 == 28 || var2 == 4 || var2 == 41 || var2 == 45 || var2 == 50 || var2 == 1002) {
                    int var3 = class77.field1880[class67.field1641 - 1];
                    int var4 = class80.field1976[class67.field1641 - 1];
                    class93 var5 = class121.method938(true, var3);
                    if (class2.method12(class105.method810(var5, -22389), 4626) || class140.method1084(1, class105.method810(var5, -22389))) {
                        class141.field3214 = false;
                        class5.field165 = 0;
                        if (class6.field179 != null) {
                            class134.method1005(class6.field179, 0);
                        }
                        class6.field179 = class121.method938(true, var3);
                        class115.field2727 = class21.field582;
                        class137.field3147 = class71.field1763;
                        class107.field2614 = var4;
                        class134.method1005(class6.field179, 0);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class156.field3543 == 1 && class67.field1641 > 2 || class79.method599(80, class67.field1641 - 1))) {
                var1 = 2;
            }
            if (var1 == 1 && class67.field1641 > 0) {
                class83.method643(arg0 - 48, class67.field1641 - 1);
            }
            if (var1 == 2 && class67.field1641 > 0) {
                class16.method144(-21);
            }
        }
        if (arg0 != 48) {
            method198(-93);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method200(byte arg0) {
        field704 = null;
        int var1 = 120 % ((arg0 + 4) / 58);
        field691 = null;
        field696 = null;
        field689 = null;
        field707 = null;
        field702 = null;
        field694 = null;
        field706 = null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static final void method201(byte arg0) {
        class156.field3557 = 0;
        int var1 = (class108.field2639.field974 >> 7) + class11.field323;
        field709++;
        int var2 = 23 / ((arg0 + 82) / 42);
        int var3 = (class108.field2639.field971 >> 7) + class67.field1648;
        if (var1 >= 3053 && var1 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class156.field3557 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class156.field3557 = 1;
        }
        if (class156.field3557 == 1 && var1 >= 3139 && var1 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class156.field3557 = 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
    public static final int method202(int arg0, int arg1, int arg2) {
        if (arg1 > -83) {
            method201((byte) -26);
        }
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        field703++;
        return arg2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method82(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public abstract void method81(Graphics arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    public static final void method203(int arg0, int arg1, int arg2) {
        field698++;
        if (class67.field1641 < 2 && class3.field76 == 0 && !class141.field3216) {
            return;
        }
        int var3 = -125 / ((arg1 - 53) / 39);
        class54 var4;
        if (class3.field76 == 1 && class67.field1641 < 2) {
            var4 = class143.method1105(new class54[] { class111.field2682, class87.field2156, class124.field2866, class77.field1882 }, -842);
        } else if (class141.field3216 && class67.field1641 < 2) {
            var4 = class143.method1105(new class54[] { class157.field3576, class87.field2156, class8.field246, class77.field1882 }, -842);
        } else {
            var4 = class108.method821(class67.field1641 - 1, true);
        }
        if (class67.field1641 > 2) {
            var4 = class143.method1105(new class54[] { var4, class35.field897, class147.method1117(-41, class67.field1641 - 2), class130.field2949 }, -842);
        }
        class135.field3067.method1187(var4, arg2 + 4, arg0 + 15, 16777215, 0, class4.field138 / 1000);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public final void method204(int arg0) {
        class90.method715(this.field705, this.field697, this.field692);
        field693++;
        int var2 = -13 % ((arg0 + 34) / 59);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    protected class26() {
    }
}
