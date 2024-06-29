import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class89 extends class69 {

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "[Loi;")
    public class89[] field1675;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Z")
    public boolean field1683;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lha;")
    public static class46 field1667 = class271.method1828("M", -46);

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "Lha;")
    private static class46 field1685 = class271.method1828("Use", -46);

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "Lha;")
    public static class46 field1687 = field1685;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "[I")
    public static int[] field1691 = new int[2];

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Lej;")
    public static class188 field1689 = new class188(64);

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "Lwf;")
    public static class16 field1692 = new class16(50);

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Lha;")
    public static class46 field1693 = class271.method1828(": ", -46);

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Lra;")
    public class108 field1695;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "Lal;")
    public class116 field1688;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "Lnh;")
    public static class270 field1696;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "[[I")
    public static int[][] field1694;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lwe;II)V")
    public void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 == -641641492) {
            field1690++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)[I")
    public final int[] method685(int arg0, int arg1, int arg2) {
        field1680++;
        int var4 = -16 % ((arg0 + 14) / 56);
        return this.field1675[arg2].field1683 ? this.field1675[arg2].method12(arg1, (byte) -30) : this.field1675[arg2].method30(arg1, (byte) 25)[0];
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)I")
    public int method686(byte arg0) {
        if (arg0 <= 30) {
            field1696 = null;
        }
        field1676++;
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(BI)V")
    public static final void method687(byte arg0, int arg1) {
        field1684++;
        int var2 = 19 / ((35 - arg0) / 51);
        class146 var3 = class6.method22((byte) 16, 12, arg1);
        var3.method1082((byte) -113);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
    public int method688(int arg0) {
        field1674++;
        if (arg0 != -27946) {
            field1691 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public void method8(boolean arg0) {
        field1669++;
        if (!arg0) {
            this.method30(-108, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII)[[I")
    public final int[][] method689(byte arg0, int arg1, int arg2) {
        if (arg0 != 95) {
            return null;
        }
        field1673++;
        if (this.field1675[arg1].field1683) {
            int[] var4 = this.field1675[arg1].method12(arg2, (byte) 101);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1675[arg1].method30(arg2, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILpi;)V")
    public static final void method690(int arg0, class181 arg1) {
        class130.field2384 = arg1;
        field1682++;
        class115.field2172 = class130.field2384.method1327(false, arg0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[[I")
    public int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            this.field1688 = null;
        }
        field1672++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lpi;III)Lkg;")
    public static final class21 method691(class181 arg0, int arg1, int arg2, int arg3) {
        int var4 = 27 / ((-arg2 - 33) / 45);
        field1679++;
        return class146.method1083(arg0, arg1, arg3, (byte) 28) ? class182.method1329(121) : null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V")
    public final void method692(int arg0, int arg1, int arg2) {
        field1677++;
        int var4 = this.field1681 == 255 ? arg0 : this.field1681;
        if (arg1 != 3) {
            this.method12(4, (byte) 87);
        }
        if (this.field1683) {
            this.field1688 = new class116(var4, arg0, arg2);
        } else {
            this.field1695 = new class108(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLhi;)V")
    public static final void method693(byte arg0, class24 arg1) {
        int var2 = arg1.field407;
        field1686++;
        if (var2 == 324) {
            if (class272.field4758 == -1) {
                class272.field4758 = arg1.field451;
                class96.field1795 = arg1.field392;
            }
            if (class199.field3565.field1417) {
                arg1.field451 = class272.field4758;
            } else {
                arg1.field451 = class96.field1795;
            }
        } else if (var2 == 325) {
            if (class272.field4758 == -1) {
                class272.field4758 = arg1.field451;
                class96.field1795 = arg1.field392;
            }
            if (class199.field3565.field1417) {
                arg1.field451 = class96.field1795;
            } else {
                arg1.field451 = class272.field4758;
            }
        } else if (arg0 < 0) {
            if (var2 == 327) {
                arg1.field373 = 150;
                arg1.field473 = (int) (Math.sin((double) class157.field2803 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field486 = -1;
                arg1.field359 = 5;
            } else if (var2 == 328) {
                if (class277.field4824.field1528 == null) {
                    arg1.field486 = 0;
                } else {
                    arg1.field373 = 150;
                    arg1.field473 = (int) (Math.sin((double) class157.field2803 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field359 = 5;
                    arg1.field486 = ((int) class277.field4824.field1528.method349((byte) 59) << 11) + 2047;
                    arg1.field434 = class277.field4824.field2584;
                    arg1.field352 = class277.field4824.field2537;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lpi;Lpi;Lpi;BLpi;)V")
    public static final void method694(class181 arg0, class181 arg1, class181 arg2, byte arg3, class181 arg4) {
        class168.field2972 = arg4;
        int var5 = 51 % ((arg3 + 77) / 40);
        class201.field3583 = arg1;
        class24.field401 = arg0;
        class105.field1884 = arg2;
        field1671++;
        class215.field3809 = new class24[class168.field2972.method1301(true)][];
        class139.field2492 = new boolean[class168.field2972.method1301(true)];
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IB)[I")
    public int[] method12(int arg0, byte arg1) {
        field1668++;
        int var3 = 96 / ((51 - arg1) / 44);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public void method695(int arg0) {
        field1670++;
        if (arg0 < 6) {
            field1696 = null;
        }
        if (this.field1683) {
            this.field1688.method935((byte) 127);
            this.field1688 = null;
        } else {
            this.field1695.method839((byte) -127);
            this.field1695 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public static void method696(byte arg0) {
        if (arg0 >= -8) {
            method693((byte) -19, (class24) null);
        }
        field1694 = null;
        field1689 = null;
        field1692 = null;
        field1667 = null;
        field1685 = null;
        field1691 = null;
        field1693 = null;
        field1696 = null;
        field1687 = null;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IZ)V")
    public class89(int arg0, boolean arg1) {
        this.field1675 = new class89[arg0];
        this.field1683 = arg1;
    }
}
