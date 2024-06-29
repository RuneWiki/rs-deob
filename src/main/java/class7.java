import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class7 {

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field236 = 65000;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lac;")
    private class4 field235 = null;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lac;")
    private class4 field242 = null;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lwb;")
    public static class130 field232 = class26.method212("@cr2@", -32376);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lge;")
    public static class41 field241 = new class41(64);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Z")
    public static boolean field247 = false;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lwb;")
    private static class130 field250 = class26.method212("Please wait)3)3)3", -32376);

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lwb;")
    public static class130 field249 = class26.method212("Wen m-Ochten Sie entfernen?", -32376);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lwb;")
    public static class130 field248 = field250;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lwb;")
    public static class130 field251 = class26.method212("Verbindung konnte nicht hergestellt werden)3", -32376);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lge;")
    public static class41 field246 = new class41(50);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "J")
    public static long field252;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Lda;")
    public static class20 field256;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
    public static boolean field254;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "[Lec;")
    public static class28[] field253;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "[Lec;")
    public static class28[] field255;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)Z", line = 4)
    public final boolean method51(int arg0, int arg1, int arg2, byte[] arg3) {
        field233++;
        class4 var5 = this.field235;
        synchronized (this.field235) {
            if (arg0 < 0 || this.field236 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method52(arg0, true, arg1, arg3, 6);
            if (!var6) {
                var6 = this.method52(arg0, false, arg1, arg3, arg2 + 14323);
            }
            return arg2 == -14317 ? var6 : true;
        }
    }

    @OriginalMember(owner = "client!b", name = "toString", descriptor = "()Ljava/lang/String;", line = 55)
    public final String toString() {
        field243++;
        return "Cache:" + this.field238;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZI[BI)Z", line = 63)
    private final boolean method52(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field245++;
        class4 var6 = this.field235;
        synchronized (this.field235) {
            try {
                int var8;
                if (arg1) {
                    if (this.field242.method32((byte) 78) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field242.method35(-2, (long) (arg2 * 6));
                    this.field242.method27(-1, 6, 0, class96.field2334);
                    var8 = ((class96.field2334[3] & 0xFF) << 16) + (class96.field2334[4] << 8 & 0xFF00) + (class96.field2334[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field235.method32((byte) 92) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field235.method32((byte) 99) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class96.field2334[0] = (byte) (arg0 >> 16);
                class96.field2334[1] = (byte) (arg0 >> 8);
                class96.field2334[2] = (byte) arg0;
                if (arg4 != 6) {
                    return true;
                }
                class96.field2334[3] = (byte) (var8 >> 16);
                int var11 = 0;
                int var12 = 0;
                class96.field2334[4] = (byte) (var8 >> 8);
                class96.field2334[5] = (byte) var8;
                this.field242.method35(arg4 ^ 0xFFFFFFA1, (long) (arg2 * 6));
                this.field242.method29(6, class96.field2334, -1, 0);
                while (arg0 > var12) {
                    int var13 = 0;
                    if (arg1) {
                        label110: {
                            this.field235.method35(62, (long) (var8 * 520));
                            try {
                                this.field235.method27(-1, 8, 0, class96.field2334);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class96.field2334[4] & 0xFF) << 16) - (-((class96.field2334[5] & 0xFF) << 8) - (class96.field2334[6] & 0xFF));
                            int var14 = ((class96.field2334[2] & 0xFF) << 8) + (class96.field2334[3] & 0xFF);
                            int var15 = class96.field2334[7] & 0xFF;
                            int var16 = ((class96.field2334[0] & 0xFF) << 8) + (class96.field2334[1] & 0xFF);
                            if (arg2 == var16 && var11 == var14 && this.field238 == var15) {
                                if (var13 >= 0 && this.field235.method32((byte) 80) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg1 = false;
                        var13 = (int) ((this.field235.method32((byte) 93) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    int var19 = arg0 - var12;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class96.field2334[0] = (byte) (arg2 >> 8);
                    class96.field2334[1] = (byte) arg2;
                    class96.field2334[2] = (byte) (var11 >> 8);
                    class96.field2334[3] = (byte) var11;
                    var11++;
                    if (arg0 - var12 <= 512) {
                        var13 = 0;
                    }
                    class96.field2334[4] = (byte) (var13 >> 16);
                    class96.field2334[5] = (byte) (var13 >> 8);
                    class96.field2334[6] = (byte) var13;
                    class96.field2334[7] = (byte) this.field238;
                    this.field235.method35(64, (long) (var8 * 520));
                    var8 = var13;
                    this.field235.method29(8, class96.field2334, -1, 0);
                    this.field235.method29(var19, arg3, -1, var12);
                    var12 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 181)
    public static void method53(int arg0) {
        field232 = null;
        field248 = null;
        field253 = null;
        field249 = null;
        field256 = null;
        field241 = null;
        field246 = null;
        field250 = null;
        field251 = null;
        if (arg0 != 16302) {
            method56(-95, -109);
        }
        field255 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lwb;", line = 204)
    public static final class130 method54(int arg0, int arg1) {
        field234++;
        if (arg1 < 100000) {
            return class109.method831(arg1, 10);
        } else if (arg0 == 1000000) {
            return arg1 < 10000000 ? class15.method114(new class130[] { class109.method831(arg1 / 1000, 10), class72.field1839 }, arg0 - 1020349) : class15.method114(new class130[] { class109.method831(arg1 / 1000000, arg0 - 999990), class14.field396 }, arg0 ^ 0xFFF0F2C3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILac;Lac;I)V", line = 355)
    public class7(int arg0, class4 arg1, class4 arg2, int arg3) {
        this.field235 = arg1;
        this.field236 = arg3;
        this.field242 = arg2;
        this.field238 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[B", line = 226)
    public final byte[] method55(int arg0, int arg1) {
        field240++;
        class4 var3 = this.field235;
        synchronized (this.field235) {
            try {
                if (arg1 != -9171) {
                    field252 = 12L;
                }
                if ((long) (arg0 * 6 + 6) > this.field242.method32((byte) 77)) {
                    return null;
                }
                this.field242.method35(78, (long) (arg0 * 6));
                this.field242.method27(-1, 6, 0, class96.field2334);
                int var5 = ((class96.field2334[1] & 0xFF) << 8) + ((class96.field2334[0] & 0xFF) << 16) + (class96.field2334[2] & 0xFF);
                int var6 = ((class96.field2334[4] & 0xFF) << 8) + (((class96.field2334[3] & 0xFF) << 16) + (class96.field2334[5] & 0xFF));
                if (var5 < 0 || this.field236 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field235.method32((byte) 121) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var10;
                        this.field235.method35(91, (long) (var6 * 520));
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field235.method27(arg1 ^ 0x23D2, var13 + 8, 0, class96.field2334);
                        int var14 = ((class96.field2334[2] & 0xFF) << 8) + (class96.field2334[3] & 0xFF);
                        int var15 = ((class96.field2334[0] & 0xFF) << 8) + (class96.field2334[1] & 0xFF);
                        int var16 = (class96.field2334[6] & 0xFF) + ((class96.field2334[4] & 0xFF) << 16) + ((class96.field2334[5] & 0xFF) << 8);
                        int var17 = class96.field2334[7] & 0xFF;
                        if (arg0 == var15 && var11 == var14 && this.field238 == var17) {
                            if (var16 >= 0 && this.field235.method32((byte) 99) / 520L >= (long) var16) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class96.field2334[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)Lwb;", line = 310)
    public static final class130 method56(int arg0, int arg1) {
        field239++;
        class130 var2 = class109.method831(arg1, arg0 + 10);
        for (int var3 = var2.method958((byte) -38) - 3; var3 > 0; var3 -= 3) {
            var2 = class15.method114(new class130[] { var2.method970(true, var3, 0), class128.field3023, var2.method977(var3, true) }, -20349);
        }
        if (arg0 != 0) {
            field246 = null;
        }
        if (var2.method958((byte) -38) > 8) {
            var2 = class15.method114(new class130[] { class53.field1399, var2.method970(true, var2.method958((byte) -38) - 8, 0), class130.field3132, class112.field2758, var2, class59.field1494 }, -20349);
        } else if (var2.method958((byte) -38) > 4) {
            var2 = class15.method114(new class130[] { class9.field292, var2.method970(true, var2.method958((byte) -38) - 4, 0), class72.field1840, class112.field2758, var2, class59.field1494 }, -20349);
        }
        return class15.method114(new class130[] { class23.field663, var2 }, -20349);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLk;)V", line = 340)
    public static final void method57(byte arg0, class60 arg1) {
        client.field521 = arg1;
        if (arg0 > -94) {
            field247 = true;
        }
        field244++;
        class64.field1621 = client.field521.method511(3, 16);
    }
}
