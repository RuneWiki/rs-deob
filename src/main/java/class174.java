import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class174 {

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "J")
    private long field2768 = -1L;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "J")
    private long field2780 = -1L;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lsk;")
    private class133 field2758;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "J")
    private long field2776;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "J")
    private long field2785;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[B")
    private byte[] field2764;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "J")
    private long field2761;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[B")
    private byte[] field2771;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lvk;")
    public static class67 field2765 = new class67(20);

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Lvk;")
    public static class67 field2787 = new class67(30);

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Z")
    public static boolean field2790 = false;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "Lck;")
    private static class119 field2792 = class298.method1987((byte) 19, "Hidden");

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "Z")
    public static boolean field2796 = true;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Lck;")
    public static class119 field2795 = field2792;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Lck;")
    public static class119 field2793 = class298.method1987((byte) 126, "::fpson");

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static volatile int field2794 = 0;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "Lck;")
    public static class119 field2797 = class298.method1987((byte) 104, "<br>(X");

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "J")
    private long field2760;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Lva;")
    public static class36 field2786;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "[Lmd;")
    public static class88[] field2791;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lva;Z)V", line = 15)
    public static final void method1107(class36 arg0, boolean arg1) {
        field2783++;
        if (arg1) {
            class226.field3615 = arg0;
            class292.field4868 = class226.field3615.method263(16, 100);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BB)V", line = 39)
    public final void method1108(byte[] arg0, byte arg1) throws IOException {
        field2775++;
        if (arg1 > -95) {
            this.field2768 = 33L;
        }
        this.method1116(arg0.length, arg0, (byte) 39, 0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 50)
    public static void method1109(int arg0) {
        field2786 = null;
        field2765 = null;
        field2791 = null;
        field2795 = null;
        if (arg0 != 30) {
            field2794 = 74;
        }
        field2797 = null;
        field2792 = null;
        field2787 = null;
        field2793 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII[II[BI)V", line = 69)
    public static final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, byte[] arg8, int arg9) {
        field2762++;
        int var10 = -(arg4 >> 2);
        int var11 = -(arg4 & arg1);
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg8[arg2++] == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg9;
                }
                if (arg8[arg2++] == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg9;
                }
                if (arg8[arg2++] == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg9;
                }
                if (arg8[arg2++] == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg9;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg8[arg2++] == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg9;
                }
            }
            arg2 += arg0;
            arg3 += arg7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Lnh;", line = 132)
    public static final class61 method1111(byte arg0) {
        field2782++;
        try {
            int var1 = 102 % ((arg0 + 47) / 50);
            return (class61) Class.forName("b").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 148)
    public final void method1112(int arg0) throws IOException {
        field2788++;
        this.method1115(-59);
        if (arg0 <= 106) {
            this.field2761 = 106L;
        }
        this.field2758.method879(13943);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)[Lbe;", line = 163)
    public static final class81[] method1113(int arg0) {
        field2777++;
        class81[] var1 = new class81[class285.field4706];
        if (arg0 != -1) {
            method1121((byte) -121, 116, -31, 97);
        }
        for (int var2 = 0; var2 < class285.field4706; var2++) {
            var1[var2] = new class127(class227.field3641, class207.field3304, class155.field2475[var2], class7.field152[var2], class232.field3741[var2], class64.field1006[var2], class247.field3989[var2], class161.field2553);
        }
        class162.method1035(arg0 ^ 0x4FCF);
        return var1;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 191)
    private final void method1114(byte arg0) throws IOException {
        field2779++;
        this.field2784 = 0;
        if (this.field2761 != this.field2760) {
            this.field2758.method878((byte) -126, this.field2761);
            this.field2760 = this.field2761;
        }
        this.field2780 = this.field2761;
        if (arg0 != -22) {
            field2795 = (class119) null;
        }
        while (this.field2784 < this.field2764.length) {
            int var2 = this.field2764.length - this.field2784;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2758.method874(this.field2764, (byte) 70, this.field2784, var2);
            if (var3 == -1) {
                break;
            }
            this.field2760 += (long) var3;
            this.field2784 += var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 236)
    private final void method1115(int arg0) throws IOException {
        if (this.field2768 != -1L) {
            if (this.field2768 != this.field2760) {
                this.field2758.method878((byte) 92, this.field2768);
                this.field2760 = this.field2768;
            }
            this.field2758.method877(this.field2770, (byte) -121, this.field2771, 0);
            long var2 = -1L;
            if (this.field2768 >= this.field2780 && (long) this.field2784 + this.field2780 > this.field2768) {
                var2 = this.field2768;
            } else if (this.field2780 >= this.field2768 && ((long) this.field2770 + this.field2768) > this.field2780) {
                var2 = this.field2780;
            }
            this.field2760 += (long) this.field2770;
            long var4 = -1L;
            if (this.field2760 > this.field2776) {
                this.field2776 = this.field2760;
            }
            if ((this.field2768 + ((long) this.field2770)) > this.field2780 && ((long) this.field2770 + this.field2768) <= ((long) this.field2784 + this.field2780)) {
                var4 = this.field2768 + ((long) this.field2770);
            } else if (this.field2768 < this.field2780 + ((long) this.field2784) && ((long) this.field2784 + this.field2780) <= ((long) this.field2770 + this.field2768)) {
                var4 = (long) this.field2784 + this.field2780;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class213.method1339(this.field2771, (int) (var2 - this.field2768), this.field2764, (int) (var2 - this.field2780), var6);
            }
            this.field2768 = -1L;
            this.field2770 = 0;
        }
        field2773++;
        if (arg0 >= -22) {
            method1109(-57);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[BBI)V", line = 314)
    public final void method1116(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field2778++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field2768 != -1L && this.field2761 >= this.field2768 && (long) this.field2770 + this.field2768 >= (long) arg0 + this.field2761) {
                class213.method1339(this.field2771, (int) (this.field2761 - this.field2768), arg1, arg3, arg0);
                this.field2761 += (long) arg0;
                return;
            }
            long var5 = this.field2761;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field2780 <= this.field2761 && this.field2761 < ((long) this.field2784 + this.field2780)) {
                int var9 = (int) (this.field2780 + (long) this.field2784 - this.field2761);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class213.method1339(this.field2764, (int) (this.field2761 - this.field2780), arg1, arg3, var9);
                arg0 -= var9;
                this.field2761 += (long) var9;
                arg3 += var9;
            }
            if (arg0 > this.field2764.length) {
                this.field2758.method878((byte) 95, this.field2761);
                this.field2760 = this.field2761;
                while (arg0 > 0) {
                    int var10 = this.field2758.method874(arg1, (byte) 70, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2760 += (long) var10;
                    this.field2761 += (long) var10;
                    arg3 += var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method1114((byte) -22);
                int var11 = arg0;
                if (this.field2784 < arg0) {
                    var11 = this.field2784;
                }
                class213.method1339(this.field2764, 0, arg1, arg3, var11);
                this.field2761 += (long) var11;
                arg3 += var11;
                arg0 -= var11;
            }
            if (this.field2768 != -1L) {
                if (this.field2761 < this.field2768 && arg0 > 0) {
                    int var12 = arg3 + ((int) (this.field2768 - this.field2761));
                    if (arg0 + arg3 < var12) {
                        var12 = arg3 + arg0;
                    }
                    while (arg3 < var12) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field2761++;
                    }
                }
                long var13 = -1L;
                if (this.field2768 >= var5 && this.field2768 < (var5 + ((long) var7))) {
                    var13 = this.field2768;
                } else if (this.field2768 <= var5 && ((long) this.field2770 + this.field2768) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field2770 + this.field2768) > var5 && (var5 + ((long) var7)) >= ((long) this.field2770 + this.field2768)) {
                    var15 = (long) this.field2770 + this.field2768;
                } else if ((var5 + ((long) var7)) > this.field2768 && (long) this.field2770 + this.field2768 >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class213.method1339(this.field2771, (int) (var13 - this.field2768), arg1, var8 + ((int) (var13 - var5)), var17);
                    if (this.field2761 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2761));
                        this.field2761 = var15;
                    }
                }
            }
            if (arg2 != 39) {
                this.field2784 = -61;
            }
        } catch (IOException var19) {
            this.field2760 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lsk;II)V", line = 726)
    public class174(class133 arg0, int arg1, int arg2) throws IOException {
        this.field2758 = arg0;
        this.field2785 = this.field2776 = arg0.method875((byte) 29);
        this.field2764 = new byte[arg1];
        this.field2761 = 0L;
        this.field2771 = new byte[arg2];
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)J", line = 512)
    public final long method1117(byte arg0) {
        field2766++;
        if (arg0 <= 117) {
            method1111((byte) -59);
        }
        return this.field2785;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(JB)V", line = 526)
    public final void method1118(long arg0, byte arg1) throws IOException {
        field2763++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1120(-102));
        }
        this.field2761 = arg0;
        if (arg1 != -1) {
            field2793 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BIIB)V", line = 542)
    public final void method1119(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field2781++;
        try {
            if (this.field2785 < ((long) arg2 + this.field2761)) {
                this.field2785 = (long) arg2 + this.field2761;
            }
            if (this.field2768 != -1L && (this.field2761 < this.field2768 || this.field2761 > (this.field2768 + ((long) this.field2770)))) {
                this.method1115(-70);
            }
            if (this.field2768 != -1L && (this.field2761 + ((long) arg2)) > (this.field2768 + ((long) this.field2771.length))) {
                int var5 = (int) (-this.field2761 - (-this.field2768 - (long) this.field2771.length));
                arg2 -= var5;
                class213.method1339(arg0, arg1, this.field2771, (int) (this.field2761 - this.field2768), var5);
                this.field2761 += (long) var5;
                this.field2770 = this.field2771.length;
                this.method1115(-124);
                arg1 += var5;
            }
            if (arg2 > this.field2771.length) {
                long var6 = -1L;
                if (this.field2761 != this.field2760) {
                    this.field2758.method878((byte) 106, this.field2761);
                    this.field2760 = this.field2761;
                }
                this.field2758.method877(arg2, (byte) -89, arg0, arg1);
                long var8 = -1L;
                if (this.field2780 < (long) arg2 + this.field2761 && this.field2780 + ((long) this.field2784) >= (long) arg2 + this.field2761) {
                    var8 = this.field2761 + ((long) arg2);
                } else if (this.field2761 < (long) this.field2784 + this.field2780 && (long) this.field2784 + this.field2780 <= (long) arg2 + this.field2761) {
                    var8 = (long) this.field2784 + this.field2780;
                }
                this.field2760 += (long) arg2;
                if (this.field2780 <= this.field2761 && this.field2761 < (long) this.field2784 + this.field2780) {
                    var6 = this.field2761;
                } else if (this.field2780 >= this.field2761 && (long) arg2 + this.field2761 > this.field2780) {
                    var6 = this.field2780;
                }
                if (this.field2776 < this.field2760) {
                    this.field2776 = this.field2760;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class213.method1339(arg0, (int) ((long) arg1 + var6 - this.field2761), this.field2764, (int) (var6 - this.field2780), var10);
                }
                this.field2761 += (long) arg2;
                return;
            }
            if (arg2 > 0) {
                if (this.field2768 == -1L) {
                    this.field2768 = this.field2761;
                }
                class213.method1339(arg0, arg1, this.field2771, (int) (this.field2761 - this.field2768), arg2);
                this.field2761 += (long) arg2;
                if (this.field2761 - this.field2768 > (long) this.field2770) {
                    this.field2770 = (int) (this.field2761 - this.field2768);
                }
                return;
            }
        } catch (IOException var12) {
            this.field2760 = -1L;
            throw var12;
        }
        if (arg3 < 43) {
            method1111((byte) -82);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Ljava/io/File;", line = 673)
    private final File method1120(int arg0) {
        int var2 = -109 / ((-arg0 - 27) / 32);
        field2759++;
        return this.field2758.method876((byte) 15);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIII)I", line = 687)
    public static final int method1121(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2769++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            int var5 = 29 % ((-arg0 - 58) / 58);
            return arg2;
        }
    }
}
