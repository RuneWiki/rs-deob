import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class62 {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Ldd;")
    private class34 field1334 = null;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Ldd;")
    private class34 field1335 = null;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field1338 = 65000;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Leh;")
    public static class47 field1331 = class195.method1282((byte) -4, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[I")
    public static int[] field1333;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIBI)Z")
    public final boolean method525(byte[] arg0, int arg1, byte arg2, int arg3) {
        field1337++;
        class34 var5 = this.field1335;
        synchronized (this.field1335) {
            if (arg3 < 0 || arg3 > this.field1338) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method527(true, arg2 ^ 0xB9171514, arg0, arg3, arg1);
            if (arg2 != -36) {
                this.field1334 = null;
            }
            if (!var6) {
                var6 = this.method527(false, arg2 + 1189669612, arg0, arg3, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1336++;
        return "Cache:" + this.field1340;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static final void method526(int arg0) {
        field1332++;
        class81.field1752.method993(1);
        class5.field85.method993(1);
        class53.field1031.method993(1);
        class139.field2726.method993(1);
        class96.field2043.method993(1);
        int var1 = 30 / ((-arg0 - 37) / 57);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI[BII)Z")
    private final boolean method527(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field1339++;
        class34 var6 = this.field1335;
        synchronized (this.field1335) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg4 * 6 + 6) > this.field1334.method295(false)) {
                        return false;
                    }
                    this.field1334.method294((long) (arg4 * 6), -71);
                    this.field1334.method296(6, 0, class24.field471, true);
                    var8 = ((class24.field471[4] & 0xFF) << 8) + ((class24.field471[3] & 0xFF) << 16) + (class24.field471[5] & 0xFF);
                    if (var8 <= 0 || this.field1335.method295(false) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1335.method295(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class24.field471[3] = (byte) (var8 >> 16);
                class24.field471[5] = (byte) var8;
                class24.field471[0] = (byte) (arg3 >> 16);
                class24.field471[4] = (byte) (var8 >> 8);
                class24.field471[2] = (byte) arg3;
                int var10 = 0;
                int var11 = 0;
                class24.field471[1] = (byte) (arg3 >> 8);
                if (arg1 != 1189669576) {
                    method526(-32);
                }
                this.field1334.method294((long) (arg4 * 6), arg1 - 1189669676);
                this.field1334.method291(-1, class24.field471, 0, 6);
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label108: {
                            this.field1335.method294((long) (var8 * 520), -116);
                            try {
                                this.field1335.method296(8, 0, class24.field471, true);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class24.field471[6] & 0xFF) + ((class24.field471[5] & 0xFF) << 8) + ((class24.field471[4] & 0xFF) << 16);
                            int var13 = ((class24.field471[0] & 0xFF) << 8) + (class24.field471[1] & 0xFF);
                            int var14 = ((class24.field471[2] & 0xFF) << 8) + (class24.field471[3] & 0xFF);
                            int var15 = class24.field471[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field1340 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field1335.method295(false) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1335.method295(false) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class24.field471[1] = (byte) arg4;
                    class24.field471[7] = (byte) this.field1340;
                    class24.field471[0] = (byte) (arg4 >> 8);
                    class24.field471[3] = (byte) var11;
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class24.field471[4] = (byte) (var12 >> 16);
                    int var18 = arg3 - var10;
                    class24.field471[2] = (byte) (var11 >> 8);
                    class24.field471[6] = (byte) var12;
                    var11++;
                    class24.field471[5] = (byte) (var12 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1335.method294((long) (var8 * 520), -67);
                    this.field1335.method291(arg1 ^ 0xB9171537, class24.field471, 0, 8);
                    this.field1335.method291(-1, arg2, var10, var18);
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[B")
    public final byte[] method528(int arg0, int arg1) {
        field1330++;
        class34 var3 = this.field1335;
        synchronized (this.field1335) {
            try {
                if (this.field1334.method295(false) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field1334.method294((long) (arg1 * 6), -57);
                this.field1334.method296(6, 0, class24.field471, true);
                int var5 = ((class24.field471[3] & 0xFF) << 16) + ((class24.field471[4] & 0xFF) << 8) + (class24.field471[5] & 0xFF);
                int var6 = ((class24.field471[0] & 0xFF) << 16) + ((class24.field471[1] & 0xFF) << 8) + (class24.field471[2] & 0xFF);
                if (var6 < 0 || this.field1338 < var6) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field1335.method295(false) / 520L) {
                    byte[] var9 = new byte[var6];
                    if (arg0 != 7308) {
                        return null;
                    }
                    int var11 = 0;
                    int var12 = 0;
                    label76: while (var12 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1335.method294((long) (var5 * 520), -71);
                        int var14 = var6 - var12;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1335.method296(var14 + 8, 0, class24.field471, true);
                        int var15 = ((class24.field471[0] & 0xFF) << 8) + (class24.field471[1] & 0xFF);
                        int var16 = class24.field471[7] & 0xFF;
                        int var17 = ((class24.field471[2] & 0xFF) << 8) + (class24.field471[3] & 0xFF);
                        int var18 = ((class24.field471[4] & 0xFF) << 16) - (-((class24.field471[5] & 0xFF) << 8) - (class24.field471[6] & 0xFF));
                        if (arg1 == var15 && var11 == var17 && this.field1340 == var16) {
                            if (var18 >= 0 && this.field1335.method295(false) / 520L >= (long) var18) {
                                var11++;
                                var5 = var18;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label76;
                                    }
                                    var9[var12++] = class24.field471[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1333 = null;
        field1331 = null;
        if (arg0 > -108) {
            field1331 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILdd;Ldd;I)V")
    public class62(int arg0, class34 arg1, class34 arg2, int arg3) {
        this.field1340 = arg0;
        this.field1338 = arg3;
        this.field1335 = arg1;
        this.field1334 = arg2;
    }
}
