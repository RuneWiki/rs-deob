import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class364 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lub;")
    private class22 field5301 = null;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Lub;")
    private class22 field5304 = null;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    private int field5303 = 65000;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    private int field5306;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field5298 = 0;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    public static int[] field5305 = new int[2];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lln;")
    public static class400 field5299 = new class400();

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "F")
    public static float field5308;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lbha;")
    public static class601 field5309;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[B", line = 9)
    public final byte[] method2283(int arg0, int arg1) {
        field5312++;
        class22 var3 = this.field5304;
        synchronized (this.field5304) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field5301.method177(arg0 ^ 0xFFFFBC61)) {
                    return null;
                }
                this.field5301.method174(true, (long) (arg1 * 6));
                this.field5301.method173((byte) -3, class206.field2696, 0, 6);
                int var5 = (class206.field2696[2] & 0xFF) + ((class206.field2696[0] & 0xFF) << 16) + (class206.field2696[1] & 0xFF << 8);
                int var6 = (class206.field2696[4] & 0xFF << 8) + ((class206.field2696[3] & 0xFF) << 16) + (class206.field2696[5] & 0xFF);
                if (var5 < 0 || var5 > this.field5303) {
                    return null;
                } else if (var6 > 0 && (this.field5304.method177(-26316) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5304.method174(true, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field5304.method173((byte) -36, class206.field2696, 0, var13 + 8);
                        int var14 = (class206.field2696[0] & 0xFF << 8) + (class206.field2696[1] & 0xFF);
                        int var15 = (class206.field2696[2] & 0xFF << 8) + (class206.field2696[3] & 0xFF);
                        int var16 = ((class206.field2696[4] & 0xFF) << 16) + (class206.field2696[6] & 0xFF) + ((class206.field2696[5] & 0xFF) << 8);
                        int var17 = class206.field2696[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field5306 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field5304.method177(-26316) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class206.field2696[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    if (arg0 == 9557) {
                        return var9;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILub;Lub;I)V", line = 299)
    public class364(int arg0, class22 arg1, class22 arg2, int arg3) {
        this.field5306 = arg0;
        this.field5304 = arg1;
        this.field5301 = arg2;
        this.field5303 = arg3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BII)Z", line = 91)
    public final boolean method2284(int arg0, byte[] arg1, int arg2, int arg3) {
        field5300++;
        class22 var5 = this.field5304;
        synchronized (this.field5304) {
            if (arg2 < 0 || this.field5303 < arg2) {
                throw new IllegalArgumentException();
            } else if (arg3 == 520) {
                boolean var7 = this.method2285((byte) 123, arg2, true, arg1, arg0);
                if (!var7) {
                    var7 = this.method2285((byte) 123, arg2, false, arg1, arg0);
                }
                return var7;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "toString", descriptor = "()Ljava/lang/String;", line = 119)
    public final String toString() {
        field5307++;
        return "Cache:" + this.field5306;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIZ[BI)Z", line = 128)
    private final boolean method2285(byte arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field5310++;
        class22 var6 = this.field5304;
        synchronized (this.field5304) {
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field5301.method177(-26316)) {
                        return false;
                    }
                    this.field5301.method174(true, (long) (arg4 * 6));
                    this.field5301.method173((byte) -50, class206.field2696, 0, 6);
                    var7 = ((class206.field2696[3] & 0xFF) << 16) + ((class206.field2696[4] & 0xFF) << 8) + (class206.field2696[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field5304.method177(-26316) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field5304.method177(-26316) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class206.field2696[2] = (byte) arg1;
                class206.field2696[5] = (byte) var7;
                if (arg0 <= 121) {
                    return false;
                }
                class206.field2696[0] = (byte) (arg1 >> 16);
                class206.field2696[4] = (byte) (var7 >> 8);
                class206.field2696[3] = (byte) (var7 >> 16);
                class206.field2696[1] = (byte) (arg1 >> 8);
                this.field5301.method174(true, (long) (arg4 * 6));
                this.field5301.method178(class206.field2696, (byte) 119, 0, 6);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg1) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field5304.method174(true, (long) (var7 * 520));
                            try {
                                this.field5304.method173((byte) -20, class206.field2696, 0, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class206.field2696[0] & 0xFF) << 8) + (class206.field2696[1] & 0xFF);
                            int var15 = (class206.field2696[2] & 0xFF << 8) + (class206.field2696[3] & 0xFF);
                            var13 = ((class206.field2696[5] & 0xFF) << 8) + ((class206.field2696[4] & 0xFF) << 16) + (class206.field2696[6] & 0xFF);
                            int var16 = class206.field2696[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field5306 == var16) {
                                if (var13 >= 0 && (this.field5304.method177(-26316) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field5304.method177(-26316) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class206.field2696[3] = (byte) var12;
                    if ((arg1 - var11) <= 512) {
                        var13 = 0;
                    }
                    class206.field2696[1] = (byte) arg4;
                    class206.field2696[0] = (byte) (arg4 >> 8);
                    class206.field2696[2] = (byte) (var12 >> 8);
                    class206.field2696[5] = (byte) (var13 >> 8);
                    class206.field2696[4] = (byte) (var13 >> 16);
                    class206.field2696[6] = (byte) var13;
                    class206.field2696[7] = (byte) this.field5306;
                    this.field5304.method174(true, (long) (var7 * 520));
                    this.field5304.method178(class206.field2696, (byte) 96, 0, 8);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field5304.method178(arg3, (byte) 81, var11, var19);
                    var12++;
                    var7 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)I", line = 254)
    public static final int method2286(int arg0, boolean arg1) {
        field5302++;
        if (!arg1) {
            field5298 = 78;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 285)
    public static void method2287(byte arg0) {
        int var1 = 30 % ((arg0 - 40) / 32);
        field5305 = null;
        field5299 = null;
        field5309 = null;
    }
}
