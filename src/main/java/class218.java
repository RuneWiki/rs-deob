import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class218 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    private int field3738 = 0;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "J")
    private long field3762 = -1L;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "J")
    private long field3741 = -1L;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lfi;")
    private class6 field3753;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "J")
    private long field3745;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "J")
    private long field3752;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[B")
    private byte[] field3747;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "J")
    private long field3768;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[B")
    private byte[] field3751;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[Lsc;")
    public static class181[] field3755 = new class181[100];

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lsc;")
    public static class181 field3758 = class149.method967(255, "<col=ffb000>");

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lsc;")
    private static class181 field3767 = class149.method967(255, "Please remove ");

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
    public static int[] field3750 = new int[2048];

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lsc;")
    public static class181 field3742 = field3767;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lsc;")
    public static class181 field3740 = field3767;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "B")
    public static byte field3739;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "J")
    private long field3744;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Ljb;")
    public static class11 field3765;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
    public static int[] field3749;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method1445(int arg0) {
        field3767 = null;
        field3740 = null;
        field3742 = null;
        if (arg0 != 2) {
            method1453((byte) -34, (class175) null);
        }
        field3765 = null;
        field3749 = null;
        field3755 = null;
        field3758 = null;
        field3750 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)J")
    public final long method1446(int arg0) {
        if (arg0 == -1095) {
            field3759++;
            return this.field3752;
        } else {
            return -126L;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method1447(int arg0) {
        field3743++;
        return arg0 == 27109 ? this.field3753.method50(arg0 ^ 0x69B7) : null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BBI)V")
    public final void method1448(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 <= 105) {
            field3767 = null;
        }
        field3754++;
        try {
            if (this.field3752 < (long) arg0 + this.field3768) {
                this.field3752 = (long) arg0 + this.field3768;
            }
            if (this.field3741 != -1L && (this.field3768 < this.field3741 || this.field3768 > ((long) this.field3738 + this.field3741))) {
                this.method1449(0);
            }
            if (this.field3741 != -1L && (this.field3768 + ((long) arg0)) > ((long) this.field3751.length + this.field3741)) {
                int var5 = (int) ((long) this.field3751.length + this.field3741 - this.field3768);
                arg0 -= var5;
                class252.method1718(arg1, arg3, this.field3751, (int) (this.field3768 - this.field3741), var5);
                arg3 += var5;
                this.field3768 += (long) var5;
                this.field3738 = this.field3751.length;
                this.method1449(0);
            }
            if (this.field3751.length < arg0) {
                if (this.field3768 != this.field3744) {
                    this.field3753.method48(53, this.field3768);
                    this.field3744 = this.field3768;
                }
                this.field3753.method52(arg3, arg1, arg0, 67);
                long var6 = -1L;
                long var8 = -1L;
                if (((long) arg0 + this.field3768) > this.field3762 && (this.field3762 + ((long) this.field3760)) >= ((long) arg0 + this.field3768)) {
                    var6 = (long) arg0 + this.field3768;
                } else if ((long) this.field3760 + this.field3762 > this.field3768 && (long) arg0 + this.field3768 >= (long) this.field3760 + this.field3762) {
                    var6 = (long) this.field3760 + this.field3762;
                }
                this.field3744 += (long) arg0;
                if (this.field3768 >= this.field3762 && this.field3768 < (long) this.field3760 + this.field3762) {
                    var8 = this.field3768;
                } else if (this.field3762 >= this.field3768 && (long) arg0 + this.field3768 > this.field3762) {
                    var8 = this.field3762;
                }
                if (this.field3745 < this.field3744) {
                    this.field3745 = this.field3744;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class252.method1718(arg1, (int) ((long) arg3 + var8 - this.field3768), this.field3747, (int) (var8 - this.field3762), var10);
                }
                this.field3768 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field3741 == -1L) {
                    this.field3741 = this.field3768;
                }
                class252.method1718(arg1, arg3, this.field3751, (int) (this.field3768 - this.field3741), arg0);
                this.field3768 += (long) arg0;
                if ((long) this.field3738 < this.field3768 - this.field3741) {
                    this.field3738 = (int) (this.field3768 - this.field3741);
                }
            }
        } catch (IOException var12) {
            this.field3744 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    private final void method1449(int arg0) throws IOException {
        if (arg0 != 0) {
            method1453((byte) 72, (class175) null);
        }
        field3756++;
        if (this.field3741 == -1L) {
            return;
        }
        if (this.field3744 != this.field3741) {
            this.field3753.method48(31, this.field3741);
            this.field3744 = this.field3741;
        }
        this.field3753.method52(0, this.field3751, this.field3738, arg0 ^ 0x34);
        this.field3744 += (long) this.field3738;
        if (this.field3745 < this.field3744) {
            this.field3745 = this.field3744;
        }
        long var2 = -1L;
        if (this.field3741 >= this.field3762 && this.field3741 < ((long) this.field3760 + this.field3762)) {
            var2 = this.field3741;
        } else if (this.field3762 >= this.field3741 && this.field3741 + ((long) this.field3738) > this.field3762) {
            var2 = this.field3762;
        }
        long var4 = -1L;
        if (this.field3741 + ((long) this.field3738) > this.field3762 && ((long) this.field3738 + this.field3741) <= (this.field3762 + ((long) this.field3760))) {
            var4 = (long) this.field3738 + this.field3741;
        } else if (this.field3741 < (long) this.field3760 + this.field3762 && ((long) this.field3738 + this.field3741) >= (this.field3762 + ((long) this.field3760))) {
            var4 = (long) this.field3760 + this.field3762;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class252.method1718(this.field3751, (int) (var2 - this.field3741), this.field3747, (int) (var2 - this.field3762), var6);
        }
        this.field3738 = 0;
        this.field3741 = -1L;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    private final void method1450(byte arg0) throws IOException {
        field3764++;
        this.field3760 = 0;
        int var2 = 72 % ((arg0 - 18) / 38);
        if (this.field3768 != this.field3744) {
            this.field3753.method48(112, this.field3768);
            this.field3744 = this.field3768;
        }
        this.field3762 = this.field3768;
        while (this.field3760 < this.field3747.length) {
            int var3 = this.field3747.length - this.field3760;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field3753.method47(var3, true, this.field3747, this.field3760);
            if (var4 == -1) {
                break;
            }
            this.field3760 += var4;
            this.field3744 += (long) var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public final void method1451(int arg0) throws IOException {
        field3757++;
        if (arg0 != 11020) {
            field3749 = null;
        }
        this.method1449(0);
        this.field3753.method49(false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BB)V")
    public final void method1452(byte[] arg0, byte arg1) throws IOException {
        if (arg1 >= -32) {
            field3749 = null;
        }
        this.method1454((byte) 77, arg0.length, arg0, 0);
        field3761++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLo;)V")
    public static final void method1453(byte arg0, class175 arg1) {
        if (arg0 > -67) {
            field3755 = null;
        }
        if (class100.field1669 == arg1.field3010) {
            class61.field943[arg1.field2979] = true;
        }
        field3763++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI[BI)V")
    public final void method1454(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3748++;
        try {
            if (arg1 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if (this.field3741 != -1L && this.field3768 >= this.field3741 && ((long) this.field3738 + this.field3741) >= ((long) arg1 + this.field3768)) {
                class252.method1718(this.field3751, (int) (this.field3768 - this.field3741), arg2, arg3, arg1);
                this.field3768 += (long) arg1;
                return;
            }
            long var5 = this.field3768;
            int var7 = arg3;
            int var8 = arg1;
            if (arg0 <= 64) {
                return;
            }
            if (this.field3768 >= this.field3762 && this.field3768 < ((long) this.field3760 + this.field3762)) {
                int var9 = (int) (this.field3762 + (long) this.field3760 - this.field3768);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class252.method1718(this.field3747, (int) (this.field3768 - this.field3762), arg2, arg3, var9);
                this.field3768 += (long) var9;
                arg3 += var9;
            }
            if (arg1 > this.field3747.length) {
                this.field3753.method48(71, this.field3768);
                this.field3744 = this.field3768;
                while (arg1 > 0) {
                    int var11 = this.field3753.method47(arg1, true, arg2, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    this.field3768 += (long) var11;
                    this.field3744 += (long) var11;
                    arg3 += var11;
                }
            } else if (arg1 > 0) {
                this.method1450((byte) -87);
                int var10 = arg1;
                if (this.field3760 < arg1) {
                    var10 = this.field3760;
                }
                arg1 -= var10;
                class252.method1718(this.field3747, 0, arg2, arg3, var10);
                arg3 += var10;
                this.field3768 += (long) var10;
            }
            if (this.field3741 != -1L) {
                if (this.field3768 < this.field3741 && arg1 > 0) {
                    int var12 = (int) (this.field3741 - this.field3768) + arg3;
                    if (var12 > (arg1 + arg3)) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field3768++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (((long) this.field3738 + this.field3741) > var5 && (long) var8 + var5 >= (long) this.field3738 + this.field3741) {
                    var15 = (long) this.field3738 + this.field3741;
                } else if (((long) var8 + var5) > this.field3741 && ((long) this.field3738 + this.field3741) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var5 <= this.field3741 && this.field3741 < (long) var8 + var5) {
                    var13 = this.field3741;
                } else if (var5 >= this.field3741 && var5 < (long) this.field3738 + this.field3741) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class252.method1718(this.field3751, (int) (var13 - this.field3741), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field3768 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3768));
                        this.field3768 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3744 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z[B)V")
    public static final void method1455(boolean arg0, byte[] arg1) {
        field3746++;
        class230 var2 = new class230(arg1);
        var2.field3933 = arg1.length - 2;
        class33.field535 = var2.method1535(2);
        class238.field4138 = new byte[class33.field535][];
        class196.field3425 = new int[class33.field535];
        class220.field3782 = new int[class33.field535];
        if (!arg0) {
            return;
        }
        class23.field410 = new int[class33.field535];
        class254.field4448 = new boolean[class33.field535];
        class143.field2319 = new byte[class33.field535][];
        class121.field1978 = new int[class33.field535];
        var2.field3933 = arg1.length - (class33.field535 * 8) - 7;
        class219.field3777 = var2.method1535(2);
        class78.field1273 = var2.method1535(2);
        int var3 = (var2.method1516((byte) 82) & 0xFF) + 1;
        for (int var4 = 0; var4 < class33.field535; var4++) {
            class220.field3782[var4] = var2.method1535(2);
        }
        for (int var5 = 0; var5 < class33.field535; var5++) {
            class23.field410[var5] = var2.method1535(2);
        }
        for (int var6 = 0; var6 < class33.field535; var6++) {
            class196.field3425[var6] = var2.method1535(2);
        }
        for (int var7 = 0; var7 < class33.field535; var7++) {
            class121.field1978[var7] = var2.method1535(2);
        }
        var2.field3933 = arg1.length + 3 - (class33.field535 * 8 + (var3 * 3)) - 7;
        class254.field4443 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class254.field4443[var8] = var2.method1508(true);
            if (class254.field4443[var8] == 0) {
                class254.field4443[var8] = 1;
            }
        }
        var2.field3933 = 0;
        for (int var9 = 0; var9 < class33.field535; var9++) {
            int var10 = class196.field3425[var9];
            int var11 = class121.field1978[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class143.field2319[var9] = var13;
            byte[] var14 = new byte[var12];
            class238.field4138[var9] = var14;
            int var15 = var2.method1516((byte) 82);
            boolean var16 = false;
            if ((var15 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1563(-255688184);
                }
                if ((var15 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1563(-255688184);
                        var16 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var15 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var21 + (var10 * var22)] = var2.method1563(-255688184);
                                var16 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method1563(-255688184);
                    }
                    var20++;
                }
            }
            class254.field4448[var9] = var16;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZJ)V")
    public final void method1456(boolean arg0, long arg1) throws IOException {
        field3766++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1447(27109));
        }
        if (arg0) {
            method1453((byte) -98, (class175) null);
        }
        this.field3768 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lfi;II)V")
    public class218(class6 arg0, int arg1, int arg2) throws IOException {
        this.field3753 = arg0;
        this.field3752 = this.field3745 = arg0.method51(0);
        this.field3747 = new byte[arg1];
        this.field3768 = 0L;
        this.field3751 = new byte[arg2];
    }
}
