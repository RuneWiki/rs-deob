import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class148 extends class275 {

    @OriginalMember(owner = "client!js", name = "v", descriptor = "Z")
    public boolean field1946 = false;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "Z")
    private boolean field1953 = false;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "Lqp;")
    public class279 field1962;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "Ldn;")
    public class322 field1952;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "J")
    private long field1934;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "Lcr;")
    public class190 field1932;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "Lep;")
    public class146 field1942;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    private int field1937;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    private int field1939;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    private int field1943;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    private int field1959;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    private int field1960;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    private int field1961;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    private int field1964;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(JI)V")
    public final void method981(long arg0, int arg1) {
        for (class341 var4 = (class341) this.field1942.method976((byte) 42); var4 != null; var4 = (class341) this.field1942.method979(87)) {
            var4.method2256(arg0);
        }
        field1947++;
        if (arg1 != 721491592) {
            this.method982(-5);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        this.field1937 = this.field1952.field4608;
        if (arg0 != -24415) {
            return;
        }
        field1938++;
        this.field1933 = this.field1952.field4589;
        this.field1939 = this.field1952.field4600;
        this.field1964 = this.field1952.field4588;
        this.field1943 = this.field1952.field4602;
        this.field1961 = this.field1952.field4594;
        this.field1958 = this.field1952.field4596;
        this.field1936 = this.field1952.field4607;
        this.field1949 = this.field1952.field4591;
        if (this.field1958 == this.field1933 && this.field1964 == this.field1958 && this.field1961 == this.field1949 && this.field1949 == this.field1937 && this.field1943 == this.field1939 && this.field1939 == this.field1936) {
            this.field1953 = true;
            return;
        }
        this.field1953 = false;
        int var2 = (this.field1933 + this.field1964 + this.field1958) / 3;
        int var3 = (this.field1961 + this.field1949 + this.field1937) / 3;
        int var4 = (this.field1943 + this.field1939 + this.field1936) / 3;
        if (this.field1963 == var2 && this.field1935 == var3 && this.field1950 == var4) {
            return;
        }
        this.field1950 = var4;
        this.field1963 = var2;
        this.field1935 = var3;
        int var5 = this.field1958 - this.field1933;
        int var6 = this.field1949 - this.field1961;
        int var7 = this.field1939 - this.field1943;
        int var8 = this.field1964 - this.field1933;
        int var9 = this.field1937 - this.field1961;
        int var10 = this.field1936 - this.field1943;
        this.field1940 = var7 * var8 - var5 * var10;
        this.field1945 = var6 * var10 - (var7 * var9);
        for (this.field1955 = var5 * var9 - (var6 * var8); this.field1945 > 32767 || this.field1940 > 32767 || this.field1955 > 32767 || this.field1945 < -32767 || this.field1940 < -32767 || this.field1955 < -32767; this.field1955 >>= 0x1) {
            this.field1945 >>= 0x1;
            this.field1940 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field1940 * this.field1940 + this.field1955 * this.field1955 + this.field1945 * this.field1945));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field1940 = this.field1940 * 32767 / var11;
        this.field1955 = this.field1955 * 32767 / var11;
        this.field1945 = this.field1945 * 32767 / var11;
        if (this.field1932.field2601 <= 0 && this.field1932.field2612 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field1955, (double) this.field1945) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field1940, Math.sqrt((double) (this.field1955 * this.field1955 + this.field1945 * this.field1945))) * 2607.5945876176133D);
        this.field1960 = this.field1932.field2601 - this.field1932.field2588;
        this.field1959 = this.field1932.field2612 - this.field1932.field2621;
        this.field1944 = var12 + this.field1932.field2588 - (this.field1960 >> 1);
        this.field1954 = this.field1932.field2621 + var13 - (this.field1959 >> 1);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lnr;IZJI)V")
    public final void method983(class437 arg0, int arg1, boolean arg2, long arg3, int arg4) {
        field1951++;
        if (this.field1946) {
            arg2 = false;
        } else if (this.field1932.field2626 > class39.field626) {
            arg2 = false;
        } else if (class170.field2241 > class337.field4976[class39.field626]) {
            arg2 = false;
        } else if (this.field1953) {
            arg2 = false;
        } else if (this.field1932.field2619 != -1) {
            int var7 = (int) (arg3 - this.field1934);
            if (this.field1932.field2590 || var7 <= this.field1932.field2619) {
                var7 %= this.field1932.field2619;
            } else {
                arg2 = false;
            }
            if (!this.field1932.field2611 && var7 < this.field1932.field2602) {
                arg2 = false;
            }
            if (this.field1932.field2611 && var7 >= this.field1932.field2602) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field1957 += (int) (((double) this.field1932.field2643 + Math.random() * (double) (this.field1932.field2631 - this.field1932.field2643)) * (double) arg1);
            if (this.field1957 > 63) {
                int var8 = this.field1957 >> 6;
                this.field1957 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field1932.field2601 <= 0 && this.field1932.field2612 <= 0) {
                        var10 = this.field1955;
                        var11 = this.field1940;
                        var12 = this.field1945;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field1960) + this.field1944;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class190.field2644[var14];
                        int var16 = class190.field2635[var14];
                        int var17 = this.field1954 + ((int) ((double) this.field1959 * Math.random()));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class190.field2644[var18];
                        int var20 = class190.field2635[var18];
                        var12 = var16 * var19 >> 15;
                        var11 = var20 * -1;
                        var10 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field1933 * var21 + (this.field1958 * var22) + (this.field1964 * var23) >> 16;
                    int var25 = this.field1937 * var23 + (this.field1961 * var21 + (this.field1949 * var22)) >> 16;
                    int var26 = this.field1936 * var23 + this.field1943 * var21 + this.field1939 * var22 >> 16;
                    int var27 = this.field1932.field2646 + ((int) ((double) (this.field1932.field2645 - this.field1932.field2646) * Math.random()));
                    int var28 = this.field1932.field2594 + ((int) (Math.random() * (double) (this.field1932.field2620 - this.field1932.field2594)));
                    int var29 = this.field1932.field2610 + ((int) ((double) (this.field1932.field2579 - this.field1932.field2610) * Math.random()));
                    int var30;
                    if (this.field1932.field2578) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field1932.field2599 * var31 + (double) this.field1932.field2600) | (int) ((double) this.field1932.field2597 * var31 + (double) this.field1932.field2622) << 8 | (int) ((double) this.field1932.field2589 * var31 + (double) this.field1932.field2614) << 16 | (int) ((double) this.field1932.field2628 * var31 + (double) this.field1932.field2632) << 24;
                    } else {
                        var30 = (int) ((double) this.field1932.field2628 * Math.random() + (double) this.field1932.field2632) << 24 | (int) ((double) this.field1932.field2600 + (double) this.field1932.field2599 * Math.random()) | (int) ((double) this.field1932.field2614 + (double) this.field1932.field2589 * Math.random()) << 16 | (int) ((double) this.field1932.field2597 * Math.random() + (double) this.field1932.field2622) << 8;
                    }
                    int var33 = this.field1932.field2580;
                    if (!arg0.method2056() && !this.field1932.field2638) {
                        var33 = -1;
                    }
                    if (class419.field6225 == class390.field5851) {
                        new class341(this, var24, var25, var26, var12, var11, var10, var27, var28, var30, var29, var33, this.field1932.field2616);
                    } else {
                        class341 var34 = class291.field4206[class419.field6225];
                        class419.field6225 = class419.field6225 + 1 & 0x3FF;
                        var34.method2255(this, var24, var25, var26, var12, var11, var10, var27, var28, var30, var29, var33, this.field1932.field2616);
                    }
                }
            }
        }
        this.field1941 = 0;
        if (arg4 != 65535) {
            this.method982(-120);
        }
        for (class341 var36 = (class341) this.field1942.method976((byte) 42); var36 != null; var36 = (class341) this.field1942.method979(-88)) {
            var36.method2254(arg3, arg1);
            this.field1941++;
        }
        class6.field58 += this.field1941;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lnr;Ldn;Lqp;J)V")
    public class148(class437 arg0, class322 arg1, class279 arg2, long arg3) {
        this.field1962 = arg2;
        this.field1952 = arg1;
        this.field1934 = arg3;
        this.field1932 = class45.method331((byte) 117, this.field1952.field4590);
        if (!arg0.method2056() && this.field1932.field2581 != -1) {
            this.field1932 = class45.method331((byte) 119, this.field1932.field2581);
        }
        this.field1942 = new class146();
        this.field1957 = (int) ((double) this.field1957 + Math.random() * 64.0D);
        this.method982(-24415);
    }
}
