import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class318 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lol;")
    private class258 field5178 = null;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    private int field5185 = 65000;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lol;")
    private class258 field5182 = null;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    private int field5176;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field5175 = 0;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lek;")
    public static class206 field5177;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
    public static int[] field5179;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[[I")
    public static int[][] field5180;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2288(int arg0, int arg1) {
        class353 var2 = (class353) class216.field3591.method2344(-1, (long) arg1);
        if (arg0 == -1860655736) {
            field5189++;
            if (var2 != null) {
                var2.method535(-2801);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field5186++;
        return "Cache:" + this.field5176;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILth;I)V", line = 43)
    public static final void method2289(int arg0, class98 arg1, int arg2) {
        if (arg2 != 278577584) {
            return;
        }
        field5187++;
        class302 var3 = (class302) class362.field5736.method2344(arg2 - 278577585, (long) arg0);
        if (var3 == null) {
            return;
        }
        if (var3.field4921 != null) {
            class56.field1105.method1247(var3.field4921);
            var3.field4921 = null;
        }
        var3.method535(-2801);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 68)
    public static void method2290(int arg0) {
        field5177 = null;
        field5180 = (int[][]) null;
        int var1 = -110 / ((68 - arg0) / 51);
        field5179 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[BZIZ)Z", line = 79)
    private final boolean method2291(int arg0, byte[] arg1, boolean arg2, int arg3, boolean arg4) {
        field5190++;
        class258 var6 = this.field5182;
        synchronized (this.field5182) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (((long) (arg0 * 6 + 6)) > this.field5178.method1806(2)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field5178.method1802((long) (arg0 * 6), 12);
                    this.field5178.method1804(13875, class189.field3218, 0, 6);
                    var7 = ((class189.field3218[3] & 0xFF) << 16) + ((class189.field3218[4] & 0xFF << 8) + (class189.field3218[5] & 0xFF));
                    if (var7 <= 0 || (this.field5182.method1806(2) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field5182.method1806(2) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class189.field3218[1] = (byte) (arg3 >> 8);
                class189.field3218[4] = (byte) (var7 >> 8);
                class189.field3218[0] = (byte) (arg3 >> 16);
                class189.field3218[2] = (byte) arg3;
                class189.field3218[5] = (byte) var7;
                int var8 = 0;
                class189.field3218[3] = (byte) (var7 >> 16);
                int var9 = 0;
                if (arg4) {
                    field5177 = (class206) null;
                }
                this.field5178.method1802((long) (arg0 * 6), 109);
                this.field5178.method1808(6, class189.field3218, 0, -93);
                while (true) {
                    if (arg3 > var8) {
                        label141: {
                            int var10 = 0;
                            if (arg2) {
                                this.field5182.method1802((long) (var7 * 520), 116);
                                try {
                                    this.field5182.method1804(13875, class189.field3218, 0, 8);
                                } catch (EOFException var18) {
                                    break label141;
                                }
                                var10 = (class189.field3218[4] & 0xFF << 16) + (class189.field3218[5] & 0xFF << 8) + (class189.field3218[6] & 0xFF);
                                int var12 = ((class189.field3218[0] & 0xFF) << 8) + (class189.field3218[1] & 0xFF);
                                int var13 = (class189.field3218[2] & 0xFF << 8) + (class189.field3218[3] & 0xFF);
                                int var14 = class189.field3218[7] & 0xFF;
                                if (arg0 != var12 || var9 != var13 || this.field5176 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (this.field5182.method1806(2) / 520L) < ((long) var10)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg2 = false;
                                var10 = (int) ((this.field5182.method1806(2) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            int var15 = arg3 - var8;
                            class189.field3218[1] = (byte) arg0;
                            class189.field3218[0] = (byte) (arg0 >> 8);
                            if (arg3 - var8 <= 512) {
                                var10 = 0;
                            }
                            class189.field3218[3] = (byte) var9;
                            class189.field3218[5] = (byte) (var10 >> 8);
                            class189.field3218[4] = (byte) (var10 >> 16);
                            class189.field3218[2] = (byte) (var9 >> 8);
                            class189.field3218[6] = (byte) var10;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var9++;
                            class189.field3218[7] = (byte) this.field5176;
                            this.field5182.method1802((long) (var7 * 520), 120);
                            var7 = var10;
                            this.field5182.method1808(8, class189.field3218, 0, -127);
                            this.field5182.method1808(var15, arg1, var8, -85);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[B", line = 201)
    public final byte[] method2292(int arg0, byte arg1) {
        field5183++;
        class258 var3 = this.field5182;
        synchronized (this.field5182) {
            int var4 = 64 % ((-arg1 - 24) / 63);
            try {
                Object var10000;
                if (this.field5178.method1806(2) < ((long) (arg0 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field5178.method1802((long) (arg0 * 6), 127);
                this.field5178.method1804(13875, class189.field3218, 0, 6);
                int var5 = ((class189.field3218[3] & 0xFF) << 16) + (class189.field3218[5] & 0xFF) + (class189.field3218[4] & 0xFF << 8);
                int var6 = (class189.field3218[2] & 0xFF) + ((class189.field3218[0] & 0xFF) << 16) + (class189.field3218[1] & 0xFF << 8);
                if (var6 < 0 || var6 > this.field5185) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (long) var5 > this.field5182.method1806(2) / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var7 = new byte[var6];
                    int var8 = 0;
                    int var9 = 0;
                    while (var9 < var6) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field5182.method1802((long) (var5 * 520), 57);
                        int var10 = var6 - var9;
                        if (var10 > 512) {
                            var10 = 512;
                        }
                        this.field5182.method1804(13875, class189.field3218, 0, var10 + 8);
                        int var11 = (class189.field3218[2] & 0xFF << 8) + (class189.field3218[3] & 0xFF);
                        int var12 = ((class189.field3218[5] & 0xFF) << 8) + ((class189.field3218[4] & 0xFF << 16) + (class189.field3218[6] & 0xFF));
                        int var13 = (class189.field3218[0] & 0xFF << 8) + (class189.field3218[1] & 0xFF);
                        int var14 = class189.field3218[7] & 0xFF;
                        if (arg0 != var13 || var8 != var11 || this.field5176 != var14) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || this.field5182.method1806(2) / 520L < (long) var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var15 = 0; var15 < var10; var15++) {
                            var7[var9++] = class189.field3218[var15 + 8];
                        }
                        var5 = var12;
                        var8++;
                    }
                    byte[] var20 = var7;
                    return var20;
                }
            } catch (IOException var18) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(ILol;Lol;I)V", line = 565)
    public class318(int arg0, class258 arg1, class258 arg2, int arg3) {
        this.field5178 = arg2;
        this.field5185 = arg3;
        this.field5182 = arg1;
        this.field5176 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI[BI)Z", line = 287)
    public final boolean method2293(byte arg0, int arg1, byte[] arg2, int arg3) {
        field5181++;
        class258 var5 = this.field5182;
        synchronized (this.field5182) {
            if (arg1 < 0 || this.field5185 < arg1) {
                throw new IllegalArgumentException();
            }
            if (arg0 != -5) {
                field5180 = (int[][]) ((int[][]) null);
            }
            boolean var6 = this.method2291(arg3, arg2, true, arg1, false);
            if (!var6) {
                var6 = this.method2291(arg3, arg2, false, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CI)Z", line = 325)
    public static final boolean method2294(char arg0, int arg1) {
        field5184++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class72.method548(90, arg0)) {
            return true;
        } else {
            if (arg1 != 56843536) {
                method2294((char) 65530, -17);
            }
            char[] var2 = class16.field471;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
            char[] var5 = class250.field4110;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 378)
    public static final void method2295(int arg0) {
        if (arg0 <= 121) {
            method2294((char) 65415, 102);
        }
        for (int var1 = 0; var1 < class91.field1613; var1++) {
            int var2 = class34.field761[var1];
            class314 var3 = class149.field2533[var2];
            int var4 = class342.field5413.method1005((byte) 122);
            if ((var4 & 0x1) != 0) {
                var4 += class342.field5413.method1005((byte) 122) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class342.field5413.method1011(-32768);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class342.field5413.method992((byte) 94);
                class87.method666(var5, var6, (byte) 113, var3);
            }
            if ((var4 & 0x8) != 0) {
                var3.field190 = class342.field5413.method1054(2);
                if (var3.field190 == 65535) {
                    var3.field190 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class342.field5413.method1034(0);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class342.field5413.method989(92);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var10[var11] = class342.field5413.method992((byte) 97);
                    var9[var11] = class342.field5413.method989(87);
                }
                class59.method489(var10, var9, var3, (byte) -115, var8);
            }
            if ((var4 & 0x4) != 0) {
                int var13 = class342.field5413.method1034(0);
                int var14 = class342.field5413.method1034(0);
                var3.method47(class267.field4371, var13, -97, var14);
                var3.field137 = class267.field4371 + 300;
                var3.field174 = class342.field5413.method992((byte) 123);
            }
            if ((var4 & 0x2) != 0) {
                int var15 = class342.field5413.method1034(0);
                int var16 = class342.field5413.method992((byte) 85);
                var3.method47(class267.field4371, var15, -113, var16);
            }
            if ((var4 & 0x20) != 0) {
                int var17 = class342.field5413.method996(6107);
                int var18 = class342.field5413.method1004(3);
                if (var17 == 65535) {
                    var17 = -1;
                }
                boolean var19 = true;
                if (var17 != -1 && var3.field127 != -1 && class258.method1807(class134.method944(1, var17).field3322, 105).field4892 < class258.method1807(class134.method944(1, var3.field127).field3322, 79).field4892) {
                    var19 = false;
                }
                if (var19) {
                    var3.field159 = var18 >> 16;
                    var3.field204 = 1;
                    var3.field127 = var17;
                    var3.field147 = 0;
                    var3.field153 = 0;
                    var3.field209 = class267.field4371 + (var18 & 0xFFFF);
                    if (var3.field209 > class267.field4371) {
                        var3.field147 = -1;
                    }
                    if (var3.field127 != -1 && class267.field4371 == var3.field209) {
                        int var20 = class134.method944(1, var3.field127).field3322;
                        if (var20 != -1) {
                            class300 var21 = class258.method1807(var20, 88);
                            if (var21 != null && var21.field4885 != null) {
                                class347.method2479(false, (byte) -108, var21, 0, var3.field199, var3.field213);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field5107.method671(false)) {
                    class224.method1566(128, var3);
                }
                var3.method2271(78, class133.method934(class342.field5413.method996(6107), (byte) 122));
                var3.method48(var3.field5107.field1565, 0);
                var3.field135 = var3.field5107.field1546;
                var3.field175 = var3.field5107.field1534;
                if (var3.field5107.method671(false)) {
                    class124.method891((class238) null, class276.field4506, var3.field170[0], 0, var3.field139[0], 128, var3, (class98) null, 0);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field122 = class342.field5413.method1017((byte) -110);
                var3.field217 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field157 = class342.field5413.method1054(2);
                var3.field181 = class342.field5413.method1054(2);
            }
        }
        field5188++;
    }
}
