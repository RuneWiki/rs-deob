import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class294 {

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "J")
    private long field5011 = -1L;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    private int field5007 = 0;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "J")
    private long field5008 = -1L;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lrd;")
    private class202 field5002;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "J")
    private long field5003;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "J")
    private long field5015;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "J")
    private long field5020;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[B")
    private byte[] field4996;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[B")
    private byte[] field5016;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lsk;")
    public static class199 field5004 = new class199(100);

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field5010 = 0;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "Z")
    public static boolean field5021 = false;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lmh;")
    private static class62 field5009 = class201.method1405(true, "Allocated memory");

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Lmh;")
    public static class62 field5018 = field5009;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "[Lmh;")
    public static class62[] field5022 = new class62[200];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    private int field5014;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "J")
    private long field4994;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 7)
    public final void method1989(boolean arg0) throws IOException {
        this.method1997(89);
        this.field5002.method1414(0);
        field5013++;
        if (!arg0) {
            method2002(true, -57, -19, 104, -91, 91, -95);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[BII)V", line = 24)
    public final void method1990(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4997++;
        try {
            if ((arg2 + arg3) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            int var5 = -44 / ((arg0 + 74) / 45);
            if (this.field5008 != -1L && this.field5020 >= this.field5008 && this.field5008 + ((long) this.field5007) >= (long) arg3 + this.field5020) {
                class231.method1635(this.field5016, (int) (this.field5020 - this.field5008), arg1, arg2, arg3);
                this.field5020 += (long) arg3;
                return;
            }
            int var6 = arg2;
            long var7 = this.field5020;
            int var9 = arg3;
            if (this.field5011 <= this.field5020 && this.field5020 < (long) this.field5014 + this.field5011) {
                int var10 = (int) (this.field5011 + (long) this.field5014 - this.field5020);
                if (var10 > arg3) {
                    var10 = arg3;
                }
                arg3 -= var10;
                class231.method1635(this.field4996, (int) (this.field5020 - this.field5011), arg1, arg2, var10);
                this.field5020 += (long) var10;
                arg2 += var10;
            }
            if (arg3 > this.field4996.length) {
                this.field5002.method1413(this.field5020, (byte) -118);
                this.field4994 = this.field5020;
                while (arg3 > 0) {
                    int var12 = this.field5002.method1418(arg2, arg3, (byte) -48, arg1);
                    if (var12 == -1) {
                        break;
                    }
                    arg3 -= var12;
                    this.field5020 += (long) var12;
                    arg2 += var12;
                    this.field4994 += (long) var12;
                }
            } else if (arg3 > 0) {
                this.method2000(11349);
                int var11 = arg3;
                if (this.field5014 < arg3) {
                    var11 = this.field5014;
                }
                arg3 -= var11;
                class231.method1635(this.field4996, 0, arg1, arg2, var11);
                this.field5020 += (long) var11;
                arg2 += var11;
            }
            if (this.field5008 != -1L) {
                if (this.field5008 > this.field5020 && arg3 > 0) {
                    int var13 = (int) (this.field5008 - this.field5020) + arg2;
                    if (var13 > (arg2 + arg3)) {
                        var13 = arg2 + arg3;
                    }
                    while (arg2 < var13) {
                        arg3--;
                        arg1[arg2++] = 0;
                        this.field5020++;
                    }
                }
                long var14 = -1L;
                if (var7 < ((long) this.field5007 + this.field5008) && ((long) this.field5007 + this.field5008) <= (var7 + ((long) var9))) {
                    var14 = (long) this.field5007 + this.field5008;
                } else if (((long) var9 + var7) > this.field5008 && (long) var9 + var7 <= (long) this.field5007 + this.field5008) {
                    var14 = (long) var9 + var7;
                }
                long var16 = -1L;
                if (this.field5008 >= var7 && this.field5008 < (long) var9 + var7) {
                    var16 = this.field5008;
                } else if (var7 >= this.field5008 && var7 < (this.field5008 + ((long) this.field5007))) {
                    var16 = var7;
                }
                if (var16 > -1L && var14 > var16) {
                    int var18 = (int) (var14 - var16);
                    class231.method1635(this.field5016, (int) (var16 - this.field5008), arg1, (int) (var16 - var7) + var6, var18);
                    if (var14 > this.field5020) {
                        arg3 = (int) ((long) arg3 - (var14 - this.field5020));
                        this.field5020 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field4994 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Ljava/io/File;", line = 210)
    private final File method1991(int arg0) {
        if (arg0 < 111) {
            this.field5016 = (byte[]) null;
        }
        field4995++;
        return this.field5002.method1415(32310);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)J", line = 221)
    public final long method1992(int arg0) {
        field5017++;
        if (arg0 != -2) {
            method1999(112);
        }
        return this.field5015;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ld;IZ)V", line = 241)
    public static final void method1993(class146 arg0, int arg1, boolean arg2) {
        int var3 = arg0.field2312;
        field5000++;
        int var4 = (int) arg0.field3499;
        arg0.method1444((byte) 89);
        if (arg2) {
            class123.method937(var3, false);
        }
        if (arg1 != 3) {
            field5010 = 5;
        }
        class2.method5(var3, (byte) 104);
        class191 var5 = class1.method2(var4, (byte) -37);
        if (var5 != null) {
            class250.method1744(var5, (byte) 100);
        }
        int var6 = class195.field3293;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class53.method344(19, class286.field4892[var7])) {
                class309.method2106(var7, arg1 ^ 0x2);
            }
        }
        if (class195.field3293 == 1) {
            class80.field1341 = false;
            class267.method1840(class206.field3498, class276.field4751, class162.field2632, arg1 ^ 0x3, class250.field4246);
        } else {
            class267.method1840(class206.field3498, class276.field4751, class162.field2632, 0, class250.field4246);
            int var8 = class296.field5047.method2040(class57.field837);
            for (int var9 = 0; var9 < class195.field3293; var9++) {
                int var10 = class296.field5047.method2040(class2.method14(var9, true));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class276.field4751 = class195.field3293 * 15 + 22;
            class250.field4246 = var8 + 8;
        }
        if (class301.field5183 != -1) {
            class108.method832(1, 0, class301.field5183);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BIIB)V", line = 308)
    public final void method1994(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field5012++;
        if (arg3 <= 2) {
            return;
        }
        try {
            if ((long) arg2 + this.field5020 > this.field5015) {
                this.field5015 = (long) arg2 + this.field5020;
            }
            if (this.field5008 != -1L && (this.field5008 > this.field5020 || this.field5020 > (long) this.field5007 + this.field5008)) {
                this.method1997(118);
            }
            if (this.field5008 != -1L && ((long) this.field5016.length + this.field5008) < ((long) arg2 + this.field5020)) {
                int var5 = (int) ((long) this.field5016.length + this.field5008 - this.field5020);
                arg2 -= var5;
                class231.method1635(arg0, arg1, this.field5016, (int) (this.field5020 - this.field5008), var5);
                this.field5020 += (long) var5;
                arg1 += var5;
                this.field5007 = this.field5016.length;
                this.method1997(99);
            }
            if (arg2 > this.field5016.length) {
                if (this.field5020 != this.field4994) {
                    this.field5002.method1413(this.field5020, (byte) -120);
                    this.field4994 = this.field5020;
                }
                long var6 = -1L;
                this.field5002.method1417(1, arg0, arg1, arg2);
                if (this.field5011 <= this.field5020 && this.field5011 + ((long) this.field5014) > this.field5020) {
                    var6 = this.field5020;
                } else if (this.field5011 >= this.field5020 && this.field5011 < ((long) arg2 + this.field5020)) {
                    var6 = this.field5011;
                }
                long var8 = -1L;
                if ((long) arg2 + this.field5020 > this.field5011 && ((long) this.field5014 + this.field5011) >= ((long) arg2 + this.field5020)) {
                    var8 = (long) arg2 + this.field5020;
                } else if (this.field5011 + ((long) this.field5014) > this.field5020 && ((long) this.field5014 + this.field5011) <= ((long) arg2 + this.field5020)) {
                    var8 = (long) this.field5014 + this.field5011;
                }
                this.field4994 += (long) arg2;
                if (this.field4994 > this.field5003) {
                    this.field5003 = this.field4994;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class231.method1635(arg0, (int) ((long) arg1 + var6 - this.field5020), this.field4996, (int) (var6 - this.field5011), var10);
                }
                this.field5020 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5008 == -1L) {
                    this.field5008 = this.field5020;
                }
                class231.method1635(arg0, arg1, this.field5016, (int) (this.field5020 - this.field5008), arg2);
                this.field5020 += (long) arg2;
                if ((this.field5020 - this.field5008) > ((long) this.field5007)) {
                    this.field5007 = (int) (this.field5020 - this.field5008);
                }
            }
        } catch (IOException var12) {
            this.field4994 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[B)V", line = 437)
    public final void method1995(byte arg0, byte[] arg1) throws IOException {
        field5005++;
        this.method1990((byte) -123, arg1, 0, arg1.length);
        if (arg0 > -105) {
            this.field5020 = -29L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V", line = 451)
    public final void method1996(long arg0, int arg1) throws IOException {
        field5006++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1991(122));
        }
        this.field5020 = arg0;
        if (arg1 <= 32) {
            this.field5015 = 20L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 469)
    private final void method1997(int arg0) throws IOException {
        if (arg0 < 75) {
            this.field5014 = -4;
        }
        if (this.field5008 != -1L) {
            if (this.field5008 != this.field4994) {
                this.field5002.method1413(this.field5008, (byte) -115);
                this.field4994 = this.field5008;
            }
            this.field5002.method1417(1, this.field5016, 0, this.field5007);
            this.field4994 += (long) this.field5007;
            long var2 = -1L;
            if (this.field4994 > this.field5003) {
                this.field5003 = this.field4994;
            }
            if (this.field5008 >= this.field5011 && this.field5008 < (long) this.field5014 + this.field5011) {
                var2 = this.field5008;
            } else if (this.field5008 <= this.field5011 && this.field5011 < ((long) this.field5007 + this.field5008)) {
                var2 = this.field5011;
            }
            long var4 = -1L;
            if (this.field5011 < this.field5008 + ((long) this.field5007) && (long) this.field5014 + this.field5011 >= this.field5008 - -((long) this.field5007)) {
                var4 = (long) this.field5007 + this.field5008;
            } else if (this.field5008 < (long) this.field5014 + this.field5011 && (long) this.field5014 + this.field5011 <= this.field5008 - -((long) this.field5007)) {
                var4 = (long) this.field5014 + this.field5011;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class231.method1635(this.field5016, (int) (var2 - this.field5008), this.field4996, (int) (var2 - this.field5011), var6);
            }
            this.field5007 = 0;
            this.field5008 = -1L;
        }
        field4999++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 546)
    public static final void method1998(byte arg0) {
        field5001++;
        int var1 = class116.field1942;
        int var2 = class309.field5296;
        if (arg0 < 117) {
            return;
        }
        int var3 = class229.field3977 - var1 - class60.field878;
        int var4 = class90.field1421 - class306.field5258 - var2;
        if (var2 <= 0 && var4 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class212.field3569 != null) {
                var5 = class212.field3569;
            } else if (class216.field3686 == null) {
                var5 = class193.field3246.field4878;
            } else {
                var5 = class216.field3686;
            }
            int var6 = 0;
            int var7 = 0;
            if (class216.field3686 == var5) {
                Insets var8 = class216.field3686.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class229.field3977);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class90.field1421, var1);
            }
            if (var4 > 0) {
                var9.fillRect(var6 + class90.field1421 - var4, var7, var4, class229.field3977);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7 + class229.field3977 - var3, class90.field1421, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lrd;II)V", line = 847)
    public class294(class202 arg0, int arg1, int arg2) throws IOException {
        this.field5002 = arg0;
        this.field5015 = this.field5003 = arg0.method1416((byte) 25);
        this.field5020 = 0L;
        this.field4996 = new byte[arg1];
        this.field5016 = new byte[arg2];
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 638)
    public static void method1999(int arg0) {
        field5009 = null;
        field5018 = null;
        if (arg0 == 15208) {
            field5004 = null;
            field5022 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 656)
    private final void method2000(int arg0) throws IOException {
        field5024++;
        this.field5014 = 0;
        if (this.field5020 != this.field4994) {
            this.field5002.method1413(this.field5020, (byte) -120);
            this.field4994 = this.field5020;
        }
        if (arg0 != 11349) {
            this.field5002 = (class202) null;
        }
        this.field5011 = this.field5020;
        while (this.field4996.length > this.field5014) {
            int var2 = this.field4996.length - this.field5014;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5002.method1418(this.field5014, var2, (byte) -128, this.field4996);
            if (var3 == -1) {
                break;
            }
            this.field5014 += var3;
            this.field4994 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 719)
    public static final void method2001(boolean arg0) {
        field4998++;
        int var1 = class248.field4223.length;
        int var2 = 0;
        if (arg0) {
            field5009 = (class62) null;
        }
        while (var1 > var2) {
            if (class248.field4223[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class173.field2798; var4++) {
                    if (class39.field608[var2] == class166.field2705[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class166.field2705[class173.field2798] = class39.field608[var2];
                    var3 = class173.field2798++;
                }
                class92 var5 = new class92(class248.field4223[var2]);
                int var6 = 0;
                while (class248.field4223[var2].length > var5.field1476 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method721(107);
                    int var9 = (var8 & 0x1FB8) >> 7;
                    int var10 = var8 >> 14;
                    int var11 = var8 & 0x3F;
                    int var12 = (class39.field608[var2] & 0xFF) * 64 + var11 - class290.field4936;
                    int var13 = (class39.field608[var2] >> 8) * 64 + var9 - class120.field2006;
                    class275 var14 = class226.method1601(768, var5.method721(22));
                    if (class301.field5186[var7] == null && (var14.field4712 & 0x1) > 0 && class190.field3028 == var10 && var13 >= 0 && var14.field4714 + var13 < 104 && var12 >= 0 && var14.field4714 + var12 < 104) {
                        class301.field5186[var7] = new class204();
                        class204 var15 = class301.field5186[var7];
                        class288.field4914[class133.field2163++] = var7;
                        var15.field3435 = var14;
                        var15.field3854 = class199.field3367;
                        var15.method1581((byte) 29, var15.field3435.field4714);
                        var15.field3868 = var15.field3435.field4677;
                        var15.field3816 = var15.field3435.field4669;
                        if (var15.field3816 == 0) {
                            var15.field3856 = 0;
                        }
                        var15.field3870 = var15.field3435.field4715;
                        var15.field3815 = var15.field3435.field4675;
                        var15.field3817 = var15.field3435.field4664;
                        var15.field3879 = var15.field3435.field4682;
                        var15.field3811 = var15.field3435.field4667;
                        var15.field3831 = var15.field3435.field4699;
                        var15.method1583(var12, var13, var15.method1101(!arg0), true, -14041);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIIII)V", line = 819)
    public static final void method2002(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class106.field1727 = arg2;
        field5019++;
        class21.field221 = arg4;
        class284.field4862 = arg1;
        if (arg6 != 128) {
            field5021 = true;
        }
        class194.field3280 = arg5;
        class123.field2037 = arg3;
        if (arg0 && class123.field2037 >= 100) {
            class258.field4351 = class21.field221 * 128 + 64;
            class215.field3647 = class106.field1727 * 128 + 64;
            class15.field134 = class165.method1186((byte) -58, class215.field3647, class258.field4351, class7.field85) - class194.field3280;
        }
        class21.field220 = 2;
    }
}
