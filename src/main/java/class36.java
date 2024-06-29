import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 {

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    private int field399 = -1;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    private int field408 = -32768;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "Z")
    private boolean field428 = false;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "Z")
    private boolean field425 = false;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    private int field419 = -1;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "B")
    private byte field396;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "B")
    private byte field420;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "Z")
    private boolean field424;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Loe;")
    public static class137 field404 = new class137();

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    public static int field430 = -1;

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
    public static int field436 = -1;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "F")
    public static float field415;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lsm;")
    private class189 field401;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Lba;")
    private class265 field412;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "Lmq;")
    public class354 field406;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lt;")
    private class475 field395;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "[I")
    public static int[] field423;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "[Z")
    private boolean[] field414;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V", line = 7)
    public static final void method239(int arg0, int arg1, int arg2) {
        field400++;
        if (class86.field1228 == class312.field4691) {
            if (class195.method1362(arg2, false, 1, -2, 1, 0, arg1, arg0 - 2, 0)) {
                return;
            }
            class195.method1362(arg2, false, 1, -3, 1, 0, arg1, arg0 ^ 0xFFFFFFFE, 0);
        } else if (class195.method1362(arg2, false, 1, -3, 1, 0, arg1, arg0 - 2, 0)) {
            return;
        } else {
            class195.method1362(arg2, false, 1, -2, 1, 0, arg1, -1, 0);
        }
        if (arg0 != 1) {
            field404 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z", line = 35)
    public final boolean method240(int arg0) {
        if (arg0 != 13227) {
            this.method244(68, 81, 81);
        }
        field402++;
        return this.field424;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V", line = 46)
    public final void method241(int arg0, byte arg1) {
        field418++;
        this.field428 = true;
        this.method248((byte) 60, arg0);
        if (arg1 > -60) {
            this.method241(102, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I", line = 59)
    public final int method242(byte arg0) {
        if (arg0 != 78) {
            this.field422 = 54;
        }
        field432++;
        return this.field408;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lya;IILt;ZIII)V", line = 71)
    public final void method243(class38 arg0, int arg1, int arg2, class475 arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -23689) {
            this.method244(76, 43, 49);
        }
        field398++;
        class262[] var9 = arg3.method431();
        class471[] var10 = arg3.method456();
        if ((this.field406 == null || this.field406.field5241) && (var9 != null || var10 != null)) {
            class69 var11 = class510.field7458.method2973(-121, this.field405);
            if (var11.field906 != null) {
                var11 = var11.method604((byte) -15, class195.field3271);
            }
            if (var11 != null) {
                this.field406 = new class354(class475.field6854);
            }
        }
        if (this.field406 == null) {
            return;
        }
        if (arg4) {
            this.field406.method2223(arg0, (long) class475.field6854, var9, var10, false);
        } else {
            this.field406.method2227((long) class475.field6854);
        }
        this.field406.method2228(this.field420, arg5, arg1, arg7, arg2);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)V", line = 111)
    private final void method244(int arg0, int arg1, int arg2) {
        if (arg0 >= -6) {
            this.method243(null, -24, -33, null, true, -43, -72, -112);
        }
        field410++;
        label92: while (true) {
            if (this.field401 == null) {
                if (this.field428) {
                    return;
                }
                this.method248((byte) -99, -1);
                if (this.field401 == null) {
                    return;
                }
            }
            int var4 = class475.field6854 - this.field429;
            if (var4 > 100 && this.field401.field3202 > 0) {
                int var5 = this.field401.field3181.length - this.field401.field3202;
                while (this.field407 < var5 && this.field401.field3204[this.field407] < var4) {
                    var4 -= this.field401.field3204[this.field407];
                    this.field407++;
                }
                if (var5 <= this.field407) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field401.field3181.length; var7++) {
                        var6 += this.field401.field3204[var7];
                    }
                    var4 %= var6;
                }
                this.field433 = this.field407 + 1;
                if (this.field401.field3181.length <= this.field433) {
                    this.field433 -= this.field401.field3202;
                    if (this.field433 < 0 || this.field433 >= this.field401.field3181.length) {
                        this.field433 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field401.field3204[this.field407]) {
                            this.field429 = class475.field6854 - var4;
                            this.field422 = var4;
                            return;
                        }
                        class501.method2969(this.field401, arg2, false, this.field407, -126, this.field420, arg1);
                        var4 -= this.field401.field3204[this.field407];
                        this.field407++;
                        if (this.field407 >= this.field401.field3181.length) {
                            this.field407 -= this.field401.field3202;
                            if (this.field407 < 0 || this.field401.field3181.length <= this.field407) {
                                this.field401 = null;
                                continue label92;
                            }
                        }
                        this.field433 = this.field407 + 1;
                    } while (this.field433 < this.field401.field3181.length);
                    this.field433 -= this.field401.field3202;
                } while (this.field433 >= 0 && this.field401.field3181.length > this.field433);
                this.field433 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lya;Ljt;IIIIIIZI)V", line = 588)
    public class36(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field396 = (byte) arg5;
        this.field427 = arg2;
        this.field417 = arg6;
        this.field405 = arg1.field964;
        this.field425 = arg8;
        this.field420 = (byte) arg4;
        this.field416 = arg3;
        this.field409 = arg7;
        this.field424 = arg0.method372() && arg1.field907 && !this.field425;
        if (arg9 != -1) {
            this.field428 = true;
        }
        this.method248((byte) 114, arg9);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lya;I)V", line = 221)
    public final void method245(class38 arg0, int arg1) {
        field421++;
        if (this.field412 != null) {
            class56.method514(this.field412, this.field396, this.field417, this.field409, this.field414);
            this.field412 = null;
            this.field414 = null;
        }
        if (arg1 < 47) {
            this.field424 = false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 258)
    public static final void method246(int arg0) {
        field435++;
        int var1 = -8 / ((30 - arg0) / 53);
        class71.method620((byte) 115);
        class233.method1631(2, class193.field3258.field7246, 22050, (byte) -87);
        class532.field7841 = class32.method225(0, class360.field5349, false, class111.field1557, 22050);
        class532.field7841.method1071(true, class101.field1434);
        class98.field1401 = class32.method225(1, class360.field5349, false, class111.field1557, 2048);
        class98.field1401.method1071(true, class359.field5328);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lrr;B)V", line = 274)
    public static final void method247(class245 arg0, byte arg1) {
        if (arg1 != -53) {
            field415 = -0.34393355F;
        }
        field431++;
        class60.field720 = arg0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)V", line = 287)
    private final void method248(byte arg0, int arg1) {
        field403++;
        int var3 = arg1;
        boolean var4 = false;
        int var5 = 27 / ((arg0 + 57) / 37);
        if (arg1 == -1) {
            class69 var6 = class510.field7458.method2973(-124, this.field405);
            class69 var7 = var6;
            if (var6.field906 != null) {
                var6 = var6.method604((byte) -15, class195.field3271);
            }
            if (var6 == null) {
                return;
            }
            if (var6 == var7) {
                var7 = null;
            }
            if (var6.field945 != null) {
                if (this.field401 != null && var6.method589(this.field401.field3182, (byte) -117)) {
                    return;
                }
                var3 = var6.method590((byte) -101);
                if (this.field399 != var6.field964) {
                    var4 = var6.field932;
                }
            } else if (var6.field910 == -1) {
                if (var7 != null && var7.field945 != null) {
                    if (this.field401 != null && var7.method589(this.field401.field3182, (byte) -121)) {
                        return;
                    }
                    var3 = var7.method590((byte) -84);
                    if (this.field399 != var7.field964) {
                        var4 = var7.field932;
                    }
                } else if (var7 != null && var7.field910 != -1 && this.field399 != var7.field964) {
                    var4 = var7.field932;
                    var3 = var7.field910;
                }
            } else if (this.field399 != var6.field964) {
                var4 = var6.field932;
                var3 = var6.field910;
            }
        }
        if (var3 == -1) {
            this.field401 = null;
            return;
        }
        this.field395 = null;
        if (this.field401 == null || this.field401.field3182 != var3) {
            this.field401 = class242.field3846.method2238(var3, (byte) 78);
        } else if (this.field401.field3192 == 0) {
            return;
        }
        if (this.field401.field3181 == null) {
            this.field401 = null;
            return;
        }
        if (var4) {
            this.field407 = (int) (Math.random() * (double) this.field401.field3181.length);
            this.field422 = (int) (Math.random() * (double) this.field401.field3204[this.field407]) + 1;
        } else {
            this.field422 = 1;
            this.field407 = 0;
        }
        this.field433 = this.field407 + 1;
        if (this.field433 < 0 || this.field401.field3181.length <= this.field433) {
            this.field433 = -1;
        }
        this.field429 = class475.field6854 - this.field422;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZLya;BZ)Lt;", line = 423)
    public final class475 method249(int arg0, int arg1, int arg2, boolean arg3, class38 arg4, byte arg5, boolean arg6) {
        field413++;
        if (arg5 > -52) {
            this.field419 = -100;
        }
        class69 var8 = class510.field7458.method2973(-120, this.field405);
        if (var8.field906 != null) {
            var8 = var8.method604((byte) -15, class195.field3271);
        }
        if (var8 == null) {
            this.method245(arg4, 114);
            this.field399 = -1;
            this.field419 = this.field407;
            return null;
        }
        if (!this.field428 && this.field399 != var8.field964) {
            this.field395 = null;
            this.method248((byte) -126, -1);
        }
        this.method244(-20, arg1, arg0);
        boolean var9 = arg3 & this.field424 & class193.field3258.method2986(28721, class96.field1384) != 0;
        boolean var10 = var9 & (this.field399 != var8.field964 || (this.field419 != this.field407 || this.field401 != null && (this.field401.field3189 || class55.field685) && this.field433 != this.field407) && class193.field3258.method2986(28721, class96.field1384) >= 2);
        if (arg6 && !var10) {
            this.field399 = var8.field964;
            this.field419 = this.field407;
            return null;
        }
        if (var10) {
            class56.method514(this.field412, this.field396, this.field417, this.field409, this.field414);
        }
        class145 var11 = class491.field7059[this.field396];
        class145 var12;
        if (this.field425) {
            var12 = class289.field4358[0];
        } else {
            var12 = this.field396 < 3 ? class491.field7059[this.field396 + 1] : null;
        }
        class475 var13 = null;
        if (this.field401 != null) {
            if (var10) {
                arg2 |= 0x40000;
            }
            var13 = var8.method599(var11.method412(this.field417, this.field409), this.field401, arg4, this.field409, this.field427 == 11 ? this.field416 + 4 : this.field416, this.field433, var12, this.field417, this.field427 == 11 ? 10 : this.field427, this.field407, arg2, true, this.field422, var11);
            if (var13 == null) {
                this.field412 = null;
                this.field414 = null;
                this.field408 = 0;
            } else {
                if (var10) {
                    if (this.field414 == null) {
                        this.field414 = new boolean[4];
                    }
                    this.field412 = var13.method443(this.field412);
                    class98.method792(this.field412, this.field396, arg0, arg1, this.field414);
                }
                this.field408 = var13.method427();
            }
            this.field395 = null;
        } else if (this.field395 != null && arg2 == (arg2 & this.field395.method433()) && this.field399 == var8.field964) {
            var13 = this.field395;
        } else {
            if (this.field395 != null) {
                arg2 |= this.field395.method433();
            }
            class415 var14 = var8.method595(arg2, var11, var10, this.field409, -1, arg4, this.field427 == 11 ? 10 : this.field427, this.field427 == 11 ? this.field416 + 4 : this.field416, var12, var11.method412(this.field417, this.field409), this.field417);
            if (var14 == null) {
                this.field412 = null;
                this.field414 = null;
                this.field395 = null;
                this.field408 = 0;
            } else {
                var13 = var14.field6192;
                this.field395 = var14.field6192;
                if (var10) {
                    this.field414 = null;
                    this.field412 = var14.field6193;
                    class98.method792(this.field412, this.field396, arg0, arg1, null);
                }
                this.field408 = var13.method427();
            }
        }
        this.field419 = this.field407;
        this.field399 = var8.field964;
        this.field417 = arg0;
        this.field409 = arg1;
        return var13;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V", line = 553)
    public static void method250(int arg0) {
        if (arg0 > -73) {
            field436 = -57;
        }
        field404 = null;
        field423 = null;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lya;I)V", line = 564)
    public final void method251(class38 arg0, int arg1) {
        this.method249(this.field417, this.field409, 262144, true, arg0, (byte) -95, true);
        field411++;
        if (arg1 != 1) {
            this.field419 = 21;
        }
    }

    @OriginalMember(owner = "client!gp", name = "finalize", descriptor = "()V", line = 578)
    protected final void finalize() {
        if (this.field406 != null) {
            this.field406.method2220();
        }
        field426++;
    }
}
