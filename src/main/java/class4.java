import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    private int field168 = 0;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "J")
    private long field181 = -1L;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "J")
    private long field192 = -1L;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lnb;")
    private class80 field154;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "J")
    private long field182;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "J")
    private long field188;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[B")
    private byte[] field186;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "J")
    private long field183;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[B")
    private byte[] field158;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[J")
    public static long[] field155 = new long[32];

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[J")
    public static long[] field164 = new long[200];

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lwb;")
    public static class130 field163 = class26.method212("::", -32376);

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "J")
    public static long field170 = 0L;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lwb;")
    public static class130 field166 = class26.method212("leuchten2:", -32376);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lwb;")
    private static class130 field152 = class26.method212("Off", -32376);

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Lwb;")
    private static class130 field179 = class26.method212("Connecting to update server", -32376);

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lwb;")
    public static class130 field172 = field179;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lwb;")
    public static class130 field160 = field152;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Z")
    public static boolean field165 = false;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Z")
    public static boolean field189 = false;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Lwb;")
    private static class130 field191 = class26.method212("shake:", -32376);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lwb;")
    public static class130 field153 = field191;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Ls;")
    public static class108 field162 = new class108();

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "Lwb;")
    public static class130 field193 = class26.method212("Ignorieren", -32376);

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "Lwb;")
    private static class130 field196 = class26.method212("World", -32376);

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Lwb;")
    public static class130 field195 = field196;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "J")
    private long field174;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lgb;")
    public static class39 field194;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
    public static int[] field167;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 11)
    public static void method25(boolean arg0) {
        field172 = null;
        field162 = null;
        field194 = null;
        field193 = null;
        field191 = null;
        field153 = null;
        field163 = null;
        field164 = null;
        field155 = null;
        field160 = null;
        field166 = null;
        field167 = null;
        field195 = null;
        if (arg0) {
            method38(21, null);
        }
        field196 = null;
        field152 = null;
        field179 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 51)
    public static final void method26(byte arg0) {
        int var1 = -98 % ((61 - arg0) / 50);
        for (int var2 = -1; var2 < class61.field1582; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class26.field770[var2];
            }
            class59 var7 = class105.field2550[var6];
            if (var7 != null && var7.field2089 > 0) {
                var7.field2089--;
                if (var7.field2089 == 0) {
                    var7.field2074 = null;
                }
            }
        }
        field175++;
        for (int var3 = 0; var3 < class58.field1466; var3++) {
            int var4 = class24.field716[var3];
            class33 var5 = class26.field766[var4];
            if (var5 != null && var5.field2089 > 0) {
                var5.field2089--;
                if (var5.field2089 == 0) {
                    var5.field2074 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[B)V", line = 105)
    public final void method27(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field177++;
        try {
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field192 != -1L && this.field192 <= this.field183 && (long) arg1 + this.field183 <= (long) this.field168 + this.field192) {
                class127.method943(this.field158, (int) (this.field183 - this.field192), arg3, arg2, arg1);
                this.field183 += arg1;
                return;
            }
            int var5 = arg2;
            int var6 = arg1;
            long var7 = this.field183;
            if (this.field181 <= this.field183 && this.field181 + (long) this.field178 > this.field183) {
                int var9 = (int) ((long) this.field178 + this.field181 - this.field183);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class127.method943(this.field186, (int) (this.field183 - this.field181), arg3, arg2, var9);
                arg1 -= var9;
                arg2 += var9;
                this.field183 += var9;
            }
            if (arg1 > this.field186.length) {
                this.field154.method615(this.field183, 0);
                this.field174 = this.field183;
                while (arg1 > 0) {
                    int var11 = this.field154.method610(arg2, (byte) -71, arg1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 += var11;
                    this.field174 += var11;
                    arg1 -= var11;
                    this.field183 += var11;
                }
            } else if (arg1 > 0) {
                int var10 = arg1;
                this.method37(false);
                if (this.field178 < arg1) {
                    var10 = this.field178;
                }
                arg1 -= var10;
                class127.method943(this.field186, 0, arg3, arg2, var10);
                arg2 += var10;
                this.field183 += var10;
            }
            if (this.field192 != -1L) {
                if (this.field192 > this.field183 && arg1 > 0) {
                    int var12 = (int) (this.field192 - this.field183) + arg2;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg3[arg2++] = 0;
                        this.field183++;
                    }
                }
                long var13 = -1L;
                if (this.field192 >= var7 && this.field192 < (long) var6 + var7) {
                    var13 = this.field192;
                } else if (var7 >= this.field192 && var7 < (long) this.field168 + this.field192) {
                    var13 = var7;
                }
                long var15 = -1L;
                if (var7 < (long) this.field168 + this.field192 && (long) this.field168 + this.field192 <= (long) var6 + var7) {
                    var15 = (long) this.field168 + this.field192;
                } else if (this.field192 < (long) var6 + var7 && (long) this.field168 + this.field192 >= var7 - -((long) var6)) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class127.method943(this.field158, (int) (var13 - this.field192), arg3, (int) (var13 - var7) + var5, var17);
                    if (this.field183 < var15) {
                        arg1 = (int) ((long) arg1 + this.field183 - var15);
                        this.field183 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field174 = -1L;
            throw var19;
        }
        if (~arg1 < arg0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 282)
    public final void method28(byte arg0) throws IOException {
        if (arg0 > -104) {
            field162 = null;
        }
        field190++;
        this.method34(0);
        this.field154.method614(-113);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BII)V", line = 294)
    public final void method29(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field184++;
        try {
            if (this.field183 + (long) arg0 > this.field188) {
                this.field188 = (long) arg0 + this.field183;
            }
            if ((long) arg2 != this.field192 && (this.field192 > this.field183 || (long) this.field168 + this.field192 < this.field183)) {
                this.method34(0);
            }
            if (this.field192 != -1L && (long) arg0 + this.field183 > (long) this.field158.length + this.field192) {
                int var5 = (int) ((long) this.field158.length + this.field192 - this.field183);
                class127.method943(arg1, arg3, this.field158, (int) (this.field183 - this.field192), var5);
                arg0 -= var5;
                this.field183 += var5;
                this.field168 = this.field158.length;
                arg3 += var5;
                this.method34(~arg2);
            }
            if (this.field158.length < arg0) {
                if (this.field183 != this.field174) {
                    this.field154.method615(this.field183, arg2 + 1);
                    this.field174 = this.field183;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field154.method613(arg3, 1, arg1, arg0);
                this.field174 += arg0;
                if (this.field183 >= this.field181 && this.field183 < (long) this.field178 + this.field181) {
                    var6 = this.field183;
                } else if (this.field181 >= this.field183 && this.field181 < (long) arg0 + this.field183) {
                    var6 = this.field181;
                }
                if (this.field181 < (long) arg0 + this.field183 && (long) arg0 + this.field183 <= (long) this.field178 + this.field181) {
                    var8 = (long) arg0 + this.field183;
                } else if ((long) this.field178 + this.field181 > this.field183 && this.field181 + (long) this.field178 <= this.field183 - -((long) arg0)) {
                    var8 = (long) this.field178 + this.field181;
                }
                if (this.field182 < this.field174) {
                    this.field182 = this.field174;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class127.method943(arg1, (int) ((long) arg3 + var6 - this.field183), this.field186, (int) (var6 - this.field181), var10);
                }
                this.field183 += arg0;
            } else if (arg0 > 0) {
                if (this.field192 == -1L) {
                    this.field192 = this.field183;
                }
                class127.method943(arg1, arg3, this.field158, (int) (this.field183 - this.field192), arg0);
                this.field183 += arg0;
                if ((long) this.field168 < this.field183 - this.field192) {
                    this.field168 = (int) (this.field183 - this.field192);
                }
            }
        } catch (IOException var12) {
            this.field174 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwb;ZBLwb;)V", line = 443)
    public static final void method30(class130 arg0, boolean arg1, byte arg2, class130 arg3) {
        field161++;
        if (class43.field1191) {
            class43.field1191 = false;
            method31(-102);
            class96.method719(-120);
            class115.method884(553);
            class30.method242(14425);
            class31.method251(false, class121.field2965, class101.field2420, class132.field3202, class48.field1291);
            class130.method971(-1, true, class71.field1814, class105.field2538 == -1, class42.field1181);
            class94.field2292 = true;
            class108.field2609 = true;
            class26.field740 = true;
        }
        class84.method627(27800);
        short var4 = 151;
        int var6 = var4 - 3;
        class132.field3202.method1012(arg3, 257, var6, 0);
        class132.field3202.method1012(arg3, 256, var6 - 1, 16777215);
        if (arg2 <= 40) {
            method26((byte) 111);
        }
        if (arg0 != null) {
            var6 += 15;
            if (arg1) {
                int var5 = class132.field3202.method1013(arg0) + 4;
                class49.method440(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class132.field3202.method1012(arg0, 257, var6, 0);
            class132.field3202.method1012(arg0, 256, var6 - 1, 16777215);
        }
        class29.method241(1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 488)
    public static final void method31(int arg0) {
        try {
            Graphics var1 = class84.field2003.getGraphics();
            class56.field1442.method187(4, var1, -26826, 0);
            class83.field1955.method187(357, var1, -26826, 0);
            class97.field2337.method187(4, var1, -26826, 722);
            if (arg0 > -81) {
                field166 = null;
            }
            class7.field256.method187(205, var1, -26826, 743);
            class32.field896.method187(0, var1, -26826, 0);
            class59.field1497.method187(4, var1, -26826, 516);
            class109.field2634.method187(205, var1, -26826, 516);
            class75.field1882.method187(357, var1, -26826, 496);
            class17.field465.method187(338, var1, -26826, 0);
        } catch (Exception var2) {
            class84.field2003.repaint();
        }
        field169++;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)J", line = 517)
    public final long method32(byte arg0) {
        field185++;
        return arg0 <= 75 ? 78L : this.field188;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 533)
    public static final void method33(int arg0, int arg1) {
        field156++;
        if (class93.field2250 == null) {
            return;
        }
        if (class45.field1202 == 0) {
            if (class30.field839 >= 0) {
                class30.field839 = arg1;
                class93.field2250.method171(arg1, 19029, 0);
            }
        } else if (class88.field2127 != null) {
            class14.field399 = arg1;
        }
        if (arg0 != 31156) {
            method25(true);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 563)
    private final void method34(int arg0) throws IOException {
        if (arg0 != 0) {
            return;
        }
        field171++;
        if (this.field192 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field192 != this.field174) {
            this.field154.method615(this.field192, 0);
            this.field174 = this.field192;
        }
        this.field154.method613(0, 1, this.field158, this.field168);
        this.field174 += this.field168;
        long var4 = -1L;
        if (this.field181 < (long) this.field168 + this.field192 && this.field192 + (long) this.field168 <= (long) this.field178 + this.field181) {
            var4 = (long) this.field168 + this.field192;
        } else if (this.field192 < (long) this.field178 + this.field181 && (long) this.field178 + this.field181 <= (long) this.field168 + this.field192) {
            var4 = (long) this.field178 + this.field181;
        }
        if (this.field182 < this.field174) {
            this.field182 = this.field174;
        }
        if (this.field181 <= this.field192 && this.field192 < (long) this.field178 + this.field181) {
            var2 = this.field192;
        } else if (this.field181 >= this.field192 && this.field181 < this.field192 + (long) this.field168) {
            var2 = this.field181;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class127.method943(this.field158, (int) (var2 - this.field192), this.field186, (int) (var2 - this.field181), var6);
        }
        this.field168 = 0;
        this.field192 = -1L;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IJ)V", line = 645)
    public final void method35(int arg0, long arg1) {
        field180++;
        if (arg1 >= 0L) {
            int var4 = 118 % ((arg0 + 35) / 33);
            this.field183 = arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lnb;II)V", line = 840)
    public class4(class80 arg0, int arg1, int arg2) throws IOException {
        this.field154 = arg0;
        this.field188 = this.field182 = arg0.method612((byte) -128);
        this.field186 = new byte[arg1];
        this.field183 = 0L;
        this.field158 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIII)Lwb;", line = 670)
    public static final class130 method36(byte[] arg0, int arg1, int arg2, int arg3) {
        field159++;
        class130 var4 = new class130();
        var4.field3079 = arg2;
        var4.field3081 = new byte[arg1];
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field3081[var4.field3079++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V", line = 754)
    private final void method37(boolean arg0) throws IOException {
        this.field178 = 0;
        if (arg0) {
            this.field158 = null;
        }
        field173++;
        if (this.field183 != this.field174) {
            this.field154.method615(this.field183, 0);
            this.field174 = this.field183;
        }
        this.field181 = this.field183;
        while (this.field186.length > this.field178) {
            int var2 = this.field154.method610(this.field178, (byte) -101, this.field186.length - this.field178, this.field186);
            if (var2 == -1) {
                break;
            }
            this.field178 += var2;
            this.field174 += var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILwb;)Z", line = 800)
    public static final boolean method38(int arg0, class130 arg1) {
        if (arg0 != 4739) {
            field194 = null;
        }
        field176++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class35.field993; var2++) {
            if (arg1.method986(-66, class79.field1915[var2])) {
                return true;
            }
        }
        return arg1.method986(arg0 ^ 0xFFFFED3D, class42.field1179.field1515);
    }
}
