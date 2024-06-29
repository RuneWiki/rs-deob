import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class362 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[[I")
    private int[][] field4769;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Z")
    public static boolean field4773 = false;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "[Lsr;")
    public static class228[] field4777 = new class228[0];

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "Lem;")
    public static class206 field4771 = new class206(72, 0);

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lr;I)V")
    public static final void method2063(class166 arg0, int arg1) {
        field4775++;
        if (!(class137.field1948 >= 2 || class426.field5971) || class396.field5579 != null) {
            return;
        }
        if (arg1 != -32768) {
            method2063(null, 37);
        }
        String var2;
        if (class426.field5971 && class137.field1948 < 2) {
            var2 = class178.field2551 + class65.field820.method555(class697.field9900, true) + class185.field2679 + " ->";
        } else if (class367.field4945 && class353.field4698.method34(81, -16215) && class137.field1948 > 2) {
            var2 = class91.method664((class499) class588.field8265.field3151.field5621.field5621, 106);
        } else {
            class499 var3 = (class499) class588.field8265.field3151.field5621;
            var2 = class91.method664(var3, arg1 ^ 0xFFFF807E);
            int[] var4 = null;
            if (class420.method2434(var3.field6780, (byte) -100)) {
                var4 = class599.field8366.method3949(0, (int) var3.field6787).field9200;
            } else if (var3.field6779 != -1) {
                var4 = class599.field8366.method3949(0, var3.field6779).field9200;
            } else if (class628.method3514(var3.field6780, (byte) 49)) {
                class393 var5 = (class393) class299.field4071.method970((byte) 89, (long) ((int) var3.field6787));
                if (var5 != null) {
                    class61 var6 = var5.field5552;
                    class568 var7 = var6.field674;
                    if (var7.field8079 != null) {
                        var7 = var7.method3259((byte) 105, class578.field8156);
                    }
                    if (var7 != null) {
                        var4 = var7.field8056;
                    }
                }
            } else if (class556.method3115(30916, var3.field6780)) {
                Object var8 = null;
                class301 var9;
                if (var3.field6780 == 1010) {
                    var9 = class475.field6543.method2685((int) var3.field6787, -110);
                } else {
                    var9 = class475.field6543.method2685((int) (var3.field6787 >>> 32 & 0x7FFFFFFFL), -64);
                }
                if (var9.field4113 != null) {
                    var9 = var9.method1833(-93, class578.field8156);
                }
                if (var9 != null) {
                    var4 = var9.field4120;
                }
            }
            if (var4 != null) {
                var2 = var2 + class90.method656(var4, (byte) -101);
            }
        }
        if (class137.field1948 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class137.field1948 - 2) + class65.field813.method555(class697.field9900, true);
        }
        if (class469.field6472 != null) {
            class417 var11 = class469.field6472.method606(arg0, (byte) 114);
            if (var11 == null) {
                var11 = class428.field5986;
            }
            var11.method2426(class602.field8391, class139.field1963, class581.field8188, class469.field6472.field1180, class469.field6472.field1104, class469.field6472.field1142, class66.field862, class139.field1976, class469.field6472.field1038, var2, class469.field6472.field1154, class119.field1631, class469.field6472.field1050, class599.field8362, 3);
            class48.method384(class602.field8391[1], arg1 + 32769, class602.field8391[3], class602.field8391[0], class602.field8391[2]);
        } else if (class565.field7638 != null && class454.field6305 == class219.field3065) {
            int var10 = class428.field5986.method2417(class119.field1631, class139.field1963, var2, 16777215, class66.field862, 0, class467.field6425 + 16, class599.field8362, -1, class546.field7398 + 4);
            class48.method384(class467.field6425, 1, 16, class546.field7398 + 4, class377.field5030.method1736(17046, var2) - -var10);
            return;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[B)[B")
    public final byte[] method2064(int arg0, byte[] arg1) {
        field4774++;
        int var3 = -42 % ((arg0 + 54) / 36);
        if (this.field4769 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field4768 / (long) this.field4767) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field4769[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field4768 + var7;
                int var15 = var14 / this.field4767;
                var7 = var14 - this.field4767 * var15;
                var6 += var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 <= 127) {
                    arg1[var9] = (byte) var10;
                } else {
                    arg1[var9] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method2065(byte arg0) {
        field4777 = null;
        field4771 = null;
        int var1 = -127 / ((arg0 + 41) / 43);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)Llf;")
    public static final class215 method2066(byte arg0, int arg1) {
        field4770++;
        if (arg1 == 0) {
            if ((double) class510.field6990 == 3.0D) {
                return class98.field1378;
            }
            if ((double) class510.field6990 == 4.0D) {
                return class670.field9402;
            }
            if ((double) class510.field6990 == 6.0D) {
                return class363.field4779;
            }
            if ((double) class510.field6990 >= 8.0D) {
                return class266.field3599;
            }
        } else if (arg1 == 1) {
            if ((double) class510.field6990 == 3.0D) {
                return class363.field4779;
            }
            if ((double) class510.field6990 == 4.0D) {
                return class266.field3599;
            }
            if ((double) class510.field6990 == 6.0D) {
                return class615.field8584;
            }
            if ((double) class510.field6990 >= 8.0D) {
                return class554.field7470;
            }
        } else if (arg1 == 2) {
            if ((double) class510.field6990 == 3.0D) {
                return class615.field8584;
            }
            if ((double) class510.field6990 == 4.0D) {
                return class554.field7470;
            }
            if ((double) class510.field6990 == 6.0D) {
                return class311.field4304;
            }
            if ((double) class510.field6990 >= 8.0D) {
                return class677.field9706;
            }
        }
        return arg0 > -102 ? null : null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(II)V")
    public class362(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class639.method3565(arg1, -124, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4768 = var4;
            this.field4767 = var5;
            this.field4769 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4769[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)I")
    public final int method2067(int arg0, byte arg1) {
        field4776++;
        if (this.field4769 != null) {
            arg0 = (int) ((long) this.field4768 * (long) arg0 / (long) this.field4767) + 6;
        }
        int var3 = 89 / ((arg1 - 2) / 44);
        return arg0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
    public final int method2068(int arg0, int arg1) {
        field4772++;
        if (this.field4769 != null) {
            arg0 = (int) ((long) this.field4768 * (long) arg0 / (long) this.field4767);
        }
        return arg1 > -20 ? 0 : arg0;
    }
}
