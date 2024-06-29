import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class51 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    private int field1200 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "J")
    private long field1199 = -1L;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "J")
    private long field1221 = -1L;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Lqd;")
    private class147 field1232;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "J")
    private long field1222;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "J")
    private long field1203;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "[B")
    private byte[] field1214;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "[B")
    private byte[] field1210;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "J")
    private long field1206;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lcd;")
    public static class23 field1215 = class54.method414("Fehler beim Laden Ihres Spielcharakters)3", -1);

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lsa;")
    public static class162 field1220 = new class162(30);

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Lcd;")
    private static class23 field1230 = class54.method414("Loading title screen )2 ", -1);

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "Lcd;")
    public static class23 field1229 = class54.method414("blinken2:", -1);

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field1227 = 1;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "[S")
    public static short[] field1228 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Lcd;")
    public static class23 field1226 = field1230;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lcd;")
    private static class23 field1231 = class54.method414("Unable to find ", -1);

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Lcd;")
    public static class23 field1225 = field1231;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "J")
    private long field1207;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLcd;II)V")
    public static final void method393(int arg0, byte arg1, class23 arg2, int arg3, int arg4) {
        class47 var5 = class15.method79(arg3, arg4, -12910);
        field1205++;
        if (var5 == null) {
            return;
        }
        if (var5.field1142 != null) {
            class144 var6 = new class144();
            var6.field2940 = arg0;
            var6.field2939 = var5;
            var6.field2946 = arg2;
            var6.field2942 = var5.field1142;
            class50.method391(-1142686098, var6);
        }
        boolean var7 = true;
        if (var5.field1124 > 0) {
            var7 = class39.method320(var5, (byte) -4);
        }
        if (!var7 || !class30.method227(arg0 - 1, 4095, class141.method909(var5, 123))) {
            return;
        }
        if (arg0 == 1) {
            class159.field3190.method631(145, -1);
            class68.field1596++;
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 81, arg4);
        }
        if (arg0 == 2) {
            class159.field3190.method631(216, -1);
            class84.field1795++;
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 106, arg4);
        }
        if (arg0 == 3) {
            class161.field3220++;
            class159.field3190.method631(181, -1);
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 114, arg4);
        }
        if (arg0 == 4) {
            class89.field1919++;
            class159.field3190.method631(87, -1);
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 46, arg4);
        }
        if (arg0 == 5) {
            class159.field3190.method631(226, -1);
            class112.field2361++;
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 125, arg4);
        }
        if (arg0 == 6) {
            class155.field3104++;
            class159.field3190.method631(134, -1);
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 55, arg4);
        }
        if (arg0 == 7) {
            class80.field1745++;
            class159.field3190.method631(172, -1);
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 31, arg4);
        }
        if (arg1 > -72) {
            return;
        }
        if (arg0 == 8) {
            class190.field3763++;
            class159.field3190.method631(215, -1);
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 119, arg4);
        }
        if (arg0 == 9) {
            class159.field3190.method631(26, -1);
            class159.field3190.method1186(arg3, -12);
            class159.field3190.method1220((byte) 64, arg4);
            class205.field4025++;
        }
        if (arg0 == 10) {
            class159.field3190.method631(103, -1);
            class159.field3190.method1186(arg3, -12);
            class186.field3641++;
            class159.field3190.method1220((byte) 78, arg4);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method394(boolean arg0) {
        field1212++;
        return arg0 ? null : this.field1232.method931((byte) 125);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method395(int arg0) throws IOException {
        this.method396((byte) -35);
        this.field1232.method929(false);
        int var2 = -8 % ((arg0 + 35) / 56);
        field1223++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    private final void method396(byte arg0) throws IOException {
        field1224++;
        if (this.field1199 != -1L) {
            if (this.field1207 != this.field1199) {
                this.field1232.method933((byte) -27, this.field1199);
                this.field1207 = this.field1199;
            }
            this.field1232.method928(true, this.field1210, this.field1200, 0);
            this.field1207 += this.field1200;
            long var2 = -1L;
            if (this.field1199 >= this.field1221 && (long) this.field1201 + this.field1221 > this.field1199) {
                var2 = this.field1199;
            } else if (this.field1221 >= this.field1199 && (long) this.field1200 + this.field1199 > this.field1221) {
                var2 = this.field1221;
            }
            if (this.field1222 < this.field1207) {
                this.field1222 = this.field1207;
            }
            long var4 = -1L;
            if ((long) this.field1200 + this.field1199 > this.field1221 && (long) this.field1200 + this.field1199 <= (long) this.field1201 + this.field1221) {
                var4 = (long) this.field1200 + this.field1199;
            } else if ((long) this.field1201 + this.field1221 > this.field1199 && (long) this.field1200 + this.field1199 >= (long) this.field1201 + this.field1221) {
                var4 = (long) this.field1201 + this.field1221;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class93.method611(this.field1210, (int) (var2 - this.field1199), this.field1214, (int) (var2 - this.field1221), var6);
            }
            this.field1200 = 0;
            this.field1199 = -1L;
        }
        if (arg0 != -35) {
            this.field1199 = 115L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BIBI)V")
    public final void method397(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field1211++;
        try {
            if (arg0.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field1199 != -1L && this.field1206 >= this.field1199 && (long) this.field1200 + this.field1199 >= (long) arg3 + this.field1206) {
                class93.method611(this.field1210, (int) (this.field1206 - this.field1199), arg0, arg1, arg3);
                this.field1206 += arg3;
                return;
            }
            long var5 = this.field1206;
            int var7 = arg1;
            int var8 = arg3;
            int var9 = 1 / ((arg2 + 70) / 32);
            if (this.field1206 >= this.field1221 && this.field1221 + (long) this.field1201 > this.field1206) {
                int var10 = (int) (this.field1221 + (long) this.field1201 - this.field1206);
                if (var10 > arg3) {
                    var10 = arg3;
                }
                class93.method611(this.field1214, (int) (this.field1206 - this.field1221), arg0, arg1, var10);
                arg1 += var10;
                this.field1206 += var10;
                arg3 -= var10;
            }
            if (arg3 > this.field1214.length) {
                this.field1232.method933((byte) -27, this.field1206);
                this.field1207 = this.field1206;
                while (arg3 > 0) {
                    int var11 = this.field1232.method932((byte) 82, arg1, arg0, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field1207 += var11;
                    arg1 += var11;
                    this.field1206 += var11;
                    arg3 -= var11;
                }
            } else if (arg3 > 0) {
                this.method402(true);
                int var12 = arg3;
                if (arg3 > this.field1201) {
                    var12 = this.field1201;
                }
                class93.method611(this.field1214, 0, arg0, arg1, var12);
                this.field1206 += var12;
                arg3 -= var12;
                arg1 += var12;
            }
            if (this.field1199 != -1L) {
                if (this.field1199 > this.field1206 && arg3 > 0) {
                    int var13 = (int) (this.field1199 - this.field1206) + arg1;
                    if (arg1 + arg3 < var13) {
                        var13 = arg1 + arg3;
                    }
                    while (arg1 < var13) {
                        arg0[arg1++] = 0;
                        this.field1206++;
                        arg3--;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (var5 <= this.field1199 && (long) var8 + var5 > this.field1199) {
                    var14 = this.field1199;
                } else if (this.field1199 <= var5 && var5 < (long) this.field1200 + this.field1199) {
                    var14 = var5;
                }
                if (var5 < this.field1199 + (long) this.field1200 && (long) this.field1200 + this.field1199 <= (long) var8 + var5) {
                    var16 = this.field1199 + (long) this.field1200;
                } else if ((long) var8 + var5 > this.field1199 && (long) this.field1200 + this.field1199 >= var5 - -((long) var8)) {
                    var16 = (long) var8 + var5;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class93.method611(this.field1210, (int) (var14 - this.field1199), arg0, var7 + (int) (var14 - var5), var18);
                    if (this.field1206 < var16) {
                        arg3 = (int) ((long) arg3 + this.field1206 - var16);
                        this.field1206 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field1207 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method398(int arg0) {
        field1215 = null;
        field1229 = null;
        field1228 = null;
        field1230 = null;
        field1231 = null;
        field1225 = null;
        field1226 = null;
        field1220 = null;
        if (arg0 != -11777) {
            field1227 = -45;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLbb;)V")
    public static final void method399(int arg0, byte arg1, class12 arg2) {
        field1209++;
        if (class15.field339 < arg2.field223) {
            class121.method752(1536, arg2);
        } else if (arg2.field263 >= class15.field339) {
            class4.method19(arg2, -15021);
        } else {
            class80.method547((byte) -7, arg2);
        }
        if (arg2.field215 < 128 || arg2.field277 < 128 || arg2.field215 >= 13184 || arg2.field277 >= 13184) {
            arg2.field263 = 0;
            arg2.field223 = 0;
            arg2.field287 = -1;
            arg2.field277 = arg2.field230[0] * 128 + arg2.field231 * 64;
            arg2.field215 = arg2.field219[0] * 128 + arg2.field231 * 64;
            arg2.field288 = -1;
            arg2.method65(0);
        }
        if (arg1 != -13) {
            return;
        }
        if (class134.field2790 == arg2 && (arg2.field215 < 1536 || arg2.field277 < 1536 || arg2.field215 >= 11776 || arg2.field277 >= 11776)) {
            arg2.field215 = arg2.field219[0] * 128 + arg2.field231 * 64;
            arg2.field287 = -1;
            arg2.field263 = 0;
            arg2.field277 = arg2.field230[0] * 128 + arg2.field231 * 64;
            arg2.field288 = -1;
            arg2.field223 = 0;
            arg2.method65(0);
        }
        class31.method229(126, arg2);
        class4.method23(arg2, (byte) 68);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lmh;IZ)V")
    public static final void method400(class115 arg0, int arg1, boolean arg2) {
        int var3 = arg0.field2408;
        field1219++;
        int var4 = (int) arg0.field3317;
        arg0.method1018(15789);
        if (arg2) {
            class8.method46(2047, var3);
        }
        if (arg1 <= 45) {
            return;
        }
        class157.method965((byte) 93, var3);
        class47 var5 = class113.method725((byte) 105, var4);
        if (var5 != null) {
            class3.method12(var5, false);
        }
        class49.field1171 = 0;
        class134.field2786 = false;
        class109.method709((byte) -30, class134.field2789, class119.field2489, class179.field3552, class189.field3698);
        if (class119.field2450 != -1) {
            class162.method991(class119.field2450, 1, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)V")
    public final void method401(byte arg0, long arg1) throws IOException {
        if (arg0 != -85) {
            return;
        }
        field1213++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method394(false));
        }
        this.field1206 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    private final void method402(boolean arg0) throws IOException {
        if (!arg0) {
            method398(15);
        }
        field1208++;
        this.field1201 = 0;
        if (this.field1207 != this.field1206) {
            this.field1232.method933((byte) -27, this.field1206);
            this.field1207 = this.field1206;
        }
        this.field1221 = this.field1206;
        while (this.field1214.length > this.field1201) {
            int var2 = this.field1232.method932((byte) 82, this.field1201, this.field1214, this.field1214.length - this.field1201);
            if (var2 == -1) {
                break;
            }
            this.field1201 += var2;
            this.field1207 += var2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)J")
    public final long method403(byte arg0) {
        field1218++;
        if (arg0 != 100) {
            method393(95, (byte) 12, null, -1, 126);
        }
        return this.field1203;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[B)V")
    public final void method404(int arg0, byte[] arg1) throws IOException {
        field1204++;
        this.method397(arg1, 0, (byte) 14, arg1.length);
        if (arg0 > -112) {
            this.method403((byte) -118);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BII)V")
    public final void method405(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1202++;
        try {
            if (arg3 >= -62) {
                field1231 = null;
            }
            if (this.field1203 < (long) arg2 + this.field1206) {
                this.field1203 = (long) arg2 + this.field1206;
            }
            if (this.field1199 != -1L && (this.field1199 > this.field1206 || (long) this.field1200 + this.field1199 < this.field1206)) {
                this.method396((byte) -35);
            }
            if (this.field1199 != -1L && (long) this.field1210.length + this.field1199 < this.field1206 - -((long) arg2)) {
                int var5 = (int) ((long) this.field1210.length + this.field1199 - this.field1206);
                arg2 -= var5;
                class93.method611(arg1, arg0, this.field1210, (int) (this.field1206 - this.field1199), var5);
                this.field1206 += var5;
                arg0 += var5;
                this.field1200 = this.field1210.length;
                this.method396((byte) -35);
            }
            if (arg2 > this.field1210.length) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1207 != this.field1206) {
                    this.field1232.method933((byte) -27, this.field1206);
                    this.field1207 = this.field1206;
                }
                this.field1232.method928(true, arg1, arg2, arg0);
                if ((long) arg2 + this.field1206 > this.field1221 && this.field1206 + (long) arg2 <= (long) this.field1201 + this.field1221) {
                    var8 = (long) arg2 + this.field1206;
                } else if (this.field1206 < (long) this.field1201 + this.field1221 && this.field1221 + (long) this.field1201 <= (long) arg2 + this.field1206) {
                    var8 = this.field1221 + (long) this.field1201;
                }
                this.field1207 += arg2;
                if (this.field1222 < this.field1207) {
                    this.field1222 = this.field1207;
                }
                if (this.field1206 >= this.field1221 && this.field1206 < (long) this.field1201 + this.field1221) {
                    var6 = this.field1206;
                } else if (this.field1206 <= this.field1221 && this.field1221 < (long) arg2 + this.field1206) {
                    var6 = this.field1221;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class93.method611(arg1, (int) (var6 + (long) arg0 - this.field1206), this.field1214, (int) (var6 - this.field1221), var10);
                }
                this.field1206 += arg2;
            } else if (arg2 > 0) {
                if (this.field1199 == -1L) {
                    this.field1199 = this.field1206;
                }
                class93.method611(arg1, arg0, this.field1210, (int) (this.field1206 - this.field1199), arg2);
                this.field1206 += arg2;
                if (this.field1206 - this.field1199 > (long) this.field1200) {
                    this.field1200 = (int) (this.field1206 - this.field1199);
                }
            }
        } catch (IOException var12) {
            this.field1207 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lqd;II)V")
    public class51(class147 arg0, int arg1, int arg2) throws IOException {
        this.field1232 = arg0;
        this.field1203 = this.field1222 = arg0.method930((byte) 98);
        this.field1214 = new byte[arg1];
        this.field1210 = new byte[arg2];
        this.field1206 = 0L;
    }
}
