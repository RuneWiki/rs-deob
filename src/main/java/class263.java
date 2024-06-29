import java.io.EOFException;
import java.io.IOException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class263 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field4269 = 65000;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lje;")
    private class188 field4274 = null;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lje;")
    private class188 field4278 = null;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    private int field4271;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4273 = Calendar.getInstance();

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4277 = "Walk here";

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1841(int arg0, byte[] arg1, int arg2, int arg3) {
        field4272++;
        class188 var5 = this.field4278;
        synchronized (this.field4278) {
            if (arg0 < 0 || arg0 > this.field4269) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1844(arg3, arg0, arg1, -116, true);
            if (!var6) {
                var6 = this.method1844(arg3, arg0, arg1, -79, false);
            }
            if (arg2 < 9) {
                this.field4269 = -118;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ii", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4270++;
        return "Cache:" + this.field4271;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[B")
    public final byte[] method1842(int arg0, int arg1) {
        field4267++;
        class188 var3 = this.field4278;
        synchronized (this.field4278) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field4274.method1395(65)) {
                    return null;
                }
                this.field4274.method1402((long) (arg1 * 6), (byte) -12);
                this.field4274.method1406(6, 0, (byte) 89, class61.field852);
                int var5 = (class61.field852[1] & 0xFF << 8) + (class61.field852[0] & 0xFF << 16) + (class61.field852[2] & 0xFF);
                int var6 = (class61.field852[5] & 0xFF) + (class61.field852[4] & 0xFF << 8) + (class61.field852[3] & 0xFF << 16);
                if (var5 < 0 || this.field4269 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field4278.method1395(arg0 + 98) / 520L) {
                    int var9 = arg0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label70: while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4278.method1402((long) (var6 * 520), (byte) -12);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4278.method1406(var13 + 8, 0, (byte) -128, class61.field852);
                        int var14 = (class61.field852[0] & 0xFF << 8) + (class61.field852[1] & 0xFF);
                        int var15 = ((class61.field852[2] & 0xFF) << 8) + (class61.field852[3] & 0xFF);
                        int var16 = (class61.field852[6] & 0xFF) + (class61.field852[5] & 0xFF << 8) + (class61.field852[4] & 0xFF << 16);
                        int var17 = class61.field852[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4271 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field4278.method1395(arg0 + 77) / 520L)) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var10[var9++] = class61.field852[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static void method1843(boolean arg0) {
        field4273 = null;
        field4277 = null;
        if (arg0) {
            method1843(false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[BIZ)Z")
    private final boolean method1844(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg3 > -68) {
            this.method1841(-104, (byte[]) null, -79, 106);
        }
        field4268++;
        class188 var6 = this.field4278;
        synchronized (this.field4278) {
            try {
                int var8;
                if (arg4) {
                    if (this.field4274.method1395(33) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field4274.method1402((long) (arg0 * 6), (byte) -12);
                    this.field4274.method1406(6, 0, (byte) -123, class61.field852);
                    var8 = (class61.field852[5] & 0xFF) + (class61.field852[4] & 0xFF << 8) + (class61.field852[3] & 0xFF << 16);
                    if (var8 <= 0 || (this.field4278.method1395(116) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4278.method1395(83) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class61.field852[3] = (byte) (var8 >> 16);
                class61.field852[5] = (byte) var8;
                class61.field852[2] = (byte) arg1;
                class61.field852[1] = (byte) (arg1 >> 8);
                class61.field852[4] = (byte) (var8 >> 8);
                class61.field852[0] = (byte) (arg1 >> 16);
                int var10 = 0;
                this.field4274.method1402((long) (arg0 * 6), (byte) -12);
                this.field4274.method1407((byte) 104, 6, class61.field852, 0);
                int var11 = 0;
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field4278.method1402((long) (var8 * 520), (byte) -12);
                            try {
                                this.field4278.method1406(8, 0, (byte) -127, class61.field852);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class61.field852[4] & 0xFF) << 16) + ((class61.field852[5] & 0xFF) << 8) + (class61.field852[6] & 0xFF);
                            int var13 = ((class61.field852[0] & 0xFF) << 8) + (class61.field852[1] & 0xFF);
                            int var14 = ((class61.field852[2] & 0xFF) << 8) + (class61.field852[3] & 0xFF);
                            int var15 = class61.field852[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field4271 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field4278.method1395(6) / 520L)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4278.method1395(7) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg4 = false;
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class61.field852[7] = (byte) this.field4271;
                    class61.field852[2] = (byte) (var11 >> 8);
                    class61.field852[0] = (byte) (arg0 >> 8);
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    int var18 = arg1 - var10;
                    class61.field852[3] = (byte) var11;
                    class61.field852[4] = (byte) (var12 >> 16);
                    var11++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class61.field852[6] = (byte) var12;
                    class61.field852[1] = (byte) arg0;
                    class61.field852[5] = (byte) (var12 >> 8);
                    this.field4278.method1402((long) (var8 * 520), (byte) -12);
                    this.field4278.method1407((byte) 104, 8, class61.field852, 0);
                    this.field4278.method1407((byte) 104, var18, arg2, var10);
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZIBLpi;)V")
    public static final void method1845(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class141 arg5) {
        field4275++;
        if (class133.field2191 >= 50 || arg5 == null || arg5.field2267 == null || arg5.field2267.length <= arg0 || arg5.field2267[arg0] == null) {
            return;
        }
        int var6 = arg5.field2267[arg0][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xFB) >> 5;
        int var9 = var6 & 0x1F;
        if (arg4 > -28) {
            return;
        }
        if (arg5.field2267[arg0].length > 1) {
            int var10 = (int) ((double) arg5.field2267[arg0].length * Math.random());
            if (var10 > 0) {
                var7 = arg5.field2267[arg0][var10];
            }
        }
        if (var9 == 0) {
            if (arg2) {
                class27.method191(var8, 255, var7, (byte) 71, 0);
            }
        } else if (class212.field3402 != 0) {
            class32.field403[class133.field2191] = var7;
            class209.field3357[class133.field2191] = var8;
            int var11 = (arg3 - 64) / 128;
            class39.field554[class133.field2191] = 0;
            class83.field1202[class133.field2191] = null;
            int var12 = (arg1 - 64) / 128;
            class291.field4611[class133.field2191] = 255;
            class234.field3752[class133.field2191] = (var11 << 16) + (var12 << 8) + var9;
            class133.field2191++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(ILje;Lje;I)V")
    public class263(int arg0, class188 arg1, class188 arg2, int arg3) {
        this.field4274 = arg2;
        this.field4271 = arg0;
        this.field4278 = arg1;
        this.field4269 = arg3;
    }
}
