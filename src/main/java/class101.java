import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class101 {

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "J")
    private long field1669 = -1L;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    private int field1672 = 0;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "J")
    private long field1671 = -1L;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "Lve;")
    private class346 field1678;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "J")
    private long field1663;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "J")
    private long field1658;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "[B")
    private byte[] field1670;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "[B")
    private byte[] field1673;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "J")
    private long field1677;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Lcq;")
    public static class324 field1660 = null;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "J")
    private long field1667;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBII)I", line = 9)
    public static final int method746(int arg0, byte arg1, int arg2, int arg3) {
        field1665++;
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 != 45) {
            method749(56);
        }
        return (arg3 >> 1) + (((arg2 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Ljava/io/File;", line = 40)
    private final File method747(byte arg0) {
        field1675++;
        if (arg0 < 110) {
            this.field1671 = 84L;
        }
        return this.field1678.method2201(-21141);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B[B)V", line = 56)
    public final void method748(byte arg0, byte[] arg1) throws IOException {
        field1664++;
        int var3 = -95 / ((arg0 - 57) / 32);
        this.method755(arg1.length, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 69)
    public static void method749(int arg0) {
        if (arg0 >= 80) {
            field1660 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Ljq;", line = 80)
    public static final class353 method750(int arg0) {
        field1661++;
        if (arg0 != -21654) {
            field1660 = null;
        }
        if (class509.field7494 == null || class355.field5421 == null) {
            return null;
        }
        for (class353 var1 = (class353) class355.field5421.method3055(-71); var1 != null; var1 = (class353) class355.field5421.method3055(-120)) {
            class447 var2 = class509.field7486.method1812((byte) 28, var1.field5397);
            if (var2 != null && var2.field6667 && var2.method2668(arg0 ^ 0xFFFFAB07, class509.field7487)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V", line = 109)
    private final void method751(byte arg0) throws IOException {
        field1662++;
        if (arg0 > -57 || this.field1669 == -1L) {
            return;
        }
        if (this.field1669 != this.field1667) {
            this.field1678.method2197(false, this.field1669);
            this.field1667 = this.field1669;
        }
        this.field1678.method2202(this.field1670, 125, 0, this.field1672);
        this.field1667 += this.field1672;
        if (this.field1663 < this.field1667) {
            this.field1663 = this.field1667;
        }
        long var2 = -1L;
        if (this.field1671 <= this.field1669 && (long) this.field1676 + this.field1671 > this.field1669) {
            var2 = this.field1669;
        } else if (this.field1671 >= this.field1669 && this.field1669 + ((long) this.field1672) > this.field1671) {
            var2 = this.field1671;
        }
        long var4 = -1L;
        if (((long) this.field1672 + this.field1669) > this.field1671 && ((long) this.field1676 + this.field1671) >= ((long) this.field1672 + this.field1669)) {
            var4 = (long) this.field1672 + this.field1669;
        } else if (((long) this.field1676 + this.field1671) > this.field1669 && ((long) this.field1672 + this.field1669) >= ((long) this.field1676 + this.field1671)) {
            var4 = this.field1671 + ((long) this.field1676);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class73.method589(this.field1670, (int) (var2 - this.field1669), this.field1673, (int) (var2 - this.field1671), var6);
        }
        this.field1672 = 0;
        this.field1669 = -1L;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([BZII)V", line = 183)
    public final void method752(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field1659++;
        try {
            if (this.field1658 < (long) arg2 + this.field1677) {
                this.field1658 = (long) arg2 + this.field1677;
            }
            if (this.field1669 != -1L && (this.field1669 > this.field1677 || ((long) this.field1672 + this.field1669) < this.field1677)) {
                this.method751((byte) -72);
            }
            if (this.field1669 != -1L && (this.field1669 + ((long) this.field1670.length)) < ((long) arg2 + this.field1677)) {
                int var5 = (int) ((long) this.field1670.length - (this.field1677 - this.field1669));
                class73.method589(arg0, arg3, this.field1670, (int) (this.field1677 - this.field1669), var5);
                arg2 -= var5;
                this.field1677 += var5;
                arg3 += var5;
                this.field1672 = this.field1670.length;
                this.method751((byte) -118);
            }
            if (this.field1670.length < arg2) {
                if (this.field1677 != this.field1667) {
                    this.field1678.method2197(false, this.field1677);
                    this.field1667 = this.field1677;
                }
                this.field1678.method2202(arg0, 127, arg3, arg2);
                this.field1667 += arg2;
                if (this.field1667 > this.field1663) {
                    this.field1663 = this.field1667;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1671 <= this.field1677 && this.field1677 < this.field1671 + ((long) this.field1676)) {
                    var6 = this.field1677;
                } else if (this.field1677 <= this.field1671 && (long) arg2 + this.field1677 > this.field1671) {
                    var6 = this.field1671;
                }
                if (((long) arg2 + this.field1677) > this.field1671 && this.field1671 + ((long) this.field1676) >= this.field1677 - -((long) arg2)) {
                    var8 = (long) arg2 + this.field1677;
                } else if (((long) this.field1676 + this.field1671) > this.field1677 && ((long) this.field1676 + this.field1671) <= ((long) arg2 + this.field1677)) {
                    var8 = (long) this.field1676 + this.field1671;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class73.method589(arg0, (int) ((long) arg3 + var6 - this.field1677), this.field1673, (int) (var6 - this.field1671), var10);
                }
                this.field1677 += arg2;
            } else if (arg2 > 0) {
                if (this.field1669 == -1L) {
                    this.field1669 = this.field1677;
                }
                class73.method589(arg0, arg3, this.field1670, (int) (this.field1677 - this.field1669), arg2);
                this.field1677 += arg2;
                if (this.field1677 - this.field1669 > (long) this.field1672) {
                    this.field1672 = (int) (this.field1677 - this.field1669);
                }
            } else if (arg1) {
                this.field1673 = null;
            }
        } catch (IOException var12) {
            this.field1667 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IJ)V", line = 305)
    public final void method753(int arg0, long arg1) throws IOException {
        field1657++;
        if (arg0 != 0) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method747((byte) 113));
        }
        this.field1677 = arg1;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 323)
    public static final void method754(String arg0, int arg1) {
        field1674++;
        class431.method2581(0, arg1, arg0, "", "", (byte) 123);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lve;II)V", line = 600)
    public class101(class346 arg0, int arg1, int arg2) throws IOException {
        this.field1678 = arg0;
        this.field1658 = this.field1663 = arg0.method2200(false);
        this.field1670 = new byte[arg2];
        this.field1673 = new byte[arg1];
        this.field1677 = 0L;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[B)V", line = 345)
    public final void method755(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1666++;
        try {
            if (arg3.length < (arg0 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field1669 != -1L && this.field1669 <= this.field1677 && ((long) arg0 + this.field1677) <= (this.field1669 + ((long) this.field1672))) {
                class73.method589(this.field1670, (int) (this.field1677 - this.field1669), arg3, arg2, arg0);
                this.field1677 += arg0;
                return;
            }
            long var5 = this.field1677;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field1677 >= this.field1671 && this.field1677 < (long) this.field1676 + this.field1671) {
                int var9 = (int) ((long) this.field1676 + this.field1671 - this.field1677);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class73.method589(this.field1673, (int) (this.field1677 - this.field1671), arg3, arg2, var9);
                arg2 += var9;
                this.field1677 += var9;
                arg0 -= var9;
            }
            if (arg1 != 0) {
                this.field1672 = 21;
            }
            if (arg0 > this.field1673.length) {
                this.field1678.method2197(false, this.field1677);
                this.field1667 = this.field1677;
                while (arg0 > 0) {
                    int var10 = this.field1678.method2198(arg2, arg0, arg3, false);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    arg2 += var10;
                    this.field1667 += var10;
                    this.field1677 += var10;
                }
            } else if (arg0 > 0) {
                this.method757(-1);
                int var11 = arg0;
                if (arg0 > this.field1676) {
                    var11 = this.field1676;
                }
                class73.method589(this.field1673, 0, arg3, arg2, var11);
                arg0 -= var11;
                this.field1677 += var11;
                arg2 += var11;
            }
            if (this.field1669 != -1L) {
                if (this.field1669 > this.field1677 && arg0 > 0) {
                    int var12 = (int) (this.field1669 - this.field1677) + arg2;
                    if (var12 > (arg0 + arg2)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg3[arg2++] = 0;
                        arg0--;
                        this.field1677++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field1669 && this.field1669 < (var5 + ((long) var8))) {
                    var13 = this.field1669;
                } else if (this.field1669 <= var5 && var5 < (long) this.field1672 + this.field1669) {
                    var13 = var5;
                }
                if (var5 < (long) this.field1672 + this.field1669 && (long) this.field1672 + this.field1669 <= (long) var8 + var5) {
                    var15 = this.field1669 + ((long) this.field1672);
                } else if (this.field1669 < var5 + ((long) var8) && this.field1669 + ((long) this.field1672) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class73.method589(this.field1670, (int) (var13 - this.field1669), arg3, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field1677) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field1677));
                        this.field1677 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1667 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)J", line = 532)
    public final long method756(int arg0) {
        field1668++;
        if (arg0 <= 103) {
            this.field1669 = 89L;
        }
        return this.field1658;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 558)
    private final void method757(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field1667 = 109L;
        }
        this.field1676 = 0;
        field1656++;
        if (this.field1677 != this.field1667) {
            this.field1678.method2197(false, this.field1677);
            this.field1667 = this.field1677;
        }
        this.field1671 = this.field1677;
        while (this.field1676 < this.field1673.length) {
            int var2 = this.field1673.length - this.field1676;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1678.method2198(this.field1676, var2, this.field1673, false);
            if (var3 == -1) {
                break;
            }
            this.field1676 += var3;
            this.field1667 += var3;
        }
    }
}
