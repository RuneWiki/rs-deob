import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class269 extends class69 {

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public int field4673 = 0;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Lha;")
    private static class46 field4669 = class271.method1828("white:", -46);

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lha;")
    public static class46 field4642 = field4669;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Lha;")
    public static class46 field4656 = field4669;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Lkf;")
    public class110 field4668;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lkf;")
    public class110 field4671;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Ltc;")
    public class236 field4652;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Lmf;")
    public class26 field4660;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Lmi;")
    public class81 field4663;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4672;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "Z")
    public boolean field4665;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
    public static int[] field4646;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "[I")
    public static int[] field4664;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[I")
    public int[] field4676;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1798(byte arg0) {
        field4656 = null;
        field4664 = null;
        field4669 = null;
        field4642 = null;
        field4646 = null;
        field4672 = null;
        int var1 = -39 / ((-arg0 - 48) / 33);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lhi;Z)Z")
    public static final boolean method1799(class24 arg0, boolean arg1) {
        field4661++;
        if (arg0.field496 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field496.length; var2++) {
            int var3 = class233.method1585(var2, 22046, arg0);
            int var4 = arg0.field370[var2];
            if (arg0.field496[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field496[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field496[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (!arg1) {
            field4658 = 79;
        }
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final void method1800(int arg0) {
        field4647++;
        int var2 = this.field4643;
        if (this.field4652 != null) {
            class236 var3 = this.field4652.method1610(arg0 ^ 0xFFFFFFEA);
            if (var3 == null) {
                this.field4676 = null;
                this.field4644 = 0;
                this.field4667 = 0;
                this.field4674 = 0;
                this.field4643 = -1;
            } else {
                this.field4676 = var3.field4147;
                this.field4667 = var3.field4123;
                this.field4644 = var3.field4113;
                this.field4674 = var3.field4154 * 128;
                this.field4643 = var3.field4112;
            }
        } else if (this.field4660 != null) {
            int var4 = class48.method357(this.field4660, (byte) 42);
            if (var2 != var4) {
                this.field4643 = var4;
                class78 var5 = this.field4660.field511;
                if (var5.field1448 != null) {
                    var5 = var5.method620(arg0 - 17713);
                }
                if (var5 == null) {
                    this.field4674 = 0;
                } else {
                    this.field4674 = var5.field1472 * 128;
                }
            }
        } else if (this.field4663 != null) {
            this.field4643 = class155.method1146(1, this.field4663);
            this.field4674 = this.field4663.field1547 * 128;
        }
        if (this.field4643 != var2 && this.field4671 != null) {
            class236.field4116.method1711(this.field4671);
            this.field4671 = null;
        }
        if (arg0 != 0) {
            method1803(-99, 119, -102);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lni;")
    public static final class273 method1801(int arg0, int arg1) {
        field4653++;
        class273 var2 = (class273) class150.field2684.method86(7961, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class176.field3169.method1293(class186.method1350(1023, arg1), class111.method904((byte) 17, arg1), (byte) -94);
        int var4 = -11 / ((arg0 - 50) / 38);
        class273 var5 = new class273();
        if (var3 != null) {
            var5.method1845((byte) -94, new class75(var3));
        }
        class150.field2684.method80(var5, (long) arg1, (byte) 67);
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILpi;)V")
    public static final void method1802(int arg0, class181 arg1) {
        class26.field520 = arg1.method1320((byte) 63, class236.field4175);
        class148.field2665 = arg1.method1320((byte) 63, class249.field4390);
        if (arg0 != 3) {
            field4646 = null;
        }
        field4654++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lue;")
    public static final class197 method1803(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3585; var4++) {
            class197 var5 = var3.field3600[var4];
            if ((var5.field3523 >> 29 & 0x3L) == 2L && var5.field3541 == arg1 && var5.field3533 == arg2) {
                class120.method958(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1804(byte arg0, Component arg1) {
        arg1.addMouseListener(class54.field928);
        if (arg0 > 121) {
            arg1.addMouseMotionListener(class54.field928);
            arg1.addFocusListener(class54.field928);
            field4659++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public static final void method1805(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4651++;
        class210 var1 = class48.field830;
        synchronized (class48.field830) {
            class168.field2965++;
            class76.field1426 = class259.field4521;
            if (class149.field2674 >= 0) {
                while (class149.field2674 != class139.field2490) {
                    int var2 = class275.field4798[class139.field2490];
                    class139.field2490 = class139.field2490 + 1 & 0x7F;
                    if (var2 < 0) {
                        class162.field2878[~var2] = false;
                    } else {
                        class162.field2878[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class162.field2878[var3] = false;
                }
                class149.field2674 = class139.field2490;
            }
            class259.field4521 = class227.field3987;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public static final void method1806(int arg0, int arg1) {
        field4657++;
        if (~arg0 == arg1 || !class175.method1259(arg0, (byte) 77)) {
            return;
        }
        class24[] var2 = class215.field3809[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class24 var4 = var2[var3];
            if (var4.field476 != null) {
                class275 var5 = new class275();
                var5.field4796 = var4.field476;
                var5.field4792 = var4;
                class251.method1700(2000000, (byte) -17, var5);
            }
        }
    }
}
