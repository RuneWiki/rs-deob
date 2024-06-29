import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class503 {

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "J")
    private long field7182 = -1L;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "J")
    private long field7193 = -1L;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    private int field7177 = 0;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "Lbt;")
    private class42 field7192;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "J")
    private long field7191;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "J")
    private long field7189;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "[B")
    private byte[] field7176;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "[B")
    private byte[] field7195;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "J")
    private long field7179;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "J")
    public static long field7197 = -1L;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    private int field7198;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "J")
    private long field7184;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)J")
    public final long method3015(int arg0) {
        if (arg0 == 25411) {
            field7183++;
            return this.field7189;
        } else {
            return -102L;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method3016(int arg0) {
        field7199++;
        if (arg0 >= -29) {
            this.field7193 = 14L;
        }
        return this.field7192.method388(37);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public final void method3017(byte arg0) throws IOException {
        this.method3025((byte) 3);
        field7186++;
        this.field7192.method389(31);
        if (arg0 != 4) {
            method3022(null, 107);
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
    private final void method3018(int arg0) throws IOException {
        this.field7198 = 0;
        field7185++;
        if (arg0 != 21826) {
            this.field7192 = null;
        }
        if (this.field7184 != this.field7179) {
            this.field7192.method384(52, this.field7179);
            this.field7184 = this.field7179;
        }
        this.field7182 = this.field7179;
        while (this.field7198 < this.field7195.length) {
            int var2 = this.field7195.length - this.field7198;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7192.method383(var2, this.field7198, this.field7195, 1);
            if (var3 == -1) {
                break;
            }
            this.field7198 += var3;
            this.field7184 += var3;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(JI)V")
    public final void method3019(long arg0, int arg1) throws IOException {
        if (arg1 <= 116) {
            method3022(null, -40);
        }
        field7187++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3016(-71));
        }
        this.field7179 = arg0;
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)V")
    public static final void method3020(int arg0) {
        if (class611.field8839 == 9) {
            class19.method122(1, 5);
        } else if (class611.field8839 == 5 || class611.field8839 == 6) {
            class19.method122(arg0 ^ 0x7, 3);
        } else if (class611.field8839 == 12) {
            class19.method122(1, 3);
        }
        field7194++;
        if (arg0 != 6) {
            method3022(null, 26);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([BB)V")
    public final void method3021(byte[] arg0, byte arg1) throws IOException {
        if (arg1 != -50) {
            this.field7192 = null;
        }
        this.method3024(arg0.length, 0, arg0, (byte) 126);
        field7190++;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lha;I)V")
    public static final void method3022(class58 arg0, int arg1) {
        field7181++;
        int var2 = 0;
        int var3 = 0;
        if (class200.field2876) {
            var2 = class228.method1570((byte) 73);
            var3 = class252.method1712((byte) 37);
        }
        int var4 = -10660793;
        if (arg1 != -29092) {
            return;
        }
        class52.method468(class681.field9590, class380.field5300, class321.field4557 + var3, arg0, -16777216, -123, var4, class396.field5544 + var2);
        class537.field7568.method665(class321.field4557 + var3 + 14, class281.field3965.method1839((byte) 45, class744.field10426), -1, class396.field5544 + var2 + 3, -16777216, var4);
        int var5 = var2 + class422.field5917.method1597(123);
        int var6 = class422.field5917.method1592(true) + var3;
        if (class653.field9200) {
            int var7 = 0;
            for (class241 var8 = (class241) class211.field3046.method1196(-128); var8 != null; var8 = (class241) class211.field3046.method1204(false)) {
                int var12 = var7 * 16 + var3 + class321.field4557 + 31;
                var7++;
                if (var8.field3382 == 1) {
                    class606.method3505(arg1 + 29186, -256, class321.field4557 + var3, arg0, class681.field9590, class380.field5300, -1, var6, (class66) var8.field3388.field2357.field3201, var5, class396.field5544 + var2, var12);
                } else {
                    class13.method71(class380.field5300, var12, class396.field5544 + var2, var5, arg0, var6, class321.field4557 + var3, class681.field9590, var8, -1, -256, (byte) 117);
                }
            }
            if (class316.field4485 != null) {
                class52.method468(class610.field8829, class167.field2468, class114.field1826, arg0, -16777216, 57, var4, class138.field2148);
                class537.field7568.method665(class114.field1826 + 14, class316.field4485.field3386, -1, class138.field2148 + 3, -16777216, var4);
                int var9 = 0;
                for (class66 var10 = (class66) class316.field4485.field3388.method1196(-125); var10 != null; var10 = (class66) class316.field4485.field3388.method1204(false)) {
                    int var11 = class114.field1826 + (var9 * 16) + 31;
                    var9++;
                    class606.method3505(-88, -256, class114.field1826, arg0, class610.field8829, class167.field2468, -1, var6, var10, var5, class138.field2148, var11);
                }
                class162.method1212(class610.field8829, class167.field2468, class114.field1826, class138.field2148, 0);
            }
        } else {
            int var13 = 0;
            for (class66 var14 = (class66) class288.field4066.method1522(true); var14 != null; var14 = (class66) class288.field4066.method1527((byte) 121)) {
                int var15 = (class409.field5682 - var13 - 1) * 16 + class321.field4557 + var3 + 31;
                var13++;
                class606.method3505(113, -256, class321.field4557 + var3, arg0, class681.field9590, class380.field5300, -1, var6, var14, var5, class396.field5544 + var2, var15);
            }
        }
        class162.method1212(class681.field9590, class380.field5300, class321.field4557 + var3, class396.field5544 + var2, 0);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[B)V")
    public final void method3023(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7180++;
        try {
            if (arg1 <= 21) {
                this.method3015(3);
            }
            if (((long) arg2 + this.field7179) > this.field7189) {
                this.field7189 = this.field7179 + ((long) arg2);
            }
            if (this.field7193 != -1L && (this.field7179 < this.field7193 || this.field7179 > (long) this.field7177 + this.field7193)) {
                this.method3025((byte) 3);
            }
            if (this.field7193 != -1L && ((long) arg2 + this.field7179) > ((long) this.field7176.length + this.field7193)) {
                int var5 = (int) (this.field7193 - (this.field7179 - (long) this.field7176.length));
                class622.method3597(arg3, arg0, this.field7176, (int) (this.field7179 - this.field7193), var5);
                arg2 -= var5;
                arg0 += var5;
                this.field7179 += var5;
                this.field7177 = this.field7176.length;
                this.method3025((byte) 3);
            }
            if (arg2 > this.field7176.length) {
                if (this.field7184 != this.field7179) {
                    this.field7192.method384(-102, this.field7179);
                    this.field7184 = this.field7179;
                }
                this.field7192.method385(arg0, 1, arg3, arg2);
                this.field7184 += arg2;
                if (this.field7191 < this.field7184) {
                    this.field7191 = this.field7184;
                }
                long var6 = -1L;
                if (this.field7182 <= this.field7179 && ((long) this.field7198 + this.field7182) > this.field7179) {
                    var6 = this.field7179;
                } else if (this.field7182 >= this.field7179 && this.field7182 < (long) arg2 + this.field7179) {
                    var6 = this.field7182;
                }
                long var8 = -1L;
                if ((long) arg2 + this.field7179 > this.field7182 && ((long) this.field7198 + this.field7182) >= (this.field7179 + ((long) arg2))) {
                    var8 = this.field7179 + ((long) arg2);
                } else if (((long) this.field7198 + this.field7182) > this.field7179 && (long) this.field7198 + this.field7182 <= (long) arg2 + this.field7179) {
                    var8 = (long) this.field7198 + this.field7182;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class622.method3597(arg3, (int) ((long) arg0 + var6 - this.field7179), this.field7195, (int) (var6 - this.field7182), var10);
                }
                this.field7179 += arg2;
            } else if (arg2 > 0) {
                if (this.field7193 == -1L) {
                    this.field7193 = this.field7179;
                }
                class622.method3597(arg3, arg0, this.field7176, (int) (this.field7179 - this.field7193), arg2);
                this.field7179 += arg2;
                if ((long) this.field7177 < this.field7179 - this.field7193) {
                    this.field7177 = (int) (this.field7179 - this.field7193);
                }
            }
        } catch (IOException var12) {
            this.field7184 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[BB)V")
    public final void method3024(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field7178++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field7193 != -1L && this.field7193 <= this.field7179 && ((long) this.field7177 + this.field7193) >= ((long) arg0 + this.field7179)) {
                class622.method3597(this.field7176, (int) (this.field7179 - this.field7193), arg2, arg1, arg0);
                this.field7179 += arg0;
                return;
            }
            if (arg3 <= 121) {
                this.field7195 = null;
            }
            long var5 = this.field7179;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field7182 <= this.field7179 && this.field7182 + ((long) this.field7198) > this.field7179) {
                int var9 = (int) (this.field7182 + (long) this.field7198 - this.field7179);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class622.method3597(this.field7195, (int) (this.field7179 - this.field7182), arg2, arg1, var9);
                arg0 -= var9;
                arg1 += var9;
                this.field7179 += var9;
            }
            if (arg0 > this.field7195.length) {
                this.field7192.method384(-116, this.field7179);
                this.field7184 = this.field7179;
                while (arg0 > 0) {
                    int var10 = this.field7192.method383(arg0, arg1, arg2, 1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field7179 += var10;
                    arg1 += var10;
                    arg0 -= var10;
                    this.field7184 += var10;
                }
            } else if (arg0 > 0) {
                this.method3018(21826);
                int var11 = arg0;
                if (arg0 > this.field7198) {
                    var11 = this.field7198;
                }
                class622.method3597(this.field7195, 0, arg2, arg1, var11);
                this.field7179 += var11;
                arg1 += var11;
                arg0 -= var11;
            }
            if (this.field7193 != -1L) {
                if (this.field7179 < this.field7193 && arg0 > 0) {
                    int var12 = (int) (this.field7193 - this.field7179) + arg1;
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg1 + arg0;
                    }
                    while (var12 > arg1) {
                        arg0--;
                        arg2[arg1++] = 0;
                        this.field7179++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field7193 >= var5 && (long) var8 + var5 > this.field7193) {
                    var13 = this.field7193;
                } else if (this.field7193 <= var5 && var5 < (long) this.field7177 + this.field7193) {
                    var13 = var5;
                }
                if (((long) this.field7177 + this.field7193) > var5 && (long) var8 + var5 >= this.field7193 - -((long) this.field7177)) {
                    var15 = (long) this.field7177 + this.field7193;
                } else if (this.field7193 < (long) var8 + var5 && ((long) this.field7177 + this.field7193) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class622.method3597(this.field7176, (int) (var13 - this.field7193), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field7179) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field7179));
                        this.field7179 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7184 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
    private final void method3025(byte arg0) throws IOException {
        if (this.field7193 != -1L) {
            if (this.field7193 != this.field7184) {
                this.field7192.method384(arg0 - 80, this.field7193);
                this.field7184 = this.field7193;
            }
            this.field7192.method385(0, arg0 - 2, this.field7176, this.field7177);
            this.field7184 += this.field7177;
            if (this.field7184 > this.field7191) {
                this.field7191 = this.field7184;
            }
            long var2 = -1L;
            if (this.field7182 <= this.field7193 && (this.field7182 + ((long) this.field7198)) > this.field7193) {
                var2 = this.field7193;
            } else if (this.field7182 >= this.field7193 && this.field7182 < ((long) this.field7177 + this.field7193)) {
                var2 = this.field7182;
            }
            long var4 = -1L;
            if (this.field7182 < ((long) this.field7177 + this.field7193) && ((long) this.field7177 + this.field7193) <= ((long) this.field7198 + this.field7182)) {
                var4 = (long) this.field7177 + this.field7193;
            } else if (this.field7193 < this.field7182 + ((long) this.field7198) && (this.field7193 + ((long) this.field7177)) >= ((long) this.field7198 + this.field7182)) {
                var4 = (long) this.field7198 + this.field7182;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class622.method3597(this.field7176, (int) (var2 - this.field7193), this.field7195, (int) (var2 - this.field7182), var6);
            }
            this.field7193 = -1L;
            this.field7177 = 0;
        }
        field7196++;
        if (arg0 != 3) {
            this.field7177 = -16;
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lbt;II)V")
    public class503(class42 arg0, int arg1, int arg2) throws IOException {
        this.field7192 = arg0;
        this.field7189 = this.field7191 = arg0.method386((byte) 99);
        this.field7176 = new byte[arg2];
        this.field7195 = new byte[arg1];
        this.field7179 = 0L;
    }
}
