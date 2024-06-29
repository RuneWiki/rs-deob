import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "J")
    private long field1647 = -1L;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field1661 = 0;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "J")
    private long field1670 = -1L;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Ltb;")
    private class114 field1665;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "J")
    private long field1662;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "J")
    private long field1674;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[B")
    private byte[] field1654;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "J")
    private long field1659;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[B")
    private byte[] field1655;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lhb;")
    public static class44 field1657 = class102.method810("RuneScape wird geladen )2 bitte warten)3)3)3", -28606);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lhb;")
    public static class44 field1651 = class102.method810("titlebox", -28606);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lhb;")
    private static class44 field1658 = class102.method810("Cancel", -28606);

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lhb;")
    private static class44 field1656 = class102.method810("Malformed login packet)3", -28606);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lhb;")
    public static class44 field1648 = field1658;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lhb;")
    public static class44 field1668 = field1656;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lfc;")
    public static class34 field1650 = new class34(64);

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1671 = 1;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lhb;")
    private static class44 field1677 = class102.method810("Add friend", -28606);

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lhb;")
    public static class44 field1676 = class102.method810("oder benutzen Sie eine andere Welt)3", -28606);

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[[I")
    public static int[][] field1675 = new int[104][104];

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Lhb;")
    public static class44 field1672 = field1677;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "J")
    private long field1660;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 9)
    private final void method577(int arg0) throws IOException {
        this.field1673 = 0;
        if (this.field1660 != this.field1659) {
            this.field1665.method866(this.field1659, (byte) -38);
            this.field1660 = this.field1659;
        }
        this.field1670 = this.field1659;
        while (this.field1655.length > this.field1673) {
            int var2 = this.field1665.method870(-1, this.field1655, this.field1655.length - this.field1673, this.field1673);
            if (var2 == -1) {
                break;
            }
            this.field1673 += var2;
            this.field1660 += var2;
        }
        if (arg0 == -18448) {
            field1667++;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BIII)V", line = 51)
    public final void method578(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1664++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field1647 != -1L && this.field1659 >= this.field1647 && (long) arg3 + this.field1659 <= (long) this.field1661 + this.field1647) {
                class115.method872(this.field1654, (int) (this.field1659 - this.field1647), arg0, arg1, arg3);
                this.field1659 += arg3;
                return;
            }
            long var5 = this.field1659;
            int var7 = arg3;
            int var8 = arg1;
            if (arg2 != 0) {
                field1656 = null;
            }
            if (this.field1670 <= this.field1659 && this.field1659 < (long) this.field1673 + this.field1670) {
                int var9 = (int) (this.field1670 + (long) this.field1673 - this.field1659);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class115.method872(this.field1655, (int) (this.field1659 - this.field1670), arg0, arg1, var9);
                arg1 += var9;
                this.field1659 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field1655.length) {
                this.field1665.method866(this.field1659, (byte) -38);
                this.field1660 = this.field1659;
                while (arg3 > 0) {
                    int var10 = this.field1665.method870(arg2 - 1, arg0, arg3, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1659 += var10;
                    arg1 += var10;
                    this.field1660 += var10;
                    arg3 -= var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method577(-18448);
                if (arg3 > this.field1673) {
                    var11 = this.field1673;
                }
                arg3 -= var11;
                class115.method872(this.field1655, 0, arg0, arg1, var11);
                arg1 += var11;
                this.field1659 += var11;
            }
            if (this.field1647 != -1L) {
                if (this.field1659 < this.field1647 && arg3 > 0) {
                    int var12 = arg1 + (int) (this.field1647 - this.field1659);
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg0[arg1++] = 0;
                        this.field1659++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (this.field1647 >= var5 && (long) var7 + var5 > this.field1647) {
                    var13 = this.field1647;
                } else if (var5 >= this.field1647 && var5 < (long) this.field1661 + this.field1647) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field1661 + this.field1647 > var5 && (long) var7 + var5 >= (long) this.field1661 + this.field1647) {
                    var15 = (long) this.field1661 + this.field1647;
                } else if (this.field1647 < var5 + (long) var7 && (long) this.field1661 + this.field1647 >= (long) var7 + var5) {
                    var15 = var5 + (long) var7;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class115.method872(this.field1654, (int) (var13 - this.field1647), arg0, var8 + (int) (var13 - var5), var17);
                    if (var15 > this.field1659) {
                        arg3 = (int) ((long) arg3 + this.field1659 - var15);
                        this.field1659 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1660 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 242)
    public final void method579(int arg0) throws IOException {
        if (arg0 != 2) {
            this.method584(114);
        }
        field1653++;
        this.method585((byte) -70);
        this.field1665.method868(-21426);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 255)
    public static void method580(int arg0) {
        field1651 = null;
        field1657 = null;
        field1668 = null;
        field1672 = null;
        field1650 = null;
        field1677 = null;
        field1676 = null;
        field1656 = null;
        int var1 = -39 / ((arg0 + 85) / 32);
        field1675 = null;
        field1648 = null;
        field1658 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)V", line = 283)
    public final void method581(long arg0, byte arg1) {
        int var4 = -101 % ((arg1 - 36) / 49);
        field1649++;
        if (arg0 >= 0L) {
            this.field1659 = arg0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z", line = 311)
    public static final boolean method582(int arg0, int arg1) {
        field1663++;
        if (!class94.method748(9902, arg1)) {
            return false;
        }
        class72[] var2 = class113.field2777[arg1];
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.length; var4++) {
            class72 var5 = var2[var4];
            if (var5 != null && var5.field1810 == 6) {
                if (var5.field1752 != -1 || var5.field1781 != -1) {
                    boolean var6 = class104.method820(3, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field1781;
                    } else {
                        var7 = var5.field1752;
                    }
                    if (var7 != -1) {
                        class118 var8 = client.method139(1, var7);
                        var5.field1832 += class44.field1124;
                        label55: while (true) {
                            do {
                                do {
                                    if (var8.field2885[var5.field1796] >= var5.field1832) {
                                        break label55;
                                    }
                                    var3 = true;
                                    var5.field1832 -= var8.field2885[var5.field1796];
                                    var5.field1796++;
                                } while (var8.field2883.length > var5.field1796);
                                var5.field1796 -= var8.field2881;
                            } while (var5.field1796 >= 0 && var8.field2883.length > var5.field1796);
                            var5.field1796 = 0;
                        }
                    }
                }
                if (var5.field1775 != 0) {
                    var3 = true;
                    int var9 = var5.field1775 >> 16;
                    int var10 = class44.field1124 * var9;
                    var5.field1819 = var5.field1819 + var10 & 0x7FF;
                    int var11 = var5.field1775 << 16 >> 16;
                    int var12 = class44.field1124 * var11;
                    var5.field1807 = var5.field1807 + var12 & 0x7FF;
                }
            }
        }
        if (arg0 != 2907) {
            field1668 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ltb;II)V", line = 696)
    public class66(class114 arg0, int arg1, int arg2) throws IOException {
        this.field1665 = arg0;
        this.field1674 = this.field1662 = arg0.method871(false);
        this.field1654 = new byte[arg2];
        this.field1659 = 0L;
        this.field1655 = new byte[arg1];
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 407)
    public static final void method583(int arg0) {
        Object var1 = class16.field322;
        synchronized (class16.field322) {
            if (class36.field861 == 0) {
                class103.field2626.method524(5, new class31(), (byte) 43);
            }
            class36.field861 = arg0;
        }
        field1652++;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)J", line = 421)
    public final long method584(int arg0) {
        if (arg0 != 721266200) {
            this.method581(-61L, (byte) -5);
        }
        field1646++;
        return this.field1674;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 439)
    private final void method585(byte arg0) throws IOException {
        if (arg0 >= -33) {
            field1677 = null;
        }
        if (this.field1647 != -1L) {
            if (this.field1660 != this.field1647) {
                this.field1665.method866(this.field1647, (byte) -38);
                this.field1660 = this.field1647;
            }
            this.field1665.method869(0, this.field1654, (byte) -90, this.field1661);
            this.field1660 += this.field1661;
            if (this.field1660 > this.field1662) {
                this.field1662 = this.field1660;
            }
            long var2 = -1L;
            if (this.field1670 < (long) this.field1661 + this.field1647 && this.field1647 + (long) this.field1661 <= (long) this.field1673 + this.field1670) {
                var2 = (long) this.field1661 + this.field1647;
            } else if ((long) this.field1673 + this.field1670 > this.field1647 && (long) this.field1661 + this.field1647 >= (long) this.field1673 + this.field1670) {
                var2 = (long) this.field1673 + this.field1670;
            }
            long var4 = -1L;
            if (this.field1670 <= this.field1647 && this.field1670 + (long) this.field1673 > this.field1647) {
                var4 = this.field1647;
            } else if (this.field1647 <= this.field1670 && this.field1670 < (long) this.field1661 + this.field1647) {
                var4 = this.field1670;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class115.method872(this.field1654, (int) (var4 - this.field1647), this.field1655, (int) (var4 - this.field1670), var6);
            }
            this.field1661 = 0;
            this.field1647 = -1L;
        }
        field1666++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[BI)V", line = 541)
    public final void method586(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1669++;
        try {
            if (this.field1674 < this.field1659 + (long) arg1) {
                this.field1674 = (long) arg1 + this.field1659;
            }
            if (this.field1647 != -1L && (this.field1647 > this.field1659 || this.field1659 > this.field1647 + (long) this.field1661)) {
                this.method585((byte) -84);
            }
            if (this.field1647 != -1L && (long) arg1 + this.field1659 > this.field1647 - -((long) this.field1654.length)) {
                int var5 = (int) ((long) this.field1654.length + this.field1647 - this.field1659);
                class115.method872(arg2, arg0, this.field1654, (int) (this.field1659 - this.field1647), var5);
                this.field1659 += var5;
                arg0 += var5;
                arg1 -= var5;
                this.field1661 = this.field1654.length;
                this.method585((byte) -38);
            }
            if (arg3 != -1) {
                this.method584(3);
            }
            if (arg1 > this.field1654.length) {
                if (this.field1660 != this.field1659) {
                    this.field1665.method866(this.field1659, (byte) -38);
                    this.field1660 = this.field1659;
                }
                this.field1665.method869(arg0, arg2, (byte) -90, arg1);
                this.field1660 += arg1;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1670 <= this.field1659 && this.field1670 + (long) this.field1673 > this.field1659) {
                    var8 = this.field1659;
                } else if (this.field1659 <= this.field1670 && this.field1670 < (long) arg1 + this.field1659) {
                    var8 = this.field1670;
                }
                if (this.field1660 > this.field1662) {
                    this.field1662 = this.field1660;
                }
                if ((long) arg1 + this.field1659 > this.field1670 && (long) this.field1673 + this.field1670 >= (long) arg1 + this.field1659) {
                    var6 = (long) arg1 + this.field1659;
                } else if (this.field1659 < this.field1670 + (long) this.field1673 && (long) arg1 + this.field1659 >= (long) this.field1673 + this.field1670) {
                    var6 = (long) this.field1673 + this.field1670;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class115.method872(arg2, (int) ((long) arg0 + var8 - this.field1659), this.field1655, (int) (var8 - this.field1670), var10);
                }
                this.field1659 += arg1;
            } else if (arg1 > 0) {
                if (this.field1647 == -1L) {
                    this.field1647 = this.field1659;
                }
                class115.method872(arg2, arg0, this.field1654, (int) (this.field1659 - this.field1647), arg1);
                this.field1659 += arg1;
                if (this.field1659 - this.field1647 > (long) this.field1661) {
                    this.field1661 = (int) (this.field1659 - this.field1647);
                }
            }
        } catch (IOException var12) {
            this.field1660 = -1L;
            throw var12;
        }
    }
}
