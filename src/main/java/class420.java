import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class420 {

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    private int field6098 = 65000;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "Lsb;")
    private class193 field6103 = null;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Lsb;")
    private class193 field6093 = null;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field6099 = 0;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "Z")
    public static boolean field6104 = false;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lsd;")
    public static class63 field6096 = new class63(1, 2, 2, 0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[J")
    public static long[] field6095;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2594(int arg0) {
        field6094++;
        if (arg0 != 6) {
            field6096 = null;
        }
        class509 var1 = class528.field7748;
        synchronized (class528.field7748) {
            class528.field7748.method3045(arg0 + 42);
        }
        class509 var2 = class415.field5946;
        synchronized (class415.field5946) {
            class415.field5946.method3045(48);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[BII)Z", line = 24)
    public final boolean method2595(int arg0, byte[] arg1, int arg2, int arg3) {
        field6101++;
        if (arg3 <= 69) {
            field6095 = null;
        }
        class193 var5 = this.field6093;
        synchronized (this.field6093) {
            if (arg2 < 0 || this.field6098 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2596(arg2, (byte) 95, arg1, arg0, true);
            if (!var6) {
                var6 = this.method2596(arg2, (byte) 109, arg1, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB[BIZ)Z", line = 53)
    private final boolean method2596(int arg0, byte arg1, byte[] arg2, int arg3, boolean arg4) {
        field6092++;
        class193 var6 = this.field6093;
        synchronized (this.field6093) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg3 * 6 + 6) > this.field6103.method1099(1)) {
                        return false;
                    }
                    this.field6103.method1094(-81, (long) (arg3 * 6));
                    this.field6103.method1095(class523.field7690, 6, (byte) 28, 0);
                    var8 = (class523.field7690[5] & 0xFF) + (class523.field7690[4] & 0xFF << 8) + (class523.field7690[3] & 0xFF << 16);
                    if (var8 <= 0 || (this.field6093.method1099(1) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field6093.method1099(1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class523.field7690[5] = (byte) var8;
                class523.field7690[1] = (byte) (arg0 >> 8);
                class523.field7690[0] = (byte) (arg0 >> 16);
                class523.field7690[3] = (byte) (var8 >> 16);
                class523.field7690[4] = (byte) (var8 >> 8);
                class523.field7690[2] = (byte) arg0;
                this.field6103.method1094(82, (long) (arg3 * 6));
                this.field6103.method1105(false, 6, class523.field7690, 0);
                if (arg1 < 92) {
                    field6096 = null;
                }
                int var10 = 0;
                int var11 = 0;
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field6093.method1094(71, (long) (var8 * 520));
                            try {
                                this.field6093.method1095(class523.field7690, 8, (byte) 28, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class523.field7690[0] & 0xFF << 8) + (class523.field7690[1] & 0xFF);
                            int var14 = ((class523.field7690[2] & 0xFF) << 8) + (class523.field7690[3] & 0xFF);
                            var12 = ((class523.field7690[4] & 0xFF) << 16) + (class523.field7690[5] & 0xFF << 8) + (class523.field7690[6] & 0xFF);
                            int var15 = class523.field7690[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field6100 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field6093.method1099(1) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field6093.method1099(1) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class523.field7690[1] = (byte) arg3;
                    class523.field7690[2] = (byte) (var11 >> 8);
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class523.field7690[3] = (byte) var11;
                    class523.field7690[0] = (byte) (arg3 >> 8);
                    class523.field7690[7] = (byte) this.field6100;
                    class523.field7690[4] = (byte) (var12 >> 16);
                    class523.field7690[6] = (byte) var12;
                    class523.field7690[5] = (byte) (var12 >> 8);
                    this.field6093.method1094(77, (long) (var8 * 520));
                    this.field6093.method1105(false, 8, class523.field7690, 0);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field6093.method1105(false, var18, arg2, var10);
                    var8 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 179)
    public static void method2597(int arg0) {
        field6095 = null;
        int var1 = 66 / ((arg0 + 15) / 42);
        field6096 = null;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(ILsb;Lsb;I)V", line = 292)
    public class420(int arg0, class193 arg1, class193 arg2, int arg3) {
        this.field6093 = arg1;
        this.field6100 = arg0;
        this.field6103 = arg2;
        this.field6098 = arg3;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[B", line = 196)
    public final byte[] method2598(int arg0, int arg1) {
        field6102++;
        class193 var3 = this.field6093;
        synchronized (this.field6093) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field6103.method1099(1)) {
                    return null;
                }
                this.field6103.method1094(-56, (long) (arg1 * 6));
                this.field6103.method1095(class523.field7690, 6, (byte) 28, 0);
                int var5 = ((class523.field7690[1] & 0xFF) << 8) + ((class523.field7690[0] & 0xFF) << 16) + (class523.field7690[2] & 0xFF);
                int var6 = (class523.field7690[3] & 0xFF << 16) + ((class523.field7690[4] & 0xFF << 8) + (class523.field7690[5] & 0xFF));
                if (var5 < 0 || var5 > this.field6098) {
                    return null;
                }
                if (arg0 != 10372) {
                    method2597(-46);
                }
                if (var6 <= 0 || ((long) var6) > (this.field6093.method1099(1) / 520L)) {
                    return null;
                }
                byte[] var9 = new byte[var5];
                int var10 = 0;
                int var11 = 0;
                while (var5 > var10) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.field6093.method1094(116, (long) (var6 * 520));
                    int var13 = var5 - var10;
                    if (var13 > 512) {
                        var13 = 512;
                    }
                    this.field6093.method1095(class523.field7690, var13 + 8, (byte) 28, 0);
                    int var14 = (class523.field7690[0] & 0xFF << 8) + (class523.field7690[1] & 0xFF);
                    int var15 = (class523.field7690[2] & 0xFF << 8) + (class523.field7690[3] & 0xFF);
                    int var16 = (class523.field7690[6] & 0xFF) + ((class523.field7690[5] & 0xFF) << 8) + ((class523.field7690[4] & 0xFF) << 16);
                    int var17 = class523.field7690[7] & 0xFF;
                    if (arg1 == var14 && var11 == var15 && this.field6100 == var17) {
                        if (var16 >= 0 && ((long) var16) <= (this.field6093.method1099(1) / 520L)) {
                            var6 = var16;
                            for (int var20 = 0; var20 < var13; var20++) {
                                var9[var10++] = class523.field7690[var20 + 8];
                            }
                            var11++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var9;
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "toString", descriptor = "()Ljava/lang/String;", line = 305)
    public final String toString() {
        field6097++;
        return "Cache:" + this.field6100;
    }
}
