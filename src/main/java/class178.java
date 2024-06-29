import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class178 {

    @OriginalMember(owner = "client!js", name = "m", descriptor = "J")
    private long field2698 = -1L;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    private int field2699 = 0;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "J")
    private long field2688 = -1L;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "Lbt;")
    private class324 field2703;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "J")
    private long field2689;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "J")
    private long field2708;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "J")
    private long field2695;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "[B")
    private byte[] field2704;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "[B")
    private byte[] field2712;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "[I")
    public static int[] field2686 = new int[32];

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2690 = 0;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "Z")
    public static boolean field2709 = false;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "Lcf;")
    public static class92 field2707 = new class92();

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "J")
    private long field2711;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)J")
    public final long method1274(int arg0) {
        int var2 = -71 / ((56 - arg0) / 39);
        field2706++;
        return this.field2708;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZZIILqp;I)V")
    public static final void method1275(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, class303 arg5, int arg6) {
        field2691++;
        if (class172.field2628 >= 50 || arg5 == null || arg5.field4292 == null || arg5.field4292.length <= arg0 || arg5.field4292[arg0] == null) {
            return;
        }
        int var7 = arg5.field4292[arg0][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        if (arg5.field4292[arg0].length > 1) {
            int var10 = (int) ((double) arg5.field4292[arg0].length * Math.random());
            if (var10 > 0) {
                var8 = arg5.field4292[arg0][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg1) {
                class61.method555(var8, 0, -114, var9, 255);
            }
        } else if (class339.field4687 != 0) {
            class191.field2863[class172.field2628] = var8;
            class261.field3746[class172.field2628] = var9;
            class377.field5194[class172.field2628] = 0;
            class126.field1717[class172.field2628] = null;
            if (arg2) {
                field2707 = null;
            }
            class131.field1805[class172.field2628] = 255;
            int var12 = (arg4 - 64) / 128;
            int var13 = (arg6 - 64) / 128;
            class128.field1758[class172.field2628] = (arg3 << 24) + (var12 << 16) + (var13 << 8) + var11;
            class172.field2628++;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    private final void method1276(byte arg0) throws IOException {
        field2696++;
        this.field2705 = 0;
        if (this.field2711 != this.field2695) {
            this.field2703.method2048((byte) 91, this.field2695);
            this.field2711 = this.field2695;
        }
        this.field2688 = this.field2695;
        if (arg0 >= -3) {
            method1278((byte) 6);
        }
        while (this.field2704.length > this.field2705) {
            int var2 = this.field2704.length - this.field2705;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2703.method2047(0, var2, this.field2704, this.field2705);
            if (var3 == -1) {
                break;
            }
            this.field2705 += var3;
            this.field2711 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public static final void method1277(boolean arg0) {
        field2687++;
        class320.field4512++;
        class336.method2111(class202.field2991, 110);
        class311.field4403.method1180((byte) -110, class448.method2708(0));
        class311.field4403.method1173(class364.field5007, (byte) 125);
        class311.field4403.method1173(class431.field6099, (byte) 122);
        if (arg0) {
            method1278((byte) -70);
        }
        class311.field4403.method1180((byte) -110, class227.field3260);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
    public static void method1278(byte arg0) {
        field2707 = null;
        if (arg0 <= 41) {
            field2709 = false;
        }
        field2686 = null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)Ljava/io/File;")
    private final File method1279(boolean arg0) {
        field2693++;
        if (arg0) {
            this.field2704 = null;
        }
        return this.field2703.method2046(false);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([BZ)V")
    public final void method1280(byte[] arg0, boolean arg1) throws IOException {
        if (arg1) {
            field2700++;
            this.method1282(arg0.length, 0, arg0, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III[B)V")
    public final void method1281(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2692++;
        try {
            if (arg0 < -48) {
                if (((long) arg2 + this.field2695) > this.field2708) {
                    this.field2708 = (long) arg2 + this.field2695;
                }
                if (this.field2698 != -1L && (this.field2698 > this.field2695 || ((long) this.field2699 + this.field2698) < this.field2695)) {
                    this.method1283(97);
                }
                if (this.field2698 != -1L && (long) this.field2712.length + this.field2698 < (long) arg2 + this.field2695) {
                    int var5 = (int) ((long) this.field2712.length + this.field2698 - this.field2695);
                    class214.method1449(arg3, arg1, this.field2712, (int) (this.field2695 - this.field2698), var5);
                    arg2 -= var5;
                    this.field2695 += (long) var5;
                    arg1 += var5;
                    this.field2699 = this.field2712.length;
                    this.method1283(123);
                }
                if (this.field2712.length < arg2) {
                    if (this.field2711 != this.field2695) {
                        this.field2703.method2048((byte) 91, this.field2695);
                        this.field2711 = this.field2695;
                    }
                    this.field2703.method2044(arg3, 104, arg2, arg1);
                    this.field2711 += (long) arg2;
                    if (this.field2689 < this.field2711) {
                        this.field2689 = this.field2711;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field2688 <= this.field2695 && this.field2695 < (long) this.field2705 + this.field2688) {
                        var6 = this.field2695;
                    } else if (this.field2695 <= this.field2688 && ((long) arg2 + this.field2695) > this.field2688) {
                        var6 = this.field2688;
                    }
                    if (this.field2688 < (long) arg2 + this.field2695 && (long) this.field2705 + this.field2688 >= (long) arg2 + this.field2695) {
                        var8 = (long) arg2 + this.field2695;
                    } else if ((long) this.field2705 + this.field2688 > this.field2695 && (long) this.field2705 + this.field2688 <= (long) arg2 + this.field2695) {
                        var8 = (long) this.field2705 + this.field2688;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class214.method1449(arg3, (int) ((long) arg1 + var6 - this.field2695), this.field2704, (int) (var6 - this.field2688), var10);
                    }
                    this.field2695 += (long) arg2;
                } else if (arg2 > 0) {
                    if (this.field2698 == -1L) {
                        this.field2698 = this.field2695;
                    }
                    class214.method1449(arg3, arg1, this.field2712, (int) (this.field2695 - this.field2698), arg2);
                    this.field2695 += (long) arg2;
                    if ((this.field2695 - this.field2698) > ((long) this.field2699)) {
                        this.field2699 = (int) (this.field2695 - this.field2698);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2711 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II[BB)V")
    public final void method1282(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field2694++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field2698 != -1L && this.field2698 <= this.field2695 && (long) arg0 + this.field2695 <= (long) this.field2699 + this.field2698) {
                class214.method1449(this.field2712, (int) (this.field2695 - this.field2698), arg2, arg1, arg0);
                this.field2695 += (long) arg0;
                return;
            }
            long var5 = this.field2695;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field2688 <= this.field2695 && this.field2695 < (long) this.field2705 + this.field2688) {
                int var9 = (int) ((long) this.field2705 + this.field2688 - this.field2695);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class214.method1449(this.field2704, (int) (this.field2695 - this.field2688), arg2, arg1, var9);
                arg0 -= var9;
                this.field2695 += (long) var9;
                arg1 += var9;
            }
            if (arg0 > this.field2704.length) {
                this.field2703.method2048((byte) 91, this.field2695);
                this.field2711 = this.field2695;
                while (arg0 > 0) {
                    int var11 = this.field2703.method2047(0, arg0, arg2, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 -= var11;
                    this.field2711 += (long) var11;
                    arg1 += var11;
                    this.field2695 += (long) var11;
                }
            } else if (arg0 > 0) {
                this.method1276((byte) -66);
                int var10 = arg0;
                if (this.field2705 < arg0) {
                    var10 = this.field2705;
                }
                class214.method1449(this.field2704, 0, arg2, arg1, var10);
                this.field2695 += (long) var10;
                arg0 -= var10;
                arg1 += var10;
            }
            if (this.field2698 != -1L) {
                if (this.field2695 < this.field2698 && arg0 > 0) {
                    int var12 = arg1 + ((int) (this.field2698 - this.field2695));
                    if (arg0 + arg1 < var12) {
                        var12 = arg1 + arg0;
                    }
                    while (var12 > arg1) {
                        arg2[arg1++] = 0;
                        arg0--;
                        this.field2695++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field2698 && ((long) var8 + var5) > this.field2698) {
                    var13 = this.field2698;
                } else if (this.field2698 <= var5 && var5 < (long) this.field2699 + this.field2698) {
                    var13 = var5;
                }
                if (var5 < (long) this.field2699 + this.field2698 && ((long) this.field2699 + this.field2698) <= ((long) var8 + var5)) {
                    var15 = (long) this.field2699 + this.field2698;
                } else if ((long) var8 + var5 > this.field2698 && (long) this.field2699 + this.field2698 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class214.method1449(this.field2712, (int) (var13 - this.field2698), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (this.field2695 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2695));
                        this.field2695 = var15;
                    }
                }
            }
            if (arg3 >= -20) {
                this.method1279(false);
            }
        } catch (IOException var19) {
            this.field2711 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    private final void method1283(int arg0) throws IOException {
        if (arg0 <= 28) {
            this.field2699 = 107;
        }
        if (this.field2698 != -1L) {
            if (this.field2711 != this.field2698) {
                this.field2703.method2048((byte) 91, this.field2698);
                this.field2711 = this.field2698;
            }
            this.field2703.method2044(this.field2712, 14, this.field2699, 0);
            this.field2711 += (long) this.field2699;
            if (this.field2711 > this.field2689) {
                this.field2689 = this.field2711;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2698 >= this.field2688 && ((long) this.field2705 + this.field2688) > this.field2698) {
                var2 = this.field2698;
            } else if (this.field2688 >= this.field2698 && this.field2688 < this.field2698 + ((long) this.field2699)) {
                var2 = this.field2688;
            }
            if (((long) this.field2699 + this.field2698) > this.field2688 && (this.field2698 + ((long) this.field2699)) <= ((long) this.field2705 + this.field2688)) {
                var4 = this.field2698 + ((long) this.field2699);
            } else if (this.field2698 < ((long) this.field2705 + this.field2688) && (long) this.field2705 + this.field2688 <= (long) this.field2699 + this.field2698) {
                var4 = this.field2688 + ((long) this.field2705);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class214.method1449(this.field2712, (int) (var2 - this.field2698), this.field2704, (int) (var2 - this.field2688), var6);
            }
            this.field2699 = 0;
            this.field2698 = -1L;
        }
        field2702++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZJ)V")
    public final void method1284(boolean arg0, long arg1) throws IOException {
        field2710++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1279(false));
        } else if (!arg0) {
            this.field2695 = arg1;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
    public static final void method1285(int arg0, int arg1) {
        field2701++;
        int var2 = -49 / ((46 - arg0) / 48);
        class334 var3 = class352.method2172(arg1, 12, 16711935);
        var3.method2099(true);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbt;II)V")
    public class178(class324 arg0, int arg1, int arg2) throws IOException {
        this.field2703 = arg0;
        this.field2708 = this.field2689 = arg0.method2045(124);
        this.field2695 = 0L;
        this.field2704 = new byte[arg1];
        this.field2712 = new byte[arg2];
    }
}
