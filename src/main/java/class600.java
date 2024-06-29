import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class600 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    private int field7952 = 0;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "J")
    private long field7962 = -1L;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
    private long field7960 = -1L;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lbaa;")
    private class488 field7953;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "J")
    private long field7951;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "J")
    private long field7964;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "J")
    private long field7972;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "[B")
    private byte[] field7971;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "[B")
    private byte[] field7961;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field7959 = 0;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "B")
    public static byte field7968;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    private int field7957;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "J")
    private long field7955;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[[B")
    public static byte[][] field7970;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BI)V")
    public final void method3301(byte[] arg0, int arg1) throws IOException {
        this.method3310(arg0.length, arg0, arg1, (byte) -114);
        field7956++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(JB)V")
    public final void method3302(long arg0, byte arg1) throws IOException {
        field7967++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3304(true));
        } else if (arg1 == -51) {
            this.field7972 = arg0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    private final void method3303(int arg0) throws IOException {
        field7969++;
        if (arg0 > -43) {
            this.field7953 = null;
        }
        if (this.field7962 == -1L) {
            return;
        }
        if (this.field7962 != this.field7955) {
            this.field7953.method2733(62, this.field7962);
            this.field7955 = this.field7962;
        }
        this.field7953.method2730(0, this.field7961, this.field7952, -1);
        this.field7955 += this.field7952;
        if (this.field7951 < this.field7955) {
            this.field7951 = this.field7955;
        }
        long var2 = -1L;
        if (this.field7960 <= this.field7962 && this.field7962 < ((long) this.field7957 + this.field7960)) {
            var2 = this.field7962;
        } else if (this.field7960 >= this.field7962 && this.field7960 < this.field7962 + ((long) this.field7952)) {
            var2 = this.field7960;
        }
        long var4 = -1L;
        if ((long) this.field7952 + this.field7962 > this.field7960 && (long) this.field7952 + this.field7962 <= this.field7960 - -((long) this.field7957)) {
            var4 = (long) this.field7952 + this.field7962;
        } else if (((long) this.field7957 + this.field7960) > this.field7962 && (long) this.field7957 + this.field7960 <= (long) this.field7952 + this.field7962) {
            var4 = this.field7960 + ((long) this.field7957);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class83.method686(this.field7961, (int) (var2 - this.field7962), this.field7971, (int) (var2 - this.field7960), var6);
        }
        this.field7952 = 0;
        this.field7962 = -1L;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method3304(boolean arg0) {
        if (!arg0) {
            this.method3308((byte) 5);
        }
        field7965++;
        return this.field7953.method2727((byte) -81);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public final void method3305(int arg0) throws IOException {
        field7974++;
        this.method3303(-101);
        this.field7953.method2729((byte) 101);
        if (arg0 != 2) {
            this.field7971 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[BI)V")
    public final void method3306(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 != -25944) {
            this.field7961 = null;
        }
        field7954++;
        try {
            if (this.field7964 < ((long) arg0 + this.field7972)) {
                this.field7964 = (long) arg0 + this.field7972;
            }
            if (this.field7962 != -1L && (this.field7972 < this.field7962 || ((long) this.field7952 + this.field7962) < this.field7972)) {
                this.method3303(-116);
            }
            if (this.field7962 != -1L && ((long) this.field7961.length + this.field7962) < ((long) arg0 + this.field7972)) {
                int var5 = (int) ((long) this.field7961.length + this.field7962 - this.field7972);
                class83.method686(arg2, arg1, this.field7961, (int) (this.field7972 - this.field7962), var5);
                arg1 += var5;
                arg0 -= var5;
                this.field7972 += var5;
                this.field7952 = this.field7961.length;
                this.method3303(-103);
            }
            if (arg0 > this.field7961.length) {
                if (this.field7972 != this.field7955) {
                    this.field7953.method2733(-108, this.field7972);
                    this.field7955 = this.field7972;
                }
                this.field7953.method2730(arg1, arg2, arg0, arg3 ^ 0x6557);
                this.field7955 += arg0;
                if (this.field7951 < this.field7955) {
                    this.field7951 = this.field7955;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field7972 >= this.field7960 && (long) this.field7957 + this.field7960 > this.field7972) {
                    var6 = this.field7972;
                } else if (this.field7960 >= this.field7972 && ((long) arg0 + this.field7972) > this.field7960) {
                    var6 = this.field7960;
                }
                if (this.field7960 < (long) arg0 + this.field7972 && (long) arg0 + this.field7972 <= (long) this.field7957 + this.field7960) {
                    var8 = (long) arg0 + this.field7972;
                } else if (((long) this.field7957 + this.field7960) > this.field7972 && (long) arg0 + this.field7972 >= (long) this.field7957 + this.field7960) {
                    var8 = (long) this.field7957 + this.field7960;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class83.method686(arg2, (int) ((long) arg1 + var6 - this.field7972), this.field7971, (int) (var6 - this.field7960), var10);
                }
                this.field7972 += arg0;
            } else if (arg0 > 0) {
                if (this.field7962 == -1L) {
                    this.field7962 = this.field7972;
                }
                class83.method686(arg2, arg1, this.field7961, (int) (this.field7972 - this.field7962), arg0);
                this.field7972 += arg0;
                if ((this.field7972 - this.field7962) > ((long) this.field7952)) {
                    this.field7952 = (int) (this.field7972 - this.field7962);
                }
            }
        } catch (IOException var12) {
            this.field7955 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method3307(byte arg0) {
        field7970 = null;
        if (arg0 != 47) {
            method3311((byte) -89, 88);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)J")
    public final long method3308(byte arg0) {
        field7973++;
        int var2 = -118 % ((44 - arg0) / 35);
        return this.field7964;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    private final void method3309(int arg0) throws IOException {
        this.field7957 = 0;
        field7958++;
        if (arg0 >= -44) {
            this.method3304(true);
        }
        if (this.field7972 != this.field7955) {
            this.field7953.method2733(88, this.field7972);
            this.field7955 = this.field7972;
        }
        this.field7960 = this.field7972;
        while (this.field7971.length > this.field7957) {
            int var2 = this.field7971.length - this.field7957;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7953.method2726(var2, this.field7957, (byte) -122, this.field7971);
            if (var3 == -1) {
                break;
            }
            this.field7957 += var3;
            this.field7955 += var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[BIB)V")
    public final void method3310(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field7966++;
        try {
            if ((arg0 + arg2) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg1.length);
            }
            if (this.field7962 != -1L && this.field7962 <= this.field7972 && (long) arg0 + this.field7972 <= (long) this.field7952 + this.field7962) {
                class83.method686(this.field7961, (int) (this.field7972 - this.field7962), arg1, arg2, arg0);
                this.field7972 += arg0;
                return;
            }
            int var5 = -1 % ((-arg3 - 1) / 51);
            long var6 = this.field7972;
            int var8 = arg2;
            int var9 = arg0;
            if (this.field7972 >= this.field7960 && ((long) this.field7957 + this.field7960) > this.field7972) {
                int var10 = (int) (this.field7960 + (long) this.field7957 - this.field7972);
                if (var10 > arg0) {
                    var10 = arg0;
                }
                class83.method686(this.field7971, (int) (this.field7972 - this.field7960), arg1, arg2, var10);
                arg0 -= var10;
                arg2 += var10;
                this.field7972 += var10;
            }
            if (this.field7971.length < arg0) {
                this.field7953.method2733(-116, this.field7972);
                this.field7955 = this.field7972;
                while (arg0 > 0) {
                    int var11 = this.field7953.method2726(arg0, arg2, (byte) -122, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field7955 += var11;
                    arg2 += var11;
                    this.field7972 += var11;
                    arg0 -= var11;
                }
            } else if (arg0 > 0) {
                this.method3309(-111);
                int var12 = arg0;
                if (this.field7957 < arg0) {
                    var12 = this.field7957;
                }
                class83.method686(this.field7971, 0, arg1, arg2, var12);
                this.field7972 += var12;
                arg2 += var12;
                arg0 -= var12;
            }
            if (this.field7962 != -1L) {
                if (this.field7972 < this.field7962 && arg0 > 0) {
                    int var13 = (int) (this.field7962 - this.field7972) + arg2;
                    if (var13 > arg0 + arg2) {
                        var13 = arg2 + arg0;
                    }
                    while (arg2 < var13) {
                        arg0--;
                        arg1[arg2++] = 0;
                        this.field7972++;
                    }
                }
                long var14 = -1L;
                if (var6 <= this.field7962 && this.field7962 < ((long) var9 + var6)) {
                    var14 = this.field7962;
                } else if (this.field7962 <= var6 && var6 < (long) this.field7952 + this.field7962) {
                    var14 = var6;
                }
                long var16 = -1L;
                if ((long) this.field7952 + this.field7962 > var6 && (this.field7962 + ((long) this.field7952)) <= ((long) var9 + var6)) {
                    var16 = this.field7962 + ((long) this.field7952);
                } else if ((var6 + ((long) var9)) > this.field7962 && ((long) this.field7952 + this.field7962) >= ((long) var9 + var6)) {
                    var16 = (long) var9 + var6;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class83.method686(this.field7961, (int) (var14 - this.field7962), arg1, (int) (var14 - var6) + var8, var18);
                    if (var16 > this.field7972) {
                        arg0 = (int) ((long) arg0 - (var16 - this.field7972));
                        this.field7972 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field7955 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
    public static final void method3311(byte arg0, int arg1) {
        class267.field3709 = new int[arg1];
        field7963++;
        if (arg0 < 17) {
            field7968 = -26;
        }
        class11.field206 = new int[arg1];
        class235.field3314 = new int[arg1];
        class405.field5463 = new int[arg1];
        class693.field9749 = new int[arg1];
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lbaa;II)V")
    public class600(class488 arg0, int arg1, int arg2) throws IOException {
        this.field7953 = arg0;
        this.field7964 = this.field7951 = arg0.method2732(122);
        this.field7972 = 0L;
        this.field7971 = new byte[arg1];
        this.field7961 = new byte[arg2];
    }
}
