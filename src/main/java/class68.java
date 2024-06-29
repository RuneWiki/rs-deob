import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class68 {

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lc;")
    private class106 field1129 = new class106();

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lkd;")
    private class204 field1120;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lng;")
    public static class76 field1113 = new class76(5000);

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1130 = "flash1:";

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Laf;")
    public static class68 field1132 = new class68(5);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Lak;")
    public static class138 field1135;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method470(int arg0) {
        field1123++;
        for (class285 var1 = (class285) class206.field3310.method843(101); var1 != null; var1 = (class285) class206.field3310.method852((byte) 123)) {
            if (var1.field4498 == -1) {
                var1.field4493 = 0;
                class34.method287(arg0 + 93, var1);
            } else {
                var1.method1388(25);
            }
        }
        if (arg0 != 0) {
            method482((byte) 62);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method471(int arg0, int arg1, String arg2) {
        field1113.method534((byte) -124, 53);
        field1112++;
        field1113.method1533(class74.method522((byte) -89, arg2), 9318);
        class53.field918++;
        field1113.method1520(7398, arg1);
        if (arg0 >= -84) {
            method473((byte) 92, -8);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public final void method472(byte arg0) {
        if (arg0 == -63) {
            this.field1129.method770((byte) 119);
            field1117++;
            this.field1120.method1398(arg0 + 63);
            this.field1122 = this.field1116;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Leh;")
    public static final class81 method473(byte arg0, int arg1) {
        field1127++;
        class81 var2 = (class81) class168.field2664.method1832((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 97) {
            return null;
        } else {
            byte[] var3 = class115.field1919.method1357(arg1, 26, -1);
            class81 var4 = new class81();
            if (var3 != null) {
                var4.method584(23692, new class221(var3));
            }
            class168.field2664.method1831((long) arg1, var4, 128);
            return var4;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JBLjava/lang/Object;)V")
    public final void method474(long arg0, byte arg1, Object arg2) {
        this.method479(arg0, -86);
        if (this.field1122 == 0) {
            class205 var5 = (class205) this.field1129.method771(-106);
            var5.method1388(122);
            var5.method40(0);
        } else {
            this.field1122--;
        }
        class240 var6 = new class240(arg2);
        field1115++;
        this.field1120.method1399(7292, var6, arg0);
        if (arg1 <= 22) {
            method471(-36, 9, (String) null);
        }
        this.field1129.method774(0, var6);
        var6.field48 = 0L;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z")
    public static final boolean method475(byte arg0) {
        field1125++;
        try {
            if (class220.field3599 == 2) {
                if (class226.field3741 == null) {
                    class226.field3741 = class65.method459(class244.field3917, class94.field1549, class132.field2119);
                    if (class226.field3741 == null) {
                        return false;
                    }
                }
                if (class270.field4254 == null) {
                    class270.field4254 = new class287(class259.field4124, class133.field2121);
                }
                if (class21.field357.method672(arg0 ^ 0xFFFFBBE2, class226.field3741, class10.field149, 22050, class270.field4254)) {
                    class21.field357.method656(arg0 + 54);
                    class21.field357.method662(false, class285.field4512);
                    class21.field357.method666(class226.field3741, 4001, class133.field2127);
                    class220.field3599 = 0;
                    class226.field3741 = null;
                    class270.field4254 = null;
                    class244.field3917 = null;
                    return true;
                }
            }
            if (arg0 != 12) {
                method471(-97, -59, (String) null);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class21.field357.method668(15);
            class270.field4254 = null;
            class220.field3599 = 0;
            class244.field3917 = null;
            class226.field3741 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public final void method476(boolean arg0, int arg1) {
        field1119++;
        if (arg0 || class32.field490 == null) {
            return;
        }
        for (class205 var3 = (class205) this.field1129.method766((byte) -127); var3 != null; var3 = (class205) this.field1129.method764((byte) -82)) {
            if (var3.method1415(true)) {
                if (var3.method1416((byte) -119) == null) {
                    var3.method1388(-113);
                    var3.method40(0);
                    this.field1122++;
                }
            } else if ((long) arg1 < ++var3.field48) {
                class205 var4 = class32.field490.method1059(var3, true);
                this.field1120.method1399(7292, var4, var3.field3247);
                class44.method362(var3, var4, true);
                var3.method1388(-117);
                var3.method40(0);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
    public static final String[] method477(String arg0, char arg1, int arg2) {
        int var3 = 0;
        field1118++;
        int var4 = 0;
        int var5 = class10.method74(arg0, false, arg1);
        String[] var6 = new String[var5 + 1];
        for (int var7 = arg2; var7 < var5; var7++) {
            int var8;
            for (var8 = var4; arg0.charAt(var8) != arg1; var8++) {
            }
            var6[var3++] = arg0.substring(var4, var8);
            var4 = var8 + 1;
        }
        var6[var5] = arg0.substring(var4);
        return var6;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
    public final int method478(int arg0) {
        int var2 = 0;
        field1114++;
        class205 var3 = (class205) this.field1129.method766((byte) -127);
        if (arg0 != 5) {
            this.field1129 = null;
        }
        while (var3 != null) {
            if (!var3.method1415(true)) {
                var2++;
            }
            var3 = (class205) this.field1129.method764((byte) -82);
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)V")
    public final void method479(long arg0, int arg1) {
        class205 var4 = (class205) this.field1120.method1400(arg0, true);
        field1126++;
        if (var4 != null) {
            var4.method1388(91);
            var4.method40(0);
            this.field1122++;
        }
        if (arg1 > -54) {
            method470(85);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method480(long arg0, int arg1) {
        field1121++;
        class205 var4 = (class205) this.field1120.method1400(arg0, true);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1416((byte) 14);
        if (arg1 <= 67) {
            return null;
        } else if (var5 == null) {
            var4.method1388(70);
            var4.method40(0);
            this.field1122++;
            return null;
        } else {
            if (var4.method1415(true)) {
                class240 var6 = new class240(var5);
                this.field1120.method1399(7292, var6, var4.field3247);
                this.field1129.method774(0, var6);
                var6.field48 = 0L;
                var4.method1388(77);
                var4.method40(0);
            } else {
                this.field1129.method774(0, var4);
                var4.field48 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        field1128++;
        for (class205 var2 = (class205) this.field1129.method766((byte) -127); var2 != null; var2 = (class205) this.field1129.method764((byte) -82)) {
            if (var2.method1415(true)) {
                var2.method1388(41);
                var2.method40(0);
                this.field1122++;
            }
        }
        if (arg0) {
            method473((byte) -40, 53);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class68(int arg0) {
        this.field1116 = arg0;
        this.field1122 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1120 = new class204(var2);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static void method482(byte arg0) {
        int var1 = -97 / ((arg0 + 18) / 36);
        field1130 = null;
        field1135 = null;
        field1113 = null;
        field1132 = null;
    }
}
