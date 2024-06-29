import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class17 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field152 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "J")
    private long field151 = -1L;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "J")
    private long field170 = -1L;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lac;")
    private class216 field155;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "J")
    private long field154;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "J")
    private long field165;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[B")
    private byte[] field160;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "J")
    private long field158;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[B")
    private byte[] field150;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Z")
    public static boolean field153 = false;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "J")
    private long field156;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    private final void method76(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method84(-62);
        }
        if (this.field151 != -1L) {
            if (this.field156 != this.field151) {
                this.field155.method1271((byte) 85, this.field151);
                this.field156 = this.field151;
            }
            this.field155.method1275(this.field160, -13054, 0, this.field152);
            this.field156 += this.field152;
            if (this.field154 < this.field156) {
                this.field154 = this.field156;
            }
            long var2 = -1L;
            if (this.field151 >= this.field170 && ((long) this.field159 + this.field170) > this.field151) {
                var2 = this.field151;
            } else if (this.field151 <= this.field170 && (long) this.field152 + this.field151 > this.field170) {
                var2 = this.field170;
            }
            long var4 = -1L;
            if (this.field170 < this.field151 + ((long) this.field152) && (long) this.field152 + this.field151 <= (long) this.field159 + this.field170) {
                var4 = (long) this.field152 + this.field151;
            } else if (this.field151 < ((long) this.field159 + this.field170) && (long) this.field152 + this.field151 >= (long) this.field159 + this.field170) {
                var4 = (long) this.field159 + this.field170;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class245.method1646(this.field160, (int) (var2 - this.field151), this.field150, (int) (var2 - this.field170), var6);
            }
            this.field151 = -1L;
            this.field152 = 0;
        }
        field163++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    private final void method77(boolean arg0) throws IOException {
        field162++;
        if (arg0) {
            this.field156 = -96L;
        }
        this.field159 = 0;
        if (this.field158 != this.field156) {
            this.field155.method1271((byte) 85, this.field158);
            this.field156 = this.field158;
        }
        this.field170 = this.field158;
        while (this.field150.length > this.field159) {
            int var2 = this.field150.length - this.field159;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field155.method1268(this.field150, var2, this.field159, 31833);
            if (var3 == -1) {
                break;
            }
            this.field159 += var3;
            this.field156 += var3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BII)V")
    public final void method78(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field161++;
        try {
            if ((long) arg3 + this.field158 > this.field165) {
                this.field165 = (long) arg3 + this.field158;
            }
            int var5 = 1 / ((41 - arg0) / 57);
            if (this.field151 != -1L && (this.field151 > this.field158 || this.field158 > this.field151 + ((long) this.field152))) {
                this.method76(0);
            }
            if (this.field151 != -1L && ((long) arg3 + this.field158) > (this.field151 + ((long) this.field160.length))) {
                int var6 = (int) (this.field151 - (this.field158 - (long) this.field160.length));
                class245.method1646(arg1, arg2, this.field160, (int) (this.field158 - this.field151), var6);
                arg3 -= var6;
                arg2 += var6;
                this.field158 += var6;
                this.field152 = this.field160.length;
                this.method76(0);
            }
            if (arg3 > this.field160.length) {
                if (this.field158 != this.field156) {
                    this.field155.method1271((byte) 85, this.field158);
                    this.field156 = this.field158;
                }
                this.field155.method1275(arg1, -13054, arg2, arg3);
                this.field156 += arg3;
                if (this.field154 < this.field156) {
                    this.field154 = this.field156;
                }
                long var7 = -1L;
                if (this.field170 <= this.field158 && ((long) this.field159 + this.field170) > this.field158) {
                    var7 = this.field158;
                } else if (this.field170 >= this.field158 && this.field170 < (long) arg3 + this.field158) {
                    var7 = this.field170;
                }
                long var9 = -1L;
                if ((this.field158 + ((long) arg3)) > this.field170 && ((long) this.field159 + this.field170) >= (this.field158 + ((long) arg3))) {
                    var9 = this.field158 + ((long) arg3);
                } else if (this.field158 < this.field170 + ((long) this.field159) && ((long) this.field159 + this.field170) <= ((long) arg3 + this.field158)) {
                    var9 = (long) this.field159 + this.field170;
                }
                if (var7 > -1L && var7 < var9) {
                    int var11 = (int) (var9 - var7);
                    class245.method1646(arg1, (int) ((long) arg2 + var7 - this.field158), this.field150, (int) (var7 - this.field170), var11);
                }
                this.field158 += arg3;
            } else if (arg3 > 0) {
                if (this.field151 == -1L) {
                    this.field151 = this.field158;
                }
                class245.method1646(arg1, arg2, this.field160, (int) (this.field158 - this.field151), arg3);
                this.field158 += arg3;
                if (((long) this.field152) < (this.field158 - this.field151)) {
                    this.field152 = (int) (this.field158 - this.field151);
                }
            }
        } catch (IOException var13) {
            this.field156 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JB)V")
    public final void method79(long arg0, byte arg1) throws IOException {
        if (arg1 >= -127) {
            return;
        }
        field173++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method80(-100));
        }
        this.field158 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method80(int arg0) {
        field164++;
        int var2 = -36 / ((-arg0 - 7) / 44);
        return this.field155.method1269(59);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BZI)V")
    public final void method81(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field157++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field151 != -1L && this.field151 <= this.field158 && this.field158 + ((long) arg0) <= (long) this.field152 + this.field151) {
                class245.method1646(this.field160, (int) (this.field158 - this.field151), arg1, arg3, arg0);
                this.field158 += arg0;
                return;
            }
            long var5 = this.field158;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field158 >= this.field170 && this.field158 < ((long) this.field159 + this.field170)) {
                int var9 = (int) ((long) this.field159 + this.field170 - this.field158);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class245.method1646(this.field150, (int) (this.field158 - this.field170), arg1, arg3, var9);
                this.field158 += var9;
                arg0 -= var9;
                arg3 += var9;
            }
            if (arg0 > this.field150.length) {
                this.field155.method1271((byte) 85, this.field158);
                this.field156 = this.field158;
                while (arg0 > 0) {
                    int var11 = this.field155.method1268(arg1, arg0, arg3, 31833);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 += var11;
                    this.field156 += var11;
                    this.field158 += var11;
                    arg0 -= var11;
                }
            } else if (arg0 > 0) {
                this.method77(false);
                int var10 = arg0;
                if (this.field159 < arg0) {
                    var10 = this.field159;
                }
                class245.method1646(this.field150, 0, arg1, arg3, var10);
                arg0 -= var10;
                arg3 += var10;
                this.field158 += var10;
            }
            if (this.field151 != -1L) {
                if (this.field151 > this.field158 && arg0 > 0) {
                    int var12 = (int) (this.field151 - this.field158) + arg3;
                    if ((arg3 + arg0) < var12) {
                        var12 = arg3 + arg0;
                    }
                    while (arg3 < var12) {
                        arg1[arg3++] = 0;
                        arg0--;
                        this.field158++;
                    }
                }
                long var13 = -1L;
                if (this.field151 >= var5 && this.field151 < ((long) var8 + var5)) {
                    var13 = this.field151;
                } else if (var5 >= this.field151 && var5 < (this.field151 + ((long) this.field152))) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field152 + this.field151 && (var5 + ((long) var8)) >= (this.field151 + ((long) this.field152))) {
                    var15 = (long) this.field152 + this.field151;
                } else if (this.field151 < ((long) var8 + var5) && (long) this.field152 + this.field151 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class245.method1646(this.field160, (int) (var13 - this.field151), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field158) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field158));
                        this.field158 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field156 = -1L;
            throw var19;
        }
        if (arg2) {
            method82((byte) -86);
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method82(byte arg0) {
        class34.field447.method3239(true);
        field169++;
        class228.field3059.method1909(1);
        class145.field2041.method2590(256);
        class20.field192.method712(0);
        class525.field7291.method145((byte) -70);
        class291.field4179.method1307((byte) 104);
        class607.field8188.method2995((byte) -93);
        class129.field1776.method4069(12288);
        class601.field8138.method1903(false);
        class131.field1846.method522(false);
        class464.field6461.method553((byte) -94);
        int var1 = 95 / ((69 - arg0) / 46);
        class71.field1078.method3005(34);
        class700.field9771.method6(6);
        class248.field3649.method3637(false);
        class360.field5161.method2283((byte) -70);
        class463.field6453.method3334(-1);
        class560.field7796.method1005((byte) 13);
        class95.field1312.method1220(true);
        class481.field6713.method2288(2);
        class664.field8919.method3535((byte) -46);
        class594.field8074.method3060((byte) 73);
        class3.method14((byte) -109);
        class100.method671(false);
        class676.method3809((byte) -124);
        class6.method27(-9150);
        class544.method3217((byte) -112);
        class84.field1194.method3902(0);
        class697.field9697.method3902(0);
        class319.field4442.method3902(0);
        class117.field1551.method3902(0);
        class546.field7592.method3902(0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([BI)V")
    public final void method83(byte[] arg0, int arg1) throws IOException {
        if (arg1 >= 97) {
            field166++;
            this.method81(arg0.length, arg0, false, 0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)J")
    public final long method84(int arg0) {
        if (arg0 != -1) {
            this.field160 = null;
        }
        field168++;
        return this.field165;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public final void method85(byte arg0) throws IOException {
        this.method76(arg0 ^ 0x77);
        field167++;
        this.field155.method1273(64);
        if (arg0 != 119) {
            this.field170 = 59L;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lac;II)V")
    public class17(class216 arg0, int arg1, int arg2) throws IOException {
        this.field155 = arg0;
        this.field165 = this.field154 = arg0.method1274(112);
        this.field160 = new byte[arg2];
        this.field158 = 0L;
        this.field150 = new byte[arg1];
    }
}
