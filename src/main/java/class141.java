import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class141 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lid;")
    private class60 field3291 = null;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lid;")
    private class60 field3300 = null;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    private int field3299 = 65000;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    private int field3304;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lja;")
    private static class62 field3289 = class30.method243(43, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lja;")
    private static class62 field3290 = class30.method243(43, "Select");

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lja;")
    public static class62 field3296 = field3289;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lja;")
    public static class62 field3293 = class30.method243(43, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lja;")
    public static class62 field3303 = field3290;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lja;")
    public static class62 field3288 = class30.method243(43, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lja;")
    public static class62 field3287 = class30.method243(43, "Angreifen");

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lpb;")
    public static class105 field3294 = new class105();

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field3308 = 255;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lja;")
    public static class62 field3310 = class30.method243(43, "::");

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[I")
    public static int[] field3311 = new int[2048];

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lja;")
    public static class62 field3309 = class30.method243(43, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lcf;")
    public static class21 field3297;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Z")
    public static boolean field3292;

    @OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3298++;
        return "Cache:" + this.field3304;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIBI)Z")
    public final boolean method1120(byte[] arg0, int arg1, byte arg2, int arg3) {
        field3301++;
        class60 var5 = this.field3300;
        synchronized (this.field3300) {
            if (arg2 != -75) {
                return false;
            } else if (arg1 >= 0 && arg1 <= this.field3299) {
                boolean var7 = this.method1124(arg0, false, arg3, true, arg1);
                if (!var7) {
                    var7 = this.method1124(arg0, false, arg3, false, arg1);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lbd;")
    public static final class12 method1121(int arg0, int arg1) {
        field3305++;
        class12 var2 = (class12) class148.field3501.method129((long) arg0, 24838);
        if (arg1 != -24732) {
            method1121(60, -113);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field2685.method867(12, arg1 ^ 0xFFFF9F6B, arg0);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method90(new class128(var3), arg1 + 24840);
        }
        var4.method85(arg1 ^ 0xFFFF9E90);
        class148.field3501.method128((byte) -89, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[B")
    public final byte[] method1122(int arg0, int arg1) {
        field3302++;
        class60 var3 = this.field3300;
        synchronized (this.field3300) {
            try {
                if (arg1 != 7115) {
                    field3310 = null;
                }
                if ((long) (arg0 * 6 + 6) > this.field3291.method436((byte) 9)) {
                    return null;
                }
                this.field3291.method429((long) (arg0 * 6), arg1 ^ 0x1BB5);
                this.field3291.method435(0, (byte) -10, 6, class63.field1560);
                int var5 = (class63.field1560[5] & 0xFF) + ((class63.field1560[3] & 0xFF) << 16) + ((class63.field1560[4] & 0xFF) << 8);
                int var6 = (class63.field1560[2] & 0xFF) + (((class63.field1560[0] & 0xFF) << 16) + ((class63.field1560[1] & 0xFF) << 8));
                if (var6 < 0 || var6 > this.field3299) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field3300.method436((byte) 9) / 520L) {
                    int var9 = 0;
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    while (var9 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3300.method429((long) (var5 * 520), 117);
                        this.field3300.method435(0, (byte) -10, var13 + 8, class63.field1560);
                        int var14 = ((class63.field1560[0] & 0xFF) << 8) + (class63.field1560[1] & 0xFF);
                        int var15 = (class63.field1560[6] & 0xFF) + ((class63.field1560[4] & 0xFF) << 16) + ((class63.field1560[5] & 0xFF) << 8);
                        int var16 = ((class63.field1560[2] & 0xFF) << 8) + (class63.field1560[3] & 0xFF);
                        int var17 = class63.field1560[7] & 0xFF;
                        if (arg0 == var14 && var11 == var16 && this.field3304 == var17) {
                            if (var15 >= 0 && (long) var15 <= this.field3300.method436((byte) 9) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class63.field1560[var20 + 8];
                                }
                                var5 = var15;
                                var11++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1123(byte arg0) {
        field3294 = null;
        field3303 = null;
        field3296 = null;
        field3311 = null;
        field3309 = null;
        field3297 = null;
        field3310 = null;
        field3289 = null;
        field3287 = null;
        field3293 = null;
        if (arg0 >= -84) {
            method1123((byte) 31);
        }
        field3290 = null;
        field3288 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BZIZI)Z")
    private final boolean method1124(byte[] arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field3307++;
        class60 var6 = this.field3300;
        synchronized (this.field3300) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg2 * 6 + 6) > this.field3291.method436((byte) 9)) {
                        return false;
                    }
                    this.field3291.method429((long) (arg2 * 6), 124);
                    this.field3291.method435(0, (byte) -10, 6, class63.field1560);
                    var8 = ((class63.field1560[4] & 0xFF) << 8) + ((class63.field1560[3] & 0xFF) << 16) + (class63.field1560[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field3300.method436((byte) 9) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3300.method436((byte) 9) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class63.field1560[5] = (byte) var8;
                class63.field1560[2] = (byte) arg4;
                class63.field1560[0] = (byte) (arg4 >> 16);
                class63.field1560[4] = (byte) (var8 >> 8);
                class63.field1560[1] = (byte) (arg4 >> 8);
                if (arg1) {
                    return false;
                }
                int var11 = 0;
                int var12 = 0;
                class63.field1560[3] = (byte) (var8 >> 16);
                this.field3291.method429((long) (arg2 * 6), 122);
                this.field3291.method431(class63.field1560, (byte) 123, 0, 6);
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field3300.method429((long) (var8 * 520), 119);
                            try {
                                this.field3300.method435(0, (byte) -10, 8, class63.field1560);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class63.field1560[0] & 0xFF) << 8) + (class63.field1560[1] & 0xFF);
                            var13 = ((class63.field1560[4] & 0xFF) << 16) + ((class63.field1560[5] & 0xFF) << 8) + (class63.field1560[6] & 0xFF);
                            int var15 = ((class63.field1560[2] & 0xFF) << 8) + (class63.field1560[3] & 0xFF);
                            int var16 = class63.field1560[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field3304 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field3300.method436((byte) 9) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg4 - var11;
                    if (var13 == 0) {
                        var13 = (int) ((this.field3300.method436((byte) 9) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        arg3 = false;
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class63.field1560[0] = (byte) (arg2 >> 8);
                    class63.field1560[3] = (byte) var12;
                    class63.field1560[2] = (byte) (var12 >> 8);
                    var12++;
                    class63.field1560[7] = (byte) this.field3304;
                    class63.field1560[1] = (byte) arg2;
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class63.field1560[6] = (byte) var13;
                    class63.field1560[4] = (byte) (var13 >> 16);
                    class63.field1560[5] = (byte) (var13 >> 8);
                    this.field3300.method429((long) (var8 * 520), 121);
                    this.field3300.method431(class63.field1560, (byte) 106, 0, 8);
                    var8 = var13;
                    this.field3300.method431(arg0, (byte) 105, var11, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ILid;Lid;I)V")
    public class141(int arg0, class60 arg1, class60 arg2, int arg3) {
        this.field3291 = arg2;
        this.field3299 = arg3;
        this.field3300 = arg1;
        this.field3304 = arg0;
    }
}
