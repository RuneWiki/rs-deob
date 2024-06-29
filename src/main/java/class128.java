import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 extends class237 {

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    private int field1947 = 0;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "Z")
    public boolean field1956 = false;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
    private boolean field1938 = false;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "Lrb;")
    public class234 field1960;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "J")
    private long field1968;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Lqr;")
    public class46 field1944;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "Lrm;")
    public class281 field1962;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "Luj;")
    public class259 field1965;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "Z")
    public static boolean field1961 = false;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "[I")
    public static int[] field1959 = new int[1];

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    private int field1951;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    private int field1952;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    private int field1964;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Lnc;")
    public static class21 field1946;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public static void method942(int arg0) {
        field1959 = null;
        if (arg0 != 15) {
            method942(30);
        }
        field1946 = null;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
    public final void method943(int arg0) {
        this.field1964 = this.field1944.field706;
        this.field1953 = this.field1944.field702;
        this.field1951 = this.field1944.field708;
        this.field1949 = this.field1944.field705;
        this.field1952 = this.field1944.field714;
        this.field1954 = this.field1944.field707;
        this.field1958 = this.field1944.field715;
        field1966++;
        this.field1955 = this.field1944.field716;
        this.field1967 = this.field1944.field701;
        if (this.field1955 == this.field1952 && this.field1952 == this.field1949 && this.field1967 == this.field1964 && this.field1967 == this.field1958 && this.field1954 == this.field1951 && this.field1953 == this.field1951) {
            this.field1938 = true;
            return;
        }
        this.field1938 = false;
        int var2 = (this.field1955 + this.field1952 + this.field1949) / 3;
        int var3 = (this.field1967 + this.field1958 + this.field1964) / 3;
        int var4 = (this.field1954 - (-this.field1951 - this.field1953)) / 3;
        if (this.field1969 != var2 || this.field1937 != var3 || this.field1943 != var4) {
            this.field1943 = var4;
            this.field1937 = var3;
            this.field1969 = var2;
            int var5 = this.field1952 - this.field1955;
            int var6 = this.field1967 - this.field1964;
            int var7 = this.field1951 - this.field1954;
            int var8 = this.field1949 - this.field1955;
            int var9 = this.field1958 - this.field1964;
            int var10 = this.field1953 - this.field1954;
            this.field1945 = var7 * var8 - var5 * var10;
            this.field1948 = var5 * var9 - (var6 * var8);
            this.field1970 = var6 * var10 - var7 * var9;
            while (this.field1970 > 32767 || this.field1945 > 32767 || this.field1948 > 32767 || this.field1970 < -32767 || this.field1945 < -32767 || this.field1948 < -32767) {
                this.field1970 >>= 0x1;
                this.field1945 >>= 0x1;
                this.field1948 >>= 0x1;
            }
            int var11 = (int) Math.sqrt((double) (this.field1970 * this.field1970 + this.field1945 * this.field1945 + (this.field1948 * this.field1948)));
            if (var11 <= 0) {
                var11 = 1;
            }
            this.field1970 = this.field1970 * 32767 / var11;
            this.field1945 = this.field1945 * 32767 / var11;
            this.field1948 = this.field1948 * 32767 / var11;
            if (this.field1962.field4045 > 0 || this.field1962.field4062 > 0) {
                int var12 = (int) (Math.atan2((double) this.field1948, (double) this.field1970) * 2607.5945876176133D);
                int var13 = (int) (Math.atan2((double) this.field1945, Math.sqrt((double) (this.field1970 * this.field1970 + this.field1948 * this.field1948))) * 2607.5945876176133D);
                this.field1940 = this.field1962.field4045 - this.field1962.field4063;
                this.field1942 = this.field1962.field4063 + var12 - (this.field1940 >> 1);
                this.field1950 = this.field1962.field4062 - this.field1962.field4031;
                this.field1957 = var13 + this.field1962.field4031 - (this.field1950 >> 1);
            }
        }
        if (arg0 != -12107) {
            this.method943(110);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(JI)V")
    public final void method944(long arg0, int arg1) {
        field1963++;
        if (arg1 != -31433) {
            this.method943(58);
        }
        for (class9 var4 = (class9) this.field1965.method1639(-1); var4 != null; var4 = (class9) this.field1965.method1642((byte) 93)) {
            var4.method64(arg0);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(JIZILqa;)V")
    public final void method945(long arg0, int arg1, boolean arg2, int arg3, class162 arg4) {
        if (this.field1956) {
            arg2 = false;
        } else if (class73.field1228 < this.field1962.field4073) {
            arg2 = false;
        } else if (class95.field1557[class73.field1228] < class414.field6098) {
            arg2 = false;
        } else if (this.field1938) {
            arg2 = false;
        } else if (this.field1962.field4060 != -1) {
            int var7 = (int) (arg0 - this.field1968);
            if (this.field1962.field4033 || var7 <= this.field1962.field4060) {
                var7 %= this.field1962.field4060;
            } else {
                arg2 = false;
            }
            if (!this.field1962.field4061 && this.field1962.field4086 > var7) {
                arg2 = false;
            }
            if (this.field1962.field4061 && var7 >= this.field1962.field4086) {
                arg2 = false;
            }
        }
        if (arg1 <= 35) {
            return;
        }
        field1941++;
        if (arg2) {
            this.field1947 += (int) ((double) arg3 * (Math.random() * (double) (this.field1962.field4088 - this.field1962.field4082) + (double) this.field1962.field4082));
            if (this.field1947 > 63) {
                int var8 = this.field1947 >> 6;
                this.field1947 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field1962.field4045 <= 0 && this.field1962.field4062 <= 0) {
                        var10 = this.field1970;
                        var11 = this.field1948;
                        var12 = this.field1945;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field1940) + this.field1942;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class324.field4966[var14];
                        int var16 = class324.field4974[var14];
                        int var17 = (int) (Math.random() * (double) this.field1950) + this.field1957;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class324.field4966[var18];
                        int var20 = class324.field4974[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var12 = (var20 << 0) * -1;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = this.field1955 * var22 + this.field1952 * var23 + this.field1949 * var24 >> 16;
                    int var26 = this.field1967 * var23 + this.field1964 * var22 + (this.field1958 * var24) >> 16;
                    int var27 = this.field1953 * var24 + (this.field1954 * var22 + (this.field1951 * var23)) >> 16;
                    int var28 = (int) (Math.random() * (double) (this.field1962.field4066 - this.field1962.field4025)) + this.field1962.field4025;
                    int var29 = this.field1962.field4026 + ((int) (Math.random() * (double) (this.field1962.field4081 - this.field1962.field4026)));
                    int var30 = (int) (Math.random() * (double) (this.field1962.field4053 - this.field1962.field4084)) + this.field1962.field4084;
                    int var33;
                    if (this.field1962.field4078) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field1962.field4032 * var31 + (double) this.field1962.field4089) | (int) ((double) this.field1962.field4040 * var31 + (double) this.field1962.field4068) << 8 | (int) ((double) this.field1962.field4036 * var31 + (double) this.field1962.field4047) << 16 | (int) (Math.random() * (double) this.field1962.field4028 + (double) this.field1962.field4076) << 24;
                    } else {
                        var33 = (int) ((double) this.field1962.field4068 + (double) this.field1962.field4040 * Math.random()) << 8 | (int) ((double) this.field1962.field4047 + (double) this.field1962.field4036 * Math.random()) << 16 | (int) ((double) this.field1962.field4032 * Math.random() + (double) this.field1962.field4089) | (int) ((double) this.field1962.field4076 + Math.random() * (double) this.field1962.field4028) << 24;
                    }
                    int var34 = this.field1962.field4030;
                    if (!arg4.method442() && !this.field1962.field4024) {
                        var34 = -1;
                    }
                    if (class63.field1117 == class227.field3327) {
                        new class9(this, var25, var26, var27, var10, var12, var11, var28, var29, var33, var30, var34, this.field1962.field4039, this.field1962.field4056);
                    } else {
                        class9 var36 = class175.field2672[class227.field3327];
                        class227.field3327 = class227.field3327 + 1 & 0x3FF;
                        var36.method66(this, var25, var26, var27, var10, var12, var11, var28, var29, var33, var30, var34, this.field1962.field4039, this.field1962.field4056);
                    }
                }
            }
        }
        this.field1939 = 0;
        for (class9 var37 = (class9) this.field1965.method1639(-1); var37 != null; var37 = (class9) this.field1965.method1642((byte) -48)) {
            var37.method63(arg0, arg3);
            this.field1939++;
        }
        class49.field730 += this.field1939;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lqa;Lqr;Lrb;J)V")
    public class128(class162 arg0, class46 arg1, class234 arg2, long arg3) {
        this.field1960 = arg2;
        this.field1968 = arg3;
        this.field1944 = arg1;
        this.field1962 = this.field1944.method349((byte) -88);
        if (!arg0.method442() && this.field1962.field4022 != -1) {
            this.field1962 = class217.method1446(false, this.field1962.field4022);
        }
        this.field1965 = new class259();
        this.field1947 = (int) ((double) this.field1947 + Math.random() * 64.0D);
        this.method943(-12107);
    }
}
