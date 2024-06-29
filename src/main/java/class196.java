import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class196 {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    private int field3166 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "J")
    private long field3163 = -1L;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "J")
    private long field3184 = -1L;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "Ljf;")
    private class8 field3183;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "J")
    private long field3182;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "J")
    private long field3173;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "[B")
    private byte[] field3188;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "J")
    private long field3171;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[B")
    private byte[] field3169;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3167 = 127;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
    public static int[] field3176 = new int[2];

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
    public static boolean field3172 = true;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field3186 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "J")
    private long field3187;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JI)V")
    public final void method1285(long arg0, int arg1) throws IOException {
        field3174++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1293((byte) 28));
        } else if (arg1 == 0) {
            this.field3171 = arg0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public static final void method1286(int arg0, int arg1, int arg2) {
        class195.field3151 = (float) arg0;
        field3165++;
        class106.field1900 = (float) arg1;
        if (arg2 != 0) {
            method1292((class251) null, -113, -76, -61, -32, -81, -85, true);
        }
        if (class241.field3970 == 2) {
            class228.field3844 = arg0;
            class52.field914 = arg1;
        }
        class126.method867(false);
        class114.field2059 = true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[B)V")
    public final void method1287(int arg0, byte[] arg1) throws IOException {
        field3175++;
        this.method1297(arg1, arg1.length, 0, -125);
        if (arg0 != 7436) {
            this.field3183 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[BII)V")
    public final void method1288(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3178++;
        try {
            if (this.field3173 < (this.field3171 + ((long) arg0))) {
                this.field3173 = (long) arg0 + this.field3171;
            }
            if (this.field3184 != -1L && (this.field3171 < this.field3184 || ((long) this.field3166 + this.field3184) < this.field3171)) {
                this.method1295(arg2 ^ 0xFFFFFF89);
            }
            if (this.field3184 != -1L && (long) this.field3188.length + this.field3184 < (long) arg0 + this.field3171) {
                int var5 = (int) (this.field3184 + (long) this.field3188.length - this.field3171);
                arg0 -= var5;
                class235.method1557(arg1, arg3, this.field3188, (int) (this.field3171 - this.field3184), var5);
                this.field3171 += (long) var5;
                arg3 += var5;
                this.field3166 = this.field3188.length;
                this.method1295(arg2 - 125);
            }
            if (arg0 > this.field3188.length) {
                if (this.field3187 != this.field3171) {
                    this.field3183.method52(116, this.field3171);
                    this.field3187 = this.field3171;
                }
                long var6 = -1L;
                this.field3183.method49(arg0, arg1, -1, arg3);
                if (this.field3171 >= this.field3163 && this.field3171 < (long) this.field3185 + this.field3163) {
                    var6 = this.field3171;
                } else if (this.field3163 >= this.field3171 && this.field3163 < (long) arg0 + this.field3171) {
                    var6 = this.field3163;
                }
                this.field3187 += (long) arg0;
                if (this.field3182 < this.field3187) {
                    this.field3182 = this.field3187;
                }
                long var8 = -1L;
                if ((this.field3171 + ((long) arg0)) > this.field3163 && this.field3171 + ((long) arg0) <= (long) this.field3185 + this.field3163) {
                    var8 = this.field3171 + ((long) arg0);
                } else if (((long) this.field3185 + this.field3163) > this.field3171 && ((long) arg0 + this.field3171) >= ((long) this.field3185 + this.field3163)) {
                    var8 = (long) this.field3185 + this.field3163;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class235.method1557(arg1, (int) ((long) arg3 + var6 - this.field3171), this.field3169, (int) (var6 - this.field3163), var10);
                }
                this.field3171 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field3184 == -1L) {
                    this.field3184 = this.field3171;
                }
                class235.method1557(arg1, arg3, this.field3188, (int) (this.field3171 - this.field3184), arg0);
                this.field3171 += (long) arg0;
                if (((long) this.field3166) < (this.field3171 - this.field3184)) {
                    this.field3166 = (int) (this.field3171 - this.field3184);
                }
            } else if (arg2 != 0) {
                this.method1293((byte) -102);
            }
        } catch (IOException var12) {
            this.field3187 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLcc;Z)V")
    public static final void method1289(byte arg0, class194 arg1, boolean arg2) {
        if (arg0 >= -87) {
            field3167 = 20;
        }
        field3160++;
        int var3 = arg1.field3128;
        int var4 = (int) arg1.field1515;
        arg1.method547(10026);
        if (arg2) {
            class7.method41(var3, 0);
        }
        class179.method1185(-103, var3);
        class46 var5 = class108.method760(-29533, var4);
        if (var5 != null) {
            class79.method516(-373, var5);
        }
        int var6 = class275.field4399;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class21.method147((byte) 43, class101.field1788[var7])) {
                class62.method393(1, var7);
            }
        }
        if (class275.field4399 == 1) {
            class248.field4074 = false;
            class264.method1750(class127.field2244, class95.field1641, class144.field2469, class22.field340, (byte) 97);
        } else {
            class264.method1750(class127.field2244, class95.field1641, class144.field2469, class22.field340, (byte) -54);
            int var8 = class290.field4636.method1622(class240.field3949);
            for (int var9 = 0; var9 < class275.field4399; var9++) {
                int var10 = class290.field4636.method1622(class245.method1639((byte) -105, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class95.field1641 = var8 + 8;
            class127.field2244 = (class60.field1050 ? 26 : 22) + class275.field4399 * 15;
        }
        if (client.field4545 != -1) {
            class252.method1670(client.field4545, 1, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    private final void method1290(int arg0) throws IOException {
        this.field3185 = 0;
        field3159++;
        if (arg0 != 16615) {
            return;
        }
        if (this.field3187 != this.field3171) {
            this.field3183.method52(116, this.field3171);
            this.field3187 = this.field3171;
        }
        this.field3163 = this.field3171;
        while (this.field3185 < this.field3169.length) {
            int var2 = this.field3169.length - this.field3185;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3183.method48((byte) 125, this.field3169, var2, this.field3185);
            if (var3 == -1) {
                break;
            }
            this.field3185 += var3;
            this.field3187 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public static final void method1291(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 1) {
            field3186 = 37;
        }
        for (class57 var5 = (class57) class254.field4154.method379(6347); var5 != null; var5 = (class57) class254.field4154.method378(104)) {
            class193.method1265(arg3, arg2, var5, arg4, true, arg1);
        }
        for (class57 var6 = (class57) class155.field2591.method379(arg0 ^ 0x18CA); var6 != null; var6 = (class57) class155.field2591.method378(arg0 + 38)) {
            class37 var11 = var6.field1002.method533(-1);
            byte var12 = 1;
            if (var6.field1002.field1421 == var11.field531) {
                var12 = 0;
            } else if (var6.field1002.field1421 == var11.field540 || var6.field1002.field1421 == var11.field534 || var6.field1002.field1421 == var11.field549 || var6.field1002.field1421 == var11.field519) {
                var12 = 2;
            } else if (var6.field1002.field1421 == var11.field551 || var6.field1002.field1421 == var11.field525 || var6.field1002.field1421 == var11.field542 || var6.field1002.field1421 == var11.field541) {
                var12 = 3;
            }
            if (var6.field995 != var12) {
                int var13 = class52.method326((byte) -99, var6.field1002);
                if (var6.field988 != var13) {
                    if (var6.field1001 != null) {
                        class10.field149.method259(var6.field1001);
                        var6.field1001 = null;
                    }
                    var6.field988 = var13;
                }
                var6.field995 = var12;
            }
            var6.field991 = var6.field1002.field1397;
            var6.field985 = var6.field1002.field1397 + (var6.field1002.method528(121) * 64);
            var6.field1009 = var6.field1002.field1458;
            var6.field983 = var6.field1002.field1458 + var6.field1002.method528(arg0 + 125) * 64;
            class193.method1265(arg3, arg2, var6, arg4, true, arg1);
        }
        for (class57 var7 = (class57) class58.field1018.method782(arg0 - 1); var7 != null; var7 = (class57) class58.field1018.method788(true)) {
            byte var8 = 1;
            class37 var9 = var7.field994.method533(arg0 ^ 0xFFFFFFFE);
            if (var7.field994.field1421 == var9.field531) {
                var8 = 0;
            } else if (var7.field994.field1421 == var9.field540 || var7.field994.field1421 == var9.field534 || var7.field994.field1421 == var9.field549 || var7.field994.field1421 == var9.field519) {
                var8 = 2;
            } else if (var7.field994.field1421 == var9.field551 || var7.field994.field1421 == var9.field525 || var7.field994.field1421 == var9.field542 || var7.field994.field1421 == var9.field541) {
                var8 = 3;
            }
            if (var7.field995 != var8) {
                int var10 = class207.method1379((byte) -95, var7.field994);
                if (var7.field988 != var10) {
                    if (var7.field1001 != null) {
                        class10.field149.method259(var7.field1001);
                        var7.field1001 = null;
                    }
                    var7.field988 = var10;
                }
                var7.field995 = var8;
            }
            var7.field991 = var7.field994.field1397;
            var7.field985 = var7.field994.field1397 + var7.field994.method528(arg0 ^ 0x77) * 64;
            var7.field1009 = var7.field994.field1458;
            var7.field983 = var7.field994.field1458 + var7.field994.method528(arg0 ^ 0xFFFFFFCF) * 64;
            class193.method1265(arg3, arg2, var7, arg4, true, arg1);
        }
        field3177++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lsl;IIIIIIZ)V")
    public static final void method1292(class251 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4120.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4120[var9] - class50.field854;
            int var23 = arg0.field4106[var9] - class210.field3554;
            int var24 = arg0.field4123[var9] - class199.field3272;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4104 != null) {
                class251.field4112[var9] = var25;
                class251.field4124[var9] = var28;
                class251.field4111[var9] = var29;
            }
            class251.field4113[var9] = (var25 << 9) / var29 + class287.field4564;
            class251.field4125[var9] = (var28 << 9) / var29 + class287.field4563;
        }
        class287.field4560 = 0;
        int var10 = arg0.field4109.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4109[var11];
            int var13 = arg0.field4117[var11];
            int var14 = arg0.field4110[var11];
            int var15 = class251.field4113[var12];
            int var16 = class251.field4113[var13];
            int var17 = class251.field4113[var14];
            int var18 = class251.field4125[var12];
            int var19 = class251.field4125[var13];
            int var20 = class251.field4125[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class125.field2202 && class183.method1198(class287.field4564 + class203.field3326, class3.field29 + class287.field4563, var18, var19, var20, var15, var16, var17)) {
                    class31.field457 = arg5;
                    class65.field1099 = arg6;
                }
                if (!arg7) {
                    class287.field4557 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class287.field4556 || var16 > class287.field4556 || var17 > class287.field4556) {
                        class287.field4557 = true;
                    }
                    if (arg0.field4104 == null || arg0.field4104[var11] == -1) {
                        if (arg0.field4118[var11] != 12345678) {
                            class287.method1941(var18, var19, var20, var15, var16, var17, arg0.field4118[var11], arg0.field4108[var11], arg0.field4121[var11]);
                        }
                    } else if (!class255.field4168) {
                        int var21 = class287.field4555.method234((byte) -127, arg0.field4104[var11]);
                        class287.method1941(var18, var19, var20, var15, var16, var17, class127.method877(var21, arg0.field4118[var11]), class127.method877(var21, arg0.field4108[var11]), class127.method877(var21, arg0.field4121[var11]));
                    } else if (arg0.field4122) {
                        class287.method1948(var18, var19, var20, var15, var16, var17, arg0.field4118[var11], arg0.field4108[var11], arg0.field4121[var11], class251.field4112[0], class251.field4112[1], class251.field4112[3], class251.field4124[0], class251.field4124[1], class251.field4124[3], class251.field4111[0], class251.field4111[1], class251.field4111[3], arg0.field4104[var11]);
                    } else {
                        class287.method1948(var18, var19, var20, var15, var16, var17, arg0.field4118[var11], arg0.field4108[var11], arg0.field4121[var11], class251.field4112[var12], class251.field4112[var13], class251.field4112[var14], class251.field4124[var12], class251.field4124[var13], class251.field4124[var14], class251.field4111[var12], class251.field4111[var13], class251.field4111[var14], arg0.field4104[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1293(byte arg0) {
        field3181++;
        return arg0 == 28 ? this.field3183.method47((byte) 74) : null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)J")
    public final long method1294(byte arg0) {
        if (arg0 < 64) {
            return -37L;
        } else {
            field3164++;
            return this.field3173;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    private final void method1295(int arg0) throws IOException {
        if (arg0 >= -118) {
            this.field3187 = 96L;
        }
        if (this.field3184 != -1L) {
            if (this.field3187 != this.field3184) {
                this.field3183.method52(121, this.field3184);
                this.field3187 = this.field3184;
            }
            this.field3183.method49(this.field3166, this.field3188, -1, 0);
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3163 <= this.field3184 && this.field3184 < ((long) this.field3185 + this.field3163)) {
                var2 = this.field3184;
            } else if (this.field3163 >= this.field3184 && this.field3163 < ((long) this.field3166 + this.field3184)) {
                var2 = this.field3163;
            }
            if (((long) this.field3166 + this.field3184) > this.field3163 && ((long) this.field3166 + this.field3184) <= ((long) this.field3185 + this.field3163)) {
                var4 = (long) this.field3166 + this.field3184;
            } else if (this.field3184 < (long) this.field3185 + this.field3163 && ((long) this.field3185 + this.field3163) <= ((long) this.field3166 + this.field3184)) {
                var4 = this.field3163 + ((long) this.field3185);
            }
            this.field3187 += (long) this.field3166;
            if (this.field3182 < this.field3187) {
                this.field3182 = this.field3187;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class235.method1557(this.field3188, (int) (var2 - this.field3184), this.field3169, (int) (var2 - this.field3163), var6);
            }
            this.field3184 = -1L;
            this.field3166 = 0;
        }
        field3168++;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
    public static void method1296(byte arg0) {
        if (arg0 >= 27) {
            field3176 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BIII)V")
    public final void method1297(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3179++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3184 != -1L && this.field3171 >= this.field3184 && (long) this.field3166 + this.field3184 >= (long) arg1 + this.field3171) {
                class235.method1557(this.field3188, (int) (this.field3171 - this.field3184), arg0, arg2, arg1);
                this.field3171 += (long) arg1;
                return;
            }
            long var5 = this.field3171;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field3171 >= this.field3163 && this.field3171 < (long) this.field3185 + this.field3163) {
                int var9 = (int) (this.field3163 - (this.field3171 - (long) this.field3185));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class235.method1557(this.field3169, (int) (this.field3171 - this.field3163), arg0, arg2, var9);
                arg2 += var9;
                this.field3171 += (long) var9;
            }
            if (arg3 >= -115) {
                field3167 = 42;
            }
            if (this.field3169.length < arg1) {
                this.field3183.method52(125, this.field3171);
                this.field3187 = this.field3171;
                while (arg1 > 0) {
                    int var10 = this.field3183.method48((byte) -126, arg0, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3171 += (long) var10;
                    this.field3187 += (long) var10;
                    arg2 += var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                int var11 = arg1;
                this.method1290(16615);
                if (this.field3185 < arg1) {
                    var11 = this.field3185;
                }
                class235.method1557(this.field3169, 0, arg0, arg2, var11);
                this.field3171 += (long) var11;
                arg1 -= var11;
                arg2 += var11;
            }
            if (this.field3184 != -1L) {
                if (this.field3184 > this.field3171 && arg1 > 0) {
                    int var12 = (int) (this.field3184 - this.field3171) + arg2;
                    if ((arg1 + arg2) < var12) {
                        var12 = arg2 + arg1;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field3171++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < ((long) this.field3166 + this.field3184) && (this.field3184 + ((long) this.field3166)) <= ((long) var7 + var5)) {
                    var15 = (long) this.field3166 + this.field3184;
                } else if (this.field3184 < ((long) var7 + var5) && ((long) var7 + var5) <= ((long) this.field3166 + this.field3184)) {
                    var15 = (long) var7 + var5;
                }
                if (var5 <= this.field3184 && (var5 + ((long) var7)) > this.field3184) {
                    var13 = this.field3184;
                } else if (this.field3184 <= var5 && this.field3184 + ((long) this.field3166) > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class235.method1557(this.field3188, (int) (var13 - this.field3184), arg0, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field3171) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3171));
                        this.field3171 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3187 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljf;II)V")
    public class196(class8 arg0, int arg1, int arg2) throws IOException {
        this.field3183 = arg0;
        this.field3173 = this.field3182 = arg0.method50(98);
        this.field3188 = new byte[arg2];
        this.field3171 = 0L;
        this.field3169 = new byte[arg1];
    }
}
