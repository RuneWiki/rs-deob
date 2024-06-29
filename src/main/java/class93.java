import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class93 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "J")
    private long field1564 = -1L;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "J")
    private long field1566 = -1L;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lti;")
    private class5 field1573;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "J")
    private long field1561;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "J")
    private long field1579;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[B")
    private byte[] field1571;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[B")
    private byte[] field1563;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "J")
    private long field1570;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Loa;")
    public static class99 field1562 = null;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lng;")
    public static class76 field1568 = new class76();

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "J")
    private long field1574;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lde;")
    public static class109[] field1560;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method621(byte arg0) {
        field1581++;
        if (arg0 > -54) {
            field1560 = null;
        }
        return this.field1573.method48(true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[BIB)V")
    public final void method622(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field1582++;
        try {
            if (arg3 > -8) {
                this.method630((byte) 118);
            }
            if (this.field1579 < (long) arg0 + this.field1570) {
                this.field1579 = this.field1570 + ((long) arg0);
            }
            if (this.field1564 != -1L && (this.field1564 > this.field1570 || this.field1570 > this.field1564 + ((long) this.field1575))) {
                this.method628((byte) -34);
            }
            if (this.field1564 != -1L && (long) this.field1563.length + this.field1564 < (long) arg0 + this.field1570) {
                int var5 = (int) (this.field1564 + (long) this.field1563.length - this.field1570);
                class241.method1568(arg1, arg2, this.field1563, (int) (this.field1570 - this.field1564), var5);
                arg2 += var5;
                this.field1570 += (long) var5;
                arg0 -= var5;
                this.field1575 = this.field1563.length;
                this.method628((byte) -34);
            }
            if (this.field1563.length < arg0) {
                long var6 = -1L;
                if (this.field1574 != this.field1570) {
                    this.field1573.method50(this.field1570, 111);
                    this.field1574 = this.field1570;
                }
                long var8 = -1L;
                this.field1573.method51(arg1, 1, arg0, arg2);
                if (this.field1570 >= this.field1566 && this.field1570 < this.field1566 + ((long) this.field1569)) {
                    var6 = this.field1570;
                } else if (this.field1566 >= this.field1570 && this.field1566 < (long) arg0 + this.field1570) {
                    var6 = this.field1566;
                }
                this.field1574 += (long) arg0;
                if (((long) arg0 + this.field1570) > this.field1566 && ((long) arg0 + this.field1570) <= ((long) this.field1569 + this.field1566)) {
                    var8 = (long) arg0 + this.field1570;
                } else if (this.field1570 < ((long) this.field1569 + this.field1566) && (this.field1570 + ((long) arg0)) >= (this.field1566 + ((long) this.field1569))) {
                    var8 = (long) this.field1569 + this.field1566;
                }
                if (this.field1574 > this.field1561) {
                    this.field1561 = this.field1574;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class241.method1568(arg1, (int) ((long) arg2 + var6 - this.field1570), this.field1571, (int) (var6 - this.field1566), var10);
                }
                this.field1570 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field1564 == -1L) {
                    this.field1564 = this.field1570;
                }
                class241.method1568(arg1, arg2, this.field1563, (int) (this.field1570 - this.field1564), arg0);
                this.field1570 += (long) arg0;
                if ((this.field1570 - this.field1564) > ((long) this.field1575)) {
                    this.field1575 = (int) (this.field1570 - this.field1564);
                }
            }
        } catch (IOException var12) {
            this.field1574 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBIII)V")
    public static final void method623(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1583++;
        int var5 = 66 % ((arg1 + 7) / 47);
        if (arg2 > arg3) {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class124.field2177[var6][arg0] = arg4;
            }
        } else {
            for (int var7 = arg2; var7 < arg3; var7++) {
                class124.field2177[var7][arg0] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method624(int arg0) {
        field1568 = null;
        if (arg0 != -1627456160) {
            method625(-111, (class261) null);
        }
        field1562 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILik;)V")
    public static final void method625(int arg0, class261 arg1) {
        field1578++;
        if (arg0 != 4096) {
            return;
        }
        while (true) {
            while (arg1.field4587 < arg1.field4619.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1693((byte) -128) == 1) {
                    var2 = true;
                    var3 = arg1.method1693((byte) 52);
                    var4 = arg1.method1693((byte) -103);
                }
                int var5 = arg1.method1693((byte) -84);
                int var6 = arg1.method1693((byte) -90);
                int var7 = class112.field2026 + class230.field3983 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class48.field802;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class218.field3794 && class230.field3983 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                int var13 = arg1.method1693((byte) 72);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1693((byte) -120);
                                        if (class182.field3204[var9][var10] == null) {
                                            class182.field3204[var9][var10] = new byte[4096];
                                        }
                                        class182.field3204[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1740((byte) 51);
                                        if (class22.field256[var9][var10] == null) {
                                            class22.field256[var9][var10] = new short[4096];
                                        }
                                        class22.field256[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method1693((byte) -96) & 0xFF) << 16) + (((arg1.method1693((byte) 37) & 0xFF) << 8) + (arg1.method1693((byte) -100) & 0xFF));
                                        if (class129.field2261[var9][var10] == null) {
                                            class129.field2261[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class153 var17 = class247.method1601(26012, var16);
                                        if (var17.field2696 != null) {
                                            var17 = var17.method1023(-127);
                                            if (var17 == null || var17.field2689 == -1) {
                                                continue;
                                            }
                                        }
                                        class129.field2261[var9][var10][(63 - var12 << 6) + var11] = var17.field2709 + 1;
                                        class214 var18 = new class214();
                                        var18.field3714 = var17.field2689;
                                        var18.field3713 = var8;
                                        var18.field3719 = var7;
                                        class144.field2537.method536(var18, (byte) 118);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1693((byte) -112);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field4587++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field4587 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field4587 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    private final void method626(boolean arg0) throws IOException {
        if (!arg0) {
            return;
        }
        this.field1569 = 0;
        if (this.field1574 != this.field1570) {
            this.field1573.method50(this.field1570, 108);
            this.field1574 = this.field1570;
        }
        this.field1566 = this.field1570;
        while (this.field1571.length > this.field1569) {
            int var2 = this.field1571.length - this.field1569;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1573.method49(this.field1571, 0, var2, this.field1569);
            if (var3 == -1) {
                break;
            }
            this.field1569 += var3;
            this.field1574 += (long) var3;
        }
        field1576++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[BI)V")
    public final void method627(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1559++;
        try {
            if ((arg3 + arg0) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field1564 != -1L && this.field1570 >= this.field1564 && ((long) arg0 + this.field1570) <= (this.field1564 + ((long) this.field1575))) {
                class241.method1568(this.field1563, (int) (this.field1570 - this.field1564), arg2, arg3, arg0);
                this.field1570 += (long) arg0;
                return;
            }
            long var5 = this.field1570;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field1570 >= this.field1566 && ((long) this.field1569 + this.field1566) > this.field1570) {
                int var9 = (int) ((long) this.field1569 - (this.field1570 - this.field1566));
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class241.method1568(this.field1571, (int) (this.field1570 - this.field1566), arg2, arg3, var9);
                arg0 -= var9;
                this.field1570 += (long) var9;
                arg3 += var9;
            }
            if (this.field1571.length < arg0) {
                this.field1573.method50(this.field1570, -23);
                this.field1574 = this.field1570;
                while (arg0 > 0) {
                    int var10 = this.field1573.method49(arg2, arg1 ^ 0xFFFFF1B3, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    this.field1570 += (long) var10;
                    this.field1574 += (long) var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                int var11 = arg0;
                this.method626(true);
                if (arg0 > this.field1569) {
                    var11 = this.field1569;
                }
                arg0 -= var11;
                class241.method1568(this.field1571, 0, arg2, arg3, var11);
                this.field1570 += (long) var11;
                arg3 += var11;
            }
            if (this.field1564 != -1L) {
                if (this.field1570 < this.field1564 && arg0 > 0) {
                    int var12 = (int) (this.field1564 - this.field1570) + arg3;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        arg0--;
                        this.field1570++;
                    }
                }
                long var13 = -1L;
                if (this.field1564 >= var5 && ((long) var7 + var5) > this.field1564) {
                    var13 = this.field1564;
                } else if (var5 >= this.field1564 && var5 < (long) this.field1575 + this.field1564) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field1575 + this.field1564 && (long) var7 + var5 >= this.field1564 - -((long) this.field1575)) {
                    var15 = (long) this.field1575 + this.field1564;
                } else if (this.field1564 < var5 + ((long) var7) && ((long) var7 + var5) <= ((long) this.field1575 + this.field1564)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class241.method1568(this.field1563, (int) (var13 - this.field1564), arg2, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field1570) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field1570));
                        this.field1570 = var15;
                    }
                }
            }
            if (arg1 != -3661) {
                this.field1563 = null;
            }
        } catch (IOException var19) {
            this.field1574 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    private final void method628(byte arg0) throws IOException {
        field1572++;
        if (this.field1564 != -1L) {
            if (this.field1574 != this.field1564) {
                this.field1573.method50(this.field1564, arg0 - 34);
                this.field1574 = this.field1564;
            }
            long var2 = -1L;
            this.field1573.method51(this.field1563, 1, this.field1575, 0);
            if (this.field1564 >= this.field1566 && (long) this.field1569 + this.field1566 > this.field1564) {
                var2 = this.field1564;
            } else if (this.field1564 <= this.field1566 && this.field1566 < (long) this.field1575 + this.field1564) {
                var2 = this.field1566;
            }
            this.field1574 += (long) this.field1575;
            if (this.field1561 < this.field1574) {
                this.field1561 = this.field1574;
            }
            long var4 = -1L;
            if ((this.field1564 + ((long) this.field1575)) > this.field1566 && ((long) this.field1575 + this.field1564) <= ((long) this.field1569 + this.field1566)) {
                var4 = (long) this.field1575 + this.field1564;
            } else if (this.field1564 < (this.field1566 + ((long) this.field1569)) && (long) this.field1575 + this.field1564 >= (long) this.field1569 + this.field1566) {
                var4 = (long) this.field1569 + this.field1566;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class241.method1568(this.field1563, (int) (var2 - this.field1564), this.field1571, (int) (var2 - this.field1566), var6);
            }
            this.field1564 = -1L;
            this.field1575 = 0;
        }
        if (arg0 != -34) {
            this.field1575 = 33;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[B)V")
    public final void method629(int arg0, byte[] arg1) throws IOException {
        if (arg0 <= -106) {
            this.method627(arg1.length, -3661, arg1, 0);
            field1577++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)J")
    public final long method630(byte arg0) {
        field1565++;
        if (arg0 >= -45) {
            this.method630((byte) -28);
        }
        return this.field1579;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V")
    public final void method631(byte arg0) throws IOException {
        this.method628((byte) -34);
        this.field1573.method47(false);
        int var2 = 127 % ((arg0 + 62) / 60);
        field1580++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IJ)V")
    public final void method632(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            method625(50, (class261) null);
        }
        field1567++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method621((byte) -81));
        }
        this.field1570 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lti;II)V")
    public class93(class5 arg0, int arg1, int arg2) throws IOException {
        this.field1573 = arg0;
        this.field1579 = this.field1561 = arg0.method46(1);
        this.field1571 = new byte[arg1];
        this.field1563 = new byte[arg2];
        this.field1570 = 0L;
    }
}
