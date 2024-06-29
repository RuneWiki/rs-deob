import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class196 {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lbo;")
    private class515 field3273 = null;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    private int field3275 = 65000;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lbo;")
    private class515 field3280 = null;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    private int field3279;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method1364(int arg0, int arg1, int arg2, int arg3) {
        field3272++;
        if (arg1 == 0) {
            class74.method640(-29627, class465.field6728);
            class307.field4619++;
        }
        if (arg1 == 1) {
            class176.field2612++;
            class74.method640(-29627, class274.field4192);
        }
        class71.field1020.method1542(class390.field5842 + arg0, -2756);
        class71.field1020.method1524(class176.field2613 + arg2, 128);
        class71.field1020.method1543((byte) 110, class101.field1456.method1045(82, (byte) -72) ? 1 : 0);
        if (arg3 < -57) {
            class114.field1692 = arg0;
            class523.field7652 = arg2;
            class532.field7839 = false;
            class467.method2817(0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZZ[B)Z", line = 36)
    private final boolean method1365(int arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4) {
        field3278++;
        class515 var6 = this.field3280;
        synchronized (this.field3280) {
            try {
                int var7;
                if (arg2) {
                    if (this.field3273.method3046((byte) 120) < ((long) (arg1 * 6 + 6))) {
                        return false;
                    }
                    this.field3273.method3052(0, (long) (arg1 * 6));
                    this.field3273.method3050(0, 0, class22.field277, 6);
                    var7 = (class22.field277[3] & 0xFF << 16) + ((class22.field277[4] & 0xFF) << 8) + (class22.field277[5] & 0xFF);
                    if (var7 <= 0 || (this.field3280.method3046((byte) 120) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3280.method3046((byte) 120) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class22.field277[3] = (byte) (var7 >> 16);
                class22.field277[1] = (byte) (arg0 >> 8);
                class22.field277[0] = (byte) (arg0 >> 16);
                class22.field277[4] = (byte) (var7 >> 8);
                if (arg3) {
                    return true;
                }
                class22.field277[2] = (byte) arg0;
                class22.field277[5] = (byte) var7;
                this.field3273.method3052(0, (long) (arg1 * 6));
                this.field3273.method3051(0, class22.field277, 6, (byte) -72);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg0) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field3280.method3052(0, (long) (var7 * 520));
                            try {
                                this.field3280.method3050(0, 0, class22.field277, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class22.field277[0] & 0xFF) << 8) + (class22.field277[1] & 0xFF);
                            int var15 = ((class22.field277[2] & 0xFF) << 8) + (class22.field277[3] & 0xFF);
                            var13 = (class22.field277[4] & 0xFF << 16) - (-((class22.field277[5] & 0xFF) << 8) - (class22.field277[6] & 0xFF));
                            int var16 = class22.field277[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field3279 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field3280.method3046((byte) 120) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field3280.method3046((byte) 120) + 519L) / 520L);
                        arg2 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class22.field277[1] = (byte) arg1;
                    class22.field277[3] = (byte) var12;
                    class22.field277[2] = (byte) (var12 >> 8);
                    if ((arg0 - var11) <= 512) {
                        var13 = 0;
                    }
                    class22.field277[0] = (byte) (arg1 >> 8);
                    class22.field277[4] = (byte) (var13 >> 16);
                    class22.field277[7] = (byte) this.field3279;
                    class22.field277[6] = (byte) var13;
                    class22.field277[5] = (byte) (var13 >> 8);
                    this.field3280.method3052(0, (long) (var7 * 520));
                    this.field3280.method3051(0, class22.field277, 8, (byte) -72);
                    int var19 = arg0 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field3280.method3051(var11, arg4, var19, (byte) -72);
                    var7 = var13;
                    var12++;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)Z", line = 156)
    public final boolean method1366(int arg0, byte[] arg1, int arg2, int arg3) {
        field3274++;
        class515 var5 = this.field3280;
        synchronized (this.field3280) {
            if (~arg0 > arg2 || this.field3275 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1365(arg0, arg3, true, false, arg1);
            if (!var6) {
                var6 = this.method1365(arg0, arg3, false, false, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z", line = 182)
    public static final boolean method1367(boolean arg0) {
        for (int var1 = class475.field6862; var1 < class213.field3467; var1++) {
            class138[][] var2 = client.field3311[var1];
            for (int var3 = -class46.field602; var3 <= 0; var3++) {
                int var4 = class395.field5900 + var3;
                int var5 = class395.field5900 - var3;
                if (var4 >= class233.field3768 || var5 < class222.field3640) {
                    for (int var6 = -class46.field602; var6 <= 0; var6++) {
                        int var7 = class284.field4314 + var6;
                        int var8 = class284.field4314 - var6;
                        if (var4 >= class233.field3768) {
                            if (var7 >= class313.field4715) {
                                class138 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2111) {
                                    class77.field1124 = arg0;
                                    class358.field5320.method1438(true, var9);
                                    class358.field5320.method1435(118);
                                }
                            }
                            if (var8 < class376.field5649) {
                                class138 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2111) {
                                    class77.field1124 = arg0;
                                    class358.field5320.method1438(true, var10);
                                    class358.field5320.method1435(126);
                                }
                            }
                        }
                        if (var5 < class222.field3640) {
                            if (var7 >= class313.field4715) {
                                class138 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2111) {
                                    class77.field1124 = arg0;
                                    class358.field5320.method1438(true, var11);
                                    class358.field5320.method1435(114);
                                }
                            }
                            if (var8 < class376.field5649) {
                                class138 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2111) {
                                    class77.field1124 = arg0;
                                    class358.field5320.method1438(true, var12);
                                    class358.field5320.method1435(116);
                                }
                            }
                        }
                        if (class180.field2707 == 0) {
                            if (class242.field3845) {
                                class358.field5320.method1434(24, -128);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(ILbo;Lbo;I)V", line = 413)
    public class196(int arg0, class515 arg1, class515 arg2, int arg3) {
        this.field3279 = arg0;
        this.field3280 = arg1;
        this.field3273 = arg2;
        this.field3275 = arg3;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)[B", line = 300)
    public final byte[] method1368(byte arg0, int arg1) {
        field3276++;
        class515 var3 = this.field3280;
        synchronized (this.field3280) {
            try {
                if (this.field3273.method3046((byte) 120) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field3273.method3052(0, (long) (arg1 * 6));
                this.field3273.method3050(0, 0, class22.field277, 6);
                int var5 = (class22.field277[2] & 0xFF) + ((class22.field277[0] & 0xFF) << 16) + (class22.field277[1] & 0xFF << 8);
                int var6 = (class22.field277[5] & 0xFF) + ((class22.field277[3] & 0xFF) << 16) + (class22.field277[4] & 0xFF << 8);
                if (var5 < 0 || this.field3275 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field3280.method3046((byte) 120) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3280.method3052(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3280.method3050(0, 0, class22.field277, var13 + 8);
                        int var14 = (class22.field277[0] & 0xFF << 8) + (class22.field277[1] & 0xFF);
                        int var15 = ((class22.field277[2] & 0xFF) << 8) + (class22.field277[3] & 0xFF);
                        int var16 = ((class22.field277[4] & 0xFF) << 16) + (class22.field277[5] & 0xFF << 8) + (class22.field277[6] & 0xFF);
                        int var17 = class22.field277[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3279 == var17) {
                            if (var16 >= 0 && this.field3280.method3046((byte) 120) / 520L >= (long) var16) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class22.field277[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    if (arg0 > -94) {
                        method1364(-8, 54, -29, -88);
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

    @OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;", line = 382)
    public final String toString() {
        field3281++;
        return "Cache:" + this.field3279;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)Z", line = 391)
    public static final boolean method1369(byte arg0, int arg1, int arg2) {
        field3277++;
        if (arg0 == -106) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }
}
