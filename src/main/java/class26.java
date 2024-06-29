import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lwd;")
    public static class150 field780 = class2.method9(true, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lwd;")
    public static class150 field789 = class2.method9(true, "Benutzername: ");

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lwd;")
    private static class150 field785 = class2.method9(true, "Login server offline)3");

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field796 = 2;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "[Lwd;")
    public static class150[] field790 = new class150[100];

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lwd;")
    public static class150 field799 = field785;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Li;")
    public static class56 field798 = new class56(500);

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lwd;")
    private static class150 field802 = class2.method9(true, "Could not complete login)3");

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lwd;")
    public static class150 field803 = field802;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Li;")
    public static class56 field804 = new class56(50);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Le;")
    public class29 field787;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Le;")
    public class29 field788;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Le;")
    public class29 field800;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lkc;")
    public static class72 field797;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[Z")
    public static boolean[] field781;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method208(int arg0) {
        field789 = null;
        field798 = null;
        if (arg0 != -16079) {
            field785 = null;
        }
        field802 = null;
        field781 = null;
        field803 = null;
        field790 = null;
        field785 = null;
        field797 = null;
        field804 = null;
        field780 = null;
        field799 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method209(byte arg0) {
        field793++;
        class138.field3223.method431(0);
        field798.method431(0);
        class66.field1664.method431(0);
        if (arg0 != 19) {
            field803 = null;
        }
        class78.field1920.method431(0);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static final void method210(byte arg0) {
        field779++;
        if (class119.field2755 == 0 || arg0 <= 19) {
            return;
        }
        int var1 = 0;
        if (class65.field1647 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class38.field1042[var2] != null) {
                int var3 = class133.field3121[var2];
                class150 var4 = field790[var2];
                if (var4 != null && var4.method1203(true, class109.field2521)) {
                    var4 = var4.method1196(5, -31851);
                }
                if (var4 != null && var4.method1203(true, class4.field81)) {
                    var4 = var4.method1196(5, -31851);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class6.field151 == 0 || class6.field151 == 1 && class133.method994(var4, false))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class111.field2557 > 4 && var5 - 10 < class113.field2602 - 4 && class113.field2602 - 4 <= var5 + 3) {
                        int var6 = class22.field646.method1038(class111.method786((byte) -123, new class150[] { class70.field1776, class35.field971, var4, class38.field1042[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class111.field2557 < var6 + 4) {
                            class49.field1324++;
                            if (class66.field1689 >= 1) {
                                class15.field406++;
                                class68.method521(0, 2023, class135.field3174, false, 0, class111.method786((byte) 77, new class150[] { class3.field59, var4 }), 0);
                            }
                            class68.method521(0, 2003, class112.field2588, false, 0, class111.method786((byte) 76, new class150[] { class3.field59, var4 }), 0);
                            class68.method521(0, 2021, class18.field481, false, 0, class111.method786((byte) -125, new class150[] { class3.field59, var4 }), 0);
                            class28.field848++;
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class6.field151 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field784++;
        class143.field3453[0].method803(arg2, arg3);
        class143.field3453[1].method803(arg2, arg3 + arg0 - 16);
        class120.method872(arg2, arg3 + 16, 16, arg0 - 32, class113.field2606);
        int var6 = (arg0 - 32) * arg0 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg5 / (arg1 - arg0);
        class120.method872(arg2, arg3 + var7 + 16, 16, var6, class94.field2176);
        class120.method881(arg2, arg3 + var7 + 16, var6, client.field605);
        if (arg4 != 27714) {
            field796 = -85;
        }
        class120.method881(arg2 + 1, var7 + 16 + arg3, var6, client.field605);
        class120.method867(arg2, arg3 + var7 + 16, 16, client.field605);
        class120.method867(arg2, arg3 + var7 + 17, 16, client.field605);
        class120.method881(arg2 + 15, arg3 - -var7 + 16, var6, class73.field1824);
        class120.method881(arg2 + 14, arg3 - (-var7 + -17), var6 - 1, class73.field1824);
        class120.method867(arg2, arg3 + var7 + var6 + 15, 16, class73.field1824);
        class120.method867(arg2 + 1, arg3 + 14 + var6 - -var7, 15, class73.field1824);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method212(byte arg0, Component arg1) {
        field782++;
        arg1.removeKeyListener(class5.field92);
        int var2 = -55 % ((arg0 + 12) / 35);
        arg1.removeFocusListener(class5.field92);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public static final void method213(byte arg0, int arg1) {
        if (class18.field490 == 0) {
            class49.field1312.method772(arg0 ^ 0x930DF72C, arg1);
        } else {
            class37.field1016 = arg1;
        }
        field783++;
        if (arg0 != -53) {
            method208(-86);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)I")
    public static final int method214(byte arg0) {
        field778++;
        if (arg0 != 38) {
            field796 = 126;
        }
        return class38.field1047++;
    }
}
