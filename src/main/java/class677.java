import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class677 extends class498 {

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    private int field9384 = 0;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Z")
    public boolean field9390 = false;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Lan;")
    public class138 field9389 = new class138();

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lan;")
    private class138 field9398 = new class138();

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Z")
    private boolean field9404 = false;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lnha;")
    public class689 field9391;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "J")
    private long field9395;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lmv;")
    public class44 field9394;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Ldf;")
    public class623 field9381;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lhca;")
    public class244 field9382;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Z")
    public static boolean field9397 = false;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lkr;")
    public static class602 field9385 = new class602(97, 0);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public int field9396;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    private int field9399;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    private int field9400;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    private int field9401;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    private int field9402;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    private int field9403;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    private int field9405;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    private int field9406;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 7)
    public static void method3811(byte arg0) {
        int var1 = -93 % ((-arg0 - 8) / 63);
        field9385 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JLha;Z)V", line = 20)
    public final void method3812(long arg0, class548 arg1, boolean arg2) {
        field9392++;
        for (class502 var5 = (class502) this.field9382.method1638(arg2); var5 != null; var5 = (class502) this.field9382.method1645(0)) {
            var5.method3025(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Z", line = 37)
    public static final boolean method3813(int arg0, int arg1) {
        if (arg1 != -658934376) {
            field9385 = null;
        }
        field9387++;
        return arg0 == 58 || arg0 == 20 || arg0 == 22 || arg0 == 46 || arg0 == 15 || arg0 == 60 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 58)
    public final void method3814(int arg0) {
        this.field9389.field1960 = this.field9394.field536;
        this.field9389.field1967 = this.field9394.field551;
        this.field9389.field1968 = this.field9394.field541;
        if (arg0 != 2580) {
            method3811((byte) -97);
        }
        this.field9389.field1963 = this.field9394.field545;
        field9386++;
        this.field9389.field1958 = this.field9394.field552;
        this.field9389.field1961 = this.field9394.field534;
        this.field9389.field1966 = this.field9394.field537;
        this.field9389.field1969 = this.field9394.field548;
        this.field9389.field1956 = this.field9394.field544;
        if (this.field9389.field1968 == this.field9389.field1961 && this.field9389.field1968 == this.field9389.field1956 && this.field9389.field1969 == this.field9389.field1963 && this.field9389.field1967 == this.field9389.field1963 && this.field9389.field1960 == this.field9389.field1958 && this.field9389.field1966 == this.field9389.field1958) {
            this.field9404 = true;
        } else if (this.field9404) {
            this.field9398.field1966 = this.field9389.field1966;
            this.field9398.field1968 = this.field9389.field1968;
            this.field9398.field1967 = this.field9389.field1967;
            this.field9404 = false;
            this.field9398.field1956 = this.field9389.field1956;
            this.field9398.field1960 = this.field9389.field1960;
            this.field9398.field1969 = this.field9389.field1969;
            this.field9398.field1958 = this.field9389.field1958;
            this.field9398.field1961 = this.field9389.field1961;
            this.field9398.field1963 = this.field9389.field1963;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IJZLha;I)V", line = 99)
    public final void method3815(int arg0, long arg1, boolean arg2, class548 arg3, int arg4) {
        int var7 = -111 % ((-arg0 - 3) / 38);
        field9393++;
        if (this.field9390) {
            arg2 = false;
        } else if (this.field9381.field8375 > class709.field9896) {
            arg2 = false;
        } else if (class14.field137[class709.field9896] < class602.field8144) {
            arg2 = false;
        } else if (this.field9404) {
            arg2 = false;
        } else if (this.field9381.field8370 != -1) {
            int var8 = (int) (arg1 - this.field9395);
            if (this.field9381.field8356 || this.field9381.field8370 >= var8) {
                var8 %= this.field9381.field8370;
            } else {
                arg2 = false;
            }
            if (!this.field9381.field8339 && this.field9381.field8348 > var8) {
                arg2 = false;
            }
            if (this.field9381.field8339 && var8 >= this.field9381.field8348) {
                arg2 = false;
            }
        }
        if (arg2) {
            class223.field3011++;
            int var9 = (this.field9389.field1968 + this.field9389.field1961 + this.field9389.field1956) / 3;
            int var10 = (this.field9389.field1967 + this.field9389.field1963 + this.field9389.field1969) / 3;
            int var11 = (this.field9389.field1960 + this.field9389.field1958 + this.field9389.field1966) / 3;
            if (this.field9389.field1965 != var9 || this.field9389.field1972 != var10 || this.field9389.field1964 != var11) {
                this.field9389.field1965 = var9;
                this.field9389.field1964 = var11;
                this.field9389.field1972 = var10;
                int var12 = this.field9389.field1968 - this.field9389.field1961;
                int var13 = this.field9389.field1963 - this.field9389.field1969;
                int var14 = this.field9389.field1958 - this.field9389.field1960;
                int var15 = this.field9389.field1956 - this.field9389.field1961;
                int var16 = this.field9389.field1967 - this.field9389.field1969;
                int var17 = this.field9389.field1966 - this.field9389.field1960;
                this.field9403 = var12 * var16 - (var13 * var15);
                this.field9402 = var13 * var17 - (var14 * var16);
                this.field9399 = var14 * var15 - (var12 * var17);
                while (true) {
                    if (this.field9402 <= 32767 && this.field9399 <= 32767 && this.field9403 <= 32767 && this.field9402 >= -32767 && this.field9399 >= -32767 && this.field9403 >= -32767) {
                        int var18 = (int) Math.sqrt((double) (this.field9402 * this.field9402 + (this.field9399 * this.field9399) + (this.field9403 * this.field9403)));
                        if (var18 <= 0) {
                            var18 = 1;
                        }
                        this.field9403 = this.field9403 * 32767 / var18;
                        this.field9402 = this.field9402 * 32767 / var18;
                        this.field9399 = this.field9399 * 32767 / var18;
                        if (this.field9381.field8378 > 0 || this.field9381.field8383 > 0) {
                            int var19 = (int) (Math.atan2((double) this.field9403, (double) this.field9402) * 2607.5945876176133D);
                            int var20 = (int) (Math.atan2((double) this.field9399, Math.sqrt((double) (this.field9403 * this.field9403 + this.field9402 * this.field9402))) * 2607.5945876176133D);
                            this.field9406 = this.field9381.field8378 - this.field9381.field8357;
                            this.field9400 = this.field9381.field8383 - this.field9381.field8338;
                            this.field9401 = this.field9381.field8357 + var19 - (this.field9406 >> 1);
                            this.field9405 = var20 + this.field9381.field8338 - (this.field9400 >> 1);
                        }
                        break;
                    }
                    this.field9402 >>= 0x1;
                    this.field9403 >>= 0x1;
                    this.field9399 >>= 0x1;
                }
            }
            this.field9384 += (int) (((double) this.field9381.field8379 + (double) (this.field9381.field8389 - this.field9381.field8379) * Math.random()) * (double) arg4);
            if (this.field9384 > 63) {
                int var21 = this.field9384 >> 6;
                this.field9384 &= 0x3F;
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23;
                    int var24;
                    int var25;
                    if (this.field9381.field8378 <= 0 && this.field9381.field8383 <= 0) {
                        var23 = this.field9402;
                        var24 = this.field9399;
                        var25 = this.field9403;
                    } else {
                        int var26 = (int) (Math.random() * (double) this.field9406) + this.field9401;
                        int var27 = var26 & 0x3FFF;
                        int var28 = class24.field312[var27];
                        int var29 = class24.field308[var27];
                        int var30 = (int) (Math.random() * (double) this.field9400) + this.field9405;
                        int var31 = var30 & 0x1FFF;
                        int var32 = class24.field312[var31];
                        int var33 = class24.field308[var31];
                        byte var34 = 13;
                        var24 = (var33 << 1) * -1;
                        var23 = var29 * var32 >> var34;
                        var25 = var28 * var32 >> var34;
                    }
                    float var35 = (float) Math.random();
                    float var36 = (float) Math.random();
                    if (var35 + var36 > 1.0F) {
                        var35 = 1.0F - var35;
                        var36 = 1.0F - var36;
                    }
                    float var37 = 1.0F - (var35 + var36);
                    int var38 = (int) ((float) this.field9389.field1956 * var37 + (float) this.field9389.field1968 * var36 + (float) this.field9389.field1961 * var35);
                    int var39 = (int) ((float) this.field9389.field1967 * var37 + (float) this.field9389.field1969 * var35 + (float) this.field9389.field1963 * var36);
                    int var40 = (int) ((float) this.field9389.field1966 * var37 + (float) this.field9389.field1960 * var35 + (float) this.field9389.field1958 * var36);
                    int var41 = (int) ((float) this.field9398.field1956 * var37 + (float) this.field9398.field1968 * var36 + (float) this.field9398.field1961 * var35);
                    int var42 = (int) ((float) this.field9398.field1967 * var37 + (float) this.field9398.field1969 * var35 + (float) this.field9398.field1963 * var36);
                    int var43 = (int) ((float) this.field9398.field1966 * var37 + (float) this.field9398.field1960 * var35 + (float) this.field9398.field1958 * var36);
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = var40 - var43;
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = (int) (Math.random() * (double) var46 + (double) var43);
                    int var50 = this.field9381.field8333 + ((int) ((double) (this.field9381.field8354 - this.field9381.field8333) * Math.random()));
                    int var51 = (int) (Math.random() * (double) (this.field9381.field8377 - this.field9381.field8358)) + this.field9381.field8358;
                    int var52 = this.field9381.field8347 + (int) (Math.random() * (double) (this.field9381.field8368 - this.field9381.field8347));
                    int var53;
                    if (this.field9381.field8391) {
                        double var54 = Math.random();
                        var53 = (int) ((double) this.field9381.field8371 + Math.random() * (double) this.field9381.field8349) << 24 | (int) ((double) this.field9381.field8332 * var54 + (double) this.field9381.field8372) << 16 | (int) ((double) this.field9381.field8344 * var54 + (double) this.field9381.field8386) << 8 | (int) ((double) this.field9381.field8329 * var54 + (double) this.field9381.field8351);
                    } else {
                        var53 = (int) ((double) this.field9381.field8329 * Math.random() + (double) this.field9381.field8351) | (int) ((double) this.field9381.field8372 + (double) this.field9381.field8332 * Math.random()) << 16 | (int) ((double) this.field9381.field8386 + Math.random() * (double) this.field9381.field8344) << 8 | (int) ((double) this.field9381.field8371 + (double) this.field9381.field8349 * Math.random()) << 24;
                    }
                    int var56 = this.field9381.field8387;
                    if (!arg3.method1469() && !this.field9381.field8361) {
                        var56 = -1;
                    }
                    if (class485.field6767 == class199.field2664) {
                        new class502(this, var47, var48, var49, var23, var24, var25, var50, var51, var53, var52, var56, this.field9381.field8363, this.field9381.field8366);
                    } else {
                        class502 var58 = class223.field3012[class485.field6767];
                        class485.field6767 = class485.field6767 + 1 & 0x3FF;
                        var58.method3023(this, var47, var48, var49, var23, var24, var25, var50, var51, var53, var52, var56, this.field9381.field8363, this.field9381.field8366);
                    }
                }
            }
        }
        if (!this.field9389.method912(234, this.field9398)) {
            class138 var59 = this.field9398;
            this.field9398 = this.field9389;
            this.field9389 = var59;
            this.field9389.field1964 = this.field9398.field1964;
            this.field9389.field1968 = this.field9394.field541;
            this.field9389.field1956 = this.field9394.field544;
            this.field9389.field1965 = this.field9398.field1965;
            this.field9389.field1966 = this.field9394.field537;
            this.field9389.field1961 = this.field9394.field534;
            this.field9389.field1969 = this.field9394.field548;
            this.field9389.field1960 = this.field9394.field536;
            this.field9389.field1972 = this.field9398.field1972;
            this.field9389.field1963 = this.field9394.field545;
            this.field9389.field1967 = this.field9394.field551;
            this.field9389.field1958 = this.field9394.field552;
        }
        this.field9396 = 0;
        for (class502 var60 = (class502) this.field9382.method1638(false); var60 != null; var60 = (class502) this.field9382.method1645(0)) {
            var60.method3024(arg1, arg4);
            this.field9396++;
        }
        class331.field4700 += this.field9396;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lha;Lmv;Lnha;J)V", line = 388)
    public class677(class548 arg0, class44 arg1, class689 arg2, long arg3) {
        this.field9391 = arg2;
        this.field9395 = arg3;
        this.field9394 = arg1;
        this.field9381 = this.field9394.method241(-126);
        if (!arg0.method1469() && this.field9381.field8362 != -1) {
            this.field9381 = class497.method3010(this.field9381.field8362, -115);
        }
        this.field9382 = new class244();
        this.field9384 = (int) ((double) this.field9384 + Math.random() * 64.0D);
        this.method3814(2580);
        this.field9398.field1967 = this.field9389.field1967;
        this.field9398.field1956 = this.field9389.field1956;
        this.field9398.field1969 = this.field9389.field1969;
        this.field9398.field1968 = this.field9389.field1968;
        this.field9398.field1958 = this.field9389.field1958;
        this.field9398.field1966 = this.field9389.field1966;
        this.field9398.field1963 = this.field9389.field1963;
        this.field9398.field1960 = this.field9389.field1960;
        this.field9398.field1961 = this.field9389.field1961;
    }
}
