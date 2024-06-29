import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class234 extends class79 {

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Lck;")
    private static class119 field3771 = class298.method1987((byte) 28, "glow2:");

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Lck;")
    public static class119 field3776 = field3771;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lck;")
    public static class119 field3773 = field3771;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Lva;")
    public static class36 field3783;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "[I")
    public int[] field3778;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "[I")
    public int[] field3781;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "[I")
    public int[] field3790;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[Lth;")
    public class275[] field3772;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "[Lth;")
    public class275[] field3785;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "[S")
    public static short[] field3782;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "[Z")
    public static boolean[] field3786;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "[[[B")
    public byte[][][] field3779;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 28)
    public static void method1504(int arg0) {
        field3786 = null;
        field3782 = null;
        field3776 = null;
        field3773 = null;
        if (arg0 != 29451) {
            field3775 = 78;
        }
        field3783 = null;
        field3771 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lod;", line = 50)
    public static final class146 method1505(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1593;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)Lck;", line = 58)
    public static final class119 method1506(int arg0, byte arg1) {
        field3784++;
        return arg1 == -79 ? class9.method99(false, 10, arg1 ^ 0x6C97, arg0) : (class119) null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILck;II)V", line = 70)
    public static final void method1507(int arg0, int arg1, class119 arg2, int arg3, int arg4) {
        class134 var5 = class171.method1083(arg4, arg1, 124);
        field3774++;
        if (var5 == null) {
            return;
        }
        if (var5.field2048 != null) {
            class1 var6 = new class1();
            var6.field1 = arg2;
            var6.field8 = var5;
            var6.field14 = var5.field2048;
            var6.field20 = arg3;
            class184.method1170(var6, 118);
        }
        int var7 = 24 % ((arg0 - 57) / 45);
        boolean var8 = true;
        if (var5.field2068 > 0) {
            var8 = class69.method504(var5, (byte) 79);
        }
        if (!var8 || !class92.method630(arg3 - 1, client.method620(var5), -81)) {
            return;
        }
        if (arg3 == 1) {
            class6.field149.method966(0, 163);
            class6.field149.method26(arg4, 125);
            class6.field149.method40(arg1, -119);
            class88.field1335++;
        }
        if (arg3 == 2) {
            class243.field3933++;
            class6.field149.method966(0, 125);
            class6.field149.method26(arg4, 115);
            class6.field149.method40(arg1, 119);
        }
        if (arg3 == 3) {
            class6.field149.method966(0, 45);
            class144.field2296++;
            class6.field149.method26(arg4, 121);
            class6.field149.method40(arg1, 111);
        }
        if (arg3 == 4) {
            class296.field4915++;
            class6.field149.method966(0, 252);
            class6.field149.method26(arg4, 119);
            class6.field149.method40(arg1, 84);
        }
        if (arg3 == 5) {
            class6.field149.method966(0, 39);
            class6.field149.method26(arg4, 106);
            class39.field583++;
            class6.field149.method40(arg1, 120);
        }
        if (arg3 == 6) {
            class2.field27++;
            class6.field149.method966(0, 114);
            class6.field149.method26(arg4, 22);
            class6.field149.method40(arg1, 82);
        }
        if (arg3 == 7) {
            class6.field149.method966(0, 28);
            class6.field149.method26(arg4, 125);
            class6.field149.method40(arg1, -64);
            class220.field3524++;
        }
        if (arg3 == 8) {
            class257.field4119++;
            class6.field149.method966(0, 161);
            class6.field149.method26(arg4, 60);
            class6.field149.method40(arg1, -34);
        }
        if (arg3 == 9) {
            class142.field2264++;
            class6.field149.method966(0, 190);
            class6.field149.method26(arg4, 109);
            class6.field149.method40(arg1, 115);
        }
        if (arg3 == 10) {
            class220.field3521++;
            class6.field149.method966(0, 199);
            class6.field149.method26(arg4, 43);
            class6.field149.method40(arg1, -74);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 196)
    public static final void method1508(byte arg0) {
        class144.field2294 = (byte[][][]) null;
        class198.field3166 = 0;
        field3788++;
        class285.field4713 = null;
        class158.field2507 = (int[][][]) null;
        class196.field3133 = (byte[][][]) null;
        class85.field1275 = (int[][][]) null;
        class229.field3702 = (byte[][][]) null;
        class283.field4674 = (byte[][][]) null;
        class187.field2942 = null;
        class39.field570 = (byte[][][]) null;
        class236.field3796 = (byte[][][]) null;
        class249.field4017.method1001(96);
        class111.field1686.method1001(126);
        class245.field3974 = null;
        class95.field1463 = null;
        class220.field3532 = null;
        class257.field4123 = null;
        class210.field3350 = null;
        class84.field1270 = null;
        class189.field2986 = null;
        class153.field2432 = null;
        if (arg0 > 43) {
            class237.field3803 = null;
            class106.field1639 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLwi;Lkl;I)V", line = 232)
    public static final void method1509(boolean arg0, class23 arg1, class75 arg2, int arg3) {
        field3777++;
        class210 var4 = new class210();
        var4.field3349 = 1;
        var4.field3359 = arg2;
        var4.field1218 = (long) arg3;
        var4.field3355 = arg1;
        if (arg0) {
            return;
        }
        class156 var5 = class82.field1256;
        synchronized (class82.field1256) {
            class82.field1256.method999(var4, (byte) -108);
        }
        class298.method1991((byte) -84);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V", line = 277)
    public static final void method1510(boolean arg0, int arg1) {
        field3769++;
        for (class32 var2 = (class32) class55.field877.method995(1836596936); var2 != null; var2 = (class32) class55.field877.method996(0)) {
            if (var2.field448 != null) {
                class230.field3721.method1421(var2.field448);
                var2.field448 = null;
            }
            if (var2.field468 != null) {
                class230.field3721.method1421(var2.field468);
                var2.field468 = null;
            }
            var2.method552((byte) 80);
        }
        int var3 = -77 / ((54 - arg1) / 62);
        if (!arg0) {
            return;
        }
        for (class32 var4 = (class32) class95.field1461.method995(1836596936); var4 != null; var4 = (class32) class95.field1461.method996(0)) {
            if (var4.field448 != null) {
                class230.field3721.method1421(var4.field448);
                var4.field448 = null;
            }
            var4.method552((byte) 90);
        }
        for (class32 var5 = (class32) class272.field4469.method1325(-127); var5 != null; var5 = (class32) class272.field4469.method1332(-82)) {
            if (var5.field448 != null) {
                class230.field3721.method1421(var5.field448);
                var5.field448 = null;
            }
            var5.method552((byte) -115);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lo;", line = 344)
    public static final class240 method1511(int arg0, int arg1) {
        class240 var2 = (class240) class227.field3632.method487(false, (long) arg1);
        field3787++;
        if (arg0 <= 67) {
            method1512((class297) null, 126);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field3783.method261(-1, class154.method985(arg1, -1337402072), class222.method1407(arg1, (byte) -60));
        class240 var4 = new class240();
        var4.field3862 = arg1;
        if (var3 != null) {
            var4.method1566(new class3(var3), (byte) -59);
        }
        class227.field3632.method488(var4, (byte) 84, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Leb;I)V", line = 367)
    public static final void method1512(class297 arg0, int arg1) {
        arg0.field5001 = false;
        field3770++;
        if (arg1 != 1) {
            return;
        }
        if (arg0.field4948 != -1) {
            class56 var2 = class276.method1818(-20682, arg0.field4948);
            if (var2 == null || var2.field916 == null) {
                arg0.field4948 = -1;
            } else {
                arg0.field4985++;
                if (arg0.field4951 < var2.field916.length && arg0.field4985 > var2.field905[arg0.field4951]) {
                    arg0.field4985 = 1;
                    arg0.field4951++;
                    class199.method1269(arg0.field4951, class124.field1917 == arg0, var2, arg0.field4991, arg1 ^ 0xFFFFFFA5, arg0.field4949);
                }
                if (arg0.field4951 >= var2.field916.length) {
                    arg0.field4951 = 0;
                    arg0.field4985 = 0;
                    class199.method1269(arg0.field4951, class124.field1917 == arg0, var2, arg0.field4991, -76, arg0.field4949);
                }
            }
        }
        if (arg0.field4962 != -1 && arg0.field4992 <= class1.field15) {
            if (arg0.field4965 < 0) {
                arg0.field4965 = 0;
            }
            int var3 = method1511(115, arg0.field4962).field3863;
            if (var3 == -1) {
                arg0.field4962 = -1;
            } else {
                class56 var4 = class276.method1818(arg1 - 20683, var3);
                if (var4 == null || var4.field916 == null) {
                    arg0.field4962 = -1;
                } else {
                    arg0.field4998++;
                    if (var4.field916.length > arg0.field4965 && arg0.field4998 > var4.field905[arg0.field4965]) {
                        arg0.field4965++;
                        arg0.field4998 = 1;
                        class199.method1269(arg0.field4965, class124.field1917 == arg0, var4, arg0.field4991, arg1 ^ 0xFFFFFFBD, arg0.field4949);
                    }
                    if (arg0.field4965 >= var4.field916.length) {
                        arg0.field4962 = -1;
                    }
                }
            }
        }
        if (arg0.field4993 != -1 && arg0.field4941 <= 1) {
            class56 var5 = class276.method1818(arg1 ^ 0xFFFFAF37, arg0.field4993);
            if (var5.field910 == 1 && arg0.field4996 > 0 && class1.field15 >= arg0.field4954 && class1.field15 > arg0.field5002) {
                arg0.field4941 = 1;
                return;
            }
        }
        if (arg0.field4993 != -1 && arg0.field4941 == 0) {
            class56 var6 = class276.method1818(-20682, arg0.field4993);
            if (var6 == null || var6.field916 == null) {
                arg0.field4993 = -1;
            } else {
                arg0.field4975++;
                if (arg0.field4959 < var6.field916.length && arg0.field4975 > var6.field905[arg0.field4959]) {
                    arg0.field4975 = 1;
                    arg0.field4959++;
                    class199.method1269(arg0.field4959, class124.field1917 == arg0, var6, arg0.field4991, arg1 ^ 0xFFFFFFA3, arg0.field4949);
                }
                if (arg0.field4959 >= var6.field916.length) {
                    arg0.field4967++;
                    arg0.field4959 -= var6.field900;
                    if (arg0.field4967 >= var6.field913) {
                        arg0.field4993 = -1;
                    } else if (arg0.field4959 >= 0 && var6.field916.length > arg0.field4959) {
                        class199.method1269(arg0.field4959, class124.field1917 == arg0, var6, arg0.field4991, -123, arg0.field4949);
                    } else {
                        arg0.field4993 = -1;
                    }
                }
                arg0.field5001 = var6.field908;
            }
        }
        if (arg0.field4941 > 0) {
            arg0.field4941--;
        }
    }
}
