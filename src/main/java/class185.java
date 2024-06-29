import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class185 {

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lpca;")
    private class653 field2253 = new class653(64);

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Ljo;")
    private class303 field2248;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lpr;")
    public static class407 field2251 = new class407(71, 28);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1073(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2251 = null;
        }
        field2254++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)V")
    public final void method1074(int arg0, byte arg1) {
        field2250++;
        if (arg1 <= 17) {
            method1073(54, 49, false);
        }
        class653 var3 = this.field2253;
        synchronized (this.field2253) {
            this.field2253.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method1075(int arg0) {
        class479.field7037 = 0;
        field2252++;
        class259.field3301 = new class561[50];
        if (arg0 >= -65) {
            field2251 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        if (arg0) {
            field2251 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Ljn;")
    public final class656 method1077(byte arg0, int arg1) {
        field2256++;
        class653 var3 = this.field2253;
        class656 var4;
        synchronized (this.field2253) {
            var4 = (class656) this.field2253.method3690((byte) -81, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 > -27) {
            return null;
        } else {
            class303 var5 = this.field2248;
            byte[] var6;
            synchronized (this.field2248) {
                var6 = this.field2248.method1719(arg1, 31, 4);
            }
            class656 var7 = new class656();
            if (var6 != null) {
                var7.method3701((byte) -128, new class452(var6));
            }
            class653 var8 = this.field2253;
            synchronized (this.field2253) {
                this.field2253.method3683(var7, (byte) -122, (long) arg1);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public final void method1078(byte arg0) {
        class653 var2 = this.field2253;
        synchronized (this.field2253) {
            this.field2253.method3684(-17200);
        }
        field2246++;
        if (arg0 > -45) {
            method1080(101, null, null);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public final void method1079(int arg0) {
        field2258++;
        if (arg0 != -225) {
            method1076(true);
        }
        class653 var2 = this.field2253;
        synchronized (this.field2253) {
            this.field2253.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILoa;Le;)V")
    public static final void method1080(int arg0, class635 arg1, class486 arg2) {
        field2257++;
        if (class637.field9015 == null) {
            return;
        }
        if (class376.field4887 < 10) {
            if (!class637.field9009.method1721(class637.field9015.field9546, arg0 + 127)) {
                class376.field4887 = class683.field9689.method1741(class637.field9015.field9546, arg0 + 9313) / 10;
                return;
            }
            class150.method822((byte) -56);
            class376.field4887 = 10;
        }
        if (class376.field4887 == 10) {
            class637.field9039 = class637.field9015.field9549 >> 6 << 6;
            class637.field9043 = class637.field9015.field9545 >> 6 << 6;
            class637.field9032 = (class637.field9015.field9552 >> 6 << 6) + 64 - class637.field9043;
            class637.field9030 = (class637.field9015.field9547 >> 6 << 6) + 64 - class637.field9039;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class637.field9015.method3765((class377.field4914.field4647 >> 9) + class146.field1642, var3, (class377.field4914.field4641 >> 9) + class682.field9685, -1, class377.field4914.field4638)) {
                var5 = var3[2] - class637.field9043;
                var4 = var3[1] - class637.field9039;
            }
            if (!class503.field7243 && var4 >= 0 && var4 < class637.field9030 && var5 >= 0 && var5 < class637.field9032) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class122.field1375 = var6;
                class306.field3998 = var7;
            } else if (class176.field2124 == -1 || class107.field1246 == -1) {
                class637.field9015.method3767(var3, class637.field9015.field9540 >> 14 & 0x3FFF, -118, class637.field9015.field9540 & 0x3FFF);
                class306.field3998 = var3[1] - class637.field9039;
                class122.field1375 = var3[2] - class637.field9043;
            } else {
                class637.field9015.method3767(var3, class176.field2124, -99, class107.field1246);
                if (var3 != null) {
                    class122.field1375 = var3[2] - class637.field9043;
                    class306.field3998 = var3[1] - class637.field9039;
                }
                class503.field7243 = false;
                class107.field1246 = -1;
                class176.field2124 = -1;
            }
            if (class637.field9015.field9557 == 37) {
                class637.field9019 = 3.0F;
                class637.field9024 = 3.0F;
            } else if (class637.field9015.field9557 == 50) {
                class637.field9019 = 4.0F;
                class637.field9024 = 4.0F;
            } else if (class637.field9015.field9557 == 75) {
                class637.field9019 = 6.0F;
                class637.field9024 = 6.0F;
            } else if (class637.field9015.field9557 == 100) {
                class637.field9019 = 8.0F;
                class637.field9024 = 8.0F;
            } else if (class637.field9015.field9557 == 200) {
                class637.field9019 = 16.0F;
                class637.field9024 = 16.0F;
            } else {
                class637.field9019 = 8.0F;
                class637.field9024 = 8.0F;
            }
            class637.field9023 = (int) class637.field9019 >> 1;
            class637.field9020 = class598.method3345(false, class637.field9023);
            class99.method613((byte) 114);
            class637.method3570();
            class504.field7252 = new class562();
            class637.field9017 += (int) (Math.random() * 5.0D) - 2;
            if (class637.field9017 < -8) {
                class637.field9017 = -8;
            }
            if (class637.field9017 > 8) {
                class637.field9017 = 8;
            }
            class637.field9026 += (int) (Math.random() * 5.0D) - 2;
            if (class637.field9026 < -16) {
                class637.field9026 = -16;
            }
            if (class637.field9026 > 16) {
                class637.field9026 = 16;
            }
            class637.method3584(arg2, class637.field9017 >> 2 << 10, class637.field9026 >> 1);
            class637.field9013.method1974(256, true, 1024);
            class637.field9016.method2779(256, 256, 82);
            class637.field9012.method3732(arg0 + 4, 4096);
            class470.field6566.method1693(256, arg0 - 65);
            class376.field4887 = 20;
        } else if (class376.field4887 == 20) {
            class594.method3329(97, true);
            class637.method3564(arg1, class637.field9017, class637.field9026);
            class376.field4887 = 60;
            class594.method3329(97, true);
            class503.method2892(10497);
        } else if (class376.field4887 == 60) {
            if (class637.field9009.method1713(class637.field9015.field9546 + "_staticelements", -1)) {
                if (!class637.field9009.method1721(class637.field9015.field9546 + "_staticelements", 127)) {
                    return;
                }
                class637.field9025 = class539.method3070(class108.field1253, class637.field9009, class637.field9015.field9546 + "_staticelements", 7974);
            } else {
                class637.field9025 = new class15(0);
            }
            class637.method3573();
            class376.field4887 = 70;
            class594.method3329(97, true);
            class503.method2892(10497);
        } else if (arg0 == -1) {
            if (class376.field4887 == 70) {
                class172.field2055 = new class434(arg1, 11, true, class220.field2664);
                class376.field4887 = 73;
                class594.method3329(97, true);
                class503.method2892(arg0 ^ 0xFFFFD6FE);
            } else if (class376.field4887 == 73) {
                class462.field6421 = new class434(arg1, 12, true, class220.field2664);
                class376.field4887 = 76;
                class594.method3329(97, true);
                class503.method2892(10497);
            } else if (class376.field4887 == 76) {
                class61.field630 = new class434(arg1, 14, true, class220.field2664);
                class376.field4887 = 79;
                class594.method3329(97, true);
                class503.method2892(10497);
            } else if (class376.field4887 == 79) {
                class213.field2570 = new class434(arg1, 17, true, class220.field2664);
                class376.field4887 = 82;
                class594.method3329(97, true);
                class503.method2892(10497);
            } else if (class376.field4887 == 82) {
                class653.field9330 = new class434(arg1, 19, true, class220.field2664);
                class376.field4887 = 85;
                class594.method3329(97, true);
                class503.method2892(10497);
            } else if (class376.field4887 == 85) {
                class14.field128 = new class434(arg1, 22, true, class220.field2664);
                class376.field4887 = 88;
                class594.method3329(97, true);
                class503.method2892(10497);
            } else if (class376.field4887 == 88) {
                class343.field4444 = new class434(arg1, 26, true, class220.field2664);
                class376.field4887 = 91;
                class594.method3329(97, true);
                class503.method2892(10497);
            } else {
                class107.field1241 = new class434(arg1, 30, true, class220.field2664);
                class376.field4887 = 100;
                class594.method3329(97, true);
                class503.method2892(10497);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B[B)Ljava/lang/String;")
    public static final String method1081(byte arg0, byte[] arg1) {
        field2247++;
        int var2 = 98 / ((-arg0 - 46) / 54);
        int var3 = arg1.length;
        char[] var4 = new char[var3];
        int var5 = 0;
        for (int var6 = 0; var6 < var3; var6++) {
            int var7 = arg1[var6] & 0xFF;
            if (var7 < 128) {
                var4[var5++] = (char) var7;
            } else if (var7 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var7);
            } else if (var7 >= 224) {
                if (var7 >= 240) {
                    if (var7 < 244) {
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var7);
                }
                if ((var6 + 2) >= var3) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var6++;
                int var8 = arg1[var6] & 0xFF;
                if (var8 < 128 || var8 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var6++;
                int var9 = arg1[var6] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class139.method776(class139.method776(class203.method1246(var8, -129) << 6, class203.method1246(-225, var7) << 12), class203.method1246(-129, var9));
            } else if (var6 + 1 < var3) {
                var6++;
                int var10 = arg1[var6] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class139.method776(class203.method1246(-129, var10), class203.method1246(var7, -193) << 6);
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class185(class207 arg0, int arg1, class303 arg2) {
        this.field2248 = arg2;
        this.field2248.method1727(-77, 31);
    }
}
