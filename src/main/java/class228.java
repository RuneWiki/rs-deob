import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class228 implements class164 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3951 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljd;")
    public static class85 field3948 = class221.method1499("sl_arrows", (byte) -100);

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Ljd;")
    public static class85 field3958 = class221.method1499("Benutzeroberfl-=che geladen)3", (byte) -73);

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[[[B")
    public static byte[][][] field3952 = new byte[4][104][104];

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lge;")
    public static class68 field3949;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lge;")
    public static class68 field3957;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[[[I")
    public static int[][][] field3954;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lge;BI)Lea;")
    public static final class36 method1530(class68 arg0, byte arg1, int arg2) {
        field3955++;
        if (arg1 > -102) {
            return null;
        } else {
            byte[] var3 = arg0.method459(78, arg2);
            return var3 == null ? null : new class36(var3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Lbh;")
    public static final class7 method1531(int arg0, int arg1) {
        field3950++;
        class7 var2 = (class7) class199.field3454.method1269((long) arg1, (byte) 102);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -31683) {
            method1530((class68) null, (byte) 40, 49);
        }
        class7 var3 = class168.method1129(class221.field3884, class37.field575, arg0 + 31781, false, arg1);
        if (var3 != null) {
            class199.field3454.method1271(-15561, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lik;I)V")
    public static final void method1532(class247 arg0, int arg1) {
        field3959++;
        if (class203.field3551 != null) {
            try {
                class203.field3551.method1203(0L, 65280);
                class203.field3551.method1204(arg0.field4224, 5230, 24, arg0.field4238);
            } catch (Exception var2) {
            }
        }
        arg0.field4224 += 24;
        if (arg1 >= -125) {
            method1531(21, 95);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static final void method1533(boolean arg0) {
        field3956++;
        class162.method1063(false, 50);
        class236.field4079 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class194.field3314.length; var2++) {
            if (class130.field2279[var2] != -1 && class194.field3314[var2] == null) {
                class194.field3314[var2] = class36.field555.method464(-1, class130.field2279[var2], 0);
                if (class194.field3314[var2] == null) {
                    var1 = false;
                    class236.field4079++;
                }
            }
            if (class187.field3221[var2] != -1 && class256.field4570[var2] == null) {
                class256.field4570[var2] = class36.field555.method467((byte) 101, class148.field2507[var2], class187.field3221[var2], 0);
                if (class256.field4570[var2] == null) {
                    var1 = false;
                    class236.field4079++;
                }
            }
            if (class269.field4780 != null && class79.field1459[var2] == null && class269.field4780[var2] != -1) {
                class79.field1459[var2] = class36.field555.method467((byte) 124, class148.field2507[var2], class269.field4780[var2], 0);
                if (class79.field1459[var2] == null) {
                    var1 = false;
                    class236.field4079++;
                }
            }
        }
        if (class186.field3192 == null || !class1.field10.method450(class172.method1150(new class85[] { class186.field3192.field1488, class203.field3545 }, 0), -1)) {
            class177.field3023 = null;
        } else if (class1.field10.method473(true, class172.method1150(new class85[] { class186.field3192.field1488, class203.field3545 }, 0))) {
            class177.field3023 = class70.method486(-106, class1.field10, class172.method1150(new class85[] { class186.field3192.field1488, class203.field3545 }, 0));
        } else {
            var1 = false;
            class236.field4079++;
        }
        if (!var1) {
            class115.field2064 = 1;
            return;
        }
        boolean var3 = true;
        class261.field4611 = 0;
        for (int var4 = 0; var4 < class194.field3314.length; var4++) {
            byte[] var19 = class256.field4570[var4];
            if (var19 != null) {
                int var20 = (class94.field1719[var4] & 0xFF) * 64 - class213.field3742;
                int var21 = (class94.field1719[var4] >> 8) * 64 - class244.field4172;
                if (class2.field17) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class168.method1126(var20, var19, var21, -1);
            }
        }
        if (!var3) {
            class115.field2064 = 2;
            return;
        }
        if (class115.field2064 != 0) {
            class163.method1083(true, true, class172.method1150(new class85[] { class67.field1242, class240.field4148 }, 0));
        }
        class21.method145(30868);
        class184.method1264(-27604);
        class160.method1049();
        for (int var5 = 0; var5 < 4; var5++) {
            class34.field529[var5].method1813(2949);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    field3952[var6][var17][var18] = 0;
                }
            }
        }
        class18.method130(false, (byte) -106);
        class21.method145(30868);
        System.gc();
        class162.method1063(true, 50);
        class56.method372(30, false);
        if (!class2.field17) {
            class8.method42(false, 97);
            class162.method1063(true, 50);
            class256.method1777(false, 0);
            if (class79.field1459 != null) {
                class159.method1040((byte) -125);
            }
        }
        if (class2.field17) {
            class134.method892(1, false);
            class162.method1063(true, 50);
            class255.method1759(29493, false);
        }
        class184.method1264(-27604);
        class162.method1063(true, 50);
        class127.method860(false, -30996, class34.field529);
        class162.method1063(arg0, 50);
        int var7 = class204.field3559;
        if (var7 > class116.field2066) {
            var7 = class116.field2066;
        }
        if (var7 < class116.field2066 - 1) {
            int var8 = class116.field2066 - 1;
        }
        if (class121.method833((byte) -77)) {
            class152.method1002(0);
        } else {
            class152.method1002(class204.field3559);
        }
        class270.method1853(100);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class212.method1457((byte) 20, var16, var9);
            }
        }
        class124.method851(!arg0);
        class21.method145(30868);
        class184.method1263((byte) -67);
        class184.method1264(-27604);
        if (class167.field2882 != null && class198.field3390 != null && class1.field4 == 25) {
            class207.field3618.method483(-24260, 69);
            class207.field3618.method1715(1057001181, (byte) 125);
            class216.field3795++;
        }
        if (!class2.field17) {
            int var10 = (class67.field1232 - 6) / 8;
            int var11 = (class67.field1232 + 6) / 8;
            int var12 = (class48.field849 + 6) / 8;
            int var13 = (class48.field849 - 6) / 8;
            for (int var14 = var10 - 1; var14 <= (var11 + 1); var14++) {
                for (int var15 = var13 - 1; var15 <= var12 + 1; var15++) {
                    if (var14 < var10 || var14 > var11 || var13 > var15 || var12 < var15) {
                        class36.field555.method455(2, class172.method1150(new class85[] { class106.field1850, class68.method451(var14, -12572), class144.field2471, class68.method451(var15, -12572) }, 0));
                        class36.field555.method455(2, class172.method1150(new class85[] { class264.field4724, class68.method451(var14, -12572), class144.field2471, class68.method451(var15, -12572) }, 0));
                    }
                }
            }
        }
        if (class1.field4 == 28) {
            class169.method1136(true, 10);
        } else {
            class169.method1136(true, 30);
            if (class198.field3390 != null) {
                class207.field3618.method483(-24260, 88);
            }
        }
        class21.method145(30868);
        class251.method1730(0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(JIB[I)Ljd;")
    public final class85 method1084(long arg0, int arg1, byte arg2, int[] arg3) {
        field3953++;
        if (arg1 == 0) {
            class72 var6 = class4.method17(arg3[0], -127);
            return var6.method505(true, (int) arg0);
        }
        int var7 = -104 / ((44 - arg2) / 35);
        if (arg1 == 1 || arg1 == 10) {
            class61 var8 = class32.method221(11649, (int) arg0);
            return var8.field1106;
        } else if (arg1 == 6 || arg1 == 7) {
            return class4.method17(arg3[0], -102).method505(true, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1534(int arg0) {
        field3948 = null;
        field3957 = null;
        field3958 = null;
        field3954 = null;
        field3952 = null;
        if (arg0 > -112) {
            method1530((class68) null, (byte) 86, -88);
        }
        field3949 = null;
    }
}
