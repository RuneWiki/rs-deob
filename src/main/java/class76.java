import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class76 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Llj;")
    public class24 field1013 = new class24();

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
    public static boolean field1026 = true;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lk;")
    public static class36 field1010 = new class36(16);

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Luf;")
    public static class168 field1033 = class148.method1019(-1720, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Llj;")
    private class24 field1030;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[I")
    public static int[] field1011;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)Lca;", line = 5)
    public static final class134 method438(byte arg0, int arg1) {
        field1019++;
        class134 var2 = (class134) class51.field619.method185(-1, (long) arg1);
        if (arg0 != 59) {
            method449(-96, -28);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class300.field5088.method1647(5, (byte) 120, arg1);
        class134 var4 = new class134();
        if (var3 != null) {
            var4.method933(new class153(var3), true);
        }
        class51.field619.method187(var4, (long) arg1, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I", line = 34)
    public final int method439(int arg0) {
        if (arg0 != -21879) {
            method441((byte) -86);
        }
        int var2 = 0;
        field1014++;
        class24 var3 = this.field1013.field295;
        while (this.field1013 != var3) {
            var3 = var3.field295;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Llj;", line = 54)
    public final class24 method440(int arg0) {
        field1028++;
        if (arg0 != 3) {
            this.method439(9);
        }
        class24 var2 = this.field1030;
        if (this.field1013 == var2) {
            this.field1030 = null;
            return null;
        } else {
            this.field1030 = var2.field295;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 77)
    public static final void method441(byte arg0) {
        class148 var1 = new class148();
        int var2 = 30 / ((arg0 - 35) / 38);
        for (int var3 = 0; var3 < 13; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                class271.field4559[var3][var4] = var1;
            }
        }
        field1016++;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)Llj;", line = 104)
    public final class24 method442(int arg0) {
        if (arg0 != 65293) {
            field1033 = (class168) null;
        }
        class24 var2 = this.field1013.field295;
        field1021++;
        if (this.field1013 == var2) {
            this.field1030 = null;
            return null;
        } else {
            this.field1030 = var2.field295;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)Llj;", line = 124)
    public final class24 method443(int arg0) {
        field1023++;
        class24 var2 = this.field1013.field293;
        if (this.field1013 == var2) {
            this.field1030 = null;
            return null;
        } else {
            int var3 = 62 / ((-arg0 - 53) / 51);
            this.field1030 = var2.field293;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)Llj;", line = 174)
    public final class24 method444(int arg0) {
        class24 var2 = this.field1030;
        field1012++;
        if (this.field1013 == var2) {
            this.field1030 = null;
            return null;
        }
        if (arg0 != -27024) {
            this.method439(-3);
        }
        this.field1030 = var2.field293;
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 193)
    public static final void method445(int arg0, int arg1) {
        field1018++;
        class156.field2470[1] = (float) (class159.method1119(arg0, 65293) >> 8) / 255.0F;
        class156.field2470[2] = (float) class159.method1119(arg0, 255) / 255.0F;
        class156.field2470[0] = (float) (class159.method1119(arg0, 16733843) >> 16) / 255.0F;
        if (arg1 <= 67) {
            field1011 = (int[]) null;
        }
        class157.method1115(3, (byte) -59);
        class157.method1115(4, (byte) -59);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Llj;I)V", line = 208)
    public final void method446(class24 arg0, int arg1) {
        field1029++;
        if (arg0.field293 != null) {
            arg0.method124((byte) 120);
        }
        arg0.field293 = this.field1013;
        arg0.field295 = this.field1013.field295;
        arg0.field293.field295 = arg0;
        if (arg1 != -27762) {
            field1033 = (class168) null;
        }
        arg0.field295.field293 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Llj;", line = 226)
    public final class24 method447(boolean arg0) {
        class24 var2 = this.field1013.field295;
        field1020++;
        if (this.field1013 == var2) {
            return null;
        }
        if (!arg0) {
            this.method451(33, (class24) null);
        }
        var2.method124((byte) 112);
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V", line = 244)
    public static final void method448(byte arg0) {
        class240 var1 = (class240) class26.field319.method499((byte) -99);
        if (arg0 != 118) {
            method438((byte) -126, -67);
        }
        while (var1 != null) {
            int var2 = var1.field3898;
            if (class18.method83((byte) -116, var2)) {
                boolean var3 = true;
                class242[] var4 = class272.field4582[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4040;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field292;
                    class242 var7 = class130.method910((byte) -105, var6);
                    if (var7 != null) {
                        client.method2011((byte) -59, var7);
                    }
                }
            }
            var1 = (class240) class26.field319.method488(1);
        }
        field1017++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)Luk;", line = 303)
    public static final class203 method449(int arg0, int arg1) {
        field1025++;
        class203 var2 = (class203) class58.field761.method1424((long) arg1, (byte) 110);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class141.field2177.method1647(4, (byte) 127, arg1);
        class203 var4 = new class203();
        if (var3 != null) {
            var4.method1421(arg1, new class153(var3), 13);
        }
        class58.field761.method1430(var4, (long) arg1, 13487);
        if (arg0 != 1446) {
            field1010 = (class36) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILdk;Z)Lgk;", line = 326)
    public static final class265 method450(int arg0, int arg1, class241 arg2, boolean arg3) {
        field1015++;
        if (!arg3) {
            method448((byte) -22);
        }
        return class28.method148(arg1, arg2, arg0, -38) ? class289.method1992(0) : null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 405)
    public class76() {
        this.field1013.field295 = this.field1013;
        this.field1013.field293 = this.field1013;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILlj;)V", line = 346)
    public final void method451(int arg0, class24 arg1) {
        if (arg1.field293 != null) {
            arg1.method124((byte) 111);
        }
        field1022++;
        arg1.field295 = this.field1013;
        arg1.field293 = this.field1013.field293;
        if (arg0 != -91453648) {
            this.method447(true);
        }
        arg1.field293.field295 = arg1;
        arg1.field295.field293 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V", line = 366)
    public static void method452(byte arg0) {
        int var1 = -70 % ((67 - arg0) / 44);
        field1010 = null;
        field1011 = null;
        field1033 = null;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 379)
    public final void method453(int arg0) {
        while (true) {
            class24 var2 = this.field1013.field295;
            if (this.field1013 == var2) {
                field1027++;
                this.field1030 = null;
                if (arg0 != 255) {
                    method450(111, -29, (class241) null, true);
                }
                return;
            }
            var2.method124((byte) 83);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(DI)V", line = 420)
    public static final void method454(double arg0, int arg1) {
        if (arg1 != 0) {
            field1032 = 93;
        }
        field1031++;
        if (class278.field4665 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class18.field211[var3] = var4 <= 255 ? var4 : 255;
        }
        class278.field4665 = arg0;
    }
}
