import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class233 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lup;")
    private class150 field3441 = null;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lup;")
    private class150 field3446 = null;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    private int field3450 = 65000;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "J")
    public static volatile long field3449 = 0L;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lse;")
    public static class139 field3444 = new class139();

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!we", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field3445++;
        return "Cache:" + this.field3439;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILtj;IZLtj;)V", line = 14)
    public static final void method1609(int arg0, class108 arg1, int arg2, boolean arg3, class108 arg4) {
        class181.field2554 = arg2;
        field3442++;
        if (arg0 == -588098040) {
            class103.field1334 = arg3;
            class204.field2878 = arg4;
            class69.field923 = arg1;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILup;Lup;I)V", line = 347)
    public class233(int arg0, class150 arg1, class150 arg2, int arg3) {
        this.field3450 = arg3;
        this.field3446 = arg2;
        this.field3439 = arg0;
        this.field3441 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[BZII)Z", line = 39)
    private final boolean method1610(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.field3446 = null;
        }
        field3438++;
        class150 var6 = this.field3441;
        synchronized (this.field3441) {
            try {
                int var7;
                if (arg0) {
                    if (((long) (arg4 * 6 + 6)) > this.field3446.method1116((byte) 25)) {
                        return false;
                    }
                    this.field3446.method1109((long) (arg4 * 6), (byte) -79);
                    this.field3446.method1120(0, 7127, class299.field4340, 6);
                    var7 = (class299.field4340[3] & 0xFF << 16) + (class299.field4340[5] & 0xFF) + ((class299.field4340[4] & 0xFF) << 8);
                    if (var7 <= 0 || (this.field3441.method1116((byte) 25) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3441.method1116((byte) 25) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class299.field4340[3] = (byte) (var7 >> 16);
                class299.field4340[1] = (byte) (arg3 >> 8);
                class299.field4340[0] = (byte) (arg3 >> 16);
                class299.field4340[2] = (byte) arg3;
                class299.field4340[5] = (byte) var7;
                class299.field4340[4] = (byte) (var7 >> 8);
                this.field3446.method1109((long) (arg4 * 6), (byte) -79);
                this.field3446.method1117((byte) -77, 0, 6, class299.field4340);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label110: {
                            this.field3441.method1109((long) (var7 * 520), (byte) -79);
                            try {
                                this.field3441.method1120(0, 7127, class299.field4340, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class299.field4340[0] & 0xFF) << 8) + (class299.field4340[1] & 0xFF);
                            var12 = (class299.field4340[4] & 0xFF << 16) + (class299.field4340[5] & 0xFF << 8) + (class299.field4340[6] & 0xFF);
                            int var14 = ((class299.field4340[2] & 0xFF) << 8) + (class299.field4340[3] & 0xFF);
                            int var15 = class299.field4340[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field3439 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field3441.method1116((byte) 25) / 520L)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field3441.method1116((byte) 25) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class299.field4340[1] = (byte) arg4;
                    class299.field4340[0] = (byte) (arg4 >> 8);
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class299.field4340[2] = (byte) (var11 >> 8);
                    class299.field4340[3] = (byte) var11;
                    class299.field4340[4] = (byte) (var12 >> 16);
                    class299.field4340[5] = (byte) (var12 >> 8);
                    class299.field4340[7] = (byte) this.field3439;
                    class299.field4340[6] = (byte) var12;
                    this.field3441.method1109((long) (var7 * 520), (byte) -79);
                    this.field3441.method1117((byte) -111, 0, 8, class299.field4340);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3441.method1117((byte) -108, var10, var18, arg1);
                    var7 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BIII)Z", line = 164)
    public final boolean method1611(byte[] arg0, int arg1, int arg2, int arg3) {
        field3448++;
        class150 var5 = this.field3441;
        synchronized (this.field3441) {
            if (arg1 != 15619) {
                return false;
            } else if (arg2 >= 0 && arg2 <= this.field3450) {
                boolean var7 = this.method1610(true, arg0, true, arg2, arg3);
                if (!var7) {
                    var7 = this.method1610(false, arg0, true, arg2, arg3);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 190)
    public static void method1612(int arg0) {
        if (arg0 == 65280) {
            field3444 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILjava/lang/Class;)Lsf;", line = 202)
    public static final class306 method1613(int arg0, int arg1, int arg2, Class arg3) {
        class74 var4 = class385.field5449[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class353 var5 = var4.field970; var5 != null; var5 = var5.field5127) {
            class306 var6 = var5.field5125;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4465 == arg1 && var6.field4462 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)[B", line = 232)
    public final byte[] method1614(int arg0, boolean arg1) {
        field3440++;
        class150 var3 = this.field3441;
        synchronized (this.field3441) {
            try {
                if (this.field3446.method1116((byte) 25) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field3446.method1109((long) (arg0 * 6), (byte) -79);
                this.field3446.method1120(0, 7127, class299.field4340, 6);
                int var5 = (class299.field4340[2] & 0xFF) + ((class299.field4340[0] & 0xFF) << 16) + ((class299.field4340[1] & 0xFF) << 8);
                int var6 = ((class299.field4340[3] & 0xFF) << 16) + ((class299.field4340[4] & 0xFF) << 8) + (class299.field4340[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3450) {
                    return null;
                } else if (var6 > 0 && (this.field3441.method1116((byte) 25) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    if (!arg1) {
                        return null;
                    }
                    int var11 = 0;
                    int var12 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3441.method1109((long) (var6 * 520), (byte) -79);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field3441.method1120(0, 7127, class299.field4340, var14 + 8);
                        int var15 = (class299.field4340[0] & 0xFF << 8) + (class299.field4340[1] & 0xFF);
                        int var16 = (class299.field4340[2] & 0xFF << 8) + (class299.field4340[3] & 0xFF);
                        int var17 = (class299.field4340[4] & 0xFF << 16) + (class299.field4340[6] & 0xFF) + (class299.field4340[5] & 0xFF << 8);
                        int var18 = class299.field4340[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field3439 == var18) {
                            if (var17 >= 0 && (this.field3441.method1116((byte) 25) / 520L) >= ((long) var17)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var11++] = class299.field4340[var21 + 8];
                                }
                                var12++;
                                var6 = var17;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 313)
    public static final int method1615(String arg0, int arg1) {
        field3447++;
        for (int var2 = 0; var2 < class413.field5911.length; var2++) {
            if (class413.field5911[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1 != -20821) {
            field3444 = null;
        }
        return -1;
    }
}
