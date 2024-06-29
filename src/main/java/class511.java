import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class511 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Ldp;")
    public static class347 field7496 = new class347("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Luv;")
    public static class2 field7501 = new class2(23, -2);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 8)
    public static void method3012(int arg0) {
        field7496 = null;
        if (arg0 != 23) {
            field7501 = null;
        }
        field7501 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lgk;I)Lol;", line = 34)
    public static final class196 method3013(class468 arg0, int arg1) {
        field7497++;
        if (arg1 != 1) {
            method3015(106);
        }
        class196 var2 = new class196();
        var2.field2882 = arg0.method2727((byte) 43);
        var2.field2878 = class40.field530.method1433(false, var2.field2882);
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z", line = 53)
    public static final boolean method3014(int arg0, int arg1, int arg2) {
        field7498++;
        if (arg0 != 3652) {
            method3016(-81, true);
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 68)
    public static final void method3015(int arg0) {
        class292.method1812(arg0 - 14308, class251.field3435);
        field7499++;
        class450.field6620++;
        if (class53.field706 && class197.field2892) {
            int var1 = class45.field591.method44((byte) 122);
            int var2 = class45.field591.method54(28455);
            int var3 = var1 - class65.field885;
            int var4 = var2 - class508.field7470;
            if (arg0 == 1) {
                if (var3 < class292.field4379) {
                    var3 = class292.field4379;
                }
                if ((class251.field3435.field4661 + var3) > (class292.field4379 + class146.field2193.field4661)) {
                    var3 = class292.field4379 + class146.field2193.field4661 - class251.field3435.field4661;
                }
                if (var4 < class476.field7023) {
                    var4 = class476.field7023;
                }
                if ((class476.field7023 + class146.field2193.field4736) < (class251.field3435.field4736 + var4)) {
                    var4 = class476.field7023 + class146.field2193.field4736 - class251.field3435.field4736;
                }
                int var5 = var3 + class146.field2193.field4719 - class292.field4379;
                int var6 = class146.field2193.field4645 + var4 - class476.field7023;
                if (class45.field591.method52(18)) {
                    if (class251.field3435.field4676 < class450.field6620) {
                        int var7 = var3 - class15.field197;
                        int var8 = var4 - class421.field6299;
                        if (class251.field3435.field4655 < var7 || var7 < (-class251.field3435.field4655) || class251.field3435.field4655 < var8 || -class251.field3435.field4655 > var8) {
                            class521.field7659 = true;
                        }
                    }
                    if (class251.field3435.field4751 != null && class521.field7659) {
                        class120 var9 = new class120();
                        var9.field1826 = var5;
                        var9.field1832 = class251.field3435.field4751;
                        var9.field1837 = var6;
                        var9.field1833 = class251.field3435;
                        class64.method449(var9);
                        return;
                    }
                } else {
                    if (class521.field7659) {
                        class312.method1967(arg0 - 129);
                        if (class251.field3435.field4752 != null) {
                            class120 var10 = new class120();
                            var10.field1832 = class251.field3435.field4752;
                            var10.field1837 = var6;
                            var10.field1833 = class251.field3435;
                            var10.field1826 = var5;
                            var10.field1830 = class465.field6768;
                            class64.method449(var10);
                        }
                        if (class465.field6768 != null && client.method3052(class251.field3435) != null) {
                            class507.method2994(class465.field6768, class251.field3435, (byte) 118);
                        }
                    } else if ((class301.field4483 == 1 || class61.method435(false)) && class448.field6610 > 2) {
                        class111.method866((byte) -98, class508.field7470 + class421.field6299, class65.field885 + class15.field197);
                    } else if (class458.method2658((byte) 36)) {
                        class111.method866((byte) -98, class508.field7470 + class421.field6299, class65.field885 + class15.field197);
                    }
                    class251.field3435 = null;
                }
            }
        } else if (class450.field6620 > 1) {
            class251.field3435 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)V", line = 184)
    public static final void method3016(int arg0, boolean arg1) {
        class58.field797 = 0;
        class17.field280 = 0;
        field7500++;
        class399.method2410(-114);
        class62.method439(0, arg1);
        class349.method2112((byte) -121);
        for (int var2 = 0; var2 < class17.field280; var2++) {
            int var4 = class282.field4261[var2];
            if (class495.field7350 && class152.method1094(var4, (byte) 12)) {
                class258.method1583(-12144);
            }
            if (class86.field1350 != class88.field1375[var4].field6038) {
                if (class88.field1375[var4].field5409.method1733(-1)) {
                    class145.method1052(class88.field1375[var4], 0);
                }
                class88.field1375[var4].method2127(null, (byte) -108);
                class88.field1375[var4] = null;
            }
        }
        if (arg0 != 28348) {
            method3012(-128);
        }
        if (class158.field2386 != class400.field5966.field6830) {
            throw new RuntimeException("gnp1 pos:" + class400.field5966.field6830 + " psize:" + class158.field2386);
        }
        for (int var3 = 0; var3 < class519.field7609; var3++) {
            if (class88.field1375[class327.field5114[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class519.field7609);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "za", descriptor = "(Lc;)V")
    public abstract void method1304(class511 arg0);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "(IIIIII)V")
    public abstract void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class511 method1301();

    @OriginalMember(owner = "client!c", name = "ka", descriptor = "(I)V")
    public abstract void method1303(int arg0);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "(III[I)V")
    public abstract void method1306(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()V")
    public abstract void method1311();

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "(I)V")
    public abstract void method1298(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method1308(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "(III)V")
    public abstract void method1307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(I)V")
    public abstract void method1299(int arg0);

    @OriginalMember(owner = "client!c", name = "O", descriptor = "(I)V")
    public abstract void method1305(int arg0);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(I)V")
    public abstract void method1302(int arg0);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "([I)V")
    public abstract void method1297(int[] arg0);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(III)V")
    public abstract void method1309(int arg0, int arg1, int arg2);
}
