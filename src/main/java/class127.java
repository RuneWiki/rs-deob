import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class127 extends class620 {

    @OriginalMember(owner = "client!rea", name = "M", descriptor = "I")
    private int field1671 = 0;

    @OriginalMember(owner = "client!rea", name = "hb", descriptor = "Z")
    public boolean field1691 = false;

    @OriginalMember(owner = "client!rea", name = "ib", descriptor = "I")
    private int field1692 = 0;

    @OriginalMember(owner = "client!rea", name = "db", descriptor = "I")
    private int field1687 = 0;

    @OriginalMember(owner = "client!rea", name = "mb", descriptor = "Z")
    private boolean field1696 = true;

    @OriginalMember(owner = "client!rea", name = "Q", descriptor = "I")
    private int field1674 = 0;

    @OriginalMember(owner = "client!rea", name = "W", descriptor = "I")
    private int field1680 = -1;

    @OriginalMember(owner = "client!rea", name = "lb", descriptor = "I")
    private int field1695 = 0;

    @OriginalMember(owner = "client!rea", name = "Z", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!rea", name = "jb", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!rea", name = "T", descriptor = "Ljba;")
    private class11 field1677;

    @OriginalMember(owner = "client!rea", name = "N", descriptor = "Ltq;")
    public static class536 field1672 = new class536(64);

    @OriginalMember(owner = "client!rea", name = "L", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!rea", name = "O", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!rea", name = "R", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!rea", name = "S", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!rea", name = "U", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!rea", name = "V", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!rea", name = "X", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!rea", name = "Y", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!rea", name = "ab", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!rea", name = "bb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!rea", name = "eb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!rea", name = "fb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!rea", name = "gb", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!rea", name = "kb", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!rea", name = "nb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!rea", name = "ob", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!rea", name = "pb", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!rea", name = "cb", descriptor = "Lnia;")
    private class513 field1686;

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1683 = arg0;
        this.field1693 = arg1 + arg2;
        this.field1671 = arg12;
        class353 var14 = class62.field819.method562((byte) 102, this.field1683);
        int var15 = var14.field4292;
        if (~var15 != 0) {
            this.field1677 = class143.field1864.method4265(true, var15);
            this.field1691 = false;
        } else {
            this.field1691 = true;
        }
        if (~this.field1693 == ~arg2) {
            class117.method699(this.field1687, this.field1677, false, this);
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(Z)Z")
    public final boolean method738(boolean arg0) {
        if (!arg0) {
            this.method185(-101);
        }
        ++field1681;
        return this.field1696;
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        ++field1673;
        if (arg0 > -80) {
            this.field1687 = 33;
        }
        return false;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Loha;Lka;ILha;)V")
    private final void method739(class465 arg0, class299 arg1, int arg2, class570 arg3) {
        arg1.method1273(arg0);
        ++field1678;
        class581[] var5 = arg1.method1247();
        class49[] var6 = arg1.method1246();
        if ((this.field1686 == null || this.field1686.field6534) && (var5 != null || var6 != null)) {
            this.field1686 = class513.method2843(class693.field8900, true);
        }
        if (this.field1686 != null) {
            this.field1686.method2840(arg3, (long) class693.field8900, var5, var6, false);
            this.field1686.method2833(super.field2895, super.field7852, super.field7849, super.field7844, super.field7850);
        }
        if (arg2 != 5) {
            field1672 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lha;JI)V")
    public static final void method740(class570 arg0, long arg1, int arg2) {
        class405.field5377 = 0;
        class464.field6030 = class70.field959;
        ++field1684;
        class204.field2821 = 0;
        class70.field959 = arg2;
        long var4 = class502.method2786(-7114);
        for (class513 var6 = (class513) class196.field2717.method857(-112); var6 != null; var6 = (class513) class196.field2717.method864(true)) {
            if (var6.method2834(arg0, arg1)) {
                ++class204.field2821;
            }
        }
        if (class370.field4538 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class196.field2717.method858((byte) -28) + ", running: " + class204.field2821);
            System.out.println("Emitters: " + class405.field5377 + " Particles: " + class70.field959 + ". Time taken: " + (class502.method2786(-7114) + -var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(III)Lsi;")
    public static final class721 method741(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10433;
    }

    @OriginalMember(owner = "client!rea", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1697;
        if (this.field1686 != null) {
            this.field1686.method2846();
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZIBLlq;Lha;II)V")
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field1688;
        if (arg2 != -126) {
            this.field1693 = 13;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
    public final void method185(int arg0) {
        ++field1689;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(ILha;)Lid;")
    public final class486 method170(int arg0, class570 arg1) {
        int var3 = -127 / ((-9 - arg0) / 63);
        ++field1685;
        return null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)V")
    public final void method742(int arg0, int arg1) {
        ++field1676;
        if (arg1 <= 34) {
            field1672 = null;
        }
        if (!this.field1691) {
            this.field1692 += arg0;
            while (~this.field1692 < ~this.field1677.field121[this.field1687]) {
                this.field1692 -= this.field1677.field121[this.field1687];
                ++this.field1687;
                if (this.field1677.field109.length <= this.field1687) {
                    this.field1691 = true;
                    break;
                }
            }
            if (!this.field1691) {
                class117.method699(this.field1687, this.field1677, false, this);
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(ILha;)Lpi;")
    public final class266 method187(int arg0, class570 arg1) {
        ++field1694;
        class299 var3 = this.method748(this.field1683, arg1, 2048, (~this.field1671 == -1 ? 0 : 5) | 2048);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field1671 != -1) {
                var3.method1253(this.field1671 * 2048);
            }
            class465 var4 = arg1.method948();
            var4.method449(super.field2896, super.field2892, super.field2900);
            this.method739(var4, var3, 5, arg1);
            class266 var5 = class689.method3680((byte) -15, false, 1);
            if (class653.field8360) {
                var3.method1292(var4, var5.field3533[0], class628.field7974, 0);
            } else {
                var3.method1297(var4, var5.field3533[0], 0);
            }
            if (this.field1686 != null) {
                class705 var6 = this.field1686.method2844();
                if (!class653.field8360) {
                    arg1.method912(var6);
                } else {
                    arg1.method980(var6, class628.field7974);
                }
            }
            if (arg0 != -29562) {
                this.method743((byte) -61);
            }
            this.field1696 = var3.method1272();
            this.field1674 = var3.method1260();
            this.field1695 = var3.method1296();
            return var5;
        }
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(B)Z")
    public final boolean method743(byte arg0) {
        ++field1682;
        if (arg0 > -76) {
            this.field1683 = 88;
        }
        return false;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        int var5 = 4 % ((-23 - arg3) / 37);
        ++field1698;
        return false;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public final void method744(int arg0) {
        ++field1690;
        if (this.field1686 != null) {
            this.field1686.method2846();
        }
        if (arg0 != 0) {
            this.field1680 = -17;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lha;I)V")
    public final void method182(class570 arg0, int arg1) {
        if (arg1 >= -87) {
            this.method185(-100);
        }
        ++field1679;
        class299 var3 = this.method748(this.field1683, arg0, 2048, 0);
        if (var3 != null) {
            class465 var4 = arg0.method948();
            var4.method449(super.field2896, super.field2892, super.field2900);
            this.method739(var4, var3, 5, arg0);
        }
    }

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "(B)I")
    public final int method745(byte arg0) {
        ++field1675;
        return arg0 >= -85 ? -117 : this.field1695;
    }

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1672 = null;
        if (arg0 != 0) {
            field1672 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "(I)I")
    public final int method747(int arg0) {
        if (arg0 != 15258) {
            this.field1696 = true;
        }
        ++field1699;
        return this.field1674;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILha;II)Lka;")
    private final class299 method748(int arg0, class570 arg1, int arg2, int arg3) {
        if (arg2 != 2048) {
            return null;
        } else {
            ++field1670;
            class353 var5 = class62.field819.method562((byte) 102, arg0);
            class358 var6 = class383.field4790[super.field2895];
            class358 var7 = super.field2889 >= 3 ? null : class383.field4790[super.field2889 - -1];
            return this.field1691 ? var5.method2030(var7, class143.field1864, 0, arg3, super.field2896, true, super.field2892, -1, -1, super.field2900, var6, arg1, (byte) -128) : var5.method2030(var7, class143.field1864, this.field1692, arg3, super.field2896, true, super.field2892, this.field1680, this.field1687, super.field2900, var6, arg1, (byte) -101);
        }
    }
}
