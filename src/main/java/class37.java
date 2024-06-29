import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public final int field633;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public final int field643;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public final int field640;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lae;")
    public final class169 field632;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lcc;")
    public static class209 field637 = class95.method669(114, "loginscreen");

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lla;")
    public static class95 field639 = new class95(50);

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lcc;")
    public static class209 field645 = class95.method669(122, "");

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field646 = -1;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Ldl;")
    public static class122 field636;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lji;")
    public static class42 field644;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JI)V")
    public static final void method276(long arg0, int arg1) {
        field634++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 <= class163.field2949) {
            class238.method1649((byte) -121, class246.field4451, 0, class86.field1718);
            return;
        }
        class209 var3 = class56.method437(arg0, (byte) 89).method1459((byte) -121);
        for (int var4 = 0; var4 < class163.field2949; var4++) {
            if (class253.field4566[var4] == arg0) {
                class238.method1649((byte) -123, class246.field4451, 0, class229.method1604(new class209[] { var3, class104.field2007 }, (byte) 55));
                return;
            }
        }
        for (int var5 = 0; var5 < class3.field38; var5++) {
            if (class179.field3253[var5] == arg0) {
                class238.method1649((byte) -119, class246.field4451, 0, class229.method1604(new class209[] { class252.field4527, var3, class68.field1307 }, (byte) 55));
                return;
            }
        }
        if (var3.method1457((byte) -118, class223.field4069.field2140)) {
            class238.method1649((byte) -120, class246.field4451, 0, class131.field2515);
            return;
        }
        class137.field2563++;
        class253.field4566[class163.field2949] = arg0;
        class129.field2474[class163.field2949++] = class56.method437(arg0, (byte) 66);
        class264.field4744 = class54.field1069;
        class84.field1677.method287((byte) 122, 140);
        class84.field1677.method756(arg0, (byte) 78);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lsi;")
    public static final class197 method277(int arg0, int arg1) {
        field642++;
        class197 var2 = (class197) class222.field4051.method670((byte) -128, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 50) {
            field639 = null;
        }
        byte[] var3 = class179.field3258.method353(class82.method583(arg0, (byte) 50), arg1 ^ 0xFFFFFFA8, class82.method578(false, arg0));
        class197 var4 = new class197();
        if (var3 != null) {
            var4.method1351(-25736, new class106(var3));
        }
        class222.field4051.method673((long) arg0, -5087, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lcc;ZI)V")
    public static final void method278(class209 arg0, boolean arg1, int arg2) {
        field638++;
        int var3 = arg1 ? 32768 : 0;
        class209 var4 = arg0.method1467((byte) 125);
        short[] var5 = new short[16];
        int var6 = 0;
        int var7 = (arg1 ? class166.field3001 : class7.field130) + var3;
        for (int var8 = var3; var8 < var7; var8++) {
            class257 var11 = class215.method1507(var8, 12076);
            if (var11.field4633 && var11.method1781(-108).method1467((byte) 79).method1443(true, var4) != -1) {
                if (var6 >= 50) {
                    class289.field5092 = -1;
                    class3.field47 = null;
                    return;
                }
                if (var6 >= var5.length) {
                    short[] var12 = new short[var5.length * 2];
                    for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = var5[var13];
                    }
                    var5 = var12;
                }
                var5[var6++] = (short) var8;
            }
        }
        class289.field5092 = var6;
        class28.field519 = 0;
        class209[] var9 = new class209[class289.field5092];
        class3.field47 = var5;
        int var10 = 0;
        if (arg2 != 2) {
            field636 = null;
        }
        while (var10 < class289.field5092) {
            var9[var10] = class215.method1507(var5[var10], arg2 + 12074).method1781(-125);
            var10++;
        }
        class78.method546(0, var9, class3.field47);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        field644 = null;
        field636 = null;
        field639 = null;
        if (arg0 == 2) {
            field637 = null;
            field645 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static final void method280(int arg0) {
        if (arg0 != 17356) {
            return;
        }
        for (int var1 = 0; var1 < class244.field4423; var1++) {
            int var2 = class211.field3840[var1];
            class163 var3 = class60.field1207[var2];
            int var4 = client.field2818.method774((byte) 115);
            if ((var4 & 0x8) != 0) {
                var3.field1559 = client.field2818.method736(arg0 ^ 0x43B7);
                if (var3.field1559 == 65535) {
                    var3.field1559 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field2969.method1644((byte) -51)) {
                    class7.method74(-114, var3);
                }
                var3.method1127(-60, class78.method549(78, client.field2818.method766(-56)));
                var3.method571((byte) 14, var3.field2969.field4277);
                var3.field1543 = var3.field2969.field4279;
                var3.field1544 = var3.field2969.field4236;
                var3.field1569 = var3.field2969.field4235;
                var3.field1516 = var3.field2969.field4263;
                var3.field1511 = var3.field2969.field4259;
                var3.field1549 = var3.field2969.field4264;
                var3.field1520 = var3.field2969.field4296;
                var3.field1561 = var3.field2969.field4293;
                if (var3.field2969.method1644((byte) 103)) {
                    class114.method810((class218) null, var3.field1567[0], 0, class99.field1937, (byte) 108, var3, var3.field1548[0], (class108) null);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1553 = client.field2818.method766(-105);
                var3.field1524 = client.field2818.method741(-253);
            }
            if ((var4 & 0x80) != 0) {
                int var5 = client.field2818.method774((byte) 82);
                int var6 = client.field2818.method774((byte) 107);
                var3.method572(var5, class163.field2968, -121, var6);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = client.field2818.method757(-1);
                int var8 = client.field2818.method774((byte) 99);
                var3.method572(var7, class163.field2968, arg0 ^ 0xFFFFBC44, var8);
                var3.field1522 = class163.field2968 + 300;
                var3.field1565 = client.field2818.method761(-115);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1552 = client.field2818.method755(1);
                var3.field1509 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1517 = client.field2818.method736(124);
                int var9 = client.field2818.method770(-100);
                var3.field1538 = class163.field2968 + (var9 & 0xFFFF);
                if (var3.field1517 == 65535) {
                    var3.field1517 = -1;
                }
                var3.field1568 = 0;
                var3.field1572 = var9 >> 16;
                var3.field1547 = 0;
                if (class163.field2968 < var3.field1538) {
                    var3.field1547 = -1;
                }
                if (var3.field1517 != -1 && class163.field2968 == var3.field1538) {
                    int var10 = class259.method1797(119, var3.field1517).field4122;
                    if (var10 != -1) {
                        class241 var11 = class245.method1706(var10, (byte) 120);
                        if (var11 != null && var11.field4341 != null) {
                            class224.method1577(0, var11, var3.field1534, var3.field1571, arg0 - 17228, false);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var12 = client.field2818.method741(-253);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = client.field2818.method757(-1);
                class245.method1709(var13, var3, var12, -56);
            }
        }
        field635++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public static final void method281(int arg0, int arg1, int arg2) {
        field631++;
        class195 var3 = class178.method1229(arg2, arg1, 69);
        var3.method1338(0);
        var3.field3511 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJIB)Z")
    public static final boolean method282(int arg0, long arg1, int arg2, byte arg3) {
        field641++;
        if (arg3 >= -88) {
            return true;
        }
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class218 var8 = class245.method1711(27093, var7);
            int var9 = var8.field3913;
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var11 = var8.field3912;
                var10 = var8.field3916;
            } else {
                var10 = var8.field3912;
                var11 = var8.field3916;
            }
            if (var6 != 0) {
                var9 = (var9 >> 4 - var6) + (var9 << var6 & 0xF);
            }
            class266.method1816(var10, class223.field4069.field1567[0], 0, var11, var9, 0, class223.field4069.field1548[0], 4474, true, arg0, 2, arg2);
        } else {
            class266.method1816(0, class223.field4069.field1567[0], var6, 0, 0, var5 + 1, class223.field4069.field1548[0], 4474, true, arg0, 2, arg2);
        }
        class253.field4571 = class76.field1413;
        class284.field5002 = 0;
        class31.field570 = class237.field4246;
        class159.field2895 = 2;
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIII)V")
    public class37(int arg0, int arg1, int arg2, int arg3) {
        class169 var5 = class206.method1405(arg0, 17127);
        this.field633 = arg2;
        this.field643 = arg3;
        this.field640 = arg1;
        if (var5.field3085 == -1) {
            this.field632 = var5;
        } else {
            this.field632 = class206.method1405(var5.field3085, 17127);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lae;III)V")
    public class37(class169 arg0, int arg1, int arg2, int arg3) {
        this.field633 = arg2;
        this.field640 = arg1;
        this.field632 = arg0;
        this.field643 = arg3;
    }
}
