import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class132 extends class712 implements class238 {

    @OriginalMember(owner = "client!laa", name = "qb", descriptor = "Z")
    private boolean field1644 = false;

    @OriginalMember(owner = "client!laa", name = "gb", descriptor = "Lmw;")
    public class518 field1634;

    @OriginalMember(owner = "client!laa", name = "X", descriptor = "Z")
    private boolean field1625;

    @OriginalMember(owner = "client!laa", name = "lb", descriptor = "Ltja;")
    public static class288 field1639 = new class288(8);

    @OriginalMember(owner = "client!laa", name = "pb", descriptor = "[J")
    public static long[] field1643 = new long[100];

    @OriginalMember(owner = "client!laa", name = "S", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!laa", name = "V", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!laa", name = "W", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!laa", name = "Y", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!laa", name = "Z", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!laa", name = "ab", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!laa", name = "bb", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!laa", name = "cb", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!laa", name = "db", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!laa", name = "eb", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!laa", name = "fb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!laa", name = "hb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!laa", name = "ib", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!laa", name = "jb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!laa", name = "kb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!laa", name = "mb", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!laa", name = "nb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!laa", name = "ob", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!laa", name = "sb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!laa", name = "tb", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!laa", name = "U", descriptor = "Loba;")
    private class276 field1622;

    @OriginalMember(owner = "client!laa", name = "rb", descriptor = "Lbt;")
    public static class48 field1645;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(Z)Z")
    public final boolean method531(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field1647;
            return false;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;I)V")
    public final void method931(class66 arg0, int arg1) {
        this.field1634.method3110(arg0, (byte) 98);
        int var3 = -81 % ((arg1 - 28) / 63);
        ++field1621;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method979(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class6.field80 = arg0;
        class538.field7570 = arg1;
        class309.field3847 = class538.field7570 > 1 && class6.field80.method639();
        class714.field10017 = arg2;
        class327.field4047 = 1 << class714.field10017;
        class343.field4301 = class327.field4047 >> 1;
        Math.sqrt((double) (class343.field4301 * class343.field4301 + class343.field4301 * class343.field4301));
        class368.field4569 = arg3;
        class307.field3799 = arg4;
        class250.field2938 = arg5;
        class573.field7852 = arg6;
        class642.field8763 = class627.method3557(-7126);
        class241.method1460((byte) -128);
        class172.field2057 = new class727[arg3][class307.field3799][class250.field2938];
        class707.field9933 = new class296[arg3];
        if (arg7) {
            class68.field940 = new int[class307.field3799][class250.field2938];
            class406.field5335 = new byte[class307.field3799][class250.field2938];
            class316.field3876 = new short[class307.field3799][class250.field2938];
            class50.field707 = new class727[1][class307.field3799][class250.field2938];
            class704.field9910 = new class296[1];
        } else {
            class68.field940 = null;
            class406.field5335 = null;
            class316.field3876 = null;
            class50.field707 = null;
            class704.field9910 = null;
        }
        if (arg8) {
            class425.field5640 = new long[arg3][arg4][arg5];
            class331.field4094 = new class110[65535];
            class109.field1363 = new boolean[65535];
            class784.field10818 = 0;
        } else {
            class425.field5640 = null;
            class331.field4094 = null;
            class109.field1363 = null;
            class784.field10818 = 0;
        }
        class146.method1064(false);
        class653.field9015 = new class61[2];
        class119.field1509 = new class61[2];
        class454.field6399 = new class61[2];
        class430.field5671 = new class61[10000];
        class446.field6000 = 0;
        class642.field8765 = new class61[5000];
        class116.field1480 = 0;
        class620.field8391 = new class712[5000];
        class521.field7397 = 0;
        class308.field3820 = new boolean[class573.field7852 + class573.field7852 + 1][class573.field7852 + class573.field7852 + 1];
        class152.field1896 = new boolean[class573.field7852 + class573.field7852 + 2][class573.field7852 + class573.field7852 + 2];
        class467.field6533 = new int[class573.field7852 + class573.field7852 + 2];
        class613.field8242 = class613.field8240;
        if (class309.field3847) {
            class617.field8308 = new boolean[arg3][class573.field7852 + class573.field7852 + 1][class573.field7852 + class573.field7852 + 1];
            class207.field2459 = new boolean[arg3][][];
            if (class747.field10373 != null) {
                class260.method1552();
            }
            class747.field10373 = new class364[class538.field7570];
            class6.field80.method609(class747.field10373.length + 1);
            class6.field80.method605(0);
            for (int var9 = 0; var9 < class747.field10373.length; ++var9) {
                class747.field10373[var9] = new class364(var9 + 1, class6.field80);
                (new Thread(class747.field10373[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class538.field7570 == 2) {
                var10 = 4;
                class46.field612 = 2;
            } else if (class538.field7570 == 3) {
                var10 = 6;
                class46.field612 = 3;
            } else {
                var10 = 8;
                class46.field612 = 4;
            }
            class468.field6545 = new class393[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class468.field6545[var11] = new class393(class385.field4936[class538.field7570 - 2][var11]);
            }
        } else {
            class46.field612 = 1;
        }
        class688.field9379 = new int[class46.field612 - 1];
        class548.field7643 = new int[class46.field612 - 1];
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(III)Z")
    public static final boolean method980(int arg0, int arg1, int arg2) {
        ++field1635;
        if (arg1 <= 40) {
            method981(-105);
        }
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)I")
    public final int method508(int arg0) {
        ++field1636;
        if (arg0 != -4798) {
            this.field1634 = null;
        }
        return this.field1634.method3098((byte) -15);
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)I")
    public final int method928(int arg0) {
        ++field1640;
        if (arg0 != 13272) {
            field1645 = null;
        }
        return this.field1634.field7322;
    }

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "(I)V")
    public static void method981(int arg0) {
        field1639 = null;
        field1645 = null;
        if (arg0 == -5845) {
            field1643 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(ILha;)Lrk;")
    public final class35 method502(int arg0, class66 arg1) {
        ++field1628;
        class498 var3 = this.field1634.method3102(2048, false, true, -35, arg1);
        if (var3 == null) {
            return null;
        } else {
            class778 var4 = arg1.method576();
            var4.method130(super.field823, super.field809, super.field813);
            class35 var5 = class415.method2476(1, (byte) 109, this.field1625);
            this.field1634.method3109(true, super.field9991, super.field9994, var3, -17230, super.field9990, var4, super.field9997, arg1);
            if (!class502.field7084) {
                var3.method355(var4, var5.field537[0], 0);
            } else {
                var3.method388(var4, var5.field537[0], class621.field8528, 0);
            }
            int var6 = -53 % ((47 - arg0) / 63);
            if (this.field1634.field7301 != null) {
                class460 var7 = this.field1634.field7301.method4244();
                if (!class502.field7084) {
                    arg1.method582(var7);
                } else {
                    arg1.method590(var7, class621.field8528);
                }
            }
            this.field1644 = var3.method380() || this.field1634.field7301 != null;
            if (this.field1622 != null) {
                class521.method3120(119, super.field809, this.field1622, super.field813, var3, super.field823);
            } else {
                this.field1622 = class792.method4369(super.field809, super.field823, var3, (byte) -5, super.field813);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
    public final int method927(int arg0) {
        if (arg0 != -24482) {
            this.method531(true);
        }
        ++field1646;
        return this.field1634.field7296;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
    public final int method929(byte arg0) {
        if (arg0 != -45) {
            return 7;
        } else {
            ++field1631;
            return this.field1634.field7289;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILha;)V")
    public final void method930(int arg0, class66 arg1) {
        ++field1642;
        if (arg0 != 14353) {
            this.method501(-19, (byte) 48, 124, (class66) null);
        }
        this.field1634.method3099(-1, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        ++field1623;
        if (arg0) {
            field1645 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IBILha;)Z")
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        if (arg1 < 19) {
            this.field1625 = false;
        }
        ++field1633;
        class498 var5 = this.field1634.method3102(131072, false, false, -48, arg3);
        if (var5 == null) {
            return false;
        } else {
            class778 var6 = arg3.method576();
            var6.method130(super.field823, super.field809, super.field813);
            return class502.field7084 ? var5.method379(arg0, arg2, var6, false, 0, class621.field8528) : var5.method363(arg0, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)I")
    public final int method509(int arg0) {
        int var2 = -19 / ((arg0 - -38) / 56);
        ++field1626;
        return this.field1634.method3106(false);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZLha;)Loba;")
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field1629;
        if (arg0) {
            this.method504((byte) 44);
        }
        return this.field1622;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIIIIIII)V")
    public class132(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2085 == -2, class622.method3541(arg12, arg13, -114));
        this.field1634 = new class518(arg0, arg1, arg12, arg13, super.field808, arg3, this, arg7, arg14);
        this.field1625 = arg1.field2171 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(CI)Z")
    public static final boolean method982(char arg0, int arg1) {
        ++field1630;
        if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
        } else if (arg1 != -8213) {
            return false;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else {
            return ~arg0 == -8365 || arg0 == 338 || ~arg0 == -8213 || ~arg0 == -340 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)Z")
    public final boolean method935(int arg0) {
        ++field1638;
        if (arg0 != 25271) {
            field1639 = null;
        }
        return this.field1634.method3108((byte) 119);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lgda;Lha;IIZII)V")
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field1632;
        if (arg6 <= -6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)Z")
    public final boolean method503(boolean arg0) {
        ++field1641;
        if (arg0) {
            this.method530(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;I)V")
    public final void method500(class66 arg0, int arg1) {
        ++field1624;
        if (arg1 == -1) {
            class498 var3 = this.field1634.method3102(262144, true, true, -83, arg0);
            if (var3 != null) {
                class778 var4 = arg0.method576();
                var4.method130(super.field823, super.field809, super.field813);
                this.field1634.method3109(false, super.field9991, super.field9994, var3, -17230, super.field9990, var4, super.field9997, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        if (arg0 != -24) {
            field1643 = null;
        }
        ++field1620;
        return this.field1644;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
    public final void method936(boolean arg0) {
        ++field1637;
        if (arg0) {
            this.method504((byte) -68);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILgt;)V")
    public final void method983(int arg0, class481 arg1) {
        ++field1627;
        if (arg0 >= -47) {
            field1645 = null;
        }
        this.field1634.method3101(0, arg1);
    }
}
