import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class326 {

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "Ld;")
    private class242 field4928 = new class242(64);

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public int field4935 = 0;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "Lum;")
    private class83 field4933;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lmo;")
    public static class271 field4925 = new class271(10, 14);

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "Ldc;")
    public static class16 field4934 = new class16(0, 0);

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "Ld;")
    public static class242 field4937 = new class242(4);

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Z")
    public static boolean field4938 = false;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method2138(String arg0, int arg1) {
        field4932++;
        if (arg1 != 21450) {
            field4934 = null;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 42)
    public static void method2139(int arg0) {
        field4925 = null;
        int var1 = 26 / ((arg0 - 48) / 50);
        field4937 = null;
        field4934 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)I", line = 54)
    public static final int method2140(int arg0, int arg1, boolean arg2) {
        field4923++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            if (arg2) {
                field4934 = null;
            }
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V", line = 89)
    public final void method2141(int arg0, byte arg1) {
        if (arg1 != 57) {
            this.field4933 = null;
        }
        field4930++;
        class242 var3 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(IB)Ljt;", line = 102)
    public final class410 method2142(int arg0, byte arg1) {
        field4936++;
        class242 var3 = this.field4928;
        class410 var4;
        synchronized (this.field4928) {
            var4 = (class410) this.field4928.method1634((long) arg0, 64);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 >= -95) {
            this.method2146(77);
        }
        class83 var5 = this.field4933;
        byte[] var6;
        synchronized (this.field4933) {
            var6 = this.field4933.method731(0, arg0, 4);
        }
        class410 var7 = new class410();
        var7.field6049 = arg0;
        var7.field6050 = this;
        if (var6 != null) {
            var7.method2579(-114, new class194(var6));
        }
        var7.method2580(127);
        class242 var8 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1623((long) arg0, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 140)
    public static final void method2143(int arg0) {
        field4924++;
        if (class203.field3141 != null) {
            return;
        }
        class203.field3141 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 < 97) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + ((var32 << 16) + var34);
            class203.field3141[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V", line = 258)
    public static final void method2144(int arg0) {
        field4926++;
        class89.field1439++;
        class110.method857(4095, class208.field3178);
        if (arg0 != 127) {
            field4925 = null;
        }
        class312.field4752.method1364(class422.field6196, true);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIIII)V", line = 273)
    public static final void method2145(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class487.field7124 && class232.field3493 >= arg2) {
            int var5 = class306.method2023(5, class232.field3492, arg1, class36.field453);
            int var6 = class306.method2023(5, class232.field3492, arg3, class36.field453);
            class340.method2197(arg4, var6, arg2, -26207, var5);
        }
        if (!arg0) {
            field4938 = true;
        }
        field4931++;
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V", line = 291)
    public final void method2146(int arg0) {
        field4929++;
        class242 var2 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1637((byte) 13);
            if (arg0 <= 38) {
                this.method2147((byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 305)
    public final void method2147(byte arg0) {
        class242 var2 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1630(-103);
            if (arg0 > -87) {
                field4925 = null;
            }
        }
        field4922++;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 331)
    public class326(class308 arg0, int arg1, class83 arg2) {
        this.field4933 = arg2;
        this.field4927 = this.field4933.method748(4, 12408);
    }
}
