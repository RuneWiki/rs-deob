import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class485 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lpm;")
    private class131 field6731 = null;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Lpm;")
    private class131 field6738 = null;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    private int field6734 = 65000;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    private int field6742;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field6740 = -1;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "[I")
    public static int[] field6735 = new int[4];

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "J")
    public static long field6739;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
    public static final int method2785(byte arg0) {
        field6741++;
        class562 var1 = class146.field1963;
        boolean var2 = false;
        if (class618.field8566 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class562.method3128(0, -21939, var3, null, 0, null);
        }
        long var4 = class529.method2982((byte) -69);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1070(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class529.method2982((byte) -69) - var4);
        if (arg0 < 19) {
            field6739 = 12L;
        }
        var1.method3118(true, 100, 0, 0, 100, -16777216);
        if (var2) {
            var1.method3127(true);
        }
        return var7;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[B)Z")
    public final boolean method2786(int arg0, int arg1, int arg2, byte[] arg3) {
        field6736++;
        class131 var5 = this.field6738;
        synchronized (this.field6738) {
            if (arg2 < 17) {
                this.field6734 = 10;
            }
            if (arg0 < 0 || this.field6734 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2788(-121, arg3, arg0, arg1, true);
            if (!var6) {
                var6 = this.method2788(-123, arg3, arg0, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILjava/net/Socket;)Lgs;")
    public static final class576 method2787(int arg0, int arg1, Socket arg2) throws IOException {
        if (arg0 <= 98) {
            return null;
        } else {
            field6743++;
            return new class171(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BIIZ)Z")
    private final boolean method2788(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field6732++;
        class131 var6 = this.field6738;
        synchronized (this.field6738) {
            try {
                int var8;
                if (arg4) {
                    if (this.field6731.method772((byte) 14) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field6731.method771(0, (long) (arg3 * 6));
                    this.field6731.method766(88, class275.field3661, 6, 0);
                    var8 = (class275.field3661[5] & 0xFF) + ((class275.field3661[4] & 0xFF) << 8) + (class275.field3661[3] & 0xFF << 16);
                    if (var8 <= 0 || (this.field6738.method772((byte) 43) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field6738.method772((byte) 85) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class275.field3661[4] = (byte) (var8 >> 8);
                class275.field3661[5] = (byte) var8;
                class275.field3661[0] = (byte) (arg2 >> 16);
                if (arg0 > -117) {
                    return true;
                }
                class275.field3661[1] = (byte) (arg2 >> 8);
                class275.field3661[2] = (byte) arg2;
                class275.field3661[3] = (byte) (var8 >> 16);
                this.field6731.method771(0, (long) (arg3 * 6));
                this.field6731.method769(0, 6, -105, class275.field3661);
                int var11 = 0;
                int var12 = 0;
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field6738.method771(0, (long) (var8 * 520));
                            try {
                                this.field6738.method766(120, class275.field3661, 8, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class275.field3661[0] & 0xFF) << 8) + (class275.field3661[1] & 0xFF);
                            var13 = (class275.field3661[6] & 0xFF) + ((class275.field3661[5] & 0xFF) << 8) + ((class275.field3661[4] & 0xFF) << 16);
                            int var15 = (class275.field3661[2] & 0xFF << 8) + (class275.field3661[3] & 0xFF);
                            int var16 = class275.field3661[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field6742 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field6738.method772((byte) -119) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field6738.method772((byte) 25) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class275.field3661[2] = (byte) (var12 >> 8);
                    class275.field3661[1] = (byte) arg3;
                    class275.field3661[0] = (byte) (arg3 >> 8);
                    class275.field3661[3] = (byte) var12;
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    class275.field3661[5] = (byte) (var13 >> 8);
                    class275.field3661[4] = (byte) (var13 >> 16);
                    class275.field3661[6] = (byte) var13;
                    class275.field3661[7] = (byte) this.field6742;
                    this.field6738.method771(0, (long) (var8 * 520));
                    this.field6738.method769(0, 8, -71, class275.field3661);
                    int var19 = arg2 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field6738.method769(var11, var19, -100, arg1);
                    var8 = var13;
                    var11 += var19;
                    var12++;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6733++;
        return "Cache:" + this.field6742;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public static void method2789(byte arg0) {
        field6735 = null;
        if (arg0 < 39) {
            method2789((byte) -37);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)[B")
    public final byte[] method2790(byte arg0, int arg1) {
        field6737++;
        class131 var3 = this.field6738;
        synchronized (this.field6738) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field6731.method772((byte) 64)) {
                    return null;
                }
                this.field6731.method771(0, (long) (arg1 * 6));
                this.field6731.method766(112, class275.field3661, 6, 0);
                if (arg0 > -14) {
                    return null;
                }
                int var6 = (class275.field3661[2] & 0xFF) + (class275.field3661[1] & 0xFF << 8) + (class275.field3661[0] & 0xFF << 16);
                int var7 = ((class275.field3661[3] & 0xFF) << 16) + ((class275.field3661[4] & 0xFF) << 8) + (class275.field3661[5] & 0xFF);
                if (var6 < 0 || var6 > this.field6734) {
                    return null;
                } else if (var7 > 0 && ((long) var7) <= (this.field6738.method772((byte) -119) / 520L)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var11) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field6738.method771(0, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field6738.method766(81, class275.field3661, var14 + 8, 0);
                        int var15 = (class275.field3661[0] & 0xFF << 8) + (class275.field3661[1] & 0xFF);
                        int var16 = (class275.field3661[2] & 0xFF << 8) + (class275.field3661[3] & 0xFF);
                        int var17 = (class275.field3661[5] & 0xFF << 8) + (class275.field3661[4] & 0xFF << 16) + (class275.field3661[6] & 0xFF);
                        int var18 = class275.field3661[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field6742 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field6738.method772((byte) 55) / 520L)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class275.field3661[var21 + 8];
                                }
                                var7 = var17;
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILpm;Lpm;I)V")
    public class485(int arg0, class131 arg1, class131 arg2, int arg3) {
        this.field6734 = arg3;
        this.field6731 = arg2;
        this.field6738 = arg1;
        this.field6742 = arg0;
    }
}
