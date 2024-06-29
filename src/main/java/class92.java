import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class92 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lwe;")
    private class148 field2319 = null;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lwe;")
    private class148 field2320 = null;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field2326 = 65000;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lrd;")
    private static class117 field2322 = class95.method812("Service unavailable)3", (byte) 8);

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lrd;")
    public static class117 field2332 = class95.method812("Lade Schrifts-=tze )2 ", (byte) 8);

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Lrd;")
    public static class117 field2333 = field2322;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method798(int arg0) {
        field2327++;
        for (int var1 = -1; var1 < class96.field2419; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class137.field3292[var1];
            }
            class101 var3 = class93.field2340[var2];
            if (var3 != null) {
                class22.method251(arg0 ^ 0x200, 1, var3);
            }
        }
        if (arg0 != 512) {
            method802(38);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[B")
    public final byte[] method799(byte arg0, int arg1) {
        field2330++;
        class148 var3 = this.field2319;
        synchronized (this.field2319) {
            try {
                if (this.field2320.method1197(true) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2320.method1204(-76, (long) (arg1 * 6));
                this.field2320.method1195(6, 0, -1, class99.field2470);
                if (arg0 >= -26) {
                    field2324 = -74;
                }
                int var5 = (class99.field2470[5] & 0xFF) + ((class99.field2470[3] & 0xFF) << 16) + ((class99.field2470[4] & 0xFF) << 8);
                int var6 = (class99.field2470[2] & 0xFF) + ((class99.field2470[0] & 0xFF) << 16) + ((class99.field2470[1] & 0xFF) << 8);
                if (var6 < 0 || var6 > this.field2326) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field2319.method1197(true) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2319.method1204(-123, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2319.method1195(var13 + 8, 0, -1, class99.field2470);
                        int var14 = ((class99.field2470[4] & 0xFF) << 16) - (-((class99.field2470[5] & 0xFF) << 8) - (class99.field2470[6] & 0xFF));
                        int var15 = class99.field2470[7] & 0xFF;
                        int var16 = ((class99.field2470[0] & 0xFF) << 8) + (class99.field2470[1] & 0xFF);
                        int var17 = ((class99.field2470[2] & 0xFF) << 8) + (class99.field2470[3] & 0xFF);
                        if (arg1 == var16 && var11 == var17 && this.field2328 == var15) {
                            if (var14 >= 0 && this.field2319.method1197(true) / 520L >= (long) var14) {
                                var11++;
                                var5 = var14;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class99.field2470[var20 + 8];
                                    var20++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[BIB)Z")
    public final boolean method800(int arg0, byte[] arg1, int arg2, byte arg3) {
        field2316++;
        class148 var5 = this.field2319;
        synchronized (this.field2319) {
            if (arg3 != 108) {
                this.method800(-93, null, 86, (byte) -46);
            }
            if (arg0 < 0 || arg0 > this.field2326) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method804(arg1, 255, arg2, arg0, true);
            if (!var6) {
                var6 = this.method804(arg1, arg3 ^ 0x93, arg2, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method801(int arg0) {
        field2333 = null;
        field2332 = null;
        if (arg0 >= -51) {
            method801(24);
        }
        field2322 = null;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static final void method802(int arg0) {
        field2325++;
        if (arg0 == 255) {
            class119.field2924.method766(arg0 - 250);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI)V")
    public static final void method803(byte arg0, int arg1) {
        field2317++;
        if (arg1 == -1 || !class40.method463(-124, arg1)) {
            return;
        }
        class144[] var2 = class77.field2090[arg1];
        if (arg0 >= -77) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class144 var4 = var2[var3];
            if (var4.field3518 != null) {
                class118.method980((byte) 104, var4.field3518, var4, 0, 0, null, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2329++;
        return "Cache:" + this.field2328;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILwe;Lwe;I)V")
    public class92(int arg0, class148 arg1, class148 arg2, int arg3) {
        this.field2326 = arg3;
        this.field2320 = arg2;
        this.field2328 = arg0;
        this.field2319 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIIIZ)Z")
    private final boolean method804(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2321++;
        class148 var6 = this.field2319;
        synchronized (this.field2319) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg2 * 6 + 6) > this.field2320.method1197(true)) {
                        return false;
                    }
                    this.field2320.method1204(arg1 - 370, (long) (arg2 * 6));
                    this.field2320.method1195(6, 0, -1, class99.field2470);
                    var8 = (class99.field2470[5] & 0xFF) + ((class99.field2470[4] & 0xFF) << 8) + ((class99.field2470[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field2319.method1197(true) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2319.method1197(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class99.field2470[5] = (byte) var8;
                class99.field2470[2] = (byte) arg3;
                class99.field2470[0] = (byte) (arg3 >> 16);
                class99.field2470[1] = (byte) (arg3 >> 8);
                class99.field2470[4] = (byte) (var8 >> 8);
                int var10 = 0;
                class99.field2470[3] = (byte) (var8 >> 16);
                this.field2320.method1204(-83, (long) (arg2 * 6));
                if (arg1 != 255) {
                    return false;
                }
                this.field2320.method1199(6, arg1 - 256, class99.field2470, 0);
                int var12 = 0;
                while (arg3 > var10) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field2319.method1204(arg1 ^ 0xFFFFFF6C, (long) (var8 * 520));
                            try {
                                this.field2319.method1195(8, 0, -1, class99.field2470);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class99.field2470[6] & 0xFF) + (((class99.field2470[4] & 0xFF) << 16) + ((class99.field2470[5] & 0xFF) << 8));
                            int var14 = ((class99.field2470[0] & 0xFF) << 8) + (class99.field2470[1] & 0xFF);
                            int var15 = ((class99.field2470[2] & 0xFF) << 8) + (class99.field2470[3] & 0xFF);
                            int var16 = class99.field2470[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field2328 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field2319.method1197(true) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2319.method1197(true) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class99.field2470[3] = (byte) var12;
                    if (arg3 - var10 <= 512) {
                        var13 = 0;
                    }
                    class99.field2470[4] = (byte) (var13 >> 16);
                    class99.field2470[5] = (byte) (var13 >> 8);
                    class99.field2470[1] = (byte) arg2;
                    class99.field2470[0] = (byte) (arg2 >> 8);
                    class99.field2470[6] = (byte) var13;
                    class99.field2470[2] = (byte) (var12 >> 8);
                    int var19 = arg3 - var10;
                    var12++;
                    class99.field2470[7] = (byte) this.field2328;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2319.method1204(-113, (long) (var8 * 520));
                    this.field2319.method1199(8, -1, class99.field2470, 0);
                    var8 = var13;
                    this.field2319.method1199(var19, arg1 - 256, arg0, var10);
                    var10 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }
}
