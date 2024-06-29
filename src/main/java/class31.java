import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class31 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "J")
    private long field779 = -1L;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    private int field780 = 0;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "J")
    private long field777 = -1L;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lbc;")
    private class99 field775;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "J")
    private long field782;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "J")
    private long field789;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "[B")
    private byte[] field792;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "J")
    private long field784;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "[B")
    private byte[] field801;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Lvf;")
    public static class265 field794 = class87.method582(-46, "cross");

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Lvf;")
    public static class265 field800 = class87.method582(-46, ")1a2)1m");

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Lvf;")
    public static class265 field799 = class87.method582(-46, "<br>");

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field796 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "J")
    private long field781;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lfc;")
    public static class191 field785;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[B)V")
    public final void method251(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field798++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field777 != -1L && this.field777 <= this.field784 && (this.field777 + ((long) this.field780)) >= ((long) arg0 + this.field784)) {
                class194.method1342(this.field792, (int) (this.field784 - this.field777), arg3, arg1, arg0);
                this.field784 += (long) arg0;
                return;
            }
            long var5 = this.field784;
            int var7 = -97 % ((arg2 - 65) / 46);
            int var8 = arg1;
            int var9 = arg0;
            if (this.field784 >= this.field779 && this.field784 < (long) this.field787 + this.field779) {
                int var10 = (int) (this.field779 + (long) this.field787 - this.field784);
                if (arg0 < var10) {
                    var10 = arg0;
                }
                arg0 -= var10;
                class194.method1342(this.field801, (int) (this.field784 - this.field779), arg3, arg1, var10);
                this.field784 += (long) var10;
                arg1 += var10;
            }
            if (this.field801.length < arg0) {
                this.field775.method659(this.field784, (byte) -107);
                this.field781 = this.field784;
                while (arg0 > 0) {
                    int var11 = this.field775.method660(true, arg1, arg0, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 -= var11;
                    this.field784 += (long) var11;
                    this.field781 += (long) var11;
                    arg1 += var11;
                }
            } else if (arg0 > 0) {
                this.method253((byte) -60);
                int var12 = arg0;
                if (this.field787 < arg0) {
                    var12 = this.field787;
                }
                class194.method1342(this.field801, 0, arg3, arg1, var12);
                arg0 -= var12;
                arg1 += var12;
                this.field784 += (long) var12;
            }
            if (this.field777 != -1L) {
                if (this.field777 > this.field784 && arg0 > 0) {
                    int var13 = arg1 + ((int) (this.field777 - this.field784));
                    if (var13 > (arg0 + arg1)) {
                        var13 = arg0 + arg1;
                    }
                    while (var13 > arg1) {
                        arg0--;
                        arg3[arg1++] = 0;
                        this.field784++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (this.field777 >= var5 && this.field777 < var5 + ((long) var9)) {
                    var16 = this.field777;
                } else if (var5 >= this.field777 && (long) this.field780 + this.field777 > var5) {
                    var16 = var5;
                }
                if ((long) this.field780 + this.field777 > var5 && (long) this.field780 + this.field777 <= (long) var9 + var5) {
                    var14 = this.field777 + ((long) this.field780);
                } else if (this.field777 < ((long) var9 + var5) && ((long) var9 + var5) <= ((long) this.field780 + this.field777)) {
                    var14 = (long) var9 + var5;
                }
                if (var16 > -1L && var16 < var14) {
                    int var18 = (int) (var14 - var16);
                    class194.method1342(this.field792, (int) (var16 - this.field777), arg3, var8 + ((int) (var16 - var5)), var18);
                    if (this.field784 < var14) {
                        arg0 = (int) ((long) arg0 - (var14 - this.field784));
                        this.field784 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field781 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(JI)V")
    public final void method252(long arg0, int arg1) throws IOException {
        field797++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method259((byte) 30));
        }
        this.field784 = arg0;
        if (arg1 != 0) {
            this.field779 = -48L;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    private final void method253(byte arg0) throws IOException {
        this.field787 = 0;
        if (this.field784 != this.field781) {
            this.field775.method659(this.field784, (byte) -107);
            this.field781 = this.field784;
        }
        field793++;
        int var2 = -2 / ((-arg0 - 14) / 40);
        this.field779 = this.field784;
        while (this.field801.length > this.field787) {
            int var3 = this.field801.length - this.field787;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field775.method660(true, this.field787, var3, this.field801);
            if (var4 == -1) {
                break;
            }
            this.field781 += (long) var4;
            this.field787 += var4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    private final void method254(boolean arg0) throws IOException {
        if (arg0) {
            method258(80, (byte) -51, (class6) null, 35);
        }
        field783++;
        if (this.field777 == -1L) {
            return;
        }
        if (this.field781 != this.field777) {
            this.field775.method659(this.field777, (byte) -107);
            this.field781 = this.field777;
        }
        long var2 = -1L;
        this.field775.method658((byte) -76, 0, this.field792, this.field780);
        if (((long) this.field780 + this.field777) > this.field779 && ((long) this.field787 + this.field779) >= ((long) this.field780 + this.field777)) {
            var2 = (long) this.field780 + this.field777;
        } else if ((long) this.field787 + this.field779 > this.field777 && (long) this.field780 + this.field777 >= (long) this.field787 + this.field779) {
            var2 = (long) this.field787 + this.field779;
        }
        long var4 = -1L;
        this.field781 += (long) this.field780;
        if (this.field779 <= this.field777 && ((long) this.field787 + this.field779) > this.field777) {
            var4 = this.field777;
        } else if (this.field779 >= this.field777 && (this.field777 + ((long) this.field780)) > this.field779) {
            var4 = this.field779;
        }
        if (this.field781 > this.field782) {
            this.field782 = this.field781;
        }
        if (var4 > -1L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class194.method1342(this.field792, (int) (var4 - this.field777), this.field801, (int) (var4 - this.field779), var6);
        }
        this.field777 = -1L;
        this.field780 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public final void method255(byte arg0) throws IOException {
        this.method254(false);
        field786++;
        if (arg0 != 66) {
            field796 = null;
        }
        this.field775.method656(false);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI[BI)V")
    public final void method256(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field791++;
        try {
            if ((long) arg1 + this.field784 > this.field789) {
                this.field789 = this.field784 + ((long) arg1);
            }
            if (this.field777 != -1L && (this.field777 > this.field784 || ((long) this.field780 + this.field777) < this.field784)) {
                this.method254(false);
            }
            if (this.field777 != -1L && ((long) this.field792.length + this.field777) < ((long) arg1 + this.field784)) {
                int var5 = (int) (this.field777 - (this.field784 - (long) this.field792.length));
                arg1 -= var5;
                class194.method1342(arg2, arg3, this.field792, (int) (this.field784 - this.field777), var5);
                this.field784 += (long) var5;
                arg3 += var5;
                this.field780 = this.field792.length;
                this.method254(false);
            }
            if (arg0 > -46) {
                this.field780 = 18;
            }
            if (this.field792.length < arg1) {
                if (this.field784 != this.field781) {
                    this.field775.method659(this.field784, (byte) -107);
                    this.field781 = this.field784;
                }
                this.field775.method658((byte) -76, arg3, arg2, arg1);
                this.field781 += (long) arg1;
                long var6 = -1L;
                if (this.field784 >= this.field779 && this.field784 < ((long) this.field787 + this.field779)) {
                    var6 = this.field784;
                } else if (this.field779 >= this.field784 && ((long) arg1 + this.field784) > this.field779) {
                    var6 = this.field779;
                }
                if (this.field782 < this.field781) {
                    this.field782 = this.field781;
                }
                long var8 = -1L;
                if (this.field779 < ((long) arg1 + this.field784) && ((long) arg1 + this.field784) <= ((long) this.field787 + this.field779)) {
                    var8 = (long) arg1 + this.field784;
                } else if ((long) this.field787 + this.field779 > this.field784 && ((long) arg1 + this.field784) >= ((long) this.field787 + this.field779)) {
                    var8 = (long) this.field787 + this.field779;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class194.method1342(arg2, (int) (var6 + (long) arg3 - this.field784), this.field801, (int) (var6 - this.field779), var10);
                }
                this.field784 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field777 == -1L) {
                    this.field777 = this.field784;
                }
                class194.method1342(arg2, arg3, this.field792, (int) (this.field784 - this.field777), arg1);
                this.field784 += (long) arg1;
                if ((this.field784 - this.field777) > ((long) this.field780)) {
                    this.field780 = (int) (this.field784 - this.field777);
                }
            }
        } catch (IOException var12) {
            this.field781 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)J")
    public final long method257(boolean arg0) {
        field795++;
        if (!arg0) {
            this.field792 = null;
        }
        return this.field789;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBLgk;I)V")
    public static final void method258(int arg0, byte arg1, class6 arg2, int arg3) {
        field778++;
        if (class207.field3722 != null || class50.field1049 || arg2 == null || class213.method1453(arg2, 127) == null) {
            return;
        }
        class207.field3722 = arg2;
        class273.field4846 = class213.method1453(arg2, -44);
        class22.field662 = arg0;
        if (arg1 == -77) {
            class199.field3563 = 0;
            class155.field2861 = false;
            class161.field2941 = arg3;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method259(byte arg0) {
        field790++;
        return arg0 < 0 ? null : this.field775.method661((byte) -36);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([BB)V")
    public final void method260(byte[] arg0, byte arg1) throws IOException {
        this.method251(arg0.length, 0, -27, arg0);
        if (arg1 < 70) {
            this.method259((byte) 112);
        }
        field788++;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V")
    public static void method261(byte arg0) {
        if (arg0 != -119) {
            field799 = null;
        }
        field794 = null;
        field785 = null;
        field799 = null;
        field796 = null;
        field800 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lbc;II)V")
    public class31(class99 arg0, int arg1, int arg2) throws IOException {
        this.field775 = arg0;
        this.field789 = this.field782 = arg0.method657(0);
        this.field792 = new byte[arg2];
        this.field784 = 0L;
        this.field801 = new byte[arg1];
    }
}
