import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class146 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lsk;")
    private class112 field2341 = null;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    private int field2344 = 65000;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lsk;")
    private class112 field2348 = null;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lg;")
    public static class277 field2347;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method995(int arg0, int arg1) {
        field2345++;
        if (arg1 != 6) {
            field2347 = null;
        }
        class29.field466.method476(false, arg0);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method996(int arg0, byte[] arg1) {
        field2343++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class140.method973(arg1, 0, var3, 0, var2);
        if (arg0 != -17507) {
            field2347 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z[BIBI)Z")
    private final boolean method997(boolean arg0, byte[] arg1, int arg2, byte arg3, int arg4) {
        field2340++;
        class112 var6 = this.field2348;
        synchronized (this.field2348) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg2 * 6 + 6) > this.field2341.method816(116)) {
                        return false;
                    }
                    this.field2341.method815((long) (arg2 * 6), (byte) -2);
                    this.field2341.method822(class255.field4056, (byte) -80, 6, 0);
                    var8 = (class255.field4056[5] & 0xFF) + (((class255.field4056[3] & 0xFF) << 16) + ((class255.field4056[4] & 0xFF) << 8));
                    if (var8 <= 0 || ((long) var8) > (this.field2348.method816(98) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2348.method816(47) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class255.field4056[4] = (byte) (var8 >> 8);
                class255.field4056[2] = (byte) arg4;
                class255.field4056[0] = (byte) (arg4 >> 16);
                class255.field4056[3] = (byte) (var8 >> 16);
                class255.field4056[5] = (byte) var8;
                int var10 = 83 % ((arg3 + 24) / 45);
                int var11 = 0;
                int var12 = 0;
                class255.field4056[1] = (byte) (arg4 >> 8);
                this.field2341.method815((long) (arg2 * 6), (byte) -2);
                this.field2341.method824(class255.field4056, 0, (byte) -35, 6);
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg0) {
                        label104: {
                            this.field2348.method815((long) (var8 * 520), (byte) -2);
                            try {
                                this.field2348.method822(class255.field4056, (byte) -80, 8, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = (class255.field4056[4] & 0xFF << 16) + (class255.field4056[6] & 0xFF) + (class255.field4056[5] & 0xFF << 8);
                            int var14 = ((class255.field4056[0] & 0xFF) << 8) + (class255.field4056[1] & 0xFF);
                            int var15 = ((class255.field4056[2] & 0xFF) << 8) + (class255.field4056[3] & 0xFF);
                            int var16 = class255.field4056[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field2338 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field2348.method816(81) / 520L)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2348.method816(100) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        arg0 = false;
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if ((arg4 - var11) <= 512) {
                        var13 = 0;
                    }
                    class255.field4056[0] = (byte) (arg2 >> 8);
                    class255.field4056[3] = (byte) var12;
                    class255.field4056[1] = (byte) arg2;
                    class255.field4056[5] = (byte) (var13 >> 8);
                    class255.field4056[6] = (byte) var13;
                    class255.field4056[7] = (byte) this.field2338;
                    class255.field4056[2] = (byte) (var12 >> 8);
                    class255.field4056[4] = (byte) (var13 >> 16);
                    this.field2348.method815((long) (var8 * 520), (byte) -2);
                    var8 = var13;
                    var12++;
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2348.method824(class255.field4056, 0, (byte) -81, 8);
                    this.field2348.method824(arg1, var11, (byte) -30, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method998(boolean arg0) {
        field2349++;
        class49.field867.method472((byte) -63);
        if (arg0) {
            method996(40, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ab", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2342++;
        return "Cache:" + this.field2338;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILqh;II)[Ld;")
    public static final class238[] method999(int arg0, class201 arg1, int arg2, int arg3) {
        field2350++;
        if (arg2 != -12640) {
            method998(true);
        }
        return class239.method1657(arg3, 110, arg0, arg1) ? class3.method37((byte) 115) : null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1000(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 > -56) {
            method996(-40, (byte[]) null);
        }
        field2351++;
        class112 var5 = this.field2348;
        synchronized (this.field2348) {
            if (arg0 < 0 || arg0 > this.field2344) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method997(true, arg1, arg2, (byte) -110, arg0);
            if (!var6) {
                var6 = this.method997(false, arg1, arg2, (byte) 22, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1001(byte arg0) {
        field2347 = null;
        if (arg0 > -71) {
            field2339 = -5;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[B")
    public final byte[] method1002(int arg0, int arg1) {
        field2346++;
        class112 var3 = this.field2348;
        synchronized (this.field2348) {
            try {
                if (this.field2341.method816(arg1 ^ 0x3C) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2341.method815((long) (arg0 * 6), (byte) -2);
                this.field2341.method822(class255.field4056, (byte) -80, 6, 0);
                int var5 = (class255.field4056[3] & 0xFF << 16) + (class255.field4056[4] & 0xFF << 8) + (class255.field4056[5] & 0xFF);
                int var6 = (class255.field4056[arg1] & 0xFF) + ((class255.field4056[0] & 0xFF) << 16) + (class255.field4056[1] & 0xFF << 8);
                if (var6 < 0 || var6 > this.field2344) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field2348.method816(arg1 + 50) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2348.method815((long) (var5 * 520), (byte) -2);
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2348.method822(class255.field4056, (byte) -80, var13 + 8, 0);
                        int var14 = class255.field4056[7] & 0xFF;
                        int var15 = ((class255.field4056[4] & 0xFF) << 16) + ((class255.field4056[5] & 0xFF) << 8) + (class255.field4056[6] & 0xFF);
                        int var16 = ((class255.field4056[0] & 0xFF) << 8) + (class255.field4056[1] & 0xFF);
                        int var17 = ((class255.field4056[2] & 0xFF) << 8) + (class255.field4056[3] & 0xFF);
                        if (arg0 == var16 && var11 == var17 && this.field2338 == var14) {
                            if (var15 >= 0 && (long) var15 <= this.field2348.method816(75) / 520L) {
                                var5 = var15;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class255.field4056[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(ILsk;Lsk;I)V")
    public class146(int arg0, class112 arg1, class112 arg2, int arg3) {
        this.field2338 = arg0;
        this.field2341 = arg2;
        this.field2348 = arg1;
        this.field2344 = arg3;
    }
}
