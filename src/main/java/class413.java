import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class413 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public int field6280 = -1;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public int field6283 = -1;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "[Lnl;")
    public static class475[] field6289 = new class475[8];

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Ldw;")
    public static class403 field6290 = new class403("", 10);

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6291 = null;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Ljc;")
    public static class356 field6292 = new class356(6, 16);

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "[I")
    public int[] field6287;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2553(int arg0) {
        int var1 = 55 % ((-arg0 - 20) / 61);
        field6289 = null;
        field6290 = null;
        field6292 = null;
        field6291 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lia;I)V")
    public final void method2554(class23 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method126((byte) -87);
            if (var3 == 0) {
                field6282++;
                if (arg1 != -2135660285) {
                    method2558(null, -96);
                    return;
                }
                return;
            }
            this.method2555(arg0, var3, arg1 - 2028597305);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lia;II)V")
    private final void method2555(class23 arg0, int arg1, int arg2) {
        field6284++;
        if (arg1 == 1) {
            this.field6280 = arg0.method132(118);
        } else if (arg1 == 2) {
            this.field6287 = new int[arg0.method126((byte) -120)];
            for (int var4 = 0; var4 < this.field6287.length; var4++) {
                this.field6287[var4] = arg0.method132(106);
            }
        } else if (arg1 == 3) {
            this.field6283 = arg0.method126((byte) -93);
        }
        if (arg2 != 130709706) {
            method2556(117);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    public static final void method2556(int arg0) {
        field6288++;
        class344.method2214(class510.field7403.field5104, 36);
        int var1 = (class473.field7021 >> 10) + (class16.field181 >> 3);
        class93.field1556 = class302.field4850.field4720 = 0;
        int var2 = (class48.field764 >> 10) + (class455.field6794 >> 3);
        class302.field4850.method1134(8, 8, (byte) 106);
        byte var3 = 18;
        class160.field2565 = new int[var3];
        class503.field7345 = new byte[var3][];
        class197.field3092 = new byte[var3][];
        class53.field855 = new byte[var3][];
        class101.field1671 = new int[var3];
        class435.field6508 = new int[var3];
        class23.field328 = new int[var3];
        class397.field6073 = new int[var3];
        class52.field845 = new int[var3][4];
        class496.field7243 = new byte[var3][];
        class505.field7360 = new int[var3];
        if (arg0 != 8616931) {
            method2558(null, -100);
        }
        class162.field2567 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class217.field3775 >> 4)) / 8; var5 <= ((class217.field3775 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class277.field4548 >> 4)) / 8; var8 <= ((class277.field4548 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class23.field328[var4] = var9;
                class101.field1671[var4] = class388.field5971.method2927("m" + var5 + "_" + var8, -34);
                class160.field2565[var4] = class388.field5971.method2927("l" + var5 + "_" + var8, class53.method369(arg0, -8616902));
                class505.field7360[var4] = class388.field5971.method2927("n" + var5 + "_" + var8, -22);
                class397.field6073[var4] = class388.field5971.method2927("um" + var5 + "_" + var8, class53.method369(arg0, -8616853));
                class435.field6508[var4] = class388.field5971.method2927("ul" + var5 + "_" + var8, -34);
                if (class505.field7360[var4] == -1) {
                    class101.field1671[var4] = -1;
                    class160.field2565[var4] = -1;
                    class397.field6073[var4] = -1;
                    class435.field6508[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class505.field7360.length; var6++) {
            class505.field7360[var6] = -1;
            class101.field1671[var6] = -1;
            class160.field2565[var6] = -1;
            class397.field6073[var6] = -1;
            class435.field6508[var6] = -1;
        }
        byte var7;
        if (class32.field515 == 1 || class32.field515 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class239.method1642(var7, false, -11, var2, var1);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IJ)V")
    public static final void method2557(int arg0, long arg1) {
        if (class66.field977 != null) {
            if (class190.field2963 == 1 || class190.field2963 == 5) {
                class397.method2482(arg1, 119);
            } else if (class190.field2963 == 4) {
                class265.method1773((byte) -75, arg1);
            }
        }
        field6281++;
        class154.method1079((long) class504.field7348, class305.field4873, (byte) 77);
        if (class379.field5881 != -1) {
            class241.method1649(class379.field5881, -1);
        }
        for (int var3 = 0; var3 < class128.field2208; var3++) {
            if (class445.field6633[var3]) {
                client.field1170[var3] = true;
            }
            class67.field987[var3] = class445.field6633[var3];
            class445.field6633[var3] = false;
        }
        class219.field3796 = class504.field7348;
        if (class305.field4873.method831()) {
            class379.field5880 = true;
        }
        if (class379.field5881 != -1) {
            class128.field2208 = 0;
            class99.method690((byte) -44);
        }
        class305.field4873.method848();
        method2559(class305.field4873, true);
        int var4 = class356.method2285(0);
        if (var4 == -1) {
            var4 = class102.field1688;
        }
        if (var4 == -1) {
            var4 = class106.field1900;
        }
        class48.method341(true, var4);
        class37.method273(class302.field4850.field4714, class431.field6455, 19844, class302.field4850.field4720, class302.field4850.field4716);
        if (arg0 == 1397) {
            class431.field6455 = 0;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2558(String arg0, int arg1) {
        field6286++;
        if (arg0.equals("")) {
            return;
        }
        class265.method1775(arg1 - 10, class462.field6875);
        class24.field336++;
        class261.field4357.method163(class323.method2037(arg0, -1), (byte) 49);
        class261.field4357.method145(arg0, (byte) 0);
        if (arg1 != 8) {
            field6289 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lza;Z)V")
    public static final void method2559(class491 arg0, boolean arg1) {
        if (class387.field5967) {
            class424.method2598(arg0, 32586);
        } else {
            class6.method30(arg0, true);
        }
        if (!arg1) {
            method2553(87);
        }
        field6285++;
    }
}
