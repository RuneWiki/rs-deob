import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class131 extends class105 {

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    private int field1969 = 0;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "Z")
    public boolean field1966 = false;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "Lel;")
    public class544 field1957 = new class544();

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "Lel;")
    private class544 field1972 = new class544();

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "Z")
    private boolean field1980 = false;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "Lgi;")
    public class675 field1963;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "J")
    private long field1962;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "Lf;")
    public class753 field1956;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "Lfe;")
    public class567 field1959;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "Lhda;")
    public class747 field1965;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "[I")
    public static int[] field1970 = new int[8];

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "Z")
    public static boolean field1967 = false;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "[I")
    public static int[] field1955;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 3)
    public static void method999(byte arg0) {
        if (arg0 < 43) {
            method999((byte) -26);
        }
        field1955 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lha;JI)V", line = 15)
    public final void method1000(class58 arg0, long arg1, int arg2) {
        field1964++;
        for (class632 var5 = (class632) this.field1965.method4159(0); var5 != null; var5 = (class632) this.field1965.method4151(7)) {
            var5.method3637(arg0, arg1);
        }
        if (arg2 < 34) {
            field1952 = -103;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIBJLha;)V", line = 47)
    public final void method1001(boolean arg0, int arg1, byte arg2, long arg3, class58 arg4) {
        if (this.field1966) {
            arg0 = false;
        } else if (class508.field7250 < this.field1959.field8075) {
            arg0 = false;
        } else if (class674.field9467 > class723.field10101[class508.field7250]) {
            arg0 = false;
        } else if (this.field1980) {
            arg0 = false;
        } else if (this.field1959.field8071 != -1) {
            int var7 = (int) (arg3 - this.field1962);
            if (this.field1959.field8053 || this.field1959.field8071 >= var7) {
                var7 %= this.field1959.field8071;
            } else {
                arg0 = false;
            }
            if (!this.field1959.field8023 && this.field1959.field8038 > var7) {
                arg0 = false;
            }
            if (this.field1959.field8023 && this.field1959.field8038 <= var7) {
                arg0 = false;
            }
        }
        field1958++;
        if (arg0) {
            class449.field6222++;
            int var8 = (this.field1957.field7678 + this.field1957.field7665 + this.field1957.field7680) / 3;
            int var9 = (this.field1957.field7675 + this.field1957.field7666 + this.field1957.field7682) / 3;
            int var10 = (this.field1957.field7671 + this.field1957.field7673 + this.field1957.field7672) / 3;
            if (this.field1957.field7669 != var8 || this.field1957.field7674 != var9 || this.field1957.field7681 != var10) {
                this.field1957.field7681 = var10;
                this.field1957.field7669 = var8;
                this.field1957.field7674 = var9;
                int var11 = this.field1957.field7665 - this.field1957.field7678;
                int var12 = this.field1957.field7675 - this.field1957.field7666;
                int var13 = this.field1957.field7673 - this.field1957.field7671;
                int var14 = this.field1957.field7680 - this.field1957.field7678;
                int var15 = this.field1957.field7682 - this.field1957.field7666;
                int var16 = this.field1957.field7672 - this.field1957.field7671;
                this.field1976 = var12 * var16 - (var13 * var15);
                this.field1978 = var13 * var14 - (var11 * var16);
                this.field1973 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field1976 <= 32767 && this.field1978 <= 32767 && this.field1973 <= 32767 && this.field1976 >= -32767 && this.field1978 >= -32767 && this.field1973 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field1973 * this.field1973 + (this.field1976 * this.field1976 + (this.field1978 * this.field1978))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field1976 = this.field1976 * 32767 / var17;
                        this.field1978 = this.field1978 * 32767 / var17;
                        this.field1973 = this.field1973 * 32767 / var17;
                        if (this.field1959.field8047 > 0 || this.field1959.field8024 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field1973, (double) this.field1976) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field1978, Math.sqrt((double) (this.field1976 * this.field1976 + this.field1973 * this.field1973))) * 2607.5945876176133D);
                            this.field1977 = this.field1959.field8047 - this.field1959.field8035;
                            this.field1974 = this.field1959.field8035 + var18 - (this.field1977 >> 1);
                            this.field1979 = this.field1959.field8024 - this.field1959.field8079;
                            this.field1975 = var19 + this.field1959.field8079 - (this.field1979 >> 1);
                        }
                        break;
                    }
                    this.field1973 >>= 0x1;
                    this.field1976 >>= 0x1;
                    this.field1978 >>= 0x1;
                }
            }
            this.field1969 += (int) (((double) (this.field1959.field8063 - this.field1959.field8052) * Math.random() + (double) this.field1959.field8052) * (double) arg1);
            if (this.field1969 > 63) {
                int var20 = this.field1969 >> 6;
                this.field1969 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1959.field8047 <= 0 && this.field1959.field8024 <= 0) {
                        var22 = this.field1973;
                        var23 = this.field1976;
                        var24 = this.field1978;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field1977) + this.field1974;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class316.field4487[var26];
                        int var28 = class316.field4490[var26];
                        int var29 = this.field1975 + (int) ((double) this.field1979 * Math.random());
                        int var30 = var29 & 0x1FFF;
                        int var31 = class316.field4487[var30];
                        int var32 = class316.field4490[var30];
                        byte var33 = 13;
                        var24 = (var32 << 1) * -1;
                        var23 = var28 * var31 >> var33;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field1957.field7680 * var36 + (float) this.field1957.field7678 * var34 + (float) this.field1957.field7665 * var35);
                    int var38 = (int) ((float) this.field1957.field7682 * var36 + (float) this.field1957.field7675 * var35 + (float) this.field1957.field7666 * var34);
                    int var39 = (int) ((float) this.field1957.field7672 * var36 + (float) this.field1957.field7673 * var35 + (float) this.field1957.field7671 * var34);
                    int var40 = (int) ((float) this.field1972.field7680 * var36 + (float) this.field1972.field7678 * var34 + (float) this.field1972.field7665 * var35);
                    int var41 = (int) ((float) this.field1972.field7682 * var36 + (float) this.field1972.field7675 * var35 + (float) this.field1972.field7666 * var34);
                    int var42 = (int) ((float) this.field1972.field7672 * var36 + (float) this.field1972.field7673 * var35 + (float) this.field1972.field7671 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) (Math.random() * (double) var44 + (double) var41);
                    int var48 = (int) (Math.random() * (double) var45 + (double) var42);
                    int var49 = this.field1959.field8037 + ((int) (Math.random() * (double) (this.field1959.field8045 - this.field1959.field8037)));
                    int var50 = (int) (Math.random() * (double) (this.field1959.field8041 - this.field1959.field8050)) + this.field1959.field8050;
                    int var51 = this.field1959.field8048 + ((int) ((double) (this.field1959.field8086 - this.field1959.field8048) * Math.random()));
                    int var54;
                    if (this.field1959.field8033) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field1959.field8082 * Math.random() + (double) this.field1959.field8032) << 24 | (int) ((double) this.field1959.field8084 * var52 + (double) this.field1959.field8076) | (int) ((double) this.field1959.field8030 * var52 + (double) this.field1959.field8021) << 8 | (int) ((double) this.field1959.field8060 * var52 + (double) this.field1959.field8069) << 16;
                    } else {
                        var54 = (int) ((double) this.field1959.field8084 * Math.random() + (double) this.field1959.field8076) | (int) ((double) this.field1959.field8021 + (double) this.field1959.field8030 * Math.random()) << 8 | (int) ((double) this.field1959.field8060 * Math.random() + (double) this.field1959.field8069) << 16 | (int) (Math.random() * (double) this.field1959.field8082 + (double) this.field1959.field8032) << 24;
                    }
                    int var55 = this.field1959.field8067;
                    if (!arg4.method560() && !this.field1959.field8059) {
                        var55 = -1;
                    }
                    if (class555.field7775 == class299.field4150) {
                        new class632(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field1959.field8068, this.field1959.field8066);
                    } else {
                        class632 var57 = class510.field7277[class299.field4150];
                        class299.field4150 = class299.field4150 + 1 & 0x3FF;
                        var57.method3636(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field1959.field8068, this.field1959.field8066);
                    }
                }
            }
        }
        if (!this.field1957.method3217(true, this.field1972)) {
            class544 var58 = this.field1972;
            this.field1972 = this.field1957;
            this.field1957 = var58;
            this.field1957.field7669 = this.field1972.field7669;
            this.field1957.field7674 = this.field1972.field7674;
            this.field1957.field7681 = this.field1972.field7681;
            this.field1957.field7666 = this.field1963.field9488;
            this.field1957.field7671 = this.field1963.field9483;
            this.field1957.field7673 = this.field1963.field9489;
            this.field1957.field7675 = this.field1963.field9490;
            this.field1957.field7665 = this.field1963.field9473;
            this.field1957.field7680 = this.field1963.field9494;
            this.field1957.field7678 = this.field1963.field9484;
            this.field1957.field7672 = this.field1963.field9481;
            this.field1957.field7682 = this.field1963.field9479;
        }
        this.field1968 = 0;
        for (class632 var59 = (class632) this.field1965.method4159(arg2 ^ 0x7); var59 != null; var59 = (class632) this.field1965.method4151(7)) {
            var59.method3634(arg3, arg1);
            this.field1968++;
        }
        if (arg2 != 7) {
            this.method1002((byte) 79);
        }
        class20.field260 += this.field1968;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V", line = 309)
    public final void method1002(byte arg0) {
        this.field1957.field7678 = this.field1963.field9484;
        this.field1957.field7680 = this.field1963.field9494;
        this.field1957.field7672 = this.field1963.field9481;
        int var2 = 116 / ((arg0 + 1) / 58);
        field1971++;
        this.field1957.field7665 = this.field1963.field9473;
        this.field1957.field7682 = this.field1963.field9479;
        this.field1957.field7671 = this.field1963.field9483;
        this.field1957.field7675 = this.field1963.field9490;
        this.field1957.field7666 = this.field1963.field9488;
        this.field1957.field7673 = this.field1963.field9489;
        if (this.field1957.field7678 == this.field1957.field7665 && this.field1957.field7680 == this.field1957.field7665 && this.field1957.field7675 == this.field1957.field7666 && this.field1957.field7682 == this.field1957.field7675 && this.field1957.field7673 == this.field1957.field7671 && this.field1957.field7673 == this.field1957.field7672) {
            this.field1980 = true;
        } else if (this.field1980) {
            this.field1972.field7673 = this.field1957.field7673;
            this.field1972.field7675 = this.field1957.field7675;
            this.field1972.field7665 = this.field1957.field7665;
            this.field1972.field7666 = this.field1957.field7666;
            this.field1972.field7682 = this.field1957.field7682;
            this.field1972.field7678 = this.field1957.field7678;
            this.field1972.field7671 = this.field1957.field7671;
            this.field1972.field7680 = this.field1957.field7680;
            this.field1972.field7672 = this.field1957.field7672;
            this.field1980 = false;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)I", line = 352)
    public static final int method1003(int arg0, int arg1, int arg2) {
        field1961++;
        int var3 = -121 / ((arg0 + 30) / 50);
        byte var4;
        if (arg1 > 20000) {
            class127.method988(2);
            var4 = 4;
        } else if (arg1 > 10000) {
            class150.method1158((byte) -105);
            var4 = 3;
        } else if (arg1 <= 5000) {
            class155.method1184(0, true);
            var4 = 1;
        } else {
            class405.method2489(-6589);
            var4 = 2;
        }
        if (arg2 != class471.field6781.field6684.method1843(27669)) {
            class471.field6781.method2826(arg2, (byte) 118, class471.field6781.field6695);
            class54.method490((byte) -59, false, arg2);
        }
        class129.method994((byte) 98);
        return var4;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lha;Lgi;Lf;J)V", line = 430)
    public class131(class58 arg0, class675 arg1, class753 arg2, long arg3) {
        this.field1963 = arg1;
        this.field1962 = arg3;
        this.field1956 = arg2;
        this.field1959 = this.field1963.method3818((byte) -80);
        if (!arg0.method560() && this.field1959.field8077 != -1) {
            this.field1959 = class634.method3645(this.field1959.field8077, 126);
        }
        this.field1965 = new class747();
        this.field1969 = (int) ((double) this.field1969 + Math.random() * 64.0D);
        this.method1002((byte) -66);
        this.field1972.field7675 = this.field1957.field7675;
        this.field1972.field7680 = this.field1957.field7680;
        this.field1972.field7671 = this.field1957.field7671;
        this.field1972.field7672 = this.field1957.field7672;
        this.field1972.field7665 = this.field1957.field7665;
        this.field1972.field7673 = this.field1957.field7673;
        this.field1972.field7666 = this.field1957.field7666;
        this.field1972.field7678 = this.field1957.field7678;
        this.field1972.field7682 = this.field1957.field7682;
    }
}
